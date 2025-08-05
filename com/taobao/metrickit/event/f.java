package com.taobao.metrickit.event;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public abstract class f extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f18082a;
    private final Object b;
    private final List<a> c;

    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f18083a;
        public Map<String, ?> b;

        public a(int i, Map<String, ?> map) {
            this.f18083a = i;
            this.b = map;
        }
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 2143895178) {
            super.a(((Number) objArr[0]).intValue(), (Map) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public f(Handler handler) {
        super(handler);
        this.f18082a = new AtomicBoolean(false);
        this.b = new Object();
        this.c = new ArrayList();
    }

    @Override // com.taobao.metrickit.event.b
    public void a(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee74df14", new Object[]{this, metricContext});
            return;
        }
        this.f18082a.set(true);
        synchronized (this.b) {
            for (a aVar : this.c) {
                a(aVar.f18083a, aVar.b);
            }
            this.c.clear();
        }
    }

    @Override // com.taobao.metrickit.event.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f18082a.set(false);
        }
    }

    @Override // com.taobao.metrickit.event.b
    public void a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
        } else if (this.f18082a.get()) {
            super.a(i, map);
        } else {
            synchronized (this.b) {
                this.c.add(new a(i, map));
            }
        }
    }
}
