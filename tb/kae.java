package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import java.util.List;
import tb.kal;

/* loaded from: classes6.dex */
public abstract class kae implements kah {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(516095593);
        kge.a(-225269795);
    }

    public abstract Reply b(Call call) throws IPCException;

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.aranger.core.entity.Reply a(com.taobao.aranger.core.entity.Call r13) throws com.taobao.aranger.exception.IPCException {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.kae.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r12
            r1[r4] = r13
            java.lang.String r13 = "5c252290"
            java.lang.Object r13 = r0.ipc$dispatch(r13, r1)
            com.taobao.aranger.core.entity.Reply r13 = (com.taobao.aranger.core.entity.Reply) r13
            return r13
        L18:
            com.taobao.aranger.core.wrapper.ServiceWrapper r0 = r13.getServiceWrapper()
            int r0 = r0.getType()
            if (r0 == 0) goto L47
            if (r0 == r4) goto L36
            tb.kal$a r0 = new tb.kal$a
            r0.<init>(r2)
            com.taobao.aranger.core.wrapper.MethodWrapper r1 = r13.getMethodWrapper()
            java.lang.String r1 = r1.getName()
            r0.b(r1)
        L34:
            r6 = r0
            goto L4d
        L36:
            tb.kal$a r0 = new tb.kal$a
            r0.<init>(r4)
            com.taobao.aranger.core.wrapper.MethodWrapper r1 = r13.getMethodWrapper()
            java.lang.String r1 = r1.getName()
            r0.b(r1)
            goto L34
        L47:
            tb.kal$a r0 = new tb.kal$a
            r0.<init>(r3)
            goto L34
        L4d:
            com.taobao.aranger.core.wrapper.ServiceWrapper r0 = r13.getServiceWrapper()
            java.lang.String r0 = r0.getName()
            r6.a(r0)
            long r8 = java.lang.System.currentTimeMillis()
            r0 = 0
            r2 = 0
            com.taobao.aranger.core.entity.Reply r5 = r12.b(r13)     // Catch: com.taobao.aranger.exception.IPCException -> L95
            long r10 = r13.getDataSize()     // Catch: com.taobao.aranger.exception.IPCException -> L93
            r6.c(r10)     // Catch: com.taobao.aranger.exception.IPCException -> L93
            long r0 = r5.getInvokeTime()     // Catch: com.taobao.aranger.exception.IPCException -> L93
            boolean r7 = r5.isError()     // Catch: com.taobao.aranger.exception.IPCException -> L93
            if (r7 == 0) goto L90
            com.taobao.aranger.exception.IPCException r2 = new com.taobao.aranger.exception.IPCException     // Catch: com.taobao.aranger.exception.IPCException -> L93
            int r7 = r5.getErrorCode()     // Catch: com.taobao.aranger.exception.IPCException -> L93
            java.lang.String r10 = r5.getErrorMessage()     // Catch: com.taobao.aranger.exception.IPCException -> L93
            r2.<init>(r7, r10)     // Catch: com.taobao.aranger.exception.IPCException -> L93
            int r7 = r2.getErrorCode()     // Catch: com.taobao.aranger.exception.IPCException -> L93
            r10 = 22
            if (r7 != r10) goto L90
            boolean r13 = r13.isAutoRecover()     // Catch: com.taobao.aranger.exception.IPCException -> L93
            if (r13 == 0) goto L90
            r4 = 0
        L90:
            r10 = r0
            r7 = r2
            goto L99
        L93:
            r13 = move-exception
            goto L97
        L95:
            r13 = move-exception
            r5 = r2
        L97:
            r7 = r13
            r10 = r0
        L99:
            r13 = r5
            if (r4 == 0) goto La1
            r5 = r12
            r5.a(r6, r7, r8, r10)
            return r13
        La1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kae.a(com.taobao.aranger.core.entity.Call):com.taobao.aranger.core.entity.Reply");
    }

    public final void a(List<String> list) throws IPCException {
        IPCException iPCException;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        kal.a aVar = new kal.a(4);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            b(list);
            iPCException = null;
        } catch (IPCException e) {
            iPCException = e;
        }
        a(aVar, iPCException, currentTimeMillis, 0L);
    }

    private void a(kal.a aVar, IPCException iPCException, long j, long j2) throws IPCException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684d573d", new Object[]{this, aVar, iPCException, new Long(j), new Long(j2)});
            return;
        }
        if (iPCException != null) {
            i = iPCException.getErrorCode();
        }
        aVar.a(i);
        aVar.a(kai.f29907a);
        aVar.a(System.currentTimeMillis() - (j + j2));
        aVar.b(j2);
        aVar.a();
        if (iPCException != null) {
            throw iPCException;
        }
    }
}
