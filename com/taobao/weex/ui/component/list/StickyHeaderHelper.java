package com.taobao.weex.ui.component.list;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.WXThread;
import com.taobao.weex.utils.WXLogUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class StickyHeaderHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ViewGroup mParent;
    private Map<String, View> mHeaderViews = new HashMap();
    private Map<String, IWXCell> mHeaderComps = new HashMap();
    private String mCurrentStickyRef = null;

    static {
        kge.a(1741745923);
    }

    public static /* synthetic */ ViewGroup access$000(StickyHeaderHelper stickyHeaderHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("fe1cc4f2", new Object[]{stickyHeaderHelper}) : stickyHeaderHelper.mParent;
    }

    public static /* synthetic */ void access$100(StickyHeaderHelper stickyHeaderHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba43aa44", new Object[]{stickyHeaderHelper});
        } else {
            stickyHeaderHelper.changeFrontStickyVisible();
        }
    }

    public StickyHeaderHelper(ViewGroup viewGroup) {
        this.mParent = viewGroup;
    }

    public void notifyStickyShow(IWXCell iWXCell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54d0cde", new Object[]{this, iWXCell});
        } else if (iWXCell == null) {
        } else {
            this.mHeaderComps.put(iWXCell.getRef(), iWXCell);
            String str = this.mCurrentStickyRef;
            if (str != null) {
                IWXCell iWXCell2 = this.mHeaderComps.get(str);
                if (iWXCell2 == null || iWXCell.getScrollPositon() > iWXCell2.getScrollPositon()) {
                    this.mCurrentStickyRef = iWXCell.getRef();
                }
            } else {
                this.mCurrentStickyRef = iWXCell.getRef();
            }
            String str2 = this.mCurrentStickyRef;
            if (str2 == null) {
                WXLogUtils.e("Current Sticky ref is null.");
                return;
            }
            IWXCell iWXCell3 = this.mHeaderComps.get(str2);
            View realView = iWXCell3.getRealView();
            if (realView == null) {
                WXLogUtils.e("Sticky header's real view is null.");
                return;
            }
            View view = this.mHeaderViews.get(iWXCell3.getRef());
            if (view != null) {
                view.bringToFront();
            } else {
                this.mHeaderViews.put(iWXCell3.getRef(), realView);
                float translationX = realView.getTranslationX();
                float translationY = realView.getTranslationY();
                iWXCell3.removeSticky();
                ViewGroup viewGroup = (ViewGroup) realView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(realView);
                }
                realView.setTag(iWXCell3.getRef());
                this.mParent.addView(realView, new ViewGroup.MarginLayoutParams(-2, -2));
                realView.setTag(this);
                if (iWXCell3.getStickyOffset() > 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) realView.getLayoutParams();
                    if (iWXCell3.getStickyOffset() != marginLayoutParams.topMargin) {
                        marginLayoutParams.topMargin = iWXCell3.getStickyOffset();
                    }
                }
                realView.setTranslationX(translationX);
                realView.setTranslationY(translationY);
            }
            changeFrontStickyVisible();
            if (!iWXCell3.getEvents().contains("sticky")) {
                return;
            }
            iWXCell3.fireEvent("sticky");
        }
    }

    public void notifyStickyRemove(IWXCell iWXCell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30fbe0f7", new Object[]{this, iWXCell});
        } else if (iWXCell == null) {
        } else {
            final IWXCell remove = this.mHeaderComps.containsValue(iWXCell) ? this.mHeaderComps.remove(iWXCell.getRef()) : iWXCell;
            final View remove2 = this.mHeaderViews.remove(iWXCell.getRef());
            if (remove == null || remove2 == null) {
                return;
            }
            String str = this.mCurrentStickyRef;
            if (str != null && str.equals(iWXCell.getRef())) {
                this.mCurrentStickyRef = null;
            }
            this.mParent.post(WXThread.secure(new Runnable() { // from class: com.taobao.weex.ui.component.list.StickyHeaderHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    StickyHeaderHelper.access$000(StickyHeaderHelper.this).removeView(remove2);
                    if (remove2.getVisibility() != 0) {
                        remove2.setVisibility(0);
                    }
                    remove.recoverySticky();
                    StickyHeaderHelper.access$100(StickyHeaderHelper.this);
                }
            }));
            if (!remove.getEvents().contains(Constants.Event.UNSTICKY)) {
                return;
            }
            remove.fireEvent(Constants.Event.UNSTICKY);
        }
    }

    public void updateStickyView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874adbe5", new Object[]{this, new Integer(i)});
            return;
        }
        ArrayList<IWXCell> arrayList = new ArrayList();
        for (Map.Entry<String, IWXCell> entry : this.mHeaderComps.entrySet()) {
            IWXCell value = entry.getValue();
            int scrollPositon = value.getScrollPositon();
            if (scrollPositon > i) {
                arrayList.add(value);
            } else if (scrollPositon == i) {
                this.mCurrentStickyRef = value.getRef();
                View view = this.mHeaderViews.get(value.getRef());
                if (view != null) {
                    view.bringToFront();
                    changeFrontStickyVisible();
                }
            }
        }
        for (IWXCell iWXCell : arrayList) {
            notifyStickyRemove(iWXCell);
        }
    }

    public void clearStickyHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf3f6897", new Object[]{this});
        } else if (this.mHeaderViews.size() <= 0) {
        } else {
            Iterator<Map.Entry<String, IWXCell>> it = this.mHeaderComps.entrySet().iterator();
            while (it.hasNext()) {
                it.remove();
                notifyStickyRemove(it.next().getValue());
            }
        }
    }

    private void changeFrontStickyVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29047af7", new Object[]{this});
        } else if (this.mHeaderViews.size() > 0) {
            boolean z = false;
            for (int childCount = this.mParent.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.mParent.getChildAt(childCount);
                if (z && (childAt.getTag() instanceof StickyHeaderHelper)) {
                    if (childAt.getVisibility() != 8) {
                        childAt.setVisibility(8);
                    }
                } else if (childAt.getTag() instanceof StickyHeaderHelper) {
                    if (childAt != null && childAt.getVisibility() != 0) {
                        childAt.setVisibility(0);
                    }
                    z = true;
                }
            }
        }
    }
}
