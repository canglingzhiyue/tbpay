package com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.i;
import com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d;
import com.taobao.tao.Globals;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lli;

/* loaded from: classes7.dex */
public class VideoCardAnimationServiceImpl implements IVideoCardAnimationService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HAS_VIDEO_ANIMATION = "hasVideoAnimation";
    private static final String TAG = "VideoAnimationCardService";
    private boolean isColdStart;
    private boolean isMeasureSuccess;
    private IContainerDataService<?> mDataService;
    private IContainerService<?> mIContainerService;
    private JSONObject mVideoAnimation;
    private d mVideoCardHelper;
    private final IContainerService.a uiRefreshListener = new IContainerService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.VideoCardAnimationServiceImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2729410f", new Object[]{this, iUiRefreshActionModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            VideoCardAnimationServiceImpl.access$002(VideoCardAnimationServiceImpl.this, StringUtils.equals(iUiRefreshActionModel.getRequestType(), "coldStart"));
            ldf.d(VideoCardAnimationServiceImpl.TAG, "onUiRefreshStart isColdStart:" + VideoCardAnimationServiceImpl.access$000(VideoCardAnimationServiceImpl.this));
        }
    };
    private final IContainerDataService.b mRequestListener = new IContainerDataService.b() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.VideoCardAnimationServiceImpl.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
        public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
        public void a(lli lliVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
        public void a(lli lliVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                return;
            }
            VideoCardAnimationServiceImpl.access$002(VideoCardAnimationServiceImpl.this, false);
            ldf.d(VideoCardAnimationServiceImpl.TAG, "requestListener onStart 重置coldStart");
        }
    };
    private final IContainerDataService.a mDataProcessListener = new IContainerDataService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.VideoCardAnimationServiceImpl.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void a(lli lliVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
            } else if (lliVar == null || lliVar.b() == null) {
            } else {
                VideoCardAnimationServiceImpl videoCardAnimationServiceImpl = VideoCardAnimationServiceImpl.this;
                VideoCardAnimationServiceImpl.access$102(videoCardAnimationServiceImpl, VideoCardAnimationServiceImpl.access$200(videoCardAnimationServiceImpl).a(iContainerDataModel));
                if (VideoCardAnimationServiceImpl.access$100(VideoCardAnimationServiceImpl.this) == null) {
                    VideoCardAnimationServiceImpl.access$200(VideoCardAnimationServiceImpl.this).a((String) null, true);
                    ldf.d(VideoCardAnimationServiceImpl.TAG, "dataFinish:videoAnimation null 清空本地视频");
                    return;
                }
                VideoCardAnimationServiceImpl.access$200(VideoCardAnimationServiceImpl.this).a(VideoCardAnimationServiceImpl.access$100(VideoCardAnimationServiceImpl.this));
            }
        }
    };

    static {
        kge.a(1758864212);
        kge.a(2059498290);
    }

    public static /* synthetic */ boolean access$000(VideoCardAnimationServiceImpl videoCardAnimationServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52d6c6da", new Object[]{videoCardAnimationServiceImpl})).booleanValue() : videoCardAnimationServiceImpl.isColdStart;
    }

    public static /* synthetic */ boolean access$002(VideoCardAnimationServiceImpl videoCardAnimationServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f120cc4", new Object[]{videoCardAnimationServiceImpl, new Boolean(z)})).booleanValue();
        }
        videoCardAnimationServiceImpl.isColdStart = z;
        return z;
    }

    public static /* synthetic */ JSONObject access$100(VideoCardAnimationServiceImpl videoCardAnimationServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c12d1b15", new Object[]{videoCardAnimationServiceImpl}) : videoCardAnimationServiceImpl.mVideoAnimation;
    }

    public static /* synthetic */ JSONObject access$102(VideoCardAnimationServiceImpl videoCardAnimationServiceImpl, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e1657ebd", new Object[]{videoCardAnimationServiceImpl, jSONObject});
        }
        videoCardAnimationServiceImpl.mVideoAnimation = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ d access$200(VideoCardAnimationServiceImpl videoCardAnimationServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("993b25b4", new Object[]{videoCardAnimationServiceImpl}) : videoCardAnimationServiceImpl.mVideoCardHelper;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mVideoCardHelper = new d();
        this.mDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        IContainerDataService<?> iContainerDataService = this.mDataService;
        if (iContainerDataService != null) {
            iContainerDataService.addRequestListener(this.mRequestListener);
            this.mDataService.addDataProcessListener(this.mDataProcessListener);
        }
        this.mIContainerService = (IContainerService) ljsVar.a(IContainerService.class);
        IContainerService<?> iContainerService = this.mIContainerService;
        if (iContainerService == null) {
            return;
        }
        iContainerService.addUiRefreshListener(this.uiRefreshListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public String getFirstFrameImagePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d85ffc4c", new Object[]{this});
        }
        JSONObject jSONObject = this.mVideoAnimation;
        if (jSONObject != null) {
            return this.mVideoCardHelper.a(jSONObject.getString(d.FIRST_FRAME_IMAGE_URL));
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public boolean enableShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3aefab", new Object[]{this})).booleanValue();
        }
        if (!this.isColdStart) {
            ldf.d(TAG, "enableShow:非冷起不展示");
            return false;
        }
        JSONObject jSONObject = this.mVideoAnimation;
        if (jSONObject == null || StringUtils.isEmpty(jSONObject.getString("videoUrl"))) {
            ldf.d(TAG, "enableShow:数据为空");
            return false;
        } else if (StringUtils.isEmpty(getLocalVideoPath())) {
            ldf.d(TAG, "enableShow:本地视频不存在");
            return false;
        } else if (!this.mVideoCardHelper.b(this.mVideoAnimation)) {
            ldf.d(TAG, "enableShow:notInAvailablePeriod");
            return false;
        } else if (i.a(Globals.getApplication())) {
            return true;
        } else {
            ldf.d(TAG, "enableShow:未开启自动播放");
            return false;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public float getAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b371754", new Object[]{this})).floatValue();
        }
        JSONObject jSONObject = this.mVideoAnimation;
        if (jSONObject != null) {
            return jSONObject.getFloatValue(d.ASPECT_RATIO);
        }
        return 0.0f;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public String getLocalVideoPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("258de6ce", new Object[]{this});
        }
        JSONObject jSONObject = this.mVideoAnimation;
        if (jSONObject != null) {
            return this.mVideoCardHelper.a(jSONObject.getString("videoUrl"));
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public int getTimeOut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1bc1805", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.mVideoAnimation;
        if (jSONObject != null) {
            return jSONObject.getIntValue(d.VIDEO_TIME);
        }
        return 0;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public void recordFatigue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3004f47", new Object[]{this, str});
        } else {
            this.mVideoCardHelper.b(str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public JSONObject getExposureParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a234ffb7", new Object[]{this});
        }
        JSONObject jSONObject = this.mVideoAnimation;
        if (jSONObject != null) {
            return jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM);
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public boolean isMeasureSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bf31399a", new Object[]{this})).booleanValue() : this.isMeasureSuccess;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService
    public void setMeasureState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c13a4f8", new Object[]{this, new Boolean(z)});
        } else {
            this.isMeasureSuccess = z;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mVideoAnimation = null;
        IContainerDataService<?> iContainerDataService = this.mDataService;
        if (iContainerDataService != null) {
            iContainerDataService.removeRequestListener(this.mRequestListener);
            this.mDataService.removeDataProcessListener(this.mDataProcessListener);
        }
        IContainerService<?> iContainerService = this.mIContainerService;
        if (iContainerService == null) {
            return;
        }
        iContainerService.removeUiRefreshListener(this.uiRefreshListener);
    }
}
