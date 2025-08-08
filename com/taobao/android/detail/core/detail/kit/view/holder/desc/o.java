package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import tb.dzh;
import tb.enu;
import tb.kge;

/* loaded from: classes4.dex */
public class o extends b<com.taobao.android.detail.core.model.viewmodel.desc.l> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View k;
    private DetailImageView l;
    private TextView m;
    private TextView n;
    private TextView o;

    static {
        kge.a(2116547827);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.core.model.viewmodel.desc.l lVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.core.model.viewmodel.desc.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9468c958", new Object[]{this, lVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.ServiceViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, lVar})).booleanValue() : b2(lVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, lVar}) : a2(lVar);
    }

    public o(Activity activity) {
        super(activity);
        this.k = View.inflate(activity, R.layout.x_detail_desc_miaoshifu, null);
        this.l = (DetailImageView) this.k.findViewById(R.id.icon);
        this.m = (TextView) this.k.findViewById(R.id.title);
        this.n = (TextView) this.k.findViewById(R.id.subtitle);
        this.o = (TextView) this.k.findViewById(R.id.tips);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(final com.taobao.android.detail.core.model.viewmodel.desc.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1c8de2f7", new Object[]{this, lVar});
        }
        if (!StringUtils.isEmpty(lVar.f9760a)) {
            com.taobao.android.detail.core.detail.kit.utils.f.a(this.g).a(this.l, lVar.f9760a);
        }
        if (!StringUtils.isEmpty(lVar.b)) {
            this.m.setText(lVar.b);
        } else {
            this.m.setVisibility(8);
        }
        if (!StringUtils.isEmpty(lVar.c)) {
            this.n.setText(lVar.c);
        } else {
            this.n.setVisibility(8);
        }
        if (!StringUtils.isEmpty(lVar.d)) {
            this.o.setText(lVar.d);
        }
        if (!StringUtils.isEmpty(lVar.e)) {
            final String str = lVar.e;
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.desc.o.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    com.taobao.android.trade.event.f.a(o.this.g, new enu(str));
                    dzh.b(o.this.g, lVar.t);
                }
            });
        }
        return this.k;
    }
}
