package com.taobao.android.live.plugin.atype.flexalocal.projectscreen;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.phg;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-12979115);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (phg.a() == null) {
        } else {
            phg.a().a("TaoLiveProjectionEntranceClick", new String[0]);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (phg.a() == null) {
        } else {
            phg.a().a("TaoLiveProjectionScreenStart", new String[0]);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (phg.a() == null) {
        } else {
            c.a().e();
            phg.a().a("TaoLiveProjectionScreenStartSuccess", new String[0]);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (phg.a() == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", c.a().f());
            phg.a().a("TaoLiveProjectionScreenStartEnd", (Map<String, String>) hashMap);
        }
    }
}
