package com.taobao.tao.flexbox.layoutmanager.container;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import tb.kge;
import tb.ogg;

/* loaded from: classes8.dex */
public abstract class p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_ADDED = 2;
    public static final int STATE_FAILED = -1;
    public static final int STATE_INIT = 0;
    public static final int STATE_PENDING = 1;
    public static final int STATE_SUCCESS = 3;
    public static final int STATE_TIMEOUT = 4;

    /* renamed from: a  reason: collision with root package name */
    private Object f20268a;
    public int b = 0;
    public final TNodeView c;
    public final Uri d;
    private a e;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i, Object obj);
    }

    static {
        kge.a(1254719898);
    }

    public abstract void a();

    public p(TNodeView tNodeView, Uri uri) {
        this.c = tNodeView;
        this.d = uri;
    }

    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        this.b = i;
        this.f20268a = obj;
        if (i == 2) {
            this.c.addUpperView((View) obj, new FrameLayout.LayoutParams(-1, -1), 60, null);
        } else if (i == 4) {
            this.c.removeUpperView((View) obj);
        }
        ogg.c("RenderInterceptProxy", "setState: " + i + " args: " + obj);
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(i, obj);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d899e1", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }
}
