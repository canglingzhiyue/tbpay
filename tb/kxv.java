package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;

/* loaded from: classes7.dex */
public class kxv implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30385a;
    private JSONObject b;

    static {
        kge.a(1119877394);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 50011;
    }

    public kxv(JSONObject jSONObject, boolean z) {
        this.b = jSONObject;
        this.f30385a = z;
    }

    public static kxv a(JSONObject jSONObject, boolean z) {
        AwesomeGetContainerData awesomeGetContainerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kxv) ipChange.ipc$dispatch("44cdf531", new Object[]{jSONObject, new Boolean(z)});
        }
        if (jSONObject == null) {
            return null;
        }
        boolean equals = StringUtils.equals(jSONObject.getString("_msgType"), "uiRefresh");
        boolean equals2 = StringUtils.equals(jSONObject.getString("dataSourceType"), "remote");
        if (equals && equals2 && (jSONObject.get("containerModel") instanceof AwesomeGetContainerData) && (awesomeGetContainerData = (AwesomeGetContainerData) jSONObject.get("containerModel")) != null && awesomeGetContainerData.getBaseRemind() != null) {
            return new kxv(awesomeGetContainerData.getBaseRemind(), z);
        }
        return null;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.b;
    }
}
