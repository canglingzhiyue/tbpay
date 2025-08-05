package com.taobao.taobao.setting.item;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;
import tb.tjs;
import tb.tju;

/* loaded from: classes8.dex */
public class b extends RecyclerView.Adapter<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f21299a;
    private LayoutInflater b;
    private List<PaySettingItem> c;

    public static /* synthetic */ Context a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("49655bc", new Object[]{bVar}) : bVar.f21299a;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, aVar, new Integer(i)});
        } else {
            a(aVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.taobao.setting.item.a, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public b(Context context) {
        this.f21299a = context;
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

    public a a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5a9581d7", new Object[]{this, viewGroup, new Integer(i)}) : new a(this.b.inflate(R.layout.pay_setting_page_item, (ViewGroup) null));
    }

    public void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09db13e", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        final PaySettingItem paySettingItem = this.c.get(i);
        tjs.a().a(aVar, aVar.d.getContext());
        if (paySettingItem.divider) {
            aVar.f21298a.setVisibility(8);
            aVar.b.setVisibility(0);
        } else {
            aVar.f21298a.setVisibility(0);
            aVar.b.setVisibility(8);
        }
        if (paySettingItem.itemTitle != null) {
            aVar.d.setText(paySettingItem.itemTitle);
        } else {
            aVar.d.setText("");
        }
        if (paySettingItem.itemSubtitle != null) {
            aVar.e.setText(paySettingItem.itemSubtitle);
            aVar.e.setVisibility(0);
        } else {
            aVar.e.setVisibility(8);
        }
        if (paySettingItem.itemDesc != null) {
            aVar.f.setText(paySettingItem.itemDesc);
            aVar.f.setVisibility(0);
        } else {
            aVar.f.setVisibility(8);
        }
        if (paySettingItem.redIcon) {
            aVar.h.setVisibility(0);
        } else {
            aVar.h.setVisibility(8);
        }
        if (paySettingItem.event != null && paySettingItem.event.size() > 0) {
            aVar.g.setVisibility(0);
            aVar.c.setTag(paySettingItem.itemTitle);
        } else {
            aVar.g.setVisibility(4);
        }
        aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taobao.setting.item.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    tju.a(b.a(b.this), paySettingItem.event);
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
