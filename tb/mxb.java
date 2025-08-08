package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.base.f;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import com.taobao.mytaobao.homepage.busniess.acds.DealInfo;
import com.taobao.mytaobao.ut.c;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class mxb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_UT_EXPOSURE_EVENT = "userTrack";

    static {
        kge.a(2138842824);
    }

    public static void a(IDMComponent iDMComponent, f fVar) {
        List<b> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3526725e", new Object[]{iDMComponent, fVar});
        } else if (iDMComponent != null && fVar != null && (a2 = a(iDMComponent, "percentExposureItem")) != null) {
            for (b bVar : a2) {
                String type = bVar.getType();
                if (!StringUtils.isEmpty(type)) {
                    e a3 = fVar.a().a(type);
                    a3.a(iDMComponent);
                    a3.e("percentExposureItem");
                    a3.a(bVar);
                    if (bVar.getFields() != null && bVar.getFields().containsKey("args")) {
                        bVar.getFields().getJSONObject("args").put("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
                    }
                    fVar.a(a3);
                }
            }
        }
    }

    private static List<b> a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f02ee0d1", new Object[]{iDMComponent, str});
        }
        Map<String, List<b>> eventMap = iDMComponent.getEventMap();
        if (eventMap == null) {
            return null;
        }
        return eventMap.get(str);
    }

    public static void b(b bVar) {
        JSONObject fields;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeda3d38", new Object[]{bVar});
        } else if (bVar != null && (fields = bVar.getFields()) != null) {
            try {
                i = fields.getInteger("eventId").intValue();
            } catch (Exception unused) {
                i = -1;
            }
            if (i < 0) {
                return;
            }
            String string = fields.getString("page");
            if (!StringUtils.isEmpty(string)) {
                String string2 = fields.getString("arg1");
                String string3 = fields.getString("arg2");
                String string4 = fields.getString("arg3");
                String str = "";
                String str2 = StringUtils.isEmpty(string3) ? str : string3;
                if (!StringUtils.isEmpty(string4)) {
                    str = string4;
                }
                JSONObject jSONObject = fields.getJSONObject("args");
                HashMap hashMap = new HashMap();
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!StringUtils.isEmpty(key) && value != null) {
                            hashMap.put(key, String.valueOf(value));
                        }
                    }
                }
                try {
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, i, string2, str2, str, hashMap).build());
                } catch (Throwable unused2) {
                }
            }
            JSONObject jSONObject2 = fields.getJSONObject("nextPage");
            if (jSONObject2 == null) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                String key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if (!StringUtils.isEmpty(key2) && value2 != null) {
                    hashMap2.put(key2, String.valueOf(value2));
                }
            }
            try {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap2);
            } catch (Throwable unused3) {
            }
        }
    }

    public static void a(DealInfo dealInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c6bcc7", new Object[]{dealInfo});
        } else if (dealInfo == null) {
        } else {
            if (a(dealInfo.toPayBiz, 0) != 0) {
                c.c("Page_MyTaobao", "Page_MyTaobao_Show-OrderNumber", c.a("a2141.7631743.3.51", (String) null, (String) null, (Map<String, String>) null));
            }
            if (a(dealInfo.hasPaid, 0) != 0) {
                c.c("Page_MyTaobao", "Page_MyTaobao_Show-OrderNumber", c.a("a2141.7631743.3.52", (String) null, (String) null, (Map<String, String>) null));
            }
            if (a(dealInfo.toConfirmBiz, 0) != 0) {
                c.c("Page_MyTaobao", "Page_MyTaobao_Show-OrderNumber", c.a("a2141.7631743.3.53", (String) null, (String) null, (Map<String, String>) null));
            }
            if (a(dealInfo.toComment, 0) != 0) {
                c.c("Page_MyTaobao", "Page_MyTaobao_Show-OrderNumber", c.a("a2141.7631743.3.54", (String) null, (String) null, (Map<String, String>) null));
            }
            if (a(dealInfo.refundBiz, 0) == 0) {
                return;
            }
            c.c("Page_MyTaobao", "Page_MyTaobao_Show-OrderNumber", c.a("a2141.7631743.3.55", (String) null, (String) null, (Map<String, String>) null));
        }
    }

    private static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
