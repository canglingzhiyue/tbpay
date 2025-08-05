package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.alibaba.ability.impl.user.UserAbility;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.g;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class oea {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static JSONObject f31967a;
    private static Context b;

    static {
        kge.a(-1569076508);
    }

    public static Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[0]) : b;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        if (b == null && context != null) {
            b = context.getApplicationContext();
        }
        JSONObject jSONObject = f31967a;
        if (jSONObject != null) {
            a(context, null, jSONObject);
            return;
        }
        f31967a = new JSONObject();
        b(context, f31967a);
        d(context, f31967a);
        c(context, f31967a);
        e(context, f31967a);
        f(context, f31967a);
    }

    public static JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[0]) : f31967a;
    }

    public static JSONObject b(Context context) {
        Activity a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ecf0ff1f", new Object[]{context});
        }
        if ((context instanceof Application) && a.a().b() != null && (a2 = a.a().b().a()) != null) {
            context = a2;
        }
        JSONObject jSONObject = new JSONObject();
        b(context, jSONObject);
        d(context, jSONObject);
        c(context, jSONObject);
        e(context, jSONObject);
        f(context, jSONObject);
        a(context, jSONObject);
        return jSONObject;
    }

    private static void a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb9ea60", new Object[]{context, jSONObject, jSONObject2});
        } else if (jSONObject2 == null) {
        } else {
            if (jSONObject == null) {
                jSONObject = jSONObject2.getJSONObject(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE);
            }
            if (a.a().w() == null) {
                return;
            }
            try {
                jSONObject.put("deviceInfo", (Object) a.a().w().a(context));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void b(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104666d1", new Object[]{context, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", (Object) "TNodeEngine");
            jSONObject2.put("version", (Object) "2.1.2");
            jSONObject.put("engine", (Object) jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("model", (Object) Build.MODEL);
            jSONObject3.put("name", (Object) Build.PRODUCT);
            jSONObject3.put(g4.a.f3423a, (Object) Integer.valueOf(Build.VERSION.SDK_INT));
            jSONObject3.put("brand", (Object) Build.BRAND);
            jSONObject3.put("os", (Object) "Android");
            jSONObject3.put("uuid", (Object) Build.SERIAL);
            jSONObject3.put("version", (Object) Build.VERSION.RELEASE);
            jSONObject.put("system", (Object) jSONObject3);
        } catch (Exception e) {
            ogg.b("setupSystemEngineEnv:" + e.getMessage());
        }
    }

    private static JSONObject c(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4ad3ce32", new Object[]{context, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            int b2 = ohd.b(context);
            int g = ohd.g(context);
            jSONObject2.put("isX", (Object) "false");
            jSONObject2.put("resolutionW", (Object) Integer.valueOf(b2));
            jSONObject2.put("resolutionH", (Object) Integer.valueOf(g));
            jSONObject2.put("width", (Object) Integer.valueOf(b2));
            jSONObject2.put("height", (Object) Integer.valueOf(g));
            jSONObject2.put("statusBarH", (Object) (ohd.e(context, ohd.h(context)) + "wx"));
            jSONObject2.put("statusBarHeight", (Object) Integer.valueOf(ohd.b(context, (float) ohd.h(context))));
            jSONObject2.put("density", (Object) Float.valueOf(ohd.c(context)));
            jSONObject2.put("stableDensity", (Object) Float.valueOf(ohd.n(context)));
            IDeviceInfo w = a.a().w();
            if (w != null) {
                jSONObject2.put("pad", (Object) Boolean.valueOf(w.f()));
                jSONObject2.put("isLandscape", (Object) Boolean.valueOf(w.e()));
                jSONObject2.put("isFoldDevice", (Object) Boolean.valueOf(w.c()));
                jSONObject2.put("tnodescale", (Object) Float.valueOf((ohd.c(context) * w.b(context)) / 2.0f));
            }
            jSONObject.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, (Object) jSONObject2);
            a(context, jSONObject2, jSONObject);
        } catch (Exception e) {
            ogg.b("setupDeviceEnv:" + e.getMessage());
        }
        return jSONObject2;
    }

    private static void d(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7656f53", new Object[]{context, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", (Object) (context.getApplicationInfo().labelRes == 0 ? "taobao" : context.getString(context.getApplicationInfo().labelRes)));
            jSONObject2.put("schema", (Object) context.getPackageName());
            try {
                jSONObject2.put("version", (Object) context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            jSONObject2.put("debug", (Object) Boolean.valueOf(oec.e(context)));
            jSONObject2.put("env", (Object) c());
            jSONObject.put("app", (Object) jSONObject2);
        } catch (Exception e3) {
            ogg.b("setupAppEnv:" + e3.getMessage());
        }
    }

    private static Map c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        try {
            ILogin g = a.a().g();
            if (g != null) {
                HashMap hashMap2 = new HashMap();
                hashMap.put("user", hashMap2);
                boolean b2 = g.b();
                hashMap2.put(UserAbility.API_IS_LOGIN, Boolean.valueOf(b2));
                if (b2) {
                    ILogin.a a2 = g.a();
                    hashMap2.put("uId", a2.f19967a);
                    hashMap2.put("nick", a2.b);
                    hashMap2.put("userLogo", a2.c);
                }
            }
            IFestival d = a.a().d();
            if (d != null) {
                hashMap.put("festival", d.a().toMap());
            }
        } catch (Throwable th) {
            ogg.b("getAppEnv:" + th.getMessage());
        }
        return hashMap;
    }

    private static void e(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf4f394", new Object[]{context, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            g x = a.a().x();
            jSONObject2.put("name", (Object) (oeb.cy() ? x.c(context) : x.a(context) ? "dark" : ""));
            jSONObject2.put(nto.IN_SHOP_ELDER_HIT_VALUE, (Object) Boolean.valueOf(a.a().z().a()));
            jSONObject2.put("versionCode", (Object) a.a().z().b());
            jSONObject.put("theme", (Object) jSONObject2);
        } catch (Exception e) {
            ogg.b("setupThemeEnv:" + e.getMessage());
        }
    }

    private static void f(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8477d5", new Object[]{context, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tdiffer", (Object) Boolean.valueOf(oeb.a("enabledTDiffer3", true)));
            jSONObject2.put("dataformat", (Object) Boolean.valueOf(oeb.a("enabledDataFormat", true)));
            jSONObject2.put("eventversion", (Object) Integer.valueOf(oeb.a("eventVersion", 0)));
            jSONObject2.put("enableExpandableView", (Object) Boolean.valueOf(oeb.f()));
            jSONObject.put("config", (Object) jSONObject2);
        } catch (Exception e) {
            ogg.b("setupConfigEnv:" + e.getMessage());
        }
    }

    public static void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{context, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE);
        if (jSONObject2 == null) {
            jSONObject2 = c(context, jSONObject);
        }
        try {
            int c = c(context);
            jSONObject2.put("navigationH", (Object) Integer.valueOf(c));
            jSONObject2.put("navigationHeight", (Object) Integer.valueOf(c));
        } catch (Exception e) {
            ogg.b("updateNavigationH:" + e.getMessage());
        }
    }

    private static int c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue() : ohd.b(context, ohd.h(context) + ohd.i(context));
    }

    public static int[] a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4a78765c", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE);
            return new int[]{oec.a(jSONObject2.get("width"), 0), oec.a(jSONObject2.get("height"), 0)};
        }
        return new int[]{0, 0};
    }
}
