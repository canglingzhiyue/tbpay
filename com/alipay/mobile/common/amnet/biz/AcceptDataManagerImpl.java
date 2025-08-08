package com.alipay.mobile.common.amnet.biz;

import android.os.Process;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.amnet.api.AcceptDataListener;
import com.alipay.mobile.common.amnet.api.AcceptDataManager;
import com.alipay.mobile.common.amnet.api.model.AcceptedData;
import com.alipay.mobile.common.amnet.api.model.ChannelType;
import com.alipay.mobile.common.amnet.api.monitor.TrafficMonitorService;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.amnet.Channel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AcceptDataManagerImpl implements AcceptDataManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<Byte, List<AcceptDataListener>> f5357a = new HashMap(4);
    private String b = "AmnetAcception";
    private ThreadPoolExecutor c = new ThreadPoolExecutor(1, 1, 3, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.alipay.mobile.common.amnet.biz.AcceptDataManagerImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, AcceptDataManagerImpl.access$000(AcceptDataManagerImpl.this));
        }
    });

    public static /* synthetic */ String access$000(AcceptDataManagerImpl acceptDataManagerImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("562db06d", new Object[]{acceptDataManagerImpl}) : acceptDataManagerImpl.b;
    }

    public static /* synthetic */ void access$100(AcceptDataManagerImpl acceptDataManagerImpl, AcceptedData acceptedData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8dd935", new Object[]{acceptDataManagerImpl, acceptedData});
        } else {
            acceptDataManagerImpl.a(acceptedData);
        }
    }

    public static /* synthetic */ void access$200(AcceptDataManagerImpl acceptDataManagerImpl, byte b, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c82967", new Object[]{acceptDataManagerImpl, new Byte(b), new Integer(i), new Integer(i2)});
        } else {
            acceptDataManagerImpl.b(b, i, i2);
        }
    }

    public static /* synthetic */ void access$300(AcceptDataManagerImpl acceptDataManagerImpl, AcceptedData acceptedData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6d8ef3", new Object[]{acceptDataManagerImpl, acceptedData});
        } else {
            acceptDataManagerImpl.b(acceptedData);
        }
    }

    public static /* synthetic */ void access$400(AcceptDataManagerImpl acceptDataManagerImpl, byte b, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42225", new Object[]{acceptDataManagerImpl, new Byte(b), new Integer(i), new Integer(i2)});
        } else {
            acceptDataManagerImpl.a(b, i, i2);
        }
    }

    public AcceptDataManagerImpl() {
        this.c.allowCoreThreadTimeOut(true);
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataManager
    public void addRpcAcceptDataListener(AcceptDataListener acceptDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3899c69", new Object[]{this, acceptDataListener});
        } else {
            a((byte) 1, acceptDataListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataManager
    public void addSyncAcceptDataListener(AcceptDataListener acceptDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b73f611", new Object[]{this, acceptDataListener});
        } else {
            a((byte) 2, acceptDataListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataManager
    public void addSyncDirectAcceptDataListener(AcceptDataListener acceptDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ebc1a8", new Object[]{this, acceptDataListener});
        } else {
            a((byte) 3, acceptDataListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataManager
    public void addPushAcceptDataListener(AcceptDataListener acceptDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30d5ff2", new Object[]{this, acceptDataListener});
        } else {
            a((byte) 4, acceptDataListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataManager
    public void removeRpcAcceptDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa0cd4e", new Object[]{this});
        } else {
            a((byte) 1);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataManager
    public void removeSyncAcceptDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb6154c", new Object[]{this});
        } else {
            a((byte) 2);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataManager
    public void removeSyncDirectAcceptDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d9c555", new Object[]{this});
        } else {
            a((byte) 3);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataManager
    public void removePushAcceptDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b768b08b", new Object[]{this});
        } else {
            a((byte) 4);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataManager
    public void notifyAcceptedData(final AcceptedData acceptedData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bb25c8", new Object[]{this, acceptedData});
            return;
        }
        LogCatUtil.info("AcceptDataManager", "[notifyAcceptedData]. channel = " + ((int) acceptedData.channel) + ", receipt = " + acceptedData.receipt);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.c.submit(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AcceptDataManagerImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                StringBuilder sb;
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Thread.currentThread().setPriority(10);
                    Process.setThreadPriority(-4);
                } catch (Throwable th) {
                    LogCatUtil.warn("AcceptDataManager", "[notifyAcceptedData] Set priority exception = " + th.toString());
                }
                String access$000 = AcceptDataManagerImpl.access$000(AcceptDataManagerImpl.this);
                if (ChannelType.isRpc(acceptedData.channel)) {
                    sb = new StringBuilder();
                    sb.append(access$000);
                    str = "#rpc";
                } else if (!ChannelType.isSync(acceptedData.channel)) {
                    if (ChannelType.isPush(acceptedData.channel)) {
                        sb = new StringBuilder();
                        sb.append(access$000);
                        str = "#push";
                    }
                    Thread.currentThread().setName(access$000 + "#" + ((int) acceptedData.channel));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    LogCatUtil.info("AcceptDataManager", "dispatch. channle =" + ((int) acceptedData.channel) + ",id=" + acceptedData.receipt + ", waitDispatchTime = " + elapsedRealtime2);
                    AcceptDataManagerImpl.access$100(AcceptDataManagerImpl.this, acceptedData);
                } else {
                    sb = new StringBuilder();
                    sb.append(access$000);
                    str = "#sync";
                }
                sb.append(str);
                access$000 = sb.toString();
                Thread.currentThread().setName(access$000 + "#" + ((int) acceptedData.channel));
                long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime;
                LogCatUtil.info("AcceptDataManager", "dispatch. channle =" + ((int) acceptedData.channel) + ",id=" + acceptedData.receipt + ", waitDispatchTime = " + elapsedRealtime22);
                AcceptDataManagerImpl.access$100(AcceptDataManagerImpl.this, acceptedData);
            }
        });
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataManager
    public void notifyRecycle(byte b, Map<String, String> map, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772b6621", new Object[]{this, new Byte(b), map, bArr});
            return;
        }
        List<AcceptDataListener> list = this.f5357a.get(Byte.valueOf(b));
        for (int i = 0; i < list.size(); i++) {
            try {
                list.get(i).recycle(b, map, bArr);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataManager
    public void notifyReqPacketSize(byte b, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df37ba0d", new Object[]{this, new Byte(b), new Long(j), new Integer(i), new Integer(i2)});
            return;
        }
        List<AcceptDataListener> list = this.f5357a.get(Byte.valueOf(b));
        for (int i3 = 0; i3 < list.size(); i3++) {
            try {
                list.get(i3).tell(b, j, i, i2);
            } catch (Exception unused) {
            }
        }
    }

    public Map<Byte, Channel> getAmnetChannels() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6975aae7", new Object[]{this});
        }
        if (this.f5357a.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(this.f5357a.size());
        for (Byte b : this.f5357a.keySet()) {
            hashMap.put(b, new AmnetAcceptDataListener(b.byteValue()));
        }
        return hashMap;
    }

    private void a(byte b, AcceptDataListener acceptDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d882386", new Object[]{this, new Byte(b), acceptDataListener});
            return;
        }
        List<AcceptDataListener> list = this.f5357a.get(Byte.valueOf(b));
        if (list == null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(acceptDataListener);
            this.f5357a.put(Byte.valueOf(b), arrayList);
            return;
        }
        list.add(acceptDataListener);
    }

    private void a(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217954", new Object[]{this, new Byte(b)});
        } else {
            this.f5357a.remove(Byte.valueOf(b));
        }
    }

    private void a(AcceptedData acceptedData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df2442e1", new Object[]{this, acceptedData});
            return;
        }
        List<AcceptDataListener> list = this.f5357a.get(Byte.valueOf(acceptedData.channel));
        for (int i = 0; i < list.size(); i++) {
            try {
                list.get(i).onAcceptedDataEvent(acceptedData);
            } catch (Exception e) {
                LogCatUtil.error("AcceptDataManager", e);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class AmnetAcceptDataListener implements Channel {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte f5358a;

        public AmnetAcceptDataListener(byte b) {
            this.f5358a = b;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Channel
        public void obtain(Channel.Obtaining obtaining) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bad24600", new Object[]{this, obtaining});
                return;
            }
            AcceptedData acceptedData = new AcceptedData();
            acceptedData.channel = this.f5358a;
            acceptedData.data = obtaining.body;
            acceptedData.headers = obtaining.header;
            acceptedData.readTiming = obtaining.msRead;
            acceptedData.compressSize = obtaining.lenPkg;
            acceptedData.uncompressSize = obtaining.lenRaw;
            acceptedData.ipcTime = obtaining.msCall;
            acceptedData.jtcTIme = obtaining.msPassToNative;
            acceptedData.amnetWaitTime = obtaining.msSend;
            acceptedData.amnetStalledTime = obtaining.msCaller - obtaining.msCalling;
            acceptedData.airTime = obtaining.msAir;
            acceptedData.receipt = obtaining.receipt;
            acceptedData.retried = obtaining.retried;
            acceptedData.saTime = obtaining.msConfirm;
            acceptedData.isOnShort = obtaining.oneshot;
            acceptedData.useShort = obtaining.useshort;
            acceptedData.targetHostShort = obtaining.targetHostShort;
            acceptedData.mtag = obtaining.mtag;
            acceptedData.qoeCur = obtaining.qoeCur;
            acceptedData.queneStorage = obtaining.msQueneStorage;
            acceptedData.isFlexible = obtaining.flexible;
            acceptedData.ctjOutTime = obtaining.msPassFromNative;
            acceptedData.ntIOTime = obtaining.msNtIO;
            acceptedData.queueOutTime = obtaining.msQueueOut;
            acceptedData.amnetHungTime = obtaining.msHung;
            acceptedData.amnetEncodeTime = obtaining.msEncode;
            acceptedData.amnetAllTime = obtaining.msAmnetAllTime;
            acceptedData.cid = obtaining.cid;
            acceptedData.targetHostLong = obtaining.targetHost;
            acceptedData.reqZipType = obtaining.reqZipType;
            acceptedData.rspZipType = obtaining.rspZipType;
            acceptedData.isUseBifrost = obtaining.isUseBifrost;
            acceptedData.isUseHttp2 = obtaining.isUseHttp2;
            acceptedData.ipStack = obtaining.ipStack;
            AcceptDataManagerImpl.this.notifyAcceptedData(acceptedData);
            AcceptDataManagerImpl.access$200(AcceptDataManagerImpl.this, this.f5358a, obtaining.lenRaw, obtaining.lenPkg);
            AcceptDataManagerImpl.access$300(AcceptDataManagerImpl.this, acceptedData);
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Channel
        public long earnest(Map<String, String> map, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e8a5df6b", new Object[]{this, map, bArr})).longValue();
            }
            String str = map.get(HeaderConstant.HEADER_KEY_RPCID);
            if (StringUtils.isEmpty(str)) {
                LogCatUtil.info("AcceptDataManager", "Can't get rpcID in earnest");
                return -1L;
            }
            return Integer.parseInt(str);
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Channel
        public String tracer(Map<String, String> map, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3a1403e8", new Object[]{this, map, bArr});
            }
            if (map != null) {
                String str = map.get(HeaderConstant.HEADER_KEY_PARAM_TRACEID);
                if (!StringUtils.isEmpty(str)) {
                    LogCatUtil.info("AcceptDataManager", "traceID=" + str);
                    return str;
                }
            }
            LogCatUtil.info("AcceptDataManager", "Can't get traceID in tracer");
            return null;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Channel
        public void tell(long j, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24df36c", new Object[]{this, new Long(j), new Integer(i), new Integer(i2)});
                return;
            }
            AcceptDataManagerImpl.this.notifyReqPacketSize(this.f5358a, j, i, i2);
            AcceptDataManagerImpl.access$400(AcceptDataManagerImpl.this, this.f5358a, i, i2);
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Channel
        public void recycle(Map<String, String> map, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9aab4b2", new Object[]{this, map, bArr});
            } else {
                AcceptDataManagerImpl.this.notifyRecycle(this.f5358a, map, bArr);
            }
        }
    }

    private void b(AcceptedData acceptedData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5280e40", new Object[]{this, acceptedData});
            return;
        }
        try {
            if (!ChannelType.isRpc(acceptedData.channel)) {
                return;
            }
            ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getRpcidSet().remove(Long.valueOf(acceptedData.receipt));
        } catch (Throwable th) {
            LogCatUtil.error("AcceptDataManager", "removeRpcid ex:" + th.toString());
        }
    }

    private void a(final byte b, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b6d4b4", new Object[]{this, new Byte(b), new Integer(i), new Integer(i2)});
            return;
        }
        try {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AcceptDataManagerImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TrafficMonitorService.getInstance().monitorUpTraffic(b, i, i2);
                    }
                }
            });
        } catch (Throwable th) {
            LogCatUtil.error("AcceptDataManager", th);
        }
    }

    private void b(final byte b, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d980193", new Object[]{this, new Byte(b), new Integer(i), new Integer(i2)});
            return;
        }
        try {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AcceptDataManagerImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TrafficMonitorService.getInstance().monitorDownTraffic(b, i, i2);
                    }
                }
            });
        } catch (Throwable th) {
            LogCatUtil.error("AcceptDataManager", th);
        }
    }
}
