package com.taobao.android.fluid.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.kge;
import tb.spz;
import tb.sqb;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f12442a;
    private final Map<String, FluidService> c = new LinkedHashMap(32);
    private boolean b = false;

    static {
        kge.a(974681747);
    }

    public static /* synthetic */ String a(g gVar, Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6d5264d", new Object[]{gVar, cls}) : gVar.b(cls);
    }

    public static /* synthetic */ Map a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ae1fe27f", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ void a(g gVar, Class cls, FluidService fluidService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0b4a9f", new Object[]{gVar, cls, fluidService});
        } else {
            gVar.a(cls, fluidService);
        }
    }

    public static /* synthetic */ FluidContext b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("86c3983f", new Object[]{gVar}) : gVar.f12442a;
    }

    public g(FluidContext fluidContext) {
        this.f12442a = fluidContext;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (Map.Entry<String, FluidService> entry : this.c.entrySet()) {
            String key = entry.getKey();
            try {
                entry.getValue().onCreateService();
            } catch (Exception unused) {
                b bVar = b.SERVICE_CREATE_ERROR;
                bVar.a(FluidException.SERVICE_NAME, key);
                FluidContext fluidContext = this.f12442a;
                FluidException.throwException(fluidContext, bVar, "服务：" + key + " 创建失败");
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (Map.Entry<String, FluidService> entry : this.c.entrySet()) {
            String key = entry.getKey();
            try {
                entry.getValue().onDestroyService();
            } catch (Exception unused) {
                b bVar = b.SERVICE_DESTROY_ERROR;
                bVar.a(FluidException.SERVICE_NAME, key);
                FluidContext fluidContext = this.f12442a;
                FluidException.throwException(fluidContext, bVar, "服务：" + key + " 销毁失败");
            }
        }
    }

    public <T extends FluidService> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("48f50b0d", new Object[]{this, cls});
        }
        if (!cls.isInterface()) {
            FluidContext fluidContext = this.f12442a;
            b bVar = b.SERVICE_CLASS_NOT_INTERFACE;
            FluidException.throwException(fluidContext, bVar, "服务需要通过接口进行调用：" + cls);
            return null;
        }
        String b = b(cls);
        FluidService fluidService = this.c.get(b);
        if (fluidService == null) {
            return null;
        }
        if (!cls.isInstance(fluidService)) {
            FluidContext fluidContext2 = this.f12442a;
            b bVar2 = b.SERVICE_ERROR_INSTANCE;
            FluidException.throwException(fluidContext2, bVar2, " 服务名称：" + b);
            return null;
        }
        return cls.cast(fluidService);
    }

    public void a(FluidContext fluidContext, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3ee41a", new Object[]{this, fluidContext, eVar});
            return;
        }
        b(fluidContext, eVar);
        c(fluidContext, eVar);
    }

    private <T extends FluidService> String b(Class<? extends FluidService> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c798a8ac", new Object[]{this, cls}) : cls.getName();
    }

    private void b(FluidContext fluidContext, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f04e39", new Object[]{this, fluidContext, eVar});
            return;
        }
        spz.c("ServiceRegistryManager", "本地服务注册开始");
        LinkedHashMap<Class<? extends FluidService>, FluidService> a2 = eVar.a(fluidContext);
        if (a2.isEmpty()) {
            spz.c("ServiceRegistryManager", "本地服务注册表为空");
            return;
        }
        for (Map.Entry<Class<? extends FluidService>, FluidService> entry : a2.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
        spz.c("ServiceRegistryManager", "本地服务注册完成");
    }

    public void c(final FluidContext fluidContext, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a1b858", new Object[]{this, fluidContext, eVar});
        } else if (this.b) {
            spz.c("ServiceRegistryManager", "远程服务已经注册过");
        } else {
            spz.c("ServiceRegistryManager", "远程服务注册开始");
            final LinkedHashMap<Class<? extends FluidService>, String> a2 = eVar.a();
            if (a2.isEmpty()) {
                this.b = true;
                spz.c("ServiceRegistryManager", "远程服务注册表为空");
                return;
            }
            sqb.a(new sqb.b() { // from class: com.taobao.android.fluid.core.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.sqb.b
                public void a(boolean z) {
                    String str;
                    if (!z) {
                        str = "远程服务未加载完成";
                    } else {
                        for (Map.Entry entry : a2.entrySet()) {
                            Class cls = (Class) entry.getKey();
                            String a3 = g.a(g.this, cls);
                            if (g.a(g.this).containsKey(a3)) {
                                FluidContext b = g.b(g.this);
                                b bVar = b.SERVICE_REGISTER_REPEAT_ERROR;
                                FluidException.throwException(b, bVar, "远程服务：" + a3 + " 已经被注册");
                            } else {
                                try {
                                    g.a(g.this, cls, (FluidService) sqb.b((String) entry.getValue()).getConstructor(FluidContext.class).newInstance(fluidContext));
                                } catch (Exception e) {
                                    FluidException.throwException(g.b(g.this), b.SERVICE_REMOTE_NEW_INSTANCE_ERROR, e);
                                }
                            }
                        }
                        str = "远程服务注册完成";
                    }
                    spz.c("ServiceRegistryManager", str);
                }
            });
            this.b = true;
        }
    }

    private void a(Class<? extends FluidService> cls, FluidService fluidService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3188bcc1", new Object[]{this, cls, fluidService});
            return;
        }
        String b = b(cls);
        if (this.c.containsKey(b)) {
            FluidContext fluidContext = this.f12442a;
            b bVar = b.SERVICE_REGISTER_REPEAT_ERROR;
            FluidException.throwException(fluidContext, bVar, "服务：" + b + " 已经被注册");
        } else if (!cls.isInstance(fluidService)) {
            spz.c("ServiceRegistryManager", "服务 " + fluidService + " 不是 " + cls + " 的实例");
        } else {
            this.c.put(b, fluidService);
            spz.c("ServiceRegistryManager", "服务 " + b + " 注册成功");
        }
    }
}
