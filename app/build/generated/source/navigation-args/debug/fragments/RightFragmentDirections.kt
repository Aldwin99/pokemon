package fragments

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.pokemon.R
import kotlin.Int
import kotlin.String

public class RightFragmentDirections private constructor() {
  private data class ActionRightFragmentToDestinationFragment(
    public val usernameArg: String = "empty"
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_rightFragment_to_destinationFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("username_arg", this.usernameArg)
      return result
    }
  }

  public companion object {
    public fun actionRightFragmentToDestinationFragment(usernameArg: String = "empty"):
        NavDirections = ActionRightFragmentToDestinationFragment(usernameArg)
  }
}
