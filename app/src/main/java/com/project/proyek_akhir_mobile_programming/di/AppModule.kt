package com.project.proyek_akhir_mobile_programming.di

import com.project.proyek_akhir_mobile_programming.core.domain.usecase.movie.MovieInteractor
import com.project.proyek_akhir_mobile_programming.core.domain.usecase.movie.MovieUseCase
import com.project.proyek_akhir_mobile_programming.ui.movie.MovieViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { MovieViewModel(get()) }
}