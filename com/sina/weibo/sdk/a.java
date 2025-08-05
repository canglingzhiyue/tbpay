package com.sina.weibo.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.b.a;
import com.sina.weibo.sdk.openapi.SdkListener;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f8111a;
    private static AuthInfo b;

    static {
        kge.a(-1175418835);
        f8111a = false;
    }

    public static AuthInfo a() {
        if (f8111a) {
            return b;
        }
        throw new RuntimeException("please init sdk before use it. Wb.install()");
    }

    public static void a(AuthInfo authInfo, SdkListener sdkListener) {
        if (!f8111a) {
            if (authInfo == null) {
                throw new RuntimeException("authInfo must not be null.");
            }
            b = authInfo;
            f8111a = true;
            if (sdkListener == null) {
                return;
            }
            sdkListener.onInitSuccess();
        }
    }

    public static boolean a(Context context) {
        List<ResolveInfo> queryIntentServices;
        String[] strArr = {"com.sina.weibo", "com.sina.weibog3"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
            intent.setPackage(str);
            intent.addCategory("android.intent.category.DEFAULT");
            if (context != null && (queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) != null && !queryIntentServices.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Context context) {
        a.C0307a e;
        return a(context) && (e = com.sina.weibo.sdk.b.a.e(context)) != null && e.ah >= 10772;
    }
}
