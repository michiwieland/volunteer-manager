package ch.openairmalans.volunteermanager.controller

import ch.openairmalans.volunteermanager.form.CreateVolunteerForm
import ch.openairmalans.volunteermanager.model.Volunteer
import ch.openairmalans.volunteermanager.service.VolunteerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class VolunteerController {

    @Autowired
    lateinit var voluneerService: VolunteerService

    @RequestMapping("/volunteers")
    fun listVolunteers(model: Model) : String {
        model.addAttribute("volunteers", voluneerService.findAll())
        return "volunteers"
    }

    @RequestMapping("/volunteer/{volunteerId}")
    fun findVolunteer(@PathVariable("volunteerId") volunteerId: Long, model: Model) : String {
        model.addAttribute("volunteer", voluneerService.findById(volunteerId))
        return "volunteer"
    }

    @RequestMapping(value="/volunteer", method = arrayOf(RequestMethod.POST))
    fun addVolunteer(createVolunteerForm: CreateVolunteerForm, model: Model) : String {

        voluneerService.save(Volunteer(
                id = createVolunteerForm.id!!,
                firstName = createVolunteerForm.firstName!!,
                lastName = createVolunteerForm.lastName!!,
                email = createVolunteerForm.email!!,
                mobile = createVolunteerForm.mobile!!))

        return "redirect:/volunteer/" + createVolunteerForm.id
    }

    @RequestMapping(value="/volunteer")
    fun createVolunteerPage(model: Model) : String {
        model.addAttribute("volunteerForm", CreateVolunteerForm())
        return "new-volunteer-form"
    }

}