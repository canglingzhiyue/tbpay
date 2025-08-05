package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.TaskDeffer;
import com.taobao.android.job.core.p;
import com.taobao.android.job.core.task.f;
import com.taobao.android.job.core.task.g;

/* loaded from: classes.dex */
public class gua {

    /* renamed from: a  reason: collision with root package name */
    public final f<String, Void> f28457a;
    public final g<String, Void> b;
    public final TaskDeffer<String, Void> c;
    public final gub<String> d;
    public final String e;
    public final p<String, Void> f;

    private gua(f<String, Void> fVar, g<String, Void> gVar, gub<String> gubVar, String str, TaskDeffer<String, Void> taskDeffer, p<String, Void> pVar) {
        this.b = gVar;
        this.d = gubVar;
        this.f28457a = fVar;
        this.e = str;
        this.c = taskDeffer;
        this.f = pVar;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final f<String, Void> f28458a;
        private final g<String, Void> b;
        private final gub<String> c;
        private String d = null;
        private TaskDeffer<String, Void> e;
        private p<String, Void> f;

        public a(f<String, Void> fVar, g<String, Void> gVar, gub<String> gubVar) {
            this.f28458a = fVar;
            this.b = gVar;
            this.c = gubVar;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2003cca4", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a a(TaskDeffer<String, Void> taskDeffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2ee4293d", new Object[]{this, taskDeffer});
            }
            this.e = taskDeffer;
            return this;
        }

        public a a(p<String, Void> pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("41c25042", new Object[]{this, pVar});
            }
            this.f = pVar;
            return this;
        }

        public gua a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (gua) ipChange.ipc$dispatch("f053a4b", new Object[]{this}) : new gua(this.f28458a, this.b, this.c, this.d, this.e, this.f);
        }
    }
}
