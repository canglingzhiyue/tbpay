package com.taobao.android.job.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e<T, R> implements o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract com.taobao.android.job.core.task.d a(l lVar);

    public abstract String a();

    public abstract Map<T, com.taobao.android.job.core.task.d> a(StringBuilder sb);

    public abstract com.taobao.android.job.core.graph.c<T> b();

    /* loaded from: classes.dex */
    public static class a<T, R> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f12987a;
        private final m<T, R> b;
        private final com.taobao.android.job.core.task.g<T, R> c;
        private com.taobao.android.job.core.task.f<T, R> d;
        private TaskDeffer<T, R> e;

        public a(String str, m<T, R> mVar, com.taobao.android.job.core.task.g<T, R> gVar) {
            this.f12987a = str;
            this.b = mVar;
            this.c = gVar;
        }

        public a<T, R> a(com.taobao.android.job.core.task.f<T, R> fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9d5d532a", new Object[]{this, fVar});
            }
            this.d = fVar;
            return this;
        }

        public a<T, R> a(TaskDeffer<T, R> taskDeffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f3213cb3", new Object[]{this, taskDeffer});
            }
            this.e = taskDeffer;
            return this;
        }

        public e<T, R> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("9442bbbf", new Object[]{this}) : new f(this.f12987a, this.b, this.c, this.d);
        }
    }
}
