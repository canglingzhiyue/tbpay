package com.alibaba.android.aura;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.alibaba.android.umf.constants.UMFConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aql;
import tb.aqs;
import tb.ark;
import tb.bau;
import tb.baw;
import tb.kge;

/* loaded from: classes2.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final j f2151a;
    private final Map<String, n> b = new HashMap();
    private Map<String, ark> c = new HashMap();
    private final Map<String, f> d = new HashMap();
    private final q e;
    private aql f;

    static {
        kge.a(2049879584);
    }

    public m(q qVar, j jVar) {
        this.e = qVar;
        this.f2151a = jVar;
    }

    public void a(aql aqlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0857b1c", new Object[]{this, aqlVar});
        } else {
            this.f = aqlVar;
        }
    }

    public m a(IAURAPluginCenter... iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("a346e5f0", new Object[]{this, iAURAPluginCenterArr});
        }
        this.f2151a.a(iAURAPluginCenterArr);
        return this;
    }

    public f a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("ce3cc22", new Object[]{this, str, dVar}) : b(str, dVar);
    }

    public final n a(AURAExecuteNodeModel aURAExecuteNodeModel, d dVar, aqs aqsVar) {
        String str = aURAExecuteNodeModel.code;
        if (StringUtils.isEmpty(str)) {
            aqsVar.a(new b(0, "AURACoreDomain", UMFConstants.ErrorCode.SERVICE_NOT_FOUND, "创建服务失败(serviceCode为空)"));
            return null;
        }
        n nVar = this.b.get(str);
        if (nVar == null) {
            Class<? extends n> b = this.f2151a.b(str);
            if (b == null) {
                aqsVar.a(new b(0, "AURACoreDomain", UMFConstants.ErrorCode.SERVICE_NOT_FOUND, "创建服务【" + str + "】失败(PluginCenter没有注册服务)").a("serviceCode", str));
                return null;
            }
            try {
                n newInstance = b.newInstance();
                a(aURAExecuteNodeModel, newInstance);
                newInstance.onCreate(this.e, b(aURAExecuteNodeModel, dVar, aqsVar));
                return newInstance;
            } catch (IllegalAccessException unused) {
                aqsVar.a(new b(0, "AURACoreDomain", UMFConstants.ErrorCode.SERVICE_NOT_FOUND, "创建服务失败(非法访问)").a("serviceClass", b.toString()));
                return null;
            } catch (InstantiationException unused2) {
                aqsVar.a(new b(0, "AURACoreDomain", UMFConstants.ErrorCode.SERVICE_NOT_FOUND, "创建服务失败(反射初始化实例失败)").a("serviceClass", b.toString()));
                return null;
            }
        }
        b(aURAExecuteNodeModel, dVar, aqsVar);
        return nVar;
    }

    private f b(AURAExecuteNodeModel aURAExecuteNodeModel, d dVar, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("4b07b121", new Object[]{this, aURAExecuteNodeModel, dVar, aqsVar});
        }
        f b = b(aURAExecuteNodeModel.code, dVar);
        b.b();
        a(aURAExecuteNodeModel, dVar, b, aqsVar);
        return b;
    }

    private f b(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("25e51dc1", new Object[]{this, str, dVar});
        }
        f fVar = this.d.get(str);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(dVar);
        this.d.put(str, fVar2);
        return fVar2;
    }

    private void a(AURAExecuteNodeModel aURAExecuteNodeModel, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b76d811", new Object[]{this, aURAExecuteNodeModel, nVar});
        } else {
            this.b.put(aURAExecuteNodeModel.code, nVar);
        }
    }

    private Pair<ark, Boolean> a(String str, aqs aqsVar) {
        ark a2 = a(str);
        if (a2 != null) {
            return new Pair<>(a2, false);
        }
        Class<? extends ark> c = this.f2151a.c(str);
        if (c == null) {
            aqsVar.a(new b(1, "AURACoreDomain", "-4000", "扩展点实现创建失败|PluginCenter中没有注册扩展点：" + str).a("extensionImplCode", str));
            return null;
        }
        try {
            ark newInstance = c.newInstance();
            a(str, newInstance);
            return new Pair<>(newInstance, true);
        } catch (IllegalAccessException unused) {
            aqsVar.a(new b(1, "AURACoreDomain", "-4000", "扩展点实现创建失败(非法访问)").a("extensionImplCode", str));
            return null;
        } catch (InstantiationException unused2) {
            aqsVar.a(new b(1, "AURACoreDomain", "-4000", "扩展点实现创建失败(反射初始化失败)").a("extensionImplCode", str));
            return null;
        }
    }

    private void a(AURAExecuteNodeModel aURAExecuteNodeModel, d dVar, f fVar, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4f6ebc", new Object[]{this, aURAExecuteNodeModel, dVar, fVar, aqsVar});
            return;
        }
        Map<String, List<AURAExecuteNodeModel>> map = aURAExecuteNodeModel.extensions;
        if (bau.a(map)) {
            return;
        }
        for (Map.Entry<String, List<AURAExecuteNodeModel>> entry : map.entrySet()) {
            List<AURAExecuteNodeModel> value = entry.getValue();
            if (!bau.a(value)) {
                for (AURAExecuteNodeModel aURAExecuteNodeModel2 : value) {
                    aql aqlVar = this.f;
                    if (aqlVar == null || aqlVar.a(aURAExecuteNodeModel2.branch)) {
                        String str = aURAExecuteNodeModel2.code;
                        try {
                        } catch (Throwable th) {
                            aqsVar.a(new b(1, "AURACoreDomain", "-4001", "注册扩展点【" + str + "】失败").a("extensionImplCode", str).a("errorMessage", th.getMessage()));
                            baw.a(th);
                        }
                        if (!TrtcConstants.TRTC_PARAMS_EXTENSION.equals(aURAExecuteNodeModel2.type)) {
                            aqsVar.a(new b(1, "AURACoreDomain", "-4001", "扩展点实现类：" + str + "没有配置type: extension").a("extensionImplCode", str));
                        } else {
                            Pair<ark, Boolean> a2 = a(str, aqsVar);
                            if (a2 != null) {
                                ark arkVar = (ark) a2.first;
                                fVar.a(arkVar);
                                f b = b(str, dVar);
                                if (!bau.a(aURAExecuteNodeModel2.extensions)) {
                                    a(aURAExecuteNodeModel2, dVar, b, aqsVar);
                                }
                                if (((Boolean) a2.second).booleanValue()) {
                                    arkVar.onCreate(this.e, b);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private ark a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ark) ipChange.ipc$dispatch("7c6d1efa", new Object[]{this, str}) : this.c.get(str);
    }

    private void a(String str, ark arkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207d9408", new Object[]{this, str, arkVar});
            return;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        this.c.put(str, arkVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (n nVar : this.b.values()) {
            nVar.onDestroy();
        }
        this.b.clear();
        for (Map.Entry<String, ark> entry : this.c.entrySet()) {
            entry.getValue().onDestroy();
        }
        this.c.clear();
        for (f fVar : this.d.values()) {
            fVar.c();
        }
        this.d.clear();
        this.f = null;
    }
}
