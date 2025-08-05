package com.alibaba.android.ultron.vfw.weex2.highPerformance.model;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2788a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final Object h;

    static {
        kge.a(-881140740);
    }

    private b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, Object obj) {
        this.f2788a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str3;
        this.h = obj;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean d;
        private boolean e;
        private boolean f;
        private Object h;

        /* renamed from: a  reason: collision with root package name */
        private String f2789a = "";
        private String b = "1.0";
        private boolean c = false;
        private String g = "UNIT_TRADE";

        static {
            kge.a(1014232787);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ed92d19b", new Object[]{this, str});
            }
            this.f2789a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3334143a", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("60bd4b21", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("520edaa2", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("43606a23", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("34b1f9a4", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("78d556d9", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cf259149", new Object[]{this, obj});
            }
            this.h = obj;
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c4332582", new Object[]{this}) : new b(this.f2789a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }
}
