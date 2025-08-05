package com.taobao.themis.web.solution;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import java.io.Serializable;
import tb.kge;
import tb.qqh;
import tb.qqq;

/* loaded from: classes9.dex */
public class TMSLegacyWebRenderFactory extends qqh implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1698060994);
        kge.a(1028243835);
    }

    public TMSLegacyWebRenderFactory(f fVar) {
        super(fVar);
    }

    @Override // tb.qqg
    public qqq createRender(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qqq) ipChange.ipc$dispatch("877603f1", new Object[]{this, iTMSPage}) : new com.taobao.themis.web.runtime.b(iTMSPage);
    }
}
