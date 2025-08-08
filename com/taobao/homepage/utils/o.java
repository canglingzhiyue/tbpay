package com.taobao.homepage.utils;

import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.kge;

/* loaded from: classes.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean c;
    private static LruCache<JSONObject, a> d;

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c;
    }

    static {
        kge.a(157513953);
        c = com.taobao.android.home.component.utils.j.a("enableSetTemplateType", true);
        d = new LruCache<>(20);
    }

    public static a a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7e835d99", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            a aVar = d.get(jSONObject);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a(jSONObject);
            d.put(jSONObject, aVar2);
            return aVar2;
        } catch (Throwable th) {
            com.taobao.android.home.component.utils.e.e("TemplateDataUtils", "getCompatibleDinamicTemplate error e: " + th.getMessage());
            return new a(jSONObject);
        }
    }

    public static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject}) : jSONObject == null ? "" : jSONObject.getString("columnType");
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f17297a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final boolean h;
        public final boolean i;
        public DinamicTemplate j;
        public DXTemplateItem k;

        static {
            kge.a(492889170);
        }

        public a(JSONObject jSONObject) {
            this.f17297a = jSONObject;
            this.b = jSONObject.getString("name");
            this.c = jSONObject.getString("version");
            this.d = jSONObject.getString("url");
            this.e = jSONObject.getString("name_v2");
            this.f = jSONObject.getString("version_v2");
            this.g = jSONObject.getString("url_v2");
            this.h = this.f17297a.getBooleanValue("isHomepageData_client");
            this.i = a(this.d, this.b, this.c) || a(this.g, this.e, this.f);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            if (this.f17297a.containsKey("disableDinamicX3_client") && this.f17297a.getBooleanValue("disableDinamicX3_client")) {
                return false;
            }
            return this.i;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
            }
            if (a()) {
                return e().f11925a;
            }
            return d().name;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
            }
            if (a()) {
                return String.valueOf(e().b);
            }
            return d().version;
        }

        public DinamicTemplate d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DinamicTemplate) ipChange.ipc$dispatch("8fff7355", new Object[]{this});
            }
            DinamicTemplate dinamicTemplate = this.j;
            if (dinamicTemplate != null) {
                return dinamicTemplate;
            }
            if (!a(this.d, this.b, this.c)) {
                this.j = new DinamicTemplate();
                DinamicTemplate dinamicTemplate2 = this.j;
                dinamicTemplate2.name = this.b;
                dinamicTemplate2.templateUrl = this.d;
                dinamicTemplate2.version = this.c;
                return dinamicTemplate2;
            }
            return new DinamicTemplate();
        }

        public DXTemplateItem e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXTemplateItem) ipChange.ipc$dispatch("42bad3", new Object[]{this});
            }
            DXTemplateItem dXTemplateItem = this.k;
            if (dXTemplateItem != null) {
                return dXTemplateItem;
            }
            if (a(this.d, this.b, this.c)) {
                this.k = new DXTemplateItem();
                DXTemplateItem dXTemplateItem2 = this.k;
                dXTemplateItem2.f11925a = this.b;
                dXTemplateItem2.b = a(this.c);
                DXTemplateItem dXTemplateItem3 = this.k;
                dXTemplateItem3.c = this.d;
                a(dXTemplateItem3);
                return this.k;
            } else if (a(this.g, this.e, this.f)) {
                this.k = new DXTemplateItem();
                DXTemplateItem dXTemplateItem4 = this.k;
                dXTemplateItem4.f11925a = this.e;
                dXTemplateItem4.b = a(this.f);
                DXTemplateItem dXTemplateItem5 = this.k;
                dXTemplateItem5.c = this.g;
                a(dXTemplateItem5);
                return this.k;
            } else {
                return new DXTemplateItem();
            }
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            } else {
                this.f17297a.put("disableDinamicX3_client", (Object) true);
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f17297a.put("needReCalculateViewType_client", (Object) Boolean.valueOf(z));
            }
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.f17297a.getBooleanValue("needReCalculateViewType_client");
        }

        private boolean a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue() : !StringUtils.isEmpty(str) && str.endsWith(".zip") && !StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3);
        }

        private long a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{this, str})).longValue();
            }
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
                return 0L;
            }
        }

        private void a(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem});
            } else if (!o.a() || dXTemplateItem == null) {
            } else {
                dXTemplateItem.c(1);
            }
        }
    }
}
