package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class flv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, flw> f28042a = new HashMap<>();
    private List<flw> b = new ArrayList();

    static {
        kge.a(37221050);
    }

    public void a(String str, flw flwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b6b691", new Object[]{this, str, flwVar});
            return;
        }
        this.f28042a.put(str, flwVar);
        this.b.add(flwVar);
    }

    public List<Event> a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f75ab989", new Object[]{this, str, jSONObject});
        }
        flw flwVar = this.f28042a.get(str);
        if (flwVar == null) {
            return null;
        }
        return flwVar.a(jSONObject);
    }

    public List<Event> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{this, jSONObject});
        }
        for (flw flwVar : this.b) {
            List<Event> a2 = flwVar.a(jSONObject);
            if (a2 != null && a2.size() > 0) {
                return a2;
            }
        }
        return null;
    }
}
