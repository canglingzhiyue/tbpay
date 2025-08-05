package com.taobao.infoflow.core.subservice.biz.globalsceneutpassservice;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IGlobalSceneUtPassService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import tb.kge;
import tb.ldf;
import tb.lgi;
import tb.ljd;
import tb.ljs;
import tb.llb;
import tb.lld;
import tb.lli;

/* loaded from: classes.dex */
public class GlobalSceneUtPassServiceImpl implements IGlobalSceneUtPassService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GlobalSceneUtPassServiceImpl";
    private IContainerDataService<?> mContainerDataService;
    private IMainLifecycleService mMainLifecycleService;
    private IContainerDataService.a mOnDataProcessListener;
    private llb mPageLifeCycle;
    private lld mTabLifeCycle;
    private lgi mTapGlobalSceneUtController;

    static {
        kge.a(-465165143);
        kge.a(799910406);
    }

    public static /* synthetic */ lgi access$000(GlobalSceneUtPassServiceImpl globalSceneUtPassServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lgi) ipChange.ipc$dispatch("a0b0b477", new Object[]{globalSceneUtPassServiceImpl}) : globalSceneUtPassServiceImpl.mTapGlobalSceneUtController;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mTapGlobalSceneUtController = new lgi(ljsVar);
        this.mMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        this.mContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        registerListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterListener();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IGlobalSceneUtPassService
    public void onClick(final BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80a0c6", new Object[]{this, baseSubItemModel});
        } else {
            ljd.a().d(new Runnable() { // from class: com.taobao.infoflow.core.subservice.biz.globalsceneutpassservice.GlobalSceneUtPassServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GlobalSceneUtPassServiceImpl.access$000(GlobalSceneUtPassServiceImpl.this).a(baseSubItemModel);
                    }
                }
            });
        }
    }

    private void registerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
        } else if (this.mMainLifecycleService == null || this.mContainerDataService == null) {
            ldf.d(TAG, "initListener mMainLifecycleService || mContainerDataService is null");
        } else {
            this.mPageLifeCycle = createPageLifeCycle();
            this.mMainLifecycleService.getPageLifeCycleRegister().a(this.mPageLifeCycle);
            this.mTabLifeCycle = createTabLifeCycle();
            this.mMainLifecycleService.getTabLifeCycleRegister().a(this.mTabLifeCycle);
            this.mOnDataProcessListener = createOnDataProcessListener();
            this.mContainerDataService.addDataProcessListener(this.mOnDataProcessListener);
        }
    }

    private void unRegisterListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761571b7", new Object[]{this});
            return;
        }
        if (this.mPageLifeCycle != null) {
            this.mMainLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycle);
            this.mPageLifeCycle = null;
        }
        if (this.mTabLifeCycle != null) {
            this.mMainLifecycleService.getTabLifeCycleRegister().b(this.mTabLifeCycle);
            this.mTabLifeCycle = null;
        }
        IContainerDataService.a aVar = this.mOnDataProcessListener;
        if (aVar == null) {
            return;
        }
        this.mContainerDataService.removeDataProcessListener(aVar);
        this.mOnDataProcessListener = null;
    }

    private llb createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("414e763e", new Object[]{this}) : new llb() { // from class: com.taobao.infoflow.core.subservice.biz.globalsceneutpassservice.GlobalSceneUtPassServiceImpl.2
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
            public void onPause() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f87fc5e", new Object[]{this});
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
                    GlobalSceneUtPassServiceImpl.access$000(GlobalSceneUtPassServiceImpl.this).a();
                }
            }
        };
    }

    private lld createTabLifeCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lld) ipChange.ipc$dispatch("e91d5eca", new Object[]{this}) : new lld() { // from class: com.taobao.infoflow.core.subservice.biz.globalsceneutpassservice.GlobalSceneUtPassServiceImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lld
            public void onPageScrolled(float f, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
                }
            }

            @Override // tb.lld
            public void onPageUnSelected() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1dadaf89", new Object[]{this});
                }
            }

            @Override // tb.lld
            public void onPageSelected() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90abdd0", new Object[]{this});
                } else {
                    GlobalSceneUtPassServiceImpl.access$000(GlobalSceneUtPassServiceImpl.this).a();
                }
            }
        };
    }

    private IContainerDataService.a createOnDataProcessListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("59131a7a", new Object[]{this}) : new IContainerDataService.a() { // from class: com.taobao.infoflow.core.subservice.biz.globalsceneutpassservice.GlobalSceneUtPassServiceImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                } else {
                    GlobalSceneUtPassServiceImpl.access$000(GlobalSceneUtPassServiceImpl.this).b();
                }
            }
        };
    }
}
