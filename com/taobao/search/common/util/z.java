package com.taobao.search.common.util;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public final class z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String DEGRADE_STRATEGY = "degradeStrategy";
    public static final String DIMEN_XSEARCH_TYPE = "xsearch_type";
    public static final String FALLBACK = "isFallback";
    public static final String MEASURE_MTOP = "mtop-request";
    public static final String MODULE_NAME = "TBSearchPerformance";
    public static final String PARSE_DATA = "parse-data";
    public static final String POINT_NAME = "SrpEnter";
    public static final String RENDER_UI = "render-ui";
    public static final String SERVER_VERSION = "sVersion";
    public static final String TEMPLATE_REQUEST = "template-request";
    public static final String TEMPLATE_TYPE = "tItemType";
    public static final String TEMPLATE_URL = "template-url";

    /* renamed from: a  reason: collision with root package name */
    private MeasureValueSet f19048a;
    private DimensionValueSet b;
    private AtomicBoolean c = new AtomicBoolean(false);
    private boolean d = r.bq();
    private volatile boolean e;

    static {
        kge.a(-267169585);
        Companion = new a(null);
    }

    public z() {
        MeasureSet create = MeasureSet.create();
        create.addMeasure("mtop-request");
        create.addMeasure(PARSE_DATA);
        create.addMeasure(TEMPLATE_REQUEST);
        create.addMeasure(RENDER_UI);
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension(FALLBACK);
        create2.addDimension(SERVER_VERSION);
        create2.addDimension(DIMEN_XSEARCH_TYPE);
        AppMonitor.register(MODULE_NAME, POINT_NAME, create, create2);
        MeasureValueSet create3 = MeasureValueSet.create();
        kotlin.jvm.internal.q.a((Object) create3, "MeasureValueSet.create()");
        this.f19048a = create3;
        DimensionValueSet create4 = DimensionValueSet.create();
        create4.setValue(SERVER_VERSION, noa.SERVER_VERSION_VALUE);
        create4.setValue(FALLBACK, "false");
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
        kotlin.jvm.internal.q.a((Object) downgradeStrategy, "Downgrade.getInstance().…wngradeStrategy(\"search\")");
        create4.setValue(DEGRADE_STRATEGY, downgradeStrategy.getTacticsPerformance());
        kotlin.jvm.internal.q.a((Object) create4, "DimensionValueSet.create…e\n            )\n        }");
        this.b = create4;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1901345449);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public static /* synthetic */ void a(z zVar, String str, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d457901", new Object[]{zVar, str, new Long(j), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        zVar.a(str, j);
    }

    public final void a(String measureName, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, measureName, new Long(j)});
            return;
        }
        kotlin.jvm.internal.q.c(measureName, "measureName");
        if (this.c.get() || !this.d) {
            return;
        }
        this.f19048a.setValue(measureName, MeasureValue.create(j));
    }

    public final void a(String measureName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, measureName});
            return;
        }
        kotlin.jvm.internal.q.c(measureName, "measureName");
        if (this.c.get() || !this.d) {
            return;
        }
        MeasureValueSet measureValueSet = this.f19048a;
        if (!measureValueSet.containValue(measureName)) {
            return;
        }
        MeasureValue value = measureValueSet.getValue(measureName);
        kotlin.jvm.internal.q.a((Object) value, "it.getValue(measureName)");
        measureValueSet.setValue(measureName, System.currentTimeMillis() - value.getValue());
    }

    public final void a(String name, String value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, name, value});
            return;
        }
        kotlin.jvm.internal.q.c(name, "name");
        kotlin.jvm.internal.q.c(value, "value");
        this.b.setValue(name, value);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.d || !this.c.compareAndSet(false, true)) {
        } else {
            this.e = true;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.e || !this.d || !this.c.compareAndSet(false, true)) {
        } else {
            AppMonitor.Stat.commit(MODULE_NAME, POINT_NAME, this.b, this.f19048a);
        }
    }
}
