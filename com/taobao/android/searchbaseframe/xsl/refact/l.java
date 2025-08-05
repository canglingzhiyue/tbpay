package com.taobao.android.searchbaseframe.xsl.refact;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.iru;
import tb.itl;
import tb.itm;
import tb.iuk;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;

/* loaded from: classes6.dex */
public final class l extends ius<Void, LinearLayout, iru<XslDataSource>> implements itl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f15040a;
    private final ArrayList<iuk<?, ?>> b;
    private final boolean c;

    static {
        kge.a(1977487358);
        kge.a(733709958);
    }

    @Override // tb.itl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.itl
    public void a(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1901d4", new Object[]{this, new Boolean(z), new Float(f)});
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "";
    }

    @Override // tb.itl
    public com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a) ipChange.ipc$dispatch("26ed9943", new Object[]{this});
        }
        return null;
    }

    @Override // tb.itl
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ LinearLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Activity activity, ium parent, iru<XslDataSource> iruVar, ViewGroup viewGroup, iur iurVar, boolean z) {
        super(activity, parent, iruVar, viewGroup, iurVar);
        kotlin.jvm.internal.q.c(activity, "activity");
        kotlin.jvm.internal.q.c(parent, "parent");
        this.c = z;
        this.f15040a = new LinearLayout(activity);
        this.b = new ArrayList<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    public final void a(iuk<?, ?> widget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6429b9", new Object[]{this, widget});
            return;
        }
        kotlin.jvm.internal.q.c(widget, "widget");
        this.b.add(widget);
        this.f15040a.addView(widget.getView());
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.clear();
        this.f15040a.removeAllViews();
    }

    public LinearLayout b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("e3daedc0", new Object[]{this});
        }
        LinearLayout linearLayout = this.f15040a;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return linearLayout;
    }

    @Override // tb.itl
    public void aG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b4c520", new Object[]{this});
            return;
        }
        Iterator<iuk<?, ?>> it = this.b.iterator();
        while (it.hasNext()) {
            iuk<?, ?> next = it.next();
            if (next instanceof itm) {
                ((itm) next).k();
            }
        }
    }

    @Override // tb.itl
    public void aH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b699dbf", new Object[]{this});
            return;
        }
        Iterator<iuk<?, ?>> it = this.b.iterator();
        while (it.hasNext()) {
            iuk<?, ?> next = it.next();
            if (next instanceof itm) {
                ((itm) next).l();
            }
        }
    }

    @Override // tb.itl
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.c;
    }
}
