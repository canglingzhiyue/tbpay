package com.taobao.android.sns4android;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import tb.nyk;

/* loaded from: classes6.dex */
public enum SNSPlatform {
    PLATFORM_GOOGLE("google", "", false),
    PLATFORM_FACEBOOK("facebook", "com.facebook.katana", true),
    PLATFORM_TWITTER("twitter", "com.twitter.android", true),
    PLATFORM_LINKEDIN("linkedin", "com.linkedin.android", true),
    PLATFORM_QQ("qq", "com.tencent.mobileqq", false),
    PLATFORM_WEIXIN(nyk.KEY_SHARE_CONFIG_WEIXIN, "com.tencent.mm", false),
    PLATFORM_WEIBO("weibo", "com.sina.weibo", true),
    PLATFORM_ALIPAY("alipay", "com.eg.android.AlipayGphone", true),
    PLATFORM_ALIPAYHK(MspGlobalDefine.ALIPAYHK_SCHEME, "hk.alipay.wallet", true),
    PLATFORM_LINE("line", "jp.naver.line.android", true),
    PLATFORM_TAOBAO("taobao", "com.taobao.taobao", true),
    PLATFORM_HUAWEI("Huawei", "", false),
    PLATFORM_NETEASE("wangyi_mail", "", true),
    PLATFORM_WC("ctid", "cn.cyberIdentity.certification", false);
    
    private boolean canAuthByH5;
    private String packageName;
    private String platform;

    SNSPlatform(String str, String str2, boolean z) {
        this.platform = str;
        this.packageName = str2;
        this.canAuthByH5 = z;
    }

    public static SNSPlatform convertSNSPlatform(String str) {
        if (StringUtils.equals(str, "qq")) {
            return PLATFORM_QQ;
        }
        if (StringUtils.equals(str, "alipay") || StringUtils.equals(str, "alipay3")) {
            return PLATFORM_ALIPAY;
        }
        if (StringUtils.equals(str, "weibo") || StringUtils.equals(str, "sina")) {
            return PLATFORM_WEIBO;
        }
        if (StringUtils.equals(str, nyk.KEY_SHARE_CONFIG_WEIXIN) || StringUtils.equals(str, "wechat")) {
            return PLATFORM_WEIXIN;
        }
        if (StringUtils.equals(str, "taobao")) {
            return PLATFORM_TAOBAO;
        }
        if (!StringUtils.equals(str, MspGlobalDefine.ALIPAYHK_SCHEME)) {
            return null;
        }
        return PLATFORM_ALIPAYHK;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPlatform() {
        return this.platform;
    }
}
