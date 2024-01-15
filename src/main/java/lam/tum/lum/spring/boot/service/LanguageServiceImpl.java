package lam.tum.lum.spring.boot.service;

import lam.tum.lum.spring.boot.entity.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageServiceImpl {
    @Autowired
    private LanguageService languageService;

    public Language createLang(Language language) {
        return languageService.save(language);
    }

    public List<Language> findAllLang() {
        return languageService.findAll();
    }

    public Language updateLang(Language language) {

        Optional<Language> optional = languageService.findById(language.getId());

        if (optional.isPresent()) {

            Language languageUpdate = optional.get();
            languageUpdate.setId(language.getId());
            languageUpdate.setName(language.getName());

            return languageService.save(languageUpdate);
        }
        throw new RuntimeException("Update fail");
    }

    public void deleteLang(long langId) {
        languageService.deleteById(langId);
    }

}
