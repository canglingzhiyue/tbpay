package com.taobao.taolive.room.controller2;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.util.Map;
import tb.pjo;

/* loaded from: classes8.dex */
public interface d extends pjo {
    String M();

    RecyclerView N();

    boolean O();

    boolean P();

    ViewGroup a();

    Map<String, String> a(String str);

    void a(int i);

    void a(Intent intent, boolean z);

    void a(Uri uri, boolean z, boolean z2);

    void a(View.OnClickListener onClickListener);

    void a(e eVar);

    void a(f fVar);

    void a(k kVar);

    void a(ISmallWindowStrategy iSmallWindowStrategy);

    void a(boolean z);

    View b(boolean z);

    void b();

    void b(View.OnClickListener onClickListener);

    void c();

    void d();

    boolean e();

    void f();

    void g();

    void g(boolean z);

    void h();

    void i();

    com.taobao.taolive.sdk.controller.e j();

    void k();

    void l(boolean z);

    void m(boolean z);

    void onConfigurationChanged(Configuration configuration);

    void onDestroy();

    boolean onKeyDown(int i, KeyEvent keyEvent);

    void onPause();

    void onResume();

    void onStop();
}
