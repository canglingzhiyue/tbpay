package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bml extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "theme";
    public static final String TYPE_COLOR = "color";
    public static final String TYPE_GRADIENT = "gradient";
    public static final String TYPE_SIZE = "size";
    public static final String TYPE_STRING = "string";

    static {
        kge.a(2134232474);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    @Override // tb.fnl, tb.fnp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.util.List r7, tb.fpd r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.bml.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r6
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r7 = "1fe05363"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            return r7
        L19:
            r0 = 0
            if (r7 == 0) goto Lde
            int r1 = r7.size()
            if (r1 >= r4) goto L24
            goto Lde
        L24:
            if (r8 == 0) goto L45
            java.lang.Object r1 = r8.d()
            boolean r1 = r1 instanceof java.util.Map
            if (r1 == 0) goto L45
            java.lang.Object r8 = r8.d()
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r1 = "dianmicContextKeyPresenter"
            java.lang.Object r8 = r8.get(r1)
            boolean r1 = r8 instanceof com.alibaba.android.ultron.trade.presenter.b
            if (r1 == 0) goto L45
            com.alibaba.android.ultron.trade.presenter.b r8 = (com.alibaba.android.ultron.trade.presenter.b) r8
            tb.bnm r8 = r8.G()
            goto L46
        L45:
            r8 = r0
        L46:
            java.lang.Object r1 = r7.get(r5)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object r7 = r7.get(r2)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            if (r8 == 0) goto L65
            java.util.List r8 = r8.a(r3)
            goto L66
        L65:
            r8 = r0
        L66:
            java.lang.String r2 = "gradient"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L86
            android.graphics.drawable.GradientDrawable r8 = com.alibaba.android.ultron.trade.utils.b.a(r8)
            if (r8 == 0) goto L75
            return r8
        L75:
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto Lde
            java.lang.String r8 = "\\|"
            java.lang.String[] r7 = r7.split(r8)
            android.graphics.drawable.GradientDrawable r7 = com.alibaba.android.ultron.trade.utils.b.a(r7)
            return r7
        L86:
            java.lang.String r2 = "color"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto La6
            if (r8 == 0) goto L9d
            int r1 = r8.size()
            if (r1 <= 0) goto L9d
            java.lang.Object r8 = r8.get(r5)
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
        L9d:
            r8 = -1
            int r1 = com.alibaba.android.ultron.trade.utils.b.a(r0, r8)
            if (r1 == r8) goto La5
            return r0
        La5:
            return r7
        La6:
            java.lang.String r2 = "size"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto Lc7
            if (r8 == 0) goto Lc6
            int r0 = r8.size()
            if (r0 <= 0) goto Lc6
            java.lang.Object r8 = r8.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = com.alibaba.android.ultron.trade.utils.c.a(r8)
            if (r0 == 0) goto Lc6
            java.lang.String r7 = com.alibaba.android.ultron.trade.utils.c.b(r8)
        Lc6:
            return r7
        Lc7:
            java.lang.String r7 = "string"
            boolean r7 = r7.equalsIgnoreCase(r1)
            if (r7 == 0) goto Lde
            if (r8 == 0) goto Lde
            int r7 = r8.size()
            if (r7 <= 0) goto Lde
            java.lang.Object r7 = r8.get(r5)
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
        Lde:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bml.a(java.util.List, tb.fpd):java.lang.Object");
    }
}
