package com.taobao.android.mnncv;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.h;
import java.util.Map;

/* loaded from: classes6.dex */
public class e implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.mrt.task.h
    public MRTRuntimeException a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTRuntimeException) ipChange.ipc$dispatch("e3ceb210", new Object[]{this, str, obj});
        }
        if (obj != null && (obj instanceof Map)) {
            return null;
        }
        return new MRTRuntimeException(407, "result format error");
    }
}
