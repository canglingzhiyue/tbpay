package com.taobao.detail.rate.vivid.presenter;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.fjp;
import tb.fxr;
import tb.rwf;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\bH\u0002R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/detail/rate/vivid/presenter/DetailRatePresenter;", "", "()V", "headPicMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "buildDetailRateByListCache", "Lcom/alibaba/fastjson/JSONObject;", "cache", "generateItemList", "Lcom/alibaba/fastjson/JSONArray;", "rateList", "generateKeywordsByItemVOS", "imprItemVOS", "initHeadPicMap", "", "detailRate", "onBuildAppendedFeed", "itemObject", "onFindUserHead", "url", "id", "onGenerateMedia", "key", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, String> f17048a = new HashMap<>();

    public final void a(JSONObject detailRate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, detailRate});
            return;
        }
        q.d(detailRate, "detailRate");
        JSONObject a2 = fxr.a("group", detailRate, (JSONObject) null);
        if (a2 == null) {
            return;
        }
        JSONArray items = fxr.a("items", a2, (JSONArray) null);
        q.b(items, "items");
        int size = items.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = items.getJSONObject(i);
            if (jSONObject != null) {
                String feedId = fxr.a("feedId", jSONObject, "");
                String headPic = fxr.a("headPic", jSONObject, "");
                q.b(feedId, "feedId");
                q.b(headPic, "headPic");
                this.f17048a.put(feedId, headPic);
            }
        }
    }

    public final JSONObject b(JSONObject cache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{this, cache});
        }
        q.d(cache, "cache");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "arrow", "true");
        jSONObject2.put((JSONObject) "bizId", RateNode.TAG);
        jSONObject2.put((JSONObject) "disableKeywordStaticData", "false");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "rateText", "评价");
        jSONObject2.put((JSONObject) "favorableRate", (String) jSONObject3);
        jSONObject2.put((JSONObject) "locatorId", com.taobao.android.detail.ttdetail.constant.a.DIVISION_RATE);
        jSONObject2.put((JSONObject) "pageTitle", "评价");
        jSONObject2.put((JSONObject) "supportFavorableRate", "true");
        jSONObject2.put((JSONObject) "title", "评价(200+)");
        JSONArray a2 = fxr.a("imprItemVOS", cache, new JSONArray());
        q.b(a2, "JSONUtils.getJSONArray(\"…VOS\", cache, JSONArray())");
        JSONArray jSONArray = null;
        if (a2.size() > 0) {
            jSONArray = b(a2);
        }
        jSONObject2.put((JSONObject) "keywords", (String) jSONArray);
        JSONArray a3 = fxr.a("imprNewItemVOS", cache, (JSONArray) null);
        if (a3 != null && a3.size() > 0) {
            jSONObject2.put((JSONObject) "newKeywords", (String) a3);
        }
        jSONObject2.put((JSONObject) com.taobao.android.fluid.framework.data.remote.c.KEY_DATA_SOURCE, "cache");
        JSONObject jSONObject4 = new JSONObject();
        JSONObject a4 = fxr.a("extraInfo", cache, new JSONObject());
        q.b(a4, "JSONUtils.getJSONObject(…fo\", cache, JSONObject())");
        String a5 = fxr.a("showImprNewItem", a4, "false");
        String a6 = fxr.a("tabMergeImpr", a4, "false");
        String a7 = fxr.a("newRateListV2", a4, "false");
        JSONObject jSONObject5 = jSONObject4;
        jSONObject5.put((JSONObject) "showImprNewItem", a5);
        jSONObject5.put((JSONObject) "tabMergeImpr", a6);
        jSONObject5.put((JSONObject) "newRateListV2", a7);
        jSONObject2.put((JSONObject) "abInfo", (String) jSONObject4);
        JSONObject jSONObject6 = new JSONObject();
        JSONArray a8 = fxr.a("rateList", cache, new JSONArray());
        q.b(a8, "JSONUtils.getJSONArray(\"…ist\", cache, JSONArray())");
        jSONObject6.put((JSONObject) "items", (String) a(a8));
        jSONObject2.put((JSONObject) "group", (String) jSONObject6);
        return jSONObject;
    }

    private final JSONArray a(JSONArray jSONArray) {
        a aVar = this;
        JSONArray jSONArray2 = jSONArray;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b36fc2ae", new Object[]{aVar, jSONArray2});
        }
        JSONArray jSONArray3 = new JSONArray();
        if (jSONArray.size() > 0) {
            int d = rwf.d(2, jSONArray.size());
            while (i < d) {
                JSONObject jSONObject = new JSONObject();
                JSONObject itemObject = jSONArray2.getJSONObject(i);
                String a2 = fxr.a("id", itemObject, "");
                String a3 = fxr.a("feedback", itemObject, "");
                String a4 = fxr.a("feedbackDate", itemObject, "");
                String a5 = fxr.a("headPicUrl", itemObject, "");
                String a6 = fxr.a("skuValueStr", itemObject, "");
                String a7 = fxr.a("userNick", itemObject, "");
                String a8 = fxr.a("userStarPic", itemObject, "");
                String a9 = fxr.a("creditLevel", itemObject, "");
                int i2 = d;
                q.b(itemObject, "itemObject");
                JSONArray a10 = aVar.a("feedPicList", itemObject);
                int i3 = i;
                JSONArray jSONArray4 = jSONArray3;
                JSONArray a11 = fxr.a("userTagList", itemObject, new JSONArray());
                String a12 = fxr.a("createTimeInterval", itemObject, "");
                JSONObject c = aVar.c(itemObject);
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "feedId", a2);
                jSONObject2.put((JSONObject) "content", a3);
                jSONObject2.put((JSONObject) "dateTime", a4);
                jSONObject2.put((JSONObject) "headPic", a5);
                jSONObject2.put((JSONObject) "skuInfo", a6);
                jSONObject2.put((JSONObject) "userName", a7);
                jSONObject2.put((JSONObject) "userStarPic", a8);
                jSONObject2.put((JSONObject) "memberLevel", a9);
                jSONObject2.put((JSONObject) fjp.SCENE_MEDIA_PLAYER, (String) a10);
                jSONObject2.put((JSONObject) "userTagList", (String) a11);
                jSONObject2.put((JSONObject) "timeInterval", a12);
                if (c != null) {
                    jSONObject2.put((JSONObject) "appendedFeed", (String) c);
                }
                jSONArray4.add(jSONObject);
                i = i3 + 1;
                jSONArray2 = jSONArray;
                jSONArray3 = jSONArray4;
                d = i2;
                aVar = this;
            }
        }
        return jSONArray3;
    }

    private final JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        JSONObject a2 = fxr.a("appendedFeed", jSONObject, new JSONObject());
        q.b(a2, "JSONUtils.getJSONObject(…   JSONObject()\n        )");
        if (a2.size() <= 0) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray a3 = a("appendFeedPicList", a2);
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "content", fxr.a("appendedFeedback", a2, ""));
        jSONObject3.put((JSONObject) "dateTime", fxr.a("createTime", a2, ""));
        jSONObject3.put((JSONObject) "timeInterval", fxr.a("createTimeInterval", a2, ""));
        jSONObject3.put((JSONObject) fjp.SCENE_MEDIA_PLAYER, (String) a3);
        return jSONObject2;
    }

    private final JSONArray a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("82713d80", new Object[]{this, str, jSONObject});
        }
        JSONArray jSONArray = new JSONArray();
        JSONArray a2 = fxr.a(str, jSONObject, (JSONArray) null);
        if (a2 != null) {
            for (Object obj : a2) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
                String a3 = fxr.a("thumbnail", (JSONObject) obj, "");
                if (!TextUtils.isEmpty(a3)) {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = jSONObject2;
                    jSONObject3.put((JSONObject) "imageUrl", a3);
                    jSONObject3.put((JSONObject) "videoUrl", "");
                    jSONObject3.put((JSONObject) "type", "image");
                    jSONArray.add(jSONObject2);
                }
            }
        }
        JSONObject a4 = fxr.a("video", jSONObject, (JSONObject) null);
        if (a4 != null && a4.size() > 0) {
            String a5 = fxr.a("coverUrl", a4, "");
            if (!TextUtils.isEmpty(a5)) {
                String a6 = fxr.a("cloudVideoUrl", a4, "");
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = jSONObject4;
                jSONObject5.put((JSONObject) "imageUrl", a5);
                jSONObject5.put((JSONObject) "videoUrl", a6);
                jSONObject5.put((JSONObject) "type", "video");
                jSONArray.add(jSONObject4);
            }
        }
        return jSONArray;
    }

    private final JSONArray b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("4fddbf0d", new Object[]{this, jSONArray});
        }
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArray != null && jSONArray.size() > 0) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                q.b(jSONObject, "imprItemVOS.getJSONObject(i)");
                String a2 = fxr.a("attributeId", jSONObject, "");
                String a3 = fxr.a("count", jSONObject, "");
                String a4 = fxr.a("status", jSONObject, "");
                String a5 = fxr.a("title", jSONObject, "");
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject2;
                jSONObject3.put((JSONObject) "attribute", a2);
                jSONObject3.put((JSONObject) "count", a3);
                jSONObject3.put((JSONObject) "type", a4);
                jSONObject3.put((JSONObject) "word", a5);
                jSONArray2.add(jSONObject2);
            }
        }
        return jSONArray2;
    }

    public final String a(String url, String id) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, url, id});
        }
        q.d(url, "url");
        q.d(id, "id");
        return (!this.f17048a.containsKey(id) || (str = this.f17048a.get(id)) == null || TextUtils.isEmpty(str)) ? url : str;
    }
}
