package tb;

import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.alibaba.android.split.core.tasks.d;
import com.alibaba.android.split.core.tasks.e;
import com.alibaba.android.split.core.tasks.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import com.android.tools.bundleInfo.b;
import com.taobao.appbundle.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class aan implements aaq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static aan f25186a;
    private b b = b.a();
    private g c = c.Companion.a().c();
    private aao d = new aao();
    private a e = new a();
    private boolean f = false;
    private aap g;

    static {
        kge.a(433388250);
        kge.a(1742445081);
    }

    public static /* synthetic */ aao a(aan aanVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aao) ipChange.ipc$dispatch("3f40050d", new Object[]{aanVar}) : aanVar.d;
    }

    public static /* synthetic */ aap b(aan aanVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aap) ipChange.ipc$dispatch("26e1db8b", new Object[]{aanVar}) : aanVar.g;
    }

    private aan() {
    }

    public static aan a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aan) ipChange.ipc$dispatch("f023690", new Object[0]);
        }
        if (f25186a == null) {
            synchronized (aan.class) {
                if (f25186a == null) {
                    f25186a = new aan();
                }
            }
        }
        return f25186a;
    }

    @Override // tb.aaq
    public boolean a(com.alibaba.android.aura.dynamicFeature.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aac472f", new Object[]{this, aVar})).booleanValue();
        }
        if (!com.alibaba.android.aura.dynamicFeature.model.a.a(aVar)) {
            arc.a().b("AURADynamicFeatureInstaller.isDynamicFeatureBundle:bundleInfo is invalid");
            return false;
        }
        b bVar = this.b;
        if (bVar == null) {
            arc.a().b("AURADynamicFeatureInstaller.isDynamicFeatureBundle:mBundleInfoManager is null");
            return false;
        }
        List<String> j = bVar.j();
        if (j == null || j.isEmpty()) {
            arc.a().b("AURADynamicFeatureInstaller.isDynamicFeatureBundle:no dynamicFeatures");
            return false;
        }
        return j.contains(aVar.f2138a);
    }

    @Override // tb.aaq
    public int b(com.alibaba.android.aura.dynamicFeature.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74c7c5bd", new Object[]{this, aVar})).intValue();
        }
        if (!a(aVar)) {
            arc.a().b("AURADynamicFeatureInstaller.queryDynamicFeatureBundleStatus:is not a dynamicFeature bundle");
            return 0;
        }
        g gVar = this.c;
        if (gVar == null) {
            arc.a().b("AURADynamicFeatureInstaller.queryDynamicFeatureBundleStatus:mInstallManager is null");
            return 0;
        }
        Set<String> a2 = gVar.a();
        if (a2 != null && a2.contains(aVar.f2138a)) {
            return 4;
        }
        int c = this.d.c(aVar);
        if (c != 0) {
            return c;
        }
        return 1;
    }

    @Override // tb.aaq
    public String c(com.alibaba.android.aura.dynamicFeature.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c9cef57", new Object[]{this, aVar});
        }
        if (!a(aVar)) {
            arc.a().b("AURADynamicFeatureInstaller.queryDynamicFeatureBundleMD5:is not a dynamicFeature bundle");
            return null;
        }
        b bVar = this.b;
        if (bVar == null) {
            arc.a().b("AURADynamicFeatureInstaller.queryDynamicFeatureBundleMD5:mBundleInfoManager is null");
            return null;
        }
        DynamicFeatureInfo c = bVar.c(aVar.f2138a);
        if (c == null) {
            arc.a().b("AURADynamicFeatureInstaller.queryDynamicFeatureBundleMD5:systemInfo is null");
            return null;
        }
        return c.md5;
    }

    @Override // tb.aaq
    public void d(final com.alibaba.android.aura.dynamicFeature.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8fec308", new Object[]{this, aVar});
        } else if (!a(aVar)) {
            arc.a().b("AURADynamicFeatureInstaller.requestForInstall:is not a dynamicFeature bundle");
        } else {
            int b = b(aVar);
            if (b == 2 || b == 3 || b == 4) {
                arc.a().a("AURADynamicFeatureInstaller.requestForInstall:bundle is already request for install or installed");
            } else if (this.c == null) {
                arc.a().b("AURADynamicFeatureInstaller.requestForInstall:mInstallManager is null");
            } else {
                this.d.a(aVar);
                if (!this.f) {
                    this.c.a(this.e);
                    this.f = true;
                }
                h<Integer> a2 = this.c.a(j.a().a(aVar.f2138a).a());
                a2.a(new e<Integer>() { // from class: tb.aan.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.split.core.tasks.e
                    public /* synthetic */ void onSuccess(Integer num) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, num});
                        } else {
                            a(num);
                        }
                    }

                    public void a(Integer num) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6cdec50f", new Object[]{this, num});
                        } else {
                            aan.a(aan.this).a(aVar, 3);
                        }
                    }
                });
                a2.a(new d() { // from class: tb.aan.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.split.core.tasks.d
                    public void onFailure(Exception exc) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                            return;
                        }
                        aan.a(aan.this).b(aVar);
                        if (aan.b(aan.this) != null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(aVar.f2138a);
                            aan.b(aan.this).a(arrayList, "start_install_failed", (exc == null || exc.getMessage() == null) ? "" : exc.getMessage());
                        }
                        ard a3 = arc.a();
                        a3.b("AURADynamicFeatureInstaller.requestForInstall:OnFailureListener,bundle is " + aVar.d);
                    }
                });
            }
        }
    }

    @Override // tb.aaq
    public void a(aap aapVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa5d488", new Object[]{this, aapVar});
        } else {
            this.g = aapVar;
        }
    }

    /* loaded from: classes2.dex */
    public class a implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-802840093);
            kge.a(-1887429869);
        }

        public a() {
        }

        @Override // com.alibaba.android.split.core.listener.b
        public /* synthetic */ void onStateUpdate(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
            } else {
                a(mVar);
            }
        }

        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
            } else if (mVar == null) {
                arc.a().b("InnerInstallListener.onStateUpdate:splitInstallSessionState is null");
            } else {
                List<String> g = mVar.g();
                if (g == null || g.isEmpty()) {
                    arc.a().b("InnerInstallListener.onStateUpdate:no modules");
                    return;
                }
                int b = mVar.b();
                if (b == 5) {
                    if (aan.b(aan.this) == null) {
                        return;
                    }
                    aan.b(aan.this).a(g);
                } else if (b == 6) {
                    if (aan.b(aan.this) != null) {
                        aan.b(aan.this).a(g, String.valueOf(mVar.d()), String.valueOf(mVar.c()));
                    }
                    for (String str : g) {
                        aan.a(aan.this).a(str);
                    }
                } else {
                    StringBuffer stringBuffer = new StringBuffer("modules:");
                    for (String str2 : g) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        stringBuffer.append(str2);
                        stringBuffer.append("/");
                    }
                    ard a2 = arc.a();
                    a2.a("InnerInstallListener.onStateUpdate:" + stringBuffer.toString() + ",status:" + b);
                }
            }
        }
    }
}
