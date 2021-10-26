package daniel.lop.io.marvelappstarter.repository

import daniel.lop.io.marvelappstarter.data.remote.ServiceApi
import java.sql.RowId
import javax.inject.Inject

class MarvelRepository @Inject constructor(
    private val api: ServiceApi
) {
    suspend fun list (nameStartsWith: String? = null) = api.list(nameStartsWith)
    suspend fun getComics(characterId: Int) = api.getComics(characterId)
}