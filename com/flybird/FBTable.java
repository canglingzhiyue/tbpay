package com.flybird;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.android.app.template.LogCatLog;
import com.alipay.android.app.template.Tracker;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.api.FBOverView;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.APPullRefreshView;
import com.flybird.FBListView;
import com.flybird.view.APDefaultPullRefreshOverView;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.android.weex_framework.util.a;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class FBTable extends FBView implements FBListView.FBListViewDragListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public APPullRefreshView A;
    public boolean B;
    public FBListView C;
    public View D;
    public View E;
    public Item F;
    public int G;
    public final List<Item> H;
    public final HashMap<Pair<Integer, Integer>, Integer> I;
    public String J;
    public HashMap<View, FBDocument> K;
    public HashMap<String, Integer> L;
    public AutoScrollMoreListAdapter M;
    public boolean N;
    public boolean O;
    public boolean P;

    /* loaded from: classes4.dex */
    public static final class Item {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f7182a;
        public int b;
        public int c;

        public Item(JSONObject jSONObject, int i, int i2) {
            this.f7182a = jSONObject;
            this.b = i;
            this.c = i2;
        }
    }

    public FBTable(final Context context, FBDocument fBDocument) {
        super(context, new APPullRefreshView(context), fBDocument);
        this.B = false;
        this.H = new LinkedList();
        this.I = new HashMap<>();
        this.K = new HashMap<>();
        this.L = new HashMap<>();
        this.N = false;
        this.O = false;
        this.P = false;
        APPullRefreshView aPPullRefreshView = (APPullRefreshView) this.mView;
        this.A = aPPullRefreshView;
        FBListView fBListView = new FBListView(context);
        this.C = fBListView;
        aPPullRefreshView.addView(fBListView);
        this.C.setFBListViewDragListener(this);
        this.A.setRefreshListener(new APPullRefreshView.RefreshListener() { // from class: com.flybird.FBTable.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.flybird.APPullRefreshView.RefreshListener
            public boolean canRefresh() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("176657f6", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.flybird.APPullRefreshView.RefreshListener
            public FBOverView getOverView() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (FBOverView) ipChange.ipc$dispatch("c58eb87e", new Object[]{this});
                }
                APDefaultPullRefreshOverView aPDefaultPullRefreshOverView = (APDefaultPullRefreshOverView) LayoutInflater.from(context).inflate(R.layout.ap_framework_pullrefresh_overview, (ViewGroup) null);
                int parseColor = Color.parseColor("#efeff4");
                aPDefaultPullRefreshOverView.setBackgroundColor(parseColor);
                View findViewById = aPDefaultPullRefreshOverView.findViewById(R.id.framework_pullrefresh_shadow_loading);
                if (findViewById != null) {
                    findViewById.setBackgroundColor(parseColor);
                }
                View findViewById2 = aPDefaultPullRefreshOverView.findViewById(R.id.framework_pullrefresh_shadow_normal);
                if (findViewById2 != null) {
                    findViewById2.setBackgroundColor(parseColor);
                }
                return aPDefaultPullRefreshOverView;
            }

            @Override // com.flybird.APPullRefreshView.RefreshListener
            public void onRefresh() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                    return;
                }
                FBTable fBTable = FBTable.this;
                if (!fBTable.O) {
                    fBTable.A.b();
                    return;
                }
                APPullRefreshView aPPullRefreshView2 = fBTable.A;
                aPPullRefreshView2.f7105a = (byte) 5;
                aPPullRefreshView2.e.onLoad();
                aPPullRefreshView2.e.setState((byte) 3);
                aPPullRefreshView2.requestLayout();
                FBTable.this.A.postDelayed(new Runnable() { // from class: com.flybird.FBTable.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        FBView.nativePlatformOnRefresh(FBTable.this.mNode);
                        FBTable.this.A.b();
                    }
                }, 800L);
            }
        });
        this.A.setEnablePull(false);
        this.C.setDivider(new ColorDrawable(0));
        this.C.setDividerHeight(0);
    }

    public static /* synthetic */ boolean a(FBTable fBTable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e3d4020", new Object[]{fBTable, new Boolean(z)})).booleanValue();
        }
        fBTable.B = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(FBTable fBTable, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1022301035) {
            super.updateCSS((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 1244158581) {
            super.updateAttr((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode != 1852014070) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.doDestroy();
            return null;
        }
    }

    public static native String nativeNodeToJson(long j);

    public static native boolean nativePlatformOnMoveRow(long j, int i, int i2, int i3);

    @Override // com.flybird.FBView
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        AutoScrollMoreListAdapter autoScrollMoreListAdapter = this.M;
        if (autoScrollMoreListAdapter != null) {
            autoScrollMoreListAdapter.clearData();
        }
        super.doDestroy();
    }

    @Override // com.flybird.FBListView.FBListViewDragListener
    public void onDragViewDown(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c667e1e2", new Object[]{this, new Integer(i)});
        } else if (this.F == null) {
        } else {
            long j = this.mNode;
            Item item = this.F;
            nativePlatformOnMoveRow(j, item.b, this.G, item.c);
            this.H.set(i, this.F);
            this.I.put(new Pair<>(Integer.valueOf(this.F.b), Integer.valueOf(this.F.c)), Integer.valueOf(i));
            this.F = null;
        }
    }

    @Override // com.flybird.FBListView.FBListViewDragListener
    public void onDragViewMoved(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddd2382", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == i2) {
        } else {
            Item item = this.H.get(i);
            Item item2 = this.H.get(i2);
            if (item.b != item2.b || (i3 = item2.c) == -1) {
                return;
            }
            int i4 = item.c;
            item.c = i3;
            item2.c = i4;
            this.H.remove(i);
            this.I.remove(new Pair(Integer.valueOf(item.b), Integer.valueOf(item.c)));
            this.H.add(i2, item);
            this.I.put(new Pair<>(Integer.valueOf(item.b), Integer.valueOf(item.c)), Integer.valueOf(i2));
        }
    }

    @Override // com.flybird.FBListView.FBListViewDragListener
    public void onDragViewStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a307352", new Object[]{this, new Integer(i)});
            return;
        }
        Item item = this.H.get(i);
        this.F = item;
        this.G = item.c;
    }

    @Override // com.flybird.FBView
    public void updateAttr(String str, String str2) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a285a75", new Object[]{this, str, str2});
        } else if (isDestroyed() || str == null) {
        } else {
            int hashCode = str.hashCode();
            if (hashCode == -980170895) {
                if (str.equals("scrollToPosition")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != -867681213) {
                if (hashCode == 1367455433 && str.equals("enabledragtoreorder")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals("disableLoadmore")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        super.updateAttr(str, str2);
                        return;
                    } else {
                        this.C.setDragingEnable(Boolean.parseBoolean(str2));
                        return;
                    }
                } else if (this.M != null) {
                    if ("true".equals(str2)) {
                        this.M.disableLoadMore();
                        return;
                    } else {
                        this.M.enableLoadMore();
                        return;
                    }
                } else {
                    this.N = "true".equals(str2);
                    return;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(str2);
                int optInt = jSONObject.optInt(AbsListWidgetInstance.SLOT_SECTION, -1);
                int optInt2 = jSONObject.optInt(a.ATOM_EXT_row, -1);
                boolean optBoolean = jSONObject.optBoolean("animated", false);
                Integer num = this.I.get(new Pair(Integer.valueOf(optInt), Integer.valueOf(optInt2)));
                if (num == null) {
                    num = -1;
                }
                int intValue = num.intValue();
                if (intValue < 0) {
                    FBLogger.e("FBTable", "can't find pos for section: " + optInt + " row: " + optInt2);
                }
                if (optBoolean) {
                    this.C.smoothScrollToPositionFromTop(intValue, 0, 300);
                } else {
                    this.C.setSelection(intValue);
                }
            } catch (Throwable th) {
                FBLogger.e("FBTable", "scrollToPosition exception ", th);
            }
        }
    }

    @Override // com.flybird.FBView
    public void updateCSS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c310ec95", new Object[]{this, str, str2});
        } else if (str == null || isDestroyed()) {
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1989658977) {
                if (hashCode != -1241799045) {
                    if (hashCode == 1430713407 && str.equals("refresh-style")) {
                        c = 2;
                    }
                } else if (str.equals("separator-color")) {
                    c = 1;
                }
            } else if (str.equals("loadmore-style")) {
                c = 0;
            }
            if (c == 0) {
                this.P = !"false".equalsIgnoreCase(str2);
            } else if (c == 1) {
                putThemeModeAssociatedActions(FBView.THEME_ASSOCIATED_TYPE_CSS, str, str2);
                this.C.setDivider(new ColorDrawable(FBTools.parseColor(str2, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping)));
                this.C.setDividerHeight((int) TypedValue.applyDimension(1, 0.5f, this.mDoc.k.getResources().getDisplayMetrics()));
            } else if (c != 2) {
                super.updateCSS(str, str2);
            } else {
                boolean z = !"false".equalsIgnoreCase(str2);
                this.O = z;
                this.A.setEnablePull(z);
            }
        }
    }

    @Override // com.flybird.FBView
    public void updateEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278e3c6c", new Object[]{this, str, str2});
        } else if (!str.equals("event") || !str2.equals(c.KEY_DATA_SOURCE)) {
        } else {
            BirdNestEngine engine = this.mDoc.getEngine();
            final String nativeNodeToJson = nativeNodeToJson(this.mNode);
            if (nativeNodeToJson == null) {
                FBLogger.e("FBTable", "transform to json failed!");
                return;
            }
            try {
                JSONArray optJSONArray = new JSONObject(nativeNodeToJson).optJSONArray("tplList");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    return;
                }
                engine.runOnUiThread(new Runnable() { // from class: com.flybird.FBTable.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        final FBTable fBTable = FBTable.this;
                        String str3 = nativeNodeToJson;
                        fBTable.getClass();
                        LogCatLog.d("FBTable", "populateListView() in");
                        if (str3 == null) {
                            FBLogger.e("FBTable", "transform to json failed!");
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(str3);
                            JSONArray optJSONArray2 = jSONObject.optJSONArray(Constants.Name.ROWS);
                            JSONArray optJSONArray3 = jSONObject.optJSONArray("sections");
                            int length = optJSONArray3 == null ? 0 : optJSONArray3.length();
                            if (optJSONArray2 == null || optJSONArray2.length() < length) {
                                FBLogger.e("FBTable", "rows config is invalid!");
                            }
                            fBTable.H.clear();
                            fBTable.I.clear();
                            if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                                int i = 0;
                                while (i < optJSONArray3.length()) {
                                    fBTable.H.add(new Item((JSONObject) optJSONArray3.get(i), i, -1));
                                    JSONArray jSONArray = (JSONArray) optJSONArray2.get(i);
                                    if (jSONArray != null && jSONArray.length() > 0) {
                                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                            fBTable.H.add(new Item((JSONObject) jSONArray.get(i2), i, i2));
                                        }
                                    }
                                    i++;
                                }
                                while (true) {
                                    int i3 = i + 1;
                                    if (i >= optJSONArray2.length()) {
                                        break;
                                    }
                                    JSONArray jSONArray2 = (JSONArray) optJSONArray2.get(i3);
                                    if (jSONArray2 != null && jSONArray2.length() > 0) {
                                        for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                                            fBTable.H.add(new Item((JSONObject) jSONArray2.get(i4), i3, i4));
                                        }
                                    }
                                    i = i3;
                                }
                            } else if (optJSONArray2.length() == 0) {
                                return;
                            } else {
                                int i5 = 0;
                                for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                                    JSONArray jSONArray3 = (JSONArray) optJSONArray2.get(i6);
                                    if (jSONArray3 != null && jSONArray3.length() > 0) {
                                        int i7 = i5;
                                        for (int i8 = 0; i8 < jSONArray3.length(); i8++) {
                                            fBTable.H.add(new Item((JSONObject) jSONArray3.get(i8), -1, i7));
                                            i7++;
                                        }
                                        i5 = i7;
                                    }
                                }
                            }
                            fBTable.J = jSONObject.optString("onitemclick");
                            JSONObject optJSONObject = jSONObject.optJSONObject("header");
                            if (optJSONObject != null && optJSONObject.length() > 0) {
                                String optString = optJSONObject.optString("tpl");
                                if (StringUtils.isEmpty(optString)) {
                                    optString = optJSONObject.optString("tplId");
                                }
                                FBDocument a2 = fBTable.a(optString, optJSONObject.optString("data"));
                                if (a2 != null && a2.getContentView() != null) {
                                    if (fBTable.D != null && fBTable.C.getHeaderViewsCount() > 0) {
                                        fBTable.C.removeHeaderView(fBTable.D);
                                    }
                                    fBTable.D = a2.getContentView();
                                    fBTable.D.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                                    fBTable.C.addHeaderView(fBTable.D);
                                }
                            }
                            JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
                            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                                String optString2 = optJSONObject2.optString("tpl");
                                if (StringUtils.isEmpty(optString2)) {
                                    optString2 = optJSONObject2.optString("tplId");
                                }
                                FBDocument a3 = fBTable.a(optString2, optJSONObject2.optString("data"));
                                if (a3 != null && a3.getContentView() != null) {
                                    if (fBTable.E != null && fBTable.C.getFooterViewsCount() > 0) {
                                        fBTable.C.removeFooterView(fBTable.E);
                                    }
                                    fBTable.E = a3.getContentView();
                                    fBTable.E.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                                    fBTable.C.addFooterView(fBTable.E);
                                }
                            }
                            for (int i9 = 0; i9 < fBTable.H.size(); i9++) {
                                Item item = fBTable.H.get(i9);
                                if (item != null && item.f7182a != null) {
                                    fBTable.I.put(new Pair<>(Integer.valueOf(item.b), Integer.valueOf(item.c)), Integer.valueOf(i9));
                                    String string = item.f7182a.getString("tplId");
                                    if (!fBTable.L.containsKey(string)) {
                                        HashMap<String, Integer> hashMap = fBTable.L;
                                        hashMap.put(string, Integer.valueOf(hashMap.size()));
                                    }
                                }
                            }
                            if (!fBTable.B) {
                                AutoScrollMoreListAdapter autoScrollMoreListAdapter = new AutoScrollMoreListAdapter(fBTable.mDoc.k, fBTable.C, fBTable.H) { // from class: com.flybird.FBTable.4
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.flybird.AutoScrollMoreListAdapter
                                    public View getFailView() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            return (View) ipChange3.ipc$dispatch("5dcdf4a2", new Object[]{this});
                                        }
                                        return null;
                                    }

                                    @Override // android.widget.BaseAdapter, android.widget.Adapter
                                    public int getItemViewType(int i10) {
                                        String optString3;
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            return ((Number) ipChange3.ipc$dispatch("65c98627", new Object[]{this, new Integer(i10)})).intValue();
                                        }
                                        if (i10 >= 0 && i10 < FBTable.this.H.size() && (optString3 = FBTable.this.H.get(i10).f7182a.optString("tplId")) != null) {
                                            return FBTable.this.L.get(optString3).intValue();
                                        }
                                        return 0;
                                    }

                                    @Override // com.flybird.AutoScrollMoreListAdapter
                                    public View getLoadingView() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            return (View) ipChange3.ipc$dispatch("dc3c0794", new Object[]{this});
                                        }
                                        if (!FBTable.this.P) {
                                            return null;
                                        }
                                        return LayoutInflater.from(this.mContext).inflate(R.layout.default_load_more, (ViewGroup) null);
                                    }

                                    @Override // android.widget.Adapter
                                    public View getView(int i10, View view, ViewGroup viewGroup) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            return (View) ipChange3.ipc$dispatch("277ed392", new Object[]{this, new Integer(i10), view, viewGroup});
                                        }
                                        JSONObject jSONObject2 = FBTable.this.H.get(i10).f7182a;
                                        if (!BirdNestEngine.useNoFootprint && (!jSONObject2.has("data") || !jSONObject2.has("tplId"))) {
                                            Tracker.recordFootprint("DynamicTemplateService", "exception while FBTable.getView", jSONObject2.toString(), null);
                                        }
                                        String optString3 = jSONObject2.optString("data");
                                        if (view == null) {
                                            String optString4 = jSONObject2.optString("tpl");
                                            if (StringUtils.isEmpty(optString4)) {
                                                optString4 = jSONObject2.optString("tplId");
                                            }
                                            FBDocument a4 = FBTable.this.a(optString4, optString3);
                                            if (a4 != null && a4.getContentView() != null) {
                                                view = a4.getContentView();
                                                view.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                                                FBTable.this.K.put(view, a4);
                                            } else {
                                                if (!BirdNestEngine.useNoFootprint) {
                                                    Tracker.recordFootprint("DynamicTemplateService", "exception while FBTable.getView trigger a async template download", "tplId: " + optString4, null);
                                                }
                                                return new View(FBTable.this.mDoc.k);
                                            }
                                        } else {
                                            FBDocument fBDocument = FBTable.this.K.get(view);
                                            if (!"undefined".equals(optString3) && fBDocument != null) {
                                                fBDocument.reloadDataWithResult(optString3);
                                            }
                                        }
                                        if (FBTable.this.F == null && view.getVisibility() != 0) {
                                            view.setVisibility(0);
                                        } else {
                                            Item item2 = FBTable.this.F;
                                            if (item2 != null && item2 == getItem(i10)) {
                                                view.setVisibility(4);
                                            } else {
                                                view.setVisibility(0);
                                            }
                                        }
                                        return view;
                                    }

                                    @Override // android.widget.BaseAdapter, android.widget.Adapter
                                    public int getViewTypeCount() {
                                        IpChange ipChange3 = $ipChange;
                                        return ipChange3 instanceof IpChange ? ((Number) ipChange3.ipc$dispatch("aaed7894", new Object[]{this})).intValue() : this.mListView.getHeaderViewsCount() + this.mListView.getFooterViewsCount() + FBTable.this.L.size();
                                    }

                                    @Override // com.flybird.AutoScrollMoreListAdapter
                                    public void itemClick(AdapterView<?> adapterView, View view, int i10, long j) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("14ed6cb1", new Object[]{this, adapterView, view, new Integer(i10), new Long(j)});
                                        }
                                    }

                                    @Override // com.flybird.AutoScrollMoreListAdapter
                                    public boolean onAutoLoadMore() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            return ((Boolean) ipChange3.ipc$dispatch("480fc7b4", new Object[]{this})).booleanValue();
                                        }
                                        FBTable fBTable2 = FBTable.this;
                                        if (!fBTable2.P) {
                                            return false;
                                        }
                                        fBTable2.A.postDelayed(new Runnable() { // from class: com.flybird.FBTable.4.1
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                IpChange ipChange4 = $ipChange;
                                                if (ipChange4 instanceof IpChange) {
                                                    ipChange4.ipc$dispatch("5c510192", new Object[]{this});
                                                    return;
                                                }
                                                FBTable.a(FBTable.this, true);
                                                FBView.nativePlatformOnLoadMore(FBTable.this.mNode);
                                            }
                                        }, 800L);
                                        return true;
                                    }

                                    @Override // com.flybird.AutoScrollMoreListAdapter
                                    public void onRetry() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("c2145010", new Object[]{this});
                                        }
                                    }
                                };
                                fBTable.M = autoScrollMoreListAdapter;
                                if (fBTable.N) {
                                    autoScrollMoreListAdapter.disableLoadMore();
                                } else {
                                    autoScrollMoreListAdapter.enableLoadMore();
                                }
                                FBListView fBListView = fBTable.C;
                                fBListView.setSelector(ContextCompat.getDrawable(fBListView.getContext(), R.drawable.listselector));
                                fBTable.C.setAdapter((ListAdapter) fBTable.M);
                            } else {
                                AutoScrollMoreListAdapter autoScrollMoreListAdapter2 = fBTable.M;
                                if (autoScrollMoreListAdapter2 != null) {
                                    autoScrollMoreListAdapter2.notifyLoadMoreFinished();
                                }
                            }
                            if (fBTable.J == null) {
                                return;
                            }
                            fBTable.C.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.flybird.FBTable.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.widget.AdapterView.OnItemClickListener
                                public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
                                    long j2;
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i10), new Long(j)});
                                        return;
                                    }
                                    int headerViewsCount = i10 - FBTable.this.C.getHeaderViewsCount();
                                    if (!FBTable.this.C.isIndexInBound(headerViewsCount)) {
                                        return;
                                    }
                                    Item item2 = FBTable.this.H.get(headerViewsCount);
                                    boolean z = !StringUtils.isEmpty(FBTable.this.J);
                                    try {
                                        j2 = Long.decode(FBTable.this.J).longValue();
                                    } catch (NumberFormatException unused) {
                                        j2 = 0;
                                        z = false;
                                    }
                                    if (!z || item2.c == -1) {
                                        return;
                                    }
                                    FBView.nativePlatformOnItemClick(FBTable.this.mNode, item2.c, item2.b, j2);
                                }
                            });
                        } catch (JSONException e) {
                            FBLogger.e("FBTable", "exception in updateEvent():", e);
                        }
                    }
                });
            } catch (Throwable th) {
                LogCatLog.e("FBTable", th);
            }
        }
    }

    public final FBDocument a(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBDocument) ipChange.ipc$dispatch("75917c01", new Object[]{this, str, str2});
        }
        if (this.mDoc != null && this.mDoc.param != null && this.mDoc.param.resourceClient != null) {
            Object shouldInterceptResource = this.mDoc.param.resourceClient.shouldInterceptResource(str, FBResourceClient.Type.INNER_FRAME);
            str3 = FBDocumentAssistor.a(shouldInterceptResource != null ? String.valueOf(shouldInterceptResource) : null);
        } else {
            if (this.mDoc == null || this.mDoc.param == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread: ");
                sb.append(Thread.currentThread());
                sb.append("FBTable instance: ");
                sb.append(this);
                sb.append("mDoc: ");
                sb.append(this.mDoc);
                sb.append(", mDoc.param: ");
                sb.append(this.mDoc == null ? a.ATOM_EXT_Null : this.mDoc.param);
                sb.append("\n");
                sb.append("current calling stack: \n");
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                if (stackTrace != null) {
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement);
                        sb.append("\n");
                    }
                }
            }
            str3 = null;
        }
        StringUtils.isEmpty(str3);
        if (!StringUtils.isEmpty(str3)) {
            if (StringUtils.isEmpty(str2)) {
                str2 = "{}";
            }
            if (this.mDoc != null && this.mDoc.param != null) {
                BirdNestEngine.Params params = new BirdNestEngine.Params(this.mDoc.param);
                params.varJson = str2;
                params.docType = FBResourceClient.Type.INNER_FRAME;
                params.createImmediately = true;
                if (str3.charAt(0) == '<') {
                    params.tplHtml = str3;
                } else {
                    params.tplJson = str3;
                }
                return (FBDocument) this.mDoc.getEngine().generateFBContext(params);
            }
        }
        return null;
    }
}
