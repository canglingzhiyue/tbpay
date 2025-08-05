package com.taobao.android.tschedule;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.jkq;
import tb.jmc;
import tb.jme;
import tb.jmf;
import tb.jmg;
import tb.jmh;
import tb.jmi;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REGULAR_EXPRESSION = "@urlRegular.";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f15655a;
    private static String b;
    private static String c;
    private static Map<String, List<ScheduleTask>> d;
    private static Map<String, Uri> e;
    private static List<String> f;

    static {
        kge.a(1234436022);
        d = new ConcurrentHashMap();
        e = new ConcurrentHashMap();
        f = new CopyOnWriteArrayList();
        f15655a = false;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            g.a(str, str2);
        }
    }

    public static void a(String str, ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb84612", new Object[]{str, scheduleTask});
        } else if (TextUtils.isEmpty(str) || scheduleTask == null) {
        } else {
            List<ScheduleTask> list = d.get(str);
            if (list != null) {
                list.remove(scheduleTask);
            }
            if (list != null && !list.isEmpty()) {
                return;
            }
            d.remove(str);
        }
    }

    public static List<ScheduleTask> a(String str) {
        List<ScheduleTask> list;
        Throwable th;
        String c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<ScheduleTask> list2 = d.get(jmi.a(str));
        if (list2 == null && (c2 = c(str)) != null) {
            list2 = d.get(c2);
        }
        if (list2 == null && !f.isEmpty()) {
            for (String str2 : f) {
                try {
                } catch (Throwable th2) {
                    list = list2;
                    th = th2;
                }
                if (jmi.b(str2.substring(12), str)) {
                    list = d.get(str2);
                    try {
                        jkq.a("TS.Config", "getTasks:url正则匹配成功：url=" + str + "\n;regular=" + str2);
                    } catch (Throwable th3) {
                        th = th3;
                        jkq.a("TS.Config", "getTasks:url正则匹配异常, 请检查URL正则表达式配置，regularUrls :" + f);
                        th.printStackTrace();
                        list2 = list;
                    }
                    list2 = list;
                }
            }
        }
        return list2;
    }

    public static synchronized void b(String str) {
        JSONArray jSONArray;
        Uri parse;
        ScheduleTask a2;
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
                return;
            }
            jmf.a("update config");
            if (TextUtils.equals(b, str) && TextUtils.equals(c, jmh.a(jmg.CONFIG_KEY_TRIGGER_NAV_BLACK_LIST, ""))) {
                return;
            }
            g.a();
            jkq.a("TS.Config", "updateConfig=" + str);
            if (TextUtils.isEmpty(str)) {
                d.clear();
                e.clear();
                f.clear();
                b = str;
                c = null;
                return;
            }
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null && !parseObject.isEmpty()) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                HashMap hashMap = new HashMap();
                for (String str2 : parseObject.keySet()) {
                    JSONObject jSONObject = parseObject.getJSONObject(str2);
                    if (jSONObject != null && !jSONObject.isEmpty() && (jSONArray = jSONObject.getJSONArray("tasks")) != null && !jSONArray.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<Object> it = jSONArray.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if ((next instanceof JSONObject) && (a2 = h.a(str2, (JSONObject) next)) != null && b(str2, a2)) {
                                a2.originConfig = (JSONObject) next;
                                arrayList.add(a2);
                                a(str2, a2, hashMap);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("urlFilter");
                            Iterator<Object> it2 = jSONArray2 == null ? null : jSONArray2.iterator();
                            if (it2 == null) {
                                concurrentHashMap.put(str2, arrayList);
                            } else {
                                while (it2.hasNext()) {
                                    String obj = it2.next().toString();
                                    if (!TextUtils.isEmpty(obj)) {
                                        if (obj.startsWith(REGULAR_EXPRESSION)) {
                                            copyOnWriteArrayList.add(obj);
                                            concurrentHashMap.put(obj, arrayList);
                                        } else {
                                            if (obj.indexOf("?") > 0 && (parse = Uri.parse(obj)) != null) {
                                                concurrentHashMap2.put(obj, parse);
                                            }
                                            concurrentHashMap.put(obj, arrayList);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                d = concurrentHashMap;
                e = concurrentHashMap2;
                b = str;
                f = copyOnWriteArrayList;
                c = jmh.a(jmg.CONFIG_KEY_TRIGGER_NAV_BLACK_LIST, "");
                a(hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("configs", d.toString());
                hashMap2.put("queryPath", e.toString());
                hashMap2.put("regularUrls", f.toString());
                jmc.a("downgrade", "update_config", "1", "TSchedule", "orangeConfig", hashMap2, "update_config", "config size :" + d.size());
                jmf.a("update config", new String[0]);
                return;
            }
            d.clear();
            e.clear();
            f.clear();
            b = str;
            c = null;
        }
    }

    private static void a(String str, ScheduleTask scheduleTask, Map<String, String> map) {
        RenderTaskContext.RenderParams renderParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70866f33", new Object[]{str, scheduleTask, map});
        } else if (scheduleTask == null || !(scheduleTask.taskContext instanceof RenderTaskContext) || (renderParams = ((RenderTaskContext) scheduleTask.taskContext).params) == null || renderParams.staticData == null) {
        } else {
            map.put(str, renderParams.staticData);
        }
    }

    private static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (e.j().c() && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                jme a2 = jme.a();
                String b2 = a2.b(key + jme.CDN_SUFFIX);
                if (value != null && value.equals(b2) && jme.a().a(b2)) {
                    jkq.a("TS.Config", "预渲染bizKey对应的CDN地址没变，且本地有已有该CDN的内容，不需要重新下载。bizKey = " + key);
                } else {
                    jkq.a("TS.Config", "下载预渲染静态资源。bizKey = " + key + ";cdn = " + value);
                    jme.a().d(b2);
                    jme a3 = jme.a();
                    a3.a(key + jme.CDN_SUFFIX, value);
                    jme.a().c(value);
                }
            }
        }
    }

    private static boolean b(String str, ScheduleTask scheduleTask) {
        List<String> d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e3f957", new Object[]{str, scheduleTask})).booleanValue();
        }
        if (("navBefore".equals(scheduleTask.taskContext.trigger) || "navAfter".equals(scheduleTask.taskContext.trigger)) && (d2 = jmh.d()) != null && d2.contains(str)) {
            jkq.a("TS.Config", "bizKey=" + str + "的导航类型task在黑名单里，被过滤");
            return false;
        }
        if ("idle".equals(scheduleTask.taskContext.trigger)) {
            List<String> c2 = jmh.c();
            if (c2 == null) {
                jkq.a("TS.Config", "闲时白名单为空，bizKey=" + str + "被过滤");
                return false;
            } else if (!c2.contains(str)) {
                jkq.a("TS.Config", "bizKey=" + str + "的闲时类型task不在白名单里，被过滤");
                return false;
            }
        }
        return true;
    }

    private static String c(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (str != null) {
            try {
                if (str.contains("?")) {
                    Uri parse = Uri.parse(str);
                    String a2 = jmi.a(str);
                    for (String str2 : e.keySet()) {
                        String a3 = jmi.a(str2);
                        if (a2 == null || a3 == null || a2.equals(a3)) {
                            Uri uri = e.get(str2);
                            if (uri.getQuery() != null) {
                                Iterator<String> it = uri.getQueryParameterNames().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = true;
                                        break;
                                    }
                                    String next = it.next();
                                    if (!TextUtils.equals(uri.getQueryParameter(next), parse.getQueryParameter(next))) {
                                        z = false;
                                        break;
                                    }
                                }
                                if (z) {
                                    return str2;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                jkq.a("TS.Config", "getQueryPath error", th);
            }
        }
        return null;
    }

    public static Map<String, List<ScheduleTask>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : d;
    }
}
