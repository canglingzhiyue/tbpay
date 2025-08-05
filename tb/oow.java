package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes8.dex */
public class oow implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject e;
    private Handler b = new Handler(Looper.getMainLooper());
    private Queue<JSONObject> c = new ConcurrentLinkedQueue();
    private Map<Integer, JSONObject> d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public boolean f32242a = false;

    static {
        kge.a(-1430674539);
        kge.a(1464465151);
    }

    public static /* synthetic */ JSONObject a(oow oowVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ae9e254f", new Object[]{oowVar, jSONObject});
        }
        oowVar.e = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ Queue a(oow oowVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("b635ba81", new Object[]{oowVar}) : oowVar.c;
    }

    public static /* synthetic */ JSONObject b(oow oowVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b43dce82", new Object[]{oowVar}) : oowVar.e;
    }

    public static /* synthetic */ Map c(oow oowVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bdefbad8", new Object[]{oowVar}) : oowVar.d;
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
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String string2 = jSONObject.getString("_operation");
            if (TextUtils.equals(string2, "enqueue")) {
                if (jSONObject.get("widgetNode") == null) {
                    return;
                }
                this.c.add(jSONObject2);
                int identityHashCode = System.identityHashCode(jSONObject2);
                this.d.put(Integer.valueOf(identityHashCode), jSONObject);
                e.c("gw2.playerQueue", "enqueue, sectionBizCode=" + string + ", dataHash=" + identityHashCode + ", queueSize=" + this.c.size() + ", queueDataSize=" + this.d.size());
                a(gkcVar);
            } else if (!TextUtils.equals(string2, "dequeue")) {
            } else {
                this.c.remove(jSONObject2);
                int identityHashCode2 = System.identityHashCode(jSONObject2);
                this.d.remove(Integer.valueOf(identityHashCode2));
                e.c("gw2.playerQueue", "dequeue, sectionBizCode=" + string + ", dataHash=" + identityHashCode2 + ", queueSize=" + this.c.size() + ", queueDataSize=" + this.d.size());
                if (jSONObject2 == this.e) {
                    this.e = null;
                    this.f32242a = false;
                }
                a(gkcVar);
            }
        }
    }

    private void a(final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea69ea79", new Object[]{this, gkcVar});
        } else if (this.f32242a) {
        } else {
            this.f32242a = true;
            this.b.post(new Runnable() { // from class: tb.oow.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a();
                    oow.this.f32242a = false;
                }

                private void a() {
                    JSONObject jSONObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (oow.a(oow.this).isEmpty()) {
                        oow.a(oow.this, (JSONObject) null);
                    } else {
                        JSONObject jSONObject2 = (JSONObject) oow.a(oow.this).peek();
                        String str = "null";
                        e.c("gw2.playerQueue", "try to peek ", jSONObject2 == null ? str : jSONObject2.getString("sectionBizCode"), ", currentHead =", oow.b(oow.this) == null ? str : oow.b(oow.this).getString("sectionBizCode"));
                        if (jSONObject2 == null || jSONObject2 == oow.b(oow.this) || (jSONObject = (JSONObject) oow.c(oow.this).get(Integer.valueOf(System.identityHashCode(jSONObject2)))) == null || oow.b(oow.this) == jSONObject2) {
                            return;
                        }
                        oow.a(oow.this, jSONObject2);
                        JSONObject jSONObject3 = jSONObject.getJSONObject("dataModel");
                        String[] strArr = new String[2];
                        strArr[0] = "play next=";
                        if (jSONObject3 != null) {
                            str = jSONObject3.getString("sectionBizCode");
                        }
                        strArr[1] = str;
                        e.c("gw2.playerQueue", strArr);
                        gkcVar.a("headerChanged", jSONObject, null);
                    }
                }
            });
        }
    }
}
