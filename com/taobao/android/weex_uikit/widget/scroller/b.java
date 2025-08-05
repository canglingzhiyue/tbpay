package com.taobao.android.weex_uikit.widget.scroller;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.i;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.weex.common.Constants;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UINode f16204a;

    static {
        kge.a(1148957564);
        kge.a(1024030747);
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.c
    public void onRealTimeScroll(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931d4", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public b(UINode uINode) {
        this.f16204a = uINode;
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.c
    public void onScrollChange(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea33e4f", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        MUSDKInstance uINode = this.f16204a.getInstance();
        if (!this.f16204a.hasEvent("scroll") || uINode == null || uINode.isDestroyed()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("x", (Object) Integer.valueOf((int) i.a(view.getContext(), i)));
        jSONObject2.put("y", (Object) Integer.valueOf((int) i.a(view.getContext(), i2)));
        jSONObject.put(Constants.Name.CONTENT_OFFSET, (Object) jSONObject2);
        jSONObject.put("isDrag", (Object) String.valueOf(a(view)));
        a(this.f16204a, "scroll", jSONObject);
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        if (view instanceof MUScrollView) {
            return ((MUScrollView) view).isTouching();
        }
        if (!(view instanceof MUSHorizontalScrollView)) {
            return false;
        }
        return ((MUSHorizontalScrollView) view).isTouching();
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view instanceof MUScrollView) {
            ((MUScrollView) view).resetTouching();
        } else if (!(view instanceof MUSHorizontalScrollView)) {
        } else {
            ((MUSHorizontalScrollView) view).resetTouching();
        }
    }

    private static void a(UINode uINode, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c57f2546", new Object[]{uINode, str, jSONObject});
        } else {
            uINode.getInstance().fireEventOnNode(uINode.getNodeId(), str, jSONObject);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.c
    public void onScrollStart(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b975f5", new Object[]{this, view});
            return;
        }
        MUSDKInstance uINode = this.f16204a.getInstance();
        if (g.a()) {
            g.a("Scroller-ScrollStart isDrag = " + a(view));
        }
        if (!this.f16204a.hasEvent("scrollstart") || uINode == null || uINode.isDestroyed()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isDrag", (Object) String.valueOf(a(view)));
        a(this.f16204a, "scrollstart", jSONObject);
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.c
    public void onScrollEnd(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a368b45c", new Object[]{this, view});
            return;
        }
        MUSDKInstance uINode = this.f16204a.getInstance();
        boolean a2 = a(view);
        b(view);
        if (g.a()) {
            g.a("Scroller-ScrollEnd isDrag = " + a2);
        }
        if (!this.f16204a.hasEvent("scrollend") || uINode == null || uINode.isDestroyed()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isDrag", (Object) String.valueOf(a2));
        a(this.f16204a, "scrollend", jSONObject);
    }
}
