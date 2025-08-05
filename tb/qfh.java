package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.b;
import com.taobao.taopai2.material.exception.MaterialException;
import com.taobao.taopai2.material.exception.ResponseDataException;
import com.taobao.taopai2.material.request.Response;
import io.reactivex.ad;
import io.reactivex.ae;
import io.reactivex.ag;
import java.util.ArrayList;
import tb.qfg;

/* loaded from: classes8.dex */
public class qfh<A extends b, R extends qfg> implements ag<Response<R>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private ae<Response<R>> f32908a;
    private b b;
    private Class<R> c;
    private Handler d = new Handler(Looper.getMainLooper());

    static {
        kge.a(1169898836);
        kge.a(-17493558);
    }

    /* renamed from: lambda$Pf4qi78x0VCTwHj0MC3YM2f-rpM */
    public static /* synthetic */ void m2479lambda$Pf4qi78x0VCTwHj0MC3YM2frpM(qfh qfhVar) {
        qfhVar.c();
    }

    public static /* synthetic */ void lambda$V0D9ZeXyvcuFihC7uCtF7BzuUrA(qfh qfhVar, Response response) {
        qfhVar.a(response);
    }

    public static /* synthetic */ void a(qfh qfhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb363105", new Object[]{qfhVar});
        } else {
            qfhVar.b();
        }
    }

    public qfh(A a2, Class<R> cls) {
        this.b = a2;
        this.c = cls;
    }

    public ad<Response<R>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ad) ipChange.ipc$dispatch("ea28fa3d", new Object[]{this}) : ad.create(this);
    }

    public void subscribe(ae aeVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8695e13", new Object[]{this, aeVar});
            return;
        }
        this.f32908a = aeVar;
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.qfh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                qfh.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    qfh.a(qfh.this);
                }
            }
        });
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qfe());
        arrayList.add(new qfi());
        final Response a2 = new qfj(this.b, this.c, arrayList).a(this.b);
        if (a2 != null) {
            this.d.post(new Runnable() { // from class: tb.-$$Lambda$qfh$V0D9ZeXyvcuFihC7uCtF7BzuUrA
                @Override // java.lang.Runnable
                public final void run() {
                    qfh.lambda$V0D9ZeXyvcuFihC7uCtF7BzuUrA(qfh.this, a2);
                }
            });
        } else {
            this.d.post(new Runnable() { // from class: tb.-$$Lambda$qfh$Pf4qi78x0VCTwHj0MC3YM2f-rpM
                @Override // java.lang.Runnable
                public final void run() {
                    qfh.m2479lambda$Pf4qi78x0VCTwHj0MC3YM2frpM(qfh.this);
                }
            });
        }
    }

    public /* synthetic */ void a(Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c19914", new Object[]{this, response});
        } else if (response.mo2429getData() != null) {
            this.f32908a.onSuccess(response);
        } else {
            this.f32908a.onError(new MaterialException(String.valueOf(response.errorCode), response.errorMsg));
        }
    }

    public /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f32908a.onError(new ResponseDataException(null, "not data"));
        }
    }
}
