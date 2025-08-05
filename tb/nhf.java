package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes7.dex */
public class nhf implements nfh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String e;

    /* renamed from: a  reason: collision with root package name */
    public int f31466a;
    public String b;
    public Map<String, List<String>> c;
    public byte[] d;

    static {
        kge.a(-1792628263);
        kge.a(1665406270);
        e = nhe.class.getSimpleName();
    }

    public nhf(int i) {
        this.f31466a = i;
    }

    public nhf(MtopResponse mtopResponse) {
        if (mtopResponse != null) {
            if (mtopResponse.isApiSuccess()) {
                this.f31466a = mtopResponse.getResponseCode();
            } else {
                this.f31466a = -1;
            }
            this.b = mtopResponse.getRetCode();
            this.c = mtopResponse.getHeaderFields();
            this.d = mtopResponse.getBytedata();
        }
    }

    @Override // tb.nfh
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f31466a;
    }

    @Override // tb.nfh
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    @Override // tb.nfh
    public byte[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("ab8ad2b3", new Object[]{this}) : this.d;
    }

    @Override // tb.nfh
    public Map<String, List<String>> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.c;
    }
}
