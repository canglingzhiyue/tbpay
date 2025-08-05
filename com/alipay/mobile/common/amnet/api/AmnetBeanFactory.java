package com.alipay.mobile.common.amnet.api;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class AmnetBeanFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final AmnetManager getSingletonAmnetManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetManager) ipChange.ipc$dispatch("f2066e6c", new Object[0]) : AmnetManagerBeanFactory.getSingletonAmnetManager();
    }

    public static final AmnetManager createAmnetManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetManager) ipChange.ipc$dispatch("31c26e13", new Object[0]) : AmnetManagerBeanFactory.createAmnetManager();
    }

    @Deprecated
    public static final AmnetManager getAmnetManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetManager) ipChange.ipc$dispatch("813e8c6d", new Object[0]) : createAmnetManager();
    }
}
