package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class dwp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, JSONObject> f27038a;
    private dwq b;
    private dwn c;

    static {
        kge.a(-1076951882);
        f27038a = new ConcurrentHashMap();
    }

    public dwp(Context context) {
        this.b = new dwq(context);
        dwm.a();
        dwm.b();
        emu.a("com.taobao.android.detail.core.aura.compare.ProtocolCompareProcessor");
    }

    public boolean a(b bVar, List<AURARenderComponent> list, boolean z) {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccd48545", new Object[]{this, bVar, list, new Boolean(z)})).booleanValue();
        }
        this.c = new dwn();
        this.c.a(true);
        if (!a(bVar)) {
            return this.c.b();
        }
        if (z) {
            b = this.b.a(bVar);
        } else {
            b = this.b.b(bVar);
        }
        if (bau.a(b)) {
            return this.c.b();
        }
        try {
            this.c.a(a(b, list));
            return this.c.b();
        } catch (Throwable th) {
            th.printStackTrace();
            return this.c.b();
        }
    }

    private boolean a(List<IDMComponent> list, List<AURARenderComponent> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78fe44e", new Object[]{this, list, list2})).booleanValue();
        }
        List<AURARenderComponent> a2 = a(list2);
        List<IDMComponent> b = b(list);
        if (a2.size() != b.size()) {
            dwn dwnVar = this.c;
            dwnVar.a("组件长度不一致" + b(b, a2));
            return false;
        }
        for (int i = 0; i < a2.size(); i++) {
            if (!a(b.get(i), a2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private String b(List<IDMComponent> list, List<AURARenderComponent> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b356c35", new Object[]{this, list, list2});
        }
        StringBuffer stringBuffer = new StringBuffer();
        HashMap hashMap = new HashMap();
        for (IDMComponent iDMComponent : list) {
            String key = iDMComponent.getKey();
            if (!TextUtils.isEmpty(key)) {
                hashMap.put(a(key), 1);
            }
        }
        for (AURARenderComponent aURARenderComponent : list2) {
            if (hashMap.get(aURARenderComponent.key) != null) {
                hashMap.put(aURARenderComponent.key, 2);
            } else {
                stringBuffer.append(aURARenderComponent.key);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == 1) {
                stringBuffer.append((String) entry.getKey());
            }
        }
        return stringBuffer.toString();
    }

    private boolean a(IDMComponent iDMComponent, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f358c7d3", new Object[]{this, iDMComponent, aURARenderComponent})).booleanValue();
        }
        this.c.a(aURARenderComponent.key);
        JSONObject fields = iDMComponent.getFields();
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        JSONObject jSONObject = null;
        if (!a(fields, new JSONObject(aURARenderComponentData != null ? aURARenderComponentData.fields : null))) {
            return false;
        }
        JSONObject events = iDMComponent.getEvents();
        if (aURARenderComponentData != null) {
            jSONObject = JSONObject.parseObject(JSON.toJSONString(aURARenderComponentData.events));
        }
        return a(events, jSONObject);
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        int a2 = a(jSONObject);
        int a3 = a(jSONObject2);
        if ((a2 == 0 && a3 == 0) || b(jSONObject, jSONObject2)) {
            return true;
        }
        this.c.c(jSONObject.toJSONString());
        this.c.d(jSONObject2.toJSONString());
        return false;
    }

    private boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("525e83ad", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        Set<String> keySet = jSONObject.keySet();
        Set<String> keySet2 = jSONObject2.keySet();
        for (String str : keySet) {
            if (!dwm.d().contains(str) && !a(jSONObject, jSONObject2, str)) {
                return false;
            }
        }
        for (String str2 : keySet2) {
            if (!dwm.d().contains(str2) && !a(jSONObject, jSONObject2, str2)) {
                return false;
            }
        }
        return true;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("461bb036", new Object[]{this, jSONObject, jSONObject2, str})).booleanValue();
        }
        if (dwo.a(jSONObject.get(str), jSONObject2.get(str), str)) {
            return true;
        }
        this.c.b(str);
        return false;
    }

    private List<AURARenderComponent> a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        for (AURARenderComponent aURARenderComponent : list) {
            if (!TextUtils.isEmpty(aURARenderComponent.key) && !dwm.c().contains(aURARenderComponent.key)) {
                arrayList.add(aURARenderComponent);
            }
        }
        return arrayList;
    }

    private int a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7b", new Object[]{this, jSONObject})).intValue();
        }
        if (jSONObject == null) {
            return 0;
        }
        for (String str : jSONObject.keySet()) {
            if (!dwm.d().contains(str)) {
                i++;
            }
        }
        return i;
    }

    private List<IDMComponent> b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b5ee42d", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : list) {
            String key = iDMComponent.getKey();
            if (!TextUtils.isEmpty(key) && !dwm.c().contains(a(key))) {
                arrayList.add(iDMComponent);
            }
        }
        return arrayList;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str.contains("$")) {
            str = str.split("\\$")[1];
        }
        return str.contains("_") ? str.split("_")[0] : str;
    }

    public dwn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dwn) ipChange.ipc$dispatch("f03e643", new Object[]{this}) : this.c;
    }

    public boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c456306", new Object[]{this, bVar})).booleanValue();
        }
        JSONObject jSONObject = bVar.a().getJSONObject("feature");
        return !bau.a(jSONObject) && jSONObject.getBooleanValue("finalUltronCompare");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        dwq dwqVar = this.b;
        if (dwqVar == null) {
            return;
        }
        dwqVar.a();
        this.b = null;
    }
}
