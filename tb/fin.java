package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class fin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALLBACK = "callback";
    public static final String EVENT_KEY = "eventKey";
    public static final String EVENT_PARAMS = "params";
    public static final String UNIQID = "uniqueId";

    /* renamed from: a  reason: collision with root package name */
    private static flv f27976a;

    static {
        kge.a(760135630);
        flv flvVar = new flv();
        f27976a = flvVar;
        flvVar.a("item", new fhc());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0160, code lost:
        if (r0.equals(tb.fik.OPERATE_FEED_CACHE) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.taobao.android.trade.event.Event> a(java.lang.String r8, com.alibaba.fastjson.JSONObject r9) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fin.a(java.lang.String, com.alibaba.fastjson.JSONObject):java.util.List");
    }

    public static List<Event> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c9355ab7", new Object[]{jSONArray}) : a(jSONArray, (d) null);
    }

    public static List<Event> a(JSONArray jSONArray, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("db9790a1", new Object[]{jSONArray, dVar});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            jSONObject.put(EVENT_KEY, (Object) jSONObject.getString("type"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            if (jSONObject2 != null) {
                jSONObject2.put("VerticalItemNode", (Object) dVar);
            }
            jSONObject.put("params", (Object) jSONObject2);
            List<Event> a2 = a("", jSONObject);
            if (a2 != null) {
                arrayList.addAll(a2);
            }
        }
        return arrayList;
    }
}
