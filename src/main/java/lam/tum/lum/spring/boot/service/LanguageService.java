package lam.tum.lum.spring.boot.service;

import lam.tum.lum.spring.boot.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageService extends JpaRepository<Language, Long> {
}
