package com.alibaba.android.aura;

import com.alibaba.android.aura.plugincenter.AbsAURAPluginCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aqn;
import tb.arc;
import tb.ard;
import tb.ark;
import tb.kge;

/* loaded from: classes2.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_CENTER_CLASS_FULL_NAME_PREFIX = "com.alibaba.android.aura.AURA";
    public static final String PLUGIN_CENTER_CLASS_FULL_NAME_SUFFIX = "PluginCenter";
    private final Map<String, List<String>> g = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Class<? extends n>> f2146a = new HashMap();
    private final Map<String, AbstractMap.SimpleEntry<String, Class<? extends ark>>> b = new HashMap();
    private final Map<String, Class<? extends ark>> c = new HashMap();
    private final Map<Class, List<Class<? extends IAURAInputField>>> d = new HashMap();
    private final Map<String, Class<? extends aqn>> e = new HashMap();
    private final List<IAURAPluginCenter> f = new ArrayList();

    static {
        kge.a(-18935495);
    }

    public j() {
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e("com.alibaba.android.aura.AURACoreUMFServicePluginCenter");
        e("com.alibaba.android.aura.AURATaobaoAdapterPluginCenter");
        a(new AURACoreUMFFrameworkPluginCenter());
    }

    private void e(String str) {
        try {
            a((IAURAPluginCenter) Class.forName(str).newInstance());
        } catch (ClassCastException e) {
            ard a2 = arc.a();
            a2.c("AURAGlobalPluginCenter", "internalRegisterPluginCenter", "internalRegisterPluginCenter#internalRegisterPluginCenter exception,msg=" + e.getMessage());
        } catch (ClassNotFoundException e2) {
            ard a3 = arc.a();
            a3.c("AURAGlobalPluginCenter", "internalRegisterPluginCenter", "internalRegisterPluginCenter#internalRegisterPluginCenter exception,msg=" + e2.getMessage());
        } catch (IllegalAccessException e3) {
            ard a4 = arc.a();
            a4.c("AURAGlobalPluginCenter", "internalRegisterPluginCenter", "internalRegisterPluginCenter#internalRegisterPluginCenter exception,msg=" + e3.getMessage());
        } catch (InstantiationException e4) {
            ard a5 = arc.a();
            a5.c("AURAGlobalPluginCenter", "internalRegisterPluginCenter", "internalRegisterPluginCenter#internalRegisterPluginCenter exception,msg=" + e4.getMessage());
        }
    }

    public static IAURAPluginCenter a(String str) {
        try {
            return (IAURAPluginCenter) Class.forName(PLUGIN_CENTER_CLASS_FULL_NAME_PREFIX + str + PLUGIN_CENTER_CLASS_FULL_NAME_SUFFIX).newInstance();
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.b("createPluginCenter#" + e.getMessage(), arc.a.a().b("AURAGlobalPluginCenter").a("auraModuleName", str).b());
            return null;
        }
    }

    public void a(IAURAPluginCenter... iAURAPluginCenterArr) {
        Map<String, Class<? extends aqn>> branchConditionMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26a4b33", new Object[]{this, iAURAPluginCenterArr});
        } else if (this.f != null) {
            for (IAURAPluginCenter iAURAPluginCenter : iAURAPluginCenterArr) {
                if (iAURAPluginCenter != null) {
                    if (!this.f.contains(iAURAPluginCenter)) {
                        this.f.add(iAURAPluginCenter);
                    }
                    Map<String, Class<? extends n>> serviceMap = iAURAPluginCenter.serviceMap();
                    if (serviceMap != null) {
                        this.f2146a.putAll(serviceMap);
                    }
                    Map<String, AbstractMap.SimpleEntry<String, Class<? extends ark>>> extensionMap = iAURAPluginCenter.extensionMap();
                    if (extensionMap != null) {
                        this.b.putAll(extensionMap);
                    }
                    Map<String, Class<? extends ark>> extensionImplMap = iAURAPluginCenter.extensionImplMap();
                    if (extensionImplMap != null) {
                        this.c.putAll(extensionImplMap);
                    }
                    Map<Class, List<Class<? extends IAURAInputField>>> inputFieldsTargetClass = iAURAPluginCenter.inputFieldsTargetClass();
                    if (inputFieldsTargetClass != null) {
                        this.d.putAll(inputFieldsTargetClass);
                    }
                    if ((iAURAPluginCenter instanceof AbsAURAPluginCenter) && (branchConditionMap = ((AbsAURAPluginCenter) iAURAPluginCenter).branchConditionMap()) != null) {
                        this.e.putAll(branchConditionMap);
                    }
                }
            }
        }
    }

    public Class<? extends n> b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("212a3020", new Object[]{this, str}) : this.f2146a.get(str);
    }

    public List<String> f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f186af0", new Object[]{this, str}) : this.g.get(str);
    }

    public Class<? extends ark> c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("ea2b2761", new Object[]{this, str}) : this.c.get(str);
    }

    public Class<? extends aqn> d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("b32c1ea2", new Object[]{this, str}) : this.e.get(str);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f.clear();
        this.f2146a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.f.clear();
    }
}
