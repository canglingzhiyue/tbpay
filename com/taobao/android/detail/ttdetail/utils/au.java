package com.taobao.android.detail.ttdetail.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.eyy;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class au {
    static {
        kge.a(836898587);
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-657774895);
        }

        private static List a(Map<String, Object> map, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("332400c0", new Object[]{map, str});
            }
            if (map != null && !map.isEmpty() && !StringUtils.isEmpty(str)) {
                Object obj = map.get(str);
                if (obj instanceof List) {
                    return (List) obj;
                }
            }
            return null;
        }

        private static Map<String, Object> b(Map<String, Object> map, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("b3a04afb", new Object[]{map, str});
            }
            if (map == null || map.isEmpty() || StringUtils.isEmpty(str)) {
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

        public static boolean a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && str.matches("^fields.*");
        }

        public static boolean b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && str.matches("^events\\..+\\[.+\\]\\.fields.*");
        }

        private static boolean d(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && str.matches("^.+\\[.+\\]$");
        }

        private static String e(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("666b162a", new Object[]{str}) : str.substring(0, str.indexOf(riy.ARRAY_START_STR));
        }

        private static int f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("669e4a6a", new Object[]{str})).intValue();
            }
            try {
                return Integer.valueOf(str.substring(str.indexOf(riy.ARRAY_START_STR) + 1, str.indexOf(riy.ARRAY_END_STR))).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        private static Object a(String str, Map<String, Object> map) {
            List a2;
            int f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("121a1a7f", new Object[]{str, map});
            }
            if (!StringUtils.isEmpty(str) && map != null) {
                String e = e(str);
                if (!StringUtils.isEmpty(e) && (a2 = a(map, e)) != null && (f = f(str)) >= 0 && f <= a2.size()) {
                    return a2.get(f);
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
                    if (d(strArr[i])) {
                        obj = a(strArr[i], map2);
                    } else {
                        obj = map2.get(strArr[i]);
                    }
                    i++;
                    map2 = obj;
                } catch (Throwable unused) {
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
                Map map2 = map;
                for (int i = 0; i < strArr.length; i++) {
                    if (d(strArr[i])) {
                        String e = e(strArr[i]);
                        List a2 = a(map2, e);
                        if (a2 == null) {
                            a2 = new JSONArray();
                            map2.put(e, a2);
                        }
                        int f = f(strArr[i]);
                        if (i == strArr.length - 1) {
                            if (f >= 0 && f < a2.size()) {
                                a2.remove(f);
                                a2.add(f, obj);
                            } else if (f < 0) {
                                a2.add(0, obj);
                            } else {
                                a2.add(obj);
                            }
                        } else if (f < 0 || f >= a2.size()) {
                            if (f < 0) {
                                map2 = new JSONObject();
                                a2.add(0, map2);
                            } else {
                                map2 = new JSONObject();
                                a2.add(map2);
                            }
                        } else if (!(a2.get(f) instanceof Map)) {
                            map2 = new JSONObject();
                            a2.remove(f);
                            a2.add(f, map2);
                        } else {
                            map2 = (Map) a2.get(f);
                        }
                    } else if (i == strArr.length - 1) {
                        map2.put(strArr[i], obj);
                    } else {
                        Map b = b(map2, strArr[i]);
                        if (b == null) {
                            b = new JSONObject();
                            map2.put(strArr[i], b);
                        }
                        map2 = b;
                    }
                }
            }
        }

        public static Map a(String str, eyy eyyVar) {
            int f;
            com.taobao.android.detail.ttdetail.handler.event.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("1de25bb2", new Object[]{str, eyyVar});
            }
            if (!StringUtils.isEmpty(str) && eyyVar != null) {
                if (a(str)) {
                    return eyyVar.d();
                }
                if (b(str)) {
                    String[] split = str.split("\\.");
                    List<com.taobao.android.detail.ttdetail.handler.event.a> a2 = eyyVar.a(e(split[1]));
                    if (a2 != null && !a2.isEmpty() && (f = f(split[1])) >= 0 && f < a2.size() && (aVar = a2.get(f)) != null) {
                        return aVar.b();
                    }
                    return null;
                }
            }
            return null;
        }

        public static String[] c(String str) {
            Pattern compile;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("c6428d83", new Object[]{str});
            }
            if (StringUtils.isEmpty(str)) {
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

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(427319441);
        }

        private static boolean a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && str.matches("^\\$\\{.+\\}$");
        }

        private static boolean b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && str.matches("^.*\\$\\{.+\\}.*$");
        }

        private static String[] c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("c6428d83", new Object[]{str});
            }
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            String[] strArr = new String[3];
            String str2 = "";
            if (a(str)) {
                strArr[2] = str2;
                strArr[0] = str2;
                strArr[1] = str;
                return strArr;
            }
            Matcher matcher = Pattern.compile("\\$\\{.+\\}").matcher(str);
            if (!matcher.find()) {
                return null;
            }
            int start = matcher.start();
            int end = matcher.end();
            strArr[0] = start > 0 ? str.substring(0, start) : str2;
            strArr[1] = str.substring(start, end);
            if (end < str.length()) {
                str2 = str.substring(end);
            }
            strArr[2] = str2;
            return strArr;
        }

        private static String d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
            }
            if (!StringUtils.isEmpty(str)) {
                return str.substring(2, str.length() - 1);
            }
            return null;
        }

        public static void a(Object obj, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
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
                            String[] c = c(str3);
                            String str4 = c[0];
                            String str5 = c[2];
                            String d = d(c[1]);
                            if (StringUtils.isEmpty(d)) {
                                i.a("PathUtils$ExpressionMethods", "emptyMapExpressionPath for: " + value + " with key: " + str2);
                                return;
                            }
                            Object a2 = b.a(b.c(d), map);
                            if (!StringUtils.isEmpty(str4) || !StringUtils.isEmpty(str5)) {
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
                            i.a("PathUtils$ExpressionMethods", "emptyMapExpressionValue for: " + value + " with key: " + str2);
                            return;
                        }
                    }
                    if ((value instanceof Map) || (value instanceof List)) {
                        a(value, map);
                    } else if (z && ((String) value).contains("${")) {
                        i.a("PathUtils$ExpressionMethods", "unknownMapExpression for: " + value + " with key: " + str2);
                    }
                } else if (obj instanceof Map) {
                    for (Object obj2 : ((Map) obj).entrySet()) {
                        a(obj2, map);
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i = 0; i < list.size(); i++) {
                        Object obj3 = list.get(i);
                        boolean z2 = obj3 instanceof String;
                        if (z2) {
                            String str6 = (String) obj3;
                            if (b(str6)) {
                                String[] c2 = c(str6);
                                String str7 = c2[0];
                                String str8 = c2[2];
                                String d2 = d(c2[1]);
                                if (StringUtils.isEmpty(d2)) {
                                    i.a("PathUtils$ExpressionMethods", "emptyArrayExpressionPath for: " + obj3);
                                } else {
                                    Object a3 = b.a(b.c(d2), map);
                                    if (!StringUtils.isEmpty(str7) || !StringUtils.isEmpty(str8)) {
                                        String obj4 = a3 == null ? str : a3.toString();
                                        list.remove(i);
                                        if (i < list.size()) {
                                            list.add(i, str7 + obj4 + str8);
                                        } else {
                                            list.add(str7 + obj4 + str8);
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
                                        i.a("PathUtils$ExpressionMethods", "emptyArrayExpressionValue for: " + obj3);
                                    }
                                }
                            }
                        }
                        if ((obj3 instanceof Map) || (obj3 instanceof List)) {
                            a(obj3, map);
                        } else if (z2 && ((String) obj3).contains("${")) {
                            i.a("PathUtils$ExpressionMethods", "unknownArrayExpression for: " + obj3);
                        }
                    }
                }
            }
        }
    }
}
