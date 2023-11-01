package nstarlike.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import nstarlike.app.model.Organization;
import nstarlike.app.repository.OrganizationRepository;

@Controller
@RequestMapping("/org")
public class OrganizationController {
	@Autowired
	private OrganizationRepository orgRepository;

	@GetMapping("/register")
	public String register() {
		return "org/register";
	}

	@PostMapping("/registerProc")
	public String registerProcess(@RequestParam String orgType, 
								@RequestParam String orgCode, 
								@RequestParam String orgClass, 
								@RequestParam String orgName, 
								@RequestParam String busiNum, 
								@RequestParam String tel, 
								@RequestParam String addr, 
								@RequestParam String representative) {
		Organization org = new Organization();
		org.setOrgType(orgType);
		org.setOrgCode(orgCode);
		org.setOrgClass(orgClass);
		org.setOrgName(orgName);
		org.setBusiNum(busiNum);
		org.setTel(tel);
		org.setAddr(addr);
		org.setRepresentative(representative);
		
		Organization saved = orgRepository.save(org);
		
		return "redirect:/org/registered?id=" + saved.getId();
	}
	
	@GetMapping("/registered")
	public String login(@RequestParam Long id, Model model) {
		Organization org = orgRepository.findById(id).orElseThrow();
		model.addAttribute("org", org);
		return "org/registered";
	}
}
