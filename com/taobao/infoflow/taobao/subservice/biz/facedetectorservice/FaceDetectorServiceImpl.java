package com.taobao.infoflow.taobao.subservice.biz.facedetectorservice;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IFaceDetectorService;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl.FaceDetectorConfig;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.sfq;

/* loaded from: classes7.dex */
public class FaceDetectorServiceImpl implements IFaceDetectorService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FaceDetectorServiceImpl";
    private FaceDetectorConfig mConfig;
    private sfq mFaceDetectMission;
    private ljs mInfoFlowContext;

    static {
        kge.a(-1203112160);
        kge.a(1293541576);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        if (this.mFaceDetectMission == null) {
            this.mFaceDetectMission = new sfq();
        }
        initFaceDetectorMissionConfig(ljsVar);
    }

    private void initFaceDetectorMissionConfig(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09a30dd", new Object[]{this, ljsVar});
            return;
        }
        if (this.mConfig == null) {
            this.mConfig = new FaceDetectorConfig(ljsVar);
        }
        this.mFaceDetectMission.a(this.mConfig);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        sfq sfqVar = this.mFaceDetectMission;
        if (sfqVar == null) {
            return;
        }
        sfqVar.b();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFaceDetectorService
    public void startFaceDetector(View view, JSONObject jSONObject, JSONObject jSONObject2) {
        sfq sfqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74281d06", new Object[]{this, view, jSONObject, jSONObject2});
            return;
        }
        ljs ljsVar = this.mInfoFlowContext;
        if (ljsVar == null) {
            ldf.a(TAG, "infoContext is null");
            return;
        }
        IVideoPlayControllerService iVideoPlayControllerService = (IVideoPlayControllerService) ljsVar.a(IVideoPlayControllerService.class);
        if (iVideoPlayControllerService == null || !iVideoPlayControllerService.isEnable()) {
            ldf.a(TAG, "播控不支持");
        } else if (!enableFaceDetector()) {
            ldf.a(TAG, "配置开关未打开");
        } else if (!(view instanceof TBLiveOpenCardView) || (sfqVar = this.mFaceDetectMission) == null) {
        } else {
            sfqVar.a((TBLiveOpenCardView) view, jSONObject, jSONObject2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFaceDetectorService
    public void stopFaceDetector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d4d86c", new Object[]{this});
        } else {
            this.mFaceDetectMission.a();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFaceDetectorService
    public void setFirstFrameRendered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2230dafb", new Object[]{this});
            return;
        }
        sfq sfqVar = this.mFaceDetectMission;
        if (sfqVar == null) {
            return;
        }
        sfqVar.d();
    }

    private boolean enableFaceDetector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caf2d3f1", new Object[]{this})).booleanValue();
        }
        FaceDetectorConfig faceDetectorConfig = this.mConfig;
        if (faceDetectorConfig != null) {
            return faceDetectorConfig.a();
        }
        return false;
    }
}
