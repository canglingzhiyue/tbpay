package com.taobao.android.detail.kit.view.widget.base.uikit.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import tb.etp;
import tb.etq;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class FeatureList<T extends View> extends ArrayList<etp<? super T>> implements Comparator<etp<? super T>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 5539018560951385305L;
    private T mHost;

    static {
        kge.a(-663355952);
        kge.a(-2099169482);
        kge.a(1678904047);
    }

    public static /* synthetic */ Object ipc$super(FeatureList featureList, String str, Object... objArr) {
        if (str.hashCode() == 195222152) {
            return new Boolean(super.add((FeatureList) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((etp) ((etp) obj));
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return compare((etp) ((etp) obj), (etp) ((etp) obj2));
    }

    public FeatureList(T t) {
        this.mHost = t;
        tpc.a("com.taobao.android.detail.kit.view.widget.base.uikit.utils.FeatureList");
    }

    public boolean add(etp<? super T> etpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9d40ddb", new Object[]{this, etpVar})).booleanValue();
        }
        Iterator<etp<? super T>> it = iterator();
        while (it.hasNext()) {
            etp etpVar2 = (etp) it.next();
            if (TextUtils.equals(etpVar2.getClass().getName(), etpVar.getClass().getName())) {
                throw new RuntimeException(etpVar2.getClass().getName() + " already add to this view");
            }
        }
        boolean add = super.add((FeatureList<T>) etpVar);
        Collections.sort(this, this);
        return add;
    }

    public int compare(etp<? super T> etpVar, etp<? super T> etpVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c124b23d", new Object[]{this, etpVar, etpVar2})).intValue() : etq.a(etpVar.getClass().getSimpleName()) - etq.a(etpVar2.getClass().getSimpleName());
    }

    public void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DetailExt_FeatureNameSpace);
        if (obtainStyledAttributes == null) {
            return;
        }
        Iterator it = etq.a(this.mHost.getContext(), obtainStyledAttributes).iterator();
        while (it.hasNext()) {
            addFeature((etp) it.next());
        }
        obtainStyledAttributes.recycle();
    }

    public boolean addFeature(etp<? super T> etpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37da5a4f", new Object[]{this, etpVar})).booleanValue();
        }
        if (etpVar == null) {
            return false;
        }
        etpVar.a(this.mHost);
        return add((etp) etpVar);
    }

    public etp<? super T> findFeature(Class<? extends etp<? super T>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (etp) ipChange.ipc$dispatch("251d582c", new Object[]{this, cls});
        }
        Iterator<etp<? super T>> it = iterator();
        while (it.hasNext()) {
            etp<? super T> etpVar = (etp) it.next();
            if (etpVar.getClass() == cls) {
                return etpVar;
            }
        }
        return null;
    }

    public boolean removeFeature(Class<? extends etp<? super T>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9158b08", new Object[]{this, cls})).booleanValue();
        }
        Iterator<etp<? super T>> it = iterator();
        while (it.hasNext()) {
            etp etpVar = (etp) it.next();
            if (etpVar.getClass() == cls) {
                return remove(etpVar);
            }
        }
        return false;
    }

    public void clearFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed050131", new Object[]{this});
            return;
        }
        clear();
        this.mHost.requestLayout();
    }
}
