package com.taobao.search.searchdoor.searchbar.data;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class c extends com.taobao.search.searchdoor.searchbar.data.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private String f19358a;
    private String b;
    private String c;
    private boolean d;
    private int e;
    private String f;
    private String g;
    private String h;
    private String i;

    static {
        kge.a(-720343136);
        Companion = new a(null);
    }

    public c() {
        super("text");
        this.f19358a = "";
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1997624040);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final c a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("295d4292", new Object[]{this, jSONObject});
            }
            if (jSONObject == null || jSONObject.isEmpty()) {
                return null;
            }
            c cVar = new c();
            String a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "text", "");
            q.a((Object) a2, "FastJsonParseUtil.parseString(json, \"text\", \"\")");
            cVar.a(a2);
            if (StringUtils.isEmpty(cVar.a())) {
                return null;
            }
            cVar.b(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "textColor", ""));
            cVar.c(com.taobao.android.searchbaseframe.util.a.a(jSONObject, e.KEY_TAB_DARK_TEXT_COLOR, ""));
            cVar.a(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "isBold", false));
            cVar.a(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "textSize", 15));
            cVar.d(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "strokeColor", ""));
            cVar.e(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "darkStrokeColor", ""));
            cVar.f(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "solidColor", ""));
            cVar.g(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "darkSolidColor", ""));
            return cVar;
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f19358a;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.f19358a = str;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.c;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.e;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.h;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.i;
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }
}
