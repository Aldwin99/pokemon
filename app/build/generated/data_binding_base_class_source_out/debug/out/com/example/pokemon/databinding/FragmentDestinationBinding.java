// Generated by view binder compiler. Do not edit!
package com.example.pokemon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pokemon.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDestinationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout frameLayout;

  @NonNull
  public final RecyclerView rvUserEntries;

  @NonNull
  public final TextView tvReceivedArg;

  private FragmentDestinationBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout frameLayout, @NonNull RecyclerView rvUserEntries,
      @NonNull TextView tvReceivedArg) {
    this.rootView = rootView;
    this.frameLayout = frameLayout;
    this.rvUserEntries = rvUserEntries;
    this.tvReceivedArg = tvReceivedArg;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDestinationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDestinationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_destination, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDestinationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout frameLayout = (ConstraintLayout) rootView;

      id = R.id.rv_user_entries;
      RecyclerView rvUserEntries = ViewBindings.findChildViewById(rootView, id);
      if (rvUserEntries == null) {
        break missingId;
      }

      id = R.id.tv_received_arg;
      TextView tvReceivedArg = ViewBindings.findChildViewById(rootView, id);
      if (tvReceivedArg == null) {
        break missingId;
      }

      return new FragmentDestinationBinding((ConstraintLayout) rootView, frameLayout, rvUserEntries,
          tvReceivedArg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
