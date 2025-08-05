package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.android.detail.ttdetail.widget.desc.image.d;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;
import tb.szp;

/* loaded from: classes5.dex */
public class k extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.o> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout g;
    private TextView h;
    private DetailImageView i;
    private int j;
    private com.taobao.android.detail.ttdetail.widget.desc.image.d k;

    static {
        kge.a(1228482889);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, oVar})).booleanValue() : c2(oVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, oVar}) : a2(oVar);
    }

    public k(Context context) {
        super(context);
        this.j = this.c.getDimensionPixelOffset(R.dimen.tt_detail_desc_picwithtitle_picwidth);
        this.g = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_image_with_title, (ViewGroup) null);
        this.h = (TextView) this.g.findViewById(R.id.title);
        this.i = (DetailImageView) this.g.findViewById(R.id.image);
        this.k = new d.a().b(R.drawable.tt_detail_img_load_fail).a(R.drawable.tt_detail_img_load_fail).c(ImageView.ScaleType.CENTER_CROP).a();
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("1697ddd7", new Object[]{this, oVar}) : this.g;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a01b96", new Object[]{this, oVar});
            return;
        }
        String str = oVar.f10885a;
        final String str2 = oVar.b;
        if (!TextUtils.isEmpty(str)) {
            this.h.setText(str);
            this.h.setVisibility(0);
        }
        DetailImageView detailImageView = this.i;
        int i = this.j;
        a(detailImageView, str2, new com.taobao.android.detail.ttdetail.widget.desc.image.g(i, i), null, this.k);
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                com.taobao.android.detail.ttdetail.widget.desc.picgallery.c cVar = new com.taobao.android.detail.ttdetail.widget.desc.picgallery.c();
                cVar.f11018a = true;
                cVar.c = 0;
                cVar.f = view;
                ArrayList<String> arrayList = new ArrayList<>(1);
                arrayList.add(com.taobao.android.detail.ttdetail.widget.desc.image.h.a(k.this.f10821a, str2, 430));
                cVar.e.add(str2);
                cVar.a(arrayList);
                com.taobao.android.detail.ttdetail.communication.c.a(k.this.f10821a, new szp(cVar));
            }
        });
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("354e465b", new Object[]{this, oVar})).booleanValue() : oVar.b == null;
    }
}
