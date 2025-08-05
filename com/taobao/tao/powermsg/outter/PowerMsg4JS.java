package com.taobao.tao.powermsg.outter;

import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.powermsg.common.CountPowerMessage;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.tao.powermsg.common.TextPowerMessage;
import com.taobao.tao.powermsg.common.b;
import com.taobao.tao.powermsg.common.c;
import com.taobao.tao.powermsg.common.e;
import com.taobao.tao.powermsg.common.g;
import com.taobao.tao.powermsg.outter.PowerMsg4JS;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oms;

/* loaded from: classes8.dex */
public class PowerMsg4JS extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL = "weex";
    public static final String KEY_BIZ = "bizCode";
    public static final String KEY_CODE = "errorCode";
    public static final String KEY_CONTEXT = "context";
    public static final String KEY_DATA = "data";
    public static final String KEY_DUP = "needAck";
    public static final String KEY_FROM = "from";
    public static final String KEY_FULL_TAGS = "sendFullTags";
    public static final String KEY_ID = "messageId";
    public static final String KEY_INFO = "info";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_PARAM = "param";
    public static final String KEY_PRIORITY = "priority";
    public static final String KEY_QOS = "Qos";
    public static final String KEY_TAGS = "tags";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_TO = "to";
    public static final String KEY_TOPIC = "topic";
    public static final String KEY_TYPE = "subType";
    public static final String KEY_USER = "userId";
    public static final String MODULE = "powermsg";
    private static final String TAG = "MESSAGES_4JS";
    private a dispatcher;
    private JSCallback jsCallback;

    /* loaded from: classes8.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-876865741);
            kge.a(-1561594341);
        }

        private a() {
        }

        @Override // com.taobao.tao.powermsg.common.c
        public void a(final int i, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
                return;
            }
            String str = "onError " + i;
            PowerMsg4JS.access$200(PowerMsg4JS.this).invokeAndKeepAlive(new HashMap<String, Object>() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS$Dispatcher$2
                {
                    PowerMsg4JS.a.this = this;
                    put("errorCode", Integer.valueOf(i));
                    put("data", obj);
                }
            });
        }

        @Override // com.taobao.tao.powermsg.common.c
        public void a(final PowerMessage powerMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f4631a6", new Object[]{this, powerMessage});
                return;
            }
            String str = "onDispatch " + powerMessage.topic;
            PowerMsg4JS.access$200(PowerMsg4JS.this).invokeAndKeepAlive(new HashMap<String, Object>() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS$Dispatcher$1
                {
                    put("errorCode", 1000);
                    put("data", PowerMsg4JS.this.toMap(powerMessage));
                }
            });
        }
    }

    static {
        kge.a(-1603108936);
    }

    public static /* synthetic */ void access$100(PowerMsg4JS powerMsg4JS, int i, Map map, String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc052cd", new Object[]{powerMsg4JS, new Integer(i), map, str, jSCallback});
        } else {
            powerMsg4JS.invoke(i, map, str, jSCallback);
        }
    }

    public static /* synthetic */ JSCallback access$200(PowerMsg4JS powerMsg4JS) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSCallback) ipChange.ipc$dispatch("90d4c968", new Object[]{powerMsg4JS}) : powerMsg4JS.jsCallback;
    }

    private void invoke(final int i, final Map<String, Object> map, final String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f39c3fd", new Object[]{this, new Integer(i), map, str, jSCallback});
            return;
        }
        String str2 = "invoke " + i;
        jSCallback.invoke(new HashMap<String, Object>() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.10
            {
                put("errorCode", Integer.valueOf(i));
                put("data", map);
                put("context", str);
            }
        });
    }

    public static /* synthetic */ Object ipc$super(PowerMsg4JS powerMsg4JS, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @WXModuleAnno
    public void count(int i, String str, boolean z, Map<String, Double> map, final String str2, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd728316", new Object[]{this, new Integer(i), str, new Boolean(z), map, str2, jSCallback});
            return;
        }
        String str3 = "count " + i + str;
        g.a(i, str, map, z, new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map2, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map2, objArr});
                } else {
                    PowerMsg4JS.access$100(PowerMsg4JS.this, i2, map2, str2, jSCallback);
                }
            }
        }, str2);
    }

    public PowerMessage fromMap(int i, int i2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PowerMessage) ipChange.ipc$dispatch("d18e22aa", new Object[]{this, new Integer(i), new Integer(i2), map});
        }
        PowerMessage powerMessage = new PowerMessage();
        try {
            if (i == 101) {
                TextPowerMessage textPowerMessage = new TextPowerMessage();
                textPowerMessage.text = (String) map.get("message");
                Object obj = map.get("param");
                if (obj instanceof JSONObject) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, Object> entry : ((JSONObject) obj).entrySet()) {
                        hashMap.put(entry.getKey(), (String) entry.getValue());
                    }
                    textPowerMessage.value = hashMap;
                }
                powerMessage = textPowerMessage;
            } else {
                Integer num = (Integer) map.get("subType");
                if (num != null) {
                    powerMessage.type = num.intValue();
                }
            }
            powerMessage.bizCode = i2;
            powerMessage.topic = (String) map.get("topic");
            powerMessage.userId = (String) map.get("userId");
            powerMessage.from = (String) map.get("from");
            powerMessage.to = (String) map.get("to");
            Boolean bool = (Boolean) map.get("sendFullTags");
            if (bool != null) {
                powerMessage.sendFullTags = bool.booleanValue();
            }
            List list = (List) map.get("tags");
            if (list != null) {
                powerMessage.tags = (String[]) list.toArray(new String[list.size()]);
            }
            Integer num2 = (Integer) map.get("Qos");
            if (num2 != null) {
                powerMessage.qosLevel = num2.intValue();
            }
            Integer num3 = (Integer) map.get("priority");
            if (num3 != null) {
                powerMessage.priority = num3.intValue();
            }
            Boolean bool2 = (Boolean) map.get("needAck");
            if (bool2 != null) {
                powerMessage.needAck = bool2.booleanValue();
            }
            String str = (String) map.get("data");
            if (str != null) {
                powerMessage.data = Base64.decode(str, 2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return powerMessage;
    }

    @WXModuleAnno
    public void multiRegisterCallback(int i, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ed460d", new Object[]{this, new Integer(i), jSCallback});
        } else {
            registerCallback(i, jSCallback);
        }
    }

    @WXModuleAnno
    public void multiSubscribeByTag(int i, String str, String str2, String str3, final String str4, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3134b6", new Object[]{this, new Integer(i), str, str2, str3, str4, jSCallback});
            return;
        }
        String str5 = "multiSubscribeByTag " + i + str;
        a aVar = new a();
        this.dispatcher = aVar;
        g.b(i, "weex", aVar);
        g.a(i, str, "weex", str2, str3, "", new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                } else {
                    PowerMsg4JS.access$100(PowerMsg4JS.this, i2, map, str4, jSCallback);
                }
            }
        }, str4);
    }

    @WXModuleAnno
    public void multiUnSubscribeByTag(int i, String str, String str2, String str3, final String str4, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335c0f6f", new Object[]{this, new Integer(i), str, str2, str3, str4, jSCallback});
            return;
        }
        String str5 = "multiUnSubscribeByTag " + i + str;
        g.b(i, str, "weex", str2, str3, "", new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                } else {
                    PowerMsg4JS.access$100(PowerMsg4JS.this, i2, map, str4, jSCallback);
                }
            }
        }, str4);
        this.dispatcher = null;
    }

    @WXModuleAnno
    public void registerCallback(int i, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330dcbb4", new Object[]{this, new Integer(i), jSCallback});
            return;
        }
        String str = "registerDispatcher " + i;
        this.jsCallback = jSCallback;
    }

    @WXModuleAnno
    public void requestTopicStatus(int i, String str, final String str2, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb12f90a", new Object[]{this, new Integer(i), str, str2, jSCallback});
            return;
        }
        String str3 = "requestTopicStatus " + i + str;
        g.a(i, str, 402, 0, 0, new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(final int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                    return;
                }
                final HashMap hashMap = new HashMap();
                if (i2 == 1000 && map != null) {
                    Object obj = map.get("data");
                    if (obj instanceof oms.e) {
                        oms.e eVar = (oms.e) obj;
                        String str4 = "TopicStat " + eVar.c;
                        hashMap.put("visitNum", Integer.valueOf(eVar.f32186a));
                        hashMap.put("onlineNum", Integer.valueOf(eVar.b));
                        hashMap.put("totalNum", Integer.valueOf(eVar.c));
                        hashMap.put("msgNum", Integer.valueOf(eVar.d));
                        hashMap.put("digNum", Integer.valueOf(eVar.e));
                    }
                }
                jSCallback.invoke(new HashMap<String, Object>() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.8.1
                    {
                        put("errorCode", Integer.valueOf(i2));
                        put("status", hashMap);
                        put("context", str2);
                    }
                });
            }
        }, str2);
    }

    @WXModuleAnno
    public void requestTopicUserList(int i, String str, int i2, int i3, final String str2, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5501881", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), str2, jSCallback});
            return;
        }
        String str3 = "requestTopicUserList " + i + str;
        g.a(i, str, 403, i2, i3, new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(final int i4, Map<String, Object> map, Object... objArr) {
                oms.f.a[] aVarArr;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i4), map, objArr});
                    return;
                }
                final ArrayList arrayList = new ArrayList();
                if (i4 == 1000 && map != null) {
                    Object obj = map.get("data");
                    if (obj instanceof oms.f) {
                        for (oms.f.a aVar : ((oms.f) obj).f32187a) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("userId", aVar.f32188a);
                            hashMap.put("nick", aVar.b);
                            hashMap.put("addTime", Long.valueOf(aVar.c));
                            arrayList.add(hashMap);
                        }
                        String str4 = "TopicUser " + aVarArr.length;
                    }
                }
                jSCallback.invoke(new HashMap<String, Object>() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.7.1
                    {
                        put("errorCode", Integer.valueOf(i4));
                        put("users", arrayList.toArray());
                        put("context", str2);
                    }
                });
            }
        }, str2);
    }

    @WXModuleAnno
    public void sendMessage(int i, Map<String, Object> map, final String str, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9f54f6", new Object[]{this, new Integer(i), map, str, jSCallback});
            return;
        }
        String str2 = "sendMessage " + i;
        g.a(i, fromMap(0, i, map), new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map2, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map2, objArr});
                } else {
                    PowerMsg4JS.access$100(PowerMsg4JS.this, i2, map2, str, jSCallback);
                }
            }
        }, str);
    }

    @WXModuleAnno
    public void sendTextMessage(int i, Map<String, Object> map, final String str, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f10e843", new Object[]{this, new Integer(i), map, str, jSCallback});
            return;
        }
        String str2 = "sendTextMessage " + i;
        g.a(i, (TextPowerMessage) fromMap(101, i, map), new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map2, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map2, objArr});
                } else {
                    PowerMsg4JS.access$100(PowerMsg4JS.this, i2, map2, str, jSCallback);
                }
            }
        }, str);
    }

    @WXModuleAnno
    public void setMsgFetchMode(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d9421b", new Object[]{this, new Integer(i), str, new Integer(i2)});
            return;
        }
        String str2 = "setMsgFetchMode " + i + i2;
        g.a(i, str, i2);
    }

    @WXModuleAnno
    public void subscribeByTag(int i, String str, String str2, String str3, final String str4, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9f3e91d", new Object[]{this, new Integer(i), str, str2, str3, str4, jSCallback});
            return;
        }
        String str5 = "subscribe " + i + str;
        a aVar = new a();
        this.dispatcher = aVar;
        g.a(i, aVar);
        g.a(i, str, str2, str3, "", new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                } else {
                    PowerMsg4JS.access$100(PowerMsg4JS.this, i2, map, str4, jSCallback);
                }
            }
        }, str4);
    }

    public Map<String, Object> toMap(final PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ce5810db", new Object[]{this, powerMessage}) : new HashMap<String, Object>() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.11
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
                    e eVar = (e) powerMessage;
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

    @WXModuleAnno
    public void unSubscribeByTag(int i, String str, String str2, String str3, final String str4, final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc434616", new Object[]{this, new Integer(i), str, str2, str3, str4, jSCallback});
            return;
        }
        String str5 = "unSubscribe " + i + str;
        g.b(i, str, str2, str3, "", new b() { // from class: com.taobao.tao.powermsg.outter.PowerMsg4JS.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.powermsg.common.b
            public void a(int i2, Map<String, Object> map, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                } else {
                    PowerMsg4JS.access$100(PowerMsg4JS.this, i2, map, str4, jSCallback);
                }
            }
        }, str4);
        this.dispatcher = null;
    }
}
