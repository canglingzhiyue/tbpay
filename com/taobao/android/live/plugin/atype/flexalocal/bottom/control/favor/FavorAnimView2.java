package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.room.service.b;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.CountInfoMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.his;
import tb.kge;
import tb.phg;
import tb.phl;
import tb.plx;
import tb.ply;
import tb.pmd;
import tb.pnk;
import tb.pnq;
import tb.sad;
import tb.xkw;

/* loaded from: classes5.dex */
public class FavorAnimView2 extends FavorLayout2 implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_COUNT = 10;
    private static final String TAG;
    private String mCCode;
    private long mFavorDelayTime;
    private com.taobao.alilive.aliliveframework.frame.a mFrameContext;
    private g mInteractBusiness;
    private long mLastBizCount;
    private d.a mMessageListener;
    private int mMineFavoutCount;
    private int mMineTotalFavorCount;
    private boolean mNeedSendFavor;
    private boolean mNeedShowFavor;
    private Runnable mPostRunnable;
    private com.taobao.taolive.sdk.adapter.network.d mRemoteBaseListener;
    private TBLiveDataModel mTBLiveDataModel;

    public static /* synthetic */ Object ipc$super(FavorAnimView2 favorAnimView2, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "FavorAnimView2";
    }

    public static /* synthetic */ void access$000(FavorAnimView2 favorAnimView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f67ad1", new Object[]{favorAnimView2});
        } else {
            favorAnimView2.hide();
        }
    }

    public static /* synthetic */ boolean access$100(FavorAnimView2 favorAnimView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("361d0a34", new Object[]{favorAnimView2})).booleanValue() : favorAnimView2.mNeedShowFavor;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.adapter.network.d access$1000(FavorAnimView2 favorAnimView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.adapter.network.d) ipChange.ipc$dispatch("69b42329", new Object[]{favorAnimView2}) : favorAnimView2.mRemoteBaseListener;
    }

    public static /* synthetic */ g access$1100(FavorAnimView2 favorAnimView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("433f2d91", new Object[]{favorAnimView2}) : favorAnimView2.mInteractBusiness;
    }

    public static /* synthetic */ String access$1200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ceb13e78", new Object[0]) : TAG;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a access$200(FavorAnimView2 favorAnimView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("173b45c4", new Object[]{favorAnimView2}) : favorAnimView2.mFrameContext;
    }

    public static /* synthetic */ boolean access$302(FavorAnimView2 favorAnimView2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e530b92c", new Object[]{favorAnimView2, new Boolean(z)})).booleanValue();
        }
        favorAnimView2.mNeedSendFavor = z;
        return z;
    }

    public static /* synthetic */ int access$400(FavorAnimView2 favorAnimView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3390b840", new Object[]{favorAnimView2})).intValue() : favorAnimView2.mMineFavoutCount;
    }

    public static /* synthetic */ int access$402(FavorAnimView2 favorAnimView2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cadbd5cb", new Object[]{favorAnimView2, new Integer(i)})).intValue();
        }
        favorAnimView2.mMineFavoutCount = i;
        return i;
    }

    public static /* synthetic */ void access$500(FavorAnimView2 favorAnimView2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85525e76", new Object[]{favorAnimView2, str});
        } else {
            favorAnimView2.sendFavorInternal(str);
        }
    }

    public static /* synthetic */ void access$600(FavorAnimView2 favorAnimView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ddd70b", new Object[]{favorAnimView2});
        } else {
            favorAnimView2.initRemoteBaseListener();
        }
    }

    public static /* synthetic */ TBLiveDataModel access$700(FavorAnimView2 favorAnimView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("af164c65", new Object[]{favorAnimView2}) : favorAnimView2.mTBLiveDataModel;
    }

    public static /* synthetic */ int access$800(FavorAnimView2 favorAnimView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("302af5bc", new Object[]{favorAnimView2})).intValue() : favorAnimView2.mMineTotalFavorCount;
    }

    public static /* synthetic */ String access$900(FavorAnimView2 favorAnimView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("74e6478", new Object[]{favorAnimView2}) : favorAnimView2.mCCode;
    }

    static {
        kge.a(-1763160903);
        kge.a(191318335);
        TAG = b.class.getSimpleName();
    }

    public FavorAnimView2(Context context) {
        this(context, null);
    }

    public FavorAnimView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FavorAnimView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mNeedSendFavor = true;
        this.mNeedShowFavor = true;
        this.mLastBizCount = -1L;
        this.mFavorDelayTime = sad.DEFAULT_TCP_CONNECT_TIMEOUT_MS;
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.FavorAnimView2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i2), obj});
                } else if (i2 != 1002) {
                    if (i2 != 1004) {
                        return;
                    }
                    FavorAnimView2.access$000(FavorAnimView2.this);
                } else {
                    CountInfoMessage countInfoMessage = (CountInfoMessage) obj;
                    long j = 0;
                    if (countInfoMessage.value != null && countInfoMessage.value.get(PowerMsgType.KEY_FAVOR) != null) {
                        j = countInfoMessage.value.get(PowerMsgType.KEY_FAVOR).longValue();
                    }
                    FavorAnimView2.this.addFavor(j);
                }
            }
        };
        this.mPostRunnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.FavorAnimView2.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                phl a2 = phg.a();
                com.taobao.alilive.aliliveframework.frame.a access$200 = FavorAnimView2.access$200(FavorAnimView2.this);
                a2.b(access$200, "like", "likeCount=" + FavorAnimView2.access$400(FavorAnimView2.this));
                FavorAnimView2.access$600(FavorAnimView2.this);
                if (FavorAnimView2.access$700(FavorAnimView2.this) == null) {
                    return;
                }
                VideoInfo videoInfo = FavorAnimView2.access$700(FavorAnimView2.this).mVideoInfo;
                if (videoInfo == null || !videoInfo.useNewRecommendsApi) {
                    FavorAnimView2.access$1100(FavorAnimView2.this).a(FavorAnimView2.access$900(FavorAnimView2.this), FavorAnimView2.access$400(FavorAnimView2.this), new pnq() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.FavorAnimView2.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.pnq
                        public void a(int i2, Map<String, Object> map, Object... objArr) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr});
                            } else if (i2 != 1000) {
                            } else {
                                FavorAnimView2.access$402(FavorAnimView2.this, 0);
                            }
                        }
                    });
                    HashMap hashMap = new HashMap();
                    hashMap.put("favorCount", String.valueOf(FavorAnimView2.access$400(FavorAnimView2.this)));
                    hashMap.put("totalFavorCount", String.valueOf(FavorAnimView2.access$800(FavorAnimView2.this)));
                    FavorAnimView2.access$200(FavorAnimView2.this).e().a(xkw.EVENT_ACTION_ADD_FAVOR, hashMap, FavorAnimView2.this.observeUniqueIdentification());
                    FavorAnimView2.access$302(FavorAnimView2.this, true);
                } else if (phg.a() != null) {
                    if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(FavorAnimView2.access$700(FavorAnimView2.this))) {
                        FavorAnimView2.access$1100(FavorAnimView2.this).a(FavorAnimView2.access$400(FavorAnimView2.this), FavorAnimView2.access$800(FavorAnimView2.this), FavorAnimView2.access$900(FavorAnimView2.this), videoInfo.officialLiveInfo.officialLiveTopic, FavorAnimView2.access$1000(FavorAnimView2.this), phg.a().a(FavorAnimView2.access$200(FavorAnimView2.this)));
                    } else {
                        FavorAnimView2.access$1100(FavorAnimView2.this).a(FavorAnimView2.access$400(FavorAnimView2.this), FavorAnimView2.access$800(FavorAnimView2.this), FavorAnimView2.access$900(FavorAnimView2.this), FavorAnimView2.access$1000(FavorAnimView2.this), phg.a().a(FavorAnimView2.access$200(FavorAnimView2.this)));
                    }
                } else if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(FavorAnimView2.access$700(FavorAnimView2.this))) {
                    FavorAnimView2.access$1100(FavorAnimView2.this).a(FavorAnimView2.access$400(FavorAnimView2.this), FavorAnimView2.access$800(FavorAnimView2.this), FavorAnimView2.access$900(FavorAnimView2.this), videoInfo.officialLiveInfo.officialLiveTopic, FavorAnimView2.access$1000(FavorAnimView2.this));
                } else {
                    FavorAnimView2.access$1100(FavorAnimView2.this).a(FavorAnimView2.access$400(FavorAnimView2.this), FavorAnimView2.access$800(FavorAnimView2.this), FavorAnimView2.access$900(FavorAnimView2.this), FavorAnimView2.access$1000(FavorAnimView2.this));
                }
            }
        };
        this.mFavorDelayTime = ply.B() * 1000;
        if (this.mFavorDelayTime < 1000) {
            this.mFavorDelayTime = 1000L;
        }
    }

    public void init(TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a412f5", new Object[]{this, tBLiveDataModel, aVar});
            return;
        }
        this.mTBLiveDataModel = tBLiveDataModel;
        this.mFrameContext = aVar;
        this.mInteractBusiness = new g(this.mFrameContext.h());
        VideoInfo videoInfo = this.mTBLiveDataModel.mVideoInfo;
        if (videoInfo != null) {
            updateSkin(videoInfo.theme);
            JSONObject jSONObject = videoInfo.originalData;
            if (jSONObject != null && enableUserServerLikeReportTime()) {
                try {
                    long longValue = jSONObject.getLongValue("likeEventDelayReportWindowSize");
                    if (longValue > 0) {
                        this.mFavorDelayTime = longValue;
                    }
                } catch (Throwable th) {
                    String str = TAG;
                    m.e(str, "likeReportDelayTimeForServer init error|errorMsg=" + th.getMessage());
                }
            }
        }
        this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.FavorAnimView2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1004 || (i == 1002 && FavorAnimView2.access$100(FavorAnimView2.this));
            }
        });
        this.mFrameContext.e().a(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.FavorLayout2
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        clearFavor();
        com.taobao.alilive.aliliveframework.frame.a aVar = this.mFrameContext;
        if (aVar != null) {
            aVar.f().unRegisterMessageListener(this.mMessageListener);
            this.mFrameContext.e().b(this);
        }
        g gVar = this.mInteractBusiness;
        if (gVar != null) {
            gVar.a();
        }
        removeCallbacks(this.mPostRunnable);
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mLastBizCount = -1L;
        setVisibility(0);
        clearFavor();
    }

    public void addFavor(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b253b20", new Object[]{this, new Long(j)});
            return;
        }
        long j2 = this.mLastBizCount;
        if (j2 < 0) {
            addFavor(2);
        } else {
            long j3 = j - j2;
            if (j3 < 10) {
                addFavor((int) j3);
            } else {
                addFavor(10);
            }
        }
        this.mLastBizCount = j;
    }

    private void initRemoteBaseListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2d4e42", new Object[]{this});
        } else if (this.mRemoteBaseListener != null) {
        } else {
            this.mRemoteBaseListener = new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.FavorAnimView2.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    }
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

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    if (obj instanceof com.taobao.taolive.sdk.business.interact.favor.a) {
                        com.taobao.taolive.sdk.business.interact.favor.a aVar = (com.taobao.taolive.sdk.business.interact.favor.a) obj;
                        HashMap hashMap = new HashMap();
                        hashMap.put("favorCount", String.valueOf(aVar.b()));
                        hashMap.put("totalFavorCount", String.valueOf(aVar.d()));
                        FavorAnimView2.access$200(FavorAnimView2.this).e().a(xkw.EVENT_ACTION_ADD_FAVOR, hashMap, FavorAnimView2.this.observeUniqueIdentification());
                    }
                    FavorAnimView2.access$302(FavorAnimView2.this, true);
                    FavorAnimView2.access$402(FavorAnimView2.this, 0);
                }
            };
        }
    }

    private void sendFavor(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee11b9a7", new Object[]{this, str});
        } else if (!pmd.a().q().c()) {
            pmd.a().q().a((Activity) getContext(), new pnk.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.FavorAnimView2.4
            });
        } else {
            sendFavorInternal(str);
        }
    }

    private void sendFavorImmediately() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4fd80f", new Object[]{this});
        } else {
            this.mPostRunnable.run();
        }
    }

    private void sendFavorInternal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f543ac4", new Object[]{this, str});
            return;
        }
        this.mCCode = str;
        if (this.mNeedShowFavor) {
            startDelayTask();
            addFavor(true);
        }
        this.mMineFavoutCount++;
        this.mMineTotalFavorCount++;
        if (!this.mNeedSendFavor) {
            return;
        }
        this.mNeedSendFavor = false;
        postDelayed(this.mPostRunnable, this.mFavorDelayTime);
    }

    public void initBizCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c265b1", new Object[]{this, new Long(j)});
        } else {
            this.mLastBizCount = j;
        }
    }

    public void checkFavorPicByUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e8e5f5", new Object[]{this, str});
            return;
        }
        String str2 = TAG;
        plx.a(str2, "checkFavorPicByUrl = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b.a().a(str, new a(this));
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (xkw.EVENT_RESET_FOR_REPLAY.equals(str)) {
            updateForReplay(obj);
        } else if (xkw.EVENT_FAVOR_FRAME_SEND_FAVOR.equals(str)) {
            if (!(obj instanceof String)) {
                return;
            }
            sendFavor((String) obj);
        } else if (xkw.EVENT_PRELIVE_VIDEO_SHOW_FULL_SCREEN.equals(str)) {
            if (!(obj instanceof Boolean)) {
                return;
            }
            if (((Boolean) obj).booleanValue()) {
                hide();
            } else {
                reset();
            }
        } else if (xkw.EVENT_MEDIAPLATFORM_UPDATE_FAVOR_IMAGE.equals(str)) {
            if (!(obj instanceof String)) {
                return;
            }
            checkFavorPicByUrl((String) obj);
        } else if (xkw.EVENT_FAVOR_FRAME_SEND_FAVOR_IMMEDIATELY.equals(str)) {
            sendFavorImmediately();
        } else if (!"com.taobao.taolive.room.goods_list_showing".equals(str)) {
        } else {
            Object gLConfig = f.m().getGLConfig(null, "glPerformanceExclusive");
            if (!(gLConfig instanceof Boolean) || !((Boolean) gLConfig).booleanValue()) {
                his.b(TAG, "gl event | state false.");
            } else if (!(obj instanceof Boolean)) {
            } else {
                if (((Boolean) obj).booleanValue()) {
                    pause();
                } else {
                    resume();
                }
            }
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_RESET_FOR_REPLAY, xkw.EVENT_FAVOR_FRAME_SEND_FAVOR, xkw.EVENT_PRELIVE_VIDEO_SHOW_FULL_SCREEN, xkw.EVENT_MEDIAPLATFORM_UPDATE_FAVOR_IMAGE, xkw.EVENT_FAVOR_FRAME_SEND_FAVOR_IMMEDIATELY, "com.taobao.taolive.room.goods_list_showing"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.mFrameContext;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }

    public void setNeedShowFavor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49bc10c4", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedShowFavor = z;
        }
    }

    private void updateForReplay(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bb40aa", new Object[]{this, obj});
        } else if (((Boolean) obj).booleanValue()) {
            reset();
        } else {
            hide();
        }
    }

    private void updateSkin(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4295126", new Object[]{this, hashMap});
        } else if (hashMap != null && !TextUtils.isEmpty(hashMap.get("likeZip"))) {
            checkFavorPicByUrl(hashMap.get("likeZip"));
        } else {
            setDefaultDrawables();
        }
    }

    private void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            setVisibility(4);
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.a> f13585a;

        static {
            kge.a(-904156706);
            kge.a(-1473255459);
        }

        public a(com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.a aVar) {
            this.f13585a = new WeakReference<>(aVar);
        }

        @Override // com.taobao.taolive.room.service.b.a
        public void a(ArrayList<Drawable> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
                return;
            }
            com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.a aVar = this.f13585a.get();
            if (aVar == null) {
                return;
            }
            aVar.setDrawables(arrayList);
        }

        @Override // com.taobao.taolive.room.service.b.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                plx.b(FavorAnimView2.access$1200(), "onGetFail------");
            }
        }
    }

    private boolean enableUserServerLikeReportTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("62b85c54", new Object[]{this})).booleanValue() : v.e(pmd.a().d().a("tblive", "enableUserServerLikeDelayReportTime", "true"));
    }
}
