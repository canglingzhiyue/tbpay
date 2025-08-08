package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.protocol.converter.INetworkConverter;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.network.domain.Request;

/* loaded from: classes.dex */
public class rxy implements rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private INetworkConverter f33411a;

    static {
        kge.a(158865571);
        kge.a(178679831);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.NetworkConvertBeforeFilter";
    }

    public rxy(INetworkConverter iNetworkConverter) {
        this.f33411a = iNetworkConverter;
    }

    @Override // tb.rxn
    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d3d918c", new Object[]{this, aVar});
        }
        Request convert = this.f33411a.convert(aVar);
        convert.s = aVar.g.falcoId;
        convert.t = aVar.g.openTraceContext;
        String launchInfoValue = aVar.g.launchInfoValue();
        if (!StringUtils.isEmpty(launchInfoValue)) {
            convert.c.put(HttpHeaderConstant.LAUNCH_INFO_KEY, launchInfoValue);
        }
        aVar.k = convert;
        aVar.g.url = convert.f25005a;
        if (convert != null) {
            return FilterResult.CONTINUE;
        }
        aVar.c = new MtopResponse(aVar.b.getApiName(), aVar.b.getVersion(), ErrorConstant.ERRCODE_NETWORK_REQUEST_CONVERT_ERROR, ErrorConstant.ERRMSG_NETWORK_REQUEST_CONVERT_ERROR);
        ryl.a(aVar);
        return "STOP";
    }
}
