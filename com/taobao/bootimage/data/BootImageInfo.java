package com.taobao.bootimage.data;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.taobao.bootimage.arch.flow.view.SkipStyle;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class BootImageInfo implements IMTOPDataObject {
    public static final String BIZ_TYPE_COLD_START_AD = "coldStartAd";
    public static final String BIZ_TYPE_COMMERCIAL_IMAGE_AD = "commercialAdNormal";
    public static final String BIZ_TYPE_COMMERCIAL_VIDEO_AD = "commercialAdVideo";
    public static final String BIZ_TYPE_IMAGE = "image";
    public static final String BIZ_TYPE_POPLAYER = "poplayer";
    public static final String BIZ_TYPE_VIDEO = "videoNoIcon";
    public static final String BIZ_TYPE_VIDEO_ICON = "videoHaveIcon";
    public static final String CHANNEL_TYPE_BRAND = "brand";
    public static final String CHANNEL_TYPE_NORMAL = "normal";
    public static final String COMMERCIAL_ANIMATION_TYPE_BIGPOP = "1";
    public static final String COMMERCIAL_INTERACT_TYPE_ADD_CART = "1";
    public static final String COMMERCIAL_INTERACT_TYPE_COUPON = "2";
    public static final String COMMERCIAL_INTERACT_TYPE_NONE = "0";
    public static final int COMMERCIAL_SOURCE_IMAGE = 202;
    public static final int COMMERCIAL_SOURCE_VIDEO = 201;
    public String LinkedTraceId;
    public String actionResponse;
    public String actionResult;
    public String actionText;
    public String advColor;
    public String advName;
    public long alphaAnimationDuration;
    public boolean animation;
    public String animationLottie;
    public String animationType;
    public String benefitAmountCents;
    public String benefitId;
    public String benefitImageUrl;
    public String benefitQuerySource;
    public String benefitSafeCode;
    public String benefitSource;
    public String benefitStrategyCode;
    public String benefitSupplier;
    public String benefitThreshold;
    public String benefitTitle;
    public String benefitType;
    public String bizType;
    public String blackList;
    public String cardDesc;
    public String cardImageUrl;
    public String cardItemId;
    public String cardSkuId;
    public String cardTitle;
    public String closeTxt;
    public String contentId;
    public boolean enable4G;
    public JSONObject exposureParam;
    public String firstFrameImageUrl;
    public String from;
    public String gestureImage;
    public String gestureSwitch;
    public long gmtEndMs;
    public long gmtStartMs;
    public boolean hideTBLogo;
    public String imgUrl;
    public String interactImage;
    public boolean isColdStart;
    public boolean isDxTemplate;
    public String itemId;
    public String linkedType;
    public int periodSeconds;
    public long removeBGDelayMs;
    public long scaleAnimationDuration;
    public String sceneType;
    public SkipStyle skipStyle;
    public String targetUrl;
    public int times;
    public String videoLocalPath;
    public String videoMd5;
    public String videoUrl;
    public int waitTime;
    public int waitTimeOffsetSeconds;
    public String whiteList;
    public boolean coldStart = true;
    public boolean hotStart = true;
    public boolean hasPreLoad = true;
    public boolean needPackageApp = true;
    public boolean haveVoice = false;

    /* loaded from: classes6.dex */
    public enum FromType {
        UNSUPPORT,
        NORMAL,
        BRAND,
        COMMERCIALAD
    }

    static {
        kge.a(843521515);
        kge.a(-350052935);
    }

    public FromType getFromType() {
        if (TextUtils.equals(this.from, "brand")) {
            return FromType.BRAND;
        }
        if (TextUtils.equals(this.from, "market")) {
            return FromType.NORMAL;
        }
        if (TextUtils.equals(this.from, "commercialAd")) {
            return FromType.COMMERCIALAD;
        }
        if (TextUtils.isEmpty(this.from)) {
            return FromType.NORMAL;
        }
        return FromType.UNSUPPORT;
    }

    public boolean isGestureViewHide() {
        return "1".equals(this.gestureSwitch);
    }

    public String toString() {
        return "BootImageInfo{itemId='" + this.itemId + "', bizType='" + this.bizType + "', times=" + this.times + ", gmtStartMs=" + this.gmtStartMs + ", gmtEndMs=" + this.gmtEndMs + ", periodSeconds=" + this.periodSeconds + ", waitTime=" + this.waitTime + ", waitTimeOffsetSeconds=" + this.waitTimeOffsetSeconds + ", coldStart=" + this.coldStart + ", hotStart=" + this.hotStart + ", whiteList='" + this.whiteList + "', blackList='" + this.blackList + "', animation=" + this.animation + ", hasPreLoad=" + this.hasPreLoad + ", enable4G=" + this.enable4G + ", targetUrl='" + this.targetUrl + "', imgUrl='" + this.imgUrl + "', hideTBLogo=" + this.hideTBLogo + ", removeBGDelayMs=" + this.removeBGDelayMs + ", needPackageApp=" + this.needPackageApp + ", haveVoice=" + this.haveVoice + ", videoUrl='" + this.videoUrl + "', videoMd5='" + this.videoMd5 + "', videoLocalPath='" + this.videoLocalPath + "', from='" + this.from + "', contentId='" + this.contentId + "', actionResponse='" + this.actionResponse + "', actionText='" + this.actionText + "', cardItemId='" + this.cardItemId + "', cardSkuId='" + this.cardSkuId + "', cardImageUrl='" + this.cardImageUrl + "', cardTitle='" + this.cardTitle + "', cardDesc='" + this.cardDesc + "', benefitType='" + this.benefitType + "', benefitImageUrl='" + this.benefitImageUrl + "', benefitTitle='" + this.benefitTitle + "', benefitAmountCents='" + this.benefitAmountCents + "', benefitThreshold='" + this.benefitThreshold + "', benefitSupplier='" + this.benefitSupplier + "', benefitId='" + this.benefitId + "', benefitQuerySource='" + this.benefitQuerySource + "', benefitSource='" + this.benefitSource + "', advColor='" + this.advColor + "', advName='" + this.advName + "', animationType='" + this.animationType + "', animationLottie='" + this.animationLottie + "', closeTxt='" + this.closeTxt + "'}";
    }
}
