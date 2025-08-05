package com.alibaba.wireless.security.open.securityguardaccsadapter;

import android.content.Context;
import android.taobao.windvane.extra.uc.AliNetworkAdapter;
import com.alibaba.wireless.security.open.securityguardaccsadapter.WindvaneListener;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class WindvaneAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "WindvaneAdapter";
    public static Context gContext;

    static {
        kge.a(1134050932);
        gContext = null;
    }

    public static void registerWindVaneListener(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98667b60", new Object[]{context});
            return;
        }
        WindvaneListener.WLOG.d("start registerWindVaneListener");
        gContext = context;
        AliNetworkAdapter.addHttpRequestCallback(new WindvaneListener());
    }
}
