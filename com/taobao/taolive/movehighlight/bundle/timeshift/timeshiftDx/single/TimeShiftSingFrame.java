package com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.single;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame;
import com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a;
import com.taobao.taolive.movehighlight.utils.c;
import com.taobao.taolive.movehighlight.utils.f;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import tb.ibq;
import tb.kge;
import tb.pfb;
import tb.pfj;
import tb.pfm;
import tb.pfn;
import tb.pfx;
import tb.pfy;
import tb.pgp;
import tb.pqj;
import tb.sss;
import tb.sst;

/* loaded from: classes8.dex */
public class TimeShiftSingFrame extends AbstractTimeShiftDXFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    public DXRootView atmosphereDxRootView;
    private Runnable bottomRunnable;
    private DXRootView dxCardRootView;
    private FrameLayout frameLayout;
    private DXRootView liveActionDxView;
    public TUrlImageView muteImage;
    private FrameLayout singCardItemLayout;
    private FrameLayout singLiveActionLayout;
    private FrameLayout singleImageLayout;
    private pfm timeShiftBottomUtils;
    private pfj timeShiftModel;
    private com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a timeShiftRequestDx;
    private ibq timeshiftDxUtils;
    private VideoInfo videoInfo;

    public static /* synthetic */ Object ipc$super(TimeShiftSingFrame timeShiftSingFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1777320968:
                super.onCreateView2((ViewGroup) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case -236809011:
                super.onWillAppear();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame
    public void abstractRefreshBottomByMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6df1b99", new Object[]{this, new Boolean(z)});
        }
    }

    public static /* synthetic */ void access$000(TimeShiftSingFrame timeShiftSingFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722b2649", new Object[]{timeShiftSingFrame, jSONObject});
        } else {
            timeShiftSingFrame.renderSingleCard(jSONObject);
        }
    }

    public static /* synthetic */ void access$100(TimeShiftSingFrame timeShiftSingFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ea164a", new Object[]{timeShiftSingFrame, jSONObject});
        } else {
            timeShiftSingFrame.renderLiveAction(jSONObject);
        }
    }

    static {
        kge.a(-1281052477);
        TAG = TimeShiftSingFrame.class.getSimpleName();
    }

    public TimeShiftSingFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.AbstractTimeShiftDXFrame
    public void showTimeShiftLayerCallBack(Map<String, String> map, boolean z, pgp pgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6943f26b", new Object[]{this, map, new Boolean(z), pgpVar});
        } else if (map == null) {
        } else {
            showTimeShift(map.get("timeShiftSoure"), map.get("timeMovingId"), map.get("itemId"), map.get(aw.PARAM_TIMEMOVE_KEYPOINTID), pgpVar);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        super.onCreateView2(viewGroup);
        if ((viewGroup instanceof FrameLayout) && this.mContext != null) {
            this.frameLayout = (FrameLayout) viewGroup;
            this.frameLayout.setVisibility(0);
            this.mContainer = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_higlight_dx_timeshift_single, (ViewGroup) null);
            this.frameLayout.addView(this.mContainer);
        }
        if (!y.a()) {
            return;
        }
        if (!y.b(this.mContext) && !y.c(this.mContext)) {
            return;
        }
        y.a(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        initView();
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.videoInfo = k.a(this.mLiveDataModel);
        if (this.videoInfo == null) {
            return;
        }
        this.timeShiftRequestDx = new com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a(this.mLiveDataModel, this.frameLayout, this.mFrameContext);
        this.timeshiftDxUtils = new a(this.dxCardRootView, this.mFrameContext);
        this.timeShiftRequestDx.a((pfn) null);
        this.timeShiftModel = new pfj();
        initTimeShiftAction(this.timeShiftRequestDx, this.timeshiftDxUtils, this.timeShiftModel);
        if (this.mContainer != null) {
            this.singLiveActionLayout = (FrameLayout) this.mContainer.findViewById(R.id.taolive_highlight_sing_live_action);
            this.singCardItemLayout = (FrameLayout) this.mContainer.findViewById(R.id.taolive_highlight_sing_card);
            this.singleImageLayout = (FrameLayout) this.mContainer.findViewById(R.id.taolive_highlight_sing_image_layout);
        }
        initMuteIcon();
    }

    private void initMuteIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7a0ae9", new Object[]{this});
            return;
        }
        this.muteImage = (TUrlImageView) ((ViewGroup) this.mContainer.getRootView()).findViewById(R.id.taolive_highlight_sing_mute_icon);
        this.muteImage.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01iU5mUX1scxPhNoiCq_!!6000000005788-2-tps-144-144.png");
        this.muteImage.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.single.TimeShiftSingFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                sss M;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TimeShiftSingFrame.this.mFrameContext == null || (M = TimeShiftSingFrame.this.mFrameContext.M()) == null) {
                } else {
                    M.a(false);
                    TimeShiftSingFrame.this.muteImage.setVisibility(8);
                }
            }
        });
        checkMuteStatus();
    }

    private void checkMuteStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b323719a", new Object[]{this});
        } else if (this.muteImage == null) {
        } else {
            if (sst.b(this.mFrameContext)) {
                this.muteImage.setVisibility(0);
            } else {
                this.muteImage.setVisibility(8);
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (y.a() && (y.b(this.mContext) || y.c(this.mContext))) {
            y.b(this);
        }
        com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a aVar = this.timeShiftRequestDx;
        if (aVar == null) {
            return;
        }
        aVar.a();
        this.timeShiftRequestDx = null;
    }

    private void showTimeShift(String str, String str2, String str3, String str4, pgp pgpVar) {
        com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5acdc5e", new Object[]{this, str, str2, str3, str4, pgpVar});
        } else if (this.timeshiftDxUtils == null || (aVar = this.timeShiftRequestDx) == null) {
        } else {
            aVar.a(this.mFrameContext, pgpVar, str3, str4, new a.b() { // from class: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.single.TimeShiftSingFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a.b
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    TimeShiftSingFrame.access$000(TimeShiftSingFrame.this, jSONObject);
                    TimeShiftSingFrame.access$100(TimeShiftSingFrame.this, jSONObject);
                    f.a().e(System.currentTimeMillis());
                    pfb.a(TimeShiftSingFrame.this.mFrameContext).a(jSONObject);
                }
            });
        }
    }

    private void renderLiveAction(JSONObject jSONObject) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47539d1", new Object[]{this, jSONObject});
            return;
        }
        this.liveActionDxView = pfx.a().a(this.mContext, "highlight_room_status_action");
        this.timeShiftBottomUtils = new pfm(this.mFrameContext, this.mLiveDataModel, this.mContext, this.liveActionDxView);
        this.timeShiftBottomUtils.a(jSONObject);
        if (this.liveActionDxView == null || (frameLayout = this.singLiveActionLayout) == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.singLiveActionLayout.addView(this.liveActionDxView);
        pfx.a().a(this.liveActionDxView, jSONObject, this.mFrameContext);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        checkMuteStatus();
    }

    private void renderSingleCard(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16980e5b", new Object[]{this, jSONObject});
            return;
        }
        pfy.a(jSONObject);
        LiveTimemovingModel liveTimemovingModel = null;
        if (jSONObject == null || this.mContext == null) {
            return;
        }
        JSONObject handleTimeMovingSource = handleTimeMovingSource(jSONObject);
        if (handleTimeMovingSource != null) {
            renderSingleAtmosphereDx(handleTimeMovingSource);
            liveTimemovingModel = (LiveTimemovingModel) pqj.a(handleTimeMovingSource.toJSONString(), LiveTimemovingModel.class);
            this.dxCardRootView = pfx.a().a(this.mContext, "taolive_highlight_single_bigcard");
            if (liveTimemovingModel != null && liveTimemovingModel.extendVal != null && liveTimemovingModel.extendVal.secKillInfo != null && JSONObject.parseObject(liveTimemovingModel.extendVal.secKillInfo) != null && "secKill".equals(liveTimemovingModel.extendVal.itemBizType)) {
                this.dxCardRootView = pfx.a().a(this.mContext, "taolive_highlight_single_seckill");
            }
            DXRootView dXRootView = this.dxCardRootView;
            if (dXRootView != null && this.singCardItemLayout != null) {
                ibq ibqVar = this.timeshiftDxUtils;
                if (ibqVar instanceof a) {
                    ((a) ibqVar).a(dXRootView);
                }
                this.singCardItemLayout.removeAllViews();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                if (c.B() && y.a() && y.e(this.mContext)) {
                    layoutParams.setMarginEnd(30);
                    layoutParams.gravity = 5;
                } else {
                    layoutParams.gravity = 17;
                }
                this.singCardItemLayout.addView(this.dxCardRootView, layoutParams);
                pfx.a().a(this.dxCardRootView, (JSONObject) handleTimeMovingSource.clone(), this.mFrameContext);
            }
        } else {
            renderSingleEmptyCard();
        }
        HashMap hashMap = new HashMap();
        if (liveTimemovingModel != null) {
            hashMap.put("itemId", liveTimemovingModel.itemId);
        }
        o.a(this.mFrameContext, "highlightSingCardShow", (HashMap<String, String>) hashMap);
    }

    private void renderSingleEmptyCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d5a726", new Object[]{this});
        } else if (!c.C()) {
        } else {
            this.dxCardRootView = pfx.a().a(this.mContext, "taolive_highlight_single_empty_card");
            FrameLayout frameLayout = this.singCardItemLayout;
            if (frameLayout == null || this.dxCardRootView == null) {
                return;
            }
            frameLayout.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMarginEnd(30);
            layoutParams.gravity = 5;
            this.singCardItemLayout.addView(this.dxCardRootView, layoutParams);
            pfx.a().a(this.dxCardRootView, new JSONObject(), this.mFrameContext);
        }
    }

    private void renderSingleAtmosphereDx(JSONObject jSONObject) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83cab5d5", new Object[]{this, jSONObject});
            return;
        }
        this.atmosphereDxRootView = pfx.a().a(this.mContext, "taolive_highlight_single_atmosphere");
        if (this.atmosphereDxRootView == null || (frameLayout = this.singleImageLayout) == null) {
            return;
        }
        frameLayout.setVisibility(0);
        String str = "renderSingleAtmosphereDx: View.VISIBLE" + this.singleImageLayout.hashCode();
        this.singleImageLayout.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (c.B() && y.a() && y.e(this.mContext)) {
            layoutParams.gravity = 5;
        }
        this.singleImageLayout.addView(this.atmosphereDxRootView, layoutParams);
        pfx.a().a(this.atmosphereDxRootView, jSONObject, this.mFrameContext);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        super.onWillAppear();
        clearScreenFrame();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        clearScreenFrame();
    }

    private void clearScreenFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f055c65b", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.singleImageLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (this.atmosphereDxRootView != null) {
            this.atmosphereDxRootView = null;
        }
        FrameLayout frameLayout2 = this.singLiveActionLayout;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        if (this.bottomRunnable != null) {
            this.bottomRunnable = null;
        }
        if (this.liveActionDxView != null) {
            this.liveActionDxView = null;
        }
        FrameLayout frameLayout3 = this.singCardItemLayout;
        if (frameLayout3 != null) {
            frameLayout3.removeAllViews();
        }
        if (this.dxCardRootView == null) {
            return;
        }
        this.dxCardRootView = null;
    }

    public JSONObject handleTimeMovingSource(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6cbbb96b", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("model");
            if (jSONObject2 != null && (jSONArray = jSONObject2.getJSONArray("timeMovingList")) != null && jSONArray.size() > 0) {
                return jSONArray.getJSONObject(0);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // tb.sgr
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.liveActionDxView != null) {
            pfx a2 = pfx.a();
            DXRootView dXRootView = this.liveActionDxView;
            a2.a(dXRootView, dXRootView.getData(), this.mFrameContext);
        }
        if (this.dxCardRootView == null) {
            return;
        }
        pfx a3 = pfx.a();
        DXRootView dXRootView2 = this.dxCardRootView;
        a3.a(dXRootView2, dXRootView2.getData(), this.mFrameContext);
    }
}
