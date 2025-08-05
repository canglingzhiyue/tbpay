package com.taobao.android.live.plugin.atype.flexalocal.recommendpop;

import android.content.Context;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewQueryResponse;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.view.RecommendRecyclerView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.cew;
import tb.hin;
import tb.hka;
import tb.kge;
import tb.nlf;
import tb.pqj;
import tb.qmv;
import tb.qmz;

/* loaded from: classes6.dex */
public class ListItemPopView extends nlf implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ViewGroup h;
    private List<ListItemInfo> i;
    private RecommendRecyclerView j;
    private a k;
    private int l;
    private int m;
    private JSONArray n;
    private com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.a o;
    private boolean p;
    private boolean q;
    private CountDownTimer r;

    /* loaded from: classes6.dex */
    public static class ListItemInfo extends ItemInfo {
        public String itemId;
        public JSONObject ori;

        static {
            kge.a(-553092692);
        }
    }

    /* loaded from: classes6.dex */
    public class b extends RecyclerView.ViewHolder {
        static {
            kge.a(570324895);
        }

        public b(View view) {
            super(view);
        }
    }

    static {
        kge.a(917957399);
        kge.a(-797454141);
    }

    public static /* synthetic */ Object ipc$super(ListItemPopView listItemPopView, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.nlf
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        }
    }

    @Override // tb.nlf
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.nlf
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void a(ListItemPopView listItemPopView, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371d083e", new Object[]{listItemPopView, str, str2, str3});
        } else {
            listItemPopView.a(str, str2, str3);
        }
    }

    public static /* synthetic */ boolean a(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16ece64", new Object[]{listItemPopView})).booleanValue() : listItemPopView.p;
    }

    public static /* synthetic */ boolean b(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8eaa825", new Object[]{listItemPopView})).booleanValue() : listItemPopView.q;
    }

    public static /* synthetic */ int c(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("506681d5", new Object[]{listItemPopView})).intValue();
        }
        int i = listItemPopView.l;
        listItemPopView.l = i + 1;
        return i;
    }

    public static /* synthetic */ int d(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7e25b96", new Object[]{listItemPopView})).intValue() : listItemPopView.l;
    }

    public static /* synthetic */ int e(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9f5e3557", new Object[]{listItemPopView})).intValue() : listItemPopView.m;
    }

    public static /* synthetic */ JSONArray f(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("c11c6679", new Object[]{listItemPopView}) : listItemPopView.n;
    }

    public static /* synthetic */ List g(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("17b040a1", new Object[]{listItemPopView}) : listItemPopView.i;
    }

    public ListItemPopView(Context context, hka hkaVar, String str) {
        super(context, hkaVar, str);
        this.l = 1;
        this.m = 10;
        this.n = new JSONArray();
        this.p = false;
        this.q = false;
    }

    @Override // tb.nlf
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        JSONArray jSONArray = this.d.getJSONArray("cardInfoList");
        this.i = new ArrayList();
        a(jSONArray);
        this.h = (ViewGroup) LayoutInflater.from(this.f31547a).inflate(R.layout.taolive_recommend_pop_list_layout_flexalocal, (ViewGroup) null);
        if (this.h == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.f31547a);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (y.b(this.f31547a) || y.i(this.f31547a)) ? hin.a(this.f31547a, 588.0f) : (int) (hin.b() * 0.725d));
        layoutParams.gravity = 80;
        frameLayout.addView(this.h, layoutParams);
        this.c.addView(frameLayout);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ListItemPopView.this.b.a(true, true);
                ListItemPopView.this.b.b(ListItemPopView.this.k(), null);
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                }
            }
        });
        this.j = (RecommendRecyclerView) this.h.findViewById(R.id.recommend_pop_list_recycler);
        this.j.setLayoutManager(new GridLayoutManager(this.f31547a, 2));
        RecommendRecyclerView recommendRecyclerView = this.j;
        a aVar = new a();
        this.k = aVar;
        recommendRecyclerView.setAdapter(aVar);
        this.j.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
                    return;
                }
                int a2 = hin.a(ListItemPopView.this.f31547a, 3.0f);
                rect.set(a2, a2, a2, a2);
            }
        });
        this.j.setLoadMoreListener(new RecommendRecyclerView.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.live.plugin.atype.flexalocal.recommendpop.view.RecommendRecyclerView.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else if (ListItemPopView.this.b == null || ListItemPopView.a(ListItemPopView.this) || ListItemPopView.b(ListItemPopView.this)) {
                } else {
                    ListItemPopView.c(ListItemPopView.this);
                    ListItemPopView listItemPopView = ListItemPopView.this;
                    ListItemPopView.a(listItemPopView, String.valueOf(ListItemPopView.d(listItemPopView)), String.valueOf(ListItemPopView.e(ListItemPopView.this)), ListItemPopView.f(ListItemPopView.this).toString());
                }
            }
        });
        JSONObject jSONObject = this.d.getJSONObject("displayStyleExtend");
        if (jSONObject != null) {
            AliUrlImageView aliUrlImageView = (AliUrlImageView) this.h.findViewById(R.id.recommend_pop_list_bg);
            aliUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            aliUrlImageView.setSkipAutoSize(true);
            aliUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01dy37kx1tmP7uhit7U_!!6000000005944-2-tps-1125-1371.png");
            ((TUrlImageView) this.h.findViewById(R.id.recommend_pop_list_title_img)).setImageUrl(jSONObject.getString("headTitleImgUrl"));
            ((TextView) this.h.findViewById(R.id.recommend_pop_list_title_txt_dec)).setText(jSONObject.getString("headSubtitle"));
            AliUrlImageView aliUrlImageView2 = (AliUrlImageView) this.h.findViewById(R.id.recommend_pop_list_title_close);
            aliUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            aliUrlImageView2.setSkipAutoSize(true);
            aliUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN012pDne31WbCBsgThq7_!!6000000002806-2-tps-26-26.png");
            aliUrlImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    ListItemPopView.this.b.a(true, true);
                    ListItemPopView.this.b.b(ListItemPopView.this.k(), null);
                }
            });
            String string = jSONObject.getString("benefitIcon");
            String string2 = jSONObject.getString("benefitTitle");
            if (!TextUtils.isEmpty(string2)) {
                ((LinearLayout) this.h.findViewById(R.id.recommend_pop_list_red_package_layout)).setVisibility(0);
                ((TUrlImageView) this.h.findViewById(R.id.recommend_pop_list_red_package_img)).setImageUrl(string);
                ((TextView) this.h.findViewById(R.id.recommend_pop_list_red_package_txt)).setText(string2);
                final TextView textView = (TextView) this.h.findViewById(R.id.recommend_pop_list_red_sec);
                CountDownTimer countDownTimer = this.r;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                this.r = new CountDownTimer(cew.a.CONFIG_TRACK_1022_INTERVAL_TIME, 1000L) { // from class: com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.CountDownTimer
                    public void onTick(long j) {
                        Object valueOf;
                        Object valueOf2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                            return;
                        }
                        long j2 = (j % 60000) / 1000;
                        long j3 = j / 60000;
                        TextView textView2 = textView;
                        StringBuilder sb = new StringBuilder();
                        sb.append("00:");
                        if (j3 < 10) {
                            valueOf = "0" + j3;
                        } else {
                            valueOf = Long.valueOf(j3);
                        }
                        sb.append(valueOf);
                        sb.append(":");
                        if (j2 < 10) {
                            valueOf2 = "0" + j2;
                        } else {
                            valueOf2 = Long.valueOf(j2);
                        }
                        sb.append(valueOf2);
                        sb.append("后失效");
                        textView2.setText(sb.toString());
                    }

                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                        } else {
                            textView.setText("00:00:00后失效");
                        }
                    }
                };
                this.r.start();
            }
        }
        this.b.a(j(), (ItemInfo) null);
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.p = true;
        com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.a aVar = this.o;
        if (aVar != null) {
            aVar.a();
        }
        this.o = new com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.a(this);
        this.o.a(this.b.b(), this.b.d(), this.b.n, this.b.o, this.b.f, this.b.g, this.b.s, this.b.t, this.b.u.toJSONString(), this.b.m, this.b.e(), str, str2, str3);
    }

    private void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONObject jSONObject2 = new JSONObject();
                ListItemInfo listItemInfo = (ListItemInfo) pqj.a(jSONObject, ListItemInfo.class);
                listItemInfo.ori = jSONObject;
                listItemInfo.itemId = listItemInfo.item != null ? listItemInfo.item.getString("id") : "";
                this.i.add(listItemInfo);
                jSONObject2.put("itemId", (Object) listItemInfo.itemId);
                this.n.add(jSONObject2);
                if (this.n.size() > 50) {
                    this.n.mo1572remove(0);
                }
            }
        }
    }

    @Override // tb.nlf
    public ItemInfo a(qmv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("dda82e23", new Object[]{this, aVar});
        }
        String str = "";
        String str2 = (aVar.f32947a.length <= 4 || !(aVar.f32947a[4] instanceof String)) ? str : (String) aVar.f32947a[4];
        if (aVar.f32947a.length > 2 && (aVar.f32947a[2] instanceof String)) {
            str = (String) aVar.f32947a[2];
        }
        for (ListItemInfo listItemInfo : this.i) {
            if (TextUtils.equals(str2, listItemInfo.itemId) || (listItemInfo.card != null && TextUtils.equals(str, listItemInfo.card.getString("detailUrl")))) {
                return listItemInfo;
            }
        }
        return null;
    }

    @Override // tb.nlf
    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.h;
    }

    @Override // tb.nlf
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        List<ListItemInfo> list = this.i;
        if (list != null) {
            list.clear();
        }
        com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.a aVar = this.o;
        if (aVar != null) {
            aVar.a();
            this.o = null;
        }
        CountDownTimer countDownTimer = this.r;
        if (countDownTimer == null) {
            return;
        }
        countDownTimer.cancel();
        this.r = null;
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        JSONObject mo1437getData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        if ((netBaseOutDo instanceof MtopTbliveRecommendPopviewQueryResponse) && (mo1437getData = ((MtopTbliveRecommendPopviewQueryResponse) netBaseOutDo).mo1437getData()) != null && this.c != null) {
            JSONArray jSONArray = mo1437getData.getJSONArray("cardInfoList");
            if (jSONArray == null || jSONArray.isEmpty()) {
                this.q = true;
            } else {
                a(jSONArray);
                this.k.notifyDataSetChanged();
                this.q = false;
            }
        }
        this.p = false;
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            this.q = true;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            this.q = true;
        }
    }

    /* loaded from: classes6.dex */
    public class a extends RecyclerView.Adapter<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1742063684);
        }

        public a() {
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public /* synthetic */ void onBindViewHolder(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, bVar, new Integer(i)});
            } else {
                a(bVar, i);
            }
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [android.support.v7.widget.RecyclerView$ViewHolder, com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView$b] */
        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public /* synthetic */ b mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
        }

        public b a(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f031b54", new Object[]{this, viewGroup, new Integer(i)});
            }
            View a2 = qmz.a(ListItemPopView.this.b.l(), ListItemPopView.this.f31547a, ListItemPopView.this.g);
            ListItemPopView listItemPopView = ListItemPopView.this;
            if (a2 == null) {
                a2 = new View(listItemPopView.f31547a);
            }
            return new b(a2);
        }

        public void a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("997aac61", new Object[]{this, bVar, new Integer(i)});
                return;
            }
            ListItemInfo listItemInfo = (ListItemInfo) ListItemPopView.g(ListItemPopView.this).get(bVar.getAdapterPosition());
            if (listItemInfo == null || !(bVar.itemView instanceof DXRootView)) {
                return;
            }
            qmz.a(ListItemPopView.this.b.l(), (DXRootView) bVar.itemView, listItemInfo.ori, ListItemPopView.this.b.g());
            ListItemPopView.this.b.a("Newfans_exposure_item", listItemInfo);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : ListItemPopView.g(ListItemPopView.this).size();
        }
    }
}
