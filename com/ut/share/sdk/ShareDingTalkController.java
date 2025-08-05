package com.ut.share.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.DDShareApiV2;
import com.android.dingtalk.share.ddsharemodule.IDDAPIEventHandler;
import com.android.dingtalk.share.ddsharemodule.IDDShareApi;
import com.android.dingtalk.share.ddsharemodule.message.DDImageMessage;
import com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage;
import com.android.dingtalk.share.ddsharemodule.message.DDTextMessage;
import com.android.dingtalk.share.ddsharemodule.message.DDWebpageMessage;
import com.android.dingtalk.share.ddsharemodule.message.SendMessageToDD;
import com.ut.share.SharePlatform;
import com.ut.share.ShareResponse;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import com.ut.share.utils.ShareUtils;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareDingTalkController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String appId;
    private WeakReference<Context> weakContext;

    static {
        kge.a(620970878);
    }

    public ShareDingTalkController(Context context, String str) {
        this.weakContext = new WeakReference<>(context);
        this.appId = str;
    }

    public boolean isDDAppAvaliable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25944f59", new Object[]{this, context})).booleanValue();
        }
        IDDShareApi iDDShareApi = getIDDShareApi(context);
        return iDDShareApi != null && iDDShareApi.isDDAppInstalled(context) && iDDShareApi.isDDSupportAPI(context);
    }

    private IDDShareApi getIDDShareApi(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDDShareApi) ipChange.ipc$dispatch("c2e5f6b9", new Object[]{this, context});
        }
        if (this.appId == null) {
            return null;
        }
        if (context instanceof Activity) {
            this.weakContext = new WeakReference<>(context);
        }
        Context context2 = this.weakContext.get();
        if (context2 != null) {
            context = context2;
        }
        return new DDShareApiV2(context, this.appId, false);
    }

    public void share(Context context, ShareData shareData, ShareListener shareListener) {
        DDImageMessage dDImageMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532a854a", new Object[]{this, context, shareData, shareListener});
        } else if (context == null || shareData == null) {
            if (shareListener == null) {
                return;
            }
            ShareResponse shareResponse = new ShareResponse();
            shareResponse.platform = SharePlatform.DingTalk;
            shareResponse.errorCode = ShareResponse.ErrorCode.ERR_FAIL;
            shareListener.onResponse(shareResponse);
        } else {
            if (shareListener != null) {
                ShareResponse shareResponse2 = new ShareResponse();
                shareResponse2.platform = SharePlatform.DingTalk;
                shareResponse2.errorCode = ShareResponse.ErrorCode.ERR_START;
                shareResponse2.data = shareData;
                shareListener.onResponse(shareResponse2);
            }
            SendMessageToDD.Req req = new SendMessageToDD.Req();
            DDMediaMessage dDMediaMessage = new DDMediaMessage();
            dDMediaMessage.mTitle = shareData.getTitle();
            dDMediaMessage.mContent = shareData.getText();
            dDMediaMessage.setThumbImage(ShareUtils.thumbnailImageFromPath(shareData.getImagePath()));
            dDMediaMessage.mThumbUrl = shareData.getImageUrl();
            dDMediaMessage.mUrl = shareData.getLink();
            if (!TextUtils.isEmpty(shareData.getLink())) {
                DDWebpageMessage dDWebpageMessage = new DDWebpageMessage();
                dDWebpageMessage.mUrl = shareData.getLink();
                dDMediaMessage.mMediaObject = dDWebpageMessage;
            } else if (!TextUtils.isEmpty(shareData.getImageUrl()) || !TextUtils.isEmpty(shareData.getImagePath())) {
                if (!TextUtils.isEmpty(shareData.getImagePath())) {
                    Bitmap imageFromPath = ShareUtils.imageFromPath(shareData.getImagePath());
                    if (imageFromPath != null) {
                        imageFromPath = ShareUtils.imageZoom(imageFromPath, 2048.0d);
                    }
                    dDImageMessage = new DDImageMessage(imageFromPath);
                } else {
                    dDImageMessage = new DDImageMessage();
                    dDImageMessage.mImageUrl = shareData.getImagePath();
                }
                dDMediaMessage.mMediaObject = dDImageMessage;
            } else {
                DDTextMessage dDTextMessage = new DDTextMessage();
                dDTextMessage.mText = shareData.getText();
                dDMediaMessage.mMediaObject = dDTextMessage;
            }
            req.mMediaMessage = dDMediaMessage;
            IDDShareApi iDDShareApi = getIDDShareApi(context);
            if (iDDShareApi == null || iDDShareApi.sendReq(req) || shareListener == null) {
                return;
            }
            ShareResponse shareResponse3 = new ShareResponse();
            shareResponse3.platform = SharePlatform.DingTalk;
            shareResponse3.errorCode = ShareResponse.ErrorCode.ERR_FAIL;
            shareListener.onResponse(shareResponse3);
        }
    }

    public void handleShareResponse(Context context, Intent intent, IDDAPIEventHandler iDDAPIEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a9b69cf", new Object[]{this, context, intent, iDDAPIEventHandler});
            return;
        }
        IDDShareApi iDDShareApi = getIDDShareApi(context);
        if (iDDShareApi == null) {
            return;
        }
        try {
            iDDShareApi.handleIntent(intent, iDDAPIEventHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
