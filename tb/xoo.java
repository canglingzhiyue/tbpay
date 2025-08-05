package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¨\u0006\u0014"}, d2 = {"Lcom/taobao/mytaobao/pagev2/dataservice/utils/HomePageDataConvert;", "", "()V", "convert2VO", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbHomePageVO;", "sourceFrom", "", "mtopJson", "Lcom/alibaba/fastjson/JSONObject;", "convertComponentList", "", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "hierarchyList", "Lcom/alibaba/fastjson/JSONArray;", "hierarchyData", "hierarchyItem2MtbComponentModel", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "", "hierarchyItem", "originData", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xoo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1556256247);
    }

    public final xon a(int i, JSONObject mtopJson) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xon) ipChange.ipc$dispatch("9d33c4ba", new Object[]{this, new Integer(i), mtopJson});
        }
        q.c(mtopJson, "mtopJson");
        JSONObject jSONObject2 = mtopJson.getJSONObject("data");
        JSONObject jSONObject3 = null;
        if (jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("hierarchy")) == null) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        int size = jSONArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            jSONArray2.addAll(jSONArray.getJSONArray(i2));
        }
        JSONObject jSONObject4 = jSONObject2.getJSONObject("hierarchyData");
        if (jSONObject4 == null) {
            return null;
        }
        xon xonVar = new xon(i);
        xonVar.a(a(i, jSONArray2, jSONObject4));
        xonVar.a(jSONObject2.getJSONObject("pagebackContext"));
        xonVar.b(jSONObject2.getJSONObject("global"));
        JSONObject jSONObject5 = jSONObject4.getJSONObject("basementTip");
        if (jSONObject5 != null && (jSONObject = jSONObject5.getJSONObject("fields")) != null) {
            jSONObject3 = jSONObject.getJSONObject("basementTip");
        }
        xonVar.c(jSONObject3);
        return xonVar;
    }

    public final List<xol> a(int i, JSONArray hierarchyList, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("315ee81a", new Object[]{this, new Integer(i), hierarchyList, jSONObject});
        }
        q.c(hierarchyList, "hierarchyList");
        ArrayList arrayList = new ArrayList();
        int size = hierarchyList.size();
        for (int i2 = 0; i2 < size; i2++) {
            JSONObject hierarchyItem = hierarchyList.getJSONObject(i2);
            String moduleName = hierarchyItem.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
            JSONObject jSONObject2 = jSONObject != null ? jSONObject.getJSONObject(moduleName) : null;
            q.a((Object) moduleName, "moduleName");
            q.a((Object) hierarchyItem, "hierarchyItem");
            arrayList.add(a(i, moduleName, hierarchyItem, jSONObject2));
        }
        return arrayList;
    }

    public final xol a(int i, String moduleName, JSONObject hierarchyItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xol) ipChange.ipc$dispatch("f0cc97cc", new Object[]{this, new Integer(i), moduleName, hierarchyItem, jSONObject});
        }
        q.c(moduleName, "moduleName");
        q.c(hierarchyItem, "hierarchyItem");
        xol xolVar = new xol(i);
        xolVar.a(moduleName);
        xolVar.a(jSONObject == null ? null : JSONObject.parseObject(jSONObject.toJSONString()));
        String string = hierarchyItem.getString("containerType");
        xolVar.b(string);
        xolVar.a(hierarchyItem.getFloat("weight"));
        xolVar.c(hierarchyItem.getString("diffLoadIdentify"));
        if (q.a((Object) string, (Object) "dinamicx")) {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f11925a = hierarchyItem.getString("name");
            Long l = hierarchyItem.getLong("version");
            q.a((Object) l, "hierarchyItem.getLong(\"version\")");
            dXTemplateItem.b = l.longValue();
            dXTemplateItem.c = hierarchyItem.getString("url");
            xolVar.a(dXTemplateItem);
        }
        return xolVar;
    }
}
