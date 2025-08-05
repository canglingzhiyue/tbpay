package com.taobao.android.detail.core.standard.video;

import android.app.Activity;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryLightOffVideoComponent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.aqs;
import tb.arc;
import tb.ekk;
import tb.ekl;
import tb.emg;
import tb.emu;
import tb.eps;
import tb.iyx;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.locator.connector.receiver.video")
/* loaded from: classes4.dex */
public final class i implements ekl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f9876a;
    private d b;
    private com.taobao.android.detail.core.standard.lightoff.a c;

    static {
        kge.a(1109918875);
        kge.a(-1823923563);
    }

    @Override // tb.ekl
    public String F_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec7b57c0", new Object[]{this});
        }
        return null;
    }

    @Override // tb.eki
    public void b(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d586e2b4", new Object[]{this, ekkVar});
        }
    }

    @Override // tb.eki
    public void c(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c409e935", new Object[]{this, ekkVar});
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public i() {
        emu.a("com.taobao.android.detail.core.standard.video.PicGalleryVideoLocatorExtension");
    }

    @Override // tb.arl
    public void onCreate(q qVar, com.alibaba.android.aura.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        Object obj = qVar.a().get("AliDetailPicGalleryVideoManager");
        if (obj instanceof d) {
            this.b = (d) obj;
        }
        Object obj2 = qVar.a().get("AliDetailPicGalleryLightOffManager");
        if (obj2 instanceof com.taobao.android.detail.core.standard.lightoff.a) {
            this.c = (com.taobao.android.detail.core.standard.lightoff.a) obj2;
        }
        if (!(qVar.e() instanceof DetailCoreActivity)) {
            return;
        }
        this.f9876a = (DetailCoreActivity) qVar.e();
    }

    @Override // tb.eki
    public void a(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e703dc33", new Object[]{this, ekkVar});
            return;
        }
        AURARenderComponent aURARenderComponent = null;
        List<AURARenderComponent> h = ekkVar.h();
        if (h.isEmpty()) {
            arc.a().c("PicGalleryVideoLocatorExtension", "onFrameComponentShownWhenIdle", "frameComponents is empty");
        } else {
            Iterator<AURARenderComponent> it = h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AURARenderComponent next = it.next();
                if (emg.a(next)) {
                    aURARenderComponent = next;
                    break;
                }
            }
        }
        if (emg.b(ekkVar)) {
            c(aURARenderComponent);
        }
        a(aURARenderComponent);
        b();
        d();
        if (!emg.b(ekkVar)) {
            return;
        }
        b(aURARenderComponent);
    }

    private void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        } else if (this.b == null) {
        } else {
            this.b.b(this.b.a(n.a(aURARenderComponent)));
        }
    }

    private void b() {
        AbsPicGalleryVideoPlayer g;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if ((this.b == null && this.c == null) || (g = this.b.g()) == null) {
        } else {
            Boolean bool = (Boolean) g.a(PicGalleryLightOffVideoComponent.KEY_LAST_VIDEO_FROM_MINI_WINDOW);
            if (bool != null && bool.booleanValue()) {
                com.taobao.android.detail.core.utils.i.a("PicGalleryVideoLocatorExtension", "lastFromMiniWindow, donot autoplay in PicGallery");
                return;
            }
            HashMap hashMap = new HashMap();
            int c = c();
            if (c == 0) {
                if (this.b.h() && !this.c.c()) {
                    com.taobao.android.detail.core.performance.h.a(this.f9876a).a();
                    g.a();
                    z = true;
                }
            } else if (c == 1 && !this.c.c()) {
                com.taobao.android.detail.core.performance.h.a(this.f9876a).a();
                g.a();
                z = true;
            }
            hashMap.put("video_auto_play", String.valueOf(z));
            eps.a((Activity) this.f9876a, (String) null, (Map<String, String>) hashMap);
        }
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.f9876a.C() != null && this.f9876a.C().f10055a != null && this.f9876a.C().f10055a.a() != null && this.f9876a.C().f10055a.a().getJSONObject("feature") != null) {
            JSONObject jSONObject = this.f9876a.C().f10055a.a().getJSONObject("feature");
            if (jSONObject.containsKey(iyx.PARAM_VIDEO_AUTO_PLAY)) {
                return jSONObject.getBooleanValue(iyx.PARAM_VIDEO_AUTO_PLAY) ? 1 : 2;
            }
        }
        return 0;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.c();
    }

    private void b(AURARenderComponent aURARenderComponent) {
        AbsPicGalleryVideoPlayer a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed2032", new Object[]{this, aURARenderComponent});
        } else if (this.b == null || (a2 = this.b.a(n.a(aURARenderComponent))) == null) {
        } else {
            a2.j();
            a2.m();
        }
    }

    private void c(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b1c91", new Object[]{this, aURARenderComponent});
            return;
        }
        AbsPicGalleryVideoPlayer a2 = this.b.a(n.a(aURARenderComponent));
        if (a2 == null) {
            return;
        }
        a2.a(n.EXT_KEY_IS_STRUCT_VIDEO, (Object) true);
    }
}
