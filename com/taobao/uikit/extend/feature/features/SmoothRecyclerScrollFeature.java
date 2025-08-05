package com.taobao.uikit.extend.feature.features;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.callback.RecyclerAdapterCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.view.TImageView;

/* loaded from: classes9.dex */
public class SmoothRecyclerScrollFeature extends AbsFeature<RecyclerView> implements RecyclerAdapterCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public class InnerScrollListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mLastScrollState = 0;

        public InnerScrollListener() {
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            if (i == 0 || (1 == i && 2 == this.mLastScrollState)) {
                SmoothRecyclerScrollFeature.access$000(SmoothRecyclerScrollFeature.this, recyclerView);
            }
            this.mLastScrollState = i;
        }
    }

    public static /* synthetic */ Object ipc$super(SmoothRecyclerScrollFeature smoothRecyclerScrollFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((SmoothRecyclerScrollFeature) ((View) objArr[0]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    public static /* synthetic */ void access$000(SmoothRecyclerScrollFeature smoothRecyclerScrollFeature, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9afe7e84", new Object[]{smoothRecyclerScrollFeature, view});
        } else {
            smoothRecyclerScrollFeature.resume(view);
        }
    }

    public static /* synthetic */ void access$100(SmoothRecyclerScrollFeature smoothRecyclerScrollFeature, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b804663", new Object[]{smoothRecyclerScrollFeature, view});
        } else {
            smoothRecyclerScrollFeature.pause(view);
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbe40df", new Object[]{this, recyclerView});
            return;
        }
        super.setHost((SmoothRecyclerScrollFeature) recyclerView);
        recyclerView.setOnScrollListener(new InnerScrollListener());
    }

    @Override // com.taobao.uikit.feature.callback.RecyclerAdapterCallback
    public RecyclerView.Adapter wrapAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.Adapter) ipChange.ipc$dispatch("58a9304a", new Object[]{this, adapter}) : (adapter == null || (adapter instanceof SmoothAdapter)) ? adapter : new SmoothAdapter(adapter);
    }

    private ImageLoadFeature getImageLoadFeature(TImageView tImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageLoadFeature) ipChange.ipc$dispatch("8ede7a3c", new Object[]{this, tImageView}) : (ImageLoadFeature) tImageView.findFeature(ImageLoadFeature.class);
    }

    private void resume(View view) {
        ImageLoadFeature imageLoadFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd62161e", new Object[]{this, view});
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                resume(viewGroup.getChildAt(i));
            }
        } else if ((view instanceof TImageView) && (imageLoadFeature = getImageLoadFeature((TImageView) view)) != null) {
            imageLoadFeature.resume();
        }
    }

    private void pause(View view) {
        ImageLoadFeature imageLoadFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2384635", new Object[]{this, view});
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                pause(viewGroup.getChildAt(i));
            }
        } else if ((view instanceof TImageView) && (imageLoadFeature = getImageLoadFeature((TImageView) view)) != null) {
            imageLoadFeature.pause();
        }
    }

    /* loaded from: classes9.dex */
    public class SmoothAdapter extends RecyclerView.Adapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private RecyclerView.Adapter mDelegateAdapter;

        public SmoothAdapter(RecyclerView.Adapter adapter) {
            this.mDelegateAdapter = adapter;
            super.setHasStableIds(adapter.hasStableIds());
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : this.mDelegateAdapter.mo1596onCreateViewHolder(viewGroup, i);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            if (2 != SmoothRecyclerScrollFeature.this.getHost().getScrollState()) {
                SmoothRecyclerScrollFeature.access$000(SmoothRecyclerScrollFeature.this, viewHolder.itemView);
            } else {
                SmoothRecyclerScrollFeature.access$100(SmoothRecyclerScrollFeature.this, viewHolder.itemView);
            }
            this.mDelegateAdapter.onBindViewHolder(viewHolder, i);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : this.mDelegateAdapter.getItemViewType(i);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : this.mDelegateAdapter.getItemId(i);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.mDelegateAdapter.getItemCount();
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b10b5391", new Object[]{this, viewHolder});
            } else {
                this.mDelegateAdapter.onViewRecycled(viewHolder);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c70be9f3", new Object[]{this, viewHolder});
            } else {
                this.mDelegateAdapter.onViewAttachedToWindow(viewHolder);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("487ffd16", new Object[]{this, viewHolder});
            } else {
                this.mDelegateAdapter.onViewDetachedFromWindow(viewHolder);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2ce8d76", new Object[]{this, adapterDataObserver});
            } else {
                this.mDelegateAdapter.registerAdapterDataObserver(adapterDataObserver);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cb16f3d", new Object[]{this, adapterDataObserver});
            } else {
                this.mDelegateAdapter.unregisterAdapterDataObserver(adapterDataObserver);
            }
        }
    }
}
