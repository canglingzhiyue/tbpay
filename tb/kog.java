package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.b;
import com.taobao.flowcustoms.afc.model.AfcConfigBean;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.flowcustoms.afc.xbs.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class kog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public kom f30188a;
    public kns b;
    public knw c;
    public knu d;
    public koc e;
    public knt f;
    public kod g;
    public kob h;
    public koa i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public boolean n;
    public boolean o;
    private e p;
    private kon q;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static kog f30189a;

        static {
            kge.a(1457522886);
            f30189a = new kog();
        }
    }

    static {
        kge.a(843632251);
    }

    private kog() {
        this.f30188a = null;
        this.n = false;
        this.o = false;
    }

    public static kog a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kog) ipChange.ipc$dispatch("f06f5fb", new Object[0]) : a.f30189a;
    }

    public AfcConfigBean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AfcConfigBean) ipChange.ipc$dispatch("571b1408", new Object[]{this, str}) : (AfcConfigBean) b.a().a(str, AfcConfigBean.class);
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : b.a().a(str, str2);
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        kob kobVar = this.h;
        if (kobVar == null) {
            return;
        }
        kobVar.a(str, str2);
    }

    public void a(com.taobao.flowcustoms.afc.a aVar, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea55cb34", new Object[]{this, aVar, str, hashMap});
            return;
        }
        kob kobVar = this.h;
        if (kobVar == null) {
            return;
        }
        kobVar.a(aVar, str, hashMap);
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        koc kocVar = this.e;
        if (kocVar == null) {
            return;
        }
        kocVar.a(str, str2);
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            return;
        }
        koc kocVar = this.e;
        if (kocVar == null) {
            return;
        }
        kocVar.b(str, str2);
    }

    public void a(String str, String str2, HashMap<String, String> hashMap, knz knzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60fd9750", new Object[]{this, str, str2, hashMap, knzVar});
            return;
        }
        c.b("linkx", "AfcAdapterManager === requestData === API：" + str + " 参数Map == " + hashMap.toString());
        if (this.f30188a != null) {
            return;
        }
        if (this.q == null) {
            this.q = new kon();
        }
        this.q.a(str, str2, true, hashMap, knzVar);
    }

    public void a(com.taobao.flowcustoms.afc.a aVar, AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e12c632", new Object[]{this, aVar, afcXbsData});
            return;
        }
        kod kodVar = this.g;
        if (kodVar == null) {
            if (this.p == null) {
                this.p = new e();
            }
            this.p.a(aVar, afcXbsData);
            return;
        }
        kodVar.a(aVar, afcXbsData);
    }

    public void a(Context context, com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc04238d", new Object[]{this, context, aVar});
            return;
        }
        kod kodVar = this.g;
        if (kodVar == null) {
            com.taobao.flowcustoms.afc.xbs.b.a(context, aVar);
        } else {
            kodVar.a(context, aVar);
        }
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        knw knwVar = this.c;
        if (knwVar == null) {
            return;
        }
        knwVar.a(str, map);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        knw knwVar = this.c;
        if (knwVar == null) {
            return;
        }
        knwVar.a(str);
    }

    public boolean a(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc9b6d99", new Object[]{this, aVar})).booleanValue();
        }
        koa koaVar = this.i;
        if (koaVar != null) {
            return koaVar.a(aVar);
        }
        return false;
    }

    public boolean b(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43742d5a", new Object[]{this, aVar})).booleanValue();
        }
        koa koaVar = this.i;
        if (koaVar != null) {
            return koaVar.b(aVar);
        }
        return false;
    }

    public boolean c(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa4ced1b", new Object[]{this, aVar})).booleanValue();
        }
        koa koaVar = this.i;
        if (koaVar != null) {
            return koaVar.c(aVar);
        }
        return false;
    }

    public boolean d(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1125acdc", new Object[]{this, aVar})).booleanValue();
        }
        koa koaVar = this.i;
        if (koaVar != null) {
            return koaVar.d(aVar);
        }
        return false;
    }

    public boolean e(com.taobao.flowcustoms.afc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77fe6c9d", new Object[]{this, aVar})).booleanValue();
        }
        koa koaVar = this.i;
        if (koaVar != null) {
            return koaVar.e(aVar);
        }
        return false;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        knu knuVar = this.d;
        if (knuVar != null) {
            return knuVar.a();
        }
        return false;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        knu knuVar = this.d;
        return knuVar == null ? "" : knuVar.b();
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        kns knsVar = this.b;
        return knsVar != null ? knsVar.b() : i;
    }

    public long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{this, new Long(j)})).longValue();
        }
        kns knsVar = this.b;
        return knsVar != null ? knsVar.e() : j;
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        kns knsVar = this.b;
        return knsVar != null ? knsVar.a() : str;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        kns knsVar = this.b;
        return knsVar != null ? knsVar.f() : "";
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        kns knsVar = this.b;
        return knsVar != null ? knsVar.g() : "";
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        kns knsVar = this.b;
        return knsVar != null ? knsVar.h() : "";
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        kns knsVar = this.b;
        return knsVar != null ? knsVar.i() : "";
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        kns knsVar = this.b;
        return knsVar != null ? knsVar.c() : z;
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        kns knsVar = this.b;
        return knsVar != null ? knsVar.d() : str;
    }
}
