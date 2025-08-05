package com.taobao.android.weex_uikit.ui;

import android.graphics.Rect;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.MUSConstants;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.jwx;
import tb.kge;

/* loaded from: classes6.dex */
public class x extends h<x> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BorderProp d;
    public final Rect e;
    public final Rect f;

    static {
        kge.a(32927719);
    }

    public static /* synthetic */ Object ipc$super(x xVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1514279453) {
            super.a((Map) objArr[0]);
            return null;
        } else if (hashCode != 1620116434) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((x) objArr[0]);
            return null;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public x(UINode uINode) {
        super(uINode);
        this.e = new Rect();
        this.f = new Rect();
        b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a("events", new HashSet());
        a("paddingLeft", 0);
        a("paddingTop", 0);
        a("paddingRight", 0);
        a("paddingBottom", 0);
        a("left", 0);
        a("top", 0);
        a("right", 0);
        a("bottom", 0);
        a("transform", "");
        a("transition", "");
        a("ariaLabel", "");
        a("ariaHidden", false);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            b("ariaLabel", str);
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (i() != i) {
            b("left", Integer.valueOf(i));
        }
        if (o() != i2) {
            b("top", Integer.valueOf(i2));
        }
        if (p() != i3) {
            b("right", Integer.valueOf(i3));
        }
        if (q() == i4) {
            return;
        }
        b("bottom", Integer.valueOf(i4));
    }

    public void b(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315a9029", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (r() != i) {
            b("paddingLeft", Integer.valueOf(i));
        }
        if (s() != i2) {
            b("paddingTop", Integer.valueOf(i2));
        }
        if (t() != i3) {
            b("paddingRight", Integer.valueOf(i3));
        }
        if (u() == i4) {
            return;
        }
        b("paddingBottom", Integer.valueOf(i4));
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (r() == i) {
        } else {
            b("paddingLeft", Integer.valueOf(i));
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (s() == i) {
        } else {
            b("paddingTop", Integer.valueOf(i));
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (t() == i) {
        } else {
            b("paddingRight", Integer.valueOf(i));
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (u() == i) {
        } else {
            b("paddingBottom", Integer.valueOf(i));
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (TextUtils.equals(str, n())) {
        } else {
            b("transform", str);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (TextUtils.equals(str, j())) {
        } else {
            b("transition", str);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else if (TextUtils.equals(str, c())) {
        } else {
            b("transitionProperty", str);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else if (TextUtils.equals(str, d())) {
        } else {
            b("transitionDuration", str);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else if (TextUtils.equals(str, e())) {
        } else {
            b("transitionDelay", str);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else if (TextUtils.equals(str, f())) {
        } else {
            b("transitionTimingFunction", str);
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : (String) a("transitionProperty");
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : (String) a("transitionDuration");
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : (String) a("transitionDelay");
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : (String) a("transitionTimingFunction");
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            b("opacity", Float.valueOf(f));
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        jwx x = x();
        if (x == null) {
            return;
        }
        x.a(i);
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        Set<String> w = w();
        w.add(str);
        b("events", w);
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            return;
        }
        Set<String> w = w();
        w.remove(str);
        b("events", w);
    }

    public boolean k(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d99648c0", new Object[]{this, str})).booleanValue() : w().contains(str);
    }

    public BorderProp a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BorderProp) ipChange.ipc$dispatch("5cd9bbfa", new Object[]{this, new Boolean(z)});
        }
        if (z && this.d == null) {
            this.d = new BorderProp();
        }
        return this.d;
    }

    public void a(jwx jwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03b1a2d", new Object[]{this, jwxVar});
        } else {
            b("backgroundImage", jwxVar);
        }
    }

    public void b(jwx jwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("debe20ae", new Object[]{this, jwxVar});
            return;
        }
        jwx jwxVar2 = (jwx) a("backgroundColor");
        if (jwxVar2 != null && jwxVar != null) {
            jwxVar.a(jwxVar2.b());
        }
        b("backgroundColor", jwxVar);
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
        } else {
            b(MUSConstants.ARIA_ROLE, str);
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : (String) a(MUSConstants.ARIA_ROLE);
    }

    public Rect h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("806ff4f8", new Object[]{this});
        }
        this.e.set(i(), o(), p(), q());
        return this.e;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : ((Integer) a("left")).intValue();
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : (String) a("transition");
    }

    public String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : (String) a("transform");
    }

    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : ((Integer) a("top")).intValue();
    }

    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : ((Integer) a("right")).intValue();
    }

    public int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue() : ((Integer) a("bottom")).intValue();
    }

    public int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : ((Integer) a("paddingLeft")).intValue();
    }

    public int s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue() : ((Integer) a("paddingTop")).intValue();
    }

    public int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue() : ((Integer) a("paddingRight")).intValue();
    }

    public int u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue() : ((Integer) a("paddingBottom")).intValue();
    }

    public Rect v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("a2dedf86", new Object[]{this});
        }
        this.f.set(r(), s(), t(), u());
        return this.f;
    }

    public Set<String> w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("4cbbd8ed", new Object[]{this}) : (Set) a("events");
    }

    public jwx x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jwx) ipChange.ipc$dispatch("bffc7d3c", new Object[]{this});
        }
        jwx jwxVar = (jwx) a("backgroundImage");
        return jwxVar != null ? jwxVar : (jwx) a("backgroundColor");
    }

    public int y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue() : h().width();
    }

    public int z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ccb7f4", new Object[]{this})).intValue() : h().height();
    }

    public float A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a97c38", new Object[]{this})).floatValue();
        }
        Float f = (Float) a("opacity");
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b793bc", new Object[]{this})).intValue();
        }
        jwx x = x();
        if (x == null) {
            return 0;
        }
        return x.b();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            b("ariaHidden", Boolean.valueOf(z));
        }
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : ((Boolean) a("ariaHidden")).booleanValue();
    }

    @Override // com.taobao.android.weex_uikit.ui.h
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.d == null || !this.c) {
        } else {
            this.d.e(y(), z());
            if (!this.d.a()) {
                return;
            }
            b("border", this.d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.taobao.android.weex_uikit.ui.h
    public void a(Map<String, Object> map) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        super.a(map);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        for (String str : map.keySet()) {
            switch (str.hashCode()) {
                case -1998952146:
                    if (str.equals("transitionDelay")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1724158635:
                    if (str.equals("transition")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -1721943862:
                    if (str.equals("translateX")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1721943861:
                    if (str.equals("translateY")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1501175880:
                    if (str.equals("paddingLeft")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1383304148:
                    if (str.equals("border")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1111969773:
                    if (str.equals("ariaHidden")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -863700117:
                    if (str.equals("ariaLabel")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -699883785:
                    if (str.equals("transitionTimingFunction")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 90130308:
                    if (str.equals("paddingTop")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 202355100:
                    if (str.equals("paddingBottom")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 425064969:
                    if (str.equals("transitionDuration")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 713848971:
                    if (str.equals("paddingRight")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (str.equals("backgroundColor")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (str.equals("backgroundImage")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1423936074:
                    if (str.equals("transitionProperty")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                    z3 = true;
                    z5 = true;
                    break;
                case 4:
                    z5 = true;
                    z7 = true;
                    break;
                case 5:
                    z7 = true;
                    z2 = true;
                    z5 = true;
                    break;
                case 6:
                    z2 = true;
                    z5 = true;
                    break;
                case 7:
                    a(true).a((BorderProp) map.get("border"));
                    z4 = true;
                    break;
                case '\b':
                case '\t':
                case '\n':
                case 11:
                    z = true;
                    z5 = true;
                    break;
                case '\f':
                case '\r':
                    z5 = true;
                    break;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    z7 = true;
                    break;
                case 20:
                case 21:
                    z6 = true;
                    break;
            }
        }
        if ((z || z2) && x() != null) {
            x().setBounds(0, 0, y(), z());
        }
        if (z3) {
            this.b.setPadding(v());
        }
        if (z) {
            this.b.notifyLocationChange();
        }
        if (z4) {
            this.b.onBorderChange();
        }
        if (z5 || z4) {
            this.b.invalidate();
        }
        if (z6) {
            this.b.updateAriaLabel();
        }
        if (!z7) {
            return;
        }
        this.b.tryApplyTransform(true);
    }

    public String D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d0c135", new Object[]{this}) : (String) a("ariaLabel");
    }

    @Override // com.taobao.android.weex_uikit.ui.h
    public void a(x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609849c2", new Object[]{this, xVar});
            return;
        }
        super.a(xVar);
        if (this.d == null) {
            return;
        }
        xVar.d = new BorderProp();
        xVar.d.a(this.d);
    }
}
