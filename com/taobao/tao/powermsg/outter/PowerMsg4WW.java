package com.taobao.tao.powermsg.outter;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import android.util.Pair;
import anet.channel.appmonitor.AppMonitor;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.CountPowerMessage;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.StreamFullLinkMonitor;
import com.taobao.tao.powermsg.common.TextPowerMessage;
import com.taobao.tao.powermsg.common.b;
import com.taobao.tao.powermsg.common.c;
import com.taobao.tao.powermsg.common.f;
import com.taobao.tao.powermsg.common.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.ols;
import tb.oms;

/* loaded from: classes8.dex */
public class PowerMsg4WW extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL = "windvane";
    public static final String EVENT_DISPATCH = "powermsg.dispatch";
    public static final String EVENT_DISPATCH_BATCH = "powermsg.dispatch.batch";
    public static final String KEY_BIZ = "bizCode";
    public static final String KEY_CHANNEL = "channel";
    public static final String KEY_CODE = "errorCode";
    public static final String KEY_CONTEXT = "context";
    public static final String KEY_DATA = "data";
    public static final String KEY_DELAY = "delay";
    public static final String KEY_DUP = "needAck";
    public static final String KEY_END_SEQ = "endSeq";
    public static final String KEY_FROM = "from";
    public static final String KEY_FULL_TAGS = "sendFullTags";
    public static final String KEY_ID = "messageId";
    public static final String KEY_INDEX = "index";
    public static final String KEY_INFO = "info";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_MODE = "mode";
    public static final String KEY_NAMESPACE = "namespace";
    public static final String KEY_PARAM = "param";
    public static final String KEY_PRIORITY = "priority";
    public static final String KEY_QOS = "Qos";
    public static final String KEY_REENTRANT = "reentrant";
    public static final String KEY_ROUTE_GROUP = "routeGroup";
    public static final String KEY_SEQ = "seqNr";
    public static final String KEY_SEQ_INTERVAL = "seqSnapshotInterval";
    public static final String KEY_SIZE = "pageSize";
    public static final String KEY_START_SEQ = "startSeq";
    public static final String KEY_STREAM = "streamId";
    public static final String KEY_SYNC_TIMEOUT = "syncTimeoutInMill";
    private static final String KEY_TAG = "bizTag";
    public static final String KEY_TAGS = "tags";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_TO = "to";
    public static final String KEY_TOPIC = "topic";
    public static final String KEY_TYPE = "subType";
    public static final String KEY_USER = "userId";
    public static final String MODULE = "powermsg";
    private static final String TAG = "MESSAGES_4WW";
    private a dispatcher;
    private final Map<Integer, HashMap<String, Integer>> mDispatchers = new ConcurrentHashMap();
    private IWVWebView webView;

    /* renamed from: com.taobao.tao.powermsg.outter.PowerMsg4WW$11  reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass11 implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f20872a;
        public final /* synthetic */ String b;

        public AnonymousClass11(WVCallBackContext wVCallBackContext, String str) {
            this.f20872a = wVCallBackContext;
            this.b = str;
        }

        @Override // com.taobao.tao.powermsg.common.b
        public void a(final int i, Map<String, Object> map, Object... objArr) {
            oms.f.a[] aVarArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            final ArrayList arrayList = new ArrayList();
            if (i == 1000 && map != null) {
                Object obj = map.get("data");
                if (obj instanceof oms.f) {
                    for (oms.f.a aVar : ((oms.f) obj).f32187a) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("userId", aVar.f32188a);
                        hashMap.put("nick", aVar.b);
                        hashMap.put("addTime", Long.valueOf(aVar.c));
                        arrayList.add(hashMap);
                    }
                    String str = "TopicUser " + aVarArr.length;
                }
            }
            this.f20872a.success(new JSONObject() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.9.1
                {
                    put("errorCode", (Object) Integer.valueOf(i));
                    put("users", (Object) arrayList.toArray());
                    put("context", (Object) AnonymousClass11.this.b);
                }
            }.toString());
        }
    }

    /* renamed from: com.taobao.tao.powermsg.outter.PowerMsg4WW$2  reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass2 implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f20873a;
        public final /* synthetic */ String b;

        public AnonymousClass2(WVCallBackContext wVCallBackContext, String str) {
            this.f20873a = wVCallBackContext;
            this.b = str;
        }

        @Override // com.taobao.tao.powermsg.common.b
        public void a(final int i, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i), map, objArr});
                return;
            }
            final HashMap hashMap = new HashMap();
            if (i == 1000 && map != null) {
                Object obj = map.get("data");
                if (obj instanceof oms.e) {
                    oms.e eVar = (oms.e) obj;
                    String str = "TopicStat " + eVar.c;
                    hashMap.put("visitNum", Integer.valueOf(eVar.f32186a));
                    hashMap.put("onlineNum", Integer.valueOf(eVar.b));
                    hashMap.put("totalNum", Integer.valueOf(eVar.c));
                    hashMap.put("msgNum", Integer.valueOf(eVar.d));
                    hashMap.put("digNum", Integer.valueOf(eVar.e));
                }
            }
            this.f20873a.success(new JSONObject() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.10.1
                {
                    put("errorCode", (Object) Integer.valueOf(i));
                    put("status", (Object) hashMap);
                    put("context", (Object) AnonymousClass2.this.b);
                }
            }.toString());
        }
    }

    /* loaded from: classes8.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private final Map<String, Pair<AtomicInteger, PriorityQueue<PowerMessage>>> c;
        private String d;
        private long e;

        static {
            kge.a(120193340);
            kge.a(-1561594341);
        }

        private a() {
            this.b = 1;
            this.c = new ConcurrentHashMap();
        }

        private void b(PowerMessage powerMessage) {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40efd7c5", new Object[]{this, powerMessage});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) 1000);
                jSONObject.put("namespace", Integer.valueOf(powerMessage.bizCode));
                jSONObject.put("topic", powerMessage.topic);
                jSONObject.put("streamId", powerMessage.streamId);
                jSONObject.put("seqNr", Long.valueOf(powerMessage.seqNum));
                if (powerMessage.dataList != null) {
                    JSONArray jSONArray = new JSONArray();
                    j = 0;
                    for (PowerMessage.a aVar : powerMessage.dataList) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("messageId", (Object) aVar.a());
                        jSONObject2.put("data", (Object) Base64.encodeToString(aVar.b(), 2));
                        jSONArray.add(jSONObject2);
                        j = PowerMsg4WW.getDownRT(aVar, powerMessage, powerMessage.dataList.size());
                    }
                    jSONObject.put("list", (Object) jSONArray);
                } else {
                    j = 0;
                }
                jSONObject.put("delay", Long.valueOf(j));
                WVStandardEventCenter.postNotificationToJS(PowerMsg4WW.access$200(PowerMsg4WW.this), PowerMsg4WW.EVENT_DISPATCH_BATCH, jSONObject.toString());
                MsgLog.c(PowerMsg4WW.TAG, "postStreamMessage to js", "topic:", powerMessage.topic, "msgId:", powerMessage.messageId, "seqNum:", Long.valueOf(powerMessage.seqNum), "stream:", powerMessage.streamId);
            } catch (Throwable th) {
                MsgLog.c(PowerMsg4WW.TAG, th, "postStreamMessage err");
            }
            if (StringUtils.isEmpty(this.d) || !this.d.equals(powerMessage.streamId)) {
                this.d = powerMessage.streamId;
                this.e = powerMessage.seqNum;
            } else if (powerMessage.seqNum < this.e || powerMessage.seqNum - this.e > 1) {
                MsgLog.c(PowerMsg4WW.TAG, "out of order: ", "msgId:", powerMessage.messageId, "seqNum:", Long.valueOf(powerMessage.seqNum), "streamCacheSeq", Long.valueOf(this.e));
                ols.a(ols.POINT_MSG_ORDER, "", "", "");
            } else {
                ols.a(ols.POINT_MSG_ORDER, "");
            }
            this.e = Math.max(powerMessage.seqNum, this.e);
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.b = Math.max(1, i);
            }
        }

        @Override // com.taobao.tao.powermsg.common.c
        public void a(final int i, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            } else if (PowerMsg4WW.access$200(PowerMsg4WW.this) == null) {
            } else {
                String str = "onError " + i;
                WVStandardEventCenter.postNotificationToJS(PowerMsg4WW.access$200(PowerMsg4WW.this), PowerMsg4WW.EVENT_DISPATCH, new JSONObject() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW$Dispatcher$3
                    {
                        put("errorCode", (Object) Integer.valueOf(i));
                        put("data", obj);
                    }
                }.toString());
            }
        }

        @Override // com.taobao.tao.powermsg.common.c
        public void a(final PowerMessage powerMessage) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f4631a6", new Object[]{this, powerMessage});
            } else if (powerMessage == null) {
                MsgLog.c(PowerMsg4WW.TAG, "onDispatch() msg = NULL");
            } else if (PowerMsg4WW.access$200(PowerMsg4WW.this) == null) {
                MsgLog.c(PowerMsg4WW.TAG, "onDispatch() webView = NULL");
            } else if (StringUtils.isEmpty(powerMessage.streamId)) {
                WVStandardEventCenter.postNotificationToJS(PowerMsg4WW.access$200(PowerMsg4WW.this), PowerMsg4WW.EVENT_DISPATCH, new JSONObject() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW$Dispatcher$2
                    {
                        put("errorCode", (Object) 1000);
                        put("data", (Object) PowerMsg4WW.this.toMap(powerMessage));
                    }
                }.toString());
            } else {
                Pair<AtomicInteger, PriorityQueue<PowerMessage>> pair = this.c.get(powerMessage.streamId);
                if (pair == null) {
                    pair = Pair.create(new AtomicInteger(this.b), new PriorityQueue(64, new Comparator<PowerMessage>() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public int a(PowerMessage powerMessage2, PowerMessage powerMessage3) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("9cfcd91b", new Object[]{this, powerMessage2, powerMessage3})).intValue() : (int) (powerMessage2.seqNum - powerMessage3.seqNum);
                        }

                        @Override // java.util.Comparator
                        public /* synthetic */ int compare(PowerMessage powerMessage2, PowerMessage powerMessage3) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, powerMessage2, powerMessage3})).intValue() : a(powerMessage2, powerMessage3);
                        }
                    }));
                    this.c.put(powerMessage.streamId, pair);
                }
                AtomicInteger atomicInteger = (AtomicInteger) pair.first;
                PriorityQueue priorityQueue = (PriorityQueue) pair.second;
                synchronized (pair) {
                    int i = (int) powerMessage.seqNum;
                    if (i < atomicInteger.get()) {
                        MsgLog.c(PowerMsg4WW.TAG, "onDispatch() seqNr < startSeq", "seqNr", Integer.valueOf(i), "mSeq", atomicInteger);
                    } else if (i > atomicInteger.get()) {
                        MsgLog.c(PowerMsg4WW.TAG, "onDispatch() offer queue", "seqNr", Integer.valueOf(i), "mSeq", atomicInteger);
                        if (!priorityQueue.contains(powerMessage)) {
                            priorityQueue.offer(powerMessage);
                        } else {
                            MsgLog.a(PowerMsg4WW.TAG, "onDispatch() contains", "seqNr", Integer.valueOf(i));
                        }
                    } else {
                        do {
                            int incrementAndGet = atomicInteger.incrementAndGet();
                            b(powerMessage);
                            powerMessage = (PowerMessage) priorityQueue.peek();
                            if (powerMessage == null || powerMessage.seqNum != incrementAndGet) {
                                z = false;
                            } else {
                                powerMessage = (PowerMessage) priorityQueue.poll();
                            }
                            if (!z) {
                                break;
                            }
                        } while (powerMessage != null);
                    }
                }
            }
        }
    }

    static {
        kge.a(-1603108529);
    }

    public static /* synthetic */ void access$100(PowerMsg4WW powerMsg4WW, int i, Map map, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22655e1", new Object[]{powerMsg4WW, new Integer(i), map, str, wVCallBackContext});
        } else {
            powerMsg4WW.invoke(i, map, str, wVCallBackContext);
        }
    }

    public static /* synthetic */ IWVWebView access$200(PowerMsg4WW powerMsg4WW) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("57cdf4a1", new Object[]{powerMsg4WW}) : powerMsg4WW.webView;
    }

    public static long getDownRT(PowerMessage.a aVar, PowerMessage powerMessage, int i) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56091a59", new Object[]{aVar, powerMessage, new Integer(i)})).longValue();
        }
        try {
            StreamFullLinkMonitor a2 = com.taobao.tao.powermsg.managers.c.a(aVar.a());
            if (a2 == null) {
                return 0L;
            }
            a2.accsDataId = powerMessage.messageId;
            a2.msgId = aVar.a();
            a2.setPmDownTime(powerMessage.pmDownTime);
            if (powerMessage.fullLink != null) {
                a2.setAccsDownTime(powerMessage.fullLink.getAccsDownTime());
                a2.setNetSDKReceivedTime(powerMessage.fullLink.getNetSDKReceivedTime());
                a2.setAccsReceivedTime(powerMessage.fullLink.getAccsReceivedTime());
                a2.setPmReceivedTime(powerMessage.fullLink.getPmReceivedTime());
                a2.setPmCallbackTime(com.taobao.tao.messagekit.core.utils.a.a());
                j = a2.getPmCallbackTime() - a2.getPmDownTime();
            } else {
                j = 0;
            }
            AppMonitor.getInstance().commitStat(a2);
            long pmCallbackTime = a2.getPmCallbackTime() - a2.getPmUpTime();
            if (MsgLog.a(MsgLog.Level.D)) {
                MsgLog.a(TAG, "postStreamMessage monitor", "dataid:", powerMessage.messageId, "msgid:", aVar.a(), "fullDelay:", Long.valueOf(pmCallbackTime), "monitor:" + a2);
            }
            return j;
        } catch (Throwable th) {
            MsgLog.c(TAG, th, "getDownRT err");
            return 0L;
        }
    }

    private void invoke(final int i, final Map<String, Object> map, final String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20b0c68", new Object[]{this, new Integer(i), map, str, wVCallBackContext});
            return;
        }
        String str2 = "invoke " + i;
        wVCallBackContext.success(new JSONObject() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.12
            {
                put("errorCode", (Object) Integer.valueOf(i));
                put("data", (Object) map);
                put("context", (Object) str);
            }
        }.toString());
    }

    public static /* synthetic */ Object ipc$super(PowerMsg4WW powerMsg4WW, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private synchronized void registerStableDispatcher(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fefa2", new Object[]{this, new Integer(i), str, new Integer(i2)});
            return;
        }
        if (g.b(i, str) == null) {
            MsgLog.c(TAG, "registerStableDispatcher bizCode=" + i + " startSeq=" + i2);
            a aVar = new a();
            aVar.a(i2);
            g.a(i, str, aVar);
        }
    }

    private void subscribeStream(int i, String str, String str2, final String str3, f fVar, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c90b6b87", new Object[]{this, new Integer(i), str, str2, str3, fVar, wVCallBackContext});
            return;
        }
        MsgLog.c(TAG, "subscribeStream ", Integer.valueOf(i), str);
        synchronized (this.mDispatchers) {
            if (this.mDispatchers.get(Integer.valueOf(i)) == null) {
                this.mDispatchers.put(Integer.valueOf(i), new HashMap<>());
            }
            this.mDispatchers.get(Integer.valueOf(i)).put(str, Integer.valueOf(fVar.a()));
        }
        registerStableDispatcher(i, str, fVar.e());
        g.a(i, str, null, str2, "", "", new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                } else {
                    PowerMsg4WW.access$100(PowerMsg4WW.this, i2, map, str3, wVCallBackContext);
                }
            }
        }, fVar, str3);
    }

    private void unSubscribeStream(int i, String str, String str2, final String str3, boolean z, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2d3a8", new Object[]{this, new Integer(i), str, str2, str3, new Boolean(z), wVCallBackContext});
            return;
        }
        MsgLog.c(TAG, "unSubscribeStream ", Integer.valueOf(i), str);
        f fVar = new f();
        synchronized (this.mDispatchers) {
            HashMap<String, Integer> hashMap = this.mDispatchers.get(Integer.valueOf(i));
            if (hashMap != null) {
                fVar.a(hashMap.get(str).intValue());
                if (z) {
                    hashMap.remove(str);
                }
            }
            if (z && (hashMap == null || hashMap.size() == 0)) {
                this.mDispatchers.remove(Integer.valueOf(i));
            }
        }
        g.a(i, str);
        g.b(i, str, null, str2, "", "", new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                } else {
                    PowerMsg4WW.access$100(PowerMsg4WW.this, i2, map, str3, wVCallBackContext);
                }
            }
        }, fVar, str3);
    }

    public void count(int i, String str, boolean z, Map<String, Double> map, final String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c7426f", new Object[]{this, new Integer(i), str, new Boolean(z), map, str2, wVCallBackContext});
            return;
        }
        String str3 = "count " + i + str;
        g.a(i, str, map, z, new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map2, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map2, objArr});
                } else {
                    PowerMsg4WW.access$100(PowerMsg4WW.this, i2, map2, str2, wVCallBackContext);
                }
            }
        }, str2);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        int intValue;
        int intValue2;
        String string;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(str2);
        try {
            intValue = parseObject.getIntValue("bizCode");
            intValue2 = parseObject.getIntValue("namespace");
            string = parseObject.getString("topic");
            string2 = parseObject.getString("context");
        } catch (Exception e) {
            MsgLog.c(TAG, e, "execute err");
        }
        if ("registerCallback".equals(str)) {
            registerCallback(intValue, wVCallBackContext);
            return true;
        } else if ("registerCallback2".equals(str)) {
            registerCallback(intValue, wVCallBackContext);
            wVCallBackContext.success();
            return true;
        } else if ("multiRegisterCallback".equals(str)) {
            multiRegisterCallback(intValue, wVCallBackContext);
            return true;
        } else if ("setMsgFetchMode".equals(str)) {
            setMsgFetchMode(intValue, string, parseObject.getIntValue("mode"));
            return true;
        } else if ("setMsgFetchMode2".equals(str)) {
            setMsgFetchMode(intValue, string, parseObject.getIntValue("mode"));
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        } else if ("subscribeByTag".equals(str)) {
            subscribeByTag(intValue, string, parseObject.getString("from"), parseObject.getString("bizTag"), string2, wVCallBackContext);
            return true;
        } else if ("multiSubscribeByStream".equals(str)) {
            registerCallback(intValue2, wVCallBackContext);
            if (!(parseObject.get(KEY_START_SEQ) instanceof Integer)) {
                wVCallBackContext.error("param 'startSeq' not instanceof int");
                return false;
            }
            f fVar = new f();
            fVar.b(parseObject.getIntValue(KEY_START_SEQ));
            fVar.a(parseObject.getLongValue(KEY_SYNC_TIMEOUT));
            fVar.c(parseObject.getIntValue(KEY_SEQ_INTERVAL));
            fVar.a(parseObject.getString(KEY_ROUTE_GROUP));
            fVar.a(parseObject.getBooleanValue(KEY_REENTRANT));
            if ("mtop".equals(parseObject.getString("channel"))) {
                fVar.a(1);
            } else {
                fVar.a(2);
            }
            subscribeStream(intValue2, string, parseObject.getString("from"), string2, fVar, wVCallBackContext);
            return true;
        } else {
            if ("unSubscribeByTag".equals(str)) {
                unSubscribeByTag(intValue, string, parseObject.getString("from"), parseObject.getString("bizTag"), string2, wVCallBackContext);
            } else if ("multiUnSubscribeByStream".equals(str)) {
                unSubscribeStream(intValue2, string, parseObject.getString("from"), string2, true, wVCallBackContext);
                return true;
            } else if ("multiSubscribeByTag".equals(str)) {
                multiSubscribeByTag(intValue, string, parseObject.getString("from"), parseObject.getString("bizTag"), string2, wVCallBackContext);
                return true;
            } else if ("multiUnSubscribeByTag".equals(str)) {
                multiUnSubscribeByTag(intValue, string, parseObject.getString("from"), parseObject.getString("bizTag"), string2, wVCallBackContext);
                return true;
            } else if ("sendMessage".equals(str)) {
                sendMessage(intValue, parseObject, string2, wVCallBackContext);
                return true;
            } else if ("sendMessageByStream".equals(str)) {
                if (com.taobao.tao.powermsg.managers.e.a(intValue2, string) == null) {
                    if (wVCallBackContext != null) {
                        wVCallBackContext.error("Not login or subscribe");
                    }
                    return false;
                }
                String string3 = parseObject.getString("streamId");
                if (StringUtils.isEmpty(string3)) {
                    if (wVCallBackContext != null) {
                        wVCallBackContext.error("param 'streamId' is NULL");
                    }
                    return false;
                }
                f fVar2 = new f();
                fVar2.b(string3);
                if ("accs1".equals(parseObject.getString("channel"))) {
                    fVar2.a(0);
                } else {
                    fVar2.a(2);
                }
                sendStreamMessage(intValue2, parseObject, fVar2);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
                return true;
            } else if ("queryMessagesByStream".equals(str)) {
                try {
                    f fVar3 = new f();
                    fVar3.b(parseObject.getIntValue(KEY_START_SEQ));
                    fVar3.d(parseObject.getIntValue(KEY_END_SEQ));
                    queryMessagesByStream(intValue2, string, fVar3, wVCallBackContext);
                    return true;
                } catch (Exception e2) {
                    if (wVCallBackContext != null) {
                        wVCallBackContext.error("queryMessagesByStream err: " + e2);
                    }
                    return false;
                }
            } else if ("sendTextMessage".equals(str)) {
                sendTextMessage(intValue, parseObject, string2, wVCallBackContext);
                return true;
            } else if ("requestTopicUserList".equals(str)) {
                requestTopicUserList(intValue, string, parseObject.getIntValue("index"), parseObject.getIntValue("pageSize"), string2, wVCallBackContext);
                return true;
            } else if ("requestTopicStatus".equals(str)) {
                requestTopicStatus(intValue, string, string2, wVCallBackContext);
                return true;
            } else if ("count".equals(str)) {
                JSONObject jSONObject = parseObject.getJSONObject("param");
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    hashMap.put(entry.getKey(), Double.valueOf(Double.parseDouble(entry.getValue().toString())));
                }
                count(intValue, string, parseObject.getBooleanValue("needAck"), hashMap, string2, wVCallBackContext);
                return true;
            }
            return false;
        }
    }

    public PowerMessage fromMap(int i, int i2, Map<String, Object> map) {
        TextPowerMessage textPowerMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMessage) ipChange.ipc$dispatch("d18e22aa", new Object[]{this, new Integer(i), new Integer(i2), map});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        PowerMessage powerMessage = new PowerMessage();
        if (i == 101) {
            TextPowerMessage textPowerMessage2 = new TextPowerMessage();
            textPowerMessage2.text = (String) map.get("message");
            Object obj = map.get("param");
            textPowerMessage = textPowerMessage2;
            if (obj instanceof JSONObject) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : ((JSONObject) obj).entrySet()) {
                    hashMap.put(entry.getKey(), (String) entry.getValue());
                }
                textPowerMessage2.value = hashMap;
                textPowerMessage = textPowerMessage2;
            }
        } else {
            Integer num = (Integer) map.get("subType");
            textPowerMessage = powerMessage;
            if (num != null) {
                powerMessage.type = num.intValue();
                textPowerMessage = powerMessage;
            }
        }
        textPowerMessage.bizCode = i2;
        textPowerMessage.topic = (String) map.get("topic");
        textPowerMessage.userId = (String) map.get("userId");
        textPowerMessage.from = (String) map.get("from");
        textPowerMessage.to = (String) map.get("to");
        Boolean bool = (Boolean) map.get("sendFullTags");
        if (bool != null) {
            textPowerMessage.sendFullTags = bool.booleanValue();
        }
        List list = (List) map.get("tags");
        if (list != null) {
            textPowerMessage.tags = (String[]) list.toArray(new String[list.size()]);
        }
        Integer num2 = (Integer) map.get("Qos");
        if (num2 != null) {
            textPowerMessage.qosLevel = num2.intValue();
        }
        Integer num3 = (Integer) map.get("priority");
        if (num3 != null) {
            textPowerMessage.priority = num3.intValue();
        }
        Boolean bool2 = (Boolean) map.get("needAck");
        if (bool2 != null) {
            textPowerMessage.needAck = bool2.booleanValue();
        }
        String str = (String) map.get("data");
        if (str != null) {
            textPowerMessage.data = Base64.decode(str, 2);
        }
        return textPowerMessage;
    }

    public void multiRegisterCallback(int i, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a9ec58", new Object[]{this, new Integer(i), wVCallBackContext});
        } else {
            registerCallback(i, wVCallBackContext);
        }
    }

    public void multiSubscribeByTag(int i, String str, String str2, String str3, final String str4, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334e04cf", new Object[]{this, new Integer(i), str, str2, str3, str4, wVCallBackContext});
            return;
        }
        String str5 = "multiSubscribeByTag " + i + str;
        a aVar = new a();
        this.dispatcher = aVar;
        g.b(i, "windvane", aVar);
        g.a(i, str, "windvane", str2, str3, "", new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                } else {
                    PowerMsg4WW.access$100(PowerMsg4WW.this, i2, map, str4, wVCallBackContext);
                }
            }
        }, str4);
    }

    public void multiUnSubscribeByTag(int i, String str, String str2, String str3, final String str4, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5ed336", new Object[]{this, new Integer(i), str, str2, str3, str4, wVCallBackContext});
            return;
        }
        String str5 = "multiUnSubscribeByTag " + i + str;
        g.b(i, str, "windvane", str2, str3, "", new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                } else {
                    PowerMsg4WW.access$100(PowerMsg4WW.this, i2, map, str4, wVCallBackContext);
                }
            }
        }, str4);
        this.dispatcher = null;
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        MsgLog.c(TAG, "onDestroy()");
        synchronized (this.mDispatchers) {
            for (Map.Entry<Integer, HashMap<String, Integer>> entry : this.mDispatchers.entrySet()) {
                HashMap<String, Integer> value = entry.getValue();
                if (value != null) {
                    for (String str : value.keySet()) {
                        unSubscribeStream(entry.getKey().intValue(), str, null, null, false, null);
                    }
                }
            }
            this.mDispatchers.clear();
        }
    }

    public void queryMessagesByStream(int i, String str, f fVar, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f80d72", new Object[]{this, new Integer(i), str, fVar, wVCallBackContext});
        } else if (g.a(i, str, fVar)) {
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error(r.RET_FAIL);
        }
    }

    public void registerCallback(int i, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322e8991", new Object[]{this, new Integer(i), wVCallBackContext});
            return;
        }
        String str = "registerCallback " + i;
        this.webView = wVCallBackContext.getWebview();
    }

    public void requestTopicStatus(int i, String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828af2fb", new Object[]{this, new Integer(i), str, str2, wVCallBackContext});
            return;
        }
        String str3 = "requestTopicStatus " + i + str;
        g.a(i, str, 402, 0, 0, new AnonymousClass2(wVCallBackContext, str2), str2);
    }

    public void requestTopicUserList(int i, String str, int i2, int i3, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41fd064", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), str2, wVCallBackContext});
            return;
        }
        String str3 = "requestTopicUserList " + i + str;
        g.a(i, str, 403, i2, i3, new AnonymousClass11(wVCallBackContext, str2), str2);
    }

    public void sendMessage(int i, Map<String, Object> map, final String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5c6c8f", new Object[]{this, new Integer(i), map, str, wVCallBackContext});
            return;
        }
        String str2 = "sendMessage " + i;
        g.a(i, fromMap(0, i, map), new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map2, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map2, objArr});
                } else {
                    PowerMsg4WW.access$100(PowerMsg4WW.this, i2, map2, str, wVCallBackContext);
                }
            }
        }, str);
    }

    public void sendStreamMessage(int i, Map<String, Object> map, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9bf7a2", new Object[]{this, new Integer(i), map, fVar});
        } else {
            g.a(i, fromMap(0, i, map), fVar, null, new Object[0]);
        }
    }

    public void sendTextMessage(int i, Map<String, Object> map, final String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec43ce2", new Object[]{this, new Integer(i), map, str, wVCallBackContext});
            return;
        }
        String str2 = "sendTextMessage " + i;
        g.a(i, (TextPowerMessage) fromMap(101, i, map), new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map2, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map2, objArr});
                } else {
                    PowerMsg4WW.access$100(PowerMsg4WW.this, i2, map2, str, wVCallBackContext);
                }
            }
        }, str);
    }

    public void setMsgFetchMode(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d9421b", new Object[]{this, new Integer(i), str, new Integer(i2)});
            return;
        }
        String str2 = "setMsgFetchMode " + i + " " + i2;
        g.a(i, str, i2);
    }

    public void subscribeByTag(int i, String str, String str2, String str3, final String str4, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7bcb48", new Object[]{this, new Integer(i), str, str2, str3, str4, wVCallBackContext});
            return;
        }
        String str5 = "subscribe " + i + str;
        a aVar = new a();
        this.dispatcher = aVar;
        g.a(i, aVar);
        g.a(i, str, str2, str3, "", new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                } else {
                    PowerMsg4WW.access$100(PowerMsg4WW.this, i2, map, str4, wVCallBackContext);
                }
            }
        }, str4);
    }

    public Map<String, Object> toMap(final PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ce5810db", new Object[]{this, powerMessage}) : new HashMap<String, Object>() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.13
            {
                Object encodeToString;
                String str;
                put("subType", Integer.valueOf(powerMessage.type));
                put("messageId", powerMessage.messageId);
                put("priority", Integer.valueOf(powerMessage.priority));
                put("Qos", Integer.valueOf(powerMessage.qosLevel));
                put("sendFullTags", Boolean.valueOf(powerMessage.sendFullTags));
                put("tags", powerMessage.tags);
                put("userId", powerMessage.userId);
                put("needAck", Boolean.valueOf(powerMessage.needAck));
                put("bizCode", Integer.valueOf(powerMessage.bizCode));
                put("topic", powerMessage.topic);
                put("from", powerMessage.from);
                put("to", powerMessage.to);
                put("timestamp", Long.valueOf(powerMessage.timestamp));
                if (powerMessage.type == 101) {
                    put("message", ((TextPowerMessage) powerMessage).text);
                    encodeToString = ((TextPowerMessage) powerMessage).value;
                    str = "param";
                } else if (powerMessage.type == 102) {
                    encodeToString = ((CountPowerMessage) powerMessage).value;
                    str = "info";
                } else if (powerMessage.type == 103) {
                    com.taobao.tao.powermsg.common.e eVar = (com.taobao.tao.powermsg.common.e) powerMessage;
                    put("totalCount", Integer.valueOf(eVar.f20836a));
                    put("onlineCount", Integer.valueOf(eVar.b));
                    put("addUsers", eVar.c);
                    encodeToString = Long.valueOf(eVar.d);
                    str = "pageViewCount";
                } else {
                    encodeToString = Base64.encodeToString(powerMessage.data, 2);
                    str = "data";
                }
                put(str, encodeToString);
            }
        };
    }

    public void unSubscribeByTag(int i, String str, String str2, String str3, final String str4, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f34df6f", new Object[]{this, new Integer(i), str, str2, str3, str4, wVCallBackContext});
            return;
        }
        String str5 = "unSubscribe " + i + str;
        g.b(i, str, str2, str3, "", new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4WW.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                } else {
                    PowerMsg4WW.access$100(PowerMsg4WW.this, i2, map, str4, wVCallBackContext);
                }
            }
        }, str4);
        this.dispatcher = null;
    }
}
