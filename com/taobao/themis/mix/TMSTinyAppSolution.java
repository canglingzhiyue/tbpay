package com.taobao.themis.mix;

import android.view.ViewGroup;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.b;
import tb.kge;
import tb.qpr;
import tb.qqg;

/* loaded from: classes9.dex */
public class TMSTinyAppSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TMSTinyAppSolution";

    static {
        kge.a(-712952727);
    }

    public static /* synthetic */ f access$000(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("ece49dde", new Object[]{tMSTinyAppSolution}) : tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ f access$100(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2efbcb3d", new Object[]{tMSTinyAppSolution}) : tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ ISplashView access$1000(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISplashView) ipChange.ipc$dispatch("22427bfb", new Object[]{tMSTinyAppSolution}) : tMSTinyAppSolution.mSplashView;
    }

    public static /* synthetic */ ISplashView access$1100(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISplashView) ipChange.ipc$dispatch("8faf391a", new Object[]{tMSTinyAppSolution}) : tMSTinyAppSolution.mSplashView;
    }

    public static /* synthetic */ f access$200(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("7112f89c", new Object[]{tMSTinyAppSolution}) : tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ f access$300(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("b32a25fb", new Object[]{tMSTinyAppSolution}) : tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ f access$400(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("f541535a", new Object[]{tMSTinyAppSolution}) : tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ f access$500(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("375880b9", new Object[]{tMSTinyAppSolution}) : tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ f access$600(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("796fae18", new Object[]{tMSTinyAppSolution}) : tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ f access$700(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("bb86db77", new Object[]{tMSTinyAppSolution}) : tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ ISplashView access$800(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISplashView) ipChange.ipc$dispatch("7f4d2082", new Object[]{tMSTinyAppSolution}) : tMSTinyAppSolution.mSplashView;
    }

    public static /* synthetic */ ISplashView access$900(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISplashView) ipChange.ipc$dispatch("ecb9dda1", new Object[]{tMSTinyAppSolution}) : tMSTinyAppSolution.mSplashView;
    }

    public TMSTinyAppSolution(f fVar) {
        super(fVar);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qqg createRenderFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qqg) ipChange.ipc$dispatch("405c48c0", new Object[]{this}) : new TMSTinyAppRenderFactory(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qpr createLauncher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpr) ipChange.ipc$dispatch("2f6c2610", new Object[]{this}) : new a(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public f.a createLaunchListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.a) ipChange.ipc$dispatch("35fba214", new Object[]{this}) : new f.a() { // from class: com.taobao.themis.mix.TMSTinyAppSolution.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.themis.kernel.f.a
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                }
            }

            @Override // com.taobao.themis.kernel.f.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (TMSTinyAppSolution.access$000(TMSTinyAppSolution.this) == null) {
                } else {
                    if (TMSTinyAppSolution.access$100(TMSTinyAppSolution.this).q().getFullScreen() && n.H()) {
                        b.b(TMSTinyAppSolution.access$200(TMSTinyAppSolution.this).o(), false);
                    } else {
                        b.c(TMSTinyAppSolution.access$300(TMSTinyAppSolution.this).o(), false);
                    }
                }
            }

            @Override // com.taobao.themis.kernel.f.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    com.taobao.themis.kernel.utils.a.a(new Runnable() { // from class: com.taobao.themis.mix.TMSTinyAppSolution.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (TMSTinyAppSolution.access$400(TMSTinyAppSolution.this) == null) {
                            } else {
                                if ("landscape".equals(k.n(TMSTinyAppSolution.access$500(TMSTinyAppSolution.this)))) {
                                    TMSTinyAppSolution.access$600(TMSTinyAppSolution.this).o().setRequestedOrientation(0);
                                    b.a(TMSTinyAppSolution.access$700(TMSTinyAppSolution.this).o(), false);
                                }
                                if (TMSTinyAppSolution.access$800(TMSTinyAppSolution.this) == null) {
                                    return;
                                }
                                TMSTinyAppSolution.access$900(TMSTinyAppSolution.this).b();
                            }
                        }
                    });
                }
            }

            @Override // com.taobao.themis.kernel.f.a
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                } else if (TMSTinyAppSolution.access$1000(TMSTinyAppSolution.this) == null) {
                } else {
                    TMSTinyAppSolution.access$1100(TMSTinyAppSolution.this).c();
                }
            }
        };
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public com.taobao.themis.kernel.container.a generateContainerModel() {
        JSONObject m;
        JSONObject jSONObject;
        AppConfigModel parseFromJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.container.a) ipChange.ipc$dispatch("e8d42c4a", new Object[]{this});
        }
        TMSMetaInfoWrapper v = this.mInstance.v();
        if (v == null || (m = v.m()) == null || (jSONObject = m.getJSONObject("extConfigs")) == null || (parseFromJSONObject = AppConfigModel.parseFromJSONObject(jSONObject.getJSONObject("appConfig"))) == null) {
            return null;
        }
        JSONObject appLaunchParams = parseFromJSONObject.getAppLaunchParams();
        if (appLaunchParams == null) {
            appLaunchParams = new JSONObject();
        }
        if (!appLaunchParams.containsKey("hideHomeIndicator")) {
            appLaunchParams.put("hideHomeIndicator", (Object) Boolean.valueOf(this.mInstance.q().getHideIndicator()));
        }
        return new com.taobao.themis.kernel.container.a(null, null, new Window.a().a(appLaunchParams, TMSMetaInfoWrapper.Type.AppInfo), null);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ISplashView generateSplashView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISplashView) ipChange.ipc$dispatch("6eefb120", new Object[]{this, viewGroup}) : new com.taobao.themis.container.splash.a(this.mInstance, viewGroup);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this}) : TMSSolutionType.MIX;
    }
}
