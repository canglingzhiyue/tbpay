package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.u;
import com.taobao.tao.flexbox.layoutmanager.component.v;
import com.taobao.tao.flexbox.layoutmanager.component.x;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.view.edgepan.EdgePanViewPager;
import java.util.HashMap;
import tb.kge;
import tb.ohc;

/* loaded from: classes8.dex */
public class NestViewPager extends EdgePanViewPager implements NestedScrollingParent2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private aa controllerNode;
    private int diffHeight;
    private int lastNestY;
    private int nestScrollDistance;
    private boolean sticky;

    static {
        kge.a(-1411531867);
        kge.a(-2000658237);
    }

    public static /* synthetic */ Object ipc$super(NestViewPager nestViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 80153535) {
            super.onRestoreInstanceState((Parcelable) objArr[0]);
            return null;
        } else if (hashCode != 1780171858) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.pullIntercept((View) objArr[0]));
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
        }
    }

    public NestViewPager(Context context, aa aaVar) {
        super(context);
        this.controllerNode = aaVar;
    }

    public void setNestScrollDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22579e80", new Object[]{this, new Integer(i)});
            return;
        }
        this.nestScrollDistance = i;
        if (i <= 0) {
            return;
        }
        String[] strArr = ((TabBarControllerComponent.c) this.controllerNode.I().getViewParams()).c;
        u a2 = x.a(this.controllerNode, strArr);
        if (a2 != null) {
            this.diffHeight = a2.getViewParams().l;
        }
        v a3 = x.a(this.controllerNode, strArr, false);
        if (a3 == null) {
            return;
        }
        this.sticky = ((v.a) a3.getViewParams()).b;
    }

    public void fullNestScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94435dbb", new Object[]{this});
            return;
        }
        int i = this.nestScrollDistance;
        if (i <= 0 || i == this.lastNestY) {
            return;
        }
        this.lastNestY = i;
        fireNestScrollEvent(i, i);
    }

    public void fireNestScrollEvent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcf0d26", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("nestY", Integer.valueOf(i));
        hashMap.put("maxNestY", Integer.valueOf(i2));
        hashMap.put("group", ((TabBarControllerComponent.c) this.controllerNode.I().getViewParams()).c);
        this.controllerNode.I().sendMessage(512, this.controllerNode, "onnestscroll", null, hashMap, null);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.nestScrollDistance > 0 && !this.sticky && (view2 instanceof TNodeRecyclerView) && (i & 2) != 0) {
            TNodeRecyclerView tNodeRecyclerView = (TNodeRecyclerView) view2;
            tNodeRecyclerView.setNeedResetOffsetInWindow(false);
            float f = -getTranslationY();
            if (f == 0.0f) {
                this.lastNestY = 0;
            } else {
                int i3 = this.nestScrollDistance;
                if (f >= this.diffHeight + i3) {
                    this.lastNestY = i3;
                }
            }
            int i4 = this.nestScrollDistance;
            int i5 = this.diffHeight;
            if (f < i4 + i5) {
                return true;
            }
            if (f >= i4 + i5) {
                if (tNodeRecyclerView.isFirstItemFullVisible()) {
                    return true;
                }
                tNodeRecyclerView.setNeedResetOffsetInWindow(true);
            }
        }
        return false;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
        } else if (this.nestScrollDistance <= 0 && this.sticky) {
        } else {
            float f = (-getTranslationY()) - ((this.diffHeight * this.lastNestY) / this.nestScrollDistance);
            if (f == 0.0f && i2 < 0) {
                return;
            }
            int i4 = this.nestScrollDistance;
            if (f > i4 || !(view instanceof TNodeRecyclerView)) {
                return;
            }
            if (f == i4 && i2 < 0 && !((TNodeRecyclerView) view).isFirstItemFullVisible()) {
                return;
            }
            iArr[1] = Math.min((int) (this.nestScrollDistance - f), i2);
            int max = Math.max(0, (int) (f + iArr[1]));
            if (max == this.lastNestY) {
                return;
            }
            this.lastNestY = max;
            ((TNodeRecyclerView) view).fireNestScrollEvent(0, max, 0, this.nestScrollDistance);
        }
    }

    public void enableEdgeEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b269f98", new Object[]{this});
        } else {
            com.taobao.tao.flexbox.layoutmanager.component.bouncy.a.a(this, false);
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        if (parcelable instanceof ViewPager.SavedState) {
            ohc.a("position", parcelable, Integer.valueOf(getCurrentItem()));
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.edgepan.EdgePanViewPager
    public boolean pullIntercept(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a1b4452", new Object[]{this, view})).booleanValue();
        }
        try {
            if ((view instanceof b) && ((b) view).canPullIntercept(b.PULL_HORIZONTAL_DRAG)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        if (pullIntercept(childAt)) {
                            return true;
                        }
                        if (childAt instanceof b) {
                            break;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable unused) {
            return super.pullIntercept(view);
        }
    }
}
