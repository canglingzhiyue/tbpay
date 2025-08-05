package com.ali.adapt.api;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class AliAdaptServiceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile AliAdaptServiceManager f1798a;
    private AliServiceFinder b;

    private AliAdaptServiceManager() {
    }

    public static AliAdaptServiceManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliAdaptServiceManager) ipChange.ipc$dispatch("5f623e76", new Object[0]);
        }
        if (f1798a == null) {
            synchronized (AliAdaptServiceManager.class) {
                if (f1798a == null) {
                    f1798a = new AliAdaptServiceManager();
                }
            }
        }
        return f1798a;
    }

    public void registerServiceImplStub(AliServiceFinder aliServiceFinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9ce338", new Object[]{this, aliServiceFinder});
        } else {
            this.b = aliServiceFinder;
        }
    }

    public <T> T findAliAdaptService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("ef199154", new Object[]{this, cls}) : (T) this.b.findServiceImpl(cls);
    }

    public <T> void findAliAdaptService(Class<T> cls, AliServiceFindedCallback<T> aliServiceFindedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb4b478", new Object[]{this, cls, aliServiceFindedCallback});
        } else {
            this.b.findServiceImpl(cls, aliServiceFindedCallback);
        }
    }
}
