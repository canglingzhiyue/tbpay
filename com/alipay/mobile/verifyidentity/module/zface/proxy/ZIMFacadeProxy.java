package com.alipay.mobile.verifyidentity.module.zface.proxy;

import android.os.Bundle;
import com.alipay.mobile.security.zim.api.ZIMCallback;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannelCallback;
import com.alipay.mobile.verifyidentity.sentry.ASProxy;
import com.alipay.mobile.verifyidentity.sentry.SentryDelegate;
import com.alipay.mobile.verifyidentity.sentry.SentryHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ZIMFacadeProxy implements ASProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SentryDelegate delegate;
    private ZIMFacade zimFacade;

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    public static /* synthetic */ SentryDelegate access$000(ZIMFacadeProxy zIMFacadeProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SentryDelegate) ipChange.ipc$dispatch("4ee36c9d", new Object[]{zIMFacadeProxy}) : zIMFacadeProxy.delegate;
    }

    public ZIMFacadeProxy(ZIMFacade zIMFacade) {
        this.zimFacade = zIMFacade;
    }

    public void verify(String str, Map<String, String> map, final ZimMessageChannel zimMessageChannel, final ZIMCallback zIMCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1265d31a", new Object[]{this, str, map, zimMessageChannel, zIMCallback});
            return;
        }
        this.delegate = new SentryDelegate();
        if (this.delegate.f6066a) {
            HashMap hashMap = new HashMap(map);
            hashMap.remove(ZIMFacade.KEY_INIT_RESP);
            hashMap.remove("desensName");
            hashMap.remove("USER_ID");
            SentryHelper.a(hashMap);
        }
        this.zimFacade.verify(str, map, new ZimMessageChannel() { // from class: com.alipay.mobile.verifyidentity.module.zface.proxy.ZIMFacadeProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel
            public void onAction(Bundle bundle, ZimMessageChannelCallback zimMessageChannelCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b399c2d", new Object[]{this, bundle, zimMessageChannelCallback});
                    return;
                }
                if (ZIMFacadeProxy.access$000(ZIMFacadeProxy.this).f6066a) {
                    Bundle bundle2 = new Bundle(bundle);
                    if (bundle2.containsKey("requestData")) {
                        bundle2.remove("requestData");
                    }
                    ZIMFacadeProxy.access$000(ZIMFacadeProxy.this);
                    SentryHelper.a(bundle2);
                }
                ZimMessageChannel zimMessageChannel2 = zimMessageChannel;
                if (zimMessageChannel2 == null) {
                    return;
                }
                zimMessageChannel2.onAction(bundle, zimMessageChannelCallback);
            }
        }, new ZIMCallback() { // from class: com.alipay.mobile.verifyidentity.module.zface.proxy.ZIMFacadeProxy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.security.zim.api.ZIMCallback
            public boolean response(ZIMResponse zIMResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("60fd2bfb", new Object[]{this, zIMResponse})).booleanValue();
                }
                if (ZIMFacadeProxy.access$000(ZIMFacadeProxy.this).f6066a) {
                    if (zIMResponse != null) {
                        ZIMFacadeProxy.access$000(ZIMFacadeProxy.this);
                        SentryHelper.a(zIMResponse);
                    } else {
                        ZIMFacadeProxy.access$000(ZIMFacadeProxy.this);
                    }
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
