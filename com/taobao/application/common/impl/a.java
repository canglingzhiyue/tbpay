package com.taobao.application.common.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements IApmEventListener, i<IApmEventListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<IApmEventListener> f16323a = new ArrayList<>();

    @Override // com.taobao.application.common.impl.i
    public /* synthetic */ void a(IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, iApmEventListener});
        } else {
            b2(iApmEventListener);
        }
    }

    @Override // com.taobao.application.common.impl.i
    public /* synthetic */ void b(IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, iApmEventListener});
        } else {
            a2(iApmEventListener);
        }
    }

    public static /* synthetic */ ArrayList a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("a746da2d", new Object[]{aVar}) : aVar.f16323a;
    }

    @Override // com.taobao.application.common.IApmEventListener
    public void onEvent(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = a.a(a.this).iterator();
                    while (it.hasNext()) {
                        ((IApmEventListener) it.next()).onEvent(i);
                    }
                }
            });
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(final IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ba6d32", new Object[]{this, iApmEventListener});
        } else if (iApmEventListener == null) {
            throw new IllegalArgumentException();
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this).contains(iApmEventListener)) {
                    } else {
                        a.a(a.this).add(iApmEventListener);
                    }
                }
            });
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void b2(final IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d5ebd1", new Object[]{this, iApmEventListener});
        } else if (iApmEventListener == null) {
            throw new IllegalArgumentException();
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this).remove(iApmEventListener);
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
