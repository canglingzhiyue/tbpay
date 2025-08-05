package com.taobao.search.mmd.uikit.shopinfo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.List;
import tb.jwy;
import tb.kge;

/* loaded from: classes7.dex */
public class b extends jwy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Typeface b;
    public static String c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static String j;
    public static int k;
    public static int l;
    private List<e> h;
    private a i;

    static {
        kge.a(-475151903);
        c = Globals.getApplication().getResources().getString(R.string.uik_icon_right);
        j = Globals.getApplication().getResources().getString(R.string.uik_icon_tb_ArrowRight);
        d = Color.parseColor("#999999");
        e = Color.parseColor("#aaaaaa");
        f = j.a(3.0f);
        k = j.a(4.0f);
        g = j.a(14.0f);
        l = j.a(12.0f);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (b != null) {
        } else {
            try {
                b = Typeface.createFromAsset(Globals.getApplication().getAssets(), "uik_iconfont.ttf");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void a(List<e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        a();
        this.h = list;
        List<e> list2 = this.h;
        if (list2 != null && list2.size() > 0) {
            for (e eVar : this.h) {
                eVar.a(this);
            }
        }
        invalidateSelf();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254b2ad5", new Object[]{this, aVar});
            return;
        }
        this.i = aVar;
        invalidateSelf();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<e> list = this.h;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (e eVar : this.h) {
            eVar.b();
        }
    }

    @Override // tb.jwy
    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        List<e> list = this.h;
        if (list == null || list.size() <= 0) {
            return;
        }
        a aVar = this.i;
        if (aVar != null) {
            int b2 = aVar.b();
            List<e> list2 = this.h;
            this.i.a(canvas, b2 + list2.get(list2.size() - 1).a(), getBounds().height());
        }
        for (e eVar : this.h) {
            eVar.a(canvas, b);
        }
    }
}
