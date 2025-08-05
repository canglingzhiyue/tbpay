package com.taobao.android.searchbaseframe.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.NetWorkUtils;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes6.dex */
public final class o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final o INSTANCE;
    public static final int TYPE_2G = 2;
    public static final int TYPE_3G = 3;
    public static final int TYPE_4G = 4;
    public static final int TYPE_NO_WIFI = 0;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_WIFI = 1;

    static {
        kge.a(847343625);
        INSTANCE = new o();
    }

    private o() {
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        int b = b();
        return b != 0 ? b != 1 ? b != 2 ? b != 3 ? b != 4 ? "unknown" : "4g" : "3g" : "2g" : "wifi" : "nowifi";
    }

    @JvmStatic
    public static final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        NetWorkUtils.ConnectType connectType = null;
        try {
            connectType = NetWorkUtils.getConnectType(Globals.getApplication());
        } catch (Throwable th) {
            k.a("SearchNetworkUtil", "获取网络连接类型异常", th);
        }
        if (connectType == null) {
            k.e("SearchNetworkUtil", "未获取到网络连接类型");
            return -1;
        } else if (connectType == NetWorkUtils.ConnectType.CONNECT_TYPE_WIFI) {
            k.e("SearchNetworkUtil", "wifi");
            return 1;
        } else {
            NetWorkUtils.MobileNetworkType mobileNetworkType = null;
            try {
                mobileNetworkType = NetWorkUtils.getMobileNetworkType(Globals.getApplication());
            } catch (Throwable th2) {
                k.a("SearchNetworkUtil", "获取移动网络类型异常", th2);
            }
            if (mobileNetworkType == null) {
                k.e("SearchNetworkUtil", "未获取到移动网络类型");
                return 0;
            }
            int i = p.$EnumSwitchMapping$0[mobileNetworkType.ordinal()];
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : 1 == b();
    }

    @JvmStatic
    public static final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : NetWorkUtils.isNetworkAvailable(Globals.getApplication());
    }
}
