package com.taobao.tao.util;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.LayoutTraverser;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public final class ViewUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1345983647);
    }

    private ViewUtils() {
    }

    public static <T extends View> List<T> find(ViewGroup viewGroup, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d1df1f69", new Object[]{viewGroup, cls});
        }
        a aVar = new a(cls);
        LayoutTraverser.build(aVar).traverse(viewGroup);
        return aVar.a();
    }

    /* loaded from: classes8.dex */
    public static class a<T extends View> implements LayoutTraverser.Processor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f21171a;
        private final List<T> b;

        static {
            kge.a(-1788076036);
            kge.a(978587671);
        }

        private a(Class<T> cls) {
            this.f21171a = cls;
            this.b = new ArrayList();
        }

        @Override // com.taobao.tao.util.LayoutTraverser.Processor
        public void process(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afa8d59c", new Object[]{this, view});
            } else if (!this.f21171a.isInstance(view)) {
            } else {
                this.b.add(view);
            }
        }

        public List<T> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
        }
    }
}
