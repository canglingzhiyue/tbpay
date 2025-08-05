package com.alipay.mobile.verifyidentity.ui.helper;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Locale;
import tb.riy;

/* loaded from: classes3.dex */
public class DialogActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String KEY_VI_DIALOG_CANCELABLE = "KEY_VI_DIALOG_CANCELABLE";
    public static String KEY_VI_DIALOG_MSG = "KEY_VI_DIALOG_MSG";
    public static String KEY_VI_DIALOG_SHOW_PROGRESSBAR = "KEY_VI_DIALOG_SHOW_PROGRESSBAR";

    /* renamed from: a  reason: collision with root package name */
    private static final String f6091a = "DialogActivity";
    private static long b = 1;
    private static long c;
    public static DialogInterface.OnCancelListener onBizCancelListener;
    public String VI_SHOW_DIALOG_MSG = "";
    public boolean VI_DIALOG_CANCELABLE = true;
    public boolean VI_DIALOG_SHOW_PROGRESSBAR = true;

    public static /* synthetic */ Object ipc$super(DialogActivity dialogActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : f6091a;
    }

    public static /* synthetic */ void access$100(DialogActivity dialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b9e5ca", new Object[]{dialogActivity});
        } else {
            dialogActivity.b();
        }
    }

    public static /* synthetic */ void access$201(DialogActivity dialogActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4a71c8", new Object[]{dialogActivity});
        } else {
            super.finish();
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        VerifyLogCat.i(f6091a, "DialogActivity is onCreate");
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.VI_SHOW_DIALOG_MSG = getIntent().getStringExtra(KEY_VI_DIALOG_MSG);
            this.VI_DIALOG_CANCELABLE = getIntent().getBooleanExtra(KEY_VI_DIALOG_CANCELABLE, false);
            this.VI_DIALOG_SHOW_PROGRESSBAR = getIntent().getBooleanExtra(KEY_VI_DIALOG_SHOW_PROGRESSBAR, true);
        }
        DialogActivityHelper.getInstance().updateDialogActivity(this);
        a();
        if (b <= c) {
            return;
        }
        VerifyLogCat.i(f6091a, "can show progress");
        if (getIntent() != null) {
            this.VI_SHOW_DIALOG_MSG = getIntent().getStringExtra(KEY_VI_DIALOG_MSG);
        }
        showProgressDialog(this.VI_SHOW_DIALOG_MSG, this.VI_DIALOG_CANCELABLE, new DialogInterface.OnCancelListener() { // from class: com.alipay.mobile.verifyidentity.ui.helper.DialogActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    return;
                }
                try {
                    if (DialogActivity.onBizCancelListener != null) {
                        DialogActivity.onBizCancelListener.onCancel(dialogInterface);
                    }
                } catch (Throwable unused) {
                    VerifyLogCat.i(DialogActivity.access$000(), "onBizCancelListener Exception. Do nothing.");
                }
                DialogActivity.access$100(DialogActivity.this);
            }
        }, this.VI_DIALOG_SHOW_PROGRESSBAR);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (b <= c) {
            a();
            VerifyLogCat.w(f6091a, "can not show progress.");
            b();
            return;
        }
        String str = f6091a;
        VerifyLogCat.w(str, "DialogShowAmount is :" + ContextDialogHelper.DialogShowAmount);
        String str2 = f6091a;
        VerifyLogCat.w(str2, "DialogDismissAmount is :" + ContextDialogHelper.DialogDismissAmount);
        if (ContextDialogHelper.DialogShowAmount > ContextDialogHelper.DialogDismissAmount) {
            return;
        }
        VerifyLogCat.w(f6091a, "no need to show progress. sth is wrong");
        b();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        dismissProgressDialog();
        DialogActivityHelper.getInstance().updateDialogActivity(null);
        ContextDialogHelper.DialogShowAmount = 0;
        ContextDialogHelper.DialogDismissAmount = 0;
        onBizCancelListener = null;
        new Handler().postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.DialogActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                VerifyLogCat.i(DialogActivity.access$000(), "now to finish this DialogActivity");
                DialogActivity.access$201(DialogActivity.this);
            }
        }, 300L);
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        String str = f6091a;
        VerifyLogCat.i(str, "show progress time: " + a(b) + " (" + b + riy.BRACKET_END_STR);
        String str2 = f6091a;
        VerifyLogCat.i(str2, "dismiss progress time: " + a(c) + " (" + c + riy.BRACKET_END_STR);
    }

    public static void setViShowDialogTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f0c256", new Object[]{new Long(j)});
            return;
        }
        b = j;
        String str = f6091a;
        VerifyLogCat.i(str, "set show progress time: " + a(b) + " (" + b + riy.BRACKET_END_STR);
    }

    public static void setViDismissDialogTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6e9933", new Object[]{new Long(j)});
            return;
        }
        c = j;
        String str = f6091a;
        VerifyLogCat.i(str, "set dismiss progress time: " + a(c) + " (" + c + riy.BRACKET_END_STR);
    }

    private static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(j));
        } catch (Exception e) {
            VerifyLogCat.w(f6091a, e);
            return "";
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    public static boolean needOrCanShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89f4961f", new Object[0])).booleanValue();
        }
        if (b <= c) {
            a();
            VerifyLogCat.w(f6091a, "no need to show progress.[by time]");
            ContextDialogHelper.DialogShowAmount = 0;
            ContextDialogHelper.DialogDismissAmount = 0;
            return false;
        } else if (ContextDialogHelper.DialogShowAmount > ContextDialogHelper.DialogDismissAmount) {
            return true;
        } else {
            VerifyLogCat.w(f6091a, "no need to show progress. [by amount]");
            String str = f6091a;
            VerifyLogCat.w(str, "DialogShowAmount is :" + ContextDialogHelper.DialogShowAmount);
            String str2 = f6091a;
            VerifyLogCat.w(str2, "DialogDismissAmount is :" + ContextDialogHelper.DialogDismissAmount);
            ContextDialogHelper.DialogShowAmount = 0;
            ContextDialogHelper.DialogDismissAmount = 0;
            return false;
        }
    }
}
