package com.taobao.message.lab.comfrm.aura;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.event.DisposeService;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.Disposable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class DisposeServiceImpl implements DisposeService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final List<Disposable> disposables = new ArrayList();

    static {
        kge.a(500774992);
        kge.a(-1580786339);
    }

    @Override // com.taobao.message.lab.comfrm.event.DisposeService
    public void addDisposable(Disposable disposable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451621b8", new Object[]{this, disposable});
            return;
        }
        synchronized (this) {
            this.disposables.add(disposable);
        }
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.DisposeServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (this) {
                        for (Disposable disposable : DisposeServiceImpl.this.disposables) {
                            disposable.dispose();
                        }
                    }
                }
            });
        }
    }
}
