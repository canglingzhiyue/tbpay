package com.taobao.android.goodprice.homepage.service.impl.bizservice;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;
import tb.llu;

/* loaded from: classes5.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12712a;

    static {
        kge.a(609859426);
    }

    public a() {
        try {
            this.f12712a = Integer.parseInt(OrangeConfig.getInstance().getConfig(llu.GOOD_PRICE_ORANGE_CONFIG, "behaviorXDataLimitedSize", "2048"));
        } catch (Exception unused) {
            this.f12712a = 2048;
        }
    }

    public boolean a(String str) {
        int length;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : StringUtils.isEmpty(str) || (length = str.toCharArray().length) > this.f12712a || length < 5;
    }
}
