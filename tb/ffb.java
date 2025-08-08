package tb;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.aura.q;
import com.alibaba.android.ultron.vfw.web.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.standard.mainscreen.interaction.b;
import com.taobao.android.detail.wrapper.industry.maingallery.render.component.vessel.bridge.TBDetailPicGalleryBridge;
import com.taobao.orange.OrangeConfig;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.base.VesselBaseView;
import com.taobao.vessel.base.a;
import com.taobao.vessel.utils.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@AURAExtensionImpl(code = "tbdetail.impl.render.component.creator.weex")
/* loaded from: classes5.dex */
public final class ffb extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String j;
    private aqs f;
    private VesselView h;
    private final String d = "AliSDetailVesselComponentExtension#";
    private final List<String> e = new ArrayList();
    private ConcurrentHashMap<String, VesselView> i = new ConcurrentHashMap<>();
    private final List<ffc> g = new ArrayList();

    public static /* synthetic */ Object ipc$super(ffb ffbVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    public static /* synthetic */ q a(ffb ffbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("c4f227c9", new Object[]{ffbVar}) : ffbVar.c;
    }

    public static /* synthetic */ aqs b(ffb ffbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqs) ipChange.ipc$dispatch("fb31124c", new Object[]{ffbVar}) : ffbVar.f;
    }

    public static /* synthetic */ q c(ffb ffbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("732e0987", new Object[]{ffbVar}) : ffbVar.c;
    }

    public static /* synthetic */ q d(ffb ffbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("ca4bfa66", new Object[]{ffbVar}) : ffbVar.c;
    }

    public static /* synthetic */ q e(ffb ffbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("2169eb45", new Object[]{ffbVar}) : ffbVar.c;
    }

    static {
        kge.a(1805556101);
        j = OrangeConfig.getInstance().getConfig("aura_detail_android", "multipleWeexBugFixRollback", "false");
    }

    public ffb() {
        this.g.add(new ffe());
        this.g.add(new fff());
        this.g.add(new ffd());
        emu.a("com.taobao.android.detail.wrapper.industry.maingallery.render.component.vessel.TBDetailVesselComponentExtension");
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        android.taobao.windvane.jsbridge.q.a("NewPicGalleryBridge", (Class<? extends e>) TBDetailPicGalleryBridge.class);
        if (StringUtils.equals(j, "true")) {
            c();
        }
        final VesselView vesselView = new VesselView(viewGroup.getContext());
        vesselView.setVisibility(4);
        vesselView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        vesselView.setVesselViewCallback(new rgw() { // from class: tb.ffb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgw
            public void a(Map<String, Object> map, a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
                } else {
                    ema.a("weex#someWhereCallVesselViewCall", "有地方调用vessel的viewCall", ffb.a(ffb.this), ffb.b(ffb.this));
                }
            }
        });
        final String str = (aURARenderComponentContainer == null || aURARenderComponentContainer.name == null) ? "" : aURARenderComponentContainer.name;
        vesselView.setOnLoadListener(new rgu() { // from class: tb.ffb.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public boolean f27882a = false;

            @Override // tb.rgu
            public void onLoadStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f829aa04", new Object[]{this});
                    return;
                }
                this.f27882a = false;
                ard a2 = arc.a();
                a2.a("AliSDetailVesselComponentExtension#", "onLoadFinish", "开始渲染:" + str);
            }

            @Override // tb.rgu
            public void onLoadFinish(View view) {
                VesselView vesselView2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c38c0593", new Object[]{this, view});
                    return;
                }
                ard a2 = arc.a();
                a2.a("AliSDetailVesselComponentExtension#", "onLoadFinish", "渲染成功:" + str);
                if (!this.f27882a && (vesselView2 = vesselView) != null) {
                    vesselView2.setVisibility(0);
                    return;
                }
                ema.a("weex#loadFailedCannotShow", "有错误不显示,mIsError=" + this.f27882a + ",mVesselView=" + vesselView, ffb.c(ffb.this), ffb.b(ffb.this));
            }

            @Override // tb.rgu
            public void onLoadError(rgy rgyVar) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                    return;
                }
                this.f27882a = true;
                VesselView vesselView2 = vesselView;
                if (vesselView2 != null) {
                    vesselView2.setVisibility(4);
                }
                if (rgyVar != null) {
                    str2 = rgyVar.f33150a + "|" + rgyVar.b;
                } else {
                    str2 = "加载出错";
                }
                ema.a("weex#loadWeexError", str2, ffb.d(ffb.this), ffb.b(ffb.this));
                arc.a().a("AliSDetailVesselComponentExtension#", "onLoadError", "渲染失败:" + str);
            }

            @Override // tb.rgu
            public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                    return;
                }
                this.f27882a = true;
                VesselView vesselView2 = vesselView;
                if (vesselView2 != null) {
                    vesselView2.setVisibility(4);
                }
                if (rgyVar != null) {
                    str2 = "降级|" + rgyVar.f33150a + "|" + rgyVar.b;
                } else {
                    str2 = "降级了";
                }
                ema.a("weex#downgradeError", str2, ffb.e(ffb.this), ffb.b(ffb.this));
                arc.a().a("AliSDetailVesselComponentExtension#", "onDowngrade", "渲染降级:" + str);
            }
        });
        if (StringUtils.equals(j, "true")) {
            this.h = vesselView;
        } else if (aURARenderComponentContainer != null && !StringUtils.isEmpty(aURARenderComponentContainer.name)) {
            this.i.put(aURARenderComponentContainer.name, vesselView);
        }
        return vesselView;
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (!(view instanceof VesselView)) {
            ema.a("weex#rootViewNotVesselview", "根View不是VesselView", this.c, this.f);
        } else {
            boolean isAsync = aURARenderComponent.isAsync();
            String asyncStatus = aURARenderComponent.asyncStatus();
            ard a2 = arc.a();
            a2.a("AliSDetailVesselComponentExtension#", "renderView", "isAsyncComponent=" + isAsync + ",asyncStatus=" + asyncStatus);
            if (isAsync && !"success".equalsIgnoreCase(asyncStatus)) {
                ard a3 = arc.a();
                a3.a("AliSDetailVesselComponentExtension#", "renderView", "async component is not ready,key=" + aURARenderComponent.key + ",asyncStatus=" + asyncStatus);
                return;
            }
            VesselView vesselView = (VesselView) view;
            String a4 = a(aURARenderComponent, view.getContext());
            String a5 = a(a4, aURARenderComponent, vesselView);
            if (a5 == null) {
                ema.a("weex#invalidUrl", "生成finalUrl失败, finalUrl为null", this.c, this.f);
                return;
            }
            a(a4, aURARenderComponent);
            View childView = vesselView.getChildView();
            if (childView instanceof VesselBaseView) {
                ((VesselBaseView) childView).loadUrl(a5, null);
            } else {
                vesselView.loadUrl(a5);
            }
            a(emk.a(aURARenderComponent), vesselView);
        }
    }

    private void a(String str, final VesselView vesselView) {
        b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d4efc0", new Object[]{this, str, vesselView});
            return;
        }
        String a2 = b.a(this.c);
        if (StringUtils.isEmpty(a2) || StringUtils.isEmpty(str) || (b = b.b(a2)) == null) {
            return;
        }
        b.a(str, new com.taobao.android.detail.core.standard.mainscreen.interaction.a() { // from class: tb.ffb.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.standard.mainscreen.interaction.a
            public boolean a(String str2, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("20476517", new Object[]{this, str2, map})).booleanValue();
                }
                vesselView.fireEvent(str2, map);
                return true;
            }
        });
    }

    private String a(String str, AURARenderComponent aURARenderComponent, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42c9f198", new Object[]{this, str, aURARenderComponent, viewGroup});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            ema.a("weex#generateUrlError", c.LOAD_DATA_NULL, this.c, this.f);
            return null;
        }
        Map<String, Object> map = aURARenderComponentData.fields;
        if (bau.a(map)) {
            ema.a("weex#generateUrlError", "fields is null", this.c, this.f);
            return null;
        }
        Object obj = map.get("url");
        if (!(obj instanceof String)) {
            ema.a("weex#generateUrlError", "url字段不存在或者不是String类型,urlObj=" + obj, this.c, this.f);
            return null;
        }
        String str2 = (String) obj;
        try {
            Uri parse = Uri.parse(str2);
            boolean a2 = a(map);
            if (a2) {
                ard a3 = arc.a();
                a3.a("AliSDetailVesselComponentExtension#", "generateUrl", "useBridge=" + a2 + ",originUrl=" + str2);
                return str2;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            for (ffc ffcVar : this.g) {
                ffcVar.a(viewGroup, aURARenderComponent, hashMap);
            }
            hashMap.put(TBDetailPicGalleryBridge.TOKEN_KEY_VO_NAME, str);
            return eml.a(parse, hashMap).toString();
        } catch (Exception e) {
            ema.a("weex#generateUrlError", "parse originUrl" + str2 + " exception|" + e.getMessage(), this.c, this.f);
            return str2;
        }
    }

    private boolean a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        Object obj = map.get("params");
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        return Boolean.parseBoolean(((JSONObject) obj).getString(d.KEY_USE_BRIDGE));
    }

    private void a(String str, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341272c9", new Object[]{this, str, aURARenderComponent});
            return;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            ema.a("weex#RegisterParamsToBridgeError", c.LOAD_DATA_NULL, this.c, this.f);
            return;
        }
        Map<String, Object> map = aURARenderComponentData.fields;
        if (bau.a(map)) {
            ema.a("weex#RegisterParamsToBridgeError", "fields is null", this.c, this.f);
        } else {
            TBDetailPicGalleryBridge.registerParams(str, (JSONObject) bbc.a(map, "params", JSONObject.class, null));
        }
    }

    private String a(AURARenderComponent aURARenderComponent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2dd1deb", new Object[]{this, aURARenderComponent, context});
        }
        String str = aURARenderComponent.key + a(context);
        if (!this.e.contains(str)) {
            this.e.add(str);
        }
        return str;
    }

    private String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        if (!(context instanceof DetailCoreActivity)) {
            ema.a("weex#NotDetailcoreactivityCannotGetItemId", "context type error, must be DetailCoreActivity", this.c, this.f);
            return "";
        }
        ebx ebxVar = ((DetailCoreActivity) context).f9411a;
        if (ebxVar != null) {
            return ebxVar.f27180a == null ? "" : ebxVar.f27180a;
        }
        ema.a("weex#queryparamsIsNull", "queryParams is null", this.c, this.f);
        return "";
    }

    @Override // tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.f = aqsVar;
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : a.b.g;
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData.container;
        if (aURARenderComponentContainer == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        return aURARenderComponent.key + aURARenderComponentContainer.name + aURARenderComponentContainer.version;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (StringUtils.equals(j, "true")) {
            VesselView vesselView = this.h;
            if (vesselView == null) {
                return;
            }
            vesselView.onDestroy();
        } else {
            for (VesselView vesselView2 : this.i.values()) {
                if (vesselView2 != null) {
                    vesselView2.onDestroy();
                }
            }
            this.i.clear();
        }
    }

    @Override // tb.atl, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        for (String str : this.e) {
            TBDetailPicGalleryBridge.removeBridgeData(str);
        }
        this.e.clear();
        c();
    }
}
