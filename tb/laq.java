package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.m;
import com.taobao.gateway.dispatch.a;

/* loaded from: classes.dex */
public class laq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;
    private String c;

    /* renamed from: a  reason: collision with root package name */
    private String f30434a = "Page_Home_Track";
    private StringBuffer d = new StringBuffer();

    static {
        kge.a(-281531854);
    }

    public static /* synthetic */ String a(laq laqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81b14c64", new Object[]{laqVar}) : laqVar.b;
    }

    public static /* synthetic */ String b(laq laqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("825df803", new Object[]{laqVar}) : laqVar.c;
    }

    public static /* synthetic */ StringBuffer c(laq laqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StringBuffer) ipChange.ipc$dispatch("e4b5c602", new Object[]{laqVar}) : laqVar.d;
    }

    private laq() {
    }

    public static laq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (laq) ipChange.ipc$dispatch("f073702", new Object[0]) : new laq();
    }

    public laq a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (laq) ipChange.ipc$dispatch("7c71dff8", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public laq b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (laq) ipChange.ipc$dispatch("7d1e8b97", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public laq c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (laq) ipChange.ipc$dispatch("7dcb3736", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            StringBuffer stringBuffer = this.d;
            stringBuffer.append(str);
            stringBuffer.append(" ");
        }
        return this;
    }

    public laq a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (laq) ipChange.ipc$dispatch("953c776e", new Object[]{this, str, str2});
        }
        StringBuffer stringBuffer = this.d;
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        stringBuffer.append(";");
        return this;
    }

    public laq a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (laq) ipChange.ipc$dispatch("264e9639", new Object[]{this, str, new Integer(i)});
        }
        StringBuffer stringBuffer = this.d;
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(i);
        stringBuffer.append(".");
        return this;
    }

    public laq a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (laq) ipChange.ipc$dispatch("5f2f1948", new Object[]{this, str, new Boolean(z)});
        }
        StringBuffer stringBuffer = this.d;
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(z);
        stringBuffer.append(".");
        return this;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Boolean bool = (Boolean) m.a().a("homeNetLowOptimization", Boolean.class);
        if (bool != null && bool.booleanValue()) {
            a.b().f(new Runnable() { // from class: tb.laq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lap.a(laq.a(laq.this), laq.b(laq.this), laq.c(laq.this).toString());
                    }
                }
            });
        } else {
            lap.a(this.b, this.c, this.d.toString());
        }
    }
}
