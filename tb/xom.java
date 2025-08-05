package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"CONTAINER_TYPE_DX", "", "CONTAINER_TYPE_WEEX", "getWeexUrl", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "taobao_mytaobao_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xom {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTAINER_TYPE_DX = "dinamicx";
    public static final String CONTAINER_TYPE_WEEX = "weex";

    static {
        kge.a(-140608732);
    }

    public static final String a(xol getWeexUrl) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1857e49d", new Object[]{getWeexUrl});
        }
        q.c(getWeexUrl, "$this$getWeexUrl");
        JSONObject a2 = getWeexUrl.a();
        if (a2 != null && (jSONObject = a2.getJSONObject("fields")) != null && (jSONObject2 = jSONObject.getJSONObject("basementTip")) != null) {
            return jSONObject2.getString("fragmentWeexUrl");
        }
        return null;
    }
}
