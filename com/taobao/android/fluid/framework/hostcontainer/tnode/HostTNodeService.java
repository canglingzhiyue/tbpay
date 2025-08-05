package com.taobao.android.fluid.framework.hostcontainer.tnode;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.event.b;
import java.util.Map;
import tb.ihj;
import tb.jcj;
import tb.kge;
import tb.oeb;
import tb.sma;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public class HostTNodeService implements IHostTNodeService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HostTNodeService";
    private final FluidContext mFluidContext;
    private boolean mHasRegisterHandler = false;
    private ILifecycleService mLifecycleService;
    private IMessageService mMessageService;
    private ISceneConfigService mSceneConfigService;
    private ab mSharedTNodeEngine;
    private Component mTNodeComponent;

    static {
        kge.a(1564944959);
        kge.a(754609496);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public static /* synthetic */ Component access$000(HostTNodeService hostTNodeService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Component) ipChange.ipc$dispatch("fb888306", new Object[]{hostTNodeService}) : hostTNodeService.mTNodeComponent;
    }

    public static /* synthetic */ Component access$002(HostTNodeService hostTNodeService, Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("b289465d", new Object[]{hostTNodeService, component});
        }
        hostTNodeService.mTNodeComponent = component;
        return component;
    }

    public static /* synthetic */ void access$100(HostTNodeService hostTNodeService, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d160d2", new Object[]{hostTNodeService, aaVar});
        } else {
            hostTNodeService.registerGlobalMessageToHomeHandler(aaVar);
        }
    }

    public HostTNodeService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService
    public ab getSharedTNodeEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab) ipChange.ipc$dispatch("2a6de639", new Object[]{this}) : this.mSharedTNodeEngine;
    }

    @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService
    public void reLayoutForVirtualNavigationBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c8f307", new Object[]{this});
            return;
        }
        Component component = this.mTNodeComponent;
        if (component == null) {
            spz.c(TAG, "TNode 组件为空，reLayoutForVirtualNavigationBar 失败");
        } else if (component.getFlexBoxNode() == null || !enableRelayoutForVirtualNavigationBar()) {
        } else {
            spz.c(TAG, "执行了Relayout");
            this.mTNodeComponent.getFlexBoxNode().e();
        }
    }

    @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService
    public void sendMessage(String str, String str2, Map map, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c9a9b6", new Object[]{this, str, str2, map, bVar});
            return;
        }
        Component component = this.mTNodeComponent;
        if (component == null) {
            spz.c(TAG, "TNode 组件为空，sendMessage 失败");
        } else if (component.getTNode() == null || this.mTNodeComponent.getTNode().k() == null) {
        } else {
            Component component2 = this.mTNodeComponent;
            component2.sendMessage(component2.getNode(), str, str2, map, bVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService
    public aa getTNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("f30069b7", new Object[]{this});
        }
        Component component = this.mTNodeComponent;
        if (component != null) {
            return component.getTNode();
        }
        return null;
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        spz.c(TAG, "HostTNodeService 执行 onCreate, mSharedTNodeEngine = " + this.mSharedTNodeEngine);
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        spz.c(TAG, "HostTNodeService 执行 onStart, mSharedTNodeEngine = " + this.mSharedTNodeEngine);
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        spz.c(TAG, "HostTNodeService 执行 onResume, mSharedTNodeEngine = " + this.mSharedTNodeEngine);
        ab abVar = this.mSharedTNodeEngine;
        if (abVar == null) {
            return;
        }
        abVar.v();
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        spz.c(TAG, "HostTNodeService 执行 onPause, mSharedTNodeEngine = " + this.mSharedTNodeEngine);
        ab abVar = this.mSharedTNodeEngine;
        if (abVar == null) {
            return;
        }
        abVar.w();
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        spz.c(TAG, "HostTNodeService 执行 onStop, mSharedTNodeEngine = " + this.mSharedTNodeEngine);
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        spz.c(TAG, "HostTNodeService 执行 onDestroy, mSharedTNodeEngine = " + this.mSharedTNodeEngine);
        ab abVar = this.mSharedTNodeEngine;
        if (abVar == null) {
            return;
        }
        abVar.y();
        this.mSharedTNodeEngine = null;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        this.mSceneConfigService = (ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class);
        this.mMessageService = (IMessageService) this.mFluidContext.getService(IMessageService.class);
        this.mLifecycleService.addPageLifecycleListener(this);
        this.mTNodeComponent = this.mFluidContext.getInstanceConfig().getHostTNodeComponent();
        Component component = this.mTNodeComponent;
        if (component != null) {
            registerGlobalMessageToHomeHandler(component.getTNode());
        }
        this.mSceneConfigService.addInstanceConfigChangedListener(new ihj() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.HostTNodeService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ihj
            public void a(FluidInstanceConfig fluidInstanceConfig, sps spsVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1183802a", new Object[]{this, fluidInstanceConfig, spsVar});
                    return;
                }
                HostTNodeService.access$002(HostTNodeService.this, fluidInstanceConfig.getHostTNodeComponent());
                if (HostTNodeService.access$000(HostTNodeService.this) == null) {
                    return;
                }
                HostTNodeService hostTNodeService = HostTNodeService.this;
                HostTNodeService.access$100(hostTNodeService, HostTNodeService.access$000(hostTNodeService).getTNode());
            }
        });
    }

    @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService
    public void createSharedTNodeEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c73683e", new Object[]{this});
            return;
        }
        this.mSharedTNodeEngine = new ab();
        this.mSharedTNodeEngine.b(this.mMessageService.getMessageCenter());
    }

    private boolean enableRelayoutForVirtualNavigationBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e730ea8", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableRelayoutForVirtualNavigationBar", true);
    }

    private void registerGlobalMessageToHomeHandler(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2c60de", new Object[]{this, aaVar});
        } else if (this.mHasRegisterHandler) {
            spz.c(TAG, "TAB2 首页通信消息 Handler 已经注册");
        } else if (aaVar == null) {
            spz.c(TAG, "TAB2 首页通信消息 Handler 注册失败，tNode 为空");
        } else {
            sma messageCenter = this.mMessageService.getMessageCenter();
            if (messageCenter == null) {
                spz.c(TAG, "TAB2 首页通信消息 Handler 注册失败，MessageCenter 为空");
                return;
            }
            messageCenter.registerMessageHandler(new jcj(aaVar));
            this.mHasRegisterHandler = true;
            spz.c(TAG, "TAB2 首页通信消息 Handler 注册成功");
        }
    }
}
