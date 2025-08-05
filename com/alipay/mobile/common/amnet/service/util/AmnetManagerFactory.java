package com.alipay.mobile.common.amnet.service.util;

import com.alipay.mobile.common.amnet.api.AmnetManager;
import com.alipay.mobile.common.amnet.api.AmnetManagerBeanFactory;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AmnetManagerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Deprecated
    public static final AmnetManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetManager) ipChange.ipc$dispatch("91a27906", new Object[0]) : AmnetManagerBeanFactory.getSingletonAmnetManager();
    }
}
