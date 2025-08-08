package com.alipay.android.msp.ui.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class FlybirdDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public interface DialogCallback {
        void onCallback(String str, int i, int i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Dialog showDialogV1(Context context, String str, String str2, List<FlybirdDialogEventDesc> list) {
        FlybirdDialogMultiBtn flybirdDialogMultiBtn;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("87bd4029", new Object[]{context, str, str2, list});
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        LogUtil.record(2, "FlybirdDialog:showDialog", "title=" + str + " ,msg=" + str2 + " , event=" + list.size());
        if (list.size() == 0) {
            list.add(new FlybirdDialogEventDesc(LanguageHelper.localizedStringForKey("alipay_ensure", context.getResources().getString(R.string.alipay_ensure), new Object[0]), null));
        }
        if (list.size() != 1) {
            if (list.size() == 2) {
                FlybirdDialogDoubleBtn flybirdDialogDoubleBtn = new FlybirdDialogDoubleBtn(context);
                flybirdDialogDoubleBtn.setTitle(str);
                flybirdDialogDoubleBtn.setOneMessage(str2);
                flybirdDialogDoubleBtn.setLeftOnClickText(list.get(0).mText);
                flybirdDialogDoubleBtn.setLeftOnClickListener(list.get(0).mListener);
                flybirdDialogDoubleBtn.setRightOnClickText(list.get(1).mText);
                flybirdDialogDoubleBtn.setRightOnClickListener(list.get(1).mListener);
                flybirdDialogMultiBtn = flybirdDialogDoubleBtn;
            } else {
                FlybirdDialogMultiBtn flybirdDialogMultiBtn2 = new FlybirdDialogMultiBtn(context);
                flybirdDialogMultiBtn2.setTitle(str);
                flybirdDialogMultiBtn2.setOneMessage(str2);
                flybirdDialogMultiBtn2.setOnClickEvents(list);
                flybirdDialogMultiBtn = flybirdDialogMultiBtn2;
            }
        } else {
            FlybirdDialogOneBtn flybirdDialogOneBtn = new FlybirdDialogOneBtn(context);
            flybirdDialogOneBtn.setTitle(str);
            flybirdDialogOneBtn.setOneMessage(str2);
            flybirdDialogOneBtn.setOnClickText(list.get(0).mText);
            flybirdDialogOneBtn.setOnClickListener(list.get(0).mListener);
            flybirdDialogMultiBtn = flybirdDialogOneBtn;
        }
        try {
            flybirdDialogMultiBtn.show();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return flybirdDialogMultiBtn;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.app.Dialog showDialogV2(final android.content.Context r10, java.lang.String r11, java.lang.String r12, java.util.List<com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc> r13) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialog.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            if (r1 == 0) goto L1e
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r10 = 1
            r1[r10] = r11
            r1[r2] = r12
            r10 = 3
            r1[r10] = r13
            java.lang.String r10 = "e0c88baa"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            android.app.Dialog r10 = (android.app.Dialog) r10
            return r10
        L1e:
            if (r10 == 0) goto L32
            com.alipay.android.msp.framework.drm.DrmManager r0 = com.alipay.android.msp.framework.drm.DrmManager.getInstance(r10)
            java.lang.String r1 = "gray_dialog_remove_error_code"
            boolean r0 = r0.isGray(r1, r3, r10)
            if (r0 == 0) goto L32
            android.app.Dialog r10 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl.showDialogV1(r10, r11, r12, r13)
            return r10
        L32:
            r0 = 0
            java.lang.String r1 = ".*\\((.+)\\)"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Throwable -> L6d
            java.util.regex.Matcher r1 = r1.matcher(r12)     // Catch: java.lang.Throwable -> L6d
            boolean r4 = r1.find()     // Catch: java.lang.Throwable -> L6d
            if (r4 == 0) goto L71
            int r1 = r1.end()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "("
            int r4 = r12.lastIndexOf(r4)     // Catch: java.lang.Throwable -> L6d
            int r5 = r4 + 1
            int r6 = r1 + (-1)
            java.lang.String r0 = r12.substring(r5, r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r5.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = r12.substring(r3, r4)     // Catch: java.lang.Throwable -> L6d
            r5.append(r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r12.substring(r1)     // Catch: java.lang.Throwable -> L6d
            r5.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L6d
            goto L72
        L6d:
            r1 = move-exception
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r1)
        L71:
            r1 = r12
        L72:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "title="
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r4 = " ,msg="
            r3.append(r4)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            java.lang.String r3 = "FlybirdDialog:showDialogV2"
            com.alipay.android.msp.utils.LogUtil.record(r2, r3, r12)
            android.app.Dialog r11 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl.showDialogV1(r10, r11, r1, r13)
            boolean r12 = android.text.StringUtils.isEmpty(r0)
            if (r12 != 0) goto Le5
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r10)
            r8.setText(r0)
            android.content.res.Resources r12 = r10.getResources()
            int r13 = com.taobao.taobao.R.color.mini_error_code
            int r12 = r12.getColor(r13)
            r8.setTextColor(r12)
            r12 = 17
            r8.setGravity(r12)
            android.view.Window r12 = r11.getWindow()
            if (r12 == 0) goto Ldb
            android.view.Window r12 = r11.getWindow()
            android.view.View r7 = r12.getDecorView()
            int r12 = com.taobao.taobao.R.id.flybird_dialog_layout
            android.view.View r12 = r11.findViewById(r12)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            boolean r13 = r7 instanceof android.widget.FrameLayout
            if (r13 == 0) goto Le5
            if (r12 == 0) goto Le5
            com.alipay.android.msp.ui.widget.dialog.FlybirdDialog$1 r13 = new com.alipay.android.msp.ui.widget.dialog.FlybirdDialog$1
            r4 = r13
            r5 = r10
            r6 = r12
            r9 = r11
            r4.<init>()
            r12.post(r13)
            goto Le5
        Ldb:
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r12 = -1
            r13 = -2
            r10.<init>(r12, r13)
            r11.addContentView(r8, r10)
        Le5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.widget.dialog.FlybirdDialog.showDialogV2(android.content.Context, java.lang.String, java.lang.String, java.util.List):android.app.Dialog");
    }
}
