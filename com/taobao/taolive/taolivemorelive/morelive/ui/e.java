package com.taobao.taolive.taolivemorelive.morelive.ui;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.business.BaseListRequest;
import com.taobao.live.home.dinamic.business.FeedListResponse;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.taobao.R;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.core.j;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.taolivemorelive.morelive.business.TabMenuResponseData;
import com.taobao.taolive.taolivemorelive.morelive.business.TaoMoreLiveFeedListResponse;
import com.taobao.taolive.taolivemorelive.morelive.business.TaoMoreLiveListData;
import com.taobao.taolive.taolivemorelive.morelive.business.TaoMoreLiveRequest;
import com.taobao.taolive.taolivemorelive.morelive.ui.MoreLiveFakeExposeCtrl;
import com.taobao.taolive.taolivemorelive.morelive.ui.a;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.fpr;
import tb.med;
import tb.meh;
import tb.mei;
import tb.mek;
import tb.mfj;
import tb.pmd;
import tb.poy;
import tb.pqj;
import tb.pql;
import tb.pqm;
import tb.pqp;
import tb.pqq;

/* loaded from: classes8.dex */
public class e extends g implements com.taobao.live.home.dinamic.view.a, a.InterfaceC0913a, mei {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taolive.taolivemorelive.morelive.ui.a f21982a;
    private boolean b;
    private View c;
    private ViewStub e;
    private View f;
    private HashMap<String, String> g;
    private List<IMTOPDataObject> h;
    private MoreLiveFakeExposeCtrl.RefreshType i;
    private MoreLiveFakeExposeCtrl j;
    private boolean m;
    private String n;
    private String o;
    private JSONObject p;

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 1545145623) {
            super.a(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.mei
    public void a(List<IMTOPDataObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        }
    }

    @Override // tb.mei
    public boolean a(meh<IMTOPDataObject> mehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f454b70c", new Object[]{this, mehVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.mei
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.mei
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.live.home.dinamic.view.a
    public boolean handleAdExposureIfNecessary(DinamicDataObject dinamicDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41178d08", new Object[]{this, dinamicDataObject})).booleanValue();
        }
        return false;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        return 2;
    }

    public static /* synthetic */ com.taobao.taolive.taolivemorelive.morelive.ui.a a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.taolivemorelive.morelive.ui.a) ipChange.ipc$dispatch("f9245892", new Object[]{eVar}) : eVar.f21982a;
    }

    public static /* synthetic */ View b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c4c787f6", new Object[]{eVar}) : eVar.f;
    }

    public static /* synthetic */ List c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fc067fb2", new Object[]{eVar}) : eVar.h;
    }

    public e(Context context, TabMenuResponseData.TopTab topTab, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, topTab, aVar);
        this.h = new ArrayList();
        this.i = MoreLiveFakeExposeCtrl.RefreshType.ENTER;
        this.m = false;
        this.p = new JSONObject();
        i();
    }

    @Override // com.taobao.taolive.taolivemorelive.morelive.ui.g
    public View h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("20baeb71", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.taolive.taolivemorelive.morelive.ui.g
    public void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        super.a(z, i);
        this.g = k();
        if (!z) {
            return;
        }
        pqq.d(this.l, "morelive_tabpageshow", l());
        this.n = pql.a().i();
        String g = pql.a().g();
        if (!l.e(g) && !g.equals(this.o)) {
            z2 = true;
        }
        this.o = g;
        com.taobao.taolive.taolivemorelive.morelive.ui.a aVar = this.f21982a;
        if (aVar != null && !this.b) {
            aVar.a((ViewGroup) this.c);
            this.f21982a.c();
            this.b = true;
        } else if (this.f21982a == null) {
        } else {
            if (l.e(this.n) && !z2) {
                return;
            }
            this.m = true;
            this.f21982a.c();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.c = LayoutInflater.from(this.q).inflate(R.layout.taolive_more_live_new, (ViewGroup) null);
        this.e = (ViewStub) this.c.findViewById(R.id.taolive_more_live_error_stub);
        this.j = new MoreLiveFakeExposeCtrl();
        this.f21982a = new com.taobao.taolive.taolivemorelive.morelive.ui.a(this.q, this);
        this.f21982a.a(this);
    }

    @Override // tb.mei
    public void a(String str) {
        meh<IMTOPDataObject> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.taolivemorelive.morelive.ui.a aVar = this.f21982a;
        if (aVar == null || (b = aVar.b()) == null || b.i() != 0) {
            return;
        }
        n();
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        ViewStub viewStub = this.e;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.taolive_more_live_error_new);
            this.f = this.e.inflate();
            ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                int a2 = com.taobao.taolive.sdk.utils.b.a(this.q, 50.0f);
                int a3 = com.taobao.taolive.sdk.utils.b.a(this.q, 15.0f);
                ((FrameLayout.LayoutParams) layoutParams).setMargins(a3, a2, a3, a3);
            }
            TUrlImageView tUrlImageView = (TUrlImageView) this.f.findViewById(R.id.more_live_error_img1);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl("https://gw.alicdn.com/tfs/TB13MNo3EH1gK0jSZSyXXXtlpXa-192-195.png");
            }
            ((Button) this.f.findViewById(R.id.more_live_error_btn1)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.taolivemorelive.morelive.ui.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (e.a(e.this) == null) {
                    } else {
                        e.a(e.this).c();
                    }
                }
            });
        }
        this.f.bringToFront();
        this.f.setVisibility(0);
    }

    @Override // tb.mei
    public meh<IMTOPDataObject> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (meh) ipChange.ipc$dispatch("f07b94e", new Object[]{this}) : new a(this.q, this);
    }

    @Override // tb.mei
    public RecyclerView.LayoutManager a(Context context, meh<IMTOPDataObject> mehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("29a0f685", new Object[]{this, context, mehVar});
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(j(), 1);
        staggeredGridLayoutManager.setGapStrategy(0);
        return staggeredGridLayoutManager;
    }

    @Override // tb.mei
    public RecyclerView.ItemDecoration b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ItemDecoration) ipChange.ipc$dispatch("b952bb34", new Object[]{this}) : new b(fpr.a(this.q, "12ap", 0), fpr.a(this.q, "4.5ap", 0), fpr.a(this.q, "9ap", 0));
    }

    @Override // tb.mei
    public com.taobao.live.home.business.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.live.home.business.a) ipChange.ipc$dispatch("f5311d49", new Object[]{this}) : new com.taobao.live.home.business.a() { // from class: com.taobao.taolive.taolivemorelive.morelive.ui.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                str.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.taobao.live.home.business.a
            public List a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("18196f83", new Object[]{this, obj});
                }
                if (!(obj instanceof FeedListResponse)) {
                    return null;
                }
                FeedListResponse feedListResponse = (FeedListResponse) obj;
                if (feedListResponse.mo2429getData() == null) {
                    return null;
                }
                return feedListResponse.mo2429getData().dataList;
            }

            @Override // com.taobao.live.home.business.a
            public FeedListResponse a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (FeedListResponse) ipChange2.ipc$dispatch("7bdf286c", new Object[]{this, mtopResponse});
                }
                String str = (mtopResponse == null || mtopResponse.getBytedata() == null) ? null : new String(mtopResponse.getBytedata());
                if (!TextUtils.isEmpty(str)) {
                    try {
                        TaoMoreLiveListData taoMoreLiveListData = new TaoMoreLiveListData();
                        TaoMoreLiveFeedListResponse taoMoreLiveFeedListResponse = new TaoMoreLiveFeedListResponse();
                        taoMoreLiveFeedListResponse.setData(taoMoreLiveListData);
                        JSONObject b = pqj.b(str);
                        if (b != null) {
                            JSONObject jSONObject = b.getJSONObject("data");
                            if (jSONObject != null && e.b(e.this) != null && (e.this.q instanceof Activity)) {
                                ((Activity) e.this.q).runOnUiThread(new Runnable() { // from class: com.taobao.taolive.taolivemorelive.morelive.ui.e.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else if (e.b(e.this) == null) {
                                        } else {
                                            e.b(e.this).setVisibility(8);
                                        }
                                    }
                                });
                            }
                            a(taoMoreLiveListData, jSONObject);
                        }
                        return taoMoreLiveFeedListResponse;
                    } catch (Exception e) {
                        mfj.a("TaoMoreLiveFrame", "responseConvert exp", e);
                    }
                }
                return null;
            }

            private void a(TaoMoreLiveListData taoMoreLiveListData, JSONObject jSONObject) {
                JSONArray jSONArray;
                DinamicDataObject a2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9eb3d6f", new Object[]{this, taoMoreLiveListData, jSONObject});
                } else if (jSONObject != null && (jSONArray = jSONObject.getJSONArray("cardList")) != null && jSONArray.size() > 0) {
                    taoMoreLiveListData.dataList = new ArrayList();
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2 != null && (a2 = a(jSONObject2)) != null && !TextUtils.isEmpty(a2.templateName)) {
                            taoMoreLiveListData.dataList.add(a2);
                        }
                    }
                    e.c(e.this).clear();
                    e.c(e.this).addAll(taoMoreLiveListData.dataList);
                }
            }

            private DinamicDataObject a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (DinamicDataObject) ipChange2.ipc$dispatch("93a7328b", new Object[]{this, jSONObject});
                }
                DinamicDataObject dinamicDataObject = null;
                if (jSONObject != null) {
                    dinamicDataObject = new DinamicDataObject();
                    dinamicDataObject.templateName = jSONObject.getString("templateName");
                    if (!l.e(jSONObject.getString("noLeftRightSpace"))) {
                        dinamicDataObject.noLeftRightSpace = l.d(jSONObject.getString("noLeftRightSpace"));
                    }
                    dinamicDataObject.data = new HashMap<>(1);
                    dinamicDataObject.data.put("data", jSONObject);
                }
                return dinamicDataObject;
            }
        };
    }

    @Override // tb.mei
    public BaseListRequest d() {
        VideoInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseListRequest) ipChange.ipc$dispatch("12c61cab", new Object[]{this});
        }
        TaoMoreLiveRequest taoMoreLiveRequest = new TaoMoreLiveRequest();
        taoMoreLiveRequest.mNeedCache = false;
        TBLiveDataModel c = j.c(this.l);
        String str = null;
        if (c != null && (a2 = k.a(c)) != null && a2.broadCaster != null) {
            str = a2.liveId;
        }
        if (!l.e(str) && TextUtils.isDigitsOnly(str)) {
            taoMoreLiveRequest.setLiveId(Long.parseLong(str));
        }
        String o = poy.o(this.l);
        if (!TextUtils.isEmpty(o) && TextUtils.isDigitsOnly(o)) {
            taoMoreLiveRequest.setItemId(Long.parseLong(o));
        }
        taoMoreLiveRequest.setN(20L);
        if (this.k != null) {
            taoMoreLiveRequest.setChannelType(this.k.channelType);
            taoMoreLiveRequest.setChannelId(this.k.channelId);
        }
        this.m = true;
        return taoMoreLiveRequest;
    }

    public HashMap<String, String> k() {
        VideoInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a46c5455", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("appKey", pmd.a().u().b());
        hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_SJSD_ITEM_ID, poy.o(this.l));
        hashMap.put("entryLiveSource", poy.R(this.l));
        hashMap.put("entrySpm", poy.T(this.l));
        hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, poy.V(this.l));
        hashMap.put("platform", "android");
        Map<String, String> aa = poy.aa(this.l);
        if (aa != null && !TextUtils.isEmpty(aa.get(aw.PARAM_TIMEMOVING_ITEM_ID))) {
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_TIMESHIFT_ITEM_ID, aa.get(aw.PARAM_TIMEMOVING_ITEM_ID));
        }
        TBLiveDataModel c = j.c(this.l);
        if (c != null && (a2 = k.a(c)) != null && a2.broadCaster != null) {
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_ACCOUNT_ID, a2.broadCaster.accountId);
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, a2.liveId);
        }
        if (!l.e(pql.a().l())) {
            hashMap.put("trackInfoTrans", pql.a().l());
        }
        return hashMap;
    }

    @Override // tb.mei
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : R.layout.taolive_more_live_load_more_view;
    }

    @Override // com.taobao.live.home.dinamic.view.a
    public void onShowUtParams(mek mekVar, DinamicDataObject dinamicDataObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1397a2", new Object[]{this, mekVar, dinamicDataObject});
        } else if (dinamicDataObject != null && dinamicDataObject.data != null) {
            try {
                JSONObject jSONObject = dinamicDataObject.data.get("data");
                if (jSONObject == null) {
                    return;
                }
                if (jSONObject.get(pqm.f32822a) != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(pqm.f32822a);
                    if (jSONObject2 != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.putAll(pqp.a(jSONObject2.getString("params")));
                        pqq.c(this.l, jSONObject2.getString("name"), hashMap);
                    }
                    if (this.j == null) {
                        return;
                    }
                    this.j.a(a(jSONObject));
                } else if ((jSONObject.get("cardData") instanceof JSONArray) && (jSONArray = jSONObject.getJSONArray("cardData")) != null && jSONArray.size() > 0) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        if (jSONObject3 != null) {
                            JSONObject jSONObject4 = jSONObject3.getJSONObject(pqm.f32822a);
                            String string = jSONObject3.getString("trackInfo");
                            if (jSONObject4 != null) {
                                HashMap hashMap2 = new HashMap();
                                if (!TextUtils.isEmpty(string)) {
                                    hashMap2.put("trackInfo", string);
                                }
                                hashMap2.putAll(pqp.a(jSONObject4.getString("params")));
                                pqq.c(this.l, jSONObject4.getString("name"), hashMap2);
                            }
                            if (this.j != null) {
                                this.j.a(a(jSONObject3));
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private Long a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("a6a77c8d", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            String string = jSONObject.getString("accountId");
            if (!TextUtils.isEmpty(string)) {
                return Long.valueOf(l.b(string));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("accountInfo");
            if (jSONObject2 != null) {
                return Long.valueOf(l.b(jSONObject2.getString("accountId")));
            }
        }
        return 0L;
    }

    @Override // com.taobao.taolive.taolivemorelive.morelive.ui.a.InterfaceC0913a
    public void a(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14841a28", new Object[]{this, baseListRequest});
            return;
        }
        try {
            if (!(baseListRequest instanceof TaoMoreLiveRequest)) {
                return;
            }
            TaoMoreLiveRequest taoMoreLiveRequest = (TaoMoreLiveRequest) baseListRequest;
            JSONObject a2 = this.j.a(MoreLiveFakeExposeCtrl.RefreshType.MORE, o());
            if (a2 == null) {
                a2 = new JSONObject();
            }
            HashMap<String, String> hashMap = this.g;
            hashMap.put("extendMap", a2.toJSONString());
            taoMoreLiveRequest.setTppParam(pqp.a(hashMap));
            String b = pql.a().b();
            if (!l.e(b)) {
                this.p.put("maidianTrans", (Object) b);
            }
            taoMoreLiveRequest.setExtParam(JSON.toJSONString(this.p));
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.taolive.taolivemorelive.morelive.ui.a.InterfaceC0913a
    public void b(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425cb487", new Object[]{this, baseListRequest});
            return;
        }
        try {
            if (baseListRequest instanceof TaoMoreLiveRequest) {
                JSONObject a2 = this.j.a(this.i);
                if (a2 == null) {
                    a2 = new JSONObject();
                }
                TaoMoreLiveRequest taoMoreLiveRequest = (TaoMoreLiveRequest) baseListRequest;
                HashMap<String, String> hashMap = this.g;
                hashMap.put("extendMap", a2.toJSONString());
                String b = pql.a().b();
                if (this.m) {
                    hashMap.put("topAccountList", this.o);
                    JSONObject jSONObject = new JSONObject();
                    if (!l.e(this.n)) {
                        jSONObject = JSON.parseObject(this.n);
                        this.n = null;
                    }
                    if (!l.e(b)) {
                        jSONObject.put("maidianTrans", (Object) b);
                    }
                    taoMoreLiveRequest.setExtParam(JSON.toJSONString(jSONObject));
                } else {
                    hashMap.remove("topAccountList");
                    if (!l.e(b)) {
                        this.p.put("maidianTrans", (Object) b);
                    }
                    taoMoreLiveRequest.setExtParam(JSON.toJSONString(this.p));
                }
                this.m = false;
                pql.a().b((String) null);
                taoMoreLiveRequest.setTppParam(pqp.a(hashMap));
            }
        } catch (Exception unused) {
        }
        if (this.k != null) {
            pqq.b(this.l, "moreliverefresh", l());
        }
        this.i = MoreLiveFakeExposeCtrl.RefreshType.PULL;
    }

    @Override // com.taobao.taolive.taolivemorelive.morelive.ui.g
    public HashMap<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ee9ded96", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("typePosition", String.valueOf(this.d));
        String l = pql.a().l();
        if (!l.e(l)) {
            hashMap.put("trackInfoTrans", l);
        }
        if (this.k != null) {
            hashMap.put("typeName-type", this.k.channelType);
            hashMap.put("typeName-id", this.k.channelId);
        }
        return hashMap;
    }

    private List<Long> o() {
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d4fc211", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        List<IMTOPDataObject> list = this.h;
        if (list != null && !list.isEmpty()) {
            for (IMTOPDataObject iMTOPDataObject : this.h) {
                if (iMTOPDataObject instanceof DinamicDataObject) {
                    DinamicDataObject dinamicDataObject = (DinamicDataObject) iMTOPDataObject;
                    if (dinamicDataObject.data != null && (jSONObject = dinamicDataObject.data.get("data")) != null && (jSONObject.get("cardData") instanceof JSONArray) && (jSONArray = jSONObject.getJSONArray("cardData")) != null && jSONArray.size() > 0) {
                        for (int i = 0; i < jSONArray.size(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            if (jSONObject2 != null) {
                                Long a2 = a(jSONObject2);
                                if (0 != a2.longValue()) {
                                    arrayList.add(a2);
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* loaded from: classes8.dex */
    public static class a extends meh<IMTOPDataObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.live.home.dinamic.view.a h;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 2011695254) {
                super.b((med) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Context context, com.taobao.live.home.dinamic.view.a aVar) {
            super(context);
            this.h = aVar;
        }

        @Override // tb.meh
        public med b(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (med) ipChange.ipc$dispatch("6a5bbaff", new Object[]{this, viewGroup, new Integer(i)});
            }
            com.taobao.live.home.dinamic.view.b bVar = new com.taobao.live.home.dinamic.view.b(h(), viewGroup, R.layout.live_dinamic_card_container);
            bVar.a(this.h);
            return bVar;
        }

        @Override // tb.meh
        public void b(med medVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77e80896", new Object[]{this, medVar, new Integer(i)});
                return;
            }
            super.b(medVar, i);
            if (!(medVar instanceof com.taobao.live.home.dinamic.view.b)) {
                return;
            }
            ((com.taobao.live.home.dinamic.view.b) medVar).a(c(i), i);
        }

        @Override // tb.meh
        public int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
            }
            if (this.f31042a != null) {
                IMTOPDataObject iMTOPDataObject = (IMTOPDataObject) this.f31042a.get(i);
                if (iMTOPDataObject instanceof DinamicDataObject) {
                    DinamicDataObject dinamicDataObject = (DinamicDataObject) iMTOPDataObject;
                    if (dinamicDataObject.templateName != null) {
                        TemplateObject a2 = LiveHomeController.a().a(dinamicDataObject.templateName);
                        if (a2 != null) {
                            return a2.hashCode();
                        }
                        return dinamicDataObject.templateName.hashCode();
                    }
                }
            }
            return 0;
        }
    }

    @Override // com.taobao.taolive.taolivemorelive.morelive.ui.g
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.b = false;
        this.d = 0;
        this.q = null;
        this.c = null;
        this.f21982a = null;
        MoreLiveFakeExposeCtrl moreLiveFakeExposeCtrl = this.j;
        if (moreLiveFakeExposeCtrl != null) {
            moreLiveFakeExposeCtrl.a();
        }
        List<IMTOPDataObject> list = this.h;
        if (list == null) {
            return;
        }
        list.clear();
    }
}
