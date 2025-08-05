package com.alipay.android.phone.mobilecommon.rpc;

import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.verifyidentity.rpc.IRpcServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class AlipayRpcService extends BioRPCService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.security.bio.service.local.rpc.BioRPCService
    public void addRequestHeaders(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb45e8a", new Object[]{this, obj, map});
        }
    }

    @Override // com.alipay.mobile.security.bio.service.local.rpc.BioRPCService
    public void setRegion(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709837a3", new Object[]{this, obj, str});
        }
    }

    @Override // com.alipay.mobile.security.bio.service.local.rpc.BioRPCService
    public <T> T getRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls}) : (T) new IRpcServiceImpl().getRpcProxy(cls);
    }

    @Override // com.alipay.mobile.security.bio.service.local.rpc.BioRPCService
    public void setRemoteUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd920458", new Object[]{this, str});
            return;
        }
        BioLog.w("AlipayRpcService", "setRemoteUrl(" + str + riy.BRACKET_END_STR);
    }
}
