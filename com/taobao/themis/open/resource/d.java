package com.taobao.themis.open.resource;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.extension.e;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u0012\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0012\u0010!\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/taobao/themis/open/resource/ResourceManager;", "Lcom/taobao/themis/open/extension/IResourceManagerExtension;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "apiFrameworkExtHotPatchResource", "", "frameworkResourceManager", "Lcom/taobao/themis/open/resource/ResourcePackage;", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "jsfmHotPatchResource", "mainPackageResource", "pluginResourcePackageMap", "", "subPackageResources", "", "addSubPackageResource", "", "resourcePackage", "getAPIFrameworkExtHotPatchContent", "getFrameworkResource", "Lcom/taobao/themis/open/resource/Resource;", "resourceName", "getJSFrameworkHotPatchContent", "getMainResource", "name", "getPluginResource", qpy.PLUGIN_ID, "getSubPackageResource", "setAPIFrameworkExtHotPatchContent", "content", "setFrameworkResource", "setJSFrameworkHotPatchContent", "setMainResource", "setPluginResourcePackage", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class d implements com.taobao.themis.open.extension.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f22720a;
    private List<e> b;
    private e c;
    private Map<String, e> d;
    private String e;
    private String f;
    private final com.taobao.themis.kernel.f g;

    static {
        kge.a(523793517);
        kge.a(1420343978);
    }

    public d(com.taobao.themis.kernel.f instance) {
        q.d(instance, "instance");
        this.g = instance;
        this.b = new CopyOnWriteArrayList();
        this.d = new ConcurrentHashMap();
    }

    @Override // tb.sud
    public void a(com.taobao.themis.kernel.f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        e.a.a(this, instance);
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            e.a.b(this);
        }
    }

    @Override // com.taobao.themis.open.extension.e
    public void a(e resourcePackage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a429d186", new Object[]{this, resourcePackage});
            return;
        }
        q.d(resourcePackage, "resourcePackage");
        this.f22720a = resourcePackage;
    }

    @Override // com.taobao.themis.open.extension.e
    public void b(e resourcePackage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb47c265", new Object[]{this, resourcePackage});
            return;
        }
        q.d(resourcePackage, "resourcePackage");
        this.c = resourcePackage;
    }

    @Override // com.taobao.themis.open.extension.e
    public void c(e resourcePackage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5265b344", new Object[]{this, resourcePackage});
            return;
        }
        q.d(resourcePackage, "resourcePackage");
        this.b.add(resourcePackage);
    }

    @Override // com.taobao.themis.open.extension.e
    public void d(e resourcePackage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a983a423", new Object[]{this, resourcePackage});
            return;
        }
        q.d(resourcePackage, "resourcePackage");
        this.d.put(resourcePackage.b().a(), resourcePackage);
    }

    @Override // com.taobao.themis.open.extension.e
    public c a(String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("54b3b2d2", new Object[]{this, name});
        }
        q.d(name, "name");
        e eVar = this.f22720a;
        c a2 = eVar != null ? eVar.a(name) : null;
        if (a2 == null) {
            e eVar2 = this.f22720a;
            if (eVar2 != null) {
                String substring = name.substring(1);
                q.b(substring, "(this as java.lang.String).substring(startIndex)");
                a2 = eVar2.a(substring);
            } else {
                a2 = null;
            }
        }
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    @Override // com.taobao.themis.open.extension.e
    public c b(String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7a47bbd3", new Object[]{this, name});
        }
        q.d(name, "name");
        for (e eVar : this.b) {
            c a2 = eVar.a(name);
            if (a2 == null) {
                String substring = name.substring(1);
                q.b(substring, "(this as java.lang.String).substring(startIndex)");
                a2 = eVar.a(substring);
                continue;
            }
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // com.taobao.themis.open.extension.e
    public c a(String pluginId, String resourceName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("595c219c", new Object[]{this, pluginId, resourceName});
        }
        q.d(pluginId, "pluginId");
        q.d(resourceName, "resourceName");
        e eVar = this.d.get(pluginId);
        if (eVar == null) {
            return null;
        }
        return eVar.a(resourceName);
    }

    @Override // com.taobao.themis.open.extension.e
    public c c(String resourceName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9fdbc4d4", new Object[]{this, resourceName});
        }
        q.d(resourceName, "resourceName");
        e eVar = this.c;
        if (eVar == null) {
            return null;
        }
        return eVar.a(resourceName);
    }

    @Override // com.taobao.themis.open.extension.e
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    @Override // com.taobao.themis.open.extension.e
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e;
    }

    @Override // com.taobao.themis.open.extension.e
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // com.taobao.themis.open.extension.e
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f;
    }
}
