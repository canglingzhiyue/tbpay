package com.taobao.search.sf;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.util.r;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.List;
import tb.inx;
import tb.kge;
import tb.noa;

/* loaded from: classes8.dex */
public class b implements inx.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public e f19434a;

    static {
        kge.a(1812637353);
        kge.a(943299042);
    }

    @Override // tb.inx.b
    public void a(RecyclerView.ItemDecoration itemDecoration, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b9db13", new Object[]{this, itemDecoration, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.inx.b
    public RecyclerView.ItemDecoration b(int i, com.taobao.android.searchbaseframe.datasource.impl.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemDecoration) ipChange.ipc$dispatch("6ae01726", new Object[]{this, new Integer(i), aVar});
        }
        if (this.f19434a == null) {
            this.f19434a = new e();
        }
        return this.f19434a;
    }

    @Override // tb.inx.b
    public void a(ListStyle listStyle, int i, com.taobao.android.searchbaseframe.datasource.impl.a aVar, RecyclerView recyclerView, RecyclerView.ItemDecoration itemDecoration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760c33ae", new Object[]{this, listStyle, new Integer(i), aVar, recyclerView, itemDecoration});
            return;
        }
        com.taobao.search.sf.datasource.c cVar = (com.taobao.search.sf.datasource.c) aVar;
        this.f19434a.a(listStyle, cVar.r(), cVar.getTab(), cVar.s(), recyclerView, aVar);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if ((context instanceof com.taobao.android.xsearchplugin.muise.f) && ((com.taobao.android.xsearchplugin.muise.f) context).g()) {
            return context.getResources().getColor(R.color.tbsearch_main_card_bg_night);
        }
        return -1;
    }

    /* loaded from: classes8.dex */
    public static class e extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public f c;
        public f h;
        public List<String> i = Arrays.asList(r.aC());

        /* renamed from: a  reason: collision with root package name */
        public f f19436a = new C0784b();
        public f f = new a();
        public f g = new g();

        static {
            kge.a(-1327355610);
        }

        public e() {
            int round = Math.round(com.taobao.search.common.util.l.d(15)) / 2;
            this.h = new g(round, round);
            this.c = this.g;
        }

        public void a(ListStyle listStyle, String str, String str2, String str3, RecyclerView recyclerView, com.taobao.android.searchbaseframe.datasource.impl.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61a66d92", new Object[]{this, listStyle, str, str2, str3, recyclerView, aVar});
                return;
            }
            int a2 = b.a(recyclerView.getContext());
            if (noa.VALUE_MODULE_INSHOP.equalsIgnoreCase(str)) {
                this.c = this.g;
                recyclerView.setBackgroundColor(a2);
            } else if ("shop".equalsIgnoreCase(str2) || noa.VALUE_SHOWTYPE_SIMILAR_SHOP.equalsIgnoreCase(str)) {
                this.c = this.f19436a;
                ViewCompat.setBackground(recyclerView, null);
            } else if (noa.SHOW_NEW_SIMILAR_PAGE.equals(str)) {
                this.c = this.g;
                recyclerView.setBackgroundColor(a2);
            } else if (StringUtils.isEmpty(str2) || "all".equalsIgnoreCase(str2)) {
                this.c = this.h;
                recyclerView.setBackgroundColor(a2);
            } else if (this.i.contains(str2)) {
                this.c = this.g;
                recyclerView.setBackgroundColor(a2);
            } else {
                this.c = this.f;
                recyclerView.setBackgroundColor(a2);
            }
            this.c.a(str2, listStyle, recyclerView);
            if (CommonSearchContext.isGallerySrp(aVar.getParamStr("m"))) {
                ViewCompat.setBackground(recyclerView, null);
                return;
            }
            CommonSearchResult commonSearchResult = (CommonSearchResult) aVar.getTotalSearchResult();
            if (commonSearchResult == null || !commonSearchResult.newSearch) {
                return;
            }
            ViewCompat.setBackground(recyclerView, null);
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            } else {
                this.c.getItemOffsets(rect, view, recyclerView, state);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class f extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-645789949);
        }

        public void a(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
            }
        }

        public abstract void a(String str, ListStyle listStyle, RecyclerView recyclerView);

        public boolean a(View view, Rect rect) {
            View childAt;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("15bb17f3", new Object[]{this, view, rect})).booleanValue();
            }
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() <= 0 || (childAt = frameLayout.getChildAt(0)) == null) {
                    return false;
                }
                int id = childAt.getId();
                if (id == R.id.libsf_srp_list_blank || id == R.id.libsf_srp_list_header_container || id == R.id.libsf_srp_list_footer_container) {
                    a(rect);
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes8.dex */
    public static class g extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final int REM12;

        /* renamed from: a  reason: collision with root package name */
        private ListStyle f19437a;
        private int b;
        private int c;

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            if (str.hashCode() == 364582899) {
                return new Boolean(super.a((View) objArr[0], (Rect) objArr[1]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.search.sf.b.f
        public /* bridge */ /* synthetic */ boolean a(View view, Rect rect) {
            return super.a(view, rect);
        }

        static {
            kge.a(616416310);
            REM12 = Math.round(com.taobao.search.common.util.l.e(12));
        }

        public g() {
            int i = REM12;
            this.b = i / 2;
            this.c = i / 2;
        }

        public g(int i, int i2) {
            int i3 = REM12;
            this.b = i3 / 2;
            this.c = i3 / 2;
            this.b = i;
            this.c = i2;
        }

        @Override // com.taobao.search.sf.b.f
        public void a(String str, ListStyle listStyle, RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("624f0389", new Object[]{this, str, listStyle, recyclerView});
                return;
            }
            this.f19437a = listStyle;
            if (listStyle == ListStyle.LIST) {
                recyclerView.setPadding(0, 0, 0, 0);
                return;
            }
            int i = (REM12 * 3) / 6;
            recyclerView.setPadding(i, 0, i, 0);
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            } else if (a(view, rect)) {
            } else {
                if ((view.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) && ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).isFullSpan()) {
                    a(rect);
                } else if (this.f19437a != ListStyle.WATERFALL) {
                } else {
                    rect.top = this.b;
                    rect.bottom = this.c;
                    int i = (REM12 * 3) / 6;
                    rect.left = i;
                    rect.right = i;
                }
            }
        }

        @Override // com.taobao.search.sf.b.f
        public void a(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
            } else if (this.f19437a != ListStyle.WATERFALL) {
            } else {
                int i = -((REM12 * 3) / 6);
                rect.left = i;
                rect.right = i;
            }
        }

        public static int a(ListStyle listStyle, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("510f631", new Object[]{listStyle, new Integer(i)})).intValue() : listStyle == ListStyle.LIST ? i : (i - (((REM12 * 3) / 6) * 6)) / 2;
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final int DIP4U5;

        /* renamed from: a  reason: collision with root package name */
        private ListStyle f19435a;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 364582899) {
                return new Boolean(super.a((View) objArr[0], (Rect) objArr[1]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.search.sf.b.f
        public /* bridge */ /* synthetic */ boolean a(View view, Rect rect) {
            return super.a(view, rect);
        }

        static {
            kge.a(-268367754);
            DIP4U5 = com.taobao.search.common.util.l.a(4.5f);
        }

        @Override // com.taobao.search.sf.b.f
        public void a(String str, ListStyle listStyle, RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("624f0389", new Object[]{this, str, listStyle, recyclerView});
                return;
            }
            this.f19435a = listStyle;
            if (listStyle == ListStyle.LIST) {
                recyclerView.setPadding(a(listStyle, 0), 0, a(listStyle, 0), 0);
            } else {
                recyclerView.setPadding(a(listStyle, DIP4U5), 0, a(listStyle, DIP4U5), 0);
            }
        }

        public static int a(ListStyle listStyle, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("510f631", new Object[]{listStyle, new Integer(i)})).intValue();
            }
            if (listStyle != ListStyle.LIST) {
                return (i * 5) / 3;
            }
            return 0;
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            } else if (a(view, rect)) {
            } else {
                if ((view.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) && ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).isFullSpan()) {
                    a(rect);
                } else if (this.f19435a != ListStyle.WATERFALL) {
                } else {
                    int i = DIP4U5;
                    rect.top = i;
                    rect.bottom = i;
                    rect.left = i;
                    rect.right = i;
                }
            }
        }

        @Override // com.taobao.search.sf.b.f
        public void a(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
            } else if (this.f19435a != ListStyle.WATERFALL) {
            } else {
                int i = DIP4U5;
                rect.left = ((-i) * 5) / 3;
                rect.right = ((-i) * 5) / 3;
            }
        }
    }

    /* renamed from: com.taobao.search.sf.b$b  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0784b extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1049459775);
        }

        @Override // com.taobao.search.sf.b.f
        public void a(String str, ListStyle listStyle, RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("624f0389", new Object[]{this, str, listStyle, recyclerView});
            }
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            } else {
                rect.set(0, 0, 0, 0);
            }
        }
    }
}
