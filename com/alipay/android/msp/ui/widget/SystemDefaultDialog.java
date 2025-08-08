package com.alipay.android.msp.ui.widget;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SystemDefaultDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Dialog showDialog(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("449948c9", new Object[]{context, str, str2, onClickListener, str3, onClickListener2});
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "SystemDefaultDialog.showDialog", "dialog-three" + System.currentTimeMillis());
        AlertDialog.Builder a2 = a(context, str2, onClickListener, str3, onClickListener2);
        a2.setMessage(str);
        AlertDialog create = a2.create();
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        create.setCanceledOnTouchOutside(false);
        create.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.alipay.android.msp.ui.widget.SystemDefaultDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue() : i == 4;
            }
        });
        try {
            create.show();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return create;
    }

    private static AlertDialog.Builder a(Context context, String str, DialogInterface.OnClickListener onClickListener, String str2, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog.Builder) ipChange.ipc$dispatch("373cc764", new Object[]{context, str, onClickListener, str2, onClickListener2});
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 16973940);
        if (!StringUtils.isEmpty(str) && onClickListener != null) {
            builder.setPositiveButton(str, onClickListener);
        }
        if (!StringUtils.isEmpty(str2) && onClickListener2 != null) {
            builder.setNegativeButton(str2, onClickListener2);
        }
        return builder;
    }

    public static Dialog showDialog(Context context, View view, String str, DialogInterface.OnClickListener onClickListener, String str2, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("c6de5379", new Object[]{context, view, str, onClickListener, str2, onClickListener2});
        }
        AlertDialog.Builder a2 = a(context, str, onClickListener, str2, onClickListener2);
        a2.setView(view);
        AlertDialog create = a2.create();
        create.show();
        return create;
    }
}
