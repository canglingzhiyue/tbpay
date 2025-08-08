package com.taobao.android.detail2.core.framework.base.weex;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.android.weex_framework.p;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fij;
import tb.fin;
import tb.fjt;
import tb.ipa;
import tb.kge;

/* loaded from: classes5.dex */
public class DetailWeexModule extends WXModule implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<Integer, Integer> sCacheBatchCount;
    private static HashMap<Integer, Boolean> sCacheHasPostCheck;
    private static HashMap<Integer, JSONObject> sCacheMap;
    public List<JSCallback> mCallbacks = new ArrayList();

    public static /* synthetic */ HashMap access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("3d0ed1a", new Object[0]) : sCacheHasPostCheck;
    }

    public static /* synthetic */ HashMap access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("88013a1b", new Object[0]) : sCacheBatchCount;
    }

    public static /* synthetic */ HashMap access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("c31871c", new Object[0]) : sCacheMap;
    }

    public static /* synthetic */ void access$300(int i, JSONObject jSONObject, d dVar, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8edd67", new Object[]{new Integer(i), jSONObject, dVar, pVar});
        } else {
            processBatchDispatchMessage(i, jSONObject, dVar, pVar);
        }
    }

    @JSMethod
    public void onMessage(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce0e879", new Object[]{this, jSCallback});
            return;
        }
        this.mWXSDKInstance.ak();
        this.mCallbacks.add(jSCallback);
    }

    @JSMethod
    public void dispatchMessage(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763590d1", new Object[]{this, map});
        } else {
            dispatchMessage(map, this);
        }
    }

    static {
        kge.a(644122318);
        kge.a(-600857786);
        sCacheBatchCount = null;
        sCacheHasPostCheck = null;
        sCacheMap = null;
    }

    private static void processBatchDispatchMessage(final int i, JSONObject jSONObject, final d dVar, final p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602ac816", new Object[]{new Integer(i), jSONObject, dVar, pVar});
            return;
        }
        if (sCacheBatchCount == null) {
            sCacheBatchCount = new HashMap<>();
        }
        if (sCacheHasPostCheck == null) {
            sCacheHasPostCheck = new HashMap<>();
        }
        if (sCacheMap == null) {
            sCacheMap = new HashMap<>();
        }
        JSONObject jSONObject2 = sCacheMap.get(Integer.valueOf(i));
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            sCacheMap.put(Integer.valueOf(i), jSONObject2);
        }
        Boolean bool = sCacheHasPostCheck.get(Integer.valueOf(i));
        if (bool == null) {
            bool = false;
        }
        jSONObject2.putAll(jSONObject);
        Integer num = sCacheBatchCount.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        Integer valueOf = Integer.valueOf(num.intValue() + 1);
        sCacheBatchCount.put(Integer.valueOf(i), valueOf);
        if (valueOf.intValue() >= 8) {
            if (!ipa.ae()) {
                fjt.a(fjt.TAG_TIP, "static batchFireEvent , batchCountFull , eventCount = " + valueOf);
            }
            sCacheMap.put(Integer.valueOf(i), new JSONObject());
            if (pVar != null) {
                pVar.fireEvent(2, "newdetailcallback", jSONObject2);
            } else if (dVar != null) {
                dVar.fireEvent("newdetailcallback", jSONObject2);
            }
            if (!ipa.ae()) {
                fjt.a(fjt.TAG_RENDER, "[缓存] weex数据流 向weex发消息：" + JSON.toJSONString(jSONObject2.keySet()));
            }
            sCacheBatchCount.put(Integer.valueOf(i), 0);
        } else if (bool.booleanValue() && valueOf.intValue() != 1) {
        } else {
            ipa.N().postDelayed(new Runnable() { // from class: com.taobao.android.detail2.core.framework.base.weex.DetailWeexModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DetailWeexModule.access$000().put(Integer.valueOf(i), false);
                    Integer num2 = (Integer) DetailWeexModule.access$100().get(Integer.valueOf(i));
                    if (num2 == null) {
                        num2 = 0;
                    }
                    if (!ipa.ae()) {
                        fjt.a(fjt.TAG_TIP, "static batchFireEvent , delayCheck , eventCount = " + num2);
                    }
                    if (num2.intValue() <= 0) {
                        return;
                    }
                    JSONObject jSONObject3 = (JSONObject) DetailWeexModule.access$200().get(Integer.valueOf(i));
                    if (jSONObject3 != null) {
                        DetailWeexModule.access$200().remove(Integer.valueOf(i));
                        p pVar2 = pVar;
                        if (pVar2 != null) {
                            pVar2.fireEvent(2, "newdetailcallback", jSONObject3);
                        } else {
                            d dVar2 = dVar;
                            if (dVar2 != null) {
                                dVar2.fireEvent("newdetailcallback", jSONObject3);
                            }
                        }
                        if (!ipa.ae()) {
                            fjt.a(fjt.TAG_RENDER, "weex数据流 向weex发消息：" + JSON.toJSONString(jSONObject3.keySet()));
                        }
                    }
                    DetailWeexModule.access$100().put(Integer.valueOf(i), 0);
                }
            }, ipa.ay());
        }
    }

    public static void dispatchMessage(Map<String, Object> map, final d dVar) {
        List<Event> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78262ddc", new Object[]{map, dVar});
        } else if (map != null && dVar != null) {
            View containerView = dVar.getContainerView();
            final int i = -1;
            if (ipa.ah() && (dVar instanceof DetailWeexV2Module)) {
                i = dVar.hashCode();
            }
            if (containerView == null) {
                return;
            }
            Object tag = containerView.getTag("mountUniqId".hashCode());
            Object tag2 = containerView.getTag("mountBizType".hashCode());
            JSONObject jSONObject = new JSONObject(map);
            if (tag != null) {
                jSONObject.put("uniqueId", tag);
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("nid");
                    if (!StringUtils.isEmpty(string)) {
                        jSONObject.put("uniqueId", (Object) string);
                    } else {
                        jSONObject.put("uniqueId", (Object) jSONObject2.getString("itemId"));
                    }
                }
            }
            try {
                fjt.a(fjt.TAG_RENDER, "收到来自weex: " + dVar.getBundleUrl() + "的消息：" + JSONObject.toJSONString(map));
            } catch (Exception e) {
                e.printStackTrace();
            }
            jSONObject.put("callback", (Object) new fij.a() { // from class: com.taobao.android.detail2.core.framework.base.weex.DetailWeexModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fij.a
                public void a(JSONObject jSONObject3) {
                    int i2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject3});
                    } else if (ipa.ah() && (i2 = i) > 0) {
                        DetailWeexModule.access$300(i2, jSONObject3, dVar, r3);
                    } else {
                        d dVar2 = dVar;
                        if (dVar2 == null) {
                            return;
                        }
                        dVar2.fireEvent("newdetailcallback", jSONObject3);
                        fjt.a(fjt.TAG_RENDER, "weex数据流 向weex发消息：" + JSON.toJSONString(jSONObject3.keySet()));
                    }
                }
            });
            if (tag2 instanceof String) {
                a2 = fin.a((String) tag2, jSONObject);
            } else {
                a2 = fin.a((String) null, jSONObject);
            }
            if (a2 == null) {
                return;
            }
            Object tag3 = containerView.getTag("mountNewDetailContainer".hashCode());
            if (tag3 != null) {
                for (Event event : a2) {
                    com.taobao.android.trade.event.f.a(tag3, event);
                }
                return;
            }
            for (Event event2 : a2) {
                com.taobao.android.trade.event.f.a(dVar.getContext(), event2);
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.d
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        if (this.mWXSDKInstance == null) {
            return null;
        }
        return this.mWXSDKInstance.O();
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.d
    public View getContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3268c19", new Object[]{this});
        }
        if (this.mWXSDKInstance == null) {
            return null;
        }
        return this.mWXSDKInstance.am();
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.d
    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dee20482", new Object[]{this}) : this.mWXSDKInstance != null ? this.mWXSDKInstance.ak() : "";
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.d
    public void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
        } else if (this.mWXSDKInstance == null || this.mWXSDKInstance.z() == null) {
        } else {
            this.mWXSDKInstance.a(this.mWXSDKInstance.z().getRef(), str, jSONObject);
        }
    }
}
