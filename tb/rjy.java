package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.wireless.link.model.ActivityIdTime;
import com.taobao.wireless.link.model.ActivityOutTime;
import com.taobao.wireless.link.mtop.a;
import com.taobao.wireless.link.mtop.c;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rjy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-381873502);
    }

    public static /* synthetic */ void a(Context context, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05861c0", new Object[]{context, map, map2});
        } else {
            b(context, map, map2);
        }
    }

    public static void a(Context context, Map<String, String> map, rjz rjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09a4813", new Object[]{context, map, rjzVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ActivityIdTime d = rjw.d(context);
        if (d.activities == null) {
            rkg.a("link_tag", "EquityCenter === callEquity === 获取到的过期时间配置为空，不请求接口");
            return;
        }
        for (ActivityOutTime activityOutTime : d.activities) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                String key = next.getKey();
                String value = next.getValue();
                if (TextUtils.equals(activityOutTime.id, key)) {
                    if (rjw.a(activityOutTime.outTime)) {
                        if (TextUtils.equals(value, "true")) {
                            arrayList.add(key);
                        }
                    } else {
                        it.remove();
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            if (rjzVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("local", "true");
                rjzVar.a(false, hashMap);
            }
            rkg.a("link_tag", "EquityCenter === callEquity === 没有需要请求的id=" + arrayList);
            return;
        }
        rkg.a("link_tag", "EquityCenter === callEquity === 请求接口list=" + arrayList);
        a(context, arrayList, map, rjzVar);
    }

    private static void b(Context context, Map<String, Object> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c65c2d1f", new Object[]{context, map, map2});
            return;
        }
        if (map != null && map.size() > 0) {
            Set<String> keySet = map.keySet();
            if (keySet.size() > 0) {
                for (String str : keySet) {
                    for (String str2 : map2.keySet()) {
                        if (TextUtils.equals(str, str2)) {
                            map2.put(str2, (String) map.get(str));
                        }
                    }
                }
            }
        }
        rjw.a(rkk.a(context), map2, rjw.a(context));
        rkg.a("link_tag", "EquityCenter === refreshActivityId === 更新后的id集合" + map2.toString());
    }

    public static void a(final Context context, List<String> list, final Map<String, String> map, final rjz rjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c727c02", new Object[]{context, list, map, rjzVar});
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("activityId", a(list));
        hashMap.put("uid", Login.getUserId());
        hashMap.put("utdid", UTDevice.getUtdid(context));
        hashMap.put("ext", rju.a().d == null ? "" : JSON.toJSONString(rju.a().d));
        rkg.a("link_tag", "EquityCenter === callEquity2Server === 请求参数" + hashMap.toString());
        final String a2 = rju.a().a(context);
        a.a().a(a.ASSISTANT_API, "1.0", hashMap, false, false, false, new c() { // from class: tb.rjy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.wireless.link.mtop.c
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                    return;
                }
                rkg.a("link_tag", "EquityCenter === callEquity2Server: onSuccess：" + jSONObject);
                try {
                    Map<String, Object> a3 = rkj.a(jSONObject);
                    rjy.a(context, a3, map);
                    if (rjzVar != null) {
                        rjzVar.a(true, a3);
                    }
                } catch (Exception e) {
                    rkg.a("link_tag", "EquityCenter === callEquity2Server: onSuccess：解析返回数据异常=" + e.getMessage());
                }
                rki.a(rki.ARG1_ASSISTANT_REQUEST_SUCCESS, a2, hashMap.toString(), new HashMap());
            }

            @Override // com.taobao.wireless.link.mtop.c
            public void a(JSONObject jSONObject, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b6e96a0", new Object[]{this, jSONObject, str});
                    return;
                }
                rkg.b("link_tag", "EquityCenter === callEquity2Server: onError：" + jSONObject + " === retMsg=" + str);
                rjz rjzVar2 = rjzVar;
                if (rjzVar2 != null) {
                    rjzVar2.a(false, new HashMap());
                }
                rki.a(rki.ARG1_ASSISTANT_REQUEST_FAIL, a2, hashMap.toString(), new HashMap());
            }
        });
    }

    private static String a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{list});
        }
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
            sb.append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
