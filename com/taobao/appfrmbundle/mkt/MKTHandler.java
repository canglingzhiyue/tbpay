package com.taobao.appfrmbundle.mkt;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.android.base.Versions;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.speed.TBSpeed;
import com.taobao.aranger.exception.IPCException;
import com.taobao.login4android.api.Login;
import com.taobao.mass.MassClient;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.log.TLog;
import com.taobao.tao.messagekit.base.c;
import com.taobao.tao.messagekit.base.g;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import com.taobao.tao.messagekit.base.network.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.d;
import com.taobao.tao.powermsg.common.StreamFullLinkMonitor;
import com.taobao.tao.util.GetAppKeyFromSecurity;
import com.ut.device.UTDevice;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.intf.MtopBuilder;
import tb.olu;
import tb.omg;

/* loaded from: classes6.dex */
public class MKTHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_SERVER_ID = "pmmonitor";
    public static final String POWER_SERVER_ID = "powermsg";
    public static final String POWER_SERVER_ID_3 = "powermsg3";
    public static final AccsAbstractDataListener accsListener;
    private static LinkedHashMap<String, Object> b;
    private static MKTHandler c;
    private AccsReceiverConnection d;

    /* renamed from: a  reason: collision with root package name */
    private LinkedHashMap<String, Object> f16311a = new LinkedHashMap() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > 10;
        }
    };
    private AtomicBoolean e = new AtomicBoolean(false);

    /* loaded from: classes6.dex */
    public class a extends com.taobao.tao.messagekit.base.network.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.tao.messagekit.base.network.a
        public void a(Map<String, Object> map, final com.taobao.tao.messagekit.core.model.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f31bd41", new Object[]{this, map, aVar});
                return;
            }
            HashMap hashMap = null;
            if (map.containsKey("namespace")) {
                hashMap = new HashMap();
                hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "powermsg");
                hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, "namespace=" + map.get("namespace"));
            }
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName((String) map.get("api"));
            mtopRequest.setVersion((String) map.get("version"));
            mtopRequest.setNeedEcode(false);
            mtopRequest.setNeedSession(false);
            mtopRequest.setData((String) map.get("data"));
            MtopBuilder mo1338reqContext = new MtopBuilder(mtopRequest, TaoPackageInfo.getTTID()).mo1305reqMethod("post".equals(map.get("req")) ? MethodEnum.POST : MethodEnum.GET).mo1338reqContext(map.get("context"));
            if (hashMap != null) {
                mo1338reqContext.mo1297headers(hashMap);
            }
            mo1338reqContext.mo1337addListener(new MtopCallback.MtopFinishListener() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler$MtopConnectionImpl$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
                public void onFinished(MtopFinishEvent mtopFinishEvent, final Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
                        return;
                    }
                    final MtopResponse mtopResponse = mtopFinishEvent.getMtopResponse();
                    aVar.a(mtopResponse.getResponseCode(), new HashMap<String, Object>() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler$MtopConnectionImpl$1.1
                        {
                            put("re_msg", mtopResponse.getRetCode());
                            put("result", mtopResponse.getDataJsonObject());
                            put("context", obj);
                        }
                    });
                }
            });
            Object obj = map.get("timeout");
            if (obj != null) {
                mo1338reqContext.mo1326setSocketTimeoutMilliSecond(((Integer) obj).intValue() * 1000);
            }
            mo1338reqContext.asyncRequest();
        }
    }

    public static /* synthetic */ LinkedHashMap a(MKTHandler mKTHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedHashMap) ipChange.ipc$dispatch("f16aec0c", new Object[]{mKTHandler}) : mKTHandler.f16311a;
    }

    public static /* synthetic */ LinkedHashMap c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedHashMap) ipChange.ipc$dispatch("155e1b86", new Object[0]) : b;
    }

    static {
        System.setProperty("rx.scheduler.jdk6.purge-frequency-millis", "30000");
        System.setProperty("rx.ring-buffer.size", "300");
        int availableProcessors = Runtime.getRuntime().availableProcessors() / 2;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        if (availableProcessors < 2) {
            availableProcessors = 2;
        }
        sb.append(availableProcessors);
        System.setProperty("rx.scheduler.max-computation-threads", sb.toString());
        b = new LinkedHashMap() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry entry) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > 1000;
            }
        };
        c = new MKTHandler();
        accsListener = new AccsAbstractDataListener() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.accs.base.AccsDataListener
            public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
                }
            }

            @Override // com.taobao.accs.base.AccsDataListener
            public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
                }
            }

            @Override // com.taobao.accs.base.AccsDataListener
            public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
                } else if (str == null) {
                } else {
                    String str4 = null;
                    Map<Integer, String> map = extraInfo != null ? extraInfo.oriExtHeader : null;
                    if (extraInfo != null) {
                        try {
                            if (extraInfo.extHeader != null) {
                                str4 = extraInfo.extHeader.get(TaoBaseService.ExtHeaderType.TYPE_TAG);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    olu.c cVar = new olu.c(str3, 1, str4, bArr, map);
                    if (extraInfo != null && extraInfo.fullLink != null) {
                        cVar.f = new StreamFullLinkMonitor();
                        cVar.f.setAccsDownTime(extraInfo.fullLink.accsDownTime);
                        cVar.f.setNetSDKReceivedTime(extraInfo.fullLink.networkReceivedTime);
                        cVar.f.setAccsReceivedTime(extraInfo.fullLink.accsReceivedTime);
                    }
                    MKTHandler.a().b().a(cVar);
                }
            }

            @Override // com.taobao.accs.base.AccsDataListener
            public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
                } else if (MKTHandler.c().containsKey(str2)) {
                    MKTHandler.a().b().a(str2, str, i, extraInfo);
                } else {
                    MKTHandler.a().b().a(str2, str, i, (Map<String, Object>) null);
                }
            }

            @Override // com.taobao.accs.base.AccsDataListener
            public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
                } else if (!MKTHandler.a(MKTHandler.a()).containsKey(str2) || i != 200) {
                } else {
                    onData(str, null, str2, bArr, extraInfo);
                }
            }
        };
    }

    public static MKTHandler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MKTHandler) ipChange.ipc$dispatch("9122ae36", new Object[0]) : c;
    }

    private MKTHandler() {
    }

    public void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else if (this.e.getAndSet(true)) {
        } else {
            AccsReceiverConnection accsReceiverConnection = new AccsReceiverConnection(application);
            this.d = accsReceiverConnection;
            b.a(accsReceiverConnection);
            this.d.a();
            b.a(new a());
            c.a(new c.a() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.messagekit.base.c.a
                public String a(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
                    }
                    if ("init_async".equals(str2)) {
                        return String.valueOf(TBSpeed.isSpeedEdition(application, "lpmasyn"));
                    }
                    return OrangeConfig.getInstance().getConfig(str, str2, str3);
                }

                @Override // com.taobao.tao.messagekit.base.c.a
                public long a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : SDKUtils.getCorrectionTimeMillis();
                }
            });
            MsgLog.a(new MsgLog.a() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.messagekit.core.utils.MsgLog.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else {
                        TLog.logd(str, str2);
                    }
                }

                @Override // com.taobao.tao.messagekit.core.utils.MsgLog.a
                public void b(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                    } else {
                        TLog.logi(str, str2);
                    }
                }

                @Override // com.taobao.tao.messagekit.core.utils.MsgLog.a
                public void c(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
                    } else {
                        TLog.loge(str, str2);
                    }
                }
            });
            d.a(new d.a() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.messagekit.core.utils.d.a
                public void a(String str, String str2, List<String> list, List<String> list2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9371b55e", new Object[]{this, str, str2, list, list2});
                    } else {
                        AppMonitor.register(str, str2, MeasureSet.create(list2), DimensionSet.create(list));
                    }
                }

                @Override // com.taobao.tao.messagekit.core.utils.d.a
                public void a(String str, String str2, Map<String, String> map, Map<String, Double> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a37ab1dc", new Object[]{this, str, str2, map, map2});
                    } else {
                        AppMonitor.Stat.commit(str, str2, DimensionValueSet.fromStringMap(map), MeasureValueSet.create(map2));
                    }
                }

                @Override // com.taobao.tao.messagekit.core.utils.d.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else {
                        AppMonitor.Alarm.commitSuccess(str, str2);
                    }
                }

                @Override // com.taobao.tao.messagekit.core.utils.d.a
                public void a(String str, String str2, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
                    } else {
                        AppMonitor.Alarm.commitFail(str, str2, str3, str4);
                    }
                }

                @Override // com.taobao.tao.messagekit.core.utils.d.a
                public void a(String str, String str2, double d) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4dba8242", new Object[]{this, str, str2, new Double(d)});
                    } else {
                        AppMonitor.Counter.commit(str, str2, d);
                    }
                }

                @Override // com.taobao.tao.messagekit.core.utils.d.a
                public void a(String str, String str2, String str3, double d) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c0bf98b8", new Object[]{this, str, str2, str3, new Double(d)});
                    } else {
                        AppMonitor.Counter.commit(str, str2, str3, d);
                    }
                }
            });
            omg.a(application, UTDevice.getUtdid(Globals.getApplication()), GetAppKeyFromSecurity.getAppKey(0), -1, new HashMap<Integer, String>() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.6
                {
                    put(1, "powermsg");
                    put(2, "pmmonitor");
                    put(5, "powermsg3");
                }
            }, new omg.a() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.omg.a
                public String c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("bd025a76", new Object[]{this});
                    }
                    return null;
                }

                @Override // tb.omg.a
                public String a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : Login.getUserId();
                }

                @Override // tb.omg.a
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : Login.getSid();
                }

                @Override // tb.omg.a
                public Boolean d() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("3a0effa8", new Object[]{this}) : Boolean.valueOf(Versions.isDebug());
                }
            });
            com.taobao.tao.messagekit.base.d.a().j().a(307, new com.taobao.appfrmbundle.mkt.a());
            com.taobao.tao.messagekit.base.d.a().f().a(new g.a() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.messagekit.base.g.a
                public void a(int i, String str, String str2, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c27e0c3", new Object[]{this, new Integer(i), str, str2, str3, str4});
                    } else {
                        MassClient.getInstance().registerTopic("powermsg", str);
                    }
                }

                @Override // com.taobao.tao.messagekit.base.g.a
                public void b(int i, String str, String str2, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("95293262", new Object[]{this, new Integer(i), str, str2, str3, str4});
                    } else {
                        MassClient.getInstance().unregisterTopic("powermsg", str);
                    }
                }
            });
            try {
                ACCSClient.getAccsClient().registerDataListener("powermsg", accsListener);
                ACCSClient.getAccsClient().registerDataListener("powermsg3", accsListener);
            } catch (Exception e) {
                k.a("MKTHandler", "something wrong to register ACCS listener");
                e.printStackTrace();
            }
        }
    }

    public AccsReceiverConnection b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccsReceiverConnection) ipChange.ipc$dispatch("676f54de", new Object[]{this}) : this.d;
    }

    /* loaded from: classes6.dex */
    public class AccsReceiverConnection extends AccsConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AccsStateReceiver d = new AccsStateReceiver();
        private final Context e;

        public AccsReceiverConnection(Context context) {
            this.e = context;
        }

        @Override // com.taobao.tao.messagekit.base.network.AccsConnection
        public void a(AccsConnection.DataPackage dataPackage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4feb7632", new Object[]{this, dataPackage});
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(omg.f());
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(sb.toString(), dataPackage.e, dataPackage.e(), dataPackage.d);
            accsRequest.setTarget(dataPackage.f());
            try {
                if (!StringUtils.isEmpty(dataPackage.f)) {
                    accsRequest.setHost(new URL(dataPackage.f));
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
                MsgLog.c("AccsConnection", e, new Object[0]);
            }
            if ("powermsg3".equals(dataPackage.e)) {
                HashMap hashMap = new HashMap();
                hashMap.put(35, dataPackage.getRouteInfo());
                accsRequest.setExt(hashMap);
                try {
                    if (dataPackage.a()) {
                        str = ACCSClient.getAccsClient(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG).sendRequest(accsRequest);
                        if (!StringUtils.isEmpty(str)) {
                            MKTHandler.a(MKTHandler.this).put(str, null);
                        }
                    } else {
                        accsRequest.timeout = 5000;
                        str = ACCSClient.getAccsClient(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG).sendData(accsRequest);
                        if (!StringUtils.isEmpty(str)) {
                            MKTHandler.c().put(str, null);
                        }
                    }
                } catch (AccsException e2) {
                    e2.printStackTrace();
                }
                MsgLog.c("MKTHandler", "send pm3", "msgid:", dataPackage.d, "accs-dataid:", str, "isSendRequest:", Boolean.valueOf(dataPackage.a()));
                return;
            }
            ACCSManager.sendData(omg.d, accsRequest);
        }

        public void a(String str, String str2, int i, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9077b79e", new Object[]{this, str, str2, new Integer(i), map});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("service_id", str2);
            if (map != null) {
                hashMap.putAll(map);
            }
            a(str, i, hashMap);
        }

        public void a(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3593880a", new Object[]{this, str, str2, new Integer(i), extraInfo});
            } else if (extraInfo == null || extraInfo.fullLink == null) {
            } else {
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("accsUpTime", Long.valueOf(extraInfo.fullLink.accsUpTime));
                    hashMap.put("send2NetworkStartTime", Long.valueOf(extraInfo.fullLink.send2NetworkStartTime));
                    hashMap.put("send2NetworkEndTime", Long.valueOf(extraInfo.fullLink.send2NetworkEndTime));
                    a(str, i, hashMap);
                } catch (Exception e) {
                    MsgLog.c("MKTHandler", e, "onSendData2 err");
                }
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(Constants.ACTION_CONNECT_INFO);
            this.e.registerReceiver(this.d, intentFilter);
        }

        /* loaded from: classes6.dex */
        public class AccsStateReceiver extends BroadcastReceiver {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private AccsStateReceiver() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                try {
                    final TaoBaseService.ConnectInfo connectInfo = (TaoBaseService.ConnectInfo) intent.getSerializableExtra(Constants.KEY_CONNECT_INFO);
                    if (connectInfo == null) {
                        return;
                    }
                    MsgLog.a("AccsStateReceiver", Boolean.valueOf(connectInfo.connected), Integer.valueOf(connectInfo.errorCode), connectInfo.errordetail);
                    MKTHandler.a().b().a(connectInfo.connected ? 1000 : 2000, new HashMap<String, String>() { // from class: com.taobao.appfrmbundle.mkt.MKTHandler.AccsReceiverConnection.AccsStateReceiver.1
                        {
                            put(olu.CONNECTION_CODE, "" + connectInfo.errorCode);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
