package com.taobao.infoflow.taobao.subservice.biz.liveservice;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.kge;
import tb.ljs;
import tb.lks;
import tb.lof;
import tb.log;
import tb.qno;

/* loaded from: classes.dex */
public class TbLiveCardServiceImpl implements ITbLiveCardService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = "TbLiveCardServiceImpl";
    private Context mContext;
    private lof mInfoFlowLiveController;
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private lks.c<?> mOnFeedScrollListener;

    static {
        kge.a(-425834832);
        kge.a(1925595905);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        if (this.mMainFeedsViewService == null || qno.c()) {
            return;
        }
        this.mOnFeedScrollListener = new log(this.mMainFeedsViewService);
        this.mMainFeedsViewService.mo1084getLifeCycleRegister().a(this.mOnFeedScrollListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService != null && this.mOnFeedScrollListener != null) {
            iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.mOnFeedScrollListener);
        }
        destroy();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService
    public View getVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fdace493", new Object[]{this});
        }
        lof lofVar = this.mInfoFlowLiveController;
        if (lofVar != null) {
            return lofVar.a();
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        lof lofVar = this.mInfoFlowLiveController;
        return lofVar != null && lofVar.b();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService
    public boolean startVideo(Context context, ITbLiveCardService.b bVar, ITbLiveCardService.a aVar, ITbLiveCardService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f190b7c", new Object[]{this, context, bVar, aVar, cVar})).booleanValue();
        }
        if (initLiveController(context)) {
            return this.mInfoFlowLiveController.a(bVar, aVar, cVar);
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService
    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
            return;
        }
        lof lofVar = this.mInfoFlowLiveController;
        if (lofVar == null) {
            return;
        }
        lofVar.c();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        lof lofVar = this.mInfoFlowLiveController;
        if (lofVar == null) {
            return;
        }
        lofVar.d();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService
    public void setMediaStatusListener(ITbLiveCardService.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36048a9d", new Object[]{this, dVar});
            return;
        }
        lof lofVar = this.mInfoFlowLiveController;
        if (lofVar == null) {
            return;
        }
        lofVar.a(dVar);
    }

    private boolean initLiveController(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97061d4d", new Object[]{this, context})).booleanValue();
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        if (this.mContext != context) {
            destroy();
            this.mContext = context;
            init();
        }
        return true;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.mInfoFlowLiveController = new lof(this.mContext);
        }
    }
}
