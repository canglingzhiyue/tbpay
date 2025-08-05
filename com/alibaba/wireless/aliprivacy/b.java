package com.alibaba.wireless.aliprivacy;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.realidentity.g4;
import com.alibaba.wireless.aliprivacy.PrivacyAuthGetParam;
import com.alibaba.wireless.aliprivacy.PrivacyAuthSetParam;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.cfn;
import tb.cfo;
import tb.cfp;
import tb.cfq;
import tb.cft;
import tb.cfu;
import tb.cfy;
import tb.cga;
import tb.cgb;
import tb.cgc;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_CODE_OPEN_AUTH_SETTINGS = 19999;
    public static final String SETTINGS_CONFIG_KEY = "openSettings";
    public static final String STATUS_CONFIG_KEY = "checkStatus";

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f4233a = new HashSet();

    public static void a(Context context, cfn cfnVar, cfo cfoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698e4009", new Object[]{context, cfnVar, cfoVar});
        } else if (cgb.a(context, "context is null") || cgb.a(cfnVar, "configAdapter is null")) {
        } else {
            cfu.a(context, new cft.a(cfnVar).a(cfoVar).a());
            c.a("AliPrivacyCore", "AliPrivacyCore init success");
        }
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        cfu.a(map.get(SETTINGS_CONFIG_KEY));
        cfp.a(map.get("checkStatus"));
    }

    public static void a(Context context, cga cgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7572c133", new Object[]{context, cgaVar});
        } else {
            cfu.a(context, 19999, cgaVar);
        }
    }

    public static AuthStatus a(Activity activity, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthStatus) ipChange.ipc$dispatch("daa9e191", new Object[]{activity, strArr});
        }
        c.a("AliPrivacyCore", "getAuthStatus:" + activity);
        return a(activity, strArr, "activity is null");
    }

    public static AuthStatus a(Context context, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthStatus) ipChange.ipc$dispatch("d41461b7", new Object[]{context, strArr}) : a(context, strArr, "context is null");
    }

    private static AuthStatus a(Context context, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthStatus) ipChange.ipc$dispatch("6e56676d", new Object[]{context, strArr, str});
        }
        if (cgb.a(context, str)) {
            return AuthStatus.UNKNOWN;
        }
        if (strArr == null || strArr.length == 0) {
            return AuthStatus.UNKNOWN;
        }
        c.a("AliPrivacyCore", "permission:" + Arrays.toString(strArr));
        cfq b = cfp.a().b();
        for (String str2 : strArr) {
            AuthStatus a2 = b.a(context, str2);
            if (a2 != AuthStatus.GRANTED) {
                return a2;
            }
        }
        return AuthStatus.GRANTED;
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        d(context);
        return f4233a.contains(str);
    }

    private static synchronized void d(Context context) {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a023673d", new Object[]{context});
            } else if (!f4233a.isEmpty()) {
            } else {
                f4233a.addAll(Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions));
            }
        }
    }

    public static List<PrivacyAuthResult> a(Context context, PrivacyAuthGetParam privacyAuthGetParam, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4b32748e", new Object[]{context, privacyAuthGetParam, str});
        }
        if (privacyAuthGetParam == null || privacyAuthGetParam.getAuthListParams() == null || privacyAuthGetParam.getAuthListParams().isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (PrivacyAuthGetParam.a aVar : privacyAuthGetParam.getAuthListParams()) {
            if (aVar.b() != null && !TextUtils.isEmpty(aVar.a())) {
                PrivacyAuthResult privacyAuthResult = new PrivacyAuthResult();
                privacyAuthResult.setSceneCode(aVar.a());
                privacyAuthResult.setPermissions(a(context, aVar));
                arrayList.add(privacyAuthResult);
            }
        }
        a(context, false, PrivacyCode.SUCCESS, cgb.a(arrayList), str);
        return arrayList;
    }

    private static Map<String, AuthStatus> a(Context context, PrivacyAuthGetParam.a aVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("be34c7a7", new Object[]{context, aVar});
        }
        HashMap hashMap = new HashMap();
        Map<String, Boolean> a2 = a(aVar.a());
        if (a2 == null || a2.isEmpty()) {
            String[] b = aVar.b();
            int length = b.length;
            while (i < length) {
                hashMap.put(b[i], AuthStatus.DEFAULT);
                i++;
            }
            return hashMap;
        }
        String[] b2 = aVar.b();
        int length2 = b2.length;
        while (i < length2) {
            String str = b2[i];
            if (a(context, str)) {
                Boolean bool = a2.get(str);
                if (!a2.containsKey(str) || bool == null) {
                    hashMap.put(str, AuthStatus.DEFAULT);
                } else {
                    hashMap.put(str, bool.booleanValue() ? AuthStatus.GRANTED : AuthStatus.DENIED);
                }
            } else {
                hashMap.put(str, AuthStatus.DENIED);
            }
            i++;
        }
        return hashMap;
    }

    public static PrivacyCode a(Context context, PrivacyAuthSetParam privacyAuthSetParam, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrivacyCode) ipChange.ipc$dispatch("86f432f6", new Object[]{context, privacyAuthSetParam, str});
        }
        if (context == null || privacyAuthSetParam == null || privacyAuthSetParam.getAuthSetParams() == null || privacyAuthSetParam.getAuthSetParams().isEmpty()) {
            a(context, true, PrivacyCode.ERROR_INPUT_PARAMS, cgb.a(privacyAuthSetParam), str);
            return PrivacyCode.ERROR_INPUT_PARAMS;
        }
        for (PrivacyAuthParam privacyAuthParam : privacyAuthSetParam.getAuthSetParams()) {
            if (TextUtils.isEmpty(privacyAuthParam.getSceneCode())) {
                a(context, true, PrivacyCode.ERROR_EMPTY_SCENE_CODE, cgb.a(privacyAuthSetParam), str);
                return PrivacyCode.ERROR_EMPTY_SCENE_CODE;
            }
            Map<String, Boolean> a2 = a(privacyAuthParam.getSceneCode());
            if (a2 == null || a2.isEmpty()) {
                if (!cfy.a().a(privacyAuthParam.getSceneCode(), cgb.a(privacyAuthParam.getPermissions()))) {
                    a(context, true, PrivacyCode.ERROR_WRITE_CACHE, cgb.a(privacyAuthSetParam), str);
                    return PrivacyCode.ERROR_WRITE_CACHE;
                }
            } else {
                Map a3 = cgb.a(a2, privacyAuthParam.getPermissions());
                if (a3 == null) {
                    a(context, true, PrivacyCode.ERROR_EMPTY_PERMISSIONS, cgb.a(privacyAuthSetParam), str);
                    return PrivacyCode.ERROR_EMPTY_PERMISSIONS;
                } else if (!cfy.a().a(privacyAuthParam.getSceneCode(), cgb.a(a3))) {
                    a(context, true, PrivacyCode.ERROR_WRITE_CACHE, cgb.a(privacyAuthSetParam), str);
                    return PrivacyCode.ERROR_WRITE_CACHE;
                }
            }
        }
        a(context, true, PrivacyCode.SUCCESS, cgb.a(privacyAuthSetParam), str);
        return PrivacyCode.SUCCESS;
    }

    public static Map<String, Boolean> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        String b = cfy.a().b(str);
        if (!TextUtils.isEmpty(b)) {
            return cgb.a(b);
        }
        return null;
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            c.a("AliPrivacyCore", "Scene auth data:" + str);
            Map a2 = cgb.a(str);
            if (a2 == null || a2.isEmpty()) {
                return;
            }
            a(context, a2);
        }
    }

    private static void a(Context context, Map<String, JSONArray> map) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else if (map != null && !map.isEmpty()) {
            PrivacyAuthSetParam.a aVar = new PrivacyAuthSetParam.a();
            for (String str : map.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    final String str2 = "android.permission." + str;
                    if (a(context, new String[]{str2}) == AuthStatus.GRANTED && (jSONArray = map.get(str)) != null && !jSONArray.isEmpty()) {
                        for (Object obj : jSONArray.toArray()) {
                            String str3 = (String) obj;
                            List<PrivacyAuthResult> a2 = a(context, new PrivacyAuthGetParam.b().a(str3, new String[]{str2}).a(), g4.a.f3423a);
                            if (a2 != null && !a2.isEmpty()) {
                                for (PrivacyAuthResult privacyAuthResult : a2) {
                                    if (!b(str3, str2) && privacyAuthResult.getPermissions().get(str2) == AuthStatus.DEFAULT) {
                                        aVar.a(str3, new HashMap<String, Boolean>() { // from class: com.alibaba.wireless.aliprivacy.AliPrivacyCore$2
                                            {
                                                put(str2, true);
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    }
                }
            }
            b(map);
            if (aVar.b()) {
                return;
            }
            cgc.b(g4.a.f3423a, cgb.a(aVar.a()), a(context, aVar.a(), g4.a.f3423a).getCode(), e(context));
        }
    }

    private static void b(Map<String, JSONArray> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
            return;
        }
        for (String str : map.keySet()) {
            String str2 = "android.permission." + str;
            JSONArray jSONArray = map.get(str);
            if (jSONArray != null && !jSONArray.isEmpty()) {
                for (Object obj : jSONArray.toArray()) {
                    a((String) obj, str2);
                }
            }
        }
    }

    private static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        String str3 = str + "_" + str2;
        List a2 = a();
        if (a2 == null) {
            a2 = new ArrayList();
        }
        if (a2.contains(str3)) {
            return;
        }
        a2.add(str3);
        cfy.a().c(cgb.a(a2));
    }

    private static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        String str3 = str + "_" + str2;
        List<String> a2 = a();
        if (a2 != null) {
            return a2.contains(str3);
        }
        return false;
    }

    private static List<String> a() {
        List<String> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[0]);
        }
        String e = cfy.a().e();
        if (TextUtils.isEmpty(e) || (b = cgb.b(e)) == null || b.isEmpty()) {
            return null;
        }
        return b;
    }

    private static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ae7544", new Object[]{context});
        }
        String str = null;
        try {
            str = UTDevice.getUtdid(context);
        } catch (Throwable th) {
            c.a("AliPrivacyCore", "getCurrentLoginUserId error", th);
        }
        return TextUtils.isEmpty(str) ? "nonUtdId" : str;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : cfy.a().d();
    }

    public static boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue() : cfy.a().a(z);
    }

    public static String b(Context context) {
        ClipData.Item c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (context != null && (c = c(context)) != null && c.getText() != null) {
            return c.getText().toString();
        }
        return null;
    }

    public static ClipData.Item c(Context context) {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClipData.Item) ipChange.ipc$dispatch("1564ea08", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            if (a(context) && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0) {
                return primaryClip.getItemAt(0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static void a(Context context, boolean z, PrivacyCode privacyCode, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53863781", new Object[]{context, new Boolean(z), privacyCode, str, str2});
        } else if (z) {
            cgc.a(str2, str, privacyCode.getCode(), e(context));
        } else {
            cgc.a(str2, str, e(context));
        }
    }
}
