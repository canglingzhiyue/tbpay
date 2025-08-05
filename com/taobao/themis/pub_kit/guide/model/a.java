package com.taobao.themis.pub_kit.guide.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002¢\u0006\u0002\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"getExpBucketsStr", "", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "getStrongGuideAlgorithmUserClickTime", "", "(Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;)Ljava/lang/Integer;", "getStrongGuideAlgorithmUserStayTime", "themis_pub_kit_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1220091891);
    }

    public static final String a(PubUserGuideModule getExpBucketsStr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6529b13", new Object[]{getExpBucketsStr});
        }
        q.d(getExpBucketsStr, "$this$getExpBucketsStr");
        StringBuilder sb = new StringBuilder();
        List<String> expBuckets = getExpBucketsStr.getExpBuckets();
        if (expBuckets != null) {
            for (Object obj : expBuckets) {
                int i2 = i + 1;
                if (i < 0) {
                    p.b();
                }
                String str = (String) obj;
                if (i == 0) {
                    sb.append(str);
                } else {
                    sb.append("_");
                    sb.append(str);
                }
                i = i2;
            }
        }
        String sb2 = sb.toString();
        q.b(sb2, "StringBuilder().apply {\n…       }\n    }.toString()");
        return sb2;
    }

    public static final Integer b(PubUserGuideModule getStrongGuideAlgorithmUserStayTime) {
        JSONObject newPopupData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("7b771d15", new Object[]{getStrongGuideAlgorithmUserStayTime});
        }
        q.d(getStrongGuideAlgorithmUserStayTime, "$this$getStrongGuideAlgorithmUserStayTime");
        PubIconChangeGuidePopupModel iconChangeGuidePopup = getStrongGuideAlgorithmUserStayTime.getIconChangeGuidePopup();
        Object obj = (iconChangeGuidePopup == null || (newPopupData = iconChangeGuidePopup.getNewPopupData()) == null) ? null : newPopupData.get("strongGuideAlgorithmUserStayTime");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        return (Integer) obj;
    }

    public static final Integer c(PubUserGuideModule getStrongGuideAlgorithmUserClickTime) {
        JSONObject newPopupData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5bf07316", new Object[]{getStrongGuideAlgorithmUserClickTime});
        }
        q.d(getStrongGuideAlgorithmUserClickTime, "$this$getStrongGuideAlgorithmUserClickTime");
        PubIconChangeGuidePopupModel iconChangeGuidePopup = getStrongGuideAlgorithmUserClickTime.getIconChangeGuidePopup();
        Object obj = (iconChangeGuidePopup == null || (newPopupData = iconChangeGuidePopup.getNewPopupData()) == null) ? null : newPopupData.get("strongGuideAlgorithmUserClickTime");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        return (Integer) obj;
    }
}
