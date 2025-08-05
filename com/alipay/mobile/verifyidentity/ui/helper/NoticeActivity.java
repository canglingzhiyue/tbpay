package com.alipay.mobile.verifyidentity.ui.helper;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.TaskManager;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.riy;

/* loaded from: classes3.dex */
public class NoticeActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f6094a = "NoticeActivity";
    public static String alertMsg;
    public static String alertNegative;
    public static DialogInterface.OnClickListener alertNegativeListener;
    public static String alertPositive;
    public static DialogInterface.OnClickListener alertPositiveListener;
    public static String alertTitle;
    public static Bundle config;
    private AtomicBoolean b = new AtomicBoolean(false);
    private Handler c = new Handler(Looper.getMainLooper()) { // from class: com.alipay.mobile.verifyidentity.ui.helper.NoticeActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 1001) {
            } else {
                NoticeActivity.access$000(NoticeActivity.this);
            }
        }
    };
    public DialogInterface.OnClickListener thisAlertNegativeListener;
    public DialogInterface.OnClickListener thisAlertPositiveListener;

    public static /* synthetic */ Object ipc$super(NoticeActivity noticeActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode != 1150324634) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.finish();
            return null;
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

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : f6094a;
    }

    public static /* synthetic */ void access$200(NoticeActivity noticeActivity, DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c40f1", new Object[]{noticeActivity, onClickListener, dialogInterface, new Integer(i)});
        } else {
            noticeActivity.a(onClickListener, dialogInterface, i);
        }
    }

    public static /* synthetic */ void access$300(NoticeActivity noticeActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4ec278", new Object[]{noticeActivity});
        } else {
            noticeActivity.c();
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        VerifyLogCat.i(f6094a, "NoticeActivity is onCreate");
        super.onCreate(bundle);
        VerifyLogCat.i(f6094a, "NoticeActivity showAlert");
        try {
            if (a()) {
                VerifyLogCat.i(f6094a, "do not setClickTimeoutMonitor");
            } else if (this.c != null) {
                Message obtain = Message.obtain();
                obtain.what = 1001;
                VerifyLogCat.i(f6094a, "send msg MSG_NOT_CLICK_TIMEOUT");
                this.c.sendMessageDelayed(obtain, 60000L);
            }
        } catch (Throwable th) {
            VerifyLogCat.e(f6094a, "setClickTimeoutMonitor exp: ", th);
        }
        this.thisAlertPositiveListener = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.ui.helper.NoticeActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                VerifyLogCat.i(NoticeActivity.access$100(), "NoticeActivity onClick alertPositive");
                NoticeActivity.access$200(NoticeActivity.this, NoticeActivity.alertPositiveListener, dialogInterface, i);
                NoticeActivity.access$300(NoticeActivity.this);
            }
        };
        this.thisAlertNegativeListener = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.ui.helper.NoticeActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                VerifyLogCat.i(NoticeActivity.access$100(), "NoticeActivity onClick alertNegative");
                NoticeActivity.access$200(NoticeActivity.this, NoticeActivity.alertNegativeListener, dialogInterface, i);
                NoticeActivity.access$300(NoticeActivity.this);
            }
        };
        alert(alertTitle, alertMsg, alertPositive, this.thisAlertPositiveListener, alertNegative, this.thisAlertNegativeListener, config);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        try {
            if (!this.b.getAndSet(true)) {
                VerifyLogCat.w(f6094a, "wrong case, need notify");
                VerifyLogger.getInstance().verifyBehavior("UC-MobileIC-20221207-2", "", "", "", new HashMap());
                if (!a()) {
                    VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("1003");
                    if (TaskManager.getInstance().getCurrentTask() != null) {
                        VerifyLogger.getInstance().verifyBehavior("UC-MobileIC-20221207-3", "", "", "", new HashMap());
                        VerifyIdentityTask currentTask = TaskManager.getInstance().getCurrentTask();
                        TaskManager.getInstance().notifyVerifyTaskResult(currentTask.getVerifyId(), currentTask.getToken(), verifyIdentityResult, currentTask);
                    }
                }
            }
        } catch (Throwable th) {
            VerifyLogCat.e(f6094a, "checkIsNeedToNotify exp: ", th);
        }
        b();
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            return !"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.enableMultiCashierFixPolice));
        } catch (Throwable th) {
            VerifyLogCat.e(f6094a, "downgradeDlgNotShowFix exp: ", th);
            return true;
        }
    }

    private synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        VerifyLogCat.i(f6094a, "clear NoticeActivity data");
        if (!a() && this.c != null) {
            this.c.removeCallbacksAndMessages(null);
        }
        alertTitle = null;
        alertMsg = null;
        alertPositive = null;
        alertPositiveListener = null;
        alertNegative = null;
        alertNegativeListener = null;
    }

    public static synchronized void setAlertInfo(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Bundle bundle) {
        synchronized (NoticeActivity.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dc20d11", new Object[]{str, str2, str3, onClickListener, str4, onClickListener2, bundle});
                return;
            }
            alertTitle = str;
            alertMsg = str2;
            alertPositive = str3;
            alertPositiveListener = onClickListener;
            alertNegative = str4;
            alertNegativeListener = onClickListener2;
            config = bundle;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    private void a(final DialogInterface.OnClickListener onClickListener, final DialogInterface dialogInterface, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19045682", new Object[]{this, onClickListener, dialogInterface, new Integer(i)});
            return;
        }
        try {
            VerifyLogCat.i(f6094a, "remove msg MSG_NOT_CLICK_TIMEOUT");
            if (this.c != null) {
                this.c.removeMessages(1001);
            }
        } catch (Throwable th) {
            VerifyLogCat.e(f6094a, "removeTimeoutMsg exp: ", th);
        }
        if (onClickListener != null) {
            if (a()) {
                this.c.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.helper.NoticeActivity.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        String access$100 = NoticeActivity.access$100();
                        VerifyLogCat.i(access$100, "NoticeActivity onAlertClick[" + i + riy.ARRAY_END_STR);
                        onClickListener.onClick(dialogInterface, i);
                    }
                });
            } else {
                String str = f6094a;
                VerifyLogCat.i(str, "NoticeActivity onAlertClick[" + i + riy.ARRAY_END_STR);
                onClickListener.onClick(dialogInterface, i);
            }
        }
        this.b.set(true);
    }

    public static /* synthetic */ void access$000(NoticeActivity noticeActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c02a1b", new Object[]{noticeActivity});
            return;
        }
        try {
            String str = f6094a;
            VerifyLogCat.i(str, "handleDlgClickTimeout dlg show: " + noticeActivity.isDialogShowing());
            HashMap hashMap = new HashMap();
            hashMap.put("dlgShow", String.valueOf(noticeActivity.isDialogShowing()));
            VerifyLogger.getInstance().verifyBehavior("UC-MobileIC-20221207-4", "", "", "", hashMap);
            if (!noticeActivity.isFinishing() && noticeActivity.getDialogHelper().getDialog() != null) {
                noticeActivity.getDialogHelper().getDialog().dismiss();
                noticeActivity.a(alertPositiveListener, noticeActivity.getDialogHelper().getDialog(), -1);
            }
        } catch (Throwable th) {
            VerifyLogCat.e(f6094a, "handleDlgClickTimeout exp: ", th);
        }
        noticeActivity.c();
    }
}
