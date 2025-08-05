package com.taobao.android.editionswitcher.homepage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class EditionListAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LIST_TYPE_ACTIVITY = 2;
    public static final int LIST_TYPE_DIALOG = 1;
    public static final int UNCHECKED_POSITION = -1;
    private Map<Integer, View> mAreaItemViews;
    private int mCurrentCheckPosition;
    private List<a> mData;
    private int mListType;

    static {
        kge.a(1861767153);
        kge.a(54921071);
    }

    public static /* synthetic */ Object ipc$super(EditionListAdapter editionListAdapter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public EditionListAdapter(List<a> list) {
        this(list, 1);
    }

    public EditionListAdapter(List<a> list, int i) {
        this.mData = new ArrayList(0);
        this.mCurrentCheckPosition = -1;
        if (list != null && !list.isEmpty()) {
            this.mData = list;
        }
        this.mListType = i;
        initCheckedStatus();
    }

    private void initCheckedStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14082f50", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mData.size(); i++) {
            if (this.mData.get(i).d) {
                this.mCurrentCheckPosition = i;
                return;
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.mData.size();
    }

    @Override // android.widget.Adapter
    /* renamed from: getItem */
    public a mo925getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("fd06941", new Object[]{this, new Integer(i)});
        }
        if (!isValidPosition(i)) {
            return null;
        }
        return this.mData.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (!isValidPosition(i)) {
            return null;
        }
        if (this.mAreaItemViews == null) {
            this.mAreaItemViews = new HashMap();
        }
        View view2 = this.mAreaItemViews.get(Integer.valueOf(i));
        if (view2 != null) {
            return view2;
        }
        View convertView = getConvertView(viewGroup);
        bindView(convertView, this.mData.get(i), i);
        this.mAreaItemViews.put(Integer.valueOf(i), convertView);
        return convertView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
        } else if (this.mCurrentCheckPosition == i || TextUtils.isEmpty(this.mData.get(i).f12297a)) {
        } else {
            uncheckCurrentRowStatus(this.mAreaItemViews.get(Integer.valueOf(this.mCurrentCheckPosition)), this.mCurrentCheckPosition);
            checkCurrentRowStatus(this.mAreaItemViews.get(Integer.valueOf(i)), i);
            this.mCurrentCheckPosition = i;
        }
    }

    public a getCheckedAreaItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5b7aeae6", new Object[]{this});
        }
        int i = this.mCurrentCheckPosition;
        if (i >= 0 && i < this.mData.size()) {
            return this.mData.get(this.mCurrentCheckPosition);
        }
        return null;
    }

    private boolean isValidPosition(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9cb4405", new Object[]{this, new Integer(i)})).booleanValue() : i >= 0 && i < this.mData.size();
    }

    public View getConvertView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a2ce7cca", new Object[]{this, viewGroup});
        }
        return LayoutInflater.from(viewGroup.getContext()).inflate(this.mListType == 1 ? R.layout.homepage_area_list_item : R.layout.homepage_area_list_item_activity, viewGroup, false);
    }

    private void bindView(View view, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3bac6ce", new Object[]{this, view, aVar, new Integer(i)});
            return;
        }
        ((TextView) view.findViewById(R.id.item_area_name)).setText(aVar.b);
        if (this.mListType == 2) {
            if (TextUtils.equals(aVar.f12297a, "CUN")) {
                view.findViewById(R.id.item_area_desc).setVisibility(0);
            } else {
                view.findViewById(R.id.item_area_desc).setVisibility(8);
            }
        }
        if (this.mCurrentCheckPosition == i) {
            checkCurrentRowStatus(view, i);
        } else {
            uncheckCurrentRowStatus(view, i);
        }
    }

    private void checkCurrentRowStatus(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffaeac93", new Object[]{this, view, new Integer(i)});
        } else if (view == null) {
        } else {
            view.findViewById(R.id.item_area_checked).setVisibility(0);
            this.mData.get(i).d = true;
        }
    }

    private void uncheckCurrentRowStatus(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e1029a", new Object[]{this, view, new Integer(i)});
        } else if (view == null) {
        } else {
            view.findViewById(R.id.item_area_checked).setVisibility(8);
            this.mData.get(i).d = false;
        }
    }
}
