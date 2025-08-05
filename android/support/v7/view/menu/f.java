package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.app.b;
import android.support.v7.view.menu.j;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
class f implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, j.a {

    /* renamed from: a  reason: collision with root package name */
    ListMenuPresenter f1370a;
    private e b;
    private android.support.v7.app.b c;
    private j.a d;

    public f(e eVar) {
        this.b = eVar;
    }

    public void a() {
        android.support.v7.app.b bVar = this.c;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void a(IBinder iBinder) {
        e eVar = this.b;
        b.a aVar = new b.a(eVar.e());
        this.f1370a = new ListMenuPresenter(aVar.a(), R.layout.abc_list_menu_item_layout);
        this.f1370a.setCallback(this);
        this.b.a(this.f1370a);
        aVar.a(this.f1370a.getAdapter(), this);
        View o = eVar.o();
        if (o != null) {
            aVar.a(o);
        } else {
            aVar.a(eVar.n()).a(eVar.m());
        }
        aVar.a(this);
        this.c = aVar.b();
        this.c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.c.show();
    }

    @Override // android.support.v7.view.menu.j.a
    public void a(e eVar, boolean z) {
        if (z || eVar == this.b) {
            a();
        }
        j.a aVar = this.d;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // android.support.v7.view.menu.j.a
    public boolean a(e eVar) {
        j.a aVar = this.d;
        if (aVar != null) {
            return aVar.a(eVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.a((g) this.f1370a.getAdapter().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1370a.onCloseMenu(this.b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.b.b(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.b.performShortcut(i, keyEvent, 0);
    }
}
