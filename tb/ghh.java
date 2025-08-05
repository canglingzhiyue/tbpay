package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.model.b;
import com.taobao.android.dinamicx.widget.ad;
import com.taobao.android.dinamicx.widget.as;
import com.taobao.android.dinamicx.widget.bq;
import com.taobao.android.dinamicx.widget.e;
import com.taobao.android.dinamicx.widget.f;
import com.taobao.android.dinamicx.widget.k;
import com.taobao.android.dinamicx.widget.l;
import com.taobao.android.dinamicx.widget.q;
import com.taobao.android.dinamicx.widget.r;
import com.taobao.android.icart.widget.h;

/* loaded from: classes5.dex */
public class ghh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b<bq> f28329a;
    private bq b = new idn();
    private bq c = new ifd();

    static {
        kge.a(-1065475611);
    }

    public ghh() {
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f28329a = new b<>(50);
        this.f28329a.put(29525406863L, this.b);
        this.f28329a.put(4596163952226405054L, this.b);
        this.f28329a.put(-3496644918488563383L, this.b);
        this.f28329a.put(8840950490744612256L, this.b);
        this.f28329a.put(e.DX_WIDGET_ANIMATEDVIEW, this.b);
        this.f28329a.put(ad.DXTEXTINPUTVIEW_TEXTINPUTVIEW, this.b);
        this.f28329a.put(f.DXCALENDARVIEW_CALENDARVIEW, this.b);
        this.f28329a.put(f.DXCALENDARVIEW_CALENDARVIEW, this.b);
        this.f28329a.put(h.DXTEXTVIEW_TEXTVIEW, this.c);
        this.f28329a.put(6637736565700605658L, this.c);
        this.f28329a.put(-7675176749284896753L, this.c);
        this.f28329a.put(7821310614898040L, this.c);
        this.f28329a.put(7700670404894374791L, this.c);
        this.f28329a.put(8095935013984139892L, this.c);
        this.f28329a.put(5971992526290704869L, this.c);
        this.f28329a.put(2372426597927978788L, this.c);
        this.f28329a.put(-7401881896881775333L, this.c);
        this.f28329a.put(l.DX_GRID_LAYOUT, this.c);
        this.f28329a.put(k.DXGRIDITEM_GRIDITEM, this.c);
        this.f28329a.put(-4224482009255257824L, this.c);
        this.f28329a.put(q.DXLOOPVIEWLAYOUT_LOOPVIEWLAYOUT, this.b);
        this.f28329a.put(as.DX_WIDGET_ID, this.b);
        this.f28329a.put(r.DXOCRIMAGEVIEW_OCRIMAGEVIEW, this.b);
    }

    public bq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bq) ipChange.ipc$dispatch("68324172", new Object[]{this}) : this.b;
    }

    public bq a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bq) ipChange.ipc$dispatch("18a39566", new Object[]{this, new Long(j)});
        }
        b<bq> bVar = this.f28329a;
        if (bVar == null) {
            return null;
        }
        return bVar.get(j);
    }
}
