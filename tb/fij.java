package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;

/* loaded from: classes5.dex */
public class fij implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALLBACK_EVENT_KEY = "callbackEventKey";
    public static final String CALLBACK_IS_SUCCESS = "callbackIsSuccess";
    public Object f;
    public a g;
    public String h;
    public JSONObject i;

    /* loaded from: classes5.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    static {
        kge.a(274897157);
        kge.a(-1834561497);
    }

    public fij(Object obj) {
        this.f = obj;
    }

    public fij(Object obj, JSONObject jSONObject) {
        this.f = obj;
        if (jSONObject == null) {
            return;
        }
        this.h = jSONObject.getString(fin.EVENT_KEY);
        this.i = jSONObject.getJSONObject("params");
        Object obj2 = jSONObject.get("callback");
        if (obj2 == null) {
            return;
        }
        this.g = (a) obj2;
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue() : fil.a(getClass(), this.f);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.i;
    }
}
