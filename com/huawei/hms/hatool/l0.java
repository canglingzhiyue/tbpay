package com.huawei.hms.hatool;

import mtopsdk.common.util.StringUtils;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    private String f7470a;
    private String b;
    private String c;
    private List<b1> d;
    private String e;

    public l0(String str, String str2, String str3, List<b1> list, String str4) {
        this.f7470a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
    }

    private String a(String str, String str2) {
        String str3;
        String f = a1.f(str, str2);
        if (StringUtils.isEmpty(f)) {
            v.a("hmsSdk", "No report address,TAG : %s,TYPE: %s ", str, str2);
            return "";
        }
        if ("oper".equals(str2)) {
            str3 = "{url}/common/hmshioperqrt";
        } else if ("maint".equals(str2)) {
            str3 = "{url}/common/hmshimaintqrt";
        } else if (!"diffprivacy".equals(str2)) {
            return "";
        } else {
            str3 = "{url}/common/common2";
        }
        return str3.replace("{url}", f);
    }

    private byte[] a(h1 h1Var) {
        String str;
        try {
            JSONObject a2 = h1Var.a();
            if (a2 != null) {
                return k1.a(a2.toString().getBytes("UTF-8"));
            }
            v.e("hmsSdk", "uploadEvents is null");
            return new byte[0];
        } catch (UnsupportedEncodingException unused) {
            str = "sendData(): getBytes - Unsupported coding format!!";
            v.e("hmsSdk", str);
            return new byte[0];
        } catch (JSONException unused2) {
            str = "uploadEvents to json error";
            v.e("hmsSdk", str);
            return new byte[0];
        }
    }

    private void b() {
        if (c0.a(q0.i(), "backup_event", 5242880)) {
            v.d("hmsSdk", "backup file reach max limited size, discard new event ");
            return;
        }
        JSONArray c = c();
        String a2 = n1.a(this.f7470a, this.b, this.e);
        v.c("hmsSdk", "Update data cached into backup,spKey: " + a2);
        d.b(q0.i(), "backup_event", a2, c.toString());
    }

    private JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        for (b1 b1Var : this.d) {
            try {
                jSONArray.put(b1Var.d());
            } catch (JSONException unused) {
                v.c("hmsSdk", "handleEvents: json error,Abandon this data");
            }
        }
        return jSONArray;
    }

    private h1 d() {
        return k.a(this.d, this.f7470a, this.b, this.e, this.c);
    }

    public void a() {
        String a2 = a(this.f7470a, this.b);
        if (StringUtils.isEmpty(a2) && !"preins".equals(this.b)) {
            v.e("hmsSdk", "collectUrl is empty");
            return;
        }
        if (!"_hms_config_tag".equals(this.f7470a) && !"_openness_config_tag".equals(this.f7470a)) {
            b();
        }
        h1 d = d();
        if (d == null) {
            b0.c().a(new d1(this.d, this.f7470a, this.e, this.b));
            return;
        }
        byte[] a3 = a(d);
        if (a3.length == 0) {
            v.e("hmsSdk", "request body is empty");
            return;
        }
        b0.b().a(new f(a3, a2, this.f7470a, this.b, this.e, this.d));
    }
}
