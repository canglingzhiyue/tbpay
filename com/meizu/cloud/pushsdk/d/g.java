package com.meizu.cloud.pushsdk.d;

import android.content.Context;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;

/* loaded from: classes4.dex */
public class g extends h<f> implements f {
    private static g c;
    private boolean d;

    private g(f fVar) {
        super(fVar);
        this.d = false;
    }

    public static g c() {
        if (c == null) {
            synchronized (g.class) {
                if (c == null) {
                    c = new g(new b());
                }
            }
        }
        return c;
    }

    public void a(Context context) {
        a(context, (String) null);
    }

    public void a(Context context, String str) {
        if (this.d) {
            return;
        }
        boolean z = true;
        this.d = true;
        if ((context.getApplicationInfo().flags & 2) == 0) {
            z = false;
        }
        a(z);
        if (str == null) {
            str = MzSystemUtils.getDocumentsPath(context) + "/pushSdk/" + context.getPackageName();
        }
        a(str);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void a(String str) {
        b().a(str);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void a(String str, String str2) {
        b().a(str, str2);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void a(String str, String str2, Throwable th) {
        b().a(str, str2, th);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void a(boolean z) {
        b().a(z);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public boolean a() {
        return b().a();
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void b(String str, String str2) {
        b().b(str, str2);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void b(boolean z) {
        b().b(z);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void c(String str, String str2) {
        b().c(str, str2);
    }

    @Override // com.meizu.cloud.pushsdk.d.f
    public void d(String str, String str2) {
        b().d(str, str2);
    }
}
