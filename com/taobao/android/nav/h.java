package com.taobao.android.nav;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f14451a;

    static {
        kge.a(-777008072);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ SharedPreferences b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("811fa7d", new Object[0]) : f14451a;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        f14451a = context.getSharedPreferences("newNav", 0);
        OrangeConfig.getInstance().registerListener(new String[]{"newIntentForUriName"}, new com.taobao.orange.d() { // from class: com.taobao.android.nav.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                } else if (!"newIntentForUriName".equals(str)) {
                } else {
                    h.b().edit().putBoolean("isNewIntentForUriOpen", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("newIntentForUriName", "isNewIntentForUriOpen", "true"))).putBoolean("isSimpleNavOpen", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("newIntentForUriName", "isSimpleNavOpen", "true"))).putBoolean("isSimpleNavRestoreActivityNameOpen", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("newIntentForUriName", "isSimpleNavRestoreActivityNameOpen", "false"))).commit();
                }
            }
        }, false);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = f14451a;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("isNewIntentForUriOpen", true);
        }
        return true;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = f14451a;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("isSimpleNavOpen", true);
        }
        return true;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = f14451a;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("isSimpleNavRestoreActivityNameOpen", false);
        }
        return false;
    }
}
