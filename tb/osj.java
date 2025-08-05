package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.TemplateModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes8.dex */
public class osj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1549405265);
    }

    public static byte[] a(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("66b06e85", new Object[]{str, awesomeGetContainerInnerData});
        }
        List<SectionModel> list = awesomeGetContainerInnerData.sections;
        if (!a(str) || ObjectUtils.a(list)) {
            ldf.d("CachePerformance", "不允许替换，直接返回");
            return JSON.toJSONBytes(awesomeGetContainerInnerData, new SerializerFeature[0]);
        }
        AwesomeGetContainerInnerData m1279clone = awesomeGetContainerInnerData.m1279clone();
        ListIterator<SectionModel> listIterator = m1279clone.sections.listIterator();
        while (listIterator.hasNext()) {
            SectionModel a2 = a(listIterator.next());
            if (a2 != null) {
                listIterator.set(a2);
            }
        }
        return JSON.toJSONBytes(m1279clone, new SerializerFeature[0]);
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : n.n().z() && TextUtils.equals(str, ksk.NEW_FACE_CHILD.f30287a);
    }

    private static SectionModel a(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("748a7362", new Object[]{sectionModel});
        }
        if (!a(sectionModel.mo1099getTemplate())) {
            return null;
        }
        return b(sectionModel);
    }

    private static SectionModel b(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("ed269a81", new Object[]{sectionModel});
        }
        SectionModel sectionModel2 = new SectionModel(JSON.parseObject(sectionModel.toJSONString()));
        Object a2 = lja.a("subSection.1.subSection", sectionModel2);
        if (!(a2 instanceof JSONObject)) {
            ldf.d("CachePerformance", "未找到二屏内容");
            return null;
        }
        JSONObject jSONObject = (JSONObject) a2;
        Object obj = jSONObject.get("0");
        if (obj == null) {
            ldf.d("CachePerformance", "未找到二屏内容的首个icon");
            return null;
        }
        jSONObject.clear();
        jSONObject.put("0", obj);
        return sectionModel2;
    }

    private static boolean a(TemplateModel templateModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d49883c", new Object[]{templateModel})).booleanValue() : TextUtils.equals("recommend_m_h_v5_slider_icons_tag_bindingx_d3", templateModel.getName());
    }
}
