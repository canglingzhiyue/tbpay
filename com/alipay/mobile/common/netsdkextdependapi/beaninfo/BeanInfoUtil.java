package com.alipay.mobile.common.netsdkextdependapi.beaninfo;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class BeanInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final String getBeanClassName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("acb07cf2", new Object[]{str}) : BeanInfoManagerFactory.getInstance().getDefaultBean().getBeanClassName(str);
    }
}
