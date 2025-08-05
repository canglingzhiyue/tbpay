package anetwork.channel.http;

import android.content.Context;
import anetwork.channel.aidl.adapter.NetworkProxy;
import tb.kge;

/* loaded from: classes.dex */
public class HttpNetwork extends NetworkProxy {
    public static final String TAG = "anet.HttpNetwork";

    static {
        kge.a(-820248051);
    }

    public HttpNetwork(Context context) {
        super(context, 0);
    }
}
