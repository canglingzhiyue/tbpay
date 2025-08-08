package com.taobao.tbpoplayer.adapter;

import mtopsdk.common.util.StringUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.norm.INewConfigAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.info.CdnConfigModel;
import com.taobao.tbpoplayer.info.c;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes8.dex */
public class i implements INewConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private com.taobao.tbpoplayer.info.c f22206a;

    static {
        kge.a(23530377);
        kge.a(1326248657);
    }

    /* renamed from: lambda$jsLAXrPCzg7AwA-ibJsWwa79ss8 */
    public static /* synthetic */ void m1441lambda$jsLAXrPCzg7AwAibJsWwa79ss8(i iVar, com.alibaba.poplayer.config.fetch.a aVar) {
        iVar.a(aVar);
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.f22206a = new com.taobao.tbpoplayer.info.c();
        }
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public void startFetchConfig(final com.alibaba.poplayer.config.fetch.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abbe5d3", new Object[]{this, aVar});
        } else {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.taobao.tbpoplayer.adapter.-$$Lambda$i$jsLAXrPCzg7AwA-ibJsWwa79ss8
                @Override // java.lang.Runnable
                public final void run() {
                    i.m1441lambda$jsLAXrPCzg7AwAibJsWwa79ss8(i.this, aVar);
                }
            });
        }
    }

    public /* synthetic */ void a(com.alibaba.poplayer.config.fetch.a aVar) {
        c.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f04fe2c", new Object[]{this, aVar});
            return;
        }
        try {
            String a3 = a();
            Response syncSend = new DegradableNetwork(PopLayer.getReference().getApp()).syncSend(new RequestImpl(a3), null);
            if (syncSend == null) {
                aVar.onConfigFetched(false, "", null, null);
            } else if (syncSend.getStatusCode() < 0) {
                aVar.onConfigFetched(false, "", null, null);
            } else {
                String str = new String(syncSend.getBytedata(), "UTF-8");
                com.alibaba.poplayer.utils.c.a("TBNewConfigAdapter.fetchConfig.dataString=%s", str);
                CdnConfigModel cdnConfigModel = (CdnConfigModel) JSONObject.parseObject(str, CdnConfigModel.class);
                if (cdnConfigModel != null && cdnConfigModel.isValid() && (a2 = this.f22206a.a(a3, cdnConfigModel)) != null) {
                    aVar.onConfigFetched(true, a2.f22219a, a2.b, a2.c);
                } else {
                    aVar.onConfigFetched(false, "", null, null);
                }
            }
        } catch (Throwable th) {
            aVar.onConfigFetched(false, "", null, null);
            com.alibaba.poplayer.utils.c.a("TBNewConfigAdapter.startFetchConfig.error", th);
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String F = com.taobao.tbpoplayer.info.a.a().F();
        return StringUtils.isEmpty(F) ? "https://poplayer.template.alibaba.com/popcdn/1/config.json" : F;
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public String getCurConfigVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9a14762d", new Object[]{this}) : this.f22206a.a();
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public String getConfigItemById(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22f8c3b2", new Object[]{this, str}) : this.f22206a.a(str);
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public Set<String> getConfigsIdSet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("74182602", new Object[]{this}) : this.f22206a.c();
    }

    @Override // com.alibaba.poplayer.norm.INewConfigAdapter
    public Map<String, Set<String>> getUriConfigsMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b40cd3d", new Object[]{this});
        }
        String b = this.f22206a.b();
        com.alibaba.poplayer.utils.c.c("configUpdate", "", "getUriConfigsMap" + b);
        try {
            return (Map) JSON.parseObject(b, new TypeReference<Map<String, Set<String>>>() { // from class: com.taobao.tbpoplayer.adapter.i.1
                {
                    i.this = this;
                }
            }, new Feature[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TBNewConfigAdapter.getUriConfigsMap.error", th);
            return null;
        }
    }
}
