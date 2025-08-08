package com.taobao.tao.sku.widget.base.uikit.utils;

import android.content.Context;
import android.content.res.TypedArray;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.sku.widget.base.uikit.feature.features.FeatureFactory;
import com.taobao.tao.sku.widget.base.uikit.feature.features.a;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes8.dex */
public class FeatureList<T extends View> extends ArrayList<a<? super T>> implements Comparator<a<? super T>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 5539018560951385305L;
    private T mHost;

    static {
        kge.a(-2121798556);
        kge.a(-2099169482);
        kge.a(-583143717);
    }

    public static /* synthetic */ Object ipc$super(FeatureList featureList, String str, Object... objArr) {
        if (str.hashCode() == 195222152) {
            return new Boolean(super.add((FeatureList) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((a) ((a) obj));
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return compare((a) ((a) obj), (a) ((a) obj2));
    }

    public FeatureList(T t) {
        this.mHost = t;
    }

    public boolean add(a<? super T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63871d83", new Object[]{this, aVar})).booleanValue();
        }
        Iterator<a<? super T>> it = iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (StringUtils.equals(aVar2.getClass().getName(), aVar.getClass().getName())) {
                throw new RuntimeException(aVar2.getClass().getName() + " already add to this view");
            }
        }
        boolean add = super.add((FeatureList<T>) aVar);
        Collections.sort(this, this);
        return add;
    }

    public int compare(a<? super T> aVar, a<? super T> aVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf0e79bf", new Object[]{this, aVar, aVar2})).intValue() : FeatureFactory.getFeaturePriority(aVar.getClass().getSimpleName()) - FeatureFactory.getFeaturePriority(aVar2.getClass().getSimpleName());
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
        Iterator it = FeatureFactory.creator(this.mHost.getContext(), obtainStyledAttributes).iterator();
        while (it.hasNext()) {
            addFeature((a) it.next());
        }
        obtainStyledAttributes.recycle();
    }

    public boolean addFeature(a<? super T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a871978f", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        aVar.a(this.mHost);
        return add((a) aVar);
    }

    public a<? super T> findFeature(Class<? extends a<? super T>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e94377d0", new Object[]{this, cls});
        }
        Iterator<a<? super T>> it = iterator();
        while (it.hasNext()) {
            a<? super T> aVar = (a) it.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    public boolean removeFeature(Class<? extends a<? super T>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9158b08", new Object[]{this, cls})).booleanValue();
        }
        Iterator<a<? super T>> it = iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.getClass() == cls) {
                return remove(aVar);
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
