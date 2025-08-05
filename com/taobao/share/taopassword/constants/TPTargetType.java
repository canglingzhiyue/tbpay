package com.taobao.share.taopassword.constants;

import tb.nyk;

/* loaded from: classes8.dex */
public enum TPTargetType {
    OTHER("other", 0),
    COPY("copy", 1),
    SINAWEIBO(nyk.KEY_SHARE_CONFIG_SINAWEIBO, 2),
    WEIXIN(nyk.KEY_SHARE_CONFIG_WEIXIN, 3),
    WEIXINPENGYOUQUAN("weixinpengyouquan", 4),
    WANGXIN(nyk.KEY_SHARE_CONFIG_WANGXIN, 5),
    LAIWANGCHAT("laiwangchat", 6),
    ALIPAY("alipay", 6),
    QZONE("qqzone", 7),
    QQFRIEND("qqfriend", 8),
    TAOFRIEND("taofriend", 9),
    MOMO(nyk.KEY_SHARE_CONFIG_MOMO, 10),
    SMS("sms", 11);
    
    private int id;
    private String name;

    TPTargetType(String str, int i) {
        this.name = str;
        this.id = i;
    }

    public int getId() {
        return this.id;
    }

    public String getInfo() {
        return this.name;
    }
}
