package anet.channel.assist;

import android.content.Context;

/* loaded from: classes.dex */
public interface IAssistManager {
    ICapability getCapability(int i);

    void initialize(Context context);

    boolean isInitialized();
}
