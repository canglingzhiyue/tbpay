package com.taobao.android.weex_uikit.ui.cache;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.UINode;
import tb.kge;

/* loaded from: classes6.dex */
public class d implements com.taobao.android.weex_uikit.ui.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AccessibilityView f16132a;
    private UINode b;
    private b c;
    private MUSNodeHost e;
    private CharSequence f;
    private Rect d = new Rect();
    private boolean g = false;

    static {
        kge.a(105035836);
        kge.a(-986952994);
    }

    public d(UINode uINode) {
        this.b = uINode;
        if (!e()) {
            return;
        }
        this.c = new UIRenderView(m.b(), uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.e
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            MUSNodeHost mUSNodeHost = (MUSNodeHost) view;
            this.e = mUSNodeHost;
            if (this.e.isAccessibilityEnabled()) {
                this.f16132a = new AccessibilityView(view.getContext());
            }
            b bVar = this.c;
            if (bVar == null) {
                return;
            }
            bVar.setTarget(mUSNodeHost);
            this.c.attach();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.e
    public void a(Canvas canvas, MUSNodeHost mUSNodeHost, int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d6d46", new Object[]{this, canvas, mUSNodeHost, new Integer(i), new Integer(i2), new Float(f)});
            return;
        }
        if (mUSNodeHost.isAccessibilityEnabled() && this.f16132a == null) {
            b();
            this.g = this.b.isAccessibilityBlocked();
            this.f16132a = new AccessibilityView(mUSNodeHost.getContext());
            this.f16132a.setNode(this.b);
            this.f16132a.layout(this.d.left, this.d.top, this.d.right, this.d.bottom);
            AccessibilityView.addToParent(mUSNodeHost, this.f16132a);
            this.f16132a.attach();
            a(this.f);
        }
        b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.getView().setAlpha(this.b.getOpacity() * f);
        mUSNodeHost.drawChild(this.c.getView(), canvas);
    }

    @Override // com.taobao.android.weex_uikit.ui.e
    public void a() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MUSNodeHost mUSNodeHost = this.e;
        this.d.setEmpty();
        MUSNodeHost mUSNodeHost2 = this.e;
        if (mUSNodeHost2 != null) {
            AccessibilityView.removeFromParent(mUSNodeHost2, this.f16132a);
            this.f16132a = null;
        }
        this.e = null;
        if (!e() || (bVar = this.c) == null || bVar.getView() == null) {
            return;
        }
        UIRenderView.removeFromParent(mUSNodeHost, this.c.getView());
    }

    @Override // com.taobao.android.weex_uikit.ui.e
    public void b() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        AccessibilityView accessibilityView = this.f16132a;
        if (accessibilityView != null) {
            accessibilityView.invalidate();
        }
        if (!e() || (bVar = this.c) == null) {
            return;
        }
        bVar.invalidate();
    }

    @Override // com.taobao.android.weex_uikit.ui.e
    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
            return;
        }
        if (this.g) {
            charSequence = null;
        }
        this.f = charSequence;
        AccessibilityView accessibilityView = this.f16132a;
        if (accessibilityView == null) {
            return;
        }
        accessibilityView.setContentDescription(charSequence);
        if (Build.VERSION.SDK_INT < 16) {
            return;
        }
        if (charSequence == null) {
            this.f16132a.setImportantForAccessibility(2);
        } else {
            this.f16132a.setImportantForAccessibility(1);
        }
    }

    private void b(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315a9029", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.d.set(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.e
    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (e() && this.c != null && (this.d.width() != i5 || this.d.height() != i6)) {
            this.c.layout(0, 0, i5, i6);
        }
        AccessibilityView accessibilityView = this.f16132a;
        if (accessibilityView != null) {
            accessibilityView.layout(i, i2, i3, i4);
        }
        b(i, i2, i3, i4);
    }

    @Override // com.taobao.android.weex_uikit.ui.e
    public void c() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        MUSNodeHost mUSNodeHost = this.e;
        if (mUSNodeHost != null && mUSNodeHost.isAccessibilityEnabled()) {
            this.g = this.b.isAccessibilityBlocked();
            AccessibilityView.addToParent(this.e, this.f16132a);
            AccessibilityView accessibilityView = this.f16132a;
            if (accessibilityView != null) {
                accessibilityView.setNode(this.b);
                this.f16132a.attach();
            }
        }
        if (!e() || (bVar = this.c) == null || bVar.getView() == null) {
            return;
        }
        MUSNodeHost mUSNodeHost2 = this.e;
        if (mUSNodeHost2 != null) {
            UIRenderView.attachToParent(mUSNodeHost2, this.c.getView());
        }
        b bVar2 = this.c;
        if (bVar2 == null) {
            return;
        }
        bVar2.attach();
    }

    @Override // com.taobao.android.weex_uikit.ui.e
    public void d() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!e() || (bVar = this.c) == null) {
        } else {
            bVar.updateBorderRadius();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.e
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : l.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.e
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            z2 = this.b.isAccessibilityBlocked();
        }
        if (this.g == z2) {
            return;
        }
        this.g = z2;
        a(this.b.getAriaLabel());
    }
}
