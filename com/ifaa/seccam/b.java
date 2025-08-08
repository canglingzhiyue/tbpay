package com.ifaa.seccam;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.alipay.security.mobile.windvane.SecCamJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.nav.Nav;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.runtimepermission.f;
import org.json.JSONException;
import org.json.JSONObject;
import tb.cyy;
import tb.cyz;
import tb.cza;
import tb.czb;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int d;
    private static Context h;

    /* renamed from: a  reason: collision with root package name */
    public static b f7624a = new b();
    private static final Object b = new Object();
    private static long c = 400;
    private static int e = 0;
    private static int f = 100;
    private static boolean g = false;

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        d = i;
        return i;
    }

    public static /* synthetic */ void a(b bVar, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47ddacb", new Object[]{bVar, str, wVCallBackContext});
        } else {
            bVar.c(str, wVCallBackContext);
        }
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        g = z;
        return z;
    }

    public static /* synthetic */ Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[0]) : b;
    }

    public static /* synthetic */ Context c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c833dc62", new Object[0]) : h;
    }

    public static /* synthetic */ boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : g;
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8564e384", new Object[0]) : f7624a;
    }

    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        JSONObject jSONObject = new JSONObject();
        if ((!Build.MANUFACTURER.equalsIgnoreCase("xiaomi") && !Build.MANUFACTURER.equalsIgnoreCase(l.REDMI_MANUFACTURE_LOWER_CASE)) || Build.VERSION.SDK_INT <= 29 || "off".equals(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_SECCAM_H5_FACE_SWITCH, ""))) {
            try {
                jSONObject.put("isSupportSecCam", "false");
            } catch (JSONException unused) {
                f.a("H5SecFace", "env json exceptiion.");
            }
            return jSONObject.toString();
        }
        d.a(401);
        long j = 0;
        e.a().a(context, new cyy() { // from class: com.ifaa.seccam.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.cyy
            public void a(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    return;
                }
                d.a(i);
                if (i == 400) {
                    d.d(str);
                }
                synchronized (b.b()) {
                    b.b().notifyAll();
                }
            }
        });
        try {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (b) {
                b.wait(c);
                j = System.currentTimeMillis() - currentTimeMillis;
                f.a("AuthenticatorManager", "diff tiem = " + j);
            }
        } catch (Exception e2) {
            f.a("AuthenticatorManager", " lock error = " + e2.toString());
        }
        if (d.d() == 400) {
            JSONObject jSONObject2 = new JSONObject(d.e());
            try {
                jSONObject2.put("isSupportSecCam", "true");
                jSONObject2.put("aidlTime", String.valueOf(j));
                return jSONObject2.toString();
            } catch (Exception unused2) {
                jSONObject = jSONObject2;
                f.a("AuthenticatorManager", " json error");
                return jSONObject.toString();
            }
        }
        jSONObject.put("isSupportSecCam", "false");
        return jSONObject.toString();
    }

    public void a(Context context, final String str, final czb czbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb65bef", new Object[]{this, context, str, czbVar});
            return;
        }
        h = context;
        d.a(false);
        if (!h.a(context)) {
            f.a a2 = com.taobao.runtimepermission.f.a(context, new String[]{com.taobao.speech.util.e.CAMERA});
            a2.a(true);
            a2.b(new Runnable() { // from class: com.ifaa.seccam.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        czbVar.authResult(-4, "permission reject");
                    }
                }
            });
            a2.a(new Runnable() { // from class: com.ifaa.seccam.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.this.a(str, czbVar);
                    }
                }
            });
            a2.a();
            return;
        }
        a(str, czbVar);
    }

    public void a(String str, czb czbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453e9f7", new Object[]{this, str, czbVar});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("bicViewInfo"));
            String string = jSONObject2.getString("regTlv");
            String string2 = jSONObject2.getString("authTlv");
            final String string3 = jSONObject.getString("faceVerifyId");
            final String string4 = jSONObject.getString("homeServer");
            if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2)) {
                d.a(string);
                d.c(string2);
                d.a(czbVar);
                e.a().a(h, Base64.decode(d.a(), 2), new cyz() { // from class: com.ifaa.seccam.b.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.cyz
                    public void a(int i, byte[] bArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("26218da2", new Object[]{this, new Integer(i), bArr});
                        } else if (i != 100) {
                            czb g2 = d.g();
                            g2.authResult(-3, "init failed" + i);
                        } else {
                            d.b(Base64.encodeToString(bArr, 2));
                            d.a(true);
                            f.a("H5SecFace", "init code = " + i);
                            q.a("SecCamJSBridge", (Class<? extends android.taobao.windvane.jsbridge.e>) SecCamJSBridge.class);
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("faceVerifyId", string3);
                                jSONObject3.put("host", string4);
                                String encodeToString = Base64.encodeToString(jSONObject3.toString().getBytes(), 2);
                                Uri.Builder buildUpon = Uri.parse("https://render.alipay.com/p/yuyan/180020010001209190/index.html").buildUpon();
                                buildUpon.appendQueryParameter("clientcfg", encodeToString);
                                buildUpon.appendQueryParameter("_ali_hide_right_", "true");
                                Nav.from(b.c()).toUri(buildUpon.toString());
                            } catch (Exception e2) {
                                e2.toString();
                                d.g().authResult(-1, "");
                            }
                        }
                    }
                });
                return;
            }
            czbVar.authResult(-2, "parameter is null!");
        } catch (JSONException unused) {
            czbVar.authResult(-1, "exception");
        }
    }

    public boolean a(final String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (!d.f()) {
            e.a().a(h, Base64.decode(d.a(), 2), new cyz() { // from class: com.ifaa.seccam.b.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cyz
                public void a(int i, byte[] bArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("26218da2", new Object[]{this, new Integer(i), bArr});
                    } else if (i != 100) {
                        czb g2 = d.g();
                        g2.authResult(-3, "init failed" + i);
                    } else {
                        d.b(Base64.encodeToString(bArr, 2));
                        d.a(true);
                        f.a("H5SecFace", "init code = " + i);
                        b.a(b.this, str, wVCallBackContext);
                    }
                }
            });
        } else {
            c(str, wVCallBackContext);
        }
        return true;
    }

    private void c(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361ab3f1", new Object[]{this, str, wVCallBackContext});
            return;
        }
        final r rVar = new r();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (Integer.valueOf(jSONObject.getString("cameraID")).intValue() != 1) {
                i = 0;
            }
            e = i;
            f = jSONObject.getInt("quality");
            g = false;
            e.a().a(e, new cza() { // from class: com.ifaa.seccam.b.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cza
                public void a(int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i2), new Integer(i3)});
                        return;
                    }
                    if (i2 == 200 && !b.d()) {
                        try {
                            b.a(true);
                            rVar.a("isSuccess", (Object) true);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(ChangeAppIconBridge.KEY_DEVICEMODEL, e.a().c());
                            jSONObject2.put("initTlv", d.b());
                            rVar.a("initRspTlv", jSONObject2.toString().replace("\\/", "/"));
                            wVCallBackContext.success(rVar);
                        } catch (Exception unused) {
                            rVar.a("isSuccess", "false");
                            wVCallBackContext.success(rVar);
                        }
                    }
                    b.a(i3);
                }
            });
        } catch (Exception unused) {
            rVar.a("isSuccess", "false");
            wVCallBackContext.success(rVar);
        }
    }

    public boolean a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca15efa9", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        try {
            byte[] bArr = new byte[512000];
            System.arraycopy(Base64.decode(d.c(), 2), 0, bArr, 0, Base64.decode(d.c(), 2).length);
            c a2 = e.a().a(d, bArr);
            if (a2.a() == 300) {
                String encodeToString = Base64.encodeToString(a2.c(), 2);
                rVar.a("isSuccess", (Object) true);
                rVar.a("image", h.b(h.b(a2.c()), f));
                rVar.a("yuvImage", encodeToString);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, e.a().c());
                jSONObject.put(DataHelper.FP_CHALLENGE_KEY, Base64.encodeToString(a2.d(), 2));
                jSONObject.put("sign", Base64.encodeToString(a2.b(), 2));
                rVar.a(SimpleProfile.KEY_SIGNATURE, jSONObject.toString().replace("\\/", "/"));
            } else {
                rVar.a("isSuccess", (Object) false);
            }
            wVCallBackContext.success(rVar);
        } catch (Exception unused) {
            rVar.a("isSuccess", (Object) false);
            wVCallBackContext.success(rVar);
        }
        return true;
    }

    public boolean b(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efa9f8aa", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        if (e.a().b() == 0) {
            rVar.a("isSuccess", (Object) true);
        } else {
            rVar.a("isSuccess", (Object) false);
        }
        d.a(false);
        if (wVCallBackContext != null) {
            wVCallBackContext.success(rVar);
        }
        return true;
    }

    public boolean b(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c8934", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        b(null);
        r rVar = new r();
        rVar.a("finishH5SecCam", (Object) true);
        wVCallBackContext.success(rVar);
        int i = -1;
        if (str != null) {
            try {
                i = new JSONObject(str).getInt("code");
            } catch (JSONException e2) {
                f.a("H5SecFace", e2.toString());
            }
        }
        if (i == 1000) {
            d.g().authResult(0, str);
        } else if (i == 1003) {
            d.g().authResult(-6, str);
        } else {
            d.g().authResult(-5, str);
        }
        return true;
    }
}
