package com.alibaba.android.ultron.engine.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.bpi;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f2573a;
    private static Pattern b;

    public static void a(JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d50990", new Object[]{jSONObject, jSONObject2, jSONArray});
        } else if (jSONObject == null || jSONObject2 == null || jSONArray == null) {
        } else {
            if (jSONObject2.containsKey("componentsVO")) {
                jSONObject2 = jSONObject2.getJSONObject("componentsVO");
            }
            try {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        String string = ((JSONObject) next).getString("sourceConstantData");
                        String string2 = ((JSONObject) next).getString("sourcePath");
                        String string3 = ((JSONObject) next).getString("targetPath");
                        if (string3 != null) {
                            if (string3.startsWith("componentsVO.")) {
                                string3 = string3.replace("componentsVO.", "");
                            }
                            a(jSONObject, string, string2, jSONObject2, string3);
                        }
                    }
                }
            } catch (Exception e) {
                UnifyLog.d("DataUtils", "mergeVOData exception: " + bpi.a(e));
            }
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2, JSONObject jSONObject2, String str3) {
        Map<? extends String, ? extends Object> map;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861e0e9e", new Object[]{jSONObject, str, str2, jSONObject2, str3});
            return;
        }
        if (str != null) {
            map = str;
        } else {
            String[] split = str2.split("\\.");
            if (split != null) {
                Object obj = jSONObject;
                for (int i2 = 0; i2 < split.length && (obj instanceof JSONObject); i2++) {
                    String str4 = split[i2];
                    String[] a2 = a(str4);
                    if (a2 != null) {
                        JSONArray jSONArray = ((JSONObject) obj).getJSONArray(a2[0]);
                        if (jSONArray == null) {
                            break;
                        }
                        try {
                            obj = jSONArray.get(Integer.parseInt(a2[1]));
                        } catch (Exception e) {
                            UnifyLog.d("DataUtils", "get jsonArray exception: " + e.getMessage());
                        }
                    } else if (!StringUtils.isEmpty(str4)) {
                        obj = ((JSONObject) obj).get(str4);
                    }
                }
                map = obj;
            } else {
                map = jSONObject;
                if (!StringUtils.isEmpty(str2)) {
                    map = jSONObject.get(str2);
                }
            }
        }
        String[] split2 = str3.split("\\.");
        for (int i3 = 0; i3 < split2.length - 1; i3++) {
            String str5 = split2[i3];
            String[] a3 = a(str5);
            if (a3 != null) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray(a3[0]);
                if (jSONArray2 == null) {
                    jSONArray2 = new JSONArray();
                    jSONObject2.put(a3[0], (Object) jSONArray2);
                }
                try {
                    i = Integer.parseInt(a3[1]);
                } catch (Exception e2) {
                    UnifyLog.d("DataUtils", "get jsonArray exception: " + e2.getMessage());
                    i = 0;
                }
                if (i > jSONArray2.size() - 1) {
                    if (i == jSONArray2.size() - 1) {
                        jSONObject2 = new JSONObject();
                        jSONArray2.add(jSONObject2);
                    } else {
                        UnifyLog.d("DataUtils", "插入输入index超过本身size");
                        return;
                    }
                } else {
                    JSONObject jSONObject3 = (JSONObject) jSONArray2.get(i);
                    if (jSONObject3 == null) {
                        jSONObject3 = new JSONObject();
                        jSONArray2.add(i, jSONObject3);
                    }
                    jSONObject2 = jSONObject3;
                }
            } else {
                JSONObject jSONObject4 = jSONObject2.getJSONObject(str5);
                if (jSONObject4 == null) {
                    jSONObject4 = new JSONObject();
                    jSONObject2.put(split2[i3], (Object) jSONObject4);
                }
                jSONObject2 = jSONObject4;
            }
        }
        if (split2.length > 0) {
            jSONObject2.put(split2[split2.length - 1], (Object) map);
            UnifyLog.c("DataUtils", "merge data: " + split2[split2.length - 1] + "->" + map);
        } else if (!StringUtils.isEmpty(str3)) {
            jSONObject2.put(str3, (Object) map);
            UnifyLog.c("DataUtils", "merge data: " + str3 + "->" + map);
        } else if (map instanceof Map) {
            jSONObject2.putAll(map);
            UnifyLog.c("DataUtils", "merge all data: " + map);
        }
    }

    static {
        kge.a(-1572279882);
        f2573a = "(^.+)\\[([0-9]+)\\]";
        b = Pattern.compile("(^.+)\\[([0-9]+)\\]");
    }

    private static String[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{str});
        }
        Matcher matcher = b.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return new String[]{matcher.group(1), matcher.group(2)};
    }
}
