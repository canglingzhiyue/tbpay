package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class pri {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f32828a = ldj.a("behaviorXDataLimitedSize", 1024);

    static {
        kge.a(-1407147580);
    }

    public Map<String, String> a(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("90b98bdb", new Object[]{this, new Long(j), str, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
        }
        String a2 = xnn.a(j, "home.request.PageBack.zeroIpvRefresh", "BehaviorBizParamsCreator");
        if (a(a2)) {
            ldf.d("BehaviorBizParamsCreator", "behaviorFeature Invalid");
            ldk.a("back_refresh", "backRefreshFailed", "", "Page_Home_BackRefresh", "", null, "createBehaviorBizParamsError", a2);
            return null;
        }
        HashMap hashMap = new HashMap(4);
        if ((z4 || z) && a2.contains("tb_bc_search_query_vstr")) {
            if (z2) {
                if (a2.contains("tb_bc_session_item_click_vstr")) {
                    hashMap.put("zeroRefreshBXFeature", a2);
                    hashMap.put("zeroRefreshBeginCode", str);
                    return hashMap;
                }
                ldf.d("BehaviorBizParamsCreator", "未发生实际点击");
                return hashMap;
            }
            hashMap.put("zeroRefreshBXFeature", a2);
            hashMap.put("zeroRefreshBeginCode", str);
            return hashMap;
        } else if ((z4 || z3) && (a2.contains("tb_bc_item_click_vstr") || a2.contains("tb_bc_session_item_click_vstr"))) {
            hashMap.put("zeroRefreshBXFeature", b(a2));
            hashMap.put("zeroRefreshBeginCode", str);
            return hashMap;
        } else {
            ldf.d("BehaviorBizParamsCreator", "不包含搜索或IPV特征或功能开关未打开：enableOutLinkBackRefresh:" + z4 + " enableSearchBackRefresh:" + z + " enableSearchClickCheck:" + z2 + " enableIpvBackRefresh:" + z3);
            return hashMap;
        }
    }

    public Map<String, String> a(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f8f67311", new Object[]{this, new Long(j), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5), new Boolean(z6)});
        }
        String a2 = xnn.a(j, "home.request.PageBack.zeroIpvRefresh", "BehaviorBizParamsCreator");
        if (a(a2)) {
            ldf.d("BehaviorBizParamsCreator", "behaviorFeature Invalid");
            ldk.a("back_refresh", "backRefreshFailed", "", "Page_Home_BackRefresh", "", null, "createBehaviorBizParamsError", a2);
            return null;
        }
        HashMap hashMap = new HashMap(4);
        if (z5) {
            hashMap.put("isBackToFront", "true");
            return hashMap;
        } else if (z && a2.contains("tb_bc_search_query_vstr")) {
            if (!z2) {
                if (z6) {
                    hashMap.put("needConvertToBase", "true");
                }
                return hashMap;
            }
            if (a2.contains("tb_bc_session_item_click_vstr") && z6) {
                hashMap.put("needConvertToBase", "true");
            }
            return hashMap;
        } else if (z3 && (a2.contains("tb_bc_item_click_vstr") || a2.contains("tb_bc_session_item_click_vstr"))) {
            if (z6) {
                hashMap.put("needConvertToBase", "true");
            }
            return hashMap;
        } else {
            if (z4 && z6) {
                hashMap.put("needConvertToBase", "true");
            }
            return hashMap;
        }
    }

    private String b(String str) {
        JSONObject parseObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (str.contains("tb_bc_search_query_vstr") || (jSONArray = (parseObject = JSONObject.parseObject(str)).getJSONArray("data")) == null) {
            return str;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add("tb_bc_search_query_vstr");
        jSONArray2.add("");
        jSONArray.add(jSONArray2);
        return parseObject.toString();
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            ldf.d("BehaviorBizParamsCreator", "data is empty");
            return true;
        }
        int length = str.toCharArray().length;
        if (length <= this.f32828a) {
            return false;
        }
        ldf.d("BehaviorBizParamsCreator", "数据长度超过最大长度, 数据长度为 : " + length);
        return true;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        String a2 = xnn.a(0L, "home.request.PageBack.zeroIpvRefresh", "BehaviorBizParamsCreator");
        return a2.contains("tb_bc_item_click_vstr") || a2.contains("tb_bc_session_item_click_vstr");
    }
}
