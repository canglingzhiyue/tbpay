package tb;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class xko {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1975543029);
    }

    public static void a(ljs ljsVar, BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4917860", new Object[]{ljsVar, baseSectionModel, jSONObject, map});
        } else if (baseSectionModel == null || jSONObject == null || map == null || !a(ljsVar)) {
        } else {
            String a2 = a(jSONObject);
            long uptimeMillis = SystemClock.uptimeMillis();
            Set<String> a3 = a(a2);
            ldf.d("NdUtParamsFilter", "getNdUtParamsWhiteList use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
            a(ljsVar, map, a3);
        }
    }

    private static boolean a(ljs ljsVar) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2eb5407", new Object[]{ljsVar})).booleanValue() : (ljsVar == null || (d = bxn.d(ljsVar)) == null || !d.getBooleanValue("filterNdUtParam")) ? false : true;
    }

    private static String a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("ext")) != null) {
            return jSONObject2.getString("targetContainer");
        }
        return null;
    }

    private static Set<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("bf40e8a1", new Object[]{str});
        }
        ldf.d("NdUtParamsFilter", "getNdUtParamsWhiteList targetContainer: " + str);
        Set<String> set = null;
        try {
            if (StringUtils.equals("newDetail", str)) {
                set = xjj.b();
            } else if (StringUtils.equals(a.TARGET_TYPE_LITE_DETAIL, str)) {
                set = xjj.a();
            } else {
                ldf.d("NdUtParamsFilter", "未实现目标容器白名单 ： " + str);
            }
        } catch (InfoFlowRuntimeException e) {
            ldf.a("NdUtParamsFilter", "ND 埋点过滤白名单接口异常", e);
        }
        return set;
    }

    private static void a(ljs ljsVar, Map<String, String> map, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e08d55d", new Object[]{ljsVar, map, set});
        } else if (set == null || set.isEmpty()) {
            ldf.d("NdUtParamsFilter", "ND 白名单为空");
        } else {
            ldf.d("NdUtParamsFilter", "执行ND白名单过滤 properties.size: " + map.size() + ", whiteList.size: " + set.size());
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!set.contains(it.next().getKey())) {
                    it.remove();
                }
            }
            if (ljsVar == null || set.contains(ood.HOME_BUCKETS)) {
                return;
            }
            map.put(ood.HOME_BUCKETS, "404");
            Context b = b(ljsVar);
            if (b == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("clearNdHomeBuckets", "true");
            ldl.a(b, hashMap);
            ldf.d("NdUtParamsFilter", "清空home_buckets，并塞入ND过滤标识，让首页的utPlugin过滤");
        }
    }

    private static Context b(ljs ljsVar) {
        IHostService iHostService;
        lkc i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("fb746d7c", new Object[]{ljsVar});
        }
        if (ljsVar != null && (iHostService = (IHostService) ljsVar.a(IHostService.class)) != null && (i = iHostService.getInvokeCallback().i()) != null) {
            return i.b();
        }
        return null;
    }
}
