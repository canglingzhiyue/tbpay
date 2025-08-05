package com.taobao.tao.flexbox.layoutmanager.container;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.tao.flexbox.layoutmanager.container.l;
import java.util.List;

/* loaded from: classes8.dex */
public interface e {

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i, f fVar);
    }

    void a(a aVar);

    boolean a();

    boolean a(f fVar, boolean z);

    boolean a(String str, List<Pair<View, String>> list, Bundle bundle);

    f b(int i);

    l.a b();

    void b(a aVar);

    ViewGroup c();

    List<f> h();
}
