package android.support.constraint.solver.widgets;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class c {
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r2.Z == 2) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
        if (r2.aa == 2) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x03c7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(android.support.constraint.solver.widgets.e r37, android.support.constraint.solver.e r38, int r39, int r40, android.support.constraint.solver.widgets.d r41) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.c.a(android.support.constraint.solver.widgets.e, android.support.constraint.solver.e, int, int, android.support.constraint.solver.widgets.d):void");
    }

    public static void a(e eVar, android.support.constraint.solver.e eVar2, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        d[] dVarArr;
        int i3;
        if (i == 0) {
            i2 = eVar.an;
            dVarArr = eVar.aq;
            i3 = 0;
        } else {
            i2 = eVar.ao;
            dVarArr = eVar.ap;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            d dVar = dVarArr[i4];
            dVar.a();
            if (arrayList == null || (arrayList != null && arrayList.contains(dVar.f1130a))) {
                a(eVar, eVar2, i, i3, dVar);
            }
        }
    }
}
