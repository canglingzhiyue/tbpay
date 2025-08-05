package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.android.nav.Nav;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.favor.FavorLayout;
import com.taobao.taolive.uikit.mtop.GoodItem;
import com.taobao.taolive.uikit.mtop.HpBannerFrontData;
import com.taobao.taolive.uikit.mtop.LiveInfoItem;
import com.taobao.taolive.uikit.mtop.QualitySelectItem;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.view.TRelativeLayout;
import java.util.ArrayList;
import tb.kge;
import tb.pqx;
import tb.prb;
import tb.prc;
import tb.prd;
import tb.pre;
import tb.prk;
import tb.prn;
import tb.pro;
import tb.prr;
import tb.prx;

/* loaded from: classes8.dex */
public class TaoliveHomeBigCardView extends TRelativeLayout implements prx.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ROOM_STATUS_END = 2;
    public static final int ROOM_STATUS_LIVE = 1;
    public static final int ROOM_STATUS_NOTSTART = 0;
    private TUrlImageView mAvatar;
    private View mBottomLayout;
    private com.taobao.taolive.uikit.view.a mBubbleFrame;
    public a mCardVideoEventListener;
    private boolean mClickNavEnable;
    private Context mContext;
    private TUrlImageView mCoverImg;
    public String mCurCardType;
    private String mCurPicJumpUrl;
    private TUrlImageView mCustomLogo;
    private LinearLayout mFavorBlock;
    private String mFavorImgUrl;
    private FavorLayout mFavorLayout;
    private TextView mFavorNum;
    private boolean mIsHide;
    private LiveInfoItem mItem;
    private pqx mListener;
    private ImageView mLiveLogo;
    private TIconFontTextView mLocNameView;
    private MediaLiveInfo mMediaLiveInfo;
    private TextView mNick;
    private boolean mPointBuryEnable;
    private ImageView mPreliveLogo;
    private TextView mPreliveStartTime;
    private Rect mRect;
    private ImageView mReplayLogo;
    private TextView mReplayWatchNum;
    private String mScm;
    private TaoliveBigcardTopView mShopTopView;
    private boolean mShouldShowVideo;
    private String mSpm;
    private TextView mTitle;
    private TextView mWatchNum;

    /* loaded from: classes8.dex */
    public interface a {
    }

    static {
        kge.a(-2082384367);
        kge.a(1882372898);
    }

    public static /* synthetic */ Object ipc$super(TaoliveHomeBigCardView taoliveHomeBigCardView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public static /* synthetic */ FavorLayout access$000(TaoliveHomeBigCardView taoliveHomeBigCardView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FavorLayout) ipChange.ipc$dispatch("7352feba", new Object[]{taoliveHomeBigCardView}) : taoliveHomeBigCardView.mFavorLayout;
    }

    public static /* synthetic */ Context access$100(TaoliveHomeBigCardView taoliveHomeBigCardView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("109c1d6e", new Object[]{taoliveHomeBigCardView}) : taoliveHomeBigCardView.mContext;
    }

    public static /* synthetic */ TUrlImageView access$200(TaoliveHomeBigCardView taoliveHomeBigCardView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("658fd5a5", new Object[]{taoliveHomeBigCardView}) : taoliveHomeBigCardView.mCoverImg;
    }

    public static /* synthetic */ pqx access$300(TaoliveHomeBigCardView taoliveHomeBigCardView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pqx) ipChange.ipc$dispatch("20df5e57", new Object[]{taoliveHomeBigCardView}) : taoliveHomeBigCardView.mListener;
    }

    public static /* synthetic */ boolean access$400(TaoliveHomeBigCardView taoliveHomeBigCardView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c26d21fd", new Object[]{taoliveHomeBigCardView})).booleanValue() : taoliveHomeBigCardView.mPointBuryEnable;
    }

    public static /* synthetic */ String access$500(TaoliveHomeBigCardView taoliveHomeBigCardView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("27793566", new Object[]{taoliveHomeBigCardView}) : taoliveHomeBigCardView.mScm;
    }

    public static /* synthetic */ String access$600(TaoliveHomeBigCardView taoliveHomeBigCardView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("407a8705", new Object[]{taoliveHomeBigCardView}) : taoliveHomeBigCardView.mSpm;
    }

    public void setPointBuryListener(pqx pqxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8165461c", new Object[]{this, pqxVar});
        } else {
            this.mListener = pqxVar;
        }
    }

    public void handleGoodBubble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9dbbf8", new Object[]{this});
            return;
        }
        int height = getHeight();
        getLocalVisibleRect(this.mRect);
        float height2 = this.mRect.height() / height;
        if (!shouldShowBubble()) {
            return;
        }
        if (height2 < 0.5f && !this.mIsHide) {
            hideGoodBubble();
            this.mIsHide = true;
        } else if (height2 <= 0.85f || !this.mIsHide) {
        } else {
            showGoodBubble();
            this.mIsHide = false;
        }
    }

    private void addVideoView(prx prxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56aee520", new Object[]{this, prxVar});
        } else if (this.mCoverImg == null || prxVar == null) {
        } else {
            View c = prxVar.c();
            ViewGroup viewGroup = (ViewGroup) c.getParent();
            if (viewGroup != null && c != null) {
                prxVar.a();
                viewGroup.removeView(c);
            }
            int left = this.mCoverImg.getLeft();
            int top = this.mCoverImg.getTop();
            int width = this.mCoverImg.getWidth();
            int height = this.mCoverImg.getHeight();
            ViewGroup viewGroup2 = (ViewGroup) this.mCoverImg.getParent();
            if (!(viewGroup2 instanceof RelativeLayout)) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = top;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = left;
            viewGroup2.addView(c, 0, layoutParams);
        }
    }

    public void startPlayVideo() {
        prx a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0fed6c", new Object[]{this});
        } else if (!prc.a() || this.mMediaLiveInfo == null || (a2 = prx.a(this.mContext)) == null || isVideoShown()) {
        } else {
            addVideoView(a2);
            MediaLiveInfo mediaLiveInfo = this.mMediaLiveInfo;
            LiveInfoItem liveInfoItem = this.mItem;
            a2.a(mediaLiveInfo, liveInfoItem == null ? "0" : liveInfoItem.id, prc.a(this.mContext, 12.0f));
            a2.a(31, this);
        }
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
            return;
        }
        prx a2 = prx.a(this.mContext);
        if (a2 == null) {
            return;
        }
        a2.b();
    }

    public void handleCardVideo() {
        prx a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7cfd0a", new Object[]{this});
        } else if (!this.mShouldShowVideo || (a2 = prx.a(this.mContext)) == null) {
        } else {
            int height = getHeight();
            this.mRect.setEmpty();
            getLocalVisibleRect(this.mRect);
            if (this.mRect.height() / height <= 0.6f || this.mMediaLiveInfo == null || isVideoShown()) {
                return;
            }
            addVideoView(a2);
            MediaLiveInfo mediaLiveInfo = this.mMediaLiveInfo;
            LiveInfoItem liveInfoItem = this.mItem;
            a2.a(mediaLiveInfo, liveInfoItem == null ? "0" : liveInfoItem.id, prc.a(this.mContext, 12.0f));
            a2.a(31, this);
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.mCoverImg;
        if (tUrlImageView != null) {
            tUrlImageView.pause();
        }
        TUrlImageView tUrlImageView2 = this.mAvatar;
        if (tUrlImageView2 != null) {
            tUrlImageView2.pause();
        }
        FavorLayout favorLayout = this.mFavorLayout;
        if (favorLayout == null) {
            return;
        }
        favorLayout.stopFakeFavor();
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.mCoverImg;
        if (tUrlImageView != null) {
            tUrlImageView.resume();
            pre.a(this.mCoverImg.getLoadingUrl());
        }
        TUrlImageView tUrlImageView2 = this.mAvatar;
        if (tUrlImageView2 != null) {
            tUrlImageView2.resume();
        }
        FavorLayout favorLayout = this.mFavorLayout;
        if (favorLayout == null) {
            return;
        }
        favorLayout.startFakeFavor();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        FavorLayout favorLayout = this.mFavorLayout;
        if (favorLayout == null) {
            return;
        }
        favorLayout.destroy();
    }

    public TaoliveHomeBigCardView(Context context) {
        super(context);
        this.mRect = new Rect();
        this.mIsHide = true;
        this.mShouldShowVideo = false;
        this.mClickNavEnable = true;
        this.mPointBuryEnable = true;
        init(context);
    }

    public TaoliveHomeBigCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRect = new Rect();
        this.mIsHide = true;
        this.mShouldShowVideo = false;
        this.mClickNavEnable = true;
        this.mPointBuryEnable = true;
        init(context);
    }

    public TaoliveHomeBigCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRect = new Rect();
        this.mIsHide = true;
        this.mShouldShowVideo = false;
        this.mClickNavEnable = true;
        this.mPointBuryEnable = true;
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        LayoutInflater.from(getContext()).inflate(R.layout.tbliveuikit_home_big_card, this);
        this.mShopTopView = (TaoliveBigcardTopView) findViewById(R.id.taolive_bigcard_shop_topview);
        this.mCoverImg = (TUrlImageView) findViewById(R.id.taolive_video_item_img);
        this.mTitle = (TextView) findViewById(R.id.taolive_video_item_title);
        this.mNick = (TextView) findViewById(R.id.taolive_video_item_nick);
        this.mFavorLayout = (FavorLayout) findViewById(R.id.taolive_fake_favor);
        this.mFavorLayout.setFavorDuration(2000);
        this.mFavorLayout.setScaleFactor(0.5d);
        this.mFavorNum = (TextView) findViewById(R.id.taolive_video_item_favor_num);
        this.mWatchNum = (TextView) findViewById(R.id.taolive_video_item_watch_num);
        this.mAvatar = (TUrlImageView) findViewById(R.id.taolive_video_item_avatar);
        this.mFavorBlock = (LinearLayout) findViewById(R.id.taolive_video_favor_layout);
        this.mLocNameView = (TIconFontTextView) findViewById(R.id.taolive_loc_view);
        this.mCustomLogo = (TUrlImageView) findViewById(R.id.taolive_video_item_custom_logo);
        this.mBottomLayout = findViewById(R.id.taolive_video_item_bottom_layout);
        if (!prr.k()) {
            this.mBubbleFrame = new com.taobao.taolive.uikit.view.a(this.mContext);
            this.mBubbleFrame.a((ViewStub) findViewById(R.id.taolive_bubble_frame_stub));
            this.mBubbleFrame.a();
        }
        this.mPreliveLogo = (ImageView) findViewById(R.id.taolive_big_card_prelive_logo);
        this.mReplayLogo = (ImageView) findViewById(R.id.taolive_big_card_playback_logo);
        this.mPreliveStartTime = (TextView) findViewById(R.id.taolive_big_card_appointment_starttime);
        this.mReplayWatchNum = (TextView) findViewById(R.id.taolive_big_card_replay_watch_num);
        this.mLiveLogo = (ImageView) findViewById(R.id.taolive_big_card_live_logo);
    }

    private void hideLiveElement() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840d9f55", new Object[]{this});
            return;
        }
        this.mFavorBlock.setVisibility(8);
        this.mFavorLayout.setVisibility(8);
        this.mCustomLogo.setVisibility(8);
        this.mLocNameView.setVisibility(8);
        this.mAvatar.setVisibility(8);
        com.taobao.taolive.uikit.view.a aVar = this.mBubbleFrame;
        if (aVar != null) {
            aVar.a();
        }
        this.mNick.setVisibility(8);
        this.mBottomLayout.setVisibility(8);
        setOnClickListener(null);
    }

    public void showGoodBubble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f3900d", new Object[]{this});
            return;
        }
        com.taobao.taolive.uikit.view.a aVar = this.mBubbleFrame;
        if (aVar == null) {
            return;
        }
        aVar.b();
        this.mBubbleFrame.e();
    }

    public void hideGoodBubble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a6b592", new Object[]{this});
            return;
        }
        com.taobao.taolive.uikit.view.a aVar = this.mBubbleFrame;
        if (aVar == null) {
            return;
        }
        aVar.f();
    }

    public boolean shouldShowBubble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24025e87", new Object[]{this})).booleanValue();
        }
        com.taobao.taolive.uikit.view.a aVar = this.mBubbleFrame;
        if (aVar == null) {
            return false;
        }
        return aVar.d();
    }

    public void setVideoShownFlg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d956ee4", new Object[]{this, new Boolean(z)});
            return;
        }
        LiveInfoItem liveInfoItem = this.mItem;
        if (liveInfoItem == null) {
            return;
        }
        liveInfoItem.shownOnceFlg = z;
    }

    public boolean isVideoShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48cd86ab", new Object[]{this})).booleanValue();
        }
        LiveInfoItem liveInfoItem = this.mItem;
        if (liveInfoItem == null) {
            return false;
        }
        return liveInfoItem.shownOnceFlg;
    }

    private void getFavorImgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0a1e3f", new Object[]{this});
        } else {
            prn.a().a(this.mFavorImgUrl, new prn.a() { // from class: com.taobao.taolive.uikit.view.TaoliveHomeBigCardView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.prn.a
                public void a(ArrayList<Drawable> arrayList) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
                    } else if (arrayList == null || arrayList.size() <= 0) {
                    } else {
                        TaoliveHomeBigCardView.access$000(TaoliveHomeBigCardView.this).setDrawables(arrayList);
                    }
                }
            });
        }
    }

    private void hidePrelive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf98c74", new Object[]{this});
            return;
        }
        this.mPreliveLogo.setVisibility(8);
        this.mPreliveStartTime.setVisibility(8);
    }

    private void hideLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f0bed5", new Object[]{this});
            return;
        }
        this.mFavorBlock.setVisibility(8);
        this.mFavorLayout.setVisibility(8);
        this.mFavorLayout.stopFakeFavor();
        this.mWatchNum.setVisibility(8);
        this.mLiveLogo.setVisibility(8);
    }

    private void hideReplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e60fd0", new Object[]{this});
            return;
        }
        this.mReplayWatchNum.setVisibility(8);
        this.mReplayLogo.setVisibility(8);
    }

    private void setPreLiveParams(LiveInfoItem liveInfoItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2484d6", new Object[]{this, liveInfoItem});
            return;
        }
        this.mPreliveLogo.setVisibility(0);
        this.mPreliveStartTime.setText(pro.a(liveInfoItem.appointmentTime));
        this.mPreliveStartTime.setVisibility(0);
    }

    private void setReplayParams(LiveInfoItem liveInfoItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6606d752", new Object[]{this, liveInfoItem});
            return;
        }
        this.mReplayLogo.setVisibility(0);
        this.mReplayWatchNum.setVisibility(0);
        TextView textView = this.mReplayWatchNum;
        textView.setText(prk.a(liveInfoItem.viewCount) + " 观看");
    }

    private void setLiveStatusParams(LiveInfoItem liveInfoItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3592b329", new Object[]{this, liveInfoItem});
            return;
        }
        if ("videox".equals(liveInfoItem.actionType)) {
            this.mShouldShowVideo = true;
        }
        this.mLiveLogo.setVisibility(0);
        this.mWatchNum.setVisibility(0);
        this.mFavorBlock.setVisibility(0);
        this.mFavorLayout.setVisibility(0);
        this.mFavorImgUrl = liveInfoItem.favorImg;
        if (!TextUtils.isEmpty(this.mFavorImgUrl)) {
            getFavorImgs();
        }
        this.mFavorNum.setText(prk.a(liveInfoItem.praiseCount));
        TextView textView = this.mWatchNum;
        textView.setText(prk.a(liveInfoItem.viewCount) + " 观看");
        this.mFavorLayout.startFakeFavor();
    }

    public LiveInfoItem getCurrentLiveInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveInfoItem) ipChange.ipc$dispatch("e614b86e", new Object[]{this}) : this.mItem;
    }

    public String getCurPicJumpURL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d6133d78", new Object[]{this}) : this.mCurPicJumpUrl;
    }

    public String getCurSpm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f323873", new Object[]{this}) : this.mSpm;
    }

    public String getCurScm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("caad7026", new Object[]{this}) : this.mScm;
    }

    public void setLiveParams(final LiveInfoItem liveInfoItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf30a317", new Object[]{this, liveInfoItem});
        } else if (liveInfoItem == null) {
        } else {
            this.mItem = liveInfoItem;
            if (liveInfoItem.roomStatus == 0) {
                hideLive();
                hideReplay();
                setPreLiveParams(liveInfoItem);
            } else if (liveInfoItem.roomStatus == 1) {
                hidePrelive();
                hideReplay();
                setLiveStatusParams(liveInfoItem);
            } else if (liveInfoItem.roomStatus == 2) {
                hidePrelive();
                hideLive();
                setReplayParams(liveInfoItem);
            }
            com.taobao.taolive.uikit.view.a aVar = this.mBubbleFrame;
            if (aVar != null) {
                aVar.a();
                if (liveInfoItem.goodsList != null && liveInfoItem.goodsList.size() > 0) {
                    this.mBubbleFrame.a(liveInfoItem.goodsList.get(0));
                    this.mBubbleFrame.c();
                }
            }
            this.mCoverImg.setImageUrl(liveInfoItem.coverImg);
            this.mTitle.setText(liveInfoItem.title);
            if (liveInfoItem.accountDO != null) {
                this.mAvatar.setImageUrl(liveInfoItem.accountDO.headImg);
                this.mNick.setText(liveInfoItem.accountDO.accountNick);
            }
            if (this.mClickNavEnable) {
                setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.uikit.view.TaoliveHomeBigCardView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        JSONObject jSONObject;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        GoodItem goodItem = null;
                        if (1 == liveInfoItem.roomStatus) {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            jSONObject2.put("liveUrlList", (Object) jSONArray);
                            jSONObject2.put("h265", (Object) Boolean.valueOf(liveInfoItem.h265));
                            jSONObject2.put(d.PARAM_MEDIA_INFO_MEDIACONFIG, (Object) liveInfoItem.mediaConfig);
                            jSONObject2.put("rateAdapte", (Object) Boolean.valueOf(liveInfoItem.rateAdapte));
                            jSONObject2.put("useArtp", (Object) Boolean.valueOf(liveInfoItem.useArtp));
                            jSONObject2.put("liveUrl", (Object) liveInfoItem.liveUrl);
                            jSONObject2.put("liveUrlHls", (Object) liveInfoItem.liveUrlHls);
                            int size = liveInfoItem.liveUrlList != null ? liveInfoItem.liveUrlList.size() : 0;
                            for (int i = 0; i < size; i++) {
                                QualitySelectItem qualitySelectItem = liveInfoItem.liveUrlList.get(i);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", (Object) qualitySelectItem.name);
                                jSONObject3.put("flvUrl", (Object) qualitySelectItem.flvUrl);
                                jSONObject3.put("h265Url", (Object) qualitySelectItem.h265Url);
                                jSONObject3.put("artpUrl", (Object) qualitySelectItem.artpUrl);
                                jSONObject3.put("hlsUrl", (Object) qualitySelectItem.hlsUrl);
                                jSONObject3.put("auth_key", (Object) qualitySelectItem.auth_key);
                                jSONObject3.put("wholeH265FlvUrl", (Object) qualitySelectItem.wholeH265FlvUrl);
                                jSONObject3.put("definition", (Object) qualitySelectItem.definition);
                                jSONArray.add(jSONObject3);
                            }
                            jSONObject = jSONObject2;
                        } else {
                            jSONObject = null;
                        }
                        if (liveInfoItem.goodsList != null && liveInfoItem.goodsList.size() > 0) {
                            goodItem = liveInfoItem.goodsList.get(0);
                        }
                        prb.a(TaoliveHomeBigCardView.access$100(TaoliveHomeBigCardView.this), liveInfoItem.nativeFeedDetailUrl, TaoliveHomeBigCardView.access$200(TaoliveHomeBigCardView.this).getLoadingUrl(), jSONObject, liveInfoItem.landScape, goodItem);
                        if (TaoliveHomeBigCardView.access$300(TaoliveHomeBigCardView.this) == null || !TaoliveHomeBigCardView.access$400(TaoliveHomeBigCardView.this)) {
                            return;
                        }
                        TaoliveHomeBigCardView.access$300(TaoliveHomeBigCardView.this);
                        TaoliveHomeBigCardView.access$500(TaoliveHomeBigCardView.this);
                        TaoliveHomeBigCardView.access$600(TaoliveHomeBigCardView.this);
                    }
                });
            }
            this.mMediaLiveInfo = prx.a(liveInfoItem);
            if (liveInfoItem.accountDO != null && "true".equals(liveInfoItem.accountDO.shop)) {
                this.mShopTopView.setData(liveInfoItem);
                this.mShopTopView.setVisibility(0);
                this.mLocNameView.setVisibility(8);
                this.mAvatar.setVisibility(8);
                this.mNick.setVisibility(8);
                return;
            }
            this.mShopTopView.setVisibility(8);
            String str = liveInfoItem.location;
            if ("true".equals(liveInfoItem.connectLocation) && !TextUtils.isEmpty(str)) {
                TIconFontTextView tIconFontTextView = this.mLocNameView;
                tIconFontTextView.setText(" | " + this.mContext.getString(R.string.tbliveuikit_video_item_location, str));
                this.mLocNameView.setVisibility(0);
            }
            this.mAvatar.setVisibility(0);
            this.mNick.setVisibility(0);
        }
    }

    public void setBannerParams(final HpBannerFrontData hpBannerFrontData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d01f4d", new Object[]{this, hpBannerFrontData});
        } else if (hpBannerFrontData == null) {
        } else {
            this.mSpm = hpBannerFrontData.spm;
            this.mScm = hpBannerFrontData.scm;
            if (HpBannerFrontData.TYPE_PIC.equals(hpBannerFrontData.type)) {
                this.mCurPicJumpUrl = hpBannerFrontData.picUrl;
                this.mCurCardType = HpBannerFrontData.TYPE_PIC;
                hideLiveElement();
                this.mCoverImg.setImageUrl(hpBannerFrontData.pic);
                setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.uikit.view.TaoliveHomeBigCardView.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        Nav.from(TaoliveHomeBigCardView.access$100(TaoliveHomeBigCardView.this)).toUri(hpBannerFrontData.picUrl);
                        CT ct = CT.Button;
                        TBS.Adv.ctrlClicked(ct, "BannerActivity", "url=" + hpBannerFrontData.picUrl);
                    }
                });
            } else if (!"LIVE".equals(hpBannerFrontData.type)) {
            } else {
                this.mCurCardType = "LIVE";
                LiveInfoItem liveInfoItem = hpBannerFrontData.liveVideoDo;
                if (liveInfoItem == null) {
                    return;
                }
                setLiveParams(liveInfoItem);
            }
        }
    }

    @Override // com.taobao.uikit.feature.view.TRelativeLayout, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, measuredWidth);
    }

    @Override // tb.prx.b
    public void onLiveVideoEvent(com.taobao.taolive.uikit.livecard.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45537c41", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if ((aVar.f22032a & 1) != 0) {
                prd.a(this.mCoverImg, 90L);
                setVideoShownFlg(true);
                if (this.mCardVideoEventListener == null) {
                    return;
                }
                new com.taobao.taolive.uikit.livecard.a(aVar.f22032a);
            } else if ((aVar.f22032a & 30) == 0) {
            } else {
                if ((aVar.f22032a & 2) != 0) {
                    prd.b(this.mCoverImg, 500L);
                } else {
                    this.mCoverImg.clearAnimation();
                    this.mCoverImg.setVisibility(0);
                }
                if (prx.a(this.mContext) == null || this.mCardVideoEventListener == null) {
                    return;
                }
                new com.taobao.taolive.uikit.livecard.a(aVar.f22032a);
            }
        }
    }

    public void setCardVideoEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39914d", new Object[]{this, aVar});
        } else {
            this.mCardVideoEventListener = aVar;
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        FavorLayout favorLayout = this.mFavorLayout;
        if (favorLayout == null) {
            return;
        }
        if (i == 8 || i == 4) {
            this.mFavorLayout.stopFakeFavor();
        } else if (i != 0) {
        } else {
            favorLayout.startFakeFavor();
        }
    }

    public void setClickNavEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5336e4d", new Object[]{this, new Boolean(z)});
        } else {
            this.mClickNavEnable = z;
        }
    }

    public void setPointBuryEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74619922", new Object[]{this, new Boolean(z)});
        } else {
            this.mPointBuryEnable = z;
        }
    }

    public void startFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805c9d83", new Object[]{this});
            return;
        }
        FavorLayout favorLayout = this.mFavorLayout;
        if (favorLayout == null) {
            return;
        }
        favorLayout.startFakeFavor();
    }

    public void stopFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d936de3", new Object[]{this});
            return;
        }
        FavorLayout favorLayout = this.mFavorLayout;
        if (favorLayout == null) {
            return;
        }
        favorLayout.stopFakeFavor();
    }
}
