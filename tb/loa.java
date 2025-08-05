package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;

/* loaded from: classes7.dex */
public class loa implements lns {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IMainLifecycleService f30765a;
    private final IJsBridgeService b;
    private final ljs c;
    private final lnt d = new lnt();
    private llb e;
    private Context f;
    private lnz g;

    static {
        kge.a(-761485532);
        kge.a(1581419108);
    }

    public static /* synthetic */ void a(loa loaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3299ada", new Object[]{loaVar});
        } else {
            loaVar.f();
        }
    }

    public loa(ljs ljsVar, Context context) {
        this.f = context;
        this.c = ljsVar;
        this.b = (IJsBridgeService) ljsVar.a(IJsBridgeService.class);
        this.f30765a = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        a(this.d);
        c();
    }

    @Override // tb.lns
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        lnz lnzVar = this.g;
        if (lnzVar != null) {
            lnzVar.a();
            this.g.b();
        }
        b();
        d();
    }

    @Override // tb.lns
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f = context;
        }
    }

    @Override // tb.lns
    public void a(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6cddef", new Object[]{this, str, intent});
        } else if (TextUtils.isEmpty(str) || this.f == null) {
            ldf.d("UpgradeIconBackGuideAnimeProcess", "onOutLinkTrigger params == null");
        } else {
            if (this.g != null) {
                this.g = null;
            }
            this.g = new lnz(this.c, this.d);
            ldf.d("UpgradeIconBackGuideAnimeProcess", "onOutLinkTrigger init iconAnimeTrigger");
            try {
                this.g.a(this.f, JSON.parseObject(str));
            } catch (Throwable unused) {
                f();
                ldf.d("UpgradeIconBackGuideAnimeProcess", "Illegal params:" + str);
            }
        }
    }

    private void a(lnt lntVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3242666", new Object[]{this, lntVar});
            return;
        }
        IJsBridgeService iJsBridgeService = this.b;
        if (iJsBridgeService == null) {
            ldf.d("UpgradeIconBackGuideAnimeProcess", "registerJsNativeFeature jsBridgeService is null");
        } else {
            iJsBridgeService.registerJsNativeFeature(lntVar);
        }
    }

    private void b() {
        lnt lntVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IJsBridgeService iJsBridgeService = this.b;
        if (iJsBridgeService == null || (lntVar = this.d) == null) {
            ldf.d("UpgradeIconBackGuideAnimeProcess", "unRegisterJsFeature jsBridgeService is null");
        } else {
            iJsBridgeService.unRegisterJsNativeFeature(lntVar);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f30765a == null) {
        } else {
            this.e = e();
            this.f30765a.getPageLifeCycleRegister().a(this.e);
            ldf.d("UpgradeIconBackGuideAnimeProcess", "registerPageLifeCycleListener");
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.f30765a;
        if (iMainLifecycleService == null || this.e == null) {
            return;
        }
        iMainLifecycleService.getPageLifeCycleRegister().b(this.e);
        ldf.d("UpgradeIconBackGuideAnimeProcess", "unRegisterPageLifeCycleListener");
    }

    private llb e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("2dcdf3f8", new Object[]{this}) : new bxp() { // from class: tb.loa.1
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
            public void onRestart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4c630bb7", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5d6cd73", new Object[]{this});
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
            public void onPause() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f87fc5e", new Object[]{this});
                } else {
                    loa.a(loa.this);
                }
            }
        };
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        lnz lnzVar = this.g;
        if (lnzVar == null) {
            return;
        }
        lnzVar.a();
        this.g = null;
    }
}
