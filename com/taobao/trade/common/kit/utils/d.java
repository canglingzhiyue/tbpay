package com.taobao.trade.common.kit.utils;

import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.xpn;

/* loaded from: classes9.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f22983a;

    static {
        kge.a(846812873);
        f22983a = null;
    }

    public static boolean a() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            bool = (Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0]);
        } else {
            Boolean bool2 = f22983a;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            try {
            } catch (Exception e) {
                com.taobao.trade.common.kit.tracker.a.a(xpn.c("ultron").e("isTaobaoError").d(e.getMessage()));
                f22983a = true;
            }
            if (GlobalAppRuntimeInfo.getContext() == null) {
                return true;
            }
            f22983a = Boolean.valueOf("com.taobao.taobao".equals(GlobalAppRuntimeInfo.getContext().getApplicationInfo().packageName));
            bool = f22983a;
        }
        return bool.booleanValue();
    }
}
