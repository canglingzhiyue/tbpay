package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.h;
import com.taobao.android.dinamic.j;
import com.taobao.android.dinamic.view.a;

/* loaded from: classes5.dex */
public class fpp implements View.OnClickListener, View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fpd f28097a;
    private String b;
    private fpq c;

    static {
        kge.a(32209094);
        kge.a(-1201612728);
        kge.a(1426707756);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        try {
            this.f28097a.a(view.getTag(j.SUBDATA));
            h.a(view, this.b, this.f28097a);
            fpa.a(this.f28097a.b(), this.c.f28098a, System.nanoTime() - nanoTime);
        } catch (Throwable unused) {
            this.f28097a.c().b().a(a.ERROR_CODE_EVENT_HANDLER_EXCEPTION, this.c.f28098a);
            fpa.a(this.f28097a.b(), this.c.f28098a, System.nanoTime() - nanoTime);
        }
        return true;
    }

    public fpp(fpd fpdVar, String str, fpq fpqVar) {
        this.f28097a = fpdVar;
        this.b = str;
        this.c = fpqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        long nanoTime = System.nanoTime();
        try {
            this.f28097a.a(view.getTag(j.SUBDATA));
            h.a(view, this.b, this.f28097a);
            fpa.a(this.f28097a.b(), this.c.f28098a, System.nanoTime() - nanoTime);
        } catch (Throwable unused) {
            this.f28097a.c().b().a(a.ERROR_CODE_EVENT_HANDLER_EXCEPTION, this.c.f28098a);
            fpa.a(this.f28097a.b(), this.c.f28098a, System.nanoTime() - nanoTime);
        }
    }
}
