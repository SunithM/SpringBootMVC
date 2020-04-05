package com.sunith;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunith.model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>
{

}
