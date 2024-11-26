package com.daniellima.TedTecnoligiasWeb.Repository;

import com.daniellima.TedTecnoligiasWeb.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
