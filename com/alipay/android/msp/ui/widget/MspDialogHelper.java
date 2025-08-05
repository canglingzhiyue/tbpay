package com.alipay.android.msp.ui.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl;
import com.alipay.android.msp.utils.H5Utils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class MspDialogHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f5048a;
    private MspContext b;
    private final int c;
    private MspLoadingWrapper d;
    private Dialog e;
    private MspProgressDialogWithAction f;
    private Dialog g;
    private boolean h;

    public static /* synthetic */ Activity a(MspDialogHelper mspDialogHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("5021145", new Object[]{mspDialogHelper}) : mspDialogHelper.f5048a;
    }

    public static /* synthetic */ Dialog a(MspDialogHelper mspDialogHelper, Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("2184a293", new Object[]{mspDialogHelper, dialog});
        }
        mspDialogHelper.g = dialog;
        return dialog;
    }

    public static /* synthetic */ MspProgressDialogWithAction a(MspDialogHelper mspDialogHelper, MspProgressDialogWithAction mspProgressDialogWithAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspProgressDialogWithAction) ipChange.ipc$dispatch("2595c0b3", new Object[]{mspDialogHelper, mspProgressDialogWithAction});
        }
        mspDialogHelper.f = mspProgressDialogWithAction;
        return mspProgressDialogWithAction;
    }

    public static /* synthetic */ void a(MspDialogHelper mspDialogHelper, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc740cd", new Object[]{mspDialogHelper, str, str2, new Long(j)});
        } else {
            mspDialogHelper.a(str, str2, j);
        }
    }

    public static /* synthetic */ int b(MspDialogHelper mspDialogHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bf49677", new Object[]{mspDialogHelper})).intValue() : mspDialogHelper.c;
    }

    public static /* synthetic */ MspProgressDialogWithAction d(MspDialogHelper mspDialogHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspProgressDialogWithAction) ipChange.ipc$dispatch("854d88d0", new Object[]{mspDialogHelper}) : mspDialogHelper.f;
    }

    public static /* synthetic */ Dialog e(MspDialogHelper mspDialogHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("16fe6ce8", new Object[]{mspDialogHelper}) : mspDialogHelper.g;
    }

    public MspDialogHelper(Activity activity, MspContext mspContext) {
        this.f5048a = activity;
        this.b = mspContext;
        this.c = this.b.getBizId();
    }

    public void showDefaultLoading(final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ae4220", new Object[]{this, strArr});
            return;
        }
        Activity activity = this.f5048a;
        if (activity == null || activity.isFinishing()) {
            LogUtil.record(2, "MspDialogHelper:showDefaultLoading", "mActivity=" + this.f5048a);
        } else if (this.h) {
            this.h = false;
            LogUtil.record(2, "MspDialogHelper:doShowDefaultLoading", "handle keepLoading");
        } else {
            TaskHelper.runOnUIThreadAsFast(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspDialogHelper.a(MspDialogHelper.this, strArr);
                    }
                }
            });
        }
    }

    public void stopDefaultLoadingCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08d3cfb", new Object[]{this});
            return;
        }
        MspLoadingWrapper mspLoadingWrapper = this.d;
        if (mspLoadingWrapper != null) {
            mspLoadingWrapper.stopLoadingCountDown();
            return;
        }
        LogUtil.record(2, "MspDialogHelper:stopDefaultLoadingCountDown", "mProgress=" + this.d);
    }

    public void dismissDefaultLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86216ec", new Object[]{this});
            return;
        }
        Activity activity = this.f5048a;
        if (activity == null || activity.isFinishing()) {
            LogUtil.record(2, "MspDialogHelper:dismissDefaultLoading", "mActivity =" + this.f5048a);
            AlertIntelligenceEngine.startAction(this.b, "loading", "hide", "", "");
            return;
        }
        MspTradeContext mspTradeContext = null;
        MspContext mspContext = this.b;
        if (mspContext instanceof MspTradeContext) {
            mspTradeContext = (MspTradeContext) mspContext;
        }
        if (this.h) {
            LogUtil.record(2, "MspDialogHelper:dismissDefaultLoading", "handle keepLoading");
            return;
        }
        MspLoadingWrapper mspLoadingWrapper = this.d;
        if (mspLoadingWrapper != null && mspLoadingWrapper.isShowing() && (mspTradeContext == null || !mspTradeContext.isSubmitState())) {
            this.h = false;
            AlertIntelligenceEngine.startAction(this.b, "loading", "hide", "", "");
            this.d.dismissLoading();
            return;
        }
        MspLoadingWrapper mspLoadingWrapper2 = this.d;
        if (mspLoadingWrapper2 == null || !mspLoadingWrapper2.isShowing()) {
            AlertIntelligenceEngine.startAction(this.b, "loading", "hide", "", "");
        }
        LogUtil.record(2, "MspDialogHelper:dismissDefaultLoading", "mProgress=" + this.d + " ,mspTradeContext=" + mspTradeContext);
    }

    public void showToast(final String str, final String str2, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e52e1f", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        Activity activity = this.f5048a;
        if (activity == null || activity.isFinishing()) {
            LogUtil.record(2, "MspDialogHelper:showToast", "mActivity=" + this.f5048a);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            a(str, str2, j);
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspDialogHelper.a(MspDialogHelper.this, str, str2, j);
                    }
                }
            });
        }
    }

    private void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        dismissDefaultLoading();
        dismissWalletLoading();
        removeMaskView(1500);
        LogUtil.record(2, "MspDialogHelper:showToast ", str + " icon : " + str2);
        if (!TextUtils.isEmpty(str2) && str2.contains("succ")) {
            CustomToast.showToast(this.f5048a, R.drawable.mini_icon_ok, str, j);
        } else if (!TextUtils.isEmpty(str2) && str2.contains("fail")) {
            CustomToast.showToast(this.f5048a, R.drawable.mini_icon_fail, str, j);
        } else {
            CustomToast.showTextToastCenter(this.f5048a, str);
        }
    }

    public void showDialog(final String str, final String str2, final List<MspDialogButton> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd9d8b1", new Object[]{this, str, str2, list});
            return;
        }
        Activity activity = this.f5048a;
        if (activity == null || activity.isFinishing()) {
            LogUtil.record(2, "MspDialogHelper:showDialog", "mActivity=" + this.f5048a);
            return;
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MspDialogHelper.this.dismissDefaultLoading();
                MspDialogHelper.this.dismissWalletLoading();
                MspDialogHelper.this.removeMaskView(0);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    MspDialogButton mspDialogButton = (MspDialogButton) list.get(i);
                    FlybirdDialogEventDesc a2 = MspDialogHelper.a(MspDialogHelper.this, mspDialogButton.mText, mspDialogButton.mEventAction);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                Activity a3 = MspDialogHelper.a(MspDialogHelper.this);
                Activity vidTopActivity = PhoneCashierMspEngine.getMspViSec().getVidTopActivity();
                if (vidTopActivity != null && !vidTopActivity.isFinishing()) {
                    LogUtil.record(4, "showDialog:", "vidActivity != null");
                    a3 = vidTopActivity;
                }
                FlybirdDialogImpl.showDialog(a3, str, str2, arrayList);
            }
        });
    }

    public void setKeepLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d84ea018", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void addMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db286f9", new Object[]{this});
            return;
        }
        Activity activity = this.f5048a;
        if (activity == null || activity.isFinishing()) {
            LogUtil.record(2, "MspDialogHelper:addMaskView", "return, act=" + this.f5048a);
            return;
        }
        TaskHelper.runOnUIThreadAsFast(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MspDialogHelper.c(MspDialogHelper.this);
                }
            }
        });
    }

    public void removeMaskView(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da57427", new Object[]{this, new Integer(i)});
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspDialogHelper.a(MspDialogHelper.this, i);
                    }
                }
            }, i);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        Dialog dialog = this.e;
        if (dialog != null && dialog.isShowing()) {
            this.e.dismiss();
            this.e = null;
        }
        this.b = null;
        this.d = null;
        this.f = null;
        this.g = null;
        this.f5048a = null;
    }

    public void showLoadingWithAction(final Context context, final View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b799ef3", new Object[]{this, context, onClickListener});
            return;
        }
        Activity activity = this.f5048a;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        final String localizedStringForKey = LanguageHelper.localizedStringForKey("alipay_processing_with_point", this.f5048a.getString(R.string.alipay_processing_with_point), new Object[0]);
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MspDialogHelper.this.dismissDefaultLoading();
                MspDialogHelper.this.dismissWalletLoading();
                MspDialogHelper.this.dismissLoadingWithAction();
                MspDialogHelper.a(MspDialogHelper.this, new MspProgressDialogWithAction(context));
                MspDialogHelper.d(MspDialogHelper.this).setMessage(localizedStringForKey);
                MspDialogHelper.d(MspDialogHelper.this).setIndeterminate(true);
                MspDialogHelper.d(MspDialogHelper.this).setCanceledOnTouchOutside(true);
                MspDialogHelper.d(MspDialogHelper.this).setProgressVisiable(true);
                MspDialogHelper.d(MspDialogHelper.this).setActionIcon(R.drawable.alipay_msp_close_white);
                MspDialogHelper.d(MspDialogHelper.this).setActionListener(onClickListener);
                MspDialogHelper.d(MspDialogHelper.this).show();
            }
        });
    }

    public void dismissLoadingWithAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517d1115", new Object[]{this});
            return;
        }
        MspProgressDialogWithAction mspProgressDialogWithAction = this.f;
        if (mspProgressDialogWithAction == null) {
            return;
        }
        mspProgressDialogWithAction.dismiss();
        this.f = null;
    }

    public void showWalletLoading(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f52008e5", new Object[]{this, context, str});
            return;
        }
        Activity activity = this.f5048a;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        final String localizedStringForKey = LanguageHelper.localizedStringForKey("alipay_processing_with_point", this.f5048a.getString(R.string.alipay_processing_with_point), new Object[0]);
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MspDialogHelper.this.dismissWalletLoading();
                if (MspDialogHelper.e(MspDialogHelper.this) == null) {
                    MspDialogHelper.a(MspDialogHelper.this, new Dialog(context, 16973948));
                    MspDialogHelper.e(MspDialogHelper.this).setContentView(R.layout.mini_local_progress_dialog);
                    ((TextView) MspDialogHelper.e(MspDialogHelper.this).findViewById(R.id.progress_message)).setText(TextUtils.isEmpty(str) ? localizedStringForKey : str);
                }
                MspDialogHelper.e(MspDialogHelper.this).setCanceledOnTouchOutside(false);
                try {
                    MspDialogHelper.e(MspDialogHelper.this).show();
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
            }
        });
    }

    public void dismissWalletLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7168a0", new Object[]{this});
            return;
        }
        try {
            if (this.g != null && this.g.isShowing()) {
                this.g.dismiss();
                this.g = null;
                return;
            }
            LogUtil.record(2, "MspDialogHelper:dismissWalletLoading", "mDialog=" + this.g);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void a(MspDialogHelper mspDialogHelper, String[] strArr) {
        Activity activity;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88987efc", new Object[]{mspDialogHelper, strArr});
            return;
        }
        String str = null;
        if (strArr != null && strArr.length > 0) {
            str = strArr[0];
        }
        MspLoadingWrapper mspLoadingWrapper = mspDialogHelper.d;
        if (mspLoadingWrapper != null && mspLoadingWrapper.isShowing()) {
            LogUtil.record(2, "MspDialogHelper:doShowDefaultLoading", "mProgress isShowing =" + mspDialogHelper.d);
            if (TextUtils.equals(mspDialogHelper.d.getLoadingsMessage(), str)) {
                return;
            }
            mspDialogHelper.d.setLoadingMessage(str);
        } else if (mspDialogHelper.b == null) {
            LogUtil.record(2, "MspDialogHelper:doShowDefaultLoading", "mMspContext null");
        } else {
            mspDialogHelper.dismissDefaultLoading();
            MspWindowClient mspWindowClient = (MspWindowClient) mspDialogHelper.b.getMspUIClient();
            if (mspWindowClient == null || !mspWindowClient.isVidActivityVisible() || !mspWindowClient.isVidExitMode()) {
                z = false;
            }
            if (z) {
                activity = mspWindowClient.getVidActivity();
            } else {
                activity = mspDialogHelper.f5048a;
            }
            if (activity == null || activity.isFinishing()) {
                LogUtil.record(2, "MspDialogHelper:doShowDefaultLoading", "activity =".concat(String.valueOf(activity)));
                return;
            }
            AlertIntelligenceEngine.startAction(mspDialogHelper.b, "loading", "show", "", "");
            mspDialogHelper.h = false;
            mspDialogHelper.d = new MspLoadingWrapper(activity, str, false, mspDialogHelper.c);
            try {
                CustomToast.cancelToast();
                mspDialogHelper.d.showLoading();
                LogUtil.record(2, "MspDialogHelper:doShowDefaultLoading", "mProgress show =" + mspDialogHelper.d + " ,activity=" + activity);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    public static /* synthetic */ FlybirdDialogEventDesc a(MspDialogHelper mspDialogHelper, String str, final EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlybirdDialogEventDesc) ipChange.ipc$dispatch("19898ed5", new Object[]{mspDialogHelper, str, eventAction});
        }
        if (!TextUtils.isEmpty(str)) {
            return new FlybirdDialogEventDesc(str, new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    UserFeedBackUtil.getInstance().setUserFeedBackTag("");
                    MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(MspDialogHelper.b(MspDialogHelper.this));
                    if (eventAction == null || mspContextByBizId == null) {
                        return;
                    }
                    ActionsCreator.get(mspContextByBizId).createEventAction(eventAction);
                }
            });
        }
        return null;
    }

    public static /* synthetic */ void c(MspDialogHelper mspDialogHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9548ebc5", new Object[]{mspDialogHelper});
            return;
        }
        if (mspDialogHelper.e == null) {
            mspDialogHelper.e = new Dialog(mspDialogHelper.f5048a, R.style.MspAppTheme);
            if (MiniProgressDialog.isSpecialDevice() && mspDialogHelper.e.getWindow() != null) {
                mspDialogHelper.e.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            if (Build.VERSION.SDK_INT >= 21 && mspDialogHelper.e.getWindow() != null) {
                mspDialogHelper.e.getWindow().addFlags(134217728);
                mspDialogHelper.e.getWindow().addFlags(67108864);
                mspDialogHelper.e.getWindow().setLayout(-1, H5Utils.getScreenHeight(mspDialogHelper.f5048a));
            }
        }
        try {
            LogUtil.record(2, "MspDialogHelper:addMaskView", "act=" + mspDialogHelper.f5048a);
            mspDialogHelper.e.requestWindowFeature(1);
            mspDialogHelper.e.show();
            mspDialogHelper.e.setCanceledOnTouchOutside(false);
            mspDialogHelper.e.setCancelable(false);
            if (mspDialogHelper.b == null) {
                return;
            }
            mspDialogHelper.b.getStatisticInfo().addEvent(new StEvent(mspDialogHelper.b.getCurrentWinTpName(), "dialog", "addMask"));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public static /* synthetic */ void a(MspDialogHelper mspDialogHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11685a20", new Object[]{mspDialogHelper, new Integer(i)});
            return;
        }
        Dialog dialog = mspDialogHelper.e;
        if (dialog != null && dialog.isShowing()) {
            try {
                LogUtil.record(2, "MspDialogHelper:removeMaskView", "delay=" + i + " act=" + mspDialogHelper.f5048a);
                mspDialogHelper.e.dismiss();
                mspDialogHelper.e = null;
                if (mspDialogHelper.b == null) {
                    return;
                }
                mspDialogHelper.b.getStatisticInfo().addEvent(new StEvent(mspDialogHelper.b.getCurrentWinTpName(), "dialog", "removeMask"));
                return;
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
                return;
            }
        }
        LogUtil.record(2, "MspDialogHelper:removeMaskView", "else, delay=" + i + " act=" + mspDialogHelper.f5048a);
    }
}
