package com.taobao.android.litecreator.sdk.editor.data;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class Material implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECOMMENDED_FROM_FUN_SUFFIX = "_fromFun";
    public static final String RECOMMENDED_FROM_TEMPLATE_SUFFIX = "_fromTemplate";
    public static final String RECOMMENDED_TEXT = "recommendedText";
    public static final String RECOMMENDED_TITLE = "recommendedTitle";
    public static final String RECOMMENDED_TOPIC_INFO = "topicInfo";
    public List<MaterialNode> materialNodes = new ArrayList();

    static {
        kge.a(-638764509);
        kge.a(1028243835);
    }

    public static void addTemplateRecommendsExtraInfoToUgcMedia(com.taobao.android.litecreator.base.data.meta.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376548f2", new Object[]{aVar, jSONObject});
        } else if (aVar == null) {
        } else {
            String string = jSONObject.getString(RECOMMENDED_TITLE);
            String string2 = jSONObject.getString(RECOMMENDED_TEXT);
            if (!StringUtils.isEmpty(string)) {
                aVar.addExtraInfoMeta("recommendedTitle_fromTemplate", string);
            } else {
                aVar.removeExtraInfoMeta("recommendedTitle_fromTemplate");
            }
            if (!StringUtils.isEmpty(string2)) {
                aVar.addExtraInfoMeta("recommendedText_fromTemplate", string2);
            } else {
                aVar.removeExtraInfoMeta("recommendedText_fromTemplate");
            }
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(RECOMMENDED_TOPIC_INFO);
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    aVar.addExtraInfoMeta("topicInfo_fromTemplate", jSONObject2);
                } else {
                    aVar.removeExtraInfoMeta("topicInfo_fromTemplate");
                }
            } catch (Exception e) {
                u.d("addTemplateRecommendsExtraInfoToUgcMedia", e.getMessage());
            }
        }
    }

    public static void clearTemplateRecommendsExtraInfoToUgcMedia(com.taobao.android.litecreator.base.data.meta.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd82806a", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            aVar.removeExtraInfoMeta("recommendedTitle_fromTemplate");
            aVar.removeExtraInfoMeta("recommendedText_fromTemplate");
            aVar.removeExtraInfoMeta("topicInfo_fromTemplate");
        }
    }

    public static void addFunRecommendsExtraInfoToUgcMedia(com.taobao.android.litecreator.base.data.meta.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b1fef2f", new Object[]{aVar, jSONObject});
        } else if (aVar == null) {
        } else {
            String string = jSONObject.getString(RECOMMENDED_TITLE);
            String string2 = jSONObject.getString(RECOMMENDED_TEXT);
            if (!StringUtils.isEmpty(string)) {
                aVar.addExtraInfoMeta("recommendedTitle_fromFun", string);
            } else {
                aVar.removeExtraInfoMeta("recommendedTitle_fromFun");
            }
            if (!StringUtils.isEmpty(string2)) {
                aVar.addExtraInfoMeta("recommendedText_fromFun", string2);
            } else {
                aVar.removeExtraInfoMeta("recommendedText_fromFun");
            }
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(RECOMMENDED_TOPIC_INFO);
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    aVar.addExtraInfoMeta("topicInfo_fromFun", jSONObject2);
                } else {
                    aVar.removeExtraInfoMeta("topicInfo_fromFun");
                }
            } catch (Exception e) {
                u.d("addFunRecommendsExtraInfoToUgcMedia", e.getMessage());
            }
        }
    }

    public static void clearFunRecommendsExtraInfoToUgcMedia(com.taobao.android.litecreator.base.data.meta.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdbb1b5", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            aVar.removeExtraInfoMeta("recommendedTitle_fromFun");
            aVar.removeExtraInfoMeta("recommendedText_fromFun");
            aVar.removeExtraInfoMeta("topicInfo_fromFun");
        }
    }
}
