package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.track.a;
import com.taobao.android.searchbaseframe.track.b;
import com.taobao.android.searchbaseframe.track.c;
import com.taobao.android.searchbaseframe.track.d;

/* loaded from: classes6.dex */
public class jyy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jyv f29873a;
    private final jyw b;

    static {
        kge.a(508536270);
    }

    public static /* synthetic */ jyv a(jyy jyyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jyv) ipChange.ipc$dispatch("c05ae111", new Object[]{jyyVar}) : jyyVar.f29873a;
    }

    public jyy(jyv jyvVar, jyw jywVar) {
        this.f29873a = jyvVar;
        this.b = jywVar;
    }

    public void onEvent(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2deb5441", new Object[]{this, bVar});
        } else if (bVar.f15008a) {
            jyv jyvVar = this.f29873a;
            jyvVar.a(bVar.b + "/" + bVar.c);
        } else {
            jyv jyvVar2 = this.f29873a;
            jyvVar2.a(bVar.b + "/" + bVar.c, bVar.d, bVar.e);
        }
    }

    public void onEvent(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2debc8a0", new Object[]{this, cVar});
        } else if (cVar.f15009a == null || cVar.b == null) {
        } else {
            SearchResult searchResult = cVar.f15009a;
            String a2 = this.b.a(cVar.b);
            String str = "nullError";
            if (searchResult.isFailed()) {
                ResultError error = searchResult.getError();
                String valueOf = error != null ? String.valueOf(error.getErrorCode()) : str;
                if (error != null) {
                    str = error.getErrorMsg();
                }
                this.f29873a.a(a2, valueOf, str, cVar.c);
            } else if (!searchResult.hasListResult() || searchResult.bizRuleNoResult()) {
                this.f29873a.a(a2, String.valueOf(9), str, cVar.c);
            } else {
                this.f29873a.a(a2, cVar.c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.jyy$1] */
    public void onEvent(final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dec3cff", new Object[]{this, dVar});
        } else if (dVar.f15010a || dVar.b) {
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: tb.jyy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    jyy.a(jyy.this).a(dVar);
                    return null;
                }
            }.execute(new Void[0]);
        }
    }

    public void onEvent(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2deadfe2", new Object[]{this, aVar});
            return;
        }
        jyv jyvVar = this.f29873a;
        String a2 = aVar.a();
        String b = aVar.b();
        long d = aVar.d() - aVar.c();
        long j = 0;
        if (aVar.f() != 0) {
            j = aVar.d() - aVar.f();
        }
        jyvVar.a(a2, b, d, j);
    }
}
