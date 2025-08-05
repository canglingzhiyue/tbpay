package com.taobao.taolive.room.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.business.recommendLives.MtopMediaplatformAliveRecommendLivesResponse;
import com.taobao.taolive.room.business.recommendLives.MtopMediaplatformAliveRecommendLivesResponseData;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.as;
import com.taobao.taolive.room.utils.at;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.detail.checkforeground.CheckForeGroundResponseData;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.model.BaseRecModel;
import com.taobao.taolive.sdk.model.ContentType;
import com.taobao.taolive.sdk.model.common.SideGudieInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.cgl;
import tb.cgv;
import tb.ddv;
import tb.ddw;
import tb.hjs;
import tb.kge;
import tb.noa;
import tb.pmd;
import tb.pnj;
import tb.poy;
import tb.poz;
import tb.pqi;
import tb.pqj;
import tb.xkw;

/* loaded from: classes8.dex */
public class TBLiveRecEngineV2 implements Handler.Callback, com.taobao.taolive.sdk.adapter.network.d, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GUANG_REFRESH_URL = "https://h5.m.taobao.com/taolive/video.html?spm=a2141.1.tabbar.guangguang&needRecommend=true&livesource=tb_tab2.guangguang_newlivetab&updateAllDataWhenRefresh=true";
    public static final String PARAM_APPKEY = "appkey";
    public static final String PARAM_ENTRY_ACCOUNT_ID = "entryAccountId";
    public static final String PARAM_ENTRY_ITEM_ID = "entryItemId";
    public static final String PARAM_ENTRY_LIVE_ID = "entryLiveId";
    public static final String PARAM_ENTRY_LIVE_SOURCE = "entryLiveSource";
    public static final String PARAM_ENTRY_LIVE_TRACE_ID = "entryTraceId";
    public static final String PARAM_ENTRY_RECOMMEND_BIND_ID = "entryRecommendBindId";
    public static final String PARAM_ENTRY_SELLERID = "shopUserId";
    public static final String PARAM_ENTRY_SJSD_ITEM_ID = "entrySjsdItemId";
    public static final String PARAM_ENTRY_SPM = "entrySpm";
    public static final String PARAM_ENTRY_TIMESHIFT_ITEM_ID = "entryTimeShiftItemId";
    public static final String PARAM_QUERY_DETAIL_INFO = "queryDetailInfo";
    public static final String PARAM_QUERY_KEY = "queryKey";
    public static final String PARAM_TIME_MOVEING_STATUS = "timeMovingStatus";

    /* renamed from: a  reason: collision with root package name */
    private static final String f21673a;
    private boolean b;
    private long c;
    private long d;
    private long e;
    private cgv f;
    private h i;
    private int l;
    private int m;
    private int o;
    private int p;
    private Handler q;
    private Integer s;
    private com.taobao.taolive.sdk.controller.a t;
    private com.taobao.taolive.room.controller2.c v;
    private RecyclerView w;
    private String x;
    private ArrayList<IRecyclerModel> g = new ArrayList<>();
    private ArrayList<String> h = new ArrayList<>();
    private HashMap<String, String> j = new HashMap<>();
    private HashMap<Integer, a> k = new HashMap<>();
    private boolean n = false;
    private int r = 180;
    private int u = 0;
    private boolean y = false;
    private boolean z = true;

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "TBLiveRecEngineV2";
    }

    public static /* synthetic */ void a(TBLiveRecEngineV2 tBLiveRecEngineV2, NetBaseOutDo netBaseOutDo, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e5ea0d", new Object[]{tBLiveRecEngineV2, netBaseOutDo, new Integer(i), new Integer(i2)});
        } else {
            tBLiveRecEngineV2.a(netBaseOutDo, i, i2);
        }
    }

    public static /* synthetic */ String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[0]) : f21673a;
    }

    static {
        kge.a(58281402);
        kge.a(-797454141);
        kge.a(191318335);
        kge.a(-1043440182);
        f21673a = TBLiveRecEngineV2.class.getSimpleName();
    }

    public TBLiveRecEngineV2(boolean z, com.taobao.taolive.room.controller2.c cVar) {
        this.v = cVar;
        this.v.a(this);
        this.i = cVar.a();
        this.q = new Handler(this);
        this.o = aa.ad();
        this.b = z;
        ddw.a().a(this);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= this.g.size()) {
        } else {
            this.g.remove(i);
            int i2 = this.l;
            if (i2 >= i && i2 > 0) {
                this.l = i2 - 1;
            }
            com.taobao.taolive.sdk.controller.a aVar = this.t;
            if (aVar == null) {
                return;
            }
            aVar.a(this.g);
            this.t.notifyItemRemoved(i);
        }
    }

    public void a(RecModel recModel) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b29f74", new Object[]{this, recModel});
            return;
        }
        ArrayList<IRecyclerModel> arrayList = this.g;
        if (arrayList == null || (i = this.l) < 0 || i >= arrayList.size()) {
            return;
        }
        this.g.set(this.l, recModel);
        com.taobao.taolive.sdk.controller.a aVar = this.t;
        if (aVar == null) {
            return;
        }
        aVar.a(this.g);
        this.t.notifyItemChanged(this.l);
    }

    public void a(String str, String str2, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80c2013", new Object[]{this, str, str2, map, str3});
            return;
        }
        RecModel recModel = new RecModel(true, this.v);
        recModel.liveId = str;
        recModel.accountId = str2;
        recModel.initParams = map;
        recModel.visit = true;
        recModel.isFirst = true;
        if (aa.cq()) {
            recModel.trackInfo = str3;
        }
        if (aa.aG() && map != null) {
            recModel.timeMovingId = map.get(aw.PARAM_TIMEMOVING_ITEM_ID);
            recModel.sjsdItemId = map.get(aw.PARAM_SJSD_ITEM_ID);
            recModel.keyPointId = map.get(aw.PARAM_TIMEMOVE_KEYPOINTID);
            recModel.productType = map.get(aw.PARAM_PRODUCT_TYPE);
            recModel.timeMovingSpfPlayVideo = map.get("timeMovingSpfPlayVideo");
        }
        this.g.add(recModel);
        poz.K(pqj.a(recModel), this.v);
    }

    public void a(String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bc5fad", new Object[]{this, str, str2, str3, hashMap});
        } else if (this.n) {
        } else {
            ddw.a().a(this);
            this.n = true;
            if (this.g.isEmpty()) {
                RecModel recModel = new RecModel(false, this.v);
                recModel.visit = true;
                this.g.add(recModel);
            } else {
                RecModel recModel2 = (RecModel) this.g.get(0);
                recModel2.liveId = str;
                recModel2.accountId = str2;
                recModel2.recommendBindId = str3;
            }
            this.l = 0;
            this.m = 0;
            a((RecModel) this.g.get(0), true);
            if (cgl.d() != null) {
                this.f = cgl.d().a(this);
            } else {
                this.f = new com.taobao.taolive.room.business.mess.d(this, this.v);
            }
            if (hashMap != null) {
                this.j = hashMap;
                this.j.put(PARAM_ENTRY_LIVE_ID, str);
                this.j.put(PARAM_ENTRY_ACCOUNT_ID, str2);
            }
            this.j.put(PARAM_ENTRY_RECOMMEND_BIND_ID, str3);
            if (this.f != null) {
                this.c = 0L;
                this.d = aa.L();
                cgv cgvVar = this.f;
                long j = this.c;
                long j2 = this.d;
                cgvVar.a(0, str, j, j2, str2 + ":0", "", b("batch", str, str2, null));
            }
            if (!aa.o()) {
                return;
            }
            this.r = aa.p();
            if (this.r < 180) {
                this.r = 180;
            }
            this.q.sendEmptyMessageDelayed(1000, this.r * 1000);
        }
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else {
            this.w = recyclerView;
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        Handler handler = this.q;
        if (handler == null) {
            return;
        }
        this.z = false;
        handler.removeMessages(aw.MSG_AUTO_RECOMMEND);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        cgv cgvVar = this.f;
        if (cgvVar != null) {
            cgvVar.a();
            this.f = null;
        }
        ArrayList<IRecyclerModel> arrayList = this.g;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.n = false;
        ddw.a().b(this);
    }

    public void a(String str, long j, boolean z, long j2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb3fa00c", new Object[]{this, str, new Long(j), new Boolean(z), new Long(j2), str2});
            return;
        }
        TppParamFeedInfo a2 = this.i.a(str);
        if (a2 == null) {
            return;
        }
        a2.stay = j;
        a2.followStatus = z ? 1 : 0;
        a2.roomViewCnt = j2;
        a2.fansLevel = str2;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAO_LIVE_ROOM_SERVICE_VISITEDLIST);
        intent.putExtra("feedList", pqj.a(this.i.a(aa.N())));
        LocalBroadcastManager.getInstance(context).sendBroadcastSync(intent);
    }

    public ArrayList<TppParamFeedInfo> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("2f3d5943", new Object[]{this}) : this.i.a();
    }

    public RecModel c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("fdfd20f8", new Object[]{this});
        }
        ArrayList<IRecyclerModel> arrayList = this.g;
        if (arrayList != null && !arrayList.isEmpty() && this.l <= this.g.size() - 1) {
            return (RecModel) this.g.get(this.l);
        }
        return null;
    }

    public RecModel j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("72a43c11", new Object[]{this});
        }
        ArrayList<IRecyclerModel> arrayList = this.g;
        if (arrayList != null && !arrayList.isEmpty() && this.g.size() != 1 && this.l + 1 < this.g.size()) {
            return (RecModel) this.g.get(this.l + 1);
        }
        return null;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.g.isEmpty() || this.g.size() == 1) {
        } else {
            if (this.l < this.g.size() - 1) {
                RecModel recModel = (RecModel) this.g.get(this.l);
                if (recModel.recommendCardInfo != null || (recModel.reserveItemCardInfo != null && recModel.reserveItemCardInfo.cardInfo != null)) {
                    int i = this.l;
                    if (i - 1 >= 0) {
                        recModel = (RecModel) this.g.get(i - 1);
                    }
                }
                b(recModel.liveId, recModel.accountId, recModel.clientReturnMap);
                RecModel recModel2 = null;
                if (this.l + 1 < this.g.size() - 1) {
                    recModel2 = (RecModel) this.g.get(this.l + 1);
                }
                if (a(recModel, recModel2)) {
                    b(recModel);
                }
            }
            int i2 = this.l;
            if (i2 <= this.p) {
                return;
            }
            this.p = i2;
        }
    }

    private boolean a(RecModel recModel, RecModel recModel2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f75d884", new Object[]{this, recModel, recModel2})).booleanValue() : aa.dm() && !((recModel2 != null && (recModel2.reserveItemCardInfo != null || recModel2.alimama != null)) || recModel.autoRecommendInterval == 0 || recModel.autoRecommendRepeat == 0);
    }

    public RecModel k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("f1053ff0", new Object[]{this});
        }
        RecModel recModel = null;
        if (!this.g.isEmpty() && this.g.size() != 1 && this.l < this.g.size() - 1) {
            this.l++;
            IRecyclerModel iRecyclerModel = this.g.get(this.l);
            if (iRecyclerModel instanceof RecModel) {
                recModel = (RecModel) iRecyclerModel;
                recModel.visit = true;
                a(recModel, false);
                if (f()) {
                    a(recModel.liveId, recModel.accountId, recModel.clientReturnMap);
                }
            }
        }
        return recModel;
    }

    private void a(RecModel recModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a201e0", new Object[]{this, recModel, new Boolean(z)});
        } else if (recModel == null || recModel.recommendCardInfo != null || recModel.reserveItemCardInfo != null) {
        } else {
            TppParamFeedInfo tppParamFeedInfo = new TppParamFeedInfo();
            tppParamFeedInfo.liveId = recModel.liveId;
            tppParamFeedInfo.accountId = recModel.accountId;
            tppParamFeedInfo.clientReturnMap = recModel.clientReturnMap;
            tppParamFeedInfo.recommendBindId = recModel.recommendBindId;
            tppParamFeedInfo.timeMovingId = recModel.timeMovingId;
            tppParamFeedInfo.sjsdItemId = recModel.sjsdItemId;
            if (z) {
                tppParamFeedInfo.enter = System.currentTimeMillis();
            }
            this.i.a(tppParamFeedInfo);
        }
    }

    public RecModel d() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("7c5e24d7", new Object[]{this});
        }
        if (this.g.isEmpty() || (i = this.l) == 0) {
            return null;
        }
        this.l = i - 1;
        RecModel recModel = (RecModel) this.g.get(this.l);
        recModel.visit = true;
        a(recModel, false);
        return recModel;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.l;
        if (i2 < 0 || i2 >= this.g.size()) {
            return;
        }
        this.l = i;
        this.q.removeMessages(aw.MSG_AUTO_RECOMMEND);
        this.u = 0;
        this.z = true;
        h();
        if (n.a() == null || j() == null || n.a().A == null || j().sideGudieInfo == null) {
            return;
        }
        n.a().A.add(j().sideGudieInfo);
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.l;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.g.size() - this.l <= this.o;
    }

    public void g() {
        int i;
        RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.f == null || (i = this.l) < 0 || i >= this.g.size() || (recModel = (RecModel) this.g.get(this.l)) == null) {
        } else {
            this.d = aa.L();
            if (pmd.a().m() != null) {
                pnj m = pmd.a().m();
                m.a("TBLiveRecEngineV2", "live_recommend_bottom_batch" + hashCode());
            }
            this.f.a(3, recModel.liveId, this.c, this.d, null, recModel.accountId, b("batch", recModel.liveId, recModel.accountId, recModel.clientReturnMap));
        }
    }

    private void a(String str, String str2, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a507bab7", new Object[]{this, str, str2, hashMap});
        } else if (this.f == null) {
        } else {
            this.d = aa.L();
            if (pmd.a().m() != null) {
                pnj m = pmd.a().m();
                m.a("TBLiveRecEngineV2", "live_recommend_updown_batch" + hashCode());
            }
            this.f.a(1, str, this.c, this.d, null, str2, b("batch", str, str2, hashMap));
        }
    }

    public void a(com.taobao.taolive.sdk.controller.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a7b082", new Object[]{this, aVar});
            return;
        }
        this.t = aVar;
        com.taobao.taolive.sdk.controller.a aVar2 = this.t;
        if (aVar2 == null) {
            return;
        }
        aVar2.a(this.g);
        this.t.notifyDataSetChanged();
    }

    private void b(String str, String str2, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0b8616", new Object[]{this, str, str2, hashMap});
        } else if (this.l < this.p) {
            String str3 = f21673a;
            q.b(str3, "updateRtRecIfNecessary mIndex: " + this.l + ", mVisitDepth: " + this.p);
            if (pmd.a().m() == null || !aa.ag()) {
                return;
            }
            ArrayList<IRecyclerModel> arrayList = this.g;
            if (arrayList != null) {
                i = arrayList.size();
            }
            pnj m = pmd.a().m();
            m.a("handleUpDownSwitch", " updateRtRecIfNecessary_return" + str + hashCode() + " mRecListLen:" + i + " mIndex:" + this.l + " mVisitDepth:" + this.p);
        } else if (!this.b || this.f == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.e < aa.O() * 1000 && aa.W()) {
                if (pmd.a().m() != null && aa.ag()) {
                    pnj m2 = pmd.a().m();
                    m2.a("handleUpDownSwitch", "updateRtRecIfNecessary_timer" + str + hashCode());
                }
                String str4 = f21673a;
                q.b(str4, "updateRtRecIfNecessary curTime less than " + aa.O());
                return;
            }
            this.d = 1L;
            q.b(f21673a, "updateRtRecIfNecessary request start");
            a aVar = new a();
            aVar.f21675a = str;
            aVar.b = this.c;
            aVar.c = 1L;
            aVar.d = null;
            aVar.e = str2;
            aVar.f = b("realtime", str, str2, hashMap);
            this.f.a(2, aVar.f21675a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f);
            this.k.put(Integer.valueOf(this.l), aVar);
            this.e = currentTimeMillis;
            if (pmd.a().m() == null || !aa.ag()) {
                return;
            }
            pnj m3 = pmd.a().m();
            m3.a("handleUpDownSwitch", "updateRtRecIfNecessary_curLiveId" + str + hashCode());
        }
    }

    private void c(String str, String str2, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10f5175", new Object[]{this, str, str2, hashMap});
            return;
        }
        b(str, str2, hashMap);
        this.y = true;
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    private int a(String str) {
        ArrayList<IRecyclerModel> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (!as.l() && (arrayList = this.g) != null && arrayList.size() > 0 && !TextUtils.isEmpty(str)) {
            for (int i = 0; i < this.g.size(); i++) {
                RecModel recModel = (RecModel) this.g.get(i);
                if (recModel != null && str.equals(recModel.liveId)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private String a(NetResponse netResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4802013d", new Object[]{this, netResponse});
        }
        if (netResponse == null) {
            return "";
        }
        try {
            return (netResponse.getHeaderFields() == null || (list = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) == null || list.size() <= 0) ? "" : list.get(0);
        } catch (Exception unused) {
            Log.e(f21673a, "getTraceID error ");
            return "";
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        com.taobao.taolive.sdk.playcontrol.observe.a B;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        MtopMediaplatformAliveRecommendLivesResponseData mo1437getData = netBaseOutDo instanceof MtopMediaplatformAliveRecommendLivesResponse ? ((MtopMediaplatformAliveRecommendLivesResponse) netBaseOutDo).mo1437getData() : null;
        if (mo1437getData != null && mo1437getData.model != null && mo1437getData.model.size() > 0) {
            if (pmd.a().m() != null) {
                pmd.a().m().a(f21673a, "modelSize:" + mo1437getData.model.size() + "first_liveId:" + mo1437getData.model.get(0).liveId + " type:" + i + " hashCode:" + hashCode());
            }
            if (aa.cG()) {
                com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
                if ((a2 instanceof com.taobao.taolive.sdk.core.e) && (B = ((com.taobao.taolive.sdk.core.e) a2).B()) != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("apiName", (Object) netResponse.getApi());
                    jSONObject.put("apiVersion", (Object) netResponse.getV());
                    jSONObject.put("traceID", (Object) a(netResponse));
                    jSONObject.put("type", (Object) Integer.valueOf(i));
                    jSONObject.put("modelSize", (Object) Integer.valueOf(mo1437getData.model.size()));
                    jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) mo1437getData.model.get(0).liveId);
                    B.a(jSONObject);
                }
            }
            if (i == 0 || i == 1 || i == 3) {
                ArrayList<RecModel> arrayList = new ArrayList<>();
                Iterator<LiveDetailMessinfoResponseData.RecVideo> it = mo1437getData.model.iterator();
                while (it.hasNext()) {
                    RecModel recModel = new RecModel(it.next(), false, this.v);
                    if (a(recModel.liveId) == -1 && !b(recModel.liveId)) {
                        arrayList.add(recModel);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (i == 0) {
                        RecModel c = c();
                        RecModel recModel2 = arrayList.get(0);
                        c.autoRecommendInterval = recModel2.autoRecommendInterval;
                        c.autoRecommendRepeat = recModel2.autoRecommendRepeat;
                        if (a(c, recModel2)) {
                            b(c);
                        }
                    }
                    ArrayList<IRecyclerModel> arrayList2 = this.g;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        this.g.addAll(arrayList);
                        com.taobao.taolive.sdk.controller.a aVar = this.t;
                        if (aVar != null) {
                            aVar.a(this.g);
                            a(arrayList, size);
                        }
                    }
                    if (i == 0 || i == 3) {
                        ddw.a().a("com.taobao.taolive.room.enable_updown_switch", null, n.c());
                        ddw.a().a("com.taobao.taolive.room.disable_update_scroll_bgimg", null, n.c());
                    }
                    pqi.a().b("recommendLives");
                } else if (f()) {
                    pqi.a().a("recommendLives", AgooConstants.MESSAGE_DUPLICATE, AgooConstants.MESSAGE_DUPLICATE);
                }
                this.c += this.d;
            } else if (i == 2) {
                if (as.l()) {
                    return;
                }
                LiveDetailMessinfoResponseData.RecVideo recVideo = mo1437getData.model.get(0);
                if (recVideo != null && this.z) {
                    RecModel recModel3 = new RecModel(recVideo, false, this.v);
                    int a3 = a(recModel3.liveId);
                    if (a3 != -1) {
                        q.b(f21673a, " realtime duplicate index = " + a3 + " id = " + recModel3.liveId + " curIndex = " + this.l);
                        if (a3 > this.l) {
                            this.g.remove(a3);
                            com.taobao.taolive.sdk.controller.a aVar2 = this.t;
                            if (aVar2 != null) {
                                aVar2.a(this.g);
                                d(a3);
                            }
                            int max = Math.max(this.l, this.m) + 1;
                            if (max > this.g.size()) {
                                max = this.g.size();
                            }
                            this.g.add(max, recModel3);
                            com.taobao.taolive.sdk.controller.a aVar3 = this.t;
                            if (aVar3 != null) {
                                aVar3.a(this.g);
                                e(max);
                            }
                            ddw.a().a("com.taobao.taolive.room.disable_update_scroll_bgimg", null, n.c());
                        } else {
                            Log.e(f21673a, " do nothing realtime duplicate index = " + a3 + " id = " + recModel3.liveId + " curIndex = " + this.l);
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, recModel3.liveId);
                        hashMap.put("existIndex", String.valueOf(a3));
                        hashMap.put("count", String.valueOf(this.g.size()));
                        hashMap.put("currentIndex", String.valueOf(this.l));
                        ai.a(this.v, "upDownSwitchRealtimeRepeat", hashMap);
                    } else if (!b(recModel3.liveId)) {
                        if (a(recModel3, mo1437getData.model.size() > 2 ? new RecModel(mo1437getData.model.get(1), false, this.v) : null) && this.y) {
                            a(this.l + 1, recModel3);
                            this.y = false;
                            q.b(f21673a, "auto recommend replace item: " + recModel3.liveId);
                        } else {
                            this.g.add(Math.max(this.l, this.m) + 1, recModel3);
                            com.taobao.taolive.sdk.controller.a aVar4 = this.t;
                            if (aVar4 != null) {
                                aVar4.a(this.g);
                                e(Math.max(this.l, this.m) + 1);
                                q.b(f21673a, "insert item: " + recModel3.liveId);
                            }
                        }
                        ddw.a().a("com.taobao.taolive.room.disable_update_scroll_bgimg", null, n.c());
                        Log.e("luozz", "  realtime no duplicate index = " + a3 + " id = " + recModel3.liveId + " curIndex = " + this.l);
                    }
                    pqi.a().b("recommendLives");
                }
                this.c += this.d;
            } else if (i == 4) {
                if (as.l()) {
                    return;
                }
                LiveDetailMessinfoResponseData.RecVideo recVideo2 = mo1437getData.model.get(0);
                if (recVideo2 != null) {
                    RecModel recModel4 = new RecModel(recVideo2, false, this.v);
                    int a4 = a(recModel4.liveId);
                    if (a4 != -1) {
                        if (a4 > this.p) {
                            this.g.remove(a4);
                            com.taobao.taolive.sdk.controller.a aVar5 = this.t;
                            if (aVar5 != null) {
                                aVar5.a(this.g);
                                d(a4);
                            }
                            this.g.add(this.s.intValue(), recModel4);
                            com.taobao.taolive.sdk.controller.a aVar6 = this.t;
                            if (aVar6 != null) {
                                aVar6.a(this.g);
                                e(this.s.intValue());
                            }
                            if (this.s.intValue() == this.l + 1) {
                                ddw.a().a("com.taobao.taolive.room.disable_update_scroll_bgimg", null, n.c());
                            }
                        }
                    } else if (!b(recModel4.liveId)) {
                        this.g.add(this.s.intValue(), recModel4);
                        com.taobao.taolive.sdk.controller.a aVar7 = this.t;
                        if (aVar7 != null) {
                            aVar7.a(this.g);
                            e(this.s.intValue());
                        }
                        if (this.s.intValue() == this.l + 1) {
                            ddw.a().a("com.taobao.taolive.room.disable_update_scroll_bgimg", null, n.c());
                        }
                    }
                    pqi.a().b("recommendLives");
                }
                this.c += this.d;
            }
        } else {
            pqi.a().a("recommendLives", "no_data", "no_data");
            a("0", netResponse);
            if (pmd.a().m() != null) {
                pmd.a().m().a("TBLiveRecEngineV2", "live_recommend_no_data" + hashCode());
            }
        }
        if (n.a() != null && j() != null && n.a().A != null && j().sideGudieInfo != null) {
            n.a().A.add(j().sideGudieInfo);
        }
        ddw a5 = ddw.a();
        ArrayList<IRecyclerModel> arrayList3 = this.g;
        a5.a("com.taobao.taolive.room.update_updown_data", (arrayList3 == null || arrayList3.size() == 0) ? "" : pqj.a(this.g), n.c());
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        if (netResponse != null) {
            ab.f(f21673a, netResponse.getRetMsg());
        }
        if (i == 0 && aa.h()) {
            ddw.a().a("com.taobao.taolive.room.disable_updown_switch", "REQUEST_TYPE_FIRST_error", n.c());
        }
        String str = "NULL";
        pqi.a().a("recommendLives", netResponse == null ? str : netResponse.getRetMsg(), netResponse == null ? str : netResponse.getRetCode());
        if (netResponse != null) {
            str = netResponse.getRetCode();
        }
        a(str, netResponse);
    }

    private void a(String str, NetResponse netResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77ebc08d", new Object[]{this, str, netResponse});
            return;
        }
        pqi.a().a("recommendLives", "no_data", "no_data");
        HashMap hashMap = new HashMap();
        hashMap.put("subtype", ag.SOURCE_UPDOWNSWITCH);
        hashMap.put("responseType", "live");
        hashMap.put("errorCode", str);
        hashMap.put("entryLivesource", poz.f(this.v));
        hashMap.put(com.taobao.android.fluid.framework.data.remote.c.KEY_DATA_SOURCE, "mtop");
        if (netResponse != null) {
            try {
                if (netResponse.getHeaderFields() != null && (list = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) != null && list.size() > 0) {
                    hashMap.put("traceId", list.get(0));
                }
            } catch (Exception unused) {
            }
        }
        ai.a(this.v, "live_recommendation_abnormal", hashMap);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        char c = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        TppParamFeedInfo tppParamFeedInfo = null;
        VideoInfo u = poy.u(n.a());
        if (u != null) {
            tppParamFeedInfo = this.i.a(u.liveId);
        }
        if (tppParamFeedInfo == null) {
            return;
        }
        try {
            switch (str.hashCode()) {
                case -1832948174:
                    if (str.equals("com.taobao.taolive.room.add_item_new")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1473773571:
                    if (str.equals(xkw.EVENT_ACTION_ADD_FAVOR)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1450449455:
                    if (str.equals(xkw.EVENT_ADD_ITEM)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1450012590:
                    if (str.equals(xkw.EVENT_SHOW_GOODSPACKAGE)) {
                        break;
                    }
                    c = 65535;
                    break;
                case -830550742:
                    if (str.equals(xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -554098287:
                    if (str.equals(xkw.EVENT_ACTION_FOLLOW)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -462319263:
                    if (str.equals("com.taobao.taolive.room.addcart")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 119727352:
                    if (str.equals("com.taobao.taolive.room.enter")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 132460031:
                    if (str.equals("com.taobao.taolive.room.share")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 458859892:
                    if (str.equals("com.taobao.taolive.room.gotoDetail")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1595703346:
                    if (str.equals(xkw.EVENT_INPUT_SHOW)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if (!(obj instanceof Long)) {
                        return;
                    }
                    tppParamFeedInfo.addCart.add((Long) obj);
                    return;
                case 1:
                    if (!(obj instanceof Long)) {
                        return;
                    }
                    tppParamFeedInfo.gotoDetail.add((Long) obj);
                    return;
                case 2:
                    tppParamFeedInfo.openGoodsList++;
                    return;
                case 3:
                    if (obj == null || !(obj instanceof Map)) {
                        return;
                    }
                    try {
                        tppParamFeedInfo.like = Integer.parseInt((String) ((HashMap) obj).get("totalFavorCount"));
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                case 4:
                case 5:
                    tppParamFeedInfo.followStatus = 1;
                    return;
                case 6:
                    tppParamFeedInfo.share++;
                    return;
                case 7:
                case '\b':
                    tppParamFeedInfo.comment++;
                    return;
                case '\t':
                    tppParamFeedInfo.openComment++;
                    break;
                case '\n':
                    break;
                default:
                    return;
            }
            tppParamFeedInfo.enter = System.currentTimeMillis();
        } catch (Exception e) {
            ab.f(f21673a, "onEvent: " + str + " msg = " + e.getMessage());
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.addcart", "com.taobao.taolive.room.gotoDetail", xkw.EVENT_SHOW_GOODSPACKAGE, xkw.EVENT_ACTION_ADD_FAVOR, xkw.EVENT_FOLLOW_FROM_FOLLOWFRAME, xkw.EVENT_ACTION_FOLLOW, "com.taobao.taolive.room.share", xkw.EVENT_ADD_ITEM, "com.taobao.taolive.room.add_item_new", xkw.EVENT_INPUT_SHOW, "com.taobao.taolive.room.enter"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (n.a() == null) {
            return null;
        }
        return n.a().G();
    }

    private Integer i() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("576f8b97", new Object[]{this});
        }
        ArrayList<IRecyclerModel> arrayList = this.g;
        if (arrayList != null) {
            i = arrayList.size();
        }
        if (i <= 0) {
            return -1;
        }
        for (int i2 = this.p + 1; i2 <= i - 1; i2++) {
            if (((RecModel) this.g.get(i2)).alimama != null) {
                return Integer.valueOf(i2);
            }
        }
        return -1;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 1000) {
            Integer i2 = i();
            if (i2.intValue() != -1 && (aVar = this.k.get(Integer.valueOf(i2.intValue() - 1))) != null) {
                this.s = i2;
                this.d = aVar.c;
                this.f.a(4, aVar.f21675a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f);
            }
            Handler handler = this.q;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(1000, this.r * 1000);
            }
        } else if (i == 2024) {
            RecModel recModel = (RecModel) message.obj;
            c(recModel.liveId, recModel.accountId, recModel.clientReturnMap);
            this.u++;
            if (this.u < recModel.autoRecommendRepeat) {
                b(recModel);
            } else {
                q.b(f21673a, "auto recommend time exceed " + recModel.autoRecommendRepeat);
            }
        }
        return false;
    }

    private void b(RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30721775", new Object[]{this, recModel});
        } else {
            this.q.sendMessageDelayed(Message.obtain(this.q, aw.MSG_AUTO_RECOMMEND, recModel), recModel.autoRecommendInterval * 1000);
        }
    }

    public void a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
        } else if (videoInfo == null || !videoInfo.isOfficialLive() || videoInfo.broadCaster == null) {
        } else {
            String str = videoInfo.liveId;
            String str2 = videoInfo.officialLiveInfo.officialLiveId;
            ArrayList<String> arrayList = this.h;
            if (arrayList == null) {
                return;
            }
            if (!arrayList.contains(str)) {
                this.h.add(str);
            }
            if (this.h.contains(str2)) {
                return;
            }
            this.h.add(str2);
        }
    }

    private boolean b(String str) {
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (u.aP() && (arrayList = this.h) != null && !arrayList.isEmpty()) {
            return this.h.contains(str);
        }
        return false;
    }

    private void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (aa.bd()) {
            RecyclerView recyclerView = this.w;
            if (recyclerView == null || recyclerView.getScrollState() != 0 || this.w.isComputingLayout()) {
                return;
            }
            this.t.notifyItemRemoved(i);
        } else {
            this.t.notifyItemRemoved(i);
        }
    }

    private void a(ArrayList<RecModel> arrayList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1640bd01", new Object[]{this, arrayList, new Integer(i)});
        } else if (aa.bd()) {
            RecyclerView recyclerView = this.w;
            if (recyclerView == null || recyclerView.getScrollState() != 0 || this.w.isComputingLayout()) {
                return;
            }
            this.t.notifyItemRangeInserted(i, arrayList.size());
        } else {
            this.t.notifyItemRangeInserted(i, arrayList.size());
        }
    }

    private void a(int i, RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ca4027", new Object[]{this, new Integer(i), recModel});
            return;
        }
        ArrayList<IRecyclerModel> arrayList = this.g;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        this.g.set(i, recModel);
        com.taobao.taolive.sdk.controller.a aVar = this.t;
        if (aVar == null) {
            return;
        }
        aVar.a(this.g);
        this.t.notifyItemChanged(i);
    }

    private void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else if (aa.bd()) {
            RecyclerView recyclerView = this.w;
            if (recyclerView == null || recyclerView.getScrollState() != 0 || this.w.isComputingLayout()) {
                return;
            }
            this.t.notifyItemInserted(i);
        } else {
            this.t.notifyItemInserted(i);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!at.a(this.g)) {
            int j = as.j();
            final int max = Math.max(this.l - j, 0);
            final int min = Math.min(this.l + j, this.g.size() - 1);
            ArrayList arrayList = new ArrayList();
            for (int i = max; i <= min; i++) {
                arrayList.add(((RecModel) this.g.get(i)).liveId);
            }
            String str = f21673a;
            q.c(str, "发起定时刷新请求， 请求列表大小：" + arrayList.size());
            com.taobao.taolive.sdk.business.detail.checkforeground.a aVar = new com.taobao.taolive.sdk.business.detail.checkforeground.a(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.taolive.room.service.TBLiveRecEngineV2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i2, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i2), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    String o = TBLiveRecEngineV2.o();
                    q.c(o, "onSuccess: " + i2 + " netResponse = " + netResponse + " netBaseOutDo = " + netBaseOutDo + " o = " + obj);
                    if (netBaseOutDo == null || !(netBaseOutDo.mo1437getData() instanceof Map)) {
                        return;
                    }
                    TBLiveRecEngineV2.a(TBLiveRecEngineV2.this, netBaseOutDo, min, max);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i2, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i2), netResponse, obj});
                        return;
                    }
                    String o = TBLiveRecEngineV2.o();
                    q.c(o, "onError: " + i2 + " netResponse = " + netResponse + " o = " + obj);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i2, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i2), netResponse, obj});
                        return;
                    }
                    String o = TBLiveRecEngineV2.o();
                    q.c(o, "onSystemError: " + i2 + " netResponse = " + netResponse + " o = " + obj);
                }
            });
            if (at.a(arrayList)) {
                return;
            }
            aVar.a(arrayList);
        }
    }

    private void a(NetBaseOutDo netBaseOutDo, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de495a4", new Object[]{this, netBaseOutDo, new Integer(i), new Integer(i2)});
        } else if (i2 >= 0 && !at.a(this.g) && this.g.size() > this.p && i < this.g.size()) {
            q.b(f21673a, "定时刷新删除下播直播间返回接口大小：" + ((Map) netBaseOutDo.mo1437getData()).size());
            boolean z2 = true;
            int i3 = 0;
            for (int i4 = i2; i4 <= Math.min(i, this.g.size() - 1); i4++) {
                RecModel recModel = (RecModel) this.g.get(i4);
                if (((Map) netBaseOutDo.mo1437getData()).get(recModel.liveId) != null) {
                    CheckForeGroundResponseData checkForeGroundResponseData = (CheckForeGroundResponseData) ((Map) netBaseOutDo.mo1437getData()).get(recModel.liveId);
                    if (i4 == this.l) {
                        z2 = TextUtils.equals(checkForeGroundResponseData.roomStatus, "1");
                    }
                    if (!TextUtils.equals(checkForeGroundResponseData.roomStatus, "1")) {
                        i3++;
                    } else if (i4 > this.l) {
                        z = true;
                    }
                }
            }
            if (!(z2 || z) || (!z2 && i3 > (i - i2) / 2)) {
                Uri parse = Uri.parse(GUANG_REFRESH_URL);
                q.c(f21673a, "刷新了当前的视图 hasBottomPlaying" + z + " checkCount" + i3);
                ddw.a().a("com.taobao.taolive.room.refresh", parse, n.c());
            } else if (i3 > 0) {
                int i5 = this.p;
                while (i5 <= Math.min(i, this.g.size() - 1)) {
                    RecModel recModel2 = (RecModel) this.g.get(i5);
                    if (((Map) netBaseOutDo.mo1437getData()).get(recModel2.liveId) != null && !TextUtils.equals(((CheckForeGroundResponseData) ((Map) netBaseOutDo.mo1437getData()).get(recModel2.liveId)).roomStatus, "1")) {
                        a(i5);
                        i5--;
                    }
                    i5++;
                }
                q.c(f21673a, "删除了下播的直播间  checkCount " + i3);
            }
        }
    }

    private String b(String str, String str2, String str3, HashMap<String, Object> hashMap) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8c384d4", new Object[]{this, str, str2, str3, hashMap});
        }
        HashMap<String, Object> c = c(str, str2, str3, hashMap);
        if (com.taobao.taolive.room.utils.d.a() && (str4 = this.x) != null) {
            c.put("mockUserId", str4);
        }
        com.taobao.taolive.room.controller2.c cVar = this.v;
        if (cVar != null) {
            cVar.e = c;
        }
        return JSON.toJSONString(c);
    }

    private HashMap<String, Object> c(String str, String str2, String str3, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7fc5738e", new Object[]{this, str, str2, str3, hashMap});
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        HashMap<String, String> hashMap3 = this.j;
        if (hashMap3 != null) {
            hashMap2.put(PARAM_ENTRY_LIVE_ID, hashMap3.get(PARAM_ENTRY_LIVE_ID));
            hashMap2.put(PARAM_ENTRY_ACCOUNT_ID, this.j.get(PARAM_ENTRY_ACCOUNT_ID));
            hashMap2.put(PARAM_ENTRY_RECOMMEND_BIND_ID, this.j.get(PARAM_ENTRY_RECOMMEND_BIND_ID));
            hashMap2.put("entryLiveSource", this.j.get("entryLiveSource"));
            hashMap2.put(PARAM_ENTRY_SJSD_ITEM_ID, this.j.get(PARAM_ENTRY_SJSD_ITEM_ID));
            hashMap2.put(PARAM_ENTRY_LIVE_TRACE_ID, this.j.get(PARAM_ENTRY_LIVE_TRACE_ID));
            hashMap2.put(PARAM_ENTRY_TIMESHIFT_ITEM_ID, this.j.get(PARAM_ENTRY_TIMESHIFT_ITEM_ID));
            hashMap2.put("appkey", this.j.get("appkey"));
            hashMap2.put("queryKey", this.j.get("queryKey"));
            hashMap2.put("queryDetailInfo", this.j.get("queryDetailInfo"));
            hashMap2.put(PARAM_ENTRY_SELLERID, this.j.get(PARAM_ENTRY_SELLERID));
            hashMap2.put("liveBucket", poz.d(this.v));
            hashMap2.put("liveAbid", poz.e(this.v));
            hashMap2.put("singleLiveTabSessionId", poz.r(this.v));
            if (aa.aG()) {
                String str4 = this.j.get("entryLiveSource");
                String str5 = this.j.get("timeMovingStatus");
                if (str4 != null && str5 != null && str4.equals("tpp_88") && str5.equals("1")) {
                    hashMap2.put("timeMovingStatus", str5);
                    hashMap2.put(PARAM_ENTRY_ITEM_ID, this.j.get(PARAM_ENTRY_ITEM_ID));
                }
            }
            com.taobao.taolive.room.controller2.c cVar = this.v;
            if (cVar != null && cVar.f() != null && this.v.f().abilityCompontent != null) {
                z = this.v.f().abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_RecommendDXCard);
            }
            if (aa.bQ() && !z) {
                hashMap2.put("queryDirectDown", "true");
                com.taobao.taolive.room.controller2.c cVar2 = this.v;
                if (cVar2 != null && cVar2.t_ != null && this.v.t_.size() > 0) {
                    hashMap2.put(hjs.UNDER_TAKE_GOODS_LIST, JSONObject.toJSONString(this.v.t_));
                }
            }
            com.taobao.taolive.room.controller2.c cVar3 = this.v;
            if (cVar3 != null && cVar3.s != null) {
                hashMap2.put(hjs.UNDER_TAKE_GOODS_LIST, JSONObject.toJSONString(this.v.s));
            }
        }
        hashMap2.put("nextLiveId", str2);
        hashMap2.put("nextAccountId", str3);
        hashMap2.put("nextClientReturnMap", JSONObject.toJSONString(hashMap));
        hashMap2.put("entrySpm", poz.g(this.v));
        hashMap2.put("type", str);
        hashMap2.put("platform", "android");
        hashMap2.put("index", (this.l + 1) + "");
        TBLocationDTO b = TBLocationClient.b();
        if (b != null) {
            hashMap2.put(noa.KEY_CITY_CODE, b.cityCode);
            hashMap2.put(noa.KEY_CITY_NAME, b.cityName);
        }
        hashMap2.put("feedList", this.i.a());
        if ("true".equals(poz.h(this.v))) {
            hashMap2.put("realExposure", "true");
        }
        if (poz.j(this.v) != null) {
            hashMap2.put("homepageFeedList", poz.j(this.v));
        }
        return hashMap2;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.x = str;
        }
    }

    public Map<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7666dbe8", new Object[]{this});
        }
        if (c() == null) {
            return null;
        }
        return c().modelDebugInfo;
    }

    public Map<String, String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("44113da9", new Object[]{this});
        }
        if (c() == null) {
            return null;
        }
        return c().explainDebugInfo;
    }

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f21675a;
        public long b;
        public long c;
        public String d;
        public String e;
        public String f;

        static {
            kge.a(-1287026480);
        }

        private a() {
        }
    }

    /* loaded from: classes8.dex */
    public static class RecModel extends BaseRecModel implements INetDataObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public LiveDetailMessinfoResponseData.AdEurlParams adEurlParams;
        public LiveDetailMessinfoResponseData.AlimamaInfo2 adTransParams;
        public LiveDetailMessinfoResponseData.AlimamaInfo alimama;
        public int autoRecommendInterval;
        public int autoRecommendRepeat;
        public Map<String, String> explainDebugInfo;
        public TppParamFeedInfo feedExtraInfo;
        public String keyPointId;
        public boolean mIsSwitchintelligent;
        public Map<String, String> modelDebugInfo;
        public String productType;
        public String recommendBindId;
        public LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo;
        public LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo;
        public List<SideGudieInfo> sideGudieInfo;
        public String sjsdItemId;
        public String timeMovingId;
        public String timeMovingSpfPlayVideo;

        static {
            kge.a(352301123);
            kge.a(-540945145);
        }

        public static /* synthetic */ Object ipc$super(RecModel recModel, String str, Object... objArr) {
            if (str.hashCode() == 652452591) {
                return new Integer(super.getViewType());
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public RecModel(LiveDetailMessinfoResponseData.RecVideo recVideo, boolean z, com.taobao.taolive.sdk.controller.e eVar) {
            this.liveId = recVideo.liveId;
            this.accountId = recVideo.accountId;
            this.imageUrl = recVideo.coverImg;
            this.actionUrl = com.taobao.taolive.room.utils.c.d(recVideo.nativeFeedDetailUrl, ag.SOURCE_UPDOWNSWITCH);
            this.trackInfo = recVideo.trackInfo;
            this.alimama = recVideo.alimama;
            this.adTransParams = recVideo.adTransParams;
            this.adEurlParams = recVideo.adEurlParams;
            this.mIsSwitchintelligent = z;
            this.liveUrlList = recVideo.liveUrlList;
            this.h265 = recVideo.h265;
            this.rateAdapte = recVideo.rateAdapte;
            this.edgePcdn = recVideo.edgePcdn;
            this.mediaConfig = recVideo.mediaConfig;
            this.anchorId = recVideo.anchorId;
            this.mediaSourceType = recVideo.mediaSourceType;
            this.updownPromptText = recVideo.updownPromptText;
            this.updownRecommendDesc = recVideo.updownRecommendDesc;
            this.extendMap = recVideo.extendMap;
            this.viewCount = recVideo.viewCount;
            this.supportPreLoad = recVideo.supportPreLoad;
            this.feedType = recVideo.feedType;
            this.clientReturnMap = recVideo.clientReturnMap;
            this.recommendBindId = recVideo.recommendBindId;
            this.timeMovingId = recVideo.timeMovingId;
            this.sjsdItemId = recVideo.sjsdItemId;
            this.keyPointId = recVideo.keyPointId;
            this.productType = recVideo.productType;
            this.timeMovingSpfPlayVideo = recVideo.timeMovingSpfPlayVideo;
            this.recommendCardInfo = recVideo.recommendCardInfo;
            this.reserveItemCardInfo = recVideo.reserveItemCardInfo;
            this.sideGudieInfo = recVideo.sideGudieInfo;
            this.modelDebugInfo = recVideo.modelDebugInfo;
            this.explainDebugInfo = recVideo.explainDebugInfo;
            this.autoRecommendInterval = recVideo.autoRecommendInterval;
            this.autoRecommendRepeat = recVideo.autoRecommendRepeat;
        }

        public RecModel(boolean z, com.taobao.taolive.sdk.controller.e eVar) {
            VideoInfo u;
            String queryParameter;
            if (!z && (u = poy.u(n.a())) != null) {
                this.liveId = u.liveId;
                if (u.broadCaster != null) {
                    this.accountId = u.broadCaster.accountId;
                }
                this.imageUrl = u.coverImg;
                this.actionUrl = com.taobao.taolive.room.utils.c.d(u.nativeFeedDetailUrl, ag.SOURCE_UPDOWNSWITCH);
                String c = poz.c(eVar);
                if (!TextUtils.isEmpty(c)) {
                    Uri parse = Uri.parse(c);
                    if (!TextUtils.isEmpty(parse.getQueryParameter("liveAdParams"))) {
                        this.actionUrl += "&liveAdParams=" + Uri.encode(queryParameter);
                    }
                    String queryParameter2 = parse.getQueryParameter(aw.PARAM_SJSD_ITEM_ID);
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        this.actionUrl += "&sjsdItemId=" + queryParameter2;
                    }
                    String queryParameter3 = parse.getQueryParameter(aw.PARAM_TIMEMOVING_ITEM_ID);
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        this.actionUrl += "&timeMovingItemId=" + queryParameter3;
                    }
                }
                if (eVar != null) {
                    this.trackInfo = eVar.aJ_().a().c();
                }
                this.mIsSwitchintelligent = false;
                if ("1".equals(u.roomStatus)) {
                    this.liveUrlList = u.liveUrlList;
                }
                this.h265 = u.h265;
                this.rateAdapte = u.rateAdapte;
                this.edgePcdn = u.edgePcdn;
                this.mediaConfig = u.mediaConfig;
                this.recommendBindId = u.recommendBindId;
            }
        }

        @Override // com.taobao.taolive.sdk.model.BaseRecModel, com.taobao.taolive.sdk.controller.IRecyclerModel
        public int getViewType() {
            LiveDetailMessinfoResponseData.ReserveItemCardInfo reserveItemCardInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("26e3a2ef", new Object[]{this})).intValue();
            }
            if (aa.bQ() && (this.recommendCardInfo != null || ((reserveItemCardInfo = this.reserveItemCardInfo) != null && reserveItemCardInfo.cardInfo != null))) {
                return ContentType.Good_Card.ordinal();
            }
            return super.getViewType();
        }
    }
}
