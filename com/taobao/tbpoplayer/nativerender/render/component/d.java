package com.taobao.tbpoplayer.nativerender.render.component;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.utils.i;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.CounterModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.CounterStyleModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import com.taobao.tbpoplayer.nativerender.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes8.dex */
public class d extends c<CounterModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView e;
    private CountDownTimer f;
    private long g;
    private long h;
    private boolean i;
    private volatile boolean j;
    private boolean k;
    private String l;
    private List<String> m;
    private volatile boolean n;

    static {
        kge.a(-477984197);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -650670720) {
            if (hashCode == 91915241) {
                super.b();
                return null;
            } else if (hashCode != 92838762) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.c();
                return null;
            }
        }
        return new Boolean(super.a((String) objArr[0], (String) objArr[1]));
    }

    public static /* synthetic */ void lambda$5kucZMK2j7r3YvOU8hUQV1RwUiQ(d dVar) {
        dVar.p();
    }

    public static /* synthetic */ void lambda$pVDoi7k8M7INs3ACdc6MVOSd8cE(d dVar) {
        dVar.o();
    }

    public static /* synthetic */ long a(d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5021f1ec", new Object[]{dVar, new Long(j)})).longValue();
        }
        dVar.g = j;
        return j;
    }

    public static /* synthetic */ CountDownTimer a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownTimer) ipChange.ipc$dispatch("8fcd205e", new Object[]{dVar}) : dVar.f;
    }

    public static /* synthetic */ void b(d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a979279", new Object[]{dVar, new Long(j)});
        } else {
            dVar.a(j);
        }
    }

    public d(com.taobao.tbpoplayer.nativerender.e eVar, CounterModel counterModel, boolean z) {
        super(eVar, counterModel, z);
        this.n = false;
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public StyleModel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StyleModel) ipChange.ipc$dispatch("815a627d", new Object[]{this});
        }
        if (this.b == 0) {
            return null;
        }
        return ((CounterModel) this.b).style;
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        TextView textView = new TextView(context);
        this.e = textView;
        i l = this.f22246a.l();
        CounterStyleModel counterStyleModel = ((CounterModel) this.b).style;
        a(textView, ((CounterModel) this.b).style);
        textView.setIncludeFontPadding(false);
        textView.setLines(1);
        try {
            textView.setTextSize(0, l.a(context, Float.parseFloat(counterStyleModel.fontSize)));
            if (!StringUtils.isEmpty(counterStyleModel.color)) {
                try {
                    textView.setTextColor(Color.parseColor(counterStyleModel.color));
                } catch (Throwable th) {
                    com.alibaba.poplayer.utils.c.a("PopTextComponent.parseColor.textColor.error.", th);
                    com.taobao.tbpoplayer.nativerender.e eVar = this.f22246a;
                    eVar.a("COUNTER_COLOR_INVALID.ID=" + ((CounterModel) this.b).id, String.valueOf(th.getMessage()));
                    return textView;
                }
            }
            float parseFloat = !StringUtils.isEmpty(counterStyleModel.lineHeight) ? Float.parseFloat(counterStyleModel.lineHeight) : 0.0f;
            if (parseFloat > 0.0f && Build.VERSION.SDK_INT >= 28) {
                textView.setLineHeight((int) l.a(context, parseFloat));
            }
            if ("bold".equals(counterStyleModel.fontWeight) || "bolder".equals(counterStyleModel.fontWeight)) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            }
            if (Build.VERSION.SDK_INT >= 17) {
                if ("center".equals(counterStyleModel.textAlign)) {
                    textView.setGravity(17);
                } else if ("left".equals(counterStyleModel.textAlign)) {
                    textView.setGravity(19);
                } else if ("right".equals(counterStyleModel.textAlign)) {
                    textView.setGravity(21);
                }
            }
            h();
            i();
            return textView;
        } catch (Throwable th2) {
            com.alibaba.poplayer.utils.c.a("PopTextComponent.parseFontSize.error.", th2);
            com.taobao.tbpoplayer.nativerender.e eVar2 = this.f22246a;
            eVar2.a("COUNTER_SIZE_INVALID.ID=" + ((CounterModel) this.b).id, String.valueOf(th2.getMessage()));
            return textView;
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            String str = ((CounterModel) this.b).format;
            if (StringUtils.isEmpty(str)) {
                str = ((CounterModel) this.b).showMilliseconds ? "{0H}:{0m}:{0s}.{n}" : "{0H}:{0m}:{0s}";
            }
            Matcher matcher = Pattern.compile("\\{[0]*[d,h,H,m,s,n]\\}").matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            this.m = new ArrayList();
            while (matcher.find()) {
                String group = matcher.group();
                this.m.add(group);
                if ("{n}".equals(group) || "{0n}".equals(group)) {
                    this.i = true;
                }
                matcher.appendReplacement(stringBuffer, "%s");
            }
            matcher.appendTail(stringBuffer);
            this.l = stringBuffer.toString();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopCounterComponent.initFormat.error", th);
            this.f22246a.a("CounterFormatError", "");
        }
    }

    private void i() {
        Long b;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        Long b2 = p.b(this.f22246a, ((CounterModel) this.b).endTime);
        if ("curTime".equals(((CounterModel) this.b).serverTime)) {
            b = Long.valueOf(PopLayer.getReference().getCurrentTimeStamp(false));
        } else {
            b = p.b(this.f22246a, ((CounterModel) this.b).serverTime);
        }
        long longValue = (b == null || b2 == null) ? 0L : b2.longValue() - b.longValue();
        if (longValue < 0) {
            longValue = 0;
        }
        this.g = longValue;
        long j = ((longValue / 1000) / 3600) / 24;
        if (((CounterModel) this.b).marginalValue <= 0 || j < ((CounterModel) this.b).marginalValue) {
            z = false;
        }
        this.k = z;
        j();
    }

    private void a(long j) {
        Iterator<String> it;
        char c;
        float a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        long j2 = j / 1000;
        long j3 = j2 / 3600;
        long j4 = j3 / 24;
        if (this.k) {
            TextView textView = this.e;
            textView.setText((j4 + 1) + "天");
        } else {
            long j5 = j3 % 24;
            long j6 = (j2 / 60) % 60;
            long j7 = j2 % 60;
            long j8 = (j % 1000) / 100;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = this.m.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                switch (next.hashCode()) {
                    case 120560:
                        it = it2;
                        if (next.equals("{H}")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 121428:
                        it = it2;
                        if (next.equals("{d}")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 121552:
                        it = it2;
                        if (next.equals("{h}")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 121707:
                        it = it2;
                        if (next.equals("{m}")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 121738:
                        it = it2;
                        if (next.equals("{n}")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 121893:
                        it = it2;
                        if (next.equals("{s}")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3712778:
                        it = it2;
                        if (next.equals("{0H}")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3713646:
                        it = it2;
                        if (next.equals("{0d}")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3713770:
                        it = it2;
                        if (next.equals("{0h}")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3713925:
                        it = it2;
                        if (next.equals("{0m}")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3713956:
                        it = it2;
                        if (next.equals("{0n}")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3714111:
                        it = it2;
                        if (next.equals("{0s}")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        it = it2;
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        arrayList.add(a(j4, false));
                        break;
                    case 1:
                        arrayList.add(a(j3, false));
                        break;
                    case 2:
                        arrayList.add(a(j5, false));
                        break;
                    case 3:
                        arrayList.add(a(j6, false));
                        break;
                    case 4:
                        arrayList.add(a(j7, false));
                        break;
                    case 5:
                        arrayList.add(a(j4, true));
                        break;
                    case 6:
                        arrayList.add(a(j3, true));
                        break;
                    case 7:
                        arrayList.add(a(j5, true));
                        break;
                    case '\b':
                        arrayList.add(a(j6, true));
                        break;
                    case '\t':
                        arrayList.add(a(j7, true));
                        break;
                    case '\n':
                    case 11:
                        arrayList.add(a(j8, false));
                        break;
                }
                it2 = it;
            }
            this.e.setText(String.format(this.l, arrayList.toArray()));
        }
        if (!"auto".equals(((CounterModel) this.b).style.width) || this.j) {
            return;
        }
        this.e.measure(0, 0);
        if (!StringUtils.isEmpty(((CounterModel) this.b).style.appendWidth)) {
            a2 = this.f22246a.l().a(this.f22246a.a().a(), Float.parseFloat(((CounterModel) this.b).style.appendWidth));
        } else {
            a2 = this.f22246a.l().a(this.f22246a.a().a(), 3.0f);
        }
        TextView textView2 = this.e;
        textView2.setWidth(textView2.getMeasuredWidth() + ((int) a2));
        this.j = true;
    }

    private String a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c07bca8", new Object[]{this, new Long(j), new Boolean(z)});
        }
        if (j < 0) {
            j = 0;
        }
        if (z && j < 10) {
            return "0" + j;
        }
        return String.valueOf(j);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.f22246a.a(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$d$5kucZMK2j7r3YvOU8hUQV1RwUiQ
                {
                    d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    d.lambda$5kucZMK2j7r3YvOU8hUQV1RwUiQ(d.this);
                }
            });
        }
    }

    public /* synthetic */ void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a("PopCounterComponent.startCountDownTimer.leftTime=%s", Long.valueOf(this.g));
            a(this.g);
            if (!((CounterModel) this.b).autoStart) {
                return;
            }
            k();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        CountDownTimer countDownTimer = this.f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.n) {
        } else {
            k();
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            this.f22246a.a(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.render.component.-$$Lambda$d$pVDoi7k8M7INs3ACdc6MVOSd8cE
                {
                    d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    d.lambda$pVDoi7k8M7INs3ACdc6MVOSd8cE(d.this);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.tbpoplayer.nativerender.render.component.d$1] */
    public /* synthetic */ void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.f = new CountDownTimer(this.g, this.i ? 100L : 1000L) { // from class: com.taobao.tbpoplayer.nativerender.render.component.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                d.this = this;
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                } else if (d.this.f22246a.a().g()) {
                    d.a(d.this).cancel();
                } else {
                    d.a(d.this, j);
                    d.b(d.this, j);
                }
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                    return;
                }
                d.b(d.this, 0L);
                d.this.f22246a.a(d.this.b, "timeout", ((CounterModel) d.this.b).action, ((CounterModel) d.this.b).actions);
            }
        }.start();
        this.n = true;
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        com.alibaba.poplayer.utils.c.a("PopCounterComponent.onActivityResumed", new Object[0]);
        if (this.h <= 0) {
            return;
        }
        CountDownTimer countDownTimer = this.f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.g -= SystemClock.elapsedRealtime() - this.h;
        if (this.g < 0) {
            this.g = 0L;
        }
        this.h = 0L;
        j();
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        com.alibaba.poplayer.utils.c.a("PopCounterComponent.onActivityPaused", new Object[0]);
        if (this.f == null) {
            return;
        }
        this.h = SystemClock.elapsedRealtime();
        this.f.cancel();
    }

    @Override // com.taobao.tbpoplayer.nativerender.render.component.c
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        boolean a2 = super.a(str, str2);
        if (!a2) {
            return a2;
        }
        try {
            String string = JSONObject.parseObject(str2).getString("message");
            if ("counterStart".equals(string)) {
                if (this.n) {
                    return a2;
                }
                l();
                this.n = true;
                return a2;
            } else if (!"counterCancel".equals(string)) {
                return false;
            } else {
                if (!this.n) {
                    return a2;
                }
                if (this.f != null) {
                    this.f.cancel();
                }
                this.n = false;
                return a2;
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopCounterComponent.onComponentBroadcast.error", th);
            return a2;
        }
    }
}
