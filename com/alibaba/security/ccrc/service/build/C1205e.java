package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.model.Label;
import com.alibaba.security.ccrc.service.BaseCcrcDetectResult;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.model.ActionResult;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.alibaba.security.wukong.upload.ClientRiskUploadData;
import com.alibaba.security.wukong.upload.pojo.SampleContent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alibaba.security.ccrc.service.build.e */
/* loaded from: classes3.dex */
public class C1205e extends BaseActionPerform {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RiskUploadAction";

    /* renamed from: a */
    public static final String f3300a = "ccrcImagePreResult";

    public C1205e(Context context) {
        super(context);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f3300a;
    }

    public static /* synthetic */ void a(C1205e c1205e, InferContext inferContext, boolean z, Object obj, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34210c31", new Object[]{c1205e, inferContext, new Boolean(z), obj, str, new Long(j)});
        } else {
            c1205e.b(inferContext, z, obj, str, j);
        }
    }

    public static /* synthetic */ void b(C1205e c1205e, SampleData sampleData, BaseCcrcDetectResult baseCcrcDetectResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a57bef4", new Object[]{c1205e, sampleData, baseCcrcDetectResult});
        } else {
            c1205e.actionCallbackFail(sampleData, baseCcrcDetectResult);
        }
    }

    public static /* synthetic */ Object ipc$super(C1205e c1205e, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform
    public String actionPerformCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7e06921", new Object[]{this}) : f3300a;
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform
    public void doAccept(String str, InferContext inferContext, String str2, String str3, SampleData sampleData, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6652d13", new Object[]{this, str, inferContext, str2, str3, sampleData, str4});
        } else if (sampleData != null) {
            List<JSONArray> parseArray = JSON.parseArray(str2, JSONArray.class);
            Boolean bool = false;
            ArrayList arrayList = new ArrayList();
            String str5 = null;
            for (JSONArray jSONArray : parseArray) {
                bool = Boolean.valueOf(bool.booleanValue() | ((Boolean) BaseActionPerform.getSafely(jSONArray, 2, Boolean.class)).booleanValue());
                String str6 = (String) BaseActionPerform.getSafely(jSONArray, 3, String.class);
                String str7 = (String) BaseActionPerform.getSafely(jSONArray, 4, String.class);
                Boolean bool2 = (Boolean) BaseActionPerform.getSafely(jSONArray, 5, Boolean.class);
                if (bool2 != null && bool2.booleanValue() && StringUtils.isEmpty(str5)) {
                    str5 = C1211g.a(inferContext, sampleData);
                }
                arrayList.add(new Label(str6, str7));
            }
            a(inferContext, bool.booleanValue(), str2, str3, str5, sampleData, arrayList, str4);
        }
    }

    public static /* synthetic */ void a(C1205e c1205e, SampleData sampleData, BaseCcrcDetectResult baseCcrcDetectResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c46f15", new Object[]{c1205e, sampleData, baseCcrcDetectResult});
        } else {
            c1205e.actionCallbackSuccess(sampleData, baseCcrcDetectResult);
        }
    }

    private void b(final InferContext inferContext, final boolean z, final Object obj, final String str, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e15447", new Object[]{this, inferContext, new Boolean(z), obj, str, new Long(j)});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$Fk98E9qB4Qba6gICLUOGbnZV1IA
                @Override // java.lang.Runnable
                public final void run() {
                    C1205e.a(InferContext.this, z, obj, str, j);
                }
            });
        }
    }

    private void a(InferContext inferContext, Mb mb, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb784b7", new Object[]{this, inferContext, mb, str});
        } else if (mb == null || inferContext == null) {
        } else {
            Pb pb = new Pb();
            pb.b = inferContext.pid;
            pb.f3268a = inferContext.ccrcCode;
            pb.c = inferContext.sgBizId;
            pb.f = inferContext.wukong_uuid;
            pb.h = inferContext.metaId;
            pb.g = inferContext.getSampleID();
            mb.writeData(pb, str);
        }
    }

    private void a(InferContext inferContext, boolean z, String str, String str2, String str3, SampleData sampleData, List<Label> list, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ceb5c2", new Object[]{this, inferContext, new Boolean(z), str, str2, str3, sampleData, list, str4});
        } else if (!needRiskUpload()) {
            actionCallbackSuccess(sampleData, W.a(sampleData, z, list, inferContext.getAlgoResults()));
        } else {
            a(inferContext, this.mDataPipeAbility, str4);
            getHttpManager().a(a(inferContext, new ActionResult(actionPerformCode(), str, str2), str3, sampleData), new C1202d(this, System.currentTimeMillis(), inferContext, sampleData, z, list));
        }
    }

    private ClientRiskUploadData a(InferContext inferContext, ActionResult actionResult, String str, SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientRiskUploadData) ipChange.ipc$dispatch("c0b769d7", new Object[]{this, inferContext, actionResult, str, sampleData});
        }
        ClientRiskUploadData clientRiskUploadData = new ClientRiskUploadData(inferContext.ccrcCode);
        clientRiskUploadData.pId = inferContext.pid;
        clientRiskUploadData.actionResult = JsonUtils.toJSONString(actionResult);
        clientRiskUploadData.context = JsonUtils.toJSONString(inferContext);
        clientRiskUploadData.ts = sampleData.getTs();
        clientRiskUploadData.eventId = inferContext.wukong_uuid;
        clientRiskUploadData.sampleData = a(str, sampleData);
        clientRiskUploadData.metaId = inferContext.getMetaId();
        clientRiskUploadData.sampleId = inferContext.getSampleID();
        clientRiskUploadData.riskId = inferContext.getRiskId();
        clientRiskUploadData.extras = JsonUtils.toJSONString(inferContext.getExtras());
        return clientRiskUploadData;
    }

    private String a(String str, SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33b9565b", new Object[]{this, str, sampleData});
        }
        String str2 = null;
        if (sampleData != null) {
            str2 = sampleData.metaType;
        }
        return JsonUtils.toJSONString(new SampleContent(str2, str));
    }

    public static /* synthetic */ void a(InferContext inferContext, boolean z, Object obj, String str, long j) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b832fa8", new Object[]{inferContext, new Boolean(z), obj, str, new Long(j)});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(inferContext.pid).setMetaId(inferContext.getMetaId()).setSampleId(inferContext.getSampleID()).setCcrcCode(inferContext.ccrcCode).setPhase("detect").setOperation(Ba.a.f);
        if (!z) {
            i = -1;
        }
        TrackManager.track(operation.setStatus(i).setTag("MTOP").addParam(InputFrame3.TYPE_RESPONSE, obj).addParam("errorMsg", str).addParam("costTime", Long.valueOf(j)).build());
    }
}
