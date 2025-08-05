package com.taobao.android.tblive.gift.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class TBLiveGiftEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GIFT_LEVEL_HIGH = 2;
    public static final int GIFT_LEVEL_LOW = 3;
    public long buildPoolTime;
    public String mAnimationImg;
    public String mAnimationMp4;
    public String mComboId;
    public int mComboNum;
    public String mContent;
    public String mContentCenter;
    public String mContentType;
    public boolean mEnableShowSmallGiftView;
    public long mExpireTime;
    public int mGiftCount;
    public int mGiftId;
    public int mGiftLevel;
    public String mGiftName;
    public JSONObject mGiftPlayFinishAction;
    public String mGiftSendScene;
    public String mGiftSourceType;
    public int mGiftType;
    public String mHeadImg;
    public String mIcon;
    public boolean mIsSelfGift;
    public boolean mLastBigGiftPlay;
    public String mLimitRules;
    public String mMasterAnimationMP4;
    public String mMsgId;
    public String mNamingImg;
    public float mPrice;
    public int mSendType;
    public String mSenderNick;
    public long mShowMills;
    public JSONObject originGiftData;

    static {
        kge.a(-1528675056);
        kge.a(1028243835);
    }

    public boolean isDataValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3663cf3", new Object[]{this})).booleanValue() : (this.mGiftId == 0 || TextUtils.isEmpty(this.mSenderNick) || this.mExpireTime == 0 || this.buildPoolTime == 0 || System.currentTimeMillis() - this.buildPoolTime <= this.mExpireTime * 1000) ? false : true;
    }

    public boolean isBigGift() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb915351", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.mAnimationMp4);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TBLiveGiftEntity{mIsSelfGift=" + this.mIsSelfGift + ", mMsgId='" + this.mMsgId + "', mGiftId=" + this.mGiftId + ", mComboId='" + this.mComboId + "', mContent='" + this.mContent + "', mSenderNick='" + this.mSenderNick + "', mGiftType=" + this.mGiftType + ", mIcon='" + this.mIcon + "', mPrice=" + this.mPrice + ", mComboNum=" + this.mComboNum + ", mHeadImg='" + this.mHeadImg + "', mAnimationImg='" + this.mAnimationImg + "', mAnimationMp4='" + this.mAnimationMp4 + "', mGiftName='" + this.mGiftName + "', mGiftCount=" + this.mGiftCount + ", mGiftLevel=" + this.mGiftLevel + ", mGiftSourceType='" + this.mGiftSourceType + "', mShowMills=" + this.mShowMills + ", mEnableShowSmallGiftView=" + this.mEnableShowSmallGiftView + ", mExpireTime=" + this.mExpireTime + ", buildPoolTime=" + this.buildPoolTime + ", originGiftData=" + this.originGiftData + ", mMasterAnimationMP4='" + this.mMasterAnimationMP4 + "', mLimitRules='" + this.mLimitRules + "', mContentCenter='" + this.mContentCenter + "', mContentType='" + this.mContentType + "', mSendType=" + this.mSendType + ", giftSendScene='" + this.mGiftSendScene + "', giftPlayFinishAction=" + this.mGiftPlayFinishAction + ", namingImg='" + this.mNamingImg + "'}";
    }
}
