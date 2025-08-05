package com.alibaba.android.ultron.vfw.web;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.VesselView;
import java.util.Map;
import tb.kge;
import tb.rgu;
import tb.rgy;

/* loaded from: classes2.dex */
public class c implements rgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WebMaskView f2748a;
    private String b;
    private String c;

    static {
        kge.a(1556481265);
        kge.a(625213565);
    }

    @Override // tb.rgu
    public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
        }
    }

    public static /* synthetic */ String a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d3413c2f", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ String b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d945078e", new Object[]{cVar}) : cVar.c;
    }

    public c(WebMaskView webMaskView, String str, String str2) {
        this.f2748a = webMaskView;
        this.b = str;
        this.c = str2;
    }

    @Override // tb.rgu
    public void onLoadStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f829aa04", new Object[]{this});
            return;
        }
        WebMaskView webMaskView = this.f2748a;
        if (webMaskView == null) {
            return;
        }
        webMaskView.bringToFront();
        this.f2748a.startLoading();
    }

    @Override // tb.rgu
    public void onLoadFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            return;
        }
        WebMaskView webMaskView = this.f2748a;
        if (webMaskView == null) {
            return;
        }
        webMaskView.finish();
        this.f2748a.getVesselView().removeView(this.f2748a);
    }

    @Override // tb.rgu
    public void onLoadError(rgy rgyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
            return;
        }
        WebMaskView webMaskView = this.f2748a;
        if (webMaskView == null) {
            return;
        }
        final VesselView vesselView = webMaskView.getVesselView();
        vesselView.post(new Runnable() { // from class: com.alibaba.android.ultron.vfw.web.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                vesselView.removeAllViews();
                WebMaskView webMaskView2 = new WebMaskView(vesselView, c.a(c.this));
                vesselView.setOnLoadListener(new c(webMaskView2, c.a(c.this), c.b(c.this)));
                webMaskView2.setErrorTextVisible(true);
            }
        });
    }
}
