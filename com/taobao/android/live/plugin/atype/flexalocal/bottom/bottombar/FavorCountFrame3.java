package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.b;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.t;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.CountInfoMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.OfficialLiveInfoMessage;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tb.ddv;
import tb.hfm;
import tb.hki;
import tb.jzn;
import tb.kge;
import tb.phg;
import tb.plx;
import tb.ply;
import tb.pmd;
import tb.tfu;
import tb.xkw;

/* loaded from: classes5.dex */
public class FavorCountFrame3 extends BaseFrame implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long MAX_TIME_INTERVAL = 2000;
    private static final String TAG = "FavorCountFrame3";
    private boolean isFavFirstClick;
    private a mBubbleRect;
    private boolean mEnableClick;
    private long mFavorCount;
    private TextView mFavorCountView;
    private int mFavorEffectThreshold;
    private FrameLayout mFavorLayout;
    private LinkedList<Long> mFavorTimeList;
    private d.a mMessageListener;
    private View mRootView;
    private TextWatcher watcher;

    static {
        kge.a(340549046);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(FavorCountFrame3 favorCountFrame3, String str, Object... objArr) {
        if (str.hashCode() == -309961236) {
            super.onCleanUp();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "FavorCountFrame3";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "tl-bottom-favor";
    }

    public static /* synthetic */ void access$000(FavorCountFrame3 favorCountFrame3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e514010", new Object[]{favorCountFrame3, new Long(j)});
        } else {
            favorCountFrame3.updateFavorCount(j);
        }
    }

    public static /* synthetic */ void access$100(FavorCountFrame3 favorCountFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afbb853", new Object[]{favorCountFrame3});
        } else {
            favorCountFrame3.updateContentDescription();
        }
    }

    public static /* synthetic */ void access$200(FavorCountFrame3 favorCountFrame3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa68da2", new Object[]{favorCountFrame3, new Boolean(z)});
        } else {
            favorCountFrame3.performClick(z);
        }
    }

    public static /* synthetic */ void access$300(FavorCountFrame3 favorCountFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dadd6e91", new Object[]{favorCountFrame3});
        } else {
            favorCountFrame3.animationFavor();
        }
    }

    public FavorCountFrame3(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mEnableClick = true;
        this.mFavorTimeList = new LinkedList<>();
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.FavorCountFrame3.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                    return;
                }
                long j = 0;
                if (i != 1002) {
                    if (i == 1004) {
                        FavorCountFrame3.this.hide();
                    } else if (i != 888000112 || !(obj instanceof OfficialLiveInfoMessage) || !b.a().b(FavorCountFrame3.this.mLiveDataModel)) {
                    } else {
                        FavorCountFrame3.access$000(FavorCountFrame3.this, v.a(((OfficialLiveInfoMessage) obj).praiseCount, 0L));
                    }
                } else if (b.a().b(FavorCountFrame3.this.mLiveDataModel)) {
                } else {
                    CountInfoMessage countInfoMessage = (CountInfoMessage) obj;
                    if (countInfoMessage.value != null && countInfoMessage.value.get(PowerMsgType.KEY_FAVOR) != null) {
                        j = countInfoMessage.value.get(PowerMsgType.KEY_FAVOR).longValue();
                    }
                    FavorCountFrame3.access$000(FavorCountFrame3.this, j);
                    if (countInfoMessage.value == null || countInfoMessage.value.get(XslMUSComponent.KEY_ATMOSPHERE) == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("source", "pm");
                    phg.a().a(FavorCountFrame3.this.mFrameContext, "likeAtmos", (Map<String, String>) hashMap);
                    FavorCountFrame3.this.mFrameContext.e().a(xkw.EVENT_FAVOR_EFFECT_SHOW, "recommend_atmosphere_" + countInfoMessage.value.get(XslMUSComponent.KEY_ATMOSPHERE), FavorCountFrame3.this.observeUniqueIdentification());
                }
            }
        };
        this.watcher = new TextWatcher() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.FavorCountFrame3.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                } else {
                    FavorCountFrame3.access$100(FavorCountFrame3.this);
                }
            }
        };
        this.mFavorEffectThreshold = u.au();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_frame_favor_count3_flexalocal;
    }

    private void updateContentDescription() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386fc4f3", new Object[]{this});
        } else if (this.mRootView == null) {
        } else {
            String str = "";
            if (this.mFavorCount > 0 && (textView = this.mFavorCountView) != null && textView.getVisibility() == 0) {
                str = str + "当前" + this.mFavorCount + "个爱心";
            }
            if (!StringUtils.isEmpty(str)) {
                str = str + ",";
            }
            this.mRootView.setContentDescription(str + "点赞");
            hki.a(this.mRootView);
        }
    }

    private void removeWatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca24151f", new Object[]{this});
            return;
        }
        TextView textView = this.mFavorCountView;
        if (textView == null) {
            return;
        }
        textView.removeTextChangedListener(this.watcher);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        this.mRootView = view;
        this.mRootView.setVisibility(8);
        this.mFavorCountView = (TextView) view.findViewById(R.id.taolive_favor_count);
        this.mFavorLayout = (FrameLayout) view.findViewById(R.id.taolive_favor_layout);
        ((TUrlImageView) view.findViewById(R.id.taolive_favor_img)).setImageResource(R.drawable.taolive_icon_favor_flexalocal);
        View view2 = this.mRootView;
        if (view2 != null) {
            view2.setContentDescription("点赞");
            hki.a(this.mRootView);
        }
        this.mFavorCountView.addTextChangedListener(this.watcher);
        phg.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        this.mRootView.setVisibility(hfm.a(tBLiveDataModel, this.mFrameContext) && !hfm.c() ? 8 : 0);
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        long j = 0;
        if (videoInfo != null) {
            if (b.a().b(tBLiveDataModel)) {
                j = v.a(videoInfo.officialLiveInfo.praiseCount, 0L);
            } else {
                j = videoInfo.praiseCount;
            }
        }
        updateFavorCount(j);
        if (this.mEnableClick) {
            if (videoInfo != null) {
                if (videoInfo.status == 1) {
                    getComponentView().setEnabled(false);
                } else {
                    getComponentView().setEnabled(true);
                }
            }
            getComponentView().setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.FavorCountFrame3.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    FavorCountFrame3.access$200(FavorCountFrame3.this, true);
                    FavorCountFrame3.access$300(FavorCountFrame3.this);
                }
            });
        }
        this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.FavorCountFrame3.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1002 || i == 1004 || i == 888000112;
            }
        });
        this.mFrameContext.e().a(this);
        this.mBubbleRect = getRect();
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!"com.taolive.taolive.room.mediaplatform_addfavor".equals(str)) {
        } else {
            performClick(false);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taolive.taolive.room.mediaplatform_addfavor"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mFrameContext.f().unRegisterMessageListener(this.mMessageListener);
        this.mFrameContext.e().b(this);
        this.mFavorTimeList.clear();
        removeWatcher();
    }

    private void updateFavorCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a51c43", new Object[]{this, new Long(j)});
            return;
        }
        this.mFavorCount = j;
        if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null) {
            if (b.a().b(this.mLiveDataModel)) {
                this.mLiveDataModel.mVideoInfo.officialLiveInfo.praiseCount = Long.toString(this.mFavorCount);
            } else {
                this.mLiveDataModel.mVideoInfo.praiseCount = this.mFavorCount;
            }
        }
        TextView textView = this.mFavorCountView;
        if (textView == null) {
            return;
        }
        long j2 = 0;
        if (j > 0) {
            textView.setVisibility(0);
            Object tag = this.mFavorCountView.getTag();
            if (tag != null) {
                j2 = ((Long) tag).longValue();
            }
            if (j2 >= j) {
                return;
            }
            this.mFavorCountView.setTag(Long.valueOf(j));
            this.mFavorCountView.setText(t.c(j));
            return;
        }
        textView.setVisibility(4);
    }

    private void performClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdeaece6", new Object[]{this, new Boolean(z)});
        } else if (pmd.a().q() != null && pmd.a().q().c()) {
            processClickLike(z);
            jzn.a(this.mFrameContext, tfu.FAVOR, 0L);
        } else if (pmd.a().q() == null) {
        } else {
            pmd.a().q().a((Activity) this.mContext, null);
        }
    }

    private void processClickLike(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d92c59d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mFrameContext.e().a(xkw.EVENT_TRACK, "Like", observeUniqueIdentification());
        if (this.mLiveDataModel == null) {
            return;
        }
        VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
        if (videoInfo != null) {
            if (z && ply.al()) {
                showBubbleInMiddle();
            }
            this.mFrameContext.e().a(xkw.EVENT_FAVOR_FRAME_SEND_FAVOR, videoInfo.topic, this.mFrameContext.G());
            this.mFrameContext.e().a(xkw.EVENT_PK_SEND_FAVOR, null, this.mFrameContext.G());
        }
        TextView textView = this.mFavorCountView;
        if (textView != null) {
            long j = 0;
            Object tag = textView.getTag();
            if (tag != null) {
                j = ((Long) tag).longValue();
            }
            updateFavorCount(j + 1);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mFavorTimeList.size() >= this.mFavorEffectThreshold) {
            this.mFavorTimeList.remove(0);
        }
        this.mFavorTimeList.add(Long.valueOf(currentTimeMillis));
        if (this.mFavorTimeList.size() >= this.mFavorEffectThreshold && currentTimeMillis - this.mFavorTimeList.get(0).longValue() < 2000) {
            HashMap hashMap = new HashMap();
            hashMap.put("source", "click");
            phg.a().a(this.mFrameContext, "likeAtmos", (Map<String, String>) hashMap);
            this.mFrameContext.e().a(xkw.EVENT_FAVOR_EFFECT_SHOW, "recommend_atmosphere_1", observeUniqueIdentification());
            this.mFavorTimeList.clear();
        }
        if (!this.isFavFirstClick) {
            phg.a();
            this.isFavFirstClick = true;
        }
        phg.e();
    }

    private void animationFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f6f2ca1", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.mFavorLayout, "scaleX", 1.0f, 1.4f, 1.0f), ObjectAnimator.ofFloat(this.mFavorLayout, "scaleY", 1.0f, 1.4f, 1.0f));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    private void showBubbleInMiddle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d7532a", new Object[]{this});
            return;
        }
        a aVar = this.mBubbleRect;
        if (aVar == null || aVar.a()) {
            return;
        }
        this.mFrameContext.e().a(xkw.EVENT_CLICK_FAVOR_IN_MIDDLE, new PointF(this.mBubbleRect.f13550a + ((int) (Math.random() * this.mBubbleRect.b)), this.mBubbleRect.d + ((int) (Math.random() * this.mBubbleRect.c))), observeUniqueIdentification());
    }

    private a getRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("34d4d1ff", new Object[]{this});
        }
        a aVar = new a();
        String ak = this.mLandscape ? ply.ak() : ply.aj();
        int a2 = com.taobao.taolive.room.utils.d.a(this.mContext, 60.0f) / 2;
        try {
            if (!StringUtils.isEmpty(ak)) {
                String[] split = ak.split("-");
                int a3 = com.taobao.taolive.room.utils.d.a(this.mContext, v.b(split[0])) + a2;
                int a4 = com.taobao.taolive.room.utils.d.a(this.mContext, v.b(split[1])) + a2;
                int a5 = com.taobao.taolive.room.utils.d.a(this.mContext, v.b(split[2])) + a2;
                int f = (int) (com.taobao.taolive.room.utils.d.f() * v.d(split[3]));
                aVar.f13550a = a3;
                aVar.d = (com.taobao.taolive.room.utils.d.f() - a5) - f;
                aVar.b = (com.taobao.taolive.room.utils.d.e() - a3) - a4;
                aVar.c = f;
            }
        } catch (Exception e) {
            plx.b("FavorCountFrame3", e.getMessage());
        }
        return aVar;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f13550a;
        public int b;
        public int c;
        public int d;

        static {
            kge.a(-1499865038);
        }

        private a() {
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b <= 0 || this.c <= 0;
        }
    }
}
