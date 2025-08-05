package com.taobao.android.detail.ttdetail.data.converter;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.DiversionNode;
import com.taobao.android.detail.ttdetail.data.converter.a;
import com.taobao.android.detail.ttdetail.utils.g;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.l;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.dwy;
import tb.kge;
import tb.kqw;
import tb.kvt;
import tb.ocg;
import tb.onk;
import tb.qpk;

/* loaded from: classes4.dex */
public class DetailV3Converter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_CARD = 1;
    public static final int TYPE_MASK = 1;
    public static final int TYPE_NONE = 0;
    public static final String ULTRON_BOTTOM_BAR = "bottomBar";

    /* renamed from: a  reason: collision with root package name */
    private static final JSONObject f10597a;
    private static final JSONObject b;
    private static final JSONObject c;
    private static final JSONObject d;
    private static final JSONObject e;
    private static final List<String> f;
    private static final String g = "both";
    private static final String h = "top";
    private static final String i = "bottom";
    private static final String j = "none";
    private static final JSONObject k;
    private static final JSONObject l;

    /* renamed from: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter$15  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static class AnonymousClass15 extends JSONObject {
        public final /* synthetic */ String val$descRenderType;
        public final /* synthetic */ JSONObject val$mergedData;

        public AnonymousClass15(String str, JSONObject jSONObject) {
            this.val$descRenderType = str;
            this.val$mergedData = jSONObject;
            put("id", (Object) UUID.randomUUID().toString());
            put("type", (Object) this.val$descRenderType);
            put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.15.1
                {
                    put("bizId", "desc");
                    put("payload", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.15.1.1
                        {
                            JSONObject jSONObject2 = AnonymousClass15.this.val$mergedData.getJSONObject("item");
                            JSONObject jSONObject3 = AnonymousClass15.this.val$mergedData.getJSONObject("seller");
                            put("itemId", (Object) jSONObject2.getString("itemId"));
                            put("moduleDescParams", (Object) jSONObject2.getJSONObject("moduleDescParams"));
                            put("shopId", (Object) jSONObject3.getString("shopId"));
                            put("taobaoDescUrl", (Object) jSONObject2.getString("taobaoDescUrl"));
                            put("taobaoPcDescUrl", (Object) jSONObject2.getString("taobaoPcDescUrl"));
                            put("userId", (Object) jSONObject3.getString("userId"));
                        }
                    });
                }
            });
        }
    }

    /* renamed from: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter$25  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static class AnonymousClass25 extends JSONObject {
        public final /* synthetic */ JSONArray val$children;
        public final /* synthetic */ String val$current;

        public AnonymousClass25(String str, JSONArray jSONArray) {
            this.val$current = str;
            this.val$children = jSONArray;
            put("component", (Object) ("native$" + this.val$current));
            put("children", (Object) this.val$children);
        }
    }

    /* renamed from: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter$26  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static class AnonymousClass26 extends ArrayList<String> {
        public final /* synthetic */ String val$current;

        public AnonymousClass26(String str) {
            this.val$current = str;
            add(this.val$current);
        }
    }

    /* renamed from: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter$27  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static class AnonymousClass27 implements a.InterfaceC0414a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f10601a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ JSONObject c;

        @Override // com.taobao.android.detail.ttdetail.data.converter.a.InterfaceC0414a
        public void a(final String str, JSONObject jSONObject, JSONObject jSONObject2, List<String> list, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4149f920", new Object[]{this, str, jSONObject, jSONObject2, list, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            jSONObject.put("id", (Object) UUID.randomUUID().toString());
            DetailV3Converter.a(jSONObject, list);
            DetailV3Converter.b(jSONObject, str);
            final String string = jSONObject.getString("type");
            this.f10601a.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.27.1
                {
                    put("component", (Object) string);
                    put("props", (Object) ("$model." + str));
                }
            });
            this.b.put(string, (Object) jSONObject2);
            this.c.put(str, (Object) jSONObject);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface LayoutType {
    }

    public static boolean a(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i2)})).booleanValue() : (i2 & 1) == 1;
    }

    public static /* synthetic */ JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]) : l;
    }

    public static /* synthetic */ void a(JSONObject jSONObject, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a499e8", new Object[]{jSONObject, new Integer(i2), new Integer(i3)});
        } else {
            b(jSONObject, i2, i3);
        }
    }

    public static /* synthetic */ void a(JSONObject jSONObject, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("883d7879", new Object[]{jSONObject, list});
        } else {
            b(jSONObject, list);
        }
    }

    public static /* synthetic */ void b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493da631", new Object[]{jSONObject, str});
        } else {
            e(jSONObject, str);
        }
    }

    public static /* synthetic */ String d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8412491", new Object[]{jSONObject, str}) : c(jSONObject, str);
    }

    static {
        kge.a(1264818929);
        l = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.1
            {
                put("native$descSuffixShrink", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.1.1
                    {
                        put("name", "descSuffixShrink");
                        put("type", "native");
                        put("version", "0");
                        put("url", "");
                    }
                });
            }
        };
        k = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.2
            {
                put("native$_industry_divider_", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.2.1
                    {
                        put("name", kqw.NAME);
                        put("type", "native");
                        put("version", "0");
                        put("url", "");
                    }
                });
            }
        };
        f10597a = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.3
            {
                put("native$headerPic", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.3.1
                    {
                        put("name", "headerPic");
                        put("type", "native");
                        put("version", "0");
                        put("url", "");
                    }
                });
            }
        };
        b = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.4
            {
                put("native$navBar", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.4.1
                    {
                        put("name", "navBar");
                        put("type", "native");
                        put("version", "0");
                        put("url", "");
                    }
                });
            }
        };
        c = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.5
            {
                put("native$division", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.5.1
                    {
                        put("name", onk.NAME);
                        put("type", "native");
                        put("version", "0");
                        put("url", "");
                    }
                });
            }
        };
        d = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.6
            {
                put("native$detaildesc", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.6.1
                    {
                        put("name", ocg.NAME);
                        put("type", "native");
                        put("version", "0");
                        put("url", "");
                    }
                });
            }
        };
        e = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.7
            {
                put("native$guessyoulike", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.7.1
                    {
                        put("name", kvt.NAME);
                        put("type", "native");
                        put("version", "0");
                        put("url", "");
                    }
                });
            }
        };
        f = new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.8
            {
                add("apiStack");
            }
        };
    }

    public static boolean h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba943e5", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("components");
            JSONObject jSONObject3 = jSONObject.getJSONObject("layoutInfo");
            JSONObject jSONObject4 = jSONObject.getJSONObject("meta");
            JSONObject jSONObject5 = jSONObject.getJSONObject("model");
            if (jSONObject2 != null && !jSONObject2.isEmpty() && jSONObject3 != null && !jSONObject3.isEmpty() && jSONObject4 != null && !jSONObject4.isEmpty() && jSONObject5 != null && !jSONObject5.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject) {
        JSONObject e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null && (e2 = g.e(jSONObject)) != null && !e2.isEmpty()) {
            JSONObject jSONObject2 = e2.getJSONObject("components");
            JSONObject jSONObject3 = e2.getJSONObject("layoutInfo");
            JSONObject jSONObject4 = e2.getJSONObject("meta");
            JSONObject jSONObject5 = e2.getJSONObject("model");
            if (jSONObject2 != null && !jSONObject2.isEmpty() && jSONObject3 != null && !jSONObject3.isEmpty() && jSONObject4 != null && !jSONObject4.isEmpty() && jSONObject5 != null && !jSONObject5.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("265ed169", new Object[]{jSONObject})).booleanValue() : jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("feature")) != null && !jSONObject2.isEmpty() && jSONObject2.getBooleanValue("finalUltron") && !jSONObject2.getBooleanValue(dwy.KEY_DETAIL);
    }

    public static boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            i.a("DetailV3Converter", "mergedData is null");
            return false;
        } else if (a(jSONObject)) {
            return true;
        } else {
            if (Boolean.FALSE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sForceConvertUltron))) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
                if (jSONObject2 == null || jSONObject2.isEmpty()) {
                    i.a("DetailV3Converter", "feature节点为空");
                    return false;
                } else if (!jSONObject2.getBooleanValue("finalUltron") && !jSONObject2.getBooleanValue(dwy.KEY_DETAIL)) {
                    i.a("DetailV3Converter", "不是行业化且不是详情3.0");
                    return false;
                }
            }
            JSONObject e2 = g.e(jSONObject);
            if (e2 == null || e2.isEmpty()) {
                i.a("DetailV3Converter", "esi动态数据为空");
                return false;
            }
            JSONObject jSONObject3 = e2.getJSONObject("hierarchy");
            if (jSONObject3 == null || jSONObject3.isEmpty()) {
                i.a("DetailV3Converter", "hierarchy节点为空");
                return false;
            }
            JSONObject jSONObject4 = jSONObject3.getJSONObject("structure");
            if (jSONObject4 == null || jSONObject4.isEmpty()) {
                i.a("DetailV3Converter", "structure节点为空");
                return false;
            }
            JSONObject jSONObject5 = e2.getJSONObject("data");
            if (jSONObject5 == null || jSONObject5.isEmpty()) {
                i.a("DetailV3Converter", "data节点为空");
                return false;
            }
            JSONObject jSONObject6 = e2.getJSONObject("container");
            if (jSONObject6 == null || jSONObject6.isEmpty()) {
                i.a("DetailV3Converter", "container节点为空");
                return false;
            }
            JSONArray jSONArray = jSONObject6.getJSONArray("data");
            if (jSONArray == null || jSONArray.isEmpty()) {
                i.a("DetailV3Converter", "container.data节点为空");
                return false;
            }
            if (Boolean.FALSE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sForceConvertUltron))) {
                JSONObject jSONObject7 = jSONObject.getJSONObject("feature");
                if ((!e(jSONObject5) || !Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sForceConvertIndustryHeader))) && (!f(e2) || jSONObject7 == null || !jSONObject7.getBooleanValue("detail3HeadPic"))) {
                    i.a("DetailV3Converter", "不是行业化奥创头图且新头图节点没有数据");
                    return false;
                }
            }
            if (!d(jSONObject) || !Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sDowngradeIndustry))) {
                return true;
            }
            i.a("DetailV3Converter", "非详情3.0的行业化降级");
            return false;
        }
    }

    private static boolean e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87b16e08", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("headerPic");
        return jSONObject3 != null && !jSONObject3.isEmpty() && (jSONObject2 = jSONObject.getJSONObject("mainContainer")) != null && !jSONObject2.isEmpty();
    }

    private static boolean f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9040aa7", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("model");
        return jSONObject3 != null && !jSONObject3.isEmpty() && (jSONObject2 = jSONObject3.getJSONObject("headerPic")) != null && !jSONObject2.isEmpty();
    }

    public static JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{jSONObject});
        }
        if (!b(jSONObject)) {
            return jSONObject;
        }
        JSONObject e2 = g.e(jSONObject);
        JSONObject jSONObject2 = e2.getJSONObject("components");
        JSONObject jSONObject3 = e2.getJSONObject("layoutInfo");
        JSONObject jSONObject4 = e2.getJSONObject("model");
        JSONObject jSONObject5 = e2.getJSONObject("meta");
        if (a(jSONObject)) {
            return jSONObject;
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            e2.put("components", (Object) jSONObject2);
        }
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
            e2.put("model", (Object) jSONObject4);
        }
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
            e2.put("layoutInfo", (Object) jSONObject3);
        }
        if (jSONObject5 == null) {
            jSONObject5 = new JSONObject();
            e2.put("meta", (Object) jSONObject5);
        }
        a(jSONObject, e2, jSONObject2, jSONObject3, jSONObject4);
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!f.contains(entry.getKey())) {
                jSONObject5.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9c3388", new Object[]{jSONObject, jSONObject2, jSONObject3, jSONObject4, jSONObject5});
            return;
        }
        JSONObject jSONObject6 = jSONObject2.getJSONObject("hierarchy");
        a(jSONObject, jSONObject2, jSONObject6.getString("root"), jSONObject6.getJSONObject("structure"), jSONObject2.getJSONObject("data"), jSONObject2.getJSONObject("container").getJSONArray("data"), jSONObject3, jSONObject4, jSONObject5);
    }

    private static void b(JSONObject jSONObject, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a258f718", new Object[]{jSONObject, list});
        } else if (jSONObject == null) {
        } else {
            if (list == null) {
                list = new ArrayList<>(0);
            }
            jSONObject.put("_parent_", (Object) JSONArray.toJSONString(list));
        }
    }

    private static void e(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce09ece", new Object[]{jSONObject, str});
        } else if (jSONObject == null) {
        } else {
            jSONObject.put("_ultron_name_", (Object) str);
        }
    }

    private static boolean g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a56a746", new Object[]{jSONObject})).booleanValue();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ttNaviBar");
        return jSONArray != null && !jSONArray.isEmpty();
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2, String str, JSONObject jSONObject3, JSONObject jSONObject4, JSONArray jSONArray, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af6e3d6", new Object[]{jSONObject, jSONObject2, str, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7});
            return;
        }
        JSONArray jSONArray2 = jSONObject3.getJSONArray(str);
        boolean g2 = g(jSONObject3);
        int size = jSONArray2.size();
        int i4 = 0;
        while (i4 < size) {
            String string = jSONArray2.getString(i4);
            if (!TextUtils.isEmpty(string)) {
                char c2 = 65535;
                switch (string.hashCode()) {
                    case -1855408664:
                        if (string.equals("bottomBar")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -1036652336:
                        if (string.equals("detailHome")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 149310114:
                        if (string.equals("detailInfoAura")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 191256557:
                        if (string.equals("ttNaviBar")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1730354829:
                        if (string.equals("naviBar")) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    i2 = i4;
                    i3 = size;
                    if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sForceConvertUltron))) {
                        a(jSONObject, string, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7);
                    }
                } else if (c2 == 1) {
                    i2 = i4;
                    i3 = size;
                    a(d(jSONObject), jSONObject2, string, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7);
                } else if (c2 == 2) {
                    i2 = i4;
                    i3 = size;
                    b(string, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7);
                } else if (c2 == 3) {
                    i2 = i4;
                    i3 = size;
                    c(jSONObject, jSONObject2, string, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7);
                } else if (c2 == 4 && !g2) {
                    i2 = i4;
                    i3 = size;
                    b(jSONObject, jSONObject2, string, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7);
                }
                i4 = i2 + 1;
                size = i3;
            }
            i2 = i4;
            i3 = size;
            i4 = i2 + 1;
            size = i3;
        }
    }

    private static void a(JSONObject jSONObject, final String str, JSONObject jSONObject2, JSONObject jSONObject3, JSONArray jSONArray, final JSONObject jSONObject4, JSONObject jSONObject5, final JSONObject jSONObject6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778f34b6", new Object[]{jSONObject, str, jSONObject2, jSONObject3, jSONArray, jSONObject4, jSONObject5, jSONObject6});
            return;
        }
        jSONObject4.putAll(f10597a);
        jSONObject5.put("headerPic", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.9
            {
                put("component", "native$headerPic");
                put("props", "$model.headerPic");
            }
        });
        b.a(jSONObject, jSONObject4, jSONObject6);
        final JSONArray jSONArray2 = new JSONArray();
        jSONObject5.put("mainScreen", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.10
            {
                put("component", "native$mainScreen");
                put("children", (Object) JSONArray.this);
            }
        });
        JSONArray jSONArray3 = jSONObject2.getJSONArray(str);
        a(true, str, Collections.singletonList("detailHeaderPic"), jSONObject2, jSONObject3, jSONArray, false, new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.11
            {
                add(str);
            }
        }, 0, 0, (jSONArray3 == null || jSONArray3.isEmpty()) ? 1 : jSONArray3.size(), new a.InterfaceC0414a() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.data.converter.a.InterfaceC0414a
            public void a(final String str2, JSONObject jSONObject7, JSONObject jSONObject8, List<String> list, int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4149f920", new Object[]{this, str2, jSONObject7, jSONObject8, list, new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                jSONObject7.put("id", (Object) UUID.randomUUID().toString());
                DetailV3Converter.a(jSONObject7, list);
                DetailV3Converter.b(jSONObject7, str2);
                final String string = jSONObject7.getString("type");
                JSONArray.this.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.12.1
                    {
                        put("component", (Object) string);
                        put("props", (Object) ("$model." + str2));
                    }
                });
                jSONObject4.put(string, (Object) jSONObject8);
                jSONObject6.put(str2, (Object) jSONObject7);
            }
        });
        jSONObject4.putAll(c);
        JSONObject jSONObject7 = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.13
            {
                put("id", (Object) UUID.randomUUID().toString());
                put("type", (Object) r2);
                put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.13.1
                    {
                        put("bizId", "desc");
                        put("payload", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.13.1.1
                            {
                                put("displayType", "text");
                                put("fgcolor", "0x666666");
                                put("title", "宝贝详情");
                            }
                        });
                    }
                });
            }
        };
        e(jSONObject7, "divisionDesc");
        jSONObject5.put("divisionDesc", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.14
            {
                put("component", (Object) r2);
                put("props", "$model.divisionDesc");
            }
        });
        jSONObject6.put("divisionDesc", (Object) jSONObject7);
        jSONObject4.putAll(d);
        AnonymousClass15 anonymousClass15 = new AnonymousClass15("native$detaildesc", jSONObject);
        e(anonymousClass15, "description");
        jSONObject5.put("description", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.16
            {
                put("component", (Object) r2);
                put("props", "$model.description");
            }
        });
        jSONObject6.put("description", (Object) anonymousClass15);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void a(boolean z, JSONObject jSONObject, String str, JSONObject jSONObject2, JSONObject jSONObject3, JSONArray jSONArray, final JSONObject jSONObject4, JSONObject jSONObject5, final JSONObject jSONObject6) {
        int i2;
        int i3;
        JSONArray jSONArray2;
        char c2;
        JSONObject jSONObject7 = jSONObject4;
        JSONObject jSONObject8 = jSONObject5;
        JSONObject jSONObject9 = jSONObject6;
        IpChange ipChange = $ipChange;
        char c3 = 4;
        char c4 = 3;
        char c5 = 2;
        char c6 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a55fba", new Object[]{new Boolean(z), jSONObject, str, jSONObject2, jSONObject3, jSONArray, jSONObject7, jSONObject8, jSONObject9});
            return;
        }
        JSONArray jSONArray3 = jSONObject2.getJSONArray(str);
        boolean f2 = f(jSONObject);
        int size = jSONArray3.size();
        int i4 = 0;
        while (i4 < size) {
            final String string = jSONArray3.getString(i4);
            if (!TextUtils.isEmpty(string)) {
                switch (string.hashCode()) {
                    case -1194473495:
                        if (string.equals(com.taobao.android.detail.ttdetail.constant.a.DIVISION_RECOMMEND)) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1036780926:
                        if (string.equals("detailDesc")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -715070901:
                        if (string.equals("divisonDesc")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 149310114:
                        if (string.equals("detailInfoAura")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1470195222:
                        if (string.equals("descRecmd")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 != 0) {
                    if (c2 == c6) {
                        i2 = i4;
                        i3 = size;
                        jSONArray2 = jSONArray3;
                        jSONObject7.putAll(c);
                        a("divisionDesc", string, jSONObject2, jSONObject3, jSONArray, jSONObject4, jSONObject5, jSONObject6, true);
                    } else if (c2 == c5) {
                        i2 = i4;
                        i3 = size;
                        jSONArray2 = jSONArray3;
                        jSONObject7.putAll(d);
                        a("description", string, jSONObject2, jSONObject3, jSONArray, jSONObject4, jSONObject5, jSONObject6, true);
                    } else if (c2 == c4) {
                        i2 = i4;
                        i3 = size;
                        jSONArray2 = jSONArray3;
                        jSONObject7.putAll(c);
                        a(qpk.KEY_DIVISION_RECOMMEND, string, jSONObject2, jSONObject3, jSONArray, jSONObject4, jSONObject5, jSONObject6, true);
                    } else if (c2 == c3) {
                        jSONObject7.putAll(e);
                        i2 = i4;
                        i3 = size;
                        jSONArray2 = jSONArray3;
                        a("recommend", string, jSONObject2, jSONObject3, jSONArray, jSONObject4, jSONObject5, jSONObject6, true);
                    }
                    i4 = i2 + 1;
                    jSONObject7 = jSONObject4;
                    jSONObject8 = jSONObject5;
                    jSONObject9 = jSONObject6;
                    size = i3;
                    jSONArray3 = jSONArray2;
                    c6 = 1;
                    c5 = 2;
                    c4 = 3;
                    c3 = 4;
                } else {
                    i2 = i4;
                    i3 = size;
                    jSONArray2 = jSONArray3;
                    jSONObject7.putAll(f10597a);
                    jSONObject8.put("headerPic", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.17
                        {
                            put("component", "native$headerPic");
                            put("props", "$model.headerPic");
                        }
                    });
                    if (!f2) {
                        a.a(jSONObject2, jSONObject3, jSONArray, jSONObject7, jSONObject9);
                    }
                    jSONObject7.putAll(k);
                    jSONObject9.put(kqw.NAME, (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.18
                        {
                            put("type", "native$_industry_divider_");
                            put("fields", (Object) new JSONObject());
                        }
                    });
                    final JSONObject jSONObject10 = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.19
                        {
                            put("component", "native$_industry_divider_");
                            put("props", "$model._industry_divider_");
                        }
                    };
                    final JSONArray jSONArray4 = new JSONArray();
                    jSONObject8.put("mainScreen", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.20
                        {
                            put("component", "native$mainScreen");
                            put("children", (Object) JSONArray.this);
                        }
                    });
                    final boolean[] zArr = new boolean[1];
                    JSONArray jSONArray5 = jSONObject2.getJSONArray(str);
                    a(true, string, Collections.singletonList("detailHeaderPic"), jSONObject2, jSONObject3, jSONArray, false, new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.21
                        {
                            add(string);
                        }
                    }, 0, 0, (jSONArray5 == null || jSONArray5.isEmpty()) ? 1 : jSONArray5.size(), new a.InterfaceC0414a() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.22
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.detail.ttdetail.data.converter.a.InterfaceC0414a
                        public void a(final String str2, JSONObject jSONObject11, JSONObject jSONObject12, List<String> list, int i5, int i6, int i7) {
                            IpChange ipChange2 = $ipChange;
                            boolean z2 = true;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("4149f920", new Object[]{this, str2, jSONObject11, jSONObject12, list, new Integer(i5), new Integer(i6), new Integer(i7)});
                                return;
                            }
                            jSONObject11.put("id", (Object) UUID.randomUUID().toString());
                            boolean a2 = DetailV3Converter.a(i5);
                            if (a2) {
                                DetailV3Converter.a(jSONObject11, i6, i7);
                                if (i6 == 0) {
                                    JSONArray.this.add(jSONObject10);
                                }
                            }
                            boolean[] zArr2 = zArr;
                            if (!a2 || i6 != i7 - 1) {
                                z2 = false;
                            }
                            zArr2[0] = z2;
                            DetailV3Converter.a(jSONObject11, list);
                            DetailV3Converter.b(jSONObject11, str2);
                            final String string2 = jSONObject11.getString("type");
                            JSONArray.this.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.22.1
                                {
                                    put("component", (Object) string2);
                                    put("props", (Object) ("$model." + str2));
                                }
                            });
                            jSONObject4.put(string2, (Object) jSONObject12);
                            jSONObject6.put(str2, (Object) jSONObject11);
                        }
                    });
                    if (zArr[0]) {
                        jSONArray4.add(jSONObject10);
                    }
                    i4 = i2 + 1;
                    jSONObject7 = jSONObject4;
                    jSONObject8 = jSONObject5;
                    jSONObject9 = jSONObject6;
                    size = i3;
                    jSONArray3 = jSONArray2;
                    c6 = 1;
                    c5 = 2;
                    c4 = 3;
                    c3 = 4;
                }
            }
            i2 = i4;
            i3 = size;
            jSONArray2 = jSONArray3;
            i4 = i2 + 1;
            jSONObject7 = jSONObject4;
            jSONObject8 = jSONObject5;
            jSONObject9 = jSONObject6;
            size = i3;
            jSONArray3 = jSONArray2;
            c6 = 1;
            c5 = 2;
            c4 = 3;
            c3 = 4;
        }
    }

    private static void b(JSONObject jSONObject, int i2, int i3) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc28ac7", new Object[]{jSONObject, new Integer(i2), new Integer(i3)});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            jSONObject.put("fields", (Object) jSONObject2);
        }
        if (i3 == 1) {
            str = g;
        } else {
            str = i2 == 0 ? h : i2 == i3 - 1 ? i : j;
        }
        jSONObject2.put("cornerType", (Object) str);
    }

    private static void a(final String str, final String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray, final JSONObject jSONObject3, final JSONObject jSONObject4, final JSONObject jSONObject5, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bfb9788", new Object[]{str, str2, jSONObject, jSONObject2, jSONArray, jSONObject3, jSONObject4, jSONObject5, new Boolean(z)});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(str2);
        a(false, str2, null, jSONObject, jSONObject2, jSONArray, z, new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.23
            {
                add(str2);
            }
        }, 0, 0, (jSONArray2 == null || jSONArray2.isEmpty()) ? 1 : jSONArray2.size(), new a.InterfaceC0414a() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.data.converter.a.InterfaceC0414a
            public void a(final String str3, JSONObject jSONObject6, JSONObject jSONObject7, List<String> list, int i2, int i3, int i4) {
                JSONObject jSONObject8;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4149f920", new Object[]{this, str3, jSONObject6, jSONObject7, list, new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                jSONObject6.put("id", (Object) UUID.randomUUID().toString());
                DetailV3Converter.a(jSONObject6, list);
                DetailV3Converter.b(jSONObject6, str3);
                final String string = jSONObject6.getString("type");
                JSONObject.this.put(str, (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.24.1
                    {
                        put("component", (Object) string);
                        put("props", (Object) ("$model." + str3));
                    }
                });
                if (!z) {
                    jSONObject3.put(string, (Object) jSONObject7);
                }
                jSONObject5.put(str3, (Object) jSONObject6);
                JSONObject jSONObject9 = jSONObject6.getJSONObject("fields");
                if (jSONObject9 == null || (jSONObject8 = jSONObject9.getJSONObject("payload")) == null) {
                    return;
                }
                boolean booleanValue = jSONObject8.getBooleanValue("shrinkPriceInfo");
                if (!TextUtils.equals("description", str) || !booleanValue) {
                    return;
                }
                JSONObject parseObject = JSONObject.parseObject(JSON.toJSONString(jSONObject6, SerializerFeature.DisableCircularReferenceDetect));
                parseObject.put("id", (Object) UUID.randomUUID().toString());
                parseObject.put("type", (Object) "native$descSuffixShrink");
                JSONObject.this.put("descSuffixShrink", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.24.2
                    {
                        put("component", (Object) r2);
                        put("props", (Object) ("$model." + r2));
                    }
                });
                jSONObject3.putAll(DetailV3Converter.a());
                jSONObject5.put("descSuffixShrink", (Object) parseObject);
            }
        });
    }

    private static void b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575f6735", new Object[]{str, jSONObject, jSONObject2, jSONArray, jSONObject3, jSONObject4, jSONObject5});
        } else {
            a("bottomBar", str, jSONObject, jSONObject2, jSONArray, jSONObject3, jSONObject4, jSONObject5, false);
        }
    }

    private static void c(final JSONObject jSONObject, final JSONObject jSONObject2, final String str, JSONObject jSONObject3, JSONObject jSONObject4, JSONArray jSONArray, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91ec7b14", new Object[]{jSONObject, jSONObject2, str, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7});
            return;
        }
        jSONObject5.putAll(b);
        jSONObject6.put("navBar", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.28
            {
                put("component", (Object) r1);
                put("props", (Object) ("$model." + r2));
            }
        });
        final JSONArray jSONArray2 = new JSONArray();
        final JSONObject jSONObject8 = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.29
            {
                put("id", (Object) UUID.randomUUID().toString());
                put("type", (Object) r1);
                final JSONObject jSONObject9 = jSONObject2.getJSONObject("anchorpoint");
                if (jSONObject9 != null) {
                    put("title", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.29.1
                        {
                            String string = jSONObject9.getString("detailExtraTitle");
                            put("detail", (Object) (TextUtils.isEmpty(string) ? jSONObject9.getString("detailTitle") : string));
                            put("content", jSONObject9.getString("contentTitle"));
                            put("shop", jSONObject9.getString("shopTitle"));
                            put(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APM_SHOP_URL, jSONObject9.getString(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APM_SHOP_URL));
                            put("isReviewPageShow", Boolean.valueOf(jSONObject9.getBooleanValue("isReviewPageShow")));
                            put("rateText", jSONObject9.getString("goodRateText"));
                            put("leftBlackPic", jSONObject9.getString("leftBlackPic"));
                            put("rightBlackPic", jSONObject9.getString("rightBlackPic"));
                            put("leftPic", jSONObject9.getString("leftPic"));
                            put("rightPic", jSONObject9.getString("rightPic"));
                        }
                    });
                }
                put("right", (Object) jSONArray2);
            }
        };
        JSONArray jSONArray3 = jSONObject3.getJSONArray(str);
        a(true, str, null, jSONObject3, jSONObject4, jSONArray, true, new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.30
            {
                add(str);
            }
        }, 0, 0, (jSONArray3 == null || jSONArray3.isEmpty()) ? 1 : jSONArray3.size(), new a.InterfaceC0414a() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.31
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.data.converter.a.InterfaceC0414a
            public void a(String str2, JSONObject jSONObject9, JSONObject jSONObject10, List<String> list, int i2, int i3, int i4) {
                final JSONObject jSONObject11;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4149f920", new Object[]{this, str2, jSONObject9, jSONObject10, list, new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                JSONObject jSONObject12 = jSONObject9.getJSONObject("fields");
                if (jSONObject12 == null || (jSONObject11 = jSONObject12.getJSONObject("payload")) == null) {
                    return;
                }
                String string = jSONObject11.getString("positionKey");
                if (TextUtils.equals("detail3NaviItemBack", str2) || TextUtils.equals("back", string)) {
                    return;
                }
                if (!TextUtils.equals("detail3NaviItemSearch", str2) && !TextUtils.equals("search", string)) {
                    jSONArray2.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.31.2
                        {
                            Object obj;
                            JSONObject jSONObject13;
                            String string2 = jSONObject11.getString("positionKey");
                            put("key", (Object) string2);
                            put("icon", jSONObject11.getString("value"));
                            put(TaoliveSearchHotWords.TYPE_HINT, jSONObject11.getString("accessHint"));
                            put("args", jSONObject11.getString("args"));
                            String string3 = jSONObject11.getString("jumpUrl");
                            put("action", (Object) (TextUtils.isEmpty(string3) ? string2 : string3));
                            if (TextUtils.equals("cart", string2)) {
                                JSONObject jSONObject14 = jSONObject.getJSONObject("trade");
                                Object obj2 = "";
                                if (jSONObject14 == null || (jSONObject13 = jSONObject14.getJSONObject("cartIcon")) == null) {
                                    obj = obj2;
                                } else {
                                    obj2 = jSONObject13.getString("showBadge");
                                    obj = jSONObject13.getString("count");
                                }
                                put("showBadge", obj2);
                                put("badge", obj);
                            }
                        }
                    });
                    return;
                }
                DetailV3Converter.a(JSONObject.this, list);
                JSONObject.this.put("search", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.31.1
                    {
                        JSONObject jSONObject13;
                        put("icon", (Object) jSONObject11.getString("value"));
                        put(TaoliveSearchHotWords.TYPE_HINT, (Object) jSONObject11.getString("accessHint"));
                        put("args", (Object) jSONObject11.getString("args"));
                        JSONObject jSONObject14 = jSONObject.getJSONObject(DiversionNode.TAG);
                        String str3 = "";
                        put("action", (Object) ((jSONObject14 == null || (jSONObject13 = jSONObject14.getJSONObject("detailTopSearch")) == null) ? str3 : jSONObject13.getString("url")));
                        JSONObject jSONObject15 = jSONObject.getJSONObject("feature");
                        put("asyncText", (Object) (jSONObject15 != null ? jSONObject15.getString("asyncLoadSearchInfo") : str3));
                    }
                });
            }
        });
        jSONObject8.put("tabs", (Object) a(jSONObject3, jSONObject4, jSONArray));
        e(jSONObject8, str);
        jSONObject7.put("nav", (Object) jSONObject8);
    }

    private static String c(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1353d90", new Object[]{jSONObject, str});
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("naviItemCustom");
        if (jSONObject4 != null && (jSONObject2 = jSONObject4.getJSONObject("events")) != null && (jSONArray = jSONObject2.getJSONArray(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS)) != null) {
            int size = jSONArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject5 = jSONArray.getJSONObject(i2);
                if (jSONObject5 != null && "open_url".equalsIgnoreCase(jSONObject5.getString("type")) && (jSONObject3 = jSONObject5.getJSONObject("fields")) != null) {
                    String string = jSONObject3.getString("url");
                    if (!TextUtils.isEmpty(string)) {
                        return l.a(string, jSONObject3.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS));
                    }
                }
            }
        }
        return str;
    }

    private static void b(final JSONObject jSONObject, final JSONObject jSONObject2, String str, JSONObject jSONObject3, final JSONObject jSONObject4, JSONArray jSONArray, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9671af75", new Object[]{jSONObject, jSONObject2, str, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7});
            return;
        }
        jSONObject5.putAll(b);
        jSONObject6.put("navBar", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.32
            {
                put("component", (Object) r1);
                put("props", (Object) ("$model." + r2));
            }
        });
        final JSONArray jSONArray2 = new JSONArray();
        JSONObject jSONObject8 = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.33
            {
                put("id", (Object) UUID.randomUUID().toString());
                put("type", (Object) r1);
                final JSONObject jSONObject9 = jSONObject2.getJSONObject("anchorpoint");
                if (jSONObject9 != null) {
                    put("title", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.33.1
                        {
                            String string = jSONObject9.getString("detailExtraTitle");
                            put("detail", (Object) (TextUtils.isEmpty(string) ? jSONObject9.getString("detailTitle") : string));
                            put("content", jSONObject9.getString("contentTitle"));
                            put("shop", jSONObject9.getString("shopTitle"));
                            put(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APM_SHOP_URL, jSONObject9.getString(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APM_SHOP_URL));
                        }
                    });
                }
                put("right", (Object) jSONArray2);
            }
        };
        jSONObject8.put("search", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.34
            {
                JSONObject jSONObject9;
                put("icon", "끺");
                put(TaoliveSearchHotWords.TYPE_HINT, "搜索");
                JSONObject jSONObject10 = JSONObject.this.getJSONObject(DiversionNode.TAG);
                String str2 = "";
                put("action", (Object) ((jSONObject10 == null || (jSONObject9 = jSONObject10.getJSONObject("detailTopSearch")) == null) ? str2 : jSONObject9.getString("url")));
                JSONObject jSONObject11 = JSONObject.this.getJSONObject("feature");
                put("asyncText", (Object) (jSONObject11 != null ? jSONObject11.getString("asyncLoadSearchInfo") : str2));
            }
        });
        for (final JSONObject jSONObject9 : new ArrayList<JSONObject>() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.35
            {
                add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.35.1
                    {
                        put("positionKey", "share");
                        put("value", "ꄪ");
                        put("accessHint", "分享");
                    }
                });
                add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.35.2
                    {
                        put("positionKey", "cart");
                        put("value", "ꁊ");
                        put("accessHint", "购物车");
                        put("jumpUrl", (Object) DetailV3Converter.d(JSONObject.this, "https://h5.m.taobao.com/awp/base/cart.htm"));
                    }
                });
                add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.35.3
                    {
                        put("positionKey", "more");
                        put("value", "ꁪ");
                        put("accessHint", "更多");
                    }
                });
            }
        }) {
            jSONArray2.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.36
                {
                    Object obj;
                    JSONObject jSONObject10;
                    String string = JSONObject.this.getString("positionKey");
                    put("key", (Object) string);
                    put("icon", JSONObject.this.getString("value"));
                    put(TaoliveSearchHotWords.TYPE_HINT, JSONObject.this.getString("accessHint"));
                    String string2 = JSONObject.this.getString("jumpUrl");
                    put("action", (Object) (TextUtils.isEmpty(string2) ? string : string2));
                    if (TextUtils.equals("cart", string)) {
                        JSONObject jSONObject11 = jSONObject.getJSONObject("trade");
                        Object obj2 = "";
                        if (jSONObject11 == null || (jSONObject10 = jSONObject11.getJSONObject("cartIcon")) == null) {
                            obj = obj2;
                        } else {
                            obj2 = jSONObject10.getString("showBadge");
                            obj = jSONObject10.getString("count");
                        }
                        put("showBadge", obj2);
                        put("badge", obj);
                    }
                }
            });
        }
        jSONObject8.put("tabs", (Object) a(jSONObject3, jSONObject4, jSONArray));
        e(jSONObject8, str);
        jSONObject7.put("nav", (Object) jSONObject8);
    }

    private static JSONArray a(JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e6cdeae", new Object[]{jSONObject, jSONObject2, jSONArray});
        }
        final JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = jSONObject.getJSONArray("naviTabs");
        a(true, "naviTabs", null, jSONObject, jSONObject2, jSONArray, true, new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.37
            {
                add("naviTabs");
            }
        }, 0, 0, (jSONArray3 == null || jSONArray3.isEmpty()) ? 1 : jSONArray3.size(), new a.InterfaceC0414a() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.38
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.data.converter.a.InterfaceC0414a
            public void a(String str, JSONObject jSONObject3, JSONObject jSONObject4, List<String> list, int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4149f920", new Object[]{this, str, jSONObject3, jSONObject4, list, new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                final JSONObject jSONObject5 = jSONObject3.getJSONObject("fields");
                JSONObject jSONObject6 = jSONObject5.getJSONObject("payload");
                if (jSONObject6 == null) {
                    return;
                }
                final String string = jSONObject6.getString("title");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                JSONArray.this.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.38.1
                    {
                        put("name", (Object) string);
                        put("targetBizId", (Object) jSONObject5.getString("targetBizId"));
                    }
                });
            }
        });
        return jSONArray2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<java.lang.String> a(boolean r28, java.lang.String r29, java.util.List<java.lang.String> r30, com.alibaba.fastjson.JSONObject r31, com.alibaba.fastjson.JSONObject r32, com.alibaba.fastjson.JSONArray r33, boolean r34, java.util.List<java.lang.String> r35, int r36, int r37, int r38, com.taobao.android.detail.ttdetail.data.converter.a.InterfaceC0414a r39) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.a(boolean, java.lang.String, java.util.List, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONArray, boolean, java.util.List, int, int, int, com.taobao.android.detail.ttdetail.data.converter.a$a):java.util.List");
    }

    public static JSONObject a(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4c39a07a", new Object[]{str, jSONArray});
        }
        int size = jSONArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            final JSONObject jSONObject = jSONArray.getJSONObject(i2);
            JSONArray jSONArray2 = jSONObject.getJSONArray("type");
            if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                int size2 = jSONArray2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (TextUtils.equals(str, jSONArray2.getString(i3))) {
                        final String string = jSONObject.getString("name");
                        final String string2 = jSONObject.getString("containerType");
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            return new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.39
                                {
                                    put("name", (Object) string);
                                    put("type", (Object) string2);
                                    put("version", (Object) jSONObject.getString("version"));
                                    put("url", (Object) jSONObject.getString("url"));
                                }
                            };
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static int a(int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i2), new Integer(i3)})).intValue() : a(i2) ? i2 : i3;
    }

    public static int a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48075345", new Object[]{jSONObject, str})).intValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            String string = jSONObject2.getString("type");
            if (!TextUtils.isEmpty(string)) {
                String[] split = string.split("\\$");
                if (split.length >= 2 && TextUtils.equals(split[0], "layout") && TextUtils.equals(split[1], "card")) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
