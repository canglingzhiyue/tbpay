package com.alipay.mobile.verifyidentity.module.dynamic.helper;

import com.alipay.android.app.render.api.CashierRenderFactory;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BirdNestHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5887a = "BirdNestHelper";

    public static String getEngineParams() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1c3ccdb", new Object[0]);
        }
        try {
            str = CashierRenderFactory.create().getEngineParams();
        } catch (Exception e) {
            VerifyLogCat.w(f5887a, "Failed to getEngineParams: ", e);
            str = "";
        }
        String str2 = f5887a;
        VerifyLogCat.i(str2, "[getEngineParams]: " + str);
        return str;
    }
}
