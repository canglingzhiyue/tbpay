package com.alipay.birdnest.view;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.cun;

/* loaded from: classes3.dex */
public class SystemDefaultDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static AlertDialog.Builder a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog.Builder) ipChange.ipc$dispatch("3ebf9d78", new Object[]{context, str, str2, str3, onClickListener, str4, onClickListener2});
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (!StringUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!StringUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        if (!StringUtils.isEmpty(str3) && onClickListener != null) {
            builder.setPositiveButton(str3, onClickListener);
        }
        if (!StringUtils.isEmpty(str4) && onClickListener2 != null) {
            builder.setNegativeButton(str4, onClickListener2);
        }
        return builder;
    }

    public static Dialog showDialog(Context context, View view, String str, DialogInterface.OnClickListener onClickListener, String str2, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("c6de5379", new Object[]{context, view, str, onClickListener, str2, onClickListener2});
        }
        AlertDialog.Builder a2 = a(context, str, "", "", onClickListener, str2, onClickListener2);
        a2.setView(view);
        AlertDialog create = a2.create();
        try {
            create.show();
        } catch (Exception e) {
            cun.a("SystemDefaultDialog", "showDialog from view", e);
        }
        return create;
    }

    public static Dialog showDialog(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("ba0013bf", new Object[]{context, str, str2, str3, onClickListener, str4, onClickListener2}) : showDialog(context, str, str2, str3, onClickListener, null, str4, onClickListener2, null);
    }

    public static Dialog showDialog(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, JSONObject jSONObject, String str4, DialogInterface.OnClickListener onClickListener2, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("882e2169", new Object[]{context, str, str2, str3, onClickListener, jSONObject, str4, onClickListener2, jSONObject2});
        }
        AlertDialog create = a(context, str, str2, str3, onClickListener, str4, onClickListener2).create();
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        create.setCanceledOnTouchOutside(false);
        create.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.alipay.birdnest.view.SystemDefaultDialog.1
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
            cun.a("SystemDefaultDialog", "showDialog from msg", e);
        }
        return create;
    }
}
