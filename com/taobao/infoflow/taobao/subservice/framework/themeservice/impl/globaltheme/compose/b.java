package com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.globaltheme.compose;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.tbtheme.kit.g;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.tao.Globals;
import tb.gbg;
import tb.kge;
import tb.ldf;
import tb.lxq;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LAST_SKIN_PIC_HEIGHT_KEY = "lastGlobalBGSkinHeight";

    /* renamed from: a  reason: collision with root package name */
    private final String f17578a;
    private ThemeData b;

    static {
        kge.a(1788841149);
    }

    public static /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cf65b54d", new Object[]{bVar}) : bVar.d();
    }

    public b(String str) {
        this.f17578a = str;
    }

    public void a(ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9d4664", new Object[]{this, themeData});
            return;
        }
        if (a(this.b, themeData)) {
            a(this.f17578a, themeData);
        }
        this.b = themeData;
    }

    public ThemeFrameLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThemeFrameLayout) ipChange.ipc$dispatch("2c43a0eb", new Object[]{this}) : j.a().a(Globals.getApplication(), c());
    }

    public void a(ThemeFrameLayout themeFrameLayout, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a62638", new Object[]{this, themeFrameLayout, new Integer(i)});
        } else if (themeFrameLayout == null) {
        } else {
            themeFrameLayout.updateImageHeight(i);
            Coordinator.execute(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.globaltheme.compose.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String a2 = b.a(b.this);
                    lxq.a(a2, "" + i);
                }
            });
        }
    }

    private g c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("23a77134", new Object[]{this});
        }
        Application application = Globals.getApplication();
        g gVar = new g(this.f17578a, gbg.c(application));
        gVar.i = true;
        try {
            String d = d();
            gVar.d = Integer.parseInt(lxq.b(d, "" + gbg.b(application, 200.0f)));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return gVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a((ThemeData) null);
        }
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        return LAST_SKIN_PIC_HEIGHT_KEY + this.f17578a;
    }

    private boolean a(ThemeData themeData, ThemeData themeData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d17e564", new Object[]{this, themeData, themeData2})).booleanValue();
        }
        if (themeData != null) {
            return !themeData.equals(themeData2);
        }
        return themeData2 != null;
    }

    private void a(String str, ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b1c9ae", new Object[]{this, str, themeData});
        } else if (themeData != null) {
            ldf.d("ThemeDataHandler", "updateCustomTheme: setCustomerTheme");
            j.a().a(str, themeData);
        } else {
            ldf.d("ThemeDataHandler", "updateCustomTheme: removeCustomerTheme");
            j.a().a(str);
        }
    }
}
