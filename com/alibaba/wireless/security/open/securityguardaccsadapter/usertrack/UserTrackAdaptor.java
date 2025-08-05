package com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.module.plugin.d;
import tb.kge;

/* loaded from: classes3.dex */
public class UserTrackAdaptor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "UserTrackAdaptor";

    static {
        kge.a(1304673893);
    }

    public static void registerListener(IUserTrackPlugin iUserTrackPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669b46c3", new Object[]{iUserTrackPlugin});
        } else if (iUserTrackPlugin == null) {
        } else {
            d.getInstance().registerPlugin(new UserTrackPlugin(iUserTrackPlugin));
        }
    }
}
