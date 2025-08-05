package com.taobao.infoflow.taobao.subservice.biz.pop;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.event.IPopMessageListener;
import com.taobao.homepage.pop.protocol.event.IPopViewEventListener;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.e;
import com.taobao.homepage.utils.n;
import com.taobao.infoflow.core.subservice.framework.container.containerservice.a;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.b;
import com.taobao.infoflow.taobao.subservice.biz.pop.jsbridge.c;
import com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle.d;
import java.util.Map;
import java.util.WeakHashMap;
import tb.fpz;
import tb.kge;
import tb.kyu;
import tb.lar;
import tb.ldf;
import tb.ljd;
import tb.ljs;
import tb.lkq;
import tb.lqw;
import tb.lqx;
import tb.lqy;
import tb.lqz;
import tb.lra;
import tb.lrb;
import tb.lyp;

/* loaded from: classes.dex */
public class TbPopViewServiceImpl implements IFoldDeviceAndPadService.a, IPopViewService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PopViewServiceImpl ";
    private IFoldDeviceAndPadService mFoldAndPadService;
    private ljs mInfoFlowContext;
    private boolean mIsPortrait;
    private c mPopBridgeRegister;
    private final kyu mPopEngine;
    private lqz mPopViewUpdateProcess;
    private lra mPullSecondAnimationProcess;
    private final a containerLifecycleRegister = new a();
    private final d mLifeCycleRegister = new d();
    private final lyp mFullScreenInvoker = new lyp();
    private final lqy mWindowInvoker = new lqy();
    private final lqw mMainInvoker = new lqw();
    private final lqx mSubInvoker = new lqx();
    private Map<IPopViewService.b, IPopViewEventListener> eventListenerMap = new WeakHashMap(32);
    private Map<IPopViewService.a, IPopMessageListener> messageListenerMap = new WeakHashMap(32);
    private Map<IPopViewService.c, com.taobao.homepage.pop.protocol.event.a> mViewUpdateListenerMap = new WeakHashMap(32);

    static {
        kge.a(-186523360);
        kge.a(-5954903);
        kge.a(1412918683);
    }

    public static /* synthetic */ void access$000(TbPopViewServiceImpl tbPopViewServiceImpl, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c09482", new Object[]{tbPopViewServiceImpl, context});
        } else {
            tbPopViewServiceImpl.checkInitPop(context);
        }
    }

    public TbPopViewServiceImpl() {
        lar.k("HomePopEngine");
        this.mPopEngine = new kyu(this.mFullScreenInvoker, this.mWindowInvoker, this.mMainInvoker, this.mSubInvoker);
        lar.l("HomePopEngine");
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        com.taobao.homepage.pop.utils.c.a(TAG, "onCreateService, hashCode=" + hashCode());
        this.mInfoFlowContext = ljsVar;
        this.mMainInvoker.a(ljsVar);
        this.mSubInvoker.a(ljsVar);
        this.mWindowInvoker.a(ljsVar);
        this.mPopBridgeRegister = new c(this.mInfoFlowContext);
        this.mPopEngine.a(2, lrb.class);
        this.mPullSecondAnimationProcess = new lra(ljsVar, this.mPopEngine);
        this.mPopViewUpdateProcess = new lqz(ljsVar);
        this.mFoldAndPadService = (IFoldDeviceAndPadService) ljsVar.a(IFoldDeviceAndPadService.class);
        registerOnScreenChangeListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        com.taobao.homepage.pop.utils.c.a(TAG, "onDestroyService, hashCode=" + hashCode());
        this.mLifeCycleRegister.a(this.mPopEngine);
        this.mPopEngine.c().g();
        lra lraVar = this.mPullSecondAnimationProcess;
        if (lraVar != null) {
            lraVar.a();
        }
        lqz lqzVar = this.mPopViewUpdateProcess;
        if (lqzVar != null) {
            lqzVar.a();
        }
        unRegisterOnScreenChangeListener();
        lqx lqxVar = this.mSubInvoker;
        if (lqxVar == null) {
            return;
        }
        lqxVar.c();
    }

    @Override // tb.lkq
    /* renamed from: createContainer */
    public ViewGroup mo1092createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1c667639", new Object[]{this, context});
        }
        if (n.n().v()) {
            return createContainerInPreRender(context);
        }
        return createContainerDefault(context);
    }

    public ViewGroup createContainerDefault(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cc49dd70", new Object[]{this, context});
        }
        com.taobao.homepage.pop.utils.c.a(TAG, "createContainer, hashCode=" + hashCode());
        if (!(context instanceof Activity)) {
            com.taobao.homepage.pop.utils.c.a(TAG, "pop engine onCreate failed, context not activity");
            return null;
        }
        this.mWindowInvoker.a(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.mSubInvoker.a(frameLayout);
        this.mPopEngine.c().a((Activity) context);
        this.mLifeCycleRegister.a(this.mInfoFlowContext, this.mPopEngine);
        this.mPopBridgeRegister.a(this.mPopEngine);
        this.mIsPortrait = b.b(context);
        return frameLayout;
    }

    public ViewGroup createContainerInPreRender(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("61f924a3", new Object[]{this, context});
        }
        com.taobao.homepage.pop.utils.c.a(TAG, "createContainerInPreRender, hashCode=" + hashCode());
        FrameLayout frameLayout = new FrameLayout(context);
        this.mSubInvoker.a(frameLayout);
        ljd.a().b(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.pop.TbPopViewServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TbPopViewServiceImpl.access$000(TbPopViewServiceImpl.this, context);
                }
            }
        });
        this.mLifeCycleRegister.a(this.mInfoFlowContext, this.mPopEngine);
        this.mPopBridgeRegister.a(this.mPopEngine);
        this.mIsPortrait = b.b(context);
        return frameLayout;
    }

    private void checkInitPop(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c456c8", new Object[]{this, context});
            return;
        }
        Context realActivityContext = getRealActivityContext(context);
        if (realActivityContext != null) {
            ldf.d(TAG, "createContainerInPreRender activity not null");
            this.mWindowInvoker.a(realActivityContext);
            this.mPopEngine.c().a((Activity) realActivityContext);
            return;
        }
        ljd.a().a(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.pop.TbPopViewServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TbPopViewServiceImpl.access$000(TbPopViewServiceImpl.this, context);
                }
            }
        }, 0L);
    }

    private Context getRealActivityContext(Context context) {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("240efdad", new Object[]{this, context});
        }
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof fpz) {
            context2 = ((fpz) context).a();
        } else if (context instanceof com.taobao.prefork.a) {
            context2 = ((com.taobao.prefork.a) context).a();
        } else {
            ldf.d(TAG, "getRealActivityContext in else, activityContext is null");
            context2 = null;
        }
        if (!(context2 instanceof Activity)) {
            return null;
        }
        return context2;
    }

    @Override // tb.lkq
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        com.taobao.homepage.pop.utils.c.a(TAG, "destroyContainer, hashCode=" + hashCode());
        this.mPopBridgeRegister.a();
        this.mPopEngine.c().g();
    }

    @Override // tb.lkq
    public void addOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3597dd", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.a(aVar);
        }
    }

    @Override // tb.lkq
    public void removeOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8982e05a", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.b(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public boolean isPopViewOnScreen(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ff156ac", new Object[]{this, str})).booleanValue();
        }
        lqz lqzVar = this.mPopViewUpdateProcess;
        if (lqzVar != null) {
            return lqzVar.a(str);
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void addPopEventListener(final IPopViewService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("500143f5", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            IPopViewEventListener iPopViewEventListener = new IPopViewEventListener() { // from class: com.taobao.infoflow.taobao.subservice.biz.pop.TbPopViewServiceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.homepage.pop.protocol.event.IPopViewEventListener
                public void onEvent(int i, IPopData iPopData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b090649f", new Object[]{this, new Integer(i), iPopData});
                    }
                }
            };
            this.eventListenerMap.put(bVar, iPopViewEventListener);
            this.mPopEngine.a(iPopViewEventListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void removePopEventListener(IPopViewService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85a1332", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.mPopEngine.b(this.eventListenerMap.remove(bVar));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void addPopMessageListener(final IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59b3009", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            IPopMessageListener iPopMessageListener = new IPopMessageListener() { // from class: com.taobao.infoflow.taobao.subservice.biz.pop.TbPopViewServiceImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.homepage.pop.protocol.event.IPopMessageListener
                public void onMessage(String str, IPopData iPopData, JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9b3eda9", new Object[]{this, str, iPopData, jSONObject});
                    } else {
                        aVar.a(str, iPopData, jSONObject);
                    }
                }
            };
            this.messageListenerMap.put(aVar, iPopMessageListener);
            this.mPopEngine.a(iPopMessageListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void removePopMessageListener(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafd2406", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.mPopEngine.b(this.messageListenerMap.remove(aVar));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void addPopViewUpdateListener(final IPopViewService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c27d080", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            com.taobao.homepage.pop.protocol.event.a aVar = new com.taobao.homepage.pop.protocol.event.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.pop.TbPopViewServiceImpl.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.homepage.pop.protocol.event.a
                public void a(View view, IPopData<?> iPopData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("464c2516", new Object[]{this, view, iPopData});
                    } else if (iPopData == null) {
                    } else {
                        cVar.a(iPopData.getBusinessID());
                    }
                }

                @Override // com.taobao.homepage.pop.protocol.event.a
                public void b(View view, IPopData<?> iPopData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("471aa397", new Object[]{this, view, iPopData});
                    } else if (iPopData == null) {
                    } else {
                        cVar.b(iPopData.getBusinessID());
                    }
                }
            };
            this.mViewUpdateListenerMap.put(cVar, aVar);
            this.mPopEngine.a(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void removePopViewUpdateListener(IPopViewService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0fff63", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.mPopEngine.b(this.mViewUpdateListenerMap.remove(cVar));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void onPopTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c7b785", new Object[]{this});
        } else {
            this.mPopEngine.c().b(3);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void onPopTabUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf130ffe", new Object[]{this});
        } else {
            this.mPopEngine.c().c(3);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void triggerPopEvent(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63834865", new Object[]{this, new Integer(i), str});
        } else {
            this.mPopEngine.a(i, str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void triggerPopShow(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a047d50", new Object[]{this, new Integer(i), str});
        } else {
            this.mPopEngine.b(i, str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void triggerPopRemove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2cf362e", new Object[]{this, str});
        } else {
            this.mPopEngine.b(str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void triggerPopShowWithDataReset(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d36dd", new Object[]{this, new Integer(i), str});
        } else {
            this.mPopEngine.c(i, str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void triggerPopShowByCustomData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9661dea1", new Object[]{this, jSONObject});
            return;
        }
        IPopData<PopSectionModel> a2 = e.a(jSONObject);
        if (a2 == null) {
            return;
        }
        this.mPopEngine.a(a2);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public JSONObject getPopDataByBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7a727928", new Object[]{this, str});
        }
        IPopData a2 = this.mPopEngine.a(str);
        if (!(a2 instanceof JSONObject)) {
            return null;
        }
        return (JSONObject) a2;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public void onIconScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73803697", new Object[]{this, new Integer(i)});
        } else {
            this.mPopEngine.c().a(i);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService
    public boolean triggerPopShowByPopData(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8372266", new Object[]{this, new Integer(i), jSONObject})).booleanValue();
        }
        IPopData<PopSectionModel> a2 = e.a(jSONObject);
        if (a2 == null || !a2.valid()) {
            com.taobao.homepage.pop.utils.c.a(TAG, "triggerPopShowByPopData data inValid");
            return false;
        }
        return this.mPopEngine.a(i, a2);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService.a
    public void onScreenChanged(boolean z, boolean z2, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c77460", new Object[]{this, new Boolean(z), new Boolean(z2), configuration});
        } else if (!b.b() || !z2 || z == this.mIsPortrait) {
        } else {
            this.mPopEngine.c().o();
            this.mIsPortrait = z;
        }
    }

    private void registerOnScreenChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a22299", new Object[]{this});
            return;
        }
        IFoldDeviceAndPadService iFoldDeviceAndPadService = this.mFoldAndPadService;
        if (iFoldDeviceAndPadService == null) {
            return;
        }
        iFoldDeviceAndPadService.addOnScreenChangeListener(this);
    }

    private void unRegisterOnScreenChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b0c712", new Object[]{this});
            return;
        }
        IFoldDeviceAndPadService iFoldDeviceAndPadService = this.mFoldAndPadService;
        if (iFoldDeviceAndPadService == null) {
            return;
        }
        iFoldDeviceAndPadService.removeOnScreenChangeListener(this);
    }
}
