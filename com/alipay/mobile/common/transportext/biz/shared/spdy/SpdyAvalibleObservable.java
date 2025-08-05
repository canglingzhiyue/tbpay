package com.alipay.mobile.common.transportext.biz.shared.spdy;

import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.util.SecureRunnable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;

/* loaded from: classes3.dex */
public class SpdyAvalibleObservable extends Observable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(SpdyAvalibleObservable spdyAvalibleObservable, String str, Object... objArr) {
        if (str.hashCode() == -310743881) {
            super.notifyObservers(objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final SpdyAvalibleObservable getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdyAvalibleObservable) ipChange.ipc$dispatch("e1a9aa34", new Object[0]) : (SpdyAvalibleObservable) NetBeanFactory.getBean(SpdyAvalibleObservable.class);
    }

    public void addSpdyAvalibleListener(SpdyAvalibleListener spdyAvalibleListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7180263f", new Object[]{this, spdyAvalibleListener});
        } else {
            addObserver(spdyAvalibleListener);
        }
    }

    public void asyncNotifySpdyAvalible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb38e6d0", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.shared.spdy.SpdyAvalibleObservable.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                    } else {
                        SpdyAvalibleObservable.this.notifyObservers();
                    }
                }
            });
        }
    }

    @Override // java.util.Observable
    public void notifyObservers(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7a6cb7", new Object[]{this, obj});
            return;
        }
        setChanged();
        super.notifyObservers(obj);
    }
}
