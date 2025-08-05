package com.alipay.android.msp.ui.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.Animation;
import anet.channel.Constants;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.H5Utils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class MiniProgressDialog extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_BIZ_ID = -1;
    private static long d = 15000;

    /* renamed from: a  reason: collision with root package name */
    private MiniProgressLottieView f5043a;
    private final int b;
    private Handler c;
    private Context e;
    private long f;
    private int i;

    public static /* synthetic */ Object ipc$super(MiniProgressDialog miniProgressDialog, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1373052399:
                super.dismiss();
                return null;
            case -742181306:
                return new Boolean(super.isShowing());
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -340027132:
                super.show();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : d;
    }

    public static /* synthetic */ long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue();
        }
        d = j;
        return j;
    }

    public static /* synthetic */ long a(MiniProgressDialog miniProgressDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a733115", new Object[]{miniProgressDialog})).longValue() : miniProgressDialog.f;
    }

    public static /* synthetic */ long a(MiniProgressDialog miniProgressDialog, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33f369b7", new Object[]{miniProgressDialog, new Long(j)})).longValue();
        }
        miniProgressDialog.f = j;
        return j;
    }

    public static /* synthetic */ int b(MiniProgressDialog miniProgressDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7604833", new Object[]{miniProgressDialog})).intValue() : miniProgressDialog.i;
    }

    public static /* synthetic */ void c(MiniProgressDialog miniProgressDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("344d5f5f", new Object[]{miniProgressDialog});
        } else {
            miniProgressDialog.b();
        }
    }

    public static /* synthetic */ MiniProgressLottieView d(MiniProgressDialog miniProgressDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MiniProgressLottieView) ipChange.ipc$dispatch("458d79db", new Object[]{miniProgressDialog}) : miniProgressDialog.f5043a;
    }

    private MiniProgressDialog(Context context) {
        super(context, R.style.ProgressDialog);
        this.f = -1L;
        this.b = 1;
        this.i = -1;
        this.c = new Handler(Looper.getMainLooper()) { // from class: com.alipay.android.msp.ui.widget.MiniProgressDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                MspContext mspContextByBizId;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (MiniProgressDialog.a(MiniProgressDialog.this) == -1 || currentTimeMillis - MiniProgressDialog.a(MiniProgressDialog.this) <= MiniProgressDialog.a()) {
                    sendEmptyMessageDelayed(1, 1000L);
                    return;
                }
                LogUtil.record(4, "MiniProgressDialog:dispatchMessage", "超时");
                if (MiniProgressDialog.b(MiniProgressDialog.this) != -1 && (mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(MiniProgressDialog.b(MiniProgressDialog.this))) != null) {
                    if (!(mspContextByBizId instanceof MspTradeContext)) {
                        StatisticInfo statisticInfo = mspContextByBizId.getStatisticInfo();
                        StringBuilder sb = new StringBuilder();
                        sb.append(mspContextByBizId.getBizId());
                        statisticInfo.addError(ErrorType.DEFAULT, "LoadingTimeout", sb.toString());
                        ActionsCreator.get(mspContextByBizId).createExceptionAction(new RuntimeException("请求处理超时"));
                    } else if (((MspTradeContext) mspContextByBizId).isHasRPC()) {
                        removeMessages(1);
                    } else if (MiniProgressDialog.a() < Constants.RECV_TIMEOUT) {
                        MiniProgressDialog.a((long) Constants.RECV_TIMEOUT);
                        sendEmptyMessageDelayed(1, 1000L);
                        return;
                    }
                }
                removeMessages(1);
                MiniProgressDialog.a(MiniProgressDialog.this, -1L);
            }
        };
        this.e = context;
        String walletConfig = PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_MiniPDialog_outtime");
        if (walletConfig != null && walletConfig.length() > 0) {
            try {
                d = Long.parseLong(walletConfig);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        this.f5043a = new MiniProgressLottieView(this.e);
    }

    public MiniProgressDialog(Context context, int i) {
        this(context);
        this.i = i;
    }

    public String getProgressMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94705a95", new Object[]{this}) : this.f5043a.getProgressMessage();
    }

    public MiniProgressDialog setMessage(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MiniProgressDialog) ipChange.ipc$dispatch("7d437a69", new Object[]{this, charSequence});
        }
        this.f5043a.setMessage(charSequence);
        return this;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        LogUtil.record(2, "MiniProgressDialog:onCreate", "");
        setContentView(this.f5043a);
        if (getWindow() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(67108864);
        }
        getWindow().setLayout(-1, H5Utils.getScreenHeight(this.e));
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    public static boolean isSpecialDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7cbd70", new Object[0])).booleanValue();
        }
        if (Build.MANUFACTURER != null && Build.MODEL != null) {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            String lowerCase2 = Build.MODEL.toLowerCase();
            if (lowerCase.contains("lenovo") && lowerCase2.contains("a820t")) {
                return true;
            }
            if (lowerCase.contains("meizu") && lowerCase2.contains("m040")) {
                return true;
            }
            if (lowerCase.contains("vivo") && lowerCase2.contains("y11")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        this.f = System.currentTimeMillis();
        this.c.sendEmptyMessageDelayed(1, 1000L);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (TaskHelper.isMainThread()) {
            b();
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MiniProgressDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MiniProgressDialog.c(MiniProgressDialog.this);
                    }
                }
            });
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MiniProgressDialog:doDismiss", "");
        this.f5043a.startDismissAnimation(new Animation.AnimationListener() { // from class: com.alipay.android.msp.ui.widget.MiniProgressDialog.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                LogUtil.record(2, "MiniProgressDialog:doDismiss:onAnimationEnd", "");
                MiniProgressDialog.d(MiniProgressDialog.this).setVisibility(4);
                MiniProgressDialog.e(MiniProgressDialog.this);
            }
        });
    }

    public void stopProgressCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7e9a49", new Object[]{this});
            return;
        }
        try {
            this.c.removeMessages(1);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static /* synthetic */ void e(MiniProgressDialog miniProgressDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e278d9d", new Object[]{miniProgressDialog});
            return;
        }
        LogUtil.record(2, "MiniProgressDialog:doDismissSelf", "");
        try {
            miniProgressDialog.c.removeMessages(1);
            if (super.isShowing()) {
                super.dismiss();
            }
            miniProgressDialog.f = -1L;
        } catch (Exception unused) {
        }
        miniProgressDialog.e = null;
        miniProgressDialog.f5043a.stopAnimation();
    }
}
