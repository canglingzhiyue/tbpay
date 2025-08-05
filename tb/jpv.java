package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class jpv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1370620038);
    }

    public static List<IDMComponent> a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c63e14db", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || iDMComponent.getChildren() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
            if (iDMComponent2 != null) {
                arrayList.add(iDMComponent2);
                List<IDMComponent> a2 = a(iDMComponent2);
                if (a2 != null) {
                    arrayList.addAll(a2);
                }
            }
        }
        return arrayList;
    }

    public static boolean a(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bc096ec", new Object[]{iDMComponent, iDMComponent2})).booleanValue();
        }
        if (iDMComponent == null && iDMComponent2 == null) {
            return true;
        }
        if (iDMComponent != null && iDMComponent2 != null) {
            JSONObject fields = iDMComponent.getFields();
            JSONObject fields2 = iDMComponent2.getFields();
            if (fields == null && fields2 == null) {
                return true;
            }
            if (fields != null && fields2 != null && fields.size() == fields2.size()) {
                return fields.toJSONString().equals(fields2.toJSONString());
            }
            return false;
        }
        return false;
    }
}
