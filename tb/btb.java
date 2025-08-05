package tb;

import com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.event.e;
import com.alibaba.mtl.appmonitor.Transaction;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class btb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1221079858);
    }

    public static void a(Transaction transaction, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c3deae", new Object[]{transaction, str});
            return;
        }
        try {
            if (!bsw.b || transaction == null) {
                return;
            }
            apr.b("TransactionDelegate", "statEvent begin. module: ", transaction.module, " monitorPoint: ", transaction.monitorPoint, " measureName: ", str);
            if (!EventType.STAT.isOpen()) {
                return;
            }
            if (!bsw.a() && !bti.a().a(EventType.STAT, transaction.module, transaction.monitorPoint)) {
                return;
            }
            e.a().a(transaction.transactionId, transaction.eventId, transaction.module, transaction.monitorPoint, str);
            a(transaction);
        } catch (Throwable th) {
            ExceptionEventBuilder.a(ExceptionEventBuilder.ExceptionType.AP, th);
        }
    }

    private static void a(Transaction transaction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d24ee5e4", new Object[]{transaction});
        } else if (transaction == null || transaction.dimensionValues == null) {
        } else {
            e.a().a(transaction.transactionId, transaction.eventId, transaction.module, transaction.monitorPoint, DimensionValueSet.create().addValues(transaction.dimensionValues));
        }
    }

    public static void b(Transaction transaction, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265362ef", new Object[]{transaction, str});
            return;
        }
        try {
            if (!bsw.b || transaction == null) {
                return;
            }
            apr.b("TransactionDelegate", "statEvent end. module: ", transaction.module, " monitorPoint: ", transaction.monitorPoint, " measureName: ", str);
            if (!EventType.STAT.isOpen()) {
                return;
            }
            if (!bsw.a() && !bti.a().a(EventType.STAT, transaction.module, transaction.monitorPoint)) {
                return;
            }
            a(transaction);
            e.a().a(transaction.transactionId, str, false);
        } catch (Throwable th) {
            ExceptionEventBuilder.a(ExceptionEventBuilder.ExceptionType.AP, th);
        }
    }
}
