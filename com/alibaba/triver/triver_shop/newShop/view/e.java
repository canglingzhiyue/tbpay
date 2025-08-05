package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class e extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3960a;

    /* loaded from: classes3.dex */
    public static final class a extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -741263064) {
                return super.computeScrollVectorForPosition(((Number) objArr[0]).intValue());
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v7.widget.LinearSmoothScroller
        public PointF computeScrollVectorForPosition(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i)}) : super.computeScrollVectorForPosition(i);
        }
    }

    static {
        kge.a(-149229979);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        kotlin.jvm.internal.q.d(context, "context");
        this.f3960a = context;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        a aVar = new a(this.f3960a);
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }
}
