package com.alipay.mobile.common.amnet.service.events;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;

/* loaded from: classes3.dex */
public class ServiceLifeCycleEventManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ServiceLifeCycleEventManager b;

    /* renamed from: a  reason: collision with root package name */
    private ServiceLifeCycleObservable f5383a;

    /* loaded from: classes3.dex */
    public class ServiceLifeCycleObservable extends Observable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ServiceLifeCycleObservable() {
        }

        public static /* synthetic */ Object ipc$super(ServiceLifeCycleObservable serviceLifeCycleObservable, String str, Object... objArr) {
            if (str.hashCode() == -310743881) {
                super.notifyObservers(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // java.util.Observable
        public void notifyObservers(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed7a6cb7", new Object[]{this, obj});
                return;
            }
            setChanged();
            try {
                super.notifyObservers(obj);
            } catch (Throwable th) {
                LogCatUtil.error("ServiceLifeCycleEventManager", th);
            }
        }
    }

    public static final ServiceLifeCycleEventManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceLifeCycleEventManager) ipChange.ipc$dispatch("be5b72bb", new Object[0]);
        }
        ServiceLifeCycleEventManager serviceLifeCycleEventManager = b;
        if (serviceLifeCycleEventManager != null) {
            return serviceLifeCycleEventManager;
        }
        synchronized (ServiceLifeCycleEventManager.class) {
            if (b != null) {
                return b;
            }
            b = new ServiceLifeCycleEventManager();
            return b;
        }
    }

    private ServiceLifeCycleEventManager() {
    }

    public void addStateListener(ServiceLifeCycleListener serviceLifeCycleListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c34dfe1", new Object[]{this, serviceLifeCycleListener});
        } else {
            a().addObserver(serviceLifeCycleListener);
        }
    }

    public void removeStateListener(ServiceLifeCycleListener serviceLifeCycleListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27528d5e", new Object[]{this, serviceLifeCycleListener});
        } else {
            a().deleteObserver(serviceLifeCycleListener);
        }
    }

    public void notifyStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa37810", new Object[]{this, new Integer(i)});
        } else {
            a().notifyObservers(Integer.valueOf(i));
        }
    }

    public void asyncNotifyStateChanged(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992241f4", new Object[]{this, new Integer(i)});
        } else {
            NetworkAsyncTaskExecutor.executeHighSerial(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.events.ServiceLifeCycleEventManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ServiceLifeCycleEventManager.this.notifyStateChanged(i);
                    }
                }
            });
        }
    }

    private ServiceLifeCycleObservable a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceLifeCycleObservable) ipChange.ipc$dispatch("dc908195", new Object[]{this});
        }
        if (this.f5383a == null) {
            this.f5383a = new ServiceLifeCycleObservable();
        }
        return this.f5383a;
    }
}
