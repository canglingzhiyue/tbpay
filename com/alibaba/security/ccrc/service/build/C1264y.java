package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.common.http.model.BaseResponse;
import com.alibaba.security.ccrc.common.http.model.ConfigVersion;
import com.alibaba.security.ccrc.common.http.model.Extras;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.alibaba.security.ccrc.service.build.y */
/* loaded from: classes3.dex */
public class C1264y extends AbstractC1255v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String c = "RuleInterceptor";

    public C1264y(Z z) {
        super(z);
    }

    /* renamed from: lambda$y-KDDhw8YkKSVIhamSjC2pFTlBk */
    public static /* synthetic */ void m250lambda$yKDDhw8YkKSVIhamSjC2pFTlBk(C1264y c1264y, List list) {
        c1264y.a(list);
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1258w
    public void a(BaseRequest baseRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd6a974", new Object[]{this, baseRequest});
            return;
        }
        List<String> ccrcCodes = baseRequest.ccrcCodes();
        ArrayList arrayList = new ArrayList();
        if (ccrcCodes == null || ccrcCodes.size() <= 0) {
            return;
        }
        for (String str : ccrcCodes) {
            ConfigVersion configVersion = new ConfigVersion();
            configVersion.ccrcCode = str;
            configVersion.versionInfo = this.f3332a.a(str);
            arrayList.add(configVersion);
        }
        baseRequest.configInfo = JsonUtils.toJSONString(arrayList);
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1258w
    public void a(BaseResponse baseResponse) {
        Extras extras;
        final List<ConfigVersion> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49cd6ac", new Object[]{this, baseResponse});
        } else if (baseResponse == null || (extras = baseResponse.extra) == null || (list = extras.configUpdate) == null || list.size() == 0) {
        } else {
            this.b.submit(new Runnable() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$y$y-KDDhw8YkKSVIhamSjC2pFTlBk
                {
                    C1264y.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1264y.m250lambda$yKDDhw8YkKSVIhamSjC2pFTlBk(C1264y.this, list);
                }
            });
        }
    }

    public /* synthetic */ void a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f3332a.a((ConfigVersion) it.next());
        }
    }
}
