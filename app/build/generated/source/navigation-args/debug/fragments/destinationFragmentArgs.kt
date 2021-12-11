package fragments

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class destinationFragmentArgs(
  public val usernameArg: String = "empty"
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("username_arg", this.usernameArg)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): destinationFragmentArgs {
      bundle.setClassLoader(destinationFragmentArgs::class.java.classLoader)
      val __usernameArg : String?
      if (bundle.containsKey("username_arg")) {
        __usernameArg = bundle.getString("username_arg")
        if (__usernameArg == null) {
          throw IllegalArgumentException("Argument \"username_arg\" is marked as non-null but was passed a null value.")
        }
      } else {
        __usernameArg = "empty"
      }
      return destinationFragmentArgs(__usernameArg)
    }
  }
}
