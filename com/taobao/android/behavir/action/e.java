package com.taobao.android.behavir.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.util.k;
import com.taobao.android.behavix.d;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.orange.OConstant;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes4.dex */
public class e implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "RequestAction";

    static {
        kge.a(1091482155);
        kge.a(988163184);
    }

    public String b(com.taobao.android.behavir.solution.f fVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b13cd139", new Object[]{this, fVar, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                jSONObject2.put(str, (Object) JSON.toJSONString(obj));
            } else {
                jSONObject2.put(str, obj);
            }
        }
        return jSONObject2.toJSONString();
    }

    public MtopRequest c(com.taobao.android.behavir.solution.f fVar, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("c1177cf3", new Object[]{this, fVar, jSONObject});
        }
        BHRTaskConfigBase e = fVar.e();
        MtopRequest mtopRequest = new MtopRequest();
        JSONObject taskInfo = e.getTaskInfo();
        String str2 = "";
        if (taskInfo != null) {
            str2 = taskInfo.getString("apiName");
            str = taskInfo.getString("apiVersion");
            if (jSONObject != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("uppParams");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject(2);
                }
                jSONObject2.put(OConstant.DIMEN_CONFIG_NAME, (Object) taskInfo.getString(OConstant.DIMEN_CONFIG_NAME));
                jSONObject.put("uppParams", (Object) jSONObject2);
                if (taskInfo.getBooleanValue("uploadEvent")) {
                    jSONObject.put("data", (Object) fVar.d().toJsonObject().toJSONString());
                }
                jSONObject.put("subscribeIdList", taskInfo.get("subscribeIdList"));
                jSONObject.put("intentionId", taskInfo.get("intentionId"));
            }
        } else {
            str = str2;
        }
        mtopRequest.setApiName(str2);
        mtopRequest.setVersion(str);
        mtopRequest.setNeedEcode(false);
        mtopRequest.setData(b(fVar, jSONObject));
        return mtopRequest;
    }

    public void a(com.taobao.android.behavir.solution.f fVar, JSONObject jSONObject, int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfd70b4", new Object[]{this, fVar, jSONObject, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            LogUtils.a(LogUtils.BR_BIZ_NAME, NAME, mtopResponse.toString());
        }
    }

    public void a(com.taobao.android.behavir.solution.f fVar, JSONObject jSONObject, int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8951fde", new Object[]{this, fVar, jSONObject, new Integer(i), mtopResponse, obj});
        } else {
            LogUtils.a(LogUtils.BR_BIZ_NAME, NAME, mtopResponse.toString());
        }
    }

    @Override // com.taobao.android.behavir.action.a
    public void a(final com.taobao.android.behavir.solution.f fVar, final JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5db9bc6", new Object[]{this, fVar, jSONObject});
            return;
        }
        RemoteBusiness build = RemoteBusiness.build(c(fVar, jSONObject), d.d());
        try {
            HashMap hashMap = new HashMap(2);
            hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "upp-hub");
            if (jSONObject == null) {
                str = "";
            } else {
                str = "schemeId=" + jSONObject.getString("schemeId");
            }
            hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, str);
            build.mo1297headers((Map<String, String>) hashMap);
        } catch (Throwable th) {
            com.taobao.android.behavir.util.d.a(NAME, th);
        }
        if (k.a(fVar)) {
            build.mo1335useWua();
        }
        build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.behavir.action.RequestAction$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    e.this.a(fVar, jSONObject, i, mtopResponse, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    e.this.a(fVar, jSONObject, i, mtopResponse, baseOutDo, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    e.this.a(fVar, jSONObject, i, mtopResponse, obj);
                }
            }
        });
        build.asyncRequest();
    }
}
