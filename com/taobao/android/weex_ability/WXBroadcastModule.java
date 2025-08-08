package com.taobao.android.weex_ability;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.rir;
import tb.ris;

/* loaded from: classes6.dex */
public final class WXBroadcastModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CHANNEL_INSTANCE_ID = "instanceId";
    private static final String CHANNEL_KEY = "name";
    private static final String CHANNEL_MESSAGE = "message";
    private static final String MESSAGE = "message";
    public static final String[] METHODS;
    public static final String NAME = "broadcast";
    private static final String RESULT = "result";
    private Map<String, ris> messageTokenChannels = new HashMap();

    public static /* synthetic */ Object ipc$super(WXBroadcastModule wXBroadcastModule, String str, Object... objArr) {
        if (str.hashCode() == -498459201) {
            super.onMainThreadDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(469644444);
        METHODS = new String[]{"createChannel", b.c.EVENT_ON_MESSAGE, "postMessage", "closeChannel", "close"};
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        char c = 65535;
        switch (str2.hashCode()) {
            case -2003762904:
                if (str2.equals(b.c.EVENT_ON_MESSAGE)) {
                    c = 1;
                    break;
                }
                break;
            case -1309499289:
                if (str2.equals("createChannel")) {
                    c = 0;
                    break;
                }
                break;
            case -606138389:
                if (str2.equals("closeChannel")) {
                    c = 3;
                    break;
                }
                break;
            case 94756344:
                if (str2.equals("close")) {
                    c = 4;
                    break;
                }
                break;
            case 1490029383:
                if (str2.equals("postMessage")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            argCount(weexValueArr, 3);
            createChannel(getArg(weexValueArr, 0).toJSONObjectOrNull(), getCallback(weexValueArr, 1), getCallback(weexValueArr, 2));
            return null;
        } else if (c == 1) {
            argCount(weexValueArr, 3);
            onMessage(getArg(weexValueArr, 0).toJSONObjectOrNull(), getCallback(weexValueArr, 1), getCallback(weexValueArr, 2));
            return null;
        } else if (c == 2) {
            argCount(weexValueArr, 3);
            postMessage(getArg(weexValueArr, 0).toJSONObjectOrNull(), getCallback(weexValueArr, 1), getCallback(weexValueArr, 2));
            return null;
        } else if (c == 3) {
            argCount(weexValueArr, 1);
            closeChannel(getArg(weexValueArr, 0).toJSONObjectOrNull());
            return null;
        } else if (c != 4) {
            return null;
        } else {
            argCount(weexValueArr, 1);
            close(getArg(weexValueArr, 0).toJSONObjectOrNull());
            return null;
        }
    }

    private void createChannel(JSONObject jSONObject, com.taobao.android.weex.b bVar, com.taobao.android.weex.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afaadd82", new Object[]{this, jSONObject, bVar, bVar2});
        } else if (getWeexInstance().getContext() == null || jSONObject == null || StringUtils.isEmpty(jSONObject.getString("name")) || StringUtils.isEmpty(jSONObject.getString("instanceId"))) {
            if (bVar2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", (Object) "-1");
                jSONObject2.put("message", (Object) "channel args error");
                bVar2.a(jSONObject2);
            }
            if (bVar == null) {
                return;
            }
            bVar.a();
        } else {
            synchronized (this) {
                if (this.messageTokenChannels == null) {
                    this.messageTokenChannels = new HashMap();
                }
                String string = jSONObject.getString("name");
                String string2 = jSONObject.getString("instanceId");
                if (this.messageTokenChannels.get(string2) != null) {
                    if (bVar2 != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("result", (Object) "-1");
                        jSONObject3.put("message", (Object) "channel error token has been used");
                        bVar2.a(jSONObject3);
                    }
                    if (bVar != null) {
                        bVar.a();
                    }
                    return;
                }
                this.messageTokenChannels.put(string2, new ris(getWeexInstance().getContext(), string, null));
                if (bVar != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("result", (Object) "0");
                    jSONObject4.put("message", (Object) "channel create success");
                    bVar.a(jSONObject4);
                }
                if (bVar2 != null) {
                    bVar2.a();
                }
            }
        }
    }

    private void onMessage(JSONObject jSONObject, final com.taobao.android.weex.b bVar, com.taobao.android.weex.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68229421", new Object[]{this, jSONObject, bVar, bVar2});
        } else if (this.messageTokenChannels == null) {
        } else {
            String string = jSONObject.getString("instanceId");
            if (StringUtils.isEmpty(string)) {
                if (bVar2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", (Object) "-1");
                    jSONObject2.put("message", (Object) "channel token empty error");
                    bVar2.a(jSONObject2);
                }
                if (bVar == null) {
                    return;
                }
                bVar.a();
                return;
            }
            ris risVar = this.messageTokenChannels.get(string);
            if (risVar != null) {
                if (bVar2 != null) {
                    bVar2.a();
                }
                risVar.a(new rir() { // from class: com.taobao.android.weex_ability.WXBroadcastModule.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.rir
                    public void a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        } else if (bVar == null) {
                        } else {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("result", (Object) "0");
                            jSONObject3.put("message", obj);
                            bVar.b(obj);
                        }
                    }
                });
                return;
            }
            if (bVar2 != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("result", (Object) "-1");
                jSONObject3.put("message", (Object) "channel token not exist");
                bVar2.a(jSONObject3);
            }
            if (bVar == null) {
                return;
            }
            bVar.a();
        }
    }

    private void postMessage(JSONObject jSONObject, com.taobao.android.weex.b bVar, com.taobao.android.weex.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c8a6a2", new Object[]{this, jSONObject, bVar, bVar2});
        } else if (this.messageTokenChannels == null) {
        } else {
            if (StringUtils.isEmpty(jSONObject.getString("instanceId")) || !jSONObject.containsKey("message")) {
                if (bVar2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", (Object) "-1");
                    jSONObject2.put("message", (Object) "post message args error");
                    bVar2.a(jSONObject2);
                }
                if (bVar == null) {
                    return;
                }
                bVar.a();
                return;
            }
            String string = jSONObject.getString("instanceId");
            Object obj = jSONObject.get("message");
            ris risVar = this.messageTokenChannels.get(string);
            if (risVar == null) {
                if (bVar2 != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("result", (Object) "-1");
                    jSONObject3.put("message", (Object) "channel token not exist");
                    bVar2.a(jSONObject3);
                }
                if (bVar == null) {
                    return;
                }
                bVar.a();
                return;
            }
            risVar.a(obj);
            if (bVar != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", (Object) "0");
                jSONObject4.put("message", (Object) "post message success");
                bVar.a(jSONObject4);
            }
            if (bVar2 == null) {
                return;
            }
            bVar2.a();
        }
    }

    private void closeChannel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39dba3e", new Object[]{this, jSONObject});
        } else {
            close(jSONObject);
        }
    }

    private void close(JSONObject jSONObject) {
        ris remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d1a051", new Object[]{this, jSONObject});
        } else if (jSONObject == null || this.messageTokenChannels == null || !jSONObject.containsKey("instanceId") || (remove = this.messageTokenChannels.remove(jSONObject.getString("instanceId"))) == null) {
        } else {
            remove.b();
        }
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
            return;
        }
        super.onMainThreadDestroy();
        Map<String, ris> map = this.messageTokenChannels;
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ris> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().b();
            }
        }
        this.messageTokenChannels.clear();
    }
}
