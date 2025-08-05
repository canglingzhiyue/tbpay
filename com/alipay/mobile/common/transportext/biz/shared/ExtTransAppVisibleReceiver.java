package com.alipay.mobile.common.transportext.biz.shared;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.biz.rpctest.RpcTestService;
import com.alipay.mobile.common.transportext.biz.shared.spdy.SpdyShortTimeoutHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.bzz;

/* loaded from: classes3.dex */
public class ExtTransAppVisibleReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAMEWORK_ACTIVITY_RESUME = "com.alipay.mobile.framework.BROUGHT_TO_FOREGROUND";
    public static final String FRAMEWORK_ACTIVITY_USERLEAVEHINT = "com.alipay.mobile.framework.USERLEAVEHINT";

    /* renamed from: a  reason: collision with root package name */
    private boolean f5693a = true;
    private boolean b = true;

    public static /* synthetic */ Object ipc$super(ExtTransAppVisibleReceiver extTransAppVisibleReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void regiester() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc1b505", new Object[]{this});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(FRAMEWORK_ACTIVITY_RESUME);
            intentFilter.addAction(FRAMEWORK_ACTIVITY_USERLEAVEHINT);
            LocalBroadcastManager.getInstance(ExtTransportEnv.getAppContext()).registerReceiver(this, intentFilter);
            if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
                return;
            }
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.SCREEN_OFF");
            intentFilter2.addAction("android.intent.action.SCREEN_ON");
            ExtTransportEnv.getAppContext().registerReceiver(this, intentFilter2);
        } catch (Exception e) {
            LogCatUtil.warn("ExtTransAppVisibleReceiver", e);
        }
    }

    public void unregister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(ExtTransportEnv.getAppContext()).unregisterReceiver(this);
        } catch (Exception e) {
            LogCatUtil.warn("ExtTransAppVisibleReceiver", "unregister exception: " + e.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        LogCatUtil.info(bzz.tlogTag, "onReceive:" + getClass().getSimpleName());
        String action = intent.getAction();
        if (FRAMEWORK_ACTIVITY_RESUME.equalsIgnoreCase(action)) {
            this.f5693a = true;
            if (!this.b) {
                return;
            }
            a();
        } else if (FRAMEWORK_ACTIVITY_USERLEAVEHINT.equalsIgnoreCase(action)) {
            this.f5693a = false;
            b();
        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
            this.b = true;
            if (!this.f5693a) {
                return;
            }
            a();
        } else if (!"android.intent.action.SCREEN_OFF".equals(action)) {
        } else {
            this.b = false;
            if (!this.f5693a) {
                return;
            }
            b();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        SpdyShortTimeoutHelper.adjustmentSpdyTimeout();
        c();
        ExtTransportEnv.getAppContext();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SpdyShortTimeoutHelper.setLeaveTime(System.currentTimeMillis());
        ExtTransportEnv.getAppContext();
        RpcTestService.getInstance().sendTestRpc();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!MiscUtils.isDebugger(ExtTransportEnv.getAppContext()) || !MiscUtils.isInAlipayClient(ExtTransportEnv.getAppContext())) {
        } else {
            NetworkAsyncTaskExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.shared.ExtTransAppVisibleReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        LogCatUtil.info("ExtTransAppVisibleReceiver", "triggerTestCases#run  start");
                        Class<?> cls = Class.forName("com.alipay.mobile.common.transportext.test.ExtTestCaseSuit");
                        cls.getDeclaredMethod("main", new Class[0]).invoke(cls, new Object[0]);
                    } catch (Throwable th) {
                        LogCatUtil.warn("ExtTransAppVisibleReceiver", "triggerTestCases#run exception: " + th.toString());
                    }
                }
            }, 10L, 40L, TimeUnit.SECONDS);
        }
    }
}
