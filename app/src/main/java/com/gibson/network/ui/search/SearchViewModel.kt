package com.gibson.network.ui.search

import androidx.lifecycle.*
import com.gibson.network.domain.entity.User
import com.gibson.network.domain.usecase.UserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val userUseCase: UserUseCase
) : ViewModel() {

    val userName = MutableLiveData<String>()

    private val _user = MutableLiveData<User>()
    val user: LiveData<User> = _user

    fun searchUser() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val githubUser = userUseCase.getUser(userName.value!!)
                _user.postValue(githubUser)
            } catch (e: Exception) {
                // TODO handle exception
            }
        }
    }
}