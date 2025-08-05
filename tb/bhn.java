package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import com.android.tools.bundleInfo.b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import tb.bho;

/* loaded from: classes.dex */
public class bhn implements bhp, bhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f25912a = new ConcurrentHashMap();
    private bgj c = bgj.a();
    private Map<String, bho> b = new LinkedHashMap();

    static {
        kge.a(-814383426);
        kge.a(-29269455);
        kge.a(1378917592);
    }

    public static /* synthetic */ bgj a(bhn bhnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgj) ipChange.ipc$dispatch("639f1b71", new Object[]{bhnVar}) : bhnVar.c;
    }

    @Override // tb.bhp
    public void a(String str, bho.a aVar, Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e114c99a", new Object[]{this, str, aVar, executor});
            return;
        }
        a aVar2 = new a(str, aVar, null, executor);
        synchronized (this.b) {
            this.b.put(aVar.toString(), aVar2);
            if (this.f25912a.containsKey(str)) {
                aVar2.a(str, this.f25912a.get(str).intValue());
            }
        }
    }

    @Override // tb.bhp
    public void a(bho bhoVar, Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bed20ae7", new Object[]{this, bhoVar, executor});
            return;
        }
        a aVar = new a(null, null, bhoVar, executor);
        synchronized (this.b) {
            this.b.put(bhoVar.getClass().getName(), aVar);
            if (this.f25912a.size() > 0) {
                for (Map.Entry<String, Integer> entry : this.f25912a.entrySet()) {
                    aVar.a(entry.getKey(), entry.getValue().intValue());
                }
            }
        }
    }

    @Override // tb.bhp
    public void a(bho.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64cfbdb2", new Object[]{this, aVar});
            return;
        }
        synchronized (this.b) {
            this.b.remove(aVar.getClass().getName());
        }
    }

    @Override // tb.bhq
    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        synchronized (this.b) {
            DynamicFeatureInfo c = b.a().c(str);
            if (c != null && c.status != -1) {
                for (bho bhoVar : this.b.values()) {
                    bhoVar.a(str, i);
                }
            }
        }
        this.f25912a.put(str, Integer.valueOf(i));
    }

    @Override // tb.bhq
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.b) {
            DynamicFeatureInfo c = b.a().c(str2);
            if (c != null && !c.appVersion.equals(str)) {
                for (bho bhoVar : this.b.values()) {
                    bhoVar.a(str2, -1);
                }
            }
        }
    }

    @Override // tb.bhp
    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (b.a().c(str) != null && this.f25912a.containsKey(str)) {
            return this.f25912a.get(str).intValue();
        }
        return 0;
    }

    /* loaded from: classes.dex */
    public class a implements Runnable, bho {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Executor b;
        private bho.a c;
        private bho d;
        private String e;
        private String f;
        private int g;

        static {
            kge.a(106503429);
            kge.a(-1390502639);
            kge.a(-376658484);
        }

        public a(String str, bho.a aVar, bho bhoVar, Executor executor) {
            this.c = aVar;
            this.d = bhoVar;
            this.e = str;
            this.b = executor;
        }

        @Override // tb.bho
        public void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                return;
            }
            this.f = str;
            this.g = i;
            Executor executor = this.b;
            if (executor != null) {
                executor.execute(this);
            } else {
                bhn.a(bhn.this).a(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TextUtils.isEmpty(this.e) && this.e.equals(this.f)) {
                this.c.a(this.g);
            } else {
                bho bhoVar = this.d;
                if (bhoVar == null) {
                    return;
                }
                bhoVar.a(this.f, this.g);
            }
        }
    }
}
