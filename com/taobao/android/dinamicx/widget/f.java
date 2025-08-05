package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.calander.Calendar;
import com.taobao.android.dinamicx.widget.calander.CalendarView;
import com.taobao.android.dinamicx.widget.calander.DXOnCalendarMonthUIRangeChangeEvent;
import com.taobao.android.dinamicx.widget.calander.DXOnSelectDateEvent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes5.dex */
public class f extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCALENDARVIEW_ANCHORDATE = -8904535438500141309L;
    public static final long DXCALENDARVIEW_AUTOCHANGEMONTH = 8833414845409451796L;
    public static final long DXCALENDARVIEW_BEGINDATE = -1860805752639688564L;
    public static final long DXCALENDARVIEW_CALENDARITEMHEIGHT = -1496427289189049292L;
    public static final long DXCALENDARVIEW_CALENDARVIEW = 116344237634520001L;
    public static final long DXCALENDARVIEW_CURRENTDAYTEXTSIZE = -7647500290265887373L;
    public static final long DXCALENDARVIEW_DATETOPGAP = -5929381539273250573L;
    public static final long DXCALENDARVIEW_DAYTEXTGRAVITY = 262055229558107607L;
    public static final long DXCALENDARVIEW_DAYTEXTSIZE = -8982072168126024311L;
    public static final long DXCALENDARVIEW_DISABLEDDATES = 2788104028282969654L;
    public static final long DXCALENDARVIEW_ENDDATE = 4804791552104474556L;
    public static final long DXCALENDARVIEW_FONT = 34149272427L;
    public static final long DXCALENDARVIEW_HIGHLIGHTCURRENTDAYUNSELECTED = -4751183184166360670L;
    public static final long DXCALENDARVIEW_HIGHLIGHTDATES = -4039211786071886953L;
    public static final long DXCALENDARVIEW_ITEMBOTTOMPADDING = -1606397561075253268L;
    public static final long DXCALENDARVIEW_ITEMTOPPADDING = -2470631056276577113L;
    public static final long DXCALENDARVIEW_ONCHANGE = 5288679823228297259L;
    public static final long DXCALENDARVIEW_ONMONTHCHANGE = -5286047925153782218L;
    public static final long DXCALENDARVIEW_ONTAPDISABLEDATE = 4959443637101445444L;
    public static final long DXCALENDARVIEW_SCROLLABLE = 5099976257538233901L;
    public static final long DXCALENDARVIEW_SELECTEDDATE = 792202854466360275L;
    public static final long DXCALENDARVIEW_SELECTTEXTCOLOR = 2053814541299040819L;
    public static final long DXCALENDARVIEW_WEEKBARTEXTCOLOR = -3668263311141608587L;

    /* renamed from: a  reason: collision with root package name */
    private String f12097a;
    private String c;
    private int d;
    private int e;
    private String f;
    private String g;
    private String i;
    private int j;
    private CalendarView k;
    private TextView l;
    private JSONArray m;
    private JSONObject n;
    private int r;
    private int t;
    private int u;
    private boolean b = true;
    private int h = -1;
    private boolean o = false;
    private int p = 0;
    private boolean q = true;
    private int s = IndicatorBar.DEFAULT_NORMAL_TEXT_COLOR;
    private boolean v = false;
    private boolean w = false;
    private final CalendarView.f x = new CalendarView.f() { // from class: com.taobao.android.dinamicx.widget.f.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.calander.CalendarView.f
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            f.b(f.this).setText(String.format(Locale.getDefault(), "%d年%d月", Integer.valueOf(i), Integer.valueOf(i2)));
            f.a(f.this).updateMonthArrowStatus();
        }
    };
    private final CalendarView.g y = new CalendarView.g() { // from class: com.taobao.android.dinamicx.widget.f.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.calander.CalendarView.g
        public void a(Calendar calendar, String str, Pair<String, String> pair) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37af8bb8", new Object[]{this, calendar, str, pair});
                return;
            }
            DXOnCalendarMonthUIRangeChangeEvent dXOnCalendarMonthUIRangeChangeEvent = new DXOnCalendarMonthUIRangeChangeEvent(f.DXCALENDARVIEW_ONMONTHCHANGE);
            if (calendar != null) {
                dXOnCalendarMonthUIRangeChangeEvent.setData("selectedDate", calendar.getDateString());
            }
            if (!TextUtils.isEmpty(str)) {
                dXOnCalendarMonthUIRangeChangeEvent.setData("anchorDate", str);
            }
            if (pair == null) {
                return;
            }
            dXOnCalendarMonthUIRangeChangeEvent.setData("startDate", (String) pair.first);
            dXOnCalendarMonthUIRangeChangeEvent.setData("endDate", (String) pair.second);
            f.this.postEvent(dXOnCalendarMonthUIRangeChangeEvent);
        }
    };

    static {
        kge.a(1300002485);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ CalendarView a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CalendarView) ipChange.ipc$dispatch("f104ea18", new Object[]{fVar}) : fVar.k;
    }

    public static /* synthetic */ TextView b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("8e13621e", new Object[]{fVar}) : fVar.l;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2108672140);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new f();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new f();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof f)) {
        } else {
            super.onClone(dXWidgetNode, z);
            f fVar = (f) dXWidgetNode;
            this.j = fVar.j;
            this.c = fVar.c;
            this.e = fVar.e;
            this.p = fVar.p;
            this.f = fVar.f;
            this.h = fVar.h;
            this.i = fVar.i;
            this.m = fVar.m;
            this.n = fVar.n;
            this.q = fVar.q;
            this.b = fVar.b;
            this.f12097a = fVar.f12097a;
            this.g = fVar.g;
            this.d = fVar.d;
            this.r = fVar.r;
            this.s = fVar.s;
            this.t = fVar.t;
            this.u = fVar.u;
            this.v = fVar.v;
            this.w = fVar.w;
            this.o = fVar.o;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        View a2 = com.taobao.android.dinamicx.widget.scroller.a.a(context, R.layout.datepicker_widget);
        this.k = (CalendarView) a2.findViewById(R.id.calendarView);
        this.l = (TextView) a2.findViewById(R.id.tv_cur_month);
        ImageView imageView = (ImageView) a2.findViewById(R.id.iv_left);
        ImageView imageView2 = (ImageView) a2.findViewById(R.id.iv_right);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.dinamicx.widget.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    f.a(f.this).scrollToPre(true);
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.dinamicx.widget.f.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    f.a(f.this).scrollToNext(true);
                }
            }
        });
        int i = this.e;
        if (i != 0) {
            this.k.setDayTextSize(i);
        }
        int i2 = this.d;
        if (i2 != 0) {
            this.k.setCurrentDayTextSize(i2);
        }
        this.k.setCalendarItemHeight(this.j);
        this.k.setOnMonthChangeListener(this.x);
        this.k.setOnMonthUIRangeChangeListener(this.y);
        a2.setTag(R.id.dx_date_picker_view_tag, this.k);
        this.k.setTag(R.id.iv_left, imageView);
        this.k.setTag(R.id.iv_right, imageView2);
        return a2;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view == null) {
            return;
        }
        if (this.k == null) {
            Object tag = view.getTag(R.id.dx_date_picker_view_tag);
            if (tag instanceof CalendarView) {
                this.k = (CalendarView) tag;
            }
        }
        if (this.v) {
            this.k.setItemTopPadding(this.u);
        }
        if (this.w) {
            this.k.setItemBottomPadding(this.t);
        }
        this.k.setHighLightCurrentDayUnSelected(this.o);
        this.k.setSelectedTextColor(this.h);
        this.k.setWeekBarTextColor(this.s);
        this.k.setDateTopGap(this.r);
        this.k.setDateTextGravity(this.p);
        this.k.setDateTextFont(this.g);
        this.k.setScrollable(this.q);
        this.k.setAutoChangeMonth(this.b);
        this.k.setOnCalendarSelectListener(new b());
        Calendar a2 = a(this.c);
        Calendar a3 = a(this.f);
        Calendar a4 = a(this.f12097a);
        List<Pair<Calendar, Calendar>> a5 = a();
        HashMap<String, Calendar> b2 = b();
        if (a2 != null) {
            int year = a2.getYear();
            int month = a2.getMonth();
            i3 = a2.getDay();
            i = year;
            i2 = month;
        } else {
            i = 1971;
            i2 = 1;
            i3 = 1;
        }
        if (a3 != null) {
            int year2 = a3.getYear();
            int month2 = a3.getMonth();
            i4 = year2;
            i6 = a3.getDay();
            i5 = month2;
        } else {
            i4 = 2055;
            i5 = 12;
            i6 = -1;
        }
        this.k.setAnchorCalendar(a4);
        this.k.setRange(i, i2, i3, i4, i5, i6, a5, b2);
        if (a4 != null) {
            this.k.scrollToCalendar(a4.getYear(), a4.getMonth(), a4.getDay(), false, false, false);
            return;
        }
        Calendar a6 = a(this.i);
        if (a6 != null && this.k.isInRange(a6)) {
            this.k.scrollToCalendar(a6.getYear(), a6.getMonth(), a6.getDay());
        } else {
            this.k.scrollToCalendar(i, i2, i3, false, false, false);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(i, i2);
        } else {
            int a2 = com.taobao.android.dinamicx.widget.calander.a.a(getDXRuntimeContext().m(), 50.0f);
            int i3 = this.j;
            if (i3 <= 0) {
                i3 = com.taobao.android.dinamicx.widget.calander.a.a(getDXRuntimeContext().m(), 56.0f);
            }
            setMeasuredDimension(i, a2 + com.taobao.android.dinamicx.widget.calander.a.a(getDXRuntimeContext().m(), 40.0f) + this.r + (i3 * 6));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXCALENDARVIEW_DISABLEDDATES) {
            this.m = jSONArray;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == DXCALENDARVIEW_HIGHLIGHTDATES) {
            this.n = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXCALENDARVIEW_ANCHORDATE) {
            this.f12097a = str;
        } else if (j == DXCALENDARVIEW_BEGINDATE) {
            this.c = str;
        } else if (j == DXCALENDARVIEW_ENDDATE) {
            this.f = str;
        } else if (j == 34149272427L) {
            this.g = str;
        } else if (j == 792202854466360275L) {
            this.i = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXCALENDARVIEW_AUTOCHANGEMONTH) {
            if (i != 0) {
                z = true;
            }
            this.b = z;
        } else if (j == DXCALENDARVIEW_CALENDARITEMHEIGHT) {
            this.j = i;
        } else if (j == DXCALENDARVIEW_CURRENTDAYTEXTSIZE) {
            this.d = i;
        } else if (j == DXCALENDARVIEW_DATETOPGAP) {
            this.r = i;
        } else if (j == DXCALENDARVIEW_DAYTEXTGRAVITY) {
            this.p = i;
        } else if (j == DXCALENDARVIEW_DAYTEXTSIZE) {
            this.e = i;
        } else if (j == DXCALENDARVIEW_HIGHLIGHTCURRENTDAYUNSELECTED) {
            if (i != 0) {
                z = true;
            }
            this.o = z;
        } else if (j == DXCALENDARVIEW_ITEMBOTTOMPADDING) {
            this.t = i;
            this.v = true;
        } else if (j == DXCALENDARVIEW_ITEMTOPPADDING) {
            this.u = i;
            this.w = true;
        } else if (j == 2053814541299040819L) {
            this.h = i;
        } else if (j == DXCALENDARVIEW_SCROLLABLE) {
            if (i != 0) {
                z = true;
            }
            this.q = z;
        } else if (j == DXCALENDARVIEW_WEEKBARTEXTCOLOR) {
            this.s = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    private List<Pair<Calendar, Calendar>> a() {
        Calendar a2;
        Calendar a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        JSONArray jSONArray = this.m;
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.m.size(); i++) {
            String string = this.m.getString(i);
            if (!TextUtils.isEmpty(string)) {
                String[] split = string.split(",");
                if (split.length == 2 && (a2 = a(split[0])) != null && (a3 = a(split[1])) != null) {
                    arrayList.add(new Pair(a2, a3));
                }
            }
        }
        return arrayList;
    }

    private HashMap<String, Calendar> b() {
        String key;
        Calendar a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        HashMap<String, Calendar> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : this.n.entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof JSONObject) && (a2 = a((key = entry.getKey()))) != null) {
                JSONObject jSONObject2 = (JSONObject) value;
                a2.setBooked(jSONObject2.getBooleanValue("booked"));
                JSONObject jSONObject3 = jSONObject2.getJSONObject("activityInfo");
                if (jSONObject3 != null) {
                    Calendar.a aVar = new Calendar.a();
                    aVar.f12088a = jSONObject3.getString("title");
                    aVar.b = jSONObject3.getString("color");
                    a2.setCalendarInfo(aVar);
                }
                hashMap.put(key, a2);
            }
        }
        return hashMap;
    }

    private Calendar a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("8417e994", new Object[]{this, str});
        }
        if (!b(str)) {
            return null;
        }
        int parseInt = Integer.parseInt(str.substring(0, 4));
        int parseInt2 = Integer.parseInt(str.substring(5, 7));
        int parseInt3 = Integer.parseInt(str.substring(8, 10));
        Calendar calendar = new Calendar();
        calendar.setYear(parseInt);
        calendar.setMonth(parseInt2);
        calendar.setDay(parseInt3);
        return calendar;
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : !TextUtils.isEmpty(str) && Pattern.matches("(\\d{4})-((0[1-9])|(1[0-2]))-(([0-2][1-9])|3[0-1]|([1-2]0))", str);
    }

    /* loaded from: classes5.dex */
    public class b implements CalendarView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1650708757);
            kge.a(-521441395);
        }

        private b() {
        }

        @Override // com.taobao.android.dinamicx.widget.calander.CalendarView.c
        public void a(Calendar calendar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d17218", new Object[]{this, calendar});
            } else if (!f.a(f.this).isDisable(calendar)) {
            } else {
                DXEvent dXEvent = new DXEvent(f.DXCALENDARVIEW_ONTAPDISABLEDATE);
                HashMap hashMap = new HashMap();
                hashMap.put("disableDate", com.taobao.android.dinamicx.expression.expr_v2.f.a(calendar.getDateString()));
                dXEvent.setArgs(hashMap);
                f.this.postEvent(dXEvent);
            }
        }

        @Override // com.taobao.android.dinamicx.widget.calander.CalendarView.c
        public void a(Calendar calendar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b45d83bc", new Object[]{this, calendar, new Boolean(z)});
            } else if (!z) {
            } else {
                DXOnSelectDateEvent dXOnSelectDateEvent = new DXOnSelectDateEvent(5288679823228297259L);
                dXOnSelectDateEvent.addData("selectedDate", calendar.getDateString());
                f.this.postEvent(dXOnSelectDateEvent);
            }
        }
    }
}
