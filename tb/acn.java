package tb;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class acn {

    /* renamed from: a  reason: collision with root package name */
    private Object f25244a;
    private boolean b;

    /* loaded from: classes2.dex */
    public interface a {
        void a(acn acnVar);

        boolean a(acn acnVar, Menu menu);

        boolean a(acn acnVar, MenuItem menuItem);

        boolean b(acn acnVar, Menu menu);
    }

    public abstract MenuInflater a();

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(CharSequence charSequence);

    public void a(Object obj) {
        this.f25244a = obj;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public abstract Menu b();

    public abstract void b(int i);

    public abstract void b(CharSequence charSequence);

    public abstract void c();

    public abstract void d();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public boolean h() {
        return false;
    }

    public abstract View i();

    public Object j() {
        return this.f25244a;
    }

    public boolean k() {
        return this.b;
    }
}
