package com.meizu.cloud.pushsdk.notification.g;

import android.content.Context;
import android.content.res.AssetManager;
import com.meizu.cloud.pushinternal.DebugLogger;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f8004a;
    private AssetManager b;

    private d(Context context) {
        b(context);
    }

    public static d a(Context context) {
        if (f8004a == null) {
            f8004a = new d(context);
        }
        return f8004a;
    }

    private void b(Context context) {
        this.b = context.getAssets();
    }

    public int a(Context context, String str, String str2) {
        DebugLogger.i("ResourceReader", "Get resource type " + str2 + " " + str);
        return context.getResources().getIdentifier(str, str2, context.getApplicationInfo().packageName);
    }
}
