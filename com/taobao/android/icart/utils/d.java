package com.taobao.android.icart.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.Config;
import tb.gnx;
import tb.jqd;
import tb.jqi;
import tb.kge;

/* loaded from: classes5.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f12867a;

    static {
        kge.a(-1503202069);
        f12867a = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f12867a) {
        } else {
            f12867a = true;
            jqi.a("iCart", new gnx());
            Config config = new Config();
            config.walSize = 1048576;
            jqd.a("iCart", config);
        }
    }
}
