package com.alibaba.ut.abtest.internal.bucketing.model;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.alibaba.ut.abtest.internal.bucketing.ExperimentRoutingType;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.djy;
import tb.kge;

/* loaded from: classes.dex */
public class ExperimentCognation implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -9063276129655812466L;
    @JSONField(name = "bucketNum")
    public int bucketNum = 1000000;
    @JSONField(name = "child")
    private ExperimentCognation child;
    @JSONField(name = "code")
    private String code;
    @JSONField(name = "featureCondition")
    private String featureCondition;
    @JSONField(name = "id")
    private long id;
    @JSONField(name = c.MSG_SOURCE_PARENT)
    private ExperimentCognation parent;
    @JSONField(name = "ratioRange")
    private int[][] ratioRange;
    @JSONField(name = "routingAlg")
    public String routingAlg;
    @JSONField(name = "routingFactor")
    private String routingFactor;
    @JSONField(name = "routingType")
    private ExperimentRoutingType routingType;
    @JSONField(name = "type")
    private ExperimentCognationType type;
    @JSONField(name = djy.SERIALIZE_EXP_VARIATIONS)
    public Map<String, String> variations;

    static {
        kge.a(1756310627);
        kge.a(1028243835);
    }

    public ExperimentCognation copy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentCognation) ipChange.ipc$dispatch("96b1b186", new Object[]{this});
        }
        ExperimentCognation experimentCognation = new ExperimentCognation();
        experimentCognation.id = this.id;
        experimentCognation.code = this.code;
        experimentCognation.type = this.type;
        experimentCognation.routingType = this.routingType;
        experimentCognation.routingFactor = this.routingFactor;
        experimentCognation.ratioRange = this.ratioRange;
        experimentCognation.variations = this.variations;
        ExperimentCognation experimentCognation2 = this.child;
        if (experimentCognation2 != null) {
            experimentCognation.child = experimentCognation2.copy();
        }
        experimentCognation.bucketNum = this.bucketNum;
        experimentCognation.routingAlg = this.routingAlg;
        return experimentCognation;
    }

    public long getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ddaaf0c", new Object[]{this})).longValue() : this.id;
    }

    public void setId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ecf820", new Object[]{this, new Long(j)});
        } else {
            this.id = j;
        }
    }

    public String getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this}) : this.code;
    }

    public void setCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f1cac0", new Object[]{this, str});
        } else {
            this.code = str;
        }
    }

    public ExperimentCognationType getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExperimentCognationType) ipChange.ipc$dispatch("edcda8d1", new Object[]{this}) : this.type;
    }

    public void setType(ExperimentCognationType experimentCognationType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95e0695", new Object[]{this, experimentCognationType});
        } else {
            this.type = experimentCognationType;
        }
    }

    public String getFeatureCondition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6d60839e", new Object[]{this}) : this.featureCondition;
    }

    public void setFeatureCondition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af27e98", new Object[]{this, str});
        } else {
            this.featureCondition = str;
        }
    }

    public ExperimentRoutingType getRoutingType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExperimentRoutingType) ipChange.ipc$dispatch("96c6caad", new Object[]{this}) : this.routingType;
    }

    public void setRoutingType(ExperimentRoutingType experimentRoutingType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc5200d", new Object[]{this, experimentRoutingType});
        } else {
            this.routingType = experimentRoutingType;
        }
    }

    public String getRoutingFactor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a06d5e5a", new Object[]{this}) : this.routingFactor;
    }

    public void setRoutingFactor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1de4ec4", new Object[]{this, str});
        } else {
            this.routingFactor = str;
        }
    }

    public int[][] getRatioRange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[][]) ipChange.ipc$dispatch("9ae60ec2", new Object[]{this}) : this.ratioRange;
    }

    public void setRatioRange(int[][] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0322608", new Object[]{this, iArr});
        } else {
            this.ratioRange = iArr;
        }
    }

    public Map<String, String> getVariations() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6a5875b2", new Object[]{this}) : this.variations;
    }

    public void setVariations(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abae61c", new Object[]{this, map});
        } else {
            this.variations = map;
        }
    }

    public ExperimentCognation getParent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExperimentCognation) ipChange.ipc$dispatch("3be716fb", new Object[]{this}) : this.parent;
    }

    public void setParent(ExperimentCognation experimentCognation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28abfc9f", new Object[]{this, experimentCognation});
        } else {
            this.parent = experimentCognation;
        }
    }

    public ExperimentCognation getChild() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExperimentCognation) ipChange.ipc$dispatch("96bcac75", new Object[]{this}) : this.child;
    }

    public void setChild(ExperimentCognation experimentCognation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41d4cd", new Object[]{this, experimentCognation});
        } else {
            this.child = experimentCognation;
        }
    }

    public int getBucketNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bbc6ec00", new Object[]{this})).intValue() : this.bucketNum;
    }

    public void setBucketNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d70a2", new Object[]{this, new Integer(i)});
        } else {
            this.bucketNum = i;
        }
    }

    public String getRoutingAlg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8ee71f8d", new Object[]{this}) : this.routingAlg;
    }

    public void setRoutingAlg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e65989", new Object[]{this, str});
        } else {
            this.routingAlg = str;
        }
    }

    public boolean hasDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15328013", new Object[]{this, str})).booleanValue();
        }
        if ((this.type == ExperimentCognationType.Domain || this.type == ExperimentCognationType.RootDomain) && TextUtils.equals(str, getCode())) {
            return true;
        }
        for (ExperimentCognation child = getChild(); child != null; child = child.getChild()) {
            if ((child.getType() == ExperimentCognationType.Domain || child.getType() == ExperimentCognationType.RootDomain) && TextUtils.equals(str, child.getCode())) {
                return true;
            }
        }
        return false;
    }

    @JSONField(serialize = false)
    public long getDeepestLayerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a05aad43", new Object[]{this})).longValue();
        }
        long j = 0;
        if (this.type == ExperimentCognationType.Layer) {
            j = this.id;
        }
        for (ExperimentCognation child = getChild(); child != null; child = child.getChild()) {
            if (child.getType() == ExperimentCognationType.Layer) {
                j = child.getId();
            }
        }
        return j;
    }

    @JSONField(serialize = false)
    public List<Long> getAllLayerIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a4b65e6e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (this.type == ExperimentCognationType.Layer) {
            arrayList.add(Long.valueOf(this.id));
        }
        for (ExperimentCognation child = getChild(); child != null; child = child.getChild()) {
            if (child.getType() == ExperimentCognationType.Layer) {
                arrayList.add(Long.valueOf(child.getId()));
            }
        }
        return arrayList;
    }
}
