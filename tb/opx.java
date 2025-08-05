package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class opx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<a> f32271a;

    /* loaded from: classes8.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    static {
        kge.a(1565738040);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        List<a> list = this.f32271a;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (a aVar : this.f32271a) {
            aVar.a(jSONObject);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61cc7ca4", new Object[]{this, aVar});
            return;
        }
        if (this.f32271a == null) {
            this.f32271a = new CopyOnWriteArrayList();
        }
        this.f32271a.add(aVar);
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba7e6e5", new Object[]{this, aVar});
            return;
        }
        List<a> list = this.f32271a;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }
}
