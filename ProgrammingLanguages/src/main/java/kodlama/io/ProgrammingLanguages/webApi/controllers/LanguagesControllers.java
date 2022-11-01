package kodlama.io.ProgrammingLanguages.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.ProgrammingLanguages.business.abstracts.LanguageService;
import kodlama.io.ProgrammingLanguages.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesControllers {

	private LanguageService languageService;

	@Autowired
	public LanguagesControllers(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<Language> getAll() {
		return languageService.getAll();
	}
}
