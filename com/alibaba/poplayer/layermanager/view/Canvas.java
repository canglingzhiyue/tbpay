package com.alibaba.poplayer.layermanager.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.utils.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes3.dex */
public class Canvas extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-551147427);
    }

    public static /* synthetic */ Object ipc$super(Canvas canvas, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public Canvas(Context context) {
        super(context);
    }

    public Canvas(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Canvas(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void addViewByLevel(PopRequest popRequest, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d3dbab", new Object[]{this, popRequest, view, new Integer(i)});
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            view.setImportantForAccessibility(2);
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int intValue = ((Integer) getChildAt(i2).getTag(R.id.layermanager_canvas_innerview_id)).intValue();
            if (intValue == i) {
                return;
            }
            if (intValue > i) {
                prepareToAddView(popRequest, view, i);
                addView(view, i2);
                return;
            }
        }
        prepareToAddView(popRequest, view, i);
        addView(view, getChildCount());
    }

    private void prepareToAddView(PopRequest popRequest, View view, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595d9ce8", new Object[]{this, popRequest, view, new Integer(i)});
            return;
        }
        view.setTag(R.id.layermanager_canvas_innerview_id, Integer.valueOf(i));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!g.a(popRequest.f3190a.get()) || popRequest.o()) {
            z = false;
        }
        if (z) {
            layoutParams.topMargin += g.a(PopLayer.getReference().getApp());
        }
        view.setLayoutParams(layoutParams);
    }

    public View findViewByLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7a430c2f", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (((Integer) getChildAt(i2).getTag(R.id.layermanager_canvas_innerview_id)).intValue() == i) {
                return getChildAt(i2);
            }
        }
        return null;
    }

    public boolean contains(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3a8d7f0", new Object[]{this, view})).booleanValue();
        }
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) == view) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<View> all() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d886c582", new Object[]{this});
        }
        ArrayList<View> arrayList = new ArrayList<>();
        for (int i = 0; i < getChildCount(); i++) {
            arrayList.add(getChildAt(i));
        }
        return arrayList;
    }
}
