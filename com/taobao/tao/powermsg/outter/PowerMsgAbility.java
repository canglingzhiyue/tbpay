package com.taobao.tao.powermsg.outter;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.alibaba.ability.e;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.TextPowerMessage;
import com.taobao.tao.powermsg.common.b;
import com.taobao.tao.powermsg.common.c;
import com.taobao.tao.powermsg.common.f;
import com.taobao.tao.powermsg.common.g;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.alm;
import tb.aln;
import tb.als;
import tb.kge;
import tb.ols;
import tb.olt;

/* loaded from: classes8.dex */
public class PowerMsgAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADDPMEVENTLISTENER = "-5091826342477277518";
    public static final String API_ADD_EVENT_LISTENER = "addStreamEventListener";
    public static final String API_PRE_CONNECT = "preConnect";
    public static final String API_QUERY = "query";
    public static final String API_REMOVE_EVENT_LISTENER = "removeStreamEventListener";
    public static final String API_SEND = "send";
    public static final String KEY_DELAY = "delay";
    public static final String KEY_SEQ = "seqNr";
    public static final String KEY_STREAM = "streamId";
    public static final String MSG = "msg";
    public static final String PMQUERY = "5213502467903443194";
    public static final String PMSEND = "9931827644667565";
    public static final String REMOVEPMEVENTLISTENER = "4968369330651823386";
    private final String b = "PowerMsgAbility";

    /* renamed from: a  reason: collision with root package name */
    public final String f20883a = "errorCode";
    private final int c = 5000;
    private final Map<Integer, Set<String>> d = new ConcurrentHashMap();

    /* loaded from: classes8.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private aln c;
        private final Map<String, Pair<AtomicInteger, PriorityQueue<PowerMessage>>> d;
        private String e;
        private long f;

        static {
            kge.a(-89574906);
            kge.a(-1561594341);
        }

        private a() {
            this.b = 1;
            this.d = new ConcurrentHashMap();
        }

        private void a(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
                return;
            }
            aln alnVar = this.c;
            if (alnVar == null) {
                return;
            }
            alnVar.a((ExecuteResult) new FinishResult(jSONObject, str));
        }

        private void b(PowerMessage powerMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40efd7c5", new Object[]{this, powerMessage});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", (Object) 1000);
                jSONObject.put("namespace", (Object) Integer.valueOf(powerMessage.bizCode));
                jSONObject.put("topic", (Object) powerMessage.topic);
                jSONObject.put("streamId", (Object) powerMessage.streamId);
                jSONObject.put("seqNr", (Object) Long.valueOf(powerMessage.seqNum));
                long j = 0;
                if (powerMessage.dataList != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (PowerMessage.a aVar : powerMessage.dataList) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("messageId", (Object) aVar.a());
                        jSONObject2.put("data", (Object) Base64.encodeToString(aVar.b(), 2));
                        jSONArray.add(jSONObject2);
                        j = PowerMsg4WW.getDownRT(aVar, powerMessage, powerMessage.dataList.size());
                    }
                    jSONObject.put("list", (Object) jSONArray);
                }
                jSONObject.put("delay", (Object) Long.valueOf(j));
                a(jSONObject, "onData");
            } catch (Throwable th) {
                if (this.c != null) {
                    jSONObject.put("errorCode", (Object) 5000);
                    jSONObject.put("msg", (Object) th.toString());
                    a(jSONObject, "onError");
                }
                MsgLog.c("PowerMsgAbility", th, "postStreamMessage err");
            }
            if (TextUtils.isEmpty(this.e) || !this.e.equals(powerMessage.streamId)) {
                this.e = powerMessage.streamId;
                this.f = powerMessage.seqNum;
            } else if (powerMessage.seqNum < this.f || powerMessage.seqNum - this.f > 1) {
                MsgLog.c("PowerMsgAbility", "out of order: ", "msgId:", powerMessage.messageId, "seqNum:", Long.valueOf(powerMessage.seqNum), "streamCacheSeq", Long.valueOf(this.f));
                ols.a(ols.POINT_MSG_ORDER, "", "", "");
            } else {
                ols.a(ols.POINT_MSG_ORDER, "");
            }
            this.f = Math.max(powerMessage.seqNum, this.f);
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
        public void a(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", (Object) Integer.valueOf(i));
            jSONObject.put("msg", "Dispatcher occurred an error");
            a(jSONObject, "onError");
        }

        @Override // com.taobao.tao.powermsg.common.c
        public void a(PowerMessage powerMessage) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f4631a6", new Object[]{this, powerMessage});
            } else if (powerMessage == null) {
                MsgLog.c("PowerMsgAbility", "onDispatch() msg = NULL");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) 5000);
                jSONObject.put("msg", "msg = NULL");
                a(jSONObject, "onError");
            } else if (TextUtils.isEmpty(powerMessage.streamId)) {
            } else {
                Pair<AtomicInteger, PriorityQueue<PowerMessage>> pair = this.d.get(powerMessage.streamId);
                if (pair == null) {
                    pair = Pair.create(new AtomicInteger(this.b), new PriorityQueue(64, new Comparator<PowerMessage>() { // from class: com.taobao.tao.powermsg.outter.PowerMsgAbility.a.1
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
                    this.d.put(powerMessage.streamId, pair);
                }
                AtomicInteger atomicInteger = (AtomicInteger) pair.first;
                PriorityQueue priorityQueue = (PriorityQueue) pair.second;
                synchronized (pair) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("errorCode", (Object) 5000);
                    int i = (int) powerMessage.seqNum;
                    if (i < atomicInteger.get()) {
                        MsgLog.c("PowerMsgAbility", "onDispatch() seqNr < startSeq", "seqNr", Integer.valueOf(i), "mSeq", atomicInteger);
                        jSONObject2.put("msg", "seqNr < startSeq");
                        a(jSONObject2, "onError");
                    } else if (i > atomicInteger.get()) {
                        MsgLog.c("PowerMsgAbility", "onDispatch() offer queue", "seqNr", Integer.valueOf(i), "mSeq", atomicInteger);
                        if (!priorityQueue.contains(powerMessage)) {
                            priorityQueue.offer(powerMessage);
                        } else {
                            MsgLog.a("PowerMsgAbility", "onDispatch() contains", "seqNr", Integer.valueOf(i));
                        }
                        jSONObject2.put("msg", "discontinuous frame");
                        a(jSONObject2, "onError");
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

        public void a(aln alnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e03fee55", new Object[]{this, alnVar});
            } else {
                this.c = alnVar;
            }
        }
    }

    static {
        kge.a(-112596283);
    }

    private synchronized void a(int i, String str, int i2, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d366eb", new Object[]{this, new Integer(i), str, new Integer(i2), alnVar});
        } else if (g.b(i, str) != null) {
            if (g.b(i, str) instanceof a) {
                ((a) g.b(i, str)).a(alnVar);
            }
        } else {
            MsgLog.c("PowerMsgAbility", "registerStableDispatcher bizCode=" + i + " startSeq=" + i2);
            a aVar = new a();
            aVar.a(i2);
            aVar.a(alnVar);
            g.a(i, str, aVar);
        }
    }

    private void a(int i, String str, String str2, final String str3, f fVar, final aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7944a0", new Object[]{this, new Integer(i), str, str2, str3, fVar, alnVar});
            return;
        }
        synchronized (this.d) {
            if (this.d.get(Integer.valueOf(i)) == null) {
                this.d.put(Integer.valueOf(i), new HashSet());
            }
            this.d.get(Integer.valueOf(i)).add(str);
        }
        if (olt.b()) {
            fVar.a(2);
        }
        a(i, str, fVar.e(), alnVar);
        g.a(i, str, null, str2, "", "", new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsgAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                } else {
                    PowerMsgAbility.a(PowerMsgAbility.this, i2, map, str3, alnVar);
                }
            }
        }, fVar, str3);
    }

    private void a(int i, String str, String str2, final String str3, final aln alnVar) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7065d426", new Object[]{this, new Integer(i), str, str2, str3, alnVar});
            return;
        }
        MsgLog.c("PowerMsgAbility", "unSubscribeStream ", Integer.valueOf(i), str);
        synchronized (this.d) {
            Set<String> set = this.d.get(Integer.valueOf(i));
            if (set != null) {
                set.remove(str);
            }
            if (set == null || set.size() == 0) {
                this.d.remove(Integer.valueOf(i));
            }
        }
        if (olt.b()) {
            fVar = new f();
            fVar.a(2);
        } else {
            fVar = f.empty;
        }
        g.a(i, str);
        g.b(i, str, null, str2, "", "", new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsgAbility.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                } else {
                    PowerMsgAbility.a(PowerMsgAbility.this, i2, map, str3, alnVar);
                }
            }
        }, fVar, str3);
    }

    private void a(final int i, final Map<String, Object> map, final String str, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c08efc1", new Object[]{this, new Integer(i), map, str, alnVar});
            return;
        }
        String str2 = "invoke " + i;
        if (alnVar == null) {
            return;
        }
        alnVar.a((ExecuteResult) new FinishResult(new JSONObject() { // from class: com.taobao.tao.powermsg.outter.PowerMsgAbility.2
            {
                put("errorCode", (Object) Integer.valueOf(i));
                put("data", (Object) map);
                put("context", (Object) str);
            }
        }, "onExecuteResult"));
    }

    public static /* synthetic */ void a(PowerMsgAbility powerMsgAbility, int i, Map map, String str, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225e630b", new Object[]{powerMsgAbility, new Integer(i), map, str, alnVar});
        } else {
            powerMsgAbility.a(i, map, str, alnVar);
        }
    }

    public static PowerMessage fromMap(int i, int i2, Map<String, Object> map) {
        TextPowerMessage textPowerMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMessage) ipChange.ipc$dispatch("d18e22aa", new Object[]{new Integer(i), new Integer(i2), map});
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
        Boolean a2 = e.a(map, "sendFullTags", (Boolean) null);
        if (a2 != null) {
            textPowerMessage.sendFullTags = a2.booleanValue();
        }
        List list = (List) map.get("tags");
        if (list != null) {
            textPowerMessage.tags = (String[]) list.toArray(new String[list.size()]);
        }
        Integer a3 = e.a(map, "Qos", (Integer) null);
        if (a3 != null) {
            textPowerMessage.qosLevel = a3.intValue();
        }
        Integer a4 = e.a(map, "priority", (Integer) null);
        if (a4 != null) {
            textPowerMessage.priority = a4.intValue();
        }
        Boolean a5 = e.a(map, "needAck", (Boolean) null);
        if (a5 != null) {
            textPowerMessage.needAck = a5.booleanValue();
        }
        String a6 = e.a(map, "data", (String) null);
        if (a6 != null) {
            textPowerMessage.data = Base64.decode(a6, 2);
        }
        return textPowerMessage;
    }

    public static /* synthetic */ Object ipc$super(PowerMsgAbility powerMsgAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String str, als alsVar, Map<String, ?> map, aln alnVar) {
        char c;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, str, alsVar, map, alnVar});
        }
        int intValue = e.a((Map<String, ? extends Object>) map, "namespace", (Integer) 0).intValue();
        String a2 = e.a((Map<String, ? extends Object>) map, "topic", (String) null);
        String a3 = e.a((Map<String, ? extends Object>) map, "context", (String) null);
        switch (str.hashCode()) {
            case 3526536:
                if (str.equals("send")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 107944136:
                if (str.equals("query")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1339331437:
                if (str.equals(API_ADD_EVENT_LISTENER)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1455803050:
                if (str.equals(API_REMOVE_EVENT_LISTENER)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2120134855:
                if (str.equals(API_PRE_CONNECT)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            Integer a4 = e.a((Map<String, ? extends Object>) map, PowerMsg4WW.KEY_START_SEQ, (Integer) null);
            if (a4 == null) {
                return a$a.b("invalid param \"startSeq\"");
            }
            f fVar = new f();
            fVar.b(a4.intValue());
            fVar.c(e.a((Map<String, ? extends Object>) map, PowerMsg4WW.KEY_SEQ_INTERVAL, (Integer) 0).intValue());
            fVar.a(e.a((Map<String, ? extends Object>) map, PowerMsg4WW.KEY_ROUTE_GROUP, (String) null));
            fVar.a(e.a((Map<String, ? extends Object>) map, PowerMsg4WW.KEY_REENTRANT, (Boolean) false).booleanValue());
            try {
                Object obj = map.get(PowerMsg4WW.KEY_SYNC_TIMEOUT);
                if (obj != null && !TextUtils.isEmpty(String.valueOf(obj))) {
                    j = Long.parseLong(String.valueOf(obj));
                    fVar.a(j);
                    a(intValue, a2, e.a((Map<String, ? extends Object>) map, "from", (String) null), a3, fVar, alnVar);
                }
                j = 0;
                fVar.a(j);
                a(intValue, a2, e.a((Map<String, ? extends Object>) map, "from", (String) null), a3, fVar, alnVar);
            } catch (NumberFormatException e) {
                return a$a.b("syncTimeoutInMill can not cast to Long: " + e);
            }
        } else if (c == 1) {
            a(intValue, a2, e.a((Map<String, ? extends Object>) map, "from", (String) null), a3, alnVar);
        } else if (c == 2) {
            try {
                ACCSClient.getAccsClient(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG).isAccsConnected();
            } catch (AccsException e2) {
                e2.printStackTrace();
            }
        } else if (c == 3) {
            try {
                f fVar2 = new f();
                fVar2.b(e.a((Map<String, ? extends Object>) map, PowerMsg4WW.KEY_START_SEQ, (Integer) 0).intValue());
                fVar2.d(e.a((Map<String, ? extends Object>) map, PowerMsg4WW.KEY_END_SEQ, (Integer) 0).intValue());
                return g.a(intValue, a2, fVar2) ? new FinishResult() : new ErrorResult("QUERY_FAILED", -1);
            } catch (Exception e3) {
                return new ErrorResult("500", "an error occurred: " + e3);
            }
        } else if (c == 4) {
            if (com.taobao.tao.powermsg.managers.e.a(intValue, a2) == null) {
                return new ErrorResult("500", "unLogin or unSubscribe");
            }
            String a5 = e.a((Map<String, ? extends Object>) map, "streamId", (String) null);
            if (TextUtils.isEmpty(a5)) {
                return a$a.b("streamId is empty");
            }
            f fVar3 = new f();
            fVar3.b(a5);
            if (olt.b()) {
                fVar3.a(2);
            }
            int intValue2 = e.a((Map<String, ? extends Object>) map, "namespace", (Integer) 0).intValue();
            g.a(intValue2, fromMap(0, intValue2, map), fVar3, null, new Object[0]);
            return new FinishResult();
        }
        return new FinishResult();
    }

    @Override // tb.alm
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        synchronized (this.d) {
            for (Map.Entry<Integer, Set<String>> entry : this.d.entrySet()) {
                Set<String> value = entry.getValue();
                if (value != null) {
                    for (String str : value) {
                        a(entry.getKey().intValue(), str, (String) null, (String) null, (aln) null);
                    }
                }
            }
            this.d.clear();
        }
    }
}
