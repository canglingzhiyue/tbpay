package com.alipay.mobile.verifyidentity.safepaybase.alikeyboard;

import android.content.Context;
import com.alipay.android.app.safepaybase.alikeyboard.AbstractKeyboard;
import com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AntNumKeyboard extends AbstractKeyboard {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_FLOAT = 3;
    public static final int FLAG_IDCARD = 2;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PHONE = 1;
    public static final int FLAG_SPWD = 4;
    public int c;

    public static /* synthetic */ void a(AntNumKeyboard antNumKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9083244", new Object[]{antNumKeyboard});
        } else {
            antNumKeyboard.a();
        }
    }

    public static /* synthetic */ void a(AntNumKeyboard antNumKeyboard, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e226d30e", new Object[]{antNumKeyboard, str});
        } else {
            antNumKeyboard.a(str);
        }
    }

    public static /* synthetic */ void b(AntNumKeyboard antNumKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20983e3", new Object[]{antNumKeyboard});
        } else {
            antNumKeyboard.b();
        }
    }

    public static /* synthetic */ void c(AntNumKeyboard antNumKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0ad582", new Object[]{antNumKeyboard});
        } else {
            antNumKeyboard.c();
        }
    }

    public AntNumKeyboard(Context context, OnKeyboardListener onKeyboardListener) {
        this(context, onKeyboardListener, 0);
    }

    public AntNumKeyboard(Context context, OnKeyboardListener onKeyboardListener, int i) {
        this(context, onKeyboardListener, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AntNumKeyboard(android.content.Context r11, com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener r12, int r13, boolean r14) {
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
            java.lang.String r0 = "AntNumKeyboard::init"
            com.alipay.mobile.verifyidentity.safepaybase.util.LogUtils.a(r0, r12)
            r12 = 2
            r0 = 4
            r1 = 3
            r2 = 1
            if (r13 == 0) goto L31
            if (r13 == r2) goto L37
            if (r13 == r12) goto L35
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
            com.alipay.mobile.antui.keyboard.AUNumberKeyboardView r12 = new com.alipay.mobile.antui.keyboard.AUNumberKeyboardView
            r5 = 0
            r7 = r14 ^ 1
            r8 = 2
            com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.AntNumKeyboard$1 r9 = new com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.AntNumKeyboard$1
            r9.<init>()
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.f4384a = r12
            if (r0 != r13) goto L58
            android.view.ViewGroup r11 = r10.f4384a     // Catch: java.lang.Throwable -> L54
            com.alipay.mobile.antui.keyboard.AUNumberKeyboardView r11 = (com.alipay.mobile.antui.keyboard.AUNumberKeyboardView) r11     // Catch: java.lang.Throwable -> L54
            r11.hideTopbar(r2)     // Catch: java.lang.Throwable -> L54
            return
        L54:
            r11 = move-exception
            com.alipay.mobile.verifyidentity.safepaybase.util.LogUtils.a(r11)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.AntNumKeyboard.<init>(android.content.Context, com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener, int, boolean):void");
    }
}
