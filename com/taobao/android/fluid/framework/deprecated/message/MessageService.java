package com.taobao.android.fluid.framework.deprecated.message;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import java.util.HashMap;
import tb.jul;
import tb.juy;
import tb.kge;
import tb.knj;
import tb.psw;
import tb.ska;
import tb.skl;
import tb.sma;
import tb.smb;
import tb.smh;
import tb.snd;
import tb.spx;
import tb.spy;
import tb.suz;

@Deprecated
/* loaded from: classes5.dex */
public class MessageService implements IMessageService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IMessageService";
    private static final String TAG = "MessageService";
    private final FluidContext mFluidContext;
    private smh mFluidInstanceMessageSender;
    private IHostTNodeService mHostTNodeService;
    private ILifecycleService mILifecycleService;
    private sma mMessageCenter;
    private final knj mMessageListenerManager;

    static {
        kge.a(2021564585);
        kge.a(1578823900);
    }

    public static /* synthetic */ FluidContext access$000(MessageService messageService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("fc82cbcb", new Object[]{messageService}) : messageService.mFluidContext;
    }

    public static /* synthetic */ sma access$100(MessageService messageService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sma) ipChange.ipc$dispatch("b6adfb81", new Object[]{messageService}) : messageService.mMessageCenter;
    }

    public MessageService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mMessageListenerManager = new knj(this.mFluidContext);
    }

    @Override // tb.jwf
    public void addMessageListener(String str, juy juyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd87fe2d", new Object[]{this, str, juyVar});
        } else {
            this.mMessageListenerManager.addMessageListener(str, juyVar);
        }
    }

    @Override // tb.jwf
    public void removeMessageListener(String str, juy juyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c23732a", new Object[]{this, str, juyVar});
        } else {
            this.mMessageListenerManager.removeMessageListener(str, juyVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.IMessageService
    public sma getMessageCenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sma) ipChange.ipc$dispatch("a5cf8472", new Object[]{this}) : this.mMessageCenter;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mHostTNodeService = (IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class);
        this.mILifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        this.mMessageCenter = new sma(this.mFluidContext, this.mMessageListenerManager);
        this.mFluidInstanceMessageSender = new smh(this.mFluidContext);
        observePageLifecycle();
        observeServerConfigChange();
        observeFirstCardRender();
        registerGlobalMessageHandler();
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            onDestroy();
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.mMessageCenter.a();
        }
    }

    @Override // tb.slz
    public void registerMessageHandler(spx spxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b16ee22", new Object[]{this, spxVar});
        } else {
            this.mMessageCenter.registerMessageHandler(spxVar);
        }
    }

    @Override // tb.slz
    public void sendMessage(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3eb99a", new Object[]{this, spyVar});
        } else {
            this.mMessageCenter.sendMessage(spyVar);
        }
    }

    @Override // tb.slz
    public void unRegisterMessageHandler(spx spxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1925929b", new Object[]{this, spxVar});
        } else {
            this.mMessageCenter.unRegisterMessageHandler(spxVar);
        }
    }

    private void observeFirstCardRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff7c261", new Object[]{this});
        } else {
            ((IContainerService) this.mFluidContext.getService(IContainerService.class)).addFirstCardRenderListener(new ska() { // from class: com.taobao.android.fluid.framework.deprecated.message.MessageService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ska
                public void onFirstCardRenderFailed(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f9d76177", new Object[]{this, pswVar});
                    }
                }

                @Override // tb.ska
                public void onFirstCardRenderSuccess(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7ed75eef", new Object[]{this, pswVar});
                    } else {
                        ((IMessageService) MessageService.access$000(MessageService.this).getService(IMessageService.class)).sendMessage(new spy(suz.FIRST_FRAME_RENDER_FINISH_NAME, "-1", null));
                    }
                }
            });
        }
    }

    private void observePageLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11a9ee6", new Object[]{this});
        } else {
            this.mILifecycleService.addPageLifecycleListener(new snd.a() { // from class: com.taobao.android.fluid.framework.deprecated.message.MessageService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.snd.a, tb.snd
                public void cI_() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f6eaece0", new Object[]{this});
                    } else {
                        MessageService.access$100(MessageService.this).a();
                    }
                }
            });
        }
    }

    private void observeServerConfigChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7e02b8", new Object[]{this});
        } else {
            ((IDataService) this.mFluidContext.getService(IDataService.class)).addServerConfigChangeListener(new jul() { // from class: com.taobao.android.fluid.framework.deprecated.message.MessageService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jul
                public void onServerConfigChanged(skl sklVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e5711093", new Object[]{this, sklVar});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("options", smb.a(MessageService.access$000(MessageService.this), null));
                    ((IMessageService) MessageService.access$000(MessageService.this).getService(IMessageService.class)).sendMessage(new spy("VSMSG_initEnvOptionsChange", "-1", hashMap));
                }
            });
        }
    }

    private void registerGlobalMessageHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b9eb10", new Object[]{this});
            return;
        }
        FluidContext fluidContext = this.mFluidContext;
        registerMessageHandler(new a(fluidContext, fluidContext.getContext()));
    }
}
