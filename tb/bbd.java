package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class bbd {
    static {
        kge.a(-451617433);
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1893801187);
        }

        public static List a(Map<String, Object> map, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("332400c0", new Object[]{map, str});
            }
            if (map != null && !map.isEmpty() && !TextUtils.isEmpty(str)) {
                Object obj = map.get(str);
                if (obj instanceof List) {
                    return (List) obj;
                }
            }
            return null;
        }

        public static Map<String, Object> b(Map<String, Object> map, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("b3a04afb", new Object[]{map, str});
            }
            if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
                return null;
            }
            Object obj = map.get(str);
            if (!(obj instanceof Map)) {
                return null;
            }
            Map<String, Object> map2 = (Map) obj;
            if (!map2.isEmpty() && !(map2.keySet().iterator().next() instanceof String)) {
                return null;
            }
            return map2;
        }

        public static String c(Map<String, Object> map, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5faf135b", new Object[]{map, str});
            }
            if (map != null && !map.isEmpty() && !TextUtils.isEmpty(str)) {
                Object obj = map.get(str);
                if (obj instanceof String) {
                    return (String) obj;
                }
            }
            return null;
        }

        public static boolean a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && str.matches("^fields.*");
        }

        public static boolean b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && str.matches("^events\\..+\\[.+\\]\\.fields.*");
        }

        public static boolean c(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && str.matches("^.+\\[.+\\]$");
        }

        public static String d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
            }
            if (c(str)) {
                return str.substring(0, str.indexOf(riy.ARRAY_START_STR));
            }
            return null;
        }

        public static int e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1c6cb129", new Object[]{str})).intValue();
            }
            if (!c(str)) {
                return -1;
            }
            try {
                return Integer.valueOf(str.substring(str.indexOf(riy.ARRAY_START_STR) + 1, str.indexOf(riy.ARRAY_END_STR))).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        public static Object a(String str, Map<String, Object> map) {
            List a2;
            int e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("121a1a7f", new Object[]{str, map});
            }
            if (!TextUtils.isEmpty(str) && map != null) {
                String d = d(str);
                if (!TextUtils.isEmpty(d) && (a2 = a(map, d)) != null && (e = e(str)) >= 0 && e <= a2.size()) {
                    return a2.get(e);
                }
            }
            return null;
        }

        public static Object a(String[] strArr, Map<String, Object> map) {
            Object obj;
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("d1eeea04", new Object[]{strArr, map});
            }
            if (strArr == null || map == null) {
                return null;
            }
            Map<String, Object> map2 = map;
            if (strArr.length == 0) {
                return map;
            }
            while (i < strArr.length) {
                try {
                    if (i != strArr.length - 1 && !(map2 instanceof Map)) {
                        return null;
                    }
                    if (c(strArr[i])) {
                        obj = a(strArr[i], map2);
                    } else {
                        obj = map2.get(strArr[i]);
                    }
                    i++;
                    map2 = obj;
                } catch (Exception unused) {
                    return null;
                }
            }
            return map2;
        }

        public static void a(String[] strArr, Map<String, Object> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28c6774a", new Object[]{strArr, map, obj});
            } else if (strArr != null && strArr.length != 0 && map != null) {
                for (int i = 0; i < strArr.length; i++) {
                    if (c(strArr[i])) {
                        String d = d(strArr[i]);
                        List a2 = a(map, d);
                        if (a2 == null) {
                            a2 = new JSONArray();
                            map.put(d, a2);
                        }
                        int e = e(strArr[i]);
                        if (i == strArr.length - 1) {
                            if (e >= 0 && e < a2.size()) {
                                a2.remove(e);
                                a2.add(e, obj);
                            } else {
                                a2.add(obj);
                            }
                        } else if (e >= 0 && e < a2.size()) {
                            if (!(a2.get(e) instanceof Map)) {
                                map = new JSONObject();
                                a2.remove(e);
                                a2.add(e, map);
                            } else {
                                map = (Map) a2.get(e);
                            }
                        } else {
                            map = new JSONObject();
                            a2.add(map);
                        }
                    } else if (i == strArr.length - 1) {
                        map.put(strArr[i], obj);
                    } else {
                        Object b = b(map, strArr[i]);
                        if (b == null) {
                            b = new JSONObject();
                            map.put(strArr[i], b);
                        }
                        map = b;
                    }
                }
            }
        }

        public static Map a(String str, Component component) {
            int e;
            Event event;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("632fbaa1", new Object[]{str, component});
            }
            if (!TextUtils.isEmpty(str) && component != null) {
                if (a(str)) {
                    return component.getFields();
                }
                if (b(str)) {
                    String[] split = str.split("\\.");
                    List<Event> list = component.getEvents().get(d(split[1]));
                    if (list != null && !list.isEmpty() && (e = e(split[1])) >= 0 && e < list.size() && (event = list.get(e)) != null) {
                        return event.getFields();
                    }
                    return null;
                }
            }
            return null;
        }

        public static String[] f(String str) {
            Pattern compile;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("6c230e86", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (a(str)) {
                compile = Pattern.compile("^fields");
            } else {
                compile = b(str) ? Pattern.compile("^events\\..+\\[.+\\]\\.fields") : null;
            }
            if (compile == null) {
                return null;
            }
            Matcher matcher = compile.matcher(str);
            if (!matcher.matches()) {
                return matcher.replaceFirst("").substring(1).split("\\.");
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1298707421);
        }

        public static boolean a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && str.matches("^\\$\\{.+\\}$");
        }

        public static boolean b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && str.matches("^.*\\$\\{.+\\}.*$");
        }

        public static String[] c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("c6428d83", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] strArr = new String[3];
            String str2 = "";
            if (a(str)) {
                strArr[2] = str2;
                strArr[0] = str2;
                strArr[1] = str;
                return strArr;
            } else if (!b(str)) {
                return null;
            } else {
                Matcher matcher = Pattern.compile("\\$\\{.+\\}").matcher(str);
                if (!matcher.find()) {
                    return null;
                }
                int start = matcher.start();
                int end = matcher.end();
                strArr[0] = start > 0 ? str.substring(0, start) : str2;
                strArr[1] = str.substring(start, end);
                if (end < str.length()) {
                    str2 = str.substring(end, str.length());
                }
                strArr[2] = str2;
                return strArr;
            }
        }

        public static String d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
            }
            if (!TextUtils.isEmpty(str)) {
                return str.substring(2, str.length() - 1);
            }
            return null;
        }

        public static void a(Object obj, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            char c = 2;
            char c2 = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe578c1", new Object[]{obj, map});
            } else if (obj != null && map != null && !map.isEmpty()) {
                String str = "";
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    String str2 = entry.getKey() instanceof String ? (String) entry.getKey() : str;
                    Object value = entry.getValue();
                    boolean z = value instanceof String;
                    if (z) {
                        String str3 = (String) value;
                        if (b(str3)) {
                            String[] c3 = c(str3);
                            String str4 = c3[0];
                            String str5 = c3[2];
                            String d = d(c3[1]);
                            if (TextUtils.isEmpty(d)) {
                                a("emptyExpressionPath", str2, str3);
                                return;
                            }
                            Object a2 = b.a(b.f(d), map);
                            if (!TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5)) {
                                if (a2 != null) {
                                    str = a2.toString();
                                }
                                entry.setValue(str4 + str + str5);
                            } else {
                                entry.setValue(a2);
                            }
                            if (a2 != null) {
                                return;
                            }
                            a("nullRealValue", str2, str3);
                            return;
                        }
                    }
                    if ((value instanceof Map) || (value instanceof List)) {
                        a(value, map);
                    } else if (z) {
                        String str6 = (String) value;
                        if (!str6.contains("${")) {
                            return;
                        }
                        a("unknownExpression", str2, str6);
                    }
                } else if (obj instanceof Map) {
                    for (Object obj2 : ((Map) obj).entrySet()) {
                        a(obj2, map);
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    int i = 0;
                    while (i < list.size()) {
                        Object obj3 = list.get(i);
                        boolean z2 = obj3 instanceof String;
                        if (z2) {
                            String str7 = (String) obj3;
                            if (b(str7)) {
                                String[] c4 = c(str7);
                                String str8 = c4[0];
                                String str9 = c4[c];
                                String d2 = d(c4[c2]);
                                if (TextUtils.isEmpty(d2)) {
                                    a("emptyExpressionPath", "arrayIndex", str7);
                                    return;
                                }
                                Object a3 = b.a(b.f(d2), map);
                                if (!TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str9)) {
                                    String obj4 = a3 == null ? str : a3.toString();
                                    list.remove(i);
                                    if (i < list.size()) {
                                        list.add(i, str8 + obj4 + str9);
                                    } else {
                                        list.add(str8 + obj4 + str9);
                                    }
                                } else {
                                    list.remove(i);
                                    if (i < list.size()) {
                                        list.add(i, a3);
                                    } else {
                                        list.add(a3);
                                    }
                                }
                                if (a3 == null) {
                                    a("nullRealValue", "arrayIndex", str7);
                                }
                                i++;
                                c = 2;
                                c2 = 1;
                            }
                        }
                        if ((obj3 instanceof Map) || (obj3 instanceof List)) {
                            a(obj3, map);
                        } else if (z2) {
                            String str10 = (String) obj3;
                            if (str10.contains("${")) {
                                a("unknownExpression", "arrayIndex", str10);
                            }
                        }
                        i++;
                        c = 2;
                        c2 = 1;
                    }
                }
            }
        }

        private static void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
                return;
            }
            UMLinkLogInterface a2 = bpp.a();
            if (a2 == null) {
                return;
            }
            if (a(str3) && str3.lastIndexOf("$") == 0) {
                return;
            }
            a2.logError("AURAMonitor", "AURAPathUtils", "expressionValueMapping", null, str + "_" + str2 + "_" + str3, str + "_" + str2 + "_" + str3, null, null);
            a2.commitFailure("expressionValueMapping", "AURAMonitor", "1.0", "AURAMonitor", "AURAPathUtils", null, str + "_" + str2 + "_" + str3, str + "_" + str2 + "_" + str3);
        }
    }
}
