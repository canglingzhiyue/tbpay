package com.taobao.android.order.bundle;

import android.app.Activity;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.order.bundle.base.BaseFragment;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.h;
import com.taobao.android.order.core.request.DataStatus;
import com.taobao.android.order.core.request.PageStatus;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.bgd;
import tb.dcn;
import tb.hvo;
import tb.hyk;
import tb.hyo;
import tb.hyq;
import tb.hzc;
import tb.hzp;
import tb.kge;

/* loaded from: classes6.dex */
public class OrderListFragment extends BaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int bottomHeight;
    private int bottomMaxHeight;
    private String condition;
    private OnScreenChangedListener mOnScreenChangedListener;
    private JSONObject pageInfoJson;
    private com.alibaba.fastjson.JSONObject presetResponse;
    private h requestConfig;
    private String tabCode;

    static {
        kge.a(-246003133);
    }

    public static /* synthetic */ Object ipc$super(OrderListFragment orderListFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1126882532) {
            return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
        } else {
            if (hashCode != 1860817453) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
    }

    @Override // com.taobao.android.order.core.c
    public void onReloadRequested(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4f8313", new Object[]{this, jSONObject});
        }
    }

    public static /* synthetic */ void access$000(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c419187", new Object[]{orderListFragment});
        } else {
            orderListFragment.setCustomDxWidthSpec();
        }
    }

    public static /* synthetic */ void access$100(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292ea8a6", new Object[]{orderListFragment});
        } else {
            orderListFragment.refreshPage();
        }
    }

    public static /* synthetic */ LinearLayout access$200(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("334e079c", new Object[]{orderListFragment}) : orderListFragment.bottom;
    }

    public static /* synthetic */ int access$300(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4308d6d7", new Object[]{orderListFragment})).intValue() : orderListFragment.bottomHeight;
    }

    public static /* synthetic */ int access$302(OrderListFragment orderListFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("693a8a94", new Object[]{orderListFragment, new Integer(i)})).intValue();
        }
        orderListFragment.bottomHeight = i;
        return i;
    }

    public static /* synthetic */ int access$400(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cff5edf6", new Object[]{orderListFragment})).intValue() : orderListFragment.bottomMaxHeight;
    }

    public static /* synthetic */ OrderRecyclerView access$500(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrderRecyclerView) ipChange.ipc$dispatch("62567f1f", new Object[]{orderListFragment}) : orderListFragment.recyclerView;
    }

    public static /* synthetic */ void access$600(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d01c41", new Object[]{orderListFragment});
        } else {
            orderListFragment.loadData();
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!StringUtils.isEmpty(arguments.getString("url"))) {
                Uri parse = Uri.parse(arguments.getString("url"));
                try {
                    this.condition = parse.getQueryParameter("condition");
                    this.tabCode = parse.getQueryParameter("tabCode");
                } catch (UnsupportedOperationException e) {
                    hyq.a("OrderListFragment", "OLF-PARSER_ERROR", e.toString());
                }
            }
            if (arguments.get("firstMtopResultData") instanceof com.alibaba.fastjson.JSONObject) {
                this.presetResponse = (com.alibaba.fastjson.JSONObject) arguments.get("firstMtopResultData");
            }
        }
        if (dcn.a()) {
            registerOnScreenChangedListener();
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    private void registerOnScreenChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57549641", new Object[]{this});
            return;
        }
        this.mOnScreenChangedListener = new OnScreenChangedListener() { // from class: com.taobao.android.order.bundle.OrderListFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onScreenChanged(int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                    return;
                }
                OrderListFragment.access$000(OrderListFragment.this);
                OrderListFragment.access$100(OrderListFragment.this);
            }
        };
        com.taobao.android.autosize.h.a().c(this.mOnScreenChangedListener);
    }

    private void refreshPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838df391", new Object[]{this});
        } else if (this.orderCoreEngine == null) {
        } else {
            this.orderCoreEngine.e().a(127);
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.refreshLayout.enableLoadMore(true);
        setEndViewVisibility(4);
        this.bottomMaxHeight = hyo.a(getContext(), 100.0f);
        if (getActivity() instanceof TBOrderListActivity) {
            ((TBOrderListActivity) getActivity()).a(this.orderCoreEngine);
        }
        if (dcn.a()) {
            setCustomDxWidthSpec();
        }
        loadData();
    }

    private void setEndViewVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c602c4c", new Object[]{this, new Integer(i)});
        } else if (this.recyclerView.getEndView() == null) {
        } else {
            this.recyclerView.getEndView().setVisibility(i);
        }
    }

    private void setCustomDxWidthSpec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ee0781", new Object[]{this});
            return;
        }
        int a2 = com.taobao.android.autosize.h.a().a(getContext());
        if (!com.taobao.android.autosize.h.a().b(getContext())) {
            a2 /= 2;
        }
        int a3 = DXWidgetNode.DXMeasureSpec.a(a2, 1073741824);
        hzc e = this.orderCoreEngine.e();
        if (!(e instanceof hzp)) {
            return;
        }
        ((hzp) e).d().q().f(a3);
    }

    private void loadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7157237", new Object[]{this});
        } else if (this.orderCoreEngine == null) {
        } else {
            this.requestConfig.l().put("page", "1");
            setLoadingVisibility(0);
            this.orderCoreEngine.b();
            if (this.presetResponse == null) {
                this.orderCoreEngine.a(this);
                return;
            }
            this.orderCoreEngine.a(this.presetResponse, this);
            this.presetResponse = null;
        }
    }

    public void pullLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f321b347", new Object[]{this});
            return;
        }
        if (this.pageInfoJson != null) {
            this.requestConfig.l().put("page", this.pageInfoJson.optString("nextPageIndex"));
        }
        if (this.orderCoreEngine == null) {
            return;
        }
        this.orderCoreEngine.a(this);
    }

    @Override // com.taobao.android.order.bundle.base.BaseFragment
    public OrderConfigs buildOrderConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrderConfigs) ipChange.ipc$dispatch("1e04643d", new Object[]{this}) : new OrderConfigs.a(getContext()).a(OrderConfigs.BizNameType.ORDER_LIST).a(buildListRequestConfig()).a(this.top, this.recyclerView, this.bottom).a(new JSONArray()).a(this.traceId).a();
    }

    private h buildListRequestConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("ee94371", new Object[]{this});
        }
        h hVar = this.requestConfig;
        if (hVar != null) {
            return hVar;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("condition", StringUtils.isEmpty(this.condition) ? generateCondition().toJSONString() : hyo.a(this.condition));
        if (!StringUtils.isEmpty(this.tabCode)) {
            hashMap.put("tabCode", this.tabCode);
        }
        hashMap.put("OrderType", "OrderList");
        hashMap.put("page", "1");
        hashMap.put("appName", hvo.b());
        hashMap.put("appVersion", hvo.c());
        this.requestConfig = new h(getContext()).a(hyk.b()).b("1.0").d("UNIT_TRADE").a(true).a(hashMap);
        return this.requestConfig;
    }

    private com.alibaba.fastjson.JSONObject generateCondition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("fd3403cd", new Object[]{this});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("version", (Object) "1.0.0");
        if (bgd.a()) {
            jSONObject.put("inner", (Object) "1");
        }
        return jSONObject;
    }

    private void loadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8368c920", new Object[]{this});
            return;
        }
        this.refreshLayout.setLoadMore(false);
        setLoadingVisibility(8);
    }

    private void setLoadingVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be801b0", new Object[]{this, new Integer(i)});
            return;
        }
        View findViewById = this.contentView.findViewById(R.id.mask_layout);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(i);
        findViewById.bringToFront();
    }

    @Override // com.taobao.android.order.core.c
    public void onLoadError(String str, MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8b03e2", new Object[]{this, str, mtopResponse, dataStatus, pageStatus});
            return;
        }
        loadFinish();
        showNetWorkErrorLayoutVisible(mtopResponse);
    }

    @Override // com.taobao.android.order.core.c
    public void onLoadSuccess(MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329d6593", new Object[]{this, mtopResponse, dataStatus, pageStatus});
            return;
        }
        loadFinish();
        if (mtopResponse != null && mtopResponse.getDataJsonObject() != null) {
            try {
                this.pageInfoJson = mtopResponse.getDataJsonObject().getJSONObject("global").getJSONObject("pageControl");
            } catch (Exception unused) {
            }
        }
        loadSuccess();
    }

    private void loadSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50840244", new Object[]{this});
            return;
        }
        this.tbErrorView.setVisibility(8);
        setEndViewVisibility(0);
        this.recyclerView.resetScroll();
        offsetRecyclerView();
        JSONObject jSONObject = this.pageInfoJson;
        if (jSONObject == null || Boolean.parseBoolean(jSONObject.optString("hasMore"))) {
            return;
        }
        this.recyclerView.removeAllEndViews();
        this.refreshLayout.enableLoadMore(false);
    }

    private void offsetRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67279cbe", new Object[]{this});
        } else {
            this.bottom.post(new Runnable() { // from class: com.taobao.android.order.bundle.OrderListFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int height = OrderListFragment.access$200(OrderListFragment.this).getHeight();
                    if (height == OrderListFragment.access$300(OrderListFragment.this)) {
                        return;
                    }
                    OrderListFragment.access$302(OrderListFragment.this, height);
                    OrderListFragment.access$500(OrderListFragment.this).setPadding(0, 0, 0, Math.min(height, OrderListFragment.access$400(OrderListFragment.this)));
                }
            });
        }
    }

    public void showNetWorkErrorLayoutVisible(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27764fd", new Object[]{this, mtopResponse});
            return;
        }
        this.tbErrorView.setVisibility(0);
        this.tbErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, b.a(R.string.order_biz_refresh), new View.OnClickListener() { // from class: com.taobao.android.order.bundle.OrderListFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    OrderListFragment.access$600(OrderListFragment.this);
                }
            }
        });
        if (mtopResponse == null) {
            return;
        }
        this.tbErrorView.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
    }

    @Override // com.taobao.android.order.core.c
    public void onLoadSuccess(com.alibaba.fastjson.JSONObject jSONObject, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a82554", new Object[]{this, jSONObject, dataStatus, pageStatus});
            return;
        }
        loadFinish();
        try {
            com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("global");
            if (jSONObject2.getJSONObject("pageControl") != null) {
                this.pageInfoJson = new JSONObject(jSONObject2.getJSONObject("pageControl"));
            }
        } catch (Throwable unused) {
        }
        loadSuccess();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.mOnScreenChangedListener == null) {
            return;
        }
        com.taobao.android.autosize.h.a().d(this.mOnScreenChangedListener);
    }
}
