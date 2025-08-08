package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* loaded from: classes.dex */
public class lrh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IContainerDataService<?> f30857a;

    static {
        kge.a(1288829765);
    }

    public lrh(IContainerDataService<?> iContainerDataService) {
        this.f30857a = iContainerDataService;
    }

    public JSONObject a(BaseSectionModel<?> baseSectionModel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("720d65e4", new Object[]{this, baseSectionModel, str, str2});
        }
        try {
            return b(baseSectionModel, str, str2);
        } catch (InfoFlowRuntimeException e) {
            ldf.d("FindSmartContentInfoHandler", "findSmartContentInfo error. " + e.getMessage());
            return null;
        }
    }

    private JSONObject b(BaseSectionModel<?> baseSectionModel, String str, String str2) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6d675c65", new Object[]{this, baseSectionModel, str, str2});
        }
        if (baseSectionModel == null) {
            return null;
        }
        JSONObject c = c(baseSectionModel, str, str2);
        if (c != null) {
            return c;
        }
        BaseSubSectionModel mo1098getSubSection = baseSectionModel.mo1098getSubSection();
        if (mo1098getSubSection == null) {
            return null;
        }
        for (Object obj : mo1098getSubSection.values()) {
            if ((obj instanceof JSONObject) && (b = b(this.f30857a.createBaseSectionModel((JSONObject) obj), str, str2)) != null) {
                return b;
            }
        }
        return null;
    }

    private JSONObject c(BaseSectionModel<?> baseSectionModel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("68c152e6", new Object[]{this, baseSectionModel, str, str2});
        }
        BaseItemModel mo1097getItem = baseSectionModel.mo1097getItem();
        if (mo1097getItem == null) {
            return null;
        }
        int itemCount = mo1097getItem.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            JSONObject a2 = a(mo1097getItem.mo1094getBaseItemModel(i), str, str2);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private JSONObject a(BaseSubItemModel baseSubItemModel, String str, String str2) {
        JSONObject smartContent;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("88ae9f72", new Object[]{this, baseSubItemModel, str, str2});
        }
        if (baseSubItemModel != null && (smartContent = baseSubItemModel.getSmartContent()) != null && (jSONObject = smartContent.getJSONObject(str)) != null && StringUtils.equals(str2, jSONObject.getString("id"))) {
            return jSONObject;
        }
        return null;
    }
}
