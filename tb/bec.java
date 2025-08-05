package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class bec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1656651974);
    }

    public static void a(jny jnyVar, String str, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a31cfe", new Object[]{jnyVar, str, list});
        } else if (jqf.a(((b) jnyVar).z()) && str != null && str.startsWith("cartCalculateGlobal") && list != null) {
            HashMap hashMap = new HashMap();
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null) {
                    JSONObject fields = iDMComponent.getFields();
                    if (fields.getBooleanValue("canExpand")) {
                        List<com.taobao.android.ultron.common.model.b> list2 = iDMComponent.getEventMap().get("popExpandClick");
                        String str2 = null;
                        if (list2 != null) {
                            Iterator<com.taobao.android.ultron.common.model.b> it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                com.taobao.android.ultron.common.model.b next = it.next();
                                if ("popExpandClick".equals(next.getType())) {
                                    str2 = next.getFields().getString("calculatePopGroupName");
                                    break;
                                }
                            }
                            if (str2 != null) {
                                hashMap.put(str2, fields.getBoolean("isExpanded"));
                            }
                        }
                    } else {
                        Boolean bool = (Boolean) hashMap.get(fields.getString("calculatePopGroupName"));
                        if (bool != null) {
                            if (bool.booleanValue()) {
                                bei.e(iDMComponent);
                            } else {
                                bei.d(iDMComponent);
                            }
                        }
                    }
                }
            }
        }
    }
}
