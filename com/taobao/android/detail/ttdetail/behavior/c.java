package com.taobao.android.detail.ttdetail.behavior;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.utils.bq;
import com.taobao.android.detail.ttdetail.utils.i;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NAVI_BAR_CART = "click_cart";
    public static final String ACTION_NAVI_BAR_COLLECT = "click_collect";
    public static final String ACTION_NAVI_BAR_MORE = "click_more";
    public static final String ACTION_NAVI_BAR_SEARCH = "click_search";
    public static final String ACTION_NAVI_BAR_SHARE = "click_share";
    public static final String COMPONENT_NAME_GALLERY_CONTAINER = "GalleryContainer";
    public static final String COMPONENT_NAME_NAVI_BAR = "NaviBar";

    static {
        kge.a(-937616598);
    }

    public static boolean a(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6367f77", new Object[]{jSONArray, new Integer(i)})).booleanValue();
        }
        if (jSONArray != null && jSONArray.size() > 0) {
            return TextUtils.equals(a.e(i), jSONArray.getJSONObject(jSONArray.size() - 1).getString("behavior_type"));
        }
        return false;
    }

    public static void a(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae83f93b", new Object[]{context, dVar});
            return;
        }
        e(context, dVar);
        b(context, dVar);
        c(context, dVar);
        d(context, dVar);
    }

    private static void e(Context context, d dVar) {
        JSONObject d;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e35af3f", new Object[]{context, dVar});
        } else if ("detail3GoodsTag".equalsIgnoreCase(bq.b(dVar)) && (d = dVar.getComponentData().d()) != null && !d.isEmpty() && (jSONArray = d.getJSONArray("tags")) != null && !jSONArray.isEmpty()) {
            try {
                JSONArray jSONArray2 = new JSONArray(jSONArray.size());
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null && !jSONObject.isEmpty()) {
                        final String string = jSONObject.getString("text");
                        if (!TextUtils.isEmpty(string)) {
                            jSONArray2.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils$1
                                {
                                    put("text", (Object) string);
                                }
                            });
                        }
                    }
                }
                if (jSONArray2.isEmpty()) {
                    return;
                }
                b.a(context, "detail3GoodsTag", "tags", jSONArray2);
            } catch (Throwable th) {
                i.a("UserBehaviorUtils", "put detail3GoodsTag tags error", th);
            }
        }
    }

    private static void b(Context context, d dVar) {
        JSONObject d;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667066bc", new Object[]{context, dVar});
        } else if ("detail3GoodsTagAdjusted".equalsIgnoreCase(bq.b(dVar)) && (d = dVar.getComponentData().d()) != null && !d.isEmpty() && (jSONArray = d.getJSONArray("tags")) != null && !jSONArray.isEmpty()) {
            try {
                JSONArray jSONArray2 = new JSONArray(jSONArray.size());
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null && !jSONObject.isEmpty()) {
                        final String string = jSONObject.getString("text");
                        if (!TextUtils.isEmpty(string)) {
                            jSONArray2.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils$2
                                {
                                    put("text", (Object) string);
                                }
                            });
                        }
                    }
                }
                if (jSONArray2.isEmpty()) {
                    return;
                }
                b.a(context, "detail3GoodsTagAdjusted", "tags", jSONArray2);
            } catch (Throwable th) {
                i.a("UserBehaviorUtils", "put detail3GoodsTagAdjusted tags error", th);
            }
        }
    }

    private static void c(Context context, d dVar) {
        JSONObject d;
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5cd43d", new Object[]{context, dVar});
        } else if (!"detail3Service".equalsIgnoreCase(bq.b(dVar)) || (d = dVar.getComponentData().d()) == null || d.isEmpty() || (jSONObject = d.getJSONObject("group")) == null || jSONObject.isEmpty() || (jSONArray = jSONObject.getJSONArray("items")) == null || jSONArray.isEmpty()) {
        } else {
            try {
                JSONArray jSONArray2 = jSONArray.getJSONObject(0).getJSONArray("values");
                if (jSONArray2 == null || jSONArray2.isEmpty()) {
                    return;
                }
                b.a(context, "detail3Service", "values", jSONArray2);
            } catch (Throwable th) {
                i.a("UserBehaviorUtils", "put detail3Service values error", th);
            }
        }
    }

    private static void d(Context context, d dVar) {
        JSONObject d;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64941be", new Object[]{context, dVar});
        } else if ("detail3Comment".equalsIgnoreCase(bq.b(dVar)) && (d = dVar.getComponentData().d()) != null && !d.isEmpty() && (jSONArray = d.getJSONArray("keywords")) != null && !jSONArray.isEmpty()) {
            try {
                JSONArray jSONArray2 = new JSONArray(jSONArray.size());
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null && !jSONObject.isEmpty()) {
                        final String string = jSONObject.getString("word");
                        if (!TextUtils.isEmpty(string)) {
                            jSONArray2.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils$3
                                {
                                    put("word", (Object) string);
                                }
                            });
                        }
                    }
                }
                if (jSONArray2.isEmpty()) {
                    return;
                }
                b.a(context, "detail3Comment", "keywords", jSONArray2);
            } catch (Throwable th) {
                i.a("UserBehaviorUtils", "put detail3Comment keywords error", th);
            }
        }
    }
}
