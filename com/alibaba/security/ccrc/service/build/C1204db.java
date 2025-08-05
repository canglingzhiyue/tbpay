package com.alibaba.security.ccrc.service.build;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.behavior.sample.BehaviorRiskSample;
import com.alibaba.security.wukong.bx.BxConf;
import com.alibaba.security.wukong.bx.algo.BxData;
import com.alibaba.security.wukong.config.Algo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.alibaba.security.ccrc.service.build.db  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1204db {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3298a = "BehaviorDataPreManager";
    public static final String b = "ccrc_bx_seq";
    public final List<BxConf> c = new ArrayList();
    public M d;

    /* renamed from: com.alibaba.security.ccrc.service.build.db$a */
    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(serialize = false)

        /* renamed from: a  reason: collision with root package name */
        public String f3299a;
        @JSONField(serialize = false)
        public Map<String, Object> b;

        public a() {
        }

        public Map<String, Object> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
            }
            Map<String, Object> map = JsonUtils.toMap(this);
            Map<String, Object> map2 = this.b;
            if (map2 != null && !map2.isEmpty()) {
                map.putAll(this.b);
            }
            return map;
        }

        public /* synthetic */ a(C1201cb c1201cb) {
        }
    }

    public void a(M m) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4216c5d7", new Object[]{this, m});
            return;
        }
        this.c.clear();
        this.d = m;
        List<Algo> h = m.h();
        if (h != null && !h.isEmpty()) {
            for (Algo algo : h) {
                BxConf bxConf = (BxConf) JsonUtils.parseObject(algo.getDsl(), (Class<Object>) BxConf.class);
                if (bxConf == null) {
                    String e = m.e();
                    String ccrcCode = m.getCcrcCode();
                    StringBuilder a2 = Yb.a("bx conf parse fail: ");
                    a2.append(algo.getDsl());
                    a(e, ccrcCode, -1, a2.toString());
                } else {
                    this.c.add(bxConf);
                }
            }
            return;
        }
        a(m.e(), m.getCcrcCode(), -1, "behavior algo is empty");
    }

    private BehaviorRiskSample a(BxConf bxConf, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BehaviorRiskSample) ipChange.ipc$dispatch("4097fce4", new Object[]{this, bxConf, obj});
        }
        BxData.a parseByBroadcastFeature = obj != null ? BxData.parseByBroadcastFeature(JsonUtils.toJSONString(obj), bxConf.featureName) : null;
        if (parseByBroadcastFeature == null || !parseByBroadcastFeature.d) {
            parseByBroadcastFeature = BxData.parseByGetFeature(BUFS.getFeature(new BUFS.QueryArgs(), bxConf.invokeId, bxConf.bizId, b), bxConf.featureName);
        }
        if (!parseByBroadcastFeature.d) {
            String e = this.d.e();
            String ccrcCode = this.d.getCcrcCode();
            StringBuilder a2 = Yb.a("SeqResult parse fail: ");
            a2.append(parseByBroadcastFeature.c);
            a(e, ccrcCode, -1, a2.toString(), parseByBroadcastFeature.e);
            return null;
        }
        Map<String, Object> a3 = a(parseByBroadcastFeature).a();
        if (a3 != null && !a3.isEmpty()) {
            return new BehaviorRiskSample(String.format("BXS_%s", UUID.randomUUID().toString()), a3);
        }
        a(this.d.e(), this.d.getCcrcCode(), -1, "resultMap is null or empty", parseByBroadcastFeature.e);
        return null;
    }

    public List<BehaviorRiskSample> a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("18196f83", new Object[]{this, obj});
        }
        ArrayList arrayList = new ArrayList();
        if (this.c.isEmpty()) {
            a(this.d.e(), this.d.getCcrcCode(), -1, "bx configs is empty", null);
            return arrayList;
        }
        for (BxConf bxConf : this.c) {
            BehaviorRiskSample a2 = a(bxConf, obj);
            if (a2 == null) {
                a(this.d.e(), this.d.getCcrcCode(), -1, "sample is null", null);
            } else {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private a a(BxData.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c260268e", new Object[]{this, aVar});
        }
        a aVar2 = new a(null);
        aVar2.b = aVar.b;
        aVar2.f3299a = aVar.e;
        return aVar2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.clear();
        }
    }

    private void a(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608d2b11", new Object[]{this, str, str2, new Integer(i), str3});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(str).setCcrcCode(str2).setPhase("init").setOperation(Ba.a.p).setStatus(i).addParam("errorMsg", str3).build());
        }
    }

    public void a(String str, String str2, int i, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce129b", new Object[]{this, str, str2, new Integer(i), str3, str4});
            return;
        }
        if (C1238p.a(str4)) {
            str4 = "features over limit size";
        }
        TrackManager.track(TrackLog.newBuilder().setpId(str).setCcrcCode(str2).setPhase("detect").setOperation(Ba.a.p).setStatus(i).addParam("errorMsg", str3).addParam("bxData", str4).build());
    }
}
