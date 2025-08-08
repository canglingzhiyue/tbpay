package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.fetch.ConfigFetcher;
import com.alibaba.poplayer.config.fetch.ConfigFetcherNew;
import com.alibaba.poplayer.config.fetch.IConfigFetcher;
import com.alibaba.poplayer.config.manager.ConfigManager;
import com.alibaba.poplayer.norm.IConfigAdapter;
import com.alibaba.poplayer.norm.INewConfigAdapter;
import com.alibaba.poplayer.utils.Monitor;
import com.alibaba.poplayer.utils.b;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Monitor.TargetClass
/* loaded from: classes.dex */
public class bzs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile String b;

    /* renamed from: a */
    private volatile boolean f26211a = false;
    @Monitor.TargetField(name = b.MONITOR_TIME_TRAVEL_SEC)
    private volatile long c = 0;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final bzs f26212a;

        static {
            kge.a(1541912132);
            f26212a = new bzs();
        }

        public static /* synthetic */ bzs a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bzs) ipChange.ipc$dispatch("f030963", new Object[0]) : f26212a;
        }
    }

    static {
        kge.a(408096625);
    }

    public static /* synthetic */ void lambda$Ga77oJpKz2NSv7yKLpTGdV03Ie8(bzs bzsVar, boolean z, String str, boolean z2, boolean z3, String str2, long j) {
        bzsVar.a(z, str, z2, z3, str2, j);
    }

    public static bzs a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bzs) ipChange.ipc$dispatch("f030963", new Object[0]) : a.a();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : bzo.a();
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : bzo.b();
    }

    public void a(final boolean z, final String str, final boolean z2, final boolean z3, final long j, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6265b098", new Object[]{this, new Boolean(z), str, new Boolean(z2), new Boolean(z3), new Long(j), str2});
        } else {
            f.a(new Runnable() { // from class: tb.-$$Lambda$bzs$Ga77oJpKz2NSv7yKLpTGdV03Ie8
                @Override // java.lang.Runnable
                public final void run() {
                    bzs.lambda$Ga77oJpKz2NSv7yKLpTGdV03Ie8(bzs.this, z, str, z2, z3, str2, j);
                }
            });
        }
    }

    public /* synthetic */ void a(boolean z, String str, boolean z2, boolean z3, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5ff3f44", new Object[]{this, new Boolean(z), str, new Boolean(z2), new Boolean(z3), str2, new Long(j)});
            return;
        }
        try {
            if (z) {
                a(str, z2, z3, str2);
                b(j, z2);
                return;
            }
            m();
            n();
        } catch (Throwable th) {
            c.a("PopLayerMockManager.setMock.error", th);
        }
    }

    public void a(boolean z, boolean z2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2710c6dc", new Object[]{this, new Boolean(z), new Boolean(z2), new Long(j)});
            return;
        }
        try {
            if (z) {
                b(j, z2);
            } else {
                n();
            }
        } catch (Throwable th) {
            c.a("PopLayerMockManager.setMockTimeTravelSec.error", th);
        }
    }

    private synchronized void a(String str, boolean z, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2852237c", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2});
            return;
        }
        if (z) {
            a(str);
        } else {
            a("");
        }
        e();
        if (z2) {
            b(str2);
        }
        d(str);
        c(str);
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            cag.i().e();
            ConfigManager configMgr = PopLayer.getReference().getConfigMgr();
            if (configMgr.useNewConfigFetcher()) {
                configMgr.startFetchConfig(true);
            } else {
                configMgr.startLoadConfigs("");
            }
            this.b = str;
            this.f26211a = true;
            c.a("PopLayerMockManager.startMock.success", new Object[0]);
        } catch (Throwable th) {
            c.a("PopLayerMockManager.doMock.error", th);
        }
    }

    private synchronized void b(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f84239", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        a(j, z);
        c.a("PopLayerMockManager.startMockTimeTravelSec.success", new Object[0]);
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        try {
            IConfigFetcher a2 = a(PopLayer.getReference().getConfigMgr());
            StringBuilder sb = new StringBuilder();
            sb.append("PopLayerMockManager.singleStartMock.iConfigFetcher=");
            sb.append(a2 != null);
            c.a(sb.toString());
            if (a2 instanceof ConfigFetcher) {
                IConfigAdapter a3 = a((ConfigFetcher) a2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PopLayerMockManager.singleStartMock.iConfigAdapter=");
                if (a3 == null) {
                    z = false;
                }
                sb2.append(z);
                c.a(sb2.toString());
                if (a3 instanceof bzq) {
                    ((bzq) a3).b = JSONObject.parseObject(str);
                } else {
                    a((ConfigFetcher) a2, new bzq(a3, JSONObject.parseObject(str)));
                }
            } else if (!(a2 instanceof ConfigFetcherNew)) {
            } else {
                INewConfigAdapter a4 = a((ConfigFetcherNew) a2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("PopLayerMockManager.singleStartMock.iNewConfigAdapter=");
                if (a4 == null) {
                    z = false;
                }
                sb3.append(z);
                c.a(sb3.toString());
                if (a4 instanceof bzr) {
                    ((bzr) a4).a(JSONObject.parseObject(str));
                } else {
                    a((ConfigFetcherNew) a2, new bzr(a4, JSONObject.parseObject(str)));
                }
            }
        } catch (Throwable th) {
            c.a("PopLayerMockManager.singleStartMock.error", th);
        }
    }

    private boolean l() throws IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        IConfigFetcher a2 = a(PopLayer.getReference().getConfigMgr());
        if (a2 instanceof ConfigFetcher) {
            ConfigFetcher configFetcher = (ConfigFetcher) a2;
            IConfigAdapter a3 = a(configFetcher);
            if (a3 instanceof bzq) {
                a(configFetcher, ((bzq) a3).f26209a);
                return true;
            }
        } else if (a2 instanceof ConfigFetcherNew) {
            ConfigFetcherNew configFetcherNew = (ConfigFetcherNew) a2;
            INewConfigAdapter a4 = a(configFetcherNew);
            if (a4 instanceof bzr) {
                a(configFetcherNew, ((bzr) a4).f26210a);
                return true;
            }
        }
        return false;
    }

    private synchronized void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        a("");
        b("");
        if (l()) {
            ConfigManager configMgr = PopLayer.getReference().getConfigMgr();
            if (configMgr.useNewConfigFetcher()) {
                configMgr.startFetchConfig(true);
            } else {
                configMgr.startLoadConfigs("");
            }
            c.a("PopLayerMockManager.stopMock.success Page.", new Object[0]);
        }
        this.b = null;
        this.f26211a = false;
        c.a("PopLayerMockManager.stopMock.success", new Object[0]);
    }

    private synchronized void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            a(0L, true);
        }
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.c;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        bzo.d();
        bzo.b("");
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.c = c();
        }
    }

    public void a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        this.c = j;
        if (z) {
            bzo.a(j);
        } else {
            bzo.a(0L);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            bzo.a(str);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            bzo.b(str);
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : bzo.c();
    }

    public Set<String> o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("df68cae5", new Object[]{this}) : bzo.g();
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            bzo.f(str);
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(b());
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(g());
            if (parseObject != null && parseObject.containsKey("isForceCheck")) {
                return parseObject.getBoolean("isForceCheck").booleanValue();
            }
        } catch (Throwable th) {
            c.a("PopLayerMockManager.isConstraintMockingForceCheck.error.", th);
        }
        return false;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(bzo.c());
            if (parseObject != null && parseObject.containsKey("isConstraintMock")) {
                return parseObject.getBoolean("isConstraintMock").booleanValue();
            }
        } catch (Throwable th) {
            c.a("PopLayerMockManager.isConstraintMocking.error.", th);
        }
        return false;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if (!j()) {
            return true;
        }
        Set<String> o = o();
        ArrayList arrayList = o != null ? new ArrayList(o) : new ArrayList();
        List<String> observerCurrentConfigSet = PopLayer.getReference().getConfigMgr().getObserverCurrentConfigSet();
        if (observerCurrentConfigSet == null || observerCurrentConfigSet.isEmpty()) {
            return true;
        }
        return !arrayList.isEmpty() && arrayList.equals(observerCurrentConfigSet);
    }

    private IConfigFetcher a(ConfigManager configManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IConfigFetcher) ipChange.ipc$dispatch("ffc165c6", new Object[]{this, configManager}) : (IConfigFetcher) a(configManager, "mConfigFetcher");
    }

    private IConfigAdapter a(ConfigFetcher configFetcher) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IConfigAdapter) ipChange.ipc$dispatch("23389074", new Object[]{this, configFetcher}) : (IConfigAdapter) a(configFetcher, "mConfigAdapter");
    }

    private INewConfigAdapter a(ConfigFetcherNew configFetcherNew) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INewConfigAdapter) ipChange.ipc$dispatch("9c73ed28", new Object[]{this, configFetcherNew}) : (INewConfigAdapter) a(configFetcherNew, "mConfigAdapter");
    }

    private Object a(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void a(ConfigFetcher configFetcher, IConfigAdapter iConfigAdapter) throws IllegalAccessException {
        Field field;
        Field[] declaredFields = ConfigFetcher.class.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            field.setAccessible(true);
            if (field.get(configFetcher) instanceof IConfigAdapter) {
                break;
            }
            i++;
        }
        if (field != null) {
            field.set(configFetcher, iConfigAdapter);
        }
    }

    private void a(ConfigFetcherNew configFetcherNew, INewConfigAdapter iNewConfigAdapter) throws IllegalAccessException {
        Field field;
        Field[] declaredFields = ConfigFetcherNew.class.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            field.setAccessible(true);
            if (field.get(configFetcherNew) instanceof INewConfigAdapter) {
                break;
            }
            i++;
        }
        if (field != null) {
            field.set(configFetcherNew, iNewConfigAdapter);
        }
    }
}
