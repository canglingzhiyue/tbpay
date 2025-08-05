package com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.taobao.R;
import tb.eac;
import tb.egv;
import tb.emu;
import tb.eno;
import tb.eqb;
import tb.faf;
import tb.fcy;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends eac<faf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WaitingView g;
    public f h;

    static {
        kge.a(2056494548);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -422543804:
                super.a((a) ((egv) objArr[0]));
                return null;
            case 90991720:
                super.a();
                return null;
            case 1545161960:
                super.a(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            case 2121814399:
                super.G_();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public a(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.BottomBarFavViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        View inflate = View.inflate(context, R.layout.x_detail_bottombar_fav_view, null);
        this.g = (WaitingView) inflate.findViewById(R.id.fav_waiting);
        this.h = new f(this.f9568a, inflate, this.g);
        return inflate;
    }

    @Override // tb.eac
    public void a(faf fafVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82983ed", new Object[]{this, fafVar});
            return;
        }
        super.a((a) fafVar);
        if (this.h == null) {
            return;
        }
        ItemNode c = eqb.c(fafVar.mNodeBundle);
        this.h.a(fafVar.n, fafVar.o, fafVar.p, c.categoryId, c.rootCategoryId);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
        } else {
            super.G_();
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            super.a(z, z2);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        com.taobao.android.trade.event.f.a(this.f9568a).b(eno.a(fcy.class), this.h);
    }
}
