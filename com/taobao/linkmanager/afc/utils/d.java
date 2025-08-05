package com.taobao.linkmanager.afc.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-648780956);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            return ABGlobal.a(Globals.getApplication(), "taobao", "tbspeed", "linkInOrder");
        } catch (Exception unused) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "GlobalAbUtil === linkInOrder === error");
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            return ABGlobal.a(Globals.getApplication(), "taobao", "tbspeed", "afcPreFetch");
        } catch (Exception unused) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "GlobalAbUtil === afcPreFetchAB === error");
            return false;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            return ABGlobal.a(Globals.getApplication(), "taobao", "tbspeed", "afcPreFetch2");
        } catch (Exception unused) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "GlobalAbUtil === afcPreFetch2AB === error");
            return false;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        try {
            return ABGlobal.a(Globals.getApplication(), "taobao", "tbspeed", "link_launch_opt");
        } catch (Exception unused) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "GlobalAbUtil === link_launch_opt === error");
            return false;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        try {
            boolean a2 = ABGlobal.a(Globals.getApplication(), "taobao", "tbspeed", "link_afc_id_opt_off");
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "GlobalAbUtil === link_afc_id_opt_off === " + a2);
            return !a2;
        } catch (Exception unused) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "GlobalAbUtil === link_afc_id_opt_off === error");
            return true;
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        try {
            boolean a2 = ABGlobal.a(Globals.getApplication(), "taobao", "tbspeed", "link_ut_sync_opt_off");
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "GlobalAbUtil === link_ut_sync_opt_off === " + a2);
            return !a2;
        } catch (Exception unused) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "GlobalAbUtil === link_ut_sync_opt_off === error");
            return false;
        }
    }
}
