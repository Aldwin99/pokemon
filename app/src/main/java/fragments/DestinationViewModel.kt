package fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokemon.database.DatabaseManager
import com.example.pokemon.database.MyAppDataSource
import com.example.pokemon.database.User
import kotlinx.coroutines.launch

class DestinationViewModel: ViewModel() {
    val savedUsers= MutableLiveData<List<User>>()
    fun getUsers(){
        viewModelScope.launch {
            val userDao = DatabaseManager.instance.database.userDao()
            savedUsers.value = MyAppDataSource(userDao).getUsers().value
        }
    }
    fun save(user: User){
        viewModelScope.launch {
            val userDao = DatabaseManager.instance.database.userDao()
            MyAppDataSource(userDao).save(user)
        }
    }
}