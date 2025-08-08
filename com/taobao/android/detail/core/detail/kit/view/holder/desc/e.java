package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class e extends b<com.taobao.android.detail.core.model.viewmodel.desc.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView k;

    static {
        kge.a(982410272);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.FullTextViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((com.taobao.android.detail.core.model.viewmodel.desc.b) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, bVar})).booleanValue() : c2(bVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, bVar}) : a2(bVar);
    }

    public e(Activity activity) {
        super(activity);
        this.k = new TextView(this.g);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.desc.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("db5498c1", new Object[]{this, bVar}) : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(com.taobao.android.detail.core.model.viewmodel.desc.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94643d9e", new Object[]{this, bVar});
            return;
        }
        String str = bVar.b;
        String str2 = bVar.f9744a;
        String str3 = bVar.c;
        int i = bVar.e;
        int i2 = bVar.h;
        int i3 = bVar.f;
        this.k.setText(str);
        if (i2 > 0 || i2 == -1 || i2 == -2) {
            ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, i2);
            }
            layoutParams.height = i2;
            this.k.setLayoutParams(layoutParams);
        }
        if (!StringUtils.isEmpty(str2)) {
            this.k.setTextColor(com.taobao.android.detail.core.utils.c.a(str2));
        }
        if (!StringUtils.isEmpty(str3)) {
            this.k.setBackgroundColor(com.taobao.android.detail.core.utils.c.a(str3));
        }
        if (i3 > 0) {
            this.k.setTextSize(0, i3);
        }
        if (i == 0) {
            this.k.setGravity(17);
        } else if (i == 1) {
            this.k.setGravity(21);
        } else if (i != 2) {
        } else {
            this.k.setGravity(19);
        }
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.core.model.viewmodel.desc.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a680901", new Object[]{this, bVar})).booleanValue() : StringUtils.isEmpty(bVar.b);
    }
}
