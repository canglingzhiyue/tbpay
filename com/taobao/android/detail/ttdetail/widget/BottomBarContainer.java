package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class BottomBarContainer extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable mEmptyCheck;
    private a mOnCheckListener;

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(110202001);
    }

    public static /* synthetic */ Object ipc$super(BottomBarContainer bottomBarContainer, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ a access$000(BottomBarContainer bottomBarContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f09d9422", new Object[]{bottomBarContainer}) : bottomBarContainer.mOnCheckListener;
    }

    public static /* synthetic */ boolean access$100(BottomBarContainer bottomBarContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38beaafa", new Object[]{bottomBarContainer})).booleanValue() : bottomBarContainer.hasValidDxChildren();
    }

    public BottomBarContainer(Context context) {
        super(context);
        this.mEmptyCheck = new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.BottomBarContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (BottomBarContainer.access$000(BottomBarContainer.this) == null || BottomBarContainer.access$100(BottomBarContainer.this)) {
                } else {
                    BottomBarContainer.access$000(BottomBarContainer.this).a();
                }
            }
        };
    }

    public BottomBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mEmptyCheck = new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.BottomBarContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (BottomBarContainer.access$000(BottomBarContainer.this) == null || BottomBarContainer.access$100(BottomBarContainer.this)) {
                } else {
                    BottomBarContainer.access$000(BottomBarContainer.this).a();
                }
            }
        };
    }

    public BottomBarContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mEmptyCheck = new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.BottomBarContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (BottomBarContainer.access$000(BottomBarContainer.this) == null || BottomBarContainer.access$100(BottomBarContainer.this)) {
                } else {
                    BottomBarContainer.access$000(BottomBarContainer.this).a();
                }
            }
        };
    }

    public BottomBarContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mEmptyCheck = new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.BottomBarContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (BottomBarContainer.access$000(BottomBarContainer.this) == null || BottomBarContainer.access$100(BottomBarContainer.this)) {
                } else {
                    BottomBarContainer.access$000(BottomBarContainer.this).a();
                }
            }
        };
    }

    public void startEmptyCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2523c4", new Object[]{this});
        } else if (hasValidDxChildren()) {
        } else {
            removeCallbacks(this.mEmptyCheck);
            postDelayed(this.mEmptyCheck, 5000L);
        }
    }

    public void setOnCheckListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e4f63", new Object[]{this, aVar});
        } else {
            this.mOnCheckListener = aVar;
        }
    }

    private List<DXRootView> findDxRootViews() {
        int childCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("93e8e381", new Object[]{this});
        }
        ArrayList arrayList = null;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ll_dinamicx_container);
        if (viewGroup != null && (childCount = viewGroup.getChildCount()) > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof DXRootView) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((DXRootView) childAt);
                }
            }
        }
        return arrayList;
    }

    private boolean hasValidDxChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93658be0", new Object[]{this})).booleanValue();
        }
        List<DXRootView> findDxRootViews = findDxRootViews();
        if (findDxRootViews != null) {
            int size = findDxRootViews.size();
            for (int i = 0; i < size; i++) {
                DXRootView dXRootView = findDxRootViews.get(i);
                if (dXRootView != null && dXRootView.getChildCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
