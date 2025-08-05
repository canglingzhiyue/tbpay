package com.taobao.android.interactive_sdk.share;

import tb.nyk;

/* loaded from: classes5.dex */
public enum ShareTargetType {
    Share2Laiwang("laiwang"),
    Share2SinaWeibo("weibo"),
    Share2Weixin("wxfriend"),
    Share2WeixinTimeline("wxtimeline"),
    Share2Wangxin(nyk.KEY_SHARE_CONFIG_WANGXIN),
    Share2QQ("qq"),
    Share2Qzone("qzone"),
    Share2Momo(nyk.KEY_SHARE_CONFIG_MOMO),
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

    public String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }
}
