package com.taobao.android.dinamicx.widget.calander;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class DXOnCalendarMonthUIRangeChangeEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1229987153);
    }

    public DXOnCalendarMonthUIRangeChangeEvent(long j) {
        super(j);
    }

    public void setData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8cc547", new Object[]{this, str, str2});
            return;
        }
        Map<String, f> args = getArgs();
        if (args == null) {
            args = new HashMap<>();
            setArgs(args);
        }
        args.put(str, f.a(str2));
    }
}
