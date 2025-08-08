package com.taobao.tao.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.c;
import com.taobao.tao.image.d;
import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class ImageStrategyExtra {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static Pattern sCdnRuleRegex = null;
    private static final String sJPEGSuffix = ".jpg_";
    private static final String sPNGSuffix = ".png_";
    private static final String sWebpSuffix = ".webp_";

    /* loaded from: classes8.dex */
    public static class ImageUrlInfo {
        public String base;
        public String cj = "";
        public boolean existCi;
        public boolean existCo;
        public String ext;
        public int height;
        public String quality;
        public String sharpen;
        public String suffix;
        public int width;
    }

    public static ImageUrlInfo getBaseUrlInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageUrlInfo) ipChange.ipc$dispatch("b19ecb21", new Object[]{str});
        }
        ImageUrlInfo imageUrlInfo = new ImageUrlInfo();
        int indexOf = str.indexOf("#");
        if (indexOf > 0) {
            imageUrlInfo.suffix = str.substring(indexOf);
            imageUrlInfo.base = str.substring(0, indexOf);
        } else {
            int indexOf2 = str.indexOf("?");
            if (indexOf2 > 0) {
                imageUrlInfo.suffix = str.substring(indexOf2);
                imageUrlInfo.base = str.substring(0, indexOf2);
            } else {
                imageUrlInfo.suffix = "";
                imageUrlInfo.base = str;
            }
        }
        int lastIndexOf = imageUrlInfo.base.lastIndexOf(46);
        if (lastIndexOf > 0 && lastIndexOf > imageUrlInfo.base.lastIndexOf(47)) {
            imageUrlInfo.ext = imageUrlInfo.base.substring(lastIndexOf);
        }
        return imageUrlInfo;
    }

    public static ImageUrlInfo parseImageUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageUrlInfo) ipChange.ipc$dispatch("4c5a1e52", new Object[]{str}) : parseImageUrl(str, null);
    }

    public static ImageUrlInfo parseImageUrl(String str, ImageUrlInfo imageUrlInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageUrlInfo) ipChange.ipc$dispatch("f73128cc", new Object[]{str, imageUrlInfo});
        }
        if (imageUrlInfo == null) {
            imageUrlInfo = new ImageUrlInfo();
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return null;
        }
        imageUrlInfo.ext = str.substring(lastIndexOf);
        if (c.a() != null && c.a().h()) {
            int indexOf = str.indexOf(46);
            if (str.indexOf(sPNGSuffix, indexOf) <= 0 && str.indexOf(sJPEGSuffix, indexOf) <= 0 && str.indexOf(sWebpSuffix, indexOf) <= 0) {
                return null;
            }
        }
        if (sCdnRuleRegex == null) {
            sCdnRuleRegex = Pattern.compile("_(?:(?:(?:\\.webp)|(?:\\.heic)|(?:\\.avif))|((?:(?:(\\d+)x(\\d+)(xz)?(co0)?(c[xy]\\d+i\\d)?)|([Qq]\\d{2})|(s\\d{2,3})){1,3}(?:\\.jpg)?(?:_(?:(?:\\.webp)|(?:\\.heic)|(?:\\.avif)))?))(?:END_IMAGE_URL)?$");
        }
        Matcher matcher = sCdnRuleRegex.matcher(str);
        int lastIndexOf2 = str.lastIndexOf(47);
        if (lastIndexOf2 < 0) {
            lastIndexOf2 = 0;
        }
        if (!matcher.find(lastIndexOf2) || matcher.groupCount() < 6) {
            return null;
        }
        try {
            String group = matcher.group(2);
            String group2 = matcher.group(3);
            String group3 = matcher.group(4);
            imageUrlInfo.existCo = !StringUtils.isEmpty(matcher.group(5));
            imageUrlInfo.existCi = !StringUtils.isEmpty(matcher.group(6));
            String group4 = matcher.group(7);
            String group5 = matcher.group(8);
            if (!StringUtils.isEmpty(group)) {
                imageUrlInfo.width = Integer.parseInt(group);
            }
            if (!StringUtils.isEmpty(group2)) {
                imageUrlInfo.height = Integer.parseInt(group2);
            }
            if (!StringUtils.isEmpty(group3)) {
                imageUrlInfo.cj = group3;
            }
            if (!StringUtils.isEmpty(group4)) {
                imageUrlInfo.quality = group4;
            }
            if (!StringUtils.isEmpty(group5)) {
                imageUrlInfo.sharpen = group5;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            d.d(d.COMMON_TAG, "ImageStrategyExtra parseImageUrl convert number error:%s", e.getMessage());
        }
        imageUrlInfo.base = matcher.replaceFirst("");
        return imageUrlInfo;
    }

    public static String signutf8(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee85fc1", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return byte2hex(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8"))).toLowerCase();
        } catch (Exception unused) {
            throw new RuntimeException("sign error !");
        }
    }

    private static String byte2hex(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15ba6d01", new Object[]{bArr});
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
                stringBuffer.append(hexString);
            } else {
                stringBuffer.append(hexString);
            }
        }
        return stringBuffer.toString().toUpperCase();
    }
}
