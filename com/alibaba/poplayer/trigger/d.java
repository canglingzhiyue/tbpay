package com.alibaba.poplayer.trigger;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.alibaba.poplayer.config.model.predeal.PreDealCustomEventParams;
import com.alibaba.poplayer.config.model.predeal.PreDealIndexContent;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.interact.pop.BootImagePopMamaCommercialView;
import java.util.Map;
import tb.bzl;
import tb.kge;

/* loaded from: classes3.dex */
public class d extends PopRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String d;
    private BaseConfigItem e;
    private Event f;
    private boolean g;

    static {
        kge.a(-476262348);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == -29645652) {
            return super.m();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public d(Event event, BaseConfigItem baseConfigItem, Activity activity, PopRequest.b bVar) {
        super(baseConfigItem.layerType, activity, event.attachKeyCode, bVar, a(event, baseConfigItem), baseConfigItem.enqueue, baseConfigItem.forcePopRespectingPriority, baseConfigItem.exclusive);
        this.g = false;
        this.f = event;
        this.e = baseConfigItem;
        this.d = baseConfigItem.indexID;
        this.b.a(baseConfigItem, event, this.c);
        b();
        if (I()) {
            this.n = event.getAugeCode();
            this.o = event.getUcpBackFlowTrackInfo();
        }
        if (event.source == 4) {
            OnePopModule t = t();
            PreDealCustomEventParams preDealCustomEventParams = event.getPreDealCustomEventParams();
            t.Y = preDealCustomEventParams.getTraceId();
            preDealCustomEventParams.syncModuleByIndexId(baseConfigItem.indexID, t);
            long preDealCostTime = preDealCustomEventParams.getPreDealCostTime();
            if (preDealCostTime > 0) {
                t.M = String.valueOf(preDealCostTime);
            }
            long generateSdkWaitTime = preDealCustomEventParams.generateSdkWaitTime();
            if (generateSdkWaitTime <= 0) {
                return;
            }
            t.P = String.valueOf(generateSdkWaitTime);
        }
    }

    public d(Event event, String str, Activity activity, PopRequest.b bVar) {
        super("", activity, event.attachKeyCode, bVar, 0, false, false, false);
        this.g = false;
        this.f = event;
        this.e = null;
        this.d = str;
        this.g = true;
        this.b.a(null, event, this.c);
        b();
        if (I()) {
            a(event.getUcpBackFlowTrackInfo());
        }
        if (event.source == 4) {
            OnePopModule t = t();
            PreDealCustomEventParams preDealCustomEventParams = event.getPreDealCustomEventParams();
            t.Y = preDealCustomEventParams.getTraceId();
            preDealCustomEventParams.syncModuleByIndexId(str, t);
            long preDealCostTime = preDealCustomEventParams.getPreDealCostTime();
            if (preDealCostTime > 0) {
                t.M = String.valueOf(preDealCostTime);
            }
            long generateSdkWaitTime = preDealCustomEventParams.generateSdkWaitTime();
            if (generateSdkWaitTime <= 0) {
                return;
            }
            t.P = String.valueOf(generateSdkWaitTime);
        }
    }

    public BaseConfigItem x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseConfigItem) ipChange.ipc$dispatch("392b0a85", new Object[]{this}) : this.e;
    }

    public Event y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Event) ipChange.ipc$dispatch("a0685310", new Object[]{this}) : this.f;
    }

    public String z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d3061ebf", new Object[]{this}) : this.d;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.g;
    }

    private static int a(Event event, BaseConfigItem baseConfigItem) {
        Map<String, PreDealIndexContent> indexMap;
        PreDealIndexContent preDealIndexContent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("707e7527", new Object[]{event, baseConfigItem})).intValue();
        }
        if (event.source == 4 && event.getPreDealCustomEventParams().isValid() && (indexMap = event.getPreDealCustomEventParams().getIndexMap()) != null && (preDealIndexContent = indexMap.get(baseConfigItem.indexID)) != null && !BootImagePopMamaCommercialView.VIEW_TYPE.equals(baseConfigItem.type)) {
            return preDealIndexContent.getPriority();
        }
        return baseConfigItem.priority;
    }

    public static String a(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b691cac", new Object[]{popRequest});
        }
        try {
            if (popRequest instanceof d) {
                d dVar = (d) popRequest;
                return dVar.e != null ? dVar.e.uuid : "";
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("getUUID error", th);
        }
        return "";
    }

    public static String b(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27d7190b", new Object[]{popRequest});
        }
        try {
            if (popRequest instanceof d) {
                d dVar = (d) popRequest;
                return dVar.e != null ? dVar.e.indexID : "";
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("getIndexId error", th);
        }
        return "";
    }

    public static BaseConfigItem c(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("28f574fc", new Object[]{popRequest});
        }
        try {
            if (!(popRequest instanceof d)) {
                return null;
            }
            return ((d) popRequest).e;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("getConfigFromRequest error", th);
            return null;
        }
    }

    public static Event d(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("b5a44879", new Object[]{popRequest});
        }
        try {
            if (!(popRequest instanceof d)) {
                return null;
            }
            return ((d) popRequest).y();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("getConfigFromRequest error", th);
            return null;
        }
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65c54bf7", new Object[]{this});
        }
        if (this.f.source == 4 && this.f.getPreDealCustomEventParams() != null) {
            return this.f.getPreDealCustomEventParams().getContentById(this.e.indexID);
        }
        return this.f.param;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        if (!D() && !E()) {
            return this.e.embed;
        }
        return false;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : C() && e() == PopRequest.Status.SHOWING;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean o() {
        BaseConfigItem baseConfigItem;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : (bzl.a().b() != null && bzl.a().b().isOpenImmersiveByDefault()) || (baseConfigItem = this.e) == null || baseConfigItem.enableFullScreenInImmersive;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        BaseConfigItem baseConfigItem = this.e;
        return baseConfigItem != null ? baseConfigItem.type : super.m();
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        BaseConfigItem baseConfigItem = this.e;
        return (baseConfigItem == null || baseConfigItem.styleConfigs == null || !this.e.styleConfigs.isValid()) ? false : true;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        BaseConfigItem baseConfigItem = this.e;
        return baseConfigItem != null && baseConfigItem.isAppMode() && this.e.keepConfigs != null && KeepModel.MODE_KEEP_LIVE.equals(this.e.keepConfigs.mode);
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : D() && e() == PopRequest.Status.SHOWING;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue();
        }
        BaseConfigItem baseConfigItem = this.e;
        return baseConfigItem != null && baseConfigItem.isAppMode() && this.e.keepConfigs != null && KeepModel.MODE_PAGE_LIVE.equals(this.e.keepConfigs.mode);
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : E() && e() == PopRequest.Status.SHOWING;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ce7abb1", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.n)) {
            return this.n;
        }
        BaseConfigItem baseConfigItem = this.e;
        if (baseConfigItem != null && !TextUtils.isEmpty(baseConfigItem.extra)) {
            try {
                this.n = JSON.parseObject(this.e.extra).getString("augeCode");
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("getAugeCode.error", th);
                this.n = "";
            }
        }
        return this.n;
    }

    @Override // com.alibaba.poplayer.layermanager.PopRequest
    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue();
        }
        Event event = this.f;
        return (event != null && event.source == 5) || !TextUtils.isEmpty(H());
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue();
        }
        Event event = this.f;
        return event != null && event.source == 3;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.F()) {
                return !TextUtils.isEmpty(this.e.uuid) && this.f.equals(dVar.f) && this.e.uuid.equals(dVar.e.uuid);
            } else if (!TextUtils.isEmpty(this.e.indexID)) {
                return this.f.equals(dVar.f) && this.e.indexID.equals(dVar.e.indexID);
            } else if (TextUtils.isEmpty(this.e.uuid)) {
                return super.equals(obj);
            } else {
                return this.f.equals(dVar.f) && this.e.uuid.equals(dVar.e.uuid);
            }
        }
        return super.equals(obj);
    }
}
