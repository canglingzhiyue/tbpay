package com.taobao.message.uikit.util;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/message/uikit/util/ViewTraversalHelper;", "", "rootView", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "deepestView", "Landroid/view/View;", "deepestViewDepth", "", "findDeepestChildOfSameSize", "findDeepestChildOfSameSizeTraversal", "", "viewGroup", "deep", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class ViewTraversalHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View deepestView;
    private int deepestViewDepth;
    private final ViewGroup rootView;

    static {
        kge.a(285776802);
    }

    public ViewTraversalHelper(ViewGroup rootView) {
        q.c(rootView, "rootView");
        this.rootView = rootView;
        this.deepestViewDepth = -1;
    }

    public final View findDeepestChildOfSameSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c884d7a2", new Object[]{this});
        }
        if (this.rootView.getWidth() == 0) {
            return this.rootView;
        }
        findDeepestChildOfSameSizeTraversal(this.rootView, 0);
        return this.deepestView;
    }

    private final void findDeepestChildOfSameSizeTraversal(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce860b8", new Object[]{this, viewGroup, new Integer(i)});
        } else if (viewGroup.getWidth() >= this.rootView.getWidth() && viewGroup.getHeight() >= this.rootView.getHeight()) {
            if (i >= this.deepestViewDepth) {
                this.deepestViewDepth = i;
                this.deepestView = viewGroup;
            }
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (!(childAt instanceof ViewGroup)) {
                    childAt = null;
                }
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                if (viewGroup2 != null) {
                    if (!(viewGroup2.getVisibility() == 0)) {
                        viewGroup2 = null;
                    }
                    if (viewGroup2 != null) {
                        findDeepestChildOfSameSizeTraversal(viewGroup2, i + 1);
                    }
                }
            }
        }
    }
}
