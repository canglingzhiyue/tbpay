package com.taobao.themis.utils;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.util.TypeUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-372512471);
    }

    public static String a(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("276b312a", new Object[]{bundle, str}) : a(bundle, str, "");
    }

    public static String a(Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("621b4620", new Object[]{bundle, str, str2});
        }
        if (str2 == null) {
            str2 = "";
        }
        if (bundle != null) {
            try {
                if (TextUtils.isEmpty(str) || !bundle.containsKey(str)) {
                    return str2;
                }
                String castToString = TypeUtils.castToString(bundle.get(str));
                if (castToString != null) {
                    return castToString;
                }
            } catch (Exception e) {
                Log.e("TMS:BundleUtils", "get json value exception", e);
            }
        }
        return str2;
    }

    public static boolean a(Bundle bundle, String str, boolean z) {
        Boolean castToBoolean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33c04362", new Object[]{bundle, str, new Boolean(z)})).booleanValue();
        }
        if (bundle != null) {
            try {
                return (!TextUtils.isEmpty(str) && bundle.containsKey(str) && (castToBoolean = TypeUtils.castToBoolean(bundle.get(str))) != null) ? castToBoolean.booleanValue() : z;
            } catch (Exception e) {
                Log.e("TMS:BundleUtils", "get json value exception", e);
            }
        }
        return z;
    }
}
