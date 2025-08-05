package com.taobao.android.behavix.behavixswitch;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavix.adapter.BXBRBridge;
import com.taobao.android.behavix.behavixswitch.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.drg;
import tb.dsb;
import tb.dsp;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TASK_CONFIG = 2;
    public static final int UT_CONFIG = 1;

    /* renamed from: a  reason: collision with root package name */
    private static b f9171a;
    private List<c> b = new ArrayList();
    private List<c> c = new ArrayList();
    private String d = "";
    private String e = "";
    private JSONObject f = null;

    static {
        kge.a(-1211289760);
    }

    public static /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e8635cc0", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ String a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f553f836", new Object[]{bVar, str});
        }
        bVar.d = str;
        return str;
    }

    public static /* synthetic */ List a(b bVar, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f4a1dbf4", new Object[]{bVar, jSONObject, new Integer(i)}) : bVar.a(jSONObject, i);
    }

    public static /* synthetic */ List a(b bVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7d805556", new Object[]{bVar, list});
        }
        bVar.c = list;
        return list;
    }

    public static /* synthetic */ List b(b bVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5b73bb35", new Object[]{bVar, list});
        }
        bVar.b = list;
        return list;
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c19a7ea6", new Object[0]);
        }
        if (f9171a == null) {
            synchronized (b.class) {
                if (f9171a == null) {
                    f9171a = new b();
                }
            }
        }
        return f9171a;
    }

    public List<c> a(int i) {
        List<c> list;
        List<c> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{this, new Integer(i)});
        }
        if (1 == i && (list2 = this.c) != null) {
            return new ArrayList(list2);
        }
        if (2 == i && (list = this.b) != null) {
            return new ArrayList(list);
        }
        return new ArrayList();
    }

    private List<c> a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4935846c", new Object[]{this, jSONObject, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = null;
        if (jSONObject == null) {
            return arrayList;
        }
        if (i == 1) {
            jSONArray = jSONObject.getJSONArray(BHRTaskConfigBase.TYPE_CONFIG_UT);
        } else if (i == 2) {
            jSONArray = jSONObject.getJSONArray("task");
        }
        if (jSONArray == null) {
            return arrayList;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            arrayList.add(new c((JSONObject) it.next()));
        }
        return arrayList;
    }

    private JSONArray a(dsp dspVar, int i) {
        JSONArray a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("39777052", new Object[]{this, dspVar, new Integer(i)});
        }
        JSONArray jSONArray = new JSONArray();
        for (c cVar : a(i)) {
            if (cVar.a(dspVar) && (a2 = cVar.a()) != null && a2.size() != 0) {
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    jSONArray.add(a2.getJSONObject(i2));
                }
            }
        }
        return jSONArray;
    }

    public JSONArray a(dsp dspVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("22a25e7", new Object[]{this, dspVar}) : a(dspVar, 2);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        dsb.a(null, "task_config_init", null);
        d();
        e();
        BXBRBridge.c();
        drg.a().b();
        com.taobao.android.behavix.feature.c.a().b();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            com.taobao.android.behavix.utils.f.a().a(new Runnable() { // from class: com.taobao.android.behavix.behavixswitch.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String a2 = a.a(j.a.K_BEHAVIX_CONFIG, com.taobao.android.behavix.adapter.a.a(j.a.K_BEHAVIX_CONFIG));
                        if (TextUtils.equals(a2, b.a(b.this))) {
                            return;
                        }
                        if (TextUtils.isEmpty(a2)) {
                            b.a(b.this, new ArrayList());
                            b.b(b.this, new ArrayList());
                            return;
                        }
                        try {
                            JSONObject parseObject = JSON.parseObject(a2);
                            if (parseObject != null && parseObject.size() != 0) {
                                b.a(b.this, a2);
                                b.a(b.this, b.a(b.this, parseObject, 1));
                                b.b(b.this, b.a(b.this, parseObject, 2));
                                return;
                            }
                            b.a(b.this, a2);
                            b.a(b.this, new ArrayList());
                            b.b(b.this, new ArrayList());
                        } catch (Exception e) {
                            dsb.a("BehaviXUTPlugin.getConfigs", "", null, e);
                        }
                    } catch (Exception e2) {
                        dsb.a("ConfigManager.updateConfig", null, null, e2);
                    }
                }
            });
        }
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.f;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String a2 = a.a(j.a.K_UT_EVENT_FILTERS, "");
        if (TextUtils.equals(this.e, a2)) {
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(a2);
            if (parseObject != null) {
                this.f = new JSONObject(parseObject);
            } else {
                this.f = new JSONObject();
            }
        } catch (JSONException e) {
            dsb.a("ConfigManager", "updateUTEventFilters", null, e);
        }
    }
}
