package com.alibaba.triver.triver_shop.newShop.ext;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-19385344);
    }

    public static final RecyclerView a(ViewGroup viewGroup, rul<? super RecyclerView, t> init, ruk<? extends RecyclerView> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("4dfa7e2e", new Object[]{viewGroup, init, rukVar});
        }
        q.d(viewGroup, "<this>");
        q.d(init, "init");
        RecyclerView mo2427invoke = rukVar == null ? null : rukVar.mo2427invoke();
        if (mo2427invoke == null) {
            mo2427invoke = new RecyclerView(viewGroup.getContext());
        }
        RecyclerView recyclerView = mo2427invoke;
        ViewGroup.MarginLayoutParams layoutParams = recyclerView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar = t.INSTANCE;
            layoutParams = marginLayoutParams;
        }
        recyclerView.setLayoutParams(layoutParams);
        mo2427invoke.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
        init.mo2421invoke(mo2427invoke);
        viewGroup.addView(recyclerView);
        return mo2427invoke;
    }
}
