package io.unicorn.plugin.platform;

import mtopsdk.common.util.StringUtils;
import com.taobao.android.weex_framework.ui.m;
import com.taobao.android.weex_framework.util.s;
import io.unicorn.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f24871a;
    private final Map<String, g> b = new HashMap();

    static {
        kge.a(-435275210);
        f24871a = null;
    }

    private c() {
        this.b.put("input", new io.unicorn.plugin.platformview.a());
    }

    public static c a() {
        if (f24871a == null) {
            synchronized (c.class) {
                if (f24871a == null) {
                    f24871a = new c();
                }
            }
        }
        return f24871a;
    }

    public void a(h hVar, FlutterJNI flutterJNI) {
        s.a("registerPlatformView");
        for (Map.Entry<String, g> entry : this.b.entrySet()) {
            if (hVar.a(entry.getKey(), entry.getValue())) {
                flutterJNI.registerPlatformView(entry.getKey());
            }
        }
        for (String str : m.b()) {
            if (!StringUtils.isEmpty(str)) {
                flutterJNI.registerPlatformView(str);
            }
        }
        s.b("registerPlatformView");
    }
}
