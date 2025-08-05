package com.etao.feimagesearch.newresult.widget.titlebar;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.newresult.widget.preview.a;
import com.etao.feimagesearch.result.d;
import com.etao.feimagesearch.view.ContentOffsetView;
import com.taobao.android.xsearchplugin.muise.f;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.hon;
import tb.igi;
import tb.igj;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class c extends igj<ContentOffsetView, IrpDatasource> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f6865a;
    private Activity b;

    /* loaded from: classes3.dex */
    public interface a {
        void a(d dVar);

        void t();

        void u();
    }

    static {
        kge.a(-816561395);
    }

    public abstract void a(int i);

    public abstract void a(Bitmap bitmap);

    public abstract void a(RectF rectF);

    public abstract void a(RectF rectF, boolean z);

    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        }
    }

    public abstract void a(String str);

    public abstract void a(List<a.b> list);

    public abstract void a(List<a.b> list, int i);

    public abstract void a(boolean z, boolean z2);

    public abstract int b(RectF rectF);

    public abstract void b(int i);

    public abstract void b(String str);

    public abstract int eB_();

    public abstract void eC_();

    public abstract void eD_();

    public abstract boolean eE_();

    public abstract Bitmap eF_();

    public abstract void h();

    public abstract LinkedList<d> n();

    public abstract boolean o();

    public abstract int p();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Activity ctx, hon parent, IrpDatasource irpDatasource, igi setter) {
        super(ctx, parent, irpDatasource, setter);
        q.c(ctx, "ctx");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
        this.b = ctx;
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        Activity activity = this.b;
        if (!(activity instanceof f)) {
            return false;
        }
        return ((f) activity).g();
    }

    public final a eG_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c341facb", new Object[]{this}) : this.f6865a;
    }

    public final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("836bfc1", new Object[]{this, aVar});
        } else {
            this.f6865a = aVar;
        }
    }
}
