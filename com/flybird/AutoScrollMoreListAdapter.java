package com.flybird;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBListView;
import com.flybird.FBTable;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AutoScrollMoreListAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FBListView.FBListViewListener f7108a = new FBListView.FBListViewListener() { // from class: com.flybird.AutoScrollMoreListAdapter.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.flybird.FBListView.FBListViewListener
        public void onFooterPullOver(FBListView fBListView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14bf0919", new Object[]{this, fBListView});
                return;
            }
            AutoScrollMoreListAdapter autoScrollMoreListAdapter = AutoScrollMoreListAdapter.this;
            if (autoScrollMoreListAdapter.mIsLoading) {
                return;
            }
            autoScrollMoreListAdapter.mIsLoading = true;
            if (!autoScrollMoreListAdapter.onAutoLoadMore()) {
                return;
            }
            AutoScrollMoreListAdapter.this.showFooter();
        }

        @Override // com.flybird.FBListView.FBListViewListener
        public void onHeaderPullOver(FBListView fBListView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5195250b", new Object[]{this, fBListView});
            }
        }
    };
    public Context mContext;
    public View mFootView;
    public boolean mIsLoading;
    public List<FBTable.Item> mListDatas;
    public ListView mListView;

    public AutoScrollMoreListAdapter(Context context, ListView listView, List<FBTable.Item> list) {
        setListAndData(context, listView, list);
        init();
    }

    public void addFooter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cbb423", new Object[]{this});
            return;
        }
        View view = this.mFootView;
        if (view == null || this.mListView.removeFooterView(view)) {
            return;
        }
        this.mListView.addFooterView(this.mFootView);
    }

    public void clearData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e900c9e", new Object[]{this});
            return;
        }
        List<FBTable.Item> list = this.mListDatas;
        if (list == null) {
            return;
        }
        list.clear();
        notifyDataSetChanged();
    }

    public void disableLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6a4b6a", new Object[]{this});
            return;
        }
        removeFooter();
        ((FBListView) this.mListView).setListener(null);
    }

    public void enableLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1433d85", new Object[]{this});
            return;
        }
        this.mIsLoading = false;
        ((FBListView) this.mListView).setListener(this.f7108a);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<FBTable.Item> list = this.mListDatas;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public abstract View getFailView();

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        List<FBTable.Item> list = this.mListDatas;
        if (list != null && i < list.size() && i >= 0) {
            return this.mListDatas.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public abstract View getLoadingView();

    public int getSection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84e31a00", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i < this.mListDatas.size() && i >= 0) {
            return this.mListDatas.get(i).b;
        }
        return 0;
    }

    public void hideFooter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e28384", new Object[]{this});
        } else {
            this.mListView.removeFooterView(this.mFootView);
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mFootView = getLoadingView();
        enableLoadMore();
    }

    public boolean isSection(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f68f79e5", new Object[]{this, new Integer(i)})).booleanValue() : i < this.mListDatas.size() && i >= 0 && this.mListDatas.get(i).c == -1;
    }

    public abstract void itemClick(AdapterView<?> adapterView, View view, int i, long j);

    public void notifyLoadMoreFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8299bddd", new Object[]{this});
            return;
        }
        this.mIsLoading = false;
        hideFooter();
        notifyDataSetChanged();
    }

    public abstract boolean onAutoLoadMore();

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
        } else {
            itemClick(adapterView, view, i, j);
        }
    }

    public abstract void onRetry();

    public void removeFooter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924cf446", new Object[]{this});
            return;
        }
        View view = this.mFootView;
        if (view == null) {
            return;
        }
        this.mListView.removeFooterView(view);
    }

    public void setListAndData(Context context, ListView listView, List<FBTable.Item> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f685c4", new Object[]{this, context, listView, list});
            return;
        }
        this.mContext = context;
        this.mListView = listView;
        this.mListDatas = list;
    }

    public void showFooter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39dd37f", new Object[]{this});
        } else {
            addFooter();
        }
    }
}
