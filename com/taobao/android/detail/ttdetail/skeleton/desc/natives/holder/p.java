package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.android.detail.ttdetail.widget.desc.image.d;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class p extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.p> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout g;
    private DetailImageView h;
    private int i;

    static {
        kge.a(-537119159);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, pVar})).booleanValue() : c2(pVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, pVar}) : a2(pVar);
    }

    public p(Context context) {
        super(context);
        this.g = new LinearLayout(context);
        this.h = new DetailImageView(context);
        this.h.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.g.addView(this.h, new LinearLayout.LayoutParams(-2, -2));
        this.g.setBackgroundColor(this.c.getColor(R.color.tt_detail_white));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.p r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.p.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r2 = 1
            r1[r2] = r6
            java.lang.String r6 = "68fce577"
            r0.ipc$dispatch(r6, r1)
            return
        L15:
            android.content.Context r0 = r5.f10821a
            int r0 = com.taobao.android.detail.ttdetail.utils.f.a(r0)
            java.lang.String r1 = r6.d
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3f
            java.lang.String r1 = r6.d     // Catch: java.lang.Exception -> L3f
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.Exception -> L3f
            float r3 = (float) r0     // Catch: java.lang.Exception -> L3f
            float r3 = r3 * r1
            int r3 = (int) r3     // Catch: java.lang.Exception -> L3f
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = r4 / r1
            float r1 = r1 - r4
            r4 = 1077936128(0x40400000, float:3.0)
            int r4 = com.taobao.android.detail.ttdetail.utils.f.a(r4)     // Catch: java.lang.Exception -> L3f
            float r4 = (float) r4
            float r1 = r1 * r4
            int r1 = (int) r1
            int r1 = r3 - r1
            goto L40
        L3f:
            r1 = 0
        L40:
            java.lang.String r3 = r6.c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L52
            java.lang.String r6 = r6.c     // Catch: java.lang.Exception -> L52
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Exception -> L52
            float r2 = (float) r0
            float r2 = r2 * r6
            int r2 = (int) r2
        L52:
            if (r1 > 0) goto L55
            r1 = r0
        L55:
            if (r2 > 0) goto L5b
            int r0 = r0 * 19
            int r2 = r0 / 40
        L5b:
            com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView r6 = r5.h
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            r6.width = r1
            r6.height = r2
            r5.i = r1
            com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView r0 = r5.h
            r0.setLayoutParams(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.p.d(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.p):void");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9d1d9876", new Object[]{this, pVar}) : this.g;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a08ff5", new Object[]{this, pVar});
            return;
        }
        d(pVar);
        String str = pVar.f10886a;
        com.taobao.android.detail.ttdetail.widget.desc.image.d a2 = new d.a().b(R.drawable.tt_detail_img_load_fail).c(this.h.getScaleType()).a();
        DetailImageView detailImageView = this.h;
        int i = this.i;
        a(detailImageView, str, new com.taobao.android.detail.ttdetail.widget.desc.image.g(i, i), null, a2);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("354ebaba", new Object[]{this, pVar})).booleanValue() : pVar.f10886a == null;
    }
}
