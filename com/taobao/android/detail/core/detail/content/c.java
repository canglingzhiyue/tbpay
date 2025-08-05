package com.taobao.android.detail.core.detail.content;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.emu;
import tb.eqb;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_STATUS_ERROR = "error";
    public static final String DX_STATUS_INITIAL = "initial";
    public static final String DX_STATUS_LOADING = "loading";
    public static final String DX_STATUS_SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f9447a;
    private JSONObject b;
    private Map<String, JSONArray> c;
    private Map<String, Boolean> d;
    private DXTemplateItem e;
    private String f;
    private String g;
    private int h;
    private String i;
    private String j;
    private int k;
    private DXTemplateItem l = new DXTemplateItem();
    private JSONObject m;

    static {
        kge.a(122666742);
    }

    public c() {
        DXTemplateItem dXTemplateItem = this.l;
        dXTemplateItem.f11925a = "detail_page_content_list";
        dXTemplateItem.c = "https://dinamicx.alibabausercontent.com/l_pub/detail_page_content_list/1694520291059/detail_page_content_list.zip";
        dXTemplateItem.b = 83L;
        emu.a("com.taobao.android.detail.core.detail.content.ContentDataEngine");
    }

    public void a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349c12f3", new Object[]{this, detailCoreActivity});
            return;
        }
        String utdid = UTDevice.getUtdid(detailCoreActivity);
        this.i = utdid + System.currentTimeMillis();
        JSONObject jSONObject = detailCoreActivity.C().f10055a.a().getJSONObject("content");
        if (jSONObject == null) {
            return;
        }
        this.f = jSONObject.getString("seeIds");
        this.j = detailCoreActivity.f9411a.f27180a;
        this.m = b(detailCoreActivity);
        a("initial", "");
        d.a(this.i, this);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.j;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d.b(this.i);
        l();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.f9447a = null;
        this.b = null;
        this.e = null;
        this.c = null;
        this.d = null;
        this.f = null;
        this.g = "all";
        this.i = null;
    }

    public boolean d() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        Map<String, Boolean> map = this.d;
        return map == null || !map.containsKey(this.g) || (bool = this.d.get(this.g)) == null || bool.booleanValue();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.g = str;
        JSONObject jSONObject = this.b;
        if (jSONObject == null || this.c == null) {
            return;
        }
        jSONObject.put("currentTag", (Object) this.g);
        JSONArray jSONArray = this.c.get(this.g);
        if (jSONArray == null || jSONArray.isEmpty()) {
            a("initial", "");
        } else {
            e();
        }
    }

    public JSONArray b(String str) {
        JSONObject parseObject;
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fe97466b", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (parseObject = JSONObject.parseObject(str)) != null && parseObject.getJSONObject("data") != null && parseObject.getJSONObject("data").getJSONObject("data") != null && (b = b(parseObject.getJSONObject("data").getJSONObject("data"))) != null) {
            return d(b);
        }
        return null;
    }

    public void c(String str) {
        JSONObject parseObject;
        JSONObject jSONObject;
        JSONObject b;
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || (parseObject = JSONObject.parseObject(str)) == null || parseObject.getJSONObject("data") == null || parseObject.getJSONObject("data").getJSONObject("data") == null || (b = b((jSONObject = parseObject.getJSONObject("data").getJSONObject("data")))) == null) {
        } else {
            JSONObject a2 = a(b);
            JSONArray d = d(b);
            if (a2 == null || d == null) {
                return;
            }
            this.b = a2;
            boolean equals = Boolean.TRUE.toString().equals(b.getString("hasNextPage"));
            if (this.c == null || this.d == null) {
                this.c = new HashMap();
                this.d = new HashMap();
                m();
            }
            this.d.put(this.g, Boolean.valueOf(equals));
            if (this.e == null && (c = c(jSONObject)) != null) {
                this.e = e(c);
            }
            this.g = this.b.getString("currentTag");
            a(d);
            e();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        JSONArray jSONArray = this.c.get(this.g);
        JSONObject jSONObject = this.b;
        this.f9447a = f.a(jSONArray, jSONObject, "success", "", this.k + "np", this.m);
    }

    public DXTemplateItem f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("6a7242f2", new Object[]{this}) : this.l;
    }

    public void a(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = this.b;
        if (this.k == 0) {
            str3 = "650";
        } else {
            str3 = this.k + "np";
        }
        this.f9447a = f.a(null, jSONObject, str, str2, str3, this.m);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        JSONArray jSONArray = this.b.getJSONArray("tagList");
        if (jSONArray == null) {
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            this.c.put(((JSONObject) it.next()).getString("tag"), new JSONArray());
        }
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getJSONObject("filter");
        }
        return null;
    }

    private JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getJSONObject("model");
        }
        return null;
    }

    private JSONObject c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("components")) != null) {
            return jSONObject2.getJSONObject("list");
        }
        return null;
    }

    private JSONArray d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("8d8f5c39", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getJSONArray("contents");
        }
        return null;
    }

    public JSONArray d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("32ce43a9", new Object[]{this, str}) : this.c.get(str);
    }

    private void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            return;
        }
        JSONArray jSONArray2 = this.c.get(this.g);
        if (jSONArray2 == null) {
            return;
        }
        jSONArray2.addAll(jSONArray);
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this}) : this.f9447a;
    }

    public JSONObject o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("83cd0896", new Object[]{this}) : this.m;
    }

    public DXTemplateItem h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("3ed15330", new Object[]{this}) : this.e;
    }

    public boolean e(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        Map<String, JSONArray> map = this.c;
        return map == null || (jSONArray = map.get(str)) == null || jSONArray.isEmpty();
    }

    private DXTemplateItem e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("bfdb3e3b", new Object[]{this, jSONObject});
        }
        if (!"dx".equalsIgnoreCase(jSONObject.getString("type"))) {
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = jSONObject.getString("name");
        dXTemplateItem.b = f.a(jSONObject.getString("version"));
        dXTemplateItem.c = jSONObject.getString("url");
        return dXTemplateItem;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.g;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.h;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.i;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.k = i;
        n();
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.f9447a;
        if (jSONObject == null) {
            return;
        }
        jSONObject.put("rootHeight", (Object) (this.k + "np"));
    }

    private JSONObject b(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8541aaf2", new Object[]{this, detailCoreActivity});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = detailCoreActivity.y().t;
            JSONObject jSONObject2 = eqb.x(cVar.f10055a).commonUtParams;
            jSONObject2.put("itemId", (Object) cVar.i());
            jSONObject.putAll(jSONObject2);
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a("[mergeContentExposure]ContentDataManager", e.getMessage());
        }
        return jSONObject;
    }
}
