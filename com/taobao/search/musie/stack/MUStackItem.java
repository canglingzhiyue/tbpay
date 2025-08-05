package com.taobao.search.musie.stack;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import tb.kge;

/* loaded from: classes7.dex */
public class MUStackItem extends UINodeGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_ITEM_KEY = "itemKey";
    private static final String ATTR_PRIORITY = "priority";
    public boolean canDraw;
    public Rect drawRect;
    public int index;
    public int margin;
    public MUStack parent;

    static {
        kge.a(-620795504);
    }

    public static /* synthetic */ Object ipc$super(MUStackItem mUStackItem, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2024255335) {
            super.onUpdateLayout(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode != -147390939) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.shouldBlock());
        }
    }

    public MUStackItem(int i) {
        super(i);
        this.drawRect = new Rect();
    }

    @MUSNodeProp(name = "priority")
    public void setPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f878ef6", new Object[]{this, new Integer(i)});
        } else {
            setAttribute("priority", Integer.valueOf(i));
        }
    }

    @MUSNodeProp(name = ATTR_ITEM_KEY)
    public void setItemKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d58e9b", new Object[]{this, str});
        } else {
            setAttribute(ATTR_ITEM_KEY, str);
        }
    }

    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        Object attribute = getAttribute("priority");
        if (!(attribute instanceof Integer)) {
            return 0;
        }
        return ((Integer) attribute).intValue();
    }

    public String getItemKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7427cea3", new Object[]{this}) : (String) getAttribute(ATTR_ITEM_KEY);
    }

    @MUSNodeProp(name = "priority", refresh = true)
    public void refreshPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536c51d", new Object[]{this, new Integer(i)});
        } else {
            notifyLocationChange();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onUpdateLayout(i, i2, i3, i4);
        MUStack mUStack = this.parent;
        if (mUStack == null) {
            return;
        }
        mUStack.updateItems(null, 0, 0);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean shouldBlock() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f736fe25", new Object[]{this})).booleanValue() : !this.canDraw || super.shouldBlock();
    }
}
