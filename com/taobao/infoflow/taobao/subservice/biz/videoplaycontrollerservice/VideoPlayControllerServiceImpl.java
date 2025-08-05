package com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.broadcastreceiver.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.lcz;
import tb.ldf;
import tb.ljs;
import tb.lks;
import tb.lkx;
import tb.lkz;
import tb.lsx;
import tb.lsz;

/* loaded from: classes.dex */
public class VideoPlayControllerServiceImpl implements IVideoPlayControllerService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VideoPlayControllerServiceImpl";
    private a mBroadcastRegister;
    private List<IVideoPlayControllerService.c> mCheckExecutePlayListeners;
    private IContainerDataService<?> mContainerDataService;
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private IPullSecondFloorService mPullSecondFloorService;
    private lsx mVideoPlayController;

    static {
        kge.a(1598297434);
        kge.a(2137249620);
    }

    public static /* synthetic */ List access$000(VideoPlayControllerServiceImpl videoPlayControllerServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("301b01b7", new Object[]{videoPlayControllerServiceImpl}) : videoPlayControllerServiceImpl.mCheckExecutePlayListeners;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mVideoPlayController = new lsz(ljsVar, createCheckExecutePlayListener());
        this.mMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        registerFeedsListener();
        this.mPullSecondFloorService = (IPullSecondFloorService) ljsVar.a(IPullSecondFloorService.class);
        registerPullDownListener();
        this.mContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        registerDataListener();
        this.mBroadcastRegister = new a();
        this.mBroadcastRegister.c();
        this.mBroadcastRegister.a();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterFeedsListener();
        unRegisterPullDownListener();
        unRegisterDataListener();
        a aVar = this.mBroadcastRegister;
        if (aVar != null) {
            aVar.b();
            this.mBroadcastRegister.d();
        }
        lsx lsxVar = this.mVideoPlayController;
        if (lsxVar == null) {
            return;
        }
        lsxVar.c();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService
    public boolean isEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        lsx lsxVar = this.mVideoPlayController;
        if (lsxVar == null) {
            ldf.d(TAG, "isEnable， 时序出现问题，请检查服务配置！");
            if (lcz.b()) {
                throw new InfoFlowRuntimeException("PlayControllerService, 时序出现问题，请检查服务配置！");
            }
            return false;
        }
        return lsxVar.d();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService
    public void forceInsertToQueueHeader(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb734153", new Object[]{this, str, new Integer(i)});
            return;
        }
        lsx lsxVar = this.mVideoPlayController;
        if (lsxVar == null) {
            return;
        }
        lsxVar.a(str, i);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService
    public void triggerVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bbaed86", new Object[]{this});
            return;
        }
        lsx lsxVar = this.mVideoPlayController;
        if (lsxVar == null) {
            return;
        }
        lsxVar.b(false);
        this.mVideoPlayController.f();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService
    public void triggerVideoStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef426e4c", new Object[]{this});
            return;
        }
        lsx lsxVar = this.mVideoPlayController;
        if (lsxVar == null) {
            return;
        }
        lsxVar.b(true);
        this.mVideoPlayController.e();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService
    public void addCheckExecutePlayListener(IVideoPlayControllerService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49444f31", new Object[]{this, cVar});
            return;
        }
        if (this.mCheckExecutePlayListeners == null) {
            this.mCheckExecutePlayListeners = new CopyOnWriteArrayList();
        }
        this.mCheckExecutePlayListeners.add(cVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService
    public void removeCheckExecutePlayListener(IVideoPlayControllerService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4921dee", new Object[]{this, cVar});
            return;
        }
        List<IVideoPlayControllerService.c> list = this.mCheckExecutePlayListeners;
        if (list == null || cVar == null) {
            return;
        }
        list.remove(cVar);
    }

    private void registerFeedsListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3b860d", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService == null) {
            return;
        }
        lks mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister();
        mo1084getLifeCycleRegister.a((lks.d) this.mVideoPlayController);
        mo1084getLifeCycleRegister.a((lkz.a) this.mVideoPlayController);
        mo1084getLifeCycleRegister.a((lks.c) this.mVideoPlayController);
        mo1084getLifeCycleRegister.a((lkx.a) this.mVideoPlayController);
        mo1084getLifeCycleRegister.a((lks.b) this.mVideoPlayController);
    }

    private void unRegisterFeedsListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a04574", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService == null) {
            return;
        }
        lks mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister();
        mo1084getLifeCycleRegister.b((lks.d) this.mVideoPlayController);
        mo1084getLifeCycleRegister.b((lkz.a) this.mVideoPlayController);
        mo1084getLifeCycleRegister.b((lks.c) this.mVideoPlayController);
        mo1084getLifeCycleRegister.b((lkx.a) this.mVideoPlayController);
        mo1084getLifeCycleRegister.b((lks.b) this.mVideoPlayController);
    }

    private void registerDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff3b0c8", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService == null) {
            return;
        }
        iContainerDataService.addDataProcessListener(this.mVideoPlayController);
    }

    private void unRegisterDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(this.mVideoPlayController);
    }

    private void registerPullDownListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44fe0a5", new Object[]{this});
            return;
        }
        IPullSecondFloorService iPullSecondFloorService = this.mPullSecondFloorService;
        if (iPullSecondFloorService == null) {
            return;
        }
        iPullSecondFloorService.addLifeCycleListener(this.mVideoPlayController);
    }

    private void unRegisterPullDownListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96d93de", new Object[]{this});
            return;
        }
        IPullSecondFloorService iPullSecondFloorService = this.mPullSecondFloorService;
        if (iPullSecondFloorService == null) {
            return;
        }
        iPullSecondFloorService.removeLifeCycleListener(this.mVideoPlayController);
    }

    private IVideoPlayControllerService.c createCheckExecutePlayListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IVideoPlayControllerService.c) ipChange.ipc$dispatch("aedfc116", new Object[]{this}) : new IVideoPlayControllerService.c() { // from class: com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.VideoPlayControllerServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService.c
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (VideoPlayControllerServiceImpl.access$000(VideoPlayControllerServiceImpl.this) != null) {
                    for (IVideoPlayControllerService.c cVar : VideoPlayControllerServiceImpl.access$000(VideoPlayControllerServiceImpl.this)) {
                        cVar.a();
                    }
                }
            }
        };
    }
}
