package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import tb.epl;
import tb.epm;
import tb.kge;

/* loaded from: classes4.dex */
public class l extends b<com.taobao.android.detail.core.model.viewmodel.desc.i> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout k;
    private DetailImageView l;
    private int m;

    static {
        kge.a(-1090063497);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.PictureJumperViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((com.taobao.android.detail.core.model.viewmodel.desc.i) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, iVar})).booleanValue() : c2(iVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, iVar}) : a2(iVar);
    }

    public l(Activity activity) {
        super(activity);
        this.k = new LinearLayout(activity);
        this.l = new DetailImageView(activity);
        this.l.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.k.addView(this.l, new LinearLayout.LayoutParams(-2, -2));
        this.k.setBackgroundColor(this.i.getColor(R.color.detail_white));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(com.taobao.android.detail.core.model.viewmodel.desc.i r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.core.detail.kit.view.holder.desc.l.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r2 = 1
            r1[r2] = r6
            java.lang.String r6 = "a06f02f5"
            r0.ipc$dispatch(r6, r1)
            return
        L15:
            int r0 = tb.epo.b
            java.lang.String r1 = r6.d
            boolean r1 = android.text.StringUtils.isEmpty(r1)
            if (r1 != 0) goto L36
            java.lang.String r1 = r6.d     // Catch: java.lang.Exception -> L36
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.Exception -> L36
            float r3 = (float) r0     // Catch: java.lang.Exception -> L36
            float r3 = r3 * r1
            int r3 = (int) r3     // Catch: java.lang.Exception -> L36
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = r4 / r1
            float r1 = r1 - r4
            float r4 = tb.dzc.ITEM_PADDING_RIGHT     // Catch: java.lang.Exception -> L36
            float r1 = r1 * r4
            int r1 = (int) r1
            int r1 = r3 - r1
            goto L37
        L36:
            r1 = 0
        L37:
            java.lang.String r3 = r6.c
            boolean r3 = android.text.StringUtils.isEmpty(r3)
            if (r3 != 0) goto L49
            java.lang.String r6 = r6.c     // Catch: java.lang.Exception -> L49
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Exception -> L49
            float r2 = (float) r0
            float r2 = r2 * r6
            int r2 = (int) r2
        L49:
            if (r1 > 0) goto L4c
            r1 = r0
        L4c:
            if (r2 > 0) goto L52
            int r0 = r0 * 19
            int r2 = r0 / 40
        L52:
            com.taobao.android.detail.datasdk.protocol.image.DetailImageView r6 = r5.l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            r6.width = r1
            r6.height = r2
            r5.m = r1
            com.taobao.android.detail.datasdk.protocol.image.DetailImageView r0 = r5.l
            r0.setLayoutParams(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.kit.view.holder.desc.l.d(com.taobao.android.detail.core.model.viewmodel.desc.i):void");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.desc.i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("88fcb31a", new Object[]{this, iVar}) : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(com.taobao.android.detail.core.model.viewmodel.desc.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94676c37", new Object[]{this, iVar});
            return;
        }
        d(iVar);
        String str = iVar.f9754a;
        epl a2 = new epl.a().b(R.drawable.detail_img_load_fail).c(this.l.getScaleType()).a();
        DetailImageView detailImageView = this.l;
        int i = this.m;
        a(detailImageView, str, new epm(i, i), null, a2);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.core.model.viewmodel.desc.i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a6b379a", new Object[]{this, iVar})).booleanValue() : iVar.f9754a == null;
    }
}
