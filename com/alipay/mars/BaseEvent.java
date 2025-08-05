package com.alipay.mars;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BaseEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static native void onCreate();

    public static native void onDestroy();

    public static native void onExceptionCrash();

    public static native void onForeground(boolean z);

    public static native void onNetworkChange();

    public static native void onSingalCrash(int i);
}
