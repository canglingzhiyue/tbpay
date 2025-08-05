package com.alipay.mobile.common.transport.zfeatures;

import android.os.SystemClock;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.GtsUtils;
import com.alipay.mobile.common.transport.utils.HexaDecimalConvUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ServerTimeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ServerTimeManager c;

    /* renamed from: a  reason: collision with root package name */
    private long f5642a = -1;
    private long b = -1;

    public static ServerTimeManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServerTimeManager) ipChange.ipc$dispatch("5a0bd5a2", new Object[0]);
        }
        ServerTimeManager serverTimeManager = c;
        if (serverTimeManager != null) {
            return serverTimeManager;
        }
        synchronized (ServerTimeManager.class) {
            if (c != null) {
                return c;
            }
            c = new ServerTimeManager();
            return c;
        }
    }

    private ServerTimeManager() {
    }

    public void setServerTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553fbfab", new Object[]{this, new Long(j)});
            return;
        }
        this.f5642a = j;
        this.b = SystemClock.elapsedRealtime();
    }

    public String get64HexCurrentTimeMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("445df574", new Object[]{this});
        }
        if (isEnableCorrectCheckSignTimestamp()) {
            return HexaDecimalConvUtil.c10to64(getCurrentTimeMillis());
        }
        return GtsUtils.get64HexCurrentTimeMillis();
    }

    public long getCurrentTimeMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7aff3291", new Object[]{this})).longValue();
        }
        if (this.f5642a != -1) {
            return this.f5642a + (SystemClock.elapsedRealtime() - this.b);
        }
        return System.currentTimeMillis();
    }

    public boolean isEnableCorrectCheckSignTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb33ac79", new Object[]{this})).booleanValue();
        }
        if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
            LogCatUtil.info("ServerTimeManager", "isEnableCorrectCheckSignTimestamp debuggable");
            return true;
        }
        try {
            return MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.CORRECT_CHECK_SIGN_TIMESTAMP_FAILURE));
        } catch (Throwable th) {
            LogCatUtil.error("ServerTimeManager", "isEnableCorrectCheckSignTimestamp error", th);
            return false;
        }
    }
}
