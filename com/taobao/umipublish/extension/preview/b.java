package com.taobao.umipublish.extension.preview;

import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.preview.PreviewModel;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class b extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int c;
    private int f;
    private final int d = -1;

    /* renamed from: a  reason: collision with root package name */
    private List<PreviewModel.Media> f23247a = new ArrayList();
    private SparseArray<a> b = new SparseArray<>();
    private int e = -1;
    private boolean g = true;

    static {
        kge.a(65464380);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -2093417530) {
            super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        return -2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
    }

    public void a(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6749fa", new Object[]{this, new Integer(i), aVar});
        } else {
            this.b.put(i, aVar);
        }
    }

    public void a(List<PreviewModel.Media> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.f23247a.clear();
        this.f23247a.addAll(list);
        notifyDataSetChanged();
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        int b = b(i);
        if (b < 0 || b >= this.f23247a.size()) {
            return;
        }
        a(b, (View) obj);
        this.e = b;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        PreviewModel.Media media = this.f23247a.get(b(i));
        return a(media).a(viewGroup, media);
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : getCount() <= 0 ? i : i % getCount();
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            a((View) obj);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.f23247a.size();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.g) {
            this.g = false;
        } else {
            int i = this.e;
            if (i < 0 || 1 != this.f23247a.get(i).type) {
                return;
            }
            this.b.get(1).a();
        }
    }

    private void a(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11131157", new Object[]{this, new Integer(i), view});
            return;
        }
        PreviewModel.Media media = this.f23247a.get(i);
        int i2 = this.c;
        if (2 == i2) {
            this.b.get(media.type).a(view, media);
        } else {
            this.b.get(i2).a(view, media);
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        int i = this.c;
        if (2 == i) {
            this.b.get(this.f).a(view);
        } else {
            this.b.get(i).a(view);
        }
    }

    private a a(PreviewModel.Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("28890646", new Object[]{this, media});
        }
        int i = this.c;
        if (2 == i) {
            return this.b.get(media.type);
        }
        return this.b.get(i);
    }
}
