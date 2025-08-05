package com.alipay.mobile.security.zim.api;

import android.content.Context;
import com.alipay.mobile.security.zim.biz.ZimPlatform;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ZIMFacadeBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static ZIMFacade create(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZIMFacade) ipChange.ipc$dispatch("b57a487", new Object[]{context});
        }
        if (context == null) {
            throw new RuntimeException("context Can't be null");
        }
        return new ZimPlatform(context);
    }
}
