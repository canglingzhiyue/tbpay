package com.alipay.mobile.common.transport.utils;

import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ConnectivityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SCENE_QUICK = "quick";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5621a = false;

    public static void notifyRedText(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14506e78", new Object[]{new Boolean(z)});
        } else {
            f5621a = z;
        }
    }

    public static boolean isShowRedText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("11bfd522", new Object[0])).booleanValue() : f5621a;
    }

    public static void notifyScene(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdf2840", new Object[]{str, new Boolean(z)});
        } else {
            ExtTransportOffice.getInstance().setScene(str, z);
        }
    }

    public static int getConnState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3cf11709", new Object[0])).intValue() : ExtTransportOffice.getInstance().getConnState();
    }
}
