package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.b;

/* loaded from: classes7.dex */
public interface lxb {
    BaseSectionModel<?> a(JSONObject jSONObject);

    AwesomeGetContainerData a(lwc lwcVar);

    lwf a();

    boolean a(String str, String[] strArr, JSONObject jSONObject);

    boolean a(lwc lwcVar, b bVar);

    boolean a(lwc lwcVar, lxg lxgVar);
}
