package com.taobao.flowcustoms.afc;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.ali.user.mobile.model.LoginType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.wireless.security.sdk.securesignature.SecureSignatureDefine;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.kge;
import tb.kog;
import tb.mpa;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String b;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public AfcXbsData G;
    public boolean H;
    public String I;
    public JSONObject J;
    public Context K;

    /* renamed from: a  reason: collision with root package name */
    public String f17179a;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public Map<String, String> m;
    public Uri n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public float u;
    public float v;
    public float w;
    public String x;
    public String y;
    public String z;

    static {
        kge.a(247727760);
    }

    public a() {
        this.m = new HashMap();
        this.D = "0";
        this.H = false;
        this.J = new JSONObject();
    }

    public a(Intent intent, Context context) {
        Uri data;
        this.m = new HashMap();
        this.D = "0";
        this.H = false;
        this.J = new JSONObject();
        if (context != null) {
            this.K = context.getApplicationContext();
        }
        this.D = "1";
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        c.b("linkx", "AfcContext === AfcContext: uri：" + data);
        this.o = data.toString();
        a();
        a(data);
        if (TextUtils.isEmpty(kog.a().m)) {
            return;
        }
        b = kog.a().m;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (AfcCustomSdk.a() != null && AfcCustomSdk.a().f17167a != null) {
            DisplayMetrics displayMetrics = AfcCustomSdk.a().f17167a.getResources().getDisplayMetrics();
            this.w = displayMetrics.density;
            this.u = displayMetrics.widthPixels;
            this.v = displayMetrics.heightPixels;
            this.x = AfcUtils.a((Context) AfcCustomSdk.a().f17167a, false);
        }
        this.z = "Android";
        this.A = Build.VERSION.RELEASE;
        this.C = kog.a().c(mpa.COLD);
        this.B = kog.a().c();
    }

    public void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else if (uri == null) {
        } else {
            c.a("linkx", "AfcContext === getQueryParameter: data：" + uri);
            this.n = uri;
            try {
                this.f17179a = uri.getQueryParameter("appkey");
                b = uri.getQueryParameter("packageName");
                this.c = uri.getQueryParameter("appName");
                this.d = uri.getQueryParameter("v");
                this.e = uri.getQueryParameter("action");
                this.f = uri.getQueryParameter("module");
                this.g = uri.getQueryParameter("h5Url");
                this.E = this.g;
                Iterator<String> it = uri.getQueryParameterNames().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (!TextUtils.isEmpty(next) && "backurl".equals(next.toLowerCase())) {
                        this.h = uri.getQueryParameter(next);
                        break;
                    }
                }
                this.i = uri.getQueryParameter("source");
                this.j = uri.getQueryParameter(SecureSignatureDefine.SG_KEY_SIGN_TTID);
                this.y = uri.getQueryParameter("utdid");
                this.k = uri.getQueryParameter("tag");
                this.l = uri.getQueryParameter("sdkName");
                this.r = uri.getQueryParameter(com.taobao.linkmanager.flowout.c.VISA);
                this.q = uri.getQueryParameter(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY);
                this.s = uri.getQueryParameter("bc_fl_src");
                this.t = uri.getQueryParameter(LoginType.LocalLoginType.AUTO_LOGIN);
                this.p = uri.getQueryParameter("afc_route");
                String queryParameter = uri.getQueryParameter("params");
                if (TextUtils.isEmpty(queryParameter)) {
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(queryParameter);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    this.m.put(next2, (String) jSONObject.get(next2));
                }
            } catch (Throwable th) {
                c.b("linkx", "AfcContext  ===  getQueryParameter: 解析异常：" + th.toString());
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        b = str;
        kog.a().m = str;
    }

    public static boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        return a(intent.getExtras(), "cold_startup_h5");
    }

    public static boolean a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b668f70", new Object[]{bundle})).booleanValue() : a(bundle, "cold_startup_h5");
    }

    public static boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        return a(intent.getExtras(), "hot_startup_h5");
    }

    public static boolean a(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f127363a", new Object[]{bundle, str})).booleanValue();
        }
        if (bundle != null) {
            try {
                if (bundle.getBoolean(str, false)) {
                    return true;
                }
            } catch (Throwable th) {
                c.b("linkx", "isH5HCColdStartup#options error occurred: " + th.toString());
            }
        }
        return false;
    }
}
