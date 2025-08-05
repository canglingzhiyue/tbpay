package com.alipay.mobile.common.amnet.api;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class AmnetManagerBeanFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AmnetManager f5351a;

    public static final AmnetManager getSingletonAmnetManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetManager) ipChange.ipc$dispatch("f2066e6c", new Object[0]);
        }
        AmnetManager amnetManager = f5351a;
        if (amnetManager != null) {
            return amnetManager;
        }
        synchronized (AmnetManager.class) {
            if (f5351a != null) {
                return f5351a;
            }
            f5351a = createAmnetManager();
            return f5351a;
        }
    }

    public static final AmnetManager createAmnetManager() {
        try {
            return (AmnetManager) Class.forName("com.alipay.mobile.common.amnet.biz.AmnetManagerImpl").newInstance();
        } catch (ClassNotFoundException e) {
            LogCatUtil.error("AmnetManagerBeanFactory", e);
            return null;
        } catch (IllegalAccessException e2) {
            LogCatUtil.error("AmnetManagerBeanFactory", e2);
            return null;
        } catch (InstantiationException e3) {
            LogCatUtil.error("AmnetManagerBeanFactory", e3);
            return null;
        }
    }
}
