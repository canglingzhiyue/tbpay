package tb;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.e;

/* loaded from: classes8.dex */
public class psj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public pse f32864a;
    public String b;
    public psi c;
    public boolean d;
    public e e;
    public String f;
    public psi h;
    public psa i;
    public pqy j;
    public boolean g = false;
    public Rect k = null;

    static {
        kge.a(-2090249320);
    }

    public psj(pse pseVar, String str, psi psiVar, e eVar, String str2) {
        this.d = false;
        this.f32864a = pseVar;
        this.b = str;
        this.c = psiVar;
        this.e = eVar;
        this.f = str2;
        this.d = false;
    }

    public void a(psi psiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa38fe52", new Object[]{this, psiVar});
        } else {
            this.h = psiVar;
        }
    }

    public void a(pqy pqyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa241540", new Object[]{this, pqyVar});
        } else {
            this.j = pqyVar;
        }
    }

    public void a(psa psaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa355b5a", new Object[]{this, psaVar});
        } else {
            this.i = psaVar;
        }
    }
}
