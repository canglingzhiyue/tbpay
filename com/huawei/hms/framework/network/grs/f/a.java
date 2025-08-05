package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected com.huawei.hms.framework.network.grs.local.model.a f7420a;
    protected List<com.huawei.hms.framework.network.grs.local.model.b> b;
    protected Map<String, String> c = new ConcurrentHashMap(16);
    protected boolean d = false;
    protected boolean e = false;
    protected boolean f = false;
    protected Set<String> g = new HashSet(16);

    private Map<String, String> a(List<com.huawei.hms.framework.network.grs.local.model.b> list, GrsBaseInfo grsBaseInfo, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        for (com.huawei.hms.framework.network.grs.local.model.b bVar : list) {
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), bVar.b());
            }
            if (bVar.a().contains(str)) {
                Logger.v("AbstractLocalManager", "get countryGroupID from geoIp");
                concurrentHashMap.put(str, bVar.b());
            }
        }
        return concurrentHashMap;
    }

    private int b(String str, Context context) {
        if (f(com.huawei.hms.framework.network.grs.h.c.a(str, context)) == 0) {
            Logger.i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str);
            return 0;
        }
        return -1;
    }

    private int f(String str) {
        int b;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (this.e && (b = b(str)) != 0) {
            return b;
        }
        int a2 = a(str);
        return a2 != 0 ? a2 : e(str);
    }

    private int g(String str) {
        List<com.huawei.hms.framework.network.grs.local.model.b> list;
        int c;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return (!this.e || ((list = this.b) != null && !list.isEmpty()) || (c = c(str)) == 0) ? d(str) : c;
    }

    public abstract int a(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(GrsApp.getInstance().getBrand("/"));
        sb.append(str);
        return b(sb.toString(), context) != 0 ? -1 : 0;
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        Map<String, String> a2 = a(context, aVar, grsBaseInfo, str, z);
        if (a2 == null) {
            Logger.w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
            return null;
        }
        return a2.get(str2);
    }

    public List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONArray jSONArray) {
        JSONArray jSONArray2;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
                bVar.b(jSONObject.getString("id"));
                bVar.c(jSONObject.getString("name"));
                bVar.a(jSONObject.getString("description"));
                JSONArray jSONArray3 = null;
                if (jSONObject.has("countriesOrAreas")) {
                    jSONArray2 = jSONObject.getJSONArray("countriesOrAreas");
                } else if (jSONObject.has("countries")) {
                    jSONArray2 = jSONObject.getJSONArray("countries");
                } else {
                    Logger.w("AbstractLocalManager", "current country or area group has not config countries or areas.");
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray3 != null || jSONArray3.length() == 0) {
                        return new ArrayList();
                    }
                    for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                        hashSet.add((String) jSONArray3.get(i2));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
                jSONArray3 = jSONArray2;
                HashSet hashSet2 = new HashSet(16);
                if (jSONArray3 != null) {
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return new ArrayList();
        }
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        com.huawei.hms.framework.network.grs.local.model.a aVar2 = this.f7420a;
        if (aVar2 == null) {
            Logger.w("AbstractLocalManager", "application data is null.");
            return null;
        }
        com.huawei.hms.framework.network.grs.local.model.c a2 = aVar2.a(str);
        if (a2 == null) {
            Logger.w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String b = e.b(context, aVar, a2.b(), grsBaseInfo, z);
        if (b == null) {
            Logger.w("AbstractLocalManager", "country not found by routeby in local config{%s}", a2.b());
            return null;
        }
        List<com.huawei.hms.framework.network.grs.local.model.b> a3 = a2.a();
        com.huawei.hms.framework.network.grs.local.model.d a4 = a2.a(((a3 == null || a3.size() == 0) ? this.c : a(a3, grsBaseInfo, b)).get(b));
        if (a4 != null) {
            return a4.a();
        }
        return null;
    }

    public void a() {
        com.huawei.hms.framework.network.grs.local.model.a aVar = this.f7420a;
        if (aVar != null) {
            aVar.a();
            this.f = true;
        }
    }

    public void a(Context context, List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            if (Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str)) {
                if (g(com.huawei.hms.framework.network.grs.h.c.a(GrsApp.getInstance().getBrand("/") + str, context)) == 0) {
                    Logger.i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, sucess.", str);
                } else {
                    Logger.i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, failure.", str);
                }
            }
        }
    }

    public void a(GrsBaseInfo grsBaseInfo) {
        this.c.put("no_route_country", "no-country");
        List<com.huawei.hms.framework.network.grs.local.model.b> list = this.b;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.huawei.hms.framework.network.grs.local.model.b bVar : this.b) {
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                this.c.put(grsBaseInfo.getIssueCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                this.c.put(grsBaseInfo.getRegCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                this.c.put(grsBaseInfo.getSerCountry(), bVar.b());
            }
        }
        this.b = null;
    }

    public abstract int b(String str);

    public com.huawei.hms.framework.network.grs.local.model.a b() {
        return this.f7420a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(org.json.JSONArray r15) {
        /*
            r14 = this;
            if (r15 == 0) goto Lf4
            int r0 = r15.length()
            if (r0 == 0) goto Lf4
            r0 = 0
            r1 = 0
        La:
            int r2 = r15.length()
            if (r1 >= r2) goto Lf4
            org.json.JSONObject r2 = r15.getJSONObject(r1)
            com.huawei.hms.framework.network.grs.local.model.c r3 = new com.huawei.hms.framework.network.grs.local.model.c
            r3.<init>()
            java.lang.String r4 = "name"
            java.lang.String r4 = r2.getString(r4)
            r3.b(r4)
            java.util.Set<java.lang.String> r5 = r14.g
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto Lf0
            java.util.Set<java.lang.String> r5 = r14.g
            r5.add(r4)
            boolean r5 = r14.e
            if (r5 == 0) goto Lf0
            java.lang.String r5 = "routeBy"
            java.lang.String r5 = r2.getString(r5)
            r3.c(r5)
            java.lang.String r5 = "servings"
            org.json.JSONArray r5 = r2.getJSONArray(r5)
            r6 = 0
        L43:
            int r7 = r5.length()
            java.lang.String r8 = "AbstractLocalManager"
            if (r6 >= r7) goto Lbd
            java.lang.Object r7 = r5.get(r6)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            com.huawei.hms.framework.network.grs.local.model.d r9 = new com.huawei.hms.framework.network.grs.local.model.d
            r9.<init>()
            java.lang.String r10 = "countryOrAreaGroup"
            boolean r11 = r7.has(r10)
            if (r11 == 0) goto L63
        L5e:
            java.lang.String r8 = r7.getString(r10)
            goto L78
        L63:
            java.lang.String r10 = "countryGroup"
            boolean r11 = r7.has(r10)
            if (r11 == 0) goto L6c
            goto L5e
        L6c:
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r0] = r4
            java.lang.String r11 = "maybe this service{%s} routeBy is unconditional."
            com.huawei.hms.framework.common.Logger.v(r8, r11, r10)
            java.lang.String r8 = "no-country"
        L78:
            r9.a(r8)
            java.lang.String r8 = "addresses"
            org.json.JSONObject r7 = r7.getJSONObject(r8)
            java.util.concurrent.ConcurrentHashMap r8 = new java.util.concurrent.ConcurrentHashMap
            r10 = 16
            r8.<init>(r10)
            java.util.Iterator r10 = r7.keys()
        L8c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb0
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r7.getString(r11)
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto L8c
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L8c
            java.lang.String r12 = r7.getString(r11)
            r8.put(r11, r12)
            goto L8c
        Lb0:
            r9.a(r8)
            java.lang.String r7 = r9.b()
            r3.a(r7, r9)
            int r6 = r6 + 1
            goto L43
        Lbd:
            r5 = 0
            java.lang.String r6 = "countryOrAreaGroups"
            boolean r7 = r2.has(r6)
            if (r7 == 0) goto Lcf
        Lc6:
            org.json.JSONArray r2 = r2.getJSONArray(r6)
            java.util.List r5 = r14.a(r2)
            goto Ldd
        Lcf:
            java.lang.String r6 = "countryGroups"
            boolean r7 = r2.has(r6)
            if (r7 == 0) goto Ld8
            goto Lc6
        Ld8:
            java.lang.String r2 = "service use default countryOrAreaGroup"
            com.huawei.hms.framework.common.Logger.i(r8, r2)
        Ldd:
            r3.a(r5)
            com.huawei.hms.framework.network.grs.local.model.a r2 = r14.f7420a
            if (r2 != 0) goto Leb
            com.huawei.hms.framework.network.grs.local.model.a r2 = new com.huawei.hms.framework.network.grs.local.model.a
            r2.<init>()
            r14.f7420a = r2
        Leb:
            com.huawei.hms.framework.network.grs.local.model.a r2 = r14.f7420a
            r2.a(r4, r3)
        Lf0:
            int r1 = r1 + 1
            goto La
        Lf4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.f.a.b(org.json.JSONArray):void");
    }

    public int c(String str) {
        this.b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = null;
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.e("AbstractLocalManager", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
            }
            if (jSONArray == null) {
                return -1;
            }
            this.b.addAll(a(jSONArray));
            return 0;
        } catch (JSONException e) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    public Set<String> c() {
        return this.g;
    }

    public int d(String str) {
        try {
            b(new JSONObject(str).getJSONArray(ServiceNode.TAG));
            return 0;
        } catch (JSONException e) {
            Logger.w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    public boolean d() {
        return this.f;
    }

    public abstract int e(String str);

    public boolean e() {
        return this.d;
    }
}
