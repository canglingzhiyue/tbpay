package com.alibaba.android.ultron.vfw.weex2.highPerformance.model;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f2797a;
    public final String b;
    public final String c;

    static {
        kge.a(325985190);
    }

    private g(String str, String str2, String str3) {
        this.f2797a = str;
        this.b = str2;
        this.c = str3;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2798a = "";
        private String b = "";
        private String c = UltronTradeHybridStage.ON_RENDER_END;

        static {
            kge.a(1369568381);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ed951776", new Object[]{this, str});
            }
            this.f2798a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("33365a15", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("78d79cb4", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public g a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("c433261d", new Object[]{this}) : new g(this.f2798a, this.b, this.c);
        }
    }
}
