package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class b implements j {

    /* renamed from: a  reason: collision with root package name */
    protected Context f1367a;
    protected Context b;
    protected e c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    protected k f;
    private j.a g;
    private int h;
    private int i;
    private int j;

    public b(Context context, int i, int i2) {
        this.f1367a = context;
        this.d = LayoutInflater.from(context);
        this.h = i;
        this.i = i2;
    }

    public j.a a() {
        return this.g;
    }

    public k a(ViewGroup viewGroup) {
        if (this.f == null) {
            this.f = (k) this.d.inflate(this.h, viewGroup, false);
            this.f.initialize(this.c);
            updateMenuView(true);
        }
        return this.f;
    }

    public View a(g gVar, View view, ViewGroup viewGroup) {
        k.a b = view instanceof k.a ? (k.a) view : b(viewGroup);
        a(gVar, b);
        return (View) b;
    }

    public void a(int i) {
        this.j = i;
    }

    public abstract void a(g gVar, k.a aVar);

    protected void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f).addView(view, i);
    }

    public boolean a(int i, g gVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public k.a b(ViewGroup viewGroup) {
        return (k.a) this.d.inflate(this.i, viewGroup, false);
    }

    @Override // android.support.v7.view.menu.j
    public boolean collapseItemActionView(e eVar, g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public boolean expandItemActionView(e eVar, g gVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public boolean flagActionItems() {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public int getId() {
        return this.j;
    }

    @Override // android.support.v7.view.menu.j
    public void initForMenu(Context context, e eVar) {
        this.b = context;
        this.e = LayoutInflater.from(this.b);
        this.c = eVar;
    }

    @Override // android.support.v7.view.menu.j
    public void onCloseMenu(e eVar, boolean z) {
        j.a aVar = this.g;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // android.support.v7.view.menu.j
    public boolean onSubMenuSelected(o oVar) {
        j.a aVar = this.g;
        if (aVar != null) {
            return aVar.a(oVar);
        }
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public void setCallback(j.a aVar) {
        this.g = aVar;
    }

    @Override // android.support.v7.view.menu.j
    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.c;
        int i = 0;
        if (eVar != null) {
            eVar.j();
            ArrayList<g> i2 = this.c.i();
            int size = i2.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                g gVar = i2.get(i4);
                if (a(i3, gVar)) {
                    View childAt = viewGroup.getChildAt(i3);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View a2 = a(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        a2.setPressed(false);
                        a2.jumpDrawablesToCurrentState();
                    }
                    if (a2 != childAt) {
                        a(a2, i3);
                    }
                    i3++;
                }
            }
            i = i3;
        }
        while (i < viewGroup.getChildCount()) {
            if (!a(viewGroup, i)) {
                i++;
            }
        }
    }
}
