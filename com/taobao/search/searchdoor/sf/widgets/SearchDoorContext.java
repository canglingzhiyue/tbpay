package com.taobao.search.searchdoor.sf.widgets;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.m;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.sf.o;
import com.ut.mini.l;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;
import tb.imk;
import tb.jyx;
import tb.kge;
import tb.nde;
import tb.noa;
import tb.npx;
import tb.ntg;
import tb.ntr;

/* loaded from: classes7.dex */
public class SearchDoorContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTIVATE_PAGE = 10001;
    public static final int SUGGEST_PAGE = 10002;
    private ntg d;
    private String g;
    private String h;
    private String p;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f19364a = new HashMap();
    private final Map<String, String> b = new HashMap();
    private long c = 0;
    private npx e = new npx();
    private String f = "";
    private String i = "homepage";
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private int m = 10001;
    private boolean n = false;
    private boolean o = false;

    @Target({ElementType.PARAMETER, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface SearchDoorStatus {
    }

    static {
        kge.a(1829618882);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        this.f19364a.clear();
        if (map != null) {
            this.f19364a.putAll(map);
        }
        this.f19364a.put("q", v());
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.n;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f19364a.put(str, str2);
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : b(str, "");
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String a2 = a(str);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return a(noa.GLOBAL_PARAM_PREFIX + str);
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        String str3 = this.f19364a.get(str);
        return str3 == null ? str2 : str3;
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : this.f19364a.remove(str);
    }

    private String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this});
        }
        String b = b("query", "");
        return !TextUtils.isEmpty(b) ? b : b("q", "");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : b("q", "");
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            a("q", str);
        }
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : new HashMap(this.f19364a);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.l;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : TextUtils.equals("true", w());
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String b = b(nde.G_CHANNELSRP, "");
        return TextUtils.isEmpty(b) ? b("channelSrp", "") : b;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        String b = b("g_channelHistoryKey", "");
        return TextUtils.isEmpty(b) ? b(noa.KEY_CHANNEL_HISTORY_KEY, "") : b;
    }

    private String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this});
        }
        String b = b("g_historyOn", "");
        return TextUtils.isEmpty(b) ? a("historyOn") : b;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : b("placeholder", "");
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : e("all");
    }

    public String e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str}) : TextUtils.isEmpty(this.g) ? str : this.g;
    }

    public void a(String str, SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d6ff89", new Object[]{this, str, searchBarHintBean});
        } else {
            this.e.a(str, searchBarHintBean);
        }
    }

    public SearchBarHintBean f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchBarHintBean) ipChange.ipc$dispatch("35e7dc62", new Object[]{this, str}) : this.e.a(str);
    }

    public String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{this, str});
        }
        SearchBarHintBean f = f(str);
        return (f == null || f.suggestRn == null) ? "" : f.suggestRn;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.f = str;
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.i = str;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.i;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.j;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.k;
    }

    private String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5faa981", new Object[]{this});
        }
        String a2 = a("g_csearchdoor_spm");
        return TextUtils.isEmpty(a2) ? a("csearchdoor_spm") : a2;
    }

    public Map<String, String> m() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("44113da9", new Object[]{this});
        }
        String b = b("SearchTraceParams", "");
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            jSONObject = JSON.parseObject(b);
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (!TextUtils.isEmpty(string)) {
                hashMap.put(str, string);
            }
        }
        return hashMap;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        String str = null;
        Map<String, String> m = m();
        String x = x();
        if (!TextUtils.isEmpty(x)) {
            str = x;
        } else if (m != null && !m.isEmpty()) {
            str = m.get("spm-cnt");
        }
        return TextUtils.isEmpty(str) ? "true".equals(b(noa.KEY_SEARCH_ELDER_HOME_OPEN, "false")) ? k.SEARCH_DOOR_SPM_ELDER_HOME : k.SEARCH_DOOR_SPM : str;
    }

    public Map<String, String> o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("df66012b", new Object[]{this}) : this.b;
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.b.put(str, str2);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : this.m;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : this.h;
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public HashMap<String, Object> a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d9b8c029", new Object[]{this, str, str2, str3});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        boolean equals = "true".equals(a(noa.KEY_SEARCH_ELDER_HOME_OPEN));
        float c = j.c(imk.c);
        String r = r();
        hashMap.put("pageName", r);
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("suggestRN", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("tab", str2);
        }
        hashMap.put("spm", n());
        hashMap.put("rainbow", com.taobao.search.rainbow.a.c());
        hashMap.put("width", Float.valueOf(c));
        hashMap.put("containerWidth", Float.valueOf(c));
        hashMap.put("channelSrp", f());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageName", (Object) r);
        hashMap.put("pageInfo", jSONObject);
        hashMap.put("fontSizeLevel", Integer.valueOf(m.a(equals)));
        hashMap.put(noa.KEY_EDITION_CODE, com.taobao.search.mmd.util.g.d());
        hashMap.put(noa.KEY_GRAY_HAIR, Boolean.valueOf(equals));
        hashMap.put("elderHome", Boolean.valueOf(com.taobao.search.mmd.util.j.INSTANCE.a()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(jyx.DIMENSION_BUSINESS_NAME, (Object) o.BIZ_TBSEARCH);
        jSONObject2.put("tItemType", (Object) str3);
        jSONObject2.put("sversion", (Object) noa.SERVER_VERSION_VALUE);
        try {
            jSONObject2.put("rainbow", (Object) com.taobao.search.rainbow.a.c(String.format("tbAndroid%sEnableLT", str3)));
        } catch (Exception unused) {
        }
        hashMap.put("hubbleInfo", jSONObject2);
        return hashMap;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        String currentPageName = l.getInstance().getCurrentPageName();
        if (currentPageName == null || currentPageName.startsWith("Page_")) {
            return currentPageName;
        }
        return "Page_" + currentPageName;
    }

    public void a(ntg ntgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dc7bd7", new Object[]{this, ntgVar});
        } else {
            this.d = ntgVar;
        }
    }

    public void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb445a", new Object[]{this, activity, new Boolean(z)});
        } else if (z == this.o) {
        } else {
            com.taobao.android.searchbaseframe.util.k.d("SearchDoorEnv", z ? "onKeyboardShow" : "onKeyboardHide", new Object[0]);
            this.o = z;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isShow", (Object) String.valueOf(this.o));
            ntr.INSTANCE.a(activity, "SearchDoorEnv", "keyboardStatus", jSONObject);
        }
    }

    public void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
        } else if (TextUtils.equals(this.p, str)) {
        } else {
            com.taobao.android.searchbaseframe.util.k.d("SearchDoorStatus", str, new Object[0]);
            this.p = str;
            ntr.INSTANCE.a(activity, "SearchDoorEnv", "searchDoorStatus", str);
        }
    }

    public long s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136e", new Object[]{this})).longValue() : this.c;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
        }
        String a2 = a(noa.KEY_POP_UP);
        if (TextUtils.isEmpty(a2)) {
            a2 = a(noa.KEY_G_POP_UP);
        }
        return "true".equals(a2);
    }
}
