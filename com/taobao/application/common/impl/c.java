package com.taobao.application.common.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IAppLaunchListener;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c implements IAppLaunchListener, i<IAppLaunchListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<IAppLaunchListener> f16329a = new ArrayList(2);

    @Override // com.taobao.application.common.impl.i
    public /* synthetic */ void a(IAppLaunchListener iAppLaunchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, iAppLaunchListener});
        } else {
            b2(iAppLaunchListener);
        }
    }

    @Override // com.taobao.application.common.impl.i
    public /* synthetic */ void b(IAppLaunchListener iAppLaunchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, iAppLaunchListener});
        } else {
            a2(iAppLaunchListener);
        }
    }

    public static /* synthetic */ List a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("857cb796", new Object[]{cVar}) : cVar.f16329a;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(final IAppLaunchListener iAppLaunchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3426a6", new Object[]{this, iAppLaunchListener});
        } else if (iAppLaunchListener == null) {
            throw new IllegalArgumentException();
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (c.a(c.this).contains(iAppLaunchListener)) {
                    } else {
                        c.a(c.this).add(iAppLaunchListener);
                    }
                }
            });
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void b2(final IAppLaunchListener iAppLaunchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3887be7", new Object[]{this, iAppLaunchListener});
        } else if (iAppLaunchListener == null) {
            throw new IllegalArgumentException();
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a(c.this).remove(iAppLaunchListener);
                    }
                }
            });
        }
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void a(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (IAppLaunchListener iAppLaunchListener : c.a(c.this)) {
                        iAppLaunchListener.a(i, i2);
                    }
                }
            });
        }
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            b.d().a(runnable);
        }
    }
}
