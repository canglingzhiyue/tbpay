package com.alipay.mobile.common.transport.monitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class NetworkServiceTracer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LAST_STATE_COUNT = "last_state_count";
    public static final String KEY_LAST_STATE_TS = "last_state_ts";
    public static final String REPORT_BIZ_NAME = "BIZ_NETWORK";
    public static final String REPORT_SUB_NAME_DJG = "DJG";
    public static final String REPORT_SUB_NAME_H5 = "H5";
    public static final String REPORT_SUB_NAME_NBNET_UP = "NBNET_UP";
    public static final String REPORT_SUB_NAME_RPC = "RPC";
    public static final String REPORT_SUB_NAME_RSRC = "RSRC";
    public static final String TAG = "NS_TRACER";
    public static final String TRACE_STATE_FILE = "NS_Tracer_Data";
    private static NetworkServiceTracer c;

    /* renamed from: a  reason: collision with root package name */
    private long f5598a;
    private NSTraceItem[] b;
    public int maxErrorCount;

    /* loaded from: classes3.dex */
    public class NSTraceItem {
        public int errorCount;
        public long firstErrorTime;
        public int lastErrorCode;
        public String lastErrorMsg;
        public long lastErrorTime;
        public String networkType;

        public NSTraceItem() {
        }
    }

    /* loaded from: classes3.dex */
    public enum TRACE_ITEM_INDEX {
        TRACE_ITEM_RPC,
        TRACE_ITEM_H5,
        TRACE_ITEM_RSRC,
        TRACE_ITEM_DJG,
        TRACE_ITEM_NBNET_UP
    }

    private String a(byte b) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3af7cdcc", new Object[]{this, new Byte(b)}) : b == 1 ? REPORT_SUB_NAME_RPC : b == 2 ? "H5" : b == 4 ? REPORT_SUB_NAME_RSRC : b == 3 ? REPORT_SUB_NAME_DJG : b == 6 ? REPORT_SUB_NAME_NBNET_UP : "";
    }

    public static NetworkServiceTracer getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkServiceTracer) ipChange.ipc$dispatch("fc3685a6", new Object[0]);
        }
        synchronized (NetworkServiceTracer.class) {
            if (c == null) {
                c = new NetworkServiceTracer();
            }
        }
        return c;
    }

    private NetworkServiceTracer() {
        NSTraceItem[] nSTraceItemArr;
        this.maxErrorCount = 5;
        TransportConfigureManager transportConfigureManager = TransportConfigureManager.getInstance();
        this.f5598a = transportConfigureManager.getLongValue(TransportConfigureItem.NETSERVICE_REPORT_PERIOD);
        this.maxErrorCount = transportConfigureManager.getIntValue(TransportConfigureItem.NETSERVICE_REPORT_ERRCOUNT);
        a();
        Context context = TransportEnvUtil.getContext();
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(TRACE_STATE_FILE, 4);
            for (NSTraceItem nSTraceItem : this.b) {
                nSTraceItem.firstErrorTime = sharedPreferences.getLong(getTSKeyByName(nSTraceItem.networkType), 0L);
                nSTraceItem.errorCount = sharedPreferences.getInt(getCountKeyByName(nSTraceItem.networkType), 0);
            }
            return;
        }
        LogCatUtil.debug(TAG, "Context is not intialzied yet");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = new NSTraceItem[5];
        this.b[TRACE_ITEM_INDEX.TRACE_ITEM_RPC.ordinal()] = new NSTraceItem();
        this.b[TRACE_ITEM_INDEX.TRACE_ITEM_H5.ordinal()] = new NSTraceItem();
        this.b[TRACE_ITEM_INDEX.TRACE_ITEM_RSRC.ordinal()] = new NSTraceItem();
        this.b[TRACE_ITEM_INDEX.TRACE_ITEM_DJG.ordinal()] = new NSTraceItem();
        this.b[TRACE_ITEM_INDEX.TRACE_ITEM_NBNET_UP.ordinal()] = new NSTraceItem();
        NSTraceItem a2 = a(TRACE_ITEM_INDEX.TRACE_ITEM_RPC);
        NSTraceItem a3 = a(TRACE_ITEM_INDEX.TRACE_ITEM_H5);
        NSTraceItem a4 = a(TRACE_ITEM_INDEX.TRACE_ITEM_RSRC);
        NSTraceItem a5 = a(TRACE_ITEM_INDEX.TRACE_ITEM_DJG);
        NSTraceItem a6 = a(TRACE_ITEM_INDEX.TRACE_ITEM_NBNET_UP);
        a2.networkType = REPORT_SUB_NAME_RPC;
        a3.networkType = "H5";
        a4.networkType = REPORT_SUB_NAME_RSRC;
        a5.networkType = REPORT_SUB_NAME_DJG;
        a6.networkType = REPORT_SUB_NAME_NBNET_UP;
    }

    public synchronized void recordError(byte b, int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f38fd96", new Object[]{this, new Byte(b), new Integer(i), str, map});
            return;
        }
        LogCatUtil.debug(TAG, "--->Exception reported to NSTracer, type=" + ((int) b));
        if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
            LogCatUtil.debug(TAG, "network isn't available,need't record error");
            return;
        }
        String a2 = a(b);
        if (TextUtils.isEmpty(a2)) {
            LogCatUtil.debug(TAG, "recordError unknown bizType,ignored");
            return;
        }
        NSTraceItem b2 = b(a2);
        long currentTimeMillis = System.currentTimeMillis();
        if (b2 != null) {
            if (b2.errorCount == 0) {
                b2.firstErrorTime = currentTimeMillis;
            }
            b2.errorCount++;
            b2.lastErrorCode = i;
            b2.lastErrorMsg = str;
            b2.lastErrorTime = currentTimeMillis;
            a(a2, map);
            return;
        }
        LogCatUtil.debug(TAG, "Empty item for tunnel type" + a2);
    }

    public void clearErrorByType(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc84d0c9", new Object[]{this, new Byte(b)});
            return;
        }
        try {
            String a2 = a(b);
            if (TextUtils.isEmpty(a2)) {
                LogCatUtil.debug(TAG, "clearErrorByType unknown bizType,ignored");
                return;
            }
            NSTraceItem b2 = b(a2);
            if (b2 == null) {
                return;
            }
            b2.errorCount = 0;
            b2.firstErrorTime = 0L;
            b2.lastErrorCode = 0;
            b2.lastErrorMsg = "";
            b2.lastErrorTime = 0L;
            LogCatUtil.debug(TAG, "Clearing error state for subtype:" + b2.networkType);
            c(a2);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "clearErrorByType exception", th);
        }
    }

    private NSTraceItem a(TRACE_ITEM_INDEX trace_item_index) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NSTraceItem) ipChange.ipc$dispatch("4f3d1775", new Object[]{this, trace_item_index}) : this.b[trace_item_index.ordinal()];
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NETSERVICE_RPC_LIST);
        if (!TextUtils.isEmpty(stringValue)) {
            for (String str2 : stringValue.split(",")) {
                if (TextUtils.equals(str2, str)) {
                    LogCatUtil.info(TAG, "importRpc.opeType: " + str);
                    return true;
                }
            }
        }
        return false;
    }

    private NSTraceItem b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NSTraceItem) ipChange.ipc$dispatch("556b5ed8", new Object[]{this, str});
        }
        if (TextUtils.equals(str, REPORT_SUB_NAME_RPC)) {
            return this.b[TRACE_ITEM_INDEX.TRACE_ITEM_RPC.ordinal()];
        }
        if (TextUtils.equals(str, "H5")) {
            return this.b[TRACE_ITEM_INDEX.TRACE_ITEM_H5.ordinal()];
        }
        if (TextUtils.equals(str, REPORT_SUB_NAME_RSRC)) {
            return this.b[TRACE_ITEM_INDEX.TRACE_ITEM_RSRC.ordinal()];
        }
        if (TextUtils.equals(str, REPORT_SUB_NAME_DJG)) {
            return this.b[TRACE_ITEM_INDEX.TRACE_ITEM_DJG.ordinal()];
        }
        if (TextUtils.equals(str, REPORT_SUB_NAME_NBNET_UP)) {
            return this.b[TRACE_ITEM_INDEX.TRACE_ITEM_NBNET_UP.ordinal()];
        }
        LogCatUtil.debug(TAG, "getTraceItemByName,networkType unknown error");
        return null;
    }

    private synchronized void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        NSTraceItem b = b(str);
        String str2 = map.get(HeaderConstant.HEADER_KEY_OPERATION_TYPE);
        if (TextUtils.equals(str, REPORT_SUB_NAME_RPC) && a(str2)) {
            LogCatUtil.debug(TAG, "import rpc ex,report rignt now");
            a(b);
            c(str);
            return;
        }
        if (MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NETSERVICE_UPERR_REPORT))) {
            map.get("DJG_UP_BIZ");
            if (TextUtils.equals(str, REPORT_SUB_NAME_DJG)) {
                LogCatUtil.debug(TAG, "DJG up ex,report rignt now");
                a(b);
                c(str);
                return;
            } else if (TextUtils.equals(str, REPORT_SUB_NAME_NBNET_UP)) {
                LogCatUtil.debug(TAG, "nbnet_up up ex, report rignt now");
                a(b);
                c(str);
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (b.errorCount > this.maxErrorCount && currentTimeMillis - b.firstErrorTime > this.f5598a) {
            a(b);
        } else {
            LogCatUtil.verbose(TAG, "Waiting for more error happened,subtype=" + b.networkType + " from begin time:" + (currentTimeMillis - b.firstErrorTime) + " ms");
        }
        c(str);
    }

    private void a(NSTraceItem nSTraceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7980dc8d", new Object[]{this, nSTraceItem});
            return;
        }
        String valueOf = String.valueOf(nSTraceItem.lastErrorCode);
        HashMap hashMap = new HashMap();
        hashMap.put("Last_error_msg", nSTraceItem.lastErrorMsg);
        hashMap.put("Last_error_ts", String.valueOf(nSTraceItem.lastErrorTime));
        MonitorInfoUtil.recordUnavailable("BIZ_NETWORK", nSTraceItem.networkType, valueOf, hashMap);
        LogCatUtil.debug(TAG, "--->mtBizReport invoked, subname=" + nSTraceItem.networkType);
        nSTraceItem.errorCount = 0;
        nSTraceItem.firstErrorTime = 0L;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transport.monitor.NetworkServiceTracer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SignalStateHelper.getInstance().reportNetStateInfo();
                    AlipayQosService.getInstance().getQosLevel();
                    ExtTransportOffice.getInstance().diagnoseNotify();
                }
            });
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "startNetworkDiagnose ex:" + th.toString());
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        NSTraceItem[] nSTraceItemArr = this.b;
        if (nSTraceItemArr == null || nSTraceItemArr.length == 0) {
            LogCatUtil.debug(TAG, "Nothing to save...");
            return;
        }
        SharedPreferences.Editor edit = TransportEnvUtil.getContext().getSharedPreferences(TRACE_STATE_FILE, 4).edit();
        NSTraceItem b = b(str);
        LogCatUtil.verbose(TAG, "trying to persistTrace Item: " + b.networkType + " first error Time=" + b.firstErrorTime + " error count=" + b.errorCount);
        edit.putLong(getTSKeyByName(b.networkType), b.firstErrorTime);
        edit.putInt(getCountKeyByName(b.networkType), b.errorCount);
        edit.commit();
    }

    public String getTSKeyByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8789eac3", new Object[]{this, str});
        }
        return str + "_" + KEY_LAST_STATE_TS;
    }

    public String getCountKeyByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4d82dc7", new Object[]{this, str});
        }
        return str + "_" + KEY_LAST_STATE_COUNT;
    }
}
