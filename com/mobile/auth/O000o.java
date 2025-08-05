package com.mobile.auth;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.c;
import com.mobile.auth.O0OO00O;
import com.taobao.android.change.app.icon.core.Constrant;
import org.json.JSONException;
import org.json.JSONObject;
import tb.riy;

/* loaded from: classes4.dex */
public class O000o {
    private static O000o O00000o0;
    private final O00O000o O000000o;
    private final Context O00000Oo;
    private long O00000o = 8000;
    private final Handler O00000oO;
    private String O00000oo;
    private final c O0000O0o;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class O000000o implements Runnable {
        private final a O00000Oo;

        O000000o(a aVar) {
            this.O00000Oo = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject O000000o = (O0OOO00.O000000o(O000o.this.O00000Oo).O000000o() || !this.O00000Oo.b("doNetworkSwitch", false)) ? O00O00o0.O000000o("200023", "登录超时") : O00O00o0.O000000o("102508", "数据网络切换失败");
            O000o.this.O000000o(O000000o.optString("resultCode", "200023"), O000000o.optString("desc", "登录超时"), this.O00000Oo, O000000o);
        }
    }

    private O000o(Context context) {
        this.O00000Oo = context.getApplicationContext();
        this.O00000oO = new Handler(this.O00000Oo.getMainLooper());
        this.O000000o = O00O000o.O000000o(this.O00000Oo);
        O0OOO00.O000000o(this.O00000Oo);
        O0O0o00.O000000o(this.O00000Oo);
        O0O0OOO.O000000o(this.O00000Oo);
        this.O0000O0o = new c();
        O0OO00O.O000000o(new O0OO00O.O000000o() { // from class: com.mobile.auth.O000o.1
            @Override // com.mobile.auth.O0OO00O.O000000o
            protected void O000000o() {
                String O00000Oo = O0O0o00.O00000Oo("AID", "");
                O0O000o.O00000Oo("AuthnHelper", "aid = " + O00000Oo);
                if (TextUtils.isEmpty(O00000Oo)) {
                    O000o.this.O00000Oo();
                }
                O0O000o.O00000Oo("AuthnHelper", O0O00oO.O000000o(O000o.this.O00000Oo, true) ? "生成androidkeystore成功" : "生成androidkeystore失败");
            }
        });
    }

    private a O000000o(oooOoO oooooo) {
        a aVar = new a(64);
        String O00000o02 = O0OO0Oo.O00000o0();
        aVar.a(new O00oo000());
        aVar.a("traceId", O00000o02);
        O0O000o.O000000o("traceId", O00000o02);
        if (oooooo != null) {
            O0O00o.O000000o(O00000o02, oooooo);
        }
        return aVar;
    }

    public static O000o O000000o(Context context) {
        if (O00000o0 == null) {
            synchronized (O000o.class) {
                if (O00000o0 == null) {
                    O00000o0 = new O000o(context);
                }
            }
        }
        return O00000o0;
    }

    private void O000000o(final Context context, final String str, final a aVar) {
        O0OO00O.O000000o(new O0OO00O.O000000o() { // from class: com.mobile.auth.O000o.8
            @Override // com.mobile.auth.O0OO00O.O000000o
            protected void O000000o() {
                if ("200023".equals(str)) {
                    SystemClock.sleep(10000L);
                }
                new O00o().O000000o(context, str, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O000000o(a aVar, final O000000o o000000o) {
        this.O000000o.O000000o(aVar, new O00O00Oo() { // from class: com.mobile.auth.O000o.5
            @Override // com.mobile.auth.O00O00Oo
            public void O000000o(String str, String str2, a aVar2, JSONObject jSONObject) {
                O000o.this.O00000oO.removeCallbacks(o000000o);
                O000o.this.O000000o(str, str2, aVar2, jSONObject);
            }
        });
    }

    public static void O000000o(boolean z) {
        O0O000o.O000000o(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean O000000o(a aVar, String str, String str2, String str3, int i, oooOoO oooooo) {
        O00O0Oo O000000o2 = O000o00.O000000o(this.O00000Oo).O000000o();
        O0O000o.O00000Oo("AuthnHelper", "umcConfigBean = " + O000000o2.toString());
        aVar.a(O000000o2);
        aVar.a("use2048PublicKey", "rsa2048".equals(this.O00000oo));
        aVar.a("systemStartTime", SystemClock.elapsedRealtime());
        aVar.a("starttime", O0OO0O.O000000o());
        aVar.a("loginMethod", str3);
        aVar.a("appkey", str2);
        aVar.a("appid", str);
        aVar.a(Constrant.KEY_TIME_OUT, String.valueOf(this.O00000o));
        boolean O000000o3 = O0OoOo.O000000o(this.O00000Oo);
        O00O00o.O000000o().O000000o(this.O00000Oo, O000000o3);
        String O00000Oo = O0O0OOO.O000000o().O00000Oo();
        String O000000o4 = O0O0OOO.O000000o().O000000o(O000000o3);
        String O000000o5 = O0O0OOO.O000000o().O000000o(O000000o4, O000000o3);
        O0O0OOO.O000000o().O000000o(aVar);
        aVar.a("operator", O000000o4);
        aVar.a("operatortype", O000000o5);
        aVar.a("logintype", i);
        O0O000o.O00000Oo("AuthnHelper", "subId = " + O00000Oo);
        if (!TextUtils.isEmpty(O00000Oo)) {
            O0O000o.O000000o("AuthnHelper", "使用subId作为缓存key = " + O00000Oo);
            aVar.a("scripType", "subid");
            aVar.a("scripKey", O00000Oo);
        } else if (!TextUtils.isEmpty(O000000o4)) {
            O0O000o.O000000o("AuthnHelper", "使用operator作为缓存key = " + O000000o4);
            aVar.a("scripType", "operator");
            aVar.a("scripKey", O000000o4);
        }
        int O000000o6 = O0OoOo.O000000o(this.O00000Oo, O000000o3, aVar);
        aVar.a("networktype", O000000o6);
        if (!O000000o3) {
            aVar.a("authType", String.valueOf(0));
            O000000o("200010", "无法识别sim卡或没有sim卡", aVar, null);
            return false;
        } else if (oooooo == null) {
            O000000o("102203", "listener不能为空", aVar, null);
            return false;
        } else if (O000000o2.O0000O0o()) {
            O000000o("200082", "服务器繁忙，请稍后重试", aVar, null);
            return false;
        } else {
            if (TextUtils.isEmpty(str == null ? "" : str.trim())) {
                O000000o("102203", "appId 不能为空", aVar, null);
                return false;
            }
            if (TextUtils.isEmpty(str2 == null ? "" : str2.trim())) {
                O000000o("102203", "appkey不能为空", aVar, null);
                return false;
            } else if (O000000o6 == 0) {
                O000000o("102101", "未检测到网络", aVar, null);
                return false;
            } else if ("2".equals(O000000o5) && O000000o2.O00000oo()) {
                O000000o("200082", "服务器繁忙，请稍后重试", aVar, null);
                return false;
            } else if (!"3".equals(O000000o5) || !O000000o2.O00000oO()) {
                return true;
            } else {
                O000000o("200082", "服务器繁忙，请稍后重试", aVar, null);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O00000Oo() {
        String str = riy.MOD + O0OO0Oo.O00000Oo();
        O0O000o.O00000Oo("AuthnHelper", "generate aid = " + str);
        O0O0o00.O000000o("AID", str);
    }

    public void O000000o() {
        try {
            O0O0OO0.O000000o(true, true);
            O0O000o.O00000Oo("AuthnHelper", "删除scrip");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void O000000o(long j) {
        this.O00000o = j;
    }

    public void O000000o(String str, String str2, a aVar, JSONObject jSONObject) {
        final JSONObject O000000o2;
        try {
            String b = aVar.b("traceId");
            if (O0O00o.O000000o(b)) {
                return;
            }
            synchronized (this) {
                final oooOoO O00000o02 = O0O00o.O00000o0(b);
                O0O00o.O00000Oo(b);
                if (O00000o02 == null) {
                    return;
                }
                aVar.a("systemEndTime", SystemClock.elapsedRealtime());
                aVar.a("endtime", O0OO0O.O000000o());
                int c = aVar.c("logintype");
                if (jSONObject == null) {
                    jSONObject = O00O00o0.O000000o(str, str2);
                }
                if (c == 3) {
                    O000000o2 = O00O00o0.O000000o(str, aVar, jSONObject);
                    this.O0000O0o.a();
                } else {
                    O000000o2 = O00O00o0.O000000o(str, str2, aVar, jSONObject);
                }
                O000000o2.put("scripExpiresIn", String.valueOf(O0O0OO0.O000000o()));
                this.O00000oO.post(new Runnable() { // from class: com.mobile.auth.O000o.6
                    @Override // java.lang.Runnable
                    public void run() {
                        O00000o02.O000000o(O000000o2);
                    }
                });
                O000o00.O000000o(this.O00000Oo).O000000o(aVar);
                if (!aVar.b().O0000Oo() && !O0OO0Oo.O000000o(aVar.b())) {
                    O000000o(this.O00000Oo, str, aVar);
                }
                if (!O0O00o.O000000o()) {
                    return;
                }
                O0OO00O.O000000o(new O0OO00O.O000000o() { // from class: com.mobile.auth.O000o.7
                    @Override // com.mobile.auth.O0OO00O.O000000o
                    protected void O000000o() {
                        SystemClock.sleep(10000L);
                        if (O0O00o.O000000o()) {
                            O0OOO00.O000000o(O000o.this.O00000Oo).O00000Oo();
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void O000000o(final String str, final String str2, final oooOoO oooooo) {
        final a O000000o2 = O000000o(oooooo);
        final O000000o o000000o = new O000000o(O000000o2);
        this.O00000oO.postDelayed(o000000o, this.O00000o);
        O0OO00O.O000000o(new O0OO00O.O000000o(this.O00000Oo, O000000o2) { // from class: com.mobile.auth.O000o.2
            @Override // com.mobile.auth.O0OO00O.O000000o
            protected void O000000o() {
                if (O000o.this.O000000o(O000000o2, str, str2, "loginAuth", 1, oooooo)) {
                    O000o.this.O000000o(O000000o2, o000000o);
                }
            }
        });
    }

    public JSONObject O00000Oo(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                boolean O000000o2 = O0OoOo.O000000o(this.O00000Oo);
                O00O00o.O000000o().O000000o(context, O000000o2);
                String O000000o3 = O0O0OOO.O000000o().O000000o(null, O000000o2);
                int O000000o4 = O0OoOo.O000000o(context, O000000o2, new a(1));
                jSONObject.put("operatortype", O000000o3);
                jSONObject.put("networktype", O000000o4 + "");
                O0O000o.O00000Oo("AuthnHelper", "网络类型: " + O000000o4);
                O0O000o.O00000Oo("AuthnHelper", "运营商类型: " + O000000o3);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return jSONObject;
            }
        } catch (Exception unused) {
            jSONObject.put("errorDes", "发生未知错误");
            return jSONObject;
        }
    }

    public void O00000Oo(final String str, final String str2, final oooOoO oooooo) {
        final a O000000o2 = O000000o(oooooo);
        final O000000o o000000o = new O000000o(O000000o2);
        this.O00000oO.postDelayed(o000000o, this.O00000o);
        O0OO00O.O000000o(new O0OO00O.O000000o(this.O00000Oo, O000000o2) { // from class: com.mobile.auth.O000o.3
            @Override // com.mobile.auth.O0OO00O.O000000o
            protected void O000000o() {
                if (O000o.this.O000000o(O000000o2, str, str2, "mobileAuth", 0, oooooo)) {
                    O000o.this.O000000o(O000000o2, o000000o);
                }
            }
        });
    }

    public void O00000o0(final String str, final String str2, final oooOoO oooooo) {
        final a O000000o2 = O000000o(oooooo);
        final O000000o o000000o = new O000000o(O000000o2);
        this.O00000oO.postDelayed(o000000o, this.O00000o);
        O0OO00O.O000000o(new O0OO00O.O000000o(this.O00000Oo, O000000o2) { // from class: com.mobile.auth.O000o.4
            @Override // com.mobile.auth.O0OO00O.O000000o
            protected void O000000o() {
                if (O000o.this.O000000o(O000000o2, str, str2, "preGetMobile", 3, oooooo)) {
                    O000o.this.O0000O0o.a(O000o.this.O00000o);
                    O000o.this.O000000o(O000000o2, o000000o);
                }
            }
        });
    }
}
