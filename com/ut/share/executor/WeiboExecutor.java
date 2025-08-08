package com.ut.share.executor;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.ut.share.SharePlatform;
import com.ut.share.ShareResponse;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import com.ut.share.sdk.ShareWeiboController;
import com.ut.share.utils.Constants;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class WeiboExecutor implements IShareExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String APP_KEY;
    public static String REDIRECT_URL;
    private ShareWeiboController weibo;

    static {
        kge.a(1784462993);
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

    public ShareWeiboController getWeibo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareWeiboController) ipChange.ipc$dispatch("18a24cfe", new Object[]{this}) : this.weibo;
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void register(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca24689b", new Object[]{this, map});
            return;
        }
        APP_KEY = map.get("appKey");
        REDIRECT_URL = map.get(Constants.WEIBO_REDIRECTURL_KEY);
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void share(Context context, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532a854a", new Object[]{this, context, shareData, shareListener});
        } else if (!StringUtils.isEmpty(APP_KEY)) {
            if (this.weibo == null) {
                this.weibo = new ShareWeiboController(context, APP_KEY, REDIRECT_URL);
            }
            this.weibo.share(context, shareData, shareListener);
        } else if (shareListener == null) {
        } else {
            ShareResponse shareResponse = new ShareResponse();
            shareResponse.platform = SharePlatform.SinaWeibo;
            shareResponse.errorCode = ShareResponse.ErrorCode.ERR_FAIL;
            shareResponse.data = shareData;
            shareResponse.errorMessage = b.a(R.string.taobao_app_1010_1_18105);
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

    @Override // com.ut.share.executor.IShareExecutor
    public boolean isAppAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a500273", new Object[]{this, context})).booleanValue();
        }
        if (this.weibo == null) {
            this.weibo = new ShareWeiboController(context, APP_KEY, REDIRECT_URL);
        }
        ShareWeiboController shareWeiboController = this.weibo;
        if (shareWeiboController == null) {
            return false;
        }
        return shareWeiboController.isWeiboAvailable(context);
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean isAppAvailable(Context context, SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("186c2822", new Object[]{this, context, sharePlatform})).booleanValue() : isAppAvailable(context);
    }
}
