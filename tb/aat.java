package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.login4android.broadcast.LoginAction;

/* loaded from: classes2.dex */
public interface aat {

    /* loaded from: classes2.dex */
    public interface a {
        void a(aat aatVar);

        void b(aat aatVar);
    }

    boolean E();

    void I();

    boolean K();

    void L();

    jcz T();

    View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void a();

    void a(int i, int i2, Intent intent);

    void a(Intent intent);

    void a(Bundle bundle);

    void a(Fragment fragment);

    void a(LoginAction loginAction);

    void a(String str);

    boolean a(int i, KeyEvent keyEvent);

    void b();

    void c();

    void d();

    void e();

    String f();

    boolean g();

    bbz h();

    Activity i();

    void j();

    boolean k();
}
