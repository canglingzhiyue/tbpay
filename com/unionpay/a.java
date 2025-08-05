package com.unionpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.unionpay.utils.UPUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.rnm;

/* loaded from: classes9.dex */
public class a {
    private static String A = null;
    private static String B = null;
    private static String C = null;
    private static String D = null;
    private static String E = "";
    private static String F = "";
    private static String G = "";
    private static String H = "";
    private static boolean I = false;
    private static int J = 10;
    private static WeakReference K = null;
    private static String L = "";
    private static String M = null;
    private static String N = null;
    private static String O = "";
    private static String P = "";
    private static boolean Q = false;
    private static String R = "";
    private static int S = 0;
    public static final String SDK_TYPE = "02";
    private static boolean T = false;
    private static boolean U = false;
    private static rnm V = null;
    public static final String VERSION = "3.5.15";
    private static Handler W = null;
    private static String X = "[{\"package_info\":[{\"schema\":\"com.unionpay\",\"sign\":\"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\":101,\"version\":\".*\"}],\"sort\":100,\"type\":\"app\"}]";
    private static String Y = "[{\"package_info\":[{\"schema\":\"com.unionpay\",\"sign\":\"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\":101,\"version\":\".*\"}],\"sort\":100,\"type\":\"app\"}]";
    private static String Z = "[{\"package_info\": [{\"schema\": \"com.unionpay.tsmservice\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 102,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[2-9].*|^01\\\\.00\\\\.1[012789].*|^01\\\\.00\\\\.0[8-9].*\"},{\"schema\": \"com.unionpay.tsmservice.mi\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 103,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[1-9].*|^01\\\\.00\\\\.0[8-9].*\"}],\"sort\": 100,\"type\": \"app\"}]";

    /* renamed from: a  reason: collision with root package name */
    private static String f24014a = "SpId";
    private static String aa = "[{\"package_info\": [{\"schema\": \"com.huawei.wallet\",\"sign\": \"9095F915D6C143A41CE029209AFECB87AB481DDD\",\"sort\": 101,\"version\": \"([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\"},{\"schema\": \"com.huawei.wallet\",\"sign\": \"059e2480adf8c1c5b3d9ec007645ccfc442a23c5\",\"sort\": 102,\"version\": \"([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\"},{\"schema\": \"com.unionpay.tsmservice\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 103,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[2-9].*|^01\\\\.00\\\\.1[012789].*|^01\\\\.00\\\\.0[8-9].*\"},{\"schema\": \"com.unionpay.tsmservice.mi\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 104,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[1-9].*|^01\\\\.00\\\\.0[8-9].*\"}],\"sort\": 100,\"type\": \"app\"}]";
    private static JSONArray ab = null;
    private static final Handler.Callback ac = new b();
    private static String b = "paydata";
    private static String c = "pay_tn";
    private static String d = "SysProvide";
    private static String e = "UseTestMode";
    private static String f = "SecurityChipType";
    private static String g = "uppayuri";
    private static String h = "resultIntentAction";
    private static String i = "reqOriginalId";
    private static String j = "wapurl";
    private static String k = "actionType";
    private static String l = "dlgstyle";
    private static String m = "com.unionpay.uppay";
    private static String n = "com.unionpay.uppay.PayActivity";
    private static String o = "com.huawei.wallet";
    private static String p = "com.huawei.wallet.action.onlinepay.startpay";
    private static String q = "ex_mode";
    private static String r = "server";
    private static String s = "source";
    private static String t = "samsung_out";
    private static String u = "se_type";
    private static String v = "se_title_logo";
    private static String w = "se_loading_logo";
    private static String x = "se_title_bg_color";
    private static String y = "se_cancel_bg_color";
    private static String z = "02";

    public static int a(Context context, String str, String str2, String str3, String str4) {
        return a(context, str, str2, str3, str4, "", "");
    }

    private static int a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        K = new WeakReference(context);
        L = str3;
        M = str;
        N = str2;
        O = str4;
        G = str6;
        F = str5;
        H = TextUtils.isEmpty(str6) ? "0" : "1";
        A = null;
        B = null;
        C = null;
        E = str6;
        p();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context) {
        return a(context, true, "0");
    }

    private static String a(Context context, int i2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", "1.5");
            jSONObject.put("os_name", "android");
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("tn", UPUtils.b(i2, com.unionpay.utils.b.b(str)));
            }
            try {
                jSONObject.put("terminal_version", VERSION);
                jSONObject.put("os_version", com.unionpay.utils.e.a());
                jSONObject.put("device_model", com.unionpay.utils.e.b());
                jSONObject.put("app_version", com.unionpay.utils.b.d(context, str2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("package_name", str2);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return jSONObject.toString();
    }

    private static String a(Context context, boolean z2, String str) {
        return b(context, O, z2 ? null : L, z2 ? "0" : null, str, H, E);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
    }

    public static void a(Context context, String str, String str2, e eVar) {
        if (eVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "00";
        }
        try {
            System.loadLibrary("entryexpro");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        h hVar = new h(eVar, context != null ? context.getApplicationContext() : null, str, str2);
        try {
            hVar.a();
        } catch (Throwable unused) {
            hVar.a((ArrayList) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(Context context, JSONArray jSONArray, int i2) {
        String str;
        while (jSONArray != null && i2 < jSONArray.length()) {
            Object a2 = com.unionpay.utils.i.a(jSONArray, i2);
            if (a2 == null) {
                return;
            }
            JSONObject jSONObject = (JSONObject) a2;
            String a3 = com.unionpay.utils.i.a(jSONObject, "type");
            if ("app".equals(a3)) {
                JSONArray b2 = com.unionpay.utils.i.b(jSONObject, "package_info");
                String a4 = com.unionpay.utils.i.a(jSONObject, "app_server");
                JSONArray b3 = b(b2, "sort");
                boolean z2 = false;
                if (b3.length() > 0) {
                    int length = b3.length();
                    int i3 = 0;
                    boolean z3 = false;
                    while (true) {
                        if (i3 >= length) {
                            z2 = z3;
                            break;
                        }
                        Object a5 = com.unionpay.utils.i.a(b3, i3);
                        if (a5 != null) {
                            JSONObject jSONObject2 = (JSONObject) a5;
                            String a6 = com.unionpay.utils.i.a(jSONObject2, "schema");
                            String a7 = com.unionpay.utils.i.a(jSONObject2, "sign");
                            String a8 = com.unionpay.utils.i.a(jSONObject2, "version");
                            if (com.unionpay.utils.b.a(context, a6) && a7.equalsIgnoreCase(com.unionpay.utils.b.c(context, a6)) && com.unionpay.utils.b.d(context, a6).matches(a8)) {
                                try {
                                    Bundle bundle = new Bundle();
                                    a(L, bundle, O);
                                    bundle.putString(f24014a, M);
                                    bundle.putString(d, N);
                                    bundle.putString(b, L);
                                    bundle.putString(s, F);
                                    bundle.putString(u, G);
                                    if (!TextUtils.isEmpty(G)) {
                                        bundle.putString(v, A);
                                        bundle.putString(w, B);
                                        bundle.putString(x, C);
                                        bundle.putString(y, D);
                                    }
                                    bundle.putBoolean(l, I);
                                    bundle.putString(r, a4);
                                    bundle.putString(f, null);
                                    bundle.putInt(i, 0);
                                    Intent intent = new Intent();
                                    intent.putExtras(bundle);
                                    if (o.equals(a6)) {
                                        intent.setAction(p);
                                        intent.setPackage(a6);
                                    } else {
                                        intent.setClassName(a6, n);
                                    }
                                    Context q2 = q();
                                    if (q2 != null) {
                                        if (q2 instanceof Activity) {
                                            ((Activity) q2).startActivityForResult(intent, J);
                                        } else {
                                            intent.addFlags(268435456);
                                            q2.startActivity(intent);
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                }
                                try {
                                    int a9 = com.unionpay.utils.b.a(O);
                                    String b4 = UPUtils.b(a9);
                                    com.unionpay.utils.j.a("uppay", "calling app url: " + b4);
                                    V = new rnm(b4, (byte) 0);
                                    V.a(a(q(), a9, L, a6));
                                    Executors.newSingleThreadExecutor().execute(new f());
                                    z2 = true;
                                    break;
                                } catch (Exception e3) {
                                    e = e3;
                                    z3 = true;
                                    e.printStackTrace();
                                    i3++;
                                }
                            }
                        }
                        i3++;
                    }
                }
                if (z2) {
                    return;
                }
            } else {
                String str2 = "";
                if ("wap".equals(a3)) {
                    if (!t.equals(F)) {
                        try {
                            str = (String) jSONObject.get("url");
                        } catch (Exception unused) {
                            str = str2;
                        }
                        a(str, "wap");
                        return;
                    }
                } else if ("link".equals(a3)) {
                    try {
                        str2 = jSONObject.getString("url");
                    } catch (Exception unused2) {
                    }
                    a(str2, "link");
                    return;
                } else if ("wcd".equals(a3)) {
                    try {
                        str2 = jSONObject.getString("url");
                    } catch (Exception unused3) {
                    }
                    a(str2, "wcd");
                    return;
                } else {
                    context = q();
                }
            }
            jSONArray = ab;
            i2 = S + 1;
            S = i2;
        }
    }

    private static void a(String str, Bundle bundle, String str2) {
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        if (str.trim().charAt(0) != '<') {
            bundle.putString(q, str2);
        } else if (str2 == null || !str2.trim().equalsIgnoreCase("00")) {
            bundle.putBoolean(e, true);
        } else {
            bundle.putBoolean(e, false);
        }
    }

    private static void a(String str, String str2) {
        Bundle bundle = new Bundle();
        if (!"link".equals(str2)) {
            a(L, bundle, O);
            bundle.putString(f24014a, M);
            bundle.putString(d, N);
            int i2 = 0;
            try {
                i2 = Integer.parseInt(O);
            } catch (Exception unused) {
            }
            if ("wcd".equals(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("os", "android");
                    jSONObject.put("tn", L);
                    bundle.putString(b, UPUtils.b(i2, com.unionpay.utils.b.b(jSONObject.toString())));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                bundle.putString(b, UPUtils.b(i2, com.unionpay.utils.b.b(L)));
            }
            bundle.putString(c, L);
        }
        bundle.putString("magic_data", "949A1CC");
        bundle.putString(j, str);
        bundle.putString(k, str2);
        try {
            Context q2 = q();
            if (q2 == null) {
                return;
            }
            Intent intent = new Intent();
            intent.putExtras(bundle);
            intent.setClass(q2, UPPayWapActivity.class);
            if (q2 instanceof Activity) {
                ((Activity) q2).startActivityForResult(intent, J);
                return;
            }
            intent.addFlags(268435456);
            q2.startActivity(intent);
        } catch (Exception unused2) {
        }
    }

    private static String b(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        int i2;
        Resources resources;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", "1.5");
            jSONObject.put("sdkVerMode", "02");
            jSONObject.put("os_name", "android");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("tn", UPUtils.b(com.unionpay.utils.b.a(str), com.unionpay.utils.b.b(str2)));
            }
            jSONObject.put("appUuId", com.unionpay.utils.e.b(context));
            try {
                jSONObject.put("locale", Locale.getDefault().toString().startsWith("zh") ? "zh_CN" : "en_US");
                jSONObject.put("terminal_version", VERSION);
                int i3 = 0;
                if (context == null || (resources = context.getResources()) == null) {
                    i2 = 0;
                } else {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    int i4 = displayMetrics.widthPixels;
                    i2 = displayMetrics.heightPixels;
                    i3 = i4;
                }
                jSONObject.put("terminal_resolution", (i3 + "*" + i2).trim());
                jSONObject.put("os_version", com.unionpay.utils.e.a());
                jSONObject.put("device_model", com.unionpay.utils.e.b());
                jSONObject.put("root", new File("/system/bin/su").exists() ? "1" : "0");
                jSONObject.put("country", com.unionpay.utils.b.d(Locale.getDefault().getCountry()));
                jSONObject.put("package", com.unionpay.utils.b.d(com.unionpay.utils.e.a(context)));
                jSONObject.put("sign", com.unionpay.utils.e.a(context, com.unionpay.utils.b.d(com.unionpay.utils.e.a(context)), "SHA256"));
                String str7 = Build.MANUFACTURER;
                if (!TextUtils.isEmpty(str7)) {
                    str7 = str7.toUpperCase();
                }
                jSONObject.put("phone_model", str7);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            jSONObject.put("vendorCapacity", str4);
            if (!TextUtils.isEmpty(null)) {
                jSONObject.put("randKey", UPUtils.b(com.unionpay.utils.b.a(str), com.unionpay.utils.b.b(null)));
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("has_sdk", str3);
            }
            if (!TextUtils.isEmpty(null)) {
                jSONObject.put("merId", (Object) null);
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("isLimitSe", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put("seType", com.unionpay.utils.b.c(str6));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONArray b(JSONArray jSONArray, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; jSONArray != null && i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.optJSONObject(i2));
        }
        Collections.sort(arrayList, new g(str));
        JSONArray jSONArray2 = new JSONArray();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            jSONArray2.put((JSONObject) arrayList.get(i3));
        }
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        int i2;
        try {
            i2 = Integer.parseInt(O);
        } catch (Exception unused) {
            i2 = 0;
        }
        String a2 = UPUtils.a(i2);
        com.unionpay.utils.j.a("uppay", "url: " + a2);
        V = new rnm(a2, (byte) 0);
        V.a(a(q(), false, str));
        if (W == null) {
            W = new Handler(ac);
        }
        Executors.newSingleThreadExecutor().execute(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            A = jSONObject.getString("titleLogo");
            B = jSONObject.getString("loadingLogo");
            C = jSONObject.getString("backGroundColor");
            D = jSONObject.getString("textColor");
        } catch (Exception unused) {
        }
    }

    private static int p() {
        int i2;
        WeakReference weakReference = K;
        if (weakReference == null || weakReference.get() == null) {
            return 1;
        }
        if (!TextUtils.isEmpty(F) || !TextUtils.isEmpty(G)) {
            I = true;
            if (z.equalsIgnoreCase(G)) {
                F = t;
            }
        } else {
            I = false;
        }
        S = 0;
        T = false;
        U = false;
        try {
            System.loadLibrary("entryexpro");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Context q2 = q();
        String a2 = UPUtils.a(q2, "configs" + G);
        Context q3 = q();
        String a3 = UPUtils.a(q3, "mode" + G);
        Context q4 = q();
        String a4 = UPUtils.a(q4, "or" + G);
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4)) {
            try {
                JSONObject jSONObject = new JSONObject(a2);
                String a5 = com.unionpay.utils.i.a(jSONObject, "sign");
                try {
                    i2 = Integer.parseInt(a3);
                } catch (Exception unused) {
                    i2 = 0;
                }
                String str = new String(Base64.decode(jSONObject.getString("configs"), 2));
                String str2 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : "";
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
                String b2 = com.unionpay.utils.b.b(UPUtils.a(str + str2 + a4));
                String a6 = UPUtils.a(i2, a5);
                if (!TextUtils.isEmpty(a6) && a6.equals(b2)) {
                    if (TextUtils.isEmpty(G)) {
                        X = str;
                    } else if ("04".equals(G)) {
                        aa = str;
                    } else {
                        Z = str;
                    }
                    if (!TextUtils.isEmpty(E)) {
                        Context q5 = q();
                        String a7 = UPUtils.a(q5, "se_configs" + E);
                        if (!TextUtils.isEmpty(a7)) {
                            d(a7);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        try {
            ab = TextUtils.isEmpty(G) ? b(new JSONArray(X), "sort") : "04".equals(G) ? b(new JSONArray(aa), "sort") : b(new JSONArray(Z), "sort");
        } catch (Exception unused3) {
        }
        W = new Handler(ac);
        if (TextUtils.isEmpty(G) || !com.unionpay.utils.b.a()) {
            c("0");
        } else {
            com.huawei.nfc.sdk.service.a aVar = new com.huawei.nfc.sdk.service.a(q());
            W.sendEmptyMessageDelayed(1004, 1000L);
            aVar.a("UNIONONLINEPAY", new d());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context q() {
        WeakReference weakReference = K;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }
}
