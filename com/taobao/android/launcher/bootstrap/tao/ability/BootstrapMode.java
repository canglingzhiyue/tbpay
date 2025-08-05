package com.taobao.android.launcher.bootstrap.tao.ability;

import android.content.Context;
import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.UtilityImpl;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.gvk;

/* loaded from: classes.dex */
public class BootstrapMode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ABILITY_COLD_AD = 256;
    public static final int ABILITY_COLD_BOOT_IMAGE = 32;
    public static final int ABILITY_COLD_PRELOAD = 4096;
    public static final int ABILITY_COLD_UCP = 64;
    public static final int ABILITY_ERASE_STATE = 128;
    public static final int ABILITY_FULLY_NEW_INSTALL = 1024;
    public static final int ABILITY_KEEP_ALIVE = 2;
    public static final int ABILITY_MULTI_LANGUAGE = 2048;
    public static final int ABILITY_NG_NEXT_DELEGATE = 512;
    public static final int ABILITY_NG_NEXT_SCHEDULER_BOOTSTRAP = 8;
    public static final int ABILITY_NG_SCHEDULER_BOOTSTRAP = 4;
    public static final int ABILITY_PATCH = 1;
    public static final int ABILITY_PHONE = 16;
    public static final int ABILITY_QOS_SCHEDULE = 8192;
    public static final int ABILITY_STARTUP_CONTEXT_FIX = 16384;
    public static final String EXTRA_KEY_ABILITIES = "abilities";
    public static final String EXTRA_KEY_BIZ_NAME = "__link_module_name__";
    public static final String EXTRA_KEY_COMPONENT = "component";
    public static final String EXTRA_KEY_FULLY_NEW_INSTALL = "fullyNewInstall";
    public static final String EXTRA_KEY_LIFECYCLE_COMPACT = "lifecycleCompact";
    public static final String EXTRA_KEY_MODE = "mode";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface AbilityFlags {
    }

    public static boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{new Integer(i), new Integer(i2)})).booleanValue() : (i & i2) == i2;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            a(context, 0);
        }
    }

    public static void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
            return;
        }
        gvk a2 = gvk.a(android.taobao.safemode.h.a().c());
        gvk.e(a2);
        if (!com.taobao.android.autosize.l.b(context) && !com.taobao.android.autosize.l.d(context)) {
            z = false;
        }
        com.taobao.android.launcher.bootstrap.tao.h.b("BootstrapMode", "is current device type tablet or fold ? " + z);
        if (!z) {
            a2.b.putExtra(EXTRA_KEY_ABILITIES, i | 16);
        } else {
            a2.b.putExtra(EXTRA_KEY_ABILITIES, i);
        }
    }

    public static void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{new Integer(i), str});
        } else {
            a(i, null, str, 0);
        }
    }

    public static void a(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34dafe", new Object[]{new Integer(i), str, new Integer(i2)});
        } else {
            a(i, null, str, i2);
        }
    }

    public static void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8114572f", new Object[]{new Integer(i), str, str2});
        } else {
            a(i, str, str2, 0);
        }
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        gvk a2 = gvk.a();
        if (a2 != null && a2.b != null) {
            return a2.b.getIntExtra(EXTRA_KEY_ABILITIES, 0);
        }
        return 0;
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        gvk a2 = gvk.a();
        if (a2 == null || a2.b == null) {
            return;
        }
        a2.b.putExtra(EXTRA_KEY_ABILITIES, i | a2.b.getIntExtra(EXTRA_KEY_ABILITIES, 0));
    }

    public static boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{new Integer(i)})).booleanValue();
        }
        gvk a2 = gvk.a();
        return (a2 == null || a2.b == null || (a2.b.getIntExtra(EXTRA_KEY_ABILITIES, 0) & i) != i) ? false : true;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b(16);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : b(4);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : b(8);
    }

    public static void a(int i, String str, String str2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17701b4", new Object[]{new Integer(i), str, str2, new Integer(i2)});
            return;
        }
        gvk a2 = gvk.a();
        if (a2 == null || a2.b == null) {
            return;
        }
        com.taobao.android.launcher.bootstrap.tao.h.b("BootstrapMode", "updateMode, mode=" + i + ", component=" + str2 + ", abilities=" + i2);
        a2.b.putExtra("mode", i).putExtra("component", str2).putExtra("__link_module_name__", str).putExtra(EXTRA_KEY_ABILITIES, i2);
    }

    public static SparseIntArray a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseIntArray) ipChange.ipc$dispatch("d9bff524", new Object[]{context, str});
        }
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -968594951) {
            if (hashCode == 1698916439 && str.equals("com.taobao.update.datasource.accs.AccsIpService")) {
                c = 1;
            }
        } else if (str.equals("com.taobao.adaemon.TriggerService")) {
            c = 0;
        }
        if (c == 0) {
            sparseIntArray.put(0, UtilityImpl.isAppKeepAlive(context) ? 1 : 0);
            sparseIntArray.put(1, 2);
        } else if (c == 1) {
            sparseIntArray.put(0, 1);
            sparseIntArray.put(1, 1);
        } else {
            sparseIntArray.put(0, 0);
            sparseIntArray.put(1, 0);
        }
        return sparseIntArray;
    }
}
