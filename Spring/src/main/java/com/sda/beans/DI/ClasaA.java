package com.sda.beans.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClasaA {
    @Autowired
    ClasaB b;
}
