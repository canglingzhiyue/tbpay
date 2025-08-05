package com.taobao.android.weex_uikit.widget.slide;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.android.weex_uikit.ui.i;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class SlideDelegateNode extends UINodeGroup implements com.taobao.android.weex_uikit.ui.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a listener;
    private List<i> nodeTreeList;

    /* loaded from: classes6.dex */
    interface a {
        void a();
    }

    static {
        kge.a(-714910297);
        kge.a(683157026);
    }

    public static /* synthetic */ Object ipc$super(SlideDelegateNode slideDelegateNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1652314895:
                super.removeChildAt(((Number) objArr[0]).intValue());
                return null;
            case -1487412538:
                super.addChild((UINode) objArr[0]);
                return null;
            case -828468633:
                super.addChild(((Number) objArr[0]).intValue(), (UINode) objArr[1]);
                return null;
            case 1544014426:
                super.moveNode(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public SlideDelegateNode(int i, a aVar) {
        super(i);
        this.nodeTreeList = new ArrayList(0);
        this.listener = aVar;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        super.addChild(uINode);
        uINode.setLayoutProcessor(this);
        i iVar = new i();
        iVar.a(uINode);
        this.nodeTreeList.add(iVar);
        if (getInstance() == null) {
            return;
        }
        iVar.b(getInstance().isPreciseExpose());
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
            return;
        }
        super.addChild(i, uINode);
        uINode.setLayoutProcessor(this);
        i iVar = new i();
        iVar.a(uINode);
        this.nodeTreeList.add(i, iVar);
        if (getInstance() == null) {
            return;
        }
        iVar.b(getInstance().isPreciseExpose());
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
            return;
        }
        super.removeChildAt(i);
        this.nodeTreeList.remove(i).f().setLayoutProcessor(null);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.moveNode(i, i2);
        if (i == i2) {
            return;
        }
        i remove = this.nodeTreeList.remove(i);
        if (i < i2) {
            this.nodeTreeList.add(i2 - 1, remove);
        } else {
            this.nodeTreeList.add(i2, remove);
        }
    }

    public List<i> getNodeTreeList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6809266c", new Object[]{this}) : this.nodeTreeList;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup
    public void onChildrenChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fa95d", new Object[]{this});
            return;
        }
        a aVar = this.listener;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    @Override // com.taobao.android.weex_uikit.ui.c
    public void modifyFrame(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373d757f", new Object[]{this, rect});
        } else {
            rect.offset(-rect.left, 0);
        }
    }
}
