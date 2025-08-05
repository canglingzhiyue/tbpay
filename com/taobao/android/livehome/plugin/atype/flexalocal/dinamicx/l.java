package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.List;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class l extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLVINSERTBELOW = 7544413833213664309L;

    static {
        kge.a(-679051222);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXRecyclerLayout dXRecyclerLayout;
        RecyclerView l;
        List<Object> c;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        int i2 = -1;
        if (dXRuntimeContext == null || objArr == null) {
            return -1;
        }
        if (objArr[0] instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) objArr[0];
            String string = jSONObject.getString("recyclerUserId");
            int parseInt = Integer.parseInt(jSONObject.getString("currentCardIndex"));
            if (dXRuntimeContext.s() == null || dXRuntimeContext.s().getExpandWidgetNode() == null) {
                return -1;
            }
            DXWidgetNode queryWidgetNodeByUserId = dXRuntimeContext.s().getExpandWidgetNode().queryWidgetNodeByUserId(string);
            if ((queryWidgetNodeByUserId instanceof DXRecyclerLayout) && (l = (dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId).l()) != null && l.getScrollState() == 0 && (l.getLayoutManager() instanceof StaggeredGridLayoutManager) && (c = dXRecyclerLayout.c()) != null && c.size() > 0 && (findViewHolderForAdapterPosition = l.findViewHolderForAdapterPosition(parseInt)) != null && (findViewHolderForAdapterPosition.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams)) {
                int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) findViewHolderForAdapterPosition.itemView.getLayoutParams()).getSpanIndex();
                if (dXRecyclerLayout.c() != null && dXRecyclerLayout.c().size() > parseInt + 3) {
                    int i3 = spanIndex % 2;
                    if (i3 == 0) {
                        i = parseInt + 1;
                        while (i < parseInt + 4) {
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = l.findViewHolderForAdapterPosition(i);
                            if (findViewHolderForAdapterPosition2 != null && (findViewHolderForAdapterPosition2.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) && ((StaggeredGridLayoutManager.LayoutParams) findViewHolderForAdapterPosition2.itemView.getLayoutParams()).getSpanIndex() % 2 == 0) {
                                i2 = i - parseInt;
                                break;
                            }
                            i++;
                        }
                    } else if (i3 == 1) {
                        i = parseInt + 1;
                        while (i < parseInt + 4) {
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition3 = l.findViewHolderForAdapterPosition(i);
                            if (findViewHolderForAdapterPosition3 != null && (findViewHolderForAdapterPosition3.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) && ((StaggeredGridLayoutManager.LayoutParams) findViewHolderForAdapterPosition3.itemView.getLayoutParams()).getSpanIndex() % 2 == 1) {
                                i2 = i - parseInt;
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return Integer.valueOf(i2);
    }
}
