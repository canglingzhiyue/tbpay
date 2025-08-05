package com.alipay.android.msp.framework.preload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LiveConnectReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(LiveConnectReceiver liveConnectReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "LiveConnectReceiver.onReceive", "传入LiveConnectReceiver的intent为空，退出");
        } else {
            String action = intent.getAction();
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, action, "");
            String str = intent.getPackage();
            if (TextUtils.equals("com.taobao.taobao", str) || TextUtils.equals("com.taobao.litetao", str) || TextUtils.equals("com.taobao.mobile.dipei", str)) {
                GlobalHelper.getInstance().init(context);
                LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "LiveConnectReceiver.onReceive", "广播预连接传入ip地址：".concat(String.valueOf(intent.getStringExtra("dns_ip"))));
                if (intent.getBooleanExtra("msp_pre_load", false)) {
                    a(context);
                }
                if (!TextUtils.equals(action, "com.alipay.phonecashier.prepay")) {
                    return;
                }
                try {
                    LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, action, "");
                    a(context);
                    PreloadManager.startPreLoad(context);
                    return;
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                    return;
                }
            }
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "LiveConnectReceiver.onReceive", "调起LiveConnectReceiver的packageName[" + str + "]不正确(当前只支持手淘)");
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            new MspPreLoadTask(context).execute(new Void[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class MspPreLoadTask extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Context b;

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        public MspPreLoadTask(Context context) {
            this.b = context;
        }

        public Void a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
            }
            LiveConnectReceiver.a(LiveConnectReceiver.this, this.b);
            return null;
        }
    }

    public static /* synthetic */ void a(LiveConnectReceiver liveConnectReceiver, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f79506b", new Object[]{liveConnectReceiver, context});
            return;
        }
        PhoneCashierMspEngine.getMspBase().loadProperties(context);
        MspConfig.getInstance();
    }
}
