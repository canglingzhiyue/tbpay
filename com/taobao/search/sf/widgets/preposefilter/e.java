package com.taobao.search.sf.widgets.preposefilter;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.preposefilter.perf.RecyclerPreposeFilterBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.gbk;
import tb.isi;
import tb.kge;
import tb.noa;

/* loaded from: classes8.dex */
public class e extends isi<RecyclerPreposeFilterBean, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final com.taobao.android.searchbaseframe.nx3.bean.c f19574a;
    private static final com.taobao.android.searchbaseframe.nx3.bean.a b;
    private final boolean c;

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 32169431) {
            super.a((JSONObject) objArr[0], (JSONObject) ((BaseTypedBean) objArr[1]), (BaseTypedBean) ((BaseSearchResult) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_prepose_filter";
    }

    public e(boolean z) {
        this.c = z;
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public RecyclerPreposeFilterBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerPreposeFilterBean) ipChange.ipc$dispatch("d13c6417", new Object[]{this}) : new RecyclerPreposeFilterBean();
    }

    @Override // tb.isi, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject beanObject, RecyclerPreposeFilterBean bean, CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55516514", new Object[]{this, beanObject, bean, commonSearchResult});
            return;
        }
        q.c(beanObject, "beanObject");
        q.c(bean, "bean");
        super.a(beanObject, (JSONObject) bean, (RecyclerPreposeFilterBean) commonSearchResult);
        bean.setTraceMap(a(com.taobao.android.searchbaseframe.util.a.b(beanObject, "traceMap")));
        bean.setMultiValueKeys(b(beanObject));
        bean.setButtonList(a(beanObject, commonSearchResult, bean.getMultiValueKeys()));
        bean.setRefreshAll(beanObject.getBooleanValue("refreshAll"));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<RecyclerPreposeFilterBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : RecyclerPreposeFilterBean.class;
    }

    private final Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!StringUtils.isEmpty(key) && value != null) {
                q.a((Object) key, "key");
                hashMap.put(key, value.toString());
            }
        }
        return hashMap;
    }

    private final List<String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cca20740", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, noa.KEY_MULTI_VALUE_KEYS);
        if (a2 == null) {
            return arrayList;
        }
        q.a((Object) a2, "FastJsonParseUtil.optJSO…\")\n      ?: return result");
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(a2.getString(i));
        }
        return arrayList;
    }

    private final ArrayList<com.taobao.search.sf.widgets.preposefilter.a> a(JSONObject jSONObject, CommonSearchResult commonSearchResult, List<String> list) {
        JSONArray a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("30bbdc70", new Object[]{this, jSONObject, commonSearchResult, list});
        }
        ArrayList<com.taobao.search.sf.widgets.preposefilter.a> arrayList = new ArrayList<>();
        if (e()) {
            a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "data");
            if (a2 == null && (a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "sortTagData")) == null) {
                return arrayList;
            }
        } else {
            a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "data");
            if (a2 == null) {
                return arrayList;
            }
        }
        q.a((Object) a2, "if (isNewLogicEnable())\n… \"data\") ?: return result");
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            com.taobao.search.sf.widgets.preposefilter.a b2 = b(a2.getJSONObject(i), commonSearchResult, list);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    private final com.taobao.search.sf.widgets.preposefilter.a b(JSONObject jSONObject, CommonSearchResult commonSearchResult, List<String> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.sf.widgets.preposefilter.a) ipChange.ipc$dispatch("b2596d1a", new Object[]{this, jSONObject, commonSearchResult, list});
        }
        if (jSONObject == null) {
            return null;
        }
        com.taobao.search.sf.widgets.preposefilter.a aVar = new com.taobao.search.sf.widgets.preposefilter.a();
        aVar.a(jSONObject.getString("type"));
        if (e() && q.a((Object) jSONObject.getString("leftBar"), (Object) "1")) {
            aVar.a("leftBar");
            aVar.b(jSONObject);
        }
        if (e()) {
            aVar.l(jSONObject.getString("filterType"));
            aVar.m(jSONObject.getString("mode"));
        }
        aVar.b(jSONObject.getString("showText"));
        aVar.a(jSONObject.getBooleanValue(gbk.TYPE_SELECTED));
        aVar.a(b(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "params")));
        aVar.d(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "scrollTop", false));
        JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "subList");
        if (b2 != null) {
            b bVar = new b();
            String string = jSONObject.getString("mode");
            if (string == null) {
                string = PromotionFilterBean.MULTI;
            }
            bVar.b(string);
            String string2 = b2.getString("tItemType");
            if (string2 == null) {
                string2 = "";
            }
            bVar.a(string2);
            bVar.a(a(com.taobao.android.searchbaseframe.util.a.a(b2, "data")));
            aVar.a(bVar);
            if (e() && bVar.b().isEmpty()) {
                aVar.a((b) null);
            }
        }
        JSONObject b3 = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "style");
        aVar.a(b3);
        if (b3 != null) {
            if (e() && b3.containsKey("textColor")) {
                aVar.c(b3.getString("textColor"));
                aVar.d(b3.getString(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR));
            } else {
                aVar.c(b3.getString("normalTextColor"));
            }
            aVar.d(b3.getString("normalBgColor"));
            aVar.e(b3.getString("normalBorderColor"));
            aVar.f(b3.getString("selectedTextColor"));
            aVar.g(b3.getString("selectedBgColor"));
            aVar.h(b3.getString("selectedBorderColor"));
            aVar.i(b3.getString("icon"));
            aVar.c(b3.getBooleanValue("bold"));
            aVar.j(b3.getString("normalImgUrl"));
            aVar.k(b3.getString("selectedImgUrl"));
            aVar.b(Integer.valueOf(b3.getIntValue("imgHeight")));
            aVar.a(Integer.valueOf(b3.getIntValue("imgWidth")));
            aVar.a(j.a(g.b(b3.getString("iconSize"), 0) / 2.0f));
        }
        aVar.b(a(com.taobao.android.searchbaseframe.util.a.b(jSONObject, "traceMap")));
        JSONObject b4 = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "dropBean");
        if (b4 != null) {
            aVar.a((WeexBean) f19574a.a(b4, commonSearchResult));
        }
        BEAN a2 = b.a(jSONObject, commonSearchResult);
        if (a2 == 0) {
            q.a();
        }
        aVar.a((MuiseBean) a2);
        JSONObject jSONObject2 = aVar.s().model;
        q.a((Object) jSONObject2, "buttonBean.muiseBean.model");
        jSONObject2.put((JSONObject) noa.KEY_MULTI_VALUE_KEYS, (String) list);
        MuiseBean s = aVar.s();
        b f = aVar.f();
        if (f == null || (str = f.a()) == null) {
            str = "";
        }
        s.type = str;
        return aVar;
    }

    private final List<c> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9355ab7", new Object[]{this, jSONArray});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.isEmpty()) {
            return arrayList;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            c c = c(jSONArray.getJSONObject(i));
            if (c != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    private final c c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("1bdffce7", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        c cVar = new c();
        cVar.a(jSONObject.getString("showText"));
        cVar.b(jSONObject.getString("tailText"));
        cVar.d(jSONObject.getString("promptText"));
        cVar.c(jSONObject.getString("topText"));
        cVar.a(jSONObject.getBooleanValue(gbk.TYPE_SELECTED));
        cVar.e(jSONObject.getString("icon"));
        cVar.f(jSONObject.getString("h5Url"));
        cVar.g(jSONObject.getString("type"));
        cVar.a(b(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "params")));
        cVar.a(a(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "subData")));
        cVar.b(d(jSONObject));
        cVar.b(a(com.taobao.android.searchbaseframe.util.a.b(jSONObject, "traceMap")));
        return cVar;
    }

    private final Map<String, String> b(JSONArray jSONArray) {
        String string;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3142d986", new Object[]{this, jSONArray});
        }
        HashMap hashMap = new HashMap();
        if (jSONArray == null) {
            return hashMap;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null && (string = jSONObject.getString("key")) != null && (string2 = jSONObject.getString("value")) != null) {
                hashMap.put(string, string2);
            }
        }
        return hashMap;
    }

    private final List<String> d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e7176a42", new Object[]{this, jSONObject});
        }
        JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "tag");
        if (a2 == null || a2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            String string = a2.getString(i);
            if (!StringUtils.isEmpty(string)) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1594061784);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(2142648544);
        Companion = new a(null);
        f19574a = new com.taobao.android.searchbaseframe.nx3.bean.c();
        b = new com.taobao.android.searchbaseframe.nx3.bean.a();
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c;
    }
}
