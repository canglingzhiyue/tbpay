package com.taobao.avplayer.interactivelifecycle.display;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<c> f16514a;
    public DWVideoScreenType b;
    private d e;
    private List<c> f;
    private boolean g;

    static {
        kge.a(437254383);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.avplayer.interactivelifecycle.display.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.ac, com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.ac, com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.ac, com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // com.taobao.avplayer.ac, com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.avplayer.ac, com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.ac, com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.ac, com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    public a(DWContext dWContext, d dVar) {
        super(dWContext);
        this.e = dVar;
        this.f = new ArrayList();
        this.b = this.c.screenType();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        if (!this.g) {
            e();
        } else {
            f();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        List<c> list = this.f;
        int size = list == null ? 0 : list.size();
        for (int i = 0; i < size; i++) {
            this.f.get(i).c();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        List<c> list = this.f;
        int size = list == null ? 0 : list.size();
        for (int i = 0; i < size; i++) {
            this.f.get(i).a();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<c> list = this.f16514a;
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = this.f16514a.size();
        for (int i = 0; i < size; i++) {
            c cVar = this.f16514a.get(i);
            com.taobao.avplayer.core.a aVar = cVar.e;
            if (aVar != null && aVar.f16482a != null) {
                this.c.getDWComponentManager().a(aVar.f16482a.getDWComponentInstance());
                aVar.f16482a.destroy();
            }
            com.taobao.avplayer.core.a aVar2 = cVar.g;
            if (aVar2 != null && aVar2.f16482a != null) {
                this.c.getDWComponentManager().c(aVar2.f16482a.getDWComponentInstance());
                aVar2.f16482a.destroy();
            }
            com.taobao.avplayer.core.a aVar3 = cVar.f;
            if (aVar3 != null && aVar3.f16482a != null) {
                this.c.getDWComponentManager().b(aVar3.f16482a.getDWComponentInstance());
                aVar3.f16482a.destroy();
            }
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        List<c> list = this.f16514a;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.f16514a.get(i2);
            if (cVar.b < i && cVar.c >= i && !this.c.isFloating()) {
                if (!cVar.h) {
                    cVar.f16515a = this.b;
                    if (a()) {
                        cVar.b();
                    }
                    d(cVar);
                }
                if (cVar.d == 1 || cVar.d == 4) {
                    cVar.f16515a = this.b;
                    a(cVar);
                }
                if (cVar.d == 2 || cVar.d == 3) {
                    cVar.f16515a = this.b;
                    c(cVar);
                }
            } else if (cVar.d == 1 || cVar.d == 2 || cVar.d == 3) {
                cVar.f16515a = this.b;
                b(cVar);
            }
        }
    }

    private void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e754764", new Object[]{this, cVar});
        } else if (cVar.d() || cVar.e.f16482a.getView() == null || cVar.g.f16482a.getView() == null || cVar.f.f16482a.getView() == null) {
        } else {
            cVar.d = 3;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        List<c> list = this.f16514a;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c cVar = this.f16514a.get(i);
            if (cVar.d == 2 || cVar.d == 3) {
                b(cVar);
            }
        }
    }

    private void d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34095065", new Object[]{this, cVar});
        } else if (cVar.d()) {
        } else {
            if (!cVar.g.f16482a.renderFinished() && !cVar.e.f16482a.renderFinished()) {
                return;
            }
            cVar.d = 1;
            a(cVar.e, DWVideoScreenType.NORMAL);
            a(cVar.f, DWVideoScreenType.PORTRAIT_FULL_SCREEN);
            a(cVar.g, DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
            cVar.h = true;
        }
    }

    private void a(com.taobao.avplayer.core.a aVar, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ee2379", new Object[]{this, aVar, dWVideoScreenType});
            return;
        }
        DWComponent dWComponent = aVar.f16482a;
        if (dWComponent.getView() == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dWComponent.getView().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        View view = aVar.f16482a.getView();
        if (view != null && !TextUtils.isEmpty(aVar.f16482a.getSource())) {
            view.setTag(R.id.weex_view_source, aVar.f16482a.getSource());
            view.setTag(R.id.target_screen_type, dWVideoScreenType.toString());
        }
        this.e.a(aVar.f16482a.getView(), layoutParams);
    }

    public void a(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8225b511", new Object[]{this, dWVideoScreenType});
            return;
        }
        List<c> list = this.f;
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            this.f.get(i).f16515a = dWVideoScreenType;
            c(this.f.get(i));
            a(this.f.get(i));
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34d3562", new Object[]{this, cVar});
        } else if (cVar.d()) {
        } else {
            if (cVar.e.f16482a.getView() == null && cVar.g.f16482a.getView() == null) {
                return;
            }
            cVar.f16515a = this.b;
            if (!this.f.contains(cVar)) {
                this.f.add(cVar);
            }
            if (!this.g) {
                cVar.d = 2;
                return;
            }
            cVar.a();
            if (this.c != null && this.c.getIctShowWeexCallback() != null) {
                this.c.getIctShowWeexCallback();
                cVar.f16515a.getValue();
            }
            if (this.c != null && this.c.mUTAdapter != null && !cVar.l) {
                this.c.mUTAdapter.a("Page_DWVideo_Button-videoShowInteract", "expose", null, cVar.i, this.c.getUTParams());
                cVar.l = true;
            }
            cVar.d = 2;
        }
    }

    public void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e13e63", new Object[]{this, cVar});
        } else if (cVar.d()) {
        } else {
            cVar.f16515a = this.b;
            cVar.c();
            if (this.c != null && this.c.getIctShowWeexCallback() != null) {
                this.c.getIctShowWeexCallback().a(cVar.k, cVar.f16515a.getValue());
            }
            this.f.remove(cVar);
            cVar.l = false;
            cVar.d = 4;
        }
    }

    @Override // com.taobao.avplayer.ac, com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        } else {
            a(i);
        }
    }

    @Override // com.taobao.avplayer.ac, com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        } else {
            g();
        }
    }

    @Override // com.taobao.avplayer.ac, com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        } else if (this.b == dWVideoScreenType) {
        } else {
            this.b = dWVideoScreenType;
            List<c> list = this.f16514a;
            if (list == null || list.size() <= 0) {
                return;
            }
            a(this.b);
        }
    }

    @Override // com.taobao.avplayer.ac, com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            a(i);
        }
    }

    public void d() {
        List<c> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c != null && (list = this.f16514a) != null && list.size() > 0) {
            try {
                int size = this.f16514a.size();
                for (int i = 0; i < size; i++) {
                    if (this.f16514a.get(i) != null && this.f16514a.get(i).h && this.f16514a.get(i).e != null && this.f16514a.get(i).e.f16482a != null) {
                        this.f16514a.get(i).e.f16482a.updateFrame();
                    }
                }
            } catch (Throwable unused) {
                com.taobao.taobaoavsdk.util.c.a(this.c.mTlogAdapter, "updateFrame error");
            }
        }
    }
}
