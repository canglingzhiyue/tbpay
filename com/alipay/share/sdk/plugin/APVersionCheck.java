package com.alipay.share.sdk.plugin;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class APVersionCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f6185a;

    public APVersionCheck(Context context) {
        this.f6185a = context;
    }

    public int getZFBAppVersionCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c660941e", new Object[]{this})).intValue();
        }
        try {
            return this.f6185a.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 64).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }
}
