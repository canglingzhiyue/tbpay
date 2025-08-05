package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.util.Arrays;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes5.dex */
public class bl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1522937642);
    }

    public static MtopInfo a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopInfo) ipChange.ipc$dispatch("c927ce68", new Object[]{context});
        }
        try {
            final byte[] a2 = IOUtils.a(AssetsDelegate.proxy_open(context.getAssets(), "tbLive_video_tinyShop.json"));
            if (a2 == null || a2.length <= 0) {
                return null;
            }
            MtopInfo mtopInfo = new MtopInfo();
            mtopInfo.a(Arrays.asList(a2));
            mtopInfo.a(2);
            mtopInfo.a(new MtopResponse() { // from class: com.taobao.android.detail.ttdetail.utils.MockUtils$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    setBytedata(a2);
                }
            });
            return mtopInfo;
        } catch (Throwable th) {
            i.a("MockUtils", "mockTBLiveTinyShopDetail error", th);
            return null;
        }
    }
}
