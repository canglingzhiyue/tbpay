package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.List;

/* loaded from: classes.dex */
public interface oqa {
    AwesomeGetContainerParams a(ope opeVar, JSONObject jSONObject);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData);

    void a(JSONObject jSONObject, String str, String str2);

    boolean a(List<SectionModel> list, IDxItemRenderService.b bVar);

    void b(JSONObject jSONObject);

    void b(ope opeVar, JSONObject jSONObject);

    void c(ope opeVar, JSONObject jSONObject);

    void d(ope opeVar, JSONObject jSONObject);
}
