package com.taobao.search.musie.pager;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.android.weex_uikit.ui.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class TbSlideDelegateNode extends UINodeGroup implements com.taobao.android.weex_uikit.ui.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final com.taobao.search.musie.pager.a autoScrollListener;
    private TbSlideFooter footerNode;
    private final a listener;
    private final List<TbSlideItem> nodeList;
    private final List<i> nodeTreeList;

    /* loaded from: classes7.dex */
    public interface a {
        void onChildrenChange();
    }

    static {
        kge.a(1012876770);
        kge.a(683157026);
    }

    public static /* synthetic */ Object ipc$super(TbSlideDelegateNode tbSlideDelegateNode, String str, Object... objArr) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TbSlideDelegateNode(int i, a aVar, com.taobao.search.musie.pager.a autoScrollListener) {
        super(i);
        q.c(autoScrollListener, "autoScrollListener");
        this.listener = aVar;
        this.autoScrollListener = autoScrollListener;
        this.nodeTreeList = new ArrayList(5);
        this.nodeList = new ArrayList(5);
    }

    public final List<i> getNodeTreeList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6809266c", new Object[]{this}) : this.nodeTreeList;
    }

    public final List<TbSlideItem> getNodeList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("73e167ea", new Object[]{this}) : this.nodeList;
    }

    public final TbSlideFooter getFooterNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TbSlideFooter) ipChange.ipc$dispatch("40371995", new Object[]{this}) : this.footerNode;
    }

    public final void setFooterNode(TbSlideFooter tbSlideFooter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be23c065", new Object[]{this, tbSlideFooter});
        } else {
            this.footerNode = tbSlideFooter;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode child) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, child});
            return;
        }
        q.c(child, "child");
        super.addChild(child);
        if (child instanceof TbSlideItem) {
            child.setLayoutProcessor(this);
            i iVar = new i();
            iVar.a(child);
            this.nodeTreeList.add(iVar);
            this.nodeList.add(child);
            if (getInstance() == null) {
                return;
            }
            MUSDKInstance instance = getInstance();
            q.a((Object) instance, "instance");
            iVar.b(instance.isPreciseExpose());
        } else if (!(child instanceof TbSlideFooter)) {
        } else {
            this.footerNode = (TbSlideFooter) child;
        }
    }

    public final TbSlideItem getChildNode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbSlideItem) ipChange.ipc$dispatch("b214077", new Object[]{this, new Integer(i)});
        }
        int size = this.nodeList.size();
        if (i < 0 || size <= i) {
            return null;
        }
        return this.nodeList.get(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode child) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), child});
            return;
        }
        q.c(child, "child");
        super.addChild(i, child);
        if (child instanceof TbSlideItem) {
            child.setLayoutProcessor(this);
            i iVar = new i();
            iVar.a(child);
            this.nodeTreeList.add(i, iVar);
            this.nodeList.add(i, child);
            if (getInstance() == null) {
                return;
            }
            MUSDKInstance instance = getInstance();
            q.a((Object) instance, "instance");
            iVar.b(instance.isPreciseExpose());
        } else if (!(child instanceof TbSlideFooter)) {
        } else {
            this.footerNode = (TbSlideFooter) child;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
            return;
        }
        super.removeChildAt(i);
        if (getChildAt(i) instanceof TbSlideFooter) {
            this.footerNode = null;
        }
        int size = this.nodeList.size();
        if (i < 0 || size <= i || !(this.nodeList.get(i) instanceof TbSlideItem)) {
            return;
        }
        this.nodeList.remove(i);
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
        int size = this.nodeList.size();
        if (i < 0 || size <= i) {
            return;
        }
        TbSlideItem remove = this.nodeList.remove(i);
        i remove2 = this.nodeTreeList.remove(i);
        if (i < i2) {
            int i3 = i2 - 1;
            this.nodeList.add(i3, remove);
            this.nodeTreeList.add(i3, remove2);
            return;
        }
        this.nodeList.add(i2, remove);
        this.nodeTreeList.add(i2, remove2);
    }

    public final void playNextVideo(TbSlideItem current) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6bb8118", new Object[]{this, current});
            return;
        }
        q.c(current, "current");
        int indexOf = this.nodeList.indexOf(current);
        if (indexOf < 0) {
            return;
        }
        int size = this.nodeList.size();
        for (int i = indexOf + 1; i < size; i++) {
            if (this.nodeList.get(i).hasVideoChild()) {
                this.autoScrollListener.onVideoPlayFinish(i);
                return;
            }
        }
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
        aVar.onChildrenChange();
    }

    @Override // com.taobao.android.weex_uikit.ui.c
    public void modifyFrame(Rect frame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373d757f", new Object[]{this, frame});
            return;
        }
        q.c(frame, "frame");
        frame.offset(-frame.left, -frame.top);
    }
}
