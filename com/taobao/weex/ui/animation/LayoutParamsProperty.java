package com.taobao.weex.ui.animation;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.view.IRenderResult;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class LayoutParamsProperty extends Property<View, Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1775998640);
    }

    public abstract Integer getProperty(ViewGroup.LayoutParams layoutParams);

    public abstract void setProperty(ViewGroup.LayoutParams layoutParams, Integer num);

    public LayoutParamsProperty() {
        super(Integer.class, "layoutParams");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public Integer get(View view) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("f56f44bc", new Object[]{this, view});
        }
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            return getProperty(layoutParams);
        }
        return 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public void set(View view, Integer num) {
        ViewGroup.LayoutParams layoutParams;
        WXComponent component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae6bc58e", new Object[]{this, view, num});
        } else if (view == null || (layoutParams = view.getLayoutParams()) == null) {
        } else {
            setProperty(layoutParams, num);
            if ((view instanceof IRenderResult) && (component = ((IRenderResult) view).getComponent()) != null) {
                component.notifyNativeSizeChanged(layoutParams.width, layoutParams.height);
            }
            view.requestLayout();
        }
    }
}
