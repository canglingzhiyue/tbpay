package com.taobao.android.searchbaseframe.xsl.section.refact;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.xsl.section.h;
import com.taobao.android.xsearchplugin.muise.MuiseHolderContainer;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends RecyclerView.ItemDecoration implements com.taobao.android.searchbaseframe.xsl.section.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Method f15053a;
    private static final Rect b;
    private com.taobao.android.searchbaseframe.xsl.section.c c;
    private PartnerRecyclerView d;
    private boolean e = false;
    private boolean f = false;
    private int g;
    private int h;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fc48125", new Object[]{aVar})).intValue();
        }
        int i = aVar.h;
        aVar.h = i + 1;
        return i;
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8cc1804", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.h = i;
        return i;
    }

    public static /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e402f0c4", new Object[]{aVar})).intValue() : aVar.h;
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78416070", new Object[]{aVar});
        } else {
            aVar.a();
        }
    }

    static {
        kge.a(-2024969318);
        kge.a(995371509);
        b = new Rect();
    }

    public void a(PartnerRecyclerView partnerRecyclerView, com.taobao.android.searchbaseframe.xsl.section.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25dfda4c", new Object[]{this, partnerRecyclerView, cVar});
            return;
        }
        this.c = cVar;
        this.d = partnerRecyclerView;
        partnerRecyclerView.addItemDecoration(this);
        partnerRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.searchbaseframe.xsl.section.refact.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                a.a(a.this);
                if (a.b(a.this) <= 2) {
                    return;
                }
                a.c(a.this);
                a.a(a.this, 0);
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                } else if (i != 0) {
                } else {
                    a.c(a.this);
                    a.a(a.this, 0);
                }
            }
        });
    }

    private void a() {
        try {
            if (f15053a == null) {
                Method declaredMethod = StaggeredGridLayoutManager.class.getDeclaredMethod("checkForGaps", new Class[0]);
                f15053a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f15053a.invoke(this.d.getLayoutManager(), new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
        } else if (this.e) {
        } else {
            int headerViewsCount = this.d.getHeaderViewsCount();
            int footerViewsCount = this.d.getFooterViewsCount();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition < headerViewsCount || childAdapterPosition >= recyclerView.getAdapter().getItemCount() - footerViewsCount) {
                return;
            }
            int i = childAdapterPosition - headerViewsCount;
            if (b(i)) {
                h i2 = this.c.i(i);
                if (i2 == null || !i2.e()) {
                    return;
                }
                a(recyclerView.indexOfChild(view), recyclerView, i);
                return;
            }
            BaseCellBean j = this.c.j(i);
            if (j.clipHeight > 0) {
                this.e = true;
                this.d.getLayoutManager().calculateItemDecorationsForChild(view, b);
                this.e = false;
                this.g = b.bottom;
                rect.set(0, 0, 0, (-b.bottom) - j.clipHeight);
            } else {
                a(view, 0);
            }
            if (!this.f) {
                return;
            }
            if ((!a(i + 1) && !a(i + 2)) || j.clipHeight <= 0) {
                return;
            }
            this.f = false;
            a(view, j.clipHeight);
        }
    }

    private void a(int i, RecyclerView recyclerView, int i2) {
        int bottom;
        int bottom2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d90e5a", new Object[]{this, new Integer(i), recyclerView, new Integer(i2)});
        } else if (i > 0) {
            View childAt = recyclerView.getChildAt(i - 1);
            if (childAt == null) {
                return;
            }
            View childAt2 = recyclerView.getChildAt(i - 2);
            BaseCellBean j = this.c.j(i2 - 1);
            BaseCellBean j2 = this.c.j(i2 - 2);
            if (j == null) {
                return;
            }
            if (childAt2 != null && j2 != null) {
                bottom = (childAt.getBottom() - j.clipHeight) - (childAt2.getBottom() - j2.clipHeight);
            } else {
                bottom = childAt.getBottom();
            }
            if (bottom > 0 || j2 == null) {
                bottom2 = this.g + (childAt.getBottom() - j.clipHeight);
            } else {
                bottom2 = childAt2 != null ? (childAt2.getBottom() - j2.clipHeight) + this.g : 0;
            }
            if (childAt.getBottom() <= bottom2) {
                a(childAt, 0);
            } else {
                a(childAt, (childAt.getBottom() - bottom2) - this.g);
            }
            if (childAt2 == null) {
                return;
            }
            if (childAt2.getBottom() <= bottom2) {
                a(childAt2, 0);
            } else {
                a(childAt2, (childAt2.getBottom() - bottom2) - this.g);
            }
        } else {
            this.f = true;
        }
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        com.taobao.android.searchbaseframe.xsl.section.c cVar = this.c;
        BaseCellBean j = cVar != null ? cVar.j(i) : null;
        return j != null && j.isSectionClip();
    }

    private boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        com.taobao.android.searchbaseframe.xsl.section.c cVar = this.c;
        return cVar != null && cVar.e(i);
    }

    private void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
        } else if (!(view instanceof MuiseHolderContainer)) {
        } else {
            ((MuiseHolderContainer) view).setClipHeight(i);
        }
    }
}
