package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.k;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class ewm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, ewm> f27609a;
    private String b;
    private int c;
    private Map<String, String> f;
    private boolean e = false;
    private Map<String, a> d = new ConcurrentHashMap();

    static {
        kge.a(-892826302);
        f27609a = new HashMap();
    }

    private ewm(String str) {
        this.b = str;
        a();
        tpc.a("com.taobao.android.detail.sdk.model.profile.TimeProfiler");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f = new HashMap();
        this.f.put("mInit", "");
        this.f.put("mReq", "");
        this.f.put("mLoad", "");
        this.f.put("mProcessData", "");
        this.f.put("mThreadSwitch", "");
        this.f.put("mCreateDetailModel", "");
        this.f.put("mCreateViewModel", "");
        this.f.put("mFetchTemplate", "");
        this.f.put("mCreateProtocolMap", "");
        this.f.put("mCreateLayoutModel", "");
        this.f.put("mTemplateFromMem", "");
        this.f.put("mTemplateFromFile", "");
        this.f.put("mTemplateFromNetwork", "");
        this.f.put("mTemplateParseJSON", "");
        this.f.put("load", "");
        this.f.put("mUpdate", "");
        this.f.put("mMtop", "");
    }

    public static ewm a(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ewm) ipChange.ipc$dispatch("594f4ba6", new Object[]{new Integer(i), str}) : c(str).a(i);
    }

    public ewm a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewm) ipChange.ipc$dispatch("7c6f0379", new Object[]{this, str});
        }
        a aVar = new a();
        aVar.f27610a = str;
        aVar.b = k.a();
        aVar.d = 0L;
        this.d.put(str, aVar);
        return this;
    }

    public ewm b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ewm) ipChange.ipc$dispatch("7d1baf18", new Object[]{this, str}) : a(str, (String) null);
    }

    public ewm a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewm) ipChange.ipc$dispatch("95399aef", new Object[]{this, str, str2});
        }
        a aVar = this.d.get(str);
        if (aVar == null) {
            eva.c("TimeProfiler", "TimeProfiler Page " + this.b + " None Start Method" + str);
            return this;
        }
        aVar.e = str2;
        if (aVar.d <= 0) {
            aVar.c = k.a();
            if (aVar.b > 0) {
                aVar.d = aVar.c - aVar.b;
                eva.b("TimeProfiler", "TimeProfiler " + this.b + " " + aVar.f27610a + " CostTime " + aVar.d + "ms");
            } else {
                this.d.remove(str);
            }
        }
        return this;
    }

    public ewm a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewm) ipChange.ipc$dispatch("1a952ad9", new Object[]{this, str, new Long(j)});
        }
        if (j >= 0) {
            a aVar = new a();
            aVar.f27610a = str;
            aVar.b = k.a();
            aVar.c = aVar.b;
            aVar.d = j;
            this.d.put(str, aVar);
            eva.b("TimeProfiler", "TimeProfiler " + this.b + " " + aVar.f27610a + " CostTime " + j + "ms");
        }
        return this;
    }

    public static ewm a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewm) ipChange.ipc$dispatch("c8b11dc", new Object[]{new Integer(i), str, str2});
        }
        ewm a2 = a(i, str);
        a2.a(str2);
        return a2;
    }

    public static ewm b(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewm) ipChange.ipc$dispatch("c14abdd", new Object[]{new Integer(i), str, str2});
        }
        ewm a2 = a(i, str);
        a2.b(str2);
        return a2;
    }

    public static void a(int i, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1770575", new Object[]{new Integer(i), str, str2, new Long(j)});
        } else {
            a(i, str).a(str2, j);
        }
    }

    public static ewm c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewm) ipChange.ipc$dispatch("7dc85ab7", new Object[]{str});
        }
        ewm ewmVar = f27609a.get(str);
        if (ewmVar != null) {
            return ewmVar;
        }
        synchronized (ewm.class) {
            ewm ewmVar2 = f27609a.get(str);
            if (ewmVar2 != null) {
                return ewmVar2;
            }
            ewm ewmVar3 = new ewm(str);
            f27609a.put(str, ewmVar3);
            return ewmVar3;
        }
    }

    public ewm a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewm) ipChange.ipc$dispatch("e66143f0", new Object[]{this, new Integer(i)});
        }
        this.c = i;
        return this;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f27610a;
        public long b;
        public long c;
        public long d;
        public String e;

        static {
            kge.a(999705310);
        }

        private a() {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MethodName =" + this.f27610a + " CostTime =" + this.d + "ms\r\n";
        }
    }
}
