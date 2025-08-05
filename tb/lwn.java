package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;
import com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a;
import tb.lwt;

/* loaded from: classes7.dex */
public class lwn implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lwt f30948a;
    private lwz b;

    static {
        kge.a(1553374837);
        kge.a(1464465151);
    }

    public static /* synthetic */ void a(lwn lwnVar, JSONObject jSONObject, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4068788a", new Object[]{lwnVar, jSONObject, awesomeGetData});
        } else {
            lwnVar.a(jSONObject, awesomeGetData);
        }
    }

    public static /* synthetic */ void a(lwn lwnVar, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21e296f", new Object[]{lwnVar, jSONObject, str, str2});
        } else {
            lwnVar.a(jSONObject, str, str2);
        }
    }

    public lwn(lwz lwzVar) throws GatewayException {
        if (lwzVar == null) {
            throw new GatewayException("dataServiceEngineContext should not be null");
        }
        this.b = lwzVar;
        this.f30948a = new lwt(lwzVar, lwzVar.c());
    }

    @Override // tb.gke
    public void a(final JSONObject jSONObject, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        lxl.b("gateway2.request", "start action:", jSONObject.toJSONString());
        a.a("netRequest", "gateway2.request", "start action");
        this.f30948a.a(jSONObject, new lwt.a() { // from class: tb.lwn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lwt.a
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    return;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("dataModel", jSONObject2.get("dataModel"));
                jSONObject3.put(osp.NATIVE_CUSTOM_PARAMS, jSONObject.get(osp.NATIVE_CUSTOM_PARAMS));
                lwv.a(jSONObject3, lwv.a(jSONObject));
                lwn.a(lwn.this, jSONObject, (AwesomeGetData) jSONObject2.get("dataModel"));
                gkcVar.a("success", jSONObject3, null);
            }

            @Override // tb.lwt.a
            public void b(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63b99827", new Object[]{this, jSONObject2});
                    return;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("errorMsg", (Object) jSONObject2.getString("errorMsg"));
                jSONObject3.put("errorCode", (Object) jSONObject2.getString("errorCode"));
                jSONObject3.put(osp.NATIVE_CUSTOM_PARAMS, jSONObject.get(osp.NATIVE_CUSTOM_PARAMS));
                lwv.a(jSONObject3, lwv.a(jSONObject));
                lwn.a(lwn.this, jSONObject, jSONObject2.getString("errorMsg"), jSONObject2.getString("errorCode"));
                gkcVar.a("fail", jSONObject3, null);
            }
        });
    }

    private void a(JSONObject jSONObject, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766a147d", new Object[]{this, jSONObject, awesomeGetData});
            return;
        }
        String[] a2 = lwi.a(jSONObject);
        if (a2 == null) {
            lxl.c("MTopRequest", "notifyRequestResult", "containers is null");
            return;
        }
        for (String str : a2) {
            lxg a3 = this.b.a(str);
            if (a3 == null) {
                return;
            }
            if (awesomeGetData != null && awesomeGetData.getContainers() != null) {
                AwesomeGetContainerData awesomeGetContainerData = awesomeGetData.getContainers().get(str);
                if (awesomeGetContainerData != null) {
                    awesomeGetContainerData.setContainerId(str);
                }
                a3.a(jSONObject, awesomeGetContainerData);
            }
        }
    }

    private void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95510c9c", new Object[]{this, jSONObject, str, str2});
            return;
        }
        String[] a2 = lwi.a(jSONObject);
        if (a2 == null) {
            lxl.c("MTopRequest", "notifyRequestFailure", "containers is null");
            return;
        }
        for (String str3 : a2) {
            lxg a3 = this.b.a(str3);
            if (a3 == null) {
                return;
            }
            a3.a(jSONObject, str, str2);
        }
    }
}
