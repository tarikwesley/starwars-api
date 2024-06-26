package com.starwars.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlanetStarWarsApiFilmsDTO {
    private List<PlanetStarWarsApiDTO> results;
}
