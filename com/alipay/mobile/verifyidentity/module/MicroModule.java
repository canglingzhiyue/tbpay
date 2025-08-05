package com.alipay.mobile.verifyidentity.module;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.mobile.verifyidentity.callback.ModuleListener;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f5883a = "MicroModule";
    private ModuleListener c;
    private String d;
    private String f;
    private boolean h;
    private String j;
    private VerifyIdentityTask k;
    private BroadcastReceiver l;
    private String e = "";
    public AtomicBoolean needKeepInside = new AtomicBoolean(false);
    public boolean isFindAndPay = false;
    private Stack<WeakReference<Activity>> b = new Stack<>();
    private boolean g = false;
    private MicroModuleContext i = MicroModuleContext.getInstance();

    public abstract void onCreate(String str, String str2, String str3, Bundle bundle);

    public abstract void onDestroy();

    public abstract void onStart();

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : f5883a;
    }

    public static /* synthetic */ VerifyIdentityTask access$200(MicroModule microModule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerifyIdentityTask) ipChange.ipc$dispatch("c7e85dad", new Object[]{microModule}) : microModule.k;
    }

    public static /* synthetic */ ModuleListener access$300(MicroModule microModule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ModuleListener) ipChange.ipc$dispatch("b7bc4705", new Object[]{microModule}) : microModule.c;
    }

    public static /* synthetic */ String access$400(MicroModule microModule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("21224f89", new Object[]{microModule}) : microModule.e;
    }

    public static /* synthetic */ String access$500(MicroModule microModule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("21f0ce0a", new Object[]{microModule}) : microModule.d;
    }

    public final void create(String str, String str2, String str3, Bundle bundle, ModuleListener moduleListener, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9b9cca", new Object[]{this, str, str2, str3, bundle, moduleListener, verifyIdentityTask});
            return;
        }
        String str4 = f5883a;
        VerifyLogCat.d(str4, "micromodule: " + getModuleName() + " create");
        this.c = moduleListener;
        this.j = str;
        this.f = str2;
        this.k = verifyIdentityTask;
        if (bundle != null) {
            this.h = bundle.getBoolean(ModuleConstants.VI_MODULE_IS_FIRST, false);
            bundle.remove(ModuleConstants.VI_MODULE_IS_FIRST);
        }
        if (verifyIdentityTask.getPluginOrProxyMode()) {
            this.l = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.MicroModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    final String action = intent == null ? "" : intent.getAction();
                    VerifyLogCat.i(MicroModule.access$000(), String.format("Module中收到收银台退出广播：%s", action));
                    HashMap hashMap = new HashMap();
                    hashMap.put("source", "module");
                    MicroModule.access$100(MicroModule.this, "syttcgb", "UC-MobileIC-170505-5", hashMap);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.MicroModule.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Removed duplicated region for block: B:29:0x00dd A[Catch: Throwable -> 0x00fe, TryCatch #1 {Exception -> 0x0122, blocks: (B:6:0x0015, B:8:0x001f, B:11:0x002f, B:13:0x0039, B:14:0x0042, B:16:0x0055, B:17:0x005c, B:21:0x0072, B:35:0x0108, B:18:0x0060, B:20:0x006a, B:37:0x0117, B:23:0x00b5, B:25:0x00bf, B:27:0x00cf, B:29:0x00dd, B:30:0x00e5, B:32:0x00f3), top: B:42:0x0015 }] */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x00f3 A[Catch: Throwable -> 0x00fe, TRY_LEAVE, TryCatch #1 {Exception -> 0x0122, blocks: (B:6:0x0015, B:8:0x001f, B:11:0x002f, B:13:0x0039, B:14:0x0042, B:16:0x0055, B:17:0x005c, B:21:0x0072, B:35:0x0108, B:18:0x0060, B:20:0x006a, B:37:0x0117, B:23:0x00b5, B:25:0x00bf, B:27:0x00cf, B:29:0x00dd, B:30:0x00e5, B:32:0x00f3), top: B:42:0x0015 }] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public void run() {
                            /*
                                Method dump skipped, instructions count: 302
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.MicroModule.AnonymousClass1.RunnableC01901.run():void");
                        }
                    }, 1500L);
                }
            };
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.i.getContext());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("KExitMiniPayViewNotification");
            intentFilter.addAction(MspGlobalDefine.EXIT_VID_ACTION);
            localBroadcastManager.registerReceiver(this.l, intentFilter);
        }
        onCreate(str, str2, str3, bundle);
    }

    public final void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        String str = f5883a;
        VerifyLogCat.d(str, "micromodule: " + getModuleName() + " start");
        onStart();
    }

    public final synchronized void destroy() {
        WeakReference<Activity> pop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.needKeepInside.get()) {
            VerifyLogCat.i(f5883a, "needKeepInside为true！模块需要保留，忽略这次的destroy()！");
        } else {
            String str = f5883a;
            VerifyLogCat.d(str, "micromodule: " + getModuleName() + " destroy");
            while (!this.b.isEmpty() && (pop = this.b.pop()) != null) {
                Activity activity = pop.get();
                if (activity != null && !activity.isFinishing() && !this.needKeepInside.get()) {
                    activity.finish();
                }
            }
            MicroModuleContext.getInstance().onDestroyModule(this);
            onDestroy();
            if (this.l != null) {
                LocalBroadcastManager.getInstance(this.i.getContext()).unregisterReceiver(this.l);
            }
        }
    }

    public final synchronized void notifyResult(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
        } else if (this.c != null) {
            String str = f5883a;
            VerifyLogCat.d(str, getModuleName() + " notifyResult");
            if (!TextUtils.isEmpty(this.e)) {
                String str2 = f5883a;
                VerifyLogCat.d(str2, "notifyResult [logicModuleName] :" + this.e);
                moduleExecuteResult.setLogicModuleName(this.e);
            }
            this.c.onModuleExecuteResult(this.j, this.f, this.d, moduleExecuteResult, this.k);
            this.c = null;
        } else {
            String str3 = f5883a;
            VerifyLogCat.w(str3, getModuleName() + " mListener is null");
        }
    }

    public void setModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d5f6ea", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getModuleName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this}) : this.d;
    }

    public String getLogicModuleName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fcbf817a", new Object[]{this}) : this.e;
    }

    public void setLogicModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555882a4", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public String getToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a592a696", new Object[]{this}) : this.f;
    }

    public String getVerifyId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8b1b04f", new Object[]{this}) : this.j;
    }

    public MicroModuleContext getMicroModuleContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModuleContext) ipChange.ipc$dispatch("e3291d3f", new Object[]{this}) : this.i;
    }

    public final synchronized void pushActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf58dfa2", new Object[]{this, activity});
            return;
        }
        if (!this.b.isEmpty() && this.b.peek().get() == null) {
            this.b.pop();
        }
        this.b.push(new WeakReference<>(activity));
        String str = f5883a;
        VerifyLogCat.v(str, "pushActivity(): " + activity.getComponentName().getClassName());
    }

    public synchronized void removeActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765c4e8c", new Object[]{this, activity});
            return;
        }
        if (activity != null) {
            WeakReference<Activity> weakReference = null;
            Iterator<WeakReference<Activity>> it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    weakReference = next;
                    break;
                }
            }
            this.b.remove(weakReference);
            String str = f5883a;
            VerifyLogCat.d(str, "remove Activity:" + activity.getClass().getName());
        }
    }

    public void setIsPrevent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c93f7a1", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public VerifyIdentityTask getTask() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerifyIdentityTask) ipChange.ipc$dispatch("413c5404", new Object[]{this}) : this.k;
    }

    public boolean isNeedReportVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3529ed29", new Object[]{this})).booleanValue() : this.h;
    }

    public void setNeedReportVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf25f87", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public static /* synthetic */ void access$100(MicroModule microModule, String str, String str2, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b12c1f05", new Object[]{microModule, str, str2, hashMap});
            return;
        }
        try {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str2, Constants.VI_ENGINE_APPID, str, microModule.getToken(), microModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.w(f5883a, "logBehavior Exception", th);
        }
    }
}
