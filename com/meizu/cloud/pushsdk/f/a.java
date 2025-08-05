package com.meizu.cloud.pushsdk.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.f.c.a;
import com.meizu.cloud.pushsdk.f.c.f;
import com.meizu.cloud.pushsdk.f.f.a;
import com.meizu.cloud.pushsdk.f.f.c;
import com.meizu.cloud.pushsdk.f.g.b;
import com.meizu.cloud.pushsdk.f.g.c;
import com.meizu.cloud.pushsdk.f.g.e;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static com.meizu.cloud.pushsdk.f.f.a f7947a;
    private static BroadcastReceiver b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.meizu.cloud.pushsdk.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0280a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.meizu.cloud.pushsdk.f.f.a f7948a;

        C0280a(com.meizu.cloud.pushsdk.f.f.a aVar) {
            this.f7948a = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (e.d(context)) {
                c.b("QuickTracker", "restart track event: %s", "online true");
                this.f7948a.b();
            }
        }
    }

    public static com.meizu.cloud.pushsdk.f.f.a a(Context context, com.meizu.cloud.pushsdk.e.d.a aVar, f fVar) {
        if (f7947a == null) {
            synchronized (a.class) {
                if (f7947a == null) {
                    com.meizu.cloud.pushsdk.f.f.a a2 = a(b(context, aVar, fVar), (com.meizu.cloud.pushsdk.f.f.c) null, context);
                    f7947a = a2;
                    a(context, a2);
                }
            }
        }
        return f7947a;
    }

    public static com.meizu.cloud.pushsdk.f.f.a a(Context context, boolean z) {
        if (f7947a == null) {
            synchronized (a.class) {
                if (f7947a == null) {
                    f7947a = a(b(context, null, null), (com.meizu.cloud.pushsdk.f.f.c) null, context);
                }
            }
        }
        DebugLogger.i("PushAndroidTracker", "can upload subject " + z);
        if (z) {
            f7947a.a(a(context));
        }
        return f7947a;
    }

    private static com.meizu.cloud.pushsdk.f.f.a a(com.meizu.cloud.pushsdk.f.c.a aVar, com.meizu.cloud.pushsdk.f.f.c cVar, Context context) {
        return new com.meizu.cloud.pushsdk.f.f.d.a(new a.C0285a(aVar, "PushAndroidTracker", context.getPackageCodePath(), context, com.meizu.cloud.pushsdk.f.f.d.a.class).a(b.VERBOSE).a(Boolean.FALSE).a(cVar).a(4));
    }

    private static com.meizu.cloud.pushsdk.f.f.c a(Context context) {
        return new c.b().a(context).a();
    }

    private static String a() {
        String str = MzSystemUtils.isOverseas() ? PushConstants.URL_ABROAD_STATICS_DOMAIN : PushConstants.URL_STATICS_DOMAIN;
        DebugLogger.e("QuickTracker", "current statics domain is " + str);
        return str;
    }

    private static void a(Context context, com.meizu.cloud.pushsdk.f.f.a aVar) {
        if (b != null) {
            return;
        }
        b = new C0280a(aVar);
        context.registerReceiver(b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    private static com.meizu.cloud.pushsdk.f.c.a b(Context context, com.meizu.cloud.pushsdk.e.d.a aVar, f fVar) {
        a.C0281a c = new a.C0281a(a(), context, com.meizu.cloud.pushsdk.f.c.h.a.class).a(fVar).a(aVar).c(1);
        com.meizu.cloud.pushsdk.f.c.b bVar = com.meizu.cloud.pushsdk.f.c.b.DefaultGroup;
        return new com.meizu.cloud.pushsdk.f.c.h.a(c.a(bVar).b(bVar.a()).a(2));
    }
}
