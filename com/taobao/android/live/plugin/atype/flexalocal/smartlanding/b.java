package com.taobao.android.live.plugin.atype.flexalocal.smartlanding;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.MtopRoomstudioLiveDisplayDetailResponse;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.MtopTbliveGrowthApiPopCheckPopResponse;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.MtopTbliveGrowthApiPopCheckPopResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.FatigueModel;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.l;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import tb.hgt;
import tb.hka;
import tb.hkk;
import tb.kge;
import tb.pmd;
import tb.pqj;

/* loaded from: classes6.dex */
public class b implements ISmartLandingProxy.b, com.taobao.taolive.sdk.adapter.network.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f14013a;
    private SmartLandingTask B;
    private JSONObject C;
    private String E;
    private JSONObject F;
    private Context b;
    private String c;
    private String d;
    private String e;
    private String f;
    private ISmartLandingProxy.c g;
    private com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.a h;
    private c p;
    private Timer r;
    private Handler s;
    private String t;
    private boolean u = false;
    private boolean v = true;
    private String m = null;
    private String n = null;
    private String o = null;
    private String w = null;
    private String x = null;
    private String y = null;
    private List<SmartLandingTask> i = new ArrayList();
    private HashMap<String, String> j = new HashMap<>();
    private Map<String, FatigueModel> q = new HashMap();
    private HashMap<String, ArrayList<ISmartLandingProxy.d>> z = new HashMap<>();
    private HashMap<String, ArrayList<ISmartLandingProxy.d>> A = new HashMap<>();
    private boolean k = false;
    private Set<String> l = new HashSet();
    private boolean D = false;

    public static /* synthetic */ Handler a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("7ceb84fc", new Object[]{bVar}) : bVar.s;
    }

    public static /* synthetic */ void a(b bVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ae8e7a", new Object[]{bVar, new Long(j)});
        } else {
            bVar.a(j);
        }
    }

    static {
        kge.a(1400600899);
        kge.a(-407349346);
        kge.a(-797454141);
        f14013a = b.class.getSimpleName();
        q.a("TBLivePopWVPlugin", (Class<? extends e>) TBLivePopWVPlugin.class, true);
    }

    public b(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject, ISmartLandingProxy.c cVar) {
        this.b = context;
        this.c = str;
        this.t = str2;
        this.d = str3;
        a(str7, str4, str5, str6, jSONObject);
        this.s = new Handler(Looper.getMainLooper());
        String str8 = f14013a;
        com.taobao.taolive.sdk.utils.q.b(str8, "SmartLanding() " + str + " entryLiveSource " + str3 + " liveSource " + str4 + " " + str5 + " " + str6);
        this.g = new d(cVar);
        b();
    }

    private void a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd05860", new Object[]{this, str, str2, str3, str4, jSONObject});
            return;
        }
        this.f = str;
        this.m = str2;
        this.n = str3;
        this.o = str4;
        this.F = jSONObject;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || parse.isOpaque()) {
            return;
        }
        this.e = parse.getQueryParameter("spm");
        this.u = parse.getBooleanQueryParameter(aw.PARAM_NEED_RECOMMEND, false);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.E = UUID.randomUUID().toString();
        a("smartlanding_action_enter_room", (String) null, (SmartLandingTask) null, (HashMap<String, String>) null, 0L);
        this.p = new c(this.c);
        this.p.a();
        if (!"liveRoomPage".equals(this.c) || (!this.u && !TextUtils.isEmpty(this.n))) {
            z = true;
        }
        this.v = z;
        if (!this.v) {
            return;
        }
        b((TBLiveDataModel) null);
    }

    private void b(TBLiveDataModel tBLiveDataModel) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1229aa2", new Object[]{this, tBLiveDataModel});
            return;
        }
        if (this.h == null) {
            this.h = new com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.a(this);
        }
        String a2 = com.taobao.taolive.sdk.utils.b.a(this.b);
        if (!TextUtils.isEmpty(this.t)) {
            a2 = this.t;
        }
        String str4 = a2;
        com.taobao.taolive.sdk.utils.q.b(f14013a, "getSmartLandingTask " + this.c + " entryLiveSource " + this.d + " liveSource " + this.m + " " + this.n + " " + this.o);
        if (f() && "liveRoomPage".equals(this.c)) {
            JSONObject jSONObject = new JSONObject();
            String str5 = null;
            if (!TextUtils.isEmpty(this.f)) {
                Uri parse = Uri.parse(this.f);
                if (parse == null || parse.isOpaque()) {
                    str3 = null;
                } else {
                    str3 = a(jSONObject, "targetAliveId", parse);
                    a(jSONObject, "targetAliveExtendInfo", parse);
                    this.w = a(jSONObject, aw.PARAM_ITEM_HOLD_TYPE, parse);
                    this.x = a(jSONObject, aw.PARAM_ITEM_IDS, parse);
                    this.y = a(jSONObject, aw.PARAM_SJSD_ITEM_ID, parse);
                    a(jSONObject, aw.PARAM_PRODUCT_TYPE, parse);
                    a(jSONObject, "itemIds", parse);
                    a(jSONObject, aw.PARAM_SHAQRE_ITEM_ID, parse);
                    if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && !TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.dispatchItemID)) {
                        jSONObject.put("dispatchItemID", (Object) tBLiveDataModel.mVideoInfo.dispatchItemID);
                    }
                    JSONObject a3 = hka.a(parse);
                    if (!a3.isEmpty()) {
                        jSONObject.put("huanduanParams", (Object) a3.toJSONString());
                    }
                    a(jSONObject, "shareType", parse);
                }
                if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null) {
                    this.n = tBLiveDataModel.mVideoInfo.liveId;
                    str5 = tBLiveDataModel.mVideoInfo.displayExtParams;
                    if (!TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.dispatchItemID)) {
                        jSONObject.put("dispatchItemID", (Object) tBLiveDataModel.mVideoInfo.dispatchItemID);
                    }
                    if (!TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.itemHoldType)) {
                        String str6 = tBLiveDataModel.mVideoInfo.itemHoldType;
                        this.w = str6;
                        jSONObject.put(aw.PARAM_ITEM_HOLD_TYPE, (Object) str6);
                    }
                    if (!TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.holdItemIds)) {
                        String str7 = tBLiveDataModel.mVideoInfo.holdItemIds;
                        this.x = str7;
                        jSONObject.put(aw.PARAM_ITEM_IDS, (Object) str7);
                    }
                    if (tBLiveDataModel.mVideoInfo.broadCaster != null) {
                        this.o = tBLiveDataModel.mVideoInfo.broadCaster.accountId;
                    }
                }
                if (!TextUtils.isEmpty(this.y) && TextUtils.isEmpty(this.w) && TextUtils.isEmpty(this.x)) {
                    this.w = com.taobao.taolive.sdk.mergeInfo.b.VALUE_ITEM_HOLD_TYPE_CARD;
                    jSONObject.put(aw.PARAM_ITEM_HOLD_TYPE, com.taobao.taolive.sdk.mergeInfo.b.VALUE_ITEM_HOLD_TYPE_CARD);
                    String str8 = this.y;
                    this.x = str8;
                    jSONObject.put(aw.PARAM_ITEM_IDS, (Object) str8);
                }
                str2 = str5;
                str = str3;
            } else {
                str = null;
                str2 = null;
            }
            this.h.a(this.c, this.d, this.f, this.m, this.n, this.o, "20240625", str4, this.u, str, jSONObject, str2, this.F);
            return;
        }
        this.h.a(this.c, this.d, this.f, this.m, this.n, this.o, "20240625");
    }

    private String a(JSONObject jSONObject, String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afe6b50b", new Object[]{this, jSONObject, str, uri});
        }
        String queryParameter = uri.getQueryParameter(str);
        if (!TextUtils.isEmpty(queryParameter)) {
            jSONObject.put(str, (Object) queryParameter);
        }
        return queryParameter;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.j.put(str, str2);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public boolean a(String str, ISmartLandingProxy.a aVar) {
        List<SmartLandingTask> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78cae15d", new Object[]{this, str, aVar})).booleanValue();
        }
        if (!this.k || (list = this.i) == null || list.isEmpty()) {
            if (!TextUtils.equals(str, "leave") && !TextUtils.equals(str, "stay")) {
                this.l.add(str);
            }
            return false;
        }
        return b(str, aVar);
    }

    private boolean b(String str, ISmartLandingProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a111219e", new Object[]{this, str, aVar})).booleanValue();
        }
        for (SmartLandingTask smartLandingTask : a(str)) {
            if (a(smartLandingTask, str)) {
                a(str, smartLandingTask);
                return true;
            }
        }
        return false;
    }

    private List<SmartLandingTask> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        if (this.i != null && !l.e(str)) {
            try {
                for (SmartLandingTask smartLandingTask : this.i) {
                    if (smartLandingTask != null && smartLandingTask.popConditions != null && smartLandingTask.popConditions.containsKey(str) && (!smartLandingTask.enableTerminalCtrl || (smartLandingTask.showStrategy != null && smartLandingTask.showStrategy.canShow(smartLandingTask.getIdentificationId(this.c))))) {
                        if (!smartLandingTask.isRunComplete) {
                            arrayList.add(smartLandingTask);
                        }
                    }
                }
            } catch (Exception e) {
                com.taobao.taolive.sdk.utils.q.a(f14013a, "getConfig exp", e);
            }
        }
        return arrayList;
    }

    private boolean a(SmartLandingTask smartLandingTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("333a8bf8", new Object[]{this, smartLandingTask, str})).booleanValue();
        }
        if (smartLandingTask == null || b(smartLandingTask)) {
            return false;
        }
        String str2 = f14013a;
        com.taobao.taolive.sdk.utils.q.a(str2, "popId[" + smartLandingTask.popId + "] isInFatigueStage: true");
        if (smartLandingTask.enableTerminalCtrl && !d(smartLandingTask)) {
            return false;
        }
        String str3 = f14013a;
        com.taobao.taolive.sdk.utils.q.a(str3, "popId[" + smartLandingTask.popId + "] getShowStrategyTask: true");
        if (smartLandingTask.disableConditionCheck || b(smartLandingTask, str)) {
            String str4 = f14013a;
            com.taobao.taolive.sdk.utils.q.a(str4, "popId[" + smartLandingTask.popId + "] checkPopConditions: true");
            e(smartLandingTask);
            c(smartLandingTask);
            return true;
        }
        return false;
    }

    private boolean b(SmartLandingTask smartLandingTask) {
        FatigueModel fatigueModel;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8a9d52f", new Object[]{this, smartLandingTask})).booleanValue() : (smartLandingTask.popAction == null || smartLandingTask.popAction.actionData == null || !smartLandingTask.popAction.actionData.getBooleanValue("acceptFatigue") || (fatigueModel = this.q.get("fatigue")) == null || System.currentTimeMillis() - fatigueModel.lastShowTime > smartLandingTask.popAction.actionData.getLongValue("fatigueInterval") * 1000) ? false : true;
    }

    private void c(SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5531ac", new Object[]{this, smartLandingTask});
        } else if (smartLandingTask.popAction == null || smartLandingTask.popAction.actionData == null || !smartLandingTask.popAction.actionData.getBooleanValue("acceptFatigue")) {
        } else {
            FatigueModel fatigueModel = new FatigueModel();
            fatigueModel.configId = smartLandingTask.popId;
            fatigueModel.lastShowTime = System.currentTimeMillis();
            this.q.put("fatigue", fatigueModel);
        }
    }

    private boolean d(SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74008e31", new Object[]{this, smartLandingTask})).booleanValue();
        }
        com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.c a2 = this.p.a(smartLandingTask);
        if (a2 == null) {
            return false;
        }
        return a2.b(smartLandingTask);
    }

    private boolean b(SmartLandingTask smartLandingTask, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2222a39", new Object[]{this, smartLandingTask, str})).booleanValue() : smartLandingTask != null && smartLandingTask.popConditions != null && smartLandingTask.popConditions.containsKey(str) && a.a(this.j, smartLandingTask.popConditions.get(str));
    }

    private void e(SmartLandingTask smartLandingTask) {
        c cVar;
        com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59abeaae", new Object[]{this, smartLandingTask});
        } else if (smartLandingTask == null || (cVar = this.p) == null || (a2 = cVar.a(smartLandingTask)) == null) {
        } else {
            a2.c(smartLandingTask);
        }
    }

    private boolean a(String str, SmartLandingTask smartLandingTask) {
        ISmartLandingProxy.c cVar;
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32f4ca78", new Object[]{this, str, smartLandingTask})).booleanValue();
        }
        if (smartLandingTask != null && smartLandingTask.popAction != null) {
            JSONObject jSONObject = new JSONObject(smartLandingTask.popAction.actionData);
            jSONObject.put("spm", (Object) this.e);
            jSONObject.put("livesource", (Object) this.d);
            jSONObject.put("smartLandingToken", (Object) this.E);
            ArrayList<ISmartLandingProxy.d> arrayList = this.z.get(smartLandingTask.popAction.actionType);
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<ISmartLandingProxy.d> it = arrayList.iterator();
                loop0: while (true) {
                    z = false;
                    while (it.hasNext()) {
                        ISmartLandingProxy.d next = it.next();
                        if (z || next.a(smartLandingTask.popId, jSONObject, this.C)) {
                            z = true;
                        }
                    }
                }
                z2 = z;
            }
            if (!z2 && (cVar = this.g) != null) {
                z2 = cVar.a(this.b, smartLandingTask.popId, smartLandingTask.popAction.actionType, jSONObject);
            }
            if (!z2 && g4.b.i.equals(str)) {
                this.B = smartLandingTask;
            }
            if (hkk.at()) {
                smartLandingTask.isRunComplete = true;
            }
            b("触发承接 " + smartLandingTask.popAction.actionType, smartLandingTask.popId);
            String str2 = f14013a;
            com.taobao.taolive.sdk.utils.q.b(str2, "runTaskAction " + this.c + " entryLiveSource " + this.d + " liveSource " + this.m + " " + this.n + " " + this.o + " 是否触发task " + z2 + " " + smartLandingTask.popAction.actionType + " " + smartLandingTask.popId);
            b(str, smartLandingTask);
        }
        return true;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String str = f14013a;
        com.taobao.taolive.sdk.utils.q.b(str, "destroy " + this.c + " entryLiveSource " + this.d + " liveSource " + this.m + " " + this.n + " " + this.o);
        this.b = null;
        com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.a aVar = this.h;
        if (aVar != null) {
            aVar.a();
            this.h = null;
        }
        ISmartLandingProxy.c cVar = this.g;
        if (cVar != null) {
            cVar.a();
        }
        this.k = false;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void a(boolean z, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c685c5dc", new Object[]{this, new Boolean(z), str, str2, str3, str4, jSONObject});
            return;
        }
        a(str, str2, str3, str4, jSONObject);
        String str5 = f14013a;
        com.taobao.taolive.sdk.utils.q.b(str5, "onEnter " + this.c + " entryLiveSource " + this.d + " liveSource " + this.m + " " + this.n + " " + this.o);
        if (!z) {
            b();
        }
        i();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        d();
        a("hasSJSDNativePop", "false");
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String str = f14013a;
        com.taobao.taolive.sdk.utils.q.b(str, "onExit " + this.c + " entryLiveSource " + this.d + " liveSource " + this.m + " " + this.n + " " + this.o);
        e();
        List<SmartLandingTask> list = this.i;
        if (list != null) {
            list.clear();
        }
        Set<String> set = this.l;
        if (set != null) {
            set.clear();
        }
        HashMap<String, String> hashMap = this.j;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, ArrayList<ISmartLandingProxy.d>> hashMap2 = this.z;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        HashMap<String, ArrayList<ISmartLandingProxy.d>> hashMap3 = this.A;
        if (hashMap3 != null) {
            hashMap3.clear();
        }
        this.f = null;
        this.n = null;
        this.o = null;
        this.m = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.D = false;
        this.C = null;
        this.B = null;
        c cVar = this.p;
        if (cVar == null) {
            return;
        }
        cVar.b();
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
            return;
        }
        String str = f14013a;
        com.taobao.taolive.sdk.utils.q.b(str, "onDataReceived " + this.c + " entryLiveSource " + this.d + " liveSource " + this.m + " " + this.n + " " + this.o);
        if (this.v) {
            return;
        }
        b(tBLiveDataModel);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void a(boolean z, String str, ISmartLandingProxy.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f1087a", new Object[]{this, new Boolean(z), str, dVar});
            return;
        }
        String str2 = f14013a;
        com.taobao.taolive.sdk.utils.q.b(str2, "addSmartLandingTaskActionListener " + this.c + " entryLiveSource " + this.d + " liveSource " + this.m + " " + this.n + " " + this.o + " " + z + " " + str);
        if (z) {
            if (this.C != null) {
                a(true, str, Collections.singletonList(dVar));
                return;
            } else {
                a(this.A, str, dVar);
                return;
            }
        }
        a(this.z, str, dVar);
        a(false, str, Collections.singletonList(dVar));
    }

    private void a(HashMap<String, ArrayList<ISmartLandingProxy.d>> hashMap, String str, ISmartLandingProxy.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f61099", new Object[]{this, hashMap, str, dVar});
            return;
        }
        ArrayList<ISmartLandingProxy.d> arrayList = hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(dVar);
        hashMap.put(str, arrayList);
    }

    private void a(boolean z, String str, List<ISmartLandingProxy.d> list) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a8db27", new Object[]{this, new Boolean(z), str, list});
            return;
        }
        SmartLandingTask smartLandingTask = this.B;
        String str2 = null;
        if (smartLandingTask == null || smartLandingTask.popAction == null || !TextUtils.equals(str, this.B.popAction.actionType)) {
            jSONObject = null;
        } else {
            String str3 = this.B.popId;
            jSONObject = this.B.popAction.actionData;
            if (!hkk.aq()) {
                this.B = null;
            }
            com.taobao.taolive.sdk.utils.q.b(f14013a, "runTaskAction 触发task enter " + this.c + " entryLiveSource " + this.d + " liveSource " + this.m + " " + this.n + " " + this.o + " " + str3 + " " + str);
            str2 = str3;
            z = true;
        }
        if ("goods".equals(str) && jSONObject == null && com.taobao.taolive.sdk.mergeInfo.b.VALUE_ITEM_HOLD_TYPE_CARD.equals(this.w)) {
            jSONObject = new JSONObject();
            jSONObject.put(aw.PARAM_ITEM_HOLD_TYPE, (Object) this.w);
            jSONObject.put(aw.PARAM_ITEM_IDS, (Object) this.x);
            jSONObject.put(aw.PARAM_SJSD_ITEM_ID, (Object) this.y);
        }
        if (!z || list == null || list.isEmpty()) {
            return;
        }
        for (ISmartLandingProxy.d dVar : list) {
            dVar.a(str2, jSONObject, this.C);
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        Context context = this.b;
        if (context == null || !com.taobao.taolive.sdk.utils.b.d(context)) {
            return;
        }
        Context context2 = this.b;
        hgt.a(context2, str + " popId " + str2);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : hkk.af();
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        MtopTbliveGrowthApiPopCheckPopResponseData mo1437getData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        String str = f14013a;
        com.taobao.taolive.sdk.utils.q.b(str, "onSuccess " + this.c + " entryLiveSource " + this.d + " liveSource " + this.m + " " + this.n + " " + this.o);
        long currentTimeMillis = System.currentTimeMillis();
        if (netBaseOutDo instanceof MtopRoomstudioLiveDisplayDetailResponse) {
            JSONObject mo1437getData2 = ((MtopRoomstudioLiveDisplayDetailResponse) netBaseOutDo).mo1437getData();
            if (mo1437getData2 != null) {
                this.i = pqj.b(mo1437getData2.getString("popList"), SmartLandingTask.class);
                this.C = new JSONObject(mo1437getData2);
                this.C.remove("popList");
                h();
                for (String str2 : this.A.keySet()) {
                    a(true, str2, (List<ISmartLandingProxy.d>) this.A.get(str2));
                }
            }
        } else if ((netBaseOutDo instanceof MtopTbliveGrowthApiPopCheckPopResponse) && (mo1437getData = ((MtopTbliveGrowthApiPopCheckPopResponse) netBaseOutDo).mo1437getData()) != null && mo1437getData.popList != null) {
            this.i = mo1437getData.popList;
            h();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        List<SmartLandingTask> list = this.i;
        if (list != null) {
            for (SmartLandingTask smartLandingTask : list) {
                if (sb.length() != 0) {
                    sb.append(",");
                }
                sb.append(smartLandingTask.popId);
            }
        }
        hashMap.put("pop_id_list", sb.toString());
        a("smartlanding_action_mtop_response", (String) null, (SmartLandingTask) null, hashMap, currentTimeMillis);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.p.a(this.i);
        this.k = true;
        for (String str : this.l) {
            a(str, (ISmartLandingProxy.a) null);
        }
        this.l.clear();
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        String str = f14013a;
        com.taobao.taolive.sdk.utils.q.b(str, "request onError " + i);
        for (String str2 : this.A.keySet()) {
            a(true, str2, (List<ISmartLandingProxy.d>) this.A.get(str2));
        }
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

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.r = new Timer("Smartlanding_timer");
        this.r.schedule(new TimerTask() { // from class: com.taobao.android.live.plugin.atype.flexalocal.smartlanding.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.a(b.this).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.smartlanding.b.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                b.a(b.this, 1L);
                            }
                        }
                    });
                }
            }
        }, 0L, 1000L);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Timer timer = this.r;
        if (timer == null) {
            return;
        }
        timer.cancel();
        this.r = null;
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        if (this.j == null) {
            this.j = new HashMap<>();
        }
        if (this.j.containsKey("totalStay")) {
            String str = this.j.get("totalStay");
            if (str != null) {
                HashMap<String, String> hashMap = this.j;
                hashMap.put("totalStay", "" + (l.a(str, 0) + j));
            } else {
                HashMap<String, String> hashMap2 = this.j;
                hashMap2.put("totalStay", "" + j);
            }
        } else {
            HashMap<String, String> hashMap3 = this.j;
            hashMap3.put("totalStay", "" + j);
        }
        if (!hkk.at()) {
            return;
        }
        a("stay", (ISmartLandingProxy.a) null);
    }

    private void b(String str, SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc68b5", new Object[]{this, str, smartLandingTask});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scene_code", smartLandingTask.popId);
        hashMap.put("link_node_key", "push_smartlanding_room_max_message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) "success");
        if (smartLandingTask != null && smartLandingTask.popAction != null) {
            jSONObject.put("data", (Object) smartLandingTask.popAction.actionData);
        }
        hashMap.put("link_content", jSONObject.toJSONString());
        a(com.taobao.taolivecontainer.b.PAGE_TAOBAOLIVECONTAINER, "full_link_monitoring", hashMap);
        a("smartlanding_action_pop_show", str, smartLandingTask, (HashMap<String, String>) null, 0L);
    }

    private void a(String str, String str2, SmartLandingTask smartLandingTask, HashMap<String, String> hashMap, long j) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d359ce2f", new Object[]{this, str, str2, smartLandingTask, hashMap, new Long(j)});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put("bizCode", this.c);
        hashMap.put("behavior", str2);
        if (smartLandingTask != null && smartLandingTask.popAction != null && smartLandingTask.popAction.actionData != null) {
            hashMap.put("popId", smartLandingTask.popId);
            hashMap.put("actionData", smartLandingTask.popAction.actionData.toJSONString());
            hashMap.put("actionType", smartLandingTask.popAction.actionType);
            if ("goods".equals(smartLandingTask.popAction.actionType)) {
                string = smartLandingTask.popAction.actionData.getString(aw.PARAM_ITEM_HOLD_TYPE);
            } else if ("alive".equals(smartLandingTask.popAction.actionType) || "targetAlive".equals(smartLandingTask.popAction.actionType)) {
                string = smartLandingTask.popAction.actionData.getString("targetAliveId");
            } else {
                string = smartLandingTask.popAction.actionType;
            }
            hashMap.put("componentName", string);
        }
        hashMap.put("url", this.f);
        hashMap.put("livesource", this.m);
        hashMap.put("entrylivesource", this.d);
        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, this.n);
        hashMap.put("accountId", this.o);
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        hashMap.put("timestamp", String.valueOf(j));
        hashMap.put("token", this.E);
        b(com.taobao.taolivecontainer.b.PAGE_TAOBAOLIVECONTAINER, str, hashMap);
        if (pmd.a().I() == null) {
            return;
        }
        pmd.a().I().a(str, com.taobao.taolivecontainer.b.PAGE_TAOBAOLIVECONTAINER, hashMap);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(str, "Button-" + str2);
        uTControlHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", map).build());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.D;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void a(boolean z, String str, boolean z2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114d9f52", new Object[]{this, new Boolean(z), str, new Boolean(z2), jSONObject});
        } else if (this.D == z) {
        } else {
            this.D = z;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("hasWYSIWYG", (Object) Boolean.valueOf(this.D));
            jSONObject2.put("ext", (Object) jSONObject);
            jSONObject2.put("popId", (Object) str);
            if (z2) {
                WVStandardEventCenter.postNotificationToJS("TBLiveWVPlugin.Event.sjsdPopStatusChanged", jSONObject2.toJSONString());
                a("hasSJSDNativePop", String.valueOf(this.D));
            }
            if (!z) {
                return;
            }
            a("smartlanding_action_pop_show_success", z2 ? g4.b.i : "", b(str), (HashMap<String, String>) null, 0L);
        }
    }

    private SmartLandingTask b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SmartLandingTask) ipChange.ipc$dispatch("eb41c005", new Object[]{this, str});
        }
        if (this.i == null || l.e(str)) {
            return null;
        }
        for (SmartLandingTask smartLandingTask : this.i) {
            if (smartLandingTask != null && TextUtils.equals(str, smartLandingTask.popId)) {
                return smartLandingTask;
            }
        }
        return null;
    }
}
