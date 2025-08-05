package com.etao.feimagesearch.newresult.widget.preview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.newresult.base.i;
import com.etao.feimagesearch.newresult.widget.preview.a;
import com.etao.feimagesearch.result.FirstChildOffsetView;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.csy;
import tb.hon;
import tb.igi;
import tb.igj;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class d extends igj<FirstChildOffsetView, IrpDatasource> implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Bitmap f6863a;
    private a e;

    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(RectF rectF, a.b bVar);

        void b(RectF rectF, a.b bVar);
    }

    static {
        kge.a(-1429700267);
        kge.a(1576504320);
    }

    public abstract void a(Bitmap bitmap, boolean z);

    public abstract void a(RectF rectF, int i, int i2);

    public abstract void a(Float f);

    public abstract void a(Integer num);

    public abstract void a(List<i> list);

    public abstract void a(List<a.b> list, Float f);

    public abstract void a(boolean z);

    public abstract void b(List<i> list);

    public abstract int ez_();

    public final a eA_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b0895fcb", new Object[]{this}) : this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity, hon parent, IrpDatasource irpDatasource, igi setter, a aVar) {
        super(activity, parent, irpDatasource, setter);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
        this.e = aVar;
    }

    public final void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
        } else {
            this.f6863a = bitmap;
        }
    }

    public void a(RectF rectF, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7488371a", new Object[]{this, rectF, bVar});
            return;
        }
        csy.a(true);
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(rectF, bVar);
    }

    public void b(RectF rectF, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a339a139", new Object[]{this, rectF, bVar});
            return;
        }
        csy.a(true);
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.b(rectF, bVar);
    }
}
