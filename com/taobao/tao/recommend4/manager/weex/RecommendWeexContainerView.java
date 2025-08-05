package com.taobao.tao.recommend4.manager.weex;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.linklog.a;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.h;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import java.io.Serializable;
import java.util.Map;
import tb.kge;
import tb.ksk;
import tb.ksn;
import tb.ksp;
import tb.ksr;
import tb.opr;
import tb.osc;
import tb.osd;
import tb.otc;

/* loaded from: classes8.dex */
public class RecommendWeexContainerView extends WXVContainer<FrameLayout> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API = "api";
    private static final String BIZ_PARAMS = "bizParams";
    private static final String CHANNEL = "channel";
    private static final String INFO_FLOW_ATTACH_TO_WINDOW = "infoflowrendered";
    private static final String INFO_FLOW_RENDER_END_TIME = "rendertime";
    private static final String OPTIMIZE_TYPE = "optimizeType";
    private static final String PAGE_RENDER_START_TIME = "pageRenderStartTime";
    private static final String QUERY_PARAMS = "queryParams";
    private static final String SHOW_LOADING = "showLoading";
    private static final String TAG = "RCWeexContainerView";
    private static final String VERSION = "version";
    private FrameLayout container;
    private boolean isShowLoading;
    private osc listener;
    private Context mContext;
    private boolean mIsNotifyEnterPage;
    private osd mNewRecommendContainer;
    private long mPageRenderStartTime;
    private RecyclerView mRecyclerView;

    static {
        kge.a(930780382);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(RecommendWeexContainerView recommendWeexContainerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -734487892) {
            if (hashCode != -17468269) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onActivityDestroy();
            return null;
        }
        return super.mo1286getHostView();
    }

    public static /* synthetic */ void access$000(RecommendWeexContainerView recommendWeexContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797790c", new Object[]{recommendWeexContainerView});
        } else {
            recommendWeexContainerView.update();
        }
    }

    public static /* synthetic */ void access$100(RecommendWeexContainerView recommendWeexContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2208722b", new Object[]{recommendWeexContainerView});
        } else {
            recommendWeexContainerView.notifyInfoFlowRenderTime();
        }
    }

    public RecommendWeexContainerView(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.listener = new osc() { // from class: com.taobao.tao.recommend4.manager.weex.RecommendWeexContainerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osc
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                RecommendWeexContainerView.access$000(RecommendWeexContainerView.this);
                RecommendWeexContainerView.access$100(RecommendWeexContainerView.this);
            }

            @Override // tb.osc
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    ksp.c(RecommendWeexContainerView.TAG, "IRecommendCallback onError");
                }
            }
        };
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView  reason: collision with other method in class */
    public FrameLayout mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2b290a72", new Object[]{this, context});
        }
        this.mContext = context;
        this.container = new FrameLayout(context);
        this.container.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return this.container;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: getHostView  reason: collision with other method in class */
    public FrameLayout mo1286getHostView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("6a491daf", new Object[]{this}) : (FrameLayout) super.mo1286getHostView();
    }

    @WXComponentProp(name = "bizParams")
    public void setBizParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8612e188", new Object[]{this, str});
            return;
        }
        a.a("recommendWeex", TAG, "setBizParams : " + str);
        try {
            parseBizParamsAndPerform(str);
        } catch (Throwable unused) {
            ksr.b("weexSetBizParamsError", "1.0", "weexSetBizParamsError", "weexSetBizParamsError", null, null);
            ksp.c(TAG, "parseBizParamsAndPerform error params :" + str);
        }
    }

    @WXComponentProp(name = PAGE_RENDER_START_TIME)
    public void setPageRenderStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5556b515", new Object[]{this, new Long(j)});
            return;
        }
        this.mPageRenderStartTime = j;
        this.mIsNotifyEnterPage = notifyEnterPage(this.mNewRecommendContainer, j);
    }

    @JSMethod
    public void pageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131f859d", new Object[]{this});
            return;
        }
        a.a("recommendWeex", TAG, Constant.KEY_PAGEBACK);
        osd osdVar = this.mNewRecommendContainer;
        if (osdVar == null) {
            return;
        }
        osdVar.a((Map<String, Object>) null);
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        osd osdVar = this.mNewRecommendContainer;
        if (osdVar == null) {
            return;
        }
        osdVar.e();
    }

    private boolean initRecommendContainer(Context context, ksk kskVar) {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("390e87d", new Object[]{this, context, kskVar})).booleanValue();
        }
        if (this.mNewRecommendContainer != null) {
            return false;
        }
        try {
            this.mNewRecommendContainer = osd.a(kskVar);
        } catch (Throwable unused) {
            ksp.c(TAG, "RecommendContainer.newInstance error");
        }
        osd osdVar = this.mNewRecommendContainer;
        if (osdVar != null) {
            osdVar.a(this.listener);
            if (this.mRecyclerView == null) {
                this.mRecyclerView = this.mNewRecommendContainer.a(context);
            }
            if (this.isShowLoading && (adapter = this.mRecyclerView.getAdapter()) != null && (adapter instanceof h)) {
                ((h) this.mRecyclerView.getAdapter()).b(0);
            }
            if (!this.mIsNotifyEnterPage) {
                notifyEnterPage(this.mNewRecommendContainer, this.mPageRenderStartTime);
            }
        }
        update();
        return true;
    }

    private boolean notifyEnterPage(osd osdVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e6e2533", new Object[]{this, osdVar, new Long(j)})).booleanValue();
        }
        if (osdVar == null) {
            ksp.c(TAG, "recommendContainer == null");
            return false;
        }
        otc a2 = osdVar.a();
        if (a2 == null) {
            ksp.c(TAG, "recommendLifeCycleReport == null");
            return false;
        }
        a2.a(j);
        return true;
    }

    private void parseBizParamsAndPerform(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("576f7fc1", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject parseObject = JSON.parseObject(str);
            ksk b = ksk.b(parseObject.getString("channel"));
            if (b == null) {
                ksp.c(TAG, "containerType is null");
                return;
            }
            String string = parseObject.getString("api");
            String string2 = parseObject.getString("version");
            String string3 = parseObject.getString("queryParams");
            this.isShowLoading = HomePageUtility.a(parseObject.getString("showLoading"));
            Map<String, Object> map = null;
            try {
                if (!TextUtils.isEmpty(string3)) {
                    map = (Map) JSON.parseObject(string3, Map.class);
                }
            } catch (Throwable unused) {
                ksp.c(TAG, "queryParamsStr parse error , queryParamsStr :" + string3);
            }
            bizProcess(b, string, string2, map);
        }
    }

    private void bizProcess(ksk kskVar, String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e88add01", new Object[]{this, kskVar, str, str2, map});
        } else if (kskVar == null) {
        } else {
            if (!initRecommendContainer(this.mContext, kskVar) && kskVar == ksk.REC_FAVORITE) {
                return;
            }
            requestData(new ksn(str, str2), map);
        }
    }

    private void requestData(ksn ksnVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93098abb", new Object[]{this, ksnVar, map});
        } else if (this.mNewRecommendContainer == null) {
        } else {
            JSONObject jSONObject = null;
            if (map != null) {
                try {
                    jSONObject = JSONObject.parseObject(JSON.toJSONString(map));
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.mNewRecommendContainer.a(ksnVar, jSONObject);
        }
    }

    private void update() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
        } else if (this.mNewRecommendContainer == null || (frameLayout = this.container) == null || this.mRecyclerView == null) {
        } else {
            if (frameLayout.getChildCount() == 0) {
                ViewGroup.LayoutParams layoutParams = this.mRecyclerView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -1;
                    this.mRecyclerView.setLayoutParams(layoutParams);
                } else {
                    this.mRecyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                }
                if (this.mRecyclerView.getParent() != null) {
                    ((ViewGroup) this.mRecyclerView.getParent()).removeView(this.mRecyclerView);
                }
                this.container.removeAllViews();
                this.container.addView(this.mRecyclerView);
                setParentScrollListener(this.mRecyclerView);
            }
            this.mRecyclerView.setVisibility(0);
            this.mRecyclerView.getAdapter().notifyDataSetChanged();
        }
    }

    private void notifyInfoFlowRenderTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e23c54f", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(INFO_FLOW_RENDER_END_TIME, (Object) String.valueOf(System.currentTimeMillis()));
        jSONObject.put(OPTIMIZE_TYPE, (Object) opr.b());
        fireEvent(INFO_FLOW_ATTACH_TO_WINDOW, jSONObject);
    }

    private void setParentScrollListener(final RecyclerView recyclerView) {
        ViewParent nestedParent;
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b2744a2", new Object[]{this, recyclerView});
        } else if (recyclerView == null || !(recyclerView instanceof HomeChildRecyclerView) || (nestedParent = getNestedParent(recyclerView)) == null || !(nestedParent instanceof CoordinatorLayout) || (childAt = ((CoordinatorLayout) nestedParent).getChildAt(0)) == null || !(childAt instanceof AppBarLayout)) {
        } else {
            ((AppBarLayout) childAt).addOnOffsetChangedListener(new AppBarLayout.a() { // from class: com.taobao.tao.recommend4.manager.weex.RecommendWeexContainerView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.design.widget.AppBarLayout.a
                public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4cc97e1", new Object[]{this, appBarLayout, new Integer(i)});
                    } else {
                        ((HomeChildRecyclerView) recyclerView).onScrolledByNestedParent(null);
                    }
                }
            });
        }
    }

    private ViewParent getNestedParent(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("57ae86a4", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return null;
        }
        for (ViewParent parent = recyclerView.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof CoordinatorLayout) {
                return parent;
            }
        }
        return null;
    }
}
