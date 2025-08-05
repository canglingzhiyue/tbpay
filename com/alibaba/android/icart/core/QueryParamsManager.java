package com.alibaba.android.icart.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.tao.TBMainHost;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import tb.ieu;
import tb.kge;

/* loaded from: classes2.dex */
public class QueryParamsManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CART_FROM = "taobao_client";
    public static final String KEY_CART_FROM_BIZ = "cartFromBiz";
    public static final String KEY_QUERY_PARAM_CART_FROM = "cartfrom";
    public static final String TMALL_MARKET_CART_FROM = "tsm_native_taobao";
    public static final String VALUE_QUERY_PARAM_CART_FROM_SUPMKT = "tmall_supermarket";

    /* renamed from: a  reason: collision with root package name */
    private String f2296a;
    private JSONObject b;
    private JSONObject c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private List<String> l;
    private Activity m;
    private String n;
    private String o;
    private String p;
    private String q;
    private boolean r;
    private final Context s;
    private Intent t;
    private String u = "recmd";

    /* loaded from: classes2.dex */
    public @interface CartFeedFlowType {
        public static final String none = "none";
        public static final String recmd = "recmd";
        public static final String search = "xsearch";
    }

    static {
        kge.a(-532518200);
    }

    public QueryParamsManager(Activity activity) {
        this.m = activity;
        this.s = activity;
        s();
    }

    public QueryParamsManager(Context context, Intent intent) {
        this.s = context;
        this.t = intent;
        s();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f2296a;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.g;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.h;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.i;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.j;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.k;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.r;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        String str = this.p;
        this.p = null;
        return str;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : this.q;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            this.q = null;
        }
    }

    public String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this}) : this.u;
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.f2296a = r();
        this.b = b("customParams");
        this.c = b("cartSortParams");
        this.d = c("cartCustomExParam");
        this.n = c("cart_page_name");
        this.e = t();
        this.g = d("removeRecmd");
        this.h = d(RequestConfig.IS_FULL_DATA_QUERY);
        this.o = c("cart_spm_cnt");
        this.i = DEFAULT_CART_FROM.equals(this.f2296a);
        this.j = TMALL_MARKET_CART_FROM.equals(this.f2296a);
        this.q = c("holdCustomExParams");
        String c = c(ieu.sKeyFeedFlowType);
        if ("recmd".equals(c) || CartFeedFlowType.search.equals(c) || "none".equals(c)) {
            this.u = c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            try {
                this.k = JSONObject.parseObject(this.d).getBooleanValue("preheat");
            } catch (Exception unused) {
            }
        }
        this.l = u();
        this.p = c("onceCustomExParams");
        this.r = d("disableFirstPageCache");
        p();
        if (!TextUtils.isEmpty(this.q) || TBMainHost.a().getContext() != this.s) {
            return;
        }
        this.q = CheckHoldManager.a().b();
        CheckHoldManager.a().a((String) null);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.n)) {
            this.f = this.n;
        } else if (j()) {
            this.f = "Page_MarketCart";
        } else {
            this.f = "Page_ShoppingCart";
        }
    }

    private String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this});
        }
        String str = null;
        try {
            Intent v = v();
            Uri data = v.getData();
            str = c("newCartDefaultTab");
            if (!TextUtils.isEmpty(str)) {
                Set<String> queryParameterNames = data.getQueryParameterNames();
                Uri.Builder clearQuery = data.buildUpon().clearQuery();
                for (String str2 : queryParameterNames) {
                    if (!str2.equals("newCartDefaultTab")) {
                        clearQuery.appendQueryParameter(str2, data.getQueryParameter(str2));
                    }
                }
                v.setData(clearQuery.build());
            }
        } catch (Exception unused) {
        }
        return str;
    }

    private JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str});
        }
        String c = c(str);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        try {
            return JSON.parseObject(c);
        } catch (Exception unused) {
            return null;
        }
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        Uri data = v().getData();
        if (data != null) {
            return data.getQueryParameter(str);
        }
        return null;
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        Uri data = v().getData();
        if (data != null) {
            return data.getBooleanQueryParameter(str, false);
        }
        return false;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : this.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if ("tmall_supermarket".equalsIgnoreCase(r4) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String r() {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.icart.core.QueryParamsManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r7
            java.lang.String r2 = "9ed849c7"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L15:
            android.content.Intent r0 = r7.v()
            java.lang.String r1 = "taobao_client"
            if (r0 != 0) goto L1f
            return r1
        L1f:
            android.net.Uri r2 = r0.getData()
            java.lang.String r3 = "cartfrom"
            if (r2 == 0) goto L54
            java.lang.String r4 = r2.getQueryParameter(r3)
            java.lang.String r5 = "cart.m.tmall.com"
            java.lang.String r6 = r2.getHost()     // Catch: java.lang.Exception -> L44
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Exception -> L44
            if (r5 != 0) goto L40
            java.lang.String r5 = "tmall_supermarket"
            boolean r4 = r5.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> L44
            if (r4 == 0) goto L44
        L40:
            java.lang.String r4 = "tsm_native_taobao"
            goto L45
        L44:
            r4 = r1
        L45:
            java.lang.String r5 = "cartFromBiz"
            java.lang.String r2 = r2.getQueryParameter(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L52
            goto L55
        L52:
            r2 = r4
            goto L55
        L54:
            r2 = r1
        L55:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L6b
            android.os.Bundle r0 = r0.getExtras()     // Catch: java.lang.Exception -> L6b
            if (r0 == 0) goto L6b
            boolean r4 = r0.containsKey(r3)     // Catch: java.lang.Exception -> L6b
            if (r4 == 0) goto L6b
            java.lang.String r2 = r0.getString(r3)     // Catch: java.lang.Exception -> L6b
        L6b:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L72
            goto L73
        L72:
            r1 = r2
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.icart.core.QueryParamsManager.r():java.lang.String");
    }

    private List<String> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b1ac84b", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject parseObject = JSON.parseObject(c("customParams"));
            String string = parseObject.getString("headerStartBg");
            String string2 = parseObject.getString("headerEndBg");
            if (!TextUtils.isEmpty(string)) {
                arrayList.add(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                arrayList.add(string2);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private Intent v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("bede7676", new Object[]{this});
        }
        Activity activity = this.m;
        if (activity != null) {
            return activity.getIntent();
        }
        return this.t;
    }
}
