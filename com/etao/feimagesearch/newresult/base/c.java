package com.etao.feimagesearch.newresult.base;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.eby;
import tb.kge;

/* loaded from: classes3.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f6816a;
    private JSONObject b;
    private JSONObject c;
    private String d;
    private JSONObject e;
    private JSONObject f;
    private String g;
    private String h;
    private String i;
    private String l;
    private boolean m;
    private boolean n;
    private String p;
    private boolean q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private boolean x;
    private String y;
    private List<String> o = new ArrayList();
    private boolean j = true;
    private boolean k = true;

    static {
        kge.a(-313955879);
        Companion = new a(null);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(650484193);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final c a(JSONObject jSONObject) {
            JSONObject c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("4b48ed93", new Object[]{this, jSONObject});
            }
            c cVar = new c();
            if (jSONObject == null) {
                return cVar;
            }
            cVar.a(jSONObject);
            cVar.b(jSONObject.getJSONObject("data"));
            if (cVar.c() != null && (c = cVar.c()) != null) {
                JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(c, "result");
                cVar.e(!(a2 == null || a2.isEmpty()));
                cVar.b(c.getString("tfs"));
                cVar.a(c.getString(aw.PARAM_PVID));
                cVar.c(c.getJSONObject("pageInfo"));
                JSONObject d = cVar.d();
                if (d != null) {
                    cVar.d(d.getString("pltSession"));
                    JSONObject jSONObject2 = d.getJSONObject("pltSession");
                    if (jSONObject2 != null) {
                        cVar.a(com.taobao.android.searchbaseframe.util.a.a(jSONObject2, "needStrimg", true));
                    }
                    cVar.d(d.getJSONObject("pltInfo"));
                    JSONObject e = cVar.e();
                    if (e != null) {
                        if (StringUtils.isEmpty(cVar.f())) {
                            cVar.b(e.getString("tfskey"));
                        }
                        cVar.g(e.getString("oss"));
                        cVar.j(e.getString(aw.PARAM_SEARCH_KEYWORD_RN));
                        cVar.h(e.getString("bboxes_str"));
                        cVar.i(e.getString("region"));
                        cVar.k(e.getString("appid"));
                        cVar.l(e.getString("reach_time"));
                        cVar.m(e.getString("invalidQReason"));
                        JSONObject jSONObject3 = e.getJSONObject("trace");
                        if (jSONObject3 != null) {
                            cVar.c(jSONObject3.getString("for_bts"));
                            String g = cVar.g();
                            List<String> b = g != null ? n.b((CharSequence) g, new String[]{";"}, false, 0, 6, (Object) null) : null;
                            List list = b;
                            if (!(list == null || list.isEmpty())) {
                                for (String str : b) {
                                    if (n.b((CharSequence) str, (CharSequence) "pagination_exp", false, 2, (Object) null)) {
                                        List b2 = n.b((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
                                        if (b2.size() > 1) {
                                            com.etao.feimagesearch.newresult.perf.a.a((String) b2.get(1));
                                        }
                                    }
                                }
                            }
                        }
                        cVar.b(com.taobao.android.searchbaseframe.util.a.a(e, "isAutoPullUpResult", true));
                        JSONObject b3 = com.taobao.android.searchbaseframe.util.a.b(e, "listHeaderBGConfig");
                        if (b3 != null) {
                            cVar.e(com.taobao.android.searchbaseframe.util.a.a(b3, "bgImgUrl", ""));
                        }
                    }
                    JSONObject jSONObject4 = d.getJSONObject("paginationInfo");
                    if (jSONObject4 != null) {
                        com.etao.feimagesearch.newresult.perf.a.a(com.taobao.android.searchbaseframe.util.a.a(jSONObject4, "openPaging", false));
                    }
                }
                if (cVar.r()) {
                    c.Companion.a(c, cVar);
                }
            }
            return cVar;
        }

        private final void a(JSONObject jSONObject, c cVar) {
            JSONObject b;
            String a2;
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69380593", new Object[]{this, jSONObject, cVar});
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("combos");
            if (jSONArray == null) {
                cVar.d(true);
            } else if (jSONArray.size() == 0) {
                cVar.d(true);
            } else {
                Object obj = jSONArray.get(0);
                if (obj instanceof String) {
                    cVar.d(true);
                    cVar.c(q.a((Object) "notSafe", jSONArray.get(0)));
                } else if (obj instanceof JSONObject) {
                    JSONArray a3 = com.taobao.android.searchbaseframe.util.a.a((JSONObject) obj, "pages");
                    JSONArray jSONArray2 = a3;
                    if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    int i = 4;
                    if (a3.size() <= 4) {
                        i = a3.size();
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        Object obj2 = a3.get(i2);
                        if ((obj2 instanceof JSONObject) && (b = com.taobao.android.searchbaseframe.util.a.b((JSONObject) obj2, "itemPic")) != null && (a2 = com.taobao.android.searchbaseframe.util.a.a(b, "src", "")) != null && !StringUtils.isEmpty(a2)) {
                            cVar.p().add(a2);
                        }
                    }
                }
            }
        }
    }

    public final Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f6816a;
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.f6816a = map;
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : this.p;
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.b = jSONObject;
        }
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.c;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.q;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public final JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.e;
    }

    public final List<String> p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f4f19870", new Object[]{this}) : this.o;
    }

    public final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else {
            this.f = jSONObject;
        }
    }

    public final JSONObject e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this}) : this.f;
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public final String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : this.r;
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    public final String t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this}) : this.s;
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }

    public final String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[]{this}) : this.t;
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else {
            this.u = str;
        }
    }

    public final String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this}) : this.u;
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public final String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this}) : this.v;
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    public final String x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5faa981", new Object[]{this}) : this.w;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.g;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.h;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.i;
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{this, str});
        } else {
            this.y = str;
        }
    }

    public final String z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d3061ebf", new Object[]{this}) : this.y;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.j;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.k;
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.l;
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.m;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.n;
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public final boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.x;
    }

    public final String n() {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        JSONObject jSONObject = this.f;
        if (jSONObject == null || (b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "queryPicItem")) == null) {
            return "";
        }
        q.a((Object) b, "FastJsonParseUtil.optJSO…eryPicItem\") ?: return \"\"");
        String a2 = com.taobao.android.searchbaseframe.util.a.a(b, eby.KEY_PIC_URL, "");
        q.a((Object) a2, "FastJsonParseUtil.parseS…eryPicItem, \"picUrl\", \"\")");
        if (StringUtils.isEmpty(a2)) {
            return "";
        }
        return com.etao.feimagesearch.config.b.bK() + a2;
    }

    public final Integer[] o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer[]) ipChange.ipc$dispatch("a5c0a0a2", new Object[]{this});
        }
        Integer[] numArr = {640, 640};
        JSONObject b = com.taobao.android.searchbaseframe.util.a.b(this.f, "queryPicItem");
        if (b == null) {
            return numArr;
        }
        q.a((Object) b, "FastJsonParseUtil.optJSO…yPicItem\") ?: return size");
        if (com.taobao.android.searchbaseframe.util.g.b(b.getString("w"), 640) == 0) {
            numArr[0] = 640;
        }
        if (com.taobao.android.searchbaseframe.util.g.b(b.getString("h"), 640) == 0) {
            numArr[1] = 640;
        }
        return numArr;
    }
}
