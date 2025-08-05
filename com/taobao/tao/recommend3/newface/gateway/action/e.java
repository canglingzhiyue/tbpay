package com.taobao.tao.recommend3.newface.gateway.action;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import tb.gkc;
import tb.gke;
import tb.kge;
import tb.lap;
import tb.laq;
import tb.lar;
import tb.ood;
import tb.ope;
import tb.opw;
import tb.oqa;
import tb.oqc;
import tb.oqd;
import tb.oqi;
import tb.oqj;
import tb.osp;

/* loaded from: classes.dex */
public class e implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private oqi f20937a;
    private ood b;

    static {
        kge.a(-641745172);
        kge.a(1464465151);
    }

    public static /* synthetic */ void a(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ab805a", new Object[]{eVar, jSONObject});
        } else {
            eVar.a(jSONObject);
        }
    }

    public static /* synthetic */ void a(e eVar, JSONObject jSONObject, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c66085", new Object[]{eVar, jSONObject, awesomeGetData});
        } else {
            eVar.a(jSONObject, awesomeGetData);
        }
    }

    public static /* synthetic */ void a(e eVar, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4f106e", new Object[]{eVar, jSONObject, str, str2});
        } else {
            eVar.a(jSONObject, str, str2);
        }
    }

    public e(ope opeVar, oqj oqjVar) throws GatewayException {
        if (oqjVar != null) {
            if (opeVar == null) {
                throw new GatewayException("RecmdDataSource should not be null");
            }
            this.f20937a = new oqi(opeVar, oqjVar);
            this.b = new ood();
            return;
        }
        throw new GatewayException("RecmdRequestService should not be null");
    }

    @Override // tb.gke
    public void a(final JSONObject jSONObject, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        lar.k("NewFaceRequestAction");
        final String string = jSONObject != null ? jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE) : null;
        final long longValue = jSONObject != null ? jSONObject.getLong(oqd.MTOP_STAGE_ASSEMBLEPARAMS_STARTTIME).longValue() : 0L;
        this.f20937a.a(jSONObject, new oqi.a() { // from class: com.taobao.tao.recommend3.newface.gateway.action.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.oqi.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                lar.k("NewFaceRequest_start_" + string);
                oqd.a(string, oqd.MTOP_STAGE_ASSEMBLEPARAMS, longValue, SystemClock.uptimeMillis() - longValue, null, false);
                e.a(e.this, jSONObject);
                lar.l("NewFaceRequest_start_" + string);
            }

            @Override // tb.oqi.a
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    return;
                }
                lar.k("NewFaceRequest_success_" + string);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("dataModel", jSONObject2.get("dataModel"));
                jSONObject3.put(osp.NATIVE_CUSTOM_PARAMS, jSONObject.get(osp.NATIVE_CUSTOM_PARAMS));
                jSONObject3.put("scrollPosition", jSONObject.get("scrollPosition"));
                jSONObject3.put("UIOperation", jSONObject2.get("UIOperation"));
                jSONObject3.put("isSecondReturn", jSONObject2.get("isSecondReturn"));
                opw.a(jSONObject3, opw.a(jSONObject));
                lap.a("MTopRequest", "doResponse", " status:success");
                lar.k("notifyRequestSuccess_" + string);
                e.a(e.this, jSONObject, (AwesomeGetData) jSONObject2.get("dataModel"));
                lar.l("notifyRequestSuccess_" + string);
                jSONObject3.put("requestStartTime", jSONObject.get("requestStartTime"));
                jSONObject3.put("requestEndTime", jSONObject.get("requestEndTime"));
                lar.k("NewFaceRequest_next_gateway_" + string);
                gkcVar.a("success", jSONObject3, null);
                lar.l("NewFaceRequest_next_gateway_" + string);
                lar.l("NewFaceRequest_success_" + string);
            }

            @Override // tb.oqi.a
            public void b(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63b99827", new Object[]{this, jSONObject2});
                    return;
                }
                lar.k("NewFaceRequest_error_" + string);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("errorMsg", (Object) jSONObject2.getString("errorMsg"));
                jSONObject3.put("errorCode", (Object) jSONObject2.getString("errorCode"));
                jSONObject3.put(osp.NATIVE_CUSTOM_PARAMS, jSONObject.get(osp.NATIVE_CUSTOM_PARAMS));
                opw.a(jSONObject3, opw.a(jSONObject));
                laq.a().a("MTopRequest").b("doResponse").c("status:error").a("errorMessage", jSONObject2.getString("errorMsg")).a("errorCode", jSONObject2.getString("errorCode")).b();
                e.a(e.this, jSONObject, jSONObject2.getString("errorCode"), jSONObject2.getString("errorMsg"));
                gkcVar.a("fail", jSONObject3, null);
                lar.l("NewFaceRequest_error_" + string);
            }
        });
        lar.l("NewFaceRequestAction");
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        String[] i = oqc.a().i(jSONObject);
        if (i == null) {
            lap.a("MTopRequest", "notifyRequestStart", "containers is null");
            return;
        }
        for (String str : i) {
            oqa a2 = oqc.a().a(str);
            if (a2 == null) {
                return;
            }
            a2.a(jSONObject);
        }
    }

    private void a(JSONObject jSONObject, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("455cbb17", new Object[]{this, jSONObject, awesomeGetData});
            return;
        }
        String[] i = oqc.a().i(jSONObject);
        if (i == null) {
            lap.a("MTopRequest", "notifyRequestResult", "containers is null");
            return;
        }
        this.b.a(awesomeGetData.currentPageParams);
        for (String str : i) {
            oqa a2 = oqc.a().a(str);
            if (a2 == null) {
                return;
            }
            if (awesomeGetData != null && awesomeGetData.containers != null) {
                AwesomeGetContainerData awesomeGetContainerData = awesomeGetData.containers.get(str);
                if (awesomeGetContainerData != null) {
                    awesomeGetContainerData.containerId = str;
                    a(awesomeGetData, awesomeGetContainerData);
                }
                a2.a(jSONObject, awesomeGetContainerData);
            }
        }
    }

    private void a(AwesomeGetData awesomeGetData, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337cb6f3", new Object[]{this, awesomeGetData, awesomeGetContainerData});
        } else {
            awesomeGetContainerData.parentExt = awesomeGetData.getExt();
        }
    }

    private void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95510c9c", new Object[]{this, jSONObject, str, str2});
            return;
        }
        String[] i = oqc.a().i(jSONObject);
        if (i == null) {
            lap.a("MTopRequest", "notifyRequestFailure", "containers is null");
            return;
        }
        for (String str3 : i) {
            oqa a2 = oqc.a().a(str3);
            if (a2 == null) {
                return;
            }
            a2.a(jSONObject, str, str2);
        }
    }
}
