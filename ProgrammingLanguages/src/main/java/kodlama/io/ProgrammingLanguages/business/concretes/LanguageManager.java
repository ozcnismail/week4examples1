package kodlama.io.ProgrammingLanguages.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.ProgrammingLanguages.business.abstracts.LanguageService;
import kodlama.io.ProgrammingLanguages.dataAccess.abstracts.LanguageRepository;
import kodlama.io.ProgrammingLanguages.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		// İş kuralları
		return languageRepository.getAll();
	}

	@Override
	public Language getID(int id) {

		return languageRepository.getID(id);
	}

	@Override
	public void add(Language language) {
		if (language.getName().isEmpty()) {

			for (Language lang : languageRepository.getAll()) {

				if (lang.getName().equalsIgnoreCase(language.getName())) {

					System.out.println("Böyle bir programlama dili bulunmaktadır.");
				} else {
					System.out.println("Programlama dili boş olamaz");
				}
			}
		}

	}

	@Override
	public void update(Language language) {
		if (!language.getName().equals("")) {
			languageRepository.update(language);
		} else {
			System.out.println("Programlama dili boş olamaz");
		}
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
	}

}
