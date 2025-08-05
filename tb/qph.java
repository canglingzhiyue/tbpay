package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public final class qph extends qpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ApiContext b;
        public final /* synthetic */ Object[] c;
        public final /* synthetic */ qox d;

        public b(ApiContext apiContext, Object[] objArr, qox qoxVar) {
            this.b = apiContext;
            this.c = objArr;
            this.d = qoxVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qph.this.f33007a.a(this.b, this.c, this.d);
            }
        }
    }

    static {
        kge.a(-1213690465);
        Companion = new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qph(com.taobao.themis.kernel.ability.register.b apiMeta) {
        super(apiMeta);
        q.d(apiMeta, "apiMeta");
    }

    @Override // tb.qpa
    public Object a(ApiContext context, Object[] args, qox callback) {
        ExecutorType executorType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a905d430", new Object[]{this, context, args, callback});
        }
        q.d(context, "context");
        q.d(args, "args");
        q.d(callback, "callback");
        ThreadType threadType = (ThreadType) this.d.c.getAnnotation(ThreadType.class);
        if (context.g()) {
            return this.f33007a.a(context, args, callback);
        }
        if (threadType == null || (executorType = threadType.value()) == null) {
            executorType = ExecutorType.SYNC;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("method : [");
        Method method = this.d.c;
        q.b(method, "apiMeta.apiMethod");
        sb.append(method.getName());
        sb.append("], ExecutorType is : [");
        sb.append(executorType.name());
        sb.append(riy.ARRAY_END_STR);
        TMSLogger.b("ScheduleMiddleware", sb.toString());
        if (executorType == ExecutorType.SYNC) {
            return this.f33007a.a(context, args, callback);
        }
        ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(executorType).execute(new b(context, args, callback));
        return null;
    }

    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(867647015);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
