package com.taobao.message.lab.comfrm.util;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b*\u00020\u0002\u001a9\u0010\t\u001a\u0004\u0018\u00010\n\"\u0004\b\u0000\u0010\u000b*\u0010\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u0002H\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"findFirstVisiblePosition", "", "Landroid/support/v7/widget/RecyclerView;", "findFirstVisibleViewHoler", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "findLastVisiblePosition", "findLastVisibleViewHoler", "findVisibleViewHolderList", "", "safeGetString", "", "T", "", "", "key", "defalutValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "message_comfrm_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class ExtentionFunctionKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1407472252);
    }

    public static final RecyclerView.ViewHolder findFirstVisibleViewHoler(RecyclerView findFirstVisibleViewHoler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("8828e904", new Object[]{findFirstVisibleViewHoler});
        }
        q.d(findFirstVisibleViewHoler, "$this$findFirstVisibleViewHoler");
        return findFirstVisibleViewHoler.findViewHolderForPosition(findFirstVisiblePosition(findFirstVisibleViewHoler));
    }

    public static final RecyclerView.ViewHolder findLastVisibleViewHoler(RecyclerView findLastVisibleViewHoler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9357b67c", new Object[]{findLastVisibleViewHoler});
        }
        q.d(findLastVisibleViewHoler, "$this$findLastVisibleViewHoler");
        return findLastVisibleViewHoler.findViewHolderForPosition(findLastVisiblePosition(findLastVisibleViewHoler));
    }

    public static final int findFirstVisiblePosition(RecyclerView findFirstVisiblePosition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a93dfaec", new Object[]{findFirstVisiblePosition})).intValue();
        }
        q.d(findFirstVisiblePosition, "$this$findFirstVisiblePosition");
        RecyclerView.LayoutManager layoutManager = findFirstVisiblePosition.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            return linearLayoutManager.findFirstVisibleItemPosition();
        }
        return -1;
    }

    public static final int findLastVisiblePosition(RecyclerView findLastVisiblePosition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18ab1074", new Object[]{findLastVisiblePosition})).intValue();
        }
        q.d(findLastVisiblePosition, "$this$findLastVisiblePosition");
        RecyclerView.LayoutManager layoutManager = findLastVisiblePosition.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            return linearLayoutManager.findLastVisibleItemPosition();
        }
        return -1;
    }

    public static final List<RecyclerView.ViewHolder> findVisibleViewHolderList(RecyclerView findVisibleViewHolderList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6727142a", new Object[]{findVisibleViewHolderList});
        }
        q.d(findVisibleViewHolderList, "$this$findVisibleViewHolderList");
        ArrayList arrayList = new ArrayList();
        int findFirstVisiblePosition = findFirstVisiblePosition(findVisibleViewHolderList);
        int findLastVisiblePosition = findLastVisiblePosition(findVisibleViewHolderList);
        if (findFirstVisiblePosition < findLastVisiblePosition && findFirstVisiblePosition <= findLastVisiblePosition) {
            while (true) {
                RecyclerView.ViewHolder findViewHolderForPosition = findVisibleViewHolderList.findViewHolderForPosition(findFirstVisiblePosition);
                if (findViewHolderForPosition != null) {
                    arrayList.add(findViewHolderForPosition);
                }
                if (findFirstVisiblePosition == findLastVisiblePosition) {
                    break;
                }
                findFirstVisiblePosition++;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String safeGetString$default(Map map, Object obj, String str, int i, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("925acc2e", new Object[]{map, obj, str, new Integer(i), obj2});
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return safeGetString(map, obj, str);
    }

    public static final <T> String safeGetString(Map<T, Object> map, T t, String str) {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88542156", new Object[]{map, t, str});
        }
        if (map == null) {
            return str;
        }
        try {
            Object obj2 = map.get(t);
            if (obj2 == null) {
                return str;
            }
            if (obj2 instanceof String) {
                obj = (String) obj2;
            } else {
                obj = obj2.toString();
            }
            return obj;
        } catch (Exception unused) {
            return str;
        }
    }
}
