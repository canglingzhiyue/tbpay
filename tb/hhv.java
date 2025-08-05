package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.g;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-824469802);
    }

    public static void a(c cVar, DXRuntimeContext dXRuntimeContext, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7327271", new Object[]{cVar, dXRuntimeContext, objArr});
            return;
        }
        int a2 = a(dXRuntimeContext);
        if (objArr.length <= 4) {
            return;
        }
        if (hkk.ac() && (objArr[2] instanceof JSONObject) && hiq.a(dXRuntimeContext.m(), (LiveItem) pqj.a(((JSONObject) objArr[2]).toJSONString(), LiveItem.class))) {
            return;
        }
        String str = (String) objArr[3];
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1436106637) {
            if (hashCode == 82982943 && str.equals("intimacyNav")) {
                c = 0;
            }
        } else if (str.equals("rightCdp")) {
            c = 1;
        }
        if ((c == 0 || c == 1) && (objArr[0] instanceof String) && (objArr[1] instanceof String) && (objArr[2] instanceof JSONObject) && (objArr[4] instanceof String)) {
            a.a().i().a(cVar == null ? null : cVar.C(), dXRuntimeContext.m(), (String) objArr[0], (String) objArr[1], (JSONObject) objArr[2]);
            if (a.a().j() == null) {
                return;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("bannerCount", String.valueOf(a2));
            if (objArr.length > 5 && (objArr[5] instanceof String)) {
                hashMap.put("bizType", (String) objArr[5]);
            }
            if (TextUtils.equals("intimacyNav", str)) {
                a.a().j().a("pocket-bean-click", hashMap);
                return;
            } else if (!TextUtils.equals("rightCdp", str)) {
                return;
            } else {
                a.a().j().a("rightCdp-click", hashMap);
                return;
            }
        }
        b(cVar, dXRuntimeContext, objArr);
    }

    private static void b(c cVar, DXRuntimeContext dXRuntimeContext, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a6af50", new Object[]{cVar, dXRuntimeContext, objArr});
        } else if (objArr == null || objArr.length < 4 || !(objArr[1] instanceof String) || !(objArr[2] instanceof JSONObject) || !(objArr[3] instanceof String)) {
        } else {
            a.a().i().a(cVar == null ? null : cVar.C(), dXRuntimeContext.m(), (String) objArr[0], (String) objArr[1], (JSONObject) objArr[2]);
            if (a.a().j() == null) {
                return;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("bizCode", (String) objArr[3]);
            hashMap.put("componentName", (String) objArr[1]);
            if (objArr.length > 5 && (objArr[5] instanceof JSONObject)) {
                hashMap.putAll(g.a((JSONObject) objArr[5]));
            }
            if (((JSONObject) objArr[2]).getString("itemId") != null) {
                hashMap.putAll(hit.a(cVar, (LiveItem) pqj.a(((JSONObject) objArr[2]).toJSONString(), LiveItem.class)));
            }
            a.a().j().a("gl-openComponent", hashMap);
        }
    }

    public static int a(DXRuntimeContext dXRuntimeContext) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("487cd5cc", new Object[]{dXRuntimeContext})).intValue();
        }
        try {
            JSONObject e = dXRuntimeContext.e();
            if (e.containsKey("rights") && (jSONArray = e.getJSONArray("rights")) != null && jSONArray.size() > 0) {
                i = 1;
            }
            if (e.containsKey("rightCdp")) {
                i++;
            }
            return e.containsKey("intimacyCoin") ? i + 1 : i;
        } catch (Exception unused) {
            return i;
        }
    }
}
