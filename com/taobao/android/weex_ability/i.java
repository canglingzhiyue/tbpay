package com.taobao.android.weex_ability;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.alibaba.ha.bizerrorreporter.module.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class i implements com.taobao.android.weex_framework.adapter.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, List<JSONObject>> f15924a = new HashMap();
    private Map<Integer, JSONObject> c = new HashMap();
    private Map<Integer, JSONObject> b = new ConcurrentHashMap();
    private final String d = "versionInfo";

    static {
        kge.a(1672900038);
        kge.a(-1801095900);
    }

    @Override // com.taobao.android.weex_framework.adapter.i
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        String str = map.get("page_url");
        String str2 = map.get(com.taobao.android.weex_framework.adapter.i.KEY_CRASH_INFO_JS_VERSION);
        String str3 = map.get("using_new_weex");
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        if (TextUtils.isEmpty(str)) {
            crashCaughtHeader.addHeaderInfo("wx2_current_url", "default");
        } else {
            crashCaughtHeader.addHeaderInfo("wx2_current_url", str);
        }
        crashCaughtHeader.addHeaderInfo(com.taobao.android.weex_framework.adapter.i.KEY_CRASH_INFO_JS_VERSION, str2);
        crashCaughtHeader.addHeaderInfo("using_new_weex", str3);
    }

    @Override // com.taobao.android.weex_framework.adapter.i
    public void a(int i, String str, String str2, String str3, String str4, WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a28ae1", new Object[]{this, new Integer(i), str, str2, str3, str4, weexInstanceImpl});
            return;
        }
        try {
            String str5 = str + "_" + str2;
            if (TextUtils.isEmpty(str)) {
                str5 = str2;
            }
            if (!a(i, str, str2)) {
                return;
            }
            a a2 = a(i, str3, str4, str5);
            a2.d = a(weexInstanceImpl.getBundleUrl());
            a2.j = weexInstanceImpl.getBundleUrl();
            a2.g = "new";
            WeexValue weexValue = weexInstanceImpl.getInstanceInfo().get("js_version_info");
            if (weexValue != null && weexValue.isString()) {
                a2.e = weexValue.getString();
            }
            if ("EGL_1010".equals(str)) {
                TLog.loge("Weex/Exception/" + weexInstanceImpl.getInstanceId(), "WHITE_SCREEN", a());
            }
            if (this.f15924a != null && this.f15924a.get(Integer.valueOf(weexInstanceImpl.getInstanceId())) != null && (10018 == i || 10034 == i)) {
                if (a2.i == null) {
                    a2.i = new HashMap();
                }
                List<JSONObject> list = this.f15924a.get(Integer.valueOf(weexInstanceImpl.getInstanceId()));
                TreeSet treeSet = new TreeSet(new Comparator<String>() { // from class: com.taobao.android.weex_ability.i.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.Comparator
                    public /* synthetic */ int compare(String str6, String str7) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, str6, str7})).intValue() : a(str6, str7);
                    }

                    public int a(String str6, String str7) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("d9378d6f", new Object[]{this, str6, str7})).intValue() : str6.compareTo(str7);
                    }
                });
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    JSONObject jSONObject = list.get(i2);
                    treeSet.add(jSONObject.getString(WXExceptionConfig.KEY_GROUP_KEY));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(jSONObject.getString("exceptionId"), (Object) (jSONObject.getString(WXExceptionConfig.KEY_GROUP_KEY) + "|" + jSONObject.getString("msg")));
                    jSONArray.add(jSONObject2);
                }
                Iterator it = treeSet.iterator();
                String str6 = "";
                while (it.hasNext()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str6);
                    sb.append((String) it.next());
                    sb.append(it.hasNext() ? "|" : "");
                    str6 = sb.toString();
                }
                a2.i.put(WXExceptionConfig.KEY_INNER_INFO, jSONArray.toJSONString());
                a2.i.put(WXExceptionConfig.KEY_GROUP_KEY, str6);
                a2.i.put("instanceType", "new");
                this.f15924a.remove(Integer.valueOf(weexInstanceImpl.getInstanceId()));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(WXExceptionConfig.KEY_INNER_INFO, (Object) jSONArray);
                jSONObject3.put(WXExceptionConfig.KEY_GROUP_KEY, (Object) str6);
                TLog.loge("Weex/Exception/" + weexInstanceImpl.getInstanceId(), "WHITE_SCREEN", jSONObject3.toJSONString());
            }
            a2.l = Thread.currentThread();
            com.alibaba.ha.bizerrorreporter.e.a().a(weexInstanceImpl.getContext(), a2);
        } catch (Throwable th) {
            com.taobao.android.weex_framework.util.g.c("weex2.0 js err", "weex report exception error", th);
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.i
    public void a(int i, String str, String str2, String str3, String str4, String str5, int i2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e32ecd6", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, new Integer(i2)});
            return;
        }
        try {
            String str6 = str + "_" + str3;
            if (TextUtils.isEmpty(str)) {
                str6 = str3;
            }
            if (!a(i, str, str3)) {
                return;
            }
            a a2 = a(i, str4, str5, str6);
            a2.d = a(str2);
            String str7 = "DEFAULT";
            if (i2 != -1 && (jSONObject = this.c.get(Integer.valueOf(i2))) != null) {
                str7 = jSONObject.getString(com.taobao.android.weex_framework.common.expection.a.KEY_EXCEPTION_BUNDLE_URL);
                a2.e = jSONObject.getString(com.taobao.android.weex_framework.common.expection.a.KEY_JS_VERSION_INFO);
            }
            a2.j = str7;
            TLog.loge("Weex/Exception/" + i2, "EnvException", JSONObject.toJSONString(a2));
            a2.l = Thread.currentThread();
            com.alibaba.ha.bizerrorreporter.e.a().a(j.a().b(), a2);
        } catch (Throwable th) {
            com.taobao.android.weex_framework.util.g.c("weex2.0 js err", "weex report exception error", th);
        }
    }

    private a a(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f1fb036a", new Object[]{this, new Integer(i), str, str2, str3});
        }
        a aVar = new a();
        aVar.b = AggregationType.CONTENT;
        aVar.f3119a = "WEEX2_JS_ERROR";
        aVar.c = String.valueOf(i);
        if (i == 10025 || i == 10026 || i == 10018) {
            if (!TextUtils.isEmpty(str)) {
                int indexOf = str.indexOf("\n");
                aVar.f = indexOf > 0 ? str.substring(0, indexOf) : str;
                aVar.h = (str + "\nend_weex_stack\n").replace("\n", "_*n*_");
            }
        } else {
            aVar.f = str;
            aVar.h = str2;
            if (TextUtils.isEmpty(str2)) {
                aVar.h = str;
            }
        }
        aVar.i = new HashMap();
        aVar.i.put(WXExceptionConfig.KEY_GROUP_KEY, str3);
        return aVar;
    }

    @Override // com.taobao.android.weex_framework.adapter.i
    public void a(int i, String str, String str2, String str3, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fadd26ea", new Object[]{this, new Integer(i), str, str2, str3, new Integer(i2)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("exceptionId", (Object) String.valueOf(i));
        jSONObject.put(WXExceptionConfig.KEY_GROUP_KEY, (Object) (str + "_" + str2));
        jSONObject.put("msg", (Object) str3);
        List<JSONObject> list = this.f15924a.get(Integer.valueOf(i2));
        if (list == null) {
            list = new ArrayList<>();
            this.f15924a.put(Integer.valueOf(i2), list);
        }
        list.add(jSONObject);
    }

    @Override // com.taobao.android.weex_framework.adapter.i
    public void a(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), jSONObject});
        } else {
            this.c.put(Integer.valueOf(i), jSONObject);
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.i
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.f15924a.remove(Integer.valueOf(i));
        this.c.remove(Integer.valueOf(i));
        this.b.remove(Integer.valueOf(i));
    }

    @Override // com.taobao.android.weex_framework.adapter.i
    public void b(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88798c4e", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONObject.put("tag", (Object) str2);
        this.b.put(Integer.valueOf(i), jSONObject);
        int size = this.b.size();
        if (size < 25 || size % 5 != 0) {
            return;
        }
        String a2 = a();
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        if (crashCaughtHeader == null) {
            return;
        }
        crashCaughtHeader.addHeaderInfo("wx2_instance_info", a2);
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Integer num : this.b.keySet()) {
            JSONObject jSONObject = this.b.get(num);
            if (jSONObject != null) {
                String string = jSONObject.getString("url");
                if (hashMap.get(string) == null) {
                    hashMap.put(string, 1);
                } else {
                    hashMap.put(string, Integer.valueOf(((Integer) hashMap.get(string)).intValue() + 1));
                }
            }
        }
        return JSONObject.toJSONString(hashMap);
    }

    public boolean a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81145733", new Object[]{this, new Integer(i), str, str2})).booleanValue();
        }
        String str3 = TextUtils.isEmpty(str) ? i + "_" + str2 : i + "_" + str + "_" + str2;
        if (TextUtils.isEmpty(str3)) {
            return true;
        }
        String f = com.taobao.android.weex_framework.util.f.f();
        if (TextUtils.isEmpty(f)) {
            return true;
        }
        try {
            Set<Map.Entry<String, Object>> entrySet = JSON.parseObject(f).entrySet();
            if (entrySet != null) {
                for (Map.Entry<String, Object> entry : entrySet) {
                    if (str3.equals(entry.getKey())) {
                        return new Random(System.currentTimeMillis()).nextInt(100) < Integer.parseInt((String) entry.getValue());
                    }
                }
            }
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.a(e);
        }
        return true;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return str;
        }
        return parse.getHost() + parse.getPath();
    }
}
