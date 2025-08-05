package com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import java.util.HashMap;
import java.util.Hashtable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class AutoWrapLayout extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_SIMPLIFIED_MODE_LINES = 1;
    private static final int LAYOUT_END_RES_ID = 99999;
    private static final int NEW_LINE_ID = 99990;
    private static final String TAG = "AutoWrapLineLayout";
    private float DENSITY;
    private HashMap<View, Rect> mAdjustedRectMap;
    private int mItemSpacing;
    private View mLayoutEndView;
    private int mLineGravity;
    private int mLineSpacing;
    private int mLines;
    public Hashtable<View, a> mPosMap;
    private boolean mSimplifiedMode;
    private int mSimplifiedModeLines;

    static {
        kge.a(-1768573439);
    }

    public static /* synthetic */ Object ipc$super(AutoWrapLayout autoWrapLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1556944264) {
            super.addView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
            return null;
        } else if (hashCode == -572887227) {
            super.addView((View) objArr[0]);
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public AutoWrapLayout(Context context) {
        super(context);
        this.DENSITY = 0.0f;
        this.mItemSpacing = 0;
        this.mLineSpacing = 0;
        this.mLineGravity = 17;
        this.mSimplifiedMode = false;
        this.mSimplifiedModeLines = 0;
        this.mLayoutEndView = null;
        this.mPosMap = new Hashtable<>();
        this.mAdjustedRectMap = new HashMap<>();
        initDefaultData();
    }

    public AutoWrapLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.DENSITY = 0.0f;
        this.mItemSpacing = 0;
        this.mLineSpacing = 0;
        this.mLineGravity = 17;
        this.mSimplifiedMode = false;
        this.mSimplifiedModeLines = 0;
        this.mLayoutEndView = null;
        this.mPosMap = new Hashtable<>();
        this.mAdjustedRectMap = new HashMap<>();
        initDefaultData();
    }

    public AutoWrapLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.DENSITY = 0.0f;
        this.mItemSpacing = 0;
        this.mLineSpacing = 0;
        this.mLineGravity = 17;
        this.mSimplifiedMode = false;
        this.mSimplifiedModeLines = 0;
        this.mLayoutEndView = null;
        this.mPosMap = new Hashtable<>();
        this.mAdjustedRectMap = new HashMap<>();
        initDefaultData();
    }

    public AutoWrapLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.DENSITY = 0.0f;
        this.mItemSpacing = 0;
        this.mLineSpacing = 0;
        this.mLineGravity = 17;
        this.mSimplifiedMode = false;
        this.mSimplifiedModeLines = 0;
        this.mLayoutEndView = null;
        this.mPosMap = new Hashtable<>();
        this.mAdjustedRectMap = new HashMap<>();
        initDefaultData();
    }

    private void initDefaultData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3918962", new Object[]{this});
            return;
        }
        this.DENSITY = getResources().getDisplayMetrics().density;
        float f = this.DENSITY;
        this.mItemSpacing = (int) (6.0f * f);
        this.mLineSpacing = (int) (f * 8.0f);
        emu.a("com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview.AutoWrapLayout");
    }

    public void setSimplifiedMode(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d9da1d3", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        this.mSimplifiedMode = z;
        if (!this.mSimplifiedMode) {
            return;
        }
        this.mSimplifiedModeLines = i;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
            return;
        }
        super.addView(view);
        this.mPosMap.put(view, new a());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a332ea78", new Object[]{this, view, layoutParams});
            return;
        }
        super.addView(view, layoutParams);
        this.mPosMap.put(view, new a());
    }

    public void addLayoutEndView(View view) {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea439cd6", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setId(LAYOUT_END_RES_ID);
            if (view.getParent() != null && (parent = view.getParent()) != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(view);
            }
            this.mLayoutEndView = view;
            addView(this.mLayoutEndView);
        }
    }

    public void addLayoutEndView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9bc9387", new Object[]{this, view, layoutParams});
        } else if (view == null || getChildCount() <= 0) {
        } else {
            view.setId(LAYOUT_END_RES_ID);
            this.mLayoutEndView = view;
            addView(this.mLayoutEndView, layoutParams);
        }
    }

    public void adjustView(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad1aa237", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else if (view == null || !equals(view.getParent())) {
        } else {
            this.mAdjustedRectMap.put(view, new Rect(i, i2, 0, 0));
        }
    }

    public boolean isChildVisible(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f2a32ef", new Object[]{this, view})).booleanValue();
        }
        if (indexOfChild(view) < 0) {
            return false;
        }
        return !this.mSimplifiedMode || this.mPosMap.get(view).e < this.mSimplifiedModeLines;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Hashtable<View, a> hashtable = this.mPosMap;
        if (hashtable != null) {
            hashtable.clear();
            this.mPosMap = null;
        }
        HashMap<View, Rect> hashMap = this.mAdjustedRectMap;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
        this.mAdjustedRectMap = null;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            a aVar = this.mPosMap.get(childAt);
            if (aVar.e <= this.mLines) {
                if (aVar != null) {
                    if (!this.mSimplifiedMode || aVar.e < this.mSimplifiedModeLines) {
                        i5 = aVar.f9565a;
                        i6 = aVar.b;
                        i7 = aVar.c;
                        i8 = aVar.d;
                        Rect rect = this.mAdjustedRectMap.get(childAt);
                        if (rect != null) {
                            i6 += rect.top;
                            i8 += rect.top;
                        }
                    } else {
                        i8 = 0;
                        i5 = 0;
                        i6 = 0;
                        i7 = 0;
                    }
                    childAt.layout(i5, i6, i7, i8);
                } else {
                    i.a(TAG, "onLayout() error");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c2 A[SYNTHETIC] */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r22, int r23) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview.AutoWrapLayout.onMeasure(int, int):void");
    }

    private int getPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48c80279", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i > 0) {
            int i3 = i2 - 1;
            return getPosition(i - 1, i3) + getChildAt(i3).getMeasuredWidth() + this.mItemSpacing;
        }
        return getPaddingLeft();
    }

    public void setItemSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f8942e", new Object[]{this, new Integer(i)});
        } else {
            this.mItemSpacing = i;
        }
    }

    public void setLineSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f47f8f", new Object[]{this, new Integer(i)});
        } else {
            this.mLineSpacing = i;
        }
    }

    public void setLineGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339b0064", new Object[]{this, new Integer(i)});
        } else {
            this.mLineGravity = i;
        }
    }

    public int getLines() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9558ad43", new Object[]{this})).intValue() : this.mLines + 1;
    }

    public int getSimplifiedModeLines() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a99b4e8", new Object[]{this})).intValue() : this.mSimplifiedModeLines;
    }

    public boolean getSimplifiedMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c1b7e1c", new Object[]{this})).booleanValue() : this.mSimplifiedMode;
    }

    public void setSimplifiedMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9599b730", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mSimplifiedMode = z;
        if (!this.mSimplifiedMode) {
            return;
        }
        this.mSimplifiedModeLines = 1;
    }

    public void addNewLineView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4277e2d3", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setTag(Integer.valueOf((int) NEW_LINE_ID));
            addView(view);
        }
    }

    public void addNewLineView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e437aa", new Object[]{this, view, layoutParams});
        } else if (view == null) {
        } else {
            view.setTag(Integer.valueOf((int) NEW_LINE_ID));
            addView(view, layoutParams);
        }
    }

    public void setNewLineView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("860ff654", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setTag(Integer.valueOf((int) NEW_LINE_ID));
        }
    }

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9565a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;

        static {
            kge.a(902632588);
        }

        private a() {
        }
    }
}
