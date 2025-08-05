package com.ali.user.mobile.ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class MenuItemAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context context;
    private int layoutId;
    private LayoutInflater layoutInflater;
    private List<MenuItem> menuItems;

    static {
        kge.a(-2070672987);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public MenuItemAdapter(Context context, List<MenuItem> list) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.menuItems = list;
    }

    public void setLayoutId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf32755", new Object[]{this, new Integer(i)});
        } else {
            this.layoutId = i;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.menuItems.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        if (i < this.menuItems.size() && i >= 0) {
            return this.menuItems.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            LayoutInflater layoutInflater = this.layoutInflater;
            int i2 = this.layoutId;
            if (i2 <= 0) {
                i2 = R.layout.aliuser_menu_item;
            }
            view = layoutInflater.inflate(i2, (ViewGroup) null);
        }
        MenuItem menuItem = this.menuItems.get(i);
        TextView textView = (TextView) view.findViewById(R.id.aliuser_menu_item);
        textView.setText(menuItem.getText());
        if (menuItem.textColor != 0) {
            textView.setTextColor(menuItem.textColor);
        }
        if (menuItem.textSize > 0.0f) {
            textView.setTextSize(0, menuItem.textSize);
        }
        textView.setOnClickListener(menuItem.getMenuItemOnClickListener());
        return view;
    }
}
