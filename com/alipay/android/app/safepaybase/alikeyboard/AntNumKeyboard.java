package com.alipay.android.app.safepaybase.alikeyboard;

import android.content.Context;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class AntNumKeyboard extends AbstractKeyboard {
    public static final int FLAG_FLOAT = 3;
    public static final int FLAG_IDCARD = 2;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PHONE = 1;
    public static final int FLAG_SPWD = 4;
    public int c;

    public AntNumKeyboard(Context context, OnKeyboardListener onKeyboardListener) {
        this(context, onKeyboardListener, 0);
    }

    public AntNumKeyboard(Context context, OnKeyboardListener onKeyboardListener, int i) {
        this(context, onKeyboardListener, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AntNumKeyboard(final android.content.Context r11, com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener r12, int r13, boolean r14) {
        /*
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.c = r0
            r10.c = r13
            r10.b = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "flag: "
            r12.<init>(r0)
            r12.append(r13)
            java.lang.String r0 = ", showConfirm: "
            r12.append(r0)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            r0 = 2
            java.lang.String r1 = "AntNumKeyboard::init"
            com.alipay.android.app.safepaylog.utils.LogUtils.record(r0, r1, r12)
            r12 = 4
            r1 = 3
            r2 = 1
            if (r13 == 0) goto L31
            if (r13 == r2) goto L37
            if (r13 == r0) goto L35
            if (r13 == r1) goto L33
        L31:
            r6 = 3
            goto L38
        L33:
            r6 = 1
            goto L38
        L35:
            r6 = 2
            goto L38
        L37:
            r6 = 4
        L38:
            com.alipay.mobile.antui.keyboard.AUNumberKeyboardView r0 = new com.alipay.mobile.antui.keyboard.AUNumberKeyboardView
            r5 = 0
            r7 = r14 ^ 1
            r8 = 2
            com.alipay.android.app.safepaybase.alikeyboard.AntNumKeyboard$1 r9 = new com.alipay.android.app.safepaybase.alikeyboard.AntNumKeyboard$1
            r9.<init>()
            r3 = r0
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.f4384a = r0
            boolean r14 = com.alipay.android.app.base.SPTaskHelper.DEBUG
            if (r14 == 0) goto L5f
            android.os.Handler r14 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r14.<init>(r0)
            com.alipay.android.app.safepaybase.alikeyboard.AntNumKeyboard$2 r0 = new com.alipay.android.app.safepaybase.alikeyboard.AntNumKeyboard$2
            r0.<init>()
            r14.post(r0)
        L5f:
            if (r12 != r13) goto L6d
            android.view.ViewGroup r11 = r10.f4384a     // Catch: java.lang.Throwable -> L69
            com.alipay.mobile.antui.keyboard.AUNumberKeyboardView r11 = (com.alipay.mobile.antui.keyboard.AUNumberKeyboardView) r11     // Catch: java.lang.Throwable -> L69
            r11.hideTopbar(r2)     // Catch: java.lang.Throwable -> L69
            return
        L69:
            r11 = move-exception
            com.alipay.android.app.safepaylog.utils.LogUtils.printExceptionStackTrace(r11)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.safepaybase.alikeyboard.AntNumKeyboard.<init>(android.content.Context, com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener, int, boolean):void");
    }
}
