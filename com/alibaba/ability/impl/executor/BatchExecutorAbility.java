package com.alibaba.ability.impl.executor;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsExecutorAbility;
import com.taobao.android.abilityidl.ability.ExecutorBatchExecuteResult;
import com.taobao.android.abilityidl.ability.ExecutorTaskResult;
import com.taobao.android.abilityidl.ability.fc;
import com.taobao.android.abilityidl.ability.fd;
import com.taobao.android.abilityidl.ability.fe;
import com.taobao.android.abilityidl.ability.fg;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.alo;
import tb.als;
import tb.alu;
import tb.kge;

/* loaded from: classes2.dex */
public final class BatchExecutorAbility extends AbsExecutorAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static final class a implements alo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fc f1884a;
        public final /* synthetic */ ExecutorTaskResult b;
        public final /* synthetic */ CopyOnWriteArrayList c;
        public final /* synthetic */ AtomicInteger d;
        public final /* synthetic */ fe e;
        public final /* synthetic */ BatchExecutorAbility f;
        public final /* synthetic */ List g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ ExecutorBatchExecuteResult i;
        public final /* synthetic */ int j;
        public final /* synthetic */ List k;
        public final /* synthetic */ fg l;
        public final /* synthetic */ alu m;
        public final /* synthetic */ als n;

        public a(fc fcVar, ExecutorTaskResult executorTaskResult, CopyOnWriteArrayList copyOnWriteArrayList, AtomicInteger atomicInteger, fe feVar, BatchExecutorAbility batchExecutorAbility, List list, boolean z, ExecutorBatchExecuteResult executorBatchExecuteResult, int i, List list2, fg fgVar, alu aluVar, als alsVar) {
            this.f1884a = fcVar;
            this.b = executorTaskResult;
            this.c = copyOnWriteArrayList;
            this.d = atomicInteger;
            this.e = feVar;
            this.f = batchExecutorAbility;
            this.g = list;
            this.h = z;
            this.i = executorBatchExecuteResult;
            this.j = i;
            this.k = list2;
            this.l = fgVar;
            this.m = aluVar;
            this.n = alsVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
            if (com.alibaba.ability.impl.executor.BatchExecutorAbility.access$isSameType(r0, r1, r5) != false) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        @Override // tb.alo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCallback(com.alibaba.ability.result.ExecuteResult r12) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.executor.BatchExecutorAbility.a.onCallback(com.alibaba.ability.result.ExecuteResult):void");
        }
    }

    static {
        kge.a(1409758544);
    }

    public static /* synthetic */ Object ipc$super(BatchExecutorAbility batchExecutorAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void access$executeTask(BatchExecutorAbility batchExecutorAbility, alu aluVar, als alsVar, fg fgVar, List list, int i, ExecutorBatchExecuteResult executorBatchExecuteResult, List list2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c72e6589", new Object[]{batchExecutorAbility, aluVar, alsVar, fgVar, list, new Integer(i), executorBatchExecuteResult, list2, new Boolean(z)});
        } else {
            batchExecutorAbility.a(aluVar, alsVar, fgVar, list, i, executorBatchExecuteResult, list2, z);
        }
    }

    public static final /* synthetic */ boolean access$isSameType(BatchExecutorAbility batchExecutorAbility, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d52cc348", new Object[]{batchExecutorAbility, str, str2})).booleanValue() : batchExecutorAbility.a(str, str2);
    }

    public static final /* synthetic */ boolean access$isTaskBlockOnError(BatchExecutorAbility batchExecutorAbility, fe feVar, ExecutorTaskResult executorTaskResult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("debcd4b", new Object[]{batchExecutorAbility, feVar, executorTaskResult})).booleanValue() : batchExecutorAbility.a(feVar, executorTaskResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsExecutorAbility
    public void batchExecute(als context, fd params, fg callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9418e3b5", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        alu c = context.f().c();
        if (c == null) {
            callback.a(new ErrorResult("ADAPTER_NOT_FOUND", "没有找到合适的调度器", (Map) null, 4, (o) null));
            return;
        }
        ExecutorBatchExecuteResult executorBatchExecuteResult = new ExecutorBatchExecuteResult();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        executorBatchExecuteResult.status = "ALL_SUCCESS_DONE";
        CopyOnWriteArrayList copyOnWriteArrayList2 = copyOnWriteArrayList;
        executorBatchExecuteResult.taskResults = copyOnWriteArrayList2;
        if (params.f8862a.size() > 0) {
            List<fe> list = params.f8862a;
            q.b(list, "params.tasks");
            a(c, context, callback, list, 0, executorBatchExecuteResult, copyOnWriteArrayList2, false);
            return;
        }
        callback.a(executorBatchExecuteResult);
    }

    private final void a(alu aluVar, als alsVar, fg fgVar, List<fe> list, int i, ExecutorBatchExecuteResult executorBatchExecuteResult, List<ExecutorTaskResult> list2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa11fdb1", new Object[]{this, aluVar, alsVar, fgVar, list, new Integer(i), executorBatchExecuteResult, list2, new Boolean(z)});
            return;
        }
        fe feVar = list.get(i);
        ExecutorTaskResult executorTaskResult = new ExecutorTaskResult();
        list2.add(executorTaskResult);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        executorTaskResult.status = "SUCCESS";
        executorTaskResult.apiResults = copyOnWriteArrayList;
        if (z) {
            executorTaskResult.status = "BLOCKED";
            executorBatchExecuteResult.status = "ERROR_STOP";
            if (i == p.a((List) list)) {
                fgVar.a(executorBatchExecuteResult);
            } else {
                a(aluVar, alsVar, fgVar, list, i + 1, executorBatchExecuteResult, list2, true);
            }
        } else if (feVar.f8863a.size() == 0) {
            if (i == p.a((List) list)) {
                fgVar.a(executorBatchExecuteResult);
            } else {
                a(aluVar, alsVar, fgVar, list, i + 1, executorBatchExecuteResult, list2, false);
            }
        } else {
            AtomicInteger atomicInteger = new AtomicInteger(feVar.f8863a.size());
            List<fc> list3 = feVar.f8863a;
            q.b(list3, "task.apis");
            List<fc> list4 = list3;
            ArrayList arrayList = new ArrayList(p.a((Iterable) list4, 10));
            for (fc fcVar : list4) {
                String str = fcVar.f8861a;
                q.b(str, "api.ability");
                String str2 = fcVar.b;
                q.b(str2, "api.api");
                ArrayList arrayList2 = arrayList;
                aluVar.b(str, str2, alsVar, fcVar.c, new a(fcVar, executorTaskResult, copyOnWriteArrayList, atomicInteger, feVar, this, list2, z, executorBatchExecuteResult, i, list, fgVar, aluVar, alsVar));
                arrayList2.add(t.INSTANCE);
                arrayList = arrayList2;
                atomicInteger = atomicInteger;
                executorTaskResult = executorTaskResult;
                feVar = feVar;
            }
        }
    }

    private final boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (str2.length() <= 2 || !n.b(str2, "on", false, 2, (Object) null)) {
            return false;
        }
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str2.substring(2);
        q.b(substring, "(this as java.lang.String).substring(startIndex)");
        Locale locale = Locale.ROOT;
        q.b(locale, "Locale.ROOT");
        if (substring == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = substring.toLowerCase(locale);
        q.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return q.a((Object) lowerCase, (Object) str);
    }

    private final boolean a(fe feVar, ExecutorTaskResult executorTaskResult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("237c5a02", new Object[]{this, feVar, executorTaskResult})).booleanValue() : feVar.b && (q.a((Object) executorTaskResult.status, (Object) "SUCCESS") ^ true);
    }
}
