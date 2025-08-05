package com.taobao.passivelocation.features.power;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ndr;
import tb.ndt;
import tb.ndw;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f18671a = "lbs_passive.loc_PowCEct";
    private ndt b = new ndt();
    private ndr c = new ndr(ndw.f31376a);

    static {
        kge.a(-1806061819);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            if ("android.intent.action.BATTERY_LOW".equals(str)) {
                ndr.f31372a = true;
                String str2 = "battery is low, mParamConfig.canSampling()=" + this.c.a();
                this.b.a(ndw.f31376a);
            } else if ("android.intent.action.BATTERY_OKAY".equals(str)) {
                ndr.f31372a = false;
                String str3 = "battery is low, mParamConfig.canSampling()=" + this.c.a();
                if (this.c.a()) {
                    ndw.b = System.currentTimeMillis();
                    this.b.a(ndw.f31376a, ndr.b);
                }
            }
        } catch (Exception unused) {
        }
    }
}
