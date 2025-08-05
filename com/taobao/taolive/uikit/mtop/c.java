package com.taobao.taolive.uikit.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import tb.kge;

/* loaded from: classes8.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-210224999);
    }

    public c(IRemoteBaseListener iRemoteBaseListener) {
        super(iRemoteBaseListener);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        MtopTaobaoSocialFollowGuangAddRequest mtopTaobaoSocialFollowGuangAddRequest = new MtopTaobaoSocialFollowGuangAddRequest();
        mtopTaobaoSocialFollowGuangAddRequest.setTargetUserIdStr(str);
        mtopTaobaoSocialFollowGuangAddRequest.setOriginBiz("taobaozhibo");
        mtopTaobaoSocialFollowGuangAddRequest.setOriginPage(str3);
        a(0, mtopTaobaoSocialFollowGuangAddRequest, (Class<?>) null);
    }
}
