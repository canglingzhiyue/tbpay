package com.taobao.android.editionswitcher;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EDITION_CODE_OLD = "OLD";

    static {
        kge.a(68373930);
    }

    public static void a(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfab7d", new Object[]{str, str2, str3, new Integer(i)});
        } else if ("OLD".equals(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str2, str3);
            TBRevisionSwitchManager.i().a(hashMap, false, i);
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str2, "0");
            TBRevisionSwitchManager.i().a(hashMap2, false, i);
        }
    }
}
