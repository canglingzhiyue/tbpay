package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.text.Html;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.android.detail.ttdetail.widget.desc.image.d;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout g;
    private TextView h;
    private TextView i;
    private DetailImageView j;
    private com.taobao.android.detail.ttdetail.widget.desc.image.d k;

    static {
        kge.a(91010152);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, aVar})).booleanValue() : c2(aVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, aVar}) : a2(aVar);
    }

    public a(Context context) {
        super(context);
        this.g = (RelativeLayout) this.b.inflate(R.layout.tt_detail_desc_charity, (ViewGroup) null);
        this.h = (TextView) this.g.findViewById(R.id.title);
        this.i = (TextView) this.g.findViewById(R.id.text);
        this.j = (DetailImageView) this.g.findViewById(R.id.image);
        this.k = new d.a().b(R.drawable.tt_detail_img_load_fail).a(R.drawable.tt_detail_img_load_fail).c(ImageView.ScaleType.CENTER_CROP).a();
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bb47a925", new Object[]{this, aVar}) : this.g;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.a aVar) {
        TextView textView;
        TextView textView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199be64", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            String str = aVar.f10867a;
            String str2 = aVar.b;
            String str3 = aVar.c;
            if (!StringUtils.isEmpty(str) && (textView2 = this.h) != null) {
                textView2.setText(str);
                this.h.setVisibility(0);
            }
            if (!StringUtils.isEmpty(str2) && (textView = this.i) != null) {
                textView.setText(Html.fromHtml(str2));
                this.i.setVisibility(0);
            }
            a(this.j, str3, null, null, this.k);
        }
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3547e929", new Object[]{this, aVar})).booleanValue() : aVar.a();
    }
}
