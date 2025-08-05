package com.taobao.taolive.room.utils;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;
import tb.pnf;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(BitmapDrawable bitmapDrawable);
    }

    static {
        kge.a(-873837844);
    }

    public static void a(String str, View view, int i, int i2, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11cc9b", new Object[]{str, view, new Integer(i), new Integer(i2), aVar});
        } else if (com.taobao.taolive.sdk.utils.u.ac()) {
            pmd.a().l().a(str, view, i, i2).a(new com.alilive.adapter.uikit.f(pmd.a().u().c(), 25, 4)).a(new pnf() { // from class: com.taobao.taolive.room.utils.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pnf
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    a aVar2 = a.this;
                    if (aVar2 == null) {
                        return;
                    }
                    if (obj != null) {
                        aVar2.a((BitmapDrawable) obj);
                    } else {
                        aVar2.a();
                    }
                }

                @Override // tb.pnf
                public void b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                        return;
                    }
                    a aVar2 = a.this;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a();
                }
            }).a();
        } else if (aVar == null) {
        } else {
            aVar.a();
        }
    }

    public static void a(String str, View view, int i, int i2, final a aVar, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccdf723b", new Object[]{str, view, new Integer(i), new Integer(i2), aVar, new Integer(i3), new Integer(i4)});
        } else if (com.taobao.taolive.sdk.utils.u.ac()) {
            pmd.a().l().a(str, view, i, i2).a(new com.alilive.adapter.uikit.f(pmd.a().u().c(), i3, i4)).a(new pnf() { // from class: com.taobao.taolive.room.utils.g.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pnf
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    a aVar2 = a.this;
                    if (aVar2 == null) {
                        return;
                    }
                    if (obj != null) {
                        aVar2.a((BitmapDrawable) obj);
                    } else {
                        aVar2.a();
                    }
                }

                @Override // tb.pnf
                public void b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                        return;
                    }
                    a aVar2 = a.this;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a();
                }
            }).a();
        } else if (aVar == null) {
        } else {
            aVar.a();
        }
    }

    public static void b(String str, View view, int i, int i2, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113aaedc", new Object[]{str, view, new Integer(i), new Integer(i2), aVar});
        } else if (com.taobao.taolive.sdk.utils.u.ac()) {
            pmd.a().l().a(str, view, i, i2).a(new com.alilive.adapter.uikit.f(pmd.a().u().c(), 25, 4)).a(new pnf() { // from class: com.taobao.taolive.room.utils.g.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pnf
                public void b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                    }
                }

                @Override // tb.pnf
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    a aVar2 = a.this;
                    if (aVar2 == null) {
                        return;
                    }
                    if (obj != null) {
                        aVar2.a((BitmapDrawable) obj);
                    } else {
                        aVar2.a();
                    }
                }
            }).a();
        } else if (aVar == null) {
        } else {
            aVar.a();
        }
    }
}
