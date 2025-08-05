package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list;

import android.content.Context;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class IDMComponentsFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<IDMComponent> mComponents;
    private final List<h> mHolders;

    static {
        kge.a(-957627470);
    }

    public IDMComponentsFrameLayout(Context context) {
        super(context);
        this.mComponents = new ArrayList();
        this.mHolders = new ArrayList();
    }

    public void clearIDMComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b99922", new Object[]{this});
        } else {
            this.mComponents.clear();
        }
    }

    public void addIDMComponent(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7785901", new Object[]{this, iDMComponent});
        } else {
            this.mComponents.add(iDMComponent);
        }
    }

    public List<IDMComponent> getComponents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d86cc054", new Object[]{this}) : this.mComponents;
    }

    public void addRecyclerViewHolder(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac85d5d", new Object[]{this, hVar});
        } else {
            this.mHolders.add(hVar);
        }
    }

    public List<h> getRecyclerViewHolders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9afefcd3", new Object[]{this}) : this.mHolders;
    }

    public void clearRecyclerViewHolders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c32821d", new Object[]{this});
        } else {
            this.mHolders.clear();
        }
    }
}
