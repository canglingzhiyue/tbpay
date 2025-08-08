package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class lce extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBHOMETEXIUMASKINIT = 9104583122983972513L;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077 A[Catch: Throwable -> 0x008e, TryCatch #1 {Throwable -> 0x008e, blocks: (B:7:0x001f, B:12:0x0027, B:14:0x002d, B:15:0x0032, B:17:0x0038, B:20:0x0042, B:22:0x0048, B:32:0x0064, B:35:0x006b, B:37:0x0077, B:45:0x0088, B:28:0x0055), top: B:55:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    @Override // tb.fuf, tb.fut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r10, com.taobao.android.dinamicx.DXRuntimeContext r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.lce.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            if (r1 == 0) goto L1d
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r5] = r9
            r1[r4] = r10
            r1[r3] = r11
            java.lang.String r10 = "ccd8bd96"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            return r10
        L1d:
            if (r10 == 0) goto L90
            int r0 = r10.length     // Catch: java.lang.Throwable -> L8e
            if (r0 >= r2) goto L24
            goto L90
        L24:
            java.lang.String r0 = ""
            r1 = -1
            r2 = r10[r5]     // Catch: java.lang.NumberFormatException -> L53 java.lang.Throwable -> L8e
            boolean r2 = r2 instanceof java.lang.String     // Catch: java.lang.NumberFormatException -> L53 java.lang.Throwable -> L8e
            if (r2 == 0) goto L32
            r2 = r10[r5]     // Catch: java.lang.NumberFormatException -> L53 java.lang.Throwable -> L8e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L53 java.lang.Throwable -> L8e
            r0 = r2
        L32:
            r2 = r10[r4]     // Catch: java.lang.NumberFormatException -> L53 java.lang.Throwable -> L8e
            boolean r2 = r2 instanceof java.lang.String     // Catch: java.lang.NumberFormatException -> L53 java.lang.Throwable -> L8e
            if (r2 == 0) goto L41
            r2 = r10[r4]     // Catch: java.lang.NumberFormatException -> L53 java.lang.Throwable -> L8e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L53 java.lang.Throwable -> L8e
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L53 java.lang.Throwable -> L8e
            goto L42
        L41:
            r2 = -1
        L42:
            r7 = r10[r3]     // Catch: java.lang.NumberFormatException -> L51 java.lang.Throwable -> L8e
            boolean r7 = r7 instanceof java.lang.String     // Catch: java.lang.NumberFormatException -> L51 java.lang.Throwable -> L8e
            if (r7 == 0) goto L5f
            r10 = r10[r3]     // Catch: java.lang.NumberFormatException -> L51 java.lang.Throwable -> L8e
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.NumberFormatException -> L51 java.lang.Throwable -> L8e
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.NumberFormatException -> L51 java.lang.Throwable -> L8e
            goto L60
        L51:
            r10 = move-exception
            goto L55
        L53:
            r10 = move-exception
            r2 = -1
        L55:
            java.lang.String r3 = "InformationFlow_TB_AD"
            java.lang.String r7 = "TbHomeTexiuMaskInit"
            java.lang.String r8 = "parse int error"
            com.taobao.tao.log.TLog.loge(r3, r7, r8, r10)     // Catch: java.lang.Throwable -> L8e
        L5f:
            r10 = -1
        L60:
            if (r2 == r1) goto L8d
            if (r10 == r1) goto L8d
            boolean r3 = android.text.StringUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L6b
            goto L8d
        L6b:
            com.taobao.android.dinamicx.widget.DXWidgetNode r11 = r11.d()     // Catch: java.lang.Throwable -> L8e
            com.taobao.android.dinamicx.widget.DXWidgetNode r11 = r11.queryWidgetNodeByUserId(r0)     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r11 instanceof com.taobao.android.dinamicx.widget.DXSliderLayout     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L7e
            com.taobao.android.dinamicx.widget.DXSliderLayout r11 = (com.taobao.android.dinamicx.widget.DXSliderLayout) r11     // Catch: java.lang.Throwable -> L8e
            int r11 = r11.getPageIndex()     // Catch: java.lang.Throwable -> L8e
            goto L7f
        L7e:
            r11 = -1
        L7f:
            if (r11 != r1) goto L82
            return r6
        L82:
            if (r11 < r2) goto L87
            if (r11 > r10) goto L87
            goto L88
        L87:
            r4 = 0
        L88:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L8e
            return r10
        L8d:
            return r6
        L8e:
            r10 = move-exception
            goto L91
        L90:
            return r6
        L91:
            r10.printStackTrace()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lce.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
