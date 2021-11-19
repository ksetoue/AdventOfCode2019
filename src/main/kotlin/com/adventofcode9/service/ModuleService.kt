package com.adventofcode9.service

import org.springframework.stereotype.Service

@Service
class ModuleService {
    fun getFuelToLaunch(mass: Int): Int {
        return ((mass / 3) - 2)
    }
}