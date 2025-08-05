package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Callback;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import java.util.List;
import tb.kal;

/* loaded from: classes.dex */
public abstract class kad implements kah {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(420934468);
        kge.a(-225269795);
    }

    public abstract Reply b(Callback callback) throws IPCException;

    public final void a(List<String> list) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        kal.a aVar = new kal.a(5);
        IPCException iPCException = null;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            b(list);
            aVar.a(0);
        } catch (IPCException e) {
            iPCException = e;
        }
        if (iPCException != null) {
            aVar.a(iPCException.getErrorCode());
        }
        aVar.a(System.currentTimeMillis() - currentTimeMillis);
        aVar.a();
        if (iPCException != null) {
            throw iPCException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.aranger.core.entity.Reply a(com.taobao.aranger.core.entity.Callback r10) throws com.taobao.aranger.exception.IPCException {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.kad.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r9
            r2 = 1
            r1[r2] = r10
            java.lang.String r10 = "dbe3f1f7"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            com.taobao.aranger.core.entity.Reply r10 = (com.taobao.aranger.core.entity.Reply) r10
            return r10
        L18:
            tb.kal$a r0 = new tb.kal$a
            r1 = 3
            r0.<init>(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 0
            r5 = 0
            com.taobao.aranger.core.entity.Reply r6 = r9.b(r10)     // Catch: com.taobao.aranger.exception.IPCException -> L51
            long r7 = r10.getDataSize()     // Catch: com.taobao.aranger.exception.IPCException -> L4f
            r0.c(r7)     // Catch: com.taobao.aranger.exception.IPCException -> L4f
            int r10 = r6.getErrorCode()     // Catch: com.taobao.aranger.exception.IPCException -> L4f
            r0.a(r10)     // Catch: com.taobao.aranger.exception.IPCException -> L4f
            long r3 = r6.getInvokeTime()     // Catch: com.taobao.aranger.exception.IPCException -> L4f
            boolean r10 = r6.isError()     // Catch: com.taobao.aranger.exception.IPCException -> L4f
            if (r10 == 0) goto L54
            com.taobao.aranger.exception.IPCException r5 = new com.taobao.aranger.exception.IPCException     // Catch: com.taobao.aranger.exception.IPCException -> L4f
            int r10 = r6.getErrorCode()     // Catch: com.taobao.aranger.exception.IPCException -> L4f
            java.lang.String r7 = r6.getErrorMessage()     // Catch: com.taobao.aranger.exception.IPCException -> L4f
            r5.<init>(r10, r7)     // Catch: com.taobao.aranger.exception.IPCException -> L4f
            goto L54
        L4f:
            r10 = move-exception
            goto L53
        L51:
            r10 = move-exception
            r6 = r5
        L53:
            r5 = r10
        L54:
            if (r5 == 0) goto L5d
            int r10 = r5.getErrorCode()
            r0.a(r10)
        L5d:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r1
            long r7 = r7 - r3
            r0.a(r7)
            r0.a()
            if (r5 != 0) goto L6c
            return r6
        L6c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kad.a(com.taobao.aranger.core.entity.Callback):com.taobao.aranger.core.entity.Reply");
    }
}
