package com.taobao.themis.kernel.container.ui.titlebar;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import tb.kge;

/* loaded from: classes9.dex */
public interface c {

    /* loaded from: classes9.dex */
    public interface a {
        void a(int i);
    }

    /* loaded from: classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-191345294);
        }

        public static boolean a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("17a63d3b", new Object[]{cVar})).booleanValue();
            }
            return true;
        }
    }

    View a();

    void a(int i);

    void a(int i, int i2);

    void a(a aVar);

    void a(TabBar tabBar);

    boolean a(int i, TabBarItem tabBarItem);

    boolean a(int i, String str);

    boolean a(String str);

    void b();

    boolean b(int i);

    boolean b(int i, TabBarItem tabBarItem);

    void c();

    boolean c(int i);

    int d();

    boolean g();
}
