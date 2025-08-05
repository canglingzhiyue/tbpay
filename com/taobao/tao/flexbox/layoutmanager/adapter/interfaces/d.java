package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import com.taobao.tao.navigation.e;
import java.util.List;
import java.util.Map;
import tb.omk;

/* loaded from: classes8.dex */
public interface d {
    public static final String APM_HOME_LAUNCH_TIME = "homeLaunchTime";
    public static final String APM_IS_EXTERNAL_LINK = "isExtenalLink";
    public static final String APM_TIME_FROM_LAUNCH = "time_from_launch";
    public static final String ORANGE_GROUP = "weitao_switch";

    /* loaded from: classes8.dex */
    public interface a extends e.d {
    }

    /* loaded from: classes8.dex */
    public interface b extends omk {
    }

    /* loaded from: classes8.dex */
    public interface c extends com.taobao.tao.navigation.d {
    }

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d$d  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0837d {
        void onCurrentTabClicked();
    }

    int a(Context context, int i);

    Activity a();

    void a(int i, InterfaceC0837d interfaceC0837d);

    void a(int i, String str, String str2, String str3);

    void a(a aVar);

    void a(b bVar);

    void a(c cVar);

    void a(Object obj, Object obj2, boolean z, Integer num);

    void a(boolean z, boolean z2);

    boolean a(int i);

    boolean a(Context context);

    boolean a(String str);

    boolean a(String str, Context context);

    int b();

    void b(int i);

    void b(c cVar);

    Map c();

    void c(int i);

    boolean d();

    List<Fragment> e();

    ViewGroup f();

    boolean g();

    boolean i();
}
