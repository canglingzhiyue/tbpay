package com.taobao.tao.combo.ui;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;

    /* renamed from: a  reason: collision with root package name */
    private DataSetObservable f19896a = new DataSetObservable();

    static {
        kge.a(-990638500);
    }

    public abstract int a();

    public int a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{this, obj})).intValue();
        }
        return -1;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        }
    }

    public abstract boolean a(View view, Object obj);

    public Parcelable b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("156a922c", new Object[]{this});
        }
        return null;
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            a((View) viewGroup);
        }
    }

    public Object a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7fa6cf76", new Object[]{this, viewGroup, new Integer(i)}) : a((View) viewGroup, i);
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320b4018", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            a((View) viewGroup, i, obj);
        }
    }

    public Object a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("20bc4779", new Object[]{this, view, new Integer(i)});
        }
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void a(View view, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a4c875", new Object[]{this, view, new Integer(i), obj});
            return;
        }
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.f19896a.notifyChanged();
        }
    }

    public void a(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26d9add", new Object[]{this, dataSetObserver});
        } else {
            this.f19896a.registerObserver(dataSetObserver);
        }
    }

    public void b(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6e921e", new Object[]{this, dataSetObserver});
        } else {
            this.f19896a.unregisterObserver(dataSetObserver);
        }
    }
}
