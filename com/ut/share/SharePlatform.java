package com.ut.share;

import com.alipay.mobile.verifyidentity.common.ModuleConstants;

/* loaded from: classes9.dex */
public enum SharePlatform {
    LaiwangChat("LaiwangChat"),
    LaiwangShare("LaiwangShare"),
    SinaWeibo("SinaWeibo"),
    Weixin("WeChatSDK_Chat"),
    WeixinPengyouquan("WeChatSDK_Quan"),
    Wangxin("Wangxin"),
    QQ("QQ"),
    QZone("QZone"),
    SMS(ModuleConstants.VI_MODULE_NAME_SMS),
    Copy("Copy"),
    Alipay("Alipay"),
    DingTalk("DingTalk"),
    Messenger("Messenger"),
    Line("Line"),
    Telegram("Telegram"),
    WeChat("WeChat"),
    WhatsApp("WhatsApp"),
    Instagram("Instagram"),
    Facebook("Facebook"),
    Other("Other");
    
    private String value;

    SharePlatform(String str) {
        this.value = str;
    }

    public static SharePlatform getEnum(String str) {
        SharePlatform[] values;
        for (SharePlatform sharePlatform : values()) {
            if (sharePlatform.value.equals(str)) {
                return sharePlatform;
            }
        }
        return null;
    }

    public String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }
}
