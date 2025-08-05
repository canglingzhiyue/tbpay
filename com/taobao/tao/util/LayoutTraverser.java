package com.taobao.tao.util;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class LayoutTraverser {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Processor processor;

    /* loaded from: classes8.dex */
    public interface Processor {
        void process(View view);
    }

    static {
        kge.a(1622774409);
    }

    private LayoutTraverser(Processor processor) {
        this.processor = processor;
    }

    public static LayoutTraverser build(Processor processor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutTraverser) ipChange.ipc$dispatch("fa2b813d", new Object[]{processor}) : new LayoutTraverser(processor);
    }

    public void traverse(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b405238", new Object[]{this, viewGroup});
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            this.processor.process(childAt);
            if (childAt instanceof ViewGroup) {
                traverse((ViewGroup) childAt);
            }
        }
    }
}
