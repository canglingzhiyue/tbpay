package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.trade.event.Event;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class ehs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_EXTRA_EVENT_SRC = "extra_event_src";
    public static final String EVENT_EXTRA_VIEWMODEL = "extra_viewmodel";

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, eht> f27313a;

    static {
        kge.a(1560194024);
        f27313a = new ConcurrentHashMap<>();
        emu.a("com.taobao.android.detail.core.open.event.EventManager");
    }

    public static eht a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eht) ipChange.ipc$dispatch("7c6ecc03", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (f27313a.containsKey(str)) {
            return f27313a.get(str);
        }
        eht ehtVar = new eht();
        f27313a.put(str, ehtVar);
        return ehtVar;
    }

    public static eht a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eht) ipChange.ipc$dispatch("16ba6db1", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        return a(obj.getClass().getSimpleName() + obj.hashCode());
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (StringUtils.isEmpty(str) || !f27313a.containsKey(str)) {
        } else {
            f27313a.get(str).a();
            f27313a.remove(str);
        }
    }

    public static void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{obj});
        } else if (obj == null) {
        } else {
            b(obj.getClass().getSimpleName() + obj.hashCode());
        }
    }

    public static void a(Object obj, eon eonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d650a130", new Object[]{obj, eonVar});
            return;
        }
        eht a2 = a(obj);
        if (a2 == null) {
            return;
        }
        a2.a(eonVar, 5);
    }

    public static Event a(Object obj, ActionModel actionModel, b bVar, JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("4893d71a", new Object[]{obj, actionModel, bVar, jSONObject, map});
        }
        eht a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("activity", obj);
        if ((obj instanceof Context) && actionModel != null) {
            if (!"ut_exposure".equals(actionModel.type) && !"user_track".equals(actionModel.type) && !"locator".equals(actionModel.type)) {
                ecg.b((Context) obj, "Event_" + actionModel.type, actionModel.params);
            }
            HashMap hashMap = new HashMap();
            if (actionModel.params != null) {
                hashMap.put(com.taobao.android.gateway.util.b.KEY_ACTION_PARAM, actionModel.params.toJSONString());
            }
            if (obj instanceof DetailCoreActivity) {
                DetailCoreActivity detailCoreActivity = (DetailCoreActivity) obj;
                if (detailCoreActivity.y() != null && detailCoreActivity.y().t != null) {
                    hashMap.put("itemId", detailCoreActivity.y().t.i());
                }
            }
            eps.a("Page_Detail", "Event_" + actionModel.type, hashMap);
        }
        return a2.a(actionModel, bVar, jSONObject, map);
    }
}
