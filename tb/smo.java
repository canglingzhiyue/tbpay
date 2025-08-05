package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.sku.SkuRequestClient;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;

/* loaded from: classes5.dex */
public class smo extends snb<MainRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(964325628);
    }

    public static /* synthetic */ Object ipc$super(smo smoVar, String str, Object... objArr) {
        if (str.hashCode() == 96532846) {
            super.g();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.snb
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : SkuRequestClient.API_NAME;
    }

    @Override // tb.snb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "6.0";
    }

    public smo(MainRequestParams mainRequestParams) {
        super(mainRequestParams);
    }

    @Override // tb.snb
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.c.mo1340setBizId(9998);
        this.c.mo1296handler(tae.b());
        this.c.mo1330supportStreamJson(true);
        super.g();
    }
}
