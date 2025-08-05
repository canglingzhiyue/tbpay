package com.taobao.android.order.core.dinamicX.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import tb.hzy;
import tb.kge;

/* loaded from: classes6.dex */
public class DXBBOrderDatePickerViewWidgetNode extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXBBORDERDATEPICKERVIEW_BBORDERDATEPICKERVIEW = 8907738506336636172L;
    public static final long DXBBORDERDATEPICKERVIEW_MAXIDATE = 4685059529398859573L;
    public static final long DXBBORDERDATEPICKERVIEW_MINDATE = 5101431220141419849L;
    public static final long DXBBORDERDATEPICKERVIEW_SELECTEDDATE = 792202854466360275L;

    /* renamed from: a  reason: collision with root package name */
    public SimpleDateFormat f14614a;
    public SimpleDateFormat b;
    private String c;
    private String d;
    private String e;

    /* loaded from: classes6.dex */
    public interface a {
        void a(int i, int i2, int i3);
    }

    static {
        kge.a(-1389060959);
    }

    public static /* synthetic */ Object ipc$super(DXBBOrderDatePickerViewWidgetNode dXBBOrderDatePickerViewWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
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

    public static /* synthetic */ void a(DXBBOrderDatePickerViewWidgetNode dXBBOrderDatePickerViewWidgetNode, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d8694b", new Object[]{dXBBOrderDatePickerViewWidgetNode, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            dXBBOrderDatePickerViewWidgetNode.a(i, i2, i3);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXBBOrderDatePickerViewWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof DXBBOrderDatePickerViewWidgetNode)) {
        } else {
            super.onClone(dXWidgetNode, z);
            DXBBOrderDatePickerViewWidgetNode dXBBOrderDatePickerViewWidgetNode = (DXBBOrderDatePickerViewWidgetNode) dXWidgetNode;
            this.c = dXBBOrderDatePickerViewWidgetNode.c;
            this.d = dXBBOrderDatePickerViewWidgetNode.d;
            this.e = dXBBOrderDatePickerViewWidgetNode.e;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DatePickerView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof DatePickerView)) {
            return;
        }
        DatePickerView datePickerView = (DatePickerView) view;
        datePickerView.setDate(this.c, this.d, this.e);
        datePickerView.setDateSelectCallback(new a() { // from class: com.taobao.android.order.core.dinamicX.view.DXBBOrderDatePickerViewWidgetNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.order.core.dinamicX.view.DXBBOrderDatePickerViewWidgetNode.a
            public void a(int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                } else {
                    DXBBOrderDatePickerViewWidgetNode.a(DXBBOrderDatePickerViewWidgetNode.this, i, i2, i3);
                }
            }
        });
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    private void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String str = i + "-" + i2 + "-" + i3;
        try {
            if (this.f14614a == null) {
                this.f14614a = new SimpleDateFormat("yyyy-M-d");
            }
            if (this.b == null) {
                this.b = new SimpleDateFormat("yyyy-MM-dd");
            }
            String format = this.b.format(this.f14614a.parse(str));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", (Object) getUserId());
            jSONObject.put("selectedDate", (Object) format);
            getDXRuntimeContext().C().b().l().a("calendarViewEvent", jSONObject);
        } catch (NullPointerException e) {
            hzy.a("ODatePicker", "DatePickerView select date空指针", e);
        } catch (ParseException e2) {
            hzy.a("ODatePicker", "DatePickerView select date出错", e2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXBBORDERDATEPICKERVIEW_MAXIDATE) {
            this.c = str;
        } else if (j == DXBBORDERDATEPICKERVIEW_MINDATE) {
            this.d = str;
        } else if (j == 792202854466360275L) {
            this.e = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    /* loaded from: classes6.dex */
    public static class DatePickerView extends FrameLayout implements NumberPicker.OnValueChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private a callback;
        private int currentDay;
        private int currentMonth;
        private int currentYear;
        private NumberPicker day;
        private int maxDayOfMaxYM;
        private int maxMonthOfMaxYear;
        private int maxYear;
        private int minDayOfMinYM;
        private int minMonthOfMinYear;
        private int minYear;
        private NumberPicker month;
        private NumberPicker year;

        static {
            kge.a(-495160028);
            kge.a(-1685117868);
        }

        public static /* synthetic */ Object ipc$super(DatePickerView datePickerView, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public DatePickerView(Context context) {
            super(context);
            LayoutInflater.from(context).inflate(R.layout.babel_layout_date_picker, this);
            this.year = (NumberPicker) findViewById(R.id.yearPicker);
            this.month = (NumberPicker) findViewById(R.id.mouthPicker);
            this.day = (NumberPicker) findViewById(R.id.dayPicker);
            this.year.setOnValueChangedListener(this);
            this.month.setOnValueChangedListener(this);
            this.day.setOnValueChangedListener(this);
            this.day.setDescendantFocusability(393216);
            this.year.setDescendantFocusability(393216);
            this.month.setDescendantFocusability(393216);
        }

        public void setDate(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bca2fe55", new Object[]{this, str, str2, str3});
            } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            } else {
                try {
                    String[] split = str2.split("-");
                    if (split.length >= 3) {
                        this.minYear = Integer.parseInt(split[0]);
                        this.minMonthOfMinYear = Integer.parseInt(split[1]);
                        this.minDayOfMinYM = Integer.parseInt(split[2]);
                    }
                    String[] split2 = str.split("-");
                    if (split2.length >= 3) {
                        this.maxYear = Integer.parseInt(split2[0]);
                        this.maxMonthOfMaxYear = Integer.parseInt(split2[1]);
                        this.maxDayOfMaxYM = Integer.parseInt(split2[2]);
                    }
                    String[] split3 = str3.split("-");
                    if (split3.length >= 3) {
                        this.currentYear = Integer.parseInt(split3[0]);
                        this.currentMonth = Integer.parseInt(split3[1]);
                        this.currentDay = Integer.parseInt(split3[2]);
                    }
                } catch (NumberFormatException e) {
                    hzy.a("ODatePicker", "setMinDate", e);
                }
                this.year.setMinValue(this.minYear);
                this.year.setMaxValue(this.maxYear);
                this.year.setValue(this.currentYear);
                updateMonth();
                this.month.setValue(this.currentMonth);
                updateDay();
                this.day.setValue(this.currentDay);
            }
        }

        public void setDateSelectCallback(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("520b762b", new Object[]{this, aVar});
            } else {
                this.callback = aVar;
            }
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c37d7836", new Object[]{this, numberPicker, new Integer(i), new Integer(i2)});
                return;
            }
            this.currentYear = this.year.getValue();
            updateMD();
            a aVar = this.callback;
            if (aVar == null) {
                return;
            }
            aVar.a(this.year.getValue(), this.month.getValue(), this.day.getValue());
        }

        private void updateMD() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baf3a8a7", new Object[]{this});
                return;
            }
            updateMonth();
            this.currentMonth = this.month.getValue();
            updateDay();
            this.currentDay = this.day.getValue();
        }

        private void updateMonth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa4f203e", new Object[]{this});
                return;
            }
            int i = this.maxYear;
            int i2 = this.minYear;
            if (i == i2) {
                this.month.setMinValue(this.minMonthOfMinYear);
                this.month.setMaxValue(this.maxMonthOfMaxYear);
                return;
            }
            int i3 = this.currentYear;
            if (i3 == i2) {
                this.month.setMinValue(this.minMonthOfMinYear);
                this.month.setMaxValue(12);
            } else if (i3 == i) {
                this.month.setMinValue(1);
                this.month.setMaxValue(this.maxMonthOfMaxYear);
            } else {
                this.month.setMinValue(1);
                this.month.setMaxValue(12);
            }
        }

        private void updateDay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd09751a", new Object[]{this});
                return;
            }
            this.day.setMinValue((this.currentYear == this.minYear && this.currentMonth == this.minMonthOfMinYear) ? this.minDayOfMinYM : 1);
            if (this.minYear == this.maxYear && this.minMonthOfMinYear == this.maxMonthOfMaxYear) {
                this.day.setMinValue(this.minDayOfMinYM);
                this.day.setMaxValue(this.maxDayOfMaxYM);
            } else if (this.currentYear == this.maxYear && this.currentMonth == this.maxMonthOfMaxYear) {
                this.day.setMaxValue(this.maxDayOfMaxYM);
                this.day.setMinValue(1);
            } else {
                int i = this.currentMonth;
                if (i == 2) {
                    NumberPicker numberPicker = this.day;
                    int i2 = this.currentYear;
                    numberPicker.setMaxValue(((i2 % 4 != 0 || i2 % 100 == 0) && this.currentYear % 400 != 0) ? 28 : 29);
                    return;
                }
                this.day.setMaxValue((i == 4 || i == 6 || i == 9 || i == 11) ? 30 : 31);
            }
        }
    }
}
