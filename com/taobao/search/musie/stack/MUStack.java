package com.taobao.search.musie.stack;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_framework.util.i;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.android.weex_uikit.ui.n;
import com.taobao.android.weex_uikit.ui.s;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class MUStack extends UINodeGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_ALIGNMENT = "alignment";
    private static final String ATTR_AXIS = "axis";
    private static final String ATTR_SPACE = "space";
    private static final String AXIS_HORIZONTAL = "horizontal";
    private static final String AXIS_VERTICAL = "vertical";
    private static final String EVENT_ITEMS_APPEAR = "itemsappear";
    private static final String EXTRA_APPEAR_ITEMS = "items";
    private static final int MODE_CENTER = 2;
    private static final int MODE_LEADING = 1;
    private static final int MODE_TRAILING = 3;
    private boolean appear;
    private boolean refresh;

    static {
        kge.a(-548785955);
    }

    public static /* synthetic */ Object ipc$super(MUStack mUStack, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1487412538:
                super.addChild((UINode) objArr[0]);
                return null;
            case -828468633:
                super.addChild(((Number) objArr[0]).intValue(), (UINode) objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case 743934986:
                super.dispatchUpdateLayoutState((s) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 1084303291:
                super.onUpdateExtra((UINode) objArr[0], objArr[1], (String) objArr[2], objArr[3]);
                return null;
            case 1676731387:
                super.fireEvent((String) objArr[0], (JSONObject) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public boolean shouldClip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f29c16ae", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public MUStack(int i) {
        super(i);
    }

    private void validOrThrow(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633d101a", new Object[]{this, uINode});
        } else if (!(uINode instanceof MUStackItem)) {
            throw new RuntimeException("mus-stack的子节点只支持mus-stack-item");
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        validOrThrow(uINode);
        ((MUStackItem) uINode).parent = this;
        super.addChild(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
            return;
        }
        validOrThrow(uINode);
        ((MUStackItem) uINode).parent = this;
        super.addChild(i, uINode);
    }

    @MUSNodeProp(name = ATTR_SPACE)
    public void setSpace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47e8155", new Object[]{this, str});
        } else {
            setAttribute(ATTR_SPACE, Integer.valueOf((int) i.a(str)));
        }
    }

    @MUSNodeProp(name = ATTR_AXIS)
    public void setAxis(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b00574", new Object[]{this, str});
        } else if (str == null) {
            setAttribute(ATTR_AXIS, false);
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1984141450) {
                if (hashCode == 1387629604 && str.equals("horizontal")) {
                    c = 1;
                }
            } else if (str.equals("vertical")) {
                c = 0;
            }
            if (c == 0) {
                setAttribute(ATTR_AXIS, true);
            } else {
                setAttribute(ATTR_AXIS, false);
            }
        }
    }

    @MUSNodeProp(name = ATTR_ALIGNMENT)
    public void setAlignment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7d2f72", new Object[]{this, str});
        } else if (str == null) {
            setAttribute(ATTR_ALIGNMENT, 1);
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1364013995) {
                if (hashCode != 50359046) {
                    if (hashCode == 1276059676 && str.equals("trailing")) {
                        c = 1;
                    }
                } else if (str.equals("leading")) {
                    c = 2;
                }
            } else if (str.equals("center")) {
                c = 0;
            }
            if (c == 0) {
                setAttribute(ATTR_ALIGNMENT, 2);
            } else if (c == 1) {
                setAttribute(ATTR_ALIGNMENT, 3);
            } else {
                setAttribute(ATTR_ALIGNMENT, 1);
            }
        }
    }

    @MUSNodeProp(name = ATTR_SPACE, refresh = true)
    public void refreshSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d91b51", new Object[]{this, new Integer(i)});
            return;
        }
        notifyLocationChange();
        this.refresh = true;
    }

    @MUSNodeProp(name = ATTR_ALIGNMENT, refresh = true)
    public void refreshAlignment(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2fa5714", new Object[]{this, new Integer(i)});
            return;
        }
        notifyLocationChange();
        this.refresh = true;
    }

    @MUSNodeProp(name = ATTR_ALIGNMENT, refresh = true)
    public void refreshAxis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1519c7c0", new Object[]{this, new Integer(i)});
            return;
        }
        notifyLocationChange();
        this.refresh = true;
    }

    private void sortItems(List<MUStackItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6edc033a", new Object[]{this, list});
        } else {
            Collections.sort(list, new Comparator<MUStackItem>() { // from class: com.taobao.search.musie.stack.MUStack.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public /* synthetic */ int compare(MUStackItem mUStackItem, MUStackItem mUStackItem2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, mUStackItem, mUStackItem2})).intValue() : a(mUStackItem, mUStackItem2);
                }

                public int a(MUStackItem mUStackItem, MUStackItem mUStackItem2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("9b1a1bb", new Object[]{this, mUStackItem, mUStackItem2})).intValue();
                    }
                    if (mUStackItem.index > mUStackItem2.index) {
                        return 1;
                    }
                    return mUStackItem.index < mUStackItem2.index ? -1 : 0;
                }
            });
        }
    }

    public void updateItems(s sVar, int i, int i2) {
        MUStackItem next;
        int layoutHeight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61655f1d", new Object[]{this, sVar, new Integer(i), new Integer(i2)});
            return;
        }
        int layoutWidth = getLayoutWidth();
        int layoutHeight2 = getLayoutHeight();
        SparseArray<List<MUStackItem>> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            MUStackItem mUStackItem = (MUStackItem) getChildAt(i3);
            if (mUStackItem != null) {
                if (sVar != null) {
                    mUStackItem.updateLayoutState(sVar, layoutWidth, layoutHeight2);
                }
                addToSortedItems(mUStackItem, sparseArray);
                mUStackItem.canDraw = false;
                mUStackItem.drawRect.setEmpty();
                mUStackItem.index = i3;
            }
        }
        int space = getSpace();
        int alignment = getAlignment();
        LinkedList linkedList = new LinkedList();
        if (isVertical()) {
            int contentHeight = getContentHeight();
            for (int size = sparseArray.size(); size >= 0; size--) {
                List<MUStackItem> valueAt = sparseArray.valueAt(size);
                if (valueAt != null) {
                    Iterator<MUStackItem> it = valueAt.iterator();
                    while (it.hasNext() && (layoutHeight = (next = it.next()).getLayoutHeight()) <= contentHeight) {
                        int layoutWidth2 = next.getLayoutWidth();
                        next.canDraw = true;
                        next.margin = getAlignTranslation(alignment, layoutWidth, layoutWidth2);
                        contentHeight -= layoutHeight + space;
                        linkedList.add(next);
                    }
                }
            }
            sortItems(linkedList);
            int i4 = 0;
            for (MUStackItem mUStackItem2 : linkedList) {
                int layoutHeight3 = mUStackItem2.getLayoutHeight();
                int layoutWidth3 = mUStackItem2.getLayoutWidth();
                if (sVar != null) {
                    mUStackItem2.updateLayoutState(sVar, mUStackItem2.margin + i, i2 + i4);
                }
                mUStackItem2.drawRect.set(mUStackItem2.margin, i4, mUStackItem2.margin + layoutWidth3, i4 + layoutHeight3);
                i4 += layoutHeight3 + space;
            }
            return;
        }
        int contentWidth = getContentWidth();
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            List<MUStackItem> valueAt2 = sparseArray.valueAt(size2);
            if (valueAt2 != null) {
                for (MUStackItem mUStackItem3 : valueAt2) {
                    int layoutWidth4 = mUStackItem3.getLayoutWidth();
                    if (mUStackItem3.getLayoutWidth() <= contentWidth) {
                        int layoutHeight4 = mUStackItem3.getLayoutHeight();
                        mUStackItem3.canDraw = true;
                        mUStackItem3.margin = getAlignTranslation(alignment, layoutHeight2, layoutHeight4);
                        contentWidth -= layoutWidth4 + space;
                        linkedList.add(mUStackItem3);
                    }
                }
            }
        }
        sortItems(linkedList);
        JSONArray jSONArray = new JSONArray(linkedList.size());
        int i5 = 0;
        for (MUStackItem mUStackItem4 : linkedList) {
            int layoutHeight5 = mUStackItem4.getLayoutHeight();
            int layoutWidth5 = mUStackItem4.getLayoutWidth();
            if (sVar != null) {
                mUStackItem4.updateLayoutState(sVar, i + i5, mUStackItem4.margin + i2);
            }
            mUStackItem4.drawRect.set(i5, mUStackItem4.margin, i5 + layoutWidth5, mUStackItem4.margin + layoutHeight5);
            i5 += layoutWidth5 + space;
            String itemKey = mUStackItem4.getItemKey();
            if (itemKey != null) {
                jSONArray.add(itemKey);
            }
        }
        setExtra("items", jSONArray);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        super.onUpdateExtra(uINode, obj, str, obj2);
        if (!TextUtils.equals(str, "items")) {
            return;
        }
        notifyItemsAppear((JSONArray) obj2);
    }

    private void notifyItemsAppear(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f28661b", new Object[]{this, jSONArray});
        } else if (jSONArray == null || !hasEvent(EVENT_ITEMS_APPEAR) || !this.appear || getChildCount() <= 0) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("items", (Object) jSONArray);
            fireEvent(EVENT_ITEMS_APPEAR, jSONObject);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        super.fireEvent(str, jSONObject);
        if (TextUtils.equals(str, "appear")) {
            this.appear = true;
            notifyItemsAppear((JSONArray) getExtra("items"));
        } else if (!TextUtils.equals(str, "disappear")) {
        } else {
            this.appear = false;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        this.appear = false;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup
    public void dispatchUpdateLayoutState(s sVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c578c0a", new Object[]{this, sVar, new Integer(i), new Integer(i2)});
            return;
        }
        super.dispatchUpdateLayoutState(sVar, i, i2);
        if (!this.refresh) {
            return;
        }
        notifyAccessibleChanged(true);
        this.refresh = false;
    }

    private void addToSortedItems(MUStackItem mUStackItem, SparseArray<List<MUStackItem>> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f721e66", new Object[]{this, mUStackItem, sparseArray});
            return;
        }
        int priority = mUStackItem.getPriority();
        List<MUStackItem> list = sparseArray.get(priority);
        if (list == null) {
            list = new LinkedList<>();
            sparseArray.put(priority, list);
        }
        list.add(mUStackItem);
    }

    private int getSpace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c67ff3ca", new Object[]{this})).intValue();
        }
        Object attribute = getAttribute(ATTR_SPACE);
        if (!(attribute instanceof Integer)) {
            return 0;
        }
        return ((Integer) attribute).intValue();
    }

    private boolean isVertical() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d064334b", new Object[]{this})).booleanValue();
        }
        Object attribute = getAttribute(ATTR_AXIS);
        return (attribute instanceof Boolean) && ((Boolean) attribute).booleanValue();
    }

    private int getAlignment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("489b3927", new Object[]{this})).intValue();
        }
        Object attribute = getAttribute(ATTR_ALIGNMENT);
        if (!(attribute instanceof Integer)) {
            return 1;
        }
        return ((Integer) attribute).intValue();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void dispatchDraw(MUSNodeHost mUSNodeHost, Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96d02bd", new Object[]{this, mUSNodeHost, canvas, new Float(f)});
        } else if (this.children == null || getChildCount() == 0) {
        } else {
            if (!isRenderNodeEnabled()) {
                f *= getOpacity();
            }
            int space = getSpace();
            if (isVertical()) {
                drawVertically(canvas, f, mUSNodeHost, space);
            } else {
                drawHorizontally(canvas, f, mUSNodeHost, space);
            }
        }
    }

    private void drawVertically(Canvas canvas, float f, MUSNodeHost mUSNodeHost, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb6907d", new Object[]{this, canvas, new Float(f), mUSNodeHost, new Integer(i)});
            return;
        }
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            MUStackItem mUStackItem = (MUStackItem) getChildAt(i3);
            if (mUStackItem.canDraw) {
                if (i2 == 0 && mUStackItem.margin == 0) {
                    z = false;
                } else {
                    canvas.translate(mUStackItem.margin, i2);
                    z = true;
                }
                mUStackItem.draw(mUSNodeHost, canvas, 0, 0, false, f);
                if (z) {
                    canvas.translate(-mUStackItem.margin, -i2);
                }
                i2 += mUStackItem.getLayoutHeight() + i;
            }
        }
    }

    private void drawHorizontally(Canvas canvas, float f, MUSNodeHost mUSNodeHost, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a751130f", new Object[]{this, canvas, new Float(f), mUSNodeHost, new Integer(i)});
            return;
        }
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            MUStackItem mUStackItem = (MUStackItem) getChildAt(i3);
            if (mUStackItem.canDraw) {
                if (i2 == 0 && mUStackItem.margin == 0) {
                    z = false;
                } else {
                    canvas.translate(i2, mUStackItem.margin);
                    z = true;
                }
                mUStackItem.draw(mUSNodeHost, canvas, 0, 0, false, f);
                if (z) {
                    canvas.translate(-i2, -mUStackItem.margin);
                }
                i2 += mUStackItem.getLayoutWidth() + i;
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public n onCreateTouchHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("b0d04501", new Object[]{this}) : new a(this);
    }

    private int getAlignTranslation(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4983308d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i == 2) {
            return (i2 - i3) / 2;
        }
        if (i == 3) {
            return i2 - i3;
        }
        return 0;
    }

    /* loaded from: classes7.dex */
    public static class a extends n<UINodeGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private UINode b;

        static {
            kge.a(1497379116);
        }

        public a(UINodeGroup uINodeGroup) {
            super(uINodeGroup);
        }

        @Override // com.taobao.android.weex_uikit.ui.n
        public boolean b(MotionEvent motionEvent, View view) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f91d758", new Object[]{this, motionEvent, view})).booleanValue();
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                a();
                a(true);
            }
            UINode uINode = this.b;
            if (uINode != null) {
                if (uINode != this.f16141a) {
                    Rect h = this.b.getNodeInfo().h();
                    UINode uINode2 = this.b;
                    if (uINode2 instanceof MUStackItem) {
                        h = ((MUStackItem) uINode2).drawRect;
                    }
                    motionEvent.offsetLocation(-h.left, -h.top);
                    z = this.b.dispatchTouchEvent(motionEvent, view);
                    motionEvent.offsetLocation(h.left, h.top);
                    if (!z) {
                        z = a(motionEvent, view);
                    }
                } else {
                    z = a(motionEvent, view);
                }
                if (!z) {
                    this.b = null;
                }
            } else {
                int childCount = ((UINodeGroup) this.f16141a).getChildCount() - 1;
                z = false;
                while (true) {
                    if (childCount < 0) {
                        break;
                    }
                    MUStackItem mUStackItem = (MUStackItem) ((UINodeGroup) this.f16141a).getChildAt(childCount);
                    if (mUStackItem.canDraw && mUStackItem.drawRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        Rect rect = mUStackItem.drawRect;
                        motionEvent.offsetLocation(-rect.left, -rect.top);
                        boolean dispatchTouchEvent = mUStackItem.dispatchTouchEvent(motionEvent, view);
                        motionEvent.offsetLocation(rect.left, rect.top);
                        if (dispatchTouchEvent) {
                            this.b = mUStackItem;
                            z = dispatchTouchEvent;
                            break;
                        }
                        z = dispatchTouchEvent;
                    }
                    childCount--;
                }
                if (!z) {
                    z = a(motionEvent, view);
                    if (z) {
                        this.b = this.f16141a;
                    } else {
                        a();
                    }
                }
            }
            if (action == 1 || action == 3) {
                this.b = null;
                a(false);
            }
            return z;
        }
    }
}
