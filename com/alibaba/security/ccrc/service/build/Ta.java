package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.core.WuKongNativeManager;
import com.alibaba.security.client.smart.core.model.EvalResult;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.config.Algo;
import com.alibaba.security.wukong.config.RiskSceneInfo;
import com.alibaba.security.wukong.config.WuKongBizConfigData;
import com.alibaba.security.wukong.config.WuKongEventConfigData;
import com.alibaba.security.wukong.event.EventResultData;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.plugin.BaseWuKongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class Ta implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a */
    public static final String f3276a = "WuKongManager";
    public static final int b = 1;
    public static final String c = "statics";
    public static final String d = "traces";
    public static final String e = "data";
    public static final String f = "clientInfo";
    public static final String g = "pId";
    public static final String h = "ccrcCode";
    public static final String i = "ccrc_service";
    public static InferContext j;
    public static String k;
    public final String l;
    public final Ma m;
    public final Ib o;
    public final C1259wa p;
    public final C1198bb s;
    public final String u;
    public WuKongEventConfigData v;
    public CcrcService.Config w;
    public InterfaceC1260wb x;
    public P y;
    public InterfaceC1223k z;
    public final CopyOnWriteArrayList<String> q = new CopyOnWriteArrayList<>();
    public final Kb n = Kb.b();
    public final Handler r = new HandlerC1256va(this);
    public final Ra t = new Ra(this);
    public final ThreadPoolExecutor A = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Ka("wukong_manager"));

    /* loaded from: classes3.dex */
    public interface a {
        void a(boolean z, String str);
    }

    public Ta(String str, String str2) {
        this.l = str;
        this.u = str2;
        this.p = new C1259wa(str);
        this.s = new C1198bb(str);
        this.m = new Ma(str);
        this.o = Ib.a(this.l);
        this.A.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void a(Ta ta, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e698671f", new Object[]{ta, new Boolean(z), str});
        } else {
            ta.a(z, str);
        }
    }

    private void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
        }
    }

    private void c(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        String e2 = WuKongNativeManager.a().e();
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.q;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            str = "";
        } else {
            str = C1235o.a(JsonUtils.toJSONString(this.q).getBytes());
            this.q.clear();
        }
        if (this.n.m()) {
            c(e2);
        } else if (!StringUtils.isEmpty(e2) || !StringUtils.isEmpty(str)) {
            a(str, C1235o.a(e2.getBytes()));
        }
        if (z) {
            return;
        }
        this.r.sendEmptyMessageDelayed(1, this.n.g());
    }

    private Map<String, Object> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ddd6ceb", new Object[]{this, str});
        }
        WuKongEventConfigData wuKongEventConfigData = this.v;
        if (wuKongEventConfigData == null) {
            return null;
        }
        return wuKongEventConfigData.getAlgoConfig(str);
    }

    public static /* synthetic */ void lambda$7cWhecws3_0ZWlXjq1kyU5grT_k(Ta ta, InterfaceC1257vb interfaceC1257vb, U u, String str, boolean z, String str2, WuKongBizConfigData wuKongBizConfigData) {
        ta.a(interfaceC1257vb, u, str, z, str2, wuKongBizConfigData);
    }

    public static /* synthetic */ void lambda$LO3mLVGszAjYiNKGsqxfdRgLBss(Ta ta, String str, InferContext inferContext, EvalResult evalResult, long j2) {
        ta.a(str, inferContext, evalResult, j2);
    }

    public static /* synthetic */ void lambda$ORpT32c_nLMxvoZYifxadFhMM9M(Ta ta, InterfaceC1257vb interfaceC1257vb, String str, U u, boolean z, boolean z2, String str2) {
        ta.a(interfaceC1257vb, str, u, z, z2, str2);
    }

    public static /* synthetic */ void lambda$n2o1BAt3v7Y8hOrjACInA1wnOKE(Ta ta, EvalResult evalResult) {
        ta.a(evalResult);
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[0]) : "{\"appKey\":\"1212123\",\"appName\":\"xxxxx\",\"bizFeatures\":{},\"ccrcCode\":\"xcsdsdsdsf\",\"ccrcResults\":{\"_errorMsg\":\"algo config list is empty\",\"dataId\":\"6061bf5a-4441-4a88-93a0-2417df0612d2\",\"metaId\":\"6061bf5a-4441-4a88-93a0-2417df0612d2\",\"extras\":{}},\"deviceModel\":\"Pixel 7\",\"metaId\":\"6061bf5a-4441-4a88-93a0-2417df0612d2\",\"osName\":\"Android\",\"osVersion\":\"14\",\"pid\":\"CT_83784883-884c-4fc9-a740-befa334e87a6\",\"prepareID\":\"PREPARE_CCRC_ZHENGFENG_TEST2_508BFC00-66A0-4DD6-98AE-6ABE6EC2D4E0\",\"raw\":{\"behavior\":{\"asdasf\":1232323,\"test\":1212,\"ytyhg\":\"asda://baidu.com\",\"pageName\":\"scan\",\"jumpUrl\":\"sdsdsfg://ggfgf.com\"}},\"sdkVersion\":\"1.9.20121\",\"utdid\":\"Ytyasdsaiwussdsd\",\"wukong_uuid\":\"0c7cd97a-7575-4a05-a35f-a68f0aea9ee5_ANDROID_WUKONG_1721737747016_9590\"}";
    }

    public static void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[0]);
        } else if (j != null) {
        } else {
            InferContext inferContext = (InferContext) JsonUtils.parseObject("{\"appKey\":\"1212123\",\"appName\":\"xxxxx\",\"bizFeatures\":{},\"ccrcCode\":\"xcsdsdsdsf\",\"ccrcResults\":{\"_errorMsg\":\"algo config list is empty\",\"dataId\":\"6061bf5a-4441-4a88-93a0-2417df0612d2\",\"metaId\":\"6061bf5a-4441-4a88-93a0-2417df0612d2\",\"extras\":{}},\"deviceModel\":\"Pixel 7\",\"metaId\":\"6061bf5a-4441-4a88-93a0-2417df0612d2\",\"osName\":\"Android\",\"osVersion\":\"14\",\"pid\":\"CT_83784883-884c-4fc9-a740-befa334e87a6\",\"prepareID\":\"PREPARE_CCRC_ZHENGFENG_TEST2_508BFC00-66A0-4DD6-98AE-6ABE6EC2D4E0\",\"raw\":{\"behavior\":{\"asdasf\":1232323,\"test\":1212,\"ytyhg\":\"asda://baidu.com\",\"pageName\":\"scan\",\"jumpUrl\":\"sdsdsfg://ggfgf.com\"}},\"sdkVersion\":\"1.9.20121\",\"utdid\":\"Ytyasdsaiwussdsd\",\"wukong_uuid\":\"0c7cd97a-7575-4a05-a35f-a68f0aea9ee5_ANDROID_WUKONG_1721737747016_9590\"}", (Class<Object>) InferContext.class);
            j = inferContext;
            String jSONString = JsonUtils.toJSONString(inferContext);
            k = jSONString;
            if (jSONString == null) {
                return;
            }
            jSONString.length();
        }
    }

    private Context s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("5d322472", new Object[]{this}) : CcrcContextImpl.getContext();
    }

    private synchronized InterfaceC1223k t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InterfaceC1223k) ipChange.ipc$dispatch("e8b157cc", new Object[]{this});
        }
        if (this.z == null) {
            this.z = new C1220j(CcrcContextImpl.getContext());
        }
        return this.z;
    }

    private String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("326979a4", new Object[]{this});
        }
        CcrcService.Config config = this.w;
        return config != null ? config.getPid() : this.u;
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else {
            this.r.sendEmptyMessageDelayed(1, this.n.g());
        }
    }

    public String b(String str) {
        List<RiskSceneInfo> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String str2 = null;
        WuKongEventConfigData wuKongEventConfigData = this.v;
        if (wuKongEventConfigData != null && (list = wuKongEventConfigData.sceneList) != null) {
            Iterator<RiskSceneInfo> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RiskSceneInfo next = it.next();
                if (next.contains(str)) {
                    str2 = next.sceneName;
                    break;
                }
            }
        }
        return StringUtils.isEmpty(str2) ? str : str2;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        WuKongEventConfigData wuKongEventConfigData = this.v;
        if (wuKongEventConfigData == null) {
            return null;
        }
        return wuKongEventConfigData.eventCode;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.u;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.n.k();
    }

    public List<Algo> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        WuKongEventConfigData wuKongEventConfigData = this.v;
        if (wuKongEventConfigData != null) {
            return wuKongEventConfigData.getBehaviorList();
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 1) {
            c(false);
        }
        return true;
    }

    public List<Algo> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this});
        }
        WuKongEventConfigData wuKongEventConfigData = this.v;
        if (wuKongEventConfigData != null) {
            return wuKongEventConfigData.getPythonList();
        }
        return null;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.x.a();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        WuKongEventConfigData wuKongEventConfigData = this.v;
        return wuKongEventConfigData != null && wuKongEventConfigData.isAlgoListIsEmpty();
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.t.f();
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.s.b();
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.n.d(this.l);
    }

    public Map<String, Integer> p() {
        List<RiskSceneInfo> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ad1062ec", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        WuKongEventConfigData wuKongEventConfigData = this.v;
        if (wuKongEventConfigData != null && (list = wuKongEventConfigData.sceneList) != null) {
            for (RiskSceneInfo riskSceneInfo : list) {
                hashMap.put(riskSceneInfo.sceneName, Integer.valueOf(riskSceneInfo.needInferSize()));
            }
        }
        return hashMap;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        c(true);
        this.r.removeMessages(1);
        this.s.c();
        this.p.a();
        this.m.a();
        WuKongNativeManager.a().a(d());
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            b(str, d);
        }
    }

    private void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            Logging.w(f3276a, "restoreInfo is empty");
        } else {
            if (this.n.m()) {
                b(str, d);
            }
            this.q.add(str);
        }
    }

    public void a(CcrcService.Config config, InterfaceC1257vb interfaceC1257vb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6ef0a3", new Object[]{this, config, interfaceC1257vb});
            return;
        }
        this.w = config;
        this.p.a(config.getPid());
        this.s.a(i(), config.getPid(), new Sa(this, interfaceC1257vb));
    }

    public WuKongEventConfigData e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WuKongEventConfigData) ipChange.ipc$dispatch("3b596735", new Object[]{this}) : this.v;
    }

    public void a(final String str, final U u, final boolean z, final InterfaceC1257vb interfaceC1257vb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fb7367", new Object[]{this, str, u, new Boolean(z), interfaceC1257vb});
        } else {
            a(new a() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$Ta$ORpT32c_nLMxvoZYifxadFhMM9M
                @Override // com.alibaba.security.ccrc.service.build.Ta.a
                public final void a(boolean z2, String str2) {
                    Ta.lambda$ORpT32c_nLMxvoZYifxadFhMM9M(Ta.this, interfaceC1257vb, str, u, z, z2, str2);
                }
            });
        }
    }

    public /* synthetic */ void a(final InterfaceC1257vb interfaceC1257vb, final String str, final U u, boolean z, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce2b057", new Object[]{this, interfaceC1257vb, str, u, new Boolean(z), new Boolean(z2), str2});
        } else if (!z2) {
            interfaceC1257vb.a(false, "wukong engine init fail: " + str2, null);
        } else {
            this.t.a(str, u, z, new InterfaceC1248sb() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$Ta$7cWhecws3_0ZWlXjq1kyU5grT_k
                @Override // com.alibaba.security.ccrc.service.build.InterfaceC1248sb
                public final void a(boolean z3, String str3, WuKongBizConfigData wuKongBizConfigData) {
                    Ta.lambda$7cWhecws3_0ZWlXjq1kyU5grT_k(Ta.this, interfaceC1257vb, u, str, z3, str3, wuKongBizConfigData);
                }
            });
        }
    }

    private synchronized boolean b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("552009fb", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        boolean a2 = WuKongNativeManager.a().a(CcrcContextImpl.getContext(), str, str2, this.l, d());
        a(this.l, a2, str2, z);
        return a2;
    }

    public /* synthetic */ void a(final InterfaceC1257vb interfaceC1257vb, U u, String str, boolean z, String str2, WuKongBizConfigData wuKongBizConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3135accf", new Object[]{this, interfaceC1257vb, u, str, new Boolean(z), str2, wuKongBizConfigData});
        } else if (!z) {
            interfaceC1257vb.a(false, str2, null);
        } else {
            String a2 = a(wuKongBizConfigData, u, str);
            if (!StringUtils.isEmpty(a2)) {
                interfaceC1257vb.a(false, a2, null);
            } else {
                this.s.a(i(), new InterfaceC1257vb() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$Pit8WUq8w72ZoAS7bYV7tWRnBBw
                    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1257vb
                    public final void a(boolean z2, String str3, Map map) {
                        Ta.a(InterfaceC1257vb.this, z2, str3, map);
                    }
                });
            }
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.o.a(Boolean.valueOf(z));
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            HashMap hashMap = new HashMap(1);
            hashMap.put("data", C1235o.a(str.getBytes()));
            hashMap.put("clientInfo", C1235o.a(JsonUtils.toJSONString(Aa.a(CcrcContextImpl.getContext())).getBytes()));
            hashMap.put(g, u());
            hashMap.put(h, this.l);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(i, 19997, str2, "", "", hashMap).build());
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.n.a(this.l);
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            b(str, c);
        }
    }

    public static /* synthetic */ void a(InterfaceC1257vb interfaceC1257vb, boolean z, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631be5c7", new Object[]{interfaceC1257vb, new Boolean(z), str, map});
        } else {
            interfaceC1257vb.a(z, str, map);
        }
    }

    private RiskSceneInfo a(BaseWuKongContentRiskPlugin baseWuKongContentRiskPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RiskSceneInfo) ipChange.ipc$dispatch("ebe20783", new Object[]{this, baseWuKongContentRiskPlugin});
        }
        List<RiskSceneInfo> list = this.v.sceneList;
        if (list == null) {
            return null;
        }
        for (RiskSceneInfo riskSceneInfo : list) {
            if (riskSceneInfo.isPlugin && StringUtils.equals(riskSceneInfo.sceneName, baseWuKongContentRiskPlugin.name())) {
                Logging.d(f3276a, String.format("plugin %s isInConfig", baseWuKongContentRiskPlugin.name()));
                return riskSceneInfo;
            }
        }
        Logging.w(f3276a, String.format("plugin %s is not inConfig", baseWuKongContentRiskPlugin.name()));
        return null;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.n.c();
    }

    private String a(WuKongBizConfigData wuKongBizConfigData, U u, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42e455d9", new Object[]{this, wuKongBizConfigData, u, str});
        }
        this.v = wuKongBizConfigData.eventConf;
        if (!a(this.v.event, str, false)) {
            StringBuilder a2 = Yb.a("event register fail ");
            a2.append(this.v.event);
            return a2.toString();
        }
        return a(u);
    }

    private String a(U u) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("743263b1", new Object[]{this, u});
        }
        if (!this.v.isHaveCppAlgo()) {
            return null;
        }
        this.x.a(CcrcContextImpl.getContext());
        Iterator<BaseWuKongContentRiskPlugin> it = u.a().iterator();
        while (it.hasNext()) {
            BaseWuKongContentRiskPlugin next = it.next();
            RiskSceneInfo a2 = a(next);
            if (a2 == null) {
                it.remove();
            } else {
                List<Algo> list = a2.algoList;
                if (list != null && !list.isEmpty()) {
                    for (Algo algo : list) {
                        if (!StringUtils.isEmpty(algo.code) && !next.inputConfig(this.l, e(algo.code))) {
                            StringBuilder a3 = Yb.a("dispatchConf fail by input conf fail, ");
                            a3.append(next.name());
                            return a3.toString();
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{this, str, str2, new Boolean(z)})).booleanValue() : b(str, str2, z);
    }

    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            a(d(), new InferContext(this.l, str, this.u, this.v.bizId, str2, map));
        }
    }

    private void a(String str, InferContext inferContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9255d94", new Object[]{this, str, inferContext});
        } else if (StringUtils.isEmpty(str)) {
            Logging.e(f3276a, "doProcessData fail because rule id is null");
        } else {
            SampleData sampleData = inferContext.getSampleData();
            if (sampleData != null) {
                inferContext.metaId = sampleData.metaId;
                inferContext.getCcrcResults().putAll(sampleData.inputEngineParams());
                this.m.a(inferContext.sceneName, inferContext.getMetaId(), sampleData);
                inferContext.removeSample();
            }
            long currentTimeMillis = System.currentTimeMillis();
            final EvalResult a2 = WuKongNativeManager.a().a(str, inferContext);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder a3 = Yb.a("nativeWuKongProcess cost -->>> engine infer hit result: ");
            a3.append(a2.hit);
            a3.append(" engine infer cost time:");
            a3.append(currentTimeMillis2);
            Logging.d(f3276a, a3.toString());
            a(inferContext, a2, currentTimeMillis2, u());
            if (!a2.hit) {
                WuKongEventConfigData e2 = e();
                if (e2 != null) {
                    Pb pb = new Pb();
                    pb.b = inferContext.pid;
                    pb.f3268a = inferContext.ccrcCode;
                    pb.c = inferContext.sgBizId;
                    pb.f = inferContext.wukong_uuid;
                    pb.h = inferContext.metaId;
                    pb.g = inferContext.getSampleID();
                    this.x.a(pb, e2.notHitRiskData);
                }
                P p = this.y;
                if (p != null) {
                    p.a(this.w, sampleData, W.a(sampleData, false, null, inferContext.getAlgoResults()));
                    this.y.a(this.w, sampleData);
                }
                this.m.b(inferContext.sceneName, inferContext.getMetaId());
            }
            this.A.submit(new Runnable() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$Ta$n2o1BAt3v7Y8hOrjACInA1wnOKE
                @Override // java.lang.Runnable
                public final void run() {
                    Ta.lambda$n2o1BAt3v7Y8hOrjACInA1wnOKE(Ta.this, a2);
                }
            });
            if (this.r.hasMessages(1)) {
                return;
            }
            v();
        }
    }

    public /* synthetic */ void a(EvalResult evalResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c34006", new Object[]{this, evalResult});
        } else {
            f(evalResult.traceInfo);
        }
    }

    private synchronized void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8afc0a82", new Object[]{this, aVar});
            return;
        }
        r();
        WuKongNativeManager.a().a(CcrcContextImpl.getContext(), u(), this.l, aVar);
    }

    public static /* synthetic */ void a(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a078fc", new Object[]{str, str2, new Boolean(z), new Boolean(z2)});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(str).setCcrcCode(str2).setPhase("init").setOperation(Ba.a.d);
        if (!z) {
            i2 = -1;
        }
        TrackManager.track(operation.setStatus(i2).addParam("forceUpdate", Boolean.valueOf(z2)).build());
    }

    private void a(final String str, final boolean z, final String str2, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25c9628", new Object[]{this, str, new Boolean(z), str2, new Boolean(z2)});
        } else if (z) {
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$CvpmCtQCrmWCaJmF10VpMYuzhk0
                @Override // java.lang.Runnable
                public final void run() {
                    Ta.a(str2, str, z, z2);
                }
            });
        }
    }

    public /* synthetic */ void a(String str, InferContext inferContext, EvalResult evalResult, long j2) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45e19aa", new Object[]{this, str, inferContext, evalResult, new Long(j2)});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(str).setCcrcCode(this.l).setMetaId(inferContext.getMetaId()).setSampleId(inferContext.getSampleID()).setPhase("detect").setOperation(Ba.a.e);
        if (!evalResult.success()) {
            i2 = -1;
        }
        TrackManager.track(operation.setStatus(i2).addParam("errorMsg", evalResult.errorMsg).addParam("isHit", Boolean.valueOf(evalResult.hit)).addParam("costTime", Long.valueOf(j2)).build());
    }

    private void a(final InferContext inferContext, final EvalResult evalResult, final long j2, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4deea3fe", new Object[]{this, inferContext, evalResult, new Long(j2), str});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$Ta$LO3mLVGszAjYiNKGsqxfdRgLBss
                @Override // java.lang.Runnable
                public final void run() {
                    Ta.lambda$LO3mLVGszAjYiNKGsqxfdRgLBss(Ta.this, str, inferContext, evalResult, j2);
                }
            });
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        WuKongEventConfigData wuKongEventConfigData = this.v;
        if (wuKongEventConfigData == null) {
            return null;
        }
        return wuKongEventConfigData.versionInfo;
    }

    public void a(CCRCRiskSample cCRCRiskSample, CcrcService.Config config, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f6a750", new Object[]{this, cCRCRiskSample, config, new Boolean(z)});
        } else {
            this.s.a(cCRCRiskSample, config, z);
        }
    }

    public void a(F f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4213973e", new Object[]{this, f2});
        } else {
            this.s.a(f2);
        }
    }

    public void a(InterfaceC1260wb interfaceC1260wb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323c921", new Object[]{this, interfaceC1260wb});
            return;
        }
        this.x = interfaceC1260wb;
        this.s.a(interfaceC1260wb);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.p.b(str);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.p.a(z);
        }
    }

    public void a(G g2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42140b9d", new Object[]{this, g2});
        } else {
            this.s.a(g2);
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.p.a(map);
        }
    }

    public void a(P p) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421822f4", new Object[]{this, p});
        } else {
            this.y = p;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        EventResultData eventResultData = new EventResultData(this.l);
        eventResultData.pId = u();
        HashMap hashMap = new HashMap();
        hashMap.put("trace", str);
        hashMap.put(c, str2);
        eventResultData.eventData = JsonUtils.toJSONString(hashMap);
        eventResultData.ts = System.currentTimeMillis();
        t().a(eventResultData, null);
    }
}
