package mtopsdk.mtop.intf;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public interface MtopUnitStrategy {
    public static final String CENTER_DAILY_DOMAIN = "acs.waptest.taobao.com";
    public static final String CENTER_ONLINE_DOMAIN = "acs.m.taobao.com";
    public static final String CENTER_PRE_DOMAIN = "acs.wapa.taobao.com";
    public static final String GUIDE_DAILY_DOMAIN = "guide-acs.waptest.taobao.com";
    public static final String GUIDE_ONLINE_DOMAIN = "guide-acs.m.taobao.com";
    public static final String GUIDE_PRE_DOMAIN = "guide-acs.wapa.taobao.com";
    public static final String TRADE_DAILY_DOMAIN = "trade-acs.waptest.taobao.com";
    public static final String TRADE_ONLINE_DOMAIN = "trade-acs.m.taobao.com";
    public static final String TRADE_PRE_DOMAIN = "trade-acs.wapa.taobao.com";
    public static final String UNIT_CENTER = "UNIT_CENTER";
    public static final String UNIT_GUIDE = "UNIT_GUIDE";
    public static final String UNIT_TRADE = "UNIT_TRADE";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface Definition {
    }
}
