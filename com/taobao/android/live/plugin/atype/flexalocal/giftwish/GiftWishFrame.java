package com.taobao.android.live.plugin.atype.flexalocal.giftwish;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.ddv;
import tb.ddw;
import tb.hiq;
import tb.hkk;
import tb.hkm;
import tb.kge;
import tb.phg;
import tb.phj;
import tb.pqj;
import tb.xkw;

/* loaded from: classes5.dex */
public class GiftWishFrame extends BaseFrame implements Handler.Callback, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CHECK_GIFT_VOTE_PM_DATA = 10001;
    private static final int GIFT_VOTE_PM_END = 10002;
    public static final String GIFT_WISH_TAG = "GiftWishFrame";
    private static final String REQUEST_SCENE_COMPENSATE = "compensate_request";
    private static final String REQUEST_SCENE_INIT = "init_request";
    private List<String> activityTypes;
    private String liveId;
    private boolean mEnableGiftBannerShowPriority;
    private boolean mEnableShowGiftGalleryBanner;
    private boolean mEnableShowGiftVoteBanner;
    private boolean mEnableShowGiftWishBanner;
    private boolean mEnableShowRightBanner;
    private final Handler mGiftActivityCheckHandler;
    private final Handler mGiftActivityEndHandler;
    private String mGiftBannerShowPriorityConfig;
    private int mGiftGalleryLevel;
    private boolean mGiftVoteFinishStatus;
    private int mGiftVoteLevel;
    private int mGiftWishLevel;
    private final d.a mMessageListener;
    private final com.taobao.taolive.sdk.adapter.network.d mNetworkListener;
    private JSONObject mPreGiftGalleryObject;
    private JSONObject mPreGiftVoteObject;
    private JSONObject mPreGiftWishObject;
    private String mRequestScene;
    private FrameLayout mRootView;
    private String mSecretUserId;

    static {
        kge.a(366528266);
        kge.a(191318335);
        kge.a(-1043440182);
    }

    public static /* synthetic */ Object ipc$super(GiftWishFrame giftWishFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : GIFT_WISH_TAG;
    }

    public static /* synthetic */ boolean access$000(GiftWishFrame giftWishFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5c524e0", new Object[]{giftWishFrame})).booleanValue() : giftWishFrame.mEnableShowGiftWishBanner;
    }

    public static /* synthetic */ void access$1000(GiftWishFrame giftWishFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e28d45", new Object[]{giftWishFrame, jSONObject});
        } else {
            giftWishFrame.renderGiftWishDxView(jSONObject);
        }
    }

    public static /* synthetic */ JSONObject access$102(GiftWishFrame giftWishFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7e7c1dd1", new Object[]{giftWishFrame, jSONObject});
        }
        giftWishFrame.mPreGiftWishObject = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void access$1100(GiftWishFrame giftWishFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61eeb724", new Object[]{giftWishFrame, jSONObject});
        } else {
            giftWishFrame.checkGiftVoteDataValid(jSONObject);
        }
    }

    public static /* synthetic */ boolean access$200(GiftWishFrame giftWishFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d416e962", new Object[]{giftWishFrame})).booleanValue() : giftWishFrame.mEnableShowGiftVoteBanner;
    }

    public static /* synthetic */ JSONObject access$302(GiftWishFrame giftWishFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("92a5f98f", new Object[]{giftWishFrame, jSONObject});
        }
        giftWishFrame.mPreGiftVoteObject = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ boolean access$400(GiftWishFrame giftWishFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e268ade4", new Object[]{giftWishFrame})).booleanValue() : giftWishFrame.mEnableShowGiftGalleryBanner;
    }

    public static /* synthetic */ JSONObject access$502(GiftWishFrame giftWishFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a6cfd54d", new Object[]{giftWishFrame, jSONObject});
        }
        giftWishFrame.mPreGiftGalleryObject = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ String access$600(GiftWishFrame giftWishFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da4a527e", new Object[]{giftWishFrame}) : giftWishFrame.mRequestScene;
    }

    public static /* synthetic */ JSONObject access$700(GiftWishFrame giftWishFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("8e2eb3c3", new Object[]{giftWishFrame}) : giftWishFrame.mergeGiftActivityDataAndBuildDxView();
    }

    public static /* synthetic */ void access$800(GiftWishFrame giftWishFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4cb708c", new Object[]{giftWishFrame, jSONObject});
        } else {
            giftWishFrame.buildDxView(jSONObject);
        }
    }

    public static /* synthetic */ boolean access$900(GiftWishFrame giftWishFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6351929", new Object[]{giftWishFrame})).booleanValue() : giftWishFrame.mEnableShowRightBanner;
    }

    public GiftWishFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mRequestScene = REQUEST_SCENE_INIT;
        this.mNetworkListener = new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.giftwish.GiftWishFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                String jSONObject = netResponse.getDataJsonObject().toString();
                if (TextUtils.isEmpty(jSONObject)) {
                    return;
                }
                try {
                    JSONObject b = pqj.b(jSONObject);
                    if (b != null) {
                        if (GiftWishFrame.access$000(GiftWishFrame.this)) {
                            GiftWishFrame.access$102(GiftWishFrame.this, b.getJSONObject("giftWish"));
                        }
                        if (GiftWishFrame.access$200(GiftWishFrame.this)) {
                            GiftWishFrame.access$302(GiftWishFrame.this, b.getJSONObject("giftVote"));
                        }
                        if (GiftWishFrame.access$400(GiftWishFrame.this)) {
                            GiftWishFrame.access$502(GiftWishFrame.this, b.getJSONObject("giftGallery"));
                        }
                        if (GiftWishFrame.REQUEST_SCENE_INIT.equals(GiftWishFrame.access$600(GiftWishFrame.this)) && b.getJSONObject("giftVote") != null && "1".equals(b.getJSONObject("giftVote").getString("activityStatus"))) {
                            q.b(GiftWishFrame.GIFT_WISH_TAG, "response, onSuccess: giftVote is end|result=" + jSONObject);
                            GiftWishFrame.access$302(GiftWishFrame.this, null);
                        }
                        GiftWishFrame.access$800(GiftWishFrame.this, GiftWishFrame.access$700(GiftWishFrame.this));
                    }
                    q.b(GiftWishFrame.GIFT_WISH_TAG, "response, onSuccess: " + jSONObject);
                } catch (Throwable th) {
                    q.b(GiftWishFrame.GIFT_WISH_TAG, "response, fail:msg=" + th.toString());
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    q.b(GiftWishFrame.GIFT_WISH_TAG, "response, onError");
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    q.b(GiftWishFrame.GIFT_WISH_TAG, "response, onSystemError");
                }
            }
        };
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.giftwish.GiftWishFrame.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (2998 != i || !GiftWishFrame.access$900(GiftWishFrame.this) || !(obj instanceof String)) {
                } else {
                    String str = (String) obj;
                    try {
                        JSONObject b = pqj.b(str);
                        String string = b.getString("activityType");
                        JSONObject jSONObject = b.getJSONObject(AgooConstants.MESSAGE_BODY);
                        if (jSONObject == null) {
                            return;
                        }
                        if ("giftWish".equals(string) && GiftWishFrame.access$000(GiftWishFrame.this)) {
                            GiftWishFrame.access$102(GiftWishFrame.this, jSONObject);
                            GiftWishFrame.access$1000(GiftWishFrame.this, GiftWishFrame.access$700(GiftWishFrame.this));
                        }
                        if ("giftGallery".equals(string) && GiftWishFrame.access$400(GiftWishFrame.this)) {
                            GiftWishFrame.access$502(GiftWishFrame.this, jSONObject);
                            GiftWishFrame.access$1000(GiftWishFrame.this, GiftWishFrame.access$700(GiftWishFrame.this));
                        }
                        if ("giftVote".equals(string) && GiftWishFrame.access$200(GiftWishFrame.this)) {
                            GiftWishFrame.access$1100(GiftWishFrame.this, jSONObject);
                        }
                        q.b(GiftWishFrame.GIFT_WISH_TAG, "pm message, onSuccess: " + str);
                    } catch (Throwable th) {
                        q.b(GiftWishFrame.GIFT_WISH_TAG, "pm message, fail:msg=" + th.toString());
                    }
                }
            }
        };
        this.mGiftActivityCheckHandler = new Handler(this);
        this.mGiftActivityEndHandler = new Handler(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
            return;
        }
        this.liveId = tBLiveDataModel.mVideoInfo.liveId;
        this.mSecretUserId = tBLiveDataModel.mVideoInfo.secretUserId;
        this.mEnableShowRightBanner = hkk.c();
        this.mEnableShowGiftWishBanner = hkk.b();
        this.mEnableShowGiftVoteBanner = hkk.d();
        this.mEnableShowGiftGalleryBanner = hkk.F();
        this.mEnableGiftBannerShowPriority = hkk.n();
        this.mGiftBannerShowPriorityConfig = hkk.m();
        JSONObject parseObject = JSON.parseObject(this.mGiftBannerShowPriorityConfig);
        if (parseObject != null) {
            this.mGiftWishLevel = parseObject.getIntValue("giftWish");
            this.mGiftVoteLevel = parseObject.getIntValue("giftVote");
            this.mGiftGalleryLevel = parseObject.getIntValue("giftGallery");
        }
        if (TextUtils.isEmpty(this.liveId) || tBLiveDataModel.mVideoInfo.activityTypes == null || tBLiveDataModel.mVideoInfo.activityTypes.size() <= 0 || !this.mEnableShowRightBanner) {
            return;
        }
        this.activityTypes = tBLiveDataModel.mVideoInfo.activityTypes;
        this.mRequestScene = REQUEST_SCENE_INIT;
        queryGiftWishData();
    }

    private void queryGiftWishData() {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc874f30", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.liveId) && (list = this.activityTypes) != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.activityTypes) {
                if ("giftWish".equals(str) || "giftVote".equals(str) || "giftGallery".equals(str)) {
                    arrayList.add(str);
                }
            }
            new a(this.mNetworkListener).a(this.liveId, arrayList);
        }
    }

    private void initGiftWishMessageEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69dc9721", new Object[]{this});
        } else {
            this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.giftwish.GiftWishFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
                public boolean filter(int i) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : 2998 == i;
                }
            });
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_gift_wish_banner_dx_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        if (view instanceof FrameLayout) {
            this.mRootView = (FrameLayout) view;
        }
        e.c("GiftWishFrame: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i != 1) {
            return;
        }
        ddw.a().a(this);
        initGiftWishMessageEvent();
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout == null || frameLayout.getVisibility() != 8) {
            return;
        }
        this.mRootView.setVisibility(0);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        release();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        release();
    }

    private void renderGiftWishDxView(DXRootView dXRootView, JSONObject jSONObject, phj phjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("247e5700", new Object[]{this, dXRootView, jSONObject, phjVar});
        } else if (dXRootView == null) {
            q.b(GIFT_WISH_TAG, "onEvent renderGiftWishDxView: rankEntranceView is null!");
        } else {
            FrameLayout frameLayout = this.mRootView;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            phjVar.a(dXRootView, jSONObject);
            this.mRootView.addView(dXRootView);
            this.mRootView.setPadding(0, 0, b.a(this.mContext, 7.0f), b.a(this.mContext, 8.0f));
            ddw.a().a(xkw.EVENT_RANK_LIVE_HIDE_GROWTH_FRAME, null, this.mFrameContext.G());
        }
    }

    private void renderGiftWishDxView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0597da3", new Object[]{this, jSONObject});
            return;
        }
        phj g = phg.g();
        if (g == null) {
            q.b(GIFT_WISH_TAG, "onEvent renderGiftWishDxView: dxRenderEngine is null!");
            return;
        }
        DXRootView dXRootView = null;
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout != null && frameLayout.getChildAt(0) != null && (this.mRootView.getChildAt(0) instanceof DXRootView)) {
            dXRootView = (DXRootView) this.mRootView.getChildAt(0);
        }
        if (dXRootView == null) {
            buildDxView(jSONObject);
        } else {
            g.a(dXRootView, jSONObject);
        }
    }

    private JSONObject mergeGiftActivityDataAndBuildDxView() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b7b598", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject3 = new JSONObject();
        if (this.mGiftVoteLevel > this.mGiftWishLevel || (jSONObject2 = this.mPreGiftWishObject) == null || "-1".equals(jSONObject2.getString("activityStatus")) || !this.mEnableGiftBannerShowPriority) {
            buildGiftProgressJsonArray(this.mPreGiftVoteObject, jSONArray);
        }
        if (this.mGiftWishLevel > this.mGiftVoteLevel || (jSONObject = this.mPreGiftVoteObject) == null || "-1".equals(jSONObject.getString("activityStatus")) || !this.mEnableGiftBannerShowPriority) {
            buildGiftProgressJsonArray(this.mPreGiftWishObject, jSONArray);
            JSONObject jSONObject4 = this.mPreGiftWishObject;
            if (jSONObject4 != null) {
                for (Map.Entry<String, Object> entry : jSONObject4.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!com.taobao.android.live.plugin.atype.flexalocal.rank.b.KEY_BANNER_CARD_LIST.equals(key) && value != null) {
                        jSONObject3.put(key, value);
                    }
                }
            }
            JSONObject jSONObject5 = this.mPreGiftGalleryObject;
            if (jSONObject5 != null && this.mEnableShowGiftGalleryBanner) {
                buildGiftProgressJsonArray(jSONObject5, jSONArray);
            }
        }
        jSONObject3.put(com.taobao.android.live.plugin.atype.flexalocal.rank.b.KEY_BANNER_CARD_LIST, (Object) jSONArray);
        return jSONObject3;
    }

    private void buildGiftProgressJsonArray(JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a80eab", new Object[]{this, jSONObject, jSONArray});
        } else if (jSONObject == null || jSONArray == null) {
            q.b(GIFT_WISH_TAG, "buildGiftProgressJsonArray | giftActivityItemObj is null or giftProgressJsonArray is null");
        } else {
            String string = jSONObject.getString("activityStatus");
            String string2 = jSONObject.getString("activityType");
            if ("-1".equals(string)) {
                q.b(GIFT_WISH_TAG, "buildGiftProgressJsonArray | giftActivityStatus result is break");
                return;
            }
            long longValue = jSONObject.getLongValue("endTime");
            if ("giftVote".equals(string2) && "1".equals(string) && hiq.a() - longValue > 10000) {
                q.b(GIFT_WISH_TAG, "buildGiftProgressJsonArray | giftVote giftActivityStatus is end and activityTime exceed 10s");
                return;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray(com.taobao.android.live.plugin.atype.flexalocal.rank.b.KEY_BANNER_CARD_LIST);
            if (jSONArray2 == null || jSONArray2.isEmpty()) {
                return;
            }
            for (int i = 0; i < jSONArray2.size(); i++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                if (jSONObject2 != null) {
                    if (!TextUtils.isEmpty(jSONObject2.getString("secretUserId")) && jSONObject2.getString("secretUserId").equals(this.mSecretUserId)) {
                        jSONObject2.put("showBoostValue", (Object) true);
                    } else {
                        jSONObject2.put("showBoostValue", (Object) false);
                    }
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!com.taobao.android.live.plugin.atype.flexalocal.rank.b.KEY_BANNER_CARD_LIST.equals(key) && value != null) {
                            jSONObject2.put(key, value);
                        }
                    }
                }
            }
            jSONArray.addAll(jSONArray2);
        }
    }

    private void buildDxView(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45644e42", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(com.taobao.android.live.plugin.atype.flexalocal.rank.b.KEY_BANNER_CARD_LIST);
        if (jSONArray == null || jSONArray.isEmpty()) {
            FrameLayout frameLayout = this.mRootView;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            q.b(GIFT_WISH_TAG, "onEvent: renderDX error: bannerCardList is empty!");
            return;
        }
        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
        if (jSONObject2 == null) {
            q.b(GIFT_WISH_TAG, "onEvent: renderDX error: giftActivityBannerObj is null!");
            return;
        }
        String string = jSONObject2.getString("templateName");
        if (TextUtils.isEmpty(string)) {
            q.b(GIFT_WISH_TAG, "onEvent: templateName is null!");
            return;
        }
        q.b(GIFT_WISH_TAG, "onEvent: renderDX" + jSONObject);
        final phj g = phg.g();
        if (g == null) {
            q.b(GIFT_WISH_TAG, "onEvent: dxRenderEngine is null!");
        } else {
            g.a(this.mContext, string, new phj.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.giftwish.-$$Lambda$GiftWishFrame$tuUOrKfVKcrSvyaVNdFfhjcDXnE
                @Override // tb.phj.a
                public final void onCreateView(DXRootView dXRootView) {
                    GiftWishFrame.this.lambda$buildDxView$25$GiftWishFrame(jSONObject, g, dXRootView);
                }
            });
        }
    }

    public /* synthetic */ void lambda$buildDxView$25$GiftWishFrame(JSONObject jSONObject, phj phjVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80fc78b", new Object[]{this, jSONObject, phjVar, dXRootView});
        } else {
            renderGiftWishDxView(dXRootView, jSONObject, phjVar);
        }
    }

    private void checkGiftVoteDataValid(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa8c219", new Object[]{this, jSONObject});
        } else if (jSONObject != null && TextUtils.equals("1", jSONObject.getString("activityStatus")) && this.mGiftVoteFinishStatus) {
            q.b(GIFT_WISH_TAG, "checkGiftVoteDataValid giftVote activityStatus is end");
        } else if (jSONObject != null && this.mPreGiftVoteObject != null && TextUtils.equals(jSONObject.getString("activityId"), this.mPreGiftVoteObject.getString("activityId")) && TextUtils.equals(this.mPreGiftVoteObject.getString("activityStatus"), "0") && TextUtils.equals(jSONObject.getString("activityStatus"), "1")) {
            Handler handler = this.mGiftActivityEndHandler;
            if (handler != null) {
                handler.removeMessages(10001);
                this.mGiftActivityEndHandler.removeMessages(10002);
                this.mGiftActivityEndHandler.sendEmptyMessageDelayed(10002, 10000L);
            }
            this.mPreGiftVoteObject = jSONObject;
            renderGiftWishDxView(mergeGiftActivityDataAndBuildDxView());
            q.b(GIFT_WISH_TAG, "mPreGiftVoteObject giftVote activityStatus change end");
        } else {
            if (jSONObject != null && TextUtils.equals("0", jSONObject.getString("activityStatus"))) {
                this.mGiftVoteFinishStatus = false;
            }
            if (jSONObject != null && this.mPreGiftVoteObject != null && !TextUtils.equals(jSONObject.getString("activityId"), this.mPreGiftVoteObject.getString("activityId"))) {
                this.mGiftVoteFinishStatus = false;
                this.mPreGiftVoteObject = jSONObject;
                buildDxView(mergeGiftActivityDataAndBuildDxView());
                q.b(GIFT_WISH_TAG, "mPreGiftVoteObject giftVote activityId is new");
                return;
            }
            if (jSONObject != null && this.mPreGiftVoteObject != null && jSONObject.getJSONArray("groupProgressList") != null && this.mPreGiftVoteObject.getJSONArray("groupProgressList") != null && jSONObject.getJSONArray("groupProgressList").size() > 1 && this.mPreGiftVoteObject.getJSONArray("groupProgressList").size() > 1) {
                JSONArray jSONArray = jSONObject.getJSONArray("groupProgressList");
                JSONArray jSONArray2 = this.mPreGiftVoteObject.getJSONArray("groupProgressList");
                if (checkGiftVoteProgressValid(jSONArray.getJSONObject(0), jSONArray2.getJSONObject(0)) || checkGiftVoteProgressValid(jSONArray.getJSONObject(1), jSONArray2.getJSONObject(1))) {
                    q.b(GIFT_WISH_TAG, "mPreGiftVoteObject giftVote progress is invalid");
                    return;
                }
            }
            this.mPreGiftVoteObject = jSONObject;
            renderGiftWishDxView(mergeGiftActivityDataAndBuildDxView());
        }
    }

    private boolean checkGiftVoteProgressValid(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0e9b698", new Object[]{this, jSONObject, jSONObject2})).booleanValue() : (jSONObject == null || jSONObject2 == null || jSONObject.getIntValue("progress") >= jSONObject2.getIntValue("progress")) ? false : true;
    }

    private void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.mGiftActivityCheckHandler.removeMessages(10001);
        this.mGiftActivityEndHandler.removeMessages(10002);
        this.mPreGiftVoteObject = null;
        this.mPreGiftWishObject = null;
        this.mGiftVoteFinishStatus = false;
        ddw.a().b(this);
        this.mFrameContext.f().unRegisterMessageListener(this.mMessageListener);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!com.taobao.android.live.plugin.atype.flexalocal.rank.b.EVENT_GIFT_VOTE_REFRESH_DX.equals(str) || !(obj instanceof JSONObject)) {
        } else {
            this.mRootView.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.giftwish.-$$Lambda$GiftWishFrame$CtOPEnHmcRSDC6M6NeTuIkZ4xRs
                {
                    GiftWishFrame.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GiftWishFrame.this.lambda$onEvent$26$GiftWishFrame();
                }
            }, 1000L);
            Handler handler = this.mGiftActivityCheckHandler;
            if (handler != null) {
                handler.removeMessages(10001);
                this.mGiftActivityCheckHandler.sendEmptyMessageDelayed(10001, 2000L);
            }
            Handler handler2 = this.mGiftActivityEndHandler;
            if (handler2 == null) {
                return;
            }
            handler2.removeMessages(10002);
            this.mGiftActivityEndHandler.sendEmptyMessageDelayed(10002, 10000L);
        }
    }

    public /* synthetic */ void lambda$onEvent$26$GiftWishFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a6ac11", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.mPreGiftVoteObject;
        if (jSONObject == null || !"0".equals(jSONObject.getString("activityStatus"))) {
            return;
        }
        try {
            renderGiftWishDxView(mergeGiftActivityDataAndBuildDxView());
        } catch (Throwable th) {
            q.b(GIFT_WISH_TAG, "onEvent renderGiftWishDxView error|msg=" + th.getMessage());
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{com.taobao.android.live.plugin.atype.flexalocal.rank.b.EVENT_GIFT_VOTE_REFRESH_DX};
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 10001) {
            JSONObject jSONObject2 = this.mPreGiftVoteObject;
            if (jSONObject2 != null && "0".equals(jSONObject2.getString("activityStatus"))) {
                this.mRequestScene = REQUEST_SCENE_COMPENSATE;
                queryGiftWishData();
            }
        } else if (i == 10002 && ((jSONObject = this.mPreGiftVoteObject) == null || !"0".equals(jSONObject.getString("activityStatus")))) {
            this.mPreGiftVoteObject = null;
            this.mGiftVoteFinishStatus = true;
            try {
                buildDxView(mergeGiftActivityDataAndBuildDxView());
            } catch (Throwable th) {
                q.b(GIFT_WISH_TAG, "GIFT_VOTE_PM_END error|msg=" + th.getMessage());
            }
        }
        return true;
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
}
