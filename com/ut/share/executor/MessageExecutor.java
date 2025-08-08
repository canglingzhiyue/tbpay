package com.ut.share.executor;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.SharePlatform;
import com.ut.share.ShareResponse;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import com.ut.share.utils.FlowOutFacade;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class MessageExecutor implements IShareExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(573402416);
        kge.a(-933332493);
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean isAppAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a500273", new Object[]{this, context})).booleanValue();
        }
        return true;
    }

    @Override // com.ut.share.executor.IShareExecutor
    public void register(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca24689b", new Object[]{this, map});
        }
    }

    @Override // com.ut.share.executor.IShareExecutor
    public boolean supportImageShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e67c8f7e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    private boolean shareSMSKitKat(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3603b537", new Object[]{this, context, str, str2})).booleanValue();
        }
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
            intent.putExtra("sms_body", str2);
            intent.addFlags(268435456);
            FlowOutFacade.getInstance().startActivity(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
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
            return;
        }
        if ((context == null || shareData == null || (StringUtils.isEmpty(shareData.getText()) && StringUtils.isEmpty(shareData.getLink()))) && shareListener != null) {
            ShareResponse shareResponse = new ShareResponse();
            shareResponse.platform = SharePlatform.SMS;
            shareResponse.errorCode = ShareResponse.ErrorCode.ERR_FAIL;
            shareListener.onResponse(shareResponse);
        }
        String str = "";
        String text = !StringUtils.isEmpty(shareData.getText()) ? shareData.getText() : str;
        if (!StringUtils.isEmpty(shareData.getLink())) {
            if (StringUtils.isEmpty(text)) {
                text = shareData.getLink();
            } else {
                text = text.concat(" ").concat(shareData.getLink());
            }
        }
        shareData.setText(text);
        if (shareData.getUserInfo() != null) {
            str = shareData.getUserInfo().get("phoneNumbers");
        }
        if (shareListener != null) {
            ShareResponse shareResponse2 = new ShareResponse();
            shareResponse2.platform = SharePlatform.SMS;
            shareResponse2.errorCode = ShareResponse.ErrorCode.ERR_START;
            shareResponse2.data = shareData;
            shareListener.onResponse(shareResponse2);
        }
        shareSMSKitKat(context, str, text);
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
