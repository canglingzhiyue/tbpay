package com.ut.share.business;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import tb.nyk;

/* loaded from: classes9.dex */
public enum ShareTargetType {
    Share2TYQ("tyq"),
    Share2HUABAO("huabao"),
    Share2Laiwang("laiwang"),
    Share2SinaWeibo("weibo"),
    Share2Weixin("wxfriend"),
    Share2WeixinTimeline("wxtimeline"),
    Share2Wangxin(nyk.KEY_SHARE_CONFIG_WANGXIN),
    Share2QQ("qq"),
    Share2Qzone("qzone"),
    Share2SMS("sms"),
    Share2Copy("copy"),
    Share2QRCode("qrcode"),
    Share2ScanCode("scancode"),
    Share2Contact("contacts"),
    Share2TaoPassword("taopassword"),
    Share2Alipay("alipay"),
    Share2Screenshots(nyk.KEY_SHARE_CONFIG_SCREENSHOT),
    Share2IShopping("guangjie"),
    Share2IPresent("present"),
    Share2DingTalk("dingtalk"),
    Share2Messenger("Messenger"),
    Share2Line("Line"),
    Share2Telegram("Telegram"),
    Share2WeChat("WeChat"),
    Share2WhatsApp("WhatsApp"),
    Share2Instagram("Instagram"),
    Share2Facebook("Facebook"),
    Share2I18Napp("I18Napp"),
    Share2Other("other");
    
    private String value;

    ShareTargetType(String str) {
        this.value = str;
    }

    public static ShareTargetType getEnum(String str) {
        ShareTargetType[] values;
        for (ShareTargetType shareTargetType : values()) {
            if (shareTargetType.value.equals(str)) {
                return shareTargetType;
            }
        }
        return null;
    }

    public static String getTargetByType(String str) {
        return Share2SinaWeibo.getValue().equals(str) ? "WB" : Share2Wangxin.getValue().equals(str) ? "WX" : Share2Weixin.getValue().equals(str) ? "WEIXIN" : Share2WeixinTimeline.getValue().equals(str) ? "WXFRIEND" : Share2Copy.getValue().equals(str) ? "COPY" : Share2Contact.getValue().equals(str) ? "CONTACTS" : Share2QRCode.getValue().equals(str) ? "QR" : Share2ScanCode.getValue().equals(str) ? "SCAN" : Share2Alipay.getValue().equals(str) ? "ALIPAY" : Share2QQ.getValue().equals(str) ? "QQ" : Share2IPresent.getValue().equals(str) ? "PRESENT" : Share2IShopping.getValue().equals(str) ? "GUANGJIE" : Share2DingTalk.getValue().equals(str) ? RPCDataItems.DT : Share2SMS.getValue().equals(str) ? ModuleConstants.VI_MODULE_NAME_SMS : Share2Messenger.getValue().equals(str) ? "MESSENGER" : Share2Telegram.getValue().equals(str) ? "TELEGRAM" : Share2WeChat.getValue().equals(str) ? "WECHAT" : Share2WhatsApp.getValue().equals(str) ? "WHATSAPP" : Share2Instagram.getValue().equals(str) ? "INSTAGRAM" : Share2Facebook.getValue().equals(str) ? "FACEBOOK" : Share2I18Napp.getValue().equals(str) ? "I18NAPP" : Share2Line.getValue().equals(str) ? "LINE" : !StringUtils.isEmpty(str) ? str : "UNKNOWN";
    }

    public String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }
}
