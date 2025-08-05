package com.taobao.android.weex_uikit.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import com.taobao.android.weex_uikit.widget.img.Image;
import java.util.List;
import tb.jws;
import tb.jwy;
import tb.kge;

/* loaded from: classes6.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MUSView f16148a;
    private int b;
    private int c;
    private int d;
    private int e;
    private Context f;
    private final Rect g = new Rect();
    private boolean h = true;
    private s i;

    static {
        kge.a(1942409295);
    }

    public t(MUSView mUSView) {
        this.f16148a = mUSView;
        this.f = mUSView.getContext();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f = context;
        }
    }

    public void a(s sVar, Rect rect, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33d2442", new Object[]{this, sVar, rect, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (sVar == null) {
            throw new IllegalStateException("Trying to mount a null layoutState");
        } else {
            this.i = sVar;
            this.f16148a.suppressInvalidate(true);
            boolean z4 = rect != null && z2;
            if (!z4 || !a(sVar, rect, z)) {
                int b = sVar.b();
                for (int i = 0; i < b; i++) {
                    UINode a2 = sVar.a(i);
                    boolean isMounted = a2.isMounted();
                    boolean z5 = !z4 || Rect.intersects(rect, a2.getGlobalVisibleRect());
                    boolean z6 = !z3 || (rect != null && Rect.intersects(rect, a2.getGlobalVisibleRect()));
                    if (z) {
                        if (z5 && !isMounted) {
                            a(a2, a2.getGlobalVisibleRect());
                        } else if (!z5 && isMounted) {
                            a(a2, false);
                        }
                    }
                    if (z6 && !a2.isMountState()) {
                        a2.notifyMountState();
                    } else if (!z6 && a2.isMountState()) {
                        a2.notifyUnmountState();
                    }
                }
                if (rect != null && z3) {
                    a(sVar, rect);
                }
            }
            if (rect != null) {
                this.g.set(rect);
            }
            this.f16148a.suppressInvalidate(false);
        }
    }

    private boolean a(s sVar, Rect rect, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86725246", new Object[]{this, sVar, rect, new Boolean(z)})).booleanValue();
        }
        if (this.g.isEmpty()) {
            return false;
        }
        boolean z2 = (rect.left == this.g.left && rect.right == this.g.right) ? false : true;
        boolean z3 = (rect.top == this.g.top && rect.bottom == this.g.bottom) ? false : true;
        if (z3) {
            List<UINode> c = sVar.c();
            List<UINode> d = sVar.d();
            int b = sVar.b();
            if (rect.top > 0 || this.g.top > 0) {
                while (this.c < b && rect.top >= d.get(this.c).getGlobalVisibleRect().bottom) {
                    UINode uINode = d.get(this.c);
                    if (uINode.isMounted() && z) {
                        a(uINode, false);
                    }
                    if (uINode.isMountState()) {
                        uINode.notifyUnmountState();
                    }
                    this.c++;
                }
                while (this.c > 0 && rect.top < d.get(this.c - 1).getGlobalVisibleRect().bottom) {
                    this.c--;
                    UINode uINode2 = d.get(this.c);
                    if (!uINode2.isMounted() && z) {
                        a(uINode2, uINode2.getGlobalVisibleRect());
                    }
                    if (!uINode2.isMountState()) {
                        uINode2.notifyMountState();
                    }
                }
            }
            int height = this.f16148a.getHeight();
            if (rect.bottom < height || this.g.bottom < height) {
                while (this.b < b && rect.bottom > c.get(this.b).getGlobalVisibleRect().top) {
                    UINode uINode3 = c.get(this.b);
                    if (!uINode3.isMounted() && z) {
                        a(uINode3, uINode3.getGlobalVisibleRect());
                    }
                    if (!uINode3.isMountState()) {
                        uINode3.notifyMountState();
                    }
                    this.b++;
                }
                while (this.b > 0 && rect.bottom <= c.get(this.b - 1).getGlobalVisibleRect().top) {
                    this.b--;
                    UINode uINode4 = c.get(this.b);
                    if (uINode4.isMounted() && z) {
                        a(uINode4, false);
                    }
                    if (uINode4.isMountState()) {
                        uINode4.notifyUnmountState();
                    }
                }
            }
        }
        if (z2) {
            List<UINode> e = sVar.e();
            List<UINode> f = sVar.f();
            int b2 = sVar.b();
            if (rect.left > 0 || this.g.left > 0) {
                while (this.e < b2 && rect.left >= f.get(this.e).getGlobalVisibleRect().right) {
                    UINode uINode5 = f.get(this.e);
                    if (uINode5.isMounted() && z) {
                        a(uINode5, false);
                    }
                    if (uINode5.isMountState()) {
                        uINode5.notifyUnmountState();
                    }
                    this.e++;
                }
                while (this.e > 0 && rect.left < f.get(this.e - 1).getGlobalVisibleRect().right) {
                    this.e--;
                    UINode uINode6 = f.get(this.e);
                    if (!uINode6.isMounted() && z) {
                        a(uINode6, uINode6.getGlobalVisibleRect());
                    }
                    if (!uINode6.isMountState()) {
                        uINode6.notifyMountState();
                    }
                }
            }
            int width = this.f16148a.getWidth();
            if (rect.right < width || this.g.right < width) {
                while (this.d < b2 && rect.right > e.get(this.d).getGlobalVisibleRect().left) {
                    UINode uINode7 = e.get(this.d);
                    if (!uINode7.isMounted() && z) {
                        a(uINode7, uINode7.getGlobalVisibleRect());
                    }
                    if (!uINode7.isMountState()) {
                        uINode7.notifyMountState();
                    }
                    this.d++;
                }
                while (this.d > 0 && rect.right <= e.get(this.d - 1).getGlobalVisibleRect().left) {
                    this.d--;
                    UINode uINode8 = e.get(this.d);
                    if (uINode8.isMounted() && z) {
                        a(uINode8, false);
                    }
                    if (uINode8.isMountState()) {
                        uINode8.notifyUnmountState();
                    }
                }
            }
        }
        return z2 || z3;
    }

    private void a(s sVar, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c245bad2", new Object[]{this, sVar, rect});
        } else if (!rect.isEmpty()) {
            List<UINode> c = sVar.c();
            List<UINode> d = sVar.d();
            List<UINode> e = sVar.e();
            List<UINode> f = sVar.f();
            int b = sVar.b();
            this.b = b;
            int i = 0;
            while (true) {
                if (i >= b) {
                    break;
                } else if (rect.bottom <= c.get(i).getGlobalVisibleRect().top) {
                    this.b = i;
                    break;
                } else {
                    i++;
                }
            }
            this.c = b;
            int i2 = 0;
            while (true) {
                if (i2 >= b) {
                    break;
                } else if (rect.top < d.get(i2).getGlobalVisibleRect().bottom) {
                    this.c = i2;
                    break;
                } else {
                    i2++;
                }
            }
            this.d = b;
            int i3 = 0;
            while (true) {
                if (i3 >= b) {
                    break;
                } else if (rect.right <= e.get(i3).getGlobalVisibleRect().left) {
                    this.d = i3;
                    break;
                } else {
                    i3++;
                }
            }
            this.e = b;
            for (int i4 = 0; i4 < b; i4++) {
                if (rect.left < f.get(i4).getGlobalVisibleRect().right) {
                    this.e = i4;
                    return;
                }
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        s sVar = this.i;
        if (sVar != null) {
            int b = sVar.b();
            this.f16148a.suppressInvalidate(true);
            for (int i = 0; i < b; i++) {
                UINode a2 = this.i.a(i);
                if (a2.isMounted()) {
                    a(a2, true);
                }
                if (a2.isMountState()) {
                    a2.notifyUnmountState();
                }
            }
            this.f16148a.suppressInvalidate(false);
        }
        this.g.setEmpty();
        e();
        this.h = true;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public void a(UINode uINode, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb27579", new Object[]{this, uINode, rect});
        } else if (uINode == null) {
            throw new RuntimeException("Trying to mount a null Node.");
        } else {
            Object obj = null;
            if (uINode.getNodeType() != UINodeType.LAYOUT) {
                obj = jws.a(this.f, uINode);
                if (obj instanceof jwy) {
                    jwy jwyVar = (jwy) obj;
                    jwyVar.a(uINode.getNodeInfo().v());
                    jwyVar.a(uINode);
                } else if (obj instanceof View) {
                    com.taobao.android.weex_uikit.util.e.a(uINode, (View) obj);
                }
                this.f16148a.mount(obj);
                if (uINode instanceof Image) {
                    this.f16148a.addImageNode();
                }
            }
            uINode.setView(this.f16148a);
            a(uINode, obj, rect);
            uINode.mount(this.f16148a.getInstance(), obj);
            if (obj == null) {
                uINode.invalidate();
            } else {
                this.f16148a.invalidate();
            }
        }
    }

    public void a(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0015db4", new Object[]{this, uINode, new Boolean(z)});
        } else if (uINode == null) {
        } else {
            uINode.setView(null);
            this.f16148a.unmount(uINode.getMountContent());
            a(uINode);
            Object mountContent = uINode.getMountContent();
            uINode.unmount(this.f16148a.getInstance(), mountContent);
            if (uINode.getNodeType() != UINodeType.LAYOUT) {
                if (mountContent != null) {
                    try {
                        jws.a(this.f, uINode, mountContent);
                    } catch (Exception e) {
                        com.taobao.android.weex_framework.monitor.b.a();
                        com.taobao.android.weex_framework.util.g.a(e);
                    }
                }
                if (uINode instanceof Image) {
                    this.f16148a.removeImageNode();
                }
            }
            if (!z) {
                return;
            }
            this.f16148a.invalidate();
        }
    }

    public static void a(UINode uINode, Object obj, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df51761d", new Object[]{uINode, obj, rect});
            return;
        }
        if (obj != null) {
            BorderProp a2 = uINode.getNodeInfo().a(false);
            if (a2 == null) {
                a(obj, rect.left, rect.top, rect.right, rect.bottom, true);
            } else {
                a(obj, rect.left + a2.b(0), rect.top + a2.b(1), rect.right - a2.b(2), rect.bottom - a2.b(3), true);
            }
        }
        if (uINode.getNodeInfo().x() != null) {
            a(uINode.getNodeInfo().x(), rect.left, rect.top, rect.right, rect.bottom, true);
        }
        uINode.onBoundsChange(rect.left, rect.top, rect.right, rect.bottom);
    }

    private static void a(Object obj, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eff5a50", new Object[]{obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        } else if (obj instanceof View) {
            q.a((View) obj, i, i2, i3, i4, z);
        } else if (obj instanceof Drawable) {
            ((Drawable) obj).setBounds(0, 0, i3 - i, i4 - i2);
        } else {
            throw new IllegalStateException("Unsupported mounted content " + obj);
        }
    }

    private static void a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ce7920", new Object[]{uINode});
        } else if (!com.taobao.android.weex_uikit.util.e.a(uINode)) {
        } else {
            a((View) uINode.getMountContent());
        }
    }

    private static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else {
            com.taobao.android.weex_uikit.util.e.a(view);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.g.setEmpty();
        this.h = true;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.h = false;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.h;
    }
}
