package com.taobao.application.common.impl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f<T> implements i<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<T> f16344a = new ArrayList<>();

    public abstract void a(Runnable runnable);

    @Override // com.taobao.application.common.impl.i
    public void b(final T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, t});
        } else if (t == null) {
            throw new IllegalArgumentException();
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (f.this.f16344a.contains(t)) {
                    } else {
                        f.this.f16344a.add(t);
                    }
                }
            });
        }
    }

    @Override // com.taobao.application.common.impl.i
    public void a(final T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
        } else if (t == null) {
            throw new IllegalArgumentException();
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        f.this.f16344a.remove(t);
                    }
                }
            });
        }
    }
}
