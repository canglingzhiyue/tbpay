package com.taobao.tao.recommend4.manager.weex2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import com.taobao.tao.util.DensityUtil;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashSet;
import java.util.Map;
import tb.gbg;
import tb.kge;
import tb.ldf;
import tb.otk;
import tb.otl;
import tb.otm;

/* loaded from: classes8.dex */
public class RecommendWeex2ContainerView extends WeexPlatformView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_KEY_ENABLE_AFTER_BUY_CUSTOM_INFO_FLOW_WIDTH = "enableAfterBuyCustomInfoFlowWidth";
    private static final String PROP_BIZ_PARAMS = "bizParams";
    private static final String PROP_BOTTOM_OFFSET = "bottomOffset";
    private static final String PROP_FLY_CHILD_DURATION = "fly-duration";
    private static final String PROP_INFO_FLOW_WIDTH = "infoflowWidth";
    private static final String PROP_LIST_TARGET_HEIGHT = "targetHeight";
    private static final String PROP_PAGE_RENDER_START_TIME = "pageRenderStartTime";
    private static final String PROP_SCROLL_CONTAINER_TYPE = "scrollContainerType";
    private static final String PROP_SWITCH_SCROLL_CLOSE = "enable-scroll-to-dismiss";
    private static final String SCROLL_CONTAINER_TYPE_DRAWER = "drawer";
    private static final String SCROLL_CONTAINER_TYPE_NESTED = "nested";
    private static final String TAG = "RecommendWeex2ContainerView";
    private otk mAbstractWeexRecommendContainer;
    private final otk.a mWeexPlatformViewInvoker;

    static {
        kge.a(491544634);
    }

    public static /* synthetic */ Object ipc$super(RecommendWeex2ContainerView recommendWeex2ContainerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -346507292) {
            super.onUpdateAttrs((Map) objArr[0]);
            return null;
        } else if (hashCode == 577536806) {
            super.dispose();
            return null;
        } else if (hashCode != 1981136165) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onUpdateEvents((HashSet) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ void access$000(RecommendWeex2ContainerView recommendWeex2ContainerView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ff12d6", new Object[]{recommendWeex2ContainerView, str, obj});
        } else {
            recommendWeex2ContainerView.fireEvent(str, obj);
        }
    }

    public RecommendWeex2ContainerView(Context context, int i) {
        super(context, i);
        this.mWeexPlatformViewInvoker = new otk.a() { // from class: com.taobao.tao.recommend4.manager.weex2.RecommendWeex2ContainerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.otk.a
            public void a(String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                    return;
                }
                ldf.d(RecommendWeex2ContainerView.TAG, "fireEvent, method: " + str);
                RecommendWeex2ContainerView.access$000(RecommendWeex2ContainerView.this, str, obj);
            }
        };
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onUpdateEvents(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7615bd25", new Object[]{this, hashSet});
            return;
        }
        super.onUpdateEvents(hashSet);
        ldf.d(TAG, "onUpdateEvents");
        otk otkVar = this.mAbstractWeexRecommendContainer;
        if (otkVar == null) {
            return;
        }
        otkVar.a(hashSet);
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        super.dispose();
        ldf.d(TAG, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        otk otkVar = this.mAbstractWeexRecommendContainer;
        if (otkVar == null) {
            return;
        }
        otkVar.c();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        otk otkVar = this.mAbstractWeexRecommendContainer;
        if (otkVar != null) {
            return otkVar.a();
        }
        return new View(getContext());
    }

    @JSMethod
    public void pageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131f859d", new Object[]{this});
            return;
        }
        ldf.d(TAG, Constant.KEY_PAGEBACK);
        otk otkVar = this.mAbstractWeexRecommendContainer;
        if (otkVar == null) {
            return;
        }
        otkVar.d();
    }

    @WXComponentProp(name = "window_move_dy")
    public void updateWindowMoveY(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d1e560", new Object[]{this, str});
            return;
        }
        ldf.d(TAG, "windowMoveY:" + str);
        if (this.mAbstractWeexRecommendContainer == null) {
            return;
        }
        try {
            this.mAbstractWeexRecommendContainer.d(DensityUtil.dip2px(getContext(), Float.parseFloat(str)));
        } catch (Exception e) {
            ldf.a(TAG, "updateWindowMoveY error. " + e.getMessage(), e);
        }
    }

    @JSMethod
    public void parentScrolled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92dbb07d", new Object[]{this});
            return;
        }
        otk otkVar = this.mAbstractWeexRecommendContainer;
        if (otkVar == null) {
            return;
        }
        otkVar.e();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void onUpdateAttrs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb58b7e4", new Object[]{this, map});
            return;
        }
        super.onUpdateAttrs(map);
        ldf.d(TAG, "onUpdateAttrs ： " + map);
        setScrollContainerType(map.get(PROP_SCROLL_CONTAINER_TYPE));
        setBottomOffset(map.get(PROP_BOTTOM_OFFSET));
        setBizParams(map.get("bizParams"));
        setTargetHeight(map.get(PROP_LIST_TARGET_HEIGHT));
        setFlyDuration(map.get(PROP_FLY_CHILD_DURATION));
        setSwitchScrollClose(map.get(PROP_SWITCH_SCROLL_CLOSE));
        setPageRenderStartTime(map.get(PROP_PAGE_RENDER_START_TIME));
        setInfoFlowWidth(map.get(PROP_INFO_FLOW_WIDTH));
        otk otkVar = this.mAbstractWeexRecommendContainer;
        if (otkVar == null) {
            return;
        }
        otkVar.a(map);
    }

    private void setScrollContainerType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d355db5d", new Object[]{this, str});
            return;
        }
        ldf.d(TAG, "setScrollContainerType ： " + str);
        if (SCROLL_CONTAINER_TYPE_NESTED.equals(str)) {
            otm otmVar = new otm(getContext(), this.mWeexPlatformViewInvoker);
            setWeexPlatformListDelegate(otmVar.f());
            otmVar.a(getNestedScrollManager());
            this.mAbstractWeexRecommendContainer = otmVar;
        } else if (SCROLL_CONTAINER_TYPE_DRAWER.equals(str)) {
            this.mAbstractWeexRecommendContainer = new otl(getContext(), this.mWeexPlatformViewInvoker);
        } else {
            ldf.d(TAG, "传入了无法识别的滚动容器类型：" + str);
        }
    }

    public void setBottomOffset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68b4eb1", new Object[]{this, str});
            return;
        }
        ldf.d(TAG, "setBottomOffset : " + str);
        if (this.mAbstractWeexRecommendContainer == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.mAbstractWeexRecommendContainer.a(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            ldf.a(TAG, "setBottomOffset error. " + e.getMessage(), e);
            if (Debuggable.isDebug()) {
                throw e;
            }
        }
    }

    private void setBizParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8612e188", new Object[]{this, str});
            return;
        }
        ldf.d(TAG, "setBizParams ： " + str);
        if (TextUtils.isEmpty(str) && Debuggable.isDebug()) {
            TBToast.makeText(getContext(), "bizParams为空").show();
            return;
        }
        otk otkVar = this.mAbstractWeexRecommendContainer;
        if (otkVar == null) {
            return;
        }
        otkVar.a(str);
    }

    private void setTargetHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337d76ab", new Object[]{this, str});
            return;
        }
        ldf.d(TAG, "setTargetHeight ： " + str);
        otk otkVar = this.mAbstractWeexRecommendContainer;
        if (otkVar == null) {
            return;
        }
        otkVar.b(str);
    }

    private void setFlyDuration(String str) {
        otk otkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cfcc636", new Object[]{this, str});
            return;
        }
        ldf.d(TAG, "setFlyDuration ： " + str);
        if (TextUtils.isEmpty(str) || (otkVar = this.mAbstractWeexRecommendContainer) == null) {
            return;
        }
        otkVar.b(Integer.parseInt(str));
    }

    private void setSwitchScrollClose(String str) {
        otk otkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("892287e6", new Object[]{this, str});
            return;
        }
        ldf.d(TAG, "setSwitchScrollClose ： " + str);
        if (TextUtils.isEmpty(str) || (otkVar = this.mAbstractWeexRecommendContainer) == null) {
            return;
        }
        otkVar.a(Boolean.parseBoolean(str));
    }

    private void setPageRenderStartTime(String str) {
        otk otkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b1b3799", new Object[]{this, str});
            return;
        }
        ldf.d(TAG, "setPageRenderStartTime ： " + str);
        if (TextUtils.isEmpty(str) || (otkVar = this.mAbstractWeexRecommendContainer) == null) {
            return;
        }
        otkVar.a(Long.parseLong(str));
    }

    private void setInfoFlowWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4dfa779", new Object[]{this, str});
            return;
        }
        ldf.d(TAG, "setInfoFlowWidth ： " + str);
        if (TextUtils.isEmpty(str) || !j.a(ORANGE_KEY_ENABLE_AFTER_BUY_CUSTOM_INFO_FLOW_WIDTH, true)) {
            return;
        }
        try {
            int dip2px = DensityUtil.dip2px(getContext(), (int) Double.parseDouble(str));
            if (dip2px <= 0 || dip2px > gbg.b(getContext())) {
                ldf.d(TAG, "info flow width invalid");
                return;
            }
            otk otkVar = this.mAbstractWeexRecommendContainer;
            if (otkVar == null) {
                return;
            }
            otkVar.c(dip2px);
        } catch (Exception e) {
            ldf.a(TAG, "setInfoFlowWidth error. " + e.getMessage(), e);
        }
    }
}
