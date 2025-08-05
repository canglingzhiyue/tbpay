package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class hgx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f28640a;
    private Class<?> b;
    private a c;
    private AsyncTask<Void, Integer, Object> d;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(Object obj, long j);
    }

    static {
        kge.a(-1559969553);
    }

    public static /* synthetic */ String a(hgx hgxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d83bfda1", new Object[]{hgxVar}) : hgxVar.f28640a;
    }

    public static /* synthetic */ Class b(hgx hgxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("1cc5c80d", new Object[]{hgxVar}) : hgxVar.b;
    }

    public static /* synthetic */ a c(hgx hgxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("99f993ef", new Object[]{hgxVar}) : hgxVar.c;
    }

    public hgx(String str, Class<?> cls, a aVar) {
        this.f28640a = str;
        this.b = cls;
        this.c = aVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = new AsyncTask<Void, Integer, Object>() { // from class: tb.hgx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public long b = 0;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == -1325021319) {
                        super.onPostExecute(objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ Object doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
                    if (r7 == null) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x00ef, code lost:
                    if (r7 == null) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x00f1, code lost:
                    r7.disconnect();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
                    return null;
                 */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object a(java.lang.Void... r7) {
                    /*
                        Method dump skipped, instructions count: 263
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: tb.hgx.AnonymousClass1.a(java.lang.Void[]):java.lang.Object");
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, obj});
                        return;
                    }
                    super.onPostExecute(obj);
                    if (hgx.c(hgx.this) == null) {
                        return;
                    }
                    if (obj != null) {
                        hgx.c(hgx.this).a(obj, this.b);
                    } else {
                        hgx.c(hgx.this).a();
                    }
                }
            };
        }
        this.d.execute(new Void[0]);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        AsyncTask<Void, Integer, Object> asyncTask = this.d;
        if (asyncTask == null) {
            return;
        }
        asyncTask.cancel(true);
        this.d = null;
    }
}
