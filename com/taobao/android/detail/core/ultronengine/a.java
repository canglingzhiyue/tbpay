package com.taobao.android.detail.core.ultronengine;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.emu;
import tb.eni;
import tb.epo;
import tb.epv;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9921a;
    private final Context b;
    private final Handler c = new Handler(Looper.getMainLooper());

    public static /* synthetic */ Context a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("8c8f3fe4", new Object[]{aVar}) : aVar.b;
    }

    static {
        kge.a(1290392444);
        f9921a = false;
    }

    public a(Context context) {
        this.b = context;
        emu.a("com.taobao.android.detail.core.ultronengine.DegradeLogic");
    }

    public static boolean a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c456306", new Object[]{bVar})).booleanValue();
        }
        if (!epv.g) {
            i.a("DegradeLogic", "isServerEnable orange close");
            return false;
        } else if (bVar == null) {
            i.a("DegradeLogic", "isServerEnable nodeBundle null");
            return false;
        } else {
            JSONObject a2 = bVar.a();
            if (a2 == null) {
                i.a("DegradeLogic", "isServerEnable global null");
                return false;
            }
            if (bVar.b() != null) {
                jSONObject = bVar.a();
            } else {
                jSONObject = bVar.a().getJSONObject("bizData");
            }
            if (jSONObject == null) {
                i.c("DegradeLogic", "isServerEnable bizData null");
                return false;
            } else if (!jSONObject.getBooleanValue("useClientEngine")) {
                h.b(jSONObject);
                return false;
            } else {
                JSONObject jSONObject3 = jSONObject.getJSONObject("template");
                if (jSONObject3 == null || jSONObject3.size() == 0) {
                    h.a(jSONObject);
                    return false;
                }
                if (bVar.b() != null) {
                    jSONObject2 = bVar.b().getJSONObject("componentsVO");
                } else {
                    jSONObject2 = a2.getJSONObject("componentsVO");
                }
                if (jSONObject2 == null || jSONObject2.size() == 0) {
                    h.c();
                    return false;
                }
                h.a(bVar);
                return true;
            }
        }
    }

    public boolean a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, JSONObject jSONObject, com.alibaba.android.ultron.vfw.dataloader.h hVar) {
        com.alibaba.android.ultron.engine.template.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f31abd9f", new Object[]{this, bVar, jSONObject, hVar})).booleanValue();
        }
        if (hVar != null && (a2 = hVar.a()) != null && !a2.f2568a && a2.c != null) {
            JSONObject jSONObject2 = a2.c.getJSONObject("data");
            try {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("global").getJSONObject("data").getJSONObject("componentsVO").getJSONObject("globalStyle");
                if (jSONObject3 == null || jSONObject3.size() == 0) {
                    h.b((Throwable) null);
                    return false;
                } else if (!c(jSONObject2)) {
                    return false;
                } else {
                    if (b.b(bVar)) {
                        i.c("DegradeLogic", "v7协议不需要新老协议对比");
                        return true;
                    } else if (b.c(bVar)) {
                        i.c("DegradeLogic", "服务端下发ignoreAll强制不进行组件校验");
                        return true;
                    } else {
                        Set<String> a3 = a(jSONObject2);
                        if (a3 == null) {
                            return f9921a;
                        }
                        return a(bVar, jSONObject.getJSONObject("data"), a3) || f9921a;
                    }
                }
            } catch (Throwable th) {
                h.b(th);
            }
        }
        return false;
    }

    private Set<String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2b590977", new Object[]{this, jSONObject});
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy").getJSONObject("structure");
            ArrayList<String> arrayList = new ArrayList();
            if (jSONObject2.containsKey("bottomBar")) {
                a(arrayList, jSONObject2.getJSONArray("bottomBar"), jSONObject2);
            }
            if (jSONObject2.containsKey("detailInfoUltron")) {
                a(arrayList, jSONObject2.getJSONArray("detailInfoUltron"), jSONObject2);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            HashSet hashSet = new HashSet();
            for (String str : arrayList) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject(str);
                if (jSONObject4 != null && jSONObject4.containsKey("type")) {
                    hashSet.add(jSONObject4.getString("type"));
                }
            }
            return hashSet;
        } catch (Throwable th) {
            i.a("DegradeLogic", "getUltronProtocolComps", th);
            h.a("DegradeLogic_getUltronProtocolComps", th);
            return null;
        }
    }

    private void a(List<String> list, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5834708f", new Object[]{this, list, jSONArray, jSONObject});
        } else if (jSONArray != null && jSONArray.size() != 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                if (jSONObject.containsKey(string)) {
                    a(list, jSONObject.getJSONArray(string), jSONObject);
                } else {
                    list.add(string);
                }
            }
        }
    }

    private Map<String, String> c(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f4a206b9", new Object[]{this, bVar});
        }
        JSONObject c = bVar.c();
        if (c == null) {
            c = bVar.a();
        }
        JSONObject jSONObject = c.getJSONObject("migrateRelations");
        if (jSONObject == null || jSONObject.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap(jSONObject.size());
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArray = (JSONArray) entry.getValue();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        hashMap.put(string, key);
                    }
                }
            }
        }
        return hashMap;
    }

    private JSONArray b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("aaec3d37", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy").getJSONObject("structure");
        if (jSONObject2 == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("detailInfoContainer");
        JSONArray jSONArray2 = jSONObject2.getJSONArray("bottomBar");
        if (jSONArray == null || jSONArray2 == null) {
            return null;
        }
        JSONArray jSONArray3 = new JSONArray();
        jSONArray3.addAll(jSONArray);
        jSONArray3.addAll(jSONArray2);
        return jSONArray3;
    }

    private boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy").getJSONObject("structure");
        return jSONObject2.containsKey("bottomBar") && jSONObject2.getJSONArray("bottomBar") != null && jSONObject2.getJSONArray("bottomBar").size() == 1;
    }

    private boolean a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, JSONObject jSONObject, Set<String> set) {
        JSONObject jSONObject2;
        JSONArray b;
        JSONObject jSONObject3;
        String string;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b463cd5", new Object[]{this, bVar, jSONObject, set})).booleanValue();
        }
        try {
            i.a("DegradeLogic", "checkEnable patch");
            Map<String, String> c = c(bVar);
            if (c == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || (b = b(jSONObject)) == null) {
                return false;
            }
            final ArrayList arrayList = new ArrayList();
            Set<String> b2 = b(bVar);
            int size = b.size();
            com.taobao.android.detail.datasdk.model.datamodel.node.b bVar2 = bVar.c() != null ? new com.taobao.android.detail.datasdk.model.datamodel.node.b(bVar.c()) : bVar;
            for (int i = 0; i < size; i++) {
                String string2 = b.getString(i);
                if (string2 != null && (jSONObject3 = jSONObject2.getJSONObject(string2)) != null && (string = jSONObject3.getString("type")) != null && !b2.contains(string) && ((str = c.get(string)) == null || !set.contains(str))) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("fields");
                    String string3 = jSONObject4 != null ? jSONObject4.getString("filter") : null;
                    if (TextUtils.isEmpty(string3) || !eni.a(epo.a(), string3, bVar2.a())) {
                        arrayList.add(string);
                        if (!com.taobao.android.detail.core.debug.a.a(this.b)) {
                            break;
                        }
                    }
                }
            }
            if (arrayList.size() <= 0) {
                return true;
            }
            h.a(arrayList, bVar2);
            if (com.taobao.android.detail.core.debug.a.a(this.b)) {
                this.c.post(new Runnable() { // from class: com.taobao.android.detail.core.ultronengine.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Context a2 = a.a(a.this);
                        Toast.makeText(a2, "不支持组件：" + JSON.toJSONString(arrayList), 1).show();
                    }
                });
            }
            return false;
        } catch (Throwable th) {
            i.a("DegradeLogic", "checkEnable", th);
            h.a("DegradeLogic_checkEnable", th);
            return false;
        }
    }

    public static Set<String> b(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("f3d651f2", new Object[]{bVar});
        }
        try {
            JSONObject jSONObject = epv.f;
            JSONArray jSONArray = null;
            JSONArray jSONArray2 = jSONObject != null ? jSONObject.getJSONArray(com.taobao.android.fluid.framework.data.remote.newmodel.a.MATCH_IGNORE) : null;
            if (bVar != null) {
                JSONObject c = bVar.c();
                if (c == null) {
                    c = bVar.a();
                }
                JSONObject jSONObject2 = c.getJSONObject(com.taobao.android.fluid.framework.data.remote.newmodel.a.MATCH_IGNORE);
                if (jSONObject2 != null) {
                    jSONArray = jSONObject2.getJSONArray("ignoreList");
                }
            }
            if (jSONArray != null) {
                jSONArray2 = jSONArray;
            }
            if (jSONArray2 != null) {
                HashSet hashSet = new HashSet(jSONArray2.size());
                for (int i = 0; i < jSONArray2.size(); i++) {
                    hashSet.add(jSONArray2.getString(i));
                }
                return hashSet;
            }
        } catch (Throwable th) {
            i.a("DegradeLogic", "", th);
            h.a("DegradeLogic_getIgnoreComponents", th);
        }
        return new HashSet();
    }
}
