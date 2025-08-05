package com.taobao.android.detail.core.detail.kit.gallery;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class a extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f9534a;
    public Context b;
    public c c;
    private SparseArray<View> d;

    static {
        kge.a(-1088244392);
    }

    public abstract View b(int i);

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
    }

    public a(Context context) {
        this.b = context;
        emu.a("com.taobao.android.detail.core.detail.kit.gallery.BaseGalleryViewAdapter");
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254f4ea5", new Object[]{this, cVar});
        } else {
            this.c = cVar;
        }
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f9534a = list;
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<String> list = this.f9534a;
        if (list != null && list.size() != 0) {
            return this.f9534a.size();
        }
        return 0;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        List<String> list = this.f9534a;
        if (list == null || list.size() <= 0) {
            return null;
        }
        View b = b(i);
        if (this.c != null) {
            b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.gallery.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (a.this.c == null) {
                    } else {
                        a.this.c.a(view);
                    }
                }
            });
            b.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.detail.core.detail.kit.gallery.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                    }
                    return false;
                }
            });
        }
        viewGroup.addView(b, 0);
        return b;
    }

    public View a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
        }
        if (this.d == null) {
            List<String> list = this.f9534a;
            if (list != null) {
                this.d = new SparseArray<>(list.size());
            } else {
                this.d = new SparseArray<>();
            }
        }
        if (i > this.d.size()) {
            return null;
        }
        return this.d.get(i);
    }

    public void a(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11131157", new Object[]{this, new Integer(i), view});
            return;
        }
        if (this.d == null) {
            List<String> list = this.f9534a;
            if (list != null) {
                this.d = new SparseArray<>(list.size());
            } else {
                this.d = new SparseArray<>();
            }
        }
        this.d.put(i, view);
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else if (viewGroup == null) {
        } else {
            viewGroup.removeView(a(i));
        }
    }
}
