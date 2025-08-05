package com.taobao.tao.newsku;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.ContractNode;
import com.taobao.android.detail.sdk.model.node.InstallmentNode;
import com.taobao.android.detail.sdk.model.node.ItemNode;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.ServiceNode;
import com.taobao.android.detail.sdk.model.node.ShippingNode;
import com.taobao.android.detail.sdk.model.node.SkuBaseNode;
import com.taobao.android.detail.sdk.model.node.SkuCoreNode;
import com.taobao.android.detail.sdk.model.node.TradeNode;
import com.taobao.android.detail.sdk.model.node.VerticalNode;
import com.taobao.android.detail.sdk.model.node.YxgDataNode;
import com.taobao.android.detail.sdk.model.sku.BaseSkuInputComponent;
import com.taobao.android.detail.sdk.model.sku.ExtSkuComponentModel;
import com.taobao.android.detail.sdk.vmodel.main.MultiMediaModel;
import com.taobao.tao.detail.model.DetailModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.ewu;
import tb.ewv;
import tb.eww;
import tb.ewx;
import tb.kge;
import tb.mto;
import tb.riy;
import tb.tpc;

/* loaded from: classes8.dex */
public class NewSkuModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean childrecBundleItem;
    private long mBuyNum;
    private List<a> mBuyNumChangedListenerList;
    private HashMap<String, ServiceNode.ServiceItem> mCachedAllServiceMap;
    private Map<String, String> mCachedPropPath2SkuIdMap;
    private List<SkuBaseNode.SkuProperty> mCachedSkuProps;
    private String mCurrentSkuId;
    private Set<String> mDescartesSetCache;
    private HashMap<String, String> mExparams;
    private List<b> mExtComponentChangedListenerList;
    private ExtSkuComponentModel mExtComponentModel;
    private String mH5ServiceId;
    private com.taobao.android.detail.sdk.model.sku.a mH5SkuModel;
    private Set<String> mHasTagSetCache;
    private int mInstallmentPlan;
    private double mInstallmentRate;
    private NodeBundle mNodeBundle;
    private Map<String, String> mPropId2PropValueIdMap;
    private List<c> mPropValueChangedListenerList;
    private Map<String, String> mServiceId2UniqueIdMap;
    private List<d> mServiceIdChangedListenerList;
    private String mSkuId;
    private List<e> mSkuIdChangedListenerList;
    public String mSkuPropText;
    public MultiMediaModel multiMediaModel;
    public int refundMaxValue;

    /* loaded from: classes8.dex */
    public static class SkuTradeVO implements Serializable {
        public String areaId;
        public long buyNum;
        public int installmentPlan;
        public double installmentRate;
        public String itemId;
        public String serviceId;
        public String skuId;
        public long unitBuy;

        static {
            kge.a(-2073853270);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes8.dex */
    public interface a {
    }

    /* loaded from: classes8.dex */
    public interface b {
    }

    /* loaded from: classes8.dex */
    public interface c {
    }

    /* loaded from: classes8.dex */
    public interface d {
    }

    /* loaded from: classes8.dex */
    public interface e {
    }

    static {
        kge.a(-1055810662);
        kge.a(1028243835);
    }

    public NewSkuModel(NodeBundle nodeBundle) {
        this.childrecBundleItem = false;
        this.refundMaxValue = -1;
        this.mExparams = new HashMap<>();
        this.mNodeBundle = nodeBundle;
        initMultiMediaModel();
        resetAllChoice();
        initCheckedPropValueIdList();
        tpc.a("com.taobao.tao.newsku.NewSkuModel");
    }

    public NewSkuModel(NodeBundle nodeBundle, String str) {
        this(nodeBundle);
        if (!TextUtils.isEmpty(str)) {
            checkSkuId(str);
        }
    }

    private void initCheckedPropValueIdList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c627b0d7", new Object[]{this});
            return;
        }
        String str = null;
        List<SkuBaseNode.SkuIdPropPath> skuIdPropPathList = getSkuIdPropPathList();
        if (skuIdPropPathList != null) {
            Iterator<SkuBaseNode.SkuIdPropPath> it = skuIdPropPathList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SkuBaseNode.SkuIdPropPath next = it.next();
                if (next.selected) {
                    str = next.skuId;
                    break;
                }
            }
        }
        if (str == null) {
            return;
        }
        checkSkuId(str);
    }

    public void reset(NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a61dc0", new Object[]{this, nodeBundle});
            return;
        }
        resetAllChoice();
        clearCache();
        this.mNodeBundle = nodeBundle;
        resetAllChoice();
        initCheckedPropValueIdList();
    }

    private void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        Set<String> set = this.mDescartesSetCache;
        if (set != null) {
            set.clear();
            this.mDescartesSetCache = null;
        }
        Set<String> set2 = this.mHasTagSetCache;
        if (set2 != null) {
            set2.clear();
            this.mHasTagSetCache = null;
        }
        Map<String, String> map = this.mCachedPropPath2SkuIdMap;
        if (map != null) {
            map.clear();
            this.mCachedPropPath2SkuIdMap = null;
        }
        List<SkuBaseNode.SkuProperty> list = this.mCachedSkuProps;
        if (list != null) {
            list.clear();
            this.mCachedSkuProps = null;
        }
        HashMap<String, ServiceNode.ServiceItem> hashMap = this.mCachedAllServiceMap;
        if (hashMap != null) {
            hashMap.clear();
            this.mCachedAllServiceMap = null;
        }
        this.mH5SkuModel = null;
        this.mExtComponentModel = null;
        this.mSkuId = null;
    }

    public com.taobao.android.detail.sdk.model.sku.a getH5SkuModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.sdk.model.sku.a) ipChange.ipc$dispatch("d692b3e", new Object[]{this}) : this.mH5SkuModel;
    }

    public void setH5SkuModel(com.taobao.android.detail.sdk.model.sku.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed71596", new Object[]{this, aVar});
        } else {
            this.mH5SkuModel = aVar;
        }
    }

    public void updateH5SkuParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dd3cd1", new Object[]{this, map});
            return;
        }
        com.taobao.android.detail.sdk.model.sku.a aVar = this.mH5SkuModel;
        if (aVar == null) {
            this.mH5SkuModel = new com.taobao.android.detail.sdk.model.sku.a(map);
        } else {
            aVar.a(map);
        }
        if (!ewu.a(this.mH5SkuModel.f10301a, this.mSkuId)) {
            this.mSkuId = this.mH5SkuModel.f10301a;
            notifySkuIdChanged();
        }
        if (this.mH5SkuModel.b != getBuyNum()) {
            this.mBuyNum = this.mH5SkuModel.b;
            notifyBuyNumChanged();
        }
        if (!TextUtils.isEmpty(this.mH5SkuModel.e)) {
            this.mH5ServiceId = this.mH5SkuModel.e;
        }
        notifyPropValueIdChanged();
    }

    public long getBuyNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3af58b91", new Object[]{this})).longValue() : this.mBuyNum;
    }

    public void setBuyNum(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba21d23b", new Object[]{this, new Long(j)});
            return;
        }
        int unitBuy = getUnitBuy();
        int i = this.refundMaxValue;
        long currentBuyNumUpperLimit = i >= 0 ? i : getCurrentBuyNumUpperLimit();
        if (currentBuyNumUpperLimit <= j) {
            j = currentBuyNumUpperLimit;
        }
        long j2 = j % unitBuy;
        if (0 != j2) {
            j -= j2;
        }
        if (this.mBuyNum == j) {
            return;
        }
        this.mBuyNum = j;
        notifyBuyNumChanged();
    }

    private void resetBuyNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894fb656", new Object[]{this});
        } else {
            setBuyNum(getUnitBuy());
        }
    }

    public void notifySkuIdChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77aec6c", new Object[]{this});
            return;
        }
        List<e> list = this.mSkuIdChangedListenerList;
        if (list == null) {
            return;
        }
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            getCheckedPropValueCaptionList();
        }
    }

    public String getSkuId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c61a6d7", new Object[]{this}) : this.mSkuId;
    }

    public void notifyPropValueIdChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253ba9b", new Object[]{this});
            return;
        }
        List<c> list = this.mPropValueChangedListenerList;
        if (list == null) {
            return;
        }
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            ewv.a(this.mPropId2PropValueIdMap);
        }
    }

    public void notifyServiceIdChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ca5d54", new Object[]{this});
            return;
        }
        List<d> list = this.mServiceIdChangedListenerList;
        if (list == null) {
            return;
        }
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            getCheckedServiceIdList();
        }
    }

    public void notifyBuyNumChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0885b2", new Object[]{this});
            return;
        }
        List<a> list = this.mBuyNumChangedListenerList;
        if (list == null) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            getBuyNum();
        }
    }

    public void notifyExtComponentChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba9c6a36", new Object[]{this});
            return;
        }
        List<b> list = this.mExtComponentChangedListenerList;
        if (list == null) {
            return;
        }
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public boolean isSkuItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6a18ed1", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.featureNode == null || !this.mNodeBundle.featureNode.hasSku) ? false : true;
    }

    public boolean isNABundleItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3fa0a7d", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.featureNode == null || !this.mNodeBundle.featureNode.nABundleItem) ? false : true;
    }

    public boolean showSku() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97ac416b", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.featureNode == null || !this.mNodeBundle.featureNode.showSku) ? false : true;
    }

    public boolean hasAddCartCoudan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707d34ba", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.featureNode == null || !this.mNodeBundle.featureNode.hasAddCartCoudan) ? false : true;
    }

    public boolean showSkuThumbnail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcd86e77", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.featureNode == null || !this.mNodeBundle.featureNode.showSkuThumbnail) ? false : true;
    }

    public boolean hasAddTmallCartCoudan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbc24b4", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.featureNode == null || !this.mNodeBundle.featureNode.hasAddTmallCartCoudan) ? false : true;
    }

    public boolean isH5Sku() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e76aa791", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(getH5SkuUrl());
    }

    public String getH5SkuUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6bf3a64", new Object[]{this});
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.skuCoreNode == null || this.mNodeBundle.skuCoreNode.skuItem == null) ? "" : this.mNodeBundle.skuCoreNode.skuItem.skuH5Url;
    }

    public boolean isAreaSaleTaobao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28882317", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.skuCoreNode == null || this.mNodeBundle.skuCoreNode.skuItem == null || !this.mNodeBundle.skuCoreNode.skuItem.showAddressTaobao) ? false : true;
    }

    public boolean isAreaSaleTMall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be192915", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.skuCoreNode == null || this.mNodeBundle.skuCoreNode.skuItem == null || !this.mNodeBundle.skuCoreNode.skuItem.showAddress) ? false : true;
    }

    public boolean isAllComplete() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("150946fb", new Object[]{this})).booleanValue() : isSkuPropComplete() && isServiceComplete() && isExtComponentComplete();
    }

    public boolean isServiceComplete() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97daeb0f", new Object[]{this})).booleanValue() : ewu.a(getCurrentSkuServiceItem()) || !isGroupServiceMustChecked() || !ewu.a(this.mServiceId2UniqueIdMap);
    }

    public boolean isSkuPropComplete() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a85a59fa", new Object[]{this})).booleanValue() : !isSkuItem() || !TextUtils.isEmpty(this.mSkuId);
    }

    public boolean isExtComponentComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8486368a", new Object[]{this})).booleanValue();
        }
        ExtSkuComponentModel extSkuComponentModel = this.mExtComponentModel;
        return extSkuComponentModel == null || extSkuComponentModel.isComplete;
    }

    public void resetAllChoice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ef151a", new Object[]{this});
            return;
        }
        if (!ewu.a(this.mPropId2PropValueIdMap)) {
            for (String str : ewv.a(this.mPropId2PropValueIdMap)) {
                unCheckPropValueId(str);
            }
            this.mPropId2PropValueIdMap.clear();
        }
        resetServiceChoice();
        resetBuyNum();
    }

    public void resetServiceChoice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd238ae", new Object[]{this});
            return;
        }
        Map<String, ServiceNode.ServiceItem> currentSkuServiceItem = getCurrentSkuServiceItem();
        if (!ewu.a(this.mServiceId2UniqueIdMap)) {
            this.mServiceId2UniqueIdMap.clear();
        }
        for (Map.Entry<String, ServiceNode.ServiceItem> entry : currentSkuServiceItem.entrySet()) {
            ServiceNode.ServiceItem value = entry.getValue();
            String key = entry.getKey();
            if (ewu.a(value.subServiceItems)) {
                if (value.autoSelect) {
                    checkSkuService(key);
                }
            } else {
                for (ServiceNode.ServiceItem.SubServiceItem subServiceItem : value.subServiceItems) {
                    if (subServiceItem.autoSelect) {
                        checkSkuService(ewx.a(key, subServiceItem.id));
                    }
                }
            }
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        unRegisterAllListener();
        clearCache();
    }

    public List<SkuBaseNode.SkuProperty> getSkuProps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c3383c77", new Object[]{this});
        }
        List<SkuBaseNode.SkuProperty> list = this.mCachedSkuProps;
        if (list != null) {
            return list;
        }
        if (this.mNodeBundle.skuBaseNode != null && this.mNodeBundle.skuBaseNode.props != null) {
            this.mCachedSkuProps = new ArrayList(this.mNodeBundle.skuBaseNode.props);
        } else {
            this.mCachedSkuProps = new ArrayList();
        }
        Iterator<SkuBaseNode.SkuProperty> it = this.mCachedSkuProps.iterator();
        while (it.hasNext()) {
            SkuBaseNode.SkuProperty next = it.next();
            String str = next.pid;
            Iterator<SkuBaseNode.SkuPropertyValue> it2 = next.values.iterator();
            while (it2.hasNext()) {
                SkuBaseNode.SkuPropertyValue next2 = it2.next();
                if (!isPropPathCheckable(eww.a(str, next2.vid))) {
                    next2.checkable = false;
                }
            }
            if (ewu.a(next.values)) {
                it.remove();
            }
        }
        return this.mCachedSkuProps;
    }

    private void initMultiMediaModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3814615", new Object[]{this});
        } else {
            this.multiMediaModel = new MultiMediaModel(this);
        }
    }

    public TradeNode getTradeNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TradeNode) ipChange.ipc$dispatch("5fd658ef", new Object[]{this}) : this.mNodeBundle.tradeNode;
    }

    public ShippingNode getDevivery() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShippingNode) ipChange.ipc$dispatch("57e88681", new Object[]{this}) : this.mNodeBundle.shippingNode;
    }

    public ItemNode getItemNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemNode) ipChange.ipc$dispatch("10004e87", new Object[]{this}) : this.mNodeBundle.itemNode;
    }

    public SkuCoreNode.SkuItem getSkuItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuCoreNode.SkuItem) ipChange.ipc$dispatch("a2ded761", new Object[]{this});
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle != null && nodeBundle.skuCoreNode != null) {
            return this.mNodeBundle.skuCoreNode.skuItem;
        }
        return null;
    }

    public VerticalNode getVerticalNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerticalNode) ipChange.ipc$dispatch("432835a7", new Object[]{this}) : this.mNodeBundle.verticalNode;
    }

    public InstallmentNode getInstallmentNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstallmentNode) ipChange.ipc$dispatch("c3ec2c85", new Object[]{this});
        }
        if (this.mNodeBundle.skuVerticalNode == null) {
            return null;
        }
        return this.mNodeBundle.skuVerticalNode.installmentNode;
    }

    public List<ContractNode> getContractNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fb42bdf6", new Object[]{this});
        }
        if (this.mNodeBundle.skuVerticalNode == null) {
            return null;
        }
        return this.mNodeBundle.skuVerticalNode.contractNode;
    }

    public void setInstallmentPlan(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f8b3dc", new Object[]{this, new Integer(i)});
        } else {
            this.mInstallmentPlan = i;
        }
    }

    public void setInstallmentRate(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18f59c0", new Object[]{this, new Double(d2)});
        } else {
            this.mInstallmentRate = d2;
        }
    }

    public String getOriginalString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f78ffc1", new Object[]{this});
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle != null && nodeBundle.root != null) {
            return JSONObject.toJSONString(this.mNodeBundle.root);
        }
        return null;
    }

    public List<String> getShowTagPropValueIdList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ca170740", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (SkuBaseNode.SkuProperty skuProperty : getSkuProps()) {
            Iterator<SkuBaseNode.SkuPropertyValue> it = skuProperty.values.iterator();
            while (it.hasNext()) {
                String a2 = eww.a(skuProperty.pid, it.next().vid);
                if (isPropValueIdNeedShowTag(a2)) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    public List<String> getUncheckablePropValueIdList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e95503cc", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (SkuBaseNode.SkuProperty skuProperty : getSkuProps()) {
            Iterator<SkuBaseNode.SkuPropertyValue> it = skuProperty.values.iterator();
            while (it.hasNext()) {
                String a2 = eww.a(skuProperty.pid, it.next().vid);
                if (!isPropValueIdCheckable(a2)) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    public List<String> getCheckedPropValueIdList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ec1d150a", new Object[]{this}) : ewv.a(this.mPropId2PropValueIdMap);
    }

    public List<String> getCheckedPropValueCaptionList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2571fb79", new Object[]{this});
        }
        if (isH5Sku()) {
            ArrayList arrayList = new ArrayList();
            com.taobao.android.detail.sdk.model.sku.a aVar = this.mH5SkuModel;
            if (aVar != null && aVar.c != null) {
                arrayList.add(this.mH5SkuModel.c);
            }
            return arrayList;
        } else if (ewu.a(this.mPropId2PropValueIdMap)) {
            return null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, String> entry : this.mPropId2PropValueIdMap.entrySet()) {
                arrayList2.add(getPropValueCaption(entry.getKey(), entry.getValue()));
            }
            return arrayList2;
        }
    }

    public List<String> getUnCheckedPropNameList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("12b3f5dc", new Object[]{this});
        }
        List<SkuBaseNode.SkuProperty> skuProps = getSkuProps();
        ArrayList arrayList = new ArrayList();
        if (ewu.a(skuProps)) {
            return arrayList;
        }
        for (SkuBaseNode.SkuProperty skuProperty : skuProps) {
            if (ewu.a(this.mPropId2PropValueIdMap) || !this.mPropId2PropValueIdMap.containsKey(skuProperty.pid)) {
                arrayList.add(skuProperty.name);
            }
        }
        return arrayList;
    }

    private String getPropValueCaption(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b31f1f7", new Object[]{this, str, str2});
        }
        for (SkuBaseNode.SkuProperty skuProperty : getSkuProps()) {
            if (skuProperty.pid.equals(str) && !ewu.a(skuProperty.values)) {
                String d2 = eww.d(str2);
                Iterator<SkuBaseNode.SkuPropertyValue> it = skuProperty.values.iterator();
                while (it.hasNext()) {
                    SkuBaseNode.SkuPropertyValue next = it.next();
                    if (next.vid.equals(d2)) {
                        StringBuilder sb = new StringBuilder("");
                        if (!TextUtils.isEmpty(next.alias)) {
                            sb.append(next.alias);
                        } else {
                            sb.append(next.name);
                        }
                        if (!TextUtils.isEmpty(next.colorSeries) && !TextUtils.isEmpty(next.colorMaterial)) {
                            sb.append(String.format("(色系为%s, 质地为%s)", next.colorSeries, next.colorMaterial));
                        } else if (!TextUtils.isEmpty(next.colorSeries)) {
                            sb.append("(色系为");
                            sb.append(next.colorSeries);
                            sb.append(riy.BRACKET_END_STR);
                        } else if (!TextUtils.isEmpty(next.colorMaterial)) {
                            sb.append("(质地为");
                            sb.append(next.colorMaterial);
                            sb.append(riy.BRACKET_END_STR);
                        }
                        return sb.toString();
                    }
                }
                continue;
            }
        }
        return "";
    }

    private String updateSelectedSkuId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86c924bb", new Object[]{this, str});
        }
        Map<String, SkuCoreNode.SkuAttribute> skuId2AttributeMap = getSkuId2AttributeMap();
        if (ewu.a(str, this.mSkuId)) {
            return this.mSkuId;
        }
        if (TextUtils.isEmpty(str)) {
            this.mSkuId = null;
            long j = this.mBuyNum;
            if (0 < j) {
                setBuyNum(j);
            } else {
                resetBuyNum();
            }
            resetServiceChoice();
            notifySkuIdChanged();
        } else if (skuId2AttributeMap.containsKey(str)) {
            if (skuId2AttributeMap.get(str).quantity <= 0) {
                return this.mSkuId;
            }
            this.mSkuId = str;
            long j2 = this.mBuyNum;
            if (0 < j2) {
                setBuyNum(j2);
            } else {
                resetBuyNum();
            }
            resetServiceChoice();
            notifySkuIdChanged();
        }
        return this.mSkuId;
    }

    private String updateSelectedSkuId(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd1079b4", new Object[]{this, list});
        }
        String findSkuIdByPropValueList = findSkuIdByPropValueList(list);
        this.mCurrentSkuId = findSkuIdByPropValueList;
        return updateSelectedSkuId(findSkuIdByPropValueList);
    }

    private String findSkuIdByPropValueList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("428b652", new Object[]{this, list});
        }
        if (!ewu.a(list)) {
            return getSkuIdPropPathMap().get(eww.a(list));
        }
        return null;
    }

    public boolean changePropValueId(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e847d28e", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return checkPropValueId(str);
        }
        return unCheckPropValueId(str);
    }

    public boolean isPropValueIdChecked(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b9bb93d", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String c2 = eww.c(str);
        return !TextUtils.isEmpty(c2) && !ewu.a(this.mPropId2PropValueIdMap) && this.mPropId2PropValueIdMap.containsKey(c2) && this.mPropId2PropValueIdMap.get(c2).equals(str);
    }

    public String checkSkuId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f609d3f", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            resetAllChoice();
            return this.mSkuId;
        }
        List<String> a2 = eww.a(str, getSkuIdPropPathList());
        if (ewu.a(a2)) {
            return this.mSkuId;
        }
        resetAllChoice();
        for (String str2 : a2) {
            checkPropValueId(str2);
        }
        return this.mSkuId;
    }

    public boolean checkSkuIdExisted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59a9bedb", new Object[]{this, str})).booleanValue();
        }
        String c2 = eww.c(str);
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.mPropId2PropValueIdMap;
        if (map != null) {
            hashMap.putAll(map);
        }
        if (checkAllSkuPathSelected(str)) {
            hashMap.put(c2, str);
            this.mCurrentSkuId = findSkuIdByPropValueList(ewv.a(hashMap));
            if (this.mCurrentSkuId != null) {
                return true;
            }
        }
        return false;
    }

    public boolean checkAllSkuPathSelected(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("956a6279", new Object[]{this, str})).booleanValue();
        }
        String c2 = eww.c(str);
        Map<String, String> map = this.mPropId2PropValueIdMap;
        if (map == null) {
            return false;
        }
        int size = map.size();
        if (!this.mPropId2PropValueIdMap.keySet().contains(c2)) {
            size++;
        }
        return size == getSkuProps().size();
    }

    public boolean checkPropValueId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd7cb36", new Object[]{this, str})).booleanValue();
        }
        if (isPropValueIdChecked(str)) {
            return true;
        }
        String c2 = eww.c(str);
        if (this.mPropId2PropValueIdMap == null) {
            this.mPropId2PropValueIdMap = new ConcurrentHashMap();
        }
        if (this.mPropId2PropValueIdMap.containsKey(c2)) {
            unCheckPropValueId(c2, this.mPropId2PropValueIdMap.get(c2));
        }
        this.mPropId2PropValueIdMap.put(c2, str);
        updateSelectedSkuId(ewv.a(this.mPropId2PropValueIdMap));
        notifyPropValueIdChanged();
        return true;
    }

    public String getCurrentSkuId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6845284", new Object[]{this}) : this.mCurrentSkuId;
    }

    public void checkPropValueIds(List<String> list) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a94c3aa", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (isPropValueIdChecked(str)) {
                    return;
                }
                if (isPropValueIdCheckable(str)) {
                    String c2 = eww.c(str);
                    if (this.mPropId2PropValueIdMap == null) {
                        this.mPropId2PropValueIdMap = new ConcurrentHashMap();
                    }
                    this.mPropId2PropValueIdMap.put(c2, str);
                    z = true;
                }
            }
            if (!z) {
                return;
            }
            updateSelectedSkuId(ewv.a(this.mPropId2PropValueIdMap));
        }
    }

    public void updateSkuCache(com.taobao.tao.newsku.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41aa265d", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (aVar.f20815a != null && !aVar.f20815a.isEmpty()) {
                checkPropValueIds(aVar.f20815a);
            }
            if (aVar.b <= 0) {
                return;
            }
            setBuyNum(aVar.b);
        }
    }

    public boolean unCheckPropValueId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("249d8b2f", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        unCheckPropValueId(eww.c(str), str);
        return false;
    }

    private void unCheckPropValueId(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d46035", new Object[]{this, str, str2});
        } else if (ewu.a(this.mPropId2PropValueIdMap) || TextUtils.isEmpty(str) || !this.mPropId2PropValueIdMap.containsKey(str) || !ewu.a(str2, this.mPropId2PropValueIdMap.get(str))) {
        } else {
            this.mPropId2PropValueIdMap.remove(str);
            updateSelectedSkuId(ewv.a(this.mPropId2PropValueIdMap));
            notifyPropValueIdChanged();
        }
    }

    public boolean isPropPathShowTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("928d99e0", new Object[]{this, str})).booleanValue();
        }
        initDescartes();
        Set<String> set = this.mHasTagSetCache;
        if (set != null) {
            return set.contains(str);
        }
        return false;
    }

    public boolean isPropPathCheckable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db03aba5", new Object[]{this, str})).booleanValue();
        }
        initDescartes();
        Set<String> set = this.mDescartesSetCache;
        if (set != null) {
            return set.contains(str);
        }
        return false;
    }

    public boolean isPropValueIdNeedShowTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a93afd", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String c2 = eww.c(str);
        Map<String, String> map = this.mPropId2PropValueIdMap;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!c2.equals(entry.getKey())) {
                    arrayList.add(entry.getValue());
                }
            }
        }
        arrayList.add(str);
        return isPropPathShowTag(eww.a(arrayList));
    }

    public boolean isPropValueIdCheckable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3ea8578", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String c2 = eww.c(str);
        Map<String, String> map = this.mPropId2PropValueIdMap;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!c2.equals(entry.getKey())) {
                    arrayList.add(entry.getValue());
                }
            }
        }
        arrayList.add(str);
        return isPropPathCheckable(eww.a(arrayList));
    }

    private void initDescartes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1028c7b7", new Object[]{this});
            return;
        }
        Set<String> set = this.mDescartesSetCache;
        if (set != null && !set.isEmpty() && !isChildrecBundleItem()) {
            return;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (Map.Entry<String, String> entry : getSkuIdPropPathMap().entrySet()) {
            String value = entry.getValue();
            if (hasQuantity(value)) {
                hashSet.add(entry.getKey());
            }
            if (isShowTag(value)) {
                hashSet2.add(entry.getKey());
            }
        }
        this.mHasTagSetCache = hashSet2;
        this.mDescartesSetCache = descartes(hashSet);
    }

    public Set<String> descartes(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("70819ae7", new Object[]{this, set});
        }
        HashSet hashSet = new HashSet();
        for (String str : set) {
            String[] split = str.split(";");
            int pow = ((int) Math.pow(2.0d, split.length)) - 1;
            for (int i = 1; i <= pow; i++) {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < split.length; i2++) {
                    if (((1 << i2) & i) > 0) {
                        sb.append(";");
                        sb.append(split[i2]);
                    }
                }
                if (sb.length() > 0) {
                    hashSet.add(sb.substring(1));
                }
            }
        }
        return hashSet;
    }

    public Map<String, String> getSkuIdPropPathMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5d2ff54e", new Object[]{this});
        }
        Map<String, String> map = this.mCachedPropPath2SkuIdMap;
        if (map != null) {
            return map;
        }
        List<SkuBaseNode.SkuIdPropPath> skuIdPropPathList = getSkuIdPropPathList();
        this.mCachedPropPath2SkuIdMap = new HashMap();
        if (skuIdPropPathList != null) {
            for (SkuBaseNode.SkuIdPropPath skuIdPropPath : skuIdPropPathList) {
                this.mCachedPropPath2SkuIdMap.put(skuIdPropPath.propPath, skuIdPropPath.skuId);
            }
        }
        this.mCachedPropPath2SkuIdMap = eww.a(this.mCachedPropPath2SkuIdMap);
        return this.mCachedPropPath2SkuIdMap;
    }

    public String getItemIdBySkuId(String str) {
        List<SkuBaseNode.SkuIdPropPath> skuIdPropPathList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9439fdb2", new Object[]{this, str});
        }
        if (str != null && (skuIdPropPathList = getSkuIdPropPathList()) != null) {
            for (SkuBaseNode.SkuIdPropPath skuIdPropPath : skuIdPropPathList) {
                if (str.equals(skuIdPropPath.skuId)) {
                    return skuIdPropPath.itemId;
                }
            }
        }
        return null;
    }

    private List<SkuBaseNode.SkuIdPropPath> getSkuIdPropPathList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4caff878", new Object[]{this});
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle != null && nodeBundle.skuBaseNode != null) {
            return this.mNodeBundle.skuBaseNode.skus;
        }
        return null;
    }

    private boolean hasQuantity(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3df7ea1a", new Object[]{this, str})).booleanValue() : getQuantity(str) > 0;
    }

    public long getCurrentQuantity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcb42c69", new Object[]{this})).longValue() : getQuantity(this.mSkuId);
    }

    public String getCurrentQuantityText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ecd709e", new Object[]{this}) : getQuantityText(this.mSkuId);
    }

    public String getSkuSubTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("389f7d5a", new Object[]{this});
        }
        SkuCoreNode.SkuAttribute skuAttributeBySkuId = getSkuAttributeBySkuId(this.mSkuId);
        return skuAttributeBySkuId == null ? "" : skuAttributeBySkuId.subTitle;
    }

    public String getAsacSecurityCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8b66ca2", new Object[]{this});
        }
        SkuCoreNode.SkuAttribute skuAttributeBySkuId = getSkuAttributeBySkuId(this.mSkuId);
        return skuAttributeBySkuId == null ? "" : skuAttributeBySkuId.asac;
    }

    public boolean isShowTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e498128", new Object[]{this, str})).booleanValue();
        }
        SkuCoreNode.SkuAttribute skuAttributeBySkuId = getSkuAttributeBySkuId(str);
        if (skuAttributeBySkuId != null) {
            return skuAttributeBySkuId.isShowTag;
        }
        return false;
    }

    public String getSkuSubTitleColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da86add5", new Object[]{this});
        }
        SkuCoreNode.SkuAttribute skuAttributeBySkuId = getSkuAttributeBySkuId(this.mSkuId);
        return skuAttributeBySkuId == null ? "" : skuAttributeBySkuId.subTitleColor;
    }

    private String getQuantityText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89bf2fa1", new Object[]{this, str});
        }
        SkuCoreNode.SkuAttribute skuAttributeBySkuId = getSkuAttributeBySkuId(str);
        return skuAttributeBySkuId == null ? "" : skuAttributeBySkuId.quantityText;
    }

    private long getQuantity(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5c9f5c6", new Object[]{this, str})).longValue();
        }
        if (TextUtils.isEmpty(str) && (str2 = this.mCurrentSkuId) != null) {
            str = str2;
        }
        SkuCoreNode.SkuAttribute skuAttributeBySkuId = getSkuAttributeBySkuId(str);
        if (skuAttributeBySkuId != null) {
            return skuAttributeBySkuId.quantity;
        }
        return 0L;
    }

    private long getBuyLimit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97e1de90", new Object[]{this, str})).longValue();
        }
        SkuCoreNode.SkuAttribute skuAttributeBySkuId = getSkuAttributeBySkuId(str);
        if (skuAttributeBySkuId != null) {
            return skuAttributeBySkuId.limit;
        }
        return Long.MAX_VALUE;
    }

    public long getCurrentBuyLimit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8f793b3", new Object[]{this})).longValue() : getBuyLimit(this.mSkuId);
    }

    public String getBuyNumLimitText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cda84827", new Object[]{this});
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.priceNode == null) ? "" : this.mNodeBundle.priceNode.limitText;
    }

    public int getUnitBuy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31c558a6", new Object[]{this})).intValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle != null && nodeBundle.skuCoreNode != null && this.mNodeBundle.skuCoreNode.skuItem != null) {
            return this.mNodeBundle.skuCoreNode.skuItem.unitBuy;
        }
        return 1;
    }

    public String getCurrentAreaId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a96e62e", new Object[]{this});
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.shippingNode == null) ? "" : this.mNodeBundle.shippingNode.areaId;
    }

    public String getCurrentAreaName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1153a2be", new Object[]{this});
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.shippingNode == null) ? "" : this.mNodeBundle.shippingNode.to;
    }

    public String getCurrentAreaFullName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f35f56ef", new Object[]{this});
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle == null || nodeBundle.shippingNode == null) {
            return "";
        }
        String str = this.mNodeBundle.shippingNode.completedTo;
        return TextUtils.isEmpty(str) ? this.mNodeBundle.shippingNode.to : str;
    }

    public Map<String, SkuCoreNode.SkuAttribute> getSkuId2AttributeMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f34b26cc", new Object[]{this});
        }
        if (this.mNodeBundle.skuCoreNode == null) {
            return new HashMap(1);
        }
        return this.mNodeBundle.skuCoreNode.sku2info;
    }

    public boolean isTmallGoods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("213b1503", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.sellerNode == null || this.mNodeBundle.sellerNode.shopType != 2) ? false : true;
    }

    private Map<String, ServiceNode.ServiceItem> getItemAllServiceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1261069b", new Object[]{this});
        }
        HashMap<String, ServiceNode.ServiceItem> hashMap = this.mCachedAllServiceMap;
        if (hashMap != null) {
            return hashMap;
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle == null || nodeBundle.serviceNode == null) {
            return new HashMap(1);
        }
        ArrayList<ServiceNode.ServiceItem> arrayList = this.mNodeBundle.serviceNode.allServices;
        this.mCachedAllServiceMap = new HashMap<>();
        if (ewu.a(arrayList)) {
            return this.mCachedAllServiceMap;
        }
        Iterator<ServiceNode.ServiceItem> it = arrayList.iterator();
        while (it.hasNext()) {
            ServiceNode.ServiceItem next = it.next();
            this.mCachedAllServiceMap.put(next.serviceId, next);
        }
        return this.mCachedAllServiceMap;
    }

    private Map<String, List<ServiceNode.ServicePrice>> getSku2ServiceMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97b8a5ee", new Object[]{this});
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle == null || nodeBundle.serviceNode == null) {
            return new HashMap(1);
        }
        return this.mNodeBundle.serviceNode.sku2ServiceMap;
    }

    private boolean isGroupServiceMultiCheckable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10a9d2d4", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle != null && nodeBundle.serviceNode != null) {
            return this.mNodeBundle.serviceNode.isMultiSelect;
        }
        return false;
    }

    private boolean isGroupServiceMustChecked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5513949", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle != null && nodeBundle.serviceNode != null) {
            return this.mNodeBundle.serviceNode.isMustSelect;
        }
        return false;
    }

    public Map<String, ServiceNode.ServiceItem> getCurrentSkuServiceItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c225d2a", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        List<ServiceNode.ServicePrice> currentSkuServicePriceList = getCurrentSkuServicePriceList();
        if (currentSkuServicePriceList != null) {
            Map<String, ServiceNode.ServiceItem> itemAllServiceMap = getItemAllServiceMap();
            for (ServiceNode.ServicePrice servicePrice : currentSkuServicePriceList) {
                String str = servicePrice.serviceId;
                ServiceNode.ServiceItem serviceItem = itemAllServiceMap.get(str);
                if (serviceItem != null) {
                    hashMap.put(str, serviceItem);
                }
            }
        }
        return hashMap;
    }

    public Map<String, com.taobao.android.detail.sdk.model.sku.b> getCurrentMergedSkuServiceItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aac7be36", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        List<ServiceNode.ServicePrice> currentSkuServicePriceList = getCurrentSkuServicePriceList();
        if (!ewu.a(currentSkuServicePriceList)) {
            Map<String, ServiceNode.ServiceItem> itemAllServiceMap = getItemAllServiceMap();
            for (ServiceNode.ServicePrice servicePrice : currentSkuServicePriceList) {
                String str = servicePrice.serviceId;
                ServiceNode.ServiceItem serviceItem = itemAllServiceMap.get(str);
                if (serviceItem != null) {
                    if (ewu.a(servicePrice.subServicePrices)) {
                        com.taobao.android.detail.sdk.model.sku.b bVar = new com.taobao.android.detail.sdk.model.sku.b();
                        bVar.c = servicePrice.price <= mto.a.GEO_NOT_SUPPORT;
                        bVar.d = servicePrice.price;
                        bVar.b = serviceItem.name;
                        bVar.e = servicePrice.extraDisplayText;
                        hashMap.put(str, bVar);
                    } else {
                        com.taobao.android.detail.sdk.model.sku.b bVar2 = new com.taobao.android.detail.sdk.model.sku.b();
                        bVar2.b = serviceItem.name;
                        bVar2.f = new ArrayList();
                        Iterator<ServiceNode.ServicePrice.SubServicePrice> it = servicePrice.subServicePrices.iterator();
                        while (it.hasNext()) {
                            ServiceNode.ServicePrice.SubServicePrice next = it.next();
                            ServiceNode.ServiceItem.SubServiceItem a2 = ewx.a(next.uniqueId, serviceItem.subServiceItems);
                            if (a2 != null) {
                                com.taobao.android.detail.sdk.model.sku.b bVar3 = new com.taobao.android.detail.sdk.model.sku.b();
                                bVar3.c = next.price <= mto.a.GEO_NOT_SUPPORT;
                                bVar3.d = next.price;
                                bVar3.e = next.extraDisplayText;
                                if (!TextUtils.isEmpty(a2.name)) {
                                    bVar3.b = a2.name;
                                } else {
                                    bVar3.b = serviceItem.name;
                                }
                                bVar3.f10302a = ewx.a(str, a2.id);
                                bVar2.f.add(bVar3);
                            }
                        }
                        hashMap.put(str, bVar2);
                    }
                }
            }
        }
        return hashMap;
    }

    public List<ServiceNode.ServicePrice> getCurrentSkuServicePriceList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("66098414", new Object[]{this});
        }
        Map<String, List<ServiceNode.ServicePrice>> sku2ServiceMap = getSku2ServiceMap();
        if (ewu.a(sku2ServiceMap)) {
            return null;
        }
        return sku2ServiceMap.get(TextUtils.isEmpty(this.mSkuId) ? "0" : this.mSkuId);
    }

    public boolean isServiceChecked(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eab1b891", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return isServiceChecked(ewx.a(str), ewx.b(str));
        }
        return false;
    }

    public boolean isServiceChecked(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4050b91b", new Object[]{this, str, str2})).booleanValue();
        }
        if (ewu.a(this.mServiceId2UniqueIdMap)) {
            return false;
        }
        return this.mServiceId2UniqueIdMap.containsKey(str) && ewx.b(this.mServiceId2UniqueIdMap.get(str), str2);
    }

    public void checkSkuService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e3e891", new Object[]{this, str});
            return;
        }
        if (this.mServiceId2UniqueIdMap == null) {
            this.mServiceId2UniqueIdMap = new HashMap(getItemAllServiceMap().size());
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String a2 = ewx.a(str);
        String b2 = ewx.b(str);
        if (isServiceChecked(a2, b2)) {
            return;
        }
        Map<String, ServiceNode.ServiceItem> itemAllServiceMap = getItemAllServiceMap();
        if (!itemAllServiceMap.containsKey(a2)) {
            return;
        }
        ServiceNode.ServiceItem serviceItem = itemAllServiceMap.get(a2);
        if (!ewu.a(serviceItem.subServiceItems) && ewx.a(b2, serviceItem.subServiceItems) == null) {
            return;
        }
        if (ewu.a(this.mServiceId2UniqueIdMap)) {
            this.mServiceId2UniqueIdMap.put(a2, b2);
            notifyServiceIdChanged();
        } else if (!isGroupServiceMultiCheckable() && !this.mServiceId2UniqueIdMap.containsKey(a2)) {
            this.mServiceId2UniqueIdMap.clear();
            this.mServiceId2UniqueIdMap.put(a2, b2);
            notifyServiceIdChanged();
        } else {
            this.mServiceId2UniqueIdMap.put(a2, b2);
            notifyServiceIdChanged();
        }
    }

    public void unCheckSkuService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d9c578", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String a2 = ewx.a(str);
            if (!isServiceChecked(a2, ewx.b(str))) {
                return;
            }
            if (isGroupServiceMustChecked() && this.mServiceId2UniqueIdMap.size() <= 1) {
                return;
            }
            Map<String, ServiceNode.ServiceItem> itemAllServiceMap = getItemAllServiceMap();
            if (!itemAllServiceMap.containsKey(a2) || itemAllServiceMap.get(a2) == null || itemAllServiceMap.get(a2).mustSelect) {
                return;
            }
            this.mServiceId2UniqueIdMap.remove(a2);
            notifyServiceIdChanged();
        }
    }

    public YxgDataNode getYxgDataNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YxgDataNode) ipChange.ipc$dispatch("bd722953", new Object[]{this});
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle == null) {
            return null;
        }
        return nodeBundle.yxgDataNode;
    }

    public NodeBundle getNodeBundle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NodeBundle) ipChange.ipc$dispatch("e7ef89a7", new Object[]{this}) : this.mNodeBundle;
    }

    public List<String> getCheckedServiceIdList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("784d443", new Object[]{this});
        }
        if (ewu.a(this.mServiceId2UniqueIdMap)) {
            return new ArrayList(1);
        }
        return ewv.a(this.mServiceId2UniqueIdMap, "|");
    }

    public List<String> getCheckedServiceValueCaptionList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("101b91e9", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (!ewu.a(this.mServiceId2UniqueIdMap)) {
            Map<String, ServiceNode.ServiceItem> itemAllServiceMap = getItemAllServiceMap();
            if (ewu.a(itemAllServiceMap)) {
                return arrayList;
            }
            for (Map.Entry<String, String> entry : this.mServiceId2UniqueIdMap.entrySet()) {
                String value = entry.getValue();
                ServiceNode.ServiceItem serviceItem = itemAllServiceMap.get(entry.getKey());
                if (serviceItem != null) {
                    String str = serviceItem.name;
                    ServiceNode.ServiceItem.SubServiceItem a2 = ewx.a(value, serviceItem.subServiceItems);
                    if (a2 != null && !TextUtils.isEmpty(a2.name)) {
                        str = str + a2.name;
                    }
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public double calcCurrentPropPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95241617", new Object[]{this})).doubleValue();
        }
        SkuCoreNode.SkuAttribute currentSkuAttribute = getCurrentSkuAttribute();
        if (currentSkuAttribute == null) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        if (currentSkuAttribute.subPrice != null) {
            return currentSkuAttribute.subPrice.priceMoney / 100.0d;
        }
        return currentSkuAttribute.priceData != null ? currentSkuAttribute.priceData.priceMoney / 100.0d : mto.a.GEO_NOT_SUPPORT;
    }

    public SkuCoreNode.SkuAttribute getCurrentSkuAttribute() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkuCoreNode.SkuAttribute) ipChange.ipc$dispatch("8fe502e", new Object[]{this}) : getSkuAttributeBySkuId(this.mSkuId);
    }

    public SkuCoreNode.SkuAttribute getSkuAttributeBySkuId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuCoreNode.SkuAttribute) ipChange.ipc$dispatch("5aa6b922", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        Map<String, SkuCoreNode.SkuAttribute> skuId2AttributeMap = getSkuId2AttributeMap();
        if (ewu.a(skuId2AttributeMap) || !skuId2AttributeMap.containsKey(str) || skuId2AttributeMap.get(str) == null) {
            return null;
        }
        return skuId2AttributeMap.get(str);
    }

    public double calcCurrentServicePrice() {
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17ccfb8d", new Object[]{this})).doubleValue();
        }
        List<ServiceNode.ServicePrice> currentSkuServicePriceList = getCurrentSkuServicePriceList();
        boolean a2 = ewu.a(currentSkuServicePriceList);
        double d3 = mto.a.GEO_NOT_SUPPORT;
        if (a2 || ewu.a(this.mServiceId2UniqueIdMap)) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        for (Map.Entry<String, String> entry : this.mServiceId2UniqueIdMap.entrySet()) {
            String value = entry.getValue();
            ServiceNode.ServicePrice b2 = ewx.b(entry.getKey(), currentSkuServicePriceList);
            if (b2 != null) {
                if (TextUtils.isEmpty(value)) {
                    d2 = b2.price;
                } else {
                    ServiceNode.ServicePrice.SubServicePrice a3 = ewx.a(value, b2);
                    if (a3 != null) {
                        d2 = a3.price;
                    }
                }
                d3 += d2 / 100.0d;
            }
        }
        return d3;
    }

    public double calcTotalPrice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f48f280f", new Object[]{this})).doubleValue() : calcCurrentPropPrice() + mto.a.GEO_NOT_SUPPORT + calcCurrentServicePrice();
    }

    public double getBalanceDue() {
        InstallmentNode installmentNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("930db6e3", new Object[]{this})).doubleValue();
        }
        if (TextUtils.isEmpty(this.mSkuId) || (installmentNode = getInstallmentNode()) == null || ewu.a(installmentNode.skuId2Installment)) {
            return -1.0d;
        }
        try {
            return Double.parseDouble(installmentNode.skuId2Installment.get(this.mSkuId)) / 100.0d;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    public void setSelectedServices(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14386093", new Object[]{this, list});
        } else if (list != null) {
            for (String str : list) {
                checkSkuService(str);
            }
        }
    }

    private long getCurrentBuyNumUpperLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11257957", new Object[]{this})).longValue();
        }
        int unitBuy = getUnitBuy();
        long currentQuantity = getCurrentQuantity();
        long currentBuyLimit = getCurrentBuyLimit();
        if (currentQuantity > currentBuyLimit) {
            currentQuantity = currentBuyLimit;
        }
        long j = currentQuantity % unitBuy;
        return 0 != j ? currentQuantity - j : currentQuantity;
    }

    public boolean canIncrementBuyNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("564f128a", new Object[]{this})).booleanValue();
        }
        int unitBuy = getUnitBuy();
        int i = this.refundMaxValue;
        return this.mBuyNum + ((long) unitBuy) <= (i >= 0 ? (long) i : getCurrentBuyNumUpperLimit());
    }

    public boolean canDecrementBuyNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68da36ae", new Object[]{this})).booleanValue();
        }
        long unitBuy = getUnitBuy();
        return this.mBuyNum - unitBuy >= unitBuy;
    }

    public boolean incrementBuyNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b864fc7a", new Object[]{this})).booleanValue();
        }
        if (!canIncrementBuyNum()) {
            return false;
        }
        this.mBuyNum += getUnitBuy();
        notifyBuyNumChanged();
        return true;
    }

    public boolean decrementBuyNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caf0209e", new Object[]{this})).booleanValue();
        }
        int unitBuy = getUnitBuy();
        if (!canDecrementBuyNum()) {
            return false;
        }
        this.mBuyNum -= unitBuy;
        notifyBuyNumChanged();
        return true;
    }

    public void setExtComponentComplete(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bcacd6", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.mExtComponentModel == null) {
            this.mExtComponentModel = new ExtSkuComponentModel();
        }
        this.mExtComponentModel.isComplete = z;
        notifyExtComponentChanged();
    }

    public void setExtComponentParams(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929b995f", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (this.mExtComponentModel == null) {
            this.mExtComponentModel = new ExtSkuComponentModel();
        }
        if (!z2) {
            this.mExtComponentModel.componentExtParams.clear();
        }
        if (!ewu.a(str)) {
            this.mExtComponentModel.componentExtParams.put(str, str2);
        }
        this.mExtComponentModel.isComplete = z;
        notifyExtComponentChanged();
    }

    public void updateExtComponentParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a0ed13", new Object[]{this, map});
            return;
        }
        if (this.mExtComponentModel == null) {
            this.mExtComponentModel = new ExtSkuComponentModel();
            this.mExtComponentModel.isComplete = false;
        }
        if (!ewu.a(map)) {
            this.mExtComponentModel.componentExtParams.putAll(map);
        }
        notifyExtComponentChanged();
    }

    public void updateExtComponentCaption(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f857a6b2", new Object[]{this, str});
            return;
        }
        if (this.mExtComponentModel == null) {
            this.mExtComponentModel = new ExtSkuComponentModel();
        }
        this.mExtComponentModel.caption = str;
        notifyExtComponentChanged();
    }

    public void uncheckExtComponentKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772ce65", new Object[]{this, str});
            return;
        }
        ExtSkuComponentModel extSkuComponentModel = this.mExtComponentModel;
        if (extSkuComponentModel == null || ewu.a(extSkuComponentModel.componentExtParams)) {
            return;
        }
        this.mExtComponentModel.componentExtParams.remove(str);
        notifyExtComponentChanged();
    }

    public String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        return (nodeBundle == null || nodeBundle.itemNode == null) ? "" : this.mNodeBundle.itemNode.itemId;
    }

    public boolean cartEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84bf1fce", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle != null && nodeBundle.tradeNode != null) {
            return this.mNodeBundle.tradeNode.isCartEnable;
        }
        return true;
    }

    public boolean buyEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a099bb4", new Object[]{this})).booleanValue();
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle != null && nodeBundle.tradeNode != null) {
            return this.mNodeBundle.tradeNode.isBuyEnable;
        }
        return true;
    }

    public ArrayList<BaseSkuInputComponent> getSkuComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("986bb03e", new Object[]{this});
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle == null || nodeBundle.skuBaseNode == null) {
            return new ArrayList<>();
        }
        return this.mNodeBundle.skuBaseNode.components;
    }

    public Map<String, String> getBuyParams() {
        com.taobao.android.detail.sdk.model.sku.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b84e5f2", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (isH5Sku() && (aVar = this.mH5SkuModel) != null && !ewu.a(aVar.g)) {
            hashMap.putAll(this.mH5SkuModel.g);
        }
        ExtSkuComponentModel extSkuComponentModel = this.mExtComponentModel;
        if (extSkuComponentModel != null && !ewu.a(extSkuComponentModel.componentExtParams)) {
            hashMap.putAll(this.mExtComponentModel.componentExtParams);
        }
        if (!ewu.a(this.mExparams)) {
            hashMap.putAll(this.mExparams);
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle != null && nodeBundle.tradeNode != null && !ewu.a(this.mNodeBundle.tradeNode.buyParam)) {
            hashMap.putAll(this.mNodeBundle.tradeNode.buyParam);
        }
        NodeBundle nodeBundle2 = this.mNodeBundle;
        if (nodeBundle2 != null && nodeBundle2.shippingNode != null && !TextUtils.isEmpty(this.mNodeBundle.shippingNode.addressId)) {
            hashMap.put("addressId", this.mNodeBundle.shippingNode.addressId);
        }
        return hashMap;
    }

    public Map<String, String> getCartParams() {
        com.taobao.android.detail.sdk.model.sku.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1dd3a838", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (isH5Sku() && (aVar = this.mH5SkuModel) != null && !ewu.a(aVar.g)) {
            hashMap.putAll(this.mH5SkuModel.g);
        }
        ExtSkuComponentModel extSkuComponentModel = this.mExtComponentModel;
        if (extSkuComponentModel != null && !ewu.a(extSkuComponentModel.componentExtParams)) {
            hashMap.putAll(this.mExtComponentModel.componentExtParams);
        }
        if (!ewu.a(this.mExparams)) {
            hashMap.putAll(this.mExparams);
        }
        NodeBundle nodeBundle = this.mNodeBundle;
        if (nodeBundle != null && nodeBundle.tradeNode != null && !ewu.a(this.mNodeBundle.tradeNode.cartParam)) {
            hashMap.putAll(this.mNodeBundle.tradeNode.cartParam);
        }
        return hashMap;
    }

    public boolean isJhsJoin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db759340", new Object[]{this})).booleanValue();
        }
        if (this.mNodeBundle.verticalNode != null && this.mNodeBundle.verticalNode.jhsNode != null) {
            return this.mNodeBundle.verticalNode.jhsNode.isNeedJoin;
        }
        return false;
    }

    public boolean isCharityItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9edf394c", new Object[]{this})).booleanValue() : this.mNodeBundle.featureNode != null && this.mNodeBundle.featureNode.isDonateItem;
    }

    public SkuTradeVO getTradeVO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuTradeVO) ipChange.ipc$dispatch("6b862d6d", new Object[]{this});
        }
        SkuTradeVO skuTradeVO = new SkuTradeVO();
        skuTradeVO.itemId = getItemId();
        skuTradeVO.skuId = getSkuId();
        skuTradeVO.buyNum = getBuyNum();
        skuTradeVO.unitBuy = getUnitBuy();
        if (!TextUtils.isEmpty(this.mH5ServiceId)) {
            skuTradeVO.serviceId = this.mH5ServiceId;
        } else {
            skuTradeVO.serviceId = ewx.a(getCheckedServiceIdList());
        }
        skuTradeVO.areaId = getCurrentAreaId();
        skuTradeVO.installmentPlan = this.mInstallmentPlan;
        skuTradeVO.installmentRate = this.mInstallmentRate;
        return skuTradeVO;
    }

    public SkuChoiceVO getSkuChoiceVO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuChoiceVO) ipChange.ipc$dispatch("e287664c", new Object[]{this});
        }
        SkuChoiceVO skuChoiceVO = new SkuChoiceVO();
        skuChoiceVO.checkedPropValueIdList = new ArrayList<>(getCheckedPropValueIdList());
        if (isH5Sku()) {
            com.taobao.android.detail.sdk.model.sku.a h5SkuModel = getH5SkuModel();
            skuChoiceVO.checkedPropValueNames = h5SkuModel == null ? "" : h5SkuModel.c;
        } else {
            skuChoiceVO.checkedPropValueNames = ewv.a(getCheckedPropValueCaptionList(), " ", "\"");
        }
        skuChoiceVO.checkedServiceNames = ewv.a(getCheckedServiceValueCaptionList(), " ", "");
        skuChoiceVO.uncheckedPropNameList = new ArrayList<>(getUnCheckedPropNameList());
        skuChoiceVO.isAllComplete = isAllComplete();
        if (isAreaSaleTaobao() || isAreaSaleTMall()) {
            skuChoiceVO.currentAreaName = getCurrentAreaName();
            skuChoiceVO.currentAreaFullName = getCurrentAreaFullName();
        }
        return skuChoiceVO;
    }

    public HashMap<String, String> getExparams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a12faa59", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>(this.mExparams);
        ExtSkuComponentModel extSkuComponentModel = this.mExtComponentModel;
        if (extSkuComponentModel != null) {
            hashMap.putAll(extSkuComponentModel.componentExtParams);
        }
        return hashMap;
    }

    public void unRegisterAllListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17faf80", new Object[]{this});
            return;
        }
        List<c> list = this.mPropValueChangedListenerList;
        if (list != null) {
            list.clear();
            this.mPropValueChangedListenerList = null;
        }
        List<e> list2 = this.mSkuIdChangedListenerList;
        if (list2 != null) {
            list2.clear();
            this.mSkuIdChangedListenerList = null;
        }
        List<d> list3 = this.mServiceIdChangedListenerList;
        if (list3 != null) {
            list3.clear();
            this.mServiceIdChangedListenerList = null;
        }
        List<a> list4 = this.mBuyNumChangedListenerList;
        if (list4 != null) {
            list4.clear();
            this.mBuyNumChangedListenerList = null;
        }
        List<b> list5 = this.mExtComponentChangedListenerList;
        if (list5 == null) {
            return;
        }
        list5.clear();
        this.mExtComponentChangedListenerList = null;
    }

    public void unRegisterListener(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a0b01d3", new Object[]{this, obj});
            return;
        }
        if (obj instanceof c) {
            unRegisterPropValueChangedListener((c) obj);
        }
        if (obj instanceof d) {
            unRegisterServiceIdChangedListener((d) obj);
        }
        if (obj instanceof e) {
            unRegisterSkuIdChangedListener((e) obj);
        }
        if (!(obj instanceof a)) {
            return;
        }
        unRegisterBuyNumChangedListener((a) obj);
    }

    public void registerPropValueChangedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af15cfa4", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            if (this.mPropValueChangedListenerList == null) {
                this.mPropValueChangedListenerList = new ArrayList();
            }
            if (this.mPropValueChangedListenerList.contains(cVar)) {
                return;
            }
            this.mPropValueChangedListenerList.add(cVar);
        }
    }

    public void unRegisterPropValueChangedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bd850b", new Object[]{this, cVar});
        } else if (ewu.a(this.mPropValueChangedListenerList) || cVar == null) {
        } else {
            this.mPropValueChangedListenerList.remove(cVar);
        }
    }

    public void registerSkuIdChangedListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("516df82c", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            if (this.mSkuIdChangedListenerList == null) {
                this.mSkuIdChangedListenerList = new ArrayList();
            }
            if (this.mSkuIdChangedListenerList.contains(eVar)) {
                return;
            }
            this.mSkuIdChangedListenerList.add(eVar);
        }
    }

    public void unRegisterSkuIdChangedListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a9e7913", new Object[]{this, eVar});
        } else if (ewu.a(this.mSkuIdChangedListenerList) || eVar == null) {
        } else {
            this.mSkuIdChangedListenerList.remove(eVar);
        }
    }

    public void registerServiceIdChangedListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910288e5", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            if (this.mServiceIdChangedListenerList == null) {
                this.mServiceIdChangedListenerList = new ArrayList();
            }
            if (this.mServiceIdChangedListenerList.contains(dVar)) {
                return;
            }
            this.mServiceIdChangedListenerList.add(dVar);
        }
    }

    public void unRegisterServiceIdChangedListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaaa3e4c", new Object[]{this, dVar});
        } else if (ewu.a(this.mServiceIdChangedListenerList) || dVar == null) {
        } else {
            this.mServiceIdChangedListenerList.remove(dVar);
        }
    }

    public void registerBuyNumChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28b61e", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (this.mBuyNumChangedListenerList == null) {
                this.mBuyNumChangedListenerList = new ArrayList();
            }
            if (this.mBuyNumChangedListenerList.contains(aVar)) {
                return;
            }
            this.mBuyNumChangedListenerList.add(aVar);
        }
    }

    public void unRegisterBuyNumChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17085217", new Object[]{this, aVar});
        } else if (ewu.a(this.mBuyNumChangedListenerList) || aVar == null) {
        } else {
            this.mBuyNumChangedListenerList.remove(aVar);
        }
    }

    public void registerExtComponentChangedListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781780f9", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            if (this.mExtComponentChangedListenerList == null) {
                this.mExtComponentChangedListenerList = new ArrayList();
            }
            if (this.mExtComponentChangedListenerList.contains(bVar)) {
                return;
            }
            this.mExtComponentChangedListenerList.add(bVar);
        }
    }

    public void unRegisterExtComponentChangedListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb867e32", new Object[]{this, bVar});
        } else if (ewu.a(this.mExtComponentChangedListenerList) || bVar == null) {
        } else {
            this.mExtComponentChangedListenerList.remove(bVar);
        }
    }

    public boolean isChildrecBundleItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c906fd9e", new Object[]{this})).booleanValue() : this.childrecBundleItem;
    }

    public void setChildrecBundleItem(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17ba1a42", new Object[]{this, new Boolean(z)});
        } else {
            this.childrecBundleItem = z;
        }
    }

    /* loaded from: classes8.dex */
    public static class SkuChoiceVO implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ArrayList<String> checkedPropValueIdList;
        public String checkedPropValueNames;
        public String checkedServiceNames;
        public String currentAreaFullName;
        public String currentAreaName;
        public boolean isAllComplete;
        public ArrayList<String> uncheckedPropNameList;

        static {
            kge.a(692332077);
            kge.a(1028243835);
        }

        public String getSkuInfoDesc() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("38369f53", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.currentAreaName)) {
                sb.append("配送至:");
                sb.append(this.currentAreaName);
            }
            if (!this.isAllComplete && !ewu.a(this.uncheckedPropNameList)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(DetailModel.TOSHOSE);
                sb.append(ewv.a(this.uncheckedPropNameList, ","));
            } else {
                String str = this.checkedPropValueNames;
                String str2 = this.checkedServiceNames;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append("已选:");
                    if (!TextUtils.isEmpty(str)) {
                        sb.append(str);
                        sb.append(",");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(str2);
                        sb.append(",");
                    }
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            return sb.toString();
        }
    }

    public void setSkuId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cabc9e7", new Object[]{this, str});
            return;
        }
        this.mSkuId = str;
        notifySkuIdChanged();
        notifyBuyNumChanged();
    }
}
