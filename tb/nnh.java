package tb;

import android.app.Activity;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.s;
import com.taobao.search.common.util.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class nnh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String SPAN_CELL = "cell-render";
    public static final String SPAN_DATA_PARSE = "data-parse";
    public static final String SPAN_MTOP_REQUEST = "mtop-request";
    public static final String SPAN_PAGE_PROCESS = "page-process";
    public static final String SPAN_SETUP_PAGE = "setup-page";
    public static final String SPAN_TEMPLATES_REQUEST = "templates-request";

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31588a = r.bG();
    private List<nnj> b = new ArrayList();
    private final Map<String, nni> c = new LinkedHashMap();
    private boolean d;
    private String e;
    private boolean f;

    static {
        kge.a(851840850);
        Companion = new a(null);
    }

    @JvmStatic
    public static final String a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj}) : Companion.a(obj);
    }

    @JvmStatic
    public static final void a(String str, String str2, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f854dbb", new Object[]{str, str2, l});
        } else {
            Companion.a(str, str2, l);
        }
    }

    @JvmStatic
    public static final void a(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45199658", new Object[]{str, str2, obj});
        } else {
            Companion.a(str, str2, obj);
        }
    }

    public nnh(String str, boolean z) {
        this.e = str;
        this.f = z;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!this.f31588a) {
        } else {
            String str2 = str;
            if (str2 != null && str2.length() != 0) {
                z = false;
            }
            if (z) {
                this.e = "";
            } else {
                this.e = str;
            }
            if (this.b.isEmpty()) {
                return;
            }
            Iterator<nnj> it = this.b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().b(this.e);
                    it.remove();
                } catch (Throwable unused) {
                    return;
                }
            }
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f31588a) {
        } else {
            this.c.put(SPAN_PAGE_PROCESS, new nni(SPAN_PAGE_PROCESS, SystemClock.uptimeMillis()));
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.f31588a) {
        } else {
            this.c.put("mtop-request", new nni("mtop-request", SystemClock.uptimeMillis()));
        }
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (!this.f31588a) {
        } else {
            a("mtop-request", SystemClock.uptimeMillis(), g(map), false, null);
        }
    }

    public final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (!this.f31588a) {
        } else {
            a("mtop-request", SystemClock.uptimeMillis(), g(map), true, null);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.f31588a) {
        } else {
            this.c.put(SPAN_DATA_PARSE, new nni(SPAN_DATA_PARSE, SystemClock.uptimeMillis()));
        }
    }

    public final void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else if (!this.f31588a) {
        } else {
            a(SPAN_DATA_PARSE, SystemClock.uptimeMillis(), g(map), false, null);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.f31588a) {
        } else {
            this.c.put(SPAN_TEMPLATES_REQUEST, new nni(SPAN_TEMPLATES_REQUEST, SystemClock.uptimeMillis()));
        }
    }

    public final void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else if (!this.f31588a) {
        } else {
            a(SPAN_TEMPLATES_REQUEST, SystemClock.uptimeMillis(), g(map), false, null);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.f31588a) {
        } else {
            this.d = true;
            a(SPAN_PAGE_PROCESS, SystemClock.uptimeMillis(), g(null), true, "process terminate");
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!this.f31588a) {
        } else {
            this.d = true;
            a(SPAN_PAGE_PROCESS, SystemClock.uptimeMillis(), g(null), false, null);
        }
    }

    public final void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b41f8", new Object[]{this, map});
        } else if (!this.f31588a) {
        } else {
            this.d = true;
            a(SPAN_PAGE_PROCESS, SystemClock.uptimeMillis(), g(map), false, "exception");
        }
    }

    private final Map<String, Object> g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("be86464c", new Object[]{this, map});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isNewSearch", Boolean.valueOf(this.f));
        if (map != null && (!map.isEmpty())) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    private final void a(String str, long j, Map<String, Object> map, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b61f04b", new Object[]{this, str, new Long(j), map, new Boolean(z), str2});
            return;
        }
        nni remove = this.c.remove(str);
        if (remove == null) {
            return;
        }
        nni nniVar = new nni(str, j);
        String str3 = this.e;
        if (str3 != null && str3.length() != 0) {
            z2 = false;
        }
        if (z2) {
            nnj nnjVar = new nnj(remove, nniVar);
            nnjVar.a(z);
            nnjVar.a(str2);
            nnjVar.a(map);
            this.b.add(nnjVar);
            return;
        }
        Companion.a(this.e, remove, nniVar, map, z, str2);
    }

    public final void a(String name, Object value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, name, value});
            return;
        }
        q.c(name, "name");
        q.c(value, "value");
        s.f18233a.a(this.e).a(name, value);
    }

    public final void b(String biz, Map<String, ? extends Object> params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, biz, params});
            return;
        }
        q.c(biz, "biz");
        q.c(params, "params");
        s.f18233a.a(this.e).b(biz, (Map<String, Object>) params);
    }

    public final void b(String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, name});
            return;
        }
        q.c(name, "name");
        this.c.put(name, new nni(name, SystemClock.uptimeMillis()));
    }

    public final void a(String name, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, name, map});
            return;
        }
        q.c(name, "name");
        a(name, SystemClock.uptimeMillis(), map, false, null);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2003796966);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final void a(String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45199658", new Object[]{this, str, str2, obj});
            } else if (str == null || str2 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            } else {
                s.f18233a.a(str).a(str2, obj);
            }
        }

        @JvmStatic
        public final void a(String str, String str2, Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f854dbb", new Object[]{this, str, str2, l});
            } else if (str == null || str2 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            } else {
                s.f18233a.a(str).a(str2, l != null ? l.longValue() : -1L);
            }
        }

        @JvmStatic
        public final String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj});
            }
            if (obj instanceof Activity) {
                IPage a2 = com.taobao.monitor.procedure.o.f18229a.a((Activity) obj);
                q.a((Object) a2, "PageManagerProxy.PROXY.g…ctivityPage(pageInstance)");
                String c = a2.c();
                q.a((Object) c, "PageManagerProxy.PROXY.g…pageInstance).pageSession");
                return c;
            } else if (!(obj instanceof Fragment)) {
                return "";
            } else {
                IPage a3 = com.taobao.monitor.procedure.o.f18229a.a((Fragment) obj);
                q.a((Object) a3, "PageManagerProxy.PROXY.g…ragmentPage(pageInstance)");
                String c2 = a3.c();
                q.a((Object) c2, "PageManagerProxy.PROXY.g…pageInstance).pageSession");
                return c2;
            }
        }

        @JvmStatic
        public final void a(String pageSession, String spanName, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4dba98c8", new Object[]{this, pageSession, spanName, new Long(j)});
                return;
            }
            q.c(pageSession, "pageSession");
            q.c(spanName, "spanName");
            s.f18233a.a(pageSession).c(spanName, j);
        }

        @JvmStatic
        public final void a(String pageSession, String spanName, long j, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("550999bd", new Object[]{this, pageSession, spanName, new Long(j), map});
                return;
            }
            q.c(pageSession, "pageSession");
            q.c(spanName, "spanName");
            s.f18233a.a(pageSession).a(spanName, j, map);
        }

        @JvmStatic
        public final void a(String pageSession, String spanName, long j, String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb5844b3", new Object[]{this, pageSession, spanName, new Long(j), str, map});
                return;
            }
            q.c(pageSession, "pageSession");
            q.c(spanName, "spanName");
            s.f18233a.a(pageSession).a(spanName, j, str, map);
        }

        @JvmStatic
        public final void a(String str, nni startNode, nni endNode, Map<String, Object> map, boolean z, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f0b4b79", new Object[]{this, str, startNode, endNode, map, new Boolean(z), str2});
                return;
            }
            q.c(startNode, "startNode");
            q.c(endNode, "endNode");
            if (TextUtils.isEmpty(str) || startNode.b() < 0 || endNode.b() < 0) {
                return;
            }
            a aVar = this;
            if (str == null) {
                q.a();
            }
            aVar.a(str, startNode.a(), startNode.b());
            if (z) {
                aVar.a(str, endNode.a(), endNode.b(), str2, map);
            } else {
                aVar.a(str, endNode.a(), endNode.b(), map);
            }
        }
    }
}
