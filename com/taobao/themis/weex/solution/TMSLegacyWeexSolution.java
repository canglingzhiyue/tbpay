package com.taobao.themis.weex.solution;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.utils.o;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.qpr;
import tb.qqg;
import tb.qqp;
import tb.sud;

/* loaded from: classes9.dex */
public class TMSLegacyWeexSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAV_HIDDEN = "wx_navbar_hidden";
    private static final String WX_STATUSBAR_HIDDEN = "_wx_statusbar_hidden";
    private static final String WX_STATUSBAR_HIDDEN2 = "wx_statusbar_hidden";

    static {
        kge.a(1169986175);
    }

    public static /* synthetic */ Object ipc$super(TMSLegacyWeexSolution tMSLegacyWeexSolution, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -670088252) {
            if (hashCode != 1316793324) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.getInstanceExtension();
        }
        return new Boolean(super.reload((qqp) objArr[0]));
    }

    public static /* synthetic */ f access$000(TMSLegacyWeexSolution tMSLegacyWeexSolution) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("4f1fa1f0", new Object[]{tMSLegacyWeexSolution}) : tMSLegacyWeexSolution.mInstance;
    }

    public TMSLegacyWeexSolution(f fVar) {
        super(fVar);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public qqg createRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qqg) ipChange.ipc$dispatch("405c48c0", new Object[]{this});
        }
        if (this.mInstance != null) {
            return new TMSLegacyWeexRenderFactory(this.mInstance);
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
        return ipChange instanceof IpChange ? (f.a) ipChange.ipc$dispatch("35fba214", new Object[]{this}) : new f.a() { // from class: com.taobao.themis.weex.solution.TMSLegacyWeexSolution.1
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
                f access$000 = TMSLegacyWeexSolution.access$000(TMSLegacyWeexSolution.this);
                if (access$000 == null) {
                    return;
                }
                String g = access$000.g();
                if (StringUtils.isEmpty(g)) {
                    return;
                }
                Uri b = o.b(g);
                if (!b.isHierarchical()) {
                    return;
                }
                if ("true".equals(b.getQueryParameter(TMSLegacyWeexSolution.WX_STATUSBAR_HIDDEN))) {
                    com.taobao.themis.utils.b.c(access$000.o(), false);
                }
                if (!"true".equals(b.getQueryParameter(TMSLegacyWeexSolution.WX_STATUSBAR_HIDDEN2))) {
                    return;
                }
                com.taobao.themis.utils.b.c(access$000.o(), false);
            }
        };
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ISplashView generateSplashView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISplashView) ipChange.ipc$dispatch("6eefb120", new Object[]{this, viewGroup}) : new com.taobao.themis.container.splash.a(this.mInstance, viewGroup);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public List<sud> getInstanceExtension() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4e7cabec", new Object[]{this});
        }
        List<sud> instanceExtension = super.getInstanceExtension();
        if (instanceExtension == null) {
            instanceExtension = new ArrayList<>();
        }
        instanceExtension.add(new b(this.mInstance));
        return instanceExtension;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public com.taobao.themis.kernel.container.a generateContainerModel() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.container.a) ipChange.ipc$dispatch("e8d42c4a", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.mInstance.g())) {
            return null;
        }
        Uri b = o.b(this.mInstance.g());
        if (b.isHierarchical() && b.getQueryParameter("wx_navbar_hidden") != null) {
            z = "true".equals(b.getQueryParameter("wx_navbar_hidden"));
        }
        Window.a aVar = new Window.a();
        aVar.a(Boolean.valueOf(z));
        return new com.taobao.themis.kernel.container.a(null, null, aVar.a(), null);
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
        return ipChange instanceof IpChange ? (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this}) : TMSSolutionType.WEEX;
    }
}
