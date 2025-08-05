package com.taobao.android.detail.ttdetail.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class h extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final PagerAdapter f11032a;

    static {
        kge.a(139947751);
    }

    public h(PagerAdapter pagerAdapter) {
        this.f11032a = pagerAdapter;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63701d27", new Object[]{this, dataSetObserver});
        } else {
            this.f11032a.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66db852e", new Object[]{this, dataSetObserver});
        } else {
            this.f11032a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        if (this.f11032a.getCount() <= 0) {
            return 0;
        }
        return this.f11032a.getCount() + 2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        int count = this.f11032a.getCount();
        if (count == 0) {
            return null;
        }
        if (i == 0) {
            return this.f11032a.instantiateItem(viewGroup, count - 1);
        }
        if (i == getCount() - 1) {
            return this.f11032a.instantiateItem(viewGroup, 0);
        }
        return this.f11032a.instantiateItem(viewGroup, i - 1);
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        int count = this.f11032a.getCount();
        if (count == 0) {
            return;
        }
        if (i == 0) {
            this.f11032a.destroyItem(viewGroup, count - 1, obj);
        } else if (i == getCount() - 1) {
            this.f11032a.destroyItem(viewGroup, 0, obj);
        } else {
            this.f11032a.destroyItem(viewGroup, i - 1, obj);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public float getPageWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5c622b", new Object[]{this, new Integer(i)})).floatValue();
        }
        int count = this.f11032a.getCount();
        if (count == 0) {
            return 1.0f;
        }
        if (i == 0) {
            return this.f11032a.getPageWidth(count - 1);
        }
        if (i == getCount() - 1) {
            return this.f11032a.getPageWidth(0);
        }
        return this.f11032a.getPageWidth(i - 1);
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : this.f11032a.isViewFromObject(view, obj);
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue() : this.f11032a.getItemPosition(obj);
    }

    @Override // android.support.v4.view.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c641511", new Object[]{this, viewGroup});
        } else {
            this.f11032a.startUpdate(viewGroup);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            this.f11032a.setPrimaryItem(viewGroup, i, obj);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad9102", new Object[]{this, viewGroup});
        } else {
            this.f11032a.finishUpdate(viewGroup);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public Parcelable saveState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Parcelable) ipChange.ipc$dispatch("b5f2b05e", new Object[]{this}) : this.f11032a.saveState();
    }

    @Override // android.support.v4.view.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ccff61", new Object[]{this, parcelable, classLoader});
        } else {
            this.f11032a.restoreState(parcelable, classLoader);
        }
    }
}
