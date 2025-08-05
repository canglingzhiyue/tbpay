package com.taobao.taolive.room.ui.system_component;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.sdk.core.j;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.tbliveinteractive.e;
import com.taobao.tbliveinteractive.view.system_component.f;
import tb.kge;
import tb.phq;

/* loaded from: classes8.dex */
public class SystemComponentFrameSDK extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private d.a mMessageListener;
    private f mSystemComponentController;

    static {
        kge.a(1334649716);
    }

    public static /* synthetic */ Object ipc$super(SystemComponentFrameSDK systemComponentFrameSDK, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1777320968:
                super.onCreateView2((ViewGroup) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : f.TAG;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    public static /* synthetic */ f access$000(SystemComponentFrameSDK systemComponentFrameSDK) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("8dd2563b", new Object[]{systemComponentFrameSDK}) : systemComponentFrameSDK.mSystemComponentController;
    }

    public SystemComponentFrameSDK(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
        this.mMessageListener = new d.a() { // from class: com.taobao.taolive.room.ui.system_component.SystemComponentFrameSDK.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (1052 == i || 1053 == i) {
                    if (SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this) == null) {
                        return;
                    }
                    SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this);
                } else if (11055 != i || SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this) == null || !(obj instanceof String)) {
                } else {
                    SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this).b((String) obj);
                }
            }
        };
    }

    public SystemComponentFrameSDK(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mMessageListener = new d.a() { // from class: com.taobao.taolive.room.ui.system_component.SystemComponentFrameSDK.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (1052 == i || 1053 == i) {
                    if (SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this) == null) {
                        return;
                    }
                    SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this);
                } else if (11055 != i || SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this) == null || !(obj instanceof String)) {
                } else {
                    SystemComponentFrameSDK.access$000(SystemComponentFrameSDK.this).b((String) obj);
                }
            }
        };
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        super.onCreateView2(viewGroup);
        this.mContainer = viewGroup;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        e tBLiveInteractiveManager = getTBLiveInteractiveManager();
        if (tBLiveInteractiveManager != null && (this.mContainer instanceof ViewGroup) && this.mLiveDataModel != null) {
            this.mSystemComponentController = tBLiveInteractiveManager.a((ViewGroup) this.mContainer, this.mLiveDataModel.mVideoInfo, isLandscape());
            f fVar = this.mSystemComponentController;
            if (fVar != null) {
                fVar.a();
            }
        }
        j.a(this.mFrameContext, this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.taolive.room.ui.system_component.SystemComponentFrameSDK.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1052 || i == 1053 || i == 11055;
            }
        });
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        j.a(this.mFrameContext, this.mMessageListener);
        f fVar = this.mSystemComponentController;
        if (fVar != null) {
            fVar.b();
            this.mSystemComponentController = null;
        }
        if (!(this.mContainer instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.mContainer).removeAllViews();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i != 1) {
            return;
        }
        init();
    }

    private e getTBLiveInteractiveManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a8e86078", new Object[]{this});
        }
        if (!(this.mFrameContext instanceof phq)) {
            return null;
        }
        return ((phq) this.mFrameContext).p();
    }
}
