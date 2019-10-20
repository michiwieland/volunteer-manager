package ch.openairmalans.volunteermanager

import nz.net.ultraq.thymeleaf.LayoutDialect
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ReloadableResourceBundleMessageSource
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.util.Locale
import org.springframework.web.servlet.i18n.SessionLocaleResolver
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor


@Configuration
class ThymeleafLayoutConfig {
    @Bean
    fun layoutDialect() = LayoutDialect()
}

@Configuration
class InternationalizationConfig : WebMvcConfigurer {
    @Bean
    fun localeResolver() = SessionLocaleResolver().apply {
        setDefaultLocale(Locale.GERMAN)
    }

    @Bean
    fun localeChangeInterceptor() = LocaleChangeInterceptor().apply {
        paramName = "lang"
    }

    @Bean
    fun messageSource() = ReloadableResourceBundleMessageSource().apply {
        setBasename("classpath:i18n/messages")
        setDefaultEncoding("UTF-8")
    }

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(localeChangeInterceptor())
    }
}


@SpringBootApplication
@EnableJpaAuditing
class VolunteerManagerApplication

fun main(args: Array<String>) {
    runApplication<VolunteerManagerApplication>(*args)
}
