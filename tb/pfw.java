package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.goodlist.TemplateListRequest;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;

/* loaded from: classes8.dex */
public class pfw extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1659232773);
    }

    public pfw(d dVar) {
        super(dVar);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TemplateListRequest templateListRequest = new TemplateListRequest();
        templateListRequest.appVersion = "taolive_highlight_202308";
        a(1, templateListRequest, TemplateListResponse.class);
    }
}
