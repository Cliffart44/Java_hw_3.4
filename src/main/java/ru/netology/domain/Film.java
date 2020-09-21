package ru.netology.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Film {
    int id;
    String filmName;
    String filmPicture;
    String filmGenre;
    boolean premiereTomorrow;
}