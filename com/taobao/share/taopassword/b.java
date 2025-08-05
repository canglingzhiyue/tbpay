package com.taobao.share.taopassword;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.taobao.R;
import com.ut.share.ShareApi;
import com.ut.share.SharePlatform;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import tb.acg;
import tb.kge;
import tb.oah;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(889638454);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            new TBShareContentStoreService(str).request();
        }
    }

    public static void a(ShareTargetType shareTargetType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7789eac", new Object[]{shareTargetType});
        } else {
            ShareBusiness.getInstance().targetSelectedNotify(b(), shareTargetType);
        }
    }

    public static void a(Context context, String str, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68604bc2", new Object[]{context, str, shareData, shareListener});
            return;
        }
        SharePlatform b = b(str);
        if (SharePlatform.Other.equals(b)) {
            return;
        }
        ShareApi.getInstance().share(context, b, shareData, shareListener);
    }

    public static SharePlatform b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharePlatform) ipChange.ipc$dispatch("7f357d32", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return SharePlatform.Other;
        }
        if (ShareTargetType.Share2Alipay.getValue().equals(str)) {
            return SharePlatform.Alipay;
        }
        if (ShareTargetType.Share2Copy.getValue().equals(str)) {
            return SharePlatform.Copy;
        }
        if (ShareTargetType.Share2QQ.getValue().equals(str)) {
            return SharePlatform.QQ;
        }
        if (ShareTargetType.Share2Qzone.getValue().equals(str)) {
            return SharePlatform.QZone;
        }
        if (ShareTargetType.Share2Wangxin.getValue().equals(str)) {
            return SharePlatform.Wangxin;
        }
        if (ShareTargetType.Share2Weixin.getValue().equals(str)) {
            return SharePlatform.Weixin;
        }
        if (ShareTargetType.Share2WeixinTimeline.getValue().equals(str)) {
            return SharePlatform.WeixinPengyouquan;
        }
        if (ShareTargetType.Share2SinaWeibo.getValue().equals(str)) {
            return SharePlatform.SinaWeibo;
        }
        if (ShareTargetType.Share2DingTalk.getValue().equals(str)) {
            return SharePlatform.DingTalk;
        }
        if (ShareTargetType.Share2SMS.getValue().equals(str)) {
            return SharePlatform.SMS;
        }
        if (ShareTargetType.Share2Messenger.getValue().equals(str)) {
            return SharePlatform.Messenger;
        }
        if (ShareTargetType.Share2Line.getValue().equals(str)) {
            return SharePlatform.Line;
        }
        if (ShareTargetType.Share2Telegram.getValue().equals(str)) {
            return SharePlatform.Telegram;
        }
        if (ShareTargetType.Share2WeChat.getValue().equals(str)) {
            return SharePlatform.WeChat;
        }
        if (ShareTargetType.Share2WhatsApp.getValue().equals(str)) {
            return SharePlatform.WhatsApp;
        }
        if (ShareTargetType.Share2Instagram.getValue().equals(str)) {
            return SharePlatform.Instagram;
        }
        if (ShareTargetType.Share2Facebook.getValue().equals(str)) {
            return SharePlatform.Facebook;
        }
        return SharePlatform.Other;
    }

    public static ShareTargetType a(SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareTargetType) ipChange.ipc$dispatch("f75680db", new Object[]{sharePlatform});
        }
        switch (sharePlatform) {
            case Copy:
                return ShareTargetType.Share2Copy;
            case SinaWeibo:
                return ShareTargetType.Share2SinaWeibo;
            case Weixin:
                return ShareTargetType.Share2Weixin;
            case WeixinPengyouquan:
                return ShareTargetType.Share2WeixinTimeline;
            case Wangxin:
                return ShareTargetType.Share2Wangxin;
            case LaiwangChat:
                return ShareTargetType.Share2Laiwang;
            case Alipay:
                return ShareTargetType.Share2Alipay;
            case SMS:
                return ShareTargetType.Share2SMS;
            case Messenger:
                return ShareTargetType.Share2Messenger;
            case Facebook:
                return ShareTargetType.Share2Facebook;
            case Line:
                return ShareTargetType.Share2Line;
            case Telegram:
                return ShareTargetType.Share2Telegram;
            case WeChat:
                return ShareTargetType.Share2WeChat;
            case WhatsApp:
                return ShareTargetType.Share2WhatsApp;
            case Instagram:
                return ShareTargetType.Share2Instagram;
            default:
                return ShareTargetType.Share2Other;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        ShareBusiness.getInstance().cacheLastShareContent(acg.a().getApplicationContext(), b());
    }

    private static ShareContent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("dd727885", new Object[0]);
        }
        TBShareContent j = e.b().j();
        if (j == null) {
            return null;
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = j.businessId;
        shareContent.shareId = j.shareId;
        shareContent.suId = j.suId;
        shareContent.isActivity = j.isActivity;
        shareContent.needSaveContent = j.needSaveContent;
        shareContent.weixinAppId = j.weixinAppId;
        shareContent.weixinMsgType = j.weixinMsgType;
        shareContent.shareScene = j.shareScene;
        shareContent.title = j.title;
        shareContent.description = j.description;
        shareContent.imageUrl = j.imageUrl;
        shareContent.url = j.url;
        shareContent.imageSoure = j.imageSoure;
        shareContent.wwMsgType = j.wwMsgType;
        shareContent.activityParams = j.activityParams;
        shareContent.extraParams = j.extraParams;
        return shareContent;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("http");
        if (indexOf < 0) {
            return str;
        }
        String substring = indexOf < 0 ? str : str.substring(0, indexOf);
        if (indexOf >= 0) {
            str2 = str.substring(indexOf);
        }
        String a2 = oah.a().a(str2);
        return substring + a2 + " " + com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18108);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || str.indexOf("http") < 0) {
            return str;
        }
        int indexOf = str.indexOf("http");
        String substring = str.substring(0, indexOf);
        String a2 = oah.a().a(str.substring(indexOf));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(substring);
        stringBuffer.append(a2);
        return stringBuffer.toString();
    }
}
