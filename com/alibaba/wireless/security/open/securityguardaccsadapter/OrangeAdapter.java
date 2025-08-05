package com.alibaba.wireless.security.open.securityguardaccsadapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes.dex */
public class OrangeAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    public static final String SECURITYGUARD_ORANGE_NAMESPACE = "securityguard_orange_namespace";
    private static final String TAG = "OrangeAdapter";
    public static Context gContext;
    private static String[] mNameSpaces;

    static {
        kge.a(1094550832);
        gContext = null;
        mNameSpaces = new String[]{SECURITYGUARD_ORANGE_NAMESPACE};
    }

    public static void setOrangeNameSpaces(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9080850", new Object[]{strArr});
        } else {
            mNameSpaces = strArr;
        }
    }

    public static void registerListener(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02aa00a", new Object[]{context});
            return;
        }
        gContext = context;
        OrangeConfig.getInstance().registerListener(mNameSpaces, new OrangeListener(), true);
    }
}
