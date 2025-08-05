package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;

/* loaded from: classes8.dex */
public class qoa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1004270770);
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27c3b8", new Object[]{dVar});
        } else if (dVar == null) {
        } else {
            try {
                Event y = dVar.y();
                String str = dVar.x().indexID;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prePopId", (Object) str);
                if (y != null && y.source == 5) {
                    jSONObject.put("prePopIdType", (Object) "PopHub");
                } else {
                    jSONObject.put("prePopIdType", (Object) "PopLayer");
                }
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(jSONObject.toJSONString());
            } catch (Throwable th) {
                String a2 = d.a(dVar);
                c.a("containerLifeCycle", a2, "UCPTrackManager.addNextPageUtParam.error.t=" + th.getLocalizedMessage());
                cab.a("UCPTrackManager.addNextPageUtParam.error.", th);
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("prePopId", (Object) str);
            jSONObject.put("prePopIdType", (Object) "PopHub");
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(jSONObject.toJSONString());
        } catch (Throwable th) {
            c.a("containerLifeCycle", str, "UCPTrackManager.addNextPageUtParam.error.t=" + th.getLocalizedMessage());
            cab.a("UCPTrackManager.addNextPageUtParam.error.", th);
        }
    }
}
