package com.taobao.android.detail2.core.framework.data.global;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.tao.TBMainHost;
import tb.ctu;
import tb.fjt;
import tb.fky;
import tb.fmt;
import tb.kge;
import tb.lnr;

/* loaded from: classes5.dex */
public class NewDetailScreenConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f11519a;
    private int b;
    private int c;
    private int d;
    private Context e;
    private b f;
    private Double g;
    private ScreenType h;
    private boolean i;

    /* loaded from: classes5.dex */
    public enum ScreenType {
        PAD_PORTRAIT("portrait", "pad_portrait"),
        PAD_LANDSCAPE("landScape", "pad_landscape"),
        FOLD_DEVICE_PORTRAIT("", "fold_device_portrait"),
        FOLD_DEVICE_LANDSCAPE("landScape", "fold_device_landscape"),
        NORMAL_PHONE("", "normal_phone");
        
        private String mTypeStr;
        private String mUIStrategyTag;

        ScreenType(String str, String str2) {
            this.mUIStrategyTag = str;
            this.mTypeStr = str2;
        }

        public String getTypeStr() {
            return this.mTypeStr;
        }

        public String getUIStrategyTag() {
            return this.mUIStrategyTag;
        }
    }

    static {
        kge.a(-768957416);
    }

    public NewDetailScreenConfig(b bVar, boolean z) {
        ctu.a("NewDetailScreenConfig");
        this.i = z;
        this.f = bVar;
        this.e = bVar.g();
        g();
        d();
        ctu.a();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.d = fmt.b(this.e);
        this.b = fmt.a(this.e);
        this.g = Double.valueOf(this.d / 750.0d);
        if (!fky.g(this.e, "normal_phone").equals(this.h.getTypeStr())) {
            return;
        }
        if (this.i) {
            int i = fky.g(this.e).f11522a;
            if (i > 0) {
                b(i);
                return;
            }
            int bottom = TBMainHost.a().getFragmentTabHost().getBottom();
            if (bottom > 0) {
                b(bottom);
                return;
            } else {
                b(this.b);
                return;
            }
        }
        b(fky.g(this.e).f11522a);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            h();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        h();
        fky.h(this.e, this.h.getTypeStr());
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        boolean b = l.b(this.e);
        boolean d = l.d(this.e);
        if (b) {
            if (h.a().b(this.e)) {
                this.h = ScreenType.PAD_PORTRAIT;
            } else {
                this.h = ScreenType.PAD_LANDSCAPE;
            }
        } else if (d) {
            if (h.a().b(this.e)) {
                this.h = ScreenType.FOLD_DEVICE_PORTRAIT;
            } else {
                this.h = ScreenType.FOLD_DEVICE_LANDSCAPE;
            }
        } else {
            this.h = ScreenType.NORMAL_PHONE;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.d = fmt.b(this.e);
        this.b = fmt.a(this.e);
        this.g = Double.valueOf(this.d / 750.0d);
        b(i);
        Context context = this.e;
        if (!(context instanceof Activity)) {
            return;
        }
        int i2 = this.c;
        fky.a(context, i2, this.d, (int) lnr.a(this.f, i2, this.f11519a));
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        fjt.a(fjt.TAG_RENDER, "刷新有效内容展示高度以及屏幕比例，mScreenValidHeight: " + this.c);
        this.f11519a = ((float) this.d) / ((float) this.c);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.c;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.d;
    }

    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.f11519a;
    }

    public ScreenType f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScreenType) ipChange.ipc$dispatch("2cc57b46", new Object[]{this}) : this.h;
    }

    public int c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue() : (int) Math.ceil(i * this.g.doubleValue());
    }
}
