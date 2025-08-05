package com.taobao.oversea.theme;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.e;
import tb.ksn;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ksn f18668a;

    public static void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{new Boolean(z)});
            return;
        }
        try {
            if (z) {
                e.a(Integer.valueOf(Color.parseColor("#837d83")), Integer.valueOf(Color.parseColor("#666666")), Integer.valueOf(Color.parseColor("#252126")));
                e.a(Integer.valueOf(Color.parseColor("#666666")));
            } else {
                e.a((Integer) null, (Integer) null, (Integer) null);
                e.a((Integer) null);
            }
        } catch (Exception unused) {
        }
    }

    public static ksn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksn) ipChange.ipc$dispatch("f0705d8", new Object[0]);
        }
        if (f18668a == null) {
            f18668a = new ksn("mtop.ovs.compass.cn.homepage.recommend", "1.0");
        }
        return f18668a;
    }
}
