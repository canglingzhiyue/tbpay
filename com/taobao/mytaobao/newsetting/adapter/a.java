package com.taobao.mytaobao.newsetting.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.newsetting.business.model.PaySettingItem;
import com.taobao.mytaobao.newsetting.d;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;
import tb.mvi;
import tb.mvo;

/* loaded from: classes7.dex */
public class a extends RecyclerView.Adapter<mvi> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f18419a;
    private LayoutInflater b;
    private List<PaySettingItem> c;

    static {
        kge.a(-320554572);
    }

    public static /* synthetic */ Context a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b1e7c50b", new Object[]{aVar}) : aVar.f18419a;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(mvi mviVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, mviVar, new Integer(i)});
        } else {
            a(mviVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [android.support.v7.widget.RecyclerView$ViewHolder, tb.mvi] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ mvi mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public a(Context context) {
        this.f18419a = context;
        this.b = LayoutInflater.from(context);
    }

    public void a(List<PaySettingItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
        } else {
            this.c = list;
            notifyDataSetChanged();
        }
    }

    public mvi a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mvi) ipChange.ipc$dispatch("56b427ea", new Object[]{this, viewGroup, new Integer(i)}) : new mvi(this.b.inflate(R.layout.new_mytaobao_pay_setting_page_item, (ViewGroup) null));
    }

    public void a(mvi mviVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b353170b", new Object[]{this, mviVar, new Integer(i)});
            return;
        }
        final PaySettingItem paySettingItem = this.c.get(i);
        d.a().a(mviVar, mviVar.d.getContext());
        if (paySettingItem.divider) {
            mviVar.f31281a.setVisibility(8);
            mviVar.b.setVisibility(0);
        } else {
            mviVar.f31281a.setVisibility(0);
            mviVar.b.setVisibility(8);
        }
        if (paySettingItem.itemTitle != null) {
            mviVar.d.setText(paySettingItem.itemTitle);
        } else {
            mviVar.d.setText("");
        }
        if (paySettingItem.itemSubtitle != null) {
            mviVar.e.setText(paySettingItem.itemSubtitle);
            mviVar.e.setVisibility(0);
        } else {
            mviVar.e.setVisibility(8);
        }
        if (paySettingItem.itemDesc != null) {
            mviVar.f.setText(paySettingItem.itemDesc);
            mviVar.f.setVisibility(0);
        } else {
            mviVar.f.setVisibility(8);
        }
        if (paySettingItem.redIcon) {
            mviVar.i.setVisibility(0);
        } else {
            mviVar.i.setVisibility(8);
        }
        if (paySettingItem.event != null && paySettingItem.event.size() > 0) {
            mviVar.h.setVisibility(0);
            mviVar.c.setTag(paySettingItem.itemTitle);
        } else {
            mviVar.h.setVisibility(4);
        }
        mviVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mytaobao.newsetting.adapter.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    mvo.a(a.a(a.this), paySettingItem.event);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<PaySettingItem> list = this.c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
