package com.taobao.android.weex_uikit.widget.scroller;

import android.content.Context;
import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.i;
import com.taobao.weex.common.Constants;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HORIZONTAL = 2;
    public static final int VERTICAL = 1;

    /* renamed from: com.taobao.android.weex_uikit.widget.scroller.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0624a {

        /* renamed from: a  reason: collision with root package name */
        public final int f16203a;
        public float b;
        public final boolean c;
        public final int d;

        static {
            kge.a(1372082056);
        }

        public C0624a(int i, float f, boolean z, int i2) {
            this.f16203a = i;
            this.b = f;
            this.c = z;
            this.d = i2;
        }
    }

    static {
        kge.a(206523336);
    }

    public static void a(UINode uINode, m<c> mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d9b733", new Object[]{uINode, mVar});
        } else {
            mVar.a(new b(uINode));
        }
    }

    public static ScrollerContainer a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollerContainer) ipChange.ipc$dispatch("36326ecc", new Object[]{context}) : new ScrollerContainer(context);
    }

    public static boolean a(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59ce7924", new Object[]{uINode})).booleanValue() : ((Boolean) uINode.getAttribute(Constants.Name.SHOW_SCROLLBAR)).booleanValue();
    }

    public static void a(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82939aea", new Object[]{uINode, str});
        } else {
            uINode.setAttribute(Constants.Name.SCROLL_DIRECTION, str);
        }
    }

    public static void a(UINode uINode, ScrollerContainer scrollerContainer, String str, i iVar, ScrollerRootNode scrollerRootNode) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340018be", new Object[]{uINode, scrollerContainer, str, iVar, scrollerRootNode});
            return;
        }
        int b = b(uINode);
        if (b == 1) {
            z = true;
        }
        scrollerRootNode.setVertical(z);
        scrollerContainer.setDirection(b);
        iVar.h();
    }

    public static int b(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("134606b2", new Object[]{uINode})).intValue();
        }
        String str = (String) uINode.getAttribute(Constants.Name.SCROLL_DIRECTION);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1984141450) {
            if (hashCode == 1387629604 && str.equals(Constants.Value.HORIZONTAL)) {
                c = 0;
            }
        } else if (str.equals("vertical")) {
            c = 1;
        }
        if (c == 0) {
            return 2;
        }
        if (c != 1 && !StringUtils.isEmpty(str) && g.a()) {
            g.d("Scroller", "input scrollDirection is not valid: " + str);
        }
        return 1;
    }

    public static void a(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0015db4", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(Constants.Name.SHOW_SCROLLBAR, Boolean.valueOf(z));
        }
    }

    public static void a(UINode uINode, ScrollerContainer scrollerContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a7a038", new Object[]{uINode, scrollerContainer, new Boolean(z)});
        } else {
            scrollerContainer.setShowScrollBar(z);
        }
    }

    public static void b(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557b83f5", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(Constants.Name.SCROLLABLE, Boolean.valueOf(z));
        }
    }

    public static void b(UINode uINode, ScrollerContainer scrollerContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b3ca17", new Object[]{uINode, scrollerContainer, new Boolean(z)});
        } else {
            scrollerContainer.setScrollable(z);
        }
    }

    public static void a(UINode uINode, int i, float f, boolean z, int i2, m<C0624a> mVar, ScrollerRootNode scrollerRootNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13597ce", new Object[]{uINode, new Integer(i), new Float(f), new Boolean(z), new Integer(i2), mVar, scrollerRootNode});
            return;
        }
        ScrollerContainer scrollerContainer = (ScrollerContainer) uINode.getMountContent();
        if (scrollerContainer == null) {
            if (mVar == null) {
                return;
            }
            mVar.a(new C0624a(i, f, z, i2));
        } else if (i < 0 || i >= scrollerRootNode.getChildCount()) {
            g.f("Scroller", "position is beyond the bounds;child count is " + scrollerRootNode.getChildCount() + " but position is " + i);
        } else {
            float round = Math.round(com.taobao.android.weex_framework.util.i.a(f));
            UINode childAt = scrollerRootNode.getChildAt(i);
            if (childAt == null) {
                return;
            }
            int b = b(uINode);
            Rect h = childAt.getNodeInfo().h();
            if (b == 1) {
                int currentScrollY = scrollerContainer.getCurrentScrollY();
                int i3 = (int) (h.top + round);
                if (currentScrollY == i3) {
                    return;
                }
                scrollerContainer.scrollTo(true, currentScrollY, i3, z, i2);
            } else if (com.taobao.android.weex_framework.m.f()) {
                int currentScrollRight = (int) ((childAt.getGlobalVisibleRect().right - round) - scrollerContainer.getCurrentScrollRight());
                if (currentScrollRight == 0) {
                    return;
                }
                scrollerContainer.scrollTo(false, scrollerContainer.getCurrentScrollX(), scrollerContainer.getCurrentScrollX() + currentScrollRight, z, i2);
            } else {
                int currentScrollX = scrollerContainer.getCurrentScrollX();
                int i4 = (int) (h.left + round);
                if (currentScrollX == i4) {
                    return;
                }
                scrollerContainer.scrollTo(false, currentScrollX, i4, z, i2);
            }
        }
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, ScrollerRootNode scrollerRootNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37eac3e5", new Object[]{uINode, mUSDKInstance, scrollerRootNode});
        } else {
            scrollerRootNode.setInstance(mUSDKInstance);
        }
    }

    public static void a(UINode uINode, int i, int i2, int i3, int i4, ScrollerRootNode scrollerRootNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e019ccef", new Object[]{uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), scrollerRootNode});
        } else {
            scrollerRootNode.updateLayout(0, 0, i3 - i, i4 - i2);
        }
    }

    public static void a(UINode uINode, List<Runnable> list, ScrollerRootNode scrollerRootNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae537920", new Object[]{uINode, list, scrollerRootNode});
        } else {
            scrollerRootNode.collectBatchTasks(list);
        }
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, ScrollerContainer scrollerContainer, C0624a c0624a, ScrollerRootNode scrollerRootNode, i iVar, int i, c cVar, m<C0624a> mVar, m<Integer> mVar2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0566f1a", new Object[]{uINode, mUSDKInstance, scrollerContainer, c0624a, scrollerRootNode, iVar, new Integer(i), cVar, mVar, mVar2});
            return;
        }
        int b = b(uINode);
        if (b != 1) {
            z = false;
        }
        scrollerRootNode.setVertical(z);
        scrollerContainer.mount(mUSDKInstance, a(uINode), ((Boolean) uINode.getAttribute(Constants.Name.SCROLLABLE)).booleanValue(), b, iVar, c0624a != null ? 0 : i, cVar);
        mVar2.a(0);
        if (c0624a == null) {
            return;
        }
        a(uINode, c0624a.f16203a, c0624a.b, c0624a.c, c0624a.d, null, scrollerRootNode);
        mVar.a(null);
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, ScrollerContainer scrollerContainer, m<Integer> mVar, m<C0624a> mVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01b028c", new Object[]{uINode, mUSDKInstance, scrollerContainer, mVar, mVar2});
            return;
        }
        if (b(uINode) == 1) {
            mVar.a(Integer.valueOf(scrollerContainer.getCurrentScrollY()));
        } else {
            mVar.a(Integer.valueOf(scrollerContainer.getCurrentScrollX()));
        }
        scrollerContainer.unmount();
        mVar2.a(null);
    }
}
