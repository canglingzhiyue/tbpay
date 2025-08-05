package com.alipay.mobile.common.transportext.biz.shared.spdy;

import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.api.ExtTransportManager;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportManagerImpl;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy;
import com.alipay.mobile.common.transportext.util.InnerLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class SpdyShortTimeoutHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static long f5699a = -1;

    public static final void adjustmentSpdyTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342929", new Object[0]);
            return;
        }
        LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "start adjustmentSpdyTimeout");
        if (!NetworkTunnelStrategy.getInstance().isCanUseSpdy()) {
            LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "adjustmentSpdyTimeout.  spdy off.");
            return;
        }
        ExtTransportManager spdyTransportManager = ((ExtTransportManagerImpl) ExtTransportOffice.getInstance().getExtTransportManager()).getSpdyTransportManager();
        if (spdyTransportManager == null) {
            LogCatUtil.warn(InnerLogUtil.MWALLET_SPDY_TAG, "[adjustmentSpdyTimeout] Spdy not supported.");
        } else if (!spdyTransportManager.isConnected()) {
            LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "adjustmentSpdyTimeout.  spdy connection closed.");
        } else if (spdyTransportManager.isNetworkActive()) {
            LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "adjustmentSpdyTimeout. spdy not active.");
        } else {
            int intValue = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.SPDY_TIME_TO_ASLEEP);
            long currentTimeMillis = System.currentTimeMillis() - f5699a;
            LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "adjustmentSpdyTimeout. leaveTime=[" + f5699a + "] leaveHowTime=[" + currentTimeMillis + "] timeToAsleep=[" + intValue + riy.ARRAY_END_STR);
            if (f5699a == -1 || currentTimeMillis <= intValue) {
                return;
            }
            ExtTransportStrategy.setUseSpdyShortReadTimeout(true);
            LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "adjustmentSpdyTimeout. setUseSpdyShortReadTimeout");
        }
    }

    public static final void setLeaveTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d508c7b", new Object[]{new Long(j)});
        } else {
            f5699a = j;
        }
    }
}
