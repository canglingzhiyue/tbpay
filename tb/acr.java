package tb;

import android.content.Context;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.util.SimpleArrayMap;
import android.support.v7.view.menu.l;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import tb.acn;

/* loaded from: classes2.dex */
public class acr extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f25247a;
    final acn b;

    /* loaded from: classes2.dex */
    public static class a implements acn.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f25248a;
        final Context b;
        final ArrayList<acr> c = new ArrayList<>();
        final SimpleArrayMap<Menu, Menu> d = new SimpleArrayMap<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.f25248a = callback;
        }

        private Menu a(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 == null) {
                Menu a2 = l.a(this.b, (SupportMenu) menu);
                this.d.put(menu, a2);
                return a2;
            }
            return menu2;
        }

        @Override // tb.acn.a
        public void a(acn acnVar) {
            this.f25248a.onDestroyActionMode(b(acnVar));
        }

        @Override // tb.acn.a
        public boolean a(acn acnVar, Menu menu) {
            return this.f25248a.onCreateActionMode(b(acnVar), a(menu));
        }

        @Override // tb.acn.a
        public boolean a(acn acnVar, MenuItem menuItem) {
            return this.f25248a.onActionItemClicked(b(acnVar), l.a(this.b, (SupportMenuItem) menuItem));
        }

        public ActionMode b(acn acnVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                acr acrVar = this.c.get(i);
                if (acrVar != null && acrVar.b == acnVar) {
                    return acrVar;
                }
            }
            acr acrVar2 = new acr(this.b, acnVar);
            this.c.add(acrVar2);
            return acrVar2;
        }

        @Override // tb.acn.a
        public boolean b(acn acnVar, Menu menu) {
            return this.f25248a.onPrepareActionMode(b(acnVar), a(menu));
        }
    }

    public acr(Context context, acn acnVar) {
        this.f25247a = context;
        this.b = acnVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return l.a(this.f25247a, (SupportMenu) this.b.b());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.a();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.k();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.d();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.b(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.a(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.a(z);
    }
}
