package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class kua {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f30318a;
    private String b;
    private String c;
    private String d;
    private boolean e;

    static {
        kge.a(-2015218682);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f30318a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public static kua a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kua) ipChange.ipc$dispatch("7c71b4bd", new Object[]{str});
        }
        kua kuaVar = new kua();
        kuaVar.d = str;
        kuaVar.c = "Page_Home";
        kuaVar.b = "PageHome";
        kuaVar.f30318a = "home.request." + str;
        kuaVar.e = true;
        return kuaVar;
    }

    public static kua a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kua) ipChange.ipc$dispatch("1bb83229", new Object[]{str, str2, str3});
        }
        kua kuaVar = new kua();
        kuaVar.d = str3;
        kuaVar.c = str;
        kuaVar.b = str;
        kuaVar.f30318a = str2 + ".request." + str3;
        return kuaVar;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.d) && !StringUtils.isEmpty(this.c) && !StringUtils.isEmpty(this.b) && !StringUtils.isEmpty(this.f30318a);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BxFeatureParam{invokeId='" + this.f30318a + "', bizIdentifier='" + this.b + "', currentScene='" + this.c + "', requestType='" + this.d + "'}";
    }
}
