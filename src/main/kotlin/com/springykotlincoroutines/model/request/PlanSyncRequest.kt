package com.springykotlincoroutines.model.request

import java.util.UUID

data class PlanSyncRequest(var planIds: Set<UUID>)
