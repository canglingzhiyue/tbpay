package com.taobao.android.launcher.bootstrap.tao.ability;

import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_LINK_COLD_START = "__link_cold_start__";
    public static final String EXTRA_LINK_HOT_START = "__link_hot_start__";
    public static final String EXTRA_LINK_MODULE_NAME = "__link_module_name__";

    public static String a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{intent});
        }
        if (intent != null) {
            return intent.getStringExtra("__link_module_name__");
        }
        return null;
    }

    public static String b(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b2374ba", new Object[]{intent}) : a(intent, false);
    }

    public static String a(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("270f2131", new Object[]{intent, new Boolean(z)});
        }
        if (intent == null || intent.getData() == null) {
            return null;
        }
        if (!z) {
            if (!com.taobao.flowcustoms.afc.a.a(intent)) {
                return null;
            }
            if (!intent.getBooleanExtra("afc_nav_merge", false) && !intent.getBooleanExtra("afc_nav_native", false)) {
                return null;
            }
        }
        if (com.taobao.linkmanager.afc.utils.e.a(intent.getData())) {
            return intent.getData().getQueryParameter("h5Url");
        }
        return null;
    }

    public static boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa3052b", new Object[]{intent})).booleanValue();
        }
        if (intent != null) {
            return a(intent.getExtras());
        }
        return false;
    }

    public static boolean a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b668f70", new Object[]{bundle})).booleanValue();
        }
        if (bundle == null) {
            return false;
        }
        try {
            if (!bundle.getBoolean("afc_nav_merge", false)) {
                if (!bundle.getBoolean("afc_nav_native", false)) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            com.taobao.android.launcher.bootstrap.tao.h.b("LinkContext", "error occurred when isAfcContextCallback: " + e.getMessage());
            return false;
        }
    }

    public static boolean d(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53f2e9ac", new Object[]{intent})).booleanValue() : com.taobao.flowcustoms.afc.a.a(intent);
    }
}
