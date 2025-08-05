package com.taobao.android.editionswitcher.boarding;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.boarding.LocaleModel;
import com.taobao.android.editionswitcher.boarding.g;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class f extends RecyclerView.Adapter<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<LocaleModel.LocaleData> f12276a;
    private g.a b;

    /* loaded from: classes5.dex */
    public class a extends RecyclerView.ViewHolder {
        static {
            kge.a(-545400080);
        }

        public a(View view) {
            super(view);
        }
    }

    static {
        kge.a(-1335011355);
    }

    public static /* synthetic */ g.a a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g.a) ipChange.ipc$dispatch("f6078ee0", new Object[]{fVar}) : fVar.b;
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

    /* JADX WARN: Type inference failed for: r4v5, types: [android.support.v7.widget.RecyclerView$ViewHolder, com.taobao.android.editionswitcher.boarding.f$a] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public f(List<LocaleModel.LocaleData> list) {
        this.f12276a = list;
    }

    public void a(g.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ff6e05", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public a a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("588e79ba", new Object[]{this, viewGroup, new Integer(i)}) : new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ovs_locale_item, viewGroup, false));
    }

    public void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5088a5d", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        final LocaleModel.LocaleData localeData = this.f12276a.get(i);
        ImageView imageView = (ImageView) aVar.itemView.findViewById(R.id.select_img);
        ((TextView) aVar.itemView.findViewById(R.id.text)).setText(localeData.value);
        if (localeData.selected) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.editionswitcher.boarding.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (f.a(f.this) == null) {
                } else {
                    f.a(f.this).a(localeData);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.f12276a.size();
    }
}
