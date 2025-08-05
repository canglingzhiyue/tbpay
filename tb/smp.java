package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.CustomApiRequestParams;
import com.taobao.android.detail.ttdetail.utils.j;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;

/* loaded from: classes5.dex */
public class smp extends snb<CustomApiRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1194716600);
    }

    public static /* synthetic */ Object ipc$super(smp smpVar, String str, Object... objArr) {
        if (str.hashCode() == 96532846) {
            super.g();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public smp(CustomApiRequestParams customApiRequestParams) {
        super(customApiRequestParams);
    }

    @Override // tb.snb
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : ((CustomApiRequestParams) this.b).getApiName();
    }

    @Override // tb.snb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : ((CustomApiRequestParams) this.b).getApiVersion();
    }

    @Override // tb.snb
    public MethodEnum d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MethodEnum) ipChange.ipc$dispatch("27517117", new Object[]{this}) : "get".equalsIgnoreCase(((CustomApiRequestParams) this.b).getMethod()) ? MethodEnum.GET : MethodEnum.POST;
    }

    @Override // tb.snb
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.c.mo1296handler(tae.b());
        this.c.forbidStreamExceptionCallback(j.t());
        super.g();
    }

    @Override // tb.snb
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String unitStrategy = ((CustomApiRequestParams) this.b).getUnitStrategy();
        return "TRADE".equalsIgnoreCase(unitStrategy) ? "UNIT_TRADE" : "GUIDE".equalsIgnoreCase(unitStrategy) ? "UNIT_GUIDE" : "";
    }

    @Override // tb.snb
    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : Boolean.parseBoolean(((CustomApiRequestParams) this.b).getWua());
    }

    @Override // tb.snb
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : Boolean.parseBoolean(((CustomApiRequestParams) this.b).getEcode());
    }

    @Override // tb.snb
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : Boolean.parseBoolean(((CustomApiRequestParams) this.b).getSession());
    }

    @Override // tb.snb
    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this}) : ((CustomApiRequestParams) this.b).getHeaderMap();
    }

    @Override // tb.snb
    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : Boolean.parseBoolean(((CustomApiRequestParams) this.b).getEnableUpCompress());
    }

    @Override // tb.snb
    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : ((CustomApiRequestParams) this.b).getBizTopic();
    }
}
