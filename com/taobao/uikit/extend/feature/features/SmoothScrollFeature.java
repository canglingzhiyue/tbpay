package com.taobao.uikit.extend.feature.features;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.callback.AdapterCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.view.TImageView;

/* loaded from: classes9.dex */
public class SmoothScrollFeature extends AbsFeature<ListView> implements AbsListView.OnScrollListener, AdapterCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mScrollState = 0;
    private int mLastVisibleItem = -1;

    public static /* synthetic */ Object ipc$super(SmoothScrollFeature smoothScrollFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((SmoothScrollFeature) ((View) objArr[0]));
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

    @Deprecated
    public void setImageViewTag(ImageView imageView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f00a4d79", new Object[]{this, imageView, obj});
        }
    }

    public static /* synthetic */ int access$000(SmoothScrollFeature smoothScrollFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e624ed22", new Object[]{smoothScrollFeature})).intValue() : smoothScrollFeature.mScrollState;
    }

    public static /* synthetic */ void access$100(SmoothScrollFeature smoothScrollFeature, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25a21e22", new Object[]{smoothScrollFeature, view});
        } else {
            smoothScrollFeature.resume(view);
        }
    }

    public static /* synthetic */ void access$200(SmoothScrollFeature smoothScrollFeature, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87fd3501", new Object[]{smoothScrollFeature, view});
        } else {
            smoothScrollFeature.pause(view);
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(ListView listView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f215e22", new Object[]{this, listView});
            return;
        }
        super.setHost((SmoothScrollFeature) listView);
        listView.setOnScrollListener(this);
    }

    @Override // com.taobao.uikit.feature.callback.AdapterCallback
    public ListAdapter wrapAdapter(ListAdapter listAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListAdapter) ipChange.ipc$dispatch("4822ce0a", new Object[]{this, listAdapter}) : (listAdapter == null || (listAdapter instanceof SmoothAdapter)) ? listAdapter : new SmoothAdapter(listAdapter);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
            return;
        }
        this.mScrollState = i;
        if (i != 0) {
            return;
        }
        resume(absListView);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.mLastVisibleItem == i) {
        } else {
            if (i == 0) {
                View childAt = absListView.getChildAt(0);
                if (childAt == null || childAt.getTop() == 0) {
                    resume(absListView);
                }
            } else if (i3 == i2 + i) {
                resume(absListView);
            }
            this.mLastVisibleItem = i;
        }
    }

    public int getScrollState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue() : this.mScrollState;
    }

    /* loaded from: classes9.dex */
    public class SmoothAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ListAdapter mDelegateAdapter;

        public SmoothAdapter(ListAdapter listAdapter) {
            this.mDelegateAdapter = listAdapter;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.mDelegateAdapter.getCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : this.mDelegateAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : this.mDelegateAdapter.getItemId(i);
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c9bb039", new Object[]{this})).booleanValue() : this.mDelegateAdapter.areAllItemsEnabled();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : this.mDelegateAdapter.getItemViewType(i);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue() : this.mDelegateAdapter.getViewTypeCount();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35312b0e", new Object[]{this})).booleanValue() : this.mDelegateAdapter.hasStableIds();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue() : this.mDelegateAdapter.isEmpty();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8714c709", new Object[]{this, new Integer(i)})).booleanValue() : this.mDelegateAdapter.isEnabled(i);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            View view2 = this.mDelegateAdapter.getView(i, view, viewGroup);
            if (2 != SmoothScrollFeature.access$000(SmoothScrollFeature.this)) {
                SmoothScrollFeature.access$100(SmoothScrollFeature.this, view2);
            } else {
                SmoothScrollFeature.access$200(SmoothScrollFeature.this, view2);
            }
            return view2;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
                return;
            }
            ListAdapter listAdapter = this.mDelegateAdapter;
            if (!(listAdapter instanceof BaseAdapter)) {
                return;
            }
            ((BaseAdapter) listAdapter).notifyDataSetChanged();
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("809705c1", new Object[]{this});
                return;
            }
            ListAdapter listAdapter = this.mDelegateAdapter;
            if (!(listAdapter instanceof BaseAdapter)) {
                return;
            }
            ((BaseAdapter) listAdapter).notifyDataSetInvalidated();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63701d27", new Object[]{this, dataSetObserver});
            } else {
                this.mDelegateAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66db852e", new Object[]{this, dataSetObserver});
            } else {
                this.mDelegateAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
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
}
