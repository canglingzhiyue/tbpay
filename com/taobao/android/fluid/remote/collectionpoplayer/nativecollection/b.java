package com.taobao.android.fluid.remote.collectionpoplayer.nativecollection;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.hhy;
import tb.kge;
import tb.koy;
import tb.kpb;
import tb.obo;
import tb.oec;
import tb.ohd;
import tb.sii;
import tb.slk;
import tb.spz;

/* loaded from: classes5.dex */
public class b extends com.taobao.android.fluid.business.videocollection.poplayer.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HEADER = "header";
    public static final String POPLAYER_NAME = "Collection_PopLayer";
    public static final String TAG = "PopupDialog";

    /* renamed from: a  reason: collision with root package name */
    private PopupDialog f12686a;
    private koy b = new koy();

    static {
        kge.a(1841546939);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ PopupDialog a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupDialog) ipChange.ipc$dispatch("c592c428", new Object[]{bVar}) : bVar.f12686a;
    }

    public static boolean c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ed73ba0", new Object[]{fluidContext})).booleanValue();
        }
        if (!com.taobao.android.fluid.business.videocollection.poplayer.b.b()) {
            spz.c("PopupDialog", "Native Orange开关关闭");
            return false;
        }
        Uri fluidUrl = fluidContext.getInstanceConfig().getFluidUrl();
        if (fluidUrl == null || !TextUtils.equals(fluidUrl.getQueryParameter("type"), com.taobao.android.fluid.business.globalinteraction.render.a.GUANGGUANG_COLLECTION)) {
            spz.c("PopupDialog", "当前非二跳页");
            return false;
        }
        boolean c = com.taobao.android.fluid.business.videocollection.poplayer.b.c();
        if (!c) {
            spz.c("PopupDialog", c + "--NativePopABConfig");
            return false;
        }
        spz.c("PopupDialog", "位于native合集页面");
        return true;
    }

    public static boolean d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e60d5a1", new Object[]{fluidContext})).booleanValue();
        }
        if (!c(fluidContext)) {
            spz.c("PopupDialog", "Native浮层关闭");
            return false;
        }
        boolean h = com.taobao.android.fluid.business.videocollection.poplayer.b.h();
        if (!h) {
            spz.c("PopupDialog", h + "--isResizeCollectionVideoOrange");
            return false;
        }
        boolean g = com.taobao.android.fluid.business.videocollection.poplayer.b.g();
        if (!g) {
            spz.c("PopupDialog", g + "--isResizeCollectionVideoABConfig");
            return false;
        }
        spz.c("PopupDialog", "使用合集浮层联动功能");
        return true;
    }

    public void a(com.taobao.android.fluid.framework.data.datamodel.a aVar, FluidContext fluidContext, Context context) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d550cf2", new Object[]{this, aVar, fluidContext, context});
            return;
        }
        PopupDialog popupDialog = new PopupDialog();
        popupDialog.setFluidContext(fluidContext);
        popupDialog.setStartTime(SystemClock.uptimeMillis());
        JSONObject jSONObject2 = aVar.a().d;
        if (jSONObject2 != null && jSONObject2.get("transmitParams") != null && (jSONObject = jSONObject2.getJSONObject("transmitParams")) != null) {
            popupDialog.setTransmitParams(jSONObject);
            popupDialog.setTitle(jSONObject.getString("title"));
        }
        a(popupDialog, fluidContext);
        a(fluidContext, context);
    }

    public void a(FluidContext fluidContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("856c656e", new Object[]{this, fluidContext, context});
            return;
        }
        PopupDialog popupDialog = this.f12686a;
        if (popupDialog != null && popupDialog.isAdded()) {
            return;
        }
        FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        if (supportFragmentManager.isStateSaved()) {
            return;
        }
        this.f12686a.show(supportFragmentManager, POPLAYER_NAME);
    }

    public void a(final ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList, FluidContext fluidContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a863bd4", new Object[]{this, arrayList, fluidContext, context});
            return;
        }
        PopupDialog popupDialog = this.f12686a;
        if (popupDialog != null && popupDialog.isAdded()) {
            return;
        }
        if (this.f12686a != null && c(fluidContext)) {
            spz.c("PopupDialog", "打开了合集浮层; mPopupDialog=" + this.f12686a);
            a(fluidContext, context);
            oec.a(new Runnable() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList2 = new ArrayList<>();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.taobao.android.fluid.framework.data.datamodel.a aVar = (com.taobao.android.fluid.framework.data.datamodel.a) it.next();
                        if (!obo.b(aVar)) {
                            arrayList2.add(aVar);
                        }
                    }
                    b.a(b.this).updateViewAfterDetail(arrayList2, true, null, false);
                }
            });
        } else if (c(fluidContext)) {
            final PopupDialog popupDialog2 = new PopupDialog();
            popupDialog2.setFluidContext(fluidContext);
            popupDialog2.setStartTime(SystemClock.uptimeMillis());
            Map<String, Object> map = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().ao.get("header");
            if (map != null) {
                Object obj = map.get(obo.BUSINESS_EXTRA_MAP);
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    List list = (List) map2.get(obo.RANGE_LIST);
                    if (map2.get("relationTitle") != null) {
                        popupDialog2.setRelatedTitle((String) map2.get("relationTitle"));
                    }
                    popupDialog2.setRangeList(list);
                }
                popupDialog2.setTitle((String) map.get("title"));
            }
            a(popupDialog2, fluidContext);
            a(fluidContext, context);
            oec.a(new Runnable() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList2 = new ArrayList<>();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.taobao.android.fluid.framework.data.datamodel.a aVar = (com.taobao.android.fluid.framework.data.datamodel.a) it.next();
                        if (!obo.b(aVar)) {
                            arrayList2.add(aVar);
                        }
                    }
                    popupDialog2.updateViewAfterDetail(arrayList2, true, null, false);
                }
            });
        } else {
            spz.c("PopupDialog", "MSG_OPENCOMPILATIONSPOP; mPopupDialog=" + this.f12686a + "浮层已加载");
        }
    }

    public void a(FluidContext fluidContext, ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList, slk.a aVar, boolean z) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d4603", new Object[]{this, fluidContext, arrayList, aVar, new Boolean(z)});
        } else if (this.f12686a == null || !c(fluidContext)) {
        } else {
            if (this.f12686a.getTransmitParams() != null) {
                i = oec.a(this.f12686a.getTransmitParams().get("total"), 0);
            }
            if (arrayList.size() < 4 && i >= 4) {
                return;
            }
            if (this.f12686a.mIsLoading && (map = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().ao.get("header")) != null) {
                Object obj = map.get(obo.BUSINESS_EXTRA_MAP);
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    List list = (List) map2.get(obo.RANGE_LIST);
                    if (map2.get("relationTitle") != null) {
                        this.f12686a.setRelatedTitle((String) map2.get("relationTitle"));
                    }
                    this.f12686a.setRangeList(list);
                }
                this.f12686a.setTitle((String) map.get("title"));
            }
            this.f12686a.updateViewAfterDetail(arrayList, this.f12686a.mIsLoading, aVar, z);
        }
    }

    public boolean e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dea6fa2", new Object[]{this, fluidContext})).booleanValue();
        }
        PopupDialog popupDialog = this.f12686a;
        return popupDialog != null && popupDialog.isCurrentlyShowing();
    }

    public boolean f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8d7409a3", new Object[]{this, fluidContext})).booleanValue() : this.f12686a.mIsFirstLoad;
    }

    private void a(PopupDialog popupDialog, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc12451", new Object[]{this, popupDialog, fluidContext});
            return;
        }
        this.b.a(fluidContext, this.f12686a, popupDialog);
        this.f12686a = popupDialog;
    }

    public void a(FluidContext fluidContext, final hhy hhyVar, View view, final sii siiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f2eafe", new Object[]{this, fluidContext, hhyVar, view, siiVar});
        } else if (!d(fluidContext)) {
        } else {
            if (e(fluidContext) && f(fluidContext) && hhyVar != null) {
                view.post(new Runnable() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.b.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (hhyVar == null || b.a(b.this) == null || !b.a(b.this).isCurrentlyShowing()) {
                        } else {
                            int a2 = ohd.a();
                            hhyVar.a(r1, 0);
                            hhyVar.a(a2, r1, r1);
                            hhyVar.a(true);
                        }
                    }
                });
            }
            PopupDialog popupDialog = this.f12686a;
            if (popupDialog != null) {
                popupDialog.setPopVideoSizeAdjustHandler(hhyVar);
                this.f12686a.setCollectionPopLayerAnimateListener(siiVar);
                return;
            }
            this.b.a(new kpb() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kpb
                public void a(FluidContext fluidContext2, PopupDialog popupDialog2, PopupDialog popupDialog3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("94bc7fa", new Object[]{this, fluidContext2, popupDialog2, popupDialog3});
                    } else {
                        popupDialog3.setCollectionPopLayerAnimateListener(siiVar);
                    }
                }
            });
        }
    }
}
