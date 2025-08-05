package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.config.WuKongBizConfigData;
import com.alibaba.security.wukong.config.WuKongConfigData;
import com.alibaba.security.wukong.config.WuKongConfigRequest;
import com.alibaba.security.wukong.config.WuKongEventConfigData;
import com.alibaba.security.wukong.plugin.BaseWuKongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public class Ra implements InterfaceC1194aa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3272a = "WuKongBizConfigManager";
    public static final String b = "eventConf";
    public final Ta c;
    public final String d;
    public final C1243qb e;
    public final String f;
    public String g;
    public InterfaceC1223k h;
    public U i;
    public Long j;

    public Ra(Ta ta) {
        this.c = ta;
        this.f = ta.l;
        this.d = ta.f();
        this.e = new C1243qb(this.c.l);
        Z.a().a(this.f, this);
    }

    private Context g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6d736e66", new Object[]{this}) : CcrcContextImpl.getContext();
    }

    public void b(InterfaceC1248sb interfaceC1248sb) {
        U u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275051e", new Object[]{this, interfaceC1248sb});
        } else if (!TextUtils.isEmpty(this.g) && !TextUtils.isEmpty(this.f) && (u = this.i) != null) {
            a(this.g, u, true, true, new Qa(this, interfaceC1248sb));
        } else if (interfaceC1248sb == null) {
        } else {
            interfaceC1248sb.a(false, "force update fail ,prepare has not called yet", null);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1240pb
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.e.c();
    }

    public synchronized InterfaceC1223k d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InterfaceC1223k) ipChange.ipc$dispatch("910ef3bc", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new C1220j(CcrcContextImpl.getContext());
        }
        return this.h;
    }

    public Long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("683d8929", new Object[]{this}) : this.j;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.e.f();
    }

    public static /* synthetic */ void a(Ra ra, Object obj, String str, String str2, InterfaceC1248sb interfaceC1248sb, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d1f592", new Object[]{ra, obj, str, str2, interfaceC1248sb, new Long(j), new Boolean(z)});
        } else {
            ra.a(obj, str, str2, interfaceC1248sb, j, z);
        }
    }

    public static /* synthetic */ void a(Ra ra, String str, String str2, boolean z, Object obj, String str3, long j, WuKongBizConfigData wuKongBizConfigData, boolean z2, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e91fc6", new Object[]{ra, str, str2, new Boolean(z), obj, str3, new Long(j), wuKongBizConfigData, new Boolean(z2), l});
        } else {
            ra.a(str, str2, z, obj, str3, j, wuKongBizConfigData, z2, l);
        }
    }

    public WuKongConfigRequest a(String str, U u) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WuKongConfigRequest) ipChange.ipc$dispatch("117dfaf5", new Object[]{this, str, u});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (BaseWuKongContentRiskPlugin baseWuKongContentRiskPlugin : u.a()) {
            String configType = baseWuKongContentRiskPlugin.configType();
            if (!TextUtils.isEmpty(configType)) {
                arrayList.add(configType);
            }
            Map<String, Object> configInfo = baseWuKongContentRiskPlugin.configInfo();
            if (configInfo != null) {
                arrayList2.add(configInfo);
            }
        }
        arrayList.add(b);
        WuKongConfigRequest wuKongConfigRequest = new WuKongConfigRequest(this.f);
        wuKongConfigRequest.confType = JsonUtils.toJSONString(arrayList);
        wuKongConfigRequest.pId = str;
        wuKongConfigRequest.ts = System.currentTimeMillis();
        wuKongConfigRequest.confInfo = JsonUtils.toJSONString(arrayList2);
        wuKongConfigRequest.clientSupDec = false;
        return wuKongConfigRequest;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1194aa
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c.a(str, this.g, true);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1240pb
    public WuKongBizConfigData b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WuKongBizConfigData) ipChange.ipc$dispatch("bc0884ff", new Object[]{this}) : this.e.b();
    }

    public void a(String str, U u, boolean z, InterfaceC1248sb interfaceC1248sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d12ce4", new Object[]{this, str, u, new Boolean(z), interfaceC1248sb});
        } else {
            a(str, u, false, z, interfaceC1248sb);
        }
    }

    public synchronized void a(String str, U u, boolean z, boolean z2, InterfaceC1248sb interfaceC1248sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b7d33a", new Object[]{this, str, u, new Boolean(z), new Boolean(z2), interfaceC1248sb});
            return;
        }
        this.g = str;
        this.i = u;
        if (this.e.e()) {
            this.e.d();
        }
        WuKongBizConfigData b2 = this.e.b();
        if (z || b2 == null) {
            if (!z2) {
                interfaceC1248sb.a(false, "disk cache not exist", null);
                return;
            } else {
                d().a(a(str, u), new Pa(this, System.currentTimeMillis(), str, interfaceC1248sb, z));
                return;
            }
        }
        this.j = Long.valueOf(System.currentTimeMillis());
        interfaceC1248sb.a(true, null, b2);
        this.e.a(b2.eventConf.versionInfo);
        this.e.g();
    }

    private Long a(boolean z, WuKongBizConfigData wuKongBizConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("43ac7977", new Object[]{this, new Boolean(z), wuKongBizConfigData});
        }
        if (!z) {
            return null;
        }
        try {
            if (e() != null) {
                return Long.valueOf(System.currentTimeMillis() - Math.max(e().longValue(), wuKongBizConfigData.eventConf.lastModifyTime));
            }
            return null;
        } catch (Throwable th) {
            Logging.e(f3272a, "getRuleRT fail", th);
            return null;
        }
    }

    private void a(String str, String str2, boolean z, Object obj, String str3, long j, WuKongBizConfigData wuKongBizConfigData, boolean z2, Long l) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44b009b", new Object[]{this, str, str2, new Boolean(z), obj, str3, new Long(j), wuKongBizConfigData, new Boolean(z2), l});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(str).setCcrcCode(str2).setPhase("init").setOperation(Ba.a.c);
        if (!z) {
            i = -1;
        }
        TrackLog.Builder tag = operation.setStatus(i).setTag("MTOP");
        if (z) {
            obj = null;
        } else if (!C1220j.a()) {
            obj = wuKongBizConfigData;
        }
        TrackManager.track(tag.addParam(InputFrame3.TYPE_RESPONSE, obj).addParam("errorMsg", str3).addParam("costTime", Long.valueOf(j)).addParam("forceUpdate", Boolean.valueOf(z2)).addParam("ruleRT", l).addParam("prepareID", this.d).build());
    }

    public WuKongBizConfigData a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WuKongBizConfigData) ipChange.ipc$dispatch("b465ac44", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        WuKongBizConfigData wuKongBizConfigData = ((WuKongConfigData) obj).content;
        if (wuKongBizConfigData != null) {
            return wuKongBizConfigData;
        }
        Logging.e(f3272a, "response content is empty");
        return null;
    }

    private synchronized void a(Object obj, String str, String str2, InterfaceC1248sb interfaceC1248sb, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af51115d", new Object[]{this, obj, str, str2, interfaceC1248sb, new Long(j), new Boolean(z)});
            return;
        }
        WuKongBizConfigData a2 = a(obj);
        Pair<Boolean, String> a3 = a(a2, str2);
        if (((Boolean) a3.first).booleanValue()) {
            this.e.a((WuKongConfigData) obj, a2);
        }
        if (((Boolean) a3.first).booleanValue()) {
            this.e.a(a2.eventConf.versionInfo);
        }
        interfaceC1248sb.a(((Boolean) a3.first).booleanValue(), (String) a3.second, a2);
        a(str, str2, ((Boolean) a3.first).booleanValue(), obj, (String) a3.second, j, a2, z, a(z, a2));
        if (((Boolean) a3.first).booleanValue()) {
            this.j = Long.valueOf(System.currentTimeMillis());
        }
    }

    private Pair<Boolean, String> a(WuKongBizConfigData wuKongBizConfigData, String str) {
        WuKongEventConfigData wuKongEventConfigData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f44c956e", new Object[]{this, wuKongBizConfigData, str});
        }
        if (wuKongBizConfigData != null && (wuKongEventConfigData = wuKongBizConfigData.eventConf) != null) {
            if (!wuKongEventConfigData.isValid(str)) {
                return new Pair<>(false, "event config data is invalid");
            }
            if (TextUtils.isEmpty(wuKongBizConfigData.eventConf.event)) {
                return new Pair<>(false, "rule is null");
            }
            return new Pair<>(true, "");
        }
        return new Pair<>(false, "biz config data is null");
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1194aa
    public void a(InterfaceC1248sb interfaceC1248sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb6b1d", new Object[]{this, interfaceC1248sb});
        } else {
            b(interfaceC1248sb);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1240pb
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e.a();
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1240pb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e.a(str);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1240pb
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.e.a(map);
        }
    }
}
