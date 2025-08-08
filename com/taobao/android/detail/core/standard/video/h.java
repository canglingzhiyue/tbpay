package com.taobao.android.detail.core.standard.video;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryLightOffVideoComponent;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.aqs;
import tb.arc;
import tb.eir;
import tb.ekq;
import tb.ekw;
import tb.ema;
import tb.emd;
import tb.eme;
import tb.emh;
import tb.emk;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.render.component.creator.video")
/* loaded from: classes4.dex */
public final class h extends ekq<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TYPE = "headerVideo";
    public static final String TAG = "PicGalleryVideoComponentCreatorExtension";
    public AURAGlobalData f;
    private s g;
    private d h;
    private String i;
    private List<AbsPicGalleryVideoPlayer> j = new ArrayList();
    private ViewPager.OnPageChangeListener k = new com.taobao.android.detail.core.detail.content.e() { // from class: com.taobao.android.detail.core.standard.video.h.1
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b;

        @Override // com.taobao.android.detail.core.detail.content.e, android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            } else if (!this.b && f >= 0.1f && i == 0) {
                for (AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer : h.a(h.this)) {
                    absPicGalleryVideoPlayer.b();
                }
                this.b = true;
            }
        }

        @Override // com.taobao.android.detail.core.detail.content.e, android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            } else {
                this.b = false;
            }
        }
    };
    private AbsPicGalleryVideoPlayer.b l = new AbsPicGalleryVideoPlayer.b() { // from class: com.taobao.android.detail.core.standard.video.h.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.b
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85c1373", new Object[]{this, absPicGalleryVideoPlayer, mVar, new Boolean(z)});
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.b
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6768f81", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                return;
            }
            AURARenderComponent a2 = h.a(h.this, mVar);
            if (a2 != null) {
                com.alibaba.android.aura.service.event.a.a(h.b(h.this), a2, "itemPlay");
            }
            h.a(h.this, absPicGalleryVideoPlayer, false);
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.b
        public void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            TextureView b;
            BitmapDrawable a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9a88720", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                return;
            }
            AURARenderComponent a3 = h.a(h.this, mVar);
            if (a3 == null || !StringUtils.equals(absPicGalleryVideoPlayer.p(), AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING)) {
                return;
            }
            if (h.a(h.this, a3)) {
                HashMap hashMap = new HashMap();
                absPicGalleryVideoPlayer.b();
                if (eir.a(absPicGalleryVideoPlayer.f9863a) && (a2 = h.c(h.this).a((b = h.c(h.this).b((ViewGroup) absPicGalleryVideoPlayer.o())))) != null) {
                    hashMap.put(com.taobao.android.detail.core.standard.lightoff.b.TRANS_IMGE_KEY, a2);
                    Rect rect = new Rect();
                    int[] iArr = new int[2];
                    b.getLocationOnScreen(iArr);
                    rect.set(iArr[0], iArr[1], iArr[0] + b.getWidth(), iArr[1] + b.getHeight());
                    hashMap.put(com.taobao.android.detail.core.standard.lightoff.b.TRANS_FROME_RECT_KEY, rect);
                }
                com.alibaba.android.aura.service.event.a.a(h.b(h.this), a3, "itemClick", hashMap);
                return;
            }
            absPicGalleryVideoPlayer.b();
            h.a(h.this, absPicGalleryVideoPlayer, true);
        }
    };

    static {
        kge.a(-1585130370);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (com.alibaba.android.aura.f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : COMPONENT_TYPE;
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent}) : COMPONENT_TYPE;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.ekq
    public /* synthetic */ FrameLayout b(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c25bfc1e", new Object[]{this, viewGroup, aURARenderComponentContainer}) : c(viewGroup, aURARenderComponentContainer);
    }

    public static /* synthetic */ AURARenderComponent a(h hVar, m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("684b87ae", new Object[]{hVar, mVar}) : hVar.a(mVar);
    }

    public static /* synthetic */ List a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("528b7b15", new Object[]{hVar}) : hVar.j;
    }

    public static /* synthetic */ void a(h hVar, AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7662d6", new Object[]{hVar, absPicGalleryVideoPlayer, new Boolean(z)});
        } else {
            hVar.a(absPicGalleryVideoPlayer, z);
        }
    }

    public static /* synthetic */ boolean a(h hVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a2f120d", new Object[]{hVar, aURARenderComponent})).booleanValue() : hVar.d(aURARenderComponent);
    }

    public static /* synthetic */ s b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("3dd5d38c", new Object[]{hVar}) : hVar.g;
    }

    public static /* synthetic */ d c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b90b1ebe", new Object[]{hVar}) : hVar.h;
    }

    public h() {
        emu.a("com.taobao.android.detail.core.standard.video.PicGalleryVideoComponentCreatorExtension");
    }

    @Override // tb.ekq
    public String b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9aaefeae", new Object[]{this, aURARenderComponent});
        }
        String str = this.i;
        return str == null ? "" : str;
    }

    public FrameLayout c(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("3ea9c85c", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(emh.a(viewGroup), -2));
        for (ekw ekwVar : b().b(ekw.class)) {
            ekwVar.a(frameLayout);
        }
        return frameLayout;
    }

    private void c() {
        com.taobao.android.detail.core.standard.mainscreen.interaction.b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String a2 = com.taobao.android.detail.core.standard.mainscreen.interaction.b.a(this.c);
        if (a2 == null || (b = com.taobao.android.detail.core.standard.mainscreen.interaction.b.b(a2)) == null) {
            return;
        }
        b.a(this.h);
    }

    @Override // tb.ekq
    public void a(AURARenderComponent aURARenderComponent, FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc729aca", new Object[]{this, aURARenderComponent, frameLayout, frameLayout2, new Integer(i)});
            return;
        }
        frameLayout2.removeAllViews();
        if (this.h == null) {
            ema.a("video#videoManagerIsNull", "播放器管理器为空", this.d);
        } else if (n.b(aURARenderComponent) && !StringUtils.equals(n.c(aURARenderComponent), "success")) {
            arc.a().b(TAG, "innerRenderView", "asyncModuleVideo is not ready yet");
        } else {
            m a2 = n.a(eme.a(this.b), aURARenderComponent, this.d);
            String a3 = emk.a(aURARenderComponent);
            if (!StringUtils.isEmpty(a3)) {
                a2.a(emk.KEY_STATE_SYNC_TOKEN, a3);
                c();
            }
            AbsPicGalleryVideoPlayer a4 = this.h.a(a2);
            if (a4 == null) {
                ema.a("video#createPlayerFailed", "生成播放器失败", this.d);
                return;
            }
            View o = a4.o();
            if (o == null) {
                ema.a("video#createPlayerViewFailed", "创建播放器视图失败", this.d);
                return;
            }
            if (a2 != null) {
                this.i = emd.a(a2.c());
            }
            a4.a(n.EXT_KEY_VIDEO_POSITION, Integer.valueOf(i));
            a4.a(PicGalleryLightOffVideoComponent.KEY_LAST_VIDEO_CONTAINER, frameLayout2);
            ViewGroup viewGroup = (ViewGroup) o.getParent();
            if (viewGroup == frameLayout2) {
                return;
            }
            if (viewGroup != null) {
                Object a5 = a4.a(PicGalleryLightOffVideoComponent.KEY_ATTACHED_BY_LIGHT_OFF);
                if ((a5 instanceof Boolean) && ((Boolean) a5).booleanValue()) {
                    return;
                }
                viewGroup.removeView(o);
            }
            o.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.j.add(a4);
            for (ekw ekwVar : b().b(ekw.class)) {
                ekwVar.a(aURARenderComponent, a4, frameLayout2, frameLayout);
            }
            frameLayout2.addView(o);
            n.a(frameLayout2, a4.n().a());
            c(aURARenderComponent);
        }
    }

    @Override // tb.ekq, tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.f = aURAGlobalData;
    }

    @Override // tb.atl, tb.arl
    public void onCreate(q qVar, com.alibaba.android.aura.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.g = qVar.b();
        this.h = (d) qVar.a().get("AliDetailPicGalleryVideoManager");
        this.h.a(this.l);
        Context e = qVar.e();
        if (!(e instanceof DetailCoreActivity)) {
            return;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) e;
        if (detailCoreActivity.b.y() == null) {
            return;
        }
        detailCoreActivity.b.y().a(this.k);
    }

    @Override // tb.atl, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        d dVar = this.h;
        if (dVar == null) {
            return;
        }
        dVar.b(this.l);
    }

    private AURARenderComponent a(m mVar) {
        List<AURARenderComponent> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("8e691d78", new Object[]{this, mVar});
        }
        AURAGlobalData aURAGlobalData = this.f;
        if (aURAGlobalData == null || (list = (List) aURAGlobalData.get("render_view_item_models", List.class)) == null) {
            return null;
        }
        for (AURARenderComponent aURARenderComponent : list) {
            if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null && (aURARenderComponent.data.fields.get("videoId") instanceof String) && StringUtils.equals((String) aURARenderComponent.data.fields.get("videoId"), mVar.a())) {
                return aURARenderComponent;
            }
        }
        return null;
    }

    private void c(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b1c91", new Object[]{this, aURARenderComponent});
        } else {
            com.alibaba.android.aura.service.event.a.a(this.g, aURARenderComponent, AURAEventKey.exposureItem);
        }
    }

    private boolean d(AURARenderComponent aURARenderComponent) {
        List<Event> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fc918f4", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent == null || aURARenderComponent.data == null || aURARenderComponent.data.events == null || (list = aURARenderComponent.data.events.get("itemClick")) == null) {
            return false;
        }
        for (Event event : list) {
            if (event != null && StringUtils.equals("openLightOff", event.type)) {
                return true;
            }
        }
        return false;
    }

    private void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e51a4020", new Object[]{this, absPicGalleryVideoPlayer, new Boolean(z)});
        } else if (absPicGalleryVideoPlayer == null) {
        } else {
            Object a2 = absPicGalleryVideoPlayer.a(n.EXT_KEY_IS_STRUCT_VIDEO);
            if (!(a2 instanceof Boolean) || !((Boolean) a2).booleanValue()) {
                return;
            }
            absPicGalleryVideoPlayer.a(n.EXT_KEY_IS_USER_PAUSE_STRUCT_VIDEO, Boolean.valueOf(z));
        }
    }
}
