package com.ali.user.mobile.ability.excutor;

import android.content.Context;
import com.ali.user.mobile.base.BaseView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class ExecutorContext {
    public Map<String, String> componentFields;
    public Context context;
    public BaseView mView;
    public Map<String, String> pageFields;
    public ExecutorParams params;
    public String trace;

    static {
        kge.a(1480160242);
    }

    private ExecutorContext(ExcutorContextBuilder excutorContextBuilder) {
        this.pageFields = new HashMap();
        this.componentFields = new HashMap();
        this.context = ExcutorContextBuilder.access$000(excutorContextBuilder);
        this.mView = ExcutorContextBuilder.access$100(excutorContextBuilder);
        this.pageFields = ExcutorContextBuilder.access$200(excutorContextBuilder);
        this.componentFields = ExcutorContextBuilder.access$300(excutorContextBuilder);
        this.params = ExcutorContextBuilder.access$400(excutorContextBuilder);
        this.trace = ExcutorContextBuilder.access$500(excutorContextBuilder);
    }

    /* loaded from: classes2.dex */
    public static class ExcutorContextBuilder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private BaseView baseView;
        private Context context;
        private ExecutorParams params;
        private String trace;
        private Map<String, String> pageFields = new HashMap();
        private Map<String, String> componentFields = new HashMap();

        static {
            kge.a(913991436);
        }

        public static /* synthetic */ Context access$000(ExcutorContextBuilder excutorContextBuilder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1e29b316", new Object[]{excutorContextBuilder}) : excutorContextBuilder.context;
        }

        public static /* synthetic */ BaseView access$100(ExcutorContextBuilder excutorContextBuilder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BaseView) ipChange.ipc$dispatch("eca5aaa2", new Object[]{excutorContextBuilder}) : excutorContextBuilder.baseView;
        }

        public static /* synthetic */ Map access$200(ExcutorContextBuilder excutorContextBuilder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2749e391", new Object[]{excutorContextBuilder}) : excutorContextBuilder.pageFields;
        }

        public static /* synthetic */ Map access$300(ExcutorContextBuilder excutorContextBuilder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7cbab70", new Object[]{excutorContextBuilder}) : excutorContextBuilder.componentFields;
        }

        public static /* synthetic */ ExecutorParams access$400(ExcutorContextBuilder excutorContextBuilder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExecutorParams) ipChange.ipc$dispatch("f7c19528", new Object[]{excutorContextBuilder}) : excutorContextBuilder.params;
        }

        public static /* synthetic */ String access$500(ExcutorContextBuilder excutorContextBuilder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("579cfd07", new Object[]{excutorContextBuilder}) : excutorContextBuilder.trace;
        }

        public ExcutorContextBuilder context(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExcutorContextBuilder) ipChange.ipc$dispatch("2cdb3a77", new Object[]{this, context});
            }
            this.context = context;
            return this;
        }

        public ExcutorContextBuilder baseView(BaseView baseView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExcutorContextBuilder) ipChange.ipc$dispatch("8d105cdd", new Object[]{this, baseView});
            }
            this.baseView = baseView;
            return this;
        }

        public ExcutorContextBuilder pageFields(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExcutorContextBuilder) ipChange.ipc$dispatch("9361149b", new Object[]{this, map});
            }
            this.pageFields = map;
            return this;
        }

        public ExcutorContextBuilder componentFields(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExcutorContextBuilder) ipChange.ipc$dispatch("9906c36d", new Object[]{this, map});
            }
            this.componentFields = map;
            return this;
        }

        public ExcutorContextBuilder params(ExecutorParams executorParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExcutorContextBuilder) ipChange.ipc$dispatch("e1e78dde", new Object[]{this, executorParams});
            }
            this.params = executorParams;
            return this;
        }

        public ExcutorContextBuilder trace(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExcutorContextBuilder) ipChange.ipc$dispatch("3f62b5bb", new Object[]{this, str});
            }
            this.trace = str;
            return this;
        }

        public ExecutorContext build() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExecutorContext) ipChange.ipc$dispatch("94e6def4", new Object[]{this}) : new ExecutorContext(this);
        }
    }
}
