package ch.openairmalans.volunteermanager.controller

import ch.openairmalans.volunteermanager.form.CreateVolunteerForm
import ch.openairmalans.volunteermanager.model.Volunteer
import ch.openairmalans.volunteermanager.service.VolunteerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.datatables.mapping.DataTablesInput
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@Controller
@RequestMapping("/volunteers")
class VolunteerController {

    @Autowired
    lateinit var volunteerService: VolunteerService

    @GetMapping("/")
    fun showVolunteerPage(model: Model): String {
        return "volunteers"
    }

    @GetMapping("/volunteers")
    @ResponseBody
    fun findAllVolunteers(@Valid input: DataTablesInput): DataTablesOutput<Volunteer> {
        return volunteerService.findAll(input)
    }

    @GetMapping(value = "/volunteer")
    fun newVolunteer(volunteer: Volunteer, model: Model): String {
        model.addAttribute("volunteer", volunteer)
        return "volunteer";
    }

    @PostMapping(value = "/volunteer")
    fun storeVolunteer(volunteer: Volunteer, model: Model): String {
        volunteerService.save(volunteer);
        return "volunteers"
    }
}