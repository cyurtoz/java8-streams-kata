package com;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
@AllArgsConstructor
@Getter
class Band {
    String name;
    List<Band> similarBands;
}
