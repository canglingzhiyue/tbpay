package anet.channel.assist;

import android.content.Context;

/* loaded from: classes2.dex */
public interface IOperator {
    ICapability getCapability(int i);

    boolean isEnable();

    void register(Context context);
}
