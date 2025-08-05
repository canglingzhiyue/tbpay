package com.alipay.mobile.common.amnet.service;

import android.app.Service;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AmnetServiceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AmnetServiceFactory f5373a;

    public static final AmnetServiceFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetServiceFactory) ipChange.ipc$dispatch("43b080b3", new Object[0]);
        }
        AmnetServiceFactory amnetServiceFactory = f5373a;
        if (amnetServiceFactory != null) {
            return amnetServiceFactory;
        }
        synchronized (AmnetServiceFactory.class) {
            if (f5373a != null) {
                return f5373a;
            }
            f5373a = new AmnetServiceFactory();
            return f5373a;
        }
    }

    public AmnetService createAmnetService(Service service) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetService) ipChange.ipc$dispatch("def978da", new Object[]{this, service}) : new AmnetServiceWrapper(service);
    }
}
