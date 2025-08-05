package com.taobao.android.detail.alittdetail.share;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.u;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openShare";
    public static final String EVENT_TYPE_ALTERNATIVE = "share";

    /* renamed from: a  reason: collision with root package name */
    private final int f9359a;
    private final int b;
    private Context c;
    private eyx d;

    static {
        kge.a(-180828070);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(Context context, eyx eyxVar) {
        super(context, eyxVar);
        this.f9359a = 0;
        this.b = 4;
        this.c = context;
        this.d = eyxVar;
    }

    private boolean a(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fa4e5f2", new Object[]{this, runtimeAbilityParamArr})).booleanValue();
        }
        if (runtimeAbilityParamArr == null) {
            return false;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("shareFromSku".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof Boolean) {
                    return ((Boolean) value).booleanValue();
                }
            }
        }
        return false;
    }

    private View b(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("44bb524f", new Object[]{this, runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("shareContainer".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof View) {
                    return (View) value;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.u, tb.ezm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a r9, com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam... r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.alittdetail.share.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r9
            r9 = 2
            r1[r9] = r10
            java.lang.String r9 = "bbeca8d7"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L1f:
            if (r9 != 0) goto L22
            return r3
        L22:
            com.alibaba.fastjson.JSONObject r9 = r9.b()
            boolean r0 = r8.a(r10)
            if (r0 == 0) goto L36
            tb.eyx r0 = r8.d
            android.view.View r10 = r8.b(r10)
            com.taobao.android.detail.alittdetail.share.b.a(r0, r9, r10)
            return r2
        L36:
            if (r9 == 0) goto L49
            java.lang.String r10 = "iconType"
            java.lang.String r10 = r9.getString(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L49
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Throwable -> L49
            goto L4a
        L49:
            r10 = 0
        L4a:
            com.taobao.android.detail.alittdetail.share.b$b r0 = new com.taobao.android.detail.alittdetail.share.b$b
            r0.<init>()
            java.lang.String r1 = "想告诉谁"
            com.taobao.android.detail.alittdetail.share.b$b r0 = r0.c(r1)
            java.lang.String r1 = ""
            if (r9 == 0) goto L78
            java.lang.String r4 = "detailShareParams"
            com.alibaba.fastjson.JSONObject r9 = r9.getJSONObject(r4)
            if (r9 == 0) goto L78
            java.lang.String r4 = "share_businessId"
            java.lang.String r5 = r9.getString(r4)
            r9.remove(r4)
            java.lang.String r4 = "share_imageUrl"
            java.lang.String r6 = r9.getString(r4)
            r9.remove(r4)
            r0.a(r9)
            goto L7a
        L78:
            r5 = r1
            r6 = r5
        L7a:
            r9 = 4
            if (r9 != r10) goto Lac
            java.util.Locale r9 = java.util.Locale.CHINA
            java.lang.Object[] r10 = new java.lang.Object[r2]
            tb.eyx r4 = r8.d
            tb.eyz r4 = r4.a()
            java.lang.Class<com.taobao.android.detail.ttdetail.data.meta.Item> r7 = com.taobao.android.detail.ttdetail.data.meta.Item.class
            com.taobao.android.detail.ttdetail.data.meta.Merged r4 = r4.a(r7)
            com.taobao.android.detail.ttdetail.data.meta.Item r4 = (com.taobao.android.detail.ttdetail.data.meta.Item) r4
            java.lang.String r1 = com.taobao.android.detail.ttdetail.utils.d.d(r4, r1)
            r10[r3] = r1
            java.lang.String r1 = "我剁手都要买的宝贝（%s），快来和我一起瓜分红包"
            java.lang.String r9 = java.lang.String.format(r9, r1, r10)
            com.taobao.android.detail.alittdetail.share.b$b r9 = r0.d(r9)
            java.lang.String r10 = "true"
            com.taobao.android.detail.alittdetail.share.b$b r9 = r9.a(r10)
            java.lang.String r10 = "baobeixiangqingfenxiang"
            r9.b(r10)
        Lac:
            java.lang.String r9 = r0.b
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto Lc7
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 != 0) goto Lc7
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            if (r9 != 0) goto Lc7
            com.taobao.android.detail.alittdetail.share.b$b r9 = r0.b(r5)
            r9.e(r6)
        Lc7:
            tb.eyx r9 = r8.d
            com.taobao.android.detail.alittdetail.share.b.a(r9, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.alittdetail.share.a.a(com.taobao.android.detail.ttdetail.handler.event.a, com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[]):boolean");
    }
}
