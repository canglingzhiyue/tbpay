package tb;

import android.content.Context;
import android.support.v7.view.menu.e;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import tb.acn;

/* loaded from: classes2.dex */
public class acq extends acn implements e.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f25246a;
    private ActionBarContextView b;
    private acn.a c;
    private WeakReference<View> d;
    private boolean e;
    private boolean f;
    private e g;

    public acq(Context context, ActionBarContextView actionBarContextView, acn.a aVar, boolean z) {
        this.f25246a = context;
        this.b = actionBarContextView;
        this.c = aVar;
        this.g = new e(actionBarContextView.getContext()).a(1);
        this.g.a(this);
        this.f = z;
    }

    @Override // tb.acn
    public MenuInflater a() {
        return new acs(this.b.getContext());
    }

    @Override // tb.acn
    public void a(int i) {
        b(this.f25246a.getString(i));
    }

    @Override // android.support.v7.view.menu.e.a
    public void a(e eVar) {
        d();
        this.b.showOverflowMenu();
    }

    @Override // tb.acn
    public void a(View view) {
        this.b.setCustomView(view);
        this.d = view != null ? new WeakReference<>(view) : null;
    }

    @Override // tb.acn
    public void a(CharSequence charSequence) {
        this.b.setSubtitle(charSequence);
    }

    @Override // tb.acn
    public void a(boolean z) {
        super.a(z);
        this.b.setTitleOptional(z);
    }

    @Override // android.support.v7.view.menu.e.a
    public boolean a(e eVar, MenuItem menuItem) {
        return this.c.a(this, menuItem);
    }

    @Override // tb.acn
    public Menu b() {
        return this.g;
    }

    @Override // tb.acn
    public void b(int i) {
        a((CharSequence) this.f25246a.getString(i));
    }

    @Override // tb.acn
    public void b(CharSequence charSequence) {
        this.b.setTitle(charSequence);
    }

    @Override // tb.acn
    public void c() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.sendAccessibilityEvent(32);
        this.c.a(this);
    }

    @Override // tb.acn
    public void d() {
        this.c.b(this, this.g);
    }

    @Override // tb.acn
    public CharSequence f() {
        return this.b.getTitle();
    }

    @Override // tb.acn
    public CharSequence g() {
        return this.b.getSubtitle();
    }

    @Override // tb.acn
    public boolean h() {
        return this.b.isTitleOptional();
    }

    @Override // tb.acn
    public View i() {
        WeakReference<View> weakReference = this.d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
