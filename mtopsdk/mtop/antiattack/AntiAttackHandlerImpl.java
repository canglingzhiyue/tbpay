package mtopsdk.mtop.antiattack;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.RequestPoolManager;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.xstate.a;
import tb.kge;
import tb.orq;

/* loaded from: classes.dex */
public class AntiAttackHandlerImpl implements AntiAttackHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_WAIT_RESULT_TIME_OUT = 20000;
    private static final String MTOPSDK_ANTI_ATTACK_ACTION = "mtopsdk.mtop.antiattack.checkcode.validate.activity_action";
    private static final String MTOPSDK_ANTI_ATTACK_RESULT_ACTION = "mtopsdk.extra.antiattack.result.notify.action";
    private static final String TAG = "mtopsdk.AntiAttackHandlerImpl";
    public final Context mContext;
    public final AtomicBoolean isHandling = new AtomicBoolean(false);
    private final IntentFilter intentFilter = new IntentFilter(MTOPSDK_ANTI_ATTACK_RESULT_ACTION);
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable timeoutRunnable = new Runnable() { // from class: mtopsdk.mtop.antiattack.AntiAttackHandlerImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AntiAttackHandlerImpl.this.isHandling.set(false);
            RequestPoolManager.a(RequestPoolManager.Type.ANTI).a(Mtop.instance(Mtop.Id.INNER, AntiAttackHandlerImpl.this.mContext), "", ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK, ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
        }
    };
    public final BroadcastReceiver antiAttackReceiver = new BroadcastReceiver() { // from class: mtopsdk.mtop.antiattack.AntiAttackHandlerImpl.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            try {
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                try {
                    String stringExtra = intent.getStringExtra("Result");
                    TBSdkLog.i(AntiAttackHandlerImpl.TAG, "[onReceive]AntiAttack result: " + stringExtra);
                    if ("success".equals(stringExtra)) {
                        RequestPoolManager.a(RequestPoolManager.Type.ANTI).a(Mtop.instance(Mtop.Id.INNER, AntiAttackHandlerImpl.this.mContext), "");
                    } else {
                        RequestPoolManager.a(RequestPoolManager.Type.ANTI).a(Mtop.instance(Mtop.Id.INNER, AntiAttackHandlerImpl.this.mContext), "", ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK, ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
                    }
                    AntiAttackHandlerImpl.access$100(AntiAttackHandlerImpl.this).removeCallbacks(AntiAttackHandlerImpl.access$000(AntiAttackHandlerImpl.this));
                    AntiAttackHandlerImpl.this.isHandling.set(false);
                    try {
                        AntiAttackHandlerImpl.this.mContext.unregisterReceiver(AntiAttackHandlerImpl.this.antiAttackReceiver);
                    } catch (Exception unused) {
                        TBSdkLog.e(AntiAttackHandlerImpl.TAG, "waiting antiattack exception");
                    }
                } catch (Exception unused2) {
                    TBSdkLog.e(AntiAttackHandlerImpl.TAG, "[onReceive]AntiAttack exception");
                    RequestPoolManager.a(RequestPoolManager.Type.ANTI).a(Mtop.instance(Mtop.Id.INNER, AntiAttackHandlerImpl.this.mContext), "", ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK, ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
                    AntiAttackHandlerImpl.access$100(AntiAttackHandlerImpl.this).removeCallbacks(AntiAttackHandlerImpl.access$000(AntiAttackHandlerImpl.this));
                    AntiAttackHandlerImpl.this.isHandling.set(false);
                    try {
                        AntiAttackHandlerImpl.this.mContext.unregisterReceiver(AntiAttackHandlerImpl.this.antiAttackReceiver);
                    } catch (Exception unused3) {
                        TBSdkLog.e(AntiAttackHandlerImpl.TAG, "waiting antiattack exception");
                    }
                }
            } catch (Throwable th) {
                AntiAttackHandlerImpl.access$100(AntiAttackHandlerImpl.this).removeCallbacks(AntiAttackHandlerImpl.access$000(AntiAttackHandlerImpl.this));
                AntiAttackHandlerImpl.this.isHandling.set(false);
                try {
                    AntiAttackHandlerImpl.this.mContext.unregisterReceiver(AntiAttackHandlerImpl.this.antiAttackReceiver);
                } catch (Exception unused4) {
                    TBSdkLog.e(AntiAttackHandlerImpl.TAG, "waiting antiattack exception");
                }
                throw th;
            }
        }
    };

    static {
        kge.a(1029545509);
        kge.a(1304199781);
    }

    public static /* synthetic */ Runnable access$000(AntiAttackHandlerImpl antiAttackHandlerImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("7022fe0f", new Object[]{antiAttackHandlerImpl}) : antiAttackHandlerImpl.timeoutRunnable;
    }

    public static /* synthetic */ Handler access$100(AntiAttackHandlerImpl antiAttackHandlerImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("519fee42", new Object[]{antiAttackHandlerImpl}) : antiAttackHandlerImpl.handler;
    }

    public AntiAttackHandlerImpl(Context context) {
        this.mContext = context;
    }

    @Override // mtopsdk.mtop.antiattack.AntiAttackHandler
    public void handle(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690a6843", new Object[]{this, str, str2});
            return;
        }
        String sb = new StringBuilder(str).toString();
        boolean b = a.b();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[handle]execute new 419 Strategy,location=" + sb + ", isBackground=" + b);
        }
        if (!this.isHandling.compareAndSet(false, true)) {
            TBSdkLog.i(TAG, "isHandling");
            return;
        }
        try {
            long globalAttackAttackWaitInterval = SwitchConfig.getInstance().getGlobalAttackAttackWaitInterval();
            this.handler.postDelayed(this.timeoutRunnable, globalAttackAttackWaitInterval > 0 ? globalAttackAttackWaitInterval * 1000 : orq.FRAME_CHECK_TIMEOUT);
            Intent intent = new Intent();
            intent.setAction(MTOPSDK_ANTI_ATTACK_ACTION);
            intent.setPackage(this.mContext.getPackageName());
            intent.setFlags(268435456);
            intent.putExtra(HttpConstant.LOCATION, sb);
            this.mContext.startActivity(intent);
            this.mContext.registerReceiver(this.antiAttackReceiver, this.intentFilter);
        } catch (Exception e) {
            this.isHandling.set(false);
            this.handler.removeCallbacks(this.timeoutRunnable);
            RequestPoolManager.a(RequestPoolManager.Type.ANTI).a(Mtop.instance(Mtop.Id.INNER, this.mContext), "", ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK, ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
            TBSdkLog.w(TAG, "[handle] execute new 419 Strategy error.", e);
        }
    }
}
