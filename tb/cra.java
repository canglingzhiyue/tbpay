package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.nn.b;
import com.etao.feimagesearch.nn.optimize.c;
import java.util.LinkedList;
import tb.cre;
import tb.crg;

/* loaded from: classes3.dex */
public class cra extends b<com.etao.feimagesearch.nn.optimize.b, c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private crg b;
    private cre c;
    private int d;

    static {
        kge.a(217912712);
    }

    public static /* synthetic */ Object ipc$super(cra craVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public cra(NetConfig netConfig) {
        super(netConfig);
    }

    @Override // com.etao.feimagesearch.nn.k
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        this.c = new cre(com.etao.feimagesearch.config.b.u());
        this.c.a();
        this.b = new crg(new crf());
        this.b.a();
        return this.c.h() && this.b.h();
    }

    private c a(com.etao.feimagesearch.nn.optimize.b bVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f2d0dead", new Object[]{this, bVar});
        }
        cre creVar = this.c;
        c cVar = null;
        if (creVar != null) {
            cre.b a2 = creVar.a(bVar.c());
            if (a2 == null) {
                return null;
            }
            if (a2.a() != null && !a2.a().isEmpty()) {
                cVar = new c(bVar.b());
                for (RectF rectF : a2.a()) {
                    cVar.a(Bitmap.createBitmap(bVar.c(), (int) (rectF.left * bVar.c().getWidth()), (int) (rectF.top * bVar.c().getHeight()), (int) (rectF.width() * bVar.c().getWidth()), (int) (rectF.height() * bVar.c().getHeight())), rectF, a2.f26465a.get(i).floatValue());
                    i++;
                }
            }
        }
        return cVar;
    }

    @Override // com.etao.feimagesearch.nn.k
    public c a(com.etao.feimagesearch.nn.optimize.b bVar, Object obj) {
        int m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b424d411", new Object[]{this, bVar, obj});
        }
        if (bVar.a()) {
            crg crgVar = this.b;
            if (crgVar == null || (m = crgVar.m()) < 0) {
                return null;
            }
            c cVar = new c(0);
            cVar.a(m);
            return cVar;
        } else if (this.b != null) {
            c a2 = a(bVar);
            this.b.l();
            if (a2 == null) {
                return null;
            }
            if (a2.c().isEmpty()) {
                return a2;
            }
            LinkedList linkedList = new LinkedList();
            for (c.a aVar : a2.c()) {
                this.d++;
                aVar.c = this.d;
                crg.a a3 = this.b.a(aVar.f6923a, aVar.c, aVar.b, aVar.d);
                if (a3 != null) {
                    if (!a3.f26467a) {
                        linkedList.add(aVar);
                    } else if (a3.b) {
                        a2.a(a3.c, aVar.c, aVar.b);
                    }
                }
            }
            a2.a(linkedList);
            return a2;
        }
        return null;
    }

    @Override // com.etao.feimagesearch.nn.k
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        crg crgVar = this.b;
        if (crgVar != null) {
            crgVar.f();
            this.b = null;
        }
        cre creVar = this.c;
        if (creVar == null) {
            return;
        }
        creVar.f();
        this.c = null;
    }
}
