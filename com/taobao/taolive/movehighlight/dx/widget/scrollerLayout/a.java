package com.taobao.taolive.movehighlight.dx.widget.scrollerLayout;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.b;
import com.taobao.android.dinamicx.widget.x;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends x.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_COMMON_VIEW = 1;
    public static final int TYPE_EMPTY_VIEW = 3;
    public static final int TYPE_FOOTER_VIEW = 2;
    public boolean d;
    public int e;
    private RelativeLayout f;
    private View g;
    private b h;
    private ProgressBar i;
    private int j;

    static {
        kge.a(1746769954);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1760699264:
                return new Integer(super.getItemCount());
            case 275888298:
                super.onBindViewHolder((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 305564974:
                return super.mo1596onCreateViewHolder((ViewGroup) objArr[0], ((Number) objArr[1]).intValue());
            case 431080268:
                return new Long(super.getItemId(((Number) objArr[0]).intValue()));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void a(a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951b6ff", new Object[]{aVar, view});
        } else {
            aVar.a(view);
        }
    }

    public static /* synthetic */ boolean a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46719274", new Object[]{aVar, new Integer(i)})).booleanValue() : aVar.c(i);
    }

    public a(Context context, x xVar) {
        super(context, xVar);
        this.d = true;
        this.j = 1;
        this.e = 3;
        View a2 = com.taobao.android.dinamicx.widget.scroller.a.a(context, R.layout.taolive_higlight_dx_scrollable_load_more_bottom);
        this.i = (ProgressBar) a2.findViewById(R.id.taolive_highlight_scrollable_loadmore_progressbar);
        this.i.setVisibility(8);
        b(a2);
    }

    public void a(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a5b2ac", new Object[]{this, bVar});
            return;
        }
        this.h = bVar;
        this.h.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
                }
                if (!a.a(a.this, i)) {
                    return 1;
                }
                return bVar.getSpanCount();
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (b() && this.g != null) {
            return 3;
        }
        return c(i) ? 2 : 1;
    }

    @Override // com.taobao.android.dinamicx.widget.x.c, android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : super.getItemId(i);
    }

    @Override // com.taobao.android.dinamicx.widget.x.c, android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        if (this.b != null && !this.b.isEmpty()) {
            return this.b.size() + a();
        }
        return super.getItemCount();
    }

    private int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : (!this.d || b()) ? 0 : 1;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b == null || this.b.isEmpty();
    }

    private boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue() : this.d && i >= getItemCount() - 1;
    }

    @Override // com.taobao.android.dinamicx.widget.x.c, android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == 2) {
            if (this.f == null) {
                this.f = new RelativeLayout(this.f12213a);
            }
            com.taobao.android.dinamicx.widget.scroller.b a2 = com.taobao.android.dinamicx.widget.scroller.b.a(this.f);
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.a(a.this, view);
                    }
                }
            });
            return a2;
        }
        return super.mo1596onCreateViewHolder(viewGroup, i);
    }

    @Override // com.taobao.android.dinamicx.widget.x.c, android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        if (getItemViewType(i) == 1) {
            super.onBindViewHolder(viewHolder, i);
        }
        d(i);
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (3 != this.j) {
        } else {
            d(-1);
        }
    }

    private void d(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (!this.d || (i2 = this.j) == 2 || i2 == 5 || b() || this.b.size() <= 0) {
        } else {
            if (i < 0) {
                if (this.c == null || !(this.c instanceof DXHighlightScrollableLayoutWidgetNode)) {
                    return;
                }
                a(2);
                ((DXHighlightScrollableLayoutWidgetNode) this.c).a();
            } else if ((this.b.size() - 1) - (i - a()) > this.e || this.c == null || !(this.c instanceof DXHighlightScrollableLayoutWidgetNode)) {
            } else {
                a(2);
                ((DXHighlightScrollableLayoutWidgetNode) this.c).a();
            }
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = i;
        if (i == 2) {
            this.i.setVisibility(0);
        } else if (i != 3 && i != 4 && i != 5) {
        } else {
            this.i.setVisibility(8);
        }
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null) {
        } else {
            if (this.f == null) {
                this.f = new RelativeLayout(this.f12213a);
            }
            c();
            this.f.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f.removeAllViews();
        }
    }
}
