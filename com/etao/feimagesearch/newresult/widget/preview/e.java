package com.etao.feimagesearch.newresult.widget.preview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.newresult.base.i;
import com.etao.feimagesearch.newresult.widget.preview.a;
import com.etao.feimagesearch.newresult.widget.preview.d;
import com.etao.feimagesearch.result.FirstChildOffsetView;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.hon;
import tb.igi;
import tb.kge;

/* loaded from: classes3.dex */
public final class e extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1863889345);
    }

    public FirstChildOffsetView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FirstChildOffsetView) ipChange.ipc$dispatch("2f9184f6", new Object[]{this});
        }
        return null;
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(Bitmap bitmap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5e18ce", new Object[]{this, bitmap, new Boolean(z)});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(RectF rectF, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a437999", new Object[]{this, rectF, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f847471", new Object[]{this, f});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(List<i> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(List<a.b> parts, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405117a0", new Object[]{this, parts, f});
        } else {
            q.c(parts, "parts");
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public void b(List<i> parts) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, parts});
        } else {
            q.c(parts, "parts");
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.preview.d
    public int ez_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b454d9c4", new Object[]{this})).intValue();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.etao.feimagesearch.result.FirstChildOffsetView, android.view.View] */
    @Override // tb.igj
    public /* synthetic */ FirstChildOffsetView k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Activity activity, hon parent, IrpDatasource irpDatasource, igi setter, d.a aVar) {
        super(activity, parent, irpDatasource, setter, aVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
    }
}
