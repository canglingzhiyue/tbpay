package com.taobao.taolive.room.controller2;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.OpenSingleViewController;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.sdk.controller.IComponentLifeCycle2;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;

/* loaded from: classes8.dex */
public class OpenLiveSingleRoomVH extends com.taobao.taolive.sdk.controller.p implements IComponentLifeCycle2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isAboutToEndState;
    private OpenSingleViewController mController;

    static {
        kge.a(899783364);
        kge.a(1935915174);
    }

    public static /* synthetic */ Object ipc$super(OpenLiveSingleRoomVH openLiveSingleRoomVH, String str, Object... objArr) {
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

    public boolean isAboutToEndState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("75c1737f", new Object[]{this})).booleanValue() : this.isAboutToEndState;
    }

    public OpenLiveSingleRoomVH(View view) {
        super(view);
        this.mController = new OpenSingleViewController();
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
        if (this.itemView == null) {
            return;
        }
        this.mController.init(this.itemView.getContext(), this.itemView);
    }

    public String getViewItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c73b410", new Object[]{this});
        }
        OpenSingleViewController openSingleViewController = this.mController;
        return openSingleViewController != null ? openSingleViewController.getViewItemId() : "";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        this.isAboutToEndState = false;
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onWillAppear();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onWillDisappear();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPreloadView(IRecyclerModel iRecyclerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72946fa", new Object[]{this, iRecyclerModel});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null || !(iRecyclerModel instanceof TBLiveRecEngineV2.RecModel)) {
            return;
        }
        openSingleViewController.onBindView((TBLiveRecEngineV2.RecModel) iRecyclerModel);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onDidAppear();
    }

    public void interruptEndingState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15448e4e", new Object[]{this});
        } else if (!this.isAboutToEndState) {
        } else {
            this.isAboutToEndState = false;
            OpenSingleViewController openSingleViewController = this.mController;
            if (openSingleViewController == null) {
                return;
            }
            openSingleViewController.interruptEndingState();
        }
    }

    public void aboutToDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1754a2", new Object[]{this});
        } else if (this.isAboutToEndState) {
        } else {
            this.isAboutToEndState = true;
            OpenSingleViewController openSingleViewController = this.mController;
            if (openSingleViewController == null) {
                return;
            }
            openSingleViewController.aboutToDisappear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onDidDisappear();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onPause();
    }

    @Override // tb.deh
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onStart();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onResume();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onStop(true);
    }

    @Override // com.taobao.taolive.sdk.controller.p
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onStop(z);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onDestroy();
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onScrollStateChanged(i);
    }

    @Override // com.taobao.taolive.sdk.controller.p
    public void initMultiRoomVideoControllerObserver(com.taobao.taolive.sdk.playcontrol.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39b3c8c", new Object[]{this, bVar});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.initMultiRoomVideoControllerObserver(bVar);
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController == null) {
            return null;
        }
        return openSingleViewController.getUbeeContainer();
    }
}
