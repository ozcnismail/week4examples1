package kodlama.io.ProgrammingLanguages.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.ProgrammingLanguages.dataAccess.abstracts.LanguageRepository;
import kodlama.io.ProgrammingLanguages.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();

		languages.add(new Language(1, "JAVA"));
		languages.add(new Language(2, "c#"));
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}

	@Override
	public Language getID(int id) {
		for (Language language : languages) {
			if(language.getId() == id) {
				return language;
			}
		}
		return null;
	}

	@Override
	public void add(Language language) {
		// TODO Auto-generated method stub
		languages.add(language);
	}

	@Override
	public void update(Language language) {
		// TODO Auto-generated method stub
		for (Language lang : languages) {
			if (lang.getId() == language.getId()) {
				lang.setId(language.getId());
				lang.setName(language.getName());
			}
		}

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		for (Language lang : languages) {
			if (lang.getId() == id) {
				languages.remove(lang);
			}
		}

	}

}
