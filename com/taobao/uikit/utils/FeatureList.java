package com.taobao.uikit.utils;

import android.content.Context;
import android.content.res.TypedArray;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.FeatureFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class FeatureList<T extends View> extends ArrayList<AbsFeature<? super T>> implements IFeatureList<T>, Comparator<AbsFeature<? super T>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 5539018560951385305L;
    private T mHost;

    public static /* synthetic */ Object ipc$super(FeatureList featureList, String str, Object... objArr) {
        if (str.hashCode() == 195222152) {
            return new Boolean(super.add((FeatureList) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((AbsFeature) ((AbsFeature) obj));
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return compare((AbsFeature) ((AbsFeature) obj), (AbsFeature) ((AbsFeature) obj2));
    }

    public FeatureList(T t) {
        this.mHost = t;
    }

    public boolean add(AbsFeature<? super T> absFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("434755de", new Object[]{this, absFeature})).booleanValue();
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            AbsFeature absFeature2 = get(i);
            if (StringUtils.equals(absFeature2.getClass().getName(), absFeature.getClass().getName())) {
                throw new RuntimeException(absFeature2.getClass().getName() + " already add to this view");
            }
        }
        boolean add = super.add((FeatureList<T>) absFeature);
        Collections.sort(this, this);
        return add;
    }

    public int compare(AbsFeature<? super T> absFeature, AbsFeature<? super T> absFeature2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("477c33c3", new Object[]{this, absFeature, absFeature2})).intValue() : FeatureFactory.getFeaturePriority(absFeature.getClass().getName()) - FeatureFactory.getFeaturePriority(absFeature2.getClass().getName());
    }

    @Override // com.taobao.uikit.utils.IFeatureList
    public void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FeatureNameSpace);
        if (obtainStyledAttributes == null) {
            return;
        }
        ArrayList creator = FeatureFactory.creator(this.mHost.getContext(), obtainStyledAttributes);
        int size = creator.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbsFeature<? super T> absFeature = (AbsFeature) creator.get(i2);
            addFeature(absFeature);
            absFeature.constructor(context, attributeSet, i);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // com.taobao.uikit.utils.IFeatureList
    public boolean addFeature(AbsFeature<? super T> absFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa4ab52", new Object[]{this, absFeature})).booleanValue();
        }
        if (absFeature == null) {
            return false;
        }
        absFeature.setHost(this.mHost);
        return add((AbsFeature) absFeature);
    }

    @Override // com.taobao.uikit.utils.IFeatureList
    public AbsFeature<? super T> findFeature(Class<? extends AbsFeature<? super T>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsFeature) ipChange.ipc$dispatch("67a9db6f", new Object[]{this, cls});
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            AbsFeature<? super T> absFeature = (AbsFeature) get(i);
            if (absFeature.getClass() == cls) {
                return absFeature;
            }
        }
        return null;
    }

    @Override // com.taobao.uikit.utils.IFeatureList
    public boolean removeFeature(Class<? extends AbsFeature<? super T>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9158b08", new Object[]{this, cls})).booleanValue();
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            AbsFeature absFeature = get(i);
            if (absFeature.getClass() == cls) {
                return remove(absFeature);
            }
        }
        return false;
    }

    @Override // com.taobao.uikit.utils.IFeatureList
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
