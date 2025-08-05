package com.taobao.detail.rate.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.view.adapter.a;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class TagFlowLayout extends FlowLayout implements a.InterfaceC0653a, a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isCancelSelect;
    private MotionEvent mMotionEvent;
    private a mOnSelectListener;
    private b mOnTagClickListener;
    private int mSelectedMax;
    private Set<Integer> mSelectedView;
    private com.taobao.detail.rate.view.adapter.a mTagAdapter;

    /* loaded from: classes7.dex */
    public interface a {
    }

    /* loaded from: classes7.dex */
    public interface b {
        boolean a(View view, int i, FlowLayout flowLayout);
    }

    public static /* synthetic */ Object ipc$super(TagFlowLayout tagFlowLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == 650865254) {
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            } else if (hashCode != 1774009266) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.performClick());
            }
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSelectedMax = 1;
        this.mSelectedView = new HashSet();
        this.isCancelSelect = false;
        setClickable(true);
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TagFlowLayout(Context context) {
        this(context, null);
    }

    @Override // com.taobao.detail.rate.widget.FlowLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RateTagView rateTagView = (RateTagView) getChildAt(i3);
            if (rateTagView.getVisibility() != 8 && rateTagView.getTagView().getVisibility() == 8) {
                rateTagView.setVisibility(8);
            }
        }
        super.onMeasure(i, i2);
    }

    public boolean isCancelSelect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("290a52eb", new Object[]{this})).booleanValue() : this.isCancelSelect;
    }

    public void setCancelSelect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93dc6495", new Object[]{this, new Boolean(z)});
        } else {
            this.isCancelSelect = z;
        }
    }

    public void setOnSelectListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181407a1", new Object[]{this, aVar});
            return;
        }
        this.mOnSelectListener = aVar;
        if (this.mOnSelectListener == null) {
            return;
        }
        setClickable(true);
    }

    public void setOnTagClickListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c738bee", new Object[]{this, bVar});
            return;
        }
        this.mOnTagClickListener = bVar;
        if (bVar == null) {
            return;
        }
        setClickable(true);
    }

    public void setAdapter(com.taobao.detail.rate.view.adapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c871892", new Object[]{this, aVar});
            return;
        }
        this.mTagAdapter = aVar;
        this.mTagAdapter.a((a.InterfaceC0653a) this);
        this.mTagAdapter.a((a.b) this);
        this.mSelectedView.clear();
        changeAdapter();
    }

    private void changeAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("746c4e86", new Object[]{this});
            return;
        }
        removeAllViews();
        com.taobao.detail.rate.view.adapter.a aVar = this.mTagAdapter;
        HashSet<Integer> a2 = aVar.a();
        for (int i = 0; i < aVar.b(); i++) {
            RateTagView rateTagView = (RateTagView) aVar.a(this, i, aVar.a(i));
            addView(rateTagView);
            if (a2.contains(Integer.valueOf(i))) {
                rateTagView.setChecked(true);
            }
            if (this.mTagAdapter.a(i, aVar.a(i))) {
                this.mSelectedView.add(Integer.valueOf(i));
                rateTagView.setChecked(true);
            }
        }
        this.mSelectedView.addAll(a2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 1) {
            this.mMotionEvent = MotionEvent.obtain(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69bd3bb2", new Object[]{this})).booleanValue();
        }
        MotionEvent motionEvent = this.mMotionEvent;
        if (motionEvent == null) {
            return super.performClick();
        }
        this.mMotionEvent = null;
        RateTagView findChild = findChild((int) motionEvent.getX(), (int) this.mMotionEvent.getY());
        int findPosByView = findPosByView(findChild);
        if (findChild != null && findChild.getVisibility() == 0) {
            b bVar = this.mOnTagClickListener;
            if (bVar != null) {
                if (bVar.a(findChild.getTagView(), findPosByView, this)) {
                    doSelect(findChild, findPosByView);
                }
            } else {
                doSelect(findChild, findPosByView);
            }
        }
        return true;
    }

    public void setMaxSelectCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a2c38b", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.mSelectedView.size() > i) {
            this.mSelectedView.clear();
        }
        this.mSelectedMax = i;
    }

    public Set<Integer> getSelectedList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0c776c5", new Object[]{this}) : new HashSet(this.mSelectedView);
    }

    private void doSelect(RateTagView rateTagView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba91c8", new Object[]{this, rateTagView, new Integer(i)});
        } else if (rateTagView.isChecked() && !this.isCancelSelect) {
        } else {
            if (this.mSelectedMax == 1 && this.mSelectedView.size() == 1) {
                Integer next = this.mSelectedView.iterator().next();
                RateTagView rateTagView2 = (RateTagView) getChildAt(next.intValue());
                if (this.isCancelSelect && next.intValue() == i) {
                    rateTagView2.setChecked(false);
                    this.mSelectedView.remove(next);
                } else {
                    rateTagView2.setChecked(false);
                    rateTagView.setChecked(true);
                    this.mSelectedView.remove(next);
                    this.mSelectedView.add(Integer.valueOf(i));
                }
            } else if (this.mSelectedMax > 0 && this.mSelectedView.size() >= this.mSelectedMax) {
                return;
            } else {
                rateTagView.setChecked(true);
                this.mSelectedView.add(Integer.valueOf(i));
            }
            if (this.mOnSelectListener == null) {
                return;
            }
            new HashSet(this.mSelectedView);
        }
    }

    public void addSelectView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e2fb35a", new Object[]{this, new Integer(i)});
        } else {
            this.mSelectedView.add(Integer.valueOf(i));
        }
    }

    public com.taobao.detail.rate.view.adapter.a getAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.detail.rate.view.adapter.a) ipChange.ipc$dispatch("481bf4b6", new Object[]{this}) : this.mTagAdapter;
    }

    private int findPosByView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba8d5da7", new Object[]{this, view})).intValue();
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) == view) {
                return i;
            }
        }
        return -1;
    }

    private RateTagView findChild(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateTagView) ipChange.ipc$dispatch("184c5143", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RateTagView rateTagView = (RateTagView) getChildAt(i3);
            if (rateTagView.getVisibility() != 8) {
                Rect rect = new Rect();
                rateTagView.getHitRect(rect);
                if (rect.contains(i, i2)) {
                    return rateTagView;
                }
            }
        }
        return null;
    }

    @Override // com.taobao.detail.rate.view.adapter.a.InterfaceC0653a
    public void onChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            return;
        }
        this.mSelectedView.clear();
        changeAdapter();
    }

    @Override // com.taobao.detail.rate.view.adapter.a.b
    public void onViewChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68398177", new Object[]{this});
        } else {
            changeAdapter();
        }
    }
}
