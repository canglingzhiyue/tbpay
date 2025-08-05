package com.taobao.android.weex_uikit.ui.cache;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import tb.kge;

/* loaded from: classes6.dex */
public class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f16130a;
    private b b;
    private boolean c;

    static {
        kge.a(1583675480);
        kge.a(-1764004801);
    }

    public static /* synthetic */ int a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("346aa2d7", new Object[]{cVar})).intValue() : cVar.f16130a;
    }

    @Override // com.taobao.android.weex_uikit.ui.cache.a
    public void a(b bVar, int i, int i2, BorderProp borderProp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0533575", new Object[]{this, bVar, new Integer(i), new Integer(i2), borderProp});
            return;
        }
        if (borderProp == null || borderProp.b() == null) {
            this.f16130a = 0;
        } else {
            this.f16130a = borderProp.h(0);
        }
        if (this.c) {
            this.b.getView().invalidateOutline();
            return;
        }
        this.b = bVar;
        this.c = true;
        bVar.getView().setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.weex_uikit.ui.cache.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    return;
                }
                int a2 = c.a(c.this);
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    a2 = Math.min(Math.min(view.getWidth(), view.getHeight()) / 2, c.a(c.this));
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), a2);
            }
        });
        this.b.getView().setClipToOutline(true);
        this.b.getView().invalidateOutline();
    }
}
