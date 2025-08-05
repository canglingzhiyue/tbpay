package com.taobao.application.common.impl;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IScrollListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class l implements IScrollListener, i<IScrollListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<IScrollListener> f16355a = new CopyOnWriteArrayList();

    @Override // com.taobao.application.common.impl.i
    public /* synthetic */ void a(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, iScrollListener});
        } else {
            b2(iScrollListener);
        }
    }

    @Override // com.taobao.application.common.impl.i
    public /* synthetic */ void b(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, iScrollListener});
        } else {
            a2(iScrollListener);
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onDoFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ad383a", new Object[]{this, new Long(j)});
            return;
        }
        for (IScrollListener iScrollListener : this.f16355a) {
            iScrollListener.onDoFrame(j);
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onStopMonitorDoFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4729dd0", new Object[]{this});
            return;
        }
        for (IScrollListener iScrollListener : this.f16355a) {
            iScrollListener.onStopMonitorDoFrame();
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollStart(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b005994", new Object[]{this, activity, new Integer(i)});
            return;
        }
        for (IScrollListener iScrollListener : this.f16355a) {
            iScrollListener.onScrollStart(activity, i);
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollEnd(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a820af52", new Object[]{this, activity, str});
            return;
        }
        for (IScrollListener iScrollListener : this.f16355a) {
            iScrollListener.onScrollEnd(activity, str);
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollEnd(Activity activity, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc32d85", new Object[]{this, activity, new Integer(i), str});
            return;
        }
        for (IScrollListener iScrollListener : this.f16355a) {
            iScrollListener.onScrollEnd(activity, i, str);
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3ef761", new Object[]{this, iScrollListener});
        } else {
            this.f16355a.add(iScrollListener);
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void b2(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1791c0", new Object[]{this, iScrollListener});
        } else {
            this.f16355a.remove(iScrollListener);
        }
    }
}
