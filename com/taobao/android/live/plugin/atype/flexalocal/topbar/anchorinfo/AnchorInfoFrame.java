package com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.b;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.room.utils.t;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TBLivePVMsg;
import com.taobao.taolive.sdk.model.message.TBTVProgramMessage;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ddu;
import tb.hki;
import tb.hkk;
import tb.hkm;
import tb.kge;
import tb.phg;
import tb.ply;
import tb.plz;
import tb.pmd;
import tb.pmn;
import tb.pmo;
import tb.pmw;
import tb.pmx;
import tb.xkw;

/* loaded from: classes6.dex */
public class AnchorInfoFrame extends BaseFrame implements pmo, pmx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AnchorInfoFrame";
    private static final int WHAT_VIEW_SWITCHER_BY_PM = 2;
    private static final int WHAT_VIEW_SWITCHER_BY_VIDEO_INFO = 6;
    private static final int WHAT_VIEW_SWITCHER_LOCATION_WATCH = 5;
    private AnimatorSet animatorSet;
    private View avatarAnimView;
    private View avatarBackgroundView;
    public TUrlImageView avatarView;
    private long curWatchNum;
    private boolean enableNewUIRenderCalibre;
    private ViewGroup extraInfoLayout;
    private TUrlImageView favoriteTagView;
    private String hasLiveId;
    private boolean hideWatchNums;
    private long itemNoBeautyLoopTime;
    private TUrlImageView itemNoBeautyView;
    private final CopyOnWriteArraySet<String> labelOrWatchShowSet;
    private TextView locDivider;
    private TextView locDividerV2;
    private TextView locNameView;
    private TextView locNameViewV2;
    private boolean mEnableRemoteOnlineLimitNumberFormat;
    private AtomicBoolean mIsDispatchOnDraw;
    private d.a mMessageListener;
    private ViewTreeObserver.OnDrawListener mOnDrawListener;
    private boolean mShowAnim;
    private Runnable mStartMarqueeRunnable;
    private View nickNameLayout;
    private View nickNameLayoutV2;
    public TextView nickNameView;
    private TextView nickNameViewV2;
    private com.taobao.android.live.plugin.atype.flexalocal.topbar.a officialEnhanceAnimatorManager;
    private TUrlImageView platformLabelImage;
    private LinearLayout platformLabelLayout;
    private TextView platformLabelText;
    private Animation slideInDown;
    private Animation slideOutUp;
    private TUrlImageView vLabelImage;
    private TUrlImageView vLabelImageV2;
    private ViewSwitcher viewSwitcher;
    private final Handler viewSwitcherHandler;
    private TUrlImageView watchLabelImage;
    private TUrlImageView watchLabelImageV2;
    private LinearLayout watchLayout;
    private LinearLayout watchLayoutV2;
    private TextView watchNum;
    private TextView watchNumV2;
    private TextWatcher watcher;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final VideoInfo f14042a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public AccountInfo.BroadCasterTag e;

        static {
            kge.a(-2039575812);
        }

        public a(VideoInfo videoInfo, boolean z, boolean z2, boolean z3) {
            this.f14042a = videoInfo;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }
    }

    static {
        kge.a(-1971786813);
        kge.a(1413678939);
        kge.a(-1848285814);
    }

    public static /* synthetic */ Object ipc$super(AnchorInfoFrame anchorInfoFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode != 91531079) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : TAG;
    }

    public static /* synthetic */ Handler access$000(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a92c135f", new Object[]{anchorInfoFrame}) : anchorInfoFrame.viewSwitcherHandler;
    }

    public static /* synthetic */ ViewSwitcher access$100(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewSwitcher) ipChange.ipc$dispatch("bcc466", new Object[]{anchorInfoFrame}) : anchorInfoFrame.viewSwitcher;
    }

    public static /* synthetic */ TextView access$1000(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("58707eec", new Object[]{anchorInfoFrame}) : anchorInfoFrame.platformLabelText;
    }

    public static /* synthetic */ TUrlImageView access$1100(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("57589905", new Object[]{anchorInfoFrame}) : anchorInfoFrame.platformLabelImage;
    }

    public static /* synthetic */ boolean access$1200(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("867f74ba", new Object[]{anchorInfoFrame})).booleanValue() : anchorInfoFrame.hideWatchNums;
    }

    public static /* synthetic */ Runnable access$1300(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("e0c1539f", new Object[]{anchorInfoFrame}) : anchorInfoFrame.mStartMarqueeRunnable;
    }

    public static /* synthetic */ TextView access$1400(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("47153768", new Object[]{anchorInfoFrame}) : anchorInfoFrame.nickNameViewV2;
    }

    public static /* synthetic */ void access$1500(AnchorInfoFrame anchorInfoFrame, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89bb1", new Object[]{anchorInfoFrame, str, str2, str3});
        } else {
            anchorInfoFrame.refreshHeadView(str, str2, str3);
        }
    }

    public static /* synthetic */ void access$1600(AnchorInfoFrame anchorInfoFrame, long j, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3768e8c", new Object[]{anchorInfoFrame, new Long(j), new Boolean(z), str});
        } else {
            anchorInfoFrame.updateWatchNum(j, z, str);
        }
    }

    public static /* synthetic */ AtomicBoolean access$1700(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("d3b43c51", new Object[]{anchorInfoFrame}) : anchorInfoFrame.mIsDispatchOnDraw;
    }

    public static /* synthetic */ void access$1800(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6249770", new Object[]{anchorInfoFrame});
        } else {
            anchorInfoFrame.removeOnDrawListener();
        }
    }

    public static /* synthetic */ void access$1900(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15728f", new Object[]{anchorInfoFrame});
        } else {
            anchorInfoFrame.processAvatarClick();
        }
    }

    public static /* synthetic */ LinearLayout access$200(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("fea6b61c", new Object[]{anchorInfoFrame}) : anchorInfoFrame.watchLayoutV2;
    }

    public static /* synthetic */ void access$2000(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc84739", new Object[]{anchorInfoFrame});
        } else {
            anchorInfoFrame.notifyAccessibilityChange();
        }
    }

    public static /* synthetic */ String access$2100(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fcecd48", new Object[]{anchorInfoFrame}) : anchorInfoFrame.hasLiveId;
    }

    public static /* synthetic */ String access$2102(AnchorInfoFrame anchorInfoFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38a5e040", new Object[]{anchorInfoFrame, str});
        }
        anchorInfoFrame.hasLiveId = str;
        return str;
    }

    public static /* synthetic */ void access$2200(AnchorInfoFrame anchorInfoFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4896643d", new Object[]{anchorInfoFrame, new Boolean(z)});
        } else {
            anchorInfoFrame.avatarAnim(z);
        }
    }

    public static /* synthetic */ View access$2300(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3ee8b758", new Object[]{anchorInfoFrame}) : anchorInfoFrame.avatarBackgroundView;
    }

    public static /* synthetic */ View access$2400(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("41aa8b7", new Object[]{anchorInfoFrame}) : anchorInfoFrame.avatarAnimView;
    }

    public static /* synthetic */ CopyOnWriteArraySet access$300(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("cabf2d65", new Object[]{anchorInfoFrame}) : anchorInfoFrame.labelOrWatchShowSet;
    }

    public static /* synthetic */ void access$400(AnchorInfoFrame anchorInfoFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e85eb1", new Object[]{anchorInfoFrame, new Boolean(z)});
        } else {
            anchorInfoFrame.setWatchVisibility(z);
        }
    }

    public static /* synthetic */ ViewGroup access$500(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("a5c4e433", new Object[]{anchorInfoFrame}) : anchorInfoFrame.extraInfoLayout;
    }

    public static /* synthetic */ TUrlImageView access$600(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("e9744b9b", new Object[]{anchorInfoFrame}) : anchorInfoFrame.itemNoBeautyView;
    }

    public static /* synthetic */ LinearLayout access$700(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("6c19d737", new Object[]{anchorInfoFrame}) : anchorInfoFrame.platformLabelLayout;
    }

    public static /* synthetic */ Animation access$800(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animation) ipChange.ipc$dispatch("4334bf7", new Object[]{anchorInfoFrame}) : anchorInfoFrame.slideInDown;
    }

    public static /* synthetic */ Animation access$900(AnchorInfoFrame anchorInfoFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animation) ipChange.ipc$dispatch("1de290b8", new Object[]{anchorInfoFrame}) : anchorInfoFrame.slideOutUp;
    }

    private void setWatchVisibility(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecab3e0e", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.watchLayout.setVisibility(0);
            if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && (this.mLiveDataModel.mVideoInfo.status == 0 || this.mLiveDataModel.mVideoInfo.status == 3 || this.mLiveDataModel.mVideoInfo.status == 1)) {
                this.watchNum.setVisibility(0);
            } else {
                this.watchNum.setVisibility(8);
            }
        } else {
            this.watchLayout.setVisibility(8);
            this.watchNum.setVisibility(8);
        }
    }

    public AnchorInfoFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.labelOrWatchShowSet = new CopyOnWriteArraySet<>();
        this.viewSwitcherHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Message a(VideoInfo videoInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Message) ipChange.ipc$dispatch("420c1824", new Object[]{this, videoInfo});
                }
                Message obtain = Message.obtain(AnchorInfoFrame.access$000(AnchorInfoFrame.this));
                a aVar2 = new a(videoInfo, false, false, false);
                aVar2.e = null;
                obtain.obj = aVar2;
                obtain.what = 5;
                return obtain;
            }

            public boolean a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : AnchorInfoFrame.access$100(AnchorInfoFrame.this).getDisplayedChild() != 0;
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
                }
                a aVar2 = (a) message.obj;
                int i2 = message.what;
                if (i2 == 2) {
                    AnchorInfoFrame.access$200(AnchorInfoFrame.this).setVisibility(8);
                    if (AnchorInfoFrame.access$300(AnchorInfoFrame.this).contains(aVar2.f14042a.liveId)) {
                        q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_PM  don't show, return");
                        return false;
                    }
                    AnchorInfoFrame.access$400(AnchorInfoFrame.this, false);
                    AnchorInfoFrame.access$500(AnchorInfoFrame.this).setVisibility(0);
                    AnchorInfoFrame.access$600(AnchorInfoFrame.this).setVisibility(0);
                    AnchorInfoFrame.access$700(AnchorInfoFrame.this).setVisibility(8);
                    if (a()) {
                        AnchorInfoFrame.access$100(AnchorInfoFrame.this).setInAnimation(null);
                        AnchorInfoFrame.access$100(AnchorInfoFrame.this).setOutAnimation(null);
                        AnchorInfoFrame.access$100(AnchorInfoFrame.this).showNext();
                        q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_PM  display child != 0, need change");
                    } else {
                        q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_PM  display child != 0, not need change");
                    }
                    AnchorInfoFrame.access$000(AnchorInfoFrame.this).sendMessageDelayed(a(aVar2.f14042a), 10000L);
                    q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_PM  show");
                    AnchorInfoFrame.access$300(AnchorInfoFrame.this).add(aVar2.f14042a.liveId);
                } else if (i2 == 5) {
                    AnchorInfoFrame.access$200(AnchorInfoFrame.this).setVisibility(8);
                    AnchorInfoFrame.access$400(AnchorInfoFrame.this, true);
                    if (a()) {
                        q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_LOCATION_WATCH  is watch layout, not need change");
                    } else {
                        AnchorInfoFrame.access$100(AnchorInfoFrame.this).setInAnimation(AnchorInfoFrame.access$800(AnchorInfoFrame.this));
                        AnchorInfoFrame.access$100(AnchorInfoFrame.this).setOutAnimation(AnchorInfoFrame.access$900(AnchorInfoFrame.this));
                        AnchorInfoFrame.access$100(AnchorInfoFrame.this).showNext();
                        q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_LOCATION_WATCH  not watch layout, need change");
                    }
                    AnchorInfoFrame.access$500(AnchorInfoFrame.this).setVisibility(8);
                    AnchorInfoFrame.access$700(AnchorInfoFrame.this).setVisibility(8);
                    AnchorInfoFrame.access$600(AnchorInfoFrame.this).setVisibility(8);
                    q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_LOCATION_WATCH  show");
                } else if (i2 == 6) {
                    AnchorInfoFrame.access$200(AnchorInfoFrame.this).setVisibility(8);
                    if (aVar2.d && aVar2.e != null) {
                        AccountInfo.BroadCasterTag broadCasterTag = aVar2.e;
                        if (!TextUtils.isEmpty(broadCasterTag.icon) && !TextUtils.isEmpty(broadCasterTag.text)) {
                            AnchorInfoFrame.access$1000(AnchorInfoFrame.this).setText(broadCasterTag.text);
                            AnchorInfoFrame.access$1100(AnchorInfoFrame.this).setImageUrl(broadCasterTag.icon);
                            AnchorInfoFrame.access$400(AnchorInfoFrame.this, false);
                            AnchorInfoFrame.access$500(AnchorInfoFrame.this).setVisibility(0);
                            AnchorInfoFrame.access$600(AnchorInfoFrame.this).setVisibility(8);
                            AnchorInfoFrame.access$700(AnchorInfoFrame.this).setVisibility(0);
                            if (a()) {
                                AnchorInfoFrame.access$100(AnchorInfoFrame.this).setInAnimation(null);
                                AnchorInfoFrame.access$100(AnchorInfoFrame.this).setOutAnimation(null);
                                AnchorInfoFrame.access$100(AnchorInfoFrame.this).showNext();
                                q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_VIDEO_INFO  show platform label, is watch layout, need change");
                            } else {
                                q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_VIDEO_INFO  show platform label, not watch layout, not need change");
                            }
                            try {
                                i = Integer.parseInt(broadCasterTag.showTime);
                                if (i <= 100) {
                                    i = 10000;
                                }
                                q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_VIDEO_INFO  show label, show watch delay " + i);
                            } catch (Exception unused) {
                                q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_VIDEO_INFO  show label, show watch delay 10_000");
                                i = 10000;
                            }
                            AnchorInfoFrame.access$000(AnchorInfoFrame.this).sendMessageDelayed(a(aVar2.f14042a), i);
                            AnchorInfoFrame.access$300(AnchorInfoFrame.this).add(aVar2.f14042a.liveId);
                        }
                    } else if (aVar2.c) {
                        AnchorInfoFrame.access$400(AnchorInfoFrame.this, false);
                        AnchorInfoFrame.access$500(AnchorInfoFrame.this).setVisibility(0);
                        AnchorInfoFrame.access$600(AnchorInfoFrame.this).setVisibility(0);
                        AnchorInfoFrame.access$700(AnchorInfoFrame.this).setVisibility(8);
                        if (a()) {
                            AnchorInfoFrame.access$100(AnchorInfoFrame.this).setInAnimation(null);
                            AnchorInfoFrame.access$100(AnchorInfoFrame.this).setOutAnimation(null);
                            AnchorInfoFrame.access$100(AnchorInfoFrame.this).showNext();
                            q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_VIDEO_INFO  show no beauty, is watch layout, need change");
                        } else {
                            q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_VIDEO_INFO  show no beauty, not watch layout, not need change");
                        }
                        AnchorInfoFrame.access$000(AnchorInfoFrame.this).sendMessageDelayed(a(aVar2.f14042a), 10000L);
                        q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_VIDEO_INFO  show no beauty, show watch delay 10_000");
                        AnchorInfoFrame.access$300(AnchorInfoFrame.this).add(aVar2.f14042a.liveId);
                    } else {
                        AnchorInfoFrame.access$400(AnchorInfoFrame.this, true);
                        AnchorInfoFrame.access$500(AnchorInfoFrame.this).setVisibility(8);
                        AnchorInfoFrame.access$000(AnchorInfoFrame.this).sendMessageDelayed(a(aVar2.f14042a), 10000L);
                        q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_VIDEO_INFO  default, show watch delay 0");
                    }
                    q.b(AnchorInfoFrame.TAG, "WHAT_VIEW_SWITCHER_BY_VIDEO_INFO  show");
                }
                return false;
            }
        });
        this.mStartMarqueeRunnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!AnchorInfoFrame.access$1200(AnchorInfoFrame.this)) {
                    if (AnchorInfoFrame.this.nickNameView == null) {
                        return;
                    }
                    AnchorInfoFrame.this.nickNameView.setSelected(false);
                    AnchorInfoFrame.this.nickNameView.setSelected(true);
                    AnchorInfoFrame.this.nickNameView.postDelayed(AnchorInfoFrame.access$1300(AnchorInfoFrame.this), 15000L);
                } else if (AnchorInfoFrame.access$1400(AnchorInfoFrame.this) == null) {
                } else {
                    AnchorInfoFrame.access$1400(AnchorInfoFrame.this).setSelected(false);
                    AnchorInfoFrame.access$1400(AnchorInfoFrame.this).setSelected(true);
                    AnchorInfoFrame.access$1400(AnchorInfoFrame.this).postDelayed(AnchorInfoFrame.access$1300(AnchorInfoFrame.this), 15000L);
                }
            }
        };
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                VideoInfo videoInfo;
                JSONObject parseObject;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (b.a().b(AnchorInfoFrame.this.mLiveDataModel)) {
                } else {
                    if (i == 1039 && (obj instanceof TBTVProgramMessage)) {
                        TBTVProgramMessage tBTVProgramMessage = (TBTVProgramMessage) obj;
                        if (tBTVProgramMessage.liveDO == null || tBTVProgramMessage.liveDO.accountDo == null) {
                            return;
                        }
                        AnchorInfoFrame.access$1500(AnchorInfoFrame.this, tBTVProgramMessage.liveDO.accountDo.headImg, tBTVProgramMessage.liveDO.accountDo.accountName, tBTVProgramMessage.liveDO.location);
                    } else if (i == 102) {
                        if (plz.a(AnchorInfoFrame.this.mLiveDataModel.mVideoInfo)) {
                            return;
                        }
                        JoinNotifyMessage joinNotifyMessage = (JoinNotifyMessage) obj;
                        AnchorInfoFrame.access$1600(AnchorInfoFrame.this, t.a(joinNotifyMessage), false, joinNotifyMessage.viewCountFormat);
                    } else if (i == 1059) {
                        VideoInfo videoInfo2 = AnchorInfoFrame.this.mLiveDataModel.mVideoInfo;
                        if (!plz.a(videoInfo2)) {
                            return;
                        }
                        TBLivePVMsg tBLivePVMsg = (TBLivePVMsg) obj;
                        videoInfo2.taolivePv = tBLivePVMsg.pv;
                        AnchorInfoFrame.access$1600(AnchorInfoFrame.this, tBLivePVMsg.pv, true, tBLivePVMsg.viewCountFormat);
                    } else if (i != 10099 || ply.U() || (videoInfo = AnchorInfoFrame.this.mLiveDataModel.mVideoInfo) == null || obj == null || !(obj instanceof String) || (parseObject = JSON.parseObject((String) obj)) == null) {
                    } else {
                        q.b(AnchorInfoFrame.TAG, "[onMessageReceived] MSG_TYPE_PRODUCT_ITEM_NO_BEAUTY_UPDATE msg:" + obj);
                        videoInfo.itemNoBeauty = parseObject.getString("itemNoBeauty");
                        "1".equals(videoInfo.itemNoBeauty);
                    }
                }
            }
        };
        this.mEnableRemoteOnlineLimitNumberFormat = ply.X();
        this.enableNewUIRenderCalibre = ply.T();
        this.mIsDispatchOnDraw = new AtomicBoolean(false);
        this.mOnDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnDrawListener
            public void onDraw() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("73be92ca", new Object[]{this});
                } else if (!AnchorInfoFrame.access$1700(AnchorInfoFrame.this).compareAndSet(false, true)) {
                } else {
                    AnchorInfoFrame.this.mFrameContext.e().a(xkw.EVENT_LIVE_UI_RENDER_FINISH, AnchorInfoFrame.this.getComponentName(), AnchorInfoFrame.this.mFrameContext == null ? null : AnchorInfoFrame.this.mFrameContext.G());
                    AnchorInfoFrame.this.mContainer.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                AnchorInfoFrame.access$1800(AnchorInfoFrame.this);
                            }
                        }
                    });
                }
            }
        };
        this.watcher = new TextWatcher() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame.7
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
                    AnchorInfoFrame.access$2000(AnchorInfoFrame.this);
                }
            }
        };
        this.mShowAnim = false;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mContainer.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    AnchorInfoFrame.access$1900(AnchorInfoFrame.this);
                }
            }
        });
        this.avatarView = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_avatar_view);
        this.avatarBackgroundView = this.mContainer.findViewById(R.id.taolive_avatar_background_view);
        this.avatarAnimView = this.mContainer.findViewById(R.id.taolive_avatar_view_anim);
        this.nickNameLayout = this.mContainer.findViewById(R.id.taolive_nickname_layout);
        this.nickNameView = (TextView) this.mContainer.findViewById(R.id.taolive_nickname_view);
        this.vLabelImage = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_anchor_info_v_label_image);
        this.nickNameLayoutV2 = this.mContainer.findViewById(R.id.taolive_nickname_layout_v2);
        this.nickNameViewV2 = (TextView) this.mContainer.findViewById(R.id.taolive_nickname_view_v2);
        this.vLabelImageV2 = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_anchor_info_v_label_image_v2);
        this.locNameView = (TextView) this.mContainer.findViewById(R.id.taolive_loc_view);
        this.locDivider = (TextView) this.mContainer.findViewById(R.id.taolive_loc_divider);
        this.watchLabelImage = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_topbar_watch_label_image);
        this.watchLabelImageV2 = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_topbar_watch_label_image_v2);
        this.watchNum = (TextView) this.mContainer.findViewById(R.id.taolive_topbar_watch_num);
        this.watchLayout = (LinearLayout) this.mContainer.findViewById(R.id.taolive_topbar_watch_layout);
        this.avatarAnimView.setVisibility(8);
        this.locNameViewV2 = (TextView) this.mContainer.findViewById(R.id.taolive_loc_view_v2);
        this.locDividerV2 = (TextView) this.mContainer.findViewById(R.id.taolive_loc_divider_v2);
        this.watchNumV2 = (TextView) this.mContainer.findViewById(R.id.taolive_topbar_watch_num_v2);
        this.watchLayoutV2 = (LinearLayout) this.mContainer.findViewById(R.id.taolive_topbar_watch_layout_v2);
        this.favoriteTagView = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_favorite_tag);
        this.extraInfoLayout = (ViewGroup) this.mContainer.findViewById(R.id.taolive_topbar_extra_info_layout);
        this.itemNoBeautyView = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_itemnobeauty_view);
        this.platformLabelLayout = (LinearLayout) this.mContainer.findViewById(R.id.taolive_anchor_info_platform_label_layout);
        this.platformLabelImage = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_anchor_info_platform_label_image);
        this.platformLabelText = (TextView) this.mContainer.findViewById(R.id.taolive_anchor_info_platform_label_text);
        this.itemNoBeautyLoopTime = ply.V();
        this.viewSwitcher = (ViewSwitcher) this.mContainer.findViewById(R.id.taolive_topbar_viewswitcher);
        try {
            this.slideInDown = AnimationUtils.loadAnimation(this.mContext, R.anim.taolive_topbar_slide_in_up_flexalocal);
            this.slideOutUp = AnimationUtils.loadAnimation(this.mContext, R.anim.taolive_topbar_slide_out_up_flexalocal);
        } catch (Throwable th) {
            q.b(TAG, "AnchorInfoFrame e: " + th.getMessage());
        }
        TextView textView = this.nickNameView;
        if (textView != null) {
            textView.addTextChangedListener(this.watcher);
        }
        TextView textView2 = this.nickNameViewV2;
        if (textView2 != null) {
            textView2.addTextChangedListener(this.watcher);
        }
        TextView textView3 = this.watchNum;
        if (textView3 != null) {
            textView3.addTextChangedListener(this.watcher);
        }
        TextView textView4 = this.watchNumV2;
        if (textView4 != null) {
            textView4.addTextChangedListener(this.watcher);
        }
        this.favoriteTagView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01gNgoSg1ph899iqMKc_!!6000000005391-2-tps-69-30.png");
        this.itemNoBeautyView.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01CwTuUo1vg6rtkFscq_!!6000000006201-2-tps-188-36.png");
        e.c("AnchorInfoFrame: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
    }

    private void notifyAccessibilityChange() {
        TextView textView;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b947329c", new Object[]{this});
            return;
        }
        String str = "";
        TextView textView2 = this.nickNameView;
        if (textView2 != null && !TextUtils.isEmpty(textView2.getText()) && this.nickNameView.getVisibility() == 0) {
            str = str + ((Object) this.nickNameView.getText());
        }
        TextView textView3 = this.nickNameViewV2;
        if (textView3 != null && !TextUtils.isEmpty(textView3.getText()) && this.nickNameViewV2.getVisibility() == 0) {
            str = str + ((Object) this.nickNameViewV2.getText());
        }
        if (!TextUtils.isEmpty(str)) {
            str = str + "，";
        }
        TextView textView4 = this.watchNum;
        if (textView4 != null && !TextUtils.isEmpty(textView4.getText()) && this.watchNum.getVisibility() == 0) {
            str = str + ((Object) this.watchNum.getText());
            z = true;
        }
        if (!z && (textView = this.watchNumV2) != null && !TextUtils.isEmpty(textView.getText()) && this.watchNumV2.getVisibility() == 0) {
            str = str + ((Object) this.watchNumV2.getText());
        }
        this.mContainer.setImportantForAccessibility(1);
        this.mContainer.setContentDescription(str);
        hki.a(this.mContainer);
    }

    private void removeTextWatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe69bb2", new Object[]{this});
            return;
        }
        TextView textView = this.nickNameView;
        if (textView != null) {
            textView.removeTextChangedListener(this.watcher);
        }
        TextView textView2 = this.nickNameViewV2;
        if (textView2 != null) {
            textView2.removeTextChangedListener(this.watcher);
        }
        TextView textView3 = this.watchNum;
        if (textView3 != null) {
            textView3.removeTextChangedListener(this.watcher);
        }
        TextView textView4 = this.watchNumV2;
        if (textView4 == null) {
            return;
        }
        textView4.removeTextChangedListener(this.watcher);
    }

    private void processAvatarClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc32647", new Object[]{this});
        } else if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.admireInfo != null && !TextUtils.isEmpty(this.mLiveDataModel.mVideoInfo.admireInfo.accountJumpUrl)) {
            s.a(this.mContext, this.mLiveDataModel.mVideoInfo.admireInfo.accountJumpUrl);
            phg.a().a(this.mFrameContext, "HeadPortrait", (Map<String, String>) new HashMap());
        } else {
            if (b.a().a(this.mLiveDataModel)) {
                trackOfficialClick();
            }
            if (this.mShowAnim) {
                s.a(this.mContext, plz.a(this.hasLiveId) + "&livesource=PlayBackToLive&forceRefresh=true&backwardSwitch=true");
                return;
            }
            String str = null;
            String str2 = (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.broadCaster == null || TextUtils.isEmpty(this.mLiveDataModel.mVideoInfo.broadCaster.accountInfoUrl)) ? null : this.mLiveDataModel.mVideoInfo.broadCaster.accountInfoUrl;
            if (b.a().b(this.mLiveDataModel)) {
                VideoInfo.OfficialLiveInfo officialLiveInfo = this.mLiveDataModel.mVideoInfo.officialLiveInfo;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("accountId", (Object) officialLiveInfo.accountId);
                jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, (Object) officialLiveInfo.encryptAnchorId);
                jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) officialLiveInfo.officialLiveId);
                jSONObject.put("sourceType", (Object) "official-live");
                ddu e = this.mFrameContext.e();
                if (this.mFrameContext != null) {
                    str = this.mFrameContext.G();
                }
                e.a("com.taobao.taolive.room.avatar_card_show", jSONObject, str);
                return;
            }
            ddu e2 = this.mFrameContext.e();
            if (this.mFrameContext != null) {
                str = this.mFrameContext.G();
            }
            e2.a("com.taobao.taolive.room.avatar_card_show", str2, str);
        }
    }

    private void addOnDrawListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc26ed1f", new Object[]{this});
        } else if (!this.enableNewUIRenderCalibre || getComponentView() == null) {
        } else {
            this.mIsDispatchOnDraw.set(false);
            getComponentView().getViewTreeObserver().addOnDrawListener(this.mOnDrawListener);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_topbar_frame_anchor_info_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        addOnDrawListener();
        pmd.a().B().a(this);
        pmd.a().C().a(this);
        this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1039 || i == 102 || i == 1059 || i == 10099;
            }
        });
        updateView();
        queryHasLive();
        if (hkk.B() && b.a().b(this.mLiveDataModel)) {
            if (this.officialEnhanceAnimatorManager == null) {
                this.officialEnhanceAnimatorManager = new com.taobao.android.live.plugin.atype.flexalocal.topbar.a(findViewById(R.id.taolive_avatar_view_container));
            }
            this.officialEnhanceAnimatorManager.a();
        }
        if (!b.a().a(this.mLiveDataModel)) {
            return;
        }
        trackOfficialShow();
    }

    private void trackOfficialShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7aebc7a", new Object[]{this});
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.broadCaster == null || !b.a().a(this.mLiveDataModel)) {
        } else {
            String str = b.a().b(this.mLiveDataModel) ? "official_icon" : "former_icon";
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("feed_id", this.mLiveDataModel.mVideoInfo.liveId);
            hashMap.put("account_id", this.mLiveDataModel.mVideoInfo.broadCaster.accountId);
            hashMap.put("officialLiveId", this.mLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId);
            hashMap.put("officialAccountId", this.mLiveDataModel.mVideoInfo.officialLiveInfo.accountId);
            hashMap.put("officialLive", this.mLiveDataModel.mVideoInfo.officialLiveInfo.officialLive);
            hashMap.put("type", "accountArea");
            if (phg.a() == null) {
                return;
            }
            phg.a().a(this.mFrameContext, str, hashMap);
        }
    }

    private void trackOfficialClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3e9159", new Object[]{this});
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.broadCaster == null || !b.a().a(this.mLiveDataModel)) {
        } else {
            String str = b.a().b(this.mLiveDataModel) ? "official_icon" : "former_icon";
            HashMap hashMap = new HashMap();
            hashMap.put("feed_id", this.mLiveDataModel.mVideoInfo.liveId);
            hashMap.put("account_id", this.mLiveDataModel.mVideoInfo.broadCaster.accountId);
            hashMap.put("officialLiveId", this.mLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId);
            hashMap.put("officialAccountId", this.mLiveDataModel.mVideoInfo.officialLiveInfo.accountId);
            hashMap.put("officialLive", this.mLiveDataModel.mVideoInfo.officialLiveInfo.officialLive);
            hashMap.put("type", "accountArea");
            if (phg.a() == null) {
                return;
            }
            phg.a().a(this.mFrameContext, str, (Map<String, String>) hashMap);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        com.taobao.android.live.plugin.atype.flexalocal.topbar.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        pmd.a().B().b(this);
        pmd.a().C().b(this);
        this.mFrameContext.f().unRegisterMessageListener(this.mMessageListener);
        TextView textView = this.nickNameView;
        if (textView != null) {
            textView.removeCallbacks(this.mStartMarqueeRunnable);
        }
        TextView textView2 = this.nickNameViewV2;
        if (textView2 != null) {
            textView2.removeCallbacks(this.mStartMarqueeRunnable);
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.curWatchNum = 0L;
        this.viewSwitcherHandler.removeCallbacksAndMessages(null);
        this.labelOrWatchShowSet.clear();
        removeOnDrawListener();
        removeTextWatcher();
        if (!hkk.B() || !b.a().b(this.mLiveDataModel) || (aVar = this.officialEnhanceAnimatorManager) == null) {
            return;
        }
        aVar.b();
    }

    private void queryHasLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba75e45", new Object[]{this});
        } else if (this.mFrameContext == null || this.mFrameContext.d() == null) {
        } else {
            this.mFrameContext.d().a(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if (!(netBaseOutDo.mo1437getData() instanceof com.taobao.taolive.room.business.mess.a)) {
                    } else {
                        com.taobao.taolive.room.business.mess.a aVar = (com.taobao.taolive.room.business.mess.a) netBaseOutDo.mo1437getData();
                        String str = null;
                        if (aVar != null) {
                            AnchorInfoFrame.access$2102(AnchorInfoFrame.this, aVar.hasLiveId());
                            ddu e = AnchorInfoFrame.this.mFrameContext.e();
                            String access$2100 = AnchorInfoFrame.access$2100(AnchorInfoFrame.this);
                            if (AnchorInfoFrame.this.mFrameContext != null) {
                                str = AnchorInfoFrame.this.mFrameContext.G();
                            }
                            e.a(xkw.EVENT_TIMESHIFT_LIVING_ID_CHANGE, access$2100, str);
                            if (TextUtils.isEmpty(AnchorInfoFrame.access$2100(AnchorInfoFrame.this))) {
                                return;
                            }
                            AnchorInfoFrame.access$2200(AnchorInfoFrame.this, true);
                            return;
                        }
                        AnchorInfoFrame.access$2102(AnchorInfoFrame.this, null);
                        AnchorInfoFrame.access$2200(AnchorInfoFrame.this, false);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    AnchorInfoFrame.access$2102(AnchorInfoFrame.this, null);
                    AnchorInfoFrame.access$2200(AnchorInfoFrame.this, false);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        onError(i, netResponse, obj);
                    }
                }
            });
        }
    }

    private void updateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
        if (videoInfo == null || videoInfo.broadCaster == null) {
            return;
        }
        updateHeadView(videoInfo);
        updateFavorite(videoInfo.broadCaster.topFollow);
        this.viewSwitcher.setVisibility(8);
        this.extraInfoLayout.setVisibility(8);
        setWatchVisibility(false);
        this.watchLayoutV2.setVisibility(8);
        this.watchLabelImage.setVisibility(8);
        this.watchLabelImageV2.setVisibility(8);
        this.viewSwitcher.setInAnimation(null);
        this.viewSwitcher.setOutAnimation(null);
        updateWatchNum(videoInfo);
        updateTagsAndSwitch(videoInfo);
        updateVIcon(videoInfo);
    }

    private void updateTagsAndSwitch(VideoInfo videoInfo) {
        AccountInfo.BroadCasterTag broadCasterTag;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7381b3d", new Object[]{this, videoInfo});
        } else if (b.a().b(videoInfo)) {
        } else {
            this.hideWatchNums = false;
            if (ply.ai()) {
                q.b(TAG, "[updateView] SwitchConfig.enableHideWatchNums(): true");
                if (videoInfo.enableHideWatchNums) {
                    this.hideWatchNums = true;
                    q.b(TAG, "[updateView] enableHideWatchNums: true");
                } else {
                    this.hideWatchNums = false;
                    q.b(TAG, "[updateView] enableHideWatchNums: false");
                }
            } else {
                this.hideWatchNums = false;
                q.b(TAG, "[updateView] SwitchConfig.enableHideWatchNums(): false");
            }
            this.viewSwitcherHandler.removeCallbacksAndMessages(null);
            if (videoInfo.broadCaster != null && videoInfo.broadCaster.broadCasterTags != null && !videoInfo.broadCaster.broadCasterTags.isEmpty()) {
                broadCasterTag = videoInfo.broadCaster.broadCasterTags.get(0);
                z = false;
                z2 = true;
            } else {
                if ("1".equals(videoInfo.itemNoBeauty)) {
                    z = !ply.U();
                    broadCasterTag = null;
                } else {
                    broadCasterTag = null;
                    z = false;
                }
                z2 = false;
            }
            if (!z && !z2) {
                z3 = false;
            }
            if (this.hideWatchNums) {
                this.viewSwitcher.setVisibility(8);
                this.watchLayoutV2.setVisibility(8);
                this.nickNameLayout.setVisibility(8);
                this.nickNameLayoutV2.setVisibility(0);
                this.nickNameLayoutV2.postDelayed(this.mStartMarqueeRunnable, 1000L);
                return;
            }
            if (z3) {
                this.viewSwitcher.setVisibility(0);
                this.watchLayoutV2.setVisibility(8);
                Message obtain = Message.obtain(this.viewSwitcherHandler);
                a aVar = new a(videoInfo, z3, z, z2);
                aVar.e = broadCasterTag;
                obtain.obj = aVar;
                obtain.what = 6;
                this.viewSwitcherHandler.sendMessage(obtain);
            } else {
                this.viewSwitcher.setVisibility(8);
                this.watchLayoutV2.setVisibility(0);
            }
            this.nickNameLayout.setVisibility(0);
            this.nickNameLayout.postDelayed(this.mStartMarqueeRunnable, 1000L);
            this.nickNameLayoutV2.setVisibility(8);
        }
    }

    private void updateVIcon(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766e2ee0", new Object[]{this, videoInfo});
        } else if (b.a().b(videoInfo)) {
            updateOfficialLiveVIcon(videoInfo);
        } else {
            this.vLabelImage.setVisibility(8);
            this.vLabelImageV2.setVisibility(8);
            if (videoInfo.broadCaster.vicons == null || videoInfo.broadCaster.vicons.isEmpty()) {
                return;
            }
            String str = videoInfo.broadCaster.vicons.get(0);
            if (!TextUtils.isEmpty(str)) {
                this.nickNameView.setMaxWidth(dp2px(this.mContext, 83));
                this.vLabelImage.setImageUrl(str);
                this.vLabelImage.setVisibility(0);
                this.nickNameViewV2.setMaxWidth(dp2px(this.mContext, 83));
                this.vLabelImageV2.setImageUrl(str);
                this.vLabelImageV2.setVisibility(0);
                q.b(TAG, "set v icon, url: " + str);
                return;
            }
            this.nickNameView.setMaxWidth(dp2px(this.mContext, 96));
            this.vLabelImage.setVisibility(8);
            this.nickNameViewV2.setMaxWidth(dp2px(this.mContext, 96));
            this.vLabelImageV2.setVisibility(8);
            q.b(TAG, "set v icon is undefined");
        }
    }

    private void updateOfficialLiveVIcon(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f234bef7", new Object[]{this, videoInfo});
            return;
        }
        this.vLabelImage.setVisibility(8);
        this.vLabelImageV2.setVisibility(8);
        if (!b.a().b(videoInfo) || videoInfo.officialLiveInfo.vicons == null || videoInfo.officialLiveInfo.vicons.isEmpty()) {
            return;
        }
        String str = videoInfo.officialLiveInfo.vicons.get(0);
        if (!TextUtils.isEmpty(str)) {
            this.nickNameView.setMaxWidth(dp2px(this.mContext, 83));
            this.vLabelImage.setImageUrl(str);
            this.vLabelImage.setVisibility(0);
            this.nickNameViewV2.setMaxWidth(dp2px(this.mContext, 83));
            this.vLabelImageV2.setImageUrl(str);
            this.vLabelImageV2.setVisibility(0);
            q.b(TAG, "set official v icon, url: " + str);
            return;
        }
        this.nickNameView.setMaxWidth(dp2px(this.mContext, 96));
        this.vLabelImage.setVisibility(8);
        this.nickNameViewV2.setMaxWidth(dp2px(this.mContext, 96));
        this.vLabelImageV2.setVisibility(8);
        q.b(TAG, "set official v icon is undefined");
    }

    private void updateWatchNum(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda37b46", new Object[]{this, videoInfo});
        } else if (b.a().b(videoInfo)) {
            String str = videoInfo.officialLiveInfo.activityName;
            this.watchLayoutV2.setVisibility(0);
            this.watchNum.setVisibility(0);
            this.watchNumV2.setVisibility(0);
            this.watchNum.setText(str);
            this.watchNumV2.setText(str);
            if (!videoInfo.originalData.containsKey("officialLiveInfo") || !videoInfo.originalData.getJSONObject("officialLiveInfo").containsKey("officialLiveIcon")) {
                return;
            }
            String string = videoInfo.originalData.getJSONObject("officialLiveInfo").getString("officialLiveIcon");
            this.watchLabelImage.setVisibility(0);
            this.watchLabelImage.setImageUrl(string);
            this.watchLabelImageV2.setVisibility(0);
            this.watchLabelImageV2.setImageUrl(string);
            this.watchNum.setMaxWidth(dp2px(this.mContext, 81));
            this.watchNumV2.setMaxWidth(dp2px(this.mContext, 81));
        } else if (videoInfo.status == 0 || videoInfo.status == 3 || videoInfo.status == 1) {
            this.watchNum.setVisibility(0);
            this.watchNumV2.setVisibility(0);
            long a2 = t.a(videoInfo);
            if (plz.a(videoInfo)) {
                a2 = videoInfo.taolivePv;
            } else {
                z = false;
            }
            updateWatchNum(a2, z, t.b(videoInfo));
        } else {
            this.watchNum.setVisibility(8);
            this.watchNumV2.setVisibility(8);
        }
    }

    private void updateHeadView(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dadcc18", new Object[]{this, videoInfo});
            return;
        }
        String headImg = getHeadImg(videoInfo);
        String accountName = getAccountName(videoInfo);
        String location = getLocation(videoInfo);
        String liveId = getLiveId(videoInfo);
        this.avatarView.setImageUrl(headImg);
        this.avatarView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                AnchorInfoFrame.access$2300(AnchorInfoFrame.this).setVisibility(0);
                return false;
            }
        });
        this.nickNameView.setText(accountName);
        this.nickNameViewV2.setText(accountName);
        q.b(TAG, "[updateView] accountName: " + accountName + " liveId:" + liveId);
        updateLocation(location);
    }

    private String getHeadImg(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7bd07", new Object[]{this, videoInfo});
        }
        if (b.a().b(videoInfo)) {
            return videoInfo.officialLiveInfo.officialHeadImg;
        }
        return videoInfo.broadCaster == null ? "" : videoInfo.broadCaster.headImg;
    }

    private String getAccountName(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e00621c", new Object[]{this, videoInfo});
        }
        if (b.a().b(videoInfo)) {
            return videoInfo.officialLiveInfo.accountName;
        }
        return videoInfo.broadCaster == null ? "" : videoInfo.broadCaster.accountName;
    }

    private String getLocation(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a85669a5", new Object[]{this, videoInfo}) : b.a().b(videoInfo) ? "" : videoInfo.location;
    }

    private String getLiveId(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c72d8597", new Object[]{this, videoInfo});
        }
        if (b.a().b(videoInfo)) {
            return videoInfo.officialLiveInfo.officialLiveId;
        }
        return videoInfo.liveId;
    }

    public static int dp2px(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a48f723", new Object[]{context, new Integer(i)})).intValue() : Math.round(context.getResources().getDisplayMetrics().density * i);
    }

    private void updateLocation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a528f3af", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            if (!TextUtils.isEmpty(trim)) {
                this.locNameView.setVisibility(0);
                this.locNameView.setText(getLocationStr(trim));
                this.locDivider.setVisibility(0);
                this.locNameViewV2.setVisibility(0);
                this.locNameViewV2.setText(getLocationStr(trim));
                this.locDividerV2.setVisibility(0);
                return;
            }
        }
        this.locNameView.setVisibility(8);
        this.locDivider.setVisibility(8);
        this.locNameViewV2.setVisibility(8);
        this.locDividerV2.setVisibility(8);
    }

    private void updateFavorite(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c0dcc8", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = 8;
        if (b.a().b(this.mLiveDataModel)) {
            this.favoriteTagView.setVisibility(8);
        } else if (!ply.W()) {
        } else {
            TUrlImageView tUrlImageView = this.favoriteTagView;
            if (z) {
                i = 0;
            }
            tUrlImageView.setVisibility(i);
        }
    }

    private String getLocationStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59d73e69", new Object[]{this, str});
        }
        if (str.length() <= 4) {
            return str;
        }
        return str.substring(0, 3) + "...";
    }

    private void updateWatchNum(long j, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a24a181", new Object[]{this, new Long(j), new Boolean(z), str});
        } else if (j <= this.curWatchNum && !z) {
        } else {
            this.curWatchNum = j;
            try {
                VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
                if (this.mEnableRemoteOnlineLimitNumberFormat && !TextUtils.isEmpty(str)) {
                    this.watchNum.setText(str);
                    this.watchNumV2.setText(str);
                } else if (plz.a(videoInfo)) {
                    String string = this.mContext.getString(R.string.taolive_topbar_online_number_for_taolive_flexalocal, t.a(this.curWatchNum));
                    this.watchNum.setText(string);
                    this.watchNumV2.setText(string);
                } else {
                    String string2 = this.mContext.getString(R.string.taolive_topbar_online_number_flexalocal, t.a(this.curWatchNum));
                    this.watchNum.setText(string2);
                    this.watchNumV2.setText(string2);
                }
            } catch (Exception unused) {
            }
        }
    }

    private void refreshHeadView(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf7abc5", new Object[]{this, str, str2, str3});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.avatarView.setImageUrl(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.nickNameView.setText(str2);
            this.nickNameViewV2.setText(str2);
        }
        updateLocation(str3);
    }

    private void avatarAnim(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0a7263", new Object[]{this, new Boolean(z)});
        } else if (this.mLiveDataModel != null && z && this.mLiveDataModel.mVideoInfo != null && "2".equals(this.mLiveDataModel.mVideoInfo.roomStatus)) {
            this.mShowAnim = true;
            this.avatarAnimView.setVisibility(0);
            this.animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.avatarAnimView, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(400L);
            ofFloat.setStartDelay(400L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ValueAnimator ofInt = ValueAnimator.ofInt(30, 36);
            ofInt.setDuration(800L);
            ofInt.setRepeatCount(-1);
            ofInt.setRepeatMode(1);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    int a2 = com.taobao.taolive.room.utils.d.a(AnchorInfoFrame.this.mContext, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    AnchorInfoFrame.access$2400(AnchorInfoFrame.this).getLayoutParams().height = a2;
                    AnchorInfoFrame.access$2400(AnchorInfoFrame.this).getLayoutParams().width = a2;
                    AnchorInfoFrame.access$2400(AnchorInfoFrame.this).requestLayout();
                }
            });
            this.animatorSet.setDuration(1200L);
            this.animatorSet.playTogether(ofInt, ofFloat);
            this.animatorSet.start();
        } else {
            this.mShowAnim = false;
            this.avatarAnimView.setVisibility(8);
        }
    }

    @Override // tb.pmo
    public void onFavoriteChange(pmn pmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e23f1", new Object[]{this, pmnVar});
        } else {
            updateFavorite(pmnVar.b);
        }
    }

    @Override // tb.pmx
    public void onFollowChange(pmw pmwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82c75dd", new Object[]{this, pmwVar});
        } else if (pmwVar.b) {
        } else {
            updateFavorite(false);
        }
    }

    private void removeOnDrawListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c35a42", new Object[]{this});
        } else if (!this.enableNewUIRenderCalibre || getComponentView() == null) {
        } else {
            getComponentView().getViewTreeObserver().removeOnDrawListener(this.mOnDrawListener);
        }
    }
}
