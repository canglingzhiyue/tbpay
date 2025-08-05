package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.event.a;
import com.taobao.android.behavir.solution.f;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.j;
import com.taobao.android.testutils.log.LogUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class dqz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BHREvent b;
    public BHRTaskConfigBase c;
    public JSONObject d;
    private WeakReference<a> e;
    private final f f;

    static {
        kge.a(1068454032);
        kge.a(-1248226333);
    }

    public abstract void a();

    public dqz(BHRTaskConfigBase bHRTaskConfigBase, BHREvent bHREvent) {
        this.c = bHRTaskConfigBase;
        this.b = bHREvent;
        this.d = this.c.getTaskInfo();
        this.f = new f(bHREvent, bHRTaskConfigBase);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a();
        }
    }

    public a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b3828e0b", new Object[]{this});
        }
        WeakReference<a> weakReference = this.e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void c(Map<String, Object> map) {
        BHRTaskConfigBase bHRTaskConfigBase;
        Map<String, String> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else if (!d()) {
            LogUtils.c(LogUtils.BR_BIZ_NAME, "BHRTask", "dispatchInternalEvent isEnableInternalEvent is false.");
        } else {
            a f = f();
            if (f == null || (bHRTaskConfigBase = this.c) == null) {
                return;
            }
            BHREvent buildInternalEvent = BHREvent.buildInternalEvent(bHRTaskConfigBase.getConfigName(), this.c.getTaskType(), "");
            buildInternalEvent.bizArgsMap = a(this.c);
            if (map != null && !map.isEmpty() && (d = j.d(map)) != null) {
                buildInternalEvent.bizArgsMap.putAll(d);
            }
            f.a(buildInternalEvent);
        }
    }

    public f g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("6a6e5bb0", new Object[]{this}) : this.f;
    }

    private Map<String, String> a(BHRTaskConfigBase bHRTaskConfigBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("35a5c2d8", new Object[]{this, bHRTaskConfigBase});
        }
        JSONObject taskInfo = bHRTaskConfigBase.getTaskInfo();
        HashMap hashMap = new HashMap();
        if (taskInfo != null && !taskInfo.isEmpty()) {
            for (Map.Entry<String, Object> entry : taskInfo.entrySet()) {
                String str = "br_" + entry.getKey();
                Object value = entry.getValue();
                hashMap.put(str, value == null ? "" : value.toString());
            }
        }
        return hashMap;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a.d.a("enableInternalEvent", true, true);
    }
}
