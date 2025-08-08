package com.taobao.themis.web.solution;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPageFactory;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.utils.o;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTPageStatus;
import tb.kge;
import tb.nom;
import tb.qpr;
import tb.qqg;
import tb.qqp;

/* loaded from: classes9.dex */
public class TMSLegacyWebSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2026186609);
    }

    public static /* synthetic */ Object ipc$super(TMSLegacyWebSolution tMSLegacyWebSolution, String str, Object... objArr) {
        if (str.hashCode() == -670088252) {
            return new Boolean(super.reload((qqp) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ f access$000(TMSLegacyWebSolution tMSLegacyWebSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("4564b80", new Object[]{tMSLegacyWebSolution}) : tMSLegacyWebSolution.mInstance;
    }

    public TMSLegacyWebSolution(f fVar) {
        super(fVar);
        if (fVar.i() != TMSContainerType.EMBEDDED) {
            try {
                UTAnalytics.getInstance().getDefaultTracker().updatePageStatus(fVar.o(), UTPageStatus.UT_H5_IN_WebView);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qqg createRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qqg) ipChange.ipc$dispatch("405c48c0", new Object[]{this});
        }
        if (this.mInstance != null) {
            return new TMSLegacyWebRenderFactory(this.mInstance);
        }
        return null;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qpr createLauncher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpr) ipChange.ipc$dispatch("2f6c2610", new Object[]{this}) : new a(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public f.a createLaunchListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.a) ipChange.ipc$dispatch("35fba214", new Object[]{this}) : new f.a() { // from class: com.taobao.themis.web.solution.TMSLegacyWebSolution.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.themis.kernel.f.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }

            @Override // com.taobao.themis.kernel.f.a
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                }
            }

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
                    return;
                }
                f access$000 = TMSLegacyWebSolution.access$000(TMSLegacyWebSolution.this);
                if (access$000 == null) {
                    return;
                }
                String g = access$000.g();
                if (StringUtils.isEmpty(g) || !"true".equals(o.b(g).getQueryParameter("status_bar_transparent"))) {
                    return;
                }
                com.taobao.themis.utils.b.c(access$000.o(), false);
            }
        };
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public boolean reload(qqp qqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d80f43c4", new Object[]{this, qqpVar})).booleanValue();
        }
        if (qqpVar != null) {
            this.mInstance.c(qqpVar.f33036a);
        }
        if (this.mInstance.b().c() != null) {
            this.mInstance.b().c().a(qqpVar);
        }
        return super.reload(qqpVar);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this}) : TMSSolutionType.WEB_SINGLE_PAGE;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ISplashView generateSplashView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISplashView) ipChange.ipc$dispatch("6eefb120", new Object[]{this, viewGroup}) : new com.taobao.themis.container.splash.a(this.mInstance, viewGroup);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ITMSPageFactory createPageFactory(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPageFactory) ipChange.ipc$dispatch("c996e0f6", new Object[]{this, fVar}) : new b(fVar);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public com.taobao.themis.kernel.container.a generateContainerModel() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.container.a) ipChange.ipc$dispatch("e8d42c4a", new Object[]{this});
        }
        Window.a aVar = new Window.a();
        aVar.a(Window.Theme.LIGHT);
        String pageBgColor = this.mInstance.q().getPageBgColor();
        if (!StringUtils.isEmpty(pageBgColor)) {
            aVar.a(pageBgColor);
        }
        Uri b = o.b(this.mInstance.g());
        if (b != null && b.isHierarchical()) {
            z = nom.VALUE_YES.equals(b.getQueryParameter("disableNav"));
        }
        aVar.a(Boolean.valueOf(z));
        aVar.b(true);
        return new com.taobao.themis.kernel.container.a(null, null, aVar.a(), null);
    }
}
