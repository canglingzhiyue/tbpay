package com.etao.feimagesearch.newresult.widget.titlebar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.b;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.result.d;
import com.etao.feimagesearch.util.ao;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.taobao.scancode.v2.result.MaResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.cov;
import tb.coy;
import tb.kge;
import tb.ruw;
import tb.rwf;

/* loaded from: classes3.dex */
public final class h extends RecyclerView.Adapter<k> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedList<d> f6878a = new LinkedList<>();
    private d b;
    private d c;
    private Bitmap d;
    private IrpDatasource e;
    private boolean f;
    private ruw<? super d, ? super Integer, t> h;

    /* loaded from: classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ d b;
        public final /* synthetic */ int c;
        public final /* synthetic */ k d;

        public a(d dVar, int i, k kVar) {
            this.b = dVar;
            this.c = i;
            this.d = kVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (this.b.a()) {
                coy.a("Page_PhotoSearchResult", "codeBoxClick", this.b.f);
                ao.a();
                ruw<d, Integer, t> e = h.this.e();
                if (e == null) {
                    return;
                }
                e.mo2423invoke(this.b, Integer.valueOf(this.c));
            } else if (this.b.g) {
            } else {
                coy.a("Page_PhotoSearchResult", "clickThumbnailNew", "bodyIndex", String.valueOf(this.d.getAdapterPosition()));
                this.b.g = true;
                ruw<d, Integer, t> e2 = h.this.e();
                if (e2 == null) {
                    return;
                }
                e2.mo2423invoke(this.b, Integer.valueOf(this.c));
            }
        }
    }

    static {
        kge.a(-2083675613);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(k kVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, kVar, new Integer(i)});
        } else {
            a(kVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.etao.feimagesearch.newresult.widget.titlebar.k, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ k mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public final ruw<d, Integer, t> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruw) ipChange.ipc$dispatch("2dd0d286", new Object[]{this}) : this.h;
    }

    public h(IrpDatasource irpDatasource, boolean z, ruw<? super d, ? super Integer, t> ruwVar) {
        this.e = irpDatasource;
        this.f = z;
        this.h = ruwVar;
    }

    public final LinkedList<d> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("48e7b0c6", new Object[]{this}) : this.f6878a;
    }

    public k a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("ef575408", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (viewGroup == null) {
            return null;
        }
        Context context = viewGroup.getContext();
        q.a((Object) context, "parent.context");
        return new k(context, viewGroup, this.f);
    }

    public void a(k kVar, int i) {
        d dVar;
        String str;
        String str2;
        com.etao.feimagesearch.newresult.base.c i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a08fbad", new Object[]{this, kVar, new Integer(i)});
        } else if (kVar == null) {
        } else {
            if (i == getItemCount() - 1) {
                dVar = this.b;
                if (dVar == null) {
                    dVar = this.f6878a.get(i);
                }
            } else {
                dVar = this.f6878a.get(i);
            }
            if (dVar == null) {
                return;
            }
            a(dVar, kVar);
            kVar.a(dVar);
            kVar.itemView.setOnClickListener(new a(dVar, i, kVar));
            if (dVar.d) {
                return;
            }
            dVar.d = true;
            if (dVar.a()) {
                HashMap hashMap = new HashMap();
                IrpDatasource irpDatasource = this.e;
                String str3 = null;
                Integer[] g = irpDatasource != null ? irpDatasource.g() : null;
                HashMap hashMap2 = hashMap;
                hashMap2.put("region", cov.a(dVar.c));
                if (g != null && g.length == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(g[0].intValue());
                    sb.append('_');
                    sb.append(g[1].intValue());
                    hashMap2.put("imgSize", sb.toString());
                } else {
                    hashMap2.put("imgSize", "unknown_unknown");
                }
                IrpDatasource irpDatasource2 = this.e;
                b.a a2 = irpDatasource2 != null ? irpDatasource2.a(dVar.c) : null;
                if (a2 == null) {
                    hashMap2.put("type", "-1");
                    hashMap2.put("content", "");
                } else {
                    ScancodeType scancodeType = a2.f;
                    if (scancodeType == null || (str = scancodeType.toString()) == null) {
                        str = "";
                    }
                    hashMap2.put("type", str);
                    MaResult maResult = a2.f6598a;
                    if (maResult == null || (str2 = maResult.getText()) == null) {
                        str2 = "";
                    }
                    hashMap2.put("content", str2);
                }
                IrpDatasource irpDatasource3 = this.e;
                if (irpDatasource3 != null && (i2 = irpDatasource3.i()) != null) {
                    str3 = i2.f();
                }
                hashMap2.put("tfskey", str3);
                coy.b("Page_PhotoSearchResult", "codeBoxExpose", hashMap2);
                dVar.f = hashMap2;
                return;
            }
            coy.c("Page_PhotoSearchResult", "showThumbnailNew", "bodyIndex", String.valueOf(i));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        int size = this.f6878a.size();
        if (this.b != null) {
            i = 1;
        }
        return size + i;
    }

    public final void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
        } else if (bitmap == null) {
        } else {
            this.d = bitmap;
            if (this.f6878a.isEmpty()) {
                return;
            }
            notifyItemRangeChanged(0, getItemCount());
        }
    }

    public final d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("3bb61299", new Object[]{this}) : this.c;
    }

    public final void a(RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8970e7b", new Object[]{this, rectF, new Boolean(z)});
            return;
        }
        q.c(rectF, "rectF");
        d dVar = this.c;
        if (dVar != null) {
            dVar.g = false;
        }
        if (z) {
            d dVar2 = this.b;
            if (dVar2 == null) {
                return;
            }
            dVar2.g = true;
            this.c = dVar2;
            notifyItemRangeChanged(0, getItemCount());
            return;
        }
        Iterator<d> it = this.f6878a.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (q.a(next.c, rectF)) {
                next.g = true;
                this.c = next;
                notifyItemRangeChanged(0, getItemCount());
                return;
            }
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= getItemCount()) {
        } else {
            d dVar = this.c;
            if (dVar != null) {
                if (dVar == null) {
                    q.a();
                }
                dVar.g = false;
            }
            if (this.f6878a.size() > 0) {
                this.f6878a.get(i).g = true;
                this.c = this.f6878a.get(i);
            }
            notifyItemRangeChanged(0, getItemCount());
        }
    }

    public final int a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4ec136c", new Object[]{this, rectF})).intValue();
        }
        if (rectF == null) {
            return -1;
        }
        d dVar = this.b;
        if (q.a(rectF, dVar != null ? dVar.c : null)) {
            return getItemCount() - 1;
        }
        int size = this.f6878a.size();
        for (int i = 0; i < size; i++) {
            d dVar2 = this.f6878a.get(i);
            if (dVar2 == null) {
                q.a();
            }
            q.a((Object) dVar2, "mImageList[index]!!");
            if (q.a(dVar2.c, rectF)) {
                return i;
            }
        }
        return -1;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        d dVar = this.c;
        if (dVar == null) {
            return -1;
        }
        if (q.a(dVar, this.b)) {
            return getItemCount() - 1;
        }
        return this.f6878a.indexOf(dVar);
    }

    public final void a(RectF rectF, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa961f4", new Object[]{this, rectF, new Integer(i), str});
        } else if (rectF == null) {
        } else {
            this.f6878a.add(i, new d(rectF, false, i, str));
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f6878a.clear();
        notifyDataSetChanged();
    }

    public final void b(RectF rectF) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee3bf7fa", new Object[]{this, rectF});
            return;
        }
        d dVar = this.c;
        if (dVar != null) {
            dVar.g = false;
        }
        d dVar2 = this.b;
        if (dVar2 != null && (bitmap = dVar2.e) != null) {
            bitmap.recycle();
        }
        d dVar3 = new d(new RectF(rectF), true, this.f6878a.size(), com.etao.feimagesearch.e.REGION_SEARCH);
        dVar3.g = true;
        this.b = dVar3;
        this.c = dVar3;
        notifyItemRangeChanged(0, getItemCount());
    }

    public final Bitmap b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("82302d18", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        if (i >= this.f6878a.size()) {
            d dVar = this.b;
            if (dVar == null) {
                return null;
            }
            return dVar.e;
        }
        d dVar2 = this.f6878a.get(i);
        q.a((Object) dVar2, "mImageList[index]");
        return dVar2.e;
    }

    private final void a(d dVar, k kVar) {
        int i;
        int i2;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae974c6", new Object[]{this, dVar, kVar});
            return;
        }
        if (dVar.e != null) {
            Bitmap bitmap2 = dVar.e;
            if (bitmap2 == null) {
                q.a();
            }
            q.a((Object) bitmap2, "bean.croppedBitmap!!");
            if (!bitmap2.isRecycled()) {
                return;
            }
        }
        Bitmap bitmap3 = this.d;
        if (bitmap3 == null) {
            return;
        }
        RectF rectF = dVar.c;
        q.a((Object) rectF, "bean.rectF");
        int width = (int) (bitmap3.getWidth() * rectF.width());
        int height = (int) (bitmap3.getHeight() * rectF.height());
        int c = rwf.c(0, (int) (bitmap3.getWidth() * rectF.left));
        int c2 = rwf.c(0, (int) (bitmap3.getHeight() * rectF.top));
        if (width <= 0 || width + c > bitmap3.getWidth()) {
            width = bitmap3.getWidth() - c;
        }
        if (height <= 0 || c2 + height > bitmap3.getHeight()) {
            height = bitmap3.getHeight() - height;
        }
        if (width <= 0) {
            i = bitmap3.getWidth();
            c = 0;
        } else {
            i = width;
        }
        if (height <= 0) {
            i2 = bitmap3.getHeight();
            c2 = 0;
        } else {
            i2 = height;
        }
        float a2 = kVar.a() / rwf.c(i, i2);
        Matrix matrix = new Matrix();
        matrix.setScale(a2, a2);
        try {
            bitmap = Bitmap.createBitmap(bitmap3, c, c2, i, i2, matrix, false);
        } catch (Exception unused) {
            bitmap = null;
        }
        dVar.e = bitmap;
    }
}
