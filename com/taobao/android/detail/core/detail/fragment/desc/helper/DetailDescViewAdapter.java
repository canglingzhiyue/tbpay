package com.taobao.android.detail.core.detail.fragment.desc.helper;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.b;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailDescViewAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b mDescRecyleEngine;

    static {
        kge.a(-528786529);
    }

    public DetailDescViewAdapter() {
        emu.a("com.taobao.android.detail.core.detail.fragment.desc.helper.DetailDescViewAdapter");
    }

    public void setDescRecyleEngine(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306106ac", new Object[]{this, bVar});
        } else {
            this.mDescRecyleEngine = bVar;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.mDescRecyleEngine.b();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : this.mDescRecyleEngine.a(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : this.mDescRecyleEngine.b(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue() : this.mDescRecyleEngine.c();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : this.mDescRecyleEngine.c(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup}) : this.mDescRecyleEngine.a(i, view, viewGroup);
    }
}
