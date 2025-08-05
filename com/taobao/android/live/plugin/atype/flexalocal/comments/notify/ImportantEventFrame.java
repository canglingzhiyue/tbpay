package com.taobao.android.live.plugin.atype.flexalocal.comments.notify;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.utils.y;
import tb.hkk;
import tb.hkm;
import tb.kge;
import tb.phq;
import tb.plx;

/* loaded from: classes5.dex */
public class ImportantEventFrame extends BaseFrame implements d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ImportantEventFrame";
    private FrameLayout mDxRootView;
    private boolean mEnableImportantHighPriority;
    private phq mFrameContext;
    private com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend.b mGoodRecommendManager;
    private d mIImportantEvent;
    private FrameLayout mRootView;

    static {
        kge.a(-1415505506);
        kge.a(-2101054629);
    }

    public static /* synthetic */ Object ipc$super(ImportantEventFrame importantEventFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean asyncRenderComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3514e8f6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "tl-important-event";
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        }
    }

    public ImportantEventFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mFrameContext = (phq) aVar;
        this.mEnableImportantHighPriority = hkk.g();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.mIImportantEvent = new f(this.mFrameContext, this.mRootView, this.mDxRootView, this.mEnableImportantHighPriority);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_room_important_event_notify_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mRootView = (FrameLayout) view;
        this.mDxRootView = (FrameLayout) view.findViewById(R.id.fl_important_dx_root);
        init();
        com.taobao.android.live.plugin.proxy.e.c("ImportantEventFrame: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (hkk.w() && !y.e(this.mContext) && isLandscape()) {
            return;
        }
        this.mIImportantEvent.g();
        if (this.mGoodRecommendManager == null) {
            this.mGoodRecommendManager = new com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend.b(this.mFrameContext);
        }
        this.mGoodRecommendManager.a(tBLiveDataModel);
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && tBLiveDataModel.mVideoInfo.accountTag != null) {
            this.mIImportantEvent.a(tBLiveDataModel.mVideoInfo.accountTag);
            plx.a(TAG, "updateAccountTagData");
        }
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null) {
            this.mIImportantEvent.a(tBLiveDataModel.mVideoInfo.importantEventList);
            plx.a(TAG, "updateImportantData");
        }
        if (!this.mEnableImportantHighPriority) {
            return;
        }
        this.mIImportantEvent.i();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend.b bVar = this.mGoodRecommendManager;
        if (bVar == null) {
            return;
        }
        bVar.b();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend.b bVar = this.mGoodRecommendManager;
        if (bVar == null) {
            return;
        }
        bVar.c();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        d dVar = this.mIImportantEvent;
        if (dVar != null) {
            dVar.h();
        }
        com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend.b bVar = this.mGoodRecommendManager;
        if (bVar == null) {
            return;
        }
        bVar.a();
        this.mGoodRecommendManager = null;
    }
}
