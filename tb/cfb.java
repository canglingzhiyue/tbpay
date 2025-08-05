package tb;

import android.os.Bundle;
import com.alibaba.evo.EVOExperiment;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.internal.debug.Debug;
import com.alibaba.ut.abtest.internal.util.ClassUtils;
import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cew;

/* loaded from: classes.dex */
public class cfb implements cfa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private cfc f26262a;
    private cfc b;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final AtomicBoolean d = new AtomicBoolean(false);

    static {
        kge.a(98543059);
        kge.a(-505310957);
    }

    @Override // tb.cfa
    public synchronized boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        h.a("MultiProcessServiceImpl", "initMultiProcessClient. initialized=" + this.c.get());
        if (this.c.get()) {
            return true;
        }
        c(z);
        if (this.f26262a != null) {
            if (this.f26262a == null) {
                this.f26262a = new cfd();
            }
            this.c.set(true);
            return true;
        }
        if (this.f26262a == null) {
            this.f26262a = new cfd();
        }
        this.c.set(true);
        return false;
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        h.a("MultiProcessServiceImpl", "createMultiProcessClientIfNotExist. multiProcessClient=" + this.f26262a + ",isMultiProcessEnable=" + cex.a().g());
        if (this.f26262a != null || !cex.a().g()) {
            return;
        }
        if (z) {
            this.f26262a = new cfd();
            return;
        }
        this.f26262a = b();
        StringBuilder sb = new StringBuilder();
        sb.append("子进程注册多进程通信");
        sb.append(this.f26262a == null ? ResultCode.MSG_FAILED : ResultCode.MSG_SUCCESS);
        h.a("MultiProcessServiceImpl", sb.toString());
    }

    @Override // tb.cfa
    public boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        h.a("MultiProcessServiceImpl", "initMainProcessMsgSender. initialized=" + this.d.get());
        if (this.d.get()) {
            return true;
        }
        try {
            if (cex.a().g() && z) {
                cfc b = b();
                if (b != null) {
                    h.a("MultiProcessServiceImpl", "主进程注册多进程通信成功");
                    this.b = b;
                } else {
                    h.c("MultiProcessServiceImpl", "主进程注册多进程通信失败");
                    return false;
                }
            }
            this.d.set(true);
            return true;
        } catch (Throwable th) {
            b.a("MultiProcessServiceImpl.initMainProcessMsgSender", th);
            return false;
        }
    }

    private cfc b() {
        Class<?> a2 = ClassUtils.a(cew.a.MULTIPROCESS_CLIENT_CLASSNAME, cfb.class.getClassLoader());
        if (a2 != null) {
            try {
                return (cfc) a2.newInstance();
            } catch (Throwable th) {
                b.a("MultiProcessServiceImpl.createMainMultiProcessClient", th);
                h.a("MultiProcessServiceImpl", th.getMessage(), th);
            }
        }
        return null;
    }

    @Override // tb.cfa
    public VariationSet a(String str, String str2, Map<String, Object> map, boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("552a0562", new Object[]{this, str, str2, map, new Boolean(z), obj});
        }
        if (!this.c.get()) {
            h.d("MultiProcessServiceImpl", "多进程服务未初始化，无法调用getVariations方法");
            return null;
        }
        cfc cfcVar = this.f26262a;
        if (cfcVar == null) {
            return null;
        }
        return cfcVar.a(str, str2, map, z, obj);
    }

    @Override // tb.cfa
    public VariationSet a(String str, String str2, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("927b304", new Object[]{this, str, str2, map, obj});
        }
        if (!this.c.get()) {
            h.d("MultiProcessServiceImpl", "多进程服务未初始化，无法调用getVariationsV2方法");
            return null;
        }
        cfc cfcVar = this.f26262a;
        if (cfcVar == null) {
            return null;
        }
        return cfcVar.a(str, str2, map, obj);
    }

    @Override // tb.cfa
    public VariationSet a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("f9d869d7", new Object[]{this, str});
        }
        if (!this.c.get()) {
            h.d("MultiProcessServiceImpl", "多进程服务未初始化，无法调用activateBySwitchName方法");
            return null;
        }
        cfc cfcVar = this.f26262a;
        if (cfcVar == null) {
            return null;
        }
        return cfcVar.a(str);
    }

    @Override // tb.cfa
    public List<EVOExperiment> a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f3bb44d4", new Object[]{this, str, map});
        }
        if (!this.c.get()) {
            h.d("MultiProcessServiceImpl", "多进程服务未初始化，无法调用getExperimentsByDomain方法");
            return null;
        }
        cfc cfcVar = this.f26262a;
        if (cfcVar == null) {
            return null;
        }
        return cfcVar.a(str, map);
    }

    @Override // tb.cfa
    public boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, obj})).booleanValue();
        }
        if (!this.c.get()) {
            h.d("MultiProcessServiceImpl", "多进程服务未初始化，无法调用addActivateServerExperimentGroup方法");
            return false;
        }
        cfc cfcVar = this.f26262a;
        if (cfcVar == null) {
            return false;
        }
        return cfcVar.a(str, obj);
    }

    @Override // tb.cfa
    public boolean a(String str, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee015633", new Object[]{this, str, map, obj})).booleanValue();
        }
        if (!this.c.get()) {
            h.d("MultiProcessServiceImpl", "多进程服务未初始化，无法调用addActivateServerExperimentGroupV2方法");
            return false;
        }
        cfc cfcVar = this.f26262a;
        if (cfcVar == null) {
            return false;
        }
        return cfcVar.a(str, map, obj);
    }

    @Override // tb.cfa
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (!this.c.get()) {
            h.d("MultiProcessServiceImpl", "多进程服务未初始化，无法调用getAppActivateTrackId方法");
            return null;
        }
        cfc cfcVar = this.f26262a;
        if (cfcVar == null) {
            return null;
        }
        return cfcVar.a();
    }

    @Override // tb.cfa
    public void a(Debug debug) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393829e5", new Object[]{this, debug});
        } else if (!this.c.get()) {
            h.d("MultiProcessServiceImpl", "多进程服务未初始化，无法调用startRealTimeDebug方法");
        } else {
            cfc cfcVar = this.f26262a;
            if (cfcVar == null) {
                return;
            }
            cfcVar.a(debug);
        }
    }

    @Override // tb.cfa
    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else if (!this.c.get()) {
            h.c("MultiProcessServiceImpl", "多进程服务未初始化，无法调用reportLog方法");
        } else {
            cfc cfcVar = this.f26262a;
            if (cfcVar == null) {
                return;
            }
            cfcVar.a(str, str2, str3, str4);
        }
    }

    @Override // tb.cfa
    public void a(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c777bd59", new Object[]{this, new Integer(i), bundle});
        } else if (this.c.get()) {
        } else {
            h.c("MultiProcessServiceImpl", "多进程服务未初始化，无法调用sendMsgToAllSubProcess方法");
        }
    }
}
