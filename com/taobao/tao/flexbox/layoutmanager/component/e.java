package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import java.util.Map;
import tb.kge;
import tb.ogl;
import tb.ogu;

/* loaded from: classes8.dex */
public class e extends com.taobao.tao.flexbox.layoutmanager.core.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1832337433);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2141646649) {
            super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode == 98971100) {
            return new Boolean(super.canbeDrawable());
        } else {
            if (hashCode != 1052797818) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        }
    }

    public boolean needRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98f38ff2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d
    public Drawable onCreateDrawable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2ede1a72", new Object[]{this, context});
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue() : super.canbeDrawable() && this.node.J() != null && (this.node.J().I() instanceof e) && this.viewParams.aJ == 0;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FlatViewGroup e = ogu.e(context);
        e.bindComponent(this);
        return e;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void applyAttrForView(View view, ogl oglVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, view, oglVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(view, oglVar, map, z);
        if (!(view instanceof FlatViewGroup)) {
            return;
        }
        ((FlatViewGroup) view).setHighLightArea(this.viewParams.bk);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void addOrUpdateView(boolean z, View view, com.taobao.tao.flexbox.layoutmanager.core.r rVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1854fc7", new Object[]{this, new Boolean(z), view, rVar, aaVar});
            return;
        }
        FlatViewGroup flatViewGroup = (FlatViewGroup) this.view;
        if (z) {
            flatViewGroup.addView(view, rVar.c, rVar.d, rVar.f20361a, rVar.b, aaVar);
        } else {
            flatViewGroup.updateNewPositionForView(view, rVar.c, rVar.d, rVar.f20361a, rVar.b);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void addOrUpdateDrawable(boolean z, Drawable[] drawableArr, com.taobao.tao.flexbox.layoutmanager.core.r rVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b250bf4d", new Object[]{this, new Boolean(z), drawableArr, rVar, aaVar, new Boolean(z2)});
            return;
        }
        FlatViewGroup flatViewGroup = (FlatViewGroup) this.view;
        if (z) {
            flatViewGroup.addDrawable(drawableArr, rVar.c, rVar.d, rVar.f20361a, rVar.b, aaVar);
        } else {
            flatViewGroup.updateNewPositionForDrawable(drawableArr, rVar.c, rVar.d, rVar.f20361a, rVar.b, z2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void removeDrawable(Drawable[] drawableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398d4010", new Object[]{this, drawableArr});
        } else if (this.view == 0) {
        } else {
            ((FlatViewGroup) this.view).removeDrawable(drawableArr);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.d, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (needRecycled() && this.view != 0 && (this.view instanceof FlatViewGroup)) {
            ogu.a((FlatViewGroup) this.view);
        }
        super.detach(z);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void sortChildren() {
        Component.a hostViewComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a97c4", new Object[]{this});
            return;
        }
        KeyEvent.Callback callback = this.view;
        if (callback == null && (hostViewComponent = getHostViewComponent()) != null && hostViewComponent.f20278a != null) {
            callback = hostViewComponent.f20278a.getView();
        }
        if (callback == null || !(callback instanceof FlatViewGroup)) {
            return;
        }
        ((FlatViewGroup) callback).sortChildren(this.node);
    }
}
