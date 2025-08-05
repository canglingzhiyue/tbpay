package com.ali.user.open.core.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.webview.AUProgressDialog;
import com.ali.user.open.core.webview.BaseWebViewActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class DialogHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile DialogHelper instance;
    private AlertDialog mAlertDialog;
    private AlertDialog mProgressDialog;

    static {
        kge.a(-1479619341);
    }

    public static /* synthetic */ AlertDialog access$000(DialogHelper dialogHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertDialog) ipChange.ipc$dispatch("5007d3ae", new Object[]{dialogHelper}) : dialogHelper.mAlertDialog;
    }

    public static /* synthetic */ AlertDialog access$002(DialogHelper dialogHelper, AlertDialog alertDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog) ipChange.ipc$dispatch("89d71c11", new Object[]{dialogHelper, alertDialog});
        }
        dialogHelper.mAlertDialog = alertDialog;
        return alertDialog;
    }

    public static /* synthetic */ AlertDialog access$100(DialogHelper dialogHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertDialog) ipChange.ipc$dispatch("1713baaf", new Object[]{dialogHelper}) : dialogHelper.mProgressDialog;
    }

    public static /* synthetic */ AlertDialog access$102(DialogHelper dialogHelper, AlertDialog alertDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog) ipChange.ipc$dispatch("51066830", new Object[]{dialogHelper, alertDialog});
        }
        dialogHelper.mProgressDialog = alertDialog;
        return alertDialog;
    }

    public static DialogHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogHelper) ipChange.ipc$dispatch("2cc441a0", new Object[0]);
        }
        if (instance == null) {
            synchronized (DialogHelper.class) {
                if (instance == null) {
                    instance = new DialogHelper();
                }
            }
        }
        return instance;
    }

    public void alert(final Activity activity, final String str, final String str2, final String str3, final DialogInterface.OnClickListener onClickListener, final String str4, final DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7df8be9", new Object[]{this, activity, str, str2, str3, onClickListener, str4, onClickListener2});
        } else if (activity == null) {
        } else {
            dismissAlertDialog(activity);
            activity.runOnUiThread(new Runnable() { // from class: com.ali.user.open.core.util.DialogHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Activity activity2 = activity;
                    if (activity2 == null || activity2.isFinishing()) {
                        return;
                    }
                    int i = 16973939;
                    if (Build.VERSION.SDK_INT >= 21) {
                        i = 16974393;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(activity, i));
                    if (!TextUtils.isEmpty(str)) {
                        builder.setTitle(str);
                    }
                    builder.setMessage(!TextUtils.isEmpty(str2) ? str2 : activity.getString(R.string.member_sdk_network_not_available_message));
                    if (!TextUtils.isEmpty(str3)) {
                        builder.setPositiveButton(str3, onClickListener);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        builder.setNegativeButton(str4, onClickListener2);
                    }
                    try {
                        DialogHelper.access$002(DialogHelper.this, builder.show());
                        DialogHelper.access$000(DialogHelper.this).getButton(-1).setTextColor(activity.getResources().getColor(17170444));
                        DialogHelper.access$000(DialogHelper.this).getButton(-2).setTextColor(activity.getResources().getColor(17170444));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void dismissAlertDialog(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fdde8f3", new Object[]{this, activity});
            return;
        }
        AlertDialog alertDialog = this.mAlertDialog;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.ali.user.open.core.util.DialogHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DialogHelper.access$000(DialogHelper.this) == null || !DialogHelper.access$000(DialogHelper.this).isShowing()) {
                } else {
                    try {
                        DialogHelper.access$000(DialogHelper.this).dismiss();
                    } catch (Exception unused) {
                    } finally {
                        DialogHelper.access$002(DialogHelper.this, null);
                    }
                }
            }
        });
    }

    public void showProgressDialog(final Activity activity, final String str, final boolean z, final DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b738a58", new Object[]{this, activity, str, new Boolean(z), onCancelListener});
            return;
        }
        AlertDialog alertDialog = this.mProgressDialog;
        if (alertDialog != null && alertDialog.isShowing()) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.ali.user.open.core.util.DialogHelper.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Activity activity2 = activity;
                if (activity2 == null || activity2.isFinishing()) {
                    return;
                }
                DialogHelper.access$102(DialogHelper.this, new AUProgressDialog(activity));
                DialogHelper.access$100(DialogHelper.this).setMessage(str);
                ((AUProgressDialog) DialogHelper.access$100(DialogHelper.this)).setProgressVisiable(true);
                DialogHelper.access$100(DialogHelper.this).setCancelable(z);
                DialogHelper.access$100(DialogHelper.this).setOnCancelListener(onCancelListener);
                try {
                    DialogHelper.access$100(DialogHelper.this).show();
                } catch (Exception unused) {
                }
                DialogHelper.access$100(DialogHelper.this).setCanceledOnTouchOutside(false);
            }
        });
    }

    public void dismissProgressDialog(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555ad6d8", new Object[]{this, activity});
            return;
        }
        AlertDialog alertDialog = this.mProgressDialog;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.ali.user.open.core.util.DialogHelper.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DialogHelper.access$100(DialogHelper.this) == null || !DialogHelper.access$100(DialogHelper.this).isShowing()) {
                } else {
                    try {
                        DialogHelper.access$100(DialogHelper.this).dismiss();
                    } catch (Exception unused) {
                        SDKLogger.w(BaseWebViewActivity.TAG, "dismissProgressDialog");
                    } finally {
                        DialogHelper.access$102(DialogHelper.this, null);
                    }
                }
            }
        });
    }
}
