package com.taobao.tao.recommend3.newface.gateway.action;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.List;
import tb.gkc;
import tb.gke;
import tb.kge;
import tb.ksp;
import tb.opb;
import tb.ope;
import tb.opw;
import tb.oqc;

/* loaded from: classes.dex */
public class a implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f20929a;

    static {
        kge.a(-1826900508);
        kge.a(1464465151);
    }

    public a(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RarecmdGatewayDataSource should not be null");
        }
        this.f20929a = opeVar;
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        String[] i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
        } else if (jSONObject == null || (i = oqc.a().i(jSONObject)) == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("deleteModel");
            int length = i.length;
            int i4 = 0;
            while (i4 < length) {
                String str = i[i4];
                String[] strArr = new String[4];
                strArr[0] = "start action:";
                strArr[1] = str;
                strArr[2] = ", ";
                strArr[3] = jSONObject2 == null ? "null" : jSONObject2.getString("sectionBizCode");
                com.taobao.android.home.component.utils.e.c("gateway2.dataDelete", strArr);
                if (jSONObject2 == null) {
                    a(str, jSONObject, gkcVar, 1, "deleteModel is null");
                    return;
                }
                AwesomeGetContainerData b = this.f20929a.b(str);
                List<SectionModel> list = null;
                List<SectionModel> totalData = b == null ? null : b.getTotalData();
                if (totalData != null && !totalData.isEmpty()) {
                    if (a(jSONObject2, totalData)) {
                        try {
                            AwesomeGetContainerInnerData c = this.f20929a.c(str);
                            List<SectionModel> list2 = c == null ? null : c.sections;
                            if (list2 != null) {
                                list2.remove(jSONObject2);
                            }
                            AwesomeGetContainerInnerData d = this.f20929a.d(str);
                            if (d != null) {
                                list = d.sections;
                            }
                            if (list != null) {
                                list.remove(jSONObject2);
                            }
                        } catch (Throwable th) {
                            ksp.a("gateway2.dataDelete", "delete base or delta data exception.", th);
                        }
                        a(str, jSONObject, gkcVar, b);
                    } else {
                        i2 = i4;
                        i3 = length;
                        a(str, jSONObject, gkcVar, 4, "delete failed");
                        i4 = i2 + 1;
                        length = i3;
                    }
                }
                i2 = i4;
                i3 = length;
                i4 = i2 + 1;
                length = i3;
            }
            com.taobao.android.home.component.utils.e.c("gateway2.dataDelete", "end action");
        }
    }

    private boolean a(JSONObject jSONObject, List<SectionModel> list) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("883d787d", new Object[]{this, jSONObject, list})).booleanValue();
        }
        if (list == null || list.isEmpty() || jSONObject == null) {
            return false;
        }
        boolean remove = list.remove(jSONObject);
        if (remove) {
            return remove;
        }
        String string = jSONObject.getString("sectionBizCode");
        return (StringUtils.isEmpty(string) || (a2 = opb.a(string, list)) == -1) ? remove : list.remove(a2) != null;
    }

    private void a(String str, JSONObject jSONObject, gkc gkcVar, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a327cb", new Object[]{this, str, jSONObject, gkcVar, awesomeGetContainerData});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerModel", (Object) awesomeGetContainerData);
        jSONObject2.put("containerId", (Object) str);
        opw.a(jSONObject2, opw.a(jSONObject));
        gkcVar.a("success", jSONObject2, null);
    }

    private void a(String str, JSONObject jSONObject, gkc gkcVar, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78752c9e", new Object[]{this, str, jSONObject, gkcVar, new Integer(i), str2});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorCode", (Object) Integer.valueOf(i));
        jSONObject2.put("errorMsg", (Object) str2);
        jSONObject2.put("containerId", (Object) str);
        opw.a(jSONObject2, opw.a(jSONObject));
        gkcVar.a("fail", jSONObject2, null);
    }
}
