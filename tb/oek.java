package tb;

import android.content.Context;
import android.graphics.PointF;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;

/* loaded from: classes8.dex */
public class oek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1467003320);
    }

    public static oeg a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oeg) ipChange.ipc$dispatch("165c6ec5", new Object[]{context, jSONObject}) : a(null, context, 0, jSONObject);
    }

    public static oeg a(ab abVar, Context context, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oeg) ipChange.ipc$dispatch("d3f8708f", new Object[]{abVar, context, new Integer(i), jSONObject});
        }
        if (context == null && abVar != null) {
            context = abVar.l();
        }
        aa aaVar = null;
        if (abVar != null) {
            aaVar = abVar.a(i);
        }
        aa aaVar2 = aaVar;
        oeg oegVar = new oeg();
        if (jSONObject != null) {
            oegVar.f31970a = jSONObject.getLongValue("duration");
            oegVar.b = jSONObject.getLongValue("delay");
            oegVar.c = jSONObject.getBooleanValue("needLayout");
            oegVar.d = a(abVar, i, jSONObject.get("id"));
            oegVar.e = jSONObject.getIntValue(a.ATOM_EXT_repeat);
            oegVar.f = a(jSONObject.getString("type"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("styles");
            if (jSONObject2 != null) {
                oegVar.h = a(aaVar2, context, jSONObject2);
            }
            oegVar.g = a(aaVar2, context, jSONObject.getJSONArray("keyframes"), oegVar.f31970a, oegVar.f);
            oegVar.i = jSONObject.getLongValue("completeduration");
            JSONObject jSONObject3 = jSONObject.getJSONObject("complete");
            if (jSONObject3 != null) {
                oegVar.j = a(aaVar2, context, jSONObject3);
            }
        }
        return oegVar;
    }

    private static List<oej> a(aa aaVar, Context context, JSONArray jSONArray, long j, oei oeiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ede8f3c6", new Object[]{aaVar, context, jSONArray, new Long(j), oeiVar});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            oej oejVar = new oej();
            Object obj = jSONObject.get("start");
            if (obj != null) {
                oejVar.b = oec.b(obj, 0);
                oejVar.f31973a = (int) (oejVar.b * ((float) j));
            } else {
                oejVar.b = i / jSONArray.size();
                oejVar.f31973a = (int) (oejVar.b * ((float) j));
            }
            Object obj2 = jSONObject.get("duration");
            if (obj2 != null) {
                oejVar.c = oec.a(obj2, 0);
            } else {
                oejVar.c = ((float) j) / jSONArray.size();
            }
            oejVar.e = a(aaVar, context, jSONObject.getJSONObject("styles"));
            String string = jSONObject.getString("type");
            if (string != null) {
                oejVar.d = a(string);
            } else {
                oejVar.d = oeiVar;
            }
            arrayList.add(oejVar);
        }
        return arrayList;
    }

    private static int a(ab abVar, int i, Object obj) {
        aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ce62f03", new Object[]{abVar, new Integer(i), obj})).intValue();
        }
        if (obj == null) {
            return 0;
        }
        int a3 = oec.a(obj, 0);
        if (a3 > 0) {
            return a3;
        }
        if (abVar == null || !(obj instanceof String)) {
            return 0;
        }
        if (i == 0) {
            a2 = abVar.A();
        } else {
            a2 = abVar.a(i);
        }
        ArrayList arrayList = new ArrayList();
        a2.a((String) obj, (List<aa>) arrayList);
        if (arrayList.isEmpty()) {
            return -1;
        }
        return arrayList.get(0).E();
    }

    public static oei a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oei) ipChange.ipc$dispatch("7c734b21", new Object[]{str});
        }
        oei oeiVar = new oei();
        if (StringUtils.isEmpty(str)) {
            str = "linear";
        }
        for (String str2 : str.split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
            char c = 65535;
            switch (str2.hashCode()) {
                case -1965120668:
                    if (str2.equals("ease-in")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1269900391:
                    if (str2.equals("flip-from-right")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1164332978:
                    if (str2.equals("flip-from-bottom")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1102672091:
                    if (str2.equals("linear")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934531685:
                    if (str2.equals(a.ATOM_EXT_repeat)) {
                        c = 6;
                        break;
                    }
                    break;
                case -789192465:
                    if (str2.equals("ease-out")) {
                        c = 2;
                        break;
                    }
                    break;
                case -595336470:
                    if (str2.equals("flip-from-left")) {
                        c = 7;
                        break;
                    }
                    break;
                case -361990811:
                    if (str2.equals("ease-in-out")) {
                        c = 4;
                        break;
                    }
                    break;
                case -19196398:
                    if (str2.equals("flip-from-top")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3105774:
                    if (str2.equals("ease")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1099846370:
                    if (str2.equals(a.ATOM_EXT_reverse)) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    oeiVar.f31972a = str2;
                    break;
                case 5:
                    oeiVar.d = true;
                    break;
                case 6:
                    oeiVar.c = true;
                    break;
                case 7:
                case '\b':
                case '\t':
                case '\n':
                    oeiVar.b = str2;
                    break;
            }
        }
        return oeiVar;
    }

    private static oeh a(aa aaVar, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oeh) ipChange.ipc$dispatch("186f67fc", new Object[]{aaVar, context, jSONObject});
        }
        oeh oehVar = new oeh();
        oehVar.e = oec.b(jSONObject.get("opacity"), -1);
        oehVar.d = a(aaVar, context, jSONObject.getString("center"), true, ',');
        oehVar.c = a(aaVar, context, jSONObject.getString("centerOffset"), true, ',');
        Object obj = jSONObject.get("backgroundColor");
        if (obj != null) {
            oehVar.f = odx.a(context, 2, obj);
        }
        String string = jSONObject.getString("borderRadius");
        if (!StringUtils.isEmpty(string)) {
            oehVar.g = ohd.a(aaVar, context, string);
        }
        String string2 = jSONObject.getString("width");
        if (!StringUtils.isEmpty(string2)) {
            oehVar.f31971a = ohd.a(aaVar, context, string2);
        }
        String string3 = jSONObject.getString("height");
        if (!StringUtils.isEmpty(string3)) {
            oehVar.b = ohd.a(aaVar, context, string3);
        }
        Object obj2 = jSONObject.get("transform");
        if (obj2 != null) {
            oehVar.h = a(aaVar, context, obj2);
        }
        return oehVar;
    }

    public static ofg a(aa aaVar, Context context, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ofg) ipChange.ipc$dispatch("63375942", new Object[]{aaVar, context, obj});
        }
        if (obj == null) {
            return null;
        }
        ofg ofgVar = new ofg();
        if (obj instanceof String) {
            if (obj.equals("none")) {
                ofgVar.c = 0.0f;
                ofgVar.d = new PointF(1.0f, 1.0f);
                ofgVar.e = new PointF(0.0f, 0.0f);
            } else {
                for (String str2 : oec.b((String) obj, ',')) {
                    String trim = str2.trim();
                    int indexOf = trim.indexOf(riy.BRACKET_START_STR);
                    String substring = trim.substring(0, indexOf);
                    try {
                        str = trim.substring(indexOf + 1, trim.length() - 1);
                    } catch (Exception e) {
                        ogg.b("fail to parse " + trim + " error " + e.getMessage());
                        str = null;
                    }
                    if (str != null) {
                        char c = 65535;
                        int hashCode = substring.hashCode();
                        if (hashCode != -925180581) {
                            if (hashCode != 109250890) {
                                if (hashCode == 1052832078 && substring.equals("translate")) {
                                    c = 1;
                                }
                            } else if (substring.equals("scale")) {
                                c = 0;
                            }
                        } else if (substring.equals("rotate")) {
                            c = 2;
                        }
                        if (c == 0) {
                            ofgVar.d = a(aaVar, context, str, false, ' ');
                        } else if (c == 1) {
                            ofgVar.e = a(aaVar, context, str, true, ' ');
                        } else if (c == 2) {
                            ofgVar.c = oec.a((Object) str, 0);
                        }
                    }
                }
            }
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.containsKey("rotate")) {
                ofgVar.c = jSONObject.getFloatValue("rotate");
            }
            if (jSONObject.containsKey("rotateX")) {
                ofgVar.f31986a = jSONObject.getFloatValue("rotateX");
            }
            if (jSONObject.containsKey("rotateY")) {
                ofgVar.b = jSONObject.getFloatValue("rotateY");
            }
            String string = jSONObject.getString("scale");
            if (!StringUtils.isEmpty(string)) {
                ofgVar.d = a(aaVar, context, string, false, ',');
            }
            String string2 = jSONObject.getString("translate");
            if (!StringUtils.isEmpty(string2)) {
                ofgVar.e = a(aaVar, context, string2, true, ',');
            }
            String string3 = jSONObject.getString("translation");
            if (!StringUtils.isEmpty(string3)) {
                ofgVar.e = a(aaVar, context, string3, true, ',');
            }
            String string4 = jSONObject.getString("translation.x");
            if (!StringUtils.isEmpty(string4)) {
                if (ofgVar.e == null) {
                    ofgVar.e = new PointF();
                }
                ofgVar.e.x = ohd.a(aaVar, context, string4);
            }
            String string5 = jSONObject.getString("translation.y");
            if (!StringUtils.isEmpty(string5)) {
                if (ofgVar.e == null) {
                    ofgVar.e = new PointF();
                }
                ofgVar.e.y = ohd.a(aaVar, context, string5);
            }
        }
        return ofgVar;
    }

    private static PointF a(aa aaVar, Context context, String str, boolean z, char c) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("8a78d022", new Object[]{aaVar, context, str, new Boolean(z), new Character(c)});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            PointF pointF = new PointF();
            if (c == ' ') {
                split = oec.a(str.trim(), ' ');
            } else {
                split = str.replaceAll(" ", "").split(",");
            }
            if (split.length == 1) {
                if (z) {
                    float a2 = ohd.a(aaVar, context, split[0]);
                    pointF.y = a2;
                    pointF.x = a2;
                } else {
                    float parseFloat = Float.parseFloat(split[0]);
                    pointF.y = parseFloat;
                    pointF.x = parseFloat;
                }
            } else if (split.length >= 2) {
                if (z) {
                    pointF.x = ohd.a(aaVar, context, split[0]);
                    pointF.y = ohd.a(aaVar, context, split[1]);
                } else {
                    pointF.x = Float.parseFloat(split[0]);
                    pointF.y = Float.parseFloat(split[1]);
                }
            }
            return pointF;
        } catch (Exception unused) {
            ogg.b("string2Point:" + str + " is Invalid");
            return null;
        }
    }
}
