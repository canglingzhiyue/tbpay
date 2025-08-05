package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.alibaba.security.wukong.upload.AlgoResultUploadData;
import com.alibaba.security.wukong.upload.AlgoResultUploadModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alibaba.security.ccrc.service.build.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1196b extends BaseActionPerform {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<AlgoResultUploadModel> f3293a;

    public C1196b(Context context) {
        super(context);
        this.f3293a = new ArrayList();
    }

    public static /* synthetic */ void a(C1196b c1196b, boolean z, Object obj, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b3282c", new Object[]{c1196b, new Boolean(z), obj, str, str2, str3});
        } else {
            c1196b.a(z, obj, str, str2, str3);
        }
    }

    public static /* synthetic */ Object ipc$super(C1196b c1196b, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform
    public String actionPerformCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7e06921", new Object[]{this}) : "CCRCReportAlgoResult";
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform
    public void doAccept(String str, InferContext inferContext, String str2, String str3, SampleData sampleData, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6652d13", new Object[]{this, str, inferContext, str2, str3, sampleData, str4});
            return;
        }
        String sampleID = inferContext.getSampleID();
        String metaId = inferContext.getMetaId();
        JSONArray jSONArray = (JSONArray) JSON.parseArray(str2, JSONArray.class).get(0);
        Integer num = (Integer) BaseActionPerform.getSafely(jSONArray, 4, Integer.class);
        AlgoResultUploadModel algoResultUploadModel = new AlgoResultUploadModel();
        algoResultUploadModel.sampleId = sampleID;
        algoResultUploadModel.riskId = inferContext.getRiskId();
        algoResultUploadModel.metaId = metaId;
        algoResultUploadModel.algoCode = (String) BaseActionPerform.getSafely(jSONArray, 2, String.class);
        algoResultUploadModel.actionCode = actionPerformCode();
        algoResultUploadModel.eventId = inferContext.wukong_uuid;
        algoResultUploadModel.timeStamp = System.currentTimeMillis();
        algoResultUploadModel.extras = inferContext.getExtras();
        algoResultUploadModel.params = str2;
        algoResultUploadModel.sign = str3;
        this.f3293a.add(algoResultUploadModel);
        if (num == null || this.f3293a.size() < num.intValue()) {
            return;
        }
        a(sampleID, metaId, this.f3293a);
        this.f3293a.clear();
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.f3293a.clear();
        }
    }

    private void a(String str, String str2, List<AlgoResultUploadModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3a26d", new Object[]{this, str, str2, list});
            return;
        }
        AlgoResultUploadData algoResultUploadData = new AlgoResultUploadData(getCcrcCode());
        algoResultUploadData.algoResultList = JsonUtils.toJSONString(list);
        algoResultUploadData.encry = false;
        algoResultUploadData.ts = System.currentTimeMillis();
        algoResultUploadData.pId = getPid();
        getHttpManager().a(algoResultUploadData, new C1193a(this, str, str2));
    }

    private void a(boolean z, Object obj, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3494fc26", new Object[]{this, new Boolean(z), obj, str, str2, str3});
            return;
        }
        TrackLog.Builder phase = TrackLog.newBuilder().setpId(getPid()).setCcrcCode(getCcrcCode()).setMetaId(str3).setSampleId(str2).setOperation(Ba.a.g).setPhase("detect");
        if (!z) {
            i = -1;
        }
        TrackManager.track(phase.setStatus(i).setTag("MTOP").addParam(InputFrame3.TYPE_RESPONSE, obj).addParam("errorMsg", str).build());
    }
}
