package com.taobao.android.litecreator.base.data;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.QuickPublishModel;
import com.taobao.android.litecreator.sdk.editor.data.MusicInfo;
import com.taobao.taopai.material.bean.MaterialDetail;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.t;
import tb.eby;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/litecreator/base/data/QuickPublishModelHelper;", "", "()V", "Companion", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public class h {
    public static final a Companion;

    static {
        kge.a(1821226346);
        Companion = new a(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/taobao/android/litecreator/base/data/QuickPublishModelHelper$Companion;", "", "()V", "convert", "Lcom/taobao/android/litecreator/base/data/QuickPublishModel;", "previewDataObj", "Lcom/alibaba/fastjson/JSONObject;", "publishConfigJson", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1225694158);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final QuickPublishModel a(JSONObject jSONObject, JSONObject jSONObject2) {
            JSONArray jSONArray;
            JSONObject jSONObject3;
            JSONObject jSONObject4;
            JSONObject jSONObject5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (QuickPublishModel) ipChange.ipc$dispatch("94e29201", new Object[]{this, jSONObject, jSONObject2});
            }
            QuickPublishModel quickPublishModel = new QuickPublishModel();
            if (jSONObject == null) {
                return quickPublishModel;
            }
            JSONObject jSONObject6 = jSONObject.getJSONObject("publish_data");
            JSONObject jSONObject7 = jSONObject.getJSONObject("recMaterialTool");
            JSONObject jSONObject8 = null;
            quickPublishModel.publishConfig = jSONObject6 != null ? jSONObject6.getJSONObject("publishConfig") : null;
            if (quickPublishModel.publishConfig == null) {
                quickPublishModel.publishConfig = jSONObject2;
            }
            QuickPublishModel.PublishData publishData = new QuickPublishModel.PublishData();
            publishData.templateId = jSONObject6 != null ? jSONObject6.getString("templateId") : null;
            publishData.textTpl = (jSONObject7 == null || (jSONObject5 = jSONObject7.getJSONObject("textTpl")) == null) ? null : (QuickPublishModel.TextTpl) jSONObject5.toJavaObject(QuickPublishModel.TextTpl.class);
            publishData.topic = jSONObject7 != null ? jSONObject7.getJSONObject("topic") : null;
            JSONArray jSONArray2 = jSONObject6 != null ? jSONObject6.getJSONArray("orderItems") : null;
            ArrayList arrayList = null;
            if (jSONArray2 != null) {
                arrayList = new ArrayList();
                int size = jSONArray2.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject9 = jSONArray2.getJSONObject(i);
                    QuickPublishModel.OrderItem orderItem = new QuickPublishModel.OrderItem();
                    orderItem.price = jSONObject9 != null ? jSONObject9.getString("price") : null;
                    orderItem.title = jSONObject9 != null ? jSONObject9.getString("title") : null;
                    orderItem.picUrl = jSONObject9 != null ? jSONObject9.getString(eby.KEY_PIC_URL) : null;
                    arrayList.add(orderItem);
                }
            }
            publishData.orderItems = arrayList;
            t tVar = t.INSTANCE;
            quickPublishModel.publishData = publishData;
            quickPublishModel.extendInfo = jSONObject.getJSONObject(MspGlobalDefine.EXTENDINFO);
            QuickPublishModel.RenderData renderData = new QuickPublishModel.RenderData();
            JSONObject jSONObject10 = jSONObject6 != null ? jSONObject6.getJSONObject("feeds") : null;
            if (jSONObject10 != null) {
                renderData.bindMedias = jSONObject10.getJSONArray("elements");
                renderData.minMediasCount = jSONObject10.containsKey("minReqNum") ? jSONObject10.getIntValue("minReqNum") : jSONObject10.size();
            }
            renderData.bindTexts = jSONObject6 != null ? jSONObject6.getJSONObject("materialToolMappings") : null;
            renderData.musicInfo = (jSONObject7 == null || (jSONObject4 = jSONObject7.getJSONObject("musicInfo")) == null) ? null : (MusicInfo) jSONObject4.toJavaObject(MusicInfo.class);
            renderData.templateDetail = (jSONObject7 == null || (jSONArray = jSONObject7.getJSONArray("materialTool")) == null || (jSONObject3 = jSONArray.getJSONObject(0)) == null) ? null : (MaterialDetail) jSONObject3.toJavaObject(MaterialDetail.class);
            t tVar2 = t.INSTANCE;
            quickPublishModel.renderData = renderData;
            QuickPublishModel.PreviewElements previewElements = new QuickPublishModel.PreviewElements();
            previewElements.recommendTitles = jSONObject7 != null ? jSONObject7.getJSONArray("recommendTitles") : null;
            previewElements.recommendMedias = jSONObject7 != null ? jSONObject7.getJSONArray("recommendBackgrounds") : null;
            if (jSONObject7 != null) {
                jSONObject8 = jSONObject7.getJSONObject("mediaActionBar");
            }
            previewElements.editMedia = jSONObject8;
            t tVar3 = t.INSTANCE;
            quickPublishModel.previewElements = previewElements;
            return quickPublishModel;
        }
    }
}
