package com.alibaba.android.aura;

import android.text.TextUtils;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.android.aura.nodemodel.AURAPluginNodeModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.taolive.room.utils.ag;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import tb.aqq;
import tb.aqu;
import tb.aqv;
import tb.arc;
import tb.ard;
import tb.baw;
import tb.bay;
import tb.bba;
import tb.bbe;
import tb.bss;
import tb.kge;

/* loaded from: classes2.dex */
public final class k implements s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f2147a;
    private q b;
    private g c;
    private u d;
    private boolean e = false;
    private String f = null;

    static {
        kge.a(-2102808925);
        kge.a(-176876618);
        f2147a = !k.class.desiredAssertionStatus();
    }

    public static /* synthetic */ void a(k kVar, AURAPluginNodeModel aURAPluginNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ef0428", new Object[]{kVar, aURAPluginNodeModel});
        } else {
            kVar.a(aURAPluginNodeModel);
        }
    }

    public static /* synthetic */ void a(k kVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab327c8", new Object[]{kVar, list});
        } else {
            kVar.a((List<String>) list);
        }
    }

    public static /* synthetic */ void a(k kVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60faa4dd", new Object[]{kVar, new Boolean(z)});
        } else {
            kVar.a(z);
        }
    }

    @Override // com.alibaba.android.aura.s
    public /* synthetic */ s b(IAURAInputField iAURAInputField) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("854f4a96", new Object[]{this, iAURAInputField}) : a(iAURAInputField);
    }

    @Override // com.alibaba.android.aura.s
    public /* synthetic */ s b(IAURAPluginCenter[] iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("a415652b", new Object[]{this, iAURAPluginCenterArr}) : a(iAURAPluginCenterArr);
    }

    @Deprecated
    private k() throws IllegalAccessException {
        throw new IllegalAccessException("do not call this construct");
    }

    private k(q qVar) {
        b(qVar);
    }

    public static k a(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("10015314", new Object[]{qVar});
        }
        if (qVar == null) {
            throw new IllegalStateException("userContext不能为空");
        }
        baw.a(qVar.e());
        bay.a(qVar.e());
        if (baw.a()) {
            arc.a().b("create", arc.a.a().b("AURAInstance").a("AURA/core").a("bizCode", qVar.d()).a("event", "CREATE").b());
        }
        return new k(qVar);
    }

    private void b(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa459f12", new Object[]{this, qVar});
            return;
        }
        this.b = qVar;
        this.b.a(this);
        this.c = g.a(qVar);
    }

    @Override // com.alibaba.android.aura.s
    public q c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("4c9f2bd5", new Object[]{this}) : this.b;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public k a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("4cc13d53", new Object[]{this, str});
        }
        this.f = str;
        Boolean bool = (Boolean) this.b.a("enableExtendModules", Boolean.class, false);
        if (bool != null && bool.booleanValue()) {
            c(str);
        } else {
            a(b(str));
        }
        if (baw.a()) {
            arc.a().a("withConfig#", arc.a.a().b("AURAInstance").a("configAssetFileName", str).a("enableExtendModules", bool).b());
        }
        return this;
    }

    @Deprecated
    public s a(AURAPluginContainerNodeModel aURAPluginContainerNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("aeeb97d3", new Object[]{this, aURAPluginContainerNodeModel});
        }
        a(aURAPluginContainerNodeModel.plugin);
        return this;
    }

    public void a(Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2847c19", new Object[]{this, collection});
        } else if (this.c != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : collection) {
                long currentTimeMillis2 = System.currentTimeMillis();
                bbe.a("************************************************************ ");
                bbe.a("*****开始预加载 flowCode = " + str);
                this.c.a(str);
                bbe.a("*****预加载 flowCode = " + str + "结束。共耗时 ：" + (System.currentTimeMillis() - currentTimeMillis2));
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            ard a2 = arc.a();
            a2.a("预加载workflow 耗时 = " + (currentTimeMillis3 - currentTimeMillis), arc.a.a().a("AURA/performance").b());
        }
    }

    private void a(AURAPluginNodeModel aURAPluginNodeModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12460b9", new Object[]{this, aURAPluginNodeModel});
            return;
        }
        if (aURAPluginNodeModel == null) {
            z = false;
        }
        a(z);
        if (b()) {
            if (!f2147a && aURAPluginNodeModel == null) {
                throw new AssertionError();
            }
            c(aURAPluginNodeModel);
            b(aURAPluginNodeModel);
        }
        if (!baw.a()) {
            return;
        }
        arc.a a2 = arc.a.a().b("AURAInstance").a("AURA/core").a("event", "LOAD_CONFIG").a(OConstant.DIMEN_CONFIG_NAME, this.f);
        a2.a("configContent", bba.a(aURAPluginNodeModel));
        arc.a().a("setupWithConfig", a2.b());
    }

    private AURAPluginNodeModel b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginNodeModel) ipChange.ipc$dispatch("80fffd4", new Object[]{this, str});
        }
        try {
            AURAPluginContainerNodeModel aURAPluginContainerNodeModel = (AURAPluginContainerNodeModel) JSON.parseObject(bss.a(this.b.e(), str), AURAPluginContainerNodeModel.class);
            if (aURAPluginContainerNodeModel == null) {
                arc.a().b("loadConfig#配置转换为对象失败!", arc.a.a().b("AURAInstance").b());
                return null;
            }
            return aURAPluginContainerNodeModel.plugin;
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.c("AURAInstance", "loadConfig-parseError", ag.ARG_TAOKE_ERROR + e.getMessage());
            return null;
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            new aqu(this.c.b()).a(this.b.e(), str, new aqv() { // from class: com.alibaba.android.aura.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqv
                public void a(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str2});
                        return;
                    }
                    k.a(k.this, false);
                    ard a2 = arc.a();
                    a2.b("onCombineFailed#" + str2, arc.a.a().b("AURAInstance").a("code", i).b());
                }

                @Override // tb.aqv
                public void a(JSONObject jSONObject, List<JSONObject> list, List<String> list2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d985f36a", new Object[]{this, jSONObject, list, list2});
                        return;
                    }
                    arc.a().a("配置合并成功", arc.a.a().b("AURAInstance").a("合并模块", list2).b());
                    k.a(k.this, list2);
                    k.a(k.this, ((AURAPluginContainerNodeModel) JSON.toJavaObject(jSONObject, AURAPluginContainerNodeModel.class)).plugin);
                }
            });
        }
    }

    private void b(AURAPluginNodeModel aURAPluginNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9a013a", new Object[]{this, aURAPluginNodeModel});
            return;
        }
        g gVar = this.c;
        if (gVar == null) {
            return;
        }
        gVar.a(com.alibaba.android.aura.nodemodel.a.a(aURAPluginNodeModel));
        this.d = new u(aURAPluginNodeModel.subscribeRelationModel);
        this.c.a(this.d);
    }

    private void c(AURAPluginNodeModel aURAPluginNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360fa1bb", new Object[]{this, aURAPluginNodeModel});
            return;
        }
        this.b.a(aURAPluginNodeModel.bizCode);
        this.b.b(aURAPluginNodeModel.name);
    }

    public k a(IAURAPluginCenter... iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("a346e5b2", new Object[]{this, iAURAPluginCenterArr});
        }
        if (this.c == null) {
            arc.a().b("registerPluginCenter#mFlowDispatcherManager is null, did you has destroyed already?", arc.a.a().b("AURAInstance").b());
            return this;
        }
        if (baw.a()) {
            arc.a().a("registerPluginCenter", arc.a.a().b("AURAInstance").a("AURA/core").a("event", "REGISTER_PLUGIN_CENTER").a("pluginCenterCount", iAURAPluginCenterArr.length).b());
        }
        this.c.a(iAURAPluginCenterArr);
        return this;
    }

    private void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (String str : list) {
            IAURAPluginCenter a2 = j.a(str);
            if (a2 != null) {
                a(a2);
            }
        }
    }

    public <DATA> k a(IAURAInputField<DATA> iAURAInputField) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("6ade507f", new Object[]{this, iAURAInputField});
        }
        if (iAURAInputField == null) {
            arc.a().c(getClass().getSimpleName(), "registerExtInput", "inputField is null");
            return this;
        } else if (this.c == null) {
            arc.a().c("AURAInstance", "registerExtInput", "mFlowDispatcherManager is null, did you has destroyed already?");
            return this;
        } else {
            if (baw.a()) {
                arc.a().a("registerExtInput", arc.a.a().b("AURAInstance").a("AURA/core").a("serviceInputFieldName", iAURAInputField.getFieldName()).a("event", "REGISTER_EXT_INPUT").b());
            }
            this.c.a(iAURAInputField);
            return this;
        }
    }

    @Override // com.alibaba.android.aura.s
    public boolean a(com.alibaba.android.aura.nodemodel.branch.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe2c1914", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar == null) {
            return true;
        }
        if (TextUtils.isEmpty(cVar.f2155a)) {
            return Boolean.parseBoolean(cVar.b);
        }
        if (!b()) {
            arc.a().c("AURAInstance", "branchValueForCode", "AURAInstance尚未初始化完成");
            return Boolean.parseBoolean(cVar.b);
        }
        g gVar = this.c;
        if (gVar == null) {
            arc.a().c("AURAInstance", "branchValue", "mFlowDispatcherManager is null, did you has destroyed already?");
            return Boolean.parseBoolean(cVar.b);
        }
        return gVar.a(cVar);
    }

    @Override // com.alibaba.android.aura.s
    public <DATA extends Serializable> void a(String str, DATA data, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed83c955", new Object[]{this, str, data, aqqVar});
        } else if (b()) {
            g gVar = this.c;
            if (gVar == null) {
                arc.a().a("mFlowDispatcherManager is null, did you has destroyed already?", arc.a.a().b("AURAInstance").a("AURA/core").b());
            } else {
                gVar.a(str, data, aqqVar);
            }
        } else if (aqqVar == null) {
        } else {
            b bVar = new b(0, "AURACoreDomain", "-1000", "配置初始化错误");
            HashMap hashMap = new HashMap();
            String str2 = this.f;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("configPath", str2);
            bVar.a(hashMap);
            aqqVar.a(bVar);
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.e;
    }

    @Override // com.alibaba.android.aura.s
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        q qVar = this.b;
        String d = qVar == null ? "" : qVar.d();
        if (baw.a()) {
            arc.a().a("destroy", arc.a.a().b("AURAInstance").a("AURA/core").a("event", "DESTROY").a("bizCode", d).b());
        }
        g gVar = this.c;
        if (gVar != null) {
            gVar.a();
            this.c = null;
        }
        q qVar2 = this.b;
        if (qVar2 == null) {
            return;
        }
        qVar2.f();
        this.b = null;
    }
}
