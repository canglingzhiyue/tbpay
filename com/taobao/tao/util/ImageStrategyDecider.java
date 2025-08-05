package com.taobao.tao.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.image.c;
import com.taobao.tao.image.d;
import com.taobao.tao.util.ImageStrategyExtra;
import com.taobao.tao.util.TaobaoImageUrlStrategy;

/* loaded from: classes8.dex */
public class ImageStrategyDecider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String decideUrl(String str, Integer num, Integer num2, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13c8906c", new Object[]{str, num, num2, obj}) : decideUrl(str, num, num2, obj, true);
    }

    public static String decideUrl(String str, Integer num, Integer num2, Object obj, boolean z) {
        ImageStrategyConfig a2;
        int max;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("887a200", new Object[]{str, num, num2, obj, new Boolean(z)});
        }
        if (obj instanceof ImageStrategyConfig) {
            a2 = (ImageStrategyConfig) obj;
        } else {
            a2 = ImageStrategyConfig.a("default").a();
        }
        if (a2.t() == ImageStrategyConfig.SizeLimitType.WIDTH_LIMIT) {
            max = num.intValue();
        } else if (a2.t() == ImageStrategyConfig.SizeLimitType.HEIGHT_LIMIT) {
            max = num2.intValue();
        } else {
            max = Math.max(num.intValue(), num2.intValue());
        }
        if (max > 0) {
            max = (int) (max / TaobaoImageUrlStrategy.getInstance().getDip());
        }
        if (d.a(d.LEVEL_D)) {
            d.a(d.COMMON_TAG, "ImageStrategyDecider decideUrl, url=%s, width=%d, height=%d, info=%s", str, num, num2, a2.a());
        }
        if (z && c.a() != null && c.a().h()) {
            return TaobaoImageUrlStrategy.getInstance().optDecideUrl(str, max, a2);
        }
        return TaobaoImageUrlStrategy.getInstance().decideUrl(str, max, a2);
    }

    public static String convergeAndHeif(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("648bc91d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] h5HeifWhiteList = TaobaoImageUrlStrategy.getInstance().getH5HeifWhiteList();
        String[] h5HeifSourceWhiteList = TaobaoImageUrlStrategy.getInstance().getH5HeifSourceWhiteList();
        if (h5HeifWhiteList != null) {
            for (String str2 : h5HeifWhiteList) {
                if (str.contains(str2) && str.contains("O1CN")) {
                    return decideUrl(str, -1, -1, ImageStrategyConfig.a("default").h(true).a(), false);
                }
            }
        }
        if (h5HeifSourceWhiteList != null && h5HeifSourceWhiteList.length > 0) {
            for (String str3 : h5HeifSourceWhiteList) {
                if ((str.contains(str3) || TextUtils.equals("*", str3)) && str.contains("O1CN")) {
                    return doStrictConvergeAndHeif(str);
                }
            }
        }
        return justConvergeAndWebP(str);
    }

    public static String justConvergeAndWebP(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76f1e47", new Object[]{str});
        }
        String doStrictConvergeAndWebP = doStrictConvergeAndWebP(str);
        d.a(d.COMMON_TAG, "ImageStrategyDecider justConvergeAndWebP, raw=%s, ret=%s", str, doStrictConvergeAndWebP);
        return doStrictConvergeAndWebP;
    }

    private static String doStrictConvergeAndWebP(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df82268f", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        TaobaoImageUrlStrategy.UriCDNInfo uriCDNInfo = new TaobaoImageUrlStrategy.UriCDNInfo(str);
        if (OssImageUrlStrategy.getInstance().isOssDomain(uriCDNInfo.host)) {
            if (OssImageUrlStrategy.getInstance().isFuzzyExclude(str)) {
                return str;
            }
            ImageStrategyExtra.ImageUrlInfo baseUrlInfo = ImageStrategyExtra.getBaseUrlInfo(str);
            String str2 = baseUrlInfo.base;
            if (TextUtils.isEmpty(str2) || str2.indexOf(64) <= 0) {
                return str;
            }
            if (!".jpg".equals(baseUrlInfo.ext) && !".png".equals(baseUrlInfo.ext)) {
                return str;
            }
            return str2.substring(0, str2.length() - 4) + ".webp" + baseUrlInfo.suffix;
        } else if (!TaobaoImageUrlStrategy.getInstance().isStrictCdnImage(uriCDNInfo)) {
            return str;
        } else {
            if (TaobaoImageUrlStrategy.getInstance().isDomainSwitch()) {
                str = TaobaoImageUrlStrategy.getInstance().strictConvergenceUrl(uriCDNInfo, false);
            }
            ImageStrategyExtra.ImageUrlInfo baseUrlInfo2 = ImageStrategyExtra.getBaseUrlInfo(str);
            String str3 = baseUrlInfo2.base;
            if (TextUtils.isEmpty(str3) || str3.endsWith("_.webp")) {
                return str;
            }
            return str3 + "_.webp" + baseUrlInfo2.suffix;
        }
    }

    private static String doStrictConvergeAndHeif(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5a08971", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        TaobaoImageUrlStrategy.UriCDNInfo uriCDNInfo = new TaobaoImageUrlStrategy.UriCDNInfo(str);
        if (OssImageUrlStrategy.getInstance().isOssDomain(uriCDNInfo.host)) {
            return doStrictConvergeAndWebP(str);
        }
        if (!TaobaoImageUrlStrategy.getInstance().isStrictCdnImage(uriCDNInfo)) {
            return str;
        }
        String heifImageDomain = TaobaoImageUrlStrategy.getInstance().getHeifImageDomain();
        if (TaobaoImageUrlStrategy.getInstance().isDomainSwitch() && !TextUtils.isEmpty(heifImageDomain)) {
            str = TaobaoImageUrlStrategy.getInstance().strictConvergenceUrl(uriCDNInfo, heifImageDomain, false);
        }
        ImageStrategyExtra.ImageUrlInfo baseUrlInfo = ImageStrategyExtra.getBaseUrlInfo(str);
        String str2 = baseUrlInfo.base;
        if (TextUtils.isEmpty(str2) || str2.endsWith("_.heic")) {
            return str;
        }
        if (str2.endsWith("_.webp")) {
            return str2.replace("_.webp", "_.heic");
        }
        return str2 + "_.heic" + baseUrlInfo.suffix;
    }
}
