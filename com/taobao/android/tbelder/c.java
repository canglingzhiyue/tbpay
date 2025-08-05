package com.taobao.android.tbelder;

import android.app.Application;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.Globals;
import java.util.Map;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP_NAME = "TBElder";
    public static final String KEY_AB_SWITCH_NAME = "TBElderABSwitch";
    public static final String KEY_SWITCH_NAME = "TBElderSwitch";
    public static final String TAG = "TBElderSwitcher";

    public static boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (!z) {
            return a(KEY_SWITCH_NAME, true);
        }
        return b(KEY_SWITCH_NAME, true);
    }

    public static boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (!z) {
            return a(KEY_AB_SWITCH_NAME, true);
        }
        return b(KEY_AB_SWITCH_NAME, true);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"TBElder"}, new d() { // from class: com.taobao.android.tbelder.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    c.a(c.KEY_SWITCH_NAME);
                    c.a(c.KEY_AB_SWITCH_NAME);
                }
            }, true);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        boolean a2 = a(str, true);
        Application application = Globals.getApplication();
        if (application == null) {
            return;
        }
        SharedPreferences.Editor edit = application.getSharedPreferences("TBElder", 0).edit();
        edit.putBoolean(str, a2);
        edit.apply();
    }

    private static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : Boolean.TRUE.toString().equals(OrangeConfig.getInstance().getConfig("TBElder", str, String.valueOf(z)));
    }

    private static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{str, new Boolean(z)})).booleanValue() : Globals.getApplication() == null ? z : Globals.getApplication().getSharedPreferences("TBElder", 0).getBoolean(str, z);
    }
}
