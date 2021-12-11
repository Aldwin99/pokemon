package fragments

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokemon.database.DatabaseManager
import com.example.pokemon.database.MyAppDataSource
import com.example.pokemon.database.User
import kotlinx.coroutines.launch

class LeftViewModel: ViewModel() {
    fun save(user: User){
        viewModelScope.launch {
            val userDao = DatabaseManager.instance.database.userDao()
            MyAppDataSource(userDao).save(user)
        }
    }
}