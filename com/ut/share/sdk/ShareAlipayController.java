package com.ut.share.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.share.sdk.openapi.APAPIFactory;
import com.alipay.share.sdk.openapi.APImageObject;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.alipay.share.sdk.openapi.APTaobaoGoodsObject;
import com.alipay.share.sdk.openapi.APWebPageObject;
import com.alipay.share.sdk.openapi.IAPAPIEventHandler;
import com.alipay.share.sdk.openapi.IAPApi;
import com.alipay.share.sdk.openapi.SendMessageToZFB;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import com.ut.share.utils.ShareUtils;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareAlipayController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String APPID = "2015061200123391";
    private IAPApi alipayApi;
    private boolean inited = false;

    static {
        kge.a(370689278);
    }

    public boolean init(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("624f99f", new Object[]{this, context, str})).booleanValue();
        }
        if (!this.inited) {
            synchronized (this) {
                if (!this.inited) {
                    try {
                        if (TextUtils.isEmpty(str)) {
                            str = APPID;
                        }
                        this.alipayApi = APAPIFactory.createZFBApi(context, str, false);
                        this.inited = true;
                    } catch (Exception e) {
                        Log.e("ShareAlipayController", "Initial AlipayShare error", e);
                    }
                }
            }
        }
        return this.inited;
    }

    public IAPApi getAlipayApi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAPApi) ipChange.ipc$dispatch("1d539a35", new Object[]{this}) : this.alipayApi;
    }

    public boolean isAppAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a500273", new Object[]{this, context})).booleanValue();
        }
        try {
            String[] split = context.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 0).versionName.split("\\.");
            if (split != null && split.length > 0) {
                try {
                    if (Integer.parseInt(split[0]) >= 9) {
                        return true;
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            Log.e("ShareAlipayController", "get packageInfo failed: " + e3.toString());
        }
        return false;
    }

    public void share(Context context, String str, ShareData shareData, ShareListener shareListener) {
        Bitmap imageFromPath;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb3ec0", new Object[]{this, context, str, shareData, shareListener});
        } else if (!init(context, str)) {
        } else {
            APMediaMessage aPMediaMessage = new APMediaMessage();
            if ("item".equalsIgnoreCase(shareData.getSourceType())) {
                APTaobaoGoodsObject aPTaobaoGoodsObject = new APTaobaoGoodsObject();
                aPTaobaoGoodsObject.webpageUrl = shareData.getLink();
                aPMediaMessage.mediaObject = aPTaobaoGoodsObject;
                aPMediaMessage.title = shareData.getText();
                String imageUrl = shareData.getImageUrl();
                if (TextUtils.isEmpty(imageUrl)) {
                    imageUrl = shareData.getImagePath();
                }
                if (!TextUtils.isEmpty(imageUrl)) {
                    aPMediaMessage.thumbUrl = imageUrl;
                }
                aPMediaMessage.description = shareData.getText();
            } else {
                if (shareData.getType() != ShareData.MessageType.TEXT) {
                    if (shareData.getType() == ShareData.MessageType.IMAGE) {
                        if (!TextUtils.isEmpty(shareData.getImagePath()) && (imageFromPath = ShareUtils.imageFromPath(shareData.getImagePath())) != null) {
                            aPMediaMessage.mediaObject = new APImageObject(ShareUtils.imageZoom(imageFromPath, 2048.0d));
                        }
                    } else {
                        APWebPageObject aPWebPageObject = new APWebPageObject();
                        aPWebPageObject.webpageUrl = shareData.getLink();
                        aPMediaMessage.mediaObject = aPWebPageObject;
                        aPMediaMessage.thumbUrl = shareData.getImageUrl();
                    }
                }
                aPMediaMessage.title = shareData.getTitle();
                aPMediaMessage.description = shareData.getText();
            }
            if (!TextUtils.isEmpty(shareData.getBizType())) {
                aPMediaMessage.bizType = shareData.getBizType();
            }
            SendMessageToZFB.Req req = new SendMessageToZFB.Req();
            req.message = aPMediaMessage;
            req.transaction = buildTransaction("webpage");
            this.alipayApi.sendReq(req);
        }
    }

    private String buildTransaction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81f9289f", new Object[]{this, str});
        }
        if (str == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        return str + System.currentTimeMillis();
    }

    public void handleShareResponse(Intent intent, IAPAPIEventHandler iAPAPIEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730ca898", new Object[]{this, intent, iAPAPIEventHandler});
            return;
        }
        IAPApi iAPApi = this.alipayApi;
        if (iAPApi == null) {
            return;
        }
        try {
            iAPApi.handleIntent(intent, iAPAPIEventHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
