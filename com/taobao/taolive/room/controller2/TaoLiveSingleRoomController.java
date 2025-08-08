package com.taobao.taolive.room.controller2;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.FrameManager;
import com.taobao.alilive.aliliveframework.frame.IComponent;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.proxy.good.IGoodProxy;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.media.MediaConstant;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.controller.TaoliveHighlightController;
import com.taobao.taolive.room.H5EmbedView;
import com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.room.utils.RRoomProxy;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ac;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.ak;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.g;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.core.impl.TBLiveDataProvider;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.model.common.ChatRoomInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.monitor.SceneStage;
import com.taobao.taolive.sdk.ui.component.VideoFrame;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import com.taobao.unit.center.templatesync.ITemplateSyncService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.cgl;
import tb.dds;
import tb.ddv;
import tb.ddw;
import tb.ffv;
import tb.ipx;
import tb.kge;
import tb.nog;
import tb.obw;
import tb.pfa;
import tb.pfb;
import tb.pff;
import tb.pgp;
import tb.phu;
import tb.pib;
import tb.pic;
import tb.pkm;
import tb.pkn;
import tb.pko;
import tb.pku;
import tb.plk;
import tb.plz;
import tb.pmd;
import tb.pmf;
import tb.pnj;
import tb.pos;
import tb.poy;
import tb.poz;
import tb.ppa;
import tb.ppb;
import tb.ppn;
import tb.ppq;
import tb.pqi;
import tb.pqj;
import tb.qne;
import tb.sgr;
import tb.tki;
import tb.xkw;

/* loaded from: classes8.dex */
public class TaoLiveSingleRoomController implements IRemoteExtendListener, com.taobao.taolive.sdk.business.f, TBLiveDataProvider.b, com.taobao.taolive.sdk.model.a, d.a, com.taobao.taolive.sdk.ui.component.b, com.taobao.taolive.sdk.ui.component.c, ddv, ppq.a, sgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MSG_SET_VIDEO_COVER_DELAY = 5;
    private static final String TAG;
    private boolean delayDidAppear;
    public boolean entryByShop2F;
    private pgp highlightPreloadTimeMove;
    public View itemView;
    private a mAutoDownController;
    private long mBufferingStartTime;
    private com.taobao.taolive.sdk.business.i mCDNFetchBusiness;
    public BaseFrame mComponentManager;
    public Context mContext;
    private ppq mDataProvider;
    private View mErrorView;
    public com.taobao.taolive.sdk.controller.e mGlobalContext;
    public com.taobao.taolive.sdk.model.f mHandler;
    private String mHitPreRequestLiveId;
    public boolean mIsDestroyed;
    public TBLiveBizDataModel mLiveDataModel;
    private pib mMediaStatusController;
    private ffv mMoreSwitchGuideTip;
    private com.taobao.taolive.sdk.playcontrol.b mMultiRoomVideoControllerObserver;
    public pkm mPerfomenceTrackManager;
    private long mPlayStartTime;
    public TBLiveRecEngineV2.RecModel mRecModel;
    private IRecommendPopProxy.a mRecommendPop;
    public String mRequestAccountId;
    public String mRequestLiveId;
    public BaseFrame mRoomController;
    public ViewGroup mRoomLayout;
    private pic mTBLIveRoomEngine;
    private String mTrackId;
    public VideoFrame2 mVideoFrame;
    private Object seiDispatcher;
    private long mFirstTime = 0;
    private long mScrollFirstTime = 0;
    private boolean mBuffering = false;
    private boolean mFirstFrameRendered = false;
    private boolean mIsFirstAppear = true;
    public g mFrameContext = new g();
    private boolean mDidAppear = false;
    private boolean mHasDisappear = false;
    private boolean mEnableAdjustBBConnectionVideoSize = false;
    private l mUpdownSwitchStateObserver = new l();
    public String frameContextUnique = null;
    private ddv mEnterEndEventObserver = new ddv() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ddv
        public String bizCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "OpenSingleViewController";
        }

        @Override // tb.ddv
        public void onEvent(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            } else if (!"com.taobao.taolive.room.ent.opt.animation.end".equals(str)) {
            } else {
                if (TaoLiveSingleRoomController.this.mFrameContext != null && TaoLiveSingleRoomController.this.mFrameContext.y() != null) {
                    TaoLiveSingleRoomController.this.mFrameContext.y().d(true);
                }
                TaoLiveSingleRoomController.access$000(TaoLiveSingleRoomController.this);
            }
        }

        @Override // tb.ddv
        public String[] observeEvents() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.ent.opt.animation.end"};
        }

        @Override // tb.ddv
        public String observeUniqueIdentification() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
            }
            if (TaoLiveSingleRoomController.this.mFrameContext != null) {
                return TaoLiveSingleRoomController.this.mFrameContext.G();
            }
            return null;
        }
    };
    private boolean mIsActivityPause = false;
    public com.taobao.taolive.sdk.ui.media.t mVideoStatusImpl = new com.taobao.taolive.sdk.ui.media.t() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.14
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass14 anonymousClass14, String str, Object... objArr) {
            if (str.hashCode() == -1754011296) {
                super.c((IMediaPlayer) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public boolean a(IMediaPlayer iMediaPlayer, long j, long j2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("afe7bb3e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), obj})).booleanValue();
            }
            int i = (int) j;
            if (i == 3) {
                com.taobao.taolive.movehighlight.utils.f.a().a(TaoLiveSingleRoomController.this.mFrameContext, System.currentTimeMillis());
                TaoLiveSingleRoomController.access$1400(TaoLiveSingleRoomController.this);
                if (!TaoLiveSingleRoomController.access$900(TaoLiveSingleRoomController.this)) {
                    TaoLiveSingleRoomController.access$1000();
                    TaoLiveSingleRoomController.this.mPerfomenceTrackManager.a(TaoLiveSingleRoomController.access$1500(TaoLiveSingleRoomController.this), j2);
                    if (TaoLiveSingleRoomController.access$1600(TaoLiveSingleRoomController.this) > 0) {
                        ai.a(TaoLiveSingleRoomController.this.mFrameContext, ag.CALC_FIRST_RENDER, "duration=" + (System.currentTimeMillis() - TaoLiveSingleRoomController.access$1600(TaoLiveSingleRoomController.this)));
                    }
                    if (TaoLiveSingleRoomController.access$1700(TaoLiveSingleRoomController.this) > 0) {
                        ai.a(TaoLiveSingleRoomController.this.mFrameContext, ag.CALC_UPDOWN_FIRST_RENDER, "duration=" + (System.currentTimeMillis() - TaoLiveSingleRoomController.access$1700(TaoLiveSingleRoomController.this)));
                        ai.a(TaoLiveSingleRoomController.this.mFrameContext, System.currentTimeMillis() - TaoLiveSingleRoomController.access$1600(TaoLiveSingleRoomController.this));
                        TaoLiveSingleRoomController.access$1000();
                        String str = "not preload:" + (System.currentTimeMillis() - TaoLiveSingleRoomController.access$1600(TaoLiveSingleRoomController.this));
                    }
                    if (pmd.a().e() != null) {
                        HashMap hashMap = new HashMap();
                        if (TaoLiveSingleRoomController.this.mRecModel != null) {
                            hashMap.put("feed_id", TaoLiveSingleRoomController.this.mRecModel.liveId);
                            hashMap.put("account_id", TaoLiveSingleRoomController.this.mRecModel.accountId);
                        }
                        hashMap.put("error_code", "0");
                        hashMap.put("first_time", TaoLiveSingleRoomController.access$900(TaoLiveSingleRoomController.this) ? "2" : "1");
                        pmd.a().e().a("Page_TaobaoLiveWatch", "livepayersuccess", hashMap);
                    }
                    TaoLiveSingleRoomController.access$902(TaoLiveSingleRoomController.this, true);
                }
            } else if (i == 701) {
                TaoLiveSingleRoomController.access$1202(TaoLiveSingleRoomController.this, System.currentTimeMillis());
                TaoLiveSingleRoomController.access$1302(TaoLiveSingleRoomController.this, true);
            } else if (i != 702) {
                if (i == 714) {
                    if (cgl.q() != null) {
                        cgl.q().a(pmd.a().u().c(), "download_video", null, 0L, j2);
                    }
                } else if (i == 715 && aa.S()) {
                    String str2 = null;
                    if (obj != null) {
                        str2 = (String) obj;
                    }
                    if (!StringUtils.isEmpty(str2) && TaoLiveSingleRoomController.access$1800(TaoLiveSingleRoomController.this)) {
                        if (pmd.a().m() != null) {
                            pmd.a().m().b(TaoLiveSingleRoomController.access$1000(), "MEDIA_INFO_SEI_USERDEFINED_STRUCT seiData = " + str2);
                        }
                        com.taobao.android.live.plugin.proxy.f.j().seiDispatcherDispatch(TaoLiveSingleRoomController.access$1900(TaoLiveSingleRoomController.this), str2);
                        if (TaoLiveSingleRoomController.access$2000(TaoLiveSingleRoomController.this)) {
                            ab.b(TaoLiveSingleRoomController.access$1000(), "adjustBBConnectionVideoSize allow");
                            if (com.taobao.android.live.plugin.proxy.c.a().d() && com.taobao.android.live.plugin.proxy.f.p() != null) {
                                com.taobao.android.live.plugin.proxy.f.p().adjustBBConnectionVideoSize(TaoLiveSingleRoomController.this.mContext, TaoLiveSingleRoomController.this.mFrameContext, str2);
                            }
                        }
                        ddw.a().a("com.taobao.taolive.room.get_sei_info", str2, TaoLiveSingleRoomController.this.frameContextUnique);
                    }
                }
            } else if (TaoLiveSingleRoomController.access$1300(TaoLiveSingleRoomController.this) && TaoLiveSingleRoomController.access$900(TaoLiveSingleRoomController.this)) {
                long currentTimeMillis = System.currentTimeMillis() - TaoLiveSingleRoomController.access$1200(TaoLiveSingleRoomController.this);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("duration", currentTimeMillis + "");
                ai.a((com.taobao.alilive.aliliveframework.frame.a) TaoLiveSingleRoomController.this.mFrameContext, ag.CALC_BUFFERING, (Map<String, String>) hashMap2);
                TaoLiveSingleRoomController.access$1302(TaoLiveSingleRoomController.this, false);
            }
            return false;
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public boolean a(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6fb80ec2", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            String str = "1";
            if (com.taobao.taolive.sdk.playcontrol.c.i(TaoLiveSingleRoomController.this.mFrameContext) == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
                TaoLiveSingleRoomController.access$2100(TaoLiveSingleRoomController.this, str);
                ddw.a().a(FullScreenFrame.EVENT_BACK_TO_LIVE, null, TaoLiveSingleRoomController.this.frameContextUnique);
                if (TaoLiveSingleRoomController.this.mContext instanceof Activity) {
                    ((Activity) TaoLiveSingleRoomController.this.mContext).runOnUiThread(new Runnable() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.14.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                plk.a(TaoLiveSingleRoomController.this.mContext.getApplicationContext(), "讲解播放出错，返回直播中！");
                            }
                        }
                    });
                }
            }
            if (pmd.a().e() != null) {
                HashMap hashMap = new HashMap();
                if (TaoLiveSingleRoomController.this.mRecModel != null) {
                    hashMap.put("feed_id", TaoLiveSingleRoomController.this.mRecModel.liveId);
                    hashMap.put("account_id", TaoLiveSingleRoomController.this.mRecModel.accountId);
                }
                hashMap.put("error_code", String.valueOf(i));
                if (TaoLiveSingleRoomController.access$900(TaoLiveSingleRoomController.this)) {
                    str = "2";
                }
                hashMap.put("first_time", str);
                pmd.a().e().a("Page_TaobaoLiveWatch", "livepayersuccess", hashMap);
            }
            TaoLiveSingleRoomController.access$902(TaoLiveSingleRoomController.this, true);
            return false;
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public void c(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9773e960", new Object[]{this, iMediaPlayer});
                return;
            }
            super.c(iMediaPlayer);
            if (com.taobao.taolive.sdk.playcontrol.c.i(TaoLiveSingleRoomController.this.mFrameContext) != VideoStatus.VIDEO_TIMESHIFT_STATUS) {
                return;
            }
            ddw.a().a(FullScreenFrame.EVENT_BACK_TO_LIVE, null, TaoLiveSingleRoomController.this.frameContextUnique);
        }
    };

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "TaoLiveSingleRoomController";
    }

    public String curLiveScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca9f8259", new Object[]{this}) : "fullLive";
    }

    @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
    public void dataParseBegin(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a054be1d", new Object[]{this, new Long(j)});
        }
    }

    public static /* synthetic */ void access$000(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59bf44d6", new Object[]{taoLiveSingleRoomController});
        } else {
            taoLiveSingleRoomController.onDelayDidAppear();
        }
    }

    public static /* synthetic */ void access$100(TaoLiveSingleRoomController taoLiveSingleRoomController, SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d3d6614", new Object[]{taoLiveSingleRoomController, simpleVideoInfo});
        } else {
            taoLiveSingleRoomController.addSimplePageTrackFeedId(simpleVideoInfo);
        }
    }

    public static /* synthetic */ String access$1000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d6ae20ba", new Object[0]) : TAG;
    }

    public static /* synthetic */ void access$1100(TaoLiveSingleRoomController taoLiveSingleRoomController, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b5128a", new Object[]{taoLiveSingleRoomController, drawable});
        } else {
            taoLiveSingleRoomController.setVideoFrameBlurBackgroundImg(drawable);
        }
    }

    public static /* synthetic */ long access$1200(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("177f5f39", new Object[]{taoLiveSingleRoomController})).longValue() : taoLiveSingleRoomController.mBufferingStartTime;
    }

    public static /* synthetic */ long access$1202(TaoLiveSingleRoomController taoLiveSingleRoomController, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ec46695", new Object[]{taoLiveSingleRoomController, new Long(j)})).longValue();
        }
        taoLiveSingleRoomController.mBufferingStartTime = j;
        return j;
    }

    public static /* synthetic */ boolean access$1300(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("99ca1428", new Object[]{taoLiveSingleRoomController})).booleanValue() : taoLiveSingleRoomController.mBuffering;
    }

    public static /* synthetic */ boolean access$1302(TaoLiveSingleRoomController taoLiveSingleRoomController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d089b6", new Object[]{taoLiveSingleRoomController, new Boolean(z)})).booleanValue();
        }
        taoLiveSingleRoomController.mBuffering = z;
        return z;
    }

    public static /* synthetic */ void access$1400(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c14c903", new Object[]{taoLiveSingleRoomController});
        } else {
            taoLiveSingleRoomController.onFirstFrame();
        }
    }

    public static /* synthetic */ String access$1500(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18edb6fe", new Object[]{taoLiveSingleRoomController}) : taoLiveSingleRoomController.mTrackId;
    }

    public static /* synthetic */ long access$1600(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("20aa32b5", new Object[]{taoLiveSingleRoomController})).longValue() : taoLiveSingleRoomController.mPlayStartTime;
    }

    public static /* synthetic */ long access$1700(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a2f4e794", new Object[]{taoLiveSingleRoomController})).longValue() : taoLiveSingleRoomController.mScrollFirstTime;
    }

    public static /* synthetic */ boolean access$1800(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("253f9c83", new Object[]{taoLiveSingleRoomController})).booleanValue() : taoLiveSingleRoomController.mDidAppear;
    }

    public static /* synthetic */ Object access$1900(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca49ed94", new Object[]{taoLiveSingleRoomController}) : taoLiveSingleRoomController.seiDispatcher;
    }

    public static /* synthetic */ void access$200(TaoLiveSingleRoomController taoLiveSingleRoomController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290adb5e", new Object[]{taoLiveSingleRoomController, str});
        } else {
            taoLiveSingleRoomController.updateDisPatchTrackInfo(str);
        }
    }

    public static /* synthetic */ boolean access$2000(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9f5dc8c", new Object[]{taoLiveSingleRoomController})).booleanValue() : taoLiveSingleRoomController.mEnableAdjustBBConnectionVideoSize;
    }

    public static /* synthetic */ void access$2100(TaoLiveSingleRoomController taoLiveSingleRoomController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff0cf71", new Object[]{taoLiveSingleRoomController, str});
        } else {
            taoLiveSingleRoomController.trackTimeShiftShow(str);
        }
    }

    public static /* synthetic */ void access$300(TaoLiveSingleRoomController taoLiveSingleRoomController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60fbb67d", new Object[]{taoLiveSingleRoomController, str});
        } else {
            taoLiveSingleRoomController.getLiveDetail(str);
        }
    }

    public static /* synthetic */ void access$400(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ea1852", new Object[]{taoLiveSingleRoomController});
        } else {
            taoLiveSingleRoomController.getLiveDetail();
        }
    }

    public static /* synthetic */ void access$500(TaoLiveSingleRoomController taoLiveSingleRoomController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0dd6cbb", new Object[]{taoLiveSingleRoomController, str});
        } else {
            taoLiveSingleRoomController.updateVoiceSilent(str);
        }
    }

    public static /* synthetic */ void access$600(TaoLiveSingleRoomController taoLiveSingleRoomController, MediaData mediaData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e94b634", new Object[]{taoLiveSingleRoomController, mediaData, new Boolean(z)});
        } else {
            taoLiveSingleRoomController.preLoadVideoLive(mediaData, z);
        }
    }

    public static /* synthetic */ void access$700(TaoLiveSingleRoomController taoLiveSingleRoomController, LiveItem.SpfPlayVideo spfPlayVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bafdd284", new Object[]{taoLiveSingleRoomController, spfPlayVideo});
        } else {
            taoLiveSingleRoomController.preLoadVideoHiglight(spfPlayVideo);
        }
    }

    public static /* synthetic */ pib access$800(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pib) ipChange.ipc$dispatch("745ba68f", new Object[]{taoLiveSingleRoomController}) : taoLiveSingleRoomController.mMediaStatusController;
    }

    public static /* synthetic */ boolean access$900(TaoLiveSingleRoomController taoLiveSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee5fa0b1", new Object[]{taoLiveSingleRoomController})).booleanValue() : taoLiveSingleRoomController.mFirstFrameRendered;
    }

    public static /* synthetic */ boolean access$902(TaoLiveSingleRoomController taoLiveSingleRoomController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3ec8e4d", new Object[]{taoLiveSingleRoomController, new Boolean(z)})).booleanValue();
        }
        taoLiveSingleRoomController.mFirstFrameRendered = z;
        return z;
    }

    static {
        kge.a(512634324);
        kge.a(600413623);
        kge.a(-1941058775);
        kge.a(-2101054629);
        kge.a(191318335);
        kge.a(-1905361424);
        kge.a(-1107739425);
        kge.a(788651310);
        kge.a(1626122044);
        kge.a(955428880);
        kge.a(1522751733);
        TAG = TaoLiveSingleRoomController.class.getSimpleName();
        com.android.tools.ir.runtime.c.a("com.taobao.taolive", null);
    }

    public TaoLiveSingleRoomController() {
        this.mFrameContext.a(new ipx());
    }

    public void init(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce90a9db", new Object[]{this, view});
            return;
        }
        this.mContext = view.getContext();
        com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.ATYPE, false, this.mContext);
        com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.BTYPE, false, this.mContext);
        this.mFrameContext.b(curLiveScene());
        this.mFrameContext.f8395a = com.taobao.taolive.room.utils.m.a();
        g gVar = this.mFrameContext;
        if (gVar instanceof com.taobao.taolive.sdk.core.e) {
            gVar.a((ppa) new ppb());
        }
        this.itemView = view;
        this.mRoomLayout = (ViewGroup) view.findViewById(R.id.taolive_room_layout);
        this.mComponentManager = new FrameManager(this.mContext);
        this.mHandler = new com.taobao.taolive.sdk.model.f(this);
        this.mPerfomenceTrackManager = new pkm(true);
        this.mPerfomenceTrackManager.n(curLiveScene());
        this.mPerfomenceTrackManager.a(this.mFrameContext);
        initVideo();
        this.seiDispatcher = com.taobao.android.live.plugin.proxy.f.j().createSEIDispatcher(this.mFrameContext);
        this.mAutoDownController = new a(this.mFrameContext, this.mContext);
        this.mFrameContext.a(this.mAutoDownController);
        this.mMoreSwitchGuideTip = new ffv(this.mContext, this.mComponentManager, this.mFrameContext);
        g gVar2 = this.mFrameContext;
        if (gVar2 != null) {
            this.frameContextUnique = gVar2.G();
        }
        Log.e("SingleRoomLifeCycle", "init " + this);
    }

    public void initMultiRoomVideoControllerObserver(com.taobao.taolive.sdk.playcontrol.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39b3c8c", new Object[]{this, bVar});
        } else {
            this.mMultiRoomVideoControllerObserver = bVar;
        }
    }

    public void setGlobalContext(com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e55d7d35", new Object[]{this, eVar});
            return;
        }
        this.mGlobalContext = eVar;
        this.mFrameContext.a(eVar);
    }

    public String getViewItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c73b410", new Object[]{this});
        }
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        return recModel != null ? recModel.getViewItemId() : "";
    }

    public void onBindView(TBLiveRecEngineV2.RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc42e94", new Object[]{this, recModel});
            return;
        }
        if (recModel != this.mRecModel) {
            this.mRecModel = recModel;
            this.mFrameContext.a(this.mRecModel);
            TBLiveRecEngineV2.RecModel recModel2 = this.mRecModel;
            if (recModel2 != null) {
                if (recModel2.initParams != null && StringUtils.isEmpty(this.mRecModel.imageUrl)) {
                    TBLiveRecEngineV2.RecModel recModel3 = this.mRecModel;
                    recModel3.imageUrl = recModel3.initParams.get("coverImage");
                }
                if (this.mRecModel.initParams == null && !StringUtils.isEmpty(this.mRecModel.actionUrl)) {
                    this.mRecModel.initParams = ak.b(Uri.parse(this.mRecModel.actionUrl));
                }
                if (aa.aG() && this.mRecModel.initParams != null && this.mRecModel.feedType != null && this.mRecModel.feedType.equals("Kandian")) {
                    this.mRecModel.initParams.put(aw.PARAM_SJSD_ITEM_ID, this.mRecModel.sjsdItemId);
                    this.mRecModel.initParams.put(aw.PARAM_TIMEMOVE_KEYPOINTID, this.mRecModel.keyPointId);
                    this.mRecModel.initParams.put(aw.PARAM_PRODUCT_TYPE, this.mRecModel.productType);
                    this.mRecModel.initParams.put("timeMovingSpfPlayVideo", this.mRecModel.timeMovingSpfPlayVideo);
                }
                String str = this.mRecModel.initParams != null ? this.mRecModel.initParams.get(aw.PARAM_PLAY_VIEW_TOKEN) : null;
                if (!StringUtils.isEmpty(str) && !com.taobao.taolive.sdk.ui.media.g.a().d(str)) {
                    str = null;
                }
                VideoFrame2 videoFrame2 = this.mVideoFrame;
                if (videoFrame2 != null) {
                    videoFrame2.setVideoViewToken(str);
                }
            }
            BaseFrame baseFrame = this.mComponentManager;
            if (baseFrame != null) {
                baseFrame.onPreloadView(recModel);
            }
        }
        Log.e("SingleRoomLifeCycle", "onBindView liveID = " + recModel.liveId + this);
    }

    public void onWillAppear() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.utils.m.b("TaoLiveSingleRoomController_onWillAppear");
        com.taobao.taolive.sdk.utils.q.b("JingChunLifecycle", "TaoLiveSingleRoomController onWillAppear liveId=" + this.mRecModel.liveId);
        ddw.a().a(this.mEnterEndEventObserver);
        this.mHasDisappear = false;
        this.mEnableAdjustBBConnectionVideoSize = aa.z();
        com.taobao.taolive.room.utils.m.o();
        String generateLiveContextKey = generateLiveContextKey();
        com.taobao.android.live.plugin.proxy.ir.a.a().a(IRRoomProxy.KEY, RRoomProxy.getInstance());
        g gVar = this.mFrameContext;
        if (gVar != null) {
            gVar.c(generateLiveContextKey);
        }
        this.mTBLIveRoomEngine = new pic(generateLiveContextKey, this.mFrameContext, this.mContext, this.itemView);
        this.mTBLIveRoomEngine.a();
        l lVar = this.mUpdownSwitchStateObserver;
        g gVar2 = this.mFrameContext;
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        lVar.a(gVar2, recModel != null ? recModel.liveId : "null", hashCode(), this.mFrameContext.j());
        a aVar = this.mAutoDownController;
        if (aVar != null) {
            aVar.a();
        }
        ppn.a().a(this.mContext, generateLiveContextKey, this.mFrameContext);
        if (y.a() && (y.b(this.mContext) || y.c(this.mContext))) {
            y.a(this);
        }
        pko.a().a(generateLiveContextKey);
        if (this.mPerfomenceTrackManager != null) {
            TBLiveRecEngineV2.RecModel recModel2 = this.mRecModel;
            if (recModel2 != null) {
                this.mTrackId = StringUtils.isEmpty(recModel2.liveId) ? this.mRecModel.accountId : this.mRecModel.liveId;
                if (this.mRecModel.initParams != null) {
                    str = this.mRecModel.initParams.get("livesource");
                    this.mFirstFrameRendered = false;
                    this.mBuffering = false;
                    this.mPerfomenceTrackManager.a(generateLiveContextKey);
                    this.mPerfomenceTrackManager.a(this.mTrackId, str, null, null);
                    this.mPerfomenceTrackManager.c(this.mTrackId);
                }
            }
            str = "";
            this.mFirstFrameRendered = false;
            this.mBuffering = false;
            this.mPerfomenceTrackManager.a(generateLiveContextKey);
            this.mPerfomenceTrackManager.a(this.mTrackId, str, null, null);
            this.mPerfomenceTrackManager.c(this.mTrackId);
        }
        VideoFrame2 videoFrame2 = this.mVideoFrame;
        if (videoFrame2 != null) {
            videoFrame2.setLiveContextKey(generateLiveContextKey);
        }
        if (!"shopCardLive".equals(curLiveScene())) {
            pib pibVar = this.mMediaStatusController;
            if (pibVar != null) {
                pibVar.h();
                this.mMediaStatusController = null;
            }
            this.mMediaStatusController = new pib(this.mContext, this.itemView, this.mFrameContext);
            g gVar3 = this.mFrameContext;
            if (gVar3 != null) {
                gVar3.a(this.mMediaStatusController);
            }
            this.mMediaStatusController.a(generateLiveContextKey, this.mVideoFrame);
        }
        com.taobao.taolive.sdk.playcontrol.c.c(this.mFrameContext);
        com.taobao.taolive.room.utils.m.b("TaoLiveSingleRoomController_preloadVideo single");
        if (aa.bC()) {
            com.taobao.taolive.movehighlight.utils.f.a().b(System.currentTimeMillis());
        }
        preloadVideo();
        fetchCDNLiveInfo();
        if (com.taobao.taolive.room.utils.m.b()) {
            g gVar4 = this.mFrameContext;
            ai.a(gVar4, "AfcColdPreSimpleTrack", "isPreRequest=" + com.taobao.taolive.room.afccoldlunch.b.a().c());
        }
        if (com.taobao.taolive.room.utils.m.b() && com.taobao.taolive.room.afccoldlunch.b.a().c()) {
            if (!com.taobao.taolive.room.afccoldlunch.b.a().a(new com.taobao.taolive.room.afccoldlunch.a() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.afccoldlunch.a
                public void a(SimpleVideoInfo simpleVideoInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0df487", new Object[]{this, simpleVideoInfo});
                    } else if (TaoLiveSingleRoomController.this.mRecModel == null || TaoLiveSingleRoomController.this.mRecModel.initParams == null || simpleVideoInfo == null) {
                    } else {
                        TaoLiveSingleRoomController.access$100(TaoLiveSingleRoomController.this, simpleVideoInfo);
                        TaoLiveSingleRoomController.this.mRecModel.initParams.put(aw.PARAM_ITEM_IDS, simpleVideoInfo.holdItemIds);
                        TaoLiveSingleRoomController.this.mRecModel.initParams.put(aw.PARAM_ITEM_HOLD_TYPE, simpleVideoInfo.itemHoldType);
                        if (!StringUtils.isEmpty(simpleVideoInfo.timeMovingId) && v.c(simpleVideoInfo.timeMovingId) != 0) {
                            TaoLiveSingleRoomController.this.mRecModel.initParams.put(aw.PARAM_TIMEMOVE_KEYPOINTID, simpleVideoInfo.timeMovingId);
                            TaoLiveSingleRoomController.this.mRecModel.initParams.put(aw.PARAM_TIMEMOVING_ITEM_ID, "customizeView".equals(simpleVideoInfo.itemHoldType) ? simpleVideoInfo.dispatchItemID : simpleVideoInfo.holdItemIds);
                            TaoLiveSingleRoomController.this.mRecModel.initParams.put(aw.PARAM_PRODUCT_TYPE, RecModel.MEDIA_TYPE_TIMEMOVE);
                        }
                        JSONObject b = pqj.b(TaoLiveSingleRoomController.this.mRecModel.initParams.get(aw.PARAM_TRANSPARENT_PARAMS));
                        if (b == null) {
                            b = new JSONObject();
                        }
                        b.put("dispatchItemID", (Object) simpleVideoInfo.dispatchItemID);
                        b.put("simpleTransParams", (Object) simpleVideoInfo.simpleTransParams);
                        TaoLiveSingleRoomController.this.mRecModel.initParams.put(aw.PARAM_TRANSPARENT_PARAMS, b.toJSONString());
                        TaoLiveSingleRoomController.access$200(TaoLiveSingleRoomController.this, simpleVideoInfo.disPatchTrackInfo);
                        TaoLiveSingleRoomController.access$300(TaoLiveSingleRoomController.this, simpleVideoInfo.liveId);
                        if (!com.taobao.taolive.room.utils.d.a()) {
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("极简启动 提前加载simple数据 ");
                        String str2 = "直播态";
                        sb.append(StringUtils.isEmpty(simpleVideoInfo.timeMovingId) ? str2 : "看点态");
                        com.taobao.taolive.room.utils.m.b(sb.toString());
                        Context context = TaoLiveSingleRoomController.this.mContext;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("极简启动 提前加载simple数据 ");
                        if (!StringUtils.isEmpty(simpleVideoInfo.timeMovingId)) {
                            str2 = "看点态";
                        }
                        sb2.append(str2);
                        plk.a(context, sb2.toString());
                    }
                }

                @Override // com.taobao.taolive.room.afccoldlunch.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    TaoLiveSingleRoomController.access$400(TaoLiveSingleRoomController.this);
                    if (!com.taobao.taolive.room.utils.d.a()) {
                        return;
                    }
                    plk.a(TaoLiveSingleRoomController.this.mContext, "极简启动 提前加载simple数据 失败");
                }
            })) {
                getLiveDetail();
            }
        } else {
            getLiveDetail();
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onWillAppear();
        }
        interceptColdStartDataUploadIfNeed();
        Log.e("SingleRoomLifeCycle", "onWillAppear liveContextKey = " + this.mFrameContext.j() + this);
    }

    private void addSimplePageTrackFeedId(SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2931e928", new Object[]{this, simpleVideoInfo});
        } else if (simpleVideoInfo == null || !aa.bE()) {
        } else {
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(simpleVideoInfo.liveId)) {
                hashMap.put("feed_id", simpleVideoInfo.liveId);
            }
            if (!StringUtils.isEmpty(simpleVideoInfo.accountId)) {
                hashMap.put("account_id", simpleVideoInfo.accountId);
            }
            com.taobao.taolive.sdk.core.a.a(this.mFrameContext, ai.e(this.mFrameContext, this.mContext), hashMap);
        }
    }

    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.utils.m.b("TaoLiveSingleRoomController_onWillDisappear");
        com.taobao.taolive.sdk.utils.q.b("JingChunLifecycle", "TaoLiveSingleRoomController onWillDisappear liveId=" + this.mRecModel.liveId);
        if (this.mIsDestroyed) {
            return;
        }
        if (aa.bs()) {
            if (this.mHasDisappear) {
                return;
            }
            this.mHasDisappear = true;
        }
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.e();
        }
        l lVar = this.mUpdownSwitchStateObserver;
        g gVar = this.mFrameContext;
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        lVar.c(gVar, recModel != null ? recModel.liveId : "null", hashCode(), this.mFrameContext.j());
        a aVar = this.mAutoDownController;
        if (aVar != null) {
            aVar.c();
        }
        this.mLiveDataModel = null;
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onWillDisappear();
        }
        if (aa.aX()) {
            destroy();
        } else {
            ppn.a().a(this.mFrameContext.j());
        }
        Log.e("SingleRoomLifeCycle", "onWillDisappear liveContextKey = " + this.mFrameContext.j() + this);
    }

    public void onDidAppear() {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.utils.q.b("SingleRoomLifeCycle", "onDidAppear liveContextKey = " + this.mFrameContext.j() + this);
        if (aa.w() && (gVar = this.mFrameContext) != null && gVar.y() != null && this.mFrameContext.w() != null && this.mFrameContext.y().q() && !this.mFrameContext.y().o() && !this.mFrameContext.y().p() && this.mFrameContext.w().isFirst) {
            this.delayDidAppear = true;
            this.mFrameContext.y().c(true);
        }
        if (this.delayDidAppear) {
            return;
        }
        onRealDidAppear();
    }

    private void onDelayDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7980f7", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.utils.q.b("SingleRoomLifeCycle", "onDelayDidAppear liveContextKey = " + this.mFrameContext.j() + this);
        if (!this.delayDidAppear) {
            return;
        }
        onRealDidAppear();
    }

    public void onRealDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0b405e", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.utils.q.b("SingleRoomLifeCycle", "onRealDidAppear liveContextKey = " + this.mFrameContext.j() + this);
        if (com.taobao.taolive.room.utils.n.a() != null && this.mFrameContext != null && com.taobao.taolive.room.utils.n.a().L()) {
            this.mFrameContext.c(true);
        }
        com.taobao.taolive.room.utils.n.a(this.mFrameContext);
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.b();
        }
        l lVar = this.mUpdownSwitchStateObserver;
        g gVar = this.mFrameContext;
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        lVar.b(gVar, recModel != null ? recModel.liveId : "null", hashCode(), this.mFrameContext.j());
        a aVar = this.mAutoDownController;
        if (aVar != null) {
            aVar.b();
        }
        com.taobao.android.live.plugin.proxy.f.j().seiDispatcherInitialize(this.seiDispatcher);
        this.mDidAppear = true;
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            pkmVar.a(this.mFirstTime);
        }
        com.taobao.taolive.sdk.playcontrol.b bVar = this.mMultiRoomVideoControllerObserver;
        if (bVar != null) {
            bVar.a(this.mFrameContext.A());
        }
        TBLiveRecEngineV2.RecModel recModel2 = this.mRecModel;
        if (recModel2 != null && recModel2.initParams != null) {
            String str = TAG;
            ab.d(str, "onDidAppear | liveId=" + this.mRecModel.liveId);
            poz.a(this.mRecModel.initParams, com.taobao.taolive.room.utils.n.b(this.mFrameContext));
            poz.L(this.mRecModel.initParams.get("livesource"), com.taobao.taolive.room.utils.n.b(this.mFrameContext));
            if (aa.cl() && this.mRecModel.isFirst) {
                poz.U(this.mRecModel.initParams.get("clickid"), this.mGlobalContext);
            }
        }
        VideoFrame2 videoFrame2 = this.mVideoFrame;
        if (videoFrame2 != null) {
            videoFrame2.setUserStartTime(System.currentTimeMillis());
        }
        if (this.mComponentManager != null) {
            com.taobao.taolive.sdk.utils.q.b("JingChunLifecycle", "TaoLiveSingleRoomController onDidAppear liveId=" + this.mRecModel.liveId);
            this.mComponentManager.onDidAppear();
        }
        com.taobao.taolive.sdk.core.j.a(this.mFrameContext, this, new MessageTypeFilter() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1004 || i == 1006;
            }
        });
        ddw.a().a(this);
        pkm pkmVar2 = this.mPerfomenceTrackManager;
        if (pkmVar2 != null) {
            pkmVar2.b(this.mTrackId);
        }
        this.mIsFirstAppear = false;
        poz.Y(ai.d(com.taobao.taolive.room.utils.n.a()), com.taobao.taolive.room.utils.n.b(com.taobao.taolive.room.utils.n.a()));
        initRecommendPop();
    }

    private void interceptColdStartDataUploadIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8f5e61", new Object[]{this});
        } else if (!u.aF()) {
        } else {
            String p = poz.p(com.taobao.taolive.room.utils.n.b(this.mFrameContext));
            if (ag.SOURCE_UPDOWNSWITCH.equalsIgnoreCase(p) || this.mFrameContext.y().aJ_().b().s()) {
                return;
            }
            com.taobao.taolive.sdk.monitor.b.b().b("LIVE_CODE_BOOT_STAGE");
            String str = TAG;
            ab.e(str, "interceptContinueUpload:" + p);
        }
    }

    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.utils.m.b("TaoLiveSingleRoomController_onDidDisappear");
        volumeChangeHide();
        this.mDidAppear = false;
        if (this.mIsDestroyed) {
            return;
        }
        if (aa.bs()) {
            if (this.mHasDisappear) {
                return;
            }
            this.mHasDisappear = true;
        }
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.f();
        }
        l lVar = this.mUpdownSwitchStateObserver;
        g gVar = this.mFrameContext;
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        lVar.d(gVar, recModel != null ? recModel.liveId : "null", hashCode(), this.mFrameContext.j());
        a aVar = this.mAutoDownController;
        if (aVar != null) {
            aVar.d();
        }
        if (com.taobao.android.live.plugin.proxy.c.a().d() && com.taobao.android.live.plugin.proxy.f.p().getBackwardX() != null) {
            com.taobao.android.live.plugin.proxy.f.p().getBackwardX().a(this.mLiveDataModel, this.mGlobalContext);
        }
        this.mLiveDataModel = null;
        if (this.mComponentManager != null) {
            com.taobao.taolive.sdk.utils.q.b("JingChunLifecycle", "TaoLiveSingleRoomController onDidDisappear liveId=" + this.mRecModel.liveId);
            this.mComponentManager.onDidDisappear();
        }
        showWidgets("close");
        destroy();
        g gVar2 = this.mFrameContext;
        if (gVar2 != null) {
            com.taobao.taolive.sdk.core.j.a((com.taobao.alilive.aliliveframework.frame.a) gVar2, false, gVar2.j());
        }
        com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, VideoStatus.VIDEO_NORMAL_STATUS);
        Log.e("SingleRoomLifeCycle", "onDidDisappear liveContextKey = " + this.mFrameContext.j() + this);
    }

    private void volumeChangeHide() {
        IUniversalProxy.d volumeChangeUploadManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c6f653", new Object[]{this});
            return;
        }
        TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
        if (tBLiveBizDataModel == null || tBLiveBizDataModel.mVideoInfo == null) {
            return;
        }
        if (com.taobao.android.live.plugin.proxy.f.o() != null && (volumeChangeUploadManager = com.taobao.android.live.plugin.proxy.f.o().getVolumeChangeUploadManager()) != null) {
            volumeChangeUploadManager.a(this.mLiveDataModel.mVideoInfo.liveId);
        }
        ab.b(TAG, "volumeChangeHide");
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            onDestroy(false);
        }
    }

    public void onDestroy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241196f2", new Object[]{this, new Boolean(z)});
            return;
        }
        g gVar = this.mFrameContext;
        if (gVar != null) {
            com.taobao.taolive.sdk.core.j.a((com.taobao.alilive.aliliveframework.frame.a) gVar, false, gVar.j());
        }
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.i();
        }
        if (y.a() && (y.b(this.mContext) || y.c(this.mContext))) {
            y.b(this);
        }
        IRecommendPopProxy.a aVar = this.mRecommendPop;
        if (aVar != null) {
            aVar.a();
            this.mRecommendPop = null;
        }
        l lVar = this.mUpdownSwitchStateObserver;
        g gVar2 = this.mFrameContext;
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        lVar.e(gVar2, recModel != null ? recModel.liveId : "null", hashCode(), this.mFrameContext.j());
        if (com.taobao.android.live.plugin.proxy.c.a().d() && com.taobao.android.live.plugin.proxy.f.p().getBackwardX() != null) {
            com.taobao.android.live.plugin.proxy.f.p().getBackwardX().a(this.mLiveDataModel, this.mGlobalContext);
        }
        TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
        if (tBLiveBizDataModel != null) {
            if (tBLiveBizDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.broadCaster != null) {
                poz.l(this.mLiveDataModel.mVideoInfo.broadCaster.headImg, this.mGlobalContext);
            } else if (this.mLiveDataModel.mFandomInfo != null && this.mLiveDataModel.mFandomInfo.broadCaster != null) {
                poz.l(this.mLiveDataModel.mFandomInfo.broadCaster.headImg, this.mGlobalContext);
            } else {
                poz.l((String) null, this.mGlobalContext);
            }
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onDestroy();
        }
        this.mRoomController = null;
        ViewGroup viewGroup = this.mRoomLayout;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        destroy(z);
        volumeChangeHide();
        this.mLiveDataModel = null;
        this.mIsDestroyed = true;
        com.taobao.taolive.room.afccoldlunch.b.a().b();
        a aVar2 = this.mAutoDownController;
        if (aVar2 != null) {
            aVar2.e();
        }
        Log.e("SingleRoomLifeCycle", "onDestroy liveContextKey = " + this.mFrameContext.j() + this);
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.mIsActivityPause = true;
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onPause();
        }
        if (this.mFrameContext.A() == null) {
            return;
        }
        this.mFrameContext.A().j();
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.utils.m.b("TaoLiveSingleRoomController_onResume");
        if (this.mVideoFrame != null) {
            if (!this.mIsActivityPause) {
                setVideoCoverDelay();
            }
            this.mVideoFrame.resume();
        }
        this.mIsActivityPause = false;
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onResume();
        }
        if (this.mFrameContext.A() == null) {
            return;
        }
        this.mFrameContext.A().k();
    }

    public void onStart() {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.utils.m.b("TaoLiveSingleRoomController_onStart");
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.g();
        }
        VideoFrame2 videoFrame2 = this.mVideoFrame;
        if (videoFrame2 != null) {
            videoFrame2.onStart();
        }
        if (!aa.aH() || (baseFrame = this.mComponentManager) == null) {
            return;
        }
        baseFrame.onStart();
    }

    public void onStop() {
        TBLiveRecEngineV2.RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.h();
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onStop();
        }
        VideoFrame2 videoFrame2 = this.mVideoFrame;
        if (videoFrame2 == null || (recModel = this.mRecModel) == null) {
            return;
        }
        videoFrame2.stop(recModel.liveId);
    }

    public void preloadVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("637f4f79", new Object[]{this});
        } else if (this.mRecModel == null) {
        } else {
            com.taobao.taolive.movehighlight.utils.f.a().b(0);
            VideoFrame2 videoFrame2 = this.mVideoFrame;
            if (videoFrame2 == null) {
                return;
            }
            String str = null;
            videoFrame2.highlightCurrentPlay = null;
            if (this.mRecModel.initParams != null) {
                str = this.mRecModel.initParams.get(aw.PARAM_PLAY_MODE);
                if (v.a(this.mRecModel.initParams.get("landScapeVideo"), false)) {
                    int c = (com.taobao.taolive.room.utils.d.c() * 9) / 16;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, c);
                    int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.taolive_video_top_margin);
                    int d = (int) (com.taobao.taolive.room.utils.d.d() * 0.2f);
                    if (c + d + poy.aq(this.mFrameContext) <= com.taobao.taolive.room.utils.d.d()) {
                        dimensionPixelSize = d;
                    }
                    layoutParams.topMargin = dimensionPixelSize;
                    this.mVideoFrame.updateLayout(layoutParams);
                } else {
                    this.mVideoFrame.toFullscreen();
                }
            }
            if (!StringUtils.isEmpty(this.mVideoFrame.getVideoViewToken())) {
                if (this.mPerfomenceTrackManager != null) {
                    if (StringUtils.isEmpty(str)) {
                        str = "playerViewToken";
                    }
                    this.mPerfomenceTrackManager.e(str);
                    this.mPerfomenceTrackManager.f(this.mTrackId);
                    this.mPerfomenceTrackManager.a(this.mTrackId, 0L);
                }
                this.mVideoFrame.preloadVideoByToken(!this.mIsFirstAppear);
                onLiveStartPlay(true);
                if (!this.mVideoFrame.hasFirstFrame() && aa.bl()) {
                    setVideoCoverDelay();
                }
            } else {
                MediaData mediaDataByRecModel = getMediaDataByRecModel(this.mRecModel);
                LiveItem.SpfPlayVideo a2 = com.taobao.taolive.movehighlight.utils.j.a(this.mRecModel.initParams);
                if (mediaDataByRecModel != null && mediaDataByRecModel.liveUrlList != null && !mediaDataByRecModel.liveUrlList.isEmpty()) {
                    preLoadVideoLive(mediaDataByRecModel, false);
                } else if (this.mRecModel.initParams != null) {
                    String str2 = this.mRecModel.initParams.get(aw.PARAM_LIVE_URL_TYPE);
                    if (("rtcLive".equals(str2) && u.F()) || (("bfrtc".equals(str2) && u.E()) || (("artp".equals(str2) && u.D()) || "flv".equals(str2)))) {
                        String str3 = this.mRecModel.initParams.get(aw.PARAM_LIVE_PLAY_URL);
                        if (!StringUtils.isEmpty(str3)) {
                            pkm pkmVar = this.mPerfomenceTrackManager;
                            if (pkmVar != null) {
                                pkmVar.e(aw.PARAM_LIVE_PLAY_URL);
                                this.mPerfomenceTrackManager.f(this.mTrackId);
                            }
                            this.mVideoFrame.preloadVideoByUrl(str3);
                            onLiveStartPlay(false);
                        }
                    } else if (a2 != null && com.taobao.taolive.movehighlight.utils.c.j()) {
                        preLoadVideoHiglight(a2);
                    } else if (com.taobao.taolive.room.utils.m.b() && com.taobao.taolive.room.afccoldlunch.b.a().c()) {
                        com.taobao.taolive.room.afccoldlunch.b.a().a(new com.taobao.taolive.room.afccoldlunch.a() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.8
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.taolive.room.afccoldlunch.a
                            public void a() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                }
                            }

                            @Override // com.taobao.taolive.room.afccoldlunch.a
                            public void a(SimpleVideoInfo simpleVideoInfo) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d0df487", new Object[]{this, simpleVideoInfo});
                                    return;
                                }
                                TaoLiveSingleRoomController.access$100(TaoLiveSingleRoomController.this, simpleVideoInfo);
                                if (simpleVideoInfo != null) {
                                    TaoLiveSingleRoomController.access$500(TaoLiveSingleRoomController.this, simpleVideoInfo.voiceSilent);
                                }
                                MediaData b = com.taobao.taolive.room.afccoldlunch.b.b(simpleVideoInfo);
                                LiveItem.SpfPlayVideo a3 = com.taobao.taolive.room.afccoldlunch.b.a(simpleVideoInfo);
                                if (b != null && b.liveUrlList != null && !b.liveUrlList.isEmpty()) {
                                    TaoLiveSingleRoomController.access$600(TaoLiveSingleRoomController.this, b, com.taobao.taolive.room.utils.m.b());
                                } else if (a3 == null) {
                                } else {
                                    TaoLiveSingleRoomController.access$700(TaoLiveSingleRoomController.this, a3);
                                }
                            }
                        });
                    }
                }
                if (!this.mVideoFrame.hasPreloaded()) {
                    this.mVideoFrame.getPreloadVideoView();
                }
                if (!this.mVideoFrame.hasFirstFrame()) {
                    if (com.taobao.taolive.room.utils.m.b()) {
                        setVideoCoverImage(this.mRecModel.imageUrl, false);
                        Log.e("InitTaoLiveColdLaunch", "isAfcColdContext setVideoCoverImage");
                    } else {
                        setVideoCoverDelay();
                    }
                }
            }
            VideoFrame2 videoFrame22 = this.mVideoFrame;
            if (videoFrame22 == null || !videoFrame22.hasPreloaded()) {
                return;
            }
            updatePlayerSoReport();
        }
    }

    private void preLoadVideoLive(MediaData mediaData, boolean z) {
        pmf t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f890ce09", new Object[]{this, mediaData, new Boolean(z)});
        } else if (mediaData == null || mediaData.liveUrlList == null || mediaData.liveUrlList.isEmpty()) {
        } else {
            pkm pkmVar = this.mPerfomenceTrackManager;
            if (pkmVar != null) {
                pkmVar.e("liveUrlList");
                this.mPerfomenceTrackManager.f(this.mTrackId);
            }
            if (!StringUtils.isEmpty(mediaData.dataTracks) && (t = pmd.a().t()) != null) {
                t.a(mediaData.dataTracks, this.mContext);
            }
            this.mVideoFrame.preloadVideo(mediaData, z);
            onLiveStartPlay(false);
        }
    }

    private void preLoadVideoHiglight(LiveItem.SpfPlayVideo spfPlayVideo) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea83a6a", new Object[]{this, spfPlayVideo});
        } else if (spfPlayVideo == null) {
        } else {
            if (!StringUtils.isEmpty(spfPlayVideo.playInfo)) {
                com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, VideoStatus.VIDEO_TIMESHIFT_STATUS);
                if (com.taobao.android.litecreator.comprehension.f.FILE_TYPE_VIDEO_MP4.equals(spfPlayVideo.videoType)) {
                    com.taobao.taolive.movehighlight.utils.f.a().a(com.taobao.android.litecreator.comprehension.f.FILE_TYPE_VIDEO_MP4);
                    this.mVideoFrame.preloadHighlight(null, spfPlayVideo.playInfo, 0);
                } else {
                    com.taobao.taolive.movehighlight.utils.f.a().a("m3u8");
                    this.mVideoFrame.preloadHighlight(spfPlayVideo.playInfo, null, 0);
                }
                com.taobao.taolive.movehighlight.utils.f.a().b(1);
            }
            if (spfPlayVideo.timeMovingUtParams == null || (b = pqj.b(spfPlayVideo.timeMovingUtParams)) == null) {
                return;
            }
            this.mRecModel.initParams.put("timeMovingPcmIdParam", b.getString("pcmId"));
        }
    }

    private void updateVoiceSilent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc50baf", new Object[]{this, str});
        } else if (this.mGlobalContext == null || StringUtils.isEmpty(str)) {
        } else {
            this.mGlobalContext.k = "true".equals(str);
        }
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            destroy(false);
        }
    }

    private void destroy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aecf0b73", new Object[]{this, new Boolean(z)});
            return;
        }
        resetMoreTip();
        this.delayDidAppear = false;
        Object obj = null;
        if (aa.bt()) {
            this.mRequestLiveId = null;
            this.mRequestAccountId = null;
        }
        com.taobao.android.live.plugin.proxy.f.j().seiDispatcherQuit(this.seiDispatcher);
        com.taobao.taolive.sdk.core.j.a(this.mFrameContext, LiveEmbedType.NORMAL);
        trackTimeShiftShow("0");
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            pkmVar.m(this.mTrackId);
            this.mPerfomenceTrackManager.c();
        }
        com.taobao.taolive.sdk.model.f fVar = this.mHandler;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        ddw.a().b(this);
        ddw.a().b(this.mEnterEndEventObserver);
        u.c = false;
        pib pibVar = this.mMediaStatusController;
        if (pibVar != null) {
            pibVar.g();
        }
        if (this.highlightPreloadTimeMove != null) {
            this.highlightPreloadTimeMove = null;
        }
        IRecommendPopProxy.a aVar = this.mRecommendPop;
        if (aVar != null) {
            aVar.a();
            this.mRecommendPop = null;
        }
        if (aa.cl()) {
            poz.U(null, this.mGlobalContext);
        }
        ppn.a().a(this.mFrameContext.j());
        IGoodProxy m = com.taobao.android.live.plugin.proxy.f.m();
        g gVar = this.mFrameContext;
        if (gVar != null) {
            obj = gVar.c();
        }
        m.destroy(obj);
        com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, z);
    }

    private MediaData getMediaDataByRecModel(TBLiveRecEngineV2.RecModel recModel) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("316cb8fb", new Object[]{this, recModel});
        }
        MediaData mediaData = null;
        if (recModel == null || recModel.supportPreLoad != 1) {
            return null;
        }
        if (recModel.isFirst && recModel.initParams != null) {
            String str = recModel.initParams.get(aw.PARAM_CUSTOM_PLAY_CTRL);
            String str2 = recModel.initParams.get(aw.PARAM_QUICK_LIVE_URL);
            if (!StringUtils.isEmpty(str)) {
                mediaData = com.taobao.taolive.sdk.model.common.a.a(com.taobao.taolive.room.utils.q.a(str));
            } else if (!StringUtils.isEmpty(str2) && aa.aT() && (a2 = com.taobao.taolive.room.utils.q.a(str2)) != null) {
                mediaData = new MediaData();
                mediaData.liveUrlList = new ArrayList<>();
                MediaData.QualityLiveItem qualityLiveItem = new MediaData.QualityLiveItem();
                qualityLiveItem.artpUrl = a2.getString("artpUrl");
                qualityLiveItem.definition = a2.getString("definition");
                qualityLiveItem.flvUrl = a2.getString("flvUrl");
                qualityLiveItem.h265Url = a2.getString("h265Url");
                qualityLiveItem.hlsUrl = a2.getString("hlsUrl");
                qualityLiveItem.name = a2.getString("name");
                qualityLiveItem.wholeH265FlvUrl = a2.getString("wholeH265FlvUrl");
                qualityLiveItem.wholeH265ArtpUrl = a2.getString(aw.PARAM_MEDIA_INFO_wholeH265ArtpUrl);
                qualityLiveItem.bfrtcUrl = a2.getString(MediaConstant.BFRTC_URL_NAME);
                qualityLiveItem.liveUrlMiniBfrtc = a2.getString("liveUrlMiniBfrtc");
                qualityLiveItem.rtcLiveUrl = a2.getString(MediaConstant.RTCLIVE_URL_NAME);
                qualityLiveItem.unit = a2.getString(nog.PRICE_UNIT);
                qualityLiveItem.unitType = a2.getString("unitType");
                mediaData.liveUrlList.add(qualityLiveItem);
                mediaData.liveUrlList.add(qualityLiveItem);
                mediaData.liveUrlList.add(qualityLiveItem);
            }
            String str3 = recModel.initParams.get(aw.PARAM_PLAYER_TOKEN);
            if (StringUtils.isEmpty(str3)) {
                return mediaData;
            }
            this.mVideoFrame.setToken(str3);
            return mediaData;
        } else if (recModel.liveUrlList != null && !recModel.liveUrlList.isEmpty()) {
            return com.taobao.taolive.sdk.model.common.a.a(com.taobao.taolive.room.utils.q.a(pqj.a(recModel)));
        } else {
            return null;
        }
    }

    private void initRec(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87dabe06", new Object[]{this, videoInfo});
            return;
        }
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        if (recModel == null || !recModel.isFirst || !aa.X()) {
            z = false;
        }
        if (!z) {
            return;
        }
        ddw.a().a(FullScreenFrame.EVENT_TYPE_UPDOWNSWITCH_INIT, videoInfo, this.frameContextUnique);
    }

    public void fetchCDNLiveInfo() {
        TBLiveRecEngineV2.RecModel recModel;
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb65f4", new Object[]{this});
        } else if (!aa.ax() || (recModel = this.mRecModel) == null || recModel.initParams == null || StringUtils.isEmpty(this.mRecModel.liveId) || (videoFrame2 = this.mVideoFrame) == null || videoFrame2.hasPreloaded()) {
        } else {
            String str = this.mRecModel.initParams.get(aw.PARAM_TIMEMOVING_ITEM_ID);
            if (!StringUtils.isEmpty(this.mRecModel.initParams.get(aw.PARAM_SJSD_ITEM_ID)) || !StringUtils.isEmpty(str)) {
                return;
            }
            if (this.mCDNFetchBusiness == null) {
                this.mCDNFetchBusiness = new com.taobao.taolive.sdk.business.i(this);
            }
            this.mCDNFetchBusiness.a("https://alive-interact.alicdn.com/livedetail/common/" + this.mRecModel.liveId);
        }
    }

    private void getLiveDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8efe2f5a", new Object[]{this});
        } else {
            getLiveDetail(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getLiveDetail(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.getLiveDetail(java.lang.String):void");
    }

    public VideoFrame2 createVideoFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoFrame2) ipChange.ipc$dispatch("f67dfdea", new Object[]{this}) : new VideoFrame2(this.mContext, false, this.mLiveDataModel, this.mFrameContext);
    }

    public void initVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfa5052", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.playcontrol.c.b(this.mFrameContext);
        if (this.mVideoFrame == null) {
            this.mVideoFrame = createVideoFrame();
            this.mVideoFrame.setOnVideoContainerShowListener(new VideoFrame.b() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.ui.component.VideoFrame.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    if (TaoLiveSingleRoomController.access$800(TaoLiveSingleRoomController.this) != null) {
                        TaoLiveSingleRoomController.access$800(TaoLiveSingleRoomController.this).d();
                    }
                    VideoInfo videoInfo = TaoLiveSingleRoomController.this.mLiveDataModel != null ? TaoLiveSingleRoomController.this.mLiveDataModel.mVideoInfo : null;
                    if (videoInfo == null || videoInfo.broadCaster == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("feedId", videoInfo.liveId);
                    hashMap.put("feed_id", videoInfo.liveId);
                    hashMap.put("account_id", videoInfo.broadCaster.accountId);
                    hashMap.put("deviceLevel", com.taobao.taolive.room.utils.k.a() + "");
                    ai.a((com.taobao.alilive.aliliveframework.frame.a) TaoLiveSingleRoomController.this.mFrameContext, ag.CLICK_SHOW_DIALOG, (Map<String, String>) hashMap);
                }
            });
            if (!com.taobao.taolive.sdk.utils.o.r()) {
                this.mVideoFrame.setOnVideoReloadClickListener(new VideoFrame.d() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.sdk.ui.component.VideoFrame.d
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            TaoLiveSingleRoomController.this.setVideoCoverDelay();
                        }
                    }
                });
            }
            this.mVideoFrame.setVideoCallback(this);
            this.mVideoFrame.setAnchorLeaveCallback(this);
            this.mVideoFrame.registerListener(this.mVideoStatusImpl);
            this.mVideoFrame.onCreateView((ViewStub) this.itemView.findViewById(R.id.taolive_base_video), "LiveRoom", com.taobao.taolive.room.utils.k.a(), 0L);
            this.mVideoFrame.setISeekStopTrackingListener(new VideoFrame.f() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.ui.component.VideoFrame.f
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else if (!z) {
                    } else {
                        ddw.a().a("com.taobao.taolive.room.video_bar_seek", null, TaoLiveSingleRoomController.this.frameContextUnique);
                    }
                }
            });
            this.mComponentManager.addComponent(this.mVideoFrame);
        }
        this.mVideoFrame.setLowDeviceFirstRender(poy.an(this.mFrameContext));
    }

    private void setVideoCoverImage(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e37ffc6", new Object[]{this, str, new Boolean(z)});
            return;
        }
        String str2 = TAG;
        ab.c(str2, "setVideoCoverImage imageUrl = " + str);
        this.mVideoFrame.setCoverImg(this.mContext.getResources().getDrawable(R.drawable.taolive_slice_scroll_common), true);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (aa.aM()) {
            TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
            int a2 = (recModel == null || recModel.initParams == null || this.mRecModel.initParams.get(aw.PARAM_COVER_GAUSS_SAMPLING) == null) ? 4 : v.a(this.mRecModel.initParams.get(aw.PARAM_COVER_GAUSS_SAMPLING), 4);
            TBLiveRecEngineV2.RecModel recModel2 = this.mRecModel;
            com.taobao.taolive.room.utils.g.a(str, this.mRoomLayout, -1, -1, new g.a() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.utils.g.a
                public void a(BitmapDrawable bitmapDrawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0084d5d", new Object[]{this, bitmapDrawable});
                    } else if (TaoLiveSingleRoomController.this.mVideoFrame == null || z || TaoLiveSingleRoomController.access$900(TaoLiveSingleRoomController.this)) {
                    } else {
                        String access$1000 = TaoLiveSingleRoomController.access$1000();
                        ab.c(access$1000, "setVideoCoverImage onSuccess = " + str);
                        TaoLiveSingleRoomController.this.mVideoFrame.setCoverImg(bitmapDrawable, true);
                        TaoLiveSingleRoomController.access$1100(TaoLiveSingleRoomController.this, bitmapDrawable);
                    }
                }

                @Override // com.taobao.taolive.room.utils.g.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    String access$1000 = TaoLiveSingleRoomController.access$1000();
                    ab.c(access$1000, "setVideoCoverImage onFail = " + str);
                    TaoLiveSingleRoomController.this.mVideoFrame.setCoverImg(TaoLiveSingleRoomController.this.mContext.getResources().getDrawable(R.drawable.taolive_slice_scroll_common), true);
                }
            }, (recModel2 == null || recModel2.initParams == null || this.mRecModel.initParams.get(aw.PARAM_COVER_GAUSS_RADIUS) == null) ? 25 : v.a(this.mRecModel.initParams.get(aw.PARAM_COVER_GAUSS_RADIUS), 25), a2);
            return;
        }
        com.taobao.taolive.room.utils.g.a(str, this.mRoomLayout, -1, -1, new g.a() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.utils.g.a
            public void a(BitmapDrawable bitmapDrawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0084d5d", new Object[]{this, bitmapDrawable});
                } else if (TaoLiveSingleRoomController.this.mVideoFrame == null || z || TaoLiveSingleRoomController.access$900(TaoLiveSingleRoomController.this)) {
                } else {
                    String access$1000 = TaoLiveSingleRoomController.access$1000();
                    ab.c(access$1000, "setVideoCoverImage onSuccess = " + str);
                    TaoLiveSingleRoomController.this.mVideoFrame.setCoverImg(bitmapDrawable, true);
                    TaoLiveSingleRoomController.access$1100(TaoLiveSingleRoomController.this, bitmapDrawable);
                }
            }

            @Override // com.taobao.taolive.room.utils.g.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                String access$1000 = TaoLiveSingleRoomController.access$1000();
                ab.c(access$1000, "setVideoCoverImage onFail = " + str);
                TaoLiveSingleRoomController.this.mVideoFrame.setCoverImg(TaoLiveSingleRoomController.this.mContext.getResources().getDrawable(R.drawable.taolive_slice_scroll_common), true);
            }
        });
    }

    private void setVideoFrameBlurBackgroundImg(Drawable drawable) {
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5c7f65", new Object[]{this, drawable});
        } else if (!y.a() || (videoFrame2 = this.mVideoFrame) == null || !(videoFrame2.getVideoView() instanceof FrameLayout) || !y.e(this.mContext)) {
        } else {
            ImageView imageView = new ImageView(this.mContext);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageDrawable(drawable);
            ((FrameLayout) this.mVideoFrame.getVideoView()).addView(imageView, 0, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.taobao.taolive.sdk.core.impl.TBLiveDataProvider.b
    public void onGetHeaderFields(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd45ac1", new Object[]{this, map});
        } else {
            com.taobao.taolive.sdk.utils.a.a(map, this.mContext);
        }
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i != 1004) {
            if (i != 1006) {
                return;
            }
            pib pibVar = this.mMediaStatusController;
            if (pibVar != null) {
                pibVar.e();
            }
            a aVar = this.mAutoDownController;
            if (aVar == null) {
                return;
            }
            aVar.g();
        } else {
            TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
            if (tBLiveBizDataModel != null && tBLiveBizDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.isOfficialType()) {
                Context context = this.mContext;
                com.taobao.taolive.room.utils.s.a(context, plz.a(this.mLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId) + "&livesource=guanfangtai&forceRefresh=true");
                return;
            }
            BaseFrame baseFrame = this.mComponentManager;
            if (baseFrame != null) {
                baseFrame.onVideoStatusChanged(5);
            }
            pib pibVar2 = this.mMediaStatusController;
            if (pibVar2 != null) {
                pibVar2.e();
            }
            a aVar2 = this.mAutoDownController;
            if (aVar2 == null) {
                return;
            }
            aVar2.h();
        }
    }

    private void showError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed586412", new Object[]{this});
            return;
        }
        if (aa.dp()) {
            if (this.mErrorView == null) {
                ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.taolive_status_error_stub);
                viewStub.setLayoutResource(R.layout.taolive_status_error_new_layout);
                this.mErrorView = viewStub.inflate();
            }
            View view = this.mErrorView;
            if (view != null) {
                TBErrorViewWidget tBErrorViewWidget = (TBErrorViewWidget) view.findViewById(R.id.error_view_widget);
                ViewGroup.LayoutParams layoutParams = tBErrorViewWidget.getLayoutParams();
                Context context = this.mContext;
                if (context instanceof Activity) {
                    layoutParams.width = TBErrorViewWidget.getSuggestedWidth((Activity) context);
                }
                tBErrorViewWidget.setLayoutParams(layoutParams);
                tBErrorViewWidget.setTopic(H5EmbedView.VIEW_TYPE);
                tBErrorViewWidget.setStatus(TBErrorViewWidget.Status.STATUS_NETWORK_ERROR);
                tBErrorViewWidget.setRefreshButton(new View.OnClickListener() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            TaoLiveSingleRoomController.access$400(TaoLiveSingleRoomController.this);
                        }
                    }
                });
                this.mErrorView.setVisibility(0);
            }
        } else {
            if (this.mErrorView == null) {
                ViewStub viewStub2 = (ViewStub) this.itemView.findViewById(R.id.taolive_status_error_stub);
                viewStub2.setLayoutResource(R.layout.taolive_status_error_layout);
                this.mErrorView = viewStub2.inflate();
            }
            View view2 = this.mErrorView;
            if (view2 != null) {
                ((TextView) view2.findViewById(R.id.taolive_error_title)).setText(R.string.taolive_status_error_hang);
                this.mErrorView.findViewById(R.id.taolive_error_button).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                        } else {
                            TaoLiveSingleRoomController.access$400(TaoLiveSingleRoomController.this);
                        }
                    }
                });
                this.mErrorView.setVisibility(0);
            }
        }
        ddw.a().a("com.taobao.taolive.room.show_error", null, this.frameContextUnique);
    }

    private void hideError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226b1f6d", new Object[]{this});
            return;
        }
        View view = this.mErrorView;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public void showWidgets(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b199de03", new Object[]{this, str});
        } else if ("fullScreenOverlay".equals(str)) {
            ViewGroup viewGroup = this.mRoomLayout;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(0);
        } else {
            if ("close".equals(str)) {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    View findViewById = ((Activity) context).findViewById(R.id.taolive_close_btn);
                    View findViewById2 = this.mRoomLayout.findViewById(R.id.taolive_close_backup_btn);
                    if (findViewById == null) {
                        return;
                    }
                    if (pmd.a().a("closeBtn") && !poy.as(this.mFrameContext)) {
                        findViewById.setVisibility(0);
                        if (findViewById2 == null) {
                            return;
                        }
                        findViewById2.setVisibility(8);
                        return;
                    }
                    findViewById.setVisibility(8);
                    return;
                }
            }
            IComponent componentByName = this.mComponentManager.getComponentByName(str);
            if (componentByName != null) {
                componentByName.show();
                return;
            }
            View viewByName = this.mComponentManager.getViewByName(str);
            if (viewByName == null) {
                return;
            }
            viewByName.setVisibility(0);
        }
    }

    public void hideWidgets(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df605dde", new Object[]{this, str});
        } else if ("fullScreenOverlay".equals(str)) {
            ViewGroup viewGroup = this.mRoomLayout;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
        } else {
            if ("close".equals(str)) {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    View findViewById = ((Activity) context).findViewById(R.id.taolive_close_btn);
                    View findViewById2 = this.mRoomLayout.findViewById(R.id.taolive_close_backup_btn);
                    if (findViewById == null) {
                        return;
                    }
                    findViewById.setVisibility(4);
                    if (findViewById2 == null) {
                        return;
                    }
                    findViewById2.setVisibility(0);
                    findViewById2.setBackgroundResource(R.drawable.taolive_room_close_btn_background_small);
                    ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                    int x = poz.x(com.taobao.taolive.room.utils.n.b(this.mFrameContext));
                    if (layoutParams != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.taobao.taolive.room.utils.d.a(this.mContext, 14.0f) + x;
                        findViewById2.setLayoutParams(layoutParams);
                    }
                    findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            } else {
                                ddw.a().a("com.taobao.taolive.room.killself", null, TaoLiveSingleRoomController.this.frameContextUnique);
                            }
                        }
                    });
                    final View findViewById3 = findViewById2.findViewById(R.id.taolive_room_top_more_btn);
                    findViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            } else {
                                ddw.a().a("com.taobao.taolive.room.more_btn_click", findViewById3, TaoLiveSingleRoomController.this.frameContextUnique);
                            }
                        }
                    });
                    return;
                }
            }
            IComponent componentByName = this.mComponentManager.getComponentByName(str);
            if (componentByName != null) {
                componentByName.hide();
                return;
            }
            View viewByName = this.mComponentManager.getViewByName(str);
            if (viewByName == null) {
                return;
            }
            viewByName.setVisibility(4);
        }
    }

    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (xkw.EVENT_MEDIAPLATFORM_HIDE_WIDGETS.equals(str)) {
            hideWidgets((String) obj);
        } else if (xkw.EVENT_MEDIAPLATFORM_SHOW_WIDGETS.equals(str)) {
            showWidgets((String) obj);
        } else if ("com.taobao.taolive.room.addcart_for_showcase".equals(str)) {
            if (!(obj instanceof LiveItem)) {
                return;
            }
            LiveItem liveItem = (LiveItem) obj;
            HashMap hashMap = new HashMap();
            if (liveItem.extraUTParams != null) {
                hashMap.putAll(liveItem.extraUTParams);
            }
            hashMap.put("channel", ITemplateSyncService.LAYOUT_STYLE_BUBBLE);
            hashMap.put("laiyuan", "1");
            if (liveItem.extendVal != null) {
                hashMap.put("itemBizType", liveItem.extendVal.itemBizType);
            }
            com.taobao.taolive.room.utils.c.a((Activity) this.mContext, 10000, liveItem, hashMap);
        } else if (FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN.equals(str)) {
            showWidgets("close");
        } else if (VideoFrame.EVENT_ACTION_SHOW_SWITCH_TIP.equals(str)) {
            showMoreTip();
        } else if (!"com.taobao.taolive.room.ent.opt.animation.end".equals(str)) {
        } else {
            onDelayDidAppear();
        }
    }

    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_MEDIAPLATFORM_SHOW_WIDGETS, xkw.EVENT_MEDIAPLATFORM_HIDE_WIDGETS, "com.taobao.taolive.room.addcart_for_showcase", FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN, "taolive.more.live.status", VideoFrame.EVENT_ACTION_SHOW_SWITCH_TIP, "com.taobao.taolive.room.ent.opt.animation.end"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        g gVar = this.mFrameContext;
        if (gVar != null) {
            return gVar.G();
        }
        return null;
    }

    private void updateBackward() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c94e53", new Object[]{this});
            return;
        }
        if (com.taobao.android.live.plugin.proxy.c.a().d() && com.taobao.android.live.plugin.proxy.f.p().getBackwardX() != null) {
            com.taobao.android.live.plugin.proxy.f.p().getBackwardX().a(this.mLiveDataModel, this.mGlobalContext, this.mFrameContext);
        }
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        boolean z2 = recModel != null ? recModel.isFirst : true;
        if (v.e(this.mLiveDataModel.mInitParams.get(aw.PARAM_BACKWARD_SWITCH)) && z2) {
            z = true;
        }
        poz.a(z, this.mGlobalContext);
        if (poy.i(this.mFrameContext)) {
            String O = poy.O(this.mFrameContext);
            String k = poy.k(this.mFrameContext);
            if (!StringUtils.isEmpty(k)) {
                O = k;
            }
            poz.m(O, this.mGlobalContext);
        } else {
            poz.l((String) null, this.mGlobalContext);
            poz.m((String) null, this.mGlobalContext);
        }
        poz.n(this.mLiveDataModel.mInitParams.get(aw.PARAM_INTENT_URL), this.mGlobalContext);
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what != 5) {
        } else {
            setVideoCoverDelay();
        }
    }

    public void setVideoCoverDelay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff4582c", new Object[]{this});
            return;
        }
        VideoFrame2 videoFrame2 = this.mVideoFrame;
        if (videoFrame2 == null) {
            return;
        }
        if (videoFrame2.getVideoView() != null && this.mVideoFrame.getVideoView().getWidth() > 0) {
            setVideoCoverImage(this.mRecModel.imageUrl, false);
        } else {
            this.mHandler.sendEmptyMessageDelayed(5, 16L);
        }
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        BaseFrame baseFrame = this.mRoomController;
        if (baseFrame != null && (baseFrame instanceof TaoLiveNormalRoomController)) {
            return ((TaoLiveNormalRoomController) baseFrame).getUbeeContainer();
        }
        BaseFrame baseFrame2 = this.mRoomController;
        if (baseFrame2 != null && (baseFrame2 instanceof TaoliveHighlightController)) {
            return ((TaoliveHighlightController) baseFrame2).getUbeeContainer();
        }
        return null;
    }

    private void uploadFirstFramePoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df234e39", new Object[]{this});
            return;
        }
        String p = poz.p(com.taobao.taolive.room.utils.n.b(this.mFrameContext));
        if (!u.aD() || StringUtils.equals(ag.SOURCE_UPDOWNSWITCH, p)) {
            return;
        }
        com.taobao.taolive.sdk.monitor.b.b().a("LIVE_CODE_BOOT_STAGE", SceneStage.SCENE_STAGE_T1);
        ab.e("LIVE_CODE_BOOT_STAGE", "stage:t1");
    }

    private void trackTimeShiftShow(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febe1a18", new Object[]{this, str});
        } else if (com.taobao.taolive.sdk.playcontrol.c.i(this.mFrameContext) != VideoStatus.VIDEO_TIMESHIFT_STATUS) {
        } else {
            HashMap hashMap = new HashMap();
            VideoInfo u = poy.u(this.mFrameContext);
            if (u != null) {
                if (u.broadCaster != null) {
                    hashMap.put("account_id", u.broadCaster.accountId);
                }
                hashMap.put("feed_id", u.liveId);
            }
            if (this.mPlayStartTime > 0) {
                hashMap.put("timelength", Long.toString(System.currentTimeMillis() - this.mPlayStartTime));
            }
            hashMap.put("status", str);
            ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "Show-TimeShiftLength", (HashMap<String, String>) hashMap);
        }
    }

    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame == null) {
            return;
        }
        baseFrame.onScrollStateChanged(i);
    }

    @Override // com.taobao.taolive.sdk.business.f
    public void onSuccess(Object obj) {
        pmf t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            return;
        }
        SimpleLiveInfo simpleLiveInfo = (SimpleLiveInfo) pqj.a((String) obj, SimpleLiveInfo.class);
        if (this.mVideoFrame == null || simpleLiveInfo == null || StringUtils.isEmpty(this.mRequestLiveId) || !this.mRequestLiveId.equals(simpleLiveInfo.liveId) || simpleLiveInfo.roomStatus != 1 || simpleLiveInfo.liveUrlList == null || simpleLiveInfo.liveUrlList.isEmpty()) {
            return;
        }
        MediaData mediaData = new MediaData();
        int size = simpleLiveInfo.liveUrlList.size();
        mediaData.h265 = simpleLiveInfo.h265;
        mediaData.rateAdapte = simpleLiveInfo.rateAdapte;
        mediaData.edgePcdn = simpleLiveInfo.edgePcdn;
        mediaData.mediaConfig = simpleLiveInfo.mediaConfig;
        if (simpleLiveInfo.broadCaster != null) {
            mediaData.anchorId = simpleLiveInfo.broadCaster.accountId;
        }
        mediaData.liveId = simpleLiveInfo.liveId;
        mediaData.mediaSourceType = simpleLiveInfo.pushFeature;
        mediaData.liveUrlList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            QualitySelectItem qualitySelectItem = simpleLiveInfo.liveUrlList.get(i);
            MediaData.QualityLiveItem qualityLiveItem = new MediaData.QualityLiveItem();
            qualityLiveItem.artpUrl = qualitySelectItem.artpUrl;
            qualityLiveItem.definition = qualitySelectItem.definition;
            qualityLiveItem.flvUrl = qualitySelectItem.flvUrl;
            qualityLiveItem.h265Url = qualitySelectItem.h265Url;
            qualityLiveItem.hlsUrl = qualitySelectItem.hlsUrl;
            qualityLiveItem.name = qualitySelectItem.name;
            qualityLiveItem.bfrtcUrl = qualitySelectItem.bfrtcUrl;
            qualityLiveItem.liveUrlMiniBfrtc = qualitySelectItem.liveUrlMiniBfrtc;
            qualityLiveItem.rtcLiveUrl = qualitySelectItem.rtcLiveUrl;
            qualityLiveItem.wholeH265FlvUrl = qualitySelectItem.wholeH265FlvUrl;
            qualityLiveItem.wholeH265ArtpUrl = qualitySelectItem.wholeH265ArtpUrl;
            qualityLiveItem.unit = qualitySelectItem.unit;
            qualityLiveItem.unitType = qualitySelectItem.unitType;
            qualityLiveItem.newDefinition = qualitySelectItem.newDefinition;
            qualityLiveItem.recomm = qualitySelectItem.recomm;
            qualityLiveItem.newName = qualitySelectItem.newName;
            qualityLiveItem.liveStreamStatsInfo = qualitySelectItem.liveStreamStatsInfo;
            mediaData.liveUrlList.add(qualityLiveItem);
            if (i == 0) {
                mediaData.dataTracks = qualitySelectItem.dataTracks;
            }
        }
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            pkmVar.e("cdnLiveUrlList");
            this.mPerfomenceTrackManager.f(this.mTrackId);
        }
        if (!StringUtils.isEmpty(mediaData.dataTracks) && (t = pmd.a().t()) != null) {
            t.a(mediaData.dataTracks, this.mContext);
        }
        if (com.taobao.taolive.sdk.utils.o.t()) {
            this.mVideoFrame.playVideoCDN(mediaData, false);
        } else {
            this.mVideoFrame.preloadVideo(mediaData);
        }
        onLiveStartPlay(false);
        com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
    }

    @Override // com.taobao.taolive.sdk.business.f
    public void onError(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
        } else {
            com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
        }
    }

    public void onGetVideoInfoSuccess(VideoInfo videoInfo, String str) {
        TBLiveBizDataModel tBLiveBizDataModel;
        pkn e;
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889673f", new Object[]{this, videoInfo, str});
            return;
        }
        if (videoInfo != null) {
            Log.e("SingleRoomLifeCycle", "onGetVideoInfoSuccess " + videoInfo.liveId + " mRequestLiveId = " + this.mRequestLiveId + " mRequestAccountId = " + this.mRequestAccountId + this);
        }
        com.taobao.taolive.room.pre.a.a().a(com.taobao.taolive.room.utils.m.b() ? com.taobao.taolive.room.pre.a.ISAFCCOLDCONTEXT_KEY : this.mRequestLiveId);
        if (this.mIsDestroyed || videoInfo == null || videoInfo.broadCaster == null) {
            return;
        }
        VideoFrame2 videoFrame2 = this.mVideoFrame;
        if (videoFrame2 != null && !videoFrame2.hasPreloaded()) {
            updatePlayerSoReport();
        }
        boolean e2 = v.e(this.mRecModel.initParams.get(aw.PARAM_NEED_RECOMMEND));
        boolean z = videoInfo.roomType == 13 || poy.b(videoInfo, this.mFrameContext);
        if (!e2 && !z && !checkLiveId(videoInfo) && !checkTopic(videoInfo) && !checkAccountId(videoInfo)) {
            return;
        }
        this.mRequestLiveId = null;
        this.mRequestAccountId = null;
        Log.e("SingleRoomLifeCycle", "onGetVideoInfoSuccess checkLiveId = true" + videoInfo.liveId + this);
        this.mFrameContext.a(videoInfo);
        if (u.aW() && (gVar = this.mFrameContext) != null) {
            gVar.a((dds) new com.taobao.taolive.room.business.mess.e());
        }
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.a(videoInfo);
        }
        updateUrlListAndSwitch(videoInfo);
        checkLiveDetailError(videoInfo, e2);
        com.taobao.taolive.room.utils.m.a(this.mFrameContext, videoInfo.roomStatus);
        com.taobao.taolive.movehighlight.utils.f.a().d(System.currentTimeMillis());
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null && pkmVar.a() != null && (e = pko.a().e(this.mPerfomenceTrackManager.a())) != null) {
            e.d = String.valueOf(videoInfo.status);
        }
        pib pibVar = this.mMediaStatusController;
        if (pibVar != null) {
            pibVar.a(videoInfo.status == 0);
        }
        if (videoInfo.status == 1 && StringUtils.isEmpty(videoInfo.replayUrl)) {
            if (StringUtils.isEmpty(videoInfo.broadCaster.accountInfoUrl)) {
                return;
            }
            pmd.a().r().a(this.mContext, videoInfo.broadCaster.accountInfoUrl, null);
            ddw.a().a("com.taobao.taolive.room.killself", null, this.frameContextUnique);
            return;
        }
        updateVoiceSilent(videoInfo.voiceSilent);
        if (poy.b(this.mFrameContext)) {
            poy.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, false);
            poy.a(this.mFrameContext, videoInfo.liveId);
        }
        if (poy.b(this.mFrameContext)) {
            poy.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, false);
            poy.a(this.mFrameContext, videoInfo.liveId);
        }
        updateDisPatchTrackInfo(videoInfo.disPatchTrackInfo);
        if (StringUtils.isEmpty(this.mRecModel.liveId)) {
            this.mRecModel.liveId = videoInfo.liveId;
        }
        if (StringUtils.isEmpty(this.mRecModel.accountId)) {
            this.mRecModel.accountId = videoInfo.broadCaster.accountId;
        }
        if (StringUtils.isEmpty(this.mRecModel.actionUrl)) {
            this.mRecModel.actionUrl = com.taobao.taolive.room.utils.c.d(videoInfo.nativeFeedDetailUrl, ag.SOURCE_UPDOWNSWITCH);
            String O = poy.O(this.mFrameContext);
            if (!StringUtils.isEmpty(O)) {
                String queryParameter = Uri.parse(O).getQueryParameter("liveAdParams");
                if (!StringUtils.isEmpty(queryParameter)) {
                    TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
                    recModel.actionUrl = this.mRecModel.actionUrl + "&liveAdParams=" + Uri.encode(queryParameter);
                }
            }
        }
        if (this.mRecModel.liveUrlList == null) {
            this.mRecModel.liveUrlList = videoInfo.liveUrlList;
            this.mRecModel.h265 = videoInfo.h265;
            this.mRecModel.rateAdapte = videoInfo.rateAdapte;
            this.mRecModel.edgePcdn = videoInfo.edgePcdn;
            this.mRecModel.mediaConfig = videoInfo.mediaConfig;
        }
        if (this.mRecModel.isFirst && videoInfo.status != 0 && videoInfo.status != 3) {
            this.mRecModel.supportPreLoad = 0;
        }
        if (poy.af(this.mFrameContext) && aa.cC() && videoInfo.itemConfigInfo != null) {
            videoInfo.itemConfigInfo.put("insideDetail", (Object) false);
        }
        this.mLiveDataModel = new TBLiveBizDataModel();
        this.mLiveDataModel.mViewItemId = this.mRecModel.getViewItemId();
        TBLiveBizDataModel tBLiveBizDataModel2 = this.mLiveDataModel;
        tBLiveBizDataModel2.mVideoInfo = videoInfo;
        try {
            tBLiveBizDataModel2.mVideoInfo.originalData = JSONObject.parseObject(str);
        } catch (Exception unused) {
        }
        TBLiveBizDataModel tBLiveBizDataModel3 = this.mLiveDataModel;
        tBLiveBizDataModel3.mFandomInfo = null;
        tBLiveBizDataModel3.mRoomInfo = new ChatRoomInfo();
        this.mLiveDataModel.mRoomInfo.roomId = videoInfo.topic;
        TBLiveBizDataModel tBLiveBizDataModel4 = this.mLiveDataModel;
        tBLiveBizDataModel4.mRawData = str;
        tBLiveBizDataModel4.mInitParams = new HashMap();
        this.mLiveDataModel.mInitParams.putAll(this.mRecModel.initParams);
        this.mLiveDataModel.mActionUrl = this.mRecModel.actionUrl;
        this.mLiveDataModel.perfomenceTrackManager = this.mPerfomenceTrackManager;
        poz.u(this.mRecModel.isFirst, com.taobao.taolive.room.utils.n.b(this.mFrameContext));
        com.taobao.taolive.sdk.controller.e eVar = this.mGlobalContext;
        if (eVar != null && eVar.F != null && this.mGlobalContext.F.f() && this.mLiveDataModel != null) {
            this.mGlobalContext.F.a(this.mLiveDataModel);
        }
        this.mFrameContext.a(this.mRecModel.initParams);
        this.mFrameContext.z = this.mGlobalContext.r;
        if (tki.a() && (tBLiveBizDataModel = this.mLiveDataModel) != null) {
            b.a(this.mContext, this.mFrameContext, tBLiveBizDataModel);
        }
        pqi.a().b("liveDetail", str);
        updateBackward();
        hideError();
        boolean e3 = v.e(this.mLiveDataModel.mInitParams.get(aw.PARAM_SHOW_ANIMATED));
        ViewGroup viewGroup = this.mRoomLayout;
        if (viewGroup != null && e3) {
            viewGroup.setAlpha(0.0f);
        }
        String str2 = this.mRecModel.initParams.get(aw.PARAM_TRANSPARENT_PARAMS);
        pfa a2 = pfa.a(this.mFrameContext);
        a2.a(new phu());
        pfa.a().a(new phu());
        if (a2.b() != null) {
            a2.b().a(str2);
        }
        initKandianUTParams();
        poy.f(false, (com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext);
        poy.a(0, this.mFrameContext);
        pfb.a(this.mFrameContext).a(new pff());
        pfb.a().a(new pff());
        com.taobao.taolive.movehighlight.bean.a a3 = com.taobao.taolive.movehighlight.utils.l.a(this.mLiveDataModel.mVideoInfo, this.mLiveDataModel.mInitParams.get(aw.PARAM_SJSD_ITEM_ID), this.mLiveDataModel.mInitParams.get(aw.PARAM_TIMEMOVE_KEYPOINTID));
        if (a3 != null || "true".equals(this.mLiveDataModel.mInitParams.get("highlightSignByRePlay"))) {
            com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
            com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, VideoStatus.VIDEO_TIMESHIFT_STATUS);
            if ((this.mRecModel.isFirst || this.entryByShop2F) && com.taobao.taolive.movehighlight.utils.d.f21479a) {
                poy.a(1, this.mFrameContext);
            }
            a2.f32580a = this.mRecModel.initParams.get("scm");
            TBLiveBizDataModel tBLiveBizDataModel5 = this.mLiveDataModel;
            if (tBLiveBizDataModel5 == null || tBLiveBizDataModel5.mVideoInfo == null) {
                return;
            }
            com.taobao.taolive.sdk.core.j.a(this.mFrameContext, this.mLiveDataModel);
            TBLiveBizDataModel tBLiveBizDataModel6 = this.mLiveDataModel;
            if (tBLiveBizDataModel6 != null) {
                poy.a(tBLiveBizDataModel6, tBLiveBizDataModel6.mVideoInfo, this.mFrameContext);
            }
            if (this.mRecModel.liveUrlList != null) {
                this.mRecModel.liveUrlList = null;
            }
            BaseFrame baseFrame = this.mRoomController;
            if (baseFrame != null && !(baseFrame instanceof TaoliveHighlightController)) {
                this.mComponentManager.deleteComponent(baseFrame);
                this.mRoomController.onDestroy();
                this.mRoomController = null;
            }
            poy.f(true, (com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext);
            if ((this.mRoomController instanceof TaoliveHighlightController) && com.taobao.taolive.movehighlight.utils.c.r()) {
                ((TaoliveHighlightController) this.mRoomController).setmBasePreloadRequest(this.highlightPreloadTimeMove);
            }
            this.mComponentManager.onBindData(this.mLiveDataModel);
            if (this.mRoomController == null) {
                this.mRoomController = new TaoliveHighlightController(this.mContext, videoInfo.landScape, this.mLiveDataModel, this.mFrameContext);
                ((TaoliveHighlightController) this.mRoomController).initFrameLayout(this.mVideoFrame, this.mRoomLayout, (AliUrlImageView) this.itemView.findViewById(R.id.taolive_background_image), this.mPerfomenceTrackManager, a3, this.highlightPreloadTimeMove);
                this.mComponentManager.addComponent(this.mRoomController);
            }
            pkm pkmVar2 = this.mPerfomenceTrackManager;
            if (pkmVar2 != null) {
                pkmVar2.g(RecModel.MEDIA_TYPE_TIMEMOVE);
            }
            g gVar2 = this.mFrameContext;
            if (gVar2 != null && (gVar2.y() instanceof c)) {
                ((c) this.mFrameContext.y()).f = RecModel.MEDIA_TYPE_TIMEMOVE;
            }
            setPlayReportFeedType("timeshift");
        } else {
            com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, VideoStatus.VIDEO_NORMAL_STATUS);
            BaseFrame baseFrame2 = this.mRoomController;
            if (baseFrame2 != null && !(baseFrame2 instanceof TaoLiveNormalRoomController)) {
                this.mComponentManager.deleteComponent(baseFrame2);
                this.mRoomController.onDestroy();
                this.mRoomController = null;
            }
            poy.f(false, (com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext);
            this.mComponentManager.onBindData(this.mLiveDataModel);
            com.taobao.taolive.sdk.utils.q.b("JingChunLifecycle", "TaoLiveSingleRoomController onBindData liveId=" + this.mRecModel.liveId);
            if (this.mRoomController == null) {
                this.mRoomController = new TaoLiveNormalRoomController(this.mContext, videoInfo.landScape, this.mLiveDataModel, this.itemView, this.mVideoFrame, this.mFrameContext);
                ((TaoLiveNormalRoomController) this.mRoomController).setVideoCallback(this);
                this.mComponentManager.addComponent(this.mRoomController);
            }
            g gVar3 = this.mFrameContext;
            if (gVar3 != null && (gVar3.y() instanceof c)) {
                if (RecModel.MEDIA_TYPE_TIMEMOVE.equals(((c) this.mFrameContext.y()).f)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("direction", "live");
                    ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "jiangjie_slide", (Map<String, String>) hashMap);
                }
                ((c) this.mFrameContext.y()).f = "live";
            }
        }
        ViewGroup viewGroup2 = this.mRoomLayout;
        if (viewGroup2 != null && e3) {
            ObjectAnimator.ofFloat(viewGroup2, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
        initRec(videoInfo);
        if (videoInfo.isOfficialLive()) {
            ddw.a().a("com.taobao.taolive.room.updownswitch.official.dedup", videoInfo, this.frameContextUnique);
        }
        com.taobao.taolive.movehighlight.utils.d.f21479a = false;
        updatePlayerExpParams(videoInfo);
        if (this.mPerfomenceTrackManager != null && videoInfo.dynamicRender != null && videoInfo.dynamicRender.h5DynamicRenderVersion != null) {
            this.mPerfomenceTrackManager.d(videoInfo.dynamicRender.h5DynamicRenderVersion);
        }
        if ("fullLive".equals(curLiveScene()) || "shop2fLive".equals(curLiveScene())) {
            reportAboutMute(com.taobao.taolive.sdk.ui.media.mute.b.d(this.mContext));
        }
        if (aa.bS()) {
            com.taobao.android.live.plugin.proxy.f.q().jump302(this.mContext, this.mGlobalContext, this.mLiveDataModel);
        }
        updateRationType(videoInfo);
        initRecommendPop();
    }

    private void checkLiveDetailError(VideoInfo videoInfo, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c716da31", new Object[]{this, videoInfo, new Boolean(z)});
        } else if (videoInfo == null) {
        } else {
            TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
            if (recModel != null) {
                boolean z3 = recModel.liveId != null && !this.mRecModel.liveId.isEmpty();
                boolean z4 = this.mRecModel.accountId != null && !this.mRecModel.accountId.isEmpty();
                boolean z5 = z3 ? !this.mRecModel.liveId.equals(videoInfo.liveId) : false;
                boolean z6 = z4 ? !this.mRecModel.accountId.equals(videoInfo.broadCaster.accountId) : false;
                if (!z && (z5 || z6)) {
                    z2 = true;
                }
            }
            if (!z2) {
                return;
            }
            reportCheckLiveDetailWithBindModelError(this.mRecModel.liveId, this.mRecModel.accountId, (videoInfo == null || videoInfo.liveId == null) ? "null" : videoInfo.liveId, this.mFrameContext.j() != null ? this.mFrameContext.j() : "unknown");
        }
    }

    private void setPlayReportFeedType(String str) {
        pkn e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6292b4b3", new Object[]{this, str});
        } else if (!aa.bj() || this.mFrameContext == null || (e = pko.a().e(this.mFrameContext.j())) == null) {
        } else {
            e.j = str;
        }
    }

    private void initRecommendPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73aab2c", new Object[]{this});
        } else if (aa.ap() && (!this.mDidAppear || this.mLiveDataModel == null || this.mRecommendPop != null)) {
        } else {
            if (qne.b(poy.ac(this.mFrameContext), poy.R(this.mFrameContext)) && this.mLiveDataModel != null) {
                ViewGroup viewGroup = null;
                ViewGroup viewGroup2 = this.mRoomLayout;
                if (viewGroup2 != null) {
                    viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.taolive_open_popview_frame);
                }
                if (viewGroup == null) {
                    viewGroup = poz.b(this.mContext, com.taobao.taolive.room.utils.n.b(this.mFrameContext));
                }
                IRecommendPopProxy r = com.taobao.android.live.plugin.proxy.f.r();
                Context context = this.mContext;
                g gVar = this.mFrameContext;
                this.mRecommendPop = r.createRecommendPop(context, viewGroup, gVar, this.mLiveDataModel, this.mComponentManager, new com.taobao.taolive.room.mediaplatform.i(gVar));
            }
            if (this.mRecommendPop == null) {
                return;
            }
            Context context2 = this.mContext;
            this.mRecommendPop.a(String.valueOf(poy.ai(this.mFrameContext)), poy.K(this.mFrameContext), poy.T(this.mFrameContext), poy.ac(this.mFrameContext), poy.R(this.mFrameContext), ai.d(this.mFrameContext), (!(context2 instanceof Activity) || ((Activity) context2).getIntent() == null) ? "" : ((Activity) this.mContext).getIntent().getDataString());
            this.mRecommendPop.a(new pku());
            this.mRecommendPop.a(new com.taobao.taolive.room.mediaplatform.f(this.mFrameContext));
        }
    }

    private void updatePlayerSoReport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bedd2161", new Object[]{this});
            return;
        }
        pkm pkmVar = this.mPerfomenceTrackManager;
        String str = "installed";
        if (pkmVar != null) {
            pkmVar.a("playerSoState", com.taobao.taobaoavsdk.c.a() ? str : "installing");
        }
        HashMap hashMap = new HashMap();
        if (!com.taobao.taobaoavsdk.c.a()) {
            str = "installing";
        }
        hashMap.put("playerSoState", str);
        ai.a(this.mFrameContext, this.mContext, hashMap);
    }

    private void updateDisPatchTrackInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0295a7", new Object[]{this, str});
            return;
        }
        if (aa.bh() && StringUtils.isEmpty(poz.b(com.taobao.taolive.room.utils.n.b(this.mFrameContext))) && !StringUtils.isEmpty(str)) {
            poz.b(str, com.taobao.taolive.room.utils.n.b(this.mFrameContext));
        }
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        if (recModel == null || recModel.initParams == null || !StringUtils.isEmpty(this.mRecModel.initParams.get("trackInfo")) || StringUtils.isEmpty(str)) {
            return;
        }
        this.mRecModel.initParams.put("trackInfo", str);
    }

    private void initKandianUTParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c632be26", new Object[]{this});
            return;
        }
        poy.h(null, this.mFrameContext);
        poy.g(null, this.mFrameContext);
        poy.i(null, this.mFrameContext);
        com.taobao.taolive.movehighlight.utils.d.c = null;
    }

    public void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d6dd", new Object[]{this, fandomInfo, str});
            return;
        }
        com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
        com.taobao.taolive.room.pre.a.a().a(com.taobao.taolive.room.utils.m.b() ? com.taobao.taolive.room.pre.a.ISAFCCOLDCONTEXT_KEY : this.mRequestLiveId);
        if (this.mIsDestroyed || fandomInfo == null || StringUtils.isEmpty(fandomInfo.bbQJumpH5) || !(this.mContext instanceof Activity)) {
            return;
        }
        String c = poz.c(this.mGlobalContext);
        String str2 = null;
        if (!StringUtils.isEmpty(c)) {
            str2 = Uri.parse(c).getQuery();
        }
        String str3 = fandomInfo.bbQJumpH5;
        if (!StringUtils.isEmpty(str2)) {
            if (str3.contains("?")) {
                str3 = str3 + "&" + str2;
            } else {
                str3 = str3 + "?" + str2;
            }
        }
        com.taobao.taolive.room.utils.s.a(this.mContext, str3);
        Context context = this.mContext;
        if (context instanceof BaseActivity) {
            ((BaseActivity) context).finish(true);
        } else {
            ((Activity) context).finish();
        }
    }

    private boolean checkAccountId(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a2e5b6a", new Object[]{this, videoInfo})).booleanValue();
        }
        if (StringUtils.isEmpty(this.mRequestAccountId) || videoInfo.broadCaster == null) {
            return false;
        }
        return isOfficialType(videoInfo) ? this.mRequestAccountId.equals(videoInfo.officialLiveInfo.accountId) : this.mRequestAccountId.equals(videoInfo.broadCaster.accountId);
    }

    private boolean checkLiveId(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8be7c4bb", new Object[]{this, videoInfo})).booleanValue();
        }
        if (StringUtils.isEmpty(this.mRequestLiveId) || videoInfo == null) {
            return false;
        }
        return isOfficialType(videoInfo) ? this.mRequestLiveId.equals(videoInfo.officialLiveInfo.officialLiveId) : this.mRequestLiveId.equals(videoInfo.liveId);
    }

    private boolean isOfficialType(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbd783fb", new Object[]{this, videoInfo})).booleanValue() : videoInfo != null && videoInfo.officialLiveInfo != null && aa.bZ() && "official".equals(videoInfo.officialLiveInfo.officialLive);
    }

    private boolean checkTopic(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a5ab703", new Object[]{this, videoInfo})).booleanValue() : !StringUtils.isEmpty(this.mRequestLiveId) && this.mRequestLiveId.equals(videoInfo.topic);
    }

    public void onGetVideoInfoFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa662561", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.room.pre.a.a().a(com.taobao.taolive.room.utils.m.b() ? com.taobao.taolive.room.pre.a.ISAFCCOLDCONTEXT_KEY : this.mRequestLiveId);
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        com.taobao.taolive.room.utils.a.a(context, this.mFrameContext);
        this.mRequestLiveId = null;
        this.mRequestAccountId = null;
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.c();
        }
        pqi.a().c(TAG, "STATUS_INIT_FAIL");
        if (com.taobao.taolive.sdk.utils.k.a(str) || com.taobao.taolive.sdk.utils.k.b(str)) {
            plk.a(this.mContext, R.string.taolive_status_error_traffic_limit);
            com.taobao.taolive.room.utils.s.a(this.mContext, aa.P());
            ddw.a().a("com.taobao.taolive.room.killself", null, this.frameContextUnique);
            return;
        }
        if (ErrorConstant.ERRCODE_NO_NETWORK.equals(str)) {
            plk.a(this.mContext, "手机网络未打开，请联网后重试");
        }
        showError();
        pib pibVar = this.mMediaStatusController;
        if (pibVar == null) {
            return;
        }
        pibVar.f();
    }

    @Override // com.taobao.taolive.sdk.ui.component.c
    public void onLiveStartPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8945e82", new Object[]{this, new Boolean(z)});
            return;
        }
        g gVar = this.mFrameContext;
        if (gVar != null && gVar.x() != null) {
            updateRationType(this.mFrameContext.x());
        }
        if (this.mFrameContext.s != null) {
            this.mFrameContext.s.a();
        }
        if (this.mFrameContext.C != null) {
            this.mFrameContext.C.a();
        }
        com.taobao.taolive.room.utils.m.i(this.mFrameContext);
        pib pibVar = this.mMediaStatusController;
        if (pibVar != null) {
            pibVar.a();
        }
        VideoFrame2 videoFrame2 = this.mVideoFrame;
        if (videoFrame2 != null) {
            if (videoFrame2.hasFirstFrame()) {
                onFirstFrame();
                this.mPerfomenceTrackManager.a(this.mTrackId, 0L);
            }
            if (this.mVideoFrame.getTaoVideoView() != null && this.mVideoFrame.getTaoVideoView().J() != 2) {
                this.mVideoFrame.getTaoVideoView().b(this.mContext);
            }
        }
        updatePerformancePlayMode();
    }

    private void onFirstFrame() {
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e6aa63", new Object[]{this});
            return;
        }
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.d();
        }
        pib pibVar = this.mMediaStatusController;
        if (pibVar != null) {
            pibVar.b();
        }
        VideoFrame2 videoFrame22 = this.mVideoFrame;
        if (videoFrame22 != null) {
            videoFrame22.onFirstFrame();
        }
        pos posVar = (pos) ppn.a().a(this.mFrameContext.j(), pos.class);
        if (posVar != null) {
            posVar.a();
        }
        uploadFirstFramePoint();
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null && (videoFrame2 = this.mVideoFrame) != null) {
            pkmVar.h(videoFrame2.getMediaPlayToken());
        }
        com.taobao.taolive.room.utils.m.h(this.mFrameContext);
        com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
        TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
        if (tBLiveBizDataModel == null) {
            return;
        }
        updatePlayerExpParams(tBLiveBizDataModel.mVideoInfo);
    }

    @Override // com.taobao.taolive.sdk.ui.component.c
    public void onVideoPlayError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8079eda4", new Object[]{this, new Integer(i)});
            return;
        }
        pib pibVar = this.mMediaStatusController;
        if (pibVar != null) {
            pibVar.c();
        }
        a aVar = this.mAutoDownController;
        if (aVar != null) {
            aVar.a(i);
        }
        com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
    }

    public void checkDisplayCutout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c547228d", new Object[]{this});
        } else if (poz.v(com.taobao.taolive.room.utils.n.b(this.mFrameContext)) || !(this.mContext instanceof Activity)) {
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                ((Activity) this.mContext).getWindow().getDecorView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.taolive.room.controller2.TaoLiveSingleRoomController.15
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        } else if (TaoLiveSingleRoomController.this.mContext == null) {
                        } else {
                            pmd.a().m().b(MediaConstant.LBLIVE_SOURCE, "onLayoutChange ========= ");
                            WindowInsets rootWindowInsets = ((Activity) TaoLiveSingleRoomController.this.mContext).getWindow().getDecorView().getRootWindowInsets();
                            pnj m = pmd.a().m();
                            m.b(MediaConstant.LBLIVE_SOURCE, "mInsets ========= " + rootWindowInsets);
                            if (!com.taobao.taolive.room.ui.a.a((Activity) TaoLiveSingleRoomController.this.mContext) || rootWindowInsets == null) {
                                poz.m(false, com.taobao.taolive.room.utils.n.b(TaoLiveSingleRoomController.this.mFrameContext));
                            } else {
                                boolean a2 = com.taobao.taolive.room.ui.a.a(TaoLiveSingleRoomController.this.mContext, rootWindowInsets);
                                poz.m(a2, com.taobao.taolive.room.utils.n.b(TaoLiveSingleRoomController.this.mFrameContext));
                                if (a2) {
                                    pnj m2 = pmd.a().m();
                                    m2.b(MediaConstant.LBLIVE_SOURCE, "mCutoutHeight = " + com.taobao.taolive.room.c.b);
                                    int c = com.taobao.taolive.room.ui.a.c(TaoLiveSingleRoomController.this.mContext, rootWindowInsets);
                                    poz.b(c, com.taobao.taolive.room.utils.n.b(TaoLiveSingleRoomController.this.mFrameContext));
                                    poz.c(c, com.taobao.taolive.room.utils.n.b(TaoLiveSingleRoomController.this.mFrameContext));
                                    com.taobao.taolive.room.service.d.a(TaoLiveSingleRoomController.this.mFrameContext.y());
                                    ((Activity) TaoLiveSingleRoomController.this.mContext).getWindow().getDecorView().removeOnLayoutChangeListener(this);
                                }
                            }
                            poz.b(0, com.taobao.taolive.room.utils.n.b(TaoLiveSingleRoomController.this.mFrameContext));
                            poz.c(0, com.taobao.taolive.room.utils.n.b(TaoLiveSingleRoomController.this.mFrameContext));
                            com.taobao.taolive.room.service.d.a(TaoLiveSingleRoomController.this.mFrameContext.y());
                            ((Activity) TaoLiveSingleRoomController.this.mContext).getWindow().getDecorView().removeOnLayoutChangeListener(this);
                        }
                    }
                });
            } else {
                poz.m(false, com.taobao.taolive.room.utils.n.b(this.mFrameContext));
                poz.b(0, com.taobao.taolive.room.utils.n.b(this.mFrameContext));
                poz.c(0, com.taobao.taolive.room.utils.n.b(this.mFrameContext));
            }
            com.taobao.taolive.room.service.d.a(this.mFrameContext.y());
        }
    }

    private void updatePlayerExpParams(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901482ad", new Object[]{this, videoInfo});
            return;
        }
        if (this.mVideoFrame != null) {
            HashMap hashMap = new HashMap();
            if (videoInfo != null && videoInfo.liveConfigForStream != null) {
                hashMap.put("__livePushControlInfo", videoInfo.liveConfigForStream);
            }
            this.mVideoFrame.callWithMsg(hashMap);
        }
        String R = poy.R(this.mFrameContext) != null ? poy.R(this.mFrameContext) : "";
        String str = this.mRecModel.isFirst ? "init" : obw.VIDEO_ACTION_TYPE_UPDOWNSWITCH;
        if (this.mVideoFrame == null) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append("entryLiveSource=");
        sb.append(R);
        sb.append(",videoActionType=");
        sb.append(str);
        sb.append(",vod_scenario=");
        sb.append("videoFullScreen");
        sb.append(",switchIndex=");
        sb.append(poy.ai(this.mFrameContext));
        long n = com.taobao.taolive.room.utils.m.n();
        if (n > 0) {
            sb.append(",videoLaunchPlayTime=");
            sb.append(n);
        }
        sb.append(",isFromLauncher=");
        sb.append(com.taobao.taolive.room.utils.m.b());
        String sb2 = sb.toString();
        if (pmd.a().m() != null) {
            pnj m = pmd.a().m();
            m.a("updatePlayExValue", "live updatePlayExValue = " + sb2);
        }
        hashMap2.put(obw.KEY_VIDEO_UPDATE_PARAMS, sb2);
        this.mVideoFrame.callWithMsg(hashMap2);
    }

    private JSONObject generateTcpContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6847600a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        g gVar = this.mFrameContext;
        if (gVar != null && (gVar.y() instanceof c)) {
            jSONObject.put(aw.PARAM_TCP_OUTER_PARAM, (Object) ((c) this.mFrameContext.y()).f21593a);
        }
        return jSONObject;
    }

    private String generateLiveContextKey() {
        TBLiveRecEngineV2.RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc914e88", new Object[]{this});
        }
        com.taobao.taolive.sdk.controller.e eVar = this.mGlobalContext;
        String i = eVar != null ? eVar.i() : "";
        String b = this.mRecModel != null ? ppn.a().b(this.mRecModel.liveId) : "unknown";
        if (!StringUtils.isEmpty(i)) {
            b = i + "_" + b;
        }
        g gVar = this.mFrameContext;
        if (gVar != null) {
            gVar.a(b);
        }
        g gVar2 = this.mFrameContext;
        if (gVar2 != null && (recModel = this.mRecModel) != null) {
            gVar2.d = recModel.liveId;
        }
        poy.f(b, this.mFrameContext);
        return b;
    }

    private void updatePerformancePlayMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f861945", new Object[]{this});
            return;
        }
        VideoFrame2 videoFrame2 = this.mVideoFrame;
        if (videoFrame2 == null || videoFrame2.getTaoVideoView() == null) {
            return;
        }
        int J = this.mVideoFrame.getTaoVideoView().J();
        if (J == 0) {
            TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
            this.mPerfomenceTrackManager.e((recModel == null || recModel.initParams == null || StringUtils.isEmpty(this.mRecModel.initParams.get(aw.PARAM_PLAY_MODE))) ? "playerViewToken" : this.mRecModel.initParams.get(aw.PARAM_PLAY_MODE));
        } else if (J == 1) {
            this.mPerfomenceTrackManager.e("autoPlayerViewToken");
        } else if (J == 2) {
        }
    }

    private void reportCheckLiveDetailWithBindModelError(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222f25a2", new Object[]{this, str, str2, str3, str4});
            return;
        }
        String str5 = TAG;
        ab.c(str5, "reportCheckLiveDetailWithBindModelError error recommendLiveID" + str + " liveDetailLiveID = " + str3 + " liveContextKey = " + str4 + " hash = " + this);
        HashMap hashMap = new HashMap();
        hashMap.put("recommendLiveID", str);
        hashMap.put("recommendAccountId", str2);
        hashMap.put("liveDetailLiveID", str3);
        ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "LiveDetailMistake", (Map<String, String>) hashMap);
    }

    private void reportAboutMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33875fb", new Object[]{this, new Boolean(z)});
        } else if (!com.taobao.taolive.sdk.ui.media.mute.b.a(this.mContext)) {
        } else {
            if (z) {
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "mute_show", (HashMap<String, String>) null);
            }
            if (com.taobao.taolive.sdk.ui.media.mute.b.b(this.mContext)) {
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "mute", (HashMap<String, String>) null);
            } else {
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "mute_none", (HashMap<String, String>) null);
            }
            if (com.taobao.taolive.sdk.ui.media.mute.b.a()) {
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "mute_set_open", (HashMap<String, String>) null);
            } else {
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "mute_set_close", (HashMap<String, String>) null);
            }
        }
    }

    private void updateRationType(VideoInfo videoInfo) {
        VideoFrame2 videoFrame2;
        VideoFrame2 videoFrame22;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83498860", new Object[]{this, videoInfo});
        } else if (videoInfo.landScape || y.e(this.mContext)) {
            if (!aa.cb() || (videoFrame2 = this.mVideoFrame) == null || videoFrame2.getTaoVideoView() == null) {
                return;
            }
            String str = videoInfo.playModeLandscape;
            if (StringUtils.isEmpty(str)) {
                str = aa.cc();
            }
            IMediaPlayer.AspectRatio a2 = ac.a().a(str);
            this.mVideoFrame.getTaoVideoView().a(a2);
            String str2 = TAG;
            ab.e(str2, "landScape = true playModeLandscape = " + str + "landscapeAspectRation = " + a2);
        } else if (!aa.cb() || (videoFrame22 = this.mVideoFrame) == null || videoFrame22.getTaoVideoView() == null) {
        } else {
            String str3 = videoInfo.playModePortrait;
            if (StringUtils.isEmpty(str3)) {
                str3 = aa.cd();
            }
            IMediaPlayer.AspectRatio b = ac.a().b(str3);
            this.mVideoFrame.getTaoVideoView().a(b);
            String str4 = TAG;
            ab.e(str4, "landScape = false playModePortrait = " + str3 + "portraitAspectRation = " + b);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.component.b
    public void onAnchorLeave() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537088aa", new Object[]{this});
        } else {
            com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
        }
    }

    @Override // tb.sgr
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
        } else if (!y.b(this.mContext) && !y.c(this.mContext)) {
        } else {
            ddw.a().a(!z ? "com.taobao.taolive.room.mediaplatform_switch_to_portrait" : "com.taobao.taolive.room.mediaplatform_switch_to_landscape");
        }
    }

    private void showMoreTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f85f50", new Object[]{this});
            return;
        }
        ab.c("MoreSwitchGuideTip", "showMoreTip");
        ffv ffvVar = this.mMoreSwitchGuideTip;
        if (ffvVar == null) {
            return;
        }
        ffvVar.a();
    }

    private void resetMoreTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf41d5be", new Object[]{this});
            return;
        }
        ab.c("MoreSwitchGuideTip", "resetMoreTip");
        ffv ffvVar = this.mMoreSwitchGuideTip;
        if (ffvVar == null) {
            return;
        }
        ffvVar.b();
    }

    private void updateUrlListAndSwitch(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f338cd5f", new Object[]{this, videoInfo});
            return;
        }
        VideoFrame2 videoFrame2 = this.mVideoFrame;
        if (videoFrame2 == null || !videoFrame2.hasPreloaded()) {
            return;
        }
        this.mVideoFrame.updateUrlListAndSwitch(videoInfo);
    }
}
