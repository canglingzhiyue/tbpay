package com.taobao.android.order.bundle.helper;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.ui.helper.DialogHelper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hyn;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(481485086);
    }

    public static AlertDialog.Builder a(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog.Builder) ipChange.ipc$dispatch("15380145", new Object[]{str, str2, str3, onClickListener, context});
        }
        hyn.a(DialogHelper.TAG, "createAlertDialogBuilder", "title = " + str + " msg = " + str2);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 3);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        builder.setCancelable(true);
        if (!TextUtils.isEmpty(str3)) {
            builder.setNegativeButton(str3, onClickListener);
        }
        return builder;
    }

    public static AlertDialog.Builder a(String str, String str2, String str3, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertDialog.Builder) ipChange.ipc$dispatch("a203ac26", new Object[]{str, str2, str3, context}) : a(str, str2, str3, null, context);
    }
}
