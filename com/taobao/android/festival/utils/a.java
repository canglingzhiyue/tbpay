package com.taobao.android.festival.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.gjb;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AREA_FOREIGN = 2;
    public static final String DEFAULT_FOREIGN_SKIN_CODE = "29c1acb6-5701-4438-aebc-083ce78c79d7";

    /* renamed from: a  reason: collision with root package name */
    public static String f12369a;

    static {
        kge.a(1546595108);
        f12369a = "EDITON_SWITCHER_EDITTION_CODE_CHANGED";
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "true".equals(gjb.g(gjb.SP_KEY_DEFAULT_CUSTOMER_AREA_SKIN));
    }
}
