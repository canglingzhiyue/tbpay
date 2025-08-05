package com.taobao.android.detail.mainpic.holder;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.widget.VesselViewRootLayout;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.vessel.VesselView;
import java.util.Map;
import tb.bny;
import tb.ets;
import tb.ett;
import tb.etu;
import tb.euw;
import tb.jpx;
import tb.rgu;
import tb.rgy;

/* loaded from: classes4.dex */
public class n extends com.alibaba.android.ultron.vfw.web.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.android.detail.mainpic.g i;
    public int j;
    public VesselViewRootLayout k;
    public boolean l;

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1636691102) {
            if (hashCode != 91915241) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.b();
            return null;
        }
        return super.a((String) objArr[0], (JSONObject) objArr[1]);
    }

    public static /* synthetic */ VesselView a(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("a30376e1", new Object[]{nVar}) : nVar.e;
    }

    public static /* synthetic */ VesselView b(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("bc04c880", new Object[]{nVar}) : nVar.e;
    }

    public static /* synthetic */ String c(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4e2af8db", new Object[]{nVar}) : nVar.h;
    }

    public static /* synthetic */ bny d(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bny) ipChange.ipc$dispatch("507fe353", new Object[]{nVar}) : nVar.f2738a;
    }

    public static /* synthetic */ bny e(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bny) ipChange.ipc$dispatch("51b63632", new Object[]{nVar}) : nVar.f2738a;
    }

    public static /* synthetic */ VesselView f(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("200a0efc", new Object[]{nVar}) : nVar.e;
    }

    public static /* synthetic */ String g(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f6e91957", new Object[]{nVar}) : nVar.h;
    }

    public static /* synthetic */ bny h(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bny) ipChange.ipc$dispatch("55592ecf", new Object[]{nVar}) : nVar.f2738a;
    }

    public static /* synthetic */ bny i(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bny) ipChange.ipc$dispatch("568f81ae", new Object[]{nVar}) : nVar.f2738a;
    }

    public n(bny bnyVar, String str, com.taobao.android.detail.mainpic.g gVar) {
        super(bnyVar, str);
        this.j = -1;
        this.l = false;
        this.i = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.alibaba.android.ultron.vfw.web.d, com.alibaba.android.ultron.vfw.viewholder.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View a(android.view.ViewGroup r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.mainpic.holder.n.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "fb64bd29"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            android.view.View r5 = (android.view.View) r5
            return r5
        L18:
            com.taobao.android.detail.mainpic.widget.VesselViewRootLayout r0 = new com.taobao.android.detail.mainpic.widget.VesselViewRootLayout
            tb.bny r1 = r4.f2738a
            android.content.Context r1 = r1.k()
            r0.<init>(r1)
            r4.k = r0
            com.taobao.android.detail.mainpic.widget.VesselViewRootLayout r0 = r4.k
            com.taobao.android.detail.mainpic.g r1 = r4.i
            r0.setNewMainPicInstance(r1)
            com.taobao.vessel.VesselView r0 = new com.taobao.vessel.VesselView
            tb.bny r1 = r4.f2738a
            android.content.Context r1 = r1.k()
            r0.<init>(r1)
            r4.e = r0
            java.lang.String r0 = r4.g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L4c
            tb.bny r5 = r4.f2738a
            android.content.Context r5 = r5.k()
            android.view.View r5 = tb.bpl.a(r5)
            return r5
        L4c:
            java.lang.String r0 = r4.g
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "height"
            java.lang.String r1 = r0.getQueryParameter(r1)
            java.lang.String r2 = "width"
            java.lang.String r0 = r0.getQueryParameter(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = -1
            if (r2 != 0) goto L6b
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L6b
            goto L6c
        L6b:
            r1 = -1
        L6c:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L77
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L77
            goto L78
        L77:
            r0 = -1
        L78:
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r3, r3)
            if (r1 <= 0) goto L91
            float r1 = (float) r1
            java.lang.Float r3 = com.taobao.android.detail.mainpic.holder.n.FLOAT_MAX_WIDTH
            float r3 = r3.floatValue()
            float r1 = r1 / r3
            int r3 = r5.getWidth()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            r2.height = r1
        L91:
            if (r0 <= 0) goto Lab
            r1 = 375(0x177, float:5.25E-43)
            if (r0 <= r1) goto L99
            r0 = 375(0x177, float:5.25E-43)
        L99:
            float r0 = (float) r0
            java.lang.Float r1 = com.taobao.android.detail.mainpic.holder.n.FLOAT_MAX_WIDTH
            float r1 = r1.floatValue()
            float r0 = r0 / r1
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r0 = r0 * r5
            int r5 = (int) r0
            r2.width = r5
        Lab:
            com.taobao.vessel.VesselView r5 = r4.e
            r5.setLayoutParams(r2)
            com.taobao.vessel.VesselView r5 = r4.e
            r0 = 4
            r5.setVisibility(r0)
            com.taobao.android.detail.mainpic.widget.VesselViewRootLayout r5 = r4.k
            com.taobao.vessel.VesselView r0 = r4.e
            r5.addView(r0)
            com.taobao.android.detail.mainpic.widget.VesselViewRootLayout r5 = r4.k
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.mainpic.holder.n.a(android.view.ViewGroup):android.view.View");
    }

    @Override // com.alibaba.android.ultron.vfw.web.d, com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else if (this.e == null || iDMComponent == null || this.g == null) {
        } else {
            this.l = false;
            String a2 = a(this.g, iDMComponent);
            if (a2 != null && a2.equals(this.h)) {
                return;
            }
            this.h = a2;
            this.f = new com.alibaba.android.ultron.vfw.web.b(this.f2738a);
            this.f.a(iDMComponent);
            this.e.setVesselViewCallback(this.f);
            this.e.loadUrl(a2);
            this.e.setOnLoadListener(new rgu() { // from class: com.taobao.android.detail.mainpic.holder.n.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rgu
                public void onLoadStart() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f829aa04", new Object[]{this});
                    }
                }

                @Override // tb.rgu
                public void onLoadFinish(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c38c0593", new Object[]{this, view});
                    } else if (n.this.l) {
                    } else {
                        n.a(n.this).setVisibility(0);
                    }
                }

                @Override // tb.rgu
                public void onLoadError(rgy rgyVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                        return;
                    }
                    n nVar = n.this;
                    nVar.l = true;
                    n.b(nVar).setVisibility(4);
                    if (rgyVar == null) {
                        return;
                    }
                    euw.a(n.this.i, n.c(n.this), rgyVar.f33150a, rgyVar.b, rgyVar.c);
                    if (!jpx.a(n.d(n.this).k())) {
                        return;
                    }
                    Context k = n.e(n.this).k();
                    Toast.makeText(k, "头图第" + (n.this.i.q() + 1) + "帧weex浮层渲染失败，原因：" + rgyVar.b, 1).show();
                }

                @Override // tb.rgu
                public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                        return;
                    }
                    n nVar = n.this;
                    nVar.l = true;
                    n.f(nVar).setVisibility(4);
                    if (rgyVar == null) {
                        return;
                    }
                    euw.a(n.this.i, n.g(n.this), rgyVar.f33150a, rgyVar.b, rgyVar.c);
                    if (!jpx.a(n.h(n.this).k())) {
                        return;
                    }
                    Context k = n.i(n.this).k();
                    Toast.makeText(k, "头图第" + (n.this.i.q() + 1) + "帧weex浮层渲染失败，原因：" + rgyVar.b, 1).show();
                }
            });
        }
    }

    private String a(String str, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eb05f27e", new Object[]{this, str, iDMComponent}) : ets.a().a(new ett()).a(new etu(this.i, this.e)).a(str, iDMComponent, this);
    }

    @Override // com.alibaba.android.ultron.vfw.web.d
    public String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9e721362", new Object[]{this, str, jSONObject}) : super.a(str, jSONObject);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        this.j = this.i.q();
    }
}
