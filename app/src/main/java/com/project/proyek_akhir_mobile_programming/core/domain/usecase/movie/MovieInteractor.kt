package com.project.proyek_akhir_mobile_programming.core.domain.usecase.movie

import com.project.proyek_akhir_mobile_programming.core.data.remote.Resource
import com.project.proyek_akhir_mobile_programming.core.domain.model.Movie
import com.project.proyek_akhir_mobile_programming.core.domain.repository.IMovieRepository
import kotlinx.coroutines.flow.Flow

class MovieInteractor(private val repository: IMovieRepository): MovieUseCase {
    override fun getMovies(): Flow<Resource<List<Movie>>> = repository.getMovies()
}