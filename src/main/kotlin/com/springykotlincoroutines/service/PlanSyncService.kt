package com.springykotlincoroutines.service

import com.springykotlincoroutines.model.data.Plan
import com.springykotlincoroutines.model.request.PlanSyncRequest
import kotlinx.coroutines.*
import org.springframework.stereotype.Service
import java.util.*
import java.util.concurrent.Executors
val dispatcher = Executors.newSingleThreadExecutor().asCoroutineDispatcher()
@Service
class PlanSyncService(private val sstSyncService: SstSyncService) : CoroutineScope by CoroutineScope(dispatcher) {

    fun syncPlans(request: PlanSyncRequest) {

       var planIds: Set<UUID> = setOf(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID())
        planIds.map { planId -> async {

                    try {
                        withTimeout(50) {
                            sstSyncService.planSync(planId)
                        }
                    } catch (e: TimeoutCancellationException) {
                        println("sync of $planId timed out")
                    }
            }
        }
    }
}