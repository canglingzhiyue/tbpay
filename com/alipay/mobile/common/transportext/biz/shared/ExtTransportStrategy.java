package com.alipay.mobile.common.transportext.biz.shared;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transportext.util.InnerLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public final class ExtTransportStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXT_PROTO_MRPC = "mrpc";
    public static final String EXT_PROTO_SPDY = "spdy";
    public static final String TAG = "ExtTransportStrategy";
    public static final String UNI_DOMAIN_API = "alipay.unidomain";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5697a = false;
    private static String b;

    public static boolean enableBluetoothReport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("836af28a", new Object[0])).booleanValue();
        }
        return false;
    }

    @Deprecated
    public static void stopPingSent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbdc84d3", new Object[0]);
        }
    }

    public static boolean isLongLinkSpdySwitchOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc010", new Object[0])).booleanValue();
        }
        if (NetworkTunnelStrategy.getInstance().isCanUseSpdyDataTunel()) {
            return TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.SYNC_SPDY_SWITCH, "T");
        }
        return false;
    }

    public static long getPing2GInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2c9f759d", new Object[0])).longValue() : TransportConfigureManager.getInstance().getLongValue(TransportConfigureItem.SECOND_GEN_PING_INTERVAL);
    }

    public static int getConnFailMaxTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c5f084b", new Object[0])).intValue() : NetworkTunnelStrategy.getInstance().getConnFailMaxTime();
    }

    public static long getPing3GInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e7d3f3c", new Object[0])).longValue() : TransportConfigureManager.getInstance().getLongValue(TransportConfigureItem.THIRD_GEN_PING_INTERVAL);
    }

    public static long getPingWifiInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c56e87d", new Object[0])).longValue() : TransportConfigureManager.getInstance().getLongValue(TransportConfigureItem.WIFI_PING_INTERVAL);
    }

    public static long getPingDefaulInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("31f546fb", new Object[0])).longValue() : TransportConfigureManager.getInstance().getLongValue(TransportConfigureItem.PING_DEFAULT_INTERVAL);
    }

    public static long getPingTimeOut() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b86dce34", new Object[0])).longValue() : TransportConfigureManager.getInstance().getLongValue(TransportConfigureItem.PING_TIME_OUT);
    }

    public static final long getReconnectionMaxCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("525c1e6d", new Object[0])).longValue() : TransportConfigureManager.getInstance().getLongValue(TransportConfigureItem.RECONN_MAX_COUNT);
    }

    public static final long getPingInterval(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15984168", new Object[]{context})).longValue();
        }
        if (context == null) {
            LogCatUtil.error(TAG, "context is null. reivew code please !");
            return getPingDefaulInterval();
        }
        int networkType = NetworkUtils.getNetworkType(context);
        LogCatUtil.debug(TAG, "getPingInterval networkType=" + networkType);
        if (networkType == 1) {
            return getPing2GInterval();
        }
        if (networkType != 2) {
            if (networkType == 3) {
                return getPingWifiInterval();
            }
            if (networkType != 4) {
                return getPingDefaulInterval();
            }
        }
        return getPing3GInterval();
    }

    public static boolean isDowngradeTLS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f605f31b", new Object[0])).booleanValue() : TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.DOWNGRADE_TLS_SWITCH, "T");
    }

    public static boolean isSimpleVerifyAltsMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0c3326d", new Object[0])).booleanValue() : TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.VERIFY_ALTS_MODE, "T");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void configInit(android.content.Context r5, com.alipay.mobile.common.transport.context.TransportContext r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r5
            r1[r3] = r6
            java.lang.String r5 = "31f49a78"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            java.lang.String r0 = r6.api
            boolean r0 = android.text.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L1e
            return
        L1e:
            com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy r0 = com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy.getInstance()
            boolean r1 = r0.isCanUseAmnet()
            if (r1 != 0) goto L2f
            boolean r0 = r0.isCanUseSpdy()
            if (r0 != 0) goto L2f
            return
        L2f:
            int r0 = r6.choseExtLinkType     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "spdy"
            if (r0 != r2) goto L3a
            com.alipay.mobile.common.transport.TransportStrategy.fillCurrentReqInfo(r4, r1, r6)     // Catch: java.lang.Throwable -> L6e
            goto L56
        L3a:
            com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy r0 = com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy.getInstance()     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r0.isCanUseAmnet()     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L4d
            boolean r0 = isEnabledTransportByLocalAmnet()     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L4b
            goto L4d
        L4b:
            r0 = 0
            goto L4e
        L4d:
            r0 = 1
        L4e:
            if (r0 == 0) goto L53
            java.lang.String r1 = "mrpc"
        L53:
            com.alipay.mobile.common.transport.TransportStrategy.fillCurrentReqInfo(r4, r1, r6)     // Catch: java.lang.Throwable -> L6e
        L56:
            com.alipay.mobile.common.transport.context.TransportContext$SingleRPCReqConfig r0 = r6.currentReqInfo     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = getSpdyUrl(r5)     // Catch: java.lang.Throwable -> L6e
            r0.callUrl = r5     // Catch: java.lang.Throwable -> L6e
            com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy r5 = com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy.getInstance()     // Catch: java.lang.Throwable -> L6e
            boolean r5 = r5.isUseExtTransport(r6)     // Catch: java.lang.Throwable -> L6e
            if (r5 != 0) goto L69
            return
        L69:
            com.alipay.mobile.common.transport.context.TransportContext$SingleRPCReqConfig r5 = r6.currentReqInfo     // Catch: java.lang.Throwable -> L6e
            r5.use = r3     // Catch: java.lang.Throwable -> L6e
            return
        L6e:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "[configInit] ex = "
            r6.append(r0)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "ExtTransportStrategy"
            com.alipay.mobile.common.transport.utils.LogCatUtil.error(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy.configInit(android.content.Context, com.alipay.mobile.common.transport.context.TransportContext):void");
    }

    public static String getSpdyUrl(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70da4d86", new Object[]{context});
        }
        if (MiscUtils.isDebugger(context)) {
            return getConfigureManager().getStringValue(TransportConfigureItem.SPDY_URL);
        }
        if (!StringUtils.isEmpty(b)) {
            return b;
        }
        b = "https://mobilegw.alipay.com/mgw.htm";
        return "https://mobilegw.alipay.com/mgw.htm";
    }

    public static final TransportConfigureManager getConfigureManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransportConfigureManager) ipChange.ipc$dispatch("7563e2be", new Object[0]) : TransportConfigureManager.getInstance();
    }

    public static int getSpdyShortTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccd74b87", new Object[0])).intValue();
        }
        int intValue = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.SPDY_SHORT_TIME_OUT);
        LogCatUtil.info(InnerLogUtil.MWALLET_SPDY_TAG, "getSpdyShortTimeout. spdyShortTime=[" + intValue + riy.ARRAY_END_STR);
        return intValue;
    }

    public static boolean isUseSpdyShortReadTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff99cdc9", new Object[0])).booleanValue() : f5697a;
    }

    public static void setUseSpdyShortReadTimeout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ecfc8e7", new Object[]{new Boolean(z)});
        } else {
            f5697a = z;
        }
    }

    public static final boolean isEnableDiagnoseBySystem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50e03286", new Object[]{str})).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NETWORK_DIAGNOSE_TRACEROUTE_SYS);
        if (MiscUtils.grayscaleUtdid(str, stringValue)) {
            LogCatUtil.info(TAG, "isEnableDiagnoseBySystem is true, utdid=" + str + ", switch=" + stringValue);
            return true;
        }
        LogCatUtil.info(TAG, "isEnableDiagnoseBySystem is false, utdid=" + str + ", switch=" + stringValue);
        return false;
    }

    public static final boolean isEnableDiagnoseByUser(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a32427a2", new Object[]{str})).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NETWORK_DIAGNOSE_TRACEROUTE_USR);
        if (MiscUtils.grayscaleUtdid(str, stringValue)) {
            LogCatUtil.info(TAG, "isEnableDiagnoseByUser is true, utdid=" + str + ", switch=" + stringValue);
            return true;
        }
        LogCatUtil.info(TAG, "isEnableDiagnoseByUser is false, utdid=" + str + ", switch=" + stringValue);
        return false;
    }

    public static final boolean isEnableDiagnoseByAuto(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c0cd686", new Object[]{str})).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NETWORK_DIAGNOSE_TRACEROUTE_AUTO);
        if (MiscUtils.grayscaleUtdid(str, stringValue)) {
            LogCatUtil.info(TAG, "isEnableDiagnoseByAuto is true, utdid=" + str + ", switch=" + stringValue);
            return true;
        }
        LogCatUtil.info(TAG, "isEnableDiagnoseByAuto is false, utdid=" + str + ", switch=" + stringValue);
        return false;
    }

    public static final boolean isEnableDiagnoseByAuto() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9937eabc", new Object[0])).booleanValue() : isEnableDiagnoseByAuto(DeviceInfoUtil.getDeviceId());
    }

    public static final boolean isEnabledTransportByLocalAmnet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea77a15a", new Object[0])).booleanValue();
        }
        if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.TRANSPORT_LOCAL_AMNET)) || !TransportStrategy.isEnableBifrost()) {
            return false;
        }
        LogCatUtil.info(TAG, "[isEnabledTransportByLocalAmnet] result = true.");
        return true;
    }

    public static final long getRpcDiagnoseUploadTime() {
        Long valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c0bd8d6", new Object[0])).longValue();
        }
        try {
            String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.RPC_DIAGNOSE_UPLOAD_TIME);
            LogCatUtil.info(TAG, "getRpcDiagnoseUploadTime, the rdut time is :" + stringValue + "s");
            if (StringUtils.isEmpty(stringValue) || (valueOf = Long.valueOf(Long.parseLong(stringValue))) == null) {
                return -1L;
            }
            return valueOf.longValue();
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "getRpcDiagnoseUploadTime error: " + th.toString());
            return -1L;
        }
    }
}
