package com.taobao.tao.recommend3.newface.gateway.action;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.gkc;
import tb.gke;
import tb.kge;

/* loaded from: classes.dex */
public class d implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject e;
    private Handler b = new Handler(Looper.getMainLooper());
    private Queue<JSONObject> c = new ConcurrentLinkedQueue();
    private Map<Integer, JSONObject> d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public boolean f20935a = false;

    static {
        kge.a(-2114279731);
        kge.a(1464465151);
    }

    public static /* synthetic */ JSONObject a(d dVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ec70b3f9", new Object[]{dVar, jSONObject});
        }
        dVar.e = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ Queue a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("815e7297", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ JSONObject b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("83f69d18", new Object[]{dVar}) : dVar.e;
    }

    public static /* synthetic */ Map c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ea8c56e", new Object[]{dVar}) : dVar.d;
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("dataModel")) == null) {
        } else {
            String string = jSONObject2.getString("sectionBizCode");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            String string2 = jSONObject.getString("_operation");
            if (StringUtils.equals(string2, "enqueue")) {
                if (jSONObject.get("widgetNode") == null) {
                    return;
                }
                this.c.add(jSONObject2);
                int identityHashCode = System.identityHashCode(jSONObject2);
                this.d.put(Integer.valueOf(identityHashCode), jSONObject);
                com.taobao.android.home.component.utils.e.c("gw2.playerQueue", "enqueue, sectionBizCode=" + string + ", dataHash=" + identityHashCode + ", queueSize=" + this.c.size() + ", queueDataSize=" + this.d.size());
                a(gkcVar);
            } else if (!StringUtils.equals(string2, "dequeue")) {
            } else {
                this.c.remove(jSONObject2);
                int identityHashCode2 = System.identityHashCode(jSONObject2);
                this.d.remove(Integer.valueOf(identityHashCode2));
                com.taobao.android.home.component.utils.e.c("gw2.playerQueue", "dequeue, sectionBizCode=" + string + ", dataHash=" + identityHashCode2 + ", queueSize=" + this.c.size() + ", queueDataSize=" + this.d.size());
                if (jSONObject2 == this.e) {
                    this.e = null;
                    this.f20935a = false;
                }
                a(gkcVar);
            }
        }
    }

    private void a(final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea69ea79", new Object[]{this, gkcVar});
        } else if (this.f20935a) {
        } else {
            this.f20935a = true;
            this.b.post(new Runnable() { // from class: com.taobao.tao.recommend3.newface.gateway.action.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a();
                    d.this.f20935a = false;
                }

                private void a() {
                    JSONObject jSONObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (d.a(d.this).isEmpty()) {
                        d.a(d.this, (JSONObject) null);
                    } else {
                        JSONObject jSONObject2 = (JSONObject) d.a(d.this).peek();
                        String str = "null";
                        com.taobao.android.home.component.utils.e.c("gw2.playerQueue", "try to peek ", jSONObject2 == null ? str : jSONObject2.getString("sectionBizCode"), ", currentHead =", d.b(d.this) == null ? str : d.b(d.this).getString("sectionBizCode"));
                        if (jSONObject2 == null || jSONObject2 == d.b(d.this) || (jSONObject = (JSONObject) d.c(d.this).get(Integer.valueOf(System.identityHashCode(jSONObject2)))) == null || d.b(d.this) == jSONObject2) {
                            return;
                        }
                        d.a(d.this, jSONObject2);
                        JSONObject jSONObject3 = jSONObject.getJSONObject("dataModel");
                        String[] strArr = new String[2];
                        strArr[0] = "play next=";
                        if (jSONObject3 != null) {
                            str = jSONObject3.getString("sectionBizCode");
                        }
                        strArr[1] = str;
                        com.taobao.android.home.component.utils.e.c("gw2.playerQueue", strArr);
                        gkcVar.a("headerChanged", jSONObject, null);
                    }
                }
            });
        }
    }
}
