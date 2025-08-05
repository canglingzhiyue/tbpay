package com.alibaba.security.wukong;

import android.content.Context;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.ccrc.service.build.C1220j;
import com.alibaba.security.ccrc.service.build.C1265ya;
import com.alibaba.security.ccrc.service.build.InterfaceC1223k;
import com.alibaba.security.ccrc.service.build.Ja;
import com.alibaba.security.client.smart.core.algo.ClientAlgoResult;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.upload.AlgoResultUploadData;
import com.alibaba.security.wukong.upload.AlgoResultUploadModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class AlgoResultReporter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CACHE_SIZE = 10;
    public Map<C1265ya<String, String>, List<AlgoResultUploadModel>> mAlgoResultMap;
    public Context mContext;
    public InterfaceC1223k mHttp;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final AlgoResultReporter f3622a = new AlgoResultReporter(null);
    }

    public AlgoResultReporter() {
    }

    public static /* synthetic */ void access$200(AlgoResultReporter algoResultReporter, boolean z, String str, String str2, Object obj, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782d533d", new Object[]{algoResultReporter, new Boolean(z), str, str2, obj, str3});
        } else {
            algoResultReporter.reportAlgoResultEnd(z, str, str2, obj, str3);
        }
    }

    private synchronized void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        Map<C1265ya<String, String>, List<AlgoResultUploadModel>> map = this.mAlgoResultMap;
        if (map == null) {
            return;
        }
        map.clear();
    }

    private AlgoResultUploadModel convertModel(ClientAlgoResult clientAlgoResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlgoResultUploadModel) ipChange.ipc$dispatch("eec787ac", new Object[]{this, clientAlgoResult});
        }
        AlgoResultUploadModel algoResultUploadModel = new AlgoResultUploadModel();
        algoResultUploadModel.algoCode = clientAlgoResult.algoCode;
        SampleData sampleData = clientAlgoResult.mSampleData;
        algoResultUploadModel.sampleId = sampleData.sampleId;
        algoResultUploadModel.metaId = sampleData.metaId;
        algoResultUploadModel.timeStamp = sampleData.getTs();
        algoResultUploadModel.preResult = clientAlgoResult.result;
        SampleData sampleData2 = clientAlgoResult.mSampleData;
        algoResultUploadModel.sampleUrl = sampleData2.sampleUrl;
        algoResultUploadModel.label = sampleData2.label;
        return algoResultUploadModel;
    }

    private synchronized void doUpload(List<AlgoResultUploadModel> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d370faf8", new Object[]{this, list, str, str2});
            return;
        }
        AlgoResultUploadData algoResultUploadData = new AlgoResultUploadData(str);
        algoResultUploadData.algoResultList = JsonUtils.toJSONString(list);
        algoResultUploadData.encry = false;
        algoResultUploadData.ts = System.currentTimeMillis();
        algoResultUploadData.pId = str2;
        if (this.mHttp == null) {
            this.mHttp = new C1220j(this.mContext);
        }
        this.mHttp.a(algoResultUploadData, new Ja(this, str, str2));
    }

    public static AlgoResultReporter getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlgoResultReporter) ipChange.ipc$dispatch("d78e083c", new Object[0]) : a.f3622a;
    }

    private void reportAlgoResultEnd(boolean z, String str, String str2, Object obj, String str3) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978dfbb0", new Object[]{this, new Boolean(z), str, str2, obj, str3});
            return;
        }
        TrackLog.Builder phase = TrackLog.newBuilder().setpId(str2).setCcrcCode(str).setOperation(Ba.a.g).setPhase("detect");
        if (!z) {
            i = -1;
        }
        TrackManager.track(phase.setStatus(i).setTag("MTOP").addParam(InputFrame3.TYPE_RESPONSE, obj).addParam("errorMsg", str3).build());
    }

    public void addResult(ClientAlgoResult clientAlgoResult, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73cce785", new Object[]{this, clientAlgoResult, str, str2});
            return;
        }
        if (this.mAlgoResultMap == null) {
            this.mAlgoResultMap = new HashMap();
        }
        C1265ya<String, String> c1265ya = new C1265ya<>(str, str2);
        List<AlgoResultUploadModel> list = this.mAlgoResultMap.get(c1265ya);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(convertModel(clientAlgoResult));
        this.mAlgoResultMap.put(c1265ya, list);
        if (list.size() < 10) {
            return;
        }
        doUpload(list, str, str2);
        list.clear();
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            this.mContext = context;
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            uploadAtOnce();
        }
    }

    public synchronized void uploadAtOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd5624bc", new Object[]{this});
            return;
        }
        Map<C1265ya<String, String>, List<AlgoResultUploadModel>> map = this.mAlgoResultMap;
        if (map == null) {
            return;
        }
        for (Map.Entry<C1265ya<String, String>, List<AlgoResultUploadModel>> entry : map.entrySet()) {
            List<AlgoResultUploadModel> value = entry.getValue();
            if (value.size() > 0) {
                doUpload(value, entry.getKey().f3337a, entry.getKey().b);
            }
        }
        clear();
    }

    public /* synthetic */ AlgoResultReporter(Ja ja) {
    }
}
