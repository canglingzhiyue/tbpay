package com.alibaba.android.ultron.event;

import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.android.ultron.engine.utils.ErrorConstants;
import com.alibaba.android.ultron.vfw.option.a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bga;
import tb.jny;
import tb.jpx;
import tb.kge;

/* loaded from: classes2.dex */
public class i extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DBG = false;
    public static final String FIELDS_KEY_MTOP_CONFIG = "mtopConfig";
    public static final String TAG = "CommonRequestSubscriber";

    /* renamed from: a  reason: collision with root package name */
    private String f2604a = null;

    static {
        kge.a(340024189);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(i iVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea026cc7", new Object[]{iVar, str});
        } else {
            iVar.c(str);
        }
    }

    public i a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("3f55539", new Object[]{this, str});
        }
        this.f2604a = str;
        return this;
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(final com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        JSONObject fields = b().getFields();
        if (fields == null) {
            UnifyLog.a(this.f.h(), TAG, "error: eventFields is null", new String[0]);
            bga.a.b(this.f.h(), TAG, ErrorConstants.EVENT_FIELDS_NULL.errorCode(), ErrorConstants.EVENT_FIELDS_NULL.errorMessage());
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        JSONObject jSONObject = fields.getJSONObject("mtopConfig");
        final JSONObject jSONObject2 = fields.getJSONObject("next");
        final String string = fields.getString("subfilter");
        if (jSONObject == null) {
            UnifyLog.a(this.f.h(), TAG, "error: mtopConfig is null", new String[0]);
            bga.a.b(this.f.h(), TAG, ErrorConstants.EVENT_MTOP_CONFIG_NULL.errorCode(), ErrorConstants.EVENT_MTOP_CONFIG_NULL.errorMessage());
            return;
        }
        final String string2 = jSONObject.getString("responseKey");
        String string3 = jSONObject.getString("apiMethod");
        String string4 = jSONObject.getString("apiVersion");
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        boolean equals = "true".equals(jSONObject.getString("isNeedWua"));
        boolean equals2 = "true".equals(jSONObject.getString("usePost"));
        String string5 = jSONObject.getString("unitStrategy");
        if ("UNIT_GUIDE".equals(string5) || "UNIT_TRADE".equals(string5)) {
            this.f2604a = string5;
        }
        com.alibaba.android.ultron.vfw.instance.b h = eVar.h();
        String string6 = jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE);
        HashMap hashMap = new HashMap();
        if (TextUtils.equals(string6, "async")) {
            hashMap.put("params", a(h.b(), eVar.d()));
        } else if (TextUtils.equals(string6, "submit")) {
            hashMap.put("params", a(h.b()));
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.putAll(hashMap);
        if (jSONObject3 != null) {
            jSONObject4.putAll(jSONObject3);
        }
        a(mtopRequest, jSONObject4);
        if (TextUtils.isEmpty(string3) || TextUtils.isEmpty(string4)) {
            UnifyLog.a(this.f.h(), TAG, "error: apiMethod or apiVersion is null", new String[0]);
            return;
        }
        JSONObject jSONObject5 = fields.getJSONObject("loadingConfig");
        if (jSONObject5 != null) {
            eVar.h().a(jSONObject5.getString("message"));
        }
        mtopRequest.setApiName(string3);
        mtopRequest.setVersion(string4);
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(equals2 ? MethodEnum.POST : MethodEnum.GET);
        if (equals) {
            build.mo1335useWua();
        }
        String str = this.f2604a;
        if (str != null) {
            build.mo1328setUnitStrategy(str);
        }
        final IDMComponent d = eVar.d();
        build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.event.CommonRequestSubscriber$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String h2 = i.this.f.h();
                UnifyLog.a(h2, i.TAG, mtopResponse.getApi() + " onSystemError: " + mtopResponse.getRetMsg(), new String[0]);
                com.alibaba.android.ultron.vfw.instance.b h3 = eVar.h();
                h3.e();
                JSONObject a2 = i.this.a(mtopResponse);
                if (d != null && (h3 instanceof com.alibaba.android.ultron.vfw.instance.d)) {
                    com.alibaba.android.ultron.vfw.instance.d dVar = (com.alibaba.android.ultron.vfw.instance.d) h3;
                    if (dVar.y() != null && dVar.y().s()) {
                        i.this.g = d;
                    }
                }
                if (com.alibaba.android.ultron.vfw.option.a.a(h3.g(), a.C0101a.MODULE_KEY_EVENT_ASYNC_SOURCE)) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("message", (Object) mtopResponse.getRetMsg());
                    i.this.a(jSONObject2.getJSONArray("fail"), mtopResponse, string2, a2, mtopResponse, jSONObject6);
                } else {
                    i.this.a(jSONObject2.getJSONArray("fail"), mtopResponse, string2, a2, mtopResponse);
                }
                i iVar = i.this;
                i.a(iVar, "onSystemError:" + mtopResponse.getApi());
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
                if (r1.y().p() != false) goto L15;
             */
            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onSuccess(int r12, mtopsdk.mtop.domain.MtopResponse r13, mtopsdk.mtop.domain.BaseOutDo r14, java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 302
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.event.CommonRequestSubscriber$1.onSuccess(int, mtopsdk.mtop.domain.MtopResponse, mtopsdk.mtop.domain.BaseOutDo, java.lang.Object):void");
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String h2 = i.this.f.h();
                UnifyLog.a(h2, i.TAG, mtopResponse.getApi() + " onError: " + mtopResponse.getRetMsg(), new String[0]);
                com.alibaba.android.ultron.vfw.instance.b h3 = eVar.h();
                h3.e();
                JSONObject a2 = i.this.a(mtopResponse);
                if (d != null && (h3 instanceof com.alibaba.android.ultron.vfw.instance.d)) {
                    com.alibaba.android.ultron.vfw.instance.d dVar = (com.alibaba.android.ultron.vfw.instance.d) h3;
                    if (dVar.y() != null && dVar.y().s()) {
                        i.this.g = d;
                    }
                }
                if (com.alibaba.android.ultron.vfw.option.a.a(h3.g(), a.C0101a.MODULE_KEY_EVENT_ASYNC_SOURCE)) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("message", (Object) mtopResponse.getRetMsg());
                    i.this.a(jSONObject2.getJSONArray("fail"), mtopResponse, string2, a2, mtopResponse, jSONObject6);
                } else {
                    i.this.a(jSONObject2.getJSONArray("fail"), mtopResponse, string2, a2, mtopResponse);
                }
                i iVar = i.this;
                i.a(iVar, "onError:" + mtopResponse.getApi());
            }
        });
        String h2 = this.f.h();
        UnifyLog.a(h2, TAG, "start execute: " + string3, new String[0]);
        build.startRequest();
    }

    public boolean a(MtopRequest mtopRequest, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2e4381", new Object[]{this, mtopRequest, jSONObject})).booleanValue();
        }
        if (mtopRequest == null || jSONObject == null) {
            return false;
        }
        mtopRequest.setData(jSONObject.toJSONString());
        return true;
    }

    public JSONObject a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("afae854d", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        try {
            return JSON.parseObject(new String(mtopResponse.getBytedata()));
        } catch (Throwable th) {
            bga.a.a(this.f == null ? "Ultron" : this.f.h(), "CommonRequestSubscriber.getMtopReturnData", th);
            return null;
        }
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return JSONObject.parseObject(jSONObject.toJSONString());
    }

    private String a(jny jnyVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c4f388f", new Object[]{this, jnyVar, iDMComponent});
        }
        if (!(jnyVar instanceof com.taobao.android.ultron.datamodel.imp.b)) {
            return "";
        }
        com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) jnyVar;
        return bVar.t().a(bVar, iDMComponent);
    }

    private String a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26e03ffd", new Object[]{this, jnyVar});
        }
        if (!(jnyVar instanceof com.taobao.android.ultron.datamodel.imp.b)) {
            return "";
        }
        com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) jnyVar;
        return bVar.t().a(bVar);
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!jpx.a(this.d)) {
        } else {
            Toast.makeText(this.d, str, 0).show();
        }
    }
}
