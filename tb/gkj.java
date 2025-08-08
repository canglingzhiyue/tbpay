package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.b;
import com.taobao.android.gateway.util.a;
import com.taobao.android.gateway.util.d;
import com.taobao.android.task.Coordinator;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class gkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f28366a;
    private String b;
    private String c;
    private JSONObject d;

    static {
        kge.a(82855756);
    }

    public static /* synthetic */ JSONObject a(gkj gkjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d932fc32", new Object[]{gkjVar}) : gkjVar.b();
    }

    public static /* synthetic */ JSONObject a(gkj gkjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709abf3e", new Object[]{gkjVar, jSONObject});
        }
        gkjVar.d = jSONObject;
        return jSONObject;
    }

    public gkj(String str, String str2, String str3, boolean z) {
        this.f28366a = str;
        this.b = str2;
        this.c = str3;
        if (z) {
            this.d = b();
        } else if (d.a()) {
            Coordinator.execute(new Runnable() { // from class: tb.gkj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    gkj gkjVar = gkj.this;
                    gkj.a(gkjVar, gkj.a(gkjVar));
                }
            });
        } else {
            this.d = b();
        }
    }

    public gkj(String str, JSONObject jSONObject) {
        this.f28366a = str;
        this.d = jSONObject;
    }

    public List<gki> a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("86e8382e", new Object[]{this, bVar});
        }
        ArrayList arrayList = new ArrayList();
        List<gki> b = b(bVar);
        if (b != null) {
            arrayList.addAll(b);
        }
        return arrayList;
    }

    public List<gki> b(b bVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5493c0d", new Object[]{this, bVar});
        }
        if (bVar == null) {
            return null;
        }
        if (bVar.e() != null) {
            return a(bVar, bVar.e());
        }
        String a2 = (bVar == null || bVar.c() == null) ? null : bVar.c().a();
        if (StringUtils.isEmpty(a2) || StringUtils.isEmpty(bVar.b()) || (jSONObject = this.d.getJSONObject(a2)) == null || jSONObject.isEmpty()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(bVar);
        for (b d = bVar.d(); d != null; d = d.d()) {
            linkedList.add(0, d);
        }
        Iterator it = linkedList.iterator();
        JSONObject jSONObject2 = jSONObject;
        JSONArray jSONArray = null;
        while (it.hasNext()) {
            String b = ((b) it.next()).b();
            if (StringUtils.isEmpty(b)) {
                return null;
            }
            if (jSONArray != null && !jSONArray.isEmpty()) {
                Iterator<Object> it2 = jSONArray.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        jSONObject2 = null;
                        break;
                    }
                    Object next = it2.next();
                    if ((next instanceof JSONObject) && (jSONObject2 = ((JSONObject) next).getJSONObject("callback")) != null && jSONObject2.containsKey(b)) {
                        break;
                    }
                }
            }
            if (jSONObject2 == null) {
                return null;
            }
            jSONArray = jSONObject2.getJSONArray(b);
        }
        return a(bVar, jSONArray);
    }

    private List<gki> a(b bVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("16be8e06", new Object[]{this, bVar, jSONArray});
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                arrayList.add(new gki(bVar, (JSONObject) next));
            }
        }
        return arrayList;
    }

    private JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject jSONObject = null;
        if (!StringUtils.isEmpty(this.f28366a)) {
            jSONObject = a(this.f28366a);
        }
        if (jSONObject == null && !StringUtils.isEmpty(this.b)) {
            jSONObject = b(this.b);
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return jSONObject;
        }
        try {
            AppMonitor.Counter.commit("Gateway2", "loadConfigFailed", 1.0d);
        } catch (Throwable th) {
            a.a("App Monitor Exception.", th);
        }
        return c();
    }

    private JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        if (gjv.f28356a == null) {
            return null;
        }
        File file = new File(gmb.a(gjv.f28356a).a(), str);
        if (file.exists()) {
            try {
                byte[] a2 = gmc.a(file);
                if (a2 != null && a2.length > 0) {
                    return JSON.parseObject(new String(a2, "UTF-8"));
                }
            } catch (Throwable th) {
                a.b(th, "loadFile error, filePath=", str);
            }
        }
        return null;
    }

    private JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str});
        }
        if (gjv.f28356a == null) {
            return null;
        }
        try {
            byte[] a2 = gmc.a(str, gjv.f28356a);
            if (a2 != null && a2.length > 0) {
                return JSON.parseObject(new String(a2, "UTF-8"));
            }
        } catch (Throwable th) {
            a.b(th, "loadAsset error, assetPath=", str);
        }
        return null;
    }

    private JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.c)) {
            return null;
        }
        try {
            return JSON.parseObject(this.c);
        } catch (Throwable th) {
            a.b(th, "loadPreset error");
            return null;
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.d;
    }
}
