package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXRenderStrategy;
import java.util.Map;

/* loaded from: classes2.dex */
public class awt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f25659a;
    private Map<String, Object> b;
    private String c;
    private WXRenderStrategy d;

    static {
        kge.a(606075053);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f25659a;
    }

    public Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public WXRenderStrategy d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXRenderStrategy) ipChange.ipc$dispatch("8b149cc9", new Object[]{this}) : this.d;
    }
}
