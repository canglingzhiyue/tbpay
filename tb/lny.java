package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;

/* loaded from: classes7.dex */
public class lny implements lns {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lnx f30759a;
    private final IContainerDataService<?> b;
    private final IMainLifecycleService c;
    private final IJsBridgeService d;
    private llb e;
    private IContainerDataService.a f;
    private IContainerDataService.b g;
    private lnt h;
    private String i;

    static {
        kge.a(94482895);
        kge.a(1581419108);
    }

    public static /* synthetic */ String a(lny lnyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb43727f", new Object[]{lnyVar}) : lnyVar.i;
    }

    public static /* synthetic */ String a(lny lnyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c57bc35", new Object[]{lnyVar, str});
        }
        lnyVar.i = str;
        return str;
    }

    public static /* synthetic */ void a(lny lnyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a7ceb3", new Object[]{lnyVar, new Boolean(z)});
        } else {
            lnyVar.a(z);
        }
    }

    public static /* synthetic */ boolean a(lny lnyVar, IContainerInnerDataModel iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e30c752", new Object[]{lnyVar, iContainerInnerDataModel})).booleanValue() : lnyVar.a(iContainerInnerDataModel);
    }

    public static /* synthetic */ lnx b(lny lnyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lnx) ipChange.ipc$dispatch("3061690e", new Object[]{lnyVar}) : lnyVar.f30759a;
    }

    public lny(ljs ljsVar, Context context) {
        this.d = (IJsBridgeService) ljsVar.a(IJsBridgeService.class);
        this.b = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        this.c = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        f();
        this.f30759a = new lnx(ljsVar, this.h);
        this.f30759a.a(context);
        b();
        c();
    }

    @Override // tb.lns
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        lnx lnxVar = this.f30759a;
        if (lnxVar != null) {
            lnxVar.b();
            this.f30759a.c();
        }
        g();
        h();
        i();
    }

    @Override // tb.lns
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        lnx lnxVar = this.f30759a;
        if (lnxVar == null) {
            return;
        }
        lnxVar.a(context);
    }

    @Override // tb.lns
    public void a(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6cddef", new Object[]{this, str, intent});
        } else if (!k() || TextUtils.isEmpty(str) || this.f30759a == null) {
        } else {
            try {
                this.f30759a.a(JSON.parseObject(str));
            } catch (Throwable unused) {
                ldf.d("IconAnimeServiceImpl", "Illegal params:" + str);
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.e == null) {
            this.e = j();
        }
        IMainLifecycleService iMainLifecycleService = this.c;
        if (iMainLifecycleService == null) {
            return;
        }
        iMainLifecycleService.getPageLifeCycleRegister().a(this.e);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.f == null) {
            this.f = e();
        }
        if (this.g == null) {
            this.g = d();
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null) {
            return;
        }
        iContainerDataService.addRequestListener(this.g);
        this.b.addDataProcessListener(this.f);
    }

    private IContainerDataService.b d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("327a8d3f", new Object[]{this}) : new IContainerDataService.b() { // from class: tb.lny.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                } else if (lliVar == null || !TextUtils.equals(str, Constant.KEY_PAGEBACK)) {
                } else {
                    if (lny.a(lny.this) != null && lny.b(lny.this) != null) {
                        lny.b(lny.this).b();
                    }
                    lny.a(lny.this, lliVar.a());
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                } else if (lliVar == null || !TextUtils.equals(str3, Constant.KEY_PAGEBACK) || !TextUtils.equals(lny.a(lny.this), lliVar.a())) {
                } else {
                    lny.a(lny.this, true);
                    lny.a(lny.this, (String) null);
                }
            }
        };
    }

    private IContainerDataService.a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("39a36f61", new Object[]{this}) : new IContainerDataService.a() { // from class: tb.lny.2
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
                    return;
                }
                if (iContainerDataModel != null && lny.a(lny.this, iContainerDataModel.getBase())) {
                    lny.a(lny.this, true);
                }
                if (lliVar == null || !TextUtils.equals(lny.a(lny.this), lliVar.a())) {
                    return;
                }
                lny.a(lny.this, false);
                lny.a(lny.this, (String) null);
            }
        };
    }

    private boolean a(IContainerInnerDataModel<?> iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f2e179", new Object[]{this, iContainerInnerDataModel})).booleanValue();
        }
        if (iContainerInnerDataModel == null || iContainerInnerDataModel.getExt() == null) {
            ldf.d("IconAnimeServiceImpl", "isNeedUpdateSplashData->   baseData == null");
            return false;
        }
        boolean booleanValue = iContainerInnerDataModel.getExt().getBooleanValue("updateTopview");
        if (!booleanValue) {
            ldf.d("IconAnimeServiceImpl", "isNeedUpdateSplashData, updateTopview is false, no need update splash data.");
        } else {
            ldf.d("IconAnimeServiceImpl", "isNeedUpdateSplashData, updateTopview is true, need update splash data.");
        }
        return booleanValue;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.h = new lnt();
        IJsBridgeService iJsBridgeService = this.d;
        if (iJsBridgeService == null) {
            ldf.d("IconAnimeServiceImpl", "registerJsNativeFeature jsBridgeService is null");
        } else {
            iJsBridgeService.registerJsNativeFeature(this.h);
        }
    }

    private void g() {
        lnt lntVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        IJsBridgeService iJsBridgeService = this.d;
        if (iJsBridgeService == null || (lntVar = this.h) == null) {
            ldf.d("IconAnimeServiceImpl", "unRegisterJsFeature jsBridgeService is null");
        } else {
            iJsBridgeService.unRegisterJsNativeFeature(lntVar);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.c;
        if (iMainLifecycleService == null || this.e == null) {
            return;
        }
        iMainLifecycleService.getPageLifeCycleRegister().b(this.e);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null) {
            return;
        }
        IContainerDataService.a aVar = this.f;
        if (aVar != null) {
            iContainerDataService.removeDataProcessListener(aVar);
        }
        IContainerDataService.b bVar = this.g;
        if (bVar == null) {
            return;
        }
        this.b.removeRequestListener(bVar);
    }

    private llb j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("54462ed3", new Object[]{this}) : new bxp() { // from class: tb.lny.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bxp, tb.llb
            public void onDestroy() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6532022", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onDestroyView() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b8f9ee7", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onNewIntent(Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b57eb01", new Object[]{this, intent});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onPause() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f87fc5e", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onRestart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4c630bb7", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f2d84ca", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onStop() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b3dde88", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onWillExit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3bc02c16", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5d6cd73", new Object[]{this});
                } else if (lny.b(lny.this) == null) {
                } else {
                    lny.b(lny.this).a();
                }
            }
        };
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        lnx lnxVar = this.f30759a;
        if (lnxVar == null) {
            return;
        }
        try {
            lnxVar.a(z);
        } catch (Throwable th) {
            this.f30759a.b();
            ldf.d("IconAnimeServiceImpl", "trigger Anime error" + th.toString());
        }
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : ldj.a("enablePlayIconBackAnimeService", true);
    }
}
