package com.taobao.avplayer.interactivelifecycle.display;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.component.DWComponent;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ADDED = 1;
    public static final int CREATE = 0;
    public static final int SHOWING = 2;
    public static final int SHOWN = 4;
    public static final int UPDATING = 3;
    public int b;
    public int c;
    public boolean h;
    public HashMap<String, String> i;
    public String k;
    public boolean l;
    private boolean m;

    /* renamed from: a  reason: collision with root package name */
    public DWVideoScreenType f16515a = DWVideoScreenType.NORMAL;
    public int d = 0;
    public com.taobao.avplayer.core.a e = null;
    public com.taobao.avplayer.core.a f = null;
    public com.taobao.avplayer.core.a g = null;
    public DWInteractiveTypeEnum j = DWInteractiveTypeEnum.TIMELINE;

    static {
        kge.a(-1092466353);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e.f16482a.show(false, this.f16515a);
        this.f.f16482a.show(false, this.f16515a);
        this.g.f16482a.show(false, this.f16515a);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.m) {
        } else {
            this.m = true;
            com.taobao.avplayer.core.a aVar = this.e;
            if (aVar != null && aVar.f16482a != null) {
                this.e.f16482a.renderView();
            }
            com.taobao.avplayer.core.a aVar2 = this.g;
            if (aVar2 != null && aVar2.f16482a != null) {
                this.g.f16482a.renderView();
            }
            com.taobao.avplayer.core.a aVar3 = this.f;
            if (aVar3 == null || aVar3.f16482a == null) {
                return;
            }
            this.f.f16482a.renderView();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DWComponent dWComponent = this.e.f16482a;
        DWComponent dWComponent2 = this.g.f16482a;
        DWComponent dWComponent3 = this.f.f16482a;
        if (dWComponent3.getView() != null) {
            dWComponent3.hide(false);
        }
        if (dWComponent2.getView() != null) {
            dWComponent2.hide(false);
        }
        if (dWComponent.getView() == null) {
            return;
        }
        dWComponent.hide(false);
    }

    public boolean d() {
        com.taobao.avplayer.core.a aVar;
        com.taobao.avplayer.core.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        com.taobao.avplayer.core.a aVar3 = this.e;
        return aVar3 == null || aVar3.f16482a == null || (aVar = this.g) == null || aVar.f16482a == null || (aVar2 = this.f) == null || aVar2.f16482a == null;
    }
}
