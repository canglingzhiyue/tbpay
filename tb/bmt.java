package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* loaded from: classes2.dex */
public class bmt extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "theme";
    public static final String TYPE_COLOR = "color";
    public static final String TYPE_GRADIENT = "gradient";
    public static final String TYPE_SIZE = "size";
    public static final String TYPE_STRING = "string";

    static {
        kge.a(-368921773);
    }

    public static /* synthetic */ Object ipc$super(bmt bmtVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            return a(objArr, dXRuntimeContext);
        } catch (Exception e) {
            UnifyLog.d("theme", String.valueOf(objArr), e.toString(), String.valueOf(dXRuntimeContext));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object a(java.lang.Object[] r7, com.taobao.android.dinamicx.DXRuntimeContext r8) throws java.lang.Exception {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.bmt.$ipChange
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
            java.lang.String r7 = "ebd01cf8"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            return r7
        L19:
            r0 = 0
            if (r7 == 0) goto Lde
            int r1 = r7.length
            if (r1 >= r4) goto L21
            goto Lde
        L21:
            if (r8 == 0) goto L42
            java.lang.Object r1 = r8.a()
            boolean r1 = r1 instanceof java.util.Map
            if (r1 == 0) goto L42
            java.lang.Object r8 = r8.a()
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r1 = "dianmicContextKeyPresenter"
            java.lang.Object r8 = r8.get(r1)
            boolean r1 = r8 instanceof com.alibaba.android.ultron.trade.presenter.b
            if (r1 == 0) goto L42
            com.alibaba.android.ultron.trade.presenter.b r8 = (com.alibaba.android.ultron.trade.presenter.b) r8
            tb.bnm r8 = r8.G()
            goto L43
        L42:
            r8 = r0
        L43:
            r1 = r7[r5]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3 = r7[r3]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7 = r7[r2]
            java.lang.String r7 = java.lang.String.valueOf(r7)
            if (r8 == 0) goto L5c
            java.util.List r8 = r8.a(r3)
            goto L5d
        L5c:
            r8 = r0
        L5d:
            java.lang.String r2 = "gradient"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L7d
            android.graphics.drawable.GradientDrawable r8 = com.alibaba.android.ultron.trade.utils.b.a(r8)
            if (r8 == 0) goto L6c
            return r8
        L6c:
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto Lde
            java.lang.String r8 = "\\|"
            java.lang.String[] r7 = r7.split(r8)
            android.graphics.drawable.GradientDrawable r7 = com.alibaba.android.ultron.trade.utils.b.a(r7)
            return r7
        L7d:
            java.lang.String r2 = "color"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L9d
            if (r8 == 0) goto L94
            int r1 = r8.size()
            if (r1 <= 0) goto L94
            java.lang.Object r8 = r8.get(r5)
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
        L94:
            r8 = -1
            int r1 = com.alibaba.android.ultron.trade.utils.b.a(r0, r8)
            if (r1 == r8) goto L9c
            return r0
        L9c:
            return r7
        L9d:
            java.lang.String r2 = "size"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto Lbe
            if (r8 == 0) goto Lbd
            int r0 = r8.size()
            if (r0 <= 0) goto Lbd
            java.lang.Object r8 = r8.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = com.alibaba.android.ultron.trade.utils.c.a(r8)
            if (r0 == 0) goto Lbd
            java.lang.String r7 = com.alibaba.android.ultron.trade.utils.c.b(r8)
        Lbd:
            return r7
        Lbe:
            java.lang.String r2 = "string"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto Lde
            if (r8 == 0) goto Ld5
            int r1 = r8.size()
            if (r1 <= 0) goto Ld5
            java.lang.Object r8 = r8.get(r5)
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
        Ld5:
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 == 0) goto Ldc
            goto Ldd
        Ldc:
            r7 = r0
        Ldd:
            return r7
        Lde:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bmt.a(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
