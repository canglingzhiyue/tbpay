package com.taobao.desktop.widget.monitor;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.kif;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "DesktopWidget";

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f16994a;
    private static final AtomicBoolean b;
    private static final AtomicBoolean c;
    private static final AtomicBoolean d;

    static {
        kge.a(-938204516);
        b = new AtomicBoolean(false);
        c = new AtomicBoolean(false);
        d = new AtomicBoolean(false);
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cb5ec4d2", new Object[0]);
        }
        if (f16994a == null) {
            synchronized (a.class) {
                if (f16994a == null) {
                    f16994a = new a();
                }
            }
        }
        return f16994a;
    }

    public void a(String str, C0652a c0652a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d40e96b", new Object[]{this, str, c0652a});
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1784013897) {
            if (hashCode != -934132563) {
                if (hashCode == 695348375 && str.equals(MonitorType.WIDGET_ADD_TYPE)) {
                    c2 = 0;
                }
            } else if (str.equals(MonitorType.WIDGET_STATE)) {
                c2 = 1;
            }
        } else if (str.equals(MonitorType.WIDGET_RENDER_STATE)) {
            c2 = 2;
        }
        if (c2 == 0) {
            c(str, c0652a);
        } else if (c2 == 1) {
            b(str, c0652a);
        } else if (c2 != 2) {
        } else {
            d(str, c0652a);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            if (b.get()) {
                return;
            }
            DimensionSet create = DimensionSet.create();
            create.addDimension("widgetTypeId");
            create.addDimension(MonitorType.WIDGET_STATE);
            a(str, create, MeasureSet.create());
            b.set(true);
        } catch (Exception e) {
            kif.a("WidgetMonitor WidgetStateInfo register error" + e);
        }
    }

    private void b(String str, C0652a c0652a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17f590a", new Object[]{this, str, c0652a});
            return;
        }
        try {
            a(str);
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("widgetTypeId", C0652a.a(c0652a));
            create.setValue(MonitorType.WIDGET_STATE, C0652a.b(c0652a));
            create.setValue("widgetRenderError", C0652a.c(c0652a));
            create.setValue("widgetRequestError", C0652a.d(c0652a));
            a(str, create, MeasureValueSet.create());
        } catch (Exception e) {
            kif.a("WidgetMonitor WidgetStateInfo commit error" + e);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (c.get()) {
        } else {
            try {
                DimensionSet create = DimensionSet.create();
                create.addDimension("widgetTypeId");
                create.addDimension(MonitorType.WIDGET_ADD_TYPE);
                create.addDimension("widgetChannel");
                a(str, create, MeasureSet.create());
                c.set(true);
            } catch (Exception e) {
                kif.a("WidgetMonitor WidgetAddInfo register error" + e);
            }
        }
    }

    private void c(String str, C0652a c0652a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bdc8a9", new Object[]{this, str, c0652a});
            return;
        }
        try {
            b(str);
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("widgetTypeId", C0652a.a(c0652a));
            create.setValue(MonitorType.WIDGET_ADD_TYPE, C0652a.e(c0652a));
            create.setValue("widgetChannel", C0652a.f(c0652a));
            a(str, create, MeasureValueSet.create());
        } catch (Exception e) {
            kif.a("WidgetMonitor WidgetAddInfo commit error" + e);
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            if (d.get()) {
                return;
            }
            DimensionSet create = DimensionSet.create();
            create.addDimension("widgetTypeId");
            create.addDimension(MonitorType.WIDGET_RENDER_STATE);
            create.addDimension("widgetRenderError");
            MeasureSet create2 = MeasureSet.create();
            create2.addMeasure("widgetInitTime");
            create2.addMeasure("widgetRenderTime");
            a(str, create, create2);
            d.set(true);
        } catch (Exception e) {
            kif.a("WidgetMonitor WidgetRenderInfo register error" + e);
        }
    }

    private void d(String str, C0652a c0652a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9fc3848", new Object[]{this, str, c0652a});
            return;
        }
        try {
            c(str);
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("widgetTypeId", C0652a.a(c0652a));
            create.setValue("widgetChannel", C0652a.f(c0652a));
            create.setValue(MonitorType.WIDGET_RENDER_STATE, C0652a.g(c0652a));
            create.setValue("widgetRenderError", C0652a.c(c0652a));
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue("widgetInitTime", C0652a.h(c0652a));
            create2.setValue("widgetRenderTime", C0652a.i(c0652a));
            a(str, create, create2);
        } catch (Exception e) {
            kif.a("WidgetMonitor WidgetRenderInfo commit error" + e);
        }
    }

    private void a(String str, DimensionSet dimensionSet, MeasureSet measureSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd511aa", new Object[]{this, str, dimensionSet, measureSet});
        } else {
            AppMonitor.register(MODULE_NAME, str, measureSet, dimensionSet);
        }
    }

    private void a(String str, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e62fcc", new Object[]{this, str, dimensionValueSet, measureValueSet});
        } else {
            AppMonitor.Stat.commit(MODULE_NAME, str, dimensionValueSet, measureValueSet);
        }
    }

    /* renamed from: com.taobao.desktop.widget.monitor.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0652a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f16995a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private long g;
        private long h;
        private String i;

        static {
            kge.a(-248734349);
        }

        public static /* synthetic */ String a(C0652a c0652a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b9e1b4cb", new Object[]{c0652a}) : c0652a.f16995a;
        }

        public static /* synthetic */ String b(C0652a c0652a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7457554c", new Object[]{c0652a}) : c0652a.d;
        }

        public static /* synthetic */ String c(C0652a c0652a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2eccf5cd", new Object[]{c0652a}) : c0652a.f;
        }

        public static /* synthetic */ String d(C0652a c0652a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e942964e", new Object[]{c0652a}) : c0652a.i;
        }

        public static /* synthetic */ String e(C0652a c0652a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3b836cf", new Object[]{c0652a}) : c0652a.c;
        }

        public static /* synthetic */ String f(C0652a c0652a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e2dd750", new Object[]{c0652a}) : c0652a.b;
        }

        public static /* synthetic */ String g(C0652a c0652a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18a377d1", new Object[]{c0652a}) : c0652a.e;
        }

        public static /* synthetic */ long h(C0652a c0652a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab9e7a02", new Object[]{c0652a})).longValue() : c0652a.g;
        }

        public static /* synthetic */ long i(C0652a c0652a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6e8ae361", new Object[]{c0652a})).longValue() : c0652a.h;
        }

        public C0652a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0652a) ipChange.ipc$dispatch("5c5e463f", new Object[]{this, str});
            }
            this.f16995a = str;
            return this;
        }

        public C0652a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0652a) ipChange.ipc$dispatch("16d3e6c0", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public C0652a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0652a) ipChange.ipc$dispatch("d1498741", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public C0652a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0652a) ipChange.ipc$dispatch("8bbf27c2", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public C0652a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0652a) ipChange.ipc$dispatch("4634c843", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public C0652a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0652a) ipChange.ipc$dispatch("aa68c4", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public C0652a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0652a) ipChange.ipc$dispatch("1f31e1e9", new Object[]{this, new Long(j)});
            }
            this.g = j;
            return this;
        }

        public C0652a b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0652a) ipChange.ipc$dispatch("e21e4b48", new Object[]{this, new Long(j)});
            }
            this.h = j;
            return this;
        }

        public C0652a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0652a) ipChange.ipc$dispatch("bb200945", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }
    }
}
