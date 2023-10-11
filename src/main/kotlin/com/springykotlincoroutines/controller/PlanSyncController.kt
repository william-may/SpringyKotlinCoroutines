package com.springykotlincoroutines.controller

import com.springykotlincoroutines.model.request.PlanSyncRequest
import com.springykotlincoroutines.service.PlanSyncService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/plan")
class PlanSyncController(private val planSyncService: PlanSyncService) {

    @PostMapping("/sync")
    fun syncPlans(@RequestBody requestBody: PlanSyncRequest): ResponseEntity<Unit> {
        planSyncService.syncPlans(requestBody)
        return ResponseEntity.accepted().build()
    }
}