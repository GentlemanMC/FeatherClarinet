package net.digitalingot.feather.browserEvent;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.event.BrowserEvents;
import org.jetbrains.annotations.NotNull;

public class CloneModProfile implements BrowserEvent {
   @SerializedName("profile")
   @NotNull
   private final String a;
   @SerializedName("newName")
   @NotNull
   private final String b;

   public CloneModProfile(@NotNull String var1, @NotNull String var2) {
      this.a = var1;
      this.b = var2;
   }

   @NotNull
   public String b() {
      return this.a;
   }

   @NotNull
   public String c() {
      return this.b;
   }

   @NotNull
   @Override
   public BrowserEvents a() {
      return BrowserEvents.CLONE_MOD_PROFILE;
   }
}
