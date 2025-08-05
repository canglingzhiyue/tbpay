package com.taobao.infoflow.core.subservice.biz.staytime;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.staytime.impl.StayTimeWaiter;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.infoflow.protocol.subservice.biz.IStayTimeService;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.ljd;
import tb.ljs;
import tb.lkq;
import tb.llb;
import tb.lld;
import tb.llm;

/* loaded from: classes.dex */
public class StayTimeServiceImpl implements IStayTimeService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ljs mInfoFlowContext;
    private WeakReference<IMulticlassTabService.a> mMulticlassTabChangeListener;
    private WeakReference<lkq.a> mOnContainerListenerWeakReference;
    private WeakReference<llb> mPageLifeCycleWeakReference;
    private WeakReference<IRocketSubService.a> mRocketListenerWeakReference;
    private final StayTimeWaiter mStayTimeWaiter = new StayTimeWaiter();
    private WeakReference<lld> mTabLifeCycleWeakReference;

    static {
        kge.a(197422636);
        kge.a(-830669083);
    }

    public static /* synthetic */ void access$000(StayTimeServiceImpl stayTimeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee751fa", new Object[]{stayTimeServiceImpl});
        } else {
            stayTimeServiceImpl.commitEnter();
        }
    }

    public static /* synthetic */ void access$100(StayTimeServiceImpl stayTimeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb5d07b", new Object[]{stayTimeServiceImpl});
        } else {
            stayTimeServiceImpl.commitLeave();
        }
    }

    public static /* synthetic */ ljs access$200(StayTimeServiceImpl stayTimeServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("53db27f5", new Object[]{stayTimeServiceImpl}) : stayTimeServiceImpl.mInfoFlowContext;
    }

    public static /* synthetic */ StayTimeWaiter access$300(StayTimeServiceImpl stayTimeServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StayTimeWaiter) ipChange.ipc$dispatch("21f6e774", new Object[]{stayTimeServiceImpl}) : stayTimeServiceImpl.mStayTimeWaiter;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        initRegister(ljsVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            destroyUnRegister(this.mInfoFlowContext);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IStayTimeService
    public void setFilterInterval(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cedcbaa5", new Object[]{this, l});
        } else {
            this.mStayTimeWaiter.a(l);
        }
    }

    private void initRegister(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949ba075", new Object[]{this, ljsVar});
            return;
        }
        registerPageChangeListener(ljsVar);
        registerTabChangeListener(ljsVar);
        registerMulticlassTabListener(ljsVar);
        registerContainerListener(ljsVar);
        registerRocketListener(ljsVar);
    }

    private void destroyUnRegister(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d1e018", new Object[]{this, ljsVar});
            return;
        }
        unRegisterPageChangeListener(ljsVar);
        unRegisterTabChangeListener(ljsVar);
        unRegisterContainerListener(ljsVar);
        unRegisterMulticlassTabListener(ljsVar);
        unRegisterRocketListener(ljsVar);
    }

    private void registerPageChangeListener(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10505918", new Object[]{this, ljsVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        llb createPageLifeCycle = createPageLifeCycle();
        this.mPageLifeCycleWeakReference = new WeakReference<>(createPageLifeCycle);
        iMainLifecycleService.getPageLifeCycleRegister().a(createPageLifeCycle);
    }

    private void unRegisterPageChangeListener(ljs ljsVar) {
        WeakReference<llb> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15161911", new Object[]{this, ljsVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null || (weakReference = this.mPageLifeCycleWeakReference) == null || weakReference.get() == null) {
            return;
        }
        iMainLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycleWeakReference.get());
    }

    private void registerTabChangeListener(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cf6738", new Object[]{this, ljsVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        lld createTabLifeCycle = createTabLifeCycle();
        iMainLifecycleService.getTabLifeCycleRegister().a(createTabLifeCycle);
        this.mTabLifeCycleWeakReference = new WeakReference<>(createTabLifeCycle);
    }

    private void unRegisterTabChangeListener(ljs ljsVar) {
        WeakReference<lld> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c5441f", new Object[]{this, ljsVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null || (weakReference = this.mTabLifeCycleWeakReference) == null || weakReference.get() == null) {
            return;
        }
        iMainLifecycleService.getTabLifeCycleRegister().b(this.mTabLifeCycleWeakReference.get());
    }

    private void registerContainerListener(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b214", new Object[]{this, ljsVar});
            return;
        }
        IContainerService iContainerService = (IContainerService) ljsVar.a(IContainerService.class);
        if (iContainerService == null) {
            return;
        }
        lkq.a createOnContainerListener = createOnContainerListener();
        iContainerService.addOnContainerListener(createOnContainerListener);
        this.mOnContainerListenerWeakReference = new WeakReference<>(createOnContainerListener);
    }

    private void unRegisterContainerListener(ljs ljsVar) {
        WeakReference<lkq.a> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44be8efb", new Object[]{this, ljsVar});
            return;
        }
        IContainerService iContainerService = (IContainerService) ljsVar.a(IContainerService.class);
        if (iContainerService == null || (weakReference = this.mOnContainerListenerWeakReference) == null || weakReference.get() == null) {
            return;
        }
        iContainerService.removeOnContainerListener(this.mOnContainerListenerWeakReference.get());
    }

    private void registerMulticlassTabListener(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ecb9c9", new Object[]{this, ljsVar});
            return;
        }
        IMulticlassTabService iMulticlassTabService = (IMulticlassTabService) ljsVar.a(IMulticlassTabService.class);
        if (iMulticlassTabService == null) {
            return;
        }
        IMulticlassTabService.a createMulticlassTabChangeListener = createMulticlassTabChangeListener();
        iMulticlassTabService.addTabChangeListener(createMulticlassTabChangeListener);
        this.mMulticlassTabChangeListener = new WeakReference<>(createMulticlassTabChangeListener);
    }

    private void unRegisterMulticlassTabListener(ljs ljsVar) {
        WeakReference<IMulticlassTabService.a> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64bcb30", new Object[]{this, ljsVar});
            return;
        }
        IMulticlassTabService iMulticlassTabService = (IMulticlassTabService) ljsVar.a(IMulticlassTabService.class);
        if (iMulticlassTabService == null || (weakReference = this.mMulticlassTabChangeListener) == null || weakReference.get() == null) {
            return;
        }
        iMulticlassTabService.removeTabChangeListener(this.mMulticlassTabChangeListener.get());
    }

    private void registerRocketListener(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd3f1cd", new Object[]{this, ljsVar});
            return;
        }
        IRocketSubService iRocketSubService = (IRocketSubService) ljsVar.a(IRocketSubService.class);
        if (iRocketSubService == null) {
            return;
        }
        IRocketSubService.a createRocketListener = createRocketListener();
        iRocketSubService.addRocketListener(createRocketListener);
        this.mRocketListenerWeakReference = new WeakReference<>(createRocketListener);
    }

    private void unRegisterRocketListener(ljs ljsVar) {
        WeakReference<IRocketSubService.a> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be29646", new Object[]{this, ljsVar});
            return;
        }
        IRocketSubService iRocketSubService = (IRocketSubService) ljsVar.a(IRocketSubService.class);
        if (iRocketSubService == null || (weakReference = this.mRocketListenerWeakReference) == null || weakReference.get() == null) {
            return;
        }
        iRocketSubService.removeRocketListener(this.mRocketListenerWeakReference.get());
    }

    private llb createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("414e763e", new Object[]{this}) : new llb() { // from class: com.taobao.infoflow.core.subservice.biz.staytime.StayTimeServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.llb
            public void onActivityResult(int i, int i2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
                }
            }

            @Override // tb.llb
            public void onColdStartResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("45e9b853", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onDestroy() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6532022", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onDestroyView() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b8f9ee7", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onNewIntent(Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b57eb01", new Object[]{this, intent});
                }
            }

            @Override // tb.llb
            public void onRestart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4c630bb7", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f2d84ca", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onStop() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b3dde88", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onWillExit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3bc02c16", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5d6cd73", new Object[]{this});
                } else {
                    StayTimeServiceImpl.access$000(StayTimeServiceImpl.this);
                }
            }

            @Override // tb.llb
            public void onPause() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f87fc5e", new Object[]{this});
                } else {
                    StayTimeServiceImpl.access$100(StayTimeServiceImpl.this);
                }
            }
        };
    }

    private lld createTabLifeCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lld) ipChange.ipc$dispatch("e91d5eca", new Object[]{this}) : new lld() { // from class: com.taobao.infoflow.core.subservice.biz.staytime.StayTimeServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lld
            public void onPageScrolled(float f, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
                }
            }

            @Override // tb.lld
            public void onPageSelected() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90abdd0", new Object[]{this});
                } else {
                    StayTimeServiceImpl.access$000(StayTimeServiceImpl.this);
                }
            }

            @Override // tb.lld
            public void onPageUnSelected() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1dadaf89", new Object[]{this});
                } else {
                    StayTimeServiceImpl.access$100(StayTimeServiceImpl.this);
                }
            }
        };
    }

    private lkq.a createOnContainerListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkq.a) ipChange.ipc$dispatch("508dc696", new Object[]{this}) : new lkq.a() { // from class: com.taobao.infoflow.core.subservice.biz.staytime.StayTimeServiceImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkq.a
            public void a(Context context) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9e1d6460", new Object[]{this, context});
                }
            }

            @Override // tb.lkq.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    StayTimeServiceImpl.access$000(StayTimeServiceImpl.this);
                }
            }
        };
    }

    private IMulticlassTabService.a createMulticlassTabChangeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMulticlassTabService.a) ipChange.ipc$dispatch("4bcfffc9", new Object[]{this}) : new IMulticlassTabService.a() { // from class: com.taobao.infoflow.core.subservice.biz.staytime.StayTimeServiceImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.a
            public void a(llm llmVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f304c8cb", new Object[]{this, llmVar});
                    return;
                }
                IMulticlassTabService iMulticlassTabService = (IMulticlassTabService) StayTimeServiceImpl.access$200(StayTimeServiceImpl.this).a(IMulticlassTabService.class);
                if (iMulticlassTabService == null) {
                    return;
                }
                if (iMulticlassTabService.isShowTabContent()) {
                    StayTimeServiceImpl.access$100(StayTimeServiceImpl.this);
                } else {
                    StayTimeServiceImpl.access$000(StayTimeServiceImpl.this);
                }
            }
        };
    }

    private IRocketSubService.a createRocketListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRocketSubService.a) ipChange.ipc$dispatch("b949a34c", new Object[]{this}) : new IRocketSubService.a() { // from class: com.taobao.infoflow.core.subservice.biz.staytime.StayTimeServiceImpl.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else if (z) {
                    StayTimeServiceImpl.access$000(StayTimeServiceImpl.this);
                } else {
                    StayTimeServiceImpl.access$100(StayTimeServiceImpl.this);
                }
            }
        };
    }

    private void commitEnter() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac1c3e8", new Object[]{this});
            return;
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.mInfoFlowContext.a(IRocketSubService.class);
        if (iRocketSubService != null) {
            z = iRocketSubService.isOnRocketState();
        }
        if (!z) {
            return;
        }
        this.mStayTimeWaiter.a(this.mInfoFlowContext);
    }

    private void commitLeave() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20eb0447", new Object[]{this});
            return;
        }
        final long nanoTime = System.nanoTime();
        ljd.a().d(new Runnable() { // from class: com.taobao.infoflow.core.subservice.biz.staytime.StayTimeServiceImpl.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    StayTimeServiceImpl.access$300(StayTimeServiceImpl.this).a(StayTimeServiceImpl.access$200(StayTimeServiceImpl.this), nanoTime);
                }
            }
        });
    }
}
