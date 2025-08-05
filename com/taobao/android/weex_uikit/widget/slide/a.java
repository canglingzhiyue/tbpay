package com.taobao.android.weex_uikit.widget.slide;

import android.content.Context;
import android.support.v4.view.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.i;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.weex.common.Constants;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.weex_uikit.widget.slide.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0625a {

        /* renamed from: a  reason: collision with root package name */
        public int f16209a = -1;

        static {
            kge.a(-1408851927);
        }
    }

    static {
        kge.a(1085414634);
    }

    public static SlideContainer a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SlideContainer) ipChange.ipc$dispatch("328e3130", new Object[]{context}) : new SlideContainer(context);
    }

    public static void a(UINode uINode, m<SlideDelegateNode> mVar, m<C0625a> mVar2, m<ViewPager.OnPageChangeListener> mVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6f0c19", new Object[]{uINode, mVar, mVar2, mVar3});
            return;
        }
        mVar2.a(new C0625a());
        b bVar = new b(uINode, mVar2.b());
        mVar.a(new SlideDelegateNode(uINode.getNodeId(), bVar));
        bVar.a(mVar.b());
        mVar3.a(new c(uINode, mVar2.b()));
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, SlideDelegateNode slideDelegateNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f7b7be", new Object[]{uINode, mUSDKInstance, slideDelegateNode});
        } else {
            slideDelegateNode.setInstance(mUSDKInstance);
        }
    }

    public static void a(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0015db4", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("autoplay", Boolean.valueOf(z));
        }
    }

    public static void a(UINode uINode, SlideContainer slideContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2dd1d14", new Object[]{uINode, slideContainer, new Boolean(z)});
        } else {
            slideContainer.setAutoPlay(z);
        }
    }

    public static void a(UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0011de3", new Object[]{uINode, new Integer(i)});
            return;
        }
        if (i <= 0) {
            g.a("[Slide]:interval can't be smaller than 1");
            i = 1;
        }
        uINode.setAttribute(Constants.Name.INTERVAL, Integer.valueOf(i));
    }

    public static void a(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82939aea", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("previousMargin", Integer.valueOf((int) i.a(str)));
        }
    }

    public static void b(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49ec9", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("nextMargin", Integer.valueOf((int) i.a(str)));
        }
    }

    public static void a(UINode uINode, SlideContainer slideContainer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2dcdd43", new Object[]{uINode, slideContainer, new Integer(i)});
        } else {
            slideContainer.setInterval(i);
        }
    }

    public static void b(UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557b4424", new Object[]{uINode, new Integer(i)});
        } else {
            uINode.setAttribute("index", Integer.valueOf(i));
        }
    }

    public static void a(UINode uINode, SlideContainer slideContainer, int i, C0625a c0625a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e805cd65", new Object[]{uINode, slideContainer, new Integer(i), c0625a});
            return;
        }
        slideContainer.setIndex(i);
        c0625a.f16209a = i;
    }

    public static void b(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557b83f5", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("infinite", Boolean.valueOf(z));
        }
    }

    public static void a(UINode uINode, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae4b65d0", new Object[]{uINode, jSONObject});
        } else {
            uINode.setAttribute(com.taobao.tinct.impl.collect.e.UPLOAD_TYPE_EFFECT, jSONObject);
        }
    }

    public static void a(UINode uINode, SlideContainer slideContainer, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b51a530", new Object[]{uINode, slideContainer, jSONObject});
        } else {
            slideContainer.updateEffect(jSONObject);
        }
    }

    public static void a(UINode uINode, SlideContainer slideContainer, boolean z, SlideDelegateNode slideDelegateNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f09237c", new Object[]{uINode, slideContainer, new Boolean(z), slideDelegateNode});
        } else {
            slideContainer.setInfinite(slideDelegateNode.getNodeTreeList(), z);
        }
    }

    public static void c(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf5aa36", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(Constants.Name.SCROLLABLE, Boolean.valueOf(z));
        }
    }

    public static void b(UINode uINode, SlideContainer slideContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3049da33", new Object[]{uINode, slideContainer, new Boolean(z)});
        } else {
            slideContainer.setScrollable(z);
        }
    }

    private static boolean a(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59ce7924", new Object[]{uINode})).booleanValue() : ((Boolean) uINode.getAttribute("infinite")).booleanValue();
    }

    private static boolean b(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("134606c3", new Object[]{uINode})).booleanValue() : ((Boolean) uINode.getAttribute(Constants.Name.SCROLLABLE)).booleanValue();
    }

    private static boolean c(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ccbd9462", new Object[]{uINode})).booleanValue() : ((Boolean) uINode.getAttribute("autoplay")).booleanValue();
    }

    public static void a(UINode uINode, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20235151", new Object[]{uINode, new Integer(i), new Boolean(z)});
            return;
        }
        SlideContainer slideContainer = (SlideContainer) uINode.getMountContent();
        if (slideContainer == null) {
            return;
        }
        slideContainer.scrollTo(i, z);
    }

    private static int d(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("863521f0", new Object[]{uINode})).intValue() : ((Integer) uINode.getAttribute("index")).intValue();
    }

    private static int e(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3facaf8f", new Object[]{uINode})).intValue() : ((Integer) uINode.getAttribute(Constants.Name.INTERVAL)).intValue();
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, SlideContainer slideContainer, SlideDelegateNode slideDelegateNode, ViewPager.OnPageChangeListener onPageChangeListener, C0625a c0625a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ea0ab2", new Object[]{uINode, mUSDKInstance, slideContainer, slideDelegateNode, onPageChangeListener, c0625a});
            return;
        }
        int d = c0625a.f16209a >= 0 ? c0625a.f16209a : d(uINode);
        c0625a.f16209a = d;
        int intValue = ((Integer) uINode.getAttribute("previousMargin")).intValue();
        if (intValue != ((Integer) uINode.getAttribute("nextMargin")).intValue()) {
            g.d("previousMargin 和 nextMargin 不一致,以 previousMargin 为准");
        }
        slideContainer.mount(onPageChangeListener, mUSDKInstance, slideDelegateNode.getNodeTreeList(), a(uINode), b(uINode), c(uINode), d, e(uINode), intValue, (JSONObject) uINode.getAttribute(com.taobao.tinct.impl.collect.e.UPLOAD_TYPE_EFFECT));
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, SlideContainer slideContainer, ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7cf4a8", new Object[]{uINode, mUSDKInstance, slideContainer, onPageChangeListener});
        } else {
            slideContainer.unmount(onPageChangeListener);
        }
    }

    public static void a(UINode uINode, List<Runnable> list, SlideDelegateNode slideDelegateNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df27fb9", new Object[]{uINode, list, slideDelegateNode});
        } else {
            slideDelegateNode.collectBatchTasks(list);
        }
    }
}
