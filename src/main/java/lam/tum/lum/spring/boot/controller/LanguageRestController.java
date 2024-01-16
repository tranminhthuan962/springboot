package lam.tum.lum.spring.boot.controller;

import lam.tum.lum.spring.boot.entity.Language;
import lam.tum.lum.spring.boot.service.LanguageServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/language.api.com/v1")
public class LanguageRestController {

    LanguageServiceImpl languageServiceImpl;

    public LanguageRestController(LanguageServiceImpl languageServiceImpl) {
        this.languageServiceImpl = languageServiceImpl;
    }

    @PostMapping("/addLang")
    public ResponseEntity<Language> createLang(@RequestBody Language language) {
        return ResponseEntity.ok().body(languageServiceImpl.createLang(language));
    }

    @GetMapping("/languages")
    public ResponseEntity<List<Language>> loadAllLang() {
        return ResponseEntity.ok().body(languageServiceImpl.findAllLang());
    }

    @PutMapping("/updateLang")
    public ResponseEntity<Language> updateLang(@RequestBody Language language) {
        return ResponseEntity.ok().body(languageServiceImpl.updateLang(language));
    }

    @DeleteMapping("/deleteLang/{langId}")
    public HttpStatus deleteLang(@PathVariable long langId) {
        languageServiceImpl.deleteLang(langId);
        return HttpStatus.OK;
    }

}
