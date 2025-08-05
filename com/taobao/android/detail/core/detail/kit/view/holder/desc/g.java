package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.epl;
import tb.epm;
import tb.kge;

/* loaded from: classes4.dex */
public class g extends b<com.taobao.android.detail.core.model.viewmodel.desc.h> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout k;
    private TextView l;
    private DetailImageView m;
    private int n;
    private epl o;

    static {
        kge.a(1267077595);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.ImageWithTitleViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((com.taobao.android.detail.core.model.viewmodel.desc.h) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, hVar})).booleanValue() : c2(hVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, hVar}) : a2(hVar);
    }

    public g(Activity activity) {
        super(activity);
        this.n = this.i.getDimensionPixelOffset(R.dimen.detail_desc_picwithtitle_picwidth);
        this.k = (LinearLayout) View.inflate(activity, R.layout.x_detail_desc_image_with_title, null);
        this.l = (TextView) this.k.findViewById(R.id.title);
        this.m = (DetailImageView) this.k.findViewById(R.id.image);
        this.o = new epl.a().b(R.drawable.detail_img_load_fail).a(R.drawable.detail_img_load_fail).c(ImageView.ScaleType.CENTER_CROP).a();
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.desc.h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("276f87b", new Object[]{this, hVar}) : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(com.taobao.android.detail.core.model.viewmodel.desc.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9466f7d8", new Object[]{this, hVar});
            return;
        }
        String str = hVar.f9753a;
        final String str2 = hVar.b;
        if (!TextUtils.isEmpty(str)) {
            this.l.setText(str);
            this.l.setVisibility(0);
        }
        DetailImageView detailImageView = this.m;
        int i = this.n;
        a(detailImageView, str2, new epm(i, i), null, this.o);
        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.desc.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                com.taobao.android.detail.core.event.params.c cVar = new com.taobao.android.detail.core.event.params.c();
                cVar.f9716a = true;
                cVar.c = 0;
                cVar.f = view;
                ArrayList<String> arrayList = new ArrayList<>(1);
                arrayList.add(com.taobao.android.detail.core.detail.kit.utils.g.a(g.this.g, str2, 430));
                cVar.e.add(str2);
                cVar.a(arrayList);
                com.taobao.android.trade.event.f.a(g.this.g, new com.taobao.android.detail.core.event.basic.o(cVar));
            }
        });
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.core.model.viewmodel.desc.h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a6ac33b", new Object[]{this, hVar})).booleanValue() : hVar.b == null;
    }
}
