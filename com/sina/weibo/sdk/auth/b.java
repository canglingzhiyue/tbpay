package com.sina.weibo.sdk.auth;

import mtopsdk.common.util.StringUtils;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class b {
    private Map<String, WbAuthListener> e;

    /* loaded from: classes4.dex */
    static class a {
        private static final b f;

        static {
            kge.a(326563436);
            f = new b((byte) 0);
        }
    }

    static {
        kge.a(1653969263);
    }

    private b() {
        this.e = new HashMap();
    }

    /* synthetic */ b(byte b) {
        this();
    }

    public static synchronized b b() {
        b bVar;
        synchronized (b.class) {
            bVar = a.f;
        }
        return bVar;
    }

    public final synchronized WbAuthListener a(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        return this.e.get(str);
    }

    public final synchronized void a(String str, WbAuthListener wbAuthListener) {
        if (!StringUtils.isEmpty(str) && wbAuthListener != null) {
            this.e.put(str, wbAuthListener);
        }
    }

    public final synchronized void b(String str) {
        if (StringUtils.isEmpty(str)) {
            return;
        }
        this.e.remove(str);
    }
}
