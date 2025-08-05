package tb;

import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.logger.a;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.open.extension.c;
import com.taobao.themis.open.extension.d;
import com.taobao.themis.open.packages.downloader.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class tln extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2133972226);
    }

    public static /* synthetic */ Object ipc$super(tln tlnVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "Package";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        }
    }

    public static /* synthetic */ e a(tln tlnVar, int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("e4280bf1", new Object[]{tlnVar, new Integer(i), str}) : tlnVar.a(i, str);
    }

    public static /* synthetic */ void a(tln tlnVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b953088", new Object[]{tlnVar, eVar});
        } else {
            tlnVar.a(eVar);
        }
    }

    public tln(f fVar, qpr qprVar, qpp qppVar) {
        super(fVar, qprVar, qppVar);
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void d() {
        c cVar;
        d dVar;
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f22538a != null && !this.f22538a.s() && (cVar = (c) this.f22538a.b(c.class)) != null && (dVar = (d) this.f22538a.b(d.class)) != null) {
            this.f22538a.k().a("packageStepStart");
            TMSMetaInfoWrapper w = this.f22538a.w();
            ArrayList arrayList = new ArrayList();
            b bVar2 = null;
            if (w != null) {
                b bVar3 = new b(w.c(), w.a(), w.b(), dVar.a(), dVar.b());
                List<PluginModel> p = w.p();
                if (p != null && p.size() > 0) {
                    for (PluginModel pluginModel : p) {
                        arrayList.add(new b(pluginModel.getAppId(), pluginModel.getAppId(), pluginModel.getVersion(), dVar.a(pluginModel), dVar.b(pluginModel)));
                    }
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("pkgInfo", (Object) jSONObject2);
                jSONObject2.put("appId", (Object) w.a());
                jSONObject2.put("packUrl", (Object) dVar.a());
                jSONObject2.put("version", (Object) w.b());
                jSONObject2.put("zcacheKey", (Object) dVar.b());
                a.a(a.MODULE_LAUNCH_PACKAGE, a.EVENT_DOWNLOAD_START, this.c, this.c + "_framework", jSONObject);
                bVar = bVar3;
            } else {
                bVar = null;
            }
            if (this.f22538a.v() != null) {
                String h = this.f22538a.h();
                String d = k.d(this.f22538a);
                if (n.P()) {
                    String g = k.g(this.f22538a);
                    if (!TextUtils.isEmpty(g)) {
                        h = g;
                    }
                    String i = k.i(this.f22538a);
                    if (!TextUtils.isEmpty(i)) {
                        d = i;
                    }
                }
                String j = k.j(this.f22538a);
                if (j == null) {
                    j = "";
                }
                b bVar4 = new b(j, h, d, dVar.c(), dVar.d());
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject3.put("pkgInfo", (Object) jSONObject4);
                jSONObject4.put("appId", (Object) h);
                jSONObject4.put("packUrl", (Object) dVar.c());
                jSONObject4.put("version", (Object) d);
                jSONObject4.put("zcacheKey", (Object) dVar.d());
                a.a(a.MODULE_LAUNCH_PACKAGE, a.EVENT_DOWNLOAD_START, this.c, this.c + "_main", jSONObject3);
                bVar2 = bVar4;
            }
            cVar.a(bVar, bVar2, arrayList, new c.a() { // from class: tb.tln.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.themis.open.extension.c.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    if (tln.this.f22538a != null) {
                        tln.this.f22538a.k().a("frameworkPackageFinish");
                    }
                    String str = tln.this.c;
                    a.a(a.MODULE_LAUNCH_PACKAGE, a.EVENT_DOWNLOAD_START, str, tln.this.c + "_framework", new JSONObject());
                }

                @Override // com.taobao.themis.open.extension.c.a
                public void c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                        return;
                    }
                    if (tln.this.f22538a != null) {
                        tln.this.f22538a.k().a("mainPackageFinish");
                    }
                    String str = tln.this.c;
                    a.a(a.MODULE_LAUNCH_PACKAGE, a.EVENT_DOWNLOAD_FINISH, str, tln.this.c + "_main", new JSONObject());
                }

                @Override // com.taobao.themis.open.extension.c.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else if (tln.this.f22538a == null) {
                    } else {
                        tln.this.f22538a.k().a("pluginPackageFinish");
                    }
                }

                @Override // com.taobao.themis.kernel.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    TMSLogger.d("TMSPackageStep", "finish");
                    tln.this.c();
                }

                @Override // com.taobao.themis.kernel.c
                public void a(int i2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i2), str});
                        return;
                    }
                    tln tlnVar = tln.this;
                    tln.a(tlnVar, tln.a(tlnVar, i2, str));
                }
            });
        }
    }

    private e a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("4c256bb7", new Object[]{this, new Integer(i), str});
        }
        if (i == -90004) {
            return new e("TMS_ERR_PKG_UNZIP", "package解压错误", "");
        }
        if (i == -1) {
            return new e("TMS_ERR_PKG_REQ", "package请求超时", "");
        }
        return new e("TMS_ERR_PKG_REQ", "package请求错误", "");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        if (this.f22538a == null) {
            return;
        }
        this.f22538a.k().a("packageStepFinish");
    }
}
