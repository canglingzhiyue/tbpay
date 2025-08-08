package com.taobao.android.live.plugin.atype.flexalocal.bottom.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.proxy.good.IGoodProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.a;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.ui.component.VideoFrameErrorController;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.phg;
import tb.xjr;
import tb.xkw;

/* loaded from: classes5.dex */
public class BottomSlideNewGuideFrame extends BaseFrame implements a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BottomSlideNewGuideFrame";
    private JSONObject actionData;
    private LiveDetailMessinfoResponseData.RecommendCardInfo bottomInfo;
    private DXRootView mDXrootView;
    private g mGlobalContext;
    private long mGuideHideTime;
    private long mGuideShowTime;
    private f mHandler;
    private int mRealHeightPx;
    private String popId;
    private Runnable reverseRunnable;
    private LiveItem sabAtmosphereLiveItem;
    private ValueAnimator showAnimator;

    static {
        kge.a(652213238);
        kge.a(-1905361424);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(BottomSlideNewGuideFrame bottomSlideNewGuideFrame, String str, Object... objArr) {
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

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : TAG;
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ g access$000(BottomSlideNewGuideFrame bottomSlideNewGuideFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("1ff31ea5", new Object[]{bottomSlideNewGuideFrame}) : bottomSlideNewGuideFrame.mGlobalContext;
    }

    public static /* synthetic */ LiveItem access$100(BottomSlideNewGuideFrame bottomSlideNewGuideFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveItem) ipChange.ipc$dispatch("73b063fe", new Object[]{bottomSlideNewGuideFrame}) : bottomSlideNewGuideFrame.sabAtmosphereLiveItem;
    }

    public static /* synthetic */ LiveItem access$102(BottomSlideNewGuideFrame bottomSlideNewGuideFrame, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem) ipChange.ipc$dispatch("cf4dad85", new Object[]{bottomSlideNewGuideFrame, liveItem});
        }
        bottomSlideNewGuideFrame.sabAtmosphereLiveItem = liveItem;
        return liveItem;
    }

    public BottomSlideNewGuideFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.reverseRunnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideNewGuideFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (BottomSlideNewGuideFrame.access$000(BottomSlideNewGuideFrame.this) == null || !BottomSlideNewGuideFrame.access$000(BottomSlideNewGuideFrame.this).M()) {
                } else {
                    ddw.a().a(xkw.d, "automatic", BottomSlideNewGuideFrame.this.observeUniqueIdentification());
                }
            }
        };
        if (this.mFrameContext != null) {
            this.mGlobalContext = this.mFrameContext.z();
        }
        this.mHandler = new f(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (this.mFrameContext == null || this.mFrameContext.e() == null) {
            return;
        }
        this.mFrameContext.e().a(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.mRealHeightPx = (int) ((this.mContext.getResources().getDisplayMetrics().widthPixels / 750.0f) * 188.0f);
        layoutParams.height = this.mRealHeightPx;
        view.setLayoutParams(layoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.bottomMargin = -this.mRealHeightPx;
        view.setLayoutParams(marginLayoutParams);
        view.setTag("bottomSlideNewGuideFrame");
    }

    private void initShowAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f308bb", new Object[]{this});
            return;
        }
        this.showAnimator = ValueAnimator.ofInt(-this.mRealHeightPx, 0);
        this.showAnimator.setDuration(300L);
        this.showAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.-$$Lambda$BottomSlideNewGuideFrame$P3ur-oTwHCveY7Q9cUDIA3pEHWM
            {
                BottomSlideNewGuideFrame.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomSlideNewGuideFrame.this.lambda$initShowAnimator$36$BottomSlideNewGuideFrame(valueAnimator);
            }
        });
        this.showAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideNewGuideFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (BottomSlideNewGuideFrame.this.mFrameContext.z().M() || BottomSlideNewGuideFrame.access$100(BottomSlideNewGuideFrame.this) == null) {
                } else {
                    ddw.a().a("com.taobao.taolive.room.init_sab_atmosphere", BottomSlideNewGuideFrame.access$100(BottomSlideNewGuideFrame.this), BottomSlideNewGuideFrame.this.observeUniqueIdentification());
                    BottomSlideNewGuideFrame.access$102(BottomSlideNewGuideFrame.this, null);
                }
            }
        });
    }

    public /* synthetic */ void lambda$initShowAnimator$36$BottomSlideNewGuideFrame(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3fcfd7", new Object[]{this, valueAnimator});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mContainer.getLayoutParams();
        marginLayoutParams.bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.mContainer.setLayoutParams(marginLayoutParams);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (this.mContainer instanceof ViewGroup) {
            ((ViewGroup) this.mContainer).removeAllViews();
            this.mContainer.setVisibility(8);
        }
        if (this.mFrameContext != null && this.mFrameContext.e() != null) {
            this.mFrameContext.e().b(this);
        }
        f fVar = this.mHandler;
        if (fVar == null) {
            return;
        }
        fVar.removeCallbacksAndMessages(null);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_bottom_guide_new_layout_flexalocal;
    }

    private void renderDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b74c51", new Object[]{this});
            return;
        }
        IGoodProxy m = com.taobao.android.live.plugin.proxy.f.m();
        if (m == null) {
            q.b(TAG, "BottomSlideNewGuideFrame: dxRenderEngine is null!");
            return;
        }
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = this.bottomInfo;
        if (recommendCardInfo == null) {
            q.b(TAG, "BottomSlideNewGuideFrame: bottomInfo is null!");
        } else if (recommendCardInfo.dxTemplateName == null) {
            q.b(TAG, "BottomSlideNewGuideFrame: bottomInfo.dxTemplate is null!");
        } else {
            if (this.bottomInfo.dxData == null) {
                q.b(TAG, "BottomSlideNewGuideFrame: bottomInfo.dxData is null!");
            }
            LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo2 = this.bottomInfo;
            if (recommendCardInfo2 == null || recommendCardInfo2.dxTemplateName == null || this.bottomInfo.dxData == null) {
                return;
            }
            this.mDXrootView = m.createDX(this.mContext, this.bottomInfo.dxTemplateName);
            if (this.mDXrootView == null || !(this.mContainer instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) this.mContainer).removeAllViews();
            ((ViewGroup) this.mContainer).addView(this.mDXrootView, new FrameLayout.LayoutParams(-2, -2));
            m.renderDX(this.mDXrootView, this.bottomInfo.dxData);
        }
    }

    private void showUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303410e3", new Object[]{this});
            return;
        }
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = this.bottomInfo;
        if (recommendCardInfo == null || recommendCardInfo.dxData == null || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
            q.b(TAG, "showUT：触发判空保护 return");
        } else {
            phg.a().a(this.mFrameContext, "Show-updownswitch_guideCard", commonTrackParams(this.bottomInfo.dxData));
        }
    }

    private void closeUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438f69e8", new Object[]{this, str});
            return;
        }
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = this.bottomInfo;
        if (recommendCardInfo == null || recommendCardInfo.dxData == null || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
            q.b(TAG, "closeUT：触发判空保护 return");
            return;
        }
        HashMap<String, String> commonTrackParams = commonTrackParams(this.bottomInfo.dxData);
        commonTrackParams.put("close_type", str);
        commonTrackParams.put("duration", Float.toString(((float) (this.mGuideHideTime - this.mGuideShowTime)) / 1000.0f));
        phg.a().a(this.mFrameContext, "updownswitch_guideCard_close", (Map<String, String>) commonTrackParams);
    }

    private void clickUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518ea72e", new Object[]{this});
            return;
        }
        LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = this.bottomInfo;
        if (recommendCardInfo == null || recommendCardInfo.dxData == null || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
            q.b(TAG, "clickUT：触发判空保护 return");
            return;
        }
        HashMap<String, String> commonTrackParams = commonTrackParams(this.bottomInfo.dxData);
        commonTrackParams.put("duration", Float.toString(((float) (this.mGuideHideTime - this.mGuideShowTime)) / 1000.0f));
        phg.a().a(this.mFrameContext, "updownswitch_guideCard", (Map<String, String>) commonTrackParams);
    }

    private HashMap<String, String> commonTrackParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("26d911e6", new Object[]{this, jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("item_id", jSONObject.getString("itemId"));
        hashMap.put("item_type", jSONObject.getString("bizType"));
        return hashMap;
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        g gVar;
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (StringUtils.equals(str, xkw.b)) {
            q.b(TAG, "通过前序校验，开始渲染下滑引导");
            inflateViewOnNeed();
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey("bottomInfo") && (map.get("bottomInfo") instanceof LiveDetailMessinfoResponseData.RecommendCardInfo)) {
                    this.bottomInfo = (LiveDetailMessinfoResponseData.RecommendCardInfo) map.get("bottomInfo");
                    renderDx();
                }
                if (map.containsKey("actionData") && (map.get("actionData") instanceof JSONObject)) {
                    this.actionData = (JSONObject) map.get("actionData");
                }
                if (map.containsKey("popId") && (map.get("popId") instanceof String)) {
                    this.popId = (String) map.get("popId");
                }
            }
            if (this.mDXrootView == null) {
                return;
            }
            ddw.a().a(xkw.c, obj, observeUniqueIdentification());
        } else if (StringUtils.equals(str, xkw.c)) {
            q.b(TAG, "下滑引导DX模板渲染成功，准备展示");
            if (this.mContainer == null) {
                return;
            }
            this.mContainer.setVisibility(0);
            initShowAnimator();
            if (this.showAnimator != null && (gVar = this.mGlobalContext) != null) {
                gVar.h(true);
                this.showAnimator.start();
                this.mGuideShowTime = System.currentTimeMillis();
                JSONObject jSONObject = this.actionData;
                if (jSONObject != null && jSONObject.getJSONObject("bizData") != null && this.actionData.getJSONObject("bizData").getInteger("stayTime") != null && (intValue = this.actionData.getJSONObject("bizData").getInteger("stayTime").intValue()) > 0) {
                    this.mHandler.postDelayed(this.reverseRunnable, intValue * 1000);
                }
            }
            showUT();
            LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo = this.bottomInfo;
            String string = (recommendCardInfo == null || recommendCardInfo.dxData == null) ? null : this.bottomInfo.dxData.getString("bizType");
            if (!StringUtils.equals(string, "1") && !StringUtils.equals(string, "2")) {
                return;
            }
            new com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.expose.a(null).a(this.popId);
            g b = n.b(this.mFrameContext);
            if (b == null || b.F == null) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", (Object) "action_hotReservation");
            JSONObject jSONObject3 = this.actionData;
            if (jSONObject3 == null || this.popId == null || jSONObject3.getString("actionEvent") == null) {
                return;
            }
            jSONObject2.put("name", (Object) this.actionData.getString("actionEvent"));
            b.F.a(true, this.popId, false, jSONObject2);
        } else if (StringUtils.equals(str, xkw.d)) {
            if (obj instanceof LiveItem) {
                this.sabAtmosphereLiveItem = (LiveItem) obj;
            }
            f fVar = this.mHandler;
            if (fVar != null && this.showAnimator != null && this.mGlobalContext != null) {
                fVar.removeCallbacks(this.reverseRunnable);
                this.mGlobalContext.h(false);
                this.showAnimator.reverse();
                this.mGuideHideTime = System.currentTimeMillis();
            }
            if (!(obj instanceof String)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("下滑引导收起，关闭方式：");
            String str2 = (String) obj;
            sb.append(str2);
            q.b(TAG, sb.toString());
            if (StringUtils.equals(str2, xjr.ACTION_BOTTOM_CARD_SWITCH)) {
                ddw.a().a(VideoFrameErrorController.EVENT_AUTO_DOWN, this.mLiveDataModel.mVideoInfo.liveId, observeUniqueIdentification());
                clickUT();
            } else if (StringUtils.equals(str2, xjr.ACTION_BOTTOM_CARD_HIDE)) {
                closeUT("retract");
            } else if (StringUtils.equals(str2, xjr.ACTION_TRAIN_BOTTOM_CARD_CLICK)) {
                clickUT();
            } else if (StringUtils.equals(str2, "videoViewUp")) {
                closeUT("assembly");
            } else {
                closeUT(str2);
            }
        } else if (!StringUtils.equals(str, xkw.e)) {
        } else {
            q.b(TAG, "下滑引导取消自动收起");
            f fVar2 = this.mHandler;
            if (fVar2 == null) {
                return;
            }
            fVar2.removeCallbacks(this.reverseRunnable);
        }
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : this.mFrameContext == null ? "" : this.mFrameContext.G();
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.f34361a, xkw.b, xkw.c, xkw.d, xkw.e};
    }
}
