package com.ali.user.open.core;

import mtopsdk.common.util.StringUtils;
import com.ali.user.open.core.config.ConfigManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class Site {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY = "alipay";
    public static final String ALIYUN_YUNPAN = "yunpan";
    public static final String AMAP = "gaode";
    public static final String CAINIAO = "cainiao";
    public static final String CAINIAO2C = "cainiao2c";
    public static final String DAMAI = "damai";
    public static final String DING = "dingding";
    public static final String ELEME = "eleme";
    public static final String ICBU = "icbu";
    public static final String JIUYOU = "jiuyou";
    public static final String KAOLA = "kaola";
    public static final String LAIFENG = "lai_feng";
    public static final String MIFENG = "mifeng";
    public static final String NETEASE = "netease";
    public static final String QQ = "qq";
    public static final String QURAK = "qurak";
    public static final String QU_TOUTIAO = "qu_toutiao";
    public static final String STARBUCKS = "starbucks";
    public static final String TAOBAO = "taobao";
    public static final String UC = "uc";
    public static final String WECHAT = "wechat";
    public static final String WEIBO = "weibo";
    public static final String WENYU_GAME = "wenyu_game";
    public static final String XIAMI = "xiami";
    public static final String XIANYU = "xianyu";
    public static final String YABO = "yabo";
    public static final String YOUKU = "youku";

    /* loaded from: classes2.dex */
    public @interface SiteName {
    }

    static {
        kge.a(-389316457);
    }

    public static boolean isHavanaSite(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a82e75d", new Object[]{str})).booleanValue() : StringUtils.equals(str, "taobao") || StringUtils.equals(str, ICBU) || StringUtils.equals(str, DAMAI) || StringUtils.equals(str, YABO) || StringUtils.equals(str, YOUKU) || StringUtils.equals(str, ALIYUN_YUNPAN) || StringUtils.equals(str, CAINIAO) || StringUtils.equals(str, CAINIAO2C);
    }

    public static int getHavanaSite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("510b978", new Object[]{str})).intValue();
        }
        if (StringUtils.equals(str, "taobao")) {
            return 0;
        }
        if (StringUtils.equals(str, ICBU)) {
            return 4;
        }
        if (StringUtils.equals(str, DAMAI)) {
            return 18;
        }
        if (StringUtils.equals(str, CAINIAO)) {
            return 21;
        }
        if (StringUtils.equals(str, "eleme")) {
            return 25;
        }
        if (StringUtils.equals(str, YABO)) {
            return 28;
        }
        if (StringUtils.equals(str, KAOLA)) {
            return 39;
        }
        if (StringUtils.equals(str, ALIYUN_YUNPAN)) {
            return 52;
        }
        if (StringUtils.equals(str, "xianyu")) {
            return 77;
        }
        return StringUtils.equals(str, CAINIAO2C) ? 78 : 0;
    }

    public static String getMtopInstanceTag(String str) {
        if (ConfigManager.getInstance().useNewMtopInstanceId) {
            try {
                return (String) Class.forName("mtopsdk.mtop.intf.MtopAccountSiteUtils").getMethod("getInstanceId", String.class).invoke(null, str);
            } catch (Throwable unused) {
                return "";
            }
        }
        return "havana-instance-" + str;
    }
}
