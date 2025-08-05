package com.taobao.message.lab.comfrm.support.dinamic;

import android.support.v7.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.message.datasdk.facade.model.ResultChange;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.lab.comfrm.inner2.DeltaItem;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.taolive.sdk.mergeInfo.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BaseDXRecyclerRefreshHanlder implements DXWidgetInstance.DXPartRefreshHanlder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1332849099);
        kge.a(123868587);
    }

    public abstract DeltaItem getDeltaItem(Map<String, Object> map, Diff diff, Map<String, Object> map2);

    public boolean processLinkData(Map<String, Object> map, Diff diff, Map<String, Object> map2, List<ResultChange<Object, Integer>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c3ad56a", new Object[]{this, map, diff, map2, list})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.DXPartRefreshHanlder
    public boolean partRefresh(DinamicXEngine dinamicXEngine, DXRootView dXRootView, DXWidgetNode dXWidgetNode, Map<String, Object> map, Map<String, Object> map2, Diff diff) {
        IpChange ipChange = $ipChange;
        int i = 3;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f4bf811", new Object[]{this, dinamicXEngine, dXRootView, dXWidgetNode, map, map2, diff})).booleanValue();
        }
        DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) dXWidgetNode;
        DeltaItem deltaItem = getDeltaItem(map2, diff, map);
        List<ResultChange<Object, Integer>> list = null;
        if (deltaItem != null) {
            if (deltaItem.getDataType() == 0) {
                return false;
            }
            List<ResultChange<Object, Integer>> list2 = (List) deltaItem.getDataChange();
            Iterator<ResultChange<Object, Integer>> it = list2.iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                ResultChange<Object, Integer> next = it.next();
                if (next.getType() == i) {
                    return z;
                }
                Iterator<ResultChange<Object, Integer>> it2 = it;
                List<ResultChange<Object, Integer>> list3 = list2;
                if (next.getType() == 1) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("recyclerNodeId", dXRecyclerLayout.getUserId());
                    jSONObject.put("refreshType", b.TYPE_PART);
                    JSONArray jSONArray = new JSONArray();
                    jSONObject.put("data", (Object) jSONArray);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONArray.add(jSONObject2);
                    jSONObject2.put("isRelative", (Object) "false");
                    jSONObject2.put("offset", (Object) next.getIndex());
                    jSONObject2.put("item_data", getItem(next.getResultData()));
                    dXRecyclerLayout.postEvent(DXWidgetInstance.buildMsg(DXRecyclerLayout.MSG_METHOD_UPDATE_ITEMS, jSONObject));
                    printInfo("update", next.getIndex().intValue(), dXRecyclerLayout);
                } else if (next.getType() == 0) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("recyclerNodeId", dXRecyclerLayout.getUserId());
                    jSONObject3.put("refreshType", b.TYPE_PART);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONObject3.put("data", (Object) jSONArray2);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONArray2.add(jSONObject4);
                    jSONObject4.put("isRelative", (Object) "false");
                    jSONObject4.put("offset", (Object) String.valueOf(next.getIndex()));
                    jSONObject4.put("data", getItem(next.getResultData()));
                    dXRecyclerLayout.postEvent(DXWidgetInstance.buildMsg(DXRecyclerLayout.MSG_METHOD_INSERT_ITEMS, jSONObject3));
                    printInfo("insert", next.getIndex().intValue(), dXRecyclerLayout);
                    it = it2;
                    list2 = list3;
                    i = 3;
                    z = false;
                    z3 = true;
                } else if (next.getType() == 2) {
                    if (next.getIndex().intValue() == 0) {
                        z2 = true;
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("recyclerNodeId", dXRecyclerLayout.getUserId());
                    jSONObject5.put("refreshType", b.TYPE_PART);
                    JSONArray jSONArray3 = new JSONArray();
                    jSONObject5.put("data", (Object) jSONArray3);
                    JSONObject jSONObject6 = new JSONObject();
                    jSONArray3.add(jSONObject6);
                    jSONObject6.put("isRelative", (Object) "false");
                    jSONObject6.put("offset", (Object) next.getIndex());
                    dXRecyclerLayout.postEvent(DXWidgetInstance.buildMsg(DXRecyclerLayout.MSG_METHOD_DELETE_ITEMS, jSONObject5));
                    printInfo("remove", next.getIndex().intValue(), dXRecyclerLayout);
                } else if (next.getType() == 4) {
                    return false;
                }
                it = it2;
                list2 = list3;
                i = 3;
                z = false;
            }
            List<ResultChange<Object, Integer>> list4 = list2;
            if (z2 && z3 && dXRecyclerLayout.l() != null && dXRecyclerLayout.l().getAdapter() != null && (dXRecyclerLayout.l().getLayoutManager() instanceof StaggeredGridLayoutManager)) {
                Logger.e("DXRecyclerRefresh", "notifyDataSetChanged()");
                dXRecyclerLayout.l().getAdapter().notifyDataSetChanged();
            }
            list = list4;
        }
        return processLinkData(map2, diff, map, list);
    }

    public Object getItem(ResultData<Object> resultData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e37508fb", new Object[]{this, resultData}) : resultData.getMainData();
    }

    private void printInfo(String str, int i, DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f95a515", new Object[]{this, str, new Integer(i), dXRecyclerLayout});
        } else if (!ApplicationUtil.isDebug()) {
        } else {
            int size = dXRecyclerLayout.c() != null ? dXRecyclerLayout.c().size() : 0;
            if (dXRecyclerLayout.getListData() != null) {
                i2 = dXRecyclerLayout.getListData().size();
            }
            Logger.e("Message", str + "|" + i + "|dataSource|" + size + "|listData|" + i2);
        }
    }
}
