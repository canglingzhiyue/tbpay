package com.taobao.share.wvapi.servicebrige;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.share.aidl.IShareGenerateShortUrl;
import com.taobao.share.aidl.IShareGenerateShortUrlCallBack;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f19692a;
    private IShareGenerateShortUrlCallBack b = new IShareGenerateShortUrlCallBack.Stub() { // from class: com.taobao.share.wvapi.servicebrige.ShareGenerateShortUrl$2
        @Override // com.taobao.share.aidl.IShareGenerateShortUrlCallBack
        public void callBack(String str) throws RemoteException {
            if (b.this.f19692a != null) {
                b.this.f19692a.result(str);
            }
        }
    };

    /* loaded from: classes8.dex */
    public interface a {
        void result(String str);
    }

    static {
        kge.a(-1441408143);
    }

    public static /* synthetic */ IShareGenerateShortUrlCallBack a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IShareGenerateShortUrlCallBack) ipChange.ipc$dispatch("77c9f319", new Object[]{bVar}) : bVar.b;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [com.taobao.share.wvapi.servicebrige.b$1] */
    public void a(final Context context, final ShareContent shareContent, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec6a680", new Object[]{this, context, shareContent, aVar});
            return;
        }
        this.f19692a = aVar;
        new AsyncTask<Void, Void, IShareGenerateShortUrl>() { // from class: com.taobao.share.wvapi.servicebrige.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.share.aidl.IShareGenerateShortUrl, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ IShareGenerateShortUrl doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            @Override // android.os.AsyncTask
            public /* synthetic */ void onPostExecute(IShareGenerateShortUrl iShareGenerateShortUrl) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b105c779", new Object[]{this, iShareGenerateShortUrl});
                } else {
                    a(iShareGenerateShortUrl);
                }
            }

            public IShareGenerateShortUrl a(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (IShareGenerateShortUrl) ipChange2.ipc$dispatch("edeceb17", new Object[]{this, voidArr});
                }
                try {
                    if (!(context instanceof Activity)) {
                        return null;
                    }
                    return (IShareGenerateShortUrl) Services.get(context, IShareGenerateShortUrl.class);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }

            public void a(IShareGenerateShortUrl iShareGenerateShortUrl) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3258ed3d", new Object[]{this, iShareGenerateShortUrl});
                } else if (iShareGenerateShortUrl == null) {
                } else {
                    try {
                        iShareGenerateShortUrl.generateShorUrl(JSON.toJSONString(b.this.a(shareContent)), b.a(b.this));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }.execute(new Void[0]);
    }

    public Map<String, String> a(ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dbf2a415", new Object[]{this, shareContent});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_BUSINESS_ID, shareContent.businessId);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_BUSINESS_ID, shareContent.businessId);
        if (TextUtils.isEmpty(shareContent.contentType)) {
            shareContent.contentType = shareContent.shareScene;
        }
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_CONTENTTYPE, shareContent.contentType);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_TITLE, shareContent.title);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_DESP, shareContent.description);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_IMAGE_URL, shareContent.imageUrl);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_URL, shareContent.url);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_TEMPLATE_ID, shareContent.templateId);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_WEIXINTYPE, shareContent.weixinMsgType);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_ISACTIVITY, shareContent.isActivity);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_SAVECONTENT, shareContent.needSaveContent);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_WEIXIN_APPID, shareContent.weixinAppId);
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_DISABLE_CLIENT, Boolean.toString(shareContent.disableBackToClient));
        if (shareContent.snapshotImages != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_SNAPSHOT_IMAGES, JSON.toJSONString(shareContent.snapshotImages));
        }
        if (shareContent.headUrl != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_HEAD_URL, shareContent.headUrl);
        }
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_DISABLE_QRCODE, Boolean.toString(shareContent.disableQrcode));
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_DISABLE_TEXTINFO, Boolean.toString(shareContent.disableTextInfo));
        hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_DISABLE_HEAD_IMG, Boolean.toString(shareContent.disableHeadUrl));
        if (shareContent.qrConfig != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_QR_CONFIG, JSON.toJSONString(shareContent.qrConfig));
        }
        if (shareContent.wwMsgType != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_WWMSGTYPE, shareContent.wwMsgType.getValue());
        } else {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_WWMSGTYPE, WWMessageType.WWMessageTypeDefault.getValue());
        }
        if (shareContent.activityParams != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_ACTIVITY_PARAMS, JSON.toJSONString(shareContent.activityParams));
        }
        if (shareContent.templateParams != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_TEMPLATE_PARAMS, JSON.toJSONString(shareContent.templateParams));
        }
        if (shareContent.extendParams == null) {
            shareContent.extendParams = shareContent.extraParams;
        }
        if (shareContent.extendParams != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_PARAMS, JSON.toJSONString(shareContent.extendParams));
        }
        if (shareContent.businessInfo != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_BUSINESS_INFO, JSON.toJSONString(shareContent.businessInfo));
        }
        if (!TextUtils.isEmpty(shareContent.maskAlpha)) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_MASK_ALPHA, shareContent.maskAlpha);
        }
        if (shareContent.popType != ShareContent.TaoPasswordPopType.NONE && !TextUtils.isEmpty(shareContent.popUrl)) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_POPTYPE, shareContent.popType.getName());
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_POPURL, shareContent.popUrl);
        }
        if (shareContent.phoneNumberList != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_PHONE_NUMBER, JSON.toJSONString(shareContent.phoneNumberList));
        }
        if (shareContent.markMap != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_MARK_MAP, JSON.toJSONString(shareContent.markMap));
        }
        if (!TextUtils.isEmpty(shareContent.smsTemplate)) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_SMS_TEMPLATE, shareContent.smsTemplate);
        }
        if (!TextUtils.isEmpty(shareContent.qrTipsText)) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTRA_QR_TIPS_TXT, shareContent.qrTipsText);
        }
        if (shareContent.mediaInfo != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_MEDIAINFO, JSON.toJSONString(shareContent.mediaInfo));
        }
        if (shareContent.mediaPublisher != null) {
            hashMap.put(ShareBusiness.SHARE_INTENT_EXTAR_MEDIAPUBLISHER, JSON.toJSONString(shareContent.mediaPublisher));
        }
        return hashMap;
    }
}
