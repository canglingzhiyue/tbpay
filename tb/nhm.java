package tb;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import com.taobao.android.purchase.aura.a;
import com.taobao.android.purchase.aura.ability.AbilityParams;
import com.taobao.android.purchase.aura.b;

/* loaded from: classes6.dex */
public interface nhm extends a, b {
    void a(Activity activity);

    void a(FragmentActivity fragmentActivity);

    void a(FragmentActivity fragmentActivity, int i, int i2, Intent intent);

    void a(FragmentActivity fragmentActivity, ViewGroup viewGroup);

    String b();

    void b(FragmentActivity fragmentActivity);

    void f();

    AbilityParams g();

    void h();

    void i();
}
