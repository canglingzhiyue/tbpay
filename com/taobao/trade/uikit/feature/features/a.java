package com.taobao.trade.uikit.feature.features;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class a<T extends View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public T mHost;

    static {
        kge.a(343189106);
    }

    public abstract void constructor(Context context, AttributeSet attributeSet, int i);

    public a() {
        constructor(null, null, 0);
    }

    public void setHost(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa76c81", new Object[]{this, t});
        } else {
            this.mHost = t;
        }
    }

    public T getHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("402a7ca7", new Object[]{this}) : this.mHost;
    }
}
