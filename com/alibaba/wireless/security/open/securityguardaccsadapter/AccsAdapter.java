package com.alibaba.wireless.security.open.securityguardaccsadapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.client.GlobalClientInfo;
import tb.kge;

/* loaded from: classes.dex */
public class AccsAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "AccsAdapter";
    public static Context gContext;

    static {
        kge.a(1363024524);
        gContext = null;
    }

    public static void registerListner(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df91c347", new Object[]{context});
        } else if (context == null) {
        } else {
            gContext = context;
            GlobalClientInfo.getInstance(context).registerListener("securityguard_accs_service", (AccsAbstractDataListener) new AccsListner());
            GlobalClientInfo.getInstance(context).registerListener("security-nash-web", (AccsAbstractDataListener) new AccsListnerBshop(gContext));
        }
    }
}
