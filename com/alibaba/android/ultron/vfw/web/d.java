package com.alibaba.android.ultron.vfw.web;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.vessel.VesselView;
import java.util.Map;
import tb.bmc;
import tb.bny;
import tb.kge;

/* loaded from: classes2.dex */
public class d extends com.alibaba.android.ultron.vfw.viewholder.b implements bmc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Float FLOAT_MAX_WIDTH;
    public static final int INT_MAX_WIDTH = 375;
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_USE_BRIDGE = "useBridge";
    public static final String KEY_WIDTH = "width";
    public VesselView e;
    public b f;
    public String g;
    public String h;

    static {
        kge.a(587981736);
        kge.a(372985376);
        FLOAT_MAX_WIDTH = Float.valueOf(375.0f);
    }

    public d(bny bnyVar, String str) {
        super(bnyVar);
        this.g = str;
        if (this.f2738a != null) {
            this.f2738a.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View a(final android.view.ViewGroup r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.ultron.vfw.web.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "fb64bd29"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            android.view.View r5 = (android.view.View) r5
            return r5
        L18:
            com.taobao.vessel.VesselView r0 = new com.taobao.vessel.VesselView
            tb.bny r1 = r4.f2738a
            android.content.Context r1 = r1.k()
            r0.<init>(r1)
            r4.e = r0
            com.taobao.vessel.VesselView r0 = r4.e
            tb.bny r1 = r4.f2738a
            java.lang.String r1 = r1.r()
            java.lang.String r3 = "doNotCallWebCoreDestroy"
            boolean r1 = tb.jqi.a(r1, r3, r2)
            r0.setDoNotCallCoreDestroy(r1)
            java.lang.String r0 = r4.g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L49
            tb.bny r5 = r4.f2738a
            android.content.Context r5 = r5.k()
            android.view.View r5 = tb.bpl.a(r5)
            return r5
        L49:
            java.lang.String r0 = r4.g
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "height"
            java.lang.String r1 = r0.getQueryParameter(r1)
            java.lang.String r2 = "width"
            java.lang.String r0 = r0.getQueryParameter(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = -1
            if (r2 != 0) goto L68
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L68
            goto L69
        L68:
            r1 = -1
        L69:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L74
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L74
            goto L75
        L74:
            r0 = -1
        L75:
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r3, r3)
            if (r1 <= 0) goto L8e
            float r1 = (float) r1
            java.lang.Float r3 = com.alibaba.android.ultron.vfw.web.d.FLOAT_MAX_WIDTH
            float r3 = r3.floatValue()
            float r1 = r1 / r3
            int r3 = r5.getWidth()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            r2.height = r1
        L8e:
            if (r0 <= 0) goto La8
            r1 = 375(0x177, float:5.25E-43)
            if (r0 <= r1) goto L96
            r0 = 375(0x177, float:5.25E-43)
        L96:
            float r0 = (float) r0
            java.lang.Float r1 = com.alibaba.android.ultron.vfw.web.d.FLOAT_MAX_WIDTH
            float r1 = r1.floatValue()
            float r0 = r0 / r1
            int r1 = r5.getWidth()
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.width = r0
        La8:
            com.taobao.vessel.VesselView r0 = r4.e
            r0.setLayoutParams(r2)
            com.taobao.vessel.VesselView r0 = r4.e
            com.alibaba.android.ultron.vfw.web.d$1 r1 = new com.alibaba.android.ultron.vfw.web.d$1
            r1.<init>()
            r0.setComputeScreenAdapter(r1)
            com.taobao.vessel.VesselView r5 = r4.e
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.web.d.a(android.view.ViewGroup):android.view.View");
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else if (this.e == null || iDMComponent == null || this.g == null) {
        } else {
            JSONObject fields = iDMComponent.getFields();
            String str = this.g;
            if (fields != null) {
                str = a(str, fields);
            }
            if (str != null && str.equals(this.h)) {
                return;
            }
            this.h = str;
            this.f = new b(this.f2738a);
            this.f.a(iDMComponent);
            this.e.setVesselViewCallback(this.f);
            this.e.loadUrl(str);
            if (this.e.findViewWithTag("WebMaskView") != null) {
                return;
            }
            this.e.setOnLoadListener(new c(new WebMaskView(this.e, str), str, this.f2738a.r()));
        }
    }

    public String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e721362", new Object[]{this, str, jSONObject});
        }
        if (jSONObject == null) {
            return str;
        }
        if (jSONObject.containsKey(KEY_USE_BRIDGE) && Boolean.TRUE.toString().equals(jSONObject.getString(KEY_USE_BRIDGE))) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return null;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null) {
                buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return buildUpon.build().toString();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.f2738a != null) {
            this.f2738a.b(this);
        }
        VesselView vesselView = this.e;
        if (vesselView == null) {
            return;
        }
        vesselView.onDestroy();
    }
}
