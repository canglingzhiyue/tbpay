package com.taobao.android.detail.core.standard.video;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.taolive.room.utils.ag;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class j implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f9877a;
    private AbsPicGalleryVideoPlayer g;
    private b h;
    private ViewGroup i;
    private final Map<String, AbsPicGalleryVideoPlayer> b = new ConcurrentHashMap();
    private final AbsPicGalleryVideoPlayer.a c = new AbsPicGalleryVideoPlayer.a() { // from class: com.taobao.android.detail.core.standard.video.j.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6768f81", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                return;
            }
            for (AbsPicGalleryVideoPlayer.a aVar : j.a(j.this)) {
                aVar.a(absPicGalleryVideoPlayer, mVar);
            }
            com.taobao.android.detail.core.performance.h.a(j.b(j.this)).b();
            j.a(j.this, absPicGalleryVideoPlayer, mVar);
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9a88720", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                return;
            }
            for (AbsPicGalleryVideoPlayer.a aVar : j.a(j.this)) {
                aVar.b(absPicGalleryVideoPlayer, mVar);
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void c(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acda7ebf", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                return;
            }
            if (j.c(j.this) != null && j.c(j.this).a() == absPicGalleryVideoPlayer) {
                j.this.d();
            }
            for (AbsPicGalleryVideoPlayer.a aVar : j.a(j.this)) {
                aVar.c(absPicGalleryVideoPlayer, mVar);
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85bc85f", new Object[]{this, absPicGalleryVideoPlayer, mVar, new Float(f)});
                return;
            }
            for (AbsPicGalleryVideoPlayer.a aVar : j.a(j.this)) {
                aVar.a(absPicGalleryVideoPlayer, mVar, f);
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a8fd815", new Object[]{this, absPicGalleryVideoPlayer, mVar, str, str2});
                return;
            }
            for (AbsPicGalleryVideoPlayer.a aVar : j.a(j.this)) {
                aVar.a(absPicGalleryVideoPlayer, mVar, str, str2);
            }
            Activity b = j.b(j.this);
            com.taobao.android.detail.core.aura.utils.h.a(b, "industryPicGalleryVideoError", ag.ARG_ERROR_CODE + str + ",errorMsg=" + str2);
        }
    };
    private final List<AbsPicGalleryVideoPlayer.a> d = new CopyOnWriteArrayList();
    private final AbsPicGalleryVideoPlayer.b e = new AbsPicGalleryVideoPlayer.b() { // from class: com.taobao.android.detail.core.standard.video.j.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.b
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6768f81", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                return;
            }
            j.a(j.this, true);
            for (AbsPicGalleryVideoPlayer.b bVar : j.d(j.this)) {
                bVar.a(absPicGalleryVideoPlayer, mVar);
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.b
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85c1373", new Object[]{this, absPicGalleryVideoPlayer, mVar, new Boolean(z)});
                return;
            }
            if (!z) {
                j.b(j.this, true);
                for (AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer2 : j.e(j.this).values()) {
                    absPicGalleryVideoPlayer2.f();
                }
            }
            for (AbsPicGalleryVideoPlayer.b bVar : j.d(j.this)) {
                bVar.a(absPicGalleryVideoPlayer, mVar, z);
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.b
        public void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9a88720", new Object[]{this, absPicGalleryVideoPlayer, mVar});
                return;
            }
            for (AbsPicGalleryVideoPlayer.b bVar : j.d(j.this)) {
                bVar.b(absPicGalleryVideoPlayer, mVar);
            }
        }
    };
    private final List<AbsPicGalleryVideoPlayer.b> f = new ArrayList();
    private boolean j = false;
    private boolean k = false;

    static {
        kge.a(847609819);
        kge.a(1075947330);
    }

    public static /* synthetic */ List a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ede03e97", new Object[]{jVar}) : jVar.d;
    }

    public static /* synthetic */ void a(j jVar, AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dfc5f39", new Object[]{jVar, absPicGalleryVideoPlayer, mVar});
        } else {
            jVar.a(absPicGalleryVideoPlayer, mVar);
        }
    }

    public static /* synthetic */ boolean a(j jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58cbeb28", new Object[]{jVar, new Boolean(z)})).booleanValue();
        }
        jVar.j = z;
        return z;
    }

    public static /* synthetic */ Activity b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d8b9f5b9", new Object[]{jVar}) : jVar.f9877a;
    }

    public static /* synthetic */ boolean b(j jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82204069", new Object[]{jVar, new Boolean(z)})).booleanValue();
        }
        jVar.k = z;
        return z;
    }

    public static /* synthetic */ b c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("14bc533e", new Object[]{jVar}) : jVar.h;
    }

    public static /* synthetic */ List d(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c1d4ed1a", new Object[]{jVar}) : jVar.f;
    }

    public static /* synthetic */ Map e(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("89e8cd61", new Object[]{jVar}) : jVar.b;
    }

    public j(Activity activity) {
        this.f9877a = activity;
        emu.a("com.taobao.android.detail.core.standard.video.PicGalleryVideoManagerImpl");
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public AbsPicGalleryVideoPlayer a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsPicGalleryVideoPlayer) ipChange.ipc$dispatch("7b9f4c75", new Object[]{this, mVar});
        }
        if (mVar == null) {
            return null;
        }
        for (Map.Entry<String, AbsPicGalleryVideoPlayer> entry : this.b.entrySet()) {
            if (TextUtils.equals(entry.getKey(), mVar.a()) && TextUtils.equals(mVar.c(), entry.getValue().n().c())) {
                return entry.getValue();
            }
        }
        c cVar = new c(this.f9877a, mVar);
        cVar.a(this.c);
        cVar.a(this.e);
        if (this.k) {
            cVar.a(false);
        }
        this.b.put(mVar.a(), cVar);
        return cVar;
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public AbsPicGalleryVideoPlayer a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsPicGalleryVideoPlayer) ipChange.ipc$dispatch("6d0f1770", new Object[]{this, str});
        }
        for (AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer : this.b.values()) {
            if (TextUtils.equals(str, absPicGalleryVideoPlayer.b.a())) {
                return absPicGalleryVideoPlayer;
            }
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public List<AbsPicGalleryVideoPlayer> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.values());
        return arrayList;
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d();
        for (AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer : this.b.values()) {
            absPicGalleryVideoPlayer.d();
        }
        this.b.clear();
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer : this.b.values()) {
            if (this.g != absPicGalleryVideoPlayer) {
                absPicGalleryVideoPlayer.b();
            }
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de199934", new Object[]{this, absPicGalleryVideoPlayer});
            return;
        }
        if (this.h == null) {
            this.h = new k(this.f9877a, this.i);
        }
        if (this.h.a() == absPicGalleryVideoPlayer && this.h.e()) {
            return;
        }
        this.h.a(absPicGalleryVideoPlayer);
        this.h.c();
        absPicGalleryVideoPlayer.j();
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.h == null) {
            this.h = new k(this.f9877a, this.i);
        }
        if (!this.h.e()) {
            return;
        }
        this.h.d();
        AbsPicGalleryVideoPlayer a2 = this.h.a();
        if (a2 == null || !a2.g() || !AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING.equals(a2.p())) {
            return;
        }
        a2.i();
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        b bVar = this.h;
        return bVar != null && bVar.e();
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.i = viewGroup;
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public void a(AbsPicGalleryVideoPlayer.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bced1457", new Object[]{this, aVar});
        } else if (this.d.contains(aVar)) {
        } else {
            this.d.add(aVar);
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public void b(AbsPicGalleryVideoPlayer.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c415f698", new Object[]{this, aVar});
        } else {
            this.d.remove(aVar);
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public void a(AbsPicGalleryVideoPlayer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bced88b6", new Object[]{this, bVar});
        } else if (this.f.contains(bVar)) {
        } else {
            this.f.add(bVar);
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public void b(AbsPicGalleryVideoPlayer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4166af7", new Object[]{this, bVar});
        } else {
            this.f.remove(bVar);
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public List<AbsPicGalleryVideoPlayer.b> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.f;
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public AbsPicGalleryVideoPlayer g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsPicGalleryVideoPlayer) ipChange.ipc$dispatch("7f722eb4", new Object[]{this}) : this.g;
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee817b5", new Object[]{this, absPicGalleryVideoPlayer});
        } else if (absPicGalleryVideoPlayer == null) {
            this.g = null;
        } else {
            for (AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer2 : this.b.values()) {
                if (absPicGalleryVideoPlayer == absPicGalleryVideoPlayer2) {
                    this.g = absPicGalleryVideoPlayer;
                    return;
                }
            }
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : (!n.b(this.f9877a) && !n.a(this.f9877a) && com.taobao.android.detail.core.utils.a.a(this.f9877a) && n.a()) || this.j;
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.k = true;
        for (AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer : this.b.values()) {
            if (absPicGalleryVideoPlayer.g()) {
                absPicGalleryVideoPlayer.f();
            }
        }
    }

    private void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6768f81", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("size", String.valueOf(mVar.d()));
        if (absPicGalleryVideoPlayer.a(n.EXT_KEY_VIDEO_POSITION) instanceof Integer) {
            i = ((Integer) absPicGalleryVideoPlayer.a(n.EXT_KEY_VIDEO_POSITION)).intValue();
        }
        hashMap.put("playvideonum", String.valueOf(i));
        hashMap.put("videonum", String.valueOf(this.b.size()));
        hashMap.put("playvideotime", String.valueOf(absPicGalleryVideoPlayer.s() / 1000));
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Detail", 2101, "Page_Detail_video_Play_industry", null, null, hashMap).build());
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public BitmapDrawable a(TextureView textureView) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("4d3eff8a", new Object[]{this, textureView});
        }
        if (textureView != null && (bitmap = textureView.getBitmap()) != null && bitmap.getByteCount() > 0) {
            return new BitmapDrawable(textureView.getContext().getResources(), bitmap);
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.standard.video.d
    public TextureView b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("f1e98227", new Object[]{this, viewGroup});
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if (childAt instanceof ViewGroup) {
                return b((ViewGroup) childAt);
            }
        }
        return null;
    }
}
