package com.taobao.taolive.movehighlight.dx.widget.scrollerLayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.dinamicx.view.b;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.n;
import com.taobao.android.dinamicx.widget.x;
import com.taobao.weex.common.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fuw;
import tb.kge;

/* loaded from: classes8.dex */
public class DXHighlightScrollableLayoutWidgetNode extends x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHIGHLIGHTSCROLLABLELAYOUT_COLUMNCOUNT = 4480460401770252962L;
    public static final long DXHIGHLIGHTSCROLLABLELAYOUT_HIGHLIGHTSCROLLABLELAYOUT = -7332604652759394510L;
    public static final long DXHIGHLIGHTSCROLLABLELAYOUT_ISOPENLOADMORE = 2380170249149374095L;
    public static final long DXHIGHLIGHTSCROLLABLELAYOUT_PRELOADITEMCOUNT = -7119500793674581393L;
    public static final int LOAD_MORE_END = 4;
    public static final String LOAD_MORE_END_STRING = "LOAD_MORE_END";
    public static final int LOAD_MORE_FAIL = 3;
    public static final String LOAD_MORE_FAIL_STRING = "LOAD_MORE_FAIL";
    public static final int LOAD_MORE_IDLE = 1;
    public static final String LOAD_MORE_IDLE_STRING = "LOAD_MORE_IDLE";
    public static final int LOAD_MORE_LOADING = 2;
    public static final String LOAD_MORE_LOADING_STRING = "LOAD_MORE_LOADING";
    public static final int LOAD_MORE_NO_DATA = 5;
    public static final String LOAD_MORE_NO_DATA_STRING = "LOAD_MORE_NO_DATA";
    public static final String MSG_METHOD_UPDATE_SELETED_DATA = "HighlightDXScrollableLayout#updateSelectData";
    public static final String MSG_METHOD_appendData = "HighlightDXScrollableLayout#appendData";
    public static final String MSG_METHOD_change_selected_data = "HighlightDXScrollableLayout#changeSelectData";
    public static final String MSG_METHOD_scroll_refreshData = "HighlightDXScrollableLayout#scroll_refreshData";
    public static final String MSG_METHOD_updateLoadMoreStatus = "HighlightDXScrollableLayout#updateLoadMoreStatus";
    public static final String MSG_PROPERTY_data = "data";
    public static final String MSG_PROPERTY_status = "status";

    /* renamed from: a  reason: collision with root package name */
    private int f21463a = 1;
    private boolean b = true;
    private int c = 3;
    private List<DXWidgetNode> d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface LoadMoreStatus {
    }

    static {
        kge.a(-727761700);
    }

    public static /* synthetic */ Object ipc$super(DXHighlightScrollableLayoutWidgetNode dXHighlightScrollableLayoutWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1834790766:
                super.onBeforeBindChildData();
                return null;
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes8.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1192851379);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXHighlightScrollableLayoutWidgetNode();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXHighlightScrollableLayoutWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 4480460401770252962L) {
            if (i <= 0) {
                i = 1;
            }
            this.f21463a = i;
        } else if (j == 2380170249149374095L) {
            if (i != 0) {
                z = true;
            }
            this.b = z;
        } else if (j == DXHIGHLIGHTSCROLLABLELAYOUT_PRELOADITEMCOUNT) {
            if (i < 0) {
                i = 3;
            }
            this.c = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof DXHighlightScrollableLayoutWidgetNode)) {
        } else {
            super.onClone(dXWidgetNode, z);
            DXHighlightScrollableLayoutWidgetNode dXHighlightScrollableLayoutWidgetNode = (DXHighlightScrollableLayoutWidgetNode) dXWidgetNode;
            this.d = dXHighlightScrollableLayoutWidgetNode.d;
            this.c = dXHighlightScrollableLayoutWidgetNode.c;
            this.f21463a = dXHighlightScrollableLayoutWidgetNode.f21463a;
            this.b = dXHighlightScrollableLayoutWidgetNode.b;
        }
    }

    public boolean a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad9ea594", new Object[]{this, jSONArray})).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        this.itemWidgetNodes.addAll(b(jSONArray));
        getListData().addAll(jSONArray);
        b();
        return true;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            final DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) getDXRuntimeContext().v();
            if (dXNativeRecyclerView == null) {
                return;
            }
            if (dXNativeRecyclerView.getScrollState() == 0 && !dXNativeRecyclerView.isComputingLayout()) {
                if (dXNativeRecyclerView.getAdapter() == null) {
                    return;
                }
                dXNativeRecyclerView.getAdapter().notifyDataSetChanged();
                return;
            }
            dXNativeRecyclerView.post(new Runnable() { // from class: com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (dXNativeRecyclerView.getAdapter() == null) {
                            return;
                        }
                        dXNativeRecyclerView.getAdapter().notifyDataSetChanged();
                    } catch (Throwable th) {
                        com.taobao.android.dinamicx.exception.a.b(th);
                    }
                }
            });
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        this.d = new ArrayList();
        if (getChildren() != null && getChildren().size() > 0) {
            for (int i = 0; i < getChildren().size(); i++) {
                this.d.add(getChildAt(i).deepClone(getDXRuntimeContext()));
            }
        }
        super.onBeforeBindChildData();
    }

    public ArrayList<DXWidgetNode> b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("72632a6b", new Object[]{this, jSONArray}) : generateWidgetNodeByData(getListData().size(), jSONArray, this.d);
    }

    public void a(final int i) {
        final b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) getDXRuntimeContext().v();
        if (dXNativeRecyclerView == null || (bVar = (b) dXNativeRecyclerView.getLayoutManager()) == null) {
            return;
        }
        dXNativeRecyclerView.postDelayed(new Runnable() { // from class: com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    bVar.scrollToPositionWithOffset(i, 0);
                }
            }
        }, 100L);
    }

    @Override // com.taobao.android.dinamicx.widget.x
    public void setLayoutManager(Context context, x xVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f2203d", new Object[]{this, context, xVar, recyclerView});
            return;
        }
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(1048576);
        b bVar = (b) recyclerView.getLayoutManager();
        if (bVar == null) {
            bVar = new b(context, this.f21463a);
            recyclerView.setLayoutManager(bVar);
        }
        if (getOrientation() == 1) {
            bVar.setOrientation(1);
        } else {
            bVar.setOrientation(0);
        }
        bVar.setInitialPrefetchItemCount(5);
        bVar.setItemPrefetchEnabled(xVar.isItemPrefetch());
    }

    @Override // com.taobao.android.dinamicx.widget.x
    public void setAdapter(x xVar, RecyclerView recyclerView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287fbdf7", new Object[]{this, xVar, recyclerView, context});
            return;
        }
        com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.a aVar = (com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.a) recyclerView.getAdapter();
        if (!(xVar instanceof DXHighlightScrollableLayoutWidgetNode)) {
            return;
        }
        DXHighlightScrollableLayoutWidgetNode dXHighlightScrollableLayoutWidgetNode = (DXHighlightScrollableLayoutWidgetNode) xVar;
        if (aVar == null) {
            aVar = new com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.a(context, xVar);
            aVar.setHasStableIds(true);
            aVar.a(dXHighlightScrollableLayoutWidgetNode.itemWidgetNodes);
            recyclerView.setAdapter(aVar);
            aVar.a((b) recyclerView.getLayoutManager());
        } else {
            aVar.a(dXHighlightScrollableLayoutWidgetNode.itemWidgetNodes);
            aVar.a(xVar);
            if (this.contentOffset < 0) {
                ((DXNativeRecyclerView) recyclerView).needScrollAfterLayout(0, 0, dXHighlightScrollableLayoutWidgetNode.contentHorizontalLength, dXHighlightScrollableLayoutWidgetNode.contentVerticalLength);
            }
            aVar.notifyDataSetChanged();
        }
        aVar.e = this.c;
        aVar.d = this.b;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        fuw.b("收到loadMore", new String[0]);
        b(2);
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            postEvent(new DXHighlightScrollableOnLoadMoreEvent());
        }
    }

    public boolean b(int i) {
        com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        View v = getDXRuntimeContext().v();
        if (v == null || !(v instanceof DXNativeRecyclerView) || (aVar = (com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.a) ((DXNativeRecyclerView) v).getAdapter()) == null) {
            return false;
        }
        aVar.a(i);
        fuw.b("更新状态" + i, new String[0]);
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent instanceof DXMsgCenterEvent) {
            DXMsgCenterEvent dXMsgCenterEvent = (DXMsgCenterEvent) dXEvent;
            if (dXMsgCenterEvent.getType().equalsIgnoreCase("General")) {
                JSONObject params = dXMsgCenterEvent.getParams();
                String method = dXMsgCenterEvent.getMethod();
                if (MSG_METHOD_updateLoadMoreStatus.equalsIgnoreCase(method)) {
                    String string = params.getString("status");
                    char c = 65535;
                    switch (string.hashCode()) {
                        case -1870033097:
                            if (string.equals(LOAD_MORE_NO_DATA_STRING)) {
                                c = 4;
                                break;
                            }
                            break;
                        case -464686673:
                            if (string.equals(LOAD_MORE_FAIL_STRING)) {
                                c = 2;
                                break;
                            }
                            break;
                        case -464594331:
                            if (string.equals(LOAD_MORE_IDLE_STRING)) {
                                c = 3;
                                break;
                            }
                            break;
                        case 123556874:
                            if (string.equals(LOAD_MORE_END_STRING)) {
                                c = 1;
                                break;
                            }
                            break;
                        case 622228715:
                            if (string.equals(LOAD_MORE_LOADING_STRING)) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        return b(2);
                    }
                    if (c == 1) {
                        return b(4);
                    }
                    if (c == 2) {
                        return b(3);
                    }
                    if (c == 3) {
                        return b(1);
                    }
                    if (c == 4) {
                        return b(5);
                    }
                    return false;
                } else if (MSG_METHOD_appendData.equalsIgnoreCase(method)) {
                    return a(params.getJSONArray("data"));
                } else {
                    if (MSG_METHOD_scroll_refreshData.equalsIgnoreCase(method)) {
                        Integer integer = params.getInteger("data");
                        if (integer != null) {
                            a(integer.intValue());
                        }
                        return true;
                    } else if (MSG_METHOD_change_selected_data.equalsIgnoreCase(method)) {
                        String string2 = params.getString("itemId");
                        int intValue2 = params.getInteger("subDataIndex").intValue();
                        if (!TextUtils.isEmpty(string2) && intValue2 >= 0) {
                            a(string2, intValue2);
                        }
                    } else if (MSG_METHOD_UPDATE_SELETED_DATA.equalsIgnoreCase(method) && (intValue = params.getInteger("subDataIndex").intValue()) >= 0) {
                        c(intValue);
                    }
                }
            }
        }
        return super.onEvent(dXEvent);
    }

    public void a(String str, final int i) {
        final int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (getDXRuntimeContext() != null && getDXRuntimeContext().s() != null && getDXRuntimeContext().C() != null) {
            JSONObject data = getDXRuntimeContext().s().getData();
            DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) getDXRuntimeContext().v();
            if (data == null || dXNativeRecyclerView == null || (intValue = data.getInteger("selectedItemIndex").intValue()) == i) {
                return;
            }
            data.put("selectedItemIndex", (Object) Integer.valueOf(i));
            data.put("selectedItemId", (Object) str);
            dXNativeRecyclerView.post(new Runnable() { // from class: com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DXHighlightScrollableLayoutWidgetNode.this.d(intValue);
                    }
                }
            });
            dXNativeRecyclerView.post(new Runnable() { // from class: com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DXHighlightScrollableLayoutWidgetNode.this.d(i);
                    }
                }
            });
            if (getDXRuntimeContext().s().getExpandWidgetNode() == null) {
                return;
            }
            List<DXWidgetNode> children = getDXRuntimeContext().s().getExpandWidgetNode().getChildren();
            for (int i2 = 0; i2 < children.size(); i2++) {
                if (children.get(i2).getUserId() == null || !"loadMoreWidget".equals(children.get(i2).getUserId())) {
                    a(children.get(i2));
                }
            }
        }
    }

    public void c(final int i) {
        DXNativeRecyclerView dXNativeRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (getDXRuntimeContext() == null || (dXNativeRecyclerView = (DXNativeRecyclerView) getDXRuntimeContext().v()) == null) {
        } else {
            dXNativeRecyclerView.post(new Runnable() { // from class: com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DXHighlightScrollableLayoutWidgetNode.this.d(i);
                    }
                }
            });
        }
    }

    public void a(DXWidgetNode dXWidgetNode) {
        DinamicXEngine b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
        } else if (getDXRuntimeContext() == null || getDXRuntimeContext().C() == null || (b = getDXRuntimeContext().C().b()) == null) {
        } else {
            b.a(dXWidgetNode, 0, new DXWidgetRefreshOption.a().a(2).a(true).b(true).a());
        }
    }

    public void d(int i) {
        JSONObject data;
        JSONArray jSONArray;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (getDXRuntimeContext() == null || getDXRuntimeContext().s() == null || (data = getDXRuntimeContext().s().getData()) == null || data.getJSONObject("model") == null || (jSONArray = data.getJSONObject("model").getJSONArray("timeMovingList")) == null || jSONArray.size() <= i || (jSONObject = (JSONObject) jSONArray.get(i)) == null || this.itemWidgetNodes == null) {
                return;
            }
            new JSONArray().add(jSONObject);
            this.itemWidgetNodes.remove(i);
            this.itemWidgetNodes.addAll(i, a(i, jSONObject, this.d));
            b();
        } catch (Exception unused) {
        }
    }

    public ArrayList<DXWidgetNode> a(int i, JSONObject jSONObject, List<DXWidgetNode> list) {
        DXRuntimeContext a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("edede80", new Object[]{this, new Integer(i), jSONObject, list});
        }
        ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
        for (DXWidgetNode dXWidgetNode : list) {
            if (dXWidgetNode != null && dXWidgetNode.getDXRuntimeContext() != null && (a2 = dXWidgetNode.getDXRuntimeContext().a(dXWidgetNode)) != null) {
                a2.a((Object) jSONObject);
                a2.b(i);
                HashMap hashMap = new HashMap();
                a2.a((Map<String, f>) hashMap);
                hashMap.put(q.MSGTYPE_INTERVAL, f.a(i));
                hashMap.put(Constants.Name.Recycler.LIST_DATA, f.a(getListData()));
                DXWidgetNode a3 = n.a(dXWidgetNode, a2);
                a3.setParentWidget(this);
                arrayList.add(a3);
            }
        }
        return arrayList;
    }
}
