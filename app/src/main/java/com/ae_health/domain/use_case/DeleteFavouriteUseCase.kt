package com.ae_health.domain.use_case

import com.ae_health.domain.model.OrganizationDomain
import com.ae_health.domain.repository.OrganizationRepository
import javax.inject.Inject

class DeleteFavouriteUseCase @Inject constructor(
    private val organizationRepository: OrganizationRepository
) {

    suspend operator fun invoke(organizationDomain: OrganizationDomain) =
        organizationRepository.deleteFromFavourite(organizationDomain)
}