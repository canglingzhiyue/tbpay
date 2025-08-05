package com.taobao.android.xsearchplugin.muise;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b<?, ?>> f16260a = new ArrayList<>();

    static {
        kge.a(63322620);
        kge.a(-812487138);
    }

    public final ArrayList<b<?, ?>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this}) : this.f16260a;
    }

    public void a(b<?, ?> musCell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf74980", new Object[]{this, musCell});
            return;
        }
        q.c(musCell, "musCell");
        this.f16260a.add(musCell);
    }
}
