package com.alibaba.triver.triver_shop;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.TBWXSDKEngine;
import com.taobao.weex.WXEnvironment;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1142630224);
    }

    public static void a(Context context, ShareContent shareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d4e19a2", new Object[]{context, shareContent, str});
            return;
        }
        if (TextUtils.equals("weex", shareContent.templateId) && !WXEnvironment.JsFrameworkInit) {
            TBWXSDKEngine.initSDKEngine();
            while (!WXEnvironment.JsFrameworkInit) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        ShareBusiness.share((Activity) context, shareContent, new ShareBusinessListener() { // from class: com.alibaba.triver.triver_shop.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ut.share.business.ShareBusinessListener
            public void onFinished(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ff43b50d", new Object[]{this, map});
                }
            }

            @Override // com.ut.share.business.ShareBusinessListener
            public void onShare(ShareContent shareContent2, ShareTargetType shareTargetType) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8a481375", new Object[]{this, shareContent2, shareTargetType});
                }
            }
        });
    }
}
