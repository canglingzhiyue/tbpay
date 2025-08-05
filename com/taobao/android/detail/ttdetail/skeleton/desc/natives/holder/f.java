package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class f extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.f> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout g;
    private View h;
    private View i;
    private TextView j;

    static {
        kge.a(2007194793);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.f fVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19c0443", new Object[]{this, fVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, fVar})).booleanValue() : b2(fVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, fVar}) : a2(fVar);
    }

    public f(Context context) {
        super(context);
        this.g = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_divider, (ViewGroup) null);
        this.g.setBackgroundColor(this.c.getColor(R.color.tt_detail_e));
        this.h = this.g.findViewById(R.id.detail_main_divider_line_top);
        this.i = this.g.findViewById(R.id.detail_main_divider_blank);
        this.j = (TextView) this.g.findViewById(R.id.detail_main_divider_text);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.f fVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5be44e40", new Object[]{this, fVar});
        }
        this.g.setBackgroundColor(com.taobao.android.detail.ttdetail.utils.w.a(fVar.f10871a));
        int i2 = fVar.c;
        if (i2 == 100) {
            this.h.setVisibility(fVar.b == 0 ? 8 : 0);
            View view = this.i;
            if (fVar.b == 0) {
                i = 8;
            }
            view.setVisibility(i);
            ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (fVar.b * com.taobao.android.detail.ttdetail.utils.f.b);
            }
            this.i.setLayoutParams(layoutParams);
            this.j.setVisibility(8);
        } else if (i2 == 101) {
            this.j.setVisibility(0);
            this.i.setVisibility(8);
            if (!TextUtils.isEmpty(fVar.d)) {
                this.j.setText(fVar.d);
            }
        }
        return this.g;
    }
}
