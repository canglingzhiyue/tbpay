package com.taobao.android.weex_uikit.ui;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes6.dex */
public class y extends x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Set<String> g;
    private boolean h;

    static {
        kge.a(1074006896);
    }

    public static /* synthetic */ Object ipc$super(y yVar, String str, Object... objArr) {
        if (str.hashCode() == 1620593090) {
            super.a((x) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public y(UINode uINode) {
        super(uINode);
        this.g = new HashSet();
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a("transform", "");
        a("transition", "");
        a("ariaLabel", "");
        a("ariaHidden", false);
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.h) {
        } else {
            b("padding", new Rect(this.f));
            this.h = false;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (i() != i) {
            this.e.left = i;
            z = true;
        }
        if (o() != i2) {
            this.e.top = i2;
            z = true;
        }
        if (p() != i3) {
            this.e.right = i3;
            z = true;
        }
        if (q() != i4) {
            this.e.bottom = i4;
            z = true;
        }
        if (!z) {
            return;
        }
        b("location", new Rect(this.e));
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public void b(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315a9029", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        a(i);
        b(i2);
        c(i3);
        d(i4);
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (r() == i) {
        } else {
            this.f.left = i;
            this.h = true;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (s() == i) {
        } else {
            this.f.top = i;
            this.h = true;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (t() == i) {
        } else {
            this.f.right = i;
            this.h = true;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (u() == i) {
        } else {
            this.f.bottom = i;
            this.h = true;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        this.g.add(str);
        b("events", this.g);
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            return;
        }
        this.g.remove(str);
        b("events", this.g);
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public Rect h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("806ff4f8", new Object[]{this}) : this.e;
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.e.left;
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.e.top;
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : this.e.right;
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue() : this.e.bottom;
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : this.f.left;
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public int s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue() : this.f.top;
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue() : this.f.right;
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public int u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue() : this.f.bottom;
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public Rect v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("a2dedf86", new Object[]{this}) : this.f;
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public Set<String> w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("4cbbd8ed", new Object[]{this}) : this.g;
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public int y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue() : h().width();
    }

    @Override // com.taobao.android.weex_uikit.ui.x
    public int z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ccb7f4", new Object[]{this})).intValue() : h().height();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.taobao.android.weex_uikit.ui.x, com.taobao.android.weex_uikit.ui.h
    public void a(Map<String, Object> map) {
        Set set;
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        this.f16134a.putAll(map);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        for (String str : map.keySet()) {
            switch (str.hashCode()) {
                case -1998952146:
                    if (str.equals("transitionDelay")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1724158635:
                    if (str.equals("transition")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -1721943862:
                    if (str.equals("translateX")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1721943861:
                    if (str.equals("translateY")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1383304148:
                    if (str.equals("border")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1291329255:
                    if (str.equals("events")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1111969773:
                    if (str.equals("ariaHidden")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -863700117:
                    if (str.equals("ariaLabel")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -806339567:
                    if (str.equals("padding")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -699883785:
                    if (str.equals("transitionTimingFunction")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 425064969:
                    if (str.equals("transitionDuration")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (str.equals("backgroundColor")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (str.equals("backgroundImage")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1423936074:
                    if (str.equals("transitionProperty")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        c = 6;
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
                    z8 = true;
                    break;
                case 1:
                    z3 = true;
                    z4 = true;
                    break;
                case 2:
                    z4 = true;
                    z7 = true;
                    break;
                case 3:
                    z7 = true;
                    z2 = true;
                    z4 = true;
                    break;
                case 4:
                    z2 = true;
                    z4 = true;
                    break;
                case 5:
                    a(true).a((BorderProp) map.get("border"));
                    z5 = true;
                    break;
                case 6:
                    z = true;
                    z4 = true;
                    break;
                case 7:
                case '\b':
                    z4 = true;
                    break;
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                    z7 = true;
                    break;
                case 15:
                case 16:
                    z6 = true;
                    break;
            }
        }
        if ((z || z2) && x() != null) {
            x().setBounds(0, 0, y(), z());
        }
        if (z3) {
            Rect rect = (Rect) map.get("padding");
            if (rect != null) {
                this.f.set(rect);
            }
            this.b.setPadding(v());
        }
        if (z) {
            Rect rect2 = (Rect) map.get("location");
            if (rect2 != null) {
                this.e.set(rect2);
            }
            this.b.notifyLocationChange();
        }
        if (z5) {
            this.b.onBorderChange();
        }
        if (z4 || z5) {
            this.b.invalidate();
        }
        if (z6) {
            this.b.updateAriaLabel();
        }
        if (z7) {
            this.b.tryApplyTransform(true);
        }
        if (!z8 || (set = (Set) map.get("events")) == null) {
            return;
        }
        this.g.clear();
        this.g.addAll(set);
    }

    @Override // com.taobao.android.weex_uikit.ui.x, com.taobao.android.weex_uikit.ui.h
    public void a(x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609849c2", new Object[]{this, xVar});
            return;
        }
        y yVar = (y) xVar;
        yVar.f.set(this.f);
        yVar.e.set(this.e);
        yVar.g.addAll(this.g);
        super.a(xVar);
    }
}
