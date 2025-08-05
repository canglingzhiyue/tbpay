package com.taobao.android.fluid;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IAdapter;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, IAdapter> f12445a;
    private Context b;
    private boolean c;
    private String d;
    private String e;

    static {
        kge.a(-1967995958);
    }

    public static /* synthetic */ Context a(d dVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("cf78a635", new Object[]{dVar, context});
        }
        dVar.b = context;
        return context;
    }

    public static /* synthetic */ String a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dec0ec4b", new Object[]{dVar, str});
        }
        dVar.d = str;
        return str;
    }

    public static /* synthetic */ Map a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("10f1a6e0", new Object[]{dVar}) : dVar.f12445a;
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54d5e44d", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.c = z;
        return z;
    }

    public static /* synthetic */ String b(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b2ee8aa", new Object[]{dVar, str});
        }
        dVar.e = str;
        return str;
    }

    private d() {
        this.f12445a = new HashMap();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("dc8a20d4", new Object[0]) : new a();
    }

    public Map<String, IAdapter> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.f12445a;
    }

    public Context c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c833dc62", new Object[]{this}) : this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.d;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.e;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FluidSDKConfig{mAdapterMap=" + this.f12445a + ", mContext=" + this.b + ", mAppName='" + this.d + "', mAppVersion='" + this.e + "', mIsDebug=" + this.c + '}';
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, IAdapter> f12446a = new HashMap();
        private Context b;
        private boolean c;
        private String d;
        private String e;

        static {
            kge.a(-471453535);
        }

        public d a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("dddd8371", new Object[]{this});
            }
            d dVar = new d();
            d.a(dVar, this.b);
            d.a(dVar, this.d);
            d.b(dVar, this.e);
            d.a(dVar, this.c);
            d.a(dVar).putAll(this.f12446a);
            return dVar;
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("82b6cbdc", new Object[]{this, context});
            }
            this.b = context;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d6b00d4a", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("488a7a9", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4db4c850", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a a(Class<? extends IAdapter> cls, IAdapter iAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ac9edf", new Object[]{this, cls, iAdapter});
            }
            this.f12446a.put(cls.getName(), iAdapter);
            return this;
        }
    }
}
