package tb;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes7.dex */
public class lwm implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject e;
    private Handler b = new Handler(Looper.getMainLooper());
    private Queue<JSONObject> c = new ConcurrentLinkedQueue();
    private Map<Integer, JSONObject> d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public boolean f30946a = false;

    static {
        kge.a(-137061930);
        kge.a(1464465151);
    }

    public static /* synthetic */ JSONObject a(lwm lwmVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5eee757a", new Object[]{lwmVar, jSONObject});
        }
        lwmVar.e = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ Queue a(lwm lwmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("7b19d6f6", new Object[]{lwmVar}) : lwmVar.c;
    }

    public static /* synthetic */ JSONObject b(lwm lwmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a30c60f7", new Object[]{lwmVar}) : lwmVar.e;
    }

    public static /* synthetic */ Map c(lwm lwmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c6aa708d", new Object[]{lwmVar}) : lwmVar.d;
    }

    public lwm() {
    }

    public lwm(lwz lwzVar) {
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
                lxl.b("gw2.playerQueue", "enqueue, sectionBizCode=" + string + ", dataHash=" + identityHashCode + ", queueSize=" + this.c.size() + ", queueDataSize=" + this.d.size());
                a(gkcVar);
            } else if (!StringUtils.equals(string2, "dequeue")) {
            } else {
                this.c.remove(jSONObject2);
                int identityHashCode2 = System.identityHashCode(jSONObject2);
                this.d.remove(Integer.valueOf(identityHashCode2));
                lxl.b("gw2.playerQueue", "dequeue, sectionBizCode=" + string + ", dataHash=" + identityHashCode2 + ", queueSize=" + this.c.size() + ", queueDataSize=" + this.d.size());
                if (jSONObject2 == this.e) {
                    this.e = null;
                    this.f30946a = false;
                }
                a(gkcVar);
            }
        }
    }

    private void a(final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea69ea79", new Object[]{this, gkcVar});
        } else if (this.f30946a) {
        } else {
            this.f30946a = true;
            this.b.post(new Runnable() { // from class: tb.lwm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a();
                    lwm.this.f30946a = false;
                }

                private void a() {
                    JSONObject jSONObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (lwm.a(lwm.this).isEmpty()) {
                        lwm.a(lwm.this, (JSONObject) null);
                    } else {
                        JSONObject jSONObject2 = (JSONObject) lwm.a(lwm.this).peek();
                        String str = "null";
                        lxl.b("gw2.playerQueue", "try to peek ", jSONObject2 == null ? str : jSONObject2.getString("sectionBizCode"), ", currentHead =", lwm.b(lwm.this) == null ? str : lwm.b(lwm.this).getString("sectionBizCode"));
                        if (jSONObject2 == null || jSONObject2 == lwm.b(lwm.this) || (jSONObject = (JSONObject) lwm.c(lwm.this).get(Integer.valueOf(System.identityHashCode(jSONObject2)))) == null || lwm.b(lwm.this) == jSONObject2) {
                            return;
                        }
                        lwm.a(lwm.this, jSONObject2);
                        JSONObject jSONObject3 = jSONObject.getJSONObject("dataModel");
                        String[] strArr = new String[2];
                        strArr[0] = "play next=";
                        if (jSONObject3 != null) {
                            str = jSONObject3.getString("sectionBizCode");
                        }
                        strArr[1] = str;
                        lxl.b("gw2.playerQueue", strArr);
                        gkcVar.a("headerChanged", jSONObject, null);
                    }
                }
            });
        }
    }
}
