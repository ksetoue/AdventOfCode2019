package com.adventofcode9.service

import com.adventofcode9.AbstractBaseTest
import com.adventofcode9.model.Module
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.Mock

class ModuleServiceTest : AbstractBaseTest() {
    private val moduleService = ModuleService()
    
    @Test
    fun `#getFuelToLaunch must return 2 when fuel mass is 12`() {
        val mass = 12
        
        val fuel = moduleService.getFuelToLaunch(mass)
        
        assertThat(fuel).isEqualTo(2)
    }
    
    @Test
    fun `#getFuelToLaunch must return 2 when fuel mass is 14`() {
        val mass = 12
    
        val fuel = moduleService.getFuelToLaunch(mass)
    
        assertThat(fuel).isEqualTo(2)
    }
    
    @Test
    fun `#getFuelToLaunch must return 654 when fuel mass is 1969`() {
        val mass = 1969
    
        val fuel = moduleService.getFuelToLaunch(mass)
    
        assertThat(fuel).isEqualTo(654)
    }
    
    @Test
    fun `#getFuelToLaunch must return 33583 when fuel mass is 100756`() {
        val mass = 100756
    
        val fuel = moduleService.getFuelToLaunch(mass)
    
        assertThat(fuel).isEqualTo(33583)
    }
}