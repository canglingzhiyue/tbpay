package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class s extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.s> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private TextView k;

    static {
        kge.a(-978043579);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.s sVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a1ed16", new Object[]{this, sVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.s sVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, sVar})).booleanValue() : b2(sVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.s sVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, sVar}) : a2(sVar);
    }

    public s(Context context) {
        super(context);
        this.g = LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_miaoshifu, (ViewGroup) null);
        this.h = (ImageView) this.g.findViewById(R.id.icon);
        this.i = (TextView) this.g.findViewById(R.id.title);
        this.j = (TextView) this.g.findViewById(R.id.subtitle);
        this.k = (TextView) this.g.findViewById(R.id.tips);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("30aec853", new Object[]{this, sVar});
        }
        if (!StringUtils.isEmpty(sVar.f10892a)) {
            com.taobao.android.detail.ttdetail.utils.q.a(this.h, sVar.f10892a);
        }
        if (!StringUtils.isEmpty(sVar.b)) {
            this.i.setText(sVar.b);
        } else {
            this.i.setVisibility(8);
        }
        if (!StringUtils.isEmpty(sVar.c)) {
            this.j.setText(sVar.c);
        } else {
            this.j.setVisibility(8);
        }
        if (!StringUtils.isEmpty(sVar.d)) {
            this.k.setText(sVar.d);
        }
        if (!StringUtils.isEmpty(sVar.e)) {
            final String str = sVar.e;
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.s.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", (Object) str);
                    com.taobao.android.detail.ttdetail.communication.c.a(s.this.f10821a, new com.taobao.android.detail.ttdetail.bizmessage.h("open_url", jSONObject, new RuntimeAbilityParam("appendURLParamsOnly", true)));
                }
            });
        }
        return this.g;
    }
}
