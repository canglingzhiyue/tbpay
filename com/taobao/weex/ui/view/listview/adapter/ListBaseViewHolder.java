package com.taobao.weex.ui.view.listview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.list.IWXHeader;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes9.dex */
public class ListBaseViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isRecycled;
    private WeakReference<WXComponent> mComponent;
    private int mViewType;

    static {
        kge.a(-59188062);
    }

    public ListBaseViewHolder(WXComponent wXComponent, int i) {
        super(wXComponent.mo1286getHostView());
        this.mViewType = i;
        this.mComponent = new WeakReference<>(wXComponent);
        this.isRecycled = wXComponent.canRecycled();
    }

    public ListBaseViewHolder(WXComponent wXComponent, int i, boolean z) {
        this(wXComponent, i);
        this.isRecycled = this.isRecycled || z;
    }

    public ListBaseViewHolder(View view, int i) {
        super(view);
        this.mViewType = i;
    }

    public boolean isRecycled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b9d9d686", new Object[]{this})).booleanValue() : this.isRecycled;
    }

    public void recycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73ae438", new Object[]{this});
            return;
        }
        WeakReference<WXComponent> weakReference = this.mComponent;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.mComponent.get().recycled();
        this.isRecycled = true;
    }

    public void bindData(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc333df3", new Object[]{this, wXComponent});
            return;
        }
        WeakReference<WXComponent> weakReference = this.mComponent;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.mComponent.get().bindData(wXComponent);
        this.isRecycled = false;
    }

    public boolean isFullSpan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2c40ce", new Object[]{this})).booleanValue();
        }
        WeakReference<WXComponent> weakReference = this.mComponent;
        return weakReference != null && (weakReference.get() instanceof IWXHeader);
    }

    public boolean canRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c236802c", new Object[]{this})).booleanValue();
        }
        WeakReference<WXComponent> weakReference = this.mComponent;
        if (weakReference != null && weakReference.get() != null) {
            return this.mComponent.get().canRecycled();
        }
        return true;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.itemView;
    }

    public int getViewType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26e3a2ef", new Object[]{this})).intValue() : this.mViewType;
    }

    public void setComponentUsing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159d9244", new Object[]{this, new Boolean(z)});
            return;
        }
        WeakReference<WXComponent> weakReference = this.mComponent;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.mComponent.get().setUsing(z);
    }

    public WXComponent getComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("bfd859ed", new Object[]{this});
        }
        WeakReference<WXComponent> weakReference = this.mComponent;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
