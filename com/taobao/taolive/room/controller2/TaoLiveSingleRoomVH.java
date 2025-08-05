package com.taobao.taolive.room.controller2;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.sdk.controller.IComponentLifeCycle2;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;

/* loaded from: classes8.dex */
public class TaoLiveSingleRoomVH extends com.taobao.taolive.sdk.controller.p implements IComponentLifeCycle2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TaoLiveSingleRoomController mController;

    static {
        kge.a(305762506);
        kge.a(1935915174);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveSingleRoomVH taoLiveSingleRoomVH, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -446857931) {
            super.setGlobalContext((com.taobao.taolive.sdk.controller.e) objArr[0]);
            return null;
        } else if (hashCode != 267248023) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.init();
            return null;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
        }
    }

    @Override // tb.deh
    public void onRemove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885fa4a", new Object[]{this});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onUnloadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931608a", new Object[]{this});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
        }
    }

    public TaoLiveSingleRoomVH(View view) {
        super(view);
        this.mController = new TaoLiveSingleRoomController();
    }

    @Override // com.taobao.taolive.sdk.controller.p
    public void setGlobalContext(com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e55d7d35", new Object[]{this, eVar});
            return;
        }
        super.setGlobalContext(eVar);
        this.mController.setGlobalContext(eVar);
    }

    @Override // com.taobao.taolive.sdk.controller.p
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        this.mController.init(this.itemView);
    }

    public String getViewItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c73b410", new Object[]{this});
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        return taoLiveSingleRoomController != null ? taoLiveSingleRoomController.getViewItemId() : "";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return;
        }
        taoLiveSingleRoomController.onWillAppear();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return;
        }
        taoLiveSingleRoomController.onWillDisappear();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPreloadView(IRecyclerModel iRecyclerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72946fa", new Object[]{this, iRecyclerModel});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null || !(iRecyclerModel instanceof TBLiveRecEngineV2.RecModel)) {
            return;
        }
        taoLiveSingleRoomController.onBindView((TBLiveRecEngineV2.RecModel) iRecyclerModel);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return;
        }
        taoLiveSingleRoomController.onDidAppear();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return;
        }
        taoLiveSingleRoomController.onDidDisappear();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return;
        }
        taoLiveSingleRoomController.onPause();
    }

    @Override // tb.deh
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return;
        }
        taoLiveSingleRoomController.onStart();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return;
        }
        taoLiveSingleRoomController.onResume();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return;
        }
        taoLiveSingleRoomController.onStop();
    }

    @Override // com.taobao.taolive.sdk.controller.p
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return;
        }
        taoLiveSingleRoomController.onStop();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return;
        }
        taoLiveSingleRoomController.onDestroy();
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return;
        }
        taoLiveSingleRoomController.onScrollStateChanged(i);
    }

    @Override // com.taobao.taolive.sdk.controller.p
    public void initMultiRoomVideoControllerObserver(com.taobao.taolive.sdk.playcontrol.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39b3c8c", new Object[]{this, bVar});
            return;
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return;
        }
        taoLiveSingleRoomController.initMultiRoomVideoControllerObserver(bVar);
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        TaoLiveSingleRoomController taoLiveSingleRoomController = this.mController;
        if (taoLiveSingleRoomController == null) {
            return null;
        }
        return taoLiveSingleRoomController.getUbeeContainer();
    }
}
