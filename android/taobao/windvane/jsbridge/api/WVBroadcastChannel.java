package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.rir;
import tb.ris;

/* loaded from: classes2.dex */
public class WVBroadcastChannel extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CHANNEL_INSTANCE_ID = "instanceId";
    private static final String CHANNEL_KEY = "name";
    private static final String CHANNEL_MESSAGE = "message";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_RESULT = "result";
    private static final String TAG = "WVBroadcast";
    private Map<String, ris> messageTokenChannels = new HashMap();

    static {
        kge.a(-1093228433);
    }

    public static /* synthetic */ Object ipc$super(WVBroadcastChannel wVBroadcastChannel, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str2);
            if ("createChannel".equals(str)) {
                createChannel(parseObject, wVCallBackContext);
            } else if ("closeChannel".equals(str)) {
                closeChannel(parseObject);
            } else if (!"postMessage".equals(str)) {
                return false;
            } else {
                postMessage(parseObject, wVCallBackContext);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }

    public void createChannel(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f973b17f", new Object[]{this, jSONObject, wVCallBackContext});
        } else if (wVCallBackContext == null || wVCallBackContext.getWebview().getContext() == null || jSONObject == null || StringUtils.isEmpty(jSONObject.getString("name")) || StringUtils.isEmpty(jSONObject.getString("instanceId"))) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", (Object) "-1");
            jSONObject2.put("message", (Object) "channel args error");
            wVCallBackContext.error(new r(jSONObject2.toJSONString()));
        } else {
            synchronized (this) {
                if (this.messageTokenChannels == null) {
                    this.messageTokenChannels = new HashMap();
                }
                String string = jSONObject.getString("name");
                String string2 = jSONObject.getString("instanceId");
                if (this.messageTokenChannels.get(string2) != null) {
                    if (wVCallBackContext != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("result", (Object) "-1");
                        jSONObject3.put("message", (Object) "channel error token has been used");
                        wVCallBackContext.error(jSONObject3.toJSONString());
                    }
                    return;
                }
                this.messageTokenChannels.put(string2, new ris(wVCallBackContext.getWebview().getContext(), string, null));
                if (wVCallBackContext != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("result", (Object) "0");
                    jSONObject4.put("message", (Object) "channel create success");
                    wVCallBackContext.success(jSONObject4.toJSONString());
                }
                onMessage(jSONObject, wVCallBackContext);
            }
        }
    }

    private void onMessage(JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5683de", new Object[]{this, jSONObject, wVCallBackContext});
        } else if (this.messageTokenChannels == null) {
        } else {
            final String string = jSONObject.getString("instanceId");
            if (StringUtils.isEmpty(string)) {
                if (wVCallBackContext == null) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", (Object) "-1");
                jSONObject2.put("message", (Object) "channel token empty error");
                wVCallBackContext.error(jSONObject2.toJSONString());
                return;
            }
            ris risVar = this.messageTokenChannels.get(string);
            if (risVar != null) {
                risVar.a(new rir() { // from class: android.taobao.windvane.jsbridge.api.WVBroadcastChannel.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.rir
                    public void a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        } else if (wVCallBackContext == null) {
                        } else {
                            String str = "Broadcast.Message." + string;
                            String jSONString = JSON.toJSONString(obj);
                            com.taobao.android.riverlogger.e.a(RVLLevel.Error, WVBroadcastChannel.TAG).a(str).a("params", (Object) jSONString).a();
                            wVCallBackContext.fireEvent(str, jSONString);
                        }
                    }
                });
            } else if (wVCallBackContext == null) {
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("result", (Object) "-1");
                jSONObject3.put("message", (Object) "channel token not exist");
                wVCallBackContext.error(jSONObject3.toJSONString());
            }
        }
    }

    public void postMessage(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab1429f", new Object[]{this, jSONObject, wVCallBackContext});
        } else if (this.messageTokenChannels == null) {
        } else {
            if (StringUtils.isEmpty(jSONObject.getString("instanceId")) || !jSONObject.containsKey("message")) {
                if (wVCallBackContext == null) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", (Object) "-1");
                jSONObject2.put("message", (Object) "post message args error");
                wVCallBackContext.error(jSONObject2.toJSONString());
                return;
            }
            String string = jSONObject.getString("instanceId");
            Object obj = jSONObject.get("message");
            ris risVar = this.messageTokenChannels.get(string);
            if (risVar == null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("result", (Object) "-1");
                jSONObject3.put("message", (Object) "channel token not exist");
                wVCallBackContext.error(jSONObject3.toJSONString());
                return;
            }
            risVar.a(obj);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("result", (Object) "0");
            jSONObject4.put("message", (Object) "post message success");
            wVCallBackContext.success(jSONObject4.toJSONString());
        }
    }

    public void closeChannel(JSONObject jSONObject) {
        ris remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39dba3e", new Object[]{this, jSONObject});
        } else if (jSONObject == null || this.messageTokenChannels == null || (remove = this.messageTokenChannels.remove(jSONObject.getString("instanceId"))) == null) {
        } else {
            remove.b();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Map<String, ris> map = this.messageTokenChannels;
        if (map != null) {
            for (Map.Entry<String, ris> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().b();
                }
            }
            this.messageTokenChannels.clear();
        }
        super.onDestroy();
    }
}
