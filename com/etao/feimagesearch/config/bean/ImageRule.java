package com.etao.feimagesearch.config.bean;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class ImageRule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int BASE_QUALITY = 0;
    public static final int DEFAULT_MAX_SIZE = 640;
    public static final int DEFAULT_MIN_SIZE = 200;
    public static String NET_TYPE_2G;
    public static String NET_TYPE_3G;
    public static String NET_TYPE_4G;
    public static String NET_TYPE_OTHER;
    public static String NET_TYPE_WIFI;
    public static int QUALITY_2G;
    public static int QUALITY_3G;
    public static int QUALITY_4G;
    public static int QUALITY_OTHER;
    public static int QUALITY_WIFI;
    public static final Map<String, Integer> qualityMap;
    public int maxSize;
    public int minSize;
    public int quality;

    static {
        kge.a(-1334713514);
        kge.a(1028243835);
        BASE_QUALITY = 70;
        QUALITY_WIFI = 90;
        QUALITY_4G = 90;
        QUALITY_3G = 50;
        QUALITY_2G = 30;
        QUALITY_OTHER = 30;
        NET_TYPE_WIFI = "wifi";
        NET_TYPE_4G = "4g";
        NET_TYPE_3G = "3g";
        NET_TYPE_2G = "2g";
        NET_TYPE_OTHER = "other";
        HashMap hashMap = new HashMap();
        qualityMap = hashMap;
        hashMap.put(NET_TYPE_WIFI, Integer.valueOf(QUALITY_WIFI));
        qualityMap.put(NET_TYPE_4G, Integer.valueOf(QUALITY_4G));
        qualityMap.put(NET_TYPE_3G, Integer.valueOf(QUALITY_3G));
        qualityMap.put(NET_TYPE_2G, Integer.valueOf(QUALITY_2G));
        qualityMap.put(NET_TYPE_OTHER, Integer.valueOf(QUALITY_OTHER));
    }

    public int getQuality(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b858a8d", new Object[]{this, str})).intValue();
        }
        Integer num = qualityMap.get(str);
        return num == null ? BASE_QUALITY : num.intValue();
    }

    public ImageRule() {
        this.quality = QUALITY_3G;
        this.minSize = 200;
        this.maxSize = 640;
    }

    public ImageRule(String str) {
        this.quality = QUALITY_3G;
        this.minSize = 200;
        this.maxSize = 640;
        this.quality = getQuality(str);
    }

    public ImageRule(String str, String str2) {
        this.quality = QUALITY_3G;
        this.minSize = 200;
        this.maxSize = 640;
        qualityMap.get(str);
        this.quality = getQuality(str);
        if (!StringUtils.isEmpty(str2)) {
            String[] split = str2.split(",");
            if (split.length != 3) {
                return;
            }
            try {
                this.quality = NumberFormat.getInstance().parse(split[0]).intValue();
                this.quality = BASE_QUALITY;
                this.minSize = NumberFormat.getInstance().parse(split[1]).intValue();
                this.maxSize = NumberFormat.getInstance().parse(split[2]).intValue();
            } catch (Exception unused) {
            }
        }
    }

    public ImageRule(String str, int i, int i2, int i3) {
        this.quality = QUALITY_3G;
        this.minSize = 200;
        this.maxSize = 640;
        this.quality = i;
        this.minSize = i2;
        this.maxSize = i3;
    }
}
