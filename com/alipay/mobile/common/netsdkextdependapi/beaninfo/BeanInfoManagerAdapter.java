package com.alipay.mobile.common.netsdkextdependapi.beaninfo;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BeanInfoManagerAdapter implements BeanInfoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.beaninfo.BeanInfoManager
    public String getBeanClassName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("acb07cf2", new Object[]{this, str}) : "";
    }
}
