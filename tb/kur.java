package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.utils.n;
import com.taobao.tao.linklog.a;
import com.taobao.themis.kernel.i;
import java.util.HashMap;

/* loaded from: classes.dex */
public class kur implements ktx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f30333a;
    private boolean b;
    private int c = 1024;
    private int d = 10;

    static {
        kge.a(-1522610290);
        kge.a(1692916670);
    }

    @Override // tb.ktx
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "ucpFatigueData";
    }

    public kur(String str) {
        this.f30333a = str;
    }

    @Override // tb.ktx
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        lap.a("CreateCommonParams", "UcpParamsBuilder", "requestType : " + this.f30333a);
        c();
        if (!d()) {
            return null;
        }
        String e = e();
        if (a(e, this.c)) {
            return e;
        }
        lap.a("CreateCommonParams", "UcpParamsBuilder", "checkDataLengthValid is false");
        return null;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = j.a("ucpDataEnable", true);
        this.c = j.a("ucpDataLimitedSize", 1024);
        this.d = j.a("ucpDataMaxTime", 10);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (n.c()) {
            lap.a("CreateCommonParams", "UcpParamsBuilder", "isLowDevice");
            return false;
        } else if (this.b) {
            return true;
        } else {
            lap.a("CreateCommonParams", "UcpParamsBuilder", "ucpDataEnable : false");
            return false;
        }
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = null;
        try {
            str = UCPManager.a("Page_Home");
        } catch (Throwable th) {
            lap.a("CreateCommonParams", "UcpParamsBuilder", "UCPManager.fetchFatigueWithBizName error : " + th.getMessage());
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        lap.a("CreateCommonParams", "UcpParamsBuilder", this.f30333a + " UCPManager.fetchFatigueWithBizName 耗时 : " + elapsedRealtime2);
        a(elapsedRealtime2, this.d);
        return str;
    }

    private boolean a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        if (str == null || StringUtils.isEmpty(str)) {
            return false;
        }
        int length = str.toCharArray().length;
        if (length <= i) {
            return true;
        }
        a.a("UcpParamsBuilder", "UcpParamsBuilder", "数据长度超过最大长度, 数据长度为 : " + length);
        return false;
    }

    private void a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11c727", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j <= i) {
        } else {
            HashMap hashMap = new HashMap(2);
            hashMap.put("sMaxTime", i + "");
            hashMap.put("total", j + "");
            hashMap.put(i.CDN_REQUEST_TYPE, this.f30333a);
            a.a("UcpParamsBuilder", "UcpParamsBuilder", "1.0", "Page_Home", "UcpParamsBuilder", hashMap, "UcpParamsBuildUcpDataMaxTime", "接口调用超时");
        }
    }
}
