package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.Collection;

/* loaded from: classes7.dex */
public class lrp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-809578146);
    }

    public static JSONObject a(Collection<BaseSectionModel<?>> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83e48339", new Object[]{collection});
        }
        JSONObject jSONObject = null;
        if (collection == null || collection.isEmpty()) {
            ldf.d("MiniAppConfigFinder", "sections is empty");
            return null;
        }
        for (BaseSectionModel<?> baseSectionModel : collection) {
            jSONObject = a(baseSectionModel);
            if (!ObjectUtils.a(jSONObject)) {
                break;
            }
        }
        return jSONObject;
    }

    private static JSONObject a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a33498d0", new Object[]{baseSectionModel});
        }
        if (baseSectionModel == null) {
            return null;
        }
        try {
            return baseSectionModel.getExt().getJSONObject("miniAppConfig");
        } catch (Throwable th) {
            ldf.a("MiniAppConfigFinder", "findMiniAppConfig json 获取异常 ：" + th.getMessage(), th);
            return null;
        }
    }
}
