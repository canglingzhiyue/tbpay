package com.taobao.tao.sku.widget.base.uikit.feature.features;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class a<T extends View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f21108a;

    static {
        kge.a(405621099);
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, t});
        } else {
            this.f21108a = t;
        }
    }
}
