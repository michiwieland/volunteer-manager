package ch.openairmalans.volunteermanager.controller

import ch.openairmalans.volunteermanager.form.CreateVolunteerForm
import ch.openairmalans.volunteermanager.model.Volunteer
import ch.openairmalans.volunteermanager.service.VolunteerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*


@Controller
@RequestMapping("/volunteers")
class VolunteerController {

    @Autowired
    lateinit var voluneerService: VolunteerService


    @GetMapping("/")
    fun showVolunteerPage(model: Model): String {
        return "volunteers"
    }

    @PostMapping("/volunteers")
    @ResponseBody
    fun listVolunteers(model: Model): MutableIterable<Volunteer> {
        return voluneerService.findAll()
    }

    @GetMapping("/volunteer/{volunteerId}")
    @ResponseBody
    fun findVolunteer(@PathVariable("volunteerId") volunteerId: Long, model: Model): String {
        model.addAttribute("volunteer", voluneerService.findById(volunteerId))
        return "volunteer"
    }

    @PostMapping(value = "/volunteer")
    fun addVolunteer(createVolunteerForm: CreateVolunteerForm, model: Model): String {

        //      voluneerService.save(Volunteer(
        //             id = createVolunteerForm.id!!,
        //       firstName = createVolunteerForm.firstName!!,
        //       lastName = createVolunteerForm.lastName!!,
        //       email = createVolunteerForm.email!!,
        //       mobile = createVolunteerForm.mobile!!,
        //       gender = ))

        return "redirect:/volunteer/" + createVolunteerForm.id
    }

    @RequestMapping(value = "/volunteer")
    fun createVolunteerPage(model: Model): String {
        model.addAttribute("volunteerForm", CreateVolunteerForm())
        return "new-volunteer-form"
    }

}