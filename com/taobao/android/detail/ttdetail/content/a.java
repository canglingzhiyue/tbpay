package com.taobao.android.detail.ttdetail.content;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.detail.ttdetail.data.meta.Content;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.eyx;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_STATUS_ERROR = "error";
    public static final String DX_STATUS_INITIAL = "initial";
    public static final String DX_STATUS_LOADING = "loading";
    public static final String DX_STATUS_SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f10582a;
    private JSONObject b;
    private Map<String, JSONArray> c;
    private Map<String, Boolean> d;
    private DXTemplateItem e;
    private String f;
    private String g;
    private String h;
    private int i;
    private String j;
    private int k;
    private JSONObject l;
    private DXTemplateItem m = new DXTemplateItem();
    private String n;
    private String o;
    private boolean p;
    private JSONObject q;

    static {
        kge.a(930435836);
    }

    public a() {
        DXTemplateItem dXTemplateItem = this.m;
        dXTemplateItem.f11925a = "detail_page_content_list";
        dXTemplateItem.c = "https://dinamicx.alibabausercontent.com/l_pub/detail_page_content_list/1725245851227/detail_page_content_list.zip";
        dXTemplateItem.b = 104L;
    }

    public void a(Context context, eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e48e0c", new Object[]{this, context, eyxVar});
            return;
        }
        String utdid = UTDevice.getUtdid(context);
        this.h = utdid + System.currentTimeMillis();
        Content content = (Content) eyxVar.a().a(Content.class);
        if (content == null) {
            return;
        }
        this.f = content.getSeeIds();
        this.j = (String) eyxVar.e().a("requestItemId");
        this.l = a(content, this.j);
        this.p = a(content);
        a("initial", "");
        b.a(this.h, this);
    }

    private boolean a(Content content) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f20d15a", new Object[]{this, content})).booleanValue();
        }
        JSONObject extendParams = content.getExtendParams();
        if (extendParams != null && extendParams.size() > 0) {
            try {
                if (extendParams.containsKey("version")) {
                    if (extendParams.getInteger("version").intValue() == 2) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.j;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this}) : this.n;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.p;
    }

    public JSONObject r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bec48319", new Object[]{this}) : this.q;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        b.b(this.h);
        m();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.f10582a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = "all";
        this.h = null;
        this.i = 0;
        this.j = null;
        this.k = 0;
        this.l = null;
        this.n = null;
        this.o = null;
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
        if (!StringUtils.isEmpty(str) && (parseObject = JSONObject.parseObject(str)) != null && parseObject.getJSONObject("data") != null && parseObject.getJSONObject("data").getJSONObject("data") != null && (b = b(parseObject.getJSONObject("data").getJSONObject("data"))) != null) {
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
        } else if (StringUtils.isEmpty(str) || (parseObject = JSONObject.parseObject(str)) == null || parseObject.getJSONObject("data") == null || parseObject.getJSONObject("data").getJSONObject("data") == null || (b = b((jSONObject = parseObject.getJSONObject("data").getJSONObject("data")))) == null) {
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
                n();
            }
            if (this.p) {
                this.q = b.getJSONObject(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_PAGINATION);
            }
            if (this.e == null && (c = c(jSONObject)) != null) {
                this.e = e(c);
            }
            this.g = this.b.getString("currentTag");
            this.d.put(this.g, Boolean.valueOf(equals));
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
        Map<String, JSONArray> map = this.c;
        if (map == null || map.size() <= 0) {
            return;
        }
        JSONArray a2 = d.a(this.c.get(this.g), this.n, this.o, this.c, this.b);
        JSONObject jSONObject = this.b;
        this.f10582a = d.a(a2, jSONObject, "success", "", this.k + "np", this.l);
    }

    public DXTemplateItem f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("6a7242f2", new Object[]{this}) : this.m;
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
        this.f10582a = d.a(null, jSONObject, str, str2, str3, this.l);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
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
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this}) : this.f10582a;
    }

    public JSONObject h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fa36400f", new Object[]{this}) : this.l;
    }

    public DXTemplateItem i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("a900db4f", new Object[]{this}) : this.e;
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
        dXTemplateItem.b = d.a(jSONObject.getString("version"));
        dXTemplateItem.c = jSONObject.getString("url");
        return dXTemplateItem;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.g;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.i;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.h;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.k = i;
        o();
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.f10582a;
        if (jSONObject == null) {
            return;
        }
        jSONObject.put("rootHeight", (Object) (this.k + "np"));
    }

    private JSONObject a(Content content, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb80bcc0", new Object[]{this, content, str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject commonUtParams = content.getCommonUtParams();
            commonUtParams.put("itemId", (Object) str);
            jSONObject.putAll(commonUtParams);
        } catch (Exception e) {
            com.taobao.android.detail.ttdetail.utils.i.a("[mergeContentExposure]ContentDataManager", e.getMessage());
        }
        return jSONObject;
    }
}
