package com.taobao.android.searchbaseframe.nx3.bean;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexBean extends BaseTypedBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mDegradeType;
    public JSONObject pageInfoExtraStatus;
    public JSONObject model = new JSONObject();
    public JSONObject status = new JSONObject();
    public JSONObject extraStatus = new JSONObject();
    public final Map<String, Object> mStorage = new HashMap();
    private int mCachedWfHeight = -1;
    private int mCachedListHeight = -1;

    static {
        kge.a(1484604892);
    }

    public static /* synthetic */ Object ipc$super(WeexBean weexBean, String str, Object... objArr) {
        if (str.hashCode() == -2073377637) {
            super.copy((TypedBean) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public String getdItemType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("231dc6fe", new Object[]{this}) : this.mDegradeType;
    }

    public void setdItemType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d8d4a0", new Object[]{this, str});
        } else {
            this.mDegradeType = str;
        }
    }

    public int getCachedHeight(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46a2b49a", new Object[]{this, listStyle})).intValue() : listStyle == ListStyle.LIST ? this.mCachedListHeight : this.mCachedWfHeight;
    }

    public void updateCachedHeight(ListStyle listStyle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c11f32f", new Object[]{this, listStyle, new Integer(i)});
        } else if (listStyle == ListStyle.LIST) {
            this.mCachedListHeight = i;
        } else {
            this.mCachedWfHeight = i;
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, com.taobao.android.searchbaseframe.parse.TypedBean
    public <T extends TypedBean> void copy(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846ac49b", new Object[]{this, t});
            return;
        }
        super.copy(t);
        WeexBean weexBean = (WeexBean) t;
        weexBean.model.putAll(this.model);
        weexBean.status.putAll(this.status);
        weexBean.pageInfoExtraStatus = this.pageInfoExtraStatus;
        weexBean.mStorage.putAll(this.mStorage);
        weexBean.mCachedListHeight = this.mCachedListHeight;
        weexBean.mCachedWfHeight = this.mCachedWfHeight;
        weexBean.mDegradeType = this.mDegradeType;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "WeexBean{type='" + this.type + "'}";
    }
}
