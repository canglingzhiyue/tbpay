package com.taobao.update.datasource.mtop;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.datasource.mtop.b;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.rfq;
import tb.rfx;
import tb.rgb;
import tb.rge;
import tb.rgf;
import tb.rgj;

/* loaded from: classes9.dex */
public class a implements rfq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEGRADE = "degrade";

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.update.datasource.mtop.b f23378a;
    private InterfaceC1006a c;
    private b d;
    private List<rgb> b = new ArrayList();
    private rge e = rgf.getLog(a.class, (rge) null);

    /* renamed from: com.taobao.update.datasource.mtop.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public interface InterfaceC1006a {
        void onDegrade();
    }

    /* loaded from: classes9.dex */
    public interface b {
        void hasUpdate(String str);

        void noUpdate();
    }

    static {
        kge.a(108414385);
        kge.a(-217468681);
    }

    public a(Application application, String str, String str2, boolean z) {
        this.f23378a = b.a.newBuilder(application).setTtid(str).setGroup(str2).setOutApk(z).setFrom(from()).build();
    }

    public a setDegradeListener(InterfaceC1006a interfaceC1006a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cd7af104", new Object[]{this, interfaceC1006a});
        }
        this.c = interfaceC1006a;
        return this;
    }

    public a setMtopDataListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("583bdf03", new Object[]{this, bVar});
        }
        this.d = bVar;
        return this;
    }

    public void startUpdate(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5102cd2", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.e.e("UpdateSDK use old mtop update");
        System.setProperty("update_patch", "send UpdateRequest");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject queryUpdateInfo = this.f23378a.queryUpdateInfo(z);
        if (queryUpdateInfo != null && queryUpdateInfo.containsKey("hasUpdate") && queryUpdateInfo.getBooleanValue("hasUpdate")) {
            rgj.stat(true, "request", System.currentTimeMillis() - currentTimeMillis, 0, "", 0L);
            rge rgeVar = this.e;
            rgeVar.e("dispatch mtop response:" + queryUpdateInfo.toJSONString());
            System.setProperty("update_patch", "pulled data:" + queryUpdateInfo.toJSONString());
            b bVar = this.d;
            if (bVar != null) {
                bVar.hasUpdate(queryUpdateInfo.toJSONString());
            }
            dispatchUpdate(from(), z, queryUpdateInfo.toJSONString(), new String[0]);
        } else if (queryUpdateInfo != null && queryUpdateInfo.containsKey("degrade")) {
            InterfaceC1006a interfaceC1006a = this.c;
            if (interfaceC1006a == null) {
                return;
            }
            interfaceC1006a.onDegrade();
        } else {
            b bVar2 = this.d;
            if (bVar2 == null) {
                return;
            }
            bVar2.noUpdate();
        }
    }

    @Override // tb.rfq
    public void registerDataListener(rgb rgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a34b4b", new Object[]{this, rgbVar});
            return;
        }
        synchronized (this.b) {
            this.b.add(rgbVar);
        }
    }

    @Override // tb.rfq
    public void unRegisterDataListener(rgb rgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23d2ba04", new Object[]{this, rgbVar});
            return;
        }
        synchronized (this.b) {
            this.b.remove(rgbVar);
        }
    }

    @Override // tb.rfq
    public String from() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dad658f", new Object[]{this}) : rfx.MTOP_SOURCE;
    }

    @Override // tb.rfq
    public void dispatchUpdate(String str, boolean z, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6221f5", new Object[]{this, str, new Boolean(z), str2, strArr});
            return;
        }
        for (rgb rgbVar : new ArrayList(this.b)) {
            rgbVar.onUpdate(str, null, z, str2, strArr);
        }
    }
}
