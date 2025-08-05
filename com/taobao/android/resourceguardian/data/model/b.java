package com.taobao.android.resourceguardian.data.model;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f14879a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;

    static {
        kge.a(1257642952);
    }

    private b(a aVar) {
        this.f14879a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar);
        this.f = a.f(aVar);
        this.g = a.g(aVar);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PerformanceWarningInfo = {\"category\":\"" + RGCategoryInfo.a(this.f14879a) + "\", \"type\":\"" + RGTypeInfo.a(this.b) + "\", \"level\":\"" + this.c + "\", \"value\":\"" + this.d + "\", \"score:\"" + this.e + "\", \"profileType\":\"" + this.f + "\", \"process\":\"" + this.g + "\"}";
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f14880a;
        private int b;
        private String d;
        private String c = "CRITICAL";
        private int e = 0;
        private String f = "common";
        private String g = "main";

        static {
            kge.a(248031903);
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1dbc419", new Object[]{aVar})).intValue() : aVar.f14880a;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c76fcd1a", new Object[]{aVar})).intValue() : aVar.b;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c683378", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("66d92c97", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("382be81d", new Object[]{aVar})).intValue() : aVar.e;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9bbb1ed5", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b62c17f4", new Object[]{aVar}) : aVar.g;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("273ff59", new Object[]{this, new Integer(i)});
            }
            this.f14880a = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2808085a", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a275562", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("44984e81", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5f0947a0", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a8416e09", new Object[]{this}) : new b(this);
        }
    }
}
