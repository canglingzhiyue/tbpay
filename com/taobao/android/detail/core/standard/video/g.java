package com.taobao.android.detail.core.standard.video;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import java.util.List;
import tb.aqs;
import tb.atq;
import tb.ekk;
import tb.ekl;
import tb.elq;
import tb.elr;
import tb.emg;
import tb.emj;
import tb.emn;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.locator.receiver.videoAutoPlay")
/* loaded from: classes4.dex */
public final class g implements ekl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private elq f9872a;
    private RecyclerView b;
    private d c;
    private com.taobao.android.detail.core.standard.lightoff.a d;
    private ekk e;

    static {
        kge.a(1621491690);
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

    public static /* synthetic */ ekk a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ekk) ipChange.ipc$dispatch("e4d82ae", new Object[]{gVar}) : gVar.e;
    }

    public static /* synthetic */ elq b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (elq) ipChange.ipc$dispatch("c8c327aa", new Object[]{gVar}) : gVar.f9872a;
    }

    public static /* synthetic */ d c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("8b32845f", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ RecyclerView d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("6779fe54", new Object[]{gVar}) : gVar.b;
    }

    public static /* synthetic */ com.taobao.android.detail.core.standard.lightoff.a e(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.standard.lightoff.a) ipChange.ipc$dispatch("2c3110be", new Object[]{gVar}) : gVar.d;
    }

    public g() {
        emu.a("com.taobao.android.detail.core.standard.video.PicGalleryVideoAutoPlayExtension");
    }

    @Override // tb.arl
    public void onCreate(q qVar, com.alibaba.android.aura.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        Object obj = qVar.a().get("token");
        if (obj instanceof String) {
            this.f9872a = elr.a((String) obj);
        }
        this.b = (RecyclerView) qVar.a("mainRecyclerView", RecyclerView.class, null);
        this.c = (d) qVar.a("AliDetailPicGalleryVideoManager", d.class, null);
        this.d = (com.taobao.android.detail.core.standard.lightoff.a) qVar.a("AliDetailPicGalleryLightOffManager", com.taobao.android.detail.core.standard.lightoff.a.class, null);
        if (com.taobao.android.detail.core.aura.utils.f.t()) {
            return;
        }
        b();
    }

    @Override // tb.eki
    public void a(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e703dc33", new Object[]{this, ekkVar});
        } else {
            this.e = ekkVar;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.a(new AbsPicGalleryVideoPlayer.a() { // from class: com.taobao.android.detail.core.standard.video.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
            public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c6768f81", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                }
            }

            @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
            public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("85bc85f", new Object[]{this, absPicGalleryVideoPlayer, mVar, new Float(f)});
                }
            }

            @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
            public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a8fd815", new Object[]{this, absPicGalleryVideoPlayer, mVar, str, str2});
                }
            }

            @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
            public void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9a88720", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                }
            }

            @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
            public void c(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
                AURARenderComponent f;
                AURARenderComponent aURARenderComponent;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acda7ebf", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                } else if (g.a(g.this) != null && (g.b(g.this).b() instanceof RecyclerView) && (f = g.a(g.this).f()) != null && emg.a(f) && g.a(g.this).e() < g.a(g.this).a() - 1 && g.c(g.this).h()) {
                    if (g.d(g.this) != null && !emj.d(g.d(g.this))) {
                        return;
                    }
                    if (g.e(g.this) != null && g.e(g.this).c()) {
                        return;
                    }
                    RecyclerView recyclerView = (RecyclerView) g.b(g.this).b();
                    if (!(recyclerView.getAdapter() instanceof atq)) {
                        return;
                    }
                    List<AURARenderComponent> a2 = ((atq) recyclerView.getAdapter()).a();
                    for (int i = 0; i < a2.size(); i++) {
                        AURARenderComponent aURARenderComponent2 = a2.get(i);
                        if (aURARenderComponent2 != null && TextUtils.equals(aURARenderComponent2.key, f.key)) {
                            int i2 = i + 1;
                            if (i2 >= a2.size() || (aURARenderComponent = a2.get(i2)) == null || !emg.a(aURARenderComponent)) {
                                return;
                            }
                            emn.b(recyclerView, aURARenderComponent.key);
                            return;
                        }
                    }
                }
            }
        });
    }
}
