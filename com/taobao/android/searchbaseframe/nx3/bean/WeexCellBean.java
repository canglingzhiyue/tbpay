package com.taobao.android.searchbaseframe.nx3.bean;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexCellBean extends BaseCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean adjust;
    public String degradeType;
    public WeexBean mWeexBean;
    public final Map<String, Object> mStorage = new HashMap();
    public boolean videoPlayable = false;
    public final Map<String, Object> mExtraObj = new HashMap();

    static {
        kge.a(622382174);
    }

    public static /* synthetic */ Object ipc$super(WeexCellBean weexCellBean, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1467749990) {
            super.copyCellData((BaseCellBean) objArr[0]);
            return null;
        } else if (hashCode != -853395924) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.mo1013copy();
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    /* renamed from: copyCellBean  reason: collision with other method in class */
    public WeexCellBean mo1014copyCellBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexCellBean) ipChange.ipc$dispatch("75aa2c59", new Object[]{this}) : new WeexCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    /* renamed from: copy  reason: collision with other method in class */
    public WeexCellBean mo1013copy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexCellBean) ipChange.ipc$dispatch("f0a4ba6b", new Object[]{this});
        }
        WeexCellBean weexCellBean = (WeexCellBean) super.mo1013copy();
        weexCellBean.mWeexBean = new WeexBean();
        this.mWeexBean.copy(weexCellBean.mWeexBean);
        weexCellBean.mExtraObj.putAll(this.mExtraObj);
        weexCellBean.mStorage.putAll(this.mStorage);
        weexCellBean.videoPlayable = this.videoPlayable;
        return weexCellBean;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean
    public void copyCellData(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a883e99a", new Object[]{this, baseCellBean});
            return;
        }
        super.copyCellData(baseCellBean);
        if (!(baseCellBean instanceof WeexCellBean)) {
            return;
        }
        WeexCellBean weexCellBean = (WeexCellBean) baseCellBean;
        weexCellBean.videoPlayable = this.videoPlayable;
        weexCellBean.mStorage.putAll(this.mStorage);
        WeexBean weexBean = weexCellBean.mWeexBean;
        if (weexBean != null && this.mWeexBean != null) {
            weexBean.mStorage.putAll(this.mWeexBean.mStorage);
        }
        WeexBean weexBean2 = weexCellBean.mWeexBean;
        if (weexBean2 == null || this.mWeexBean == null) {
            return;
        }
        weexBean2.updateCachedHeight(ListStyle.LIST, this.mWeexBean.getCachedHeight(ListStyle.LIST));
        weexCellBean.mWeexBean.updateCachedHeight(ListStyle.WATERFALL, this.mWeexBean.getCachedHeight(ListStyle.WATERFALL));
    }
}
