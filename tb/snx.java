package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.RedPacketRequestParams;

/* loaded from: classes5.dex */
public class snx extends snb<RedPacketRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-10477966);
    }

    @Override // tb.snb
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtop.taobao.pagani.api.freshman.hongbao.get";
    }

    @Override // tb.snb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "1.0";
    }

    @Override // tb.snb
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "";
    }

    public snx(RedPacketRequestParams redPacketRequestParams) {
        super(redPacketRequestParams);
    }

    @Override // tb.snb
    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : ((RedPacketRequestParams) this.b).toData();
    }
}
