package com.taobao.android.trade.component.display;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class FormAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FormAdapter";
    public Context context;
    public List<Component> dataSource;
    public com.taobao.android.trade.component.data.a engine;
    public c formPort;
    public d typeIndex;

    static {
        kge.a(-1277605682);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public FormAdapter(Context context, com.taobao.android.trade.component.data.a aVar, c cVar) {
        this.context = context;
        this.engine = aVar;
        this.formPort = cVar;
        com.taobao.android.trade.component.data.b c = aVar.c();
        this.typeIndex = new d(c.a(), c.b());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.dataSource.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : this.dataSource.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        Component component = this.dataSource.get(i);
        b bVar = null;
        if (view == null) {
            try {
                bVar = this.formPort.a(this.context, component);
            } catch (Throwable unused) {
            }
            if (bVar == null) {
                bVar = new a(this.context);
            }
            view = bVar.a(component);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.b(component);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : this.typeIndex.a(this.dataSource.get(i));
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue() : this.typeIndex.a() + 8;
    }

    public void setDataSource(List<Component> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88534c5f", new Object[]{this, list});
            return;
        }
        this.dataSource = list;
        if (this.dataSource != null) {
            return;
        }
        this.dataSource = new ArrayList();
    }
}
