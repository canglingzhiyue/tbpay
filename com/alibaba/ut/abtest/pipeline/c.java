package com.alibaba.ut.abtest.pipeline;

import android.text.TextUtils;
import com.alibaba.ut.abtest.internal.util.j;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import tb.cff;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f4210a;
    private cff b;
    private String c;
    private RequestMethod d = RequestMethod.GET;
    private Object e;
    private Class f;
    private Type g;

    static {
        kge.a(1822922959);
    }

    public static /* synthetic */ RequestMethod a(c cVar, RequestMethod requestMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestMethod) ipChange.ipc$dispatch("19b709c2", new Object[]{cVar, requestMethod});
        }
        cVar.d = requestMethod;
        return requestMethod;
    }

    public static /* synthetic */ Class a(c cVar, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("543f46b6", new Object[]{cVar, cls});
        }
        cVar.f = cls;
        return cls;
    }

    public static /* synthetic */ String a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8d5cde2", new Object[]{cVar, str});
        }
        cVar.c = str;
        return str;
    }

    public static /* synthetic */ Map a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("eb2114e9", new Object[]{cVar}) : cVar.f4210a;
    }

    public static /* synthetic */ Map a(c cVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8c239fc6", new Object[]{cVar, map});
        }
        cVar.f4210a = map;
        return map;
    }

    public static /* synthetic */ cff a(c cVar, cff cffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cff) ipChange.ipc$dispatch("b21ace82", new Object[]{cVar, cffVar});
        }
        cVar.b = cffVar;
        return cffVar;
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f4210a;
    }

    public cff b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cff) ipChange.ipc$dispatch("16b4d67a", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public RequestMethod d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestMethod) ipChange.ipc$dispatch("e0139a6a", new Object[]{this}) : this.d;
    }

    public Object e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d74af246", new Object[]{this}) : this.e;
    }

    public Class f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("9c80f89a", new Object[]{this}) : this.f;
    }

    public Type g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Type) ipChange.ipc$dispatch("20b61717", new Object[]{this}) : this.g;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private c f4211a;

        static {
            kge.a(1737240742);
        }

        public a(String str) {
            j.a(!TextUtils.isEmpty(str), "Url cannot be empty");
            this.f4211a = new c();
            c.a(this.f4211a, str);
        }

        public a a(cff cffVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("43a2ee10", new Object[]{this, cffVar});
            }
            c.a(this.f4211a, cffVar);
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a9f4fe88", new Object[]{this, map});
            }
            if (c.a(this.f4211a) == null) {
                c.a(this.f4211a, new HashMap());
            } else {
                c.a(this.f4211a).clear();
            }
            c.a(this.f4211a).putAll(map);
            return this;
        }

        public a a(RequestMethod requestMethod) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c996f81e", new Object[]{this, requestMethod});
            }
            c.a(this.f4211a, requestMethod);
            return this;
        }

        public a a(Class cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4c592dd0", new Object[]{this, cls});
            }
            c.a(this.f4211a, cls);
            return this;
        }

        public c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("7163993a", new Object[]{this}) : this.f4211a;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + " { url=" + c() + ", method=" + d() + ", headers=" + a() + ", params=" + b() + ", requestContext=" + e() + riy.BLOCK_END_STR;
    }
}
