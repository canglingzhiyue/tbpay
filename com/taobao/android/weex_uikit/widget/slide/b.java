package com.taobao.android.weex_uikit.widget.slide;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.slide.SlideDelegateNode;
import com.taobao.android.weex_uikit.widget.slide.a;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements SlideDelegateNode.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final UINode f16210a;
    private SlideDelegateNode b;
    private final a.C0625a c;

    static {
        kge.a(-639486144);
        kge.a(-179650145);
    }

    public b(UINode uINode, a.C0625a c0625a) {
        this.f16210a = uINode;
        this.c = c0625a;
    }

    public void a(SlideDelegateNode slideDelegateNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363f97d0", new Object[]{this, slideDelegateNode});
        } else {
            this.b = slideDelegateNode;
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.SlideDelegateNode.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        SlideContainer slideContainer = (SlideContainer) this.f16210a.getMountContent();
        if (slideContainer == null) {
            return;
        }
        slideContainer.refresh(this.f16210a.getInstance(), this.b.getNodeTreeList(), Math.max(this.c.f16209a, 0));
    }
}
