package com.taobao.bootimage.arch.flow.view;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.taobao.bootimage.data.BootImageInfo;
import tb.pbe;

/* loaded from: classes6.dex */
public interface d {

    /* loaded from: classes6.dex */
    public interface a {

        /* renamed from: com.taobao.bootimage.arch.flow.view.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public interface InterfaceC0637a {
            void a();
        }

        /* loaded from: classes6.dex */
        public interface b {
            void a(String str);
        }

        c a(Activity activity, BootImageInfo bootImageInfo, int i, b bVar);

        void a(InterfaceC0637a interfaceC0637a);

        c e();

        int f();

        void p();

        int u();
    }

    c a(Activity activity);

    void a(BitmapDrawable bitmapDrawable);

    void a(View.OnClickListener onClickListener);

    void a(String str);

    boolean a(String str, boolean z, pbe.a aVar);

    void b(BitmapDrawable bitmapDrawable);

    void g();

    void h();

    void i();

    void j();

    void k();

    void l();

    void m();

    void n();

    void o();
}
