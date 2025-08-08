package com.taobao.android.xsearchplugin.jarvis.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import java.util.ArrayList;
import java.util.Map;
import tb.imn;
import tb.jxp;
import tb.jxs;
import tb.jxt;
import tb.jya;
import tb.jyb;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(838593913);
    }

    public static String[] a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ab7e78ac", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!StringUtils.isEmpty(str) && obj != null) {
                    arrayList.add(str + "=" + obj);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String a(BaseTypedBean baseTypedBean, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cedddf9", new Object[]{baseTypedBean, imnVar});
        }
        if (!(baseTypedBean instanceof BaseCellBean)) {
            return null;
        }
        return ((BaseCellBean) baseTypedBean).itemId;
    }

    public static Map<String, Object> b(BaseTypedBean baseTypedBean, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fa24abfd", new Object[]{baseTypedBean, imnVar});
        }
        if (baseTypedBean instanceof jya) {
            return ((jya) baseTypedBean).getCellBehavXData();
        }
        jyb a2 = ((jxp) imnVar.c().g()).a();
        JSONObject a3 = a(baseTypedBean);
        if (a2 != null && a3 != null) {
            return a2.a(a3);
        }
        return null;
    }

    private static JSONObject a(BaseTypedBean baseTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7f174741", new Object[]{baseTypedBean});
        }
        if (baseTypedBean instanceof WeexCellBean) {
            return ((WeexCellBean) baseTypedBean).mWeexBean.model;
        }
        if (!(baseTypedBean instanceof MuiseCellBean)) {
            return null;
        }
        return ((MuiseCellBean) baseTypedBean).mMuiseBean.model;
    }

    public static jxt a(String str, jxs jxsVar) {
        Class<? extends jxt> a2;
        if (!StringUtils.isEmpty(str) && (a2 = ((jxp) jxsVar.getCore().c().g()).f().a(str)) != null) {
            try {
                return a2.newInstance();
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
