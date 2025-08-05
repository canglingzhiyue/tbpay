package com.taobao.application.common.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IPageListener;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class k implements IPageListener, i<IPageListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<IPageListener> f16351a = new ArrayList<>();

    @Override // com.taobao.application.common.impl.i
    public /* synthetic */ void a(IPageListener iPageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, iPageListener});
        } else {
            b2(iPageListener);
        }
    }

    @Override // com.taobao.application.common.impl.i
    public /* synthetic */ void b(IPageListener iPageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, iPageListener});
        } else {
            a2(iPageListener);
        }
    }

    public static /* synthetic */ ArrayList a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("7f566ee3", new Object[]{kVar}) : kVar.f16351a;
    }

    @Override // com.taobao.application.common.IPageListener
    public void a(final String str, final int i, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526bd3", new Object[]{this, str, new Integer(i), new Long(j)});
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = k.a(k.this).iterator();
                    while (it.hasNext()) {
                        ((IPageListener) it.next()).a(str, i, j);
                    }
                }
            });
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(final IPageListener iPageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b0dcdf", new Object[]{this, iPageListener});
        } else if (iPageListener == null) {
            throw new IllegalArgumentException();
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.k.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (k.a(k.this).contains(iPageListener)) {
                    } else {
                        k.a(k.this).add(iPageListener);
                    }
                }
            });
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void b2(final IPageListener iPageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25a82fe", new Object[]{this, iPageListener});
        } else if (iPageListener == null) {
            throw new IllegalArgumentException();
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.k.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        k.a(k.this).remove(iPageListener);
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
