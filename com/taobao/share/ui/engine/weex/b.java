package com.taobao.share.ui.engine.weex;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.vessel.VesselView;
import com.ut.share.business.ShareBusiness;
import java.util.Map;
import tb.kge;
import tb.nyy;
import tb.rgu;
import tb.rgy;

/* loaded from: classes8.dex */
public class b implements rgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WebMaskView f19685a;
    private InterfaceC0815b b;
    private String c;

    /* loaded from: classes8.dex */
    public interface a {
        void a();
    }

    /* renamed from: com.taobao.share.ui.engine.weex.b$b  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0815b {
        a getDowngradeListener();
    }

    static {
        kge.a(436306069);
        kge.a(625213565);
    }

    public static /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22b18b50", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ InterfaceC0815b b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0815b) ipChange.ipc$dispatch("17642419", new Object[]{bVar}) : bVar.b;
    }

    public b(InterfaceC0815b interfaceC0815b, WebMaskView webMaskView, String str) {
        this.b = interfaceC0815b;
        this.f19685a = webMaskView;
        this.c = str;
    }

    @Override // tb.rgu
    public void onLoadStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f829aa04", new Object[]{this});
        } else {
            ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_RENDER_START_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // tb.rgu
    public void onLoadFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            return;
        }
        ShareBusiness.sShareUTArgs.put(ShareBusiness.WEEX_RENDER_END_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
        com.taobao.share.ui.engine.jsbridge.a.a().b();
        nyy.c("TIMECOST", "weex_render_end: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
        WebMaskView webMaskView = this.f19685a;
        if (webMaskView == null) {
            return;
        }
        webMaskView.finish();
        this.f19685a.getVesselView().removeView(this.f19685a);
    }

    @Override // tb.rgu
    public void onLoadError(rgy rgyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
            return;
        }
        nyy.c("WeexSharePanel", "onLoadError");
        WebMaskView webMaskView = this.f19685a;
        if (webMaskView == null) {
            return;
        }
        final VesselView vesselView = webMaskView.getVesselView();
        vesselView.post(new Runnable() { // from class: com.taobao.share.ui.engine.weex.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                vesselView.removeAllViews();
                WebMaskView webMaskView2 = new WebMaskView(vesselView, b.a(b.this));
                vesselView.setOnLoadListener(new b(b.b(b.this), webMaskView2, b.a(b.this)));
                webMaskView2.setErrorTextVisible(true);
            }
        });
    }

    @Override // tb.rgu
    public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("errorMsg=");
        String str = "";
        sb.append(rgyVar != null ? rgyVar.b : str);
        sb.append(",map=");
        sb.append(map);
        strArr[0] = sb.toString();
        TBS.Ext.commitEvent("Page_Share", 19999, "WeexPanelDowngrade", null, null, strArr);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDowngrade:");
        if (rgyVar != null) {
            str = rgyVar.b;
        }
        sb2.append(str);
        nyy.c("WeexSharePanel", sb2.toString());
        try {
            if (this.b == null || this.b.getDowngradeListener() == null) {
                return;
            }
            this.b.getDowngradeListener().a();
        } catch (Throwable th) {
            th.printStackTrace();
            nyy.c("WeexSharePanel", "onDowngrade err:" + th.getMessage());
        }
    }
}
