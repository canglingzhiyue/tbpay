package com.taobao.android.weex_framework.common;

import com.taobao.android.weex_framework.devtool.NetworkResourceType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static final int DEFAULT_TIMEOUT_MS = 3000;
    private static final AtomicInteger i;
    public String c;
    public String d;
    public String e;
    public C0618a g;
    public double j;
    public double k;
    public final Map<String, String> b = new ConcurrentHashMap();
    public int f = 3000;
    public boolean h = false;

    /* renamed from: a  reason: collision with root package name */
    public final String f15985a = "WX_Req_" + i.incrementAndGet();

    /* renamed from: com.taobao.android.weex_framework.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0618a {

        /* renamed from: a  reason: collision with root package name */
        public int f15986a;
        public NetworkResourceType b;

        static {
            kge.a(415103768);
        }

        public C0618a(NetworkResourceType networkResourceType, int i) {
            this.f15986a = i;
            this.b = networkResourceType;
        }
    }

    static {
        kge.a(-1392132916);
        i = new AtomicInteger(0);
    }
}
