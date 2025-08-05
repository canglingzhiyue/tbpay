package com.taobao.android.detail.mainpic.holder;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.bny;

/* loaded from: classes4.dex */
public class o extends com.alibaba.android.ultron.vfw.viewholder.k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.android.detail.mainpic.g f;

    /* loaded from: classes4.dex */
    public static class a implements com.alibaba.android.ultron.vfw.viewholder.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private com.taobao.android.detail.mainpic.g f10194a;

        public a(com.taobao.android.detail.mainpic.g gVar) {
            this.f10194a = gVar;
        }

        @Override // com.alibaba.android.ultron.vfw.viewholder.i
        public com.alibaba.android.ultron.vfw.viewholder.f a(bny bnyVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.f) ipChange.ipc$dispatch("ac147a72", new Object[]{this, bnyVar}) : new o(bnyVar, this.f10194a);
        }
    }

    public o(bny bnyVar, com.taobao.android.detail.mainpic.g gVar) {
        super(bnyVar);
        this.f = gVar;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.k, com.alibaba.android.ultron.vfw.viewholder.f
    public com.alibaba.android.ultron.vfw.viewholder.h a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.viewholder.h) ipChange.ipc$dispatch("7bf26661", new Object[]{this, viewGroup, new Integer(i)});
        }
        n nVar = new n(this.f2744a, this.d.get(Integer.valueOf(i)), this.f);
        nVar.b(viewGroup);
        this.e.add(new WeakReference<>(nVar));
        return new com.alibaba.android.ultron.vfw.viewholder.h(nVar.a(), nVar);
    }
}
