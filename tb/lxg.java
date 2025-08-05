package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import java.util.List;

/* loaded from: classes7.dex */
public interface lxg {
    AwesomeGetContainerParams a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject);

    void a(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData);

    void a(JSONObject jSONObject, String str, String str2);

    void a(List<SectionModel> list, lwh lwhVar);

    void b(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject);

    void c(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject);
}
