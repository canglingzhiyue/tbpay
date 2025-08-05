package tb;

import io.unicorn.plugin.common.d;
import io.unicorn.plugin.common.h;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class rtp {

    /* renamed from: a  reason: collision with root package name */
    private final h f33371a;
    private b b;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f33372a;
        public final Number b;
        public final Number c;
        public final int d;
        public final int e;
        public final Object f;
        public final Object g;
        public final int h;
        public final int i;
        public final float j;
        public final float k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final long p;

        static {
            kge.a(-125027418);
        }

        public a(int i, Number number, Number number2, int i2, int i3, Object obj, Object obj2, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, long j) {
            this.f33372a = i;
            this.b = number;
            this.c = number2;
            this.d = i2;
            this.e = i3;
            this.f = obj;
            this.g = obj2;
            this.h = i4;
            this.i = i5;
            this.j = f;
            this.k = f2;
            this.l = i6;
            this.m = i7;
            this.n = i8;
            this.o = i9;
            this.p = j;
        }
    }

    /* loaded from: classes9.dex */
    public interface b {
    }

    static {
        kge.a(-181346877);
    }

    public rtp(rti rtiVar) {
        this.f33371a = new h(rtiVar, "unicorn/platform_views", d.INSTANCE);
    }

    public static void a() {
    }

    public void a(int i, String str, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("viewId", Integer.valueOf(i));
        if (obj != null) {
            hashMap.put(com.taobao.android.weex_framework.util.a.ATOM_arguments, obj);
        }
        this.f33371a.a(str, hashMap);
    }

    public void a(b bVar) {
        this.b = bVar;
    }
}
