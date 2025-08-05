package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class qna {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1192883349);
    }

    public static List<ItemCategory> a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3c21fed8", new Object[]{cVar});
        }
        if (cVar == null || cVar.R == null) {
            hit.a("getItemCategoryList");
            return new ArrayList();
        }
        return cVar.R.itemCategoryList;
    }

    public static boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("735816d4", new Object[]{cVar})).booleanValue();
        }
        if (cVar == null) {
            hit.a("isSecSkillNeedLimit");
            return false;
        }
        return cVar.t().secSkillNeedLimit;
    }

    public static JSONObject c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("186df131", new Object[]{cVar});
        }
        if (cVar == null) {
            hit.a("getItemConfigInfo");
            return new JSONObject();
        }
        return cVar.l.c();
    }

    public static String d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f58e858e", new Object[]{cVar});
        }
        if (cVar == null) {
            hit.a("getGLOpenFrom");
            return "";
        }
        return cVar.L.c;
    }

    public static String e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57e99c6d", new Object[]{cVar});
        }
        if (cVar == null) {
            hit.a("getCurrentCreatorid");
            return "";
        }
        return cVar.m();
    }

    public static String f(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba44b34c", new Object[]{cVar});
        }
        if (cVar == null) {
            hit.a("getCurrentLiveRoomstatue");
            return "";
        }
        return cVar.t().roomStatus;
    }

    public static String g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c9fca2b", new Object[]{cVar});
        }
        if (cVar == null) {
            hit.a("getCurrentCategoryId");
            return "";
        }
        return cVar.d;
    }

    public static String a(LiveItem liveItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c472827d", new Object[]{liveItem}) : (liveItem == null || liveItem.itemExtData == null || (jSONObject = liveItem.itemExtData.getJSONObject("itemListTrackData")) == null || TextUtils.isEmpty(jSONObject.getString("smallCardItemType"))) ? "" : jSONObject.getString("smallCardItemType");
    }

    public static JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b36fc2ae", new Object[]{jSONArray});
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return new JSONArray();
        }
        return pqj.c(jSONArray.toJSONString());
    }
}
