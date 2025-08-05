package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar;
import com.taobao.android.dinamicx.widget.calander.CalendarView;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
import com.taobao.taobao.R;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int A;
    private int B;
    private int C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private Calendar V;
    private boolean W;

    /* renamed from: a  reason: collision with root package name */
    public int f12092a;
    public CalendarView.d b;
    public CalendarView.a c;
    public CalendarView.c d;
    public CalendarView.b e;
    public CalendarView.e f;
    public CalendarView.h g;
    public CalendarView.f h;
    public CalendarView.g i;
    public Calendar j;
    public Calendar k;
    public Calendar l;
    public List<Pair<Calendar, Calendar>> m;
    public HashMap<String, Calendar> n;
    public CalendarDateTextGravity p;
    public String q;
    public int r;
    public int s;
    public int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    public ConcurrentHashMap<String, Pair<String, String>> o = new ConcurrentHashMap<>();
    private boolean X = true;
    private boolean Y = false;

    static {
        kge.a(-1684913079);
    }

    public b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CalendarView);
        this.E = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_padding, 0.0f);
        this.F = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_padding_left, 0.0f);
        this.G = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_padding_right, 0.0f);
        int i = this.E;
        if (i != 0) {
            this.F = i;
            this.G = i;
        }
        this.K = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_week_text_size, a.a(context, 12.0f));
        this.U = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_week_bar_height, a.a(context, 40.0f));
        this.J = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_week_line_margin, a.a(context, 0.0f));
        this.W = obtainStyledAttributes.getBoolean(R.styleable.CalendarView_month_view_scrollable, true);
        this.u = obtainStyledAttributes.getInt(R.styleable.CalendarView_month_view_auto_select_day, 0);
        this.w = obtainStyledAttributes.getInt(R.styleable.CalendarView_month_view_show_mode, 0);
        this.v = obtainStyledAttributes.getInt(R.styleable.CalendarView_week_start_with, 2);
        this.x = obtainStyledAttributes.getInt(R.styleable.CalendarView_select_mode, 0);
        this.I = obtainStyledAttributes.getColor(R.styleable.CalendarView_week_background, -1);
        this.H = obtainStyledAttributes.getColor(R.styleable.CalendarView_week_line_background, 0);
        this.z = obtainStyledAttributes.getColor(R.styleable.CalendarView_week_text_color, IndicatorBar.DEFAULT_NORMAL_TEXT_COLOR);
        this.y = obtainStyledAttributes.getColor(R.styleable.CalendarView_current_day_text_color, -65536);
        this.C = obtainStyledAttributes.getColor(R.styleable.CalendarView_selected_text_color, -1);
        this.B = obtainStyledAttributes.getColor(R.styleable.CalendarView_current_month_text_color, CollectionTabLayout.SELECTED_TEXT_COLOR);
        this.L = obtainStyledAttributes.getInt(R.styleable.CalendarView_min_year, 1971);
        this.M = obtainStyledAttributes.getInt(R.styleable.CalendarView_max_year, 2055);
        this.N = obtainStyledAttributes.getInt(R.styleable.CalendarView_min_year_month, 1);
        this.O = obtainStyledAttributes.getInt(R.styleable.CalendarView_max_year_month, 12);
        this.P = obtainStyledAttributes.getInt(R.styleable.CalendarView_min_year_day, 1);
        this.Q = obtainStyledAttributes.getInt(R.styleable.CalendarView_max_year_day, -1);
        this.s = gbg.b(context, 3.0f);
        this.t = gbg.b(context, 5.0f);
        this.R = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_day_text_size, a.a(context, 16.0f));
        this.T = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_height, a.a(context, 56.0f));
        if (this.L <= 1900) {
            this.L = 1900;
        }
        if (this.M >= 2099) {
            this.M = 2099;
        }
        obtainStyledAttributes.recycle();
        M();
    }

    private void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        this.V = new Calendar();
        Date date = new Date();
        this.V.setYear(a.a("yyyy", date));
        this.V.setMonth(a.a("MM", date));
        this.V.setDay(a.a("dd", date));
        this.V.setCurrentDay(true);
        a(this.L, this.N, this.M, this.O);
    }

    private void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.L = i;
        this.N = i2;
        this.M = i3;
        this.O = i4;
        if (this.M < this.V.getYear()) {
            this.M = this.V.getYear();
        }
        if (this.Q == -1) {
            this.Q = a.a(this.M, this.O);
        }
        this.f12092a = (((this.V.getYear() - this.L) * 12) + this.V.getMonth()) - this.N;
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b020d788", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        this.L = i;
        this.N = i2;
        this.P = i3;
        this.M = i4;
        this.O = i5;
        this.Q = i6;
        if (this.Q == -1) {
            this.Q = a.a(this.M, this.O);
        }
        this.f12092a = (((this.V.getYear() - this.L) * 12) + this.V.getMonth()) - this.N;
    }

    public void a(List<Pair<Calendar, Calendar>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.m = list;
        }
    }

    public List<Pair<Calendar, Calendar>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.m;
    }

    public HashMap<String, Calendar> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this}) : this.n;
    }

    public void a(HashMap<String, Calendar> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else {
            this.n = hashMap;
        }
    }

    public void a(int i, int i2, Calendar calendar, Calendar calendar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e52a28", new Object[]{this, new Integer(i), new Integer(i2), calendar, calendar2});
            return;
        }
        Pair<String, String> pair = new Pair<>(calendar.getDateString(), calendar2.getDateString());
        ConcurrentHashMap<String, Pair<String, String>> concurrentHashMap = this.o;
        concurrentHashMap.put(i + "-" + i2, pair);
    }

    public Pair<String, String> a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("86ab2312", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        ConcurrentHashMap<String, Pair<String, String>> concurrentHashMap = this.o;
        return concurrentHashMap.get(i + "-" + i2);
    }

    public CalendarDateTextGravity c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CalendarDateTextGravity) ipChange.ipc$dispatch("b8e8c3a7", new Object[]{this}) : this.p;
    }

    public void a(CalendarDateTextGravity calendarDateTextGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91ea48e5", new Object[]{this, calendarDateTextGravity});
        } else {
            this.p = calendarDateTextGravity;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.q;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.r;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.s;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.s = i;
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.t;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.t = i;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.X;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.X = z;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.Y;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.Y = z;
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.z;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.B;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.C;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.z = i;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.C = i;
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.I;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.H;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.J;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : this.U;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue() : this.L;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : this.M;
    }

    public int s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue() : this.R;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue() : this.S;
    }

    public int u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue() : this.T;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.T = i;
        }
    }

    public int v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue() : this.N;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue() : this.O;
    }

    public int x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue() : this.w;
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae76db", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        this.y = i;
        this.A = i3;
        this.B = i2;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.R = i;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else {
            this.S = i;
        }
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.W;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.W = z;
        }
    }

    public int z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ccb7f4", new Object[]{this})).intValue() : this.v;
    }

    public int A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a97c3b", new Object[]{this})).intValue() : this.u;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b793bc", new Object[]{this})).intValue() : this.K;
    }

    public int C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c5ab3d", new Object[]{this})).intValue() : this.x;
    }

    public Calendar D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Calendar) ipChange.ipc$dispatch("fcd6e09b", new Object[]{this}) : this.V;
    }

    public int E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[]{this})).intValue() : this.F;
    }

    public int F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3eff1c0", new Object[]{this})).intValue() : this.G;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : this.D;
    }

    public int H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40c20c2", new Object[]{this})).intValue() : this.P;
    }

    public int I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("41a3843", new Object[]{this})).intValue() : this.Q;
    }

    public Calendar J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("4a656b55", new Object[]{this});
        }
        Calendar calendar = new Calendar();
        calendar.setYear(this.V.getYear());
        calendar.setWeek(this.V.getWeek());
        calendar.setMonth(this.V.getMonth());
        calendar.setDay(this.V.getDay());
        calendar.setCurrentDay(true);
        return calendar;
    }

    public final Calendar K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("d7528274", new Object[]{this});
        }
        Calendar calendar = new Calendar();
        calendar.setYear(this.L);
        calendar.setMonth(this.N);
        calendar.setDay(this.P);
        calendar.setCurrentDay(calendar.equals(this.V));
        return calendar;
    }

    public final Calendar L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("643f9993", new Object[]{this});
        }
        Calendar calendar = new Calendar();
        calendar.setYear(this.M);
        calendar.setMonth(this.O);
        calendar.setDay(this.Q);
        calendar.setCurrentDay(calendar.equals(this.V));
        return calendar;
    }
}
