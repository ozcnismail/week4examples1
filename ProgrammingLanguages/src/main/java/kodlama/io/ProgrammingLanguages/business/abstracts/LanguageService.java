package kodlama.io.ProgrammingLanguages.business.abstracts;

import java.util.List;

import kodlama.io.ProgrammingLanguages.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();

	Language getID(int id);

	void add(Language language);

	void update(Language language);

	void delete(int id);

}
