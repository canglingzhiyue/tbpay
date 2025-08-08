package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.search.common.util.l;
import com.taobao.search.searchdoor.searchbar.data.c;

/* loaded from: classes7.dex */
public class hmw extends hme<c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2057161062);
    }

    public hmw(c cVar, boolean z) {
        super(cVar, z);
    }

    @Override // tb.hme
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = new TextPaint();
        this.e.setAntiAlias(true);
        this.e.setTextSize(l.a(((c) this.c).d()));
        this.e.setColor(g.a((!this.d || StringUtils.isEmpty(((c) this.c).e())) ? ((c) this.c).b() : ((c) this.c).e(), -1));
        this.e.setAlpha((int) (this.g * 255.0f));
        this.e.setFakeBoldText(((c) this.c).c());
        if (StringUtils.isEmpty(((c) this.c).g()) && StringUtils.isEmpty(((c) this.c).f())) {
            return;
        }
        this.f = new Paint();
        this.f.setAntiAlias(true);
        this.f.setColor(g.a((!this.d || StringUtils.isEmpty(((c) this.c).g())) ? ((c) this.c).f() : ((c) this.c).g(), 0));
        this.f.setStyle(Paint.Style.FILL);
        this.f.setAlpha((int) (this.g * 255.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        if (this.f == null) {
            z = false;
        }
        if (z) {
            float d = d();
            float f = f28734a;
            canvas.drawRoundRect(0.0f, 0.0f, (f28734a * 2.0f) + d, getIntrinsicHeight(), f, f, this.f);
        }
        canvas.drawText(((c) this.c).a(), f28734a, c(), this.e);
    }

    @Override // tb.hme
    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.e.measureText(((c) this.c).a());
    }
}
