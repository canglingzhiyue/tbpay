package com.taobao.android.behavix.task;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.dsn;
import tb.dso;
import tb.kge;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1541493822);
    }

    public static a a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("21f1ee74", new Object[]{str, map});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -838595071) {
            if (hashCode == 93509434 && str.equals("batch")) {
                c = 1;
            }
        } else if (str.equals("upload")) {
            c = 0;
        }
        if (c == 0) {
            return new dso(BehaviXTaskType.UPLOAD_TASK, map, null);
        }
        if (c == 1) {
            return new dsn(BehaviXTaskType.BATCH_TASK, map, null);
        }
        return null;
    }
}
