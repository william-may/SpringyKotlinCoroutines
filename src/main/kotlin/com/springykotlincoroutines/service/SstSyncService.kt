package com.springykotlincoroutines.service

import com.springykotlincoroutines.model.data.Plan
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import org.springframework.stereotype.Service
import java.util.UUID
import kotlin.random.Random

@Service
class SstSyncService {

    suspend fun planSync(planId: UUID) : Plan {

        delay(500)
        println("syncing plan $planId")
        // Mule
       mockCall()
        //mockCall()

        // DB Plan Check
       mockCall()

        // Kafka
       mockCall()

        println("plan $planId synced")

        return Plan(UUID.randomUUID(), "The Plan")
    }

    fun mockCall() = runBlocking {
        delay(Random.nextLong(100, 200))
    }

}