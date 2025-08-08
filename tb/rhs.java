package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.m;
import com.taobao.statistic.TBS;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.taolive.room.utils.ag;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"buildPublishTrackParams", "", "", DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, "", "statContentPublishSuccess", "", "urlParamsJson", "Lcom/alibaba/fastjson/JSONObject;", "contentId", "publishSessionId", "litecreator_sdk_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class rhs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1756225615);
    }

    private static final List<String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a923a28a", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList();
        if (!map.isEmpty()) {
            String str = map.get("umi_edit_session");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!StringUtils.isEmpty(str) && StringUtils.equals(ior.f29193a, key)) {
                    arrayList.add(key + '=' + str);
                } else {
                    arrayList.add(key + '=' + value);
                }
            }
        }
        return arrayList;
    }

    public static final void a(JSONObject jSONObject, String contentId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{jSONObject, contentId});
            return;
        }
        q.d(contentId, "contentId");
        if (jSONObject == null) {
            return;
        }
        Map<String, String> a2 = m.a(jSONObject);
        q.b(a2, "JSONUtil.json2Map(urlParamsJson)");
        List<String> a3 = a(a2);
        a3.add(ag.ARG_CONTENT_ID + contentId);
        Object[] array = a3.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            TBS.Ext.commitEvent("Page_UmiPublish", 2101, "Page_UmiPublish_ContentPubSuccess", null, null, (String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
