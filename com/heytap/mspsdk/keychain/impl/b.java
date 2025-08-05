package com.heytap.mspsdk.keychain.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import tb.cwd;
import tb.cwn;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class b {
    static {
        kge.a(1355228027);
    }

    public static Bundle a(Context context, HashMap<String, String> hashMap) {
        Bundle bundle = new Bundle();
        bundle.putString("sessionId", UUID.randomUUID().toString().replace("-", ""));
        bundle.putString("pkg", context.getPackageName());
        bundle.putSerializable("item", hashMap);
        return bundle;
    }

    public static d a(Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("msp_app_min_versioncode", 2010000);
        bundle.putString("msp_sdk_kit_name", "keychain");
        return (d) cwd.a(new c(context, bundle));
    }

    public static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            cwn.c("DeviceUtils", "getProperty: " + e.getMessage());
            return str2;
        }
    }

    public static <E> String a(List<E> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.ARRAY_START_STR);
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) != null ? list.get(i).toString() : "");
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    public static void a(int i, String str, com.heytap.msp.keychain.a aVar) {
        com.heytap.msp.keychain.b bVar = new com.heytap.msp.keychain.b();
        bVar.f7247a = i;
        bVar.b = str;
        try {
            ((a) aVar).a(bVar);
        } catch (RemoteException e) {
            e.printStackTrace();
            cwn.a("KeyChainImpl", (Throwable) e);
        }
    }
}
