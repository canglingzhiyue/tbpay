package com.ali.user.mobile.helper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import com.ali.user.mobile.ui.widget.AUProgressDialog;
import com.ali.user.mobile.ui.widget.AliUserDialog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class DialogHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.DialogHelper";
    private Activity mActivity;
    private AlertDialog mAlertDialog;
    private AlertDialog mProgressDialog;
    private Toast mToast;
    private AliUserDialog mUserAlertDialog;

    static {
        kge.a(-491956785);
    }

    public static /* synthetic */ Activity access$000(DialogHelper dialogHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("1d7df88d", new Object[]{dialogHelper}) : dialogHelper.mActivity;
    }

    public static /* synthetic */ AliUserDialog access$100(DialogHelper dialogHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUserDialog) ipChange.ipc$dispatch("63491732", new Object[]{dialogHelper}) : dialogHelper.mUserAlertDialog;
    }

    public static /* synthetic */ AliUserDialog access$102(DialogHelper dialogHelper, AliUserDialog aliUserDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUserDialog) ipChange.ipc$dispatch("bf7ff8e8", new Object[]{dialogHelper, aliUserDialog});
        }
        dialogHelper.mUserAlertDialog = aliUserDialog;
        return aliUserDialog;
    }

    public static /* synthetic */ AlertDialog access$200(DialogHelper dialogHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertDialog) ipChange.ipc$dispatch("a4109f94", new Object[]{dialogHelper}) : dialogHelper.mAlertDialog;
    }

    public static /* synthetic */ AlertDialog access$202(DialogHelper dialogHelper, AlertDialog alertDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog) ipChange.ipc$dispatch("dc824faf", new Object[]{dialogHelper, alertDialog});
        }
        dialogHelper.mAlertDialog = alertDialog;
        return alertDialog;
    }

    public static /* synthetic */ Toast access$300(DialogHelper dialogHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Toast) ipChange.ipc$dispatch("97b9bd1", new Object[]{dialogHelper}) : dialogHelper.mToast;
    }

    public static /* synthetic */ Toast access$302(DialogHelper dialogHelper, Toast toast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toast) ipChange.ipc$dispatch("35e759e0", new Object[]{dialogHelper, toast});
        }
        dialogHelper.mToast = toast;
        return toast;
    }

    public static /* synthetic */ AlertDialog access$400(DialogHelper dialogHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlertDialog) ipChange.ipc$dispatch("a8a60952", new Object[]{dialogHelper}) : dialogHelper.mProgressDialog;
    }

    public static /* synthetic */ AlertDialog access$402(DialogHelper dialogHelper, AlertDialog alertDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog) ipChange.ipc$dispatch("3bf0b7b1", new Object[]{dialogHelper, alertDialog});
        }
        dialogHelper.mProgressDialog = alertDialog;
        return alertDialog;
    }

    public DialogHelper(Activity activity) {
        this.mActivity = activity;
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
        } else {
            alert(str, str2, str3, onClickListener, str4, onClickListener2, (Boolean) false, (DialogInterface.OnCancelListener) null);
        }
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Boolean bool, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f5610f", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bool, onCancelListener});
        } else {
            alert(str, str2, str3, onClickListener, str4, onClickListener2, bool, onCancelListener, true);
        }
    }

    public void alert(final String str, final String str2, final String str3, final DialogInterface.OnClickListener onClickListener, final String str4, final DialogInterface.OnClickListener onClickListener2, Boolean bool, DialogInterface.OnCancelListener onCancelListener, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b773a5", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bool, onCancelListener, new Boolean(z)});
            return;
        }
        dismissAlertDialog();
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.ali.user.mobile.helper.DialogHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DialogHelper.access$000(DialogHelper.this) == null || DialogHelper.access$000(DialogHelper.this).isFinishing()) {
                } else {
                    AliUserDialog.Builder Builder = AliUserDialog.Builder(DialogHelper.access$000(DialogHelper.this));
                    Builder.setMessageCenter(z);
                    if (!TextUtils.isEmpty(str)) {
                        Builder.setTitle(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        Builder.setMessage(str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        Builder.setOnPositiveClickListener(str3, new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.helper.DialogHelper.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                            public void onClick(View view) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    return;
                                }
                                try {
                                    if (DialogHelper.access$100(DialogHelper.this) != null) {
                                        DialogHelper.access$100(DialogHelper.this).dismiss();
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                                if (onClickListener == null) {
                                    return;
                                }
                                onClickListener.onClick(null, 0);
                            }
                        });
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        Builder.setOnNegativeClickListener(str4, new AliUserDialog.NegativeClickListener() { // from class: com.ali.user.mobile.helper.DialogHelper.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.mobile.ui.widget.AliUserDialog.NegativeClickListener
                            public void onClick(View view) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    return;
                                }
                                try {
                                    if (DialogHelper.access$100(DialogHelper.this) != null) {
                                        DialogHelper.access$100(DialogHelper.this).dismiss();
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                                if (onClickListener2 == null) {
                                    return;
                                }
                                onClickListener2.onClick(null, 0);
                            }
                        });
                    }
                    try {
                        DialogHelper.access$102(DialogHelper.this, Builder.build().shown());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        });
    }

    public void alert(final String str, final View view, final String str2, final DialogInterface.OnClickListener onClickListener, final String str3, final DialogInterface.OnClickListener onClickListener2, final Boolean bool, final DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97625b01", new Object[]{this, str, view, str2, onClickListener, str3, onClickListener2, bool, onCancelListener});
            return;
        }
        dismissAlertDialog();
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.ali.user.mobile.helper.DialogHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DialogHelper.access$000(DialogHelper.this) == null || DialogHelper.access$000(DialogHelper.this).isFinishing()) {
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(DialogHelper.access$000(DialogHelper.this), 16973939));
                    if (!TextUtils.isEmpty(str)) {
                        builder.setTitle(str);
                    }
                    View view2 = view;
                    if (view2 != null) {
                        builder.setView(view2);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        builder.setPositiveButton(str2, onClickListener);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        builder.setNegativeButton(str3, onClickListener2);
                    }
                    try {
                        DialogHelper.access$202(DialogHelper.this, builder.show());
                        DialogHelper.access$200(DialogHelper.this).setCanceledOnTouchOutside(bool.booleanValue());
                        DialogHelper.access$200(DialogHelper.this).setCancelable(bool.booleanValue());
                        DialogHelper.access$200(DialogHelper.this).setOnCancelListener(onCancelListener);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public void alertList(final String[] strArr, final DialogInterface.OnClickListener onClickListener, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c07305", new Object[]{this, strArr, onClickListener, new Boolean(z)});
            return;
        }
        dismissAlertDialog();
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.ali.user.mobile.helper.DialogHelper.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DialogHelper.access$000(DialogHelper.this) == null || DialogHelper.access$000(DialogHelper.this).isFinishing()) {
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(DialogHelper.access$000(DialogHelper.this), 16973939));
                    builder.setItems(strArr, onClickListener);
                    DialogHelper.access$202(DialogHelper.this, builder.show());
                    DialogHelper.access$200(DialogHelper.this).setCanceledOnTouchOutside(z);
                    DialogHelper.access$200(DialogHelper.this).setCancelable(z);
                }
            }
        });
    }

    public void toast(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
            return;
        }
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.ali.user.mobile.helper.DialogHelper.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    DialogHelper.access$302(DialogHelper.this, new Toast(DialogHelper.access$000(DialogHelper.this)));
                    View inflate = LayoutInflater.from(DialogHelper.access$000(DialogHelper.this).getApplicationContext()).inflate(R.layout.aliuser_transient_notification, (ViewGroup) null);
                    ((TextView) inflate.findViewById(16908299)).setText(str);
                    DialogHelper.access$300(DialogHelper.this).setView(inflate);
                    DialogHelper.access$300(DialogHelper.this).setDuration(i);
                    DialogHelper.access$300(DialogHelper.this).setGravity(17, 0, 0);
                    DialogHelper.access$300(DialogHelper.this).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void hideInputMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9eeab0", new Object[]{this});
            return;
        }
        Activity activity = this.mActivity;
        if (activity == null || activity.getCurrentFocus() == null) {
            return;
        }
        ((InputMethodManager) this.mActivity.getSystemService("input_method")).hideSoftInputFromWindow(this.mActivity.getCurrentFocus().getWindowToken(), 2);
    }

    public void showProgressDialog(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f8c145", new Object[]{this, new Boolean(z), str});
        } else {
            showProgressDialog(str, true, null, z);
        }
    }

    public void showProgressDialog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a6743", new Object[]{this, str});
        } else {
            showProgressDialog(str, true, null, true);
        }
    }

    public void showProgressDialog(final String str, final boolean z, final DialogInterface.OnCancelListener onCancelListener, final boolean z2) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a3426a", new Object[]{this, str, new Boolean(z), onCancelListener, new Boolean(z2)});
            return;
        }
        AlertDialog alertDialog = this.mProgressDialog;
        if ((alertDialog != null && alertDialog.isShowing()) || (activity = this.mActivity) == null || activity.isFinishing()) {
            return;
        }
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.ali.user.mobile.helper.DialogHelper.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DialogHelper.access$000(DialogHelper.this) == null || DialogHelper.access$000(DialogHelper.this).isFinishing()) {
                } else {
                    DialogHelper dialogHelper = DialogHelper.this;
                    DialogHelper.access$402(dialogHelper, new AUProgressDialog(DialogHelper.access$000(dialogHelper)));
                    DialogHelper.access$400(DialogHelper.this).setMessage(str);
                    ((AUProgressDialog) DialogHelper.access$400(DialogHelper.this)).setProgressVisiable(z2);
                    DialogHelper.access$400(DialogHelper.this).setCancelable(z);
                    DialogHelper.access$400(DialogHelper.this).setOnCancelListener(onCancelListener);
                    try {
                        DialogHelper.access$400(DialogHelper.this).show();
                    } catch (Exception unused) {
                    }
                    DialogHelper.access$400(DialogHelper.this).setCanceledOnTouchOutside(false);
                }
            }
        });
    }

    public void dismissProgressDialog() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa6c806", new Object[]{this});
            return;
        }
        AlertDialog alertDialog = this.mProgressDialog;
        if (alertDialog == null || !alertDialog.isShowing() || (activity = this.mActivity) == null || activity.isFinishing()) {
            return;
        }
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.ali.user.mobile.helper.DialogHelper.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DialogHelper.access$400(DialogHelper.this) == null || !DialogHelper.access$400(DialogHelper.this).isShowing()) {
                } else {
                    try {
                        DialogHelper.access$400(DialogHelper.this).dismiss();
                    } catch (Exception e) {
                        LoginTLogAdapter.w(DialogHelper.TAG, "dismissProgressDialog", e);
                    } finally {
                        DialogHelper.access$402(DialogHelper.this, null);
                    }
                }
            }
        });
    }

    public void dismissAlertDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ca6061", new Object[]{this});
            return;
        }
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        AlertDialog alertDialog = this.mAlertDialog;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.mActivity.runOnUiThread(new Runnable() { // from class: com.ali.user.mobile.helper.DialogHelper.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (DialogHelper.access$200(DialogHelper.this) == null || !DialogHelper.access$200(DialogHelper.this).isShowing()) {
                    } else {
                        try {
                            DialogHelper.access$200(DialogHelper.this).dismiss();
                        } catch (Exception e) {
                            LoginTLogAdapter.w(DialogHelper.TAG, "dismissProgressDialog", e);
                        } finally {
                            DialogHelper.access$202(DialogHelper.this, null);
                        }
                    }
                }
            });
        }
        AliUserDialog aliUserDialog = this.mUserAlertDialog;
        if (aliUserDialog == null || !aliUserDialog.isShowing()) {
            return;
        }
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.ali.user.mobile.helper.DialogHelper.8
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
                    } catch (Throwable th) {
                        try {
                            th.printStackTrace();
                        } finally {
                            DialogHelper.access$102(DialogHelper.this, null);
                        }
                    }
                }
            }
        });
    }
}
