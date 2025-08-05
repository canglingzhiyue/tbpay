package org.android.agoo.oppo;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.m;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.taobao.agoo.util.AgooUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.android.agoo.control.NotifManager;
import tb.jyx;

/* loaded from: classes.dex */
public class OppoRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String OPPO_TOKEN = "OPPO_TOKEN";
    public static final String TAG = "OppoPush";
    private static Context mContext = null;
    private static volatile boolean reportedInOneRegister = false;

    public static /* synthetic */ void access$000(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c002b8c5", new Object[]{context, str, str2});
        } else {
            doRegister(context, str, str2);
        }
    }

    public static /* synthetic */ Context access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d459f9b0", new Object[0]) : mContext;
    }

    public static /* synthetic */ void access$200(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a733f9", new Object[]{context, str});
        } else {
            reportToken(context, str);
        }
    }

    public static void register(final Context context, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e89372", new Object[]{context, str, str2});
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            mContext = applicationContext;
            if (!UtilityImpl.isMainProcess(applicationContext)) {
                ALog.e(TAG, "not in main process, return", new Object[0]);
                return;
            }
            HeytapPushManager.init(AgooUtils.isOptimizationEnabled(context) ? context : mContext, (mContext.getApplicationInfo().flags & 2) != 0);
            boolean isSupportPush = HeytapPushManager.isSupportPush(context);
            ALog.e(TAG, "register", jyx.a.POINT_NAME, Boolean.valueOf(isSupportPush));
            if (!isSupportPush) {
                return;
            }
            BaseNotifyClickActivity.addNotifyListener(new OppoMsgParseImpl());
            if (m.c() && AgooUtils.isOptimizationEnabled(context)) {
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: org.android.agoo.oppo.OppoRegister.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "ACCS-OPPO-SCHEDULE");
                    }
                });
                newSingleThreadExecutor.execute(new Runnable() { // from class: org.android.agoo.oppo.OppoRegister.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            OppoRegister.access$000(context, str, str2);
                        }
                    }
                });
                newSingleThreadExecutor.shutdown();
                return;
            }
            if (!AgooUtils.isOptimizationEnabled(context)) {
                context = mContext;
            }
            HeytapPushManager.register(context, str, str2, new ICallBackResultService() { // from class: org.android.agoo.oppo.OppoRegister.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.heytap.msp.push.callback.ICallBackResultService
                public void onRegister(int i, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad50244", new Object[]{this, new Integer(i), str3});
                        return;
                    }
                    ALog.e(OppoRegister.TAG, "onRegister regid=" + str3, "err_code", Integer.valueOf(i));
                    OppoRegister.access$200(OppoRegister.access$100(), str3);
                }

                @Override // com.heytap.msp.push.callback.ICallBackResultService
                public void onUnRegister(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a36cb0a1", new Object[]{this, new Integer(i)});
                        return;
                    }
                    ALog.e(OppoRegister.TAG, "onUnRegister code=" + i, new Object[0]);
                }

                @Override // com.heytap.msp.push.callback.ICallBackResultService
                public void onSetPushTime(int i, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("eb8efabc", new Object[]{this, new Integer(i), str3});
                    } else {
                        ALog.i(OppoRegister.TAG, "onSetPushTime", new Object[0]);
                    }
                }

                @Override // com.heytap.msp.push.callback.ICallBackResultService
                public void onGetPushStatus(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("50985cea", new Object[]{this, new Integer(i), new Integer(i2)});
                    } else {
                        ALog.i(OppoRegister.TAG, "onGetPushStatus", new Object[0]);
                    }
                }

                @Override // com.heytap.msp.push.callback.ICallBackResultService
                public void onGetNotificationStatus(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f6cffe3b", new Object[]{this, new Integer(i), new Integer(i2)});
                    } else {
                        ALog.i(OppoRegister.TAG, "onGetNotificationStatus", new Object[0]);
                    }
                }

                @Override // com.heytap.msp.push.callback.ICallBackResultService
                public void onError(int i, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str3});
                        return;
                    }
                    ALog.e(OppoRegister.TAG, "onError code=" + i, "s", str3);
                }
            });
        } catch (Throwable th) {
            ALog.e(TAG, "register error", th, new Object[0]);
        }
    }

    private static void doRegister(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66706b27", new Object[]{context, str, str2});
            return;
        }
        reportedInOneRegister = false;
        ALog.e(TAG, "doRegister with retry", new Object[0]);
        int i = 0;
        int i2 = 10000;
        while (true) {
            int i3 = i + 1;
            if (i >= 5) {
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HeytapPushManager.register(AgooUtils.isOptimizationEnabled(context) ? context : mContext, str, str2, new OppoRegisterCallBackService(countDownLatch));
            try {
                if (countDownLatch.await(i2, TimeUnit.MILLISECONDS)) {
                    return;
                }
                ALog.e(TAG, "need retry, now at", Constants.KEY_TIMES, Integer.valueOf(i3));
                i2 <<= 1;
                i = i3;
            } catch (Throwable th) {
                ALog.e(TAG, "doRegister err:", th, new Object[0]);
                return;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class OppoRegisterCallBackService implements ICallBackResultService {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final CountDownLatch mCountDownLatch;

        public OppoRegisterCallBackService(CountDownLatch countDownLatch) {
            this.mCountDownLatch = countDownLatch;
        }

        @Override // com.heytap.msp.push.callback.ICallBackResultService
        public void onRegister(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad50244", new Object[]{this, new Integer(i), str});
                return;
            }
            ALog.e(OppoRegister.TAG, "onRegister called, regid=" + str, "err_code", Integer.valueOf(i));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            OppoRegister.access$200(OppoRegister.access$100(), str);
            this.mCountDownLatch.countDown();
        }

        @Override // com.heytap.msp.push.callback.ICallBackResultService
        public void onUnRegister(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a36cb0a1", new Object[]{this, new Integer(i)});
                return;
            }
            ALog.e(OppoRegister.TAG, "onUnRegister code=" + i, new Object[0]);
        }

        @Override // com.heytap.msp.push.callback.ICallBackResultService
        public void onSetPushTime(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8efabc", new Object[]{this, new Integer(i), str});
            } else {
                ALog.i(OppoRegister.TAG, "onSetPushTime", new Object[0]);
            }
        }

        @Override // com.heytap.msp.push.callback.ICallBackResultService
        public void onGetPushStatus(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50985cea", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                ALog.i(OppoRegister.TAG, "onGetPushStatus", new Object[0]);
            }
        }

        @Override // com.heytap.msp.push.callback.ICallBackResultService
        public void onGetNotificationStatus(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6cffe3b", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                ALog.i(OppoRegister.TAG, "onGetNotificationStatus", new Object[0]);
            }
        }

        @Override // com.heytap.msp.push.callback.ICallBackResultService
        public void onError(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                return;
            }
            ALog.e(OppoRegister.TAG, "onError code=" + i, "s", str);
        }
    }

    public static boolean checkDevice(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f20f6c67", new Object[]{context})).booleanValue();
        }
        try {
            if ((context.getApplicationInfo().flags & 2) == 0) {
                z = false;
            }
            HeytapPushManager.init(context, z);
            return HeytapPushManager.isSupportPush(context);
        } catch (Throwable th) {
            ALog.e(TAG, "checkDevice err", th, new Object[0]);
            return false;
        }
    }

    private static void reportToken(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbf10e6", new Object[]{context, str});
        } else if (reportedInOneRegister || TextUtils.isEmpty(str) || context == null) {
        } else {
            if (m.c() && AgooUtils.isOptimizationEnabled(context)) {
                reportedInOneRegister = true;
            }
            NotifManager notifManager = new NotifManager();
            notifManager.init(context.getApplicationContext());
            notifManager.reportThirdPushToken(str, OPPO_TOKEN, true);
        }
    }
}
