package com.taobao.android.detail.wrapper.ext.component.desc.viewholder.adapter.size;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class RoleSizeDropDownAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context mContext;
    public int max;
    public int min;

    static {
        kge.a(-1192519264);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public RoleSizeDropDownAdapter(Context context, int i, int i2) {
        this.mContext = context;
        this.max = i;
        this.min = i2;
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.adapter.size.RoleSizeDropDownAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : (this.max - this.min) + 1;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : Integer.valueOf(this.min + i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = new TextView(this.mContext);
            Resources resources = this.mContext.getResources();
            textView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            textView.setMinHeight((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
            textView.setTextColor(resources.getColor(R.color.detail_051b28));
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setBackgroundResource(R.drawable.detail_size_chart_role_drop_down_listview_selector);
        }
        textView.setText(String.valueOf(this.min + i));
        return textView;
    }
}
