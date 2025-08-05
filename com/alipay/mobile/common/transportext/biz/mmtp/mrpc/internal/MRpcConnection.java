package com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal;

import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetListenerAdpter;
import com.alipay.mobile.common.amnet.api.model.AcceptedData;
import com.alipay.mobile.common.amnet.api.model.AmnetPost;
import com.alipay.mobile.common.transport.ext.MMTPException;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.alipay.mobile.common.transportext.amnet.Initialization;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcRequest;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcResponse;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class MRpcConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static MRpcConnection f5688a;
    private Map<Integer, MRpcStream> b = Collections.synchronizedMap(new HashMap());
    private int c = 0;
    private String d = "";
    private String e = "";
    private int f = -1;
    private long g = -1;
    private String h = "";
    private String i = "";
    private ReaderListener j = null;
    private Map<String, String> k = new HashMap();

    public static /* synthetic */ int access$002(MRpcConnection mRpcConnection, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("948cf2ed", new Object[]{mRpcConnection, new Integer(i)})).intValue();
        }
        mRpcConnection.f = i;
        return i;
    }

    public static /* synthetic */ String access$100(MRpcConnection mRpcConnection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a648296", new Object[]{mRpcConnection}) : mRpcConnection.i;
    }

    public static /* synthetic */ String access$102(MRpcConnection mRpcConnection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8effe78e", new Object[]{mRpcConnection, str});
        }
        mRpcConnection.i = str;
        return str;
    }

    public static /* synthetic */ String access$200(MRpcConnection mRpcConnection, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cf6d61cd", new Object[]{mRpcConnection, str}) : mRpcConnection.a(str);
    }

    public static /* synthetic */ int access$300(MRpcConnection mRpcConnection, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7a8a3c5", new Object[]{mRpcConnection, str})).intValue() : mRpcConnection.b(str);
    }

    public static /* synthetic */ Map access$400(MRpcConnection mRpcConnection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f4631c5c", new Object[]{mRpcConnection}) : mRpcConnection.k;
    }

    public static /* synthetic */ String access$500(MRpcConnection mRpcConnection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de91b09a", new Object[]{mRpcConnection}) : mRpcConnection.d;
    }

    public static /* synthetic */ String access$502(MRpcConnection mRpcConnection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6271c92", new Object[]{mRpcConnection, str});
        }
        mRpcConnection.d = str;
        return str;
    }

    public static /* synthetic */ String access$600(MRpcConnection mRpcConnection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("379cfc1b", new Object[]{mRpcConnection}) : mRpcConnection.e;
    }

    public static /* synthetic */ String access$602(MRpcConnection mRpcConnection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cff0e9d3", new Object[]{mRpcConnection, str});
        }
        mRpcConnection.e = str;
        return str;
    }

    public static /* synthetic */ void access$700(MRpcConnection mRpcConnection, MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ec81e8", new Object[]{mRpcConnection, mRpcResponse});
        } else {
            mRpcConnection.a(mRpcResponse);
        }
    }

    public static /* synthetic */ long access$802(MRpcConnection mRpcConnection, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53f062b7", new Object[]{mRpcConnection, new Long(j)})).longValue();
        }
        mRpcConnection.g = j;
        return j;
    }

    public static /* synthetic */ String access$902(MRpcConnection mRpcConnection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d4e5196", new Object[]{mRpcConnection, str});
        }
        mRpcConnection.h = str;
        return str;
    }

    public static MRpcConnection getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcConnection) ipChange.ipc$dispatch("7706aa44", new Object[0]);
        }
        MRpcConnection mRpcConnection = f5688a;
        if (mRpcConnection != null) {
            return mRpcConnection;
        }
        synchronized (MRpcConnection.class) {
            if (f5688a != null) {
                return f5688a;
            }
            MRpcConnection mRpcConnection2 = new MRpcConnection();
            f5688a = mRpcConnection2;
            return mRpcConnection2;
        }
    }

    private MRpcConnection() {
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        AmnetHelper.getAmnetManager().addGeneraEventListener(getReaderListener());
        AmnetHelper.getAmnetManager().addRpcAcceptDataListener(getReaderListener());
    }

    public synchronized MRpcStream newMRpcStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcStream) ipChange.ipc$dispatch("fe60716f", new Object[]{this});
        }
        if (this.c == 0 || this.c >= 2147483646) {
            this.c = (((int) ((System.currentTimeMillis() % 1000000) / 1000)) * 1000) + 1;
        }
        MRpcStream a2 = a(this.c);
        this.c++;
        return a2;
    }

    private MRpcStream a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcStream) ipChange.ipc$dispatch("f48872eb", new Object[]{this, new Integer(i)});
        }
        MRpcStream mRpcStream = new MRpcStream(i, this);
        this.b.put(Integer.valueOf(i), mRpcStream);
        return mRpcStream;
    }

    public void sendRequest(MRpcRequest mRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28d5222", new Object[]{this, mRpcRequest});
            return;
        }
        AmnetPost amnetPost = new AmnetPost();
        amnetPost.body = mRpcRequest.getDatas();
        amnetPost.header = mRpcRequest.getHeaders();
        amnetPost.channel = (byte) 1;
        amnetPost.reqSeqId = mRpcRequest.reqSeqId;
        amnetPost.important = mRpcRequest.important;
        amnetPost.localAmnet = mRpcRequest.localAmnet;
        amnetPost.isUrgent = mRpcRequest.isUrgent;
        if (mRpcRequest.extParams != null && !mRpcRequest.extParams.isEmpty()) {
            for (Map.Entry<String, String> entry : mRpcRequest.extParams.entrySet()) {
                amnetPost.addParam(entry.getKey(), entry.getValue());
            }
        }
        amnetPost.addParam(AmnetConstant.KEY_DATA_TIMEOUT, String.valueOf(mRpcRequest.taskTimeout));
        if (TextUtils.equals(amnetPost.header.get(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK), "1") && mRpcRequest.isCustGwUrl) {
            amnetPost.addParam("url", mRpcRequest.getUrl());
            LogCatUtil.debug("MRpcConnection", "add param KEY_BIFROST_POST_URL");
        }
        try {
            AmnetHelper.post(amnetPost);
        } catch (MMTPException e) {
            if (!a(amnetPost, 0, e)) {
                throw e;
            }
        }
    }

    public MRpcStream getStream(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MRpcStream) ipChange.ipc$dispatch("790f2f6", new Object[]{this, new Integer(i)}) : this.b.get(Integer.valueOf(i));
    }

    public void removeStream(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d8d4b8", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            MRpcStream remove = this.b.remove(Integer.valueOf(i));
            StringBuilder sb = new StringBuilder();
            sb.append("[removeStream] Finished. streamId = ");
            sb.append(i);
            sb.append(", is hit = ");
            if (remove == null) {
                z = false;
            }
            sb.append(z);
            LogCatUtil.info("MRpcConnection", sb.toString());
        } catch (Throwable th) {
            LogCatUtil.warn("MRpcConnection", "[removeStream] Exception: " + th.toString() + ", streamId = " + i);
        }
    }

    public Map<String, String> getMrpcConnContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bd40dc71", new Object[]{this}) : this.k;
    }

    public boolean hasLocalAmnetStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d773fab", new Object[]{this})).booleanValue();
        }
        try {
            for (Map.Entry<Integer, MRpcStream> entry : this.b.entrySet()) {
                if (entry.getValue().isLocalAmnet()) {
                    LogCatUtil.info("MRpcConnection", "[hasLocalAmnetStream] Find the local amnet stream, id = " + entry.getValue());
                    return true;
                }
            }
            LogCatUtil.info("MRpcConnection", "[hasLocalAmnetStream] Not found local amnet stream.");
            return false;
        } catch (Throwable th) {
            LogCatUtil.error("MRpcConnection", "[hasLocalAmnetStream] Exception = " + th.toString(), th);
            return true;
        }
    }

    private void a(MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ff59b84", new Object[]{this, mRpcResponse});
            return;
        }
        try {
            if (this.b.isEmpty()) {
                LogCatUtil.debug("MRpcConnection", "[processResponse] There is no stream!");
            } else if (mRpcResponse.resultCode == 2000) {
                c(mRpcResponse);
            } else {
                b(mRpcResponse);
            }
        } catch (Exception e) {
            LogCatUtil.error("MRpcConnection", e);
        }
    }

    private void b(MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f6ed23", new Object[]{this, mRpcResponse});
            return;
        }
        LogCatUtil.info("MRpcConnection", "[handleFailure] Enter.");
        synchronized (this) {
            MRpcResultCode mRpcResultCode = new MRpcResultCode();
            mRpcResultCode.code = mRpcResponse.resultCode;
            mRpcResultCode.msg = mRpcResponse.resultMsg;
            if (mRpcResponse.streamId == -1) {
                if (this.b.isEmpty()) {
                    return;
                }
                MRpcStream[] mRpcStreamArr = (MRpcStream[]) this.b.values().toArray(new MRpcStream[this.b.size()]);
                this.b.clear();
                for (MRpcStream mRpcStream : mRpcStreamArr) {
                    try {
                        mRpcStream.close(mRpcResultCode);
                    } catch (Exception e) {
                        LogCatUtil.debug("MRpcConnection", "error message : " + e.toString());
                    }
                }
                LogCatUtil.info("MRpcConnection", "[handleFailure] Clear stream map.");
                return;
            }
            MRpcStream mRpcStream2 = this.b.get(Integer.valueOf(mRpcResponse.streamId));
            if (mRpcStream2 != null) {
                try {
                    mRpcStream2.close(mRpcResultCode);
                } catch (Exception e2) {
                    LogCatUtil.debug("MRpcConnection", "error message : " + e2.toString());
                }
            }
            return;
        }
    }

    private void c(MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f83ec2", new Object[]{this, mRpcResponse});
            return;
        }
        LogCatUtil.info("MRpcConnection", "handleSuccess");
        String str = mRpcResponse.headers.get(HeaderConstant.HEADER_KEY_RPCID);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("stream no exist,  streamId=[" + str + riy.ARRAY_END_STR);
        }
        MRpcStream stream = getStream(Integer.parseInt(str));
        if (stream == null) {
            throw new IllegalArgumentException("stream no exist,  streamId=[" + str + riy.ARRAY_END_STR);
        }
        mRpcResponse.reqSize = stream.getReqSize();
        stream.receiveResponse(mRpcResponse);
    }

    public ReaderListener getReaderListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReaderListener) ipChange.ipc$dispatch("94e5e8d5", new Object[]{this});
        }
        ReaderListener readerListener = this.j;
        if (readerListener != null) {
            return readerListener;
        }
        synchronized (this) {
            if (this.j != null) {
                return this.j;
            }
            this.j = new ReaderListener();
            return this.j;
        }
    }

    /* loaded from: classes3.dex */
    public class ReaderListener extends AmnetListenerAdpter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Map<String, Double> f5689a = Collections.synchronizedMap(new HashMap(5));

        public static /* synthetic */ Object ipc$super(ReaderListener readerListener, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public ReaderListener() {
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void change(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
                return;
            }
            LogCatUtil.debug("MRpcConnection", "ReaderListener#change");
            MRpcConnection.access$002(MRpcConnection.this, i);
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void panic(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f5029cf", new Object[]{this, new Integer(i), str});
            } else {
                LogCatUtil.debug("MRpcConnection", "ReaderListener#panic");
            }
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void onFinalErrorEvent(long j, int i, String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87a4b5ec", new Object[]{this, new Long(j), new Integer(i), str, map});
                return;
            }
            MRpcResponse mRpcResponse = new MRpcResponse();
            mRpcResponse.resultCode = i;
            mRpcResponse.resultMsg = str;
            mRpcResponse.streamId = (int) j;
            mRpcResponse.clientIp = MRpcConnection.access$100(MRpcConnection.this);
            a(j, mRpcResponse, map);
            String access$200 = MRpcConnection.access$200(MRpcConnection.this, str);
            int access$300 = MRpcConnection.access$300(MRpcConnection.this, str);
            if (!TextUtils.isEmpty(access$200)) {
                mRpcResponse.mtag = access$200;
            }
            if (access$300 >= 0) {
                mRpcResponse.ipStack = access$300;
                MRpcConnection.access$400(MRpcConnection.this).put(RPCDataItems.IP_STACK, String.valueOf(access$300));
            }
            if (!TextUtils.isEmpty(MRpcConnection.access$500(MRpcConnection.this)) && !TextUtils.isEmpty(MRpcConnection.access$600(MRpcConnection.this))) {
                mRpcResponse.targetHost = String.format("%s:%s", MRpcConnection.access$500(MRpcConnection.this), MRpcConnection.access$600(MRpcConnection.this));
            }
            MRpcConnection.access$700(MRpcConnection.this, mRpcResponse);
        }

        private void a(long j, MRpcResponse mRpcResponse, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4db83675", new Object[]{this, new Long(j), mRpcResponse, map});
            } else if (map == null) {
            } else {
                String str = map.get(AmnetConstant.KEY_AMNET_LIB_VERSION);
                LogCatUtil.debug("MRpcConnection", "onFinalErrorEvent, receiptId:" + j + ", LIBV:" + str);
                if (TextUtils.equals(AmnetConstant.VAL_AMNET_LIB_VERSION_BIFROST, str)) {
                    mRpcResponse.isUseBifrost = true;
                    MRpcConnection.access$400(MRpcConnection.this).put(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_BIFROST);
                } else if (TextUtils.equals(AmnetConstant.VAL_AMNET_LIB_VERSION_BIFROST_HTTP2, str)) {
                    mRpcResponse.isUseBifrost = true;
                    mRpcResponse.isUseHttp2 = true;
                    MRpcConnection.access$400(MRpcConnection.this).put(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2);
                } else if (!TextUtils.equals(AmnetConstant.VAL_AMNET_LIB_VERSION_OLD, str)) {
                } else {
                    mRpcResponse.isUseBifrost = false;
                    mRpcResponse.isUseHttp2 = false;
                    MRpcConnection.access$400(MRpcConnection.this).put(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_OLD);
                }
            }
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void report(String str, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b818819", new Object[]{this, str, new Double(d)});
                return;
            }
            LogCatUtil.debug("MRpcConnection", "ReaderListener#report,key:" + str + ",val:" + d);
            this.f5689a.put(str, Double.valueOf(d));
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AcceptDataListener
        public void onAcceptedDataEvent(AcceptedData acceptedData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e4098", new Object[]{this, acceptedData});
                return;
            }
            LogCatUtil.debug("MRpcConnection", "ReaderListener#onAcceptedDataEvent. rpc_id = " + acceptedData.receipt);
            MRpcResponse mRpcResponse = new MRpcResponse();
            mRpcResponse.body = acceptedData.data;
            mRpcResponse.headers = acceptedData.headers;
            mRpcResponse.respSize = acceptedData.compressSize;
            mRpcResponse.resultCode = 2000;
            acceptedData.ipcP2m = System.currentTimeMillis() - acceptedData.ipcP2m;
            mRpcResponse.clientIp = MRpcConnection.access$100(MRpcConnection.this);
            a(acceptedData, mRpcResponse);
            MRpcConnection.access$700(MRpcConnection.this, mRpcResponse);
        }

        private void a(AcceptedData acceptedData, MRpcResponse mRpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bc4452b", new Object[]{this, acceptedData, mRpcResponse});
                return;
            }
            mRpcResponse.readTiming = (int) Math.round(acceptedData.readTiming);
            mRpcResponse.ipcP2m = (int) Math.round(acceptedData.ipcP2m);
            mRpcResponse.jtcTiming = (int) Math.round(acceptedData.jtcTIme);
            mRpcResponse.amnetWaitTiming = (int) Math.round(acceptedData.amnetWaitTime);
            mRpcResponse.retried = acceptedData.retried;
            mRpcResponse.amnetStalledTime = (int) Math.round(acceptedData.amnetStalledTime);
            mRpcResponse.airTime = (int) Math.round(acceptedData.airTime);
            mRpcResponse.streamId = (int) acceptedData.receipt;
            mRpcResponse.saTime = (int) Math.round(acceptedData.saTime);
            mRpcResponse.isOnShort = acceptedData.isOnShort;
            mRpcResponse.useShort = acceptedData.useShort;
            mRpcResponse.targetHostShort = acceptedData.targetHostShort;
            mRpcResponse.mtag = acceptedData.mtag;
            mRpcResponse.qoeCur = acceptedData.qoeCur;
            mRpcResponse.queneStorage = acceptedData.queneStorage;
            mRpcResponse.ctjOutTime = (int) Math.round(acceptedData.ctjOutTime);
            mRpcResponse.ntIOTime = (int) Math.round(acceptedData.ntIOTime);
            mRpcResponse.queueOutTime = (int) Math.round(acceptedData.queueOutTime);
            mRpcResponse.amnetHungTime = (int) Math.round(acceptedData.amnetHungTime);
            mRpcResponse.amnetEncodeTime = (int) Math.round(acceptedData.amnetEncodeTime);
            mRpcResponse.amnetAllTime = (int) Math.round(acceptedData.amnetAllTime);
            mRpcResponse.cid = acceptedData.cid;
            mRpcResponse.isFlexible = acceptedData.isFlexible;
            mRpcResponse.targetHost = acceptedData.targetHostLong;
            mRpcResponse.reqZipType = acceptedData.reqZipType;
            mRpcResponse.rspZipType = acceptedData.rspZipType;
            mRpcResponse.isUseBifrost = acceptedData.isUseBifrost;
            mRpcResponse.isUseHttp2 = acceptedData.isUseHttp2;
            mRpcResponse.ipStack = acceptedData.ipStack;
            if (this.f5689a.isEmpty()) {
                return;
            }
            Double d = this.f5689a.get(Baggage.Linkage.RPT_DNS);
            if (d != null) {
                mRpcResponse.dnsTiming = (int) d.doubleValue();
            }
            Double d2 = this.f5689a.get(Baggage.Linkage.RPT_JVM_TCP_INIT);
            if (d2 != null) {
                mRpcResponse.tcpTiming = (int) d2.doubleValue();
            }
            Double d3 = this.f5689a.get(Baggage.Linkage.RPT_JVM_SSL_INIT);
            if (d3 != null) {
                mRpcResponse.sslTiming = (int) d3.doubleValue();
            }
            Double d4 = this.f5689a.get(Baggage.Linkage.RPT_NTV_TCP_INIT);
            if (d4 != null) {
                mRpcResponse.tcpNtv = (int) d4.doubleValue();
            }
            Double d5 = this.f5689a.get(Baggage.Linkage.RPT_NTV_SSL_INIT);
            if (d5 != null) {
                mRpcResponse.sslNtv = (int) d5.doubleValue();
            }
            this.f5689a.clear();
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void touch(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f93e466e", new Object[]{this, str, str2, str3, str4});
                return;
            }
            MRpcConnection.access$502(MRpcConnection.this, str2);
            MRpcConnection.access$602(MRpcConnection.this, str4);
            LogCatUtil.debug("MRpcConnection", "touch,currentTargetHost:" + str2);
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void restrict(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d5cfbea", new Object[]{this, new Integer(i), str});
                return;
            }
            LogCatUtil.info("MRpcConnection", "restrict delay=[" + i + "] inf=[" + str + riy.ARRAY_END_STR);
            MRpcConnection.access$802(MRpcConnection.this, System.currentTimeMillis() + ((long) (i * 1000)));
            MRpcConnection.access$902(MRpcConnection.this, str);
            MRpcConnection.this.letUsDisband(2001, str);
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AcceptDataListener
        public void tell(byte b, long j, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39d83fa0", new Object[]{this, new Byte(b), new Long(j), new Integer(i), new Integer(i2)});
                return;
            }
            LogCatUtil.printInfo("MRpcConnection", "tell reqId=[" + j + "] uncompressSize=[" + i + "]  compressSize=[" + i2 + riy.ARRAY_END_STR);
            MRpcStream stream = MRpcConnection.this.getStream((int) j);
            if (stream == null) {
                LogCatUtil.info("MRpcConnection", "tell.  Not found reqId=[" + j + riy.ARRAY_END_STR);
                return;
            }
            stream.setReqSize(i2);
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
        public void notifyInitResponse(Initialization.RspInit rspInit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b845a7ee", new Object[]{this, rspInit});
            } else {
                MRpcConnection.access$102(MRpcConnection.this, rspInit.clientIp);
            }
        }
    }

    public void letUsDisband(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f2177c", new Object[]{this, new Integer(i), str});
            return;
        }
        MRpcResponse mRpcResponse = new MRpcResponse();
        mRpcResponse.resultCode = i;
        mRpcResponse.resultMsg = str;
        mRpcResponse.streamId = -1;
        if (!TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.e)) {
            mRpcResponse.targetHost = String.format("%s:%s", this.d, this.e);
        }
        a(mRpcResponse);
    }

    public String getCurrentTargetHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("40288bfd", new Object[]{this}) : this.d;
    }

    public String getCurrentTargetPort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("17795ac4", new Object[]{this}) : this.e;
    }

    public int getConnectionState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b54f017", new Object[]{this})).intValue() : this.f;
    }

    public String getLimitPrompt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b9b36d0", new Object[]{this});
        }
        if (isServerLimiting()) {
            return TextUtils.isEmpty(this.h) ? "" : this.h;
        }
        this.h = "";
        return "";
    }

    public boolean isServerLimiting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7fac0ff", new Object[]{this})).booleanValue();
        }
        if (this.g == -1) {
            return false;
        }
        if (System.currentTimeMillis() < this.g) {
            return true;
        }
        this.g = -1L;
        return false;
    }

    public long getLimitingEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("151cbec6", new Object[]{this})).longValue() : this.g;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            return (TextUtils.isEmpty(str) || !str.contains("_")) ? "" : str.substring(str.indexOf("_") + 1);
        } catch (Throwable th) {
            LogCatUtil.error("MRpcConnection", th);
            return "";
        }
    }

    private int b(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        try {
            if (TextUtils.isEmpty(str) || (indexOf = str.indexOf(":")) < 0) {
                return -2;
            }
            return Integer.valueOf(str.substring(indexOf + 1)).intValue();
        } catch (Throwable th) {
            LogCatUtil.error("MRpcConnection", "splitIPstack ex:" + th.toString());
            return -2;
        }
    }

    private boolean a(AmnetPost amnetPost, int i, MMTPException mMTPException) {
        MRpcStream stream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f113bdf8", new Object[]{this, amnetPost, new Integer(i), mMTPException})).booleanValue();
        }
        if (i > 0 || mMTPException.errorCode != 1003 || amnetPost.localAmnet || !ExtTransportStrategy.isEnabledTransportByLocalAmnet() || (stream = getStream(amnetPost.reqSeqId)) == null) {
            return false;
        }
        stream.setLocalAmnet(true);
        amnetPost.localAmnet = true;
        TransportContextThreadLocalUtils.getValue().transportByLocalAmnet = true;
        AmnetHelper.post(amnetPost);
        return true;
    }
}
