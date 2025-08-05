package com.taobao.android.xsearchplugin.weex.weex;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import java.util.Map;
import tb.imn;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INDEX_KEY = "_index";

    static {
        kge.a(1548462594);
    }

    public static int a(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e389e4", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return jSONObject.getInteger(str).intValue();
        } catch (Exception unused) {
            return i;
        }
    }

    public static void a(com.taobao.android.searchbaseframe.datasource.impl.a<?, ?> aVar, JSONObject jSONObject) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f728507", new Object[]{aVar, jSONObject});
            return;
        }
        imn core = aVar.getCore();
        if (aVar == null) {
            core.b().b("WeexStorageUtil", "updateStorage: datasource is null");
        } else if (jSONObject == null) {
            core.b().b("WeexStorageUtil", "updateStorage: params is null");
        } else {
            int a2 = a(jSONObject, INDEX_KEY, -1);
            if (a2 < 0) {
                core.b().b("WeexStorageUtil", "updateStorage: index is illegal");
                return;
            }
            jSONObject.remove(INDEX_KEY);
            BaseSearchResult baseSearchResult = (BaseSearchResult) aVar.getTotalSearchResult();
            if (baseSearchResult == null) {
                core.b().b("WeexStorageUtil", "updateStorage: totalResult is null");
                return;
            }
            BaseCellBean cell = baseSearchResult.getCell(a2);
            if (cell instanceof WeexCellBean) {
                map = ((WeexCellBean) cell).mStorage;
            } else if (cell instanceof MuiseCellBean) {
                map = ((MuiseCellBean) cell).mStorage;
            } else {
                core.b().b("WeexStorageUtil", "updateStorage: target cell is not a dynamic cell");
                return;
            }
            if (map == null) {
                core.b().b("WeexStorageUtil", "updateStorage: storage is null");
            } else {
                map.putAll(jSONObject.getInnerMap());
            }
        }
    }

    public static void b(com.taobao.android.searchbaseframe.datasource.impl.a<?, ?> aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e991466", new Object[]{aVar, jSONObject});
            return;
        }
        imn core = aVar.getCore();
        if (aVar == null) {
            core.b().b("WeexStorageUtil", "updateStorage: datasource is null");
        } else if (jSONObject == null) {
            core.b().b("WeexStorageUtil", "updateStorage: params is null");
        } else {
            int a2 = a(jSONObject, INDEX_KEY, -1);
            if (a2 < 0) {
                core.b().b("WeexStorageUtil", "updateStorage: index is illegal");
                return;
            }
            jSONObject.remove(INDEX_KEY);
            MuiseCellBean findById = MuiseCellBean.findById(a2);
            if (findById == null) {
                core.b().b("WeexStorageUtil", "updateStorage: muise of id not found");
                return;
            }
            findById.mStorage.putAll(jSONObject.getInnerMap());
            findById.mStorageUpdated = true;
        }
    }
}
