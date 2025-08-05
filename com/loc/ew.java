package com.loc;

import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ew extends AMapLocation {
    protected String d;
    boolean e;
    String f;
    private String g;
    private String h;
    private int i;
    private String j;
    private int k;
    private String l;
    private JSONObject m;
    private String n;
    private String o;
    private String p;

    public ew(String str) {
        super(str);
        this.d = "";
        this.g = null;
        this.h = "";
        this.j = "";
        this.k = 0;
        this.l = "new";
        this.m = null;
        this.n = "";
        this.e = true;
        this.f = String.valueOf(AMapLocationClientOption.GeoLanguage.DEFAULT);
        this.o = "";
        this.p = null;
    }

    private void i(String str) {
        this.n = str;
    }

    private void j(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] split = str.split("\\*");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str2 = split[i];
            if (!TextUtils.isEmpty(str2)) {
                String[] split2 = str2.split(",");
                setLongitude(fy.c(split2[0]));
                setLatitude(fy.c(split2[1]));
                setAccuracy(fy.e(split2[2]));
                break;
            }
            i++;
        }
        this.o = str;
    }

    public final String a() {
        return this.g;
    }

    public final void a(int i) {
        this.k = i;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void a(JSONObject jSONObject) {
        this.m = jSONObject;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final String b() {
        return this.h;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void b(JSONObject jSONObject) {
        try {
            fr.a(this, jSONObject);
            e(jSONObject.optString("type", this.l));
            d(jSONObject.optString("retype", this.j));
            j(jSONObject.optString("cens", this.o));
            g(jSONObject.optString("desc", this.d));
            c(jSONObject.optString("coord", String.valueOf(this.i)));
            i(jSONObject.optString("mcell", this.n));
            a(jSONObject.optBoolean("isReversegeo", this.e));
            f(jSONObject.optString("geoLanguage", this.f));
            if (fy.a(jSONObject, "poiid")) {
                setBuildingId(jSONObject.optString("poiid"));
            }
            if (fy.a(jSONObject, MspDBHelper.BizEntry.COLUMN_NAME_PID)) {
                setBuildingId(jSONObject.optString(MspDBHelper.BizEntry.COLUMN_NAME_PID));
            }
            if (fy.a(jSONObject, com.taobao.android.weex_framework.util.a.ATOM_EXT_floor)) {
                setFloor(jSONObject.optString(com.taobao.android.weex_framework.util.a.ATOM_EXT_floor));
            }
            if (!fy.a(jSONObject, "flr")) {
                return;
            }
            setFloor(jSONObject.optString("flr"));
        } catch (Throwable th) {
            fr.a(th, "AmapLoc", "AmapLoc");
        }
    }

    public final int c() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r2) {
        /*
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "0"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            r2 = 0
            goto L1b
        L10:
            java.lang.String r0 = "1"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = -1
        L1b:
            r1.i = r2
            int r2 = r1.i
            if (r2 != 0) goto L27
            java.lang.String r2 = "WGS84"
        L23:
            super.setCoordType(r2)
            return
        L27:
            java.lang.String r2 = "GCJ02"
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ew.c(java.lang.String):void");
    }

    public final String d() {
        return this.j;
    }

    public final void d(String str) {
        this.j = str;
    }

    public final String e() {
        return this.l;
    }

    public final void e(String str) {
        this.l = str;
    }

    public final JSONObject f() {
        return this.m;
    }

    public final void f(String str) {
        this.f = str;
    }

    public final String g() {
        return this.n;
    }

    public final void g(String str) {
        this.d = str;
    }

    public final ew h() {
        String g = g();
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        String[] split = g.split(",");
        if (split.length != 3) {
            return null;
        }
        ew ewVar = new ew("");
        ewVar.setProvider(getProvider());
        ewVar.setLongitude(fy.c(split[0]));
        ewVar.setLatitude(fy.c(split[1]));
        ewVar.setAccuracy(fy.d(split[2]));
        ewVar.setCityCode(getCityCode());
        ewVar.setAdCode(getAdCode());
        ewVar.setCountry(getCountry());
        ewVar.setProvince(getProvince());
        ewVar.setCity(getCity());
        ewVar.setTime(getTime());
        ewVar.e(e());
        ewVar.c(String.valueOf(c()));
        if (fy.a(ewVar)) {
            return ewVar;
        }
        return null;
    }

    public final void h(String str) {
        this.p = str;
    }

    public final boolean i() {
        return this.e;
    }

    public final String j() {
        return this.f;
    }

    public final String k() {
        return this.p;
    }

    public final int l() {
        return this.k;
    }

    @Override // com.amap.api.location.AMapLocation
    public final JSONObject toJson(int i) {
        try {
            JSONObject json = super.toJson(i);
            if (i == 1) {
                json.put("retype", this.j);
                json.put("cens", this.o);
                json.put("coord", this.i);
                json.put("mcell", this.n);
                json.put("desc", this.d);
                json.put("address", getAddress());
                if (this.m != null && fy.a(json, "offpct")) {
                    json.put("offpct", this.m.getString("offpct"));
                }
            } else if (i != 2 && i != 3) {
                return json;
            }
            json.put("type", this.l);
            json.put("isReversegeo", this.e);
            json.put("geoLanguage", this.f);
            return json;
        } catch (Throwable th) {
            fr.a(th, "AmapLoc", "toStr");
            return null;
        }
    }

    @Override // com.amap.api.location.AMapLocation
    public final String toStr() {
        return toStr(1);
    }

    @Override // com.amap.api.location.AMapLocation
    public final String toStr(int i) {
        JSONObject jSONObject;
        try {
            jSONObject = toJson(i);
            jSONObject.put("nb", this.p);
        } catch (Throwable th) {
            fr.a(th, "AMapLocation", "toStr part2");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }
}
