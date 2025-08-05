package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;

/* loaded from: classes.dex */
public class ktv extends kts {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(44247082);
    }

    public ktv(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // tb.kts
    public Object a(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6bbc6f25", new Object[]{this, str, strArr}) : UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty(str);
    }

    @Override // tb.kts
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            TLog.loge("UTBizParamsCollector", "UTBizParams bind error");
        }
    }
}
