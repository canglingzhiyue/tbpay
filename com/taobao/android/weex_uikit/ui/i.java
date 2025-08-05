package com.taobao.android.weex_uikit.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.INode;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class i implements com.taobao.android.weex_framework.ui.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    public UINode f16136a;
    private MUSView b;
    private s e;
    private boolean f;
    private boolean h;
    private boolean i;
    private final Rect c = new Rect();
    private boolean d = true;
    private boolean g = true;

    @Override // com.taobao.android.weex_framework.ui.e
    public /* synthetic */ INode a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("ee7c191e", new Object[]{this, new Integer(i)}) : b(i);
    }

    static {
        kge.a(-1544754065);
        kge.a(2079658646);
        TAG = i.class.getSimpleName();
    }

    @Override // com.taobao.android.weex_framework.ui.e
    public void a(INode iNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("937240ab", new Object[]{this, iNode});
        } else if (!(iNode instanceof UINode)) {
            com.taobao.android.weex_framework.util.g.f(TAG, "node is not UINode!");
        } else {
            this.f16136a = (UINode) iNode;
            this.f16136a.setRootNode();
            this.f16136a.setAttachedTree(this);
            this.e = new s();
            this.e.a(this);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.g;
    }

    @Override // com.taobao.android.weex_framework.ui.e
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Override // com.taobao.android.weex_framework.ui.e
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    @Override // com.taobao.android.weex_framework.ui.e
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        UINode uINode = this.f16136a;
        if (uINode == null) {
            return;
        }
        uINode.preallocate(context);
    }

    public s e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("f2afcae9", new Object[]{this}) : this.e;
    }

    public UINode f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINode) ipChange.ipc$dispatch("27406aa5", new Object[]{this}) : this.f16136a;
    }

    public MUSView g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSView) ipChange.ipc$dispatch("bd30148a", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.weex_framework.ui.e
    public void a(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1fde8e", new Object[]{this, mUSDKInstance});
        } else if (mUSDKInstance == null || !(mUSDKInstance.getRenderRoot() instanceof MUSView)) {
        } else {
            this.b = (MUSView) mUSDKInstance.getRenderRoot();
            this.b.setUiNodeTree(this);
        }
    }

    public void a(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        UINode uINode = this.f16136a;
        if (uINode == null) {
            return;
        }
        uINode.collectBatchTasks(list);
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else if (viewGroup != null && !(viewGroup instanceof MUSView)) {
            com.taobao.android.weex_framework.util.g.f(TAG, "MUSUIView is not MUSView!");
        } else {
            if (this.b != viewGroup) {
                this.d = true;
                this.h = false;
                this.i = false;
            }
            this.b = (MUSView) viewGroup;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.d = true;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        UINode uINode = this.f16136a;
        return uINode != null && uINode.isMeasured();
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return n();
        }
        return false;
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (!this.b.isMountStateDirty()) {
            return false;
        }
        if (this.f) {
            c(true);
        } else {
            if (this.g && !this.b.getLocalVisibleRect(this.c)) {
                this.c.setEmpty();
            }
            a(this.c, true, false);
        }
        return true;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        MUSView mUSView = this.b;
        if (mUSView == null) {
            return;
        }
        if (mUSView.getLocalVisibleRect(this.c)) {
            if (this.d && (this.b.getParent() instanceof HorizontalScrollView)) {
                this.b.requestLayout();
                this.d = false;
                return;
            }
            this.i = true;
            a(this.c, z, z);
        } else if (this.h && z) {
            this.h = false;
            this.b.release(false);
        } else if (!this.i || z) {
        } else {
            this.i = false;
            this.c.setEmpty();
            a(this.c, false, false);
        }
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        UINode uINode = this.f16136a;
        if (uINode == null) {
            return 0;
        }
        return uINode.getLayoutWidth();
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue();
        }
        UINode uINode = this.f16136a;
        if (uINode == null) {
            return 0;
        }
        return uINode.getLayoutHeight();
    }

    public boolean a(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1de83139", new Object[]{this, motionEvent, view})).booleanValue();
        }
        UINode uINode = this.f16136a;
        return uINode != null && uINode.dispatchTouchEvent(motionEvent, view);
    }

    public void a(ViewGroup viewGroup, Canvas canvas, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de75f16", new Object[]{this, viewGroup, canvas, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        UINode uINode = this.f16136a;
        if (uINode == null || !(viewGroup instanceof MUSNodeHost)) {
            return;
        }
        uINode.draw((MUSNodeHost) viewGroup, canvas, i, i2, z, 1.0f);
    }

    @Override // com.taobao.android.weex_framework.ui.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        UINode uINode = this.f16136a;
        if (uINode == null) {
            return;
        }
        uINode.activityResume();
    }

    @Override // com.taobao.android.weex_framework.ui.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        UINode uINode = this.f16136a;
        if (uINode == null) {
            return;
        }
        uINode.activityPause();
    }

    public void a(Rect rect, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80a2371", new Object[]{this, rect, new Boolean(z), new Boolean(z2)});
            return;
        }
        s sVar = this.e;
        if (sVar == null) {
            com.taobao.android.weex_framework.util.g.c("Main Thread Layout state is not found");
        } else if (!this.b.getMountState().d() && this.h && rect != null && rect.equals(this.b.getPreviousMountVisibleRectBounds())) {
        } else {
            if (!this.h) {
                this.h = true;
            }
            this.b.getMountState().c();
            this.b.mount(sVar, rect, z, z2);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.f16136a == null || !this.e.i()) {
        } else {
            this.f16136a.updateLayoutState(this.e, 0, 0);
            this.e.j();
            this.e.g();
        }
    }

    public UINode b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINode) ipChange.ipc$dispatch("4fbee3f2", new Object[]{this, new Integer(i)}) : this.f16136a.findNodeById(i);
    }

    @Override // com.taobao.android.weex_framework.ui.e
    public void b(final MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("663b5d2d", new Object[]{this, mUSDKInstance});
            return;
        }
        final LinkedList linkedList = new LinkedList();
        a(linkedList);
        linkedList.add(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex_uikit.ui.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                mUSDKInstance.setRootHeight(i.this.l());
                mUSDKInstance.setRootWidth(i.this.k());
            }
        });
        mUSDKInstance.enqueueTask(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex_uikit.ui.i.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                for (Runnable runnable : linkedList) {
                    runnable.run();
                }
            }
        });
    }
}
