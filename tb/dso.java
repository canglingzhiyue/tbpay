package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.task.BehaviXTaskType;
import com.taobao.android.behavix.task.a;
import com.taobao.android.behavix.task.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class dso extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, Object> f;

    static {
        kge.a(-433176152);
    }

    public static /* synthetic */ Object ipc$super(dso dsoVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public dso(BehaviXTaskType behaviXTaskType, Map<String, Object> map, b bVar) {
        super(behaviXTaskType, map, bVar);
        drp drpVar;
        this.f = new HashMap();
        if (map == null || (drpVar = (drp) map.get("baseNode")) == null || drpVar.x == null) {
            return;
        }
        this.f.putAll(drpVar.x);
    }

    @Override // com.taobao.android.behavix.task.a
    public void a() {
        drp drpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (this.d == null || (drpVar = (drp) this.d.get("baseNode")) == null) {
            return;
        }
        a(drpVar);
    }

    public void a(drp drpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b3edf6", new Object[]{this, drpVar});
            return;
        }
        String format = String.format("behavior.%s.%s.%s", drpVar.h, drpVar.d, drpVar.i);
        Map<String, Object> map = this.f;
        if (map == null || map.size() == 0) {
            return;
        }
        com.taobao.android.behavix.adapter.b.a().a(format, new JSONObject(this.f));
    }
}
