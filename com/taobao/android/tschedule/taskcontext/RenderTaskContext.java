package com.taobao.android.tschedule.taskcontext;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class RenderTaskContext extends TaskContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RenderParams params;

    /* loaded from: classes6.dex */
    public static class RenderParams implements Serializable {
        public String editions;
        public boolean ignoreStatusCheck = false;
        public String spmVerifyValue;
        public String staticData;
        public List<TimeContent> timeContent;
        public long timeout;
        public String url;

        static {
            kge.a(905679784);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-298969000);
    }

    public static /* synthetic */ Object ipc$super(RenderTaskContext renderTaskContext, String str, Object... objArr) {
        if (str.hashCode() == -2128160755) {
            return super.toString();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.tschedule.taskcontext.TaskContext
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", params=");
        RenderParams renderParams = this.params;
        sb.append(renderParams == null ? "{}" : renderParams.toString());
        return sb.toString();
    }
}
