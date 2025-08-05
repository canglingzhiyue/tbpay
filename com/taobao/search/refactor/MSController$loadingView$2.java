package com.taobao.search.refactor;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes7.dex */
public final class MSController$loadingView$2 extends Lambda implements ruk<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g this$0;

    /* renamed from: com.taobao.search.refactor.MSController$loadingView$2$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1 implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MSController$loadingView$2(g gVar) {
        super(0);
        this.this$0 = gVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final View mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("287bc381", new Object[]{this});
        }
        View inflate = LayoutInflater.from(this.this$0.c().getActivity()).inflate(R.layout.sf_tbsearch_cover_loading, (ViewGroup) null, false);
        inflate.setOnTouchListener(AnonymousClass1.INSTANCE);
        return inflate;
    }
}
