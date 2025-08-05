package com.taobao.tao.flexbox.layoutmanager.container;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public interface l {

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final View f20264a;
        public final List<Pair<View, String>> b;

        static {
            kge.a(-1798936922);
        }

        public a(View view, List<Pair<View, String>> list) {
            this.f20264a = view;
            this.b = list;
        }
    }

    void onTBFragmentContainerDestroy();

    boolean pop();

    boolean push(String str, List<Pair<View, String>> list, Bundle bundle);
}
