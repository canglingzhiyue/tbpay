package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import com.taobao.android.tbabilitykit.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class xpk extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBTRADEJSTRACKERREPORT = -3157506913900501055L;

    static {
        kge.a(1877780569);
    }

    public static /* synthetic */ Object ipc$super(xpk xpkVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlhVar == null || dlhVar.c() == null) {
            return new dla();
        }
        String c = dlhVar.c("type");
        JSONObject a2 = dlhVar.a("commonParams");
        if (a2 == null) {
            return new dla();
        }
        String string = a2.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
        String string2 = a2.getString("pageName");
        String string3 = a2.getString("collectionUrl");
        String string4 = a2.getString("message");
        String string5 = a2.getString("sampling");
        if (c == null || string == null || string2 == null || string3 == null) {
            return new dla();
        }
        if (string4 == null) {
            string4 = "";
        }
        a(c, string, string2, string3, string4, string5, a2, dlhVar);
        return new dla();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, dlh dlhVar) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4aecb5c", new Object[]{this, str, str2, str3, str4, str5, str6, jSONObject, dlhVar});
            return;
        }
        switch (str.hashCode()) {
            case -427040198:
                if (str.equals("reportPV")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -270619340:
                if (str.equals("reportError")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 146281925:
                if (str.equals("reportCustom")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1931173148:
                if (str.equals("reportMtop")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1931248189:
                if (str.equals("reportPerf")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            xpn a2 = xpn.a(str3, str2, str4);
            JSONObject a3 = dlhVar.a(e.ERROR_PARAM);
            if (a3 == null) {
                return;
            }
            String string = a3.getString("errorCode");
            String string2 = a3.getString("fileName");
            a2.d(str5);
            a2.e(string);
            a2.f(string2);
            com.taobao.trade.common.kit.tracker.a.a(a2);
        } else if (c == 1) {
            JSONObject a4 = dlhVar.a("customParams");
            if (a4 == null || a4.isEmpty()) {
                return;
            }
            String string3 = a4.getString("code");
            boolean booleanValue = fxr.a("success", a4, (Boolean) false).booleanValue();
            String a5 = fxr.a("uniqueId", a4, "");
            int a6 = fxr.a("branch", a4, -1);
            xpm a7 = xpm.a(str3, string3, str2, str4);
            a7.a(booleanValue);
            a7.c(str5);
            a7.b(a5);
            a7.a(a6);
            if (!StringUtils.isEmpty(str6)) {
                a7.b(a(str6, 0.001f));
            }
            JSONObject jSONObject2 = a4.getJSONObject("dimensions");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                for (String str7 : jSONObject2.keySet()) {
                    if (!StringUtils.isEmpty(str7)) {
                        a7.a(str7, jSONObject2.getString(str7));
                    }
                }
            }
            JSONObject jSONObject3 = a4.getJSONObject("indicators");
            if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                for (String str8 : jSONObject3.keySet()) {
                    if (!StringUtils.isEmpty(str8)) {
                        a7.b(str8, jSONObject3.getString(str8));
                    }
                }
            }
            com.taobao.trade.common.kit.tracker.a.a(a7);
        } else if (c == 2) {
            JSONObject a8 = dlhVar.a("mtopParams");
            if (a8 == null) {
                return;
            }
            String string4 = a8.getString("api");
            String a9 = fxr.a("timing", a8, "0");
            boolean booleanValue2 = fxr.a("success", a8, (Boolean) false).booleanValue();
            String a10 = fxr.a("traceId", a8, "");
            xpo xpoVar = new xpo(str3, str2, str4, string4, booleanValue2);
            if (!StringUtils.isEmpty(str6)) {
                xpoVar.b(a(str6, 0.001f));
            }
            xpoVar.d(str5);
            xpoVar.a(a(a9, 0));
            xpoVar.c(a10);
            JSONObject jSONObject4 = a8.getJSONObject("params");
            if (jSONObject4 != null && !jSONObject4.isEmpty()) {
                xpoVar.a(a(jSONObject4));
            }
            com.taobao.trade.common.kit.tracker.a.a(xpoVar);
        } else if (c == 3) {
            xpp xppVar = new xpp(str3, str2, str4);
            xppVar.c(str5);
            if (!StringUtils.isEmpty(str6)) {
                xppVar.b(a(str6, 0.001f));
            }
            com.taobao.trade.common.kit.tracker.a.a(xppVar);
        } else if (c == 4) {
            xpq xpqVar = new xpq(str3, str2, str4);
            xpqVar.a(str5);
            if (!StringUtils.isEmpty(str6)) {
                xpqVar.a(a(str6, 0.001f));
            }
            JSONObject a11 = dlhVar.a("perfParams");
            if (a11 != null) {
                String string5 = a11.getString("name");
                if (string5 != null) {
                    xpqVar.c(string5);
                }
                xpqVar.b(a11.getString("uniqueId"));
                JSONObject jSONObject5 = a11.getJSONObject("dimensions");
                if (jSONObject5 != null && !jSONObject5.isEmpty()) {
                    for (String str9 : jSONObject5.keySet()) {
                        if (!StringUtils.isEmpty(str9)) {
                            xpqVar.a(str9, jSONObject5.getString(str9));
                        }
                    }
                }
                JSONArray jSONArray = a11.getJSONArray(NWFullTracePlugin.FullTraceJSParam.STAGES);
                if (!StringUtils.isEmpty(string5) && jSONArray != null && !jSONArray.isEmpty()) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject6 = jSONArray.getJSONObject(i);
                        String string6 = jSONObject6.getString("stageCode");
                        Long l = jSONObject6.getLong("costTimeMills");
                        if (string6 != null && l != null) {
                            xpqVar.a(string6, l.longValue());
                        }
                    }
                }
            }
            com.taobao.trade.common.kit.tracker.a.a(xpqVar);
        }
    }

    public Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    private float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{this, str, new Float(f)})).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return f;
        }
    }

    private int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    /* loaded from: classes9.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1161172528);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public xpk a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (xpk) ipChange.ipc$dispatch("16c32daf", new Object[]{this, obj}) : new xpk();
        }
    }
}
