package com.meizu.cloud.pushsdk.c;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.taobao.mulitenv.EnvironmentSwitcher;
import mtopsdk.common.util.StringUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.f.g.e;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.HashMap;
import java.util.Map;
import tb.fne;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7866a = "b";
    private final HashMap<String, String> b;
    private final HashMap<String, Object> c;
    private final HashMap<String, Object> d;

    /* renamed from: com.meizu.cloud.pushsdk.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0273b {

        /* renamed from: a  reason: collision with root package name */
        private Context f7867a = null;

        public C0273b a(Context context) {
            this.f7867a = context;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    private b(C0273b c0273b) {
        this.b = new HashMap<>();
        this.c = new HashMap<>();
        this.d = new HashMap<>();
        d();
        if (c0273b.f7867a != null) {
            d(c0273b.f7867a);
            c(c0273b.f7867a);
            b(c0273b.f7867a);
            a(c0273b.f7867a);
        }
        DebugLogger.i(f7866a, "Subject created successfully.");
    }

    private void a(Context context) {
        a("pn", (Object) context.getPackageName());
        a("pv", (Object) MzSystemUtils.getAppVersionName(context));
        a("pvc", Integer.valueOf(MzSystemUtils.getAppVersionCode(context)));
        a("st", Integer.valueOf(!StringUtils.isEmpty(MzSystemUtils.findReceiver(context, "com.meizu.ups.push.intent.MESSAGE", context.getPackageName())) ? 1 : 0));
    }

    private void a(String str, int i, int i2) {
        this.b.put(str, i + "." + i2);
    }

    private void a(String str, Object obj) {
        if (StringUtils.isEmpty(str) || obj == null) {
            return;
        }
        if ((obj instanceof String) && ((String) obj).isEmpty()) {
            return;
        }
        this.c.put(str, obj);
    }

    private void a(String str, String str2) {
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return;
        }
        this.b.put(str, str2);
    }

    private void b(Context context) {
        b("nt", MzSystemUtils.getNetWorkType(context));
    }

    private void b(String str, Object obj) {
        if (StringUtils.isEmpty(str) || obj == null) {
            return;
        }
        if ((obj instanceof String) && ((String) obj).isEmpty()) {
            return;
        }
        this.d.put(str, obj);
    }

    private void d() {
        a("br", Build.BRAND);
        a("dc", Build.MODEL);
        a("ot", Build.VERSION.RELEASE);
        a("ov", Build.DISPLAY);
        a("ll", MzSystemUtils.getCurrentLanguage());
    }

    private void d(Context context) {
        a(fne.KEY_OP, e.c(context));
    }

    public Map<String, Object> a() {
        return this.c;
    }

    public Map<String, String> b() {
        return this.b;
    }

    public Map<String, Object> c() {
        return this.d;
    }

    public void c(Context context) {
        Point b = e.b(context);
        if (b == null) {
            DebugLogger.e(f7866a, "screen information not available.");
        } else {
            a(EnvironmentSwitcher.SPKEY_SS, b.x, b.y);
        }
    }
}
