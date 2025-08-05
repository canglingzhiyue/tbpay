package com.taobao.android.weex_uikit.widget.slide;

import android.support.v4.view.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.slide.a;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends ViewPager.SimpleOnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final UINode f16211a;
    private final a.C0625a b;

    static {
        kge.a(838341279);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(UINode uINode, a.C0625a c0625a) {
        this.f16211a = uINode;
        this.b = c0625a;
    }

    @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        int realPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        SlideContainer slideContainer = (SlideContainer) this.f16211a.getMountContent();
        if (slideContainer == null || this.b.f16209a == (realPosition = slideContainer.getRealPosition(i))) {
            return;
        }
        this.b.f16209a = realPosition;
        if (!this.f16211a.getNodeInfo().k("change") || this.f16211a.getInstance() == null || this.f16211a.getInstance().isDestroyed()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", (Object) Integer.valueOf(realPosition));
        this.f16211a.getInstance().fireEventOnNode(this.f16211a.getNodeId(), "change", jSONObject);
    }

    @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        SlideContainer slideContainer = (SlideContainer) this.f16211a.getMountContent();
        if (slideContainer == null) {
            return;
        }
        slideContainer.updateState(i);
        if (i == 0) {
            a("scrollend", slideContainer.isTouching());
            if (g.a()) {
                g.a("Slide-ScrollEnd isDrag = " + slideContainer.isTouching());
            }
            slideContainer.resetTouching();
        } else if (i != 1) {
        } else {
            a("scrollstart", slideContainer.isTouching());
            if (!g.a()) {
                return;
            }
            g.a("Slide-ScrollStart isDrag = " + slideContainer.isTouching());
        }
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (!this.f16211a.hasEvent(str)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isDrag", (Object) String.valueOf(z));
            this.f16211a.getInstance().fireEventOnNode(this.f16211a.getNodeId(), str, jSONObject);
        }
    }
}
