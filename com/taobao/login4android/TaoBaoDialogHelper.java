package com.taobao.login4android;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import anetwork.channel.config.NetworkConfigCenter;
import com.ali.user.mobile.helper.DialogHelper;
import com.ali.user.mobile.helper.IDialogHelper;
import com.ali.user.mobile.utils.NetworkUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.ui.NoNetworkActivity;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class TaoBaoDialogHelper implements IDialogHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DialogHelper mDialogHelper;

    static {
        kge.a(-228218014);
        kge.a(-551958906);
    }

    private void ensureDialogHelper(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("561d4a0d", new Object[]{this, activity});
        } else if (this.mDialogHelper != null) {
        } else {
            this.mDialogHelper = new DialogHelper(activity);
        }
    }

    @Override // com.ali.user.mobile.helper.IDialogHelper
    public void alert(Activity activity, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7df8be9", new Object[]{this, activity, str, str2, str3, onClickListener, str4, onClickListener2});
            return;
        }
        ensureDialogHelper(activity);
        this.mDialogHelper.alert(str, str2, str3, onClickListener, str4, onClickListener2);
    }

    @Override // com.ali.user.mobile.helper.IDialogHelper
    public void alert(Activity activity, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4103e2", new Object[]{this, activity, str, str2, str3, onClickListener, str4, onClickListener2, new Boolean(z), new Boolean(z2), onCancelListener});
            return;
        }
        ensureDialogHelper(activity);
        this.mDialogHelper.alert(str, str2, str3, onClickListener, str4, onClickListener2, Boolean.valueOf(z), onCancelListener);
    }

    @Override // com.ali.user.mobile.helper.IDialogHelper
    public void alert(Activity activity, String str, View view, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2, Boolean bool, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aba9a13", new Object[]{this, activity, str, view, str2, onClickListener, str3, onClickListener2, bool, onCancelListener});
            return;
        }
        ensureDialogHelper(activity);
        this.mDialogHelper.alert(str, view, str2, onClickListener, str3, onClickListener2, bool, onCancelListener);
    }

    @Override // com.ali.user.mobile.helper.IDialogHelper
    public void toast(final Activity activity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb71279", new Object[]{this, activity, str, new Integer(i)});
            return;
        }
        try {
            try {
                ensureDialogHelper(activity);
                if (TextUtils.equals(str, activity.getResources().getString(R.string.aliuser_network_error)) && !NetworkUtil.isNetworkConnected()) {
                    this.mDialogHelper.alert(activity.getResources().getString(R.string.aliuser_network_exception), activity.getResources().getString(R.string.aliuser_network_check), activity.getResources().getString(R.string.aliuser_network_retry), null, activity.getString(R.string.aliuser_need_help), new DialogInterface.OnClickListener() { // from class: com.taobao.login4android.TaoBaoDialogHelper.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                return;
                            }
                            try {
                                Intent intent = new Intent(activity, NoNetworkActivity.class);
                                if (!(activity instanceof Activity)) {
                                    intent.addFlags(268435456);
                                }
                                activity.startActivity(intent);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else if (TextUtils.equals(str, activity.getResources().getString(R.string.aliuser_server_error_msg)) && NetworkConfigCenter.isNetworkDiagnosisOpened()) {
                    this.mDialogHelper.alert(activity.getResources().getString(R.string.aliuser_login_server_error_msg), activity.getResources().getString(R.string.aliuser_network_try_title) + System.getProperty("line.separator") + activity.getResources().getString(R.string.aliuser_network_step1) + System.getProperty("line.separator") + activity.getResources().getString(R.string.aliuser_network_step2) + System.getProperty("line.separator") + activity.getResources().getString(R.string.aliuser_network_step3) + System.getProperty("line.separator"), activity.getResources().getString(R.string.aliuser_network_retry), null, activity.getResources().getString(R.string.aliuser_network_diagnosis), new DialogInterface.OnClickListener() { // from class: com.taobao.login4android.TaoBaoDialogHelper.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                return;
                            }
                            try {
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://m.taobao.com/go/networkDiagnosis"));
                                intent.setPackage(activity.getPackageName());
                                intent.addCategory("android.intent.category.DEFAULT");
                                if (!(activity instanceof Activity)) {
                                    intent.addFlags(268435456);
                                }
                                activity.startActivity(intent);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }, false, null, false);
                } else {
                    this.mDialogHelper.toast(str, i);
                }
            } catch (Exception unused) {
                Toast.makeText(activity, str, i).show();
            }
        } catch (Exception unused2) {
            this.mDialogHelper.toast(str, i);
        }
    }

    @Override // com.ali.user.mobile.helper.IDialogHelper
    public void showProgressDialog(Activity activity, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b0401f", new Object[]{this, activity, str, new Boolean(z)});
            return;
        }
        ensureDialogHelper(activity);
        this.mDialogHelper.showProgressDialog(z, str);
    }

    @Override // com.ali.user.mobile.helper.IDialogHelper
    public void showProgressDialog(Activity activity, String str, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2fe737c", new Object[]{this, activity, str, new Boolean(z), onCancelListener, new Boolean(z2)});
            return;
        }
        ensureDialogHelper(activity);
        this.mDialogHelper.showProgressDialog(str, z, onCancelListener, z2);
    }

    @Override // com.ali.user.mobile.helper.IDialogHelper
    public void dismissProgressDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa6c806", new Object[]{this});
            return;
        }
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper == null) {
            return;
        }
        dialogHelper.dismissProgressDialog();
    }

    @Override // com.ali.user.mobile.helper.IDialogHelper
    public void dismissAlertDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ca6061", new Object[]{this});
            return;
        }
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper == null) {
            return;
        }
        dialogHelper.dismissAlertDialog();
    }

    @Override // com.ali.user.mobile.helper.IDialogHelper
    public void alertList(String[] strArr, DialogInterface.OnClickListener onClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c07305", new Object[]{this, strArr, onClickListener, new Boolean(z)});
            return;
        }
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper == null) {
            return;
        }
        dialogHelper.alertList(strArr, onClickListener, z);
    }

    @Override // com.ali.user.mobile.helper.IDialogHelper
    public void hideInputMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9eeab0", new Object[]{this});
            return;
        }
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper == null) {
            return;
        }
        dialogHelper.hideInputMethod();
    }
}
