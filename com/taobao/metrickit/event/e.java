package com.taobao.metrickit.event;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import java.util.Map;

/* loaded from: classes7.dex */
public class e extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f18081a;
    private final int[] b;
    private Class<?> c;

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 2143895178) {
            super.a(((Number) objArr[0]).intValue(), (Map) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.metrickit.event.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : com.taobao.metrickit.context.c.SWITCH_PROCESSOR_EVENT;
    }

    public e(int[] iArr, Class<?> cls, Handler handler) {
        super(iArr, handler);
        this.f18081a = false;
        this.b = iArr;
        this.c = cls;
    }

    public e(int[] iArr, String str, Handler handler) {
        super(iArr, handler);
        this.f18081a = false;
        this.b = iArr;
        try {
            this.c = Class.forName(str);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.metrickit.event.b
    public int[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.metrickit.event.b
    public void a(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee74df14", new Object[]{this, metricContext});
        } else {
            this.f18081a = true;
        }
    }

    @Override // com.taobao.metrickit.event.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f18081a = false;
        }
    }

    @Override // com.taobao.metrickit.event.b
    public void a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
        } else if (!this.f18081a) {
        } else {
            super.a(i, map);
        }
    }

    public Class<?> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("b5b2e39c", new Object[]{this}) : this.c;
    }
}
