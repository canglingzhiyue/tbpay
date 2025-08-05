package com.taobao.android.mnncv.mtop;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.mtop.e;
import com.taobao.mrt.task.MRTRuntimeException;

/* loaded from: classes6.dex */
public class b implements e.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final e.a f14405a;

    public static /* synthetic */ e.a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e.a) ipChange.ipc$dispatch("2e4477d0", new Object[]{bVar}) : bVar.f14405a;
    }

    public b(e.a aVar) {
        this.f14405a = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.android.mnncv.mtop.b$1] */
    @Override // com.taobao.android.mnncv.mtop.e.a
    public void a(final MRTRuntimeException mRTRuntimeException, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d11cb4", new Object[]{this, mRTRuntimeException, str});
        } else {
            new AsyncTask() { // from class: com.taobao.android.mnncv.mtop.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.AsyncTask
                public Object doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                    }
                    if (b.a(b.this) == null) {
                        return null;
                    }
                    b.a(b.this).a(mRTRuntimeException, str);
                    return null;
                }
            }.execute(new Object[0]);
        }
    }
}
