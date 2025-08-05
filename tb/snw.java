package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.PreloadRequestParams;
import mtopsdk.mtop.domain.MethodEnum;

/* loaded from: classes5.dex */
public class snw extends snb<PreloadRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1755000030);
    }

    public static /* synthetic */ Object ipc$super(snw snwVar, String str, Object... objArr) {
        if (str.hashCode() == 96532846) {
            super.g();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.snb
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtop.taobao.detail.batchgetdetail";
    }

    @Override // tb.snb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "1.0";
    }

    public snw(PreloadRequestParams preloadRequestParams) {
        super(preloadRequestParams);
    }

    @Override // tb.snb
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.c.mo1296handler(((PreloadRequestParams) this.b).isNavPreload() ? tae.b() : tae.a());
        this.c.mo1330supportStreamJson(true);
        super.g();
    }

    @Override // tb.snb
    public MethodEnum d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MethodEnum) ipChange.ipc$dispatch("27517117", new Object[]{this}) : MethodEnum.POST;
    }
}
