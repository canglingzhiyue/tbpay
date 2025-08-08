package com.alipay.mobile.common.transport.context;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.PerformanceDataCallback;
import com.alipay.mobile.common.transport.monitor.DataContainer;
import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.monitor.RPCDataContainer;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class TransportContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte BIZ_TYPE_DJG = 3;
    public static final byte BIZ_TYPE_H5 = 2;
    public static final byte BIZ_TYPE_LOG = 5;
    public static final byte BIZ_TYPE_NBNET_UP = 6;
    public static final byte BIZ_TYPE_RPC = 1;
    public static final byte BIZ_TYPE_RSRC = 4;
    public static final byte DEFAULT_LINK = 1;
    public static final byte LOCAL_AMNET_LINK = 4;
    public static final byte SPDY_LINK = 2;

    /* renamed from: a  reason: collision with root package name */
    private static final RPCDataContainer f5529a = new EmptyDataContainer();
    public String api;
    public Context context;
    public SingleRPCReqConfig currentReqInfo;
    public DeviceTrafficStateInfo deviceTrafficStateInfo;
    public Map<String, String> logAttachmentMap;
    public int logRandom;
    public PerformanceDataCallback mPerformanceDataCallback;
    public int net0;
    public int net1;
    public HttpUrlRequest originRequest;
    public String perfLog;
    public boolean reqGzip;
    public String routeInfo;
    public String rpcUUID;
    public boolean testUser;
    public String url;
    public Map<String, DataContainer> dcList = new HashMap();
    public boolean mInitd = false;
    private Map<String, String> b = new HashMap();
    public int choseExtLinkType = 1;
    public byte bizType = 1;
    public long startExecutionTime = -1;
    public boolean printUrlToMonitorLog = true;
    public boolean enableHttpCache = false;
    public long cacheSetupTime = 0;
    public String loggerLevel = null;
    public String targetSpi = null;
    public boolean mRadicalStrategy = false;
    public int tcpCount = 0;
    public int sslCount = 0;
    public int allowedRetryDuration = -1;
    public long taskFinishedTimeMillis = -1;
    public boolean transportByLocalAmnet = false;
    public boolean urgentFlag = false;
    public int taskRetryedCount = 0;
    public boolean onlyWifiRequest = false;
    public String bizLog = "";

    /* loaded from: classes3.dex */
    public static class EmptyDataContainer extends RPCDataContainer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.common.transport.monitor.RPCDataContainer, com.alipay.mobile.common.transport.monitor.DataContainer
        public String getDataItem(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f7980f7c", new Object[]{this, str});
            }
            return null;
        }

        @Override // com.alipay.mobile.common.transport.monitor.RPCDataContainer, com.alipay.mobile.common.transport.monitor.DataContainer
        public void putDataItem(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1aa8d827", new Object[]{this, str, str2});
            }
        }

        @Override // com.alipay.mobile.common.transport.monitor.RPCDataContainer, com.alipay.mobile.common.transport.monitor.DataContainer
        public void removeDataItem(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7d48652", new Object[]{this, str});
            }
        }

        @Override // com.alipay.mobile.common.transport.monitor.RPCDataContainer, com.alipay.mobile.common.transport.monitor.DataContainer
        public void timeItemDot(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30a1ef7a", new Object[]{this, str});
            }
        }

        @Override // com.alipay.mobile.common.transport.monitor.RPCDataContainer, com.alipay.mobile.common.transport.monitor.DataContainer
        public void timeItemRelease(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2df69fb8", new Object[]{this, str});
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class SingleRPCReqConfig {
        public String callUrl;
        public String protocol;
        public boolean use;
    }

    public String getNetType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f577ff58", new Object[]{this});
        }
        return this.net0 + "_" + this.net1;
    }

    public DataContainer getCurrentDataContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataContainer) ipChange.ipc$dispatch("d12ae4fc", new Object[]{this});
        }
        SingleRPCReqConfig singleRPCReqConfig = this.currentReqInfo;
        if (singleRPCReqConfig == null || !singleRPCReqConfig.use) {
            return f5529a;
        }
        DataContainer dataContainer = this.dcList.get(this.currentReqInfo.protocol);
        if (dataContainer != null) {
            return dataContainer;
        }
        RPCDataContainer rPCDataContainer = new RPCDataContainer();
        this.dcList.put(this.currentReqInfo.protocol, rPCDataContainer);
        return rPCDataContainer;
    }

    public boolean isInitd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("370739d5", new Object[]{this})).booleanValue() : this.mInitd;
    }

    public void setInitd(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44dabc5b", new Object[]{this, new Boolean(z)});
        } else {
            this.mInitd = z;
        }
    }

    public void addExtInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d2dea9", new Object[]{this, str, str2});
        } else {
            this.b.put(str, str2);
        }
    }

    public String getExtInfo(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e949d6", new Object[]{this, str}) : this.b.get(str);
    }

    public boolean isRequestByMRPC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33c1b01f", new Object[]{this})).booleanValue();
        }
        SingleRPCReqConfig singleRPCReqConfig = this.currentReqInfo;
        return singleRPCReqConfig != null && StringUtils.equals(singleRPCReqConfig.protocol, ExtTransportStrategy.EXT_PROTO_MRPC);
    }

    public boolean isRpcBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a79fc99d", new Object[]{this})).booleanValue() : this.bizType == 1;
    }

    public boolean isFastReturnFailure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b274d9bf", new Object[]{this})).booleanValue();
        }
        HttpUrlRequest httpUrlRequest = this.originRequest;
        if (httpUrlRequest != null) {
            return httpUrlRequest.isFastReturnFailure();
        }
        return false;
    }

    public boolean isOnlyWifiRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1cd526f", new Object[]{this})).booleanValue() : this.onlyWifiRequest;
    }
}
