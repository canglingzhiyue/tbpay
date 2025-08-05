package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.d;

/* loaded from: classes5.dex */
public class ezr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f27695a = new Handler(Looper.getMainLooper());
    private Context b;
    private eyx c;
    private ezq d;

    static {
        kge.a(-45727234);
    }

    public static /* synthetic */ ezq a(ezr ezrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ezq) ipChange.ipc$dispatch("d3a3fef", new Object[]{ezrVar}) : ezrVar.d;
    }

    public ezr(Context context, eyx eyxVar) {
        this.b = context;
        this.c = eyxVar;
        this.d = new skj(this.b, this.c);
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.d.a();
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.f27695a.post(runnable);
        }
    }

    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
        } else {
            this.f27695a.postDelayed(runnable, j);
        }
    }

    public <C extends d> C a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("dfbaff7d", new Object[]{this, str}) : (C) this.d.a(str);
    }

    public <C extends d> C b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("e0897dfe", new Object[]{this, str}) : (C) this.d.b(str);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            this.d.e();
        } else {
            this.f27695a.post(new Runnable() { // from class: tb.ezr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ezr.a(ezr.this).e();
                    }
                }
            });
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.d.g();
        }
    }
}
