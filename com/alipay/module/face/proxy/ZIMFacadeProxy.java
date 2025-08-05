package com.alipay.module.face.proxy;

import com.alipay.mobile.security.zim.api.ZIMCallback;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.verifyidentity.sentry.ASProxy;
import com.alipay.mobile.verifyidentity.sentry.SentryDelegate;
import com.alipay.mobile.verifyidentity.sentry.SentryHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ZIMFacadeProxy implements ASProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ZIMFacade zimFacade;

    public ZIMFacadeProxy(ZIMFacade zIMFacade) {
        this.zimFacade = zIMFacade;
    }

    public void verify(String str, Map<String, String> map, final ZIMCallback zIMCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e71b26", new Object[]{this, str, map, zIMCallback});
            return;
        }
        final SentryDelegate sentryDelegate = new SentryDelegate();
        if (sentryDelegate.f6066a) {
            HashMap hashMap = new HashMap(map);
            hashMap.remove(ZIMFacade.KEY_INIT_RESP);
            hashMap.remove("desensName");
            hashMap.remove("USER_ID");
            SentryHelper.a(hashMap);
        }
        this.zimFacade.verify(str, map, new ZIMCallback() { // from class: com.alipay.module.face.proxy.ZIMFacadeProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.security.zim.api.ZIMCallback
            public final boolean response(ZIMResponse zIMResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("60fd2bfb", new Object[]{this, zIMResponse})).booleanValue();
                }
                if (sentryDelegate.f6066a && zIMResponse != null) {
                    SentryHelper.a(zIMResponse);
                }
                ZIMCallback zIMCallback2 = zIMCallback;
                if (zIMCallback2 == null) {
                    return true;
                }
                return zIMCallback2.response(zIMResponse);
            }
        });
    }
}
