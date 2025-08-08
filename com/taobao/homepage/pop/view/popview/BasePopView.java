package com.taobao.homepage.pop.view.popview;

import android.content.Context;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.HandlerTimer;
import com.taobao.homepage.pop.protocol.event.IPopMessageListener;
import com.taobao.homepage.pop.protocol.event.IPopViewEventListener;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.utils.d;
import com.taobao.homepage.pop.utils.g;
import tb.kyu;
import tb.laj;
import tb.ldj;

/* loaded from: classes7.dex */
public class BasePopView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_KEY_ENABLE_REMOVE_FINISHED_POP = "enableRemoveFinishedPopWhenResume";
    private static final String TAG = "BasePopView ";
    public com.taobao.homepage.pop.view.container.a mAnchorFinder;
    public View mAnchorView;
    private Boolean mFixPopWhenTabSwitchOnRecommendEnable;
    public HandlerTimer mHandlerTimer;
    public boolean mIsCardVisible;
    public boolean mIsPageVisible;
    public boolean mIsPopLayerInvisible;
    public boolean mIsScrollVisible;
    public boolean mIsTabVisible;
    public int mLastEvent;
    public String mLastMessage;
    public IPopAnchorViewInfo mOriginViewInfo;
    public IPopData mPopData;
    public kyu mPopEngine;
    public IPopViewEventListener mPopEventListener;
    public IPopMessageListener mPopMessageListener;
    public View mPopView;
    public laj mViewProvider;

    public static /* synthetic */ Object ipc$super(BasePopView basePopView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private boolean isTabSwitch(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("305179a1", new Object[]{this, new Integer(i)})).booleanValue() : i == 4 || i == 3;
    }

    public void onHandlePopViewEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3c8c11", new Object[]{this, new Integer(i)});
        }
    }

    public void onHandlePopViewMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dfaabe9", new Object[]{this, str});
        }
    }

    public void onPause(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb560aa8", new Object[]{this, str});
        }
    }

    public void onResume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72eca07d", new Object[]{this, str});
        }
    }

    public void updatePopViewByTimer(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5217badc", new Object[]{this, new Long(j)});
        }
    }

    public BasePopView(Context context, IPopData iPopData, laj lajVar, com.taobao.homepage.pop.view.container.a aVar, kyu kyuVar) {
        super(context);
        this.mLastEvent = -1;
        this.mIsScrollVisible = true;
        this.mIsCardVisible = true;
        this.mIsPageVisible = true;
        this.mIsTabVisible = true;
        this.mIsPopLayerInvisible = true;
        this.mPopEngine = kyuVar;
        this.mPopData = iPopData;
        this.mViewProvider = lajVar;
        this.mAnchorFinder = aVar;
        if (c.a()) {
            setBackgroundColor(Color.parseColor("#33ffff00"));
        }
    }

    public boolean initPopView(View view, IPopAnchorViewInfo iPopAnchorViewInfo, int i, IPopViewEventListener iPopViewEventListener, IPopMessageListener iPopMessageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46c68cf4", new Object[]{this, view, iPopAnchorViewInfo, new Integer(i), iPopViewEventListener, iPopMessageListener})).booleanValue();
        }
        this.mAnchorView = view;
        this.mPopEventListener = iPopViewEventListener;
        this.mPopMessageListener = iPopMessageListener;
        this.mOriginViewInfo = iPopAnchorViewInfo;
        this.mPopView = this.mViewProvider.a(this, this.mPopData, this.mPopEngine);
        if (this.mPopView == null) {
            c.a(TAG, "init view failed, render pop view is null");
            d.a("PopViewFirstVisible", this.mPopData, "popViewCreateFailed", "");
            return false;
        }
        if (this.mPopData.getPopConfig().isInterceptClick()) {
            this.mPopView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.homepage.pop.view.popview.BasePopView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    }
                }
            });
        }
        initPopVisible(i);
        if (this.mPopView.getVisibility() != 0) {
            c.a(TAG, "pop view shown, but not visible");
            d.a("PopViewShowInvisible", this.mPopData);
        }
        addView(this.mPopView);
        translate(0.0f, 0.0f);
        if (!g.d(this.mPopData.getPopConfig().getPopContentType())) {
            d.a("PopViewFirstVisible", this.mPopData);
        }
        initTimer();
        return true;
    }

    public boolean checkReRender() {
        laj lajVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4519fedc", new Object[]{this})).booleanValue();
        }
        View view = this.mPopView;
        if (view != null && (lajVar = this.mViewProvider) != null) {
            return lajVar.a(view, this.mPopData);
        }
        return false;
    }

    public void onInfoFlowEnter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb0d3df", new Object[]{this, new Integer(i)});
        } else if (isTabSwitch(i)) {
            onTabEnter(i);
        } else {
            onPageEnter(i);
        }
    }

    public void onInfoFlowLeave(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaf9f60", new Object[]{this, new Integer(i)});
        } else if (isTabSwitch(i)) {
            onTabLeave(i);
        } else {
            onPageLeave(i);
        }
    }

    public void onPopLayerShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99562ea3", new Object[]{this});
        } else if (!this.mPopData.getPopConfig().isPopLayerHidden()) {
        } else {
            boolean isCurrentVisible = isCurrentVisible();
            this.mIsPopLayerInvisible = false;
            c.a(TAG, "set popLayerInvisible = false, " + hashCode());
            pausePop(isCurrentVisible, d.a(false, 1), true);
        }
    }

    public void onPopLayerDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26527412", new Object[]{this});
        } else if (!this.mPopData.getPopConfig().isPopLayerHidden()) {
        } else {
            boolean isCurrentVisible = isCurrentVisible();
            this.mIsPopLayerInvisible = true;
            c.a(TAG, "set popLayerInvisible = true, " + hashCode());
            resumePop(isCurrentVisible, d.a(true, 1));
        }
    }

    public void onIconScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73803697", new Object[]{this, new Integer(i)});
        } else if (!this.mPopData.getPopConfig().isSideslipHidden()) {
        } else {
            boolean isCurrentVisible = isCurrentVisible();
            if (i == 0) {
                this.mIsScrollVisible = true;
                c.a(TAG, "setScrollVisible = true, " + hashCode());
                resumePop(isCurrentVisible, "PopViewResumeByIconScroll");
                return;
            }
            this.mIsScrollVisible = false;
            c.a(TAG, "setScrollVisible = false, " + hashCode());
            pausePop(isCurrentVisible, "PopViewPauseByIconScroll", true);
        }
    }

    public void translate(float f, float f2) {
        IPopAnchorViewInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b81b595", new Object[]{this, new Float(f), new Float(f2)});
        } else if (!this.mIsCardVisible || (a2 = this.mAnchorFinder.a(this.mAnchorView, 0)) == null) {
        } else {
            int a3 = this.mAnchorFinder.a(this.mPopData, a2, this.mPopView);
            setTranslationY(a3);
            c.c(TAG, "set transY=" + a3 + ", " + this);
        }
    }

    public void onScrollStateChange(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0bc1a8", new Object[]{this, viewGroup, new Integer(i)});
        } else {
            this.mViewProvider.a(viewGroup, this.mPopView, i);
        }
    }

    public void onCardAttached(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339efcd3", new Object[]{this, new Integer(i), view, str});
        } else if (!shouldProcessAttach(view, str)) {
        } else {
            boolean isCurrentVisible = isCurrentVisible();
            this.mIsCardVisible = true;
            c.a(TAG, "setCardVisible = true, " + hashCode());
            resumePop(isCurrentVisible, "PopViewResumeByCard");
        }
    }

    public void onCardDetached(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8be921", new Object[]{this, new Integer(i), view, str});
        } else if (!shouldProcessAttach(view, str)) {
        } else {
            boolean isCurrentVisible = isCurrentVisible();
            this.mIsCardVisible = false;
            c.a(TAG, "setCardVisible = false, " + hashCode());
            pausePop(isCurrentVisible, "PopViewPauseByCard", true);
        }
    }

    public void triggerPopViewEvent(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708e292a", new Object[]{this, new Integer(i), str});
        } else if (!StringUtils.equals(str, this.mPopData.getBusinessID())) {
        } else {
            IPopData iPopData = this.mPopData;
            if (iPopData != null && iPopData.getPopConfig().isPopMessage()) {
                return;
            }
            this.mLastEvent = i;
            c.a(TAG, "update pop event=" + i + ", hashcode=" + this);
            onHandlePopViewEvent(i);
            this.mViewProvider.a(this.mPopView, i, this.mPopData);
            IPopViewEventListener iPopViewEventListener = this.mPopEventListener;
            if (iPopViewEventListener != null) {
                iPopViewEventListener.onEvent(i, this.mPopData);
            }
            if (i != 3) {
                d.a(d.a(i), this.mPopData);
            }
            if (!g.a(i)) {
                return;
            }
            stopTimer();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r8.equals(com.taobao.android.address.themis.ThemisConfig.SCENE_SELECT) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void triggerPopMessage(java.lang.String r8, java.lang.String r9, com.alibaba.fastjson.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.homepage.pop.view.popview.BasePopView.triggerPopMessage(java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        stopTimer();
        this.mIsPopLayerInvisible = false;
        this.mIsScrollVisible = false;
        this.mIsTabVisible = false;
        this.mIsPageVisible = false;
        this.mIsCardVisible = false;
        c.a(TAG, "destroy pop view, " + this);
    }

    public void triggerInvalidPopRemove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832b1d5d", new Object[]{this});
        } else if (this.mPopData.getPopConfig().isPopMessage()) {
            triggerPopMessage("other", this.mPopData.getBusinessID(), null);
        } else {
            triggerPopViewEvent(3, this.mPopData.getBusinessID());
        }
    }

    public IPopAnchorViewInfo getOriginViewInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopAnchorViewInfo) ipChange.ipc$dispatch("89e6e988", new Object[]{this}) : this.mOriginViewInfo;
    }

    public JSONObject getPopReqParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e31b0e10", new Object[]{this}) : g.a(3, "other", this.mPopData);
    }

    public boolean isCurrentVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd1738e", new Object[]{this})).booleanValue();
        }
        c.b(TAG, "visibility, scroll:" + this.mIsScrollVisible + ", card:" + this.mIsCardVisible + ", page:" + this.mIsPageVisible + ", popLayer:" + this.mIsPopLayerInvisible);
        return this.mIsScrollVisible && this.mIsCardVisible && this.mIsPageVisible && this.mIsTabVisible && this.mIsPopLayerInvisible;
    }

    public boolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        IPopData iPopData = this.mPopData;
        if (iPopData != null && iPopData.getPopConfig().isPopMessage()) {
            return g.a(this.mLastMessage);
        }
        return g.a(this.mLastEvent);
    }

    public void pausePop(boolean z, String str, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3111978", new Object[]{this, new Boolean(z), str, new Boolean(z2)});
        } else if (this.mPopView == null) {
        } else {
            if (!z) {
                c.a(TAG, " pop has already pause, discard pausePop");
            } else if (isFinished()) {
                c.a(TAG, " pausePop pop error, already finish");
            } else {
                if (z2) {
                    this.mPopView.setVisibility(4);
                }
                onPause(str);
                stopTimer();
                d.a(str, this.mPopData);
                c.b(TAG, " pausePop, " + this);
            }
        }
    }

    public void resumePop(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6ff053", new Object[]{this, new Boolean(z), str});
        } else if (this.mPopView == null) {
        } else {
            if (z) {
                c.a(TAG, " pop has already resume, discard resumePop");
            } else if (isFinished()) {
                removeFinishedPopIfNeed();
                c.a(TAG, " resumePop pop error, already finish");
            } else if (!isCurrentVisible()) {
                c.a(TAG, " resumePop pop error, currentVisible=false");
            } else {
                onResume(str);
                this.mPopView.setVisibility(0);
                startTimer();
                d.a(str, this.mPopData);
                c.b(TAG, " resumePop, " + this);
            }
        }
    }

    private void removeFinishedPopIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a563e15", new Object[]{this});
        } else if (!ldj.a(ORANGE_KEY_ENABLE_REMOVE_FINISHED_POP, true)) {
        } else {
            triggerInvalidPopRemove();
            c.a(TAG, "remove finished pop when resume");
        }
    }

    private void initTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb3ce1c", new Object[]{this});
        } else if (this.mPopData.getPopConfig().getShowTimeMills() <= 0) {
        } else {
            this.mHandlerTimer = new HandlerTimer(new a(this, this.mPopData));
            this.mHandlerTimer.a(this.mPopData.getPopConfig().getRefreshInterval());
        }
    }

    public void onTabEnter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737ec95a", new Object[]{this, new Integer(i)});
        } else if (!this.mPopData.getPopConfig().isTabSwitchHidden()) {
        } else {
            if (i == 3 && !isRecommendTabSelected()) {
                c.a(TAG, "tabSwitch enter, but recommend tab unselected, discard. " + hashCode());
                return;
            }
            if (i == 3 && isRecommendTabSelected()) {
                c.a(TAG, "tabSwitch enter, but recommend tab selected, discard. " + hashCode());
                if (isFixPopWhenTabSwitchOnRecommend()) {
                    startTimer();
                    c.a(TAG, "startTimer " + hashCode());
                }
            }
            boolean isCurrentVisible = isCurrentVisible();
            this.mIsTabVisible = true;
            c.a(TAG, "setTabVisible = true, " + hashCode());
            resumePop(isCurrentVisible, d.a(true, i));
        }
    }

    public void onTabLeave(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27d94db", new Object[]{this, new Integer(i)});
        } else if (!this.mPopData.getPopConfig().isTabSwitchHidden()) {
        } else {
            if (i == 3 && isRecommendTabSelected()) {
                c.a(TAG, "tabSwitch leave, but recommend tab selected, discard. " + hashCode());
                if (!isFixPopWhenTabSwitchOnRecommend()) {
                    return;
                }
                stopTimer();
                c.a(TAG, "stopTimer " + hashCode());
                return;
            }
            boolean isCurrentVisible = isCurrentVisible();
            boolean shouldChangeVisible = shouldChangeVisible(this.mPopData.getPopConfig(), i);
            this.mIsTabVisible = false;
            c.a(TAG, "setTabVisible = false, changeVisible=" + shouldChangeVisible + ", " + hashCode());
            pausePop(isCurrentVisible, d.a(false, i), shouldChangeVisible);
        }
    }

    public void onPageEnter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79643f32", new Object[]{this, new Integer(i)});
        } else if (!this.mPopData.getPopConfig().isPageSwitchHidden()) {
        } else {
            boolean isCurrentVisible = isCurrentVisible();
            this.mIsPageVisible = true;
            c.a(TAG, "setPageVisible = true, " + hashCode());
            resumePop(isCurrentVisible, d.a(true, i));
        }
    }

    public void onPageLeave(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8630ab3", new Object[]{this, new Integer(i)});
        } else if (!this.mPopData.getPopConfig().isPageSwitchHidden()) {
        } else {
            boolean isCurrentVisible = isCurrentVisible();
            boolean shouldChangeVisible = shouldChangeVisible(this.mPopData.getPopConfig(), i);
            this.mIsPageVisible = false;
            c.a(TAG, "setPageVisible = false, changeVisible=" + shouldChangeVisible + ", " + hashCode());
            pausePop(isCurrentVisible, d.a(false, i), shouldChangeVisible);
        }
    }

    private void stopTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
            return;
        }
        HandlerTimer handlerTimer = this.mHandlerTimer;
        if (handlerTimer == null) {
            return;
        }
        handlerTimer.b();
        c.a(TAG, "stopTimer, " + this);
    }

    private void startTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
            return;
        }
        HandlerTimer handlerTimer = this.mHandlerTimer;
        if (handlerTimer == null) {
            return;
        }
        handlerTimer.a(this.mPopData.getPopConfig().getRefreshInterval());
        c.a(TAG, "startTimer, " + this);
    }

    private boolean shouldProcessAttach(View view, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af877078", new Object[]{this, view, str})).booleanValue() : (view == null || this.mPopData.getPopConfig().getPoint() == null || !StringUtils.equals(str, this.mPopData.getPopConfig().getPoint().getSectionBizCode())) ? false : true;
    }

    private boolean shouldChangeVisible(IPopConfig iPopConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff5ee795", new Object[]{this, iPopConfig, new Integer(i)})).booleanValue();
        }
        if (iPopConfig == null) {
            return false;
        }
        if (i == 1) {
            return iPopConfig.isPopLayerHidden();
        }
        if (i == 3 || i == 4) {
            return iPopConfig.isTabSwitchHidden();
        }
        return iPopConfig.isPageSwitchHidden();
    }

    private boolean isRecommendTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("234178c9", new Object[]{this})).booleanValue();
        }
        kyu kyuVar = this.mPopEngine;
        if (kyuVar != null) {
            return kyuVar.e().a();
        }
        return false;
    }

    private void initPopVisible(int i) {
        IPopData iPopData;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7337abeb", new Object[]{this, new Integer(i)});
        } else if (this.mPopView == null || this.mPopEngine == null || (iPopData = this.mPopData) == null) {
        } else {
            IPopConfig popConfig = iPopData.getPopConfig();
            com.taobao.homepage.pop.view.container.d g = this.mPopEngine.g();
            this.mIsPageVisible = popConfig.isPageSwitchHidden() ? g.g() : true;
            this.mIsTabVisible = popConfig.isTabSwitchHidden() ? g.h() : true;
            this.mIsPopLayerInvisible = popConfig.isPopLayerHidden() ? g.i() : true;
            if (popConfig.isSideslipHidden() && i != 0) {
                z = false;
            }
            this.mIsScrollVisible = z;
            View view = this.mPopView;
            if (!isCurrentVisible()) {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
    }

    private boolean isFixPopWhenTabSwitchOnRecommend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dddb97f", new Object[]{this})).booleanValue();
        }
        if (this.mFixPopWhenTabSwitchOnRecommendEnable == null) {
            this.mFixPopWhenTabSwitchOnRecommendEnable = Boolean.valueOf(ldj.a("fixPopWhenTabSwitchOnRecommendEnable", true));
        }
        return this.mFixPopWhenTabSwitchOnRecommendEnable.booleanValue();
    }

    @Override // android.view.View
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(", ");
        sb.append("height=");
        sb.append(getHeight());
        sb.append(", ");
        sb.append("visibility=");
        sb.append(isCurrentVisible());
        sb.append(", ");
        sb.append("event=");
        sb.append(this.mLastEvent);
        sb.append(", ");
        sb.append("message=");
        sb.append(this.mLastMessage);
        sb.append(", ");
        sb.append("businessId=");
        IPopData iPopData = this.mPopData;
        sb.append(iPopData != null ? iPopData.getBusinessID() : "");
        sb.append(", ");
        sb.append("translationY=");
        sb.append(getTranslationY());
        return sb.toString();
    }

    public void onAppToForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3baf87", new Object[]{this});
            return;
        }
        laj lajVar = this.mViewProvider;
        if (lajVar == null) {
            return;
        }
        lajVar.a();
    }

    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        laj lajVar = this.mViewProvider;
        if (lajVar == null) {
            return;
        }
        lajVar.b();
    }
}
