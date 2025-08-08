package com.taobao.tao.flexbox.layoutmanager.filter;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONLexer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.af;
import com.taobao.tao.flexbox.layoutmanager.core.e;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.tao.flexbox.layoutmanager.core.y;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import tb.bip;
import tb.kge;
import tb.odx;
import tb.oea;
import tb.oec;
import tb.ogf;
import tb.ogg;
import tb.sku;

/* loaded from: classes8.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface b {
        void a(String str, Object obj);

        Object b(String str);
    }

    static {
        kge.a(861529859);
    }

    private static Object a(boolean z, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("be54f58e", new Object[]{new Boolean(z), obj, obj2}) : z ? obj : obj2;
    }

    @FilterHandler(name = "isAndroid")
    public static boolean isAndroid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3c387f0", new Object[0])).booleanValue();
        }
        return true;
    }

    @FilterHandler(name = "isIOS")
    public static boolean isIOS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b55918e", new Object[0])).booleanValue();
        }
        return false;
    }

    @FilterHandler(name = "isNull")
    public static boolean isNull(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a65fffb8", new Object[]{obj})).booleanValue() : obj == null;
    }

    @FilterHandler(name = "keys")
    public static Set<String> keys(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("5b98c746", new Object[]{obj});
        }
        if (!(obj instanceof Map)) {
            return null;
        }
        return ((Map) obj).keySet();
    }

    @FilterHandler(name = "hasKey")
    public static boolean hasKey(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2997b416", new Object[]{obj, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || !(obj instanceof Map)) {
            return false;
        }
        return ((Map) obj).containsKey(str);
    }

    @FilterHandler(name = "objectForKey")
    public static Object objectForKey(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d73ba3d0", new Object[]{obj, str});
        }
        if (!StringUtils.isEmpty(str) && (obj instanceof Map)) {
            Map map = (Map) obj;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        return null;
    }

    @FilterHandler(name = "objectForKeyPath")
    public static Object objectForKeyPath(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e47b9ab", new Object[]{obj, str});
        }
        List<String> b2 = oec.b(str, '.');
        int size = b2.size();
        Object obj2 = obj;
        for (int i = 0; i < size && obj2 != null; i++) {
            String str2 = b2.get(i);
            List<String> b3 = oec.b(str2, '[');
            int size2 = b3.size();
            if (1 == size2) {
                if (obj2 instanceof Map) {
                    obj2 = ((Map) obj2).get(str2);
                }
                obj2 = null;
            } else {
                if (obj2 instanceof Map) {
                    List list = (List) ((Map) obj2).get(str2.substring(0, str2.indexOf(91)));
                    Object obj3 = obj2;
                    for (int i2 = 1; i2 < size2; i2++) {
                        int parseInt = Integer.parseInt(b3.get(i2).substring(0, b3.get(i2).length() - 1));
                        if (list == null || list.isEmpty() || parseInt >= list.size()) {
                            return null;
                        }
                        obj3 = list.get(parseInt);
                    }
                    obj2 = obj3;
                }
                obj2 = null;
            }
        }
        return obj2;
    }

    private static int[] a(Map map) {
        int a2;
        int a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("ee003267", new Object[]{map});
        }
        if (map.containsKey("width")) {
            a2 = oec.a(map.get("width"), 0);
        } else if (map.containsKey("picWidth")) {
            a2 = oec.a(map.get("picWidth"), 0);
        } else {
            a2 = map.containsKey("imageWidth") ? oec.a(map.get("imageWidth"), 0) : 0;
        }
        if (map.containsKey("height")) {
            a3 = oec.a(map.get("height"), 0);
        } else if (map.containsKey("picHeight")) {
            a3 = oec.a(map.get("picHeight"), 0);
        } else {
            a3 = map.containsKey("imageHeight") ? oec.a(map.get("imageHeight"), 0) : 0;
        }
        return new int[]{a2, a3};
    }

    private static int a(Map map, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c51b6236", new Object[]{map, obj, str})).intValue();
        }
        int intValue = Integer.valueOf(String.valueOf(obj)).intValue();
        if (map == null) {
            return 0;
        }
        int[] a2 = a(map);
        int i = a2[0];
        int i2 = a2[1];
        if (i <= 0 || i2 <= 0) {
            return 0;
        }
        return str.equalsIgnoreCase("height") ? (int) (((intValue * i2) / i) + 0.5d) : (int) (((intValue * i) / i2) + 0.5d);
    }

    @FilterHandler(name = "imageHeight")
    public static int imageHeight(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eac91a14", new Object[]{obj, obj2})).intValue();
        }
        if (!(obj instanceof Map)) {
            return 0;
        }
        return a((Map) obj, obj2, "height");
    }

    @FilterHandler(name = "imageWidth")
    public static int imageWidth(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99f39bdd", new Object[]{obj, obj2})).intValue();
        }
        if (!(obj instanceof Map)) {
            return 0;
        }
        return a((Map) obj, obj2, "width");
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_flatMap)
    public static Map flatMap(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f84af33b", new Object[]{obj});
        }
        if (!(obj instanceof Map)) {
            return null;
        }
        Map map = (Map) obj;
        Set<String> keySet = map.keySet();
        JSONObject jSONObject = new JSONObject();
        for (String str : keySet) {
            Object obj2 = map.get(str);
            if (obj2 != null && (obj2 instanceof Map)) {
                jSONObject.putAll((Map) obj2);
            }
        }
        return jSONObject;
    }

    @FilterHandler(name = "parseEmotion")
    public static String parseEmotion(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90c2bb99", new Object[]{obj, obj2});
        }
        return obj instanceof String ? ogf.a(String.valueOf(obj), oec.a(obj2, 25)) : "";
    }

    @FilterHandler(name = "toJSONString")
    public static String toJSONString(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57f6b409", new Object[]{obj});
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).toJSONString();
        }
        if (obj instanceof JSONArray) {
            return ((JSONArray) obj).toJSONString();
        }
        if (obj == null) {
            return null;
        }
        return JSON.toJSONString(obj);
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_parseFloat)
    public static float parseFloat(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8c56b3c", new Object[]{obj})).floatValue() : oec.b(obj, 0);
    }

    @FilterHandler(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_parseInt)
    public static Object parseInt(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("21d7e133", new Object[]{obj});
        }
        if (obj instanceof Number) {
            return obj;
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (Exception unused) {
                return Long.valueOf(oec.a(obj, 0L));
            }
        }
        return 0;
    }

    @FilterHandler(name = "toString")
    public static String toString(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cf5fa71", new Object[]{obj});
        }
        if ((obj instanceof JSONObject) || (obj instanceof JSONArray) || !(obj instanceof String)) {
            return null;
        }
        return obj.toString();
    }

    @FilterHandler(name = "parseJSON")
    public static JSON parseJSON(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("37b5409d", new Object[]{obj});
        }
        try {
            if (!(obj instanceof String)) {
                return null;
            }
            return JSON.parseObject((String) obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        return (obj instanceof Boolean) && (obj2 instanceof Boolean) && ((Boolean) obj).booleanValue() == ((Boolean) obj2).booleanValue();
    }

    private static boolean b(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a4eaa425", new Object[]{obj, obj2})).booleanValue() : (obj instanceof Number) && (obj2 instanceof Number) && ((Number) obj).floatValue() == ((Number) obj2).floatValue();
    }

    @FilterHandler(name = "isEqual")
    public static boolean isEqual(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeea4fed", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (obj != null || obj2 != null) {
            if ((obj instanceof Number) || (obj2 instanceof Number)) {
                if (obj == null) {
                    obj = 0;
                }
                if (obj2 == null) {
                    obj2 = 0;
                }
                return b(obj, obj2);
            } else if ((obj instanceof Boolean) || (obj2 instanceof Boolean)) {
                return a(obj, obj2);
            } else {
                try {
                    if (obj != null) {
                        return obj.equals(obj2);
                    }
                    if (obj2 != null) {
                        return obj2.equals(obj);
                    }
                } catch (Exception e) {
                    ogg.a("isEqual", e.getMessage());
                }
            }
        }
        return false;
    }

    @FilterHandler(name = "option")
    public static Object option(Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4fef5122", new Object[]{obj, obj2, obj3}) : a(oec.a(obj, false), obj2, obj3);
    }

    @FilterHandler(name = "opt")
    public static Object opt(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("82517c00", new Object[]{obj, obj2}) : oec.a(obj, false) ? obj : obj2;
    }

    @FilterHandler(name = "formatCount")
    public static String formatCount(Object obj) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("698b9005", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        long parseLong = Long.parseLong(obj.toString());
        if (parseLong < 10000) {
            return String.valueOf(parseLong);
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = (int) (parseLong / 10000);
        int i3 = (int) ((parseLong % 10000) / 1000);
        if (((int) ((parseLong % 1000) / 100)) >= 5) {
            i = i3 + 1;
            if (i > 9) {
                i2++;
                i = 0;
            }
        } else {
            i = i3;
        }
        stringBuffer.append(i2);
        if (i >= 0) {
            stringBuffer.append(".");
            stringBuffer.append(i);
        }
        stringBuffer.append("万");
        return stringBuffer.toString();
    }

    @FilterHandler(name = "isNotEmpty")
    public static boolean isNotEmpty(Object obj) {
        boolean isEmpty;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a57a32b", new Object[]{obj})).booleanValue();
        }
        if (obj instanceof Map) {
            isEmpty = ((Map) obj).isEmpty();
        } else if (obj instanceof List) {
            isEmpty = ((List) obj).isEmpty();
        } else if (!(obj instanceof String)) {
            return obj != null;
        } else {
            isEmpty = StringUtils.isEmpty((String) obj);
        }
        return !isEmpty;
    }

    @FilterHandler(name = "isEmpty")
    public static boolean isEmpty(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fcaeceaa", new Object[]{obj})).booleanValue() : !isNotEmpty(obj);
    }

    @FilterHandler(name = "converToVideoModel")
    public static JSONObject converToVideoModel(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9230860d", new Object[]{obj});
        }
        JSONObject jSONObject = null;
        if (obj != null && (obj instanceof JSONObject)) {
            JSONObject jSONObject2 = (JSONObject) obj;
            jSONObject = new JSONObject();
            jSONObject.put(sku.KEY_VIDEO_TYPE, (Object) "1");
            jSONObject.put("src", (Object) jSONObject2.getString("videoPath"));
            jSONObject.put("cover", (Object) jSONObject2.getString("path"));
            jSONObject.put("feedId", (Object) jSONObject2.getString("feedId"));
            jSONObject.put("mode", (Object) "mute");
            if (jSONObject2.containsKey("bizCode")) {
                jSONObject.put("bizCode", (Object) jSONObject2.getString("bizCode"));
            } else {
                jSONObject.put("bizCode", (Object) "WEITAO");
            }
            jSONObject.put("videoId", (Object) jSONObject2.getString("videoId"));
            if (jSONObject2.containsKey("interactiveId")) {
                jSONObject.put("interactiveId", (Object) jSONObject2.getString("interactiveId"));
            }
            if (jSONObject2.containsKey("spmCnt")) {
                jSONObject.put("spm-cnt", (Object) jSONObject2.getString("spmCnt"));
            }
            if (jSONObject2.containsKey("userId")) {
                jSONObject.put("userId", (Object) jSONObject2.getString("userId"));
            }
            jSONObject.put(sku.KEY_VIDEO_SOURCE, (Object) "TBVideo");
            jSONObject.put("isSimpleLayer", (Object) jSONObject2.getString("isSimpleLayer"));
            jSONObject.put("bizId", (Object) jSONObject2.getString("WEITAO"));
        }
        return jSONObject;
    }

    @FilterHandler(name = "compareVersion")
    public static int compareVersion(String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9bbef41", new Object[]{str, str2})).intValue();
        }
        List<String> b2 = oec.b(str, '.');
        List<String> b3 = oec.b(str2, '.');
        int size = b2.size();
        int size2 = b3.size();
        for (int i2 = 0; i < size && i2 < size2; i2++) {
            try {
                int i3 = (Long.parseLong(b2.get(i)) > Long.parseLong(b3.get(i)) ? 1 : (Long.parseLong(b2.get(i)) == Long.parseLong(b3.get(i)) ? 0 : -1));
                if (i3 > 0) {
                    return 1;
                }
                if (i3 < 0) {
                    return -1;
                }
                i++;
            } catch (Exception unused) {
                return 1;
            }
        }
        return size - size2;
    }

    @FilterHandler(name = "urlJoin")
    public static String urlJoin(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c56eafa", new Object[]{str, obj});
        }
        if (!(obj instanceof Map)) {
            return str;
        }
        Map map = (Map) obj;
        StringBuilder sb = new StringBuilder(str);
        if (sb.indexOf("?") == -1) {
            sb.append("?");
        }
        for (Map.Entry entry : map.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    @FilterHandler(name = "deepCopy")
    public static JSON deepCopy(JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("91ed5f46", new Object[]{json});
        }
        if (json instanceof JSONObject) {
            return JSON.parseObject(json.toJSONString());
        }
        return JSON.parseArray(json.toJSONString());
    }

    @FilterHandler(name = "isSupportedComponent")
    public static boolean isSupportedComponent(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("30ce9ea0", new Object[]{obj})).booleanValue() : e.c(obj.toString());
    }

    @FilterHandler(name = "filter")
    public static JSONArray filter(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("78489227", new Object[]{obj, obj2});
        }
        JSONArray jSONArray = new JSONArray();
        if (obj != null && obj2 != null && (obj instanceof List) && (obj2 instanceof String)) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                Object obj3 = null;
                try {
                    obj3 = com.taobao.tao.flexbox.layoutmanager.expression.b.a((String) obj2, list.get(i));
                } catch (Exception unused) {
                    ogg.b("filter", obj2 + "  failed with value " + list.get(i).toString());
                }
                if (oec.a(obj3, false)) {
                    jSONArray.add(list.get(i));
                }
            }
        }
        return jSONArray;
    }

    @FilterHandler(name = "playerHeight")
    public static int getScaleSize(Object obj, Object obj2, Object obj3, Object obj4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("534ca51f", new Object[]{obj, obj2, obj3, obj4})).intValue();
        }
        int a2 = oec.a(obj, 0);
        int a3 = oec.a(obj2, 0);
        int a4 = oec.a(obj3, 0);
        int a5 = oec.a(obj4, 0);
        if (a2 > 0 && a3 > 0 && a4 > 0 && a5 > 0) {
            return Math.min((a4 * a3) / a2, a5);
        }
        return 0;
    }

    @FilterHandler(name = "themeColor")
    public static int themeColor(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bfa5030", new Object[]{obj})).intValue();
        }
        if (obj == null) {
            return 0;
        }
        return odx.a(obj);
    }

    @FilterHandler(name = "copy")
    public static Object copy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("25a997da", new Object[]{obj});
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj);
        }
        return obj instanceof List ? new JSONArray((List) obj) : obj;
    }

    @FilterHandler(name = "exp")
    public static Object exp(String str, Object obj, y yVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e365ea6d", new Object[]{str, obj, yVar}) : l.a(str, obj, yVar);
    }

    @FilterHandler(name = "env")
    public static JSONObject env(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2570715b", new Object[]{abVar});
        }
        if (abVar != null) {
            return oea.b(abVar.l());
        }
        return oea.b();
    }

    @FilterHandler(name = bip.REQUEST_ONCE)
    public static Object once(y yVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4c5a6845", new Object[]{yVar, str, obj});
        }
        if (yVar != null && !StringUtils.isEmpty(str) && (yVar instanceof b)) {
            b bVar = (b) yVar;
            Object b2 = bVar.b(str);
            if (b2 != null) {
                return b2;
            }
            bVar.a(str, obj);
        }
        return obj;
    }

    @FilterHandler(name = "transitionColor")
    public static String transitionColor(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fae67c9", new Object[]{str, str2, new Float(f)});
        }
        if (a(str) || a(str2)) {
            return "";
        }
        if (str.length() == 7) {
            StringBuilder sb = new StringBuilder(str);
            sb.insert(1, "ff");
            str = sb.toString();
        }
        if (str2.length() == 7) {
            StringBuilder sb2 = new StringBuilder(str2);
            sb2.insert(1, "ff");
            str2 = sb2.toString();
        }
        int parseInt = Integer.parseInt(str.substring(1, 3), 16);
        int parseInt2 = Integer.parseInt(str.substring(3, 5), 16);
        int parseInt3 = Integer.parseInt(str.substring(5, 7), 16);
        int parseInt4 = Integer.parseInt(str.substring(7), 16);
        int parseInt5 = Integer.parseInt(str2.substring(1, 3), 16);
        int parseInt6 = Integer.parseInt(str2.substring(3, 5), 16);
        int parseInt7 = Integer.parseInt(str2.substring(5, 7), 16);
        int parseInt8 = (int) (((Integer.parseInt(str2.substring(7), 16) - parseInt4) * f) + parseInt4);
        return "#" + a((int) (((parseInt5 - parseInt) * f) + parseInt)) + a((int) (((parseInt6 - parseInt2) * f) + parseInt2)) + a((int) (((parseInt7 - parseInt3) * f) + parseInt3)) + a(parseInt8);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        String hexString = Integer.toHexString(i);
        if (hexString.length() != 1) {
            return hexString;
        }
        return "0" + hexString;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str == null || !(str.length() == 7 || str.length() == 9);
    }

    public static Object a(y yVar, String str, String str2, List list) {
        IpChange ipChange = $ipChange;
        char c = 4;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("25bab26", new Object[]{yVar, str, str2, list});
        }
        try {
            switch (str2.hashCode()) {
                case -1999577330:
                    if (str2.equals("transitionColor")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case -1833406949:
                    if (str2.equals("parseJSON")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1776922004:
                    if (str2.equals("toString")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1658364683:
                    if (str2.equals("objectForKey")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1450494677:
                    if (str2.equals("imageWidth")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1441169947:
                    if (str2.equals("isAndroid")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1274492040:
                    if (str2.equals("filter")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224452763:
                    if (str2.equals("hasKey")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1180261935:
                    if (str2.equals("isNull")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1010136971:
                    if (str2.equals("option")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -1003958423:
                    if (str2.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_parseFloat)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -809782598:
                    if (str2.equals("objectForKeyPath")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -778842333:
                    if (str2.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_flatMap)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -745365046:
                    if (str2.equals("converToVideoModel")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -581260440:
                    if (str2.equals("playerHeight")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -292069703:
                    if (str2.equals("isSupportedComponent")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case -170473671:
                    if (str2.equals("urlJoin")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 100589:
                    if (str2.equals("env")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case 100893:
                    if (str2.equals("exp")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 110259:
                    if (str2.equals("opt")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 3059573:
                    if (str2.equals("copy")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 3288564:
                    if (str2.equals("keys")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3415681:
                    if (str2.equals(bip.REQUEST_ONCE)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3601339:
                    if (str2.equals("uuid")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case 100468355:
                    if (str2.equals("isIOS")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 523239194:
                    if (str2.equals("themeColor")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 628017793:
                    if (str2.equals("deepCopy")) {
                        c = JSONLexer.EOI;
                        break;
                    }
                    c = 65535;
                    break;
                case 705281576:
                    if (str2.equals("parseEmotion")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 759061892:
                    if (str2.equals("isNotEmpty")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 949492787:
                    if (str2.equals("compareVersion")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187783740:
                    if (str2.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_parseInt)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1432603480:
                    if (str2.equals("formatCount")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 1846310498:
                    if (str2.equals("imageHeight")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2058039875:
                    if (str2.equals("isEmpty")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 2058163242:
                    if (str2.equals("isEqual")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 2079347668:
                    if (str2.equals("toJSONString")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (Throwable th) {
            ogg.a("utils.filter", "error:" + str2 + th.getMessage());
        }
        switch (c) {
            case 0:
                return once(yVar, str, list.get(0));
            case 1:
                return keys(list.get(0));
            case 2:
                return Boolean.valueOf(hasKey(list.get(0), (String) list.get(1)));
            case 3:
                return objectForKey(list.get(0), (String) list.get(1));
            case 4:
                return objectForKeyPath(list.get(0), (String) list.get(1));
            case 5:
                return Integer.valueOf(imageHeight(list.get(0), list.get(1)));
            case 6:
                return Integer.valueOf(imageWidth(list.get(0), list.get(1)));
            case 7:
                return flatMap(list.get(0));
            case '\b':
                return parseEmotion(list.get(0), list.get(1));
            case '\t':
                return toJSONString(list.get(0));
            case '\n':
                return Float.valueOf(parseFloat(list.get(0)));
            case 11:
                return parseInt(list.get(0));
            case '\f':
                return toString(list.get(0));
            case '\r':
                return parseJSON(list.get(0));
            case 14:
                return Boolean.valueOf(isNull(list.get(0)));
            case 15:
                return Boolean.valueOf(isEqual(list.get(0), list.get(1)));
            case 16:
                return option(list.get(0), list.get(1), list.get(2));
            case 17:
                return opt(list.get(0), list.get(1));
            case 18:
                return formatCount(list.get(0));
            case 19:
                return Boolean.valueOf(isNotEmpty(list.get(0)));
            case 20:
                return Boolean.valueOf(isEmpty(list.get(0)));
            case 21:
                return Boolean.valueOf(isAndroid());
            case 22:
                return Boolean.valueOf(isIOS());
            case 23:
                return converToVideoModel(list.get(0));
            case 24:
                return Integer.valueOf(compareVersion((String) list.get(0), (String) list.get(1)));
            case 25:
                return urlJoin((String) list.get(0), list.get(1));
            case 26:
                return deepCopy((JSON) list.get(0));
            case 27:
                return Boolean.valueOf(isSupportedComponent(list.get(0)));
            case 28:
                return filter(list.get(0), list.get(1));
            case 29:
                return Integer.valueOf(getScaleSize(list.get(0), list.get(1), list.get(2), list.get(3)));
            case 30:
                return Integer.valueOf(themeColor(list.get(0)));
            case 31:
                return copy(list.get(0));
            case ' ':
                return transitionColor((String) list.get(0), (String) list.get(1), oec.b(list.get(2), 1));
            case '!':
                if (list.size() > 1 && (list.get(1) instanceof y)) {
                    return exp(str, list.get(0), (y) list.get(1));
                }
                ogg.b("$.utils.exp args length < 2");
                return "";
            case '\"':
                ab abVar = null;
                if (list.size() > 0 && (list.get(0) instanceof af)) {
                    abVar = ((af) list.get(0)).h();
                }
                return env(abVar);
            case '#':
                return UUID.randomUUID().toString();
            default:
                return "";
        }
    }

    /* loaded from: classes8.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Object> f20397a;

        static {
            kge.a(232251192);
            kge.a(-1424308304);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            } else if (StringUtils.isEmpty(str) || obj == null) {
            } else {
                if (this.f20397a == null) {
                    this.f20397a = new HashMap();
                }
                this.f20397a.put(str, obj);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.filter.Utils.b
        public Object b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str});
            }
            if (this.f20397a != null && !StringUtils.isEmpty(str)) {
                return this.f20397a.get(str);
            }
            return null;
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cefaeed9", new Object[]{this, aVar});
                return;
            }
            Map<String, Object> map = aVar != null ? aVar.f20397a : null;
            if (map == null || map.isEmpty()) {
                return;
            }
            if (this.f20397a == null) {
                this.f20397a = new HashMap();
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!this.f20397a.containsKey(key)) {
                    this.f20397a.put(key, value);
                }
            }
        }
    }
}
