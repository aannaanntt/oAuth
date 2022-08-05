package com.spring.OAuth2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.OAuth2.Model.AppClient;


@Repository
public interface ClientRepository extends JpaRepository<AppClient, String> {

	AppClient findByClientId(String clientId);

}