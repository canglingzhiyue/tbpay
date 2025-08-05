package com.taobao.android.dinamicx.widget.calander;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class DXOnSelectDateEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> data;

    static {
        kge.a(1632320828);
    }

    public DXOnSelectDateEvent(long j) {
        super(j);
        this.data = null;
    }

    public void addData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34725f06", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            if (this.data == null) {
                this.data = new HashMap();
            }
            this.data.put(str, str2);
            Map<String, f> args = getArgs();
            if (args == null) {
                args = new HashMap<>();
                setArgs(args);
            }
            args.put(str, f.a(str2));
        }
    }

    public Map<String, String> getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this}) : this.data;
    }
}
