package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes2.dex */
public class bph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1574396229);
    }

    public static JSONObject a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("da29630c", new Object[]{iDMComponent});
        }
        if (iDMComponent != null && iDMComponent.getFields() != null) {
            return iDMComponent.getFields().getJSONObject(DataReceiveMonitor.CB_LISTENER);
        }
        return null;
    }

    public static String a(IDMComponent iDMComponent, String str, String str2) {
        JSONObject fields;
        String string;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea72bda0", new Object[]{iDMComponent, str, str2}) : (iDMComponent == null || str == null || (fields = iDMComponent.getFields()) == null || !fields.containsKey(str) || (string = fields.getString(str)) == null) ? str2 : string;
    }
}
