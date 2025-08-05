package com.taobao.android.searchbaseframe.xsl.section;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.searchbaseframe.util.k;
import java.util.ArrayList;
import java.util.List;
import tb.iru;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f15049a;
    private List<BaseCellBean> b;
    private final int c = j.a(390.0f);
    private b d;
    private RunnableC0576a e;
    private HandlerThread f;
    private iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> g;

    /* loaded from: classes6.dex */
    public interface b {
        void i();
    }

    static {
        kge.a(1880085872);
    }

    public static /* synthetic */ List a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1f6c131b", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ boolean a(a aVar, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("815dd79f", new Object[]{aVar, muiseCellBean})).booleanValue() : aVar.a(muiseCellBean);
    }

    public static /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("469706e0", new Object[]{aVar})).intValue() : aVar.c;
    }

    public static /* synthetic */ int b(a aVar, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d0705ad", new Object[]{aVar, muiseCellBean})).intValue() : aVar.b(muiseCellBean);
    }

    public static /* synthetic */ b c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("46089cee", new Object[]{aVar}) : aVar.d;
    }

    public a(b bVar, HandlerThread handlerThread, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar) {
        this.d = bVar;
        if (handlerThread == null) {
            k.e("CellLayoutHelper", "handlerThread为 null，将无法触发瀑布流底部对齐功能");
            return;
        }
        this.f = handlerThread;
        handlerThread.start();
        this.f15049a = new Handler(handlerThread.getLooper());
        this.g = iruVar;
    }

    public void a(List<BaseCellBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            this.b = new ArrayList(list.size());
            this.b.addAll(list);
            b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<BaseCellBean> list = this.b;
        if (list == null || list.isEmpty()) {
            return;
        }
        RunnableC0576a runnableC0576a = this.e;
        if (runnableC0576a != null) {
            RunnableC0576a.a(runnableC0576a);
            this.e = null;
        }
        this.e = new RunnableC0576a();
        this.f15049a.post(this.e);
    }

    private boolean a(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58213763", new Object[]{this, muiseCellBean})).booleanValue();
        }
        if (muiseCellBean.isSection || muiseCellBean.isFullspan || muiseCellBean.comboFullSpan || (muiseCellBean.combo != null && muiseCellBean.combo.n() == ListStyle.LIST)) {
            return true;
        }
        Object obj = muiseCellBean.mExtraObj.get("fullSpan");
        return (obj instanceof Boolean) && ((Boolean) obj).booleanValue();
    }

    private int b(MuiseCellBean muiseCellBean) {
        TemplateBean template;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6823b31", new Object[]{this, muiseCellBean})).intValue();
        }
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = this.g;
        if (iruVar != null && iruVar.d() != null && (template = this.g.d().getTemplate(muiseCellBean.mMuiseBean.type)) != null) {
            return template.midHeight;
        }
        return -1;
    }

    /* renamed from: com.taobao.android.searchbaseframe.xsl.section.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class RunnableC0576a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b;

        static {
            kge.a(1494066615);
            kge.a(-1390502639);
        }

        private RunnableC0576a() {
            this.b = false;
        }

        public static /* synthetic */ void a(RunnableC0576a runnableC0576a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d631eecf", new Object[]{runnableC0576a});
            } else {
                runnableC0576a.b();
            }
        }

        private boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.b = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (a()) {
            } else {
                try {
                    c();
                } catch (Throwable unused) {
                }
            }
        }

        private void c() {
            int i;
            int i2;
            int i3;
            int abs;
            IpChange ipChange = $ipChange;
            int i4 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            int size = a.a(a.this).size();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            MuiseCellBean muiseCellBean = null;
            MuiseCellBean muiseCellBean2 = null;
            int i8 = 0;
            while (i5 < size && !a()) {
                BaseCellBean baseCellBean = (BaseCellBean) a.a(a.this).get(i5);
                if (baseCellBean instanceof MuiseCellBean) {
                    MuiseCellBean muiseCellBean3 = (MuiseCellBean) baseCellBean;
                    muiseCellBean3.clipHeight = i4;
                    if (a.a(a.this, muiseCellBean3)) {
                        rect.setEmpty();
                        rect2.setEmpty();
                        i6 = 0;
                        i7 = 0;
                        muiseCellBean = null;
                        muiseCellBean2 = null;
                    } else {
                        boolean z = i6 <= i7;
                        int cachedHeight = muiseCellBean3.mMuiseBean.getCachedHeight(ListStyle.WATERFALL);
                        if (cachedHeight <= 0 && (cachedHeight = a.b(a.this, muiseCellBean3)) <= 0) {
                            cachedHeight = a.b(a.this);
                        }
                        if (muiseCellBean3.invisibleCell) {
                            cachedHeight = 0;
                        }
                        if (z) {
                            i = cachedHeight + i6;
                            i2 = i7;
                            i3 = i;
                        } else {
                            i = cachedHeight + i7;
                            i2 = i;
                            int i9 = i7;
                            i3 = i6;
                            i6 = i9;
                        }
                        BaseCellBean baseCellBean2 = i5 < size + (-1) ? (BaseCellBean) a.a(a.this).get(i5 + 1) : null;
                        BaseCellBean baseCellBean3 = i5 < size + (-2) ? (BaseCellBean) a.a(a.this).get(i5 + 2) : null;
                        if (baseCellBean2 != null && baseCellBean2.isSectionClip()) {
                            rect.set(0, i6, 0, i);
                            i8 = baseCellBean2.ownedSectionStyle.f();
                            muiseCellBean = muiseCellBean3;
                        } else if (baseCellBean3 != null && baseCellBean3.isSectionClip()) {
                            rect2.set(0, i6, 0, i);
                            muiseCellBean2 = muiseCellBean3;
                        }
                        if (muiseCellBean != null && muiseCellBean2 != null && (abs = Math.abs(rect.bottom - rect2.bottom)) >= i8) {
                            if (rect.bottom > rect2.bottom) {
                                muiseCellBean.clipHeight = abs;
                            } else {
                                muiseCellBean2.clipHeight = abs;
                            }
                        }
                        i6 = i3;
                        i7 = i2;
                        i5++;
                        i4 = 0;
                    }
                }
                i5++;
                i4 = 0;
            }
            a.c(a.this).i();
        }
    }
}
