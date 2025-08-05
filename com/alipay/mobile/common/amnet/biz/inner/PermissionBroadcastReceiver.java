package com.alipay.mobile.common.amnet.biz.inner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.alipay.mobile.common.amnet.biz.OutEventNotifyManagerImpl;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bzz;

/* loaded from: classes3.dex */
public class PermissionBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5369a = false;
    private Context b;

    public static final void registerBroadcast(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66186083", new Object[]{context});
        } else if (context == null) {
            throw new IllegalArgumentException("context maybe null.");
        } else {
            if (f5369a) {
                return;
            }
            synchronized (PermissionBroadcastReceiver.class) {
                if (f5369a) {
                    return;
                }
                context.registerReceiver(new PermissionBroadcastReceiver(context), new IntentFilter("com.eg.android.AlipayGphone.permission.storage.ACTION"));
                f5369a = true;
                LogCatUtil.info("PermissionBroadcastReceiver", "registerReceiver finish.");
            }
        }
    }

    public PermissionBroadcastReceiver(Context context) {
        this.b = context;
        if (this.b == null) {
            LogCatUtil.warn("PermissionBroadcastReceiver", "[PermissionBroadcastReceiver] mContext is null.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        LoggerManagerFactory.getInstance().getDefaultBean().info(bzz.tlogTag, "onReceive:" + getClass().getSimpleName());
        try {
            if (!intent.getBooleanExtra("READ_PHONE_STATE", false)) {
                LogCatUtil.info("PermissionBroadcastReceiver", "Not 'READ_PHONE_STATE' broadcast.");
                return;
            }
            DeviceInfoUtil.reInitDeviceInfo();
            ((OutEventNotifyManagerImpl) NetBeanFactory.getBean(OutEventNotifyManagerImpl.class)).notifyResendInitInfos();
            LogCatUtil.info("PermissionBroadcastReceiver", "notifyResendInitInfos finish.");
        } catch (Throwable th) {
            LogCatUtil.error("PermissionBroadcastReceiver", "Handle Permission broadcast error.", th);
        }
    }
}
