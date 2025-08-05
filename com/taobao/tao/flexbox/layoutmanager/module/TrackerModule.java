package com.taobao.tao.flexbox.layoutmanager.module;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.p;
import com.taobao.tao.flexbox.layoutmanager.component.x;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.any;
import tb.kge;
import tb.odx;
import tb.oeb;
import tb.oec;
import tb.oga;
import tb.ogb;
import tb.ogg;

/* loaded from: classes8.dex */
public class TrackerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TNodeTracker";

    static {
        kge.a(1811424266);
        kge.a(-818961104);
    }

    private static void enterFromTabChild(g.c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366e9da1", new Object[]{cVar, jSONObject});
        }
    }

    @Priority(name = "low")
    public static void commit(g.c cVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aebd2b01", new Object[]{cVar});
        } else if ((cVar.b instanceof JSONObject) && (jSONArray = ((JSONObject) cVar.b).getJSONArray("args")) != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                commitInternal(cVar, false, jSONArray.getJSONObject(i), true);
            }
        }
    }

    @Priority(name = "low")
    public static void commit(g.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e8e7f3", new Object[]{cVar, new Boolean(z)});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            commitInternal(cVar, z, (JSONObject) cVar.b, false);
        }
    }

    private static void commitInternal(final g.c cVar, final boolean z, final JSONObject jSONObject, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ff0c74", new Object[]{cVar, new Boolean(z), jSONObject, new Boolean(z2)});
        } else if (TextUtils.isEmpty(any.d().c())) {
        } else {
            final JSONObject jSONObject2 = null;
            if (jSONObject != null && jSONObject.containsKey("args")) {
                jSONObject2 = jSONObject.getJSONObject("args");
            }
            if (z2 && (jSONObject2 == null || !jSONObject2.containsKey("entryUtparam") || !jSONObject2.containsKey("entryUtparamPre"))) {
                String e = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().e(getUTObjectWithContext(cVar));
                String f = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().f(getUTObjectWithContext(cVar));
                if (!TextUtils.isEmpty(e) || !TextUtils.isEmpty(f)) {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    if (!jSONObject2.containsKey("entryUtparam")) {
                        jSONObject2.put("entryUtparam", (Object) e);
                    }
                    if (!jSONObject2.containsKey("entryUtparamPre")) {
                        jSONObject2.put("entryUtparamPre", (Object) f);
                    }
                }
            }
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.module.TrackerModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject3 = JSONObject.this;
                    if (jSONObject3 == null) {
                        return;
                    }
                    try {
                        String string = jSONObject3.getString("pageName");
                        int intValue = JSONObject.this.getIntValue(PopConst.POP_EVENT_ID_KEY);
                        String string2 = JSONObject.this.getString("arg1");
                        boolean z3 = z;
                        if (intValue == 2201 && "Page_videointeract".equals(string)) {
                            z3 = false;
                        }
                        if (z3 && string != null && string2 != null && !string2.startsWith(string)) {
                            string2 = string + "_" + string2;
                        }
                        String str = string2;
                        String string3 = JSONObject.this.getString("arg2");
                        String string4 = JSONObject.this.getString("arg3");
                        ArrayList arrayList = new ArrayList();
                        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                                arrayList.add(entry.getKey() + "=" + entry.getValue());
                            }
                        }
                        TrackerModule.addDSLInfo(arrayList, cVar);
                        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                        ab abVar = null;
                        if (cVar != null) {
                            abVar = cVar.f19938a;
                        }
                        com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(abVar, string, intValue, str, string3, string4, strArr);
                        ogg.c(TrackerModule.TAG, JSONObject.this.toJSONString() + JSON.toJSONString(arrayList));
                    } catch (Throwable th) {
                        ogg.c(TrackerModule.TAG, "track commitInternal" + th.getMessage());
                    }
                }
            });
        }
    }

    @Priority(name = "low")
    public static void click(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ff9ed0", new Object[]{cVar});
        } else if (cVar.b instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("pageName");
            String string2 = jSONObject.getString("controlName");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            ArrayList arrayList = new ArrayList();
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    arrayList.add(entry.getKey() + "=" + entry.getValue());
                }
            }
            try {
                arrayList.add("_TNode=TNode");
                arrayList.add("tnode_dsl_md5=" + cVar.f19938a.F());
                arrayList.add("tnode_dsl_time=" + cVar.f19938a.G());
            } catch (Exception unused) {
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(string, string2, (String[]) arrayList.toArray(new String[arrayList.size()]));
            ogg.c(TAG, jSONObject.toJSONString());
        }
    }

    public static void updatePageName(g.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d02b415", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("pageName");
            Object uTObjectWithContext = getUTObjectWithContext(cVar);
            aa findTabbarControllerRootNode = findTabbarControllerRootNode(cVar);
            if (isUpdateCurrentPage(findTabbarControllerRootNode)) {
                if (oeb.by() && cVar.f19938a.h() != null) {
                    z = cVar.f19938a.h().isContainerResumed();
                }
                if (z) {
                    ogg.c("TrackerModule", "updatePageName:" + string);
                    com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().b(uTObjectWithContext, string);
                }
            }
            cacheTabPageName(findTabbarControllerRootNode, string);
            updateFirstPageNameIfNeeded(cVar, string);
            ogg.c(TAG, jSONObject.toJSONString());
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [tb.ofz] */
    private static void updateFirstPageNameIfNeeded(g.c cVar, String str) {
        ?? c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc0e9af", new Object[]{cVar, str});
            return;
        }
        ogb a2 = oga.a(cVar);
        if (a2 == null) {
            return;
        }
        oga<?> findSecPageWrapper = a2.findSecPageWrapper();
        if (findSecPageWrapper != null && (c = findSecPageWrapper.c()) != 0 && (c.a() instanceof TNodeView) && ((TNodeView) c.a()).getEngine() == cVar.f19938a) {
            return;
        }
        a2.setFirstPageName(str);
    }

    public static Object getUTObjectWithContext(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3ffe2aef", new Object[]{cVar});
        }
        Object obj = null;
        if (cVar == null) {
            return null;
        }
        if (cVar.f19938a != null && (obj = cVar.f19938a.c(R.id.layout_manager_engine_utobject_tag)) == null && (cVar.f19938a.g() instanceof f)) {
            obj = ((f) cVar.f19938a.g()).getUTObject();
        }
        return obj == null ? cVar.a() : obj;
    }

    private static void cacheTabPageName(aa aaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("614cd346", new Object[]{aaVar, str});
        } else if (aaVar == null) {
        } else {
            aaVar.a(1, str);
        }
    }

    private static aa findTabbarControllerRootNode(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("84ea88bd", new Object[]{cVar});
        }
        if (!((JSONObject) cVar.b).containsKey("target")) {
            return null;
        }
        aa a2 = cVar.f19938a.a(((JSONObject) cVar.b).getInteger("target").intValue());
        aa i = ad.i(a2);
        if (i != null) {
            return i;
        }
        aa M = a2.M();
        return M.e() instanceof p ? ad.i(((p) M.e()).getNode()) : i;
    }

    private static boolean isUpdateCurrentPage(aa aaVar) {
        aa J;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e65fe08", new Object[]{aaVar})).booleanValue();
        }
        if (aaVar != null && oeb.d() && (J = aaVar.J()) != null) {
            TabBarControllerComponent tabBarControllerComponent = (TabBarControllerComponent) J.I();
            if (tabBarControllerComponent != null && tabBarControllerComponent.getView() != null) {
                return tabBarControllerComponent.a(tabBarControllerComponent.getView().getCurrentItem()) == aaVar;
            } else if (oeb.H()) {
                int a2 = oec.a(J.e("selected-index"), 0);
                aa b = x.b(J, odx.b(J.e("group")));
                if (b != null) {
                    a2 = Math.max(a2, oec.a(b.e("init-index"), 0));
                }
                return J.b(a2) == aaVar;
            }
        }
        return true;
    }

    private static void cacheTabPageProperty(aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1008a7f", new Object[]{aaVar, map});
        } else if (aaVar == null) {
        } else {
            aaVar.a(4, map);
        }
    }

    public static void enter(g.c cVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab46780", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject) || (jSONObject = (JSONObject) cVar.b) == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
            if (jSONObject2 != null && jSONObject2.get("enterFromTabChild") != null) {
                enterFromTabChild(cVar, jSONObject);
            } else {
                enterFromCommonPage(cVar, jSONObject);
            }
        }
    }

    private static void enterFromCommonPage(g.c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cbf6f4", new Object[]{cVar, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("pageName");
            Object uTObjectWithContext = getUTObjectWithContext(cVar);
            u k = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k();
            if (TextUtils.isEmpty(string)) {
                k.a(uTObjectWithContext, (String) null);
            } else {
                k.b(uTObjectWithContext, string);
                k.a(uTObjectWithContext, string);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
            if (jSONObject2 != null) {
                HashMap hashMap = new HashMap();
                for (String str : jSONObject2.keySet()) {
                    hashMap.put(str, jSONObject2.getString(str));
                }
                addDSLInfo(hashMap, cVar);
                k.a(uTObjectWithContext, hashMap);
            }
            ogg.c(TAG, jSONObject.toJSONString());
        }
    }

    public static void exit(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efad61fa", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("pageName");
            Object uTObjectWithContext = getUTObjectWithContext(cVar);
            u k = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k();
            if (!TextUtils.isEmpty(string)) {
                k.b(uTObjectWithContext, string);
            }
            k.a(uTObjectWithContext);
            ogg.c(TAG, jSONObject.toJSONString());
        }
    }

    public static void updateProperties(final g.c cVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ea8bfc", new Object[]{cVar});
        } else if ((cVar.b instanceof JSONObject) && (jSONObject = (JSONObject) cVar.b) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
            if (jSONObject2 != null) {
                final HashMap hashMap = new HashMap();
                for (String str : jSONObject2.keySet()) {
                    hashMap.put(str, jSONObject2.getString(str));
                }
                addDSLInfo(hashMap, cVar);
                final Object uTObjectWithContext = getUTObjectWithContext(cVar);
                aa findTabbarControllerRootNode = findTabbarControllerRootNode(cVar);
                if (isUpdateCurrentPage(findTabbarControllerRootNode)) {
                    AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.module.TrackerModule.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            boolean z = true;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            if (oeb.by() && g.c.this.f19938a.h() != null) {
                                z = g.c.this.f19938a.h().isContainerResumed();
                            }
                            if (!z) {
                                return;
                            }
                            ogg.c("TrackerModule", m.UPDATE_PAGE_PROPERTIES);
                            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(uTObjectWithContext, hashMap);
                        }
                    });
                }
                cacheTabPageProperty(findTabbarControllerRootNode, hashMap);
                updateFirstPagePropertyIfNeeded(cVar, hashMap);
            }
            ogg.c(TAG, jSONObject.toJSONString());
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [tb.ofz] */
    private static void updateFirstPagePropertyIfNeeded(g.c cVar, HashMap hashMap) {
        ?? c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d676f7b8", new Object[]{cVar, hashMap});
            return;
        }
        ogb a2 = oga.a(cVar);
        if (a2 == null) {
            return;
        }
        oga<?> findSecPageWrapper = a2.findSecPageWrapper();
        if (findSecPageWrapper != null && (c = findSecPageWrapper.c()) != 0 && (c.a() instanceof TNodeView) && ((TNodeView) c.a()).getEngine() == cVar.f19938a) {
            return;
        }
        a2.setFirstPageProperty(hashMap);
    }

    public static void updateNextPageProperties(g.c cVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2c1df7a", new Object[]{cVar});
        } else if ((cVar.b instanceof JSONObject) && (jSONObject = (JSONObject) cVar.b) != null) {
            HashMap hashMap = new HashMap();
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.getString(str));
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a((Map<String, String>) hashMap);
            ogg.c(TAG, jSONObject.toJSONString());
        }
    }

    public static void updateNextPageUtparams(g.c cVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f23348", new Object[]{cVar});
        } else if ((cVar.b instanceof JSONObject) && (jSONObject = (JSONObject) cVar.b) != null) {
            HashMap hashMap = new HashMap();
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.getString(str));
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().b((Map<String, String>) hashMap);
            ogg.c(TAG, jSONObject.toJSONString());
        }
    }

    public static void updatePageUrl(g.c cVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d890e1", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject) || (jSONObject = (JSONObject) cVar.b) == null) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().c(getUTObjectWithContext(cVar), jSONObject.getString("url"));
            ogg.c(TAG, jSONObject.toJSONString());
        }
    }

    public static void updatePageUtparams(g.c cVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81c4cfb", new Object[]{cVar});
        } else if ((cVar.b instanceof JSONObject) && (jSONObject = (JSONObject) cVar.b) != null) {
            HashMap hashMap = new HashMap();
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.getString(str));
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().b(getUTObjectWithContext(cVar), hashMap);
            ogg.c(TAG, jSONObject.toJSONString());
        }
    }

    public static void getSpmUrlAndSpmPre(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a50583", new Object[]{cVar});
        } else if (cVar.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            String[] c = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().c(getUTObjectWithContext(cVar));
            if (c != null && c.length == 2) {
                hashMap.put("spmUrl", c[0]);
                hashMap.put("spmPre", c[1]);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("spms", (Object) hashMap);
            cVar.c.a(cVar, jSONObject);
        }
    }

    public static void addDSLInfo(Map<String, String> map, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd1d69c", new Object[]{map, aaVar});
        } else if (map == null || aaVar == null) {
        } else {
            map.put("_TNode", "TNode");
            map.put("tnode_dsl_md5", ad.g(aaVar));
            map.put("tnode_dsl_time", ad.h(aaVar));
        }
    }

    public static void addDSLInfo(Map<String, String> map, g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68dd54b", new Object[]{map, cVar});
        } else if (map == null || cVar == null || cVar.f19938a == null) {
        } else {
            map.put("_TNode", "TNode");
            map.put("tnode_dsl_md5", cVar.f19938a.F());
            map.put("tnode_dsl_time", cVar.f19938a.G());
        }
    }

    public static void addDSLInfo(List<String> list, g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e6411d", new Object[]{list, cVar});
        } else if (list == null) {
        } else {
            list.add("_TNode=TNode");
            if (cVar == null || cVar.f19938a == null) {
                return;
            }
            list.add("tnode_dsl_md5=" + cVar.f19938a.F());
            list.add("tnode_dsl_time=" + cVar.f19938a.G());
        }
    }
}
