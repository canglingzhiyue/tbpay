package com.taobao.android.dinamicx.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.fuw;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f11897a;
    private static final Map<String, String> b;
    private static final Map<Double, Double> c;
    private a d;
    private int e = 1;

    /* loaded from: classes.dex */
    public interface a {
        double a(double d);

        int a();

        void a(int i);
    }

    static {
        kge.a(83764876);
        b = new ConcurrentHashMap(512);
        c = new ConcurrentHashMap(512);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e8f696fe", new Object[0]);
        }
        if (f11897a == null) {
            synchronized (c.class) {
                if (f11897a == null) {
                    c cVar = new c();
                    f11897a = cVar;
                    return cVar;
                }
                return f11897a;
            }
        }
        return f11897a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        a aVar = this.d;
        if (aVar == null) {
            return this.e;
        }
        return aVar.a();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.a(i);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1900a3e1", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = i;
        b.clear();
        c.clear();
    }

    public Double a(Double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("fdd36aae", new Object[]{this, d});
        }
        if (this.d == null) {
            return d;
        }
        if (c.containsKey(d)) {
            return c.get(d);
        }
        Double valueOf = Double.valueOf(new BigDecimal(Double.valueOf(this.d.a(d.doubleValue())).doubleValue()).setScale(1, 4).doubleValue());
        c.put(d, valueOf);
        return valueOf;
    }

    public Double a(Double d, Double d2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Double) ipChange.ipc$dispatch("c066f264", new Object[]{this, d, d2}) : this.e == 4 ? d2 : a(d);
    }

    public Double a(Double d, Double d2, Double d3, Double d4, Double d5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("f5118086", new Object[]{this, d, d2, d3, d4, d5});
        }
        int i = this.e;
        return i == 4 ? d5 : i == 3 ? d4 : i == 2 ? d3 : i == 0 ? d : d2;
    }

    public String a(String str) {
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (this.d == null) {
            return str;
        }
        if (b.containsKey(str)) {
            return b.get(str);
        }
        try {
            if (str.contains("np")) {
                Double valueOf = Double.valueOf(this.d.a(Double.valueOf(Double.parseDouble(str.replace("np", ""))).doubleValue()));
                String str2 = String.format(Locale.CHINA, "%.1f", valueOf) + "np";
                b.put(str, str2);
                format = str2;
            } else if (str.contains("ap")) {
                String replace = str.replace("ap", "");
                format = String.format(Locale.CHINA, "%.1f", Double.valueOf(this.d.a(Double.valueOf(Double.parseDouble(replace)).doubleValue())));
                b.put(str, format);
                b.put(replace, format);
            } else {
                format = String.format(Locale.CHINA, "%.1f", Double.valueOf(this.d.a(Double.valueOf(Double.parseDouble(str)).doubleValue())));
                b.put(str, format);
                b.put(str + "ap", format);
            }
            return format;
        } catch (NumberFormatException unused) {
            if (DinamicXEngine.j()) {
                fuw.c("DinamicX", str, "写法错误，解析出错");
            }
            b.put(str, str);
            return str;
        }
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : this.e == 4 ? str2 : a(str);
    }

    public String a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e78d986", new Object[]{this, str, str2, str3, str4, str5});
        }
        int i = this.e;
        return i == 4 ? str5 : i == 3 ? str4 : i == 2 ? str3 : i == 0 ? str : str2;
    }
}
