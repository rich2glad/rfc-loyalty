package com.rfc.repository;

import com.rfc.domain.RfbEvent;
import com.rfc.domain.RfbLocation;
import com.rfc.service.dto.RfbEventDTO;
import com.rfc.service.dto.RfbLocationDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


/**
 * Spring Data JPA repository for the RfbEvent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RfbEventRepository extends JpaRepository<RfbEvent, Long> {

    RfbEvent findByRfbLocationAndEventDate(RfbLocation location, LocalDate date);

    RfbEvent findByEventCodeEqualsAndEventDateEqualsAndRfbLocationEquals(String eventCode, LocalDate eventDate, RfbLocation location);

    RfbEvent findByEventDateEqualsAndRfbLocationEquals(LocalDate eventDate, RfbLocation location);
}
