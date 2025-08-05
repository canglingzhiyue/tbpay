package com.taobao.taolive.adapterimpl.uikit.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.DragToRefreshFeature;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.kge;

/* loaded from: classes8.dex */
public class TBRecyclerView extends TRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.alilive.adapter.uikit.recyclerview.a mDrag2RefreshListener;
    public DragToRefreshFeature mRefreshFeature;

    static {
        kge.a(-1251376868);
        kge.a(-437977118);
    }

    public static /* synthetic */ Object ipc$super(TBRecyclerView tBRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -171420219) {
            super.setOnItemClickListener((TRecyclerView.OnItemClickListener) objArr[0]);
            return null;
        } else if (hashCode != 715434834) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.addFeature((AbsFeature) objArr[0]));
        }
    }

    public TBRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TBRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBRecyclerView(Context context) {
        this(context, null);
    }

    public void setDragable(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea37e4e3", new Object[]{this, context, new Boolean(z)});
            return;
        }
        DragToRefreshFeature dragToRefreshFeature = this.mRefreshFeature;
        if (dragToRefreshFeature == null) {
            this.mRefreshFeature = new DragToRefreshFeature(context, 1);
            this.mRefreshFeature.enablePositiveDrag(z);
            this.mRefreshFeature.enableNegativeDrag(z);
            this.mRefreshFeature.setNegativeDragAuto(z);
            this.mRefreshFeature.setOnDragToRefreshListener(new DragToRefreshFeature.OnDragToRefreshListener() { // from class: com.taobao.taolive.adapterimpl.uikit.recyclerview.TBRecyclerView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.feature.features.DragToRefreshFeature.OnDragToRefreshListener
                public void onDragNegative() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fc0758f", new Object[]{this});
                    }
                }

                @Override // com.taobao.uikit.feature.features.DragToRefreshFeature.OnDragToRefreshListener
                public void onDragPositive() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("75a78153", new Object[]{this});
                    }
                }
            });
            super.addFeature(this.mRefreshFeature);
            return;
        }
        dragToRefreshFeature.enablePositiveDrag(z);
    }

    public void clearDragable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f69502", new Object[]{this});
            return;
        }
        DragToRefreshFeature dragToRefreshFeature = this.mRefreshFeature;
        if (dragToRefreshFeature == null) {
            return;
        }
        dragToRefreshFeature.setOnDragToRefreshListener(null);
        this.mRefreshFeature = null;
    }

    public void setDragToRefreshListener(com.alilive.adapter.uikit.recyclerview.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b1aebe", new Object[]{this, aVar});
        } else {
            this.mDrag2RefreshListener = aVar;
        }
    }

    public void setOnItemClickListener(final AdapterView.OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e633b8f", new Object[]{this, onItemClickListener});
        } else {
            super.setOnItemClickListener(new TRecyclerView.OnItemClickListener() { // from class: com.taobao.taolive.adapterimpl.uikit.recyclerview.TBRecyclerView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.feature.view.TRecyclerView.OnItemClickListener
                public void onItemClick(TRecyclerView tRecyclerView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c2137596", new Object[]{this, tRecyclerView, view, new Integer(i), new Long(j)});
                        return;
                    }
                    AdapterView.OnItemClickListener onItemClickListener2 = onItemClickListener;
                    if (onItemClickListener2 == null) {
                        return;
                    }
                    onItemClickListener2.onItemClick(null, view, i, j);
                }
            });
        }
    }

    public void onDragRefreshComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e38d08", new Object[]{this});
            return;
        }
        DragToRefreshFeature dragToRefreshFeature = this.mRefreshFeature;
        if (dragToRefreshFeature == null) {
            return;
        }
        dragToRefreshFeature.onDragRefreshComplete();
    }

    public void setNegativeRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af52bb6", new Object[]{this, new Boolean(z)});
            return;
        }
        DragToRefreshFeature dragToRefreshFeature = this.mRefreshFeature;
        if (dragToRefreshFeature == null) {
            return;
        }
        dragToRefreshFeature.setNegativeRefreshFinish(z);
    }

    public void enableNegativeDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ae2281", new Object[]{this, new Boolean(z)});
            return;
        }
        DragToRefreshFeature dragToRefreshFeature = this.mRefreshFeature;
        if (dragToRefreshFeature == null) {
            return;
        }
        dragToRefreshFeature.enableNegativeDrag(z);
    }

    public void enablePositiveDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aebd13d", new Object[]{this, new Boolean(z)});
            return;
        }
        DragToRefreshFeature dragToRefreshFeature = this.mRefreshFeature;
        if (dragToRefreshFeature == null) {
            return;
        }
        dragToRefreshFeature.enablePositiveDrag(z);
    }
}
