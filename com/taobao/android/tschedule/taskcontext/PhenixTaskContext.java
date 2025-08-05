package com.taobao.android.tschedule.taskcontext;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class PhenixTaskContext extends TaskContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public PhenixParams params;

    static {
        kge.a(-2085022690);
    }

    public static /* synthetic */ Object ipc$super(PhenixTaskContext phenixTaskContext, String str, Object... objArr) {
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
        PhenixParams phenixParams = this.params;
        sb.append(phenixParams == null ? "{}" : phenixParams.toString());
        return sb.toString();
    }

    /* loaded from: classes6.dex */
    public static class PhenixParams implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean cacheImg = false;
        public String imgModule;
        public List<String> imgUrls;

        static {
            kge.a(1463200284);
            kge.a(1028243835);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append("imgModule");
            sb.append(this.imgModule);
            sb.append("cacheImg");
            sb.append(this.cacheImg);
            sb.append(", imgUrls=");
            List<String> list = this.imgUrls;
            sb.append(list == null ? MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 : list.toString());
            return sb.toString();
        }
    }
}
