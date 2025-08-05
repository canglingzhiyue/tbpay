package com.ut.share.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.SdkListener;
import com.sina.weibo.sdk.openapi.WBAPIFactory;
import com.taobao.android.nav.Nav;
import com.ut.share.SharePlatform;
import com.ut.share.ShareResponse;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import com.ut.share.utils.DowngradeHelper;
import com.ut.share.utils.FlowOutFacade;
import com.ut.share.utils.ShareUtils;
import java.util.UUID;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareWeiboController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String WEIBO_PKG_NAME = "com.sina.weibo";
    private Context appContext;
    private boolean isWeiboInstalled;
    private IWBAPI mWeiboShareAPI;

    static {
        kge.a(1301310508);
    }

    public ShareWeiboController(Context context, String str, String str2) {
        this.isWeiboInstalled = false;
        this.appContext = context.getApplicationContext();
        if (isWeiboAvailable(this.appContext)) {
            this.isWeiboInstalled = true;
            AuthInfo authInfo = new AuthInfo(this.appContext, str, str2, "");
            this.mWeiboShareAPI = WBAPIFactory.createWBAPI(this.appContext);
            this.mWeiboShareAPI.registerApp(this.appContext, authInfo, new SdkListener() { // from class: com.ut.share.sdk.ShareWeiboController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.sina.weibo.sdk.openapi.SdkListener
                public void onInitFailure(Exception exc) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("6c65f9c4", new Object[]{this, exc});
                    }
                }

                @Override // com.sina.weibo.sdk.openapi.SdkListener
                public void onInitSuccess() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("fb2dd3fb", new Object[]{this});
                    }
                }
            });
            return;
        }
        this.isWeiboInstalled = false;
    }

    public boolean isWeiboAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb3027a", new Object[]{this, context})).booleanValue();
        }
        if (DowngradeHelper.isDowngrade("Sina")) {
            this.isWeiboInstalled = false;
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(WEIBO_PKG_NAME, 0);
            this.isWeiboInstalled = true;
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            this.isWeiboInstalled = false;
            return false;
        }
    }

    public void share(Context context, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532a854a", new Object[]{this, context, shareData, shareListener});
        } else if (!this.isWeiboInstalled) {
        } else {
            if (shareListener != null) {
                ShareResponse shareResponse = new ShareResponse();
                shareResponse.platform = SharePlatform.SinaWeibo;
                shareResponse.errorCode = ShareResponse.ErrorCode.ERR_START;
                shareResponse.data = shareData;
                shareListener.onResponse(shareResponse);
            }
            Intent intentForUri = Nav.from(context).intentForUri("http://m.taobao.com/sinaShare.html");
            intentForUri.putExtra("shareData", shareData);
            intentForUri.addFlags(268435456);
            FlowOutFacade.getInstance().startActivity(context, intentForUri);
        }
    }

    public void realShare(Activity activity, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210bb191", new Object[]{this, activity, shareData});
            return;
        }
        try {
            if (shareData.getType() != ShareData.MessageType.MEDIA && shareData.getType() != ShareData.MessageType.WEBPAGE) {
                if (shareData.getType() == ShareData.MessageType.TEXT) {
                    shareData.setText(concat(shareData.getText(), shareData.getLink()));
                    sendMultiMessage(activity, shareData, true, false, false, false);
                    return;
                } else if (shareData.getType() != ShareData.MessageType.IMAGE) {
                    return;
                } else {
                    sendMultiMessage(activity, shareData, false, true, true, false);
                    return;
                }
            }
            sendMultiMessage(activity, shareData, false, false, false, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public IWBAPI getWeiboShareAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWBAPI) ipChange.ipc$dispatch("e02c722c", new Object[]{this}) : this.mWeiboShareAPI;
    }

    private void sendMultiMessage(Activity activity, ShareData shareData, boolean z, boolean z2, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d27dd9c", new Object[]{this, activity, shareData, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
        } else if (activity == null) {
        } else {
            WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
            if (z) {
                String text = shareData.getText();
                if (!TextUtils.isEmpty(text)) {
                    TextObject textObject = new TextObject();
                    textObject.text = text;
                    weiboMultiMessage.textObject = textObject;
                }
            }
            if (z2 || z4 || z3) {
                ImageObject imageObject = new ImageObject();
                Bitmap imageFromPath = ShareUtils.imageFromPath(shareData.getImagePath());
                if (imageFromPath != null) {
                    imageObject.setImageData(ShareUtils.imageZoom(imageFromPath, 2048.0d));
                } else {
                    TextUtils.isEmpty(shareData.getImageUrl());
                }
                weiboMultiMessage.imageObject = imageObject;
            }
            if ((z4 || z3) && !TextUtils.isEmpty(shareData.getLink())) {
                String text2 = shareData.getText();
                if (!TextUtils.isEmpty(text2)) {
                    TextObject textObject2 = new TextObject();
                    textObject2.text = text2;
                    weiboMultiMessage.textObject = textObject2;
                }
                WebpageObject webpageObject = new WebpageObject();
                webpageObject.identify = UUID.randomUUID().toString();
                webpageObject.title = shareData.getTitle();
                webpageObject.description = shareData.getText();
                Bitmap imageFromPath2 = ShareUtils.imageFromPath(shareData.getImagePath());
                if (imageFromPath2 != null) {
                    webpageObject.thumbData = ShareUtils.bmp2Bytes(ShareUtils.imageZoom(imageFromPath2, 32.0d));
                } else {
                    TextUtils.isEmpty(shareData.getImageUrl());
                }
                webpageObject.actionUrl = shareData.getLink();
                weiboMultiMessage.mediaObject = webpageObject;
            }
            IWBAPI iwbapi = this.mWeiboShareAPI;
            if (iwbapi == null) {
                return;
            }
            iwbapi.shareMessage(activity, weiboMultiMessage, true);
        }
    }

    private String concat(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69280351", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + " " + str2;
    }
}
