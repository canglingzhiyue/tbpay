package com.ut.share.executor;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.ut.share.SharePlatform;
import com.ut.share.ShareResponse;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import com.ut.share.sdk.ShareAlipayController;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class AlipayExecutor implements IShareExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String APP_ID;
    private ShareAlipayController alipay = new ShareAlipayController();

    static {
        kge.a(567023431);
        kge.a(-933332493);
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean supportImageShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e67c8f7e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public ShareAlipayController getAlipay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareAlipayController) ipChange.ipc$dispatch("51709ea0", new Object[]{this}) : this.alipay;
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void register(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca24689b", new Object[]{this, map});
        } else {
            APP_ID = map.get("appId");
        }
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean isAppAvailable(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a500273", new Object[]{this, context})).booleanValue() : this.alipay.isAppAvailable(context);
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean isAppAvailable(Context context, SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("186c2822", new Object[]{this, context, sharePlatform})).booleanValue() : isAppAvailable(context);
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void share(Context context, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532a854a", new Object[]{this, context, shareData, shareListener});
        } else if (!TextUtils.isEmpty(APP_ID)) {
            this.alipay.share(context, APP_ID, shareData, shareListener);
        } else if (shareListener == null) {
        } else {
            ShareResponse shareResponse = new ShareResponse();
            shareResponse.platform = SharePlatform.Alipay;
            shareResponse.errorCode = ShareResponse.ErrorCode.ERR_FAIL;
            shareResponse.data = shareData;
            shareResponse.errorMessage = b.a(R.string.taobao_app_1010_1_18106);
            shareListener.onResponse(shareResponse);
        }
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void share(Context context, SharePlatform sharePlatform, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8b03b", new Object[]{this, context, sharePlatform, shareData, shareListener});
        } else {
            share(context, shareData, shareListener);
        }
    }
}
