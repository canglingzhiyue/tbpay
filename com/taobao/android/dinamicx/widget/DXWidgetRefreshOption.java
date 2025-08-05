package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes5.dex */
public class DXWidgetRefreshOption {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONS_EVENT_ARGS_HEIGHT = "height";
    public static final String CONS_EVENT_ARGS_WIDTH = "width";
    public static final int DX_REFRESH_CHILDREN_STRATEGY_AUTO_REFRESH = 3;
    public static final int DX_REFRESH_CHILDREN_STRATEGY_REBUILD_CONTAINER = 2;
    public static final int DX_REFRESH_CHILDREN_STRATEGY_WITHOUT_CONTAINER = 0;
    public static final int DX_REFRESH_CHILDREN_STRATEGY_WITH_CONTAINER = 1;
    private boolean c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12032a = false;
    private int b = 0;
    private int d = 0;
    private int e = 0;
    private boolean f = false;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXRefreshChildrenStrategy {
    }

    static {
        kge.a(459879904);
    }

    public static /* synthetic */ int a(DXWidgetRefreshOption dXWidgetRefreshOption, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6170815f", new Object[]{dXWidgetRefreshOption, new Integer(i)})).intValue();
        }
        dXWidgetRefreshOption.b = i;
        return i;
    }

    public static /* synthetic */ boolean a(DXWidgetRefreshOption dXWidgetRefreshOption, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6170c141", new Object[]{dXWidgetRefreshOption, new Boolean(z)})).booleanValue();
        }
        dXWidgetRefreshOption.f12032a = z;
        return z;
    }

    public static /* synthetic */ int b(DXWidgetRefreshOption dXWidgetRefreshOption, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfd1853e", new Object[]{dXWidgetRefreshOption, new Integer(i)})).intValue();
        }
        dXWidgetRefreshOption.d = i;
        return i;
    }

    public static /* synthetic */ boolean b(DXWidgetRefreshOption dXWidgetRefreshOption, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfd1c520", new Object[]{dXWidgetRefreshOption, new Boolean(z)})).booleanValue();
        }
        dXWidgetRefreshOption.c = z;
        return z;
    }

    public static /* synthetic */ int c(DXWidgetRefreshOption dXWidgetRefreshOption, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e32891d", new Object[]{dXWidgetRefreshOption, new Integer(i)})).intValue();
        }
        dXWidgetRefreshOption.e = i;
        return i;
    }

    public static /* synthetic */ boolean c(DXWidgetRefreshOption dXWidgetRefreshOption, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e32c8ff", new Object[]{dXWidgetRefreshOption, new Boolean(z)})).booleanValue();
        }
        dXWidgetRefreshOption.f = z;
        return z;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f12032a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f;
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f12033a = false;
        private int b = 0;
        private boolean c = false;
        private int d = 0;
        private int e = 0;
        private boolean f = false;

        static {
            kge.a(584630339);
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fda1cf0d", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7146289e", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d5c7389c", new Object[]{this, new Boolean(z)});
            }
            this.f12033a = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2386b09d", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b61470e", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9920bf0f", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public DXWidgetRefreshOption a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetRefreshOption) ipChange.ipc$dispatch("72a117bd", new Object[]{this});
            }
            DXWidgetRefreshOption dXWidgetRefreshOption = new DXWidgetRefreshOption();
            DXWidgetRefreshOption.a(dXWidgetRefreshOption, this.f12033a);
            DXWidgetRefreshOption.a(dXWidgetRefreshOption, this.b);
            DXWidgetRefreshOption.b(dXWidgetRefreshOption, this.c);
            DXWidgetRefreshOption.b(dXWidgetRefreshOption, this.d);
            DXWidgetRefreshOption.c(dXWidgetRefreshOption, this.e);
            DXWidgetRefreshOption.c(dXWidgetRefreshOption, this.f);
            return dXWidgetRefreshOption;
        }
    }
}
