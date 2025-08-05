package com.taobao.android.miniLive.ui;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14390a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;

    static {
        kge.a(368132510);
    }

    private b(a aVar) {
        this.f14390a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.b = a.a(aVar);
        this.c = a.b(aVar);
        this.f14390a = a.c(aVar);
        this.g = a.d(aVar);
        this.d = a.e(aVar);
        this.e = a.f(aVar);
        this.f = a.g(aVar);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String d;

        /* renamed from: a  reason: collision with root package name */
        private boolean f14391a = false;
        private boolean b = false;
        private boolean c = false;
        private boolean e = false;
        private boolean f = false;
        private boolean g = false;

        static {
            kge.a(-2080138635);
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d5fad15e", new Object[]{aVar})).booleanValue() : aVar.b;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("629afc5f", new Object[]{aVar})).booleanValue() : aVar.c;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef3b2760", new Object[]{aVar})).booleanValue() : aVar.f14391a;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c22c07e3", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ boolean e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("87b7d62", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("951ba863", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("21bbd364", new Object[]{aVar})).booleanValue() : aVar.g;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cb1db01c", new Object[]{this, new Boolean(z)});
            }
            this.f14391a = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("57bddb1d", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e45e061e", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3c6bd196", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9cc9bb3d", new Object[]{this}) : new b(this);
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("70fe311f", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fd9e5c20", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }
    }
}
