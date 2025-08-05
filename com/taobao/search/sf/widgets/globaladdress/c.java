package com.taobao.search.sf.widgets.globaladdress;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.weex.common.Constants;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import tb.isi;
import tb.kge;

/* loaded from: classes8.dex */
public final class c extends isi<GlobalAddressBean, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1900330518);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 32169431) {
            super.a((JSONObject) objArr[0], (JSONObject) ((BaseTypedBean) objArr[1]), (BaseTypedBean) ((BaseSearchResult) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_global_address";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public GlobalAddressBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GlobalAddressBean) ipChange.ipc$dispatch("fbef07c2", new Object[]{this}) : new GlobalAddressBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<GlobalAddressBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : GlobalAddressBean.class;
    }

    @Override // tb.isi, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject beanObject, GlobalAddressBean bean, CommonSearchResult commonSearchResult) {
        Set<Map.Entry<String, Object>> entrySet;
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c892faf9", new Object[]{this, beanObject, bean, commonSearchResult});
            return;
        }
        q.c(beanObject, "beanObject");
        q.c(bean, "bean");
        super.a(beanObject, (JSONObject) bean, (GlobalAddressBean) commonSearchResult);
        bean.setLocationText(beanObject.getString("locationText"));
        String string = beanObject.getString("mode");
        if (string == null) {
            string = "changeLocation";
        }
        bean.setMode(string);
        JSONObject b = com.taobao.android.searchbaseframe.util.a.b(beanObject, "utLogMap");
        if (commonSearchResult != null && (mainInfo = commonSearchResult.getMainInfo()) != null) {
            bean.getUtLogMap().put("list_param", mainInfo.keyword + '_' + mainInfo.abtest + '_' + mainInfo.rn);
        }
        if (b != null && (entrySet = b.entrySet()) != null) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                q.a(key, "it.key");
                bean.getUtLogMap().put(key, entry.getValue().toString());
            }
        }
        JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(beanObject, "dropBean");
        if (b2 != null) {
            bean.setDropBean((WeexBean) new com.taobao.android.searchbaseframe.nx3.bean.c().a(b2, commonSearchResult));
        }
        JSONObject b3 = com.taobao.android.searchbaseframe.util.a.b(beanObject, ALBiometricsActivityParentView.n);
        if (b3 == null) {
            return;
        }
        bean.setGuideActivity(b3.getString("activity"));
        bean.setGuideCount(b3.getIntValue("count"));
        bean.setGuideInterval(b3.getLongValue(Constants.Name.INTERVAL));
    }
}
