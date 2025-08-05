package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class h extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.h> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView g;

    static {
        kge.a(-460642802);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, hVar})).booleanValue() : c2(hVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, hVar}) : a2(hVar);
    }

    public h(Context context) {
        super(context);
        this.g = new TextView(this.f10821a);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("68efc37e", new Object[]{this, hVar}) : this.g;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19cecfd", new Object[]{this, hVar});
            return;
        }
        String str = hVar.b;
        String str2 = hVar.f10873a;
        String str3 = hVar.c;
        int i = hVar.e;
        int i2 = hVar.h;
        int i3 = hVar.f;
        this.g.setText(str);
        if (i2 > 0 || i2 == -1 || i2 == -2) {
            ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, i2);
            }
            layoutParams.height = i2;
            this.g.setLayoutParams(layoutParams);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.g.setTextColor(com.taobao.android.detail.ttdetail.utils.w.a(str2));
        }
        if (!TextUtils.isEmpty(str3)) {
            this.g.setBackgroundColor(com.taobao.android.detail.ttdetail.utils.w.a(str3));
        }
        if (i3 > 0) {
            this.g.setTextSize(0, i3);
        }
        if (i == 0) {
            this.g.setGravity(17);
        } else if (i == 1) {
            this.g.setGravity(21);
        } else if (i != 2) {
        } else {
            this.g.setGravity(19);
        }
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("354b17c2", new Object[]{this, hVar})).booleanValue() : TextUtils.isEmpty(hVar.b);
    }
}
