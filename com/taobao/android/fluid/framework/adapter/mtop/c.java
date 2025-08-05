package com.taobao.android.fluid.framework.adapter.mtop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.layoutmanager.module.MtopModule;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class c<T extends BaseOutDo> {

    /* renamed from: a  reason: collision with root package name */
    public final IMTOPDataObject f12460a;
    public final JSONObject b;
    public final IMTopAdapter.b<T> c;
    public final IMTopAdapter.a<T> d;
    public final Class<T> e;
    public final MtopModule.a f;
    public final boolean g;
    public final Map<String, String> h;
    public final boolean i;
    public final MtopModule.b j;
    public String k;

    static {
        kge.a(1438396204);
    }

    private c(a<T> aVar) {
        this.f12460a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar);
        this.f = a.f(aVar);
        this.g = a.g(aVar);
        this.i = a.h(aVar);
        this.j = aVar.f12461a;
        this.h = a.i(aVar);
        this.k = aVar.k;
    }

    /* loaded from: classes5.dex */
    public static class a<T extends BaseOutDo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public MtopModule.b f12461a;
        private IMTOPDataObject b;
        private JSONObject c;
        private IMTopAdapter.b<T> d;
        private IMTopAdapter.a<T> e;
        private Class<T> f;
        private MtopModule.a g;
        private boolean h;
        private Map<String, String> i;
        private boolean j;
        public String k;

        static {
            kge.a(326012936);
        }

        public static /* synthetic */ IMTOPDataObject a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IMTOPDataObject) ipChange.ipc$dispatch("5f879d2f", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ JSONObject b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("48b53056", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ IMTopAdapter.b c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IMTopAdapter.b) ipChange.ipc$dispatch("cd02c181", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ IMTopAdapter.a d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IMTopAdapter.a) ipChange.ipc$dispatch("4318e3c1", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ Class e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("10e42d40", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ MtopModule.a f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MtopModule.a) ipChange.ipc$dispatch("c84f507e", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e84a50d5", new Object[]{aVar})).booleanValue() : aVar.h;
        }

        public static /* synthetic */ boolean h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("753767f4", new Object[]{aVar})).booleanValue() : aVar.j;
        }

        public static /* synthetic */ Map i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6678b04", new Object[]{aVar}) : aVar.i;
        }

        private a() {
        }

        public static <T extends BaseOutDo> a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f0cfd157", new Object[0]) : new a();
        }

        public c<T> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("5f1fcdf5", new Object[]{this}) : new c<>(this);
        }

        public a a(IMTopAdapter.b<T> bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aaff6a03", new Object[]{this, bVar});
            }
            this.d = bVar;
            return this;
        }

        public a a(Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a7b3c044", new Object[]{this, cls});
            }
            this.f = cls;
            return this;
        }

        public a a(MtopModule.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("85c9e2d0", new Object[]{this, bVar});
            }
            this.f12461a = bVar;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e55a7e5b", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7247957a", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a a(MtopModule.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("84938ff1", new Object[]{this, aVar});
            }
            this.g = aVar;
            return this;
        }

        public a a(IMTopAdapter.a<T> aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a9c91724", new Object[]{this, aVar});
            }
            this.e = aVar;
            return this;
        }

        public a a(IMTOPDataObject iMTOPDataObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("242fac6f", new Object[]{this, iMTOPDataObject});
            }
            this.b = iMTOPDataObject;
            return this;
        }

        public a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b5471077", new Object[]{this, jSONObject});
            }
            this.c = jSONObject;
            return this;
        }

        public a a(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a40c768c", new Object[]{this, map});
            }
            this.i = map;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f5784021", new Object[]{this, str});
            }
            this.k = str;
            return this;
        }
    }
}
