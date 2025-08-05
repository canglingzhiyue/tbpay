package com.taobao.search.sf.widgets.list.listcell.baseauction;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import java.util.Map;
import tb.jya;
import tb.kge;

/* loaded from: classes8.dex */
public class SFAuctionBaseCellBean extends BaseCellBean implements jya {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AuctionBaseBean auctionBaseBean;
    public boolean canPlay;
    public DynamicCardBean dynamicCardBean;
    public MuiseBean feedbackBean;
    public boolean hasPreRequestDetail = false;
    public JSONObject pageInfo;
    public JSONObject wsData;

    static {
        kge.a(-1508380848);
        kge.a(890370481);
    }

    @Override // tb.jya
    public Map<String, Object> getCellBehavXData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("69a29f5c", new Object[]{this});
        }
        return null;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : this.auctionBaseBean.itemId;
    }
}
