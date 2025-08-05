package anetwork.channel.degrade;

import android.content.Context;
import anetwork.channel.aidl.adapter.NetworkProxy;
import tb.kge;

/* loaded from: classes.dex */
public class DegradableNetwork extends NetworkProxy {
    static {
        kge.a(83807966);
    }

    public DegradableNetwork(Context context) {
        super(context, 1);
    }
}
