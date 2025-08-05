package com.etao.feimagesearch.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import tb.kge;

/* loaded from: classes4.dex */
public final class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static TBLocationDTO f7032a;

    static {
        kge.a(364720277);
        Companion = new a(null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-710072931);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        /* renamed from: com.etao.feimagesearch.util.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class RunnableC0251a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final RunnableC0251a INSTANCE = new RunnableC0251a();

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    q.a(TBLocationClient.b());
                }
            }
        }

        public final TBLocationDTO a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationDTO) ipChange.ipc$dispatch("17ffc33e", new Object[]{this});
            }
            Coordinator.execute(RunnableC0251a.INSTANCE);
            return q.a();
        }
    }

    public static final /* synthetic */ TBLocationDTO a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLocationDTO) ipChange.ipc$dispatch("17ffc33e", new Object[0]) : f7032a;
    }

    public static final /* synthetic */ void a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d6c9b8", new Object[]{tBLocationDTO});
        } else {
            f7032a = tBLocationDTO;
        }
    }
}
