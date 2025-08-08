package com.taobao.accs.mega;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.g;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.AccsConnectStateListener2;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import com.taobao.android.abilityidl.ability.AbsAccsAbility;
import com.taobao.android.abilityidl.ability.AccsBindResult;
import com.taobao.android.abilityidl.ability.AccsConnectCommonResult;
import com.taobao.android.abilityidl.ability.AccsConnectFailResult;
import com.taobao.android.abilityidl.ability.AccsConnectionResult;
import com.taobao.android.abilityidl.ability.AccsListenerKeyResult;
import com.taobao.android.abilityidl.ability.AccsReceivedResult;
import com.taobao.android.abilityidl.ability.bc;
import com.taobao.android.abilityidl.ability.bd;
import com.taobao.android.abilityidl.ability.e;
import com.taobao.android.abilityidl.ability.f;
import com.taobao.android.abilityidl.ability.h;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.als;
import tb.kge;

/* loaded from: classes.dex */
public class MegaAccsAbility extends AbsAccsAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f8254a = new ConcurrentHashMap<>(4);
    private final ConcurrentHashMap<String, b> b = new ConcurrentHashMap<>(4);

    static {
        kge.a(298946611);
    }

    public static /* synthetic */ Object ipc$super(MegaAccsAbility megaAccsAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ String a(MegaAccsAbility megaAccsAbility, Map map, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("950af46b", new Object[]{megaAccsAbility, map, str, str2}) : megaAccsAbility.a(map, str, str2);
    }

    public static /* synthetic */ ConcurrentHashMap a(MegaAccsAbility megaAccsAbility) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("2bf5ca2", new Object[]{megaAccsAbility}) : megaAccsAbility.f8254a;
    }

    public static /* synthetic */ ConcurrentHashMap b(MegaAccsAbility megaAccsAbility) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("3170c6c1", new Object[]{megaAccsAbility}) : megaAccsAbility.b;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccsAbility
    public void bindService(als alsVar, h hVar, final bc bcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec4680", new Object[]{this, alsVar, hVar, bcVar});
            return;
        }
        final String str = hVar.f8883a;
        if (StringUtils.isEmpty(str)) {
            bcVar.a(new ErrorResult("SERVICEID_EMPTY_ERR", "bindService: serviceId empty"));
            return;
        }
        final String str2 = StringUtils.isEmpty(hVar.b) ? "default" : hVar.b;
        com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.mega.MegaAccsAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ACCSClient accsClient = ACCSClient.getAccsClient(str2);
                    a aVar = new a();
                    aVar.a(bcVar);
                    accsClient.registerDataListener(str, aVar);
                    MegaAccsAbility.a(MegaAccsAbility.this).put(str, str2);
                    AccsBindResult accsBindResult = new AccsBindResult();
                    accsBindResult.statusCode = 200;
                    accsBindResult.message = "bindService succeed";
                    bcVar.a(accsBindResult);
                } catch (Throwable th) {
                    bc bcVar2 = bcVar;
                    bcVar2.a(new ErrorResult("INNER_ERR", "bindService inner err:" + th));
                }
            }
        });
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccsAbility
    public g<Object, ErrorResult> unBindService(als alsVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("f1f7f3e5", new Object[]{this, alsVar, hVar});
        }
        try {
            final String str = hVar.f8883a;
            if (StringUtils.isEmpty(str)) {
                return new g<>(null, new ErrorResult("SERVICEID_EMPTY_ERR", "unBindService serviceId empty err"));
            }
            final ACCSClient accsClient = ACCSClient.getAccsClient(hVar.b);
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.mega.MegaAccsAbility.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    accsClient.unRegisterDataListener(str);
                    MegaAccsAbility.a(MegaAccsAbility.this).remove(str);
                }
            });
            return new g<>();
        } catch (Throwable th) {
            return new g<>(null, new ErrorResult("INNER_ERR", "unBindService inner err:" + th));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccsAbility
    public g<Object, ErrorResult> send(als alsVar, com.taobao.android.abilityidl.ability.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("1660cbcd", new Object[]{this, alsVar, gVar});
        }
        final String str = gVar.f8880a;
        if (StringUtils.isEmpty(str)) {
            return new g<>(null, new ErrorResult("SERVICEID_EMPTY_ERR", "send: serviceId empty err"));
        }
        Map<String, ? extends Object> map = gVar.b;
        if (map == null || map.isEmpty()) {
            return new g<>(null, new ErrorResult("DATA_EMPTY_ERR", "send: data empty err"));
        }
        final String jSONString = JSON.toJSONString(map);
        final String str2 = gVar.c == null ? "" : gVar.c;
        final String str3 = gVar.d;
        final Map<String, ? extends Object> map2 = gVar.e;
        if (map2 == null || map2.isEmpty()) {
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.mega.MegaAccsAbility.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ACCSClient.getAccsClient(str3).sendData(new ACCSManager.AccsRequest(str2, str, jSONString.getBytes(), ""));
                    } catch (Throwable th) {
                        ALog.e("MegaAccsAbility", "exception occur in send:", th, new Object[0]);
                    }
                }
            });
            return new g<>();
        }
        com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.mega.MegaAccsAbility.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    String a2 = MegaAccsAbility.a(MegaAccsAbility.this, map2, "dataId", "");
                    String a3 = MegaAccsAbility.a(MegaAccsAbility.this, map2, "host", "");
                    boolean parseBoolean = Boolean.parseBoolean(MegaAccsAbility.a(MegaAccsAbility.this, map2, "isUnit", "false"));
                    int parseInt = Integer.parseInt(MegaAccsAbility.a(MegaAccsAbility.this, map2, "timeout", "0"));
                    ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(str2, str, jSONString.getBytes(), a2, MegaAccsAbility.a(MegaAccsAbility.this, map2, "target", ""), new URL(a3), MegaAccsAbility.a(MegaAccsAbility.this, map2, "businessId", ""));
                    accsRequest.setTag(str3);
                    accsRequest.setIsUnitBusiness(parseBoolean);
                    accsRequest.setTimeOut(parseInt);
                    ACCSClient.getAccsClient(str3).sendData(accsRequest);
                } catch (Throwable th) {
                    ALog.e("MegaAccsAbility", "exception occur in setData", th, new Object[0]);
                }
            }
        });
        return new g<>();
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccsAbility
    public g<AccsConnectionResult, ErrorResult> connection(als alsVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("623569a1", new Object[]{this, alsVar, eVar});
        }
        String str = eVar.f8832a;
        AccsConnectionResult accsConnectionResult = new AccsConnectionResult();
        try {
            accsConnectionResult.isConnected = Boolean.valueOf(ACCSClient.getAccsClient(str).isAccsConnected());
            accsConnectionResult.unitInfo = ACCSClient.getAccsClient(str).getConnectionUnitInfo();
            return new g<>(accsConnectionResult);
        } catch (Throwable th) {
            return new g<>(null, new ErrorResult("INNER_ERR", "connection inner err:" + th));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccsAbility
    public void addConnectionListener(als alsVar, e eVar, final bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508c6e27", new Object[]{this, alsVar, eVar, bdVar});
            return;
        }
        try {
            String str = StringUtils.isEmpty(eVar.f8832a) ? "default" : eVar.f8832a;
            final b bVar = new b(str);
            bVar.a(bdVar);
            final String valueOf = String.valueOf(System.currentTimeMillis());
            final ACCSClient accsClient = ACCSClient.getAccsClient(str);
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.mega.MegaAccsAbility.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    accsClient.registerConnectStateListener(bVar);
                    MegaAccsAbility.b(MegaAccsAbility.this).put(valueOf, bVar);
                    AccsListenerKeyResult accsListenerKeyResult = new AccsListenerKeyResult();
                    accsListenerKeyResult.listenerKey = valueOf;
                    bdVar.a(accsListenerKeyResult);
                }
            });
        } catch (Throwable th) {
            bdVar.a(new ErrorResult("INNER_ERR", "addConnectionListener inner err:" + th));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAccsAbility
    public g<Object, ErrorResult> removeConnectionListener(als alsVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c7423e1a", new Object[]{this, alsVar, fVar});
        }
        try {
            String str = fVar.b;
            if (StringUtils.isEmpty(str)) {
                return new g<>(null, new ErrorResult("LISTENERKEY_EMPTY_ERR", "removeConnectionListener listenerKey empty err"));
            }
            final b remove = this.b.remove(str);
            if (remove == null) {
                return new g<>();
            }
            final ACCSClient accsClient = ACCSClient.getAccsClient(fVar.f8858a);
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.mega.MegaAccsAbility.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        accsClient.unRegisterConnectStateListener(remove);
                    }
                }
            });
            return new g<>();
        } catch (Throwable th) {
            return new g<>(null, new ErrorResult("INNER_ERR", "removeConnectionListener inner err:" + th));
        }
    }

    private String a(Map<String, ?> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("696f900f", new Object[]{this, map, str, str2}) : map.containsKey(str) ? String.valueOf(map.get(str)) : str2;
    }

    /* loaded from: classes.dex */
    public static class a extends AccsAbstractDataListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private bc f8262a;

        static {
            kge.a(-1134032610);
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
            }
        }

        private a() {
        }

        public void a(bc bcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb4865c", new Object[]{this, bcVar});
            } else {
                this.f8262a = bcVar;
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            } else if (this.f8262a == null) {
            } else {
                AccsReceivedResult accsReceivedResult = new AccsReceivedResult();
                accsReceivedResult.serviceID = str;
                accsReceivedResult.dataID = str3;
                try {
                    accsReceivedResult.data = JSONObject.parseObject(new String(bArr));
                    this.f8262a.a(accsReceivedResult);
                } catch (Throwable th) {
                    bc bcVar = this.f8262a;
                    bcVar.a(new ErrorResult("INNER_ERR", "onData inner err:" + th));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements AccsConnectStateListener2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private bd f8263a;
        private String b;

        static {
            kge.a(912611472);
            kge.a(61449137);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12b0ff1a", new Object[]{bVar}) : bVar.b;
        }

        public b(String str) {
            this.b = str;
        }

        public void a(bd bdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb4fabb", new Object[]{this, bdVar});
            } else {
                this.f8263a = bdVar;
            }
        }

        @Override // com.taobao.accs.base.AccsConnectStateListener2, com.taobao.accs.base.AccsConnectStateListener
        public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
            } else if (this.f8263a == null) {
            } else {
                AccsConnectCommonResult accsConnectCommonResult = new AccsConnectCommonResult();
                accsConnectCommonResult.connected = true;
                this.f8263a.a(accsConnectCommonResult);
            }
        }

        @Override // com.taobao.accs.base.AccsConnectStateListener2, com.taobao.accs.base.AccsConnectStateListener
        public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
            } else if (this.f8263a == null) {
            } else {
                AccsConnectCommonResult accsConnectCommonResult = new AccsConnectCommonResult();
                accsConnectCommonResult.connected = false;
                this.f8263a.b(accsConnectCommonResult);
            }
        }

        @Override // com.taobao.accs.base.AccsConnectStateListener2
        public void onConnectFail(TaoBaseService.ConnectInfo connectInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bfd2647", new Object[]{this, connectInfo});
            } else if (this.f8263a == null) {
            } else {
                AccsConnectFailResult accsConnectFailResult = new AccsConnectFailResult();
                accsConnectFailResult.connected = false;
                accsConnectFailResult.errorCode = Integer.valueOf(connectInfo.errorCode);
                accsConnectFailResult.errordetail = connectInfo.errordetail;
                this.f8263a.a(accsConnectFailResult);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.mega.MegaAccsAbility.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (Map.Entry entry : MegaAccsAbility.b(MegaAccsAbility.this).entrySet()) {
                    try {
                        ACCSClient.getAccsClient(b.a((b) entry.getValue())).unRegisterConnectStateListener((AccsConnectStateListener) entry.getValue());
                    } catch (Throwable unused) {
                    }
                }
                MegaAccsAbility.b(MegaAccsAbility.this).clear();
                for (Map.Entry entry2 : MegaAccsAbility.a(MegaAccsAbility.this).entrySet()) {
                    try {
                        ACCSClient.getAccsClient((String) entry2.getValue()).unRegisterDataListener((String) entry2.getKey());
                    } catch (Throwable unused2) {
                    }
                }
                MegaAccsAbility.a(MegaAccsAbility.this).clear();
            }
        });
    }
}
