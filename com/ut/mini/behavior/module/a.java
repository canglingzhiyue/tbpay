package com.ut.mini.behavior.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.expression.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_TAG = "ut_tag";

    /* renamed from: a  reason: collision with root package name */
    private final Object f24095a;
    private ModulesConfig b;

    /* renamed from: com.ut.mini.behavior.module.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C1049a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f24096a;

        static {
            kge.a(-1944683104);
            f24096a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a4988974", new Object[0]) : f24096a;
        }
    }

    static {
        kge.a(391384781);
    }

    private a() {
        this.f24095a = new Object();
    }

    public static a getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4604709e", new Object[0]) : C1049a.a();
    }

    public void init(ModulesConfig modulesConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1949a4fd", new Object[]{this, modulesConfig});
            return;
        }
        synchronized (this.f24095a) {
            this.b = modulesConfig;
        }
    }

    public Map<String, String> makeTag(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b409487", new Object[]{this, map});
        }
        synchronized (this.f24095a) {
            if (this.b == null) {
                return null;
            }
            List<Module> list = this.b.moduleList;
            if (list != null) {
                ArrayList arrayList = null;
                for (Module module : list) {
                    if (d.getInstance().evaluateData(module.data, map)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(module.name);
                    }
                }
                if (arrayList != null) {
                    try {
                        str = JSONObject.toJSONString(arrayList);
                    } catch (Exception unused) {
                        str = "";
                    }
                    if (!str.isEmpty()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(UT_TAG, str);
                        return hashMap;
                    }
                }
            }
            return null;
        }
    }
}
