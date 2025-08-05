package org.android.agoo.vivo;

import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.m;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.taobao.agoo.util.AgooUtils;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;
import com.vivo.push.PushConfig;
import com.vivo.push.listener.IPushQueryActionListener;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.android.agoo.control.NotifManager;
import tb.jyx;

/* loaded from: classes.dex */
public class VivoRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "VivoRegister";
    private static Context mContext = null;
    private static volatile boolean reportedInOneRegister = false;
    private static VivoBadgeReceiver vivoBadgeReceiver;

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            doRegister(context);
        }
    }

    public static /* synthetic */ boolean access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue() : reportedInOneRegister;
    }

    public static /* synthetic */ boolean access$102(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        reportedInOneRegister = z;
        return z;
    }

    public static void register(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{context});
        } else if (context == null) {
        } else {
            try {
                mContext = context.getApplicationContext();
                if (!UtilityImpl.isMainProcess(context)) {
                    ALog.e(TAG, "not in main process, return", new Object[0]);
                    return;
                }
                ALog.e(TAG, "VivoRegister start init", new Object[0]);
                boolean isSupport = PushClient.getInstance(context).isSupport();
                ALog.e(TAG, "register start", jyx.a.POINT_NAME, Boolean.valueOf(isSupport));
                if (isSupport) {
                    BaseNotifyClickActivity.addNotifyListener(new VivoMsgParseImpl());
                    if (m.c() && AgooUtils.isOptimizationEnabled(context)) {
                        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: org.android.agoo.vivo.VivoRegister.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.util.concurrent.ThreadFactory
                            public Thread newThread(Runnable runnable) {
                                IpChange ipChange2 = $ipChange;
                                return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "ACCS-VIVO-SCHEDULE");
                            }
                        });
                        newSingleThreadExecutor.execute(new Runnable() { // from class: org.android.agoo.vivo.VivoRegister.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    VivoRegister.access$000(context);
                                }
                            }
                        });
                        newSingleThreadExecutor.shutdown();
                    } else {
                        PushClient.getInstance(context).initialize(new PushConfig.Builder().agreePrivacyStatement(true).build());
                        PushClient.getInstance(context).turnOnPush(new IPushActionListener() { // from class: org.android.agoo.vivo.VivoRegister.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.vivo.push.IPushActionListener
                            public void onStateChanged(int i) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("9c60403a", new Object[]{this, new Integer(i)});
                                    return;
                                }
                                ALog.e(VivoRegister.TAG, "turnOnPush", "state", Integer.valueOf(i));
                                if (i != 0) {
                                    return;
                                }
                                PushClient.getInstance(context).getRegId(new IPushQueryActionListener() { // from class: org.android.agoo.vivo.VivoRegister.3.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.vivo.push.listener.IPushRequestListener
                                    public void onSuccess(String str) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("37d948b5", new Object[]{this, str});
                                            return;
                                        }
                                        ALog.e(VivoRegister.TAG, "getRegId onSuccess", "regId", str);
                                        if (TextUtils.isEmpty(str)) {
                                            return;
                                        }
                                        NotifManager notifManager = new NotifManager();
                                        notifManager.init(context.getApplicationContext());
                                        notifManager.reportThirdPushToken(str, "VIVO_TOKEN", "1.1.5", true);
                                    }

                                    @Override // com.vivo.push.listener.IPushRequestListener
                                    public void onFail(Integer num) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("3bb7d053", new Object[]{this, num});
                                        } else {
                                            ALog.e(VivoRegister.TAG, "getRegId onFail", "errerCode", num);
                                        }
                                    }
                                });
                            }
                        });
                    }
                    vivoBadgeReceiver = new VivoBadgeReceiver();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("msg.action.ACTION_MPM_MESSAGE_BOX_UNREAD");
                    LocalBroadcastManager.getInstance(context).registerReceiver(vivoBadgeReceiver, intentFilter);
                    return;
                }
                ALog.e(TAG, "this device is not support vivo push", new Object[0]);
            } catch (Throwable th) {
                ALog.e(TAG, "register", th, new Object[0]);
            }
        }
    }

    private static void doRegister(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a544393", new Object[]{context});
            return;
        }
        try {
            reportedInOneRegister = false;
            PushClient.getInstance(context).initialize(new PushConfig.Builder().agreePrivacyStatement(true).build());
            int i = 0;
            int i2 = 10000;
            while (true) {
                int i3 = i + 1;
                if (i >= 5) {
                    return;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                PushClient.getInstance(context).turnOnPush(new VivoPushActionListener(countDownLatch, context));
                if (countDownLatch.await(i2, TimeUnit.MILLISECONDS)) {
                    return;
                }
                ALog.e(TAG, "need retry, now at", Constants.KEY_TIMES, Integer.valueOf(i3));
                i2 <<= 1;
                i = i3;
            }
        } catch (Throwable th) {
            ALog.e(TAG, "something wrong in vivo doRegister", th, new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static class VivoPushActionListener implements IPushActionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Context context;
        private CountDownLatch mCountDownLatch;

        public static /* synthetic */ CountDownLatch access$200(VivoPushActionListener vivoPushActionListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("f5a8f76e", new Object[]{vivoPushActionListener}) : vivoPushActionListener.mCountDownLatch;
        }

        public static /* synthetic */ Context access$300() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("fe2b8a32", new Object[0]) : context;
        }

        public VivoPushActionListener(CountDownLatch countDownLatch, Context context2) {
            this.mCountDownLatch = countDownLatch;
            context = context2;
        }

        @Override // com.vivo.push.IPushActionListener
        public void onStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c60403a", new Object[]{this, new Integer(i)});
                return;
            }
            ALog.e(VivoRegister.TAG, "turnOnPush", "state", Integer.valueOf(i));
            if (i != 0) {
                return;
            }
            PushClient.getInstance(context).getRegId(new IPushQueryActionListener() { // from class: org.android.agoo.vivo.VivoRegister.VivoPushActionListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.vivo.push.listener.IPushRequestListener
                public void onSuccess(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("37d948b5", new Object[]{this, str});
                        return;
                    }
                    ALog.e(VivoRegister.TAG, "getRegId onSuccess", "regId", str);
                    if (VivoRegister.access$100() || TextUtils.isEmpty(str)) {
                        return;
                    }
                    VivoRegister.access$102(true);
                    VivoPushActionListener.access$200(VivoPushActionListener.this).countDown();
                    NotifManager notifManager = new NotifManager();
                    notifManager.init(VivoPushActionListener.access$300().getApplicationContext());
                    notifManager.reportThirdPushToken(str, "VIVO_TOKEN", "1.1.5", true);
                }

                @Override // com.vivo.push.listener.IPushRequestListener
                public void onFail(Integer num) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3bb7d053", new Object[]{this, num});
                    } else {
                        ALog.e(VivoRegister.TAG, "getRegId onFail", "errerCode", num);
                    }
                }
            });
        }
    }

    public static boolean checkDevice(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f20f6c67", new Object[]{context})).booleanValue();
        }
        try {
            return PushClient.getInstance(context).isSupport();
        } catch (Throwable th) {
            ALog.e(TAG, "checkDevice err", th, new Object[0]);
            return false;
        }
    }

    public static void unregister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[0]);
            return;
        }
        ALog.i(TAG, MiPushClient.COMMAND_UNREGISTER, new Object[0]);
        if (vivoBadgeReceiver != null) {
            LocalBroadcastManager.getInstance(mContext).unregisterReceiver(vivoBadgeReceiver);
        }
        PushClient.getInstance(mContext).turnOffPush(new IPushActionListener() { // from class: org.android.agoo.vivo.VivoRegister.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.vivo.push.IPushActionListener
            public void onStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9c60403a", new Object[]{this, new Integer(i)});
                } else {
                    ALog.d(VivoRegister.TAG, "turnOffPush", "state", Integer.valueOf(i));
                }
            }
        });
    }
}
