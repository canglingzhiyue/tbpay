package com.alibaba.evo.internal.bucketing.model;

import android.net.Uri;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.ut.abtest.bucketing.expression.Expression;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import tb.djy;
import tb.kge;

/* loaded from: classes.dex */
public class ExperimentGroupV5 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -621499335281968246L;
    @JSONField(name = "condition")
    private String condition;
    @JSONField(serialize = false)
    private Expression conditionExpression;
    @JSONField(name = "id")
    private long id;
    @JSONField(serialize = false)
    private Set<Uri> ignoreUris;
    @JSONField(name = "ignoreUrls")
    private Set<String> ignoreUrls;
    @JSONField(name = "ratioRange")
    private int[][] ratioRange;
    @JSONField(name = djy.SERIALIZE_EXP_VARIATIONS)
    private Map<String, String> variations;

    static {
        kge.a(-280732892);
        kge.a(1028243835);
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

    public Expression getConditionExpression() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Expression) ipChange.ipc$dispatch("4ddc1ea", new Object[]{this}) : this.conditionExpression;
    }

    public void setConditionExpression(Expression expression) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be044be", new Object[]{this, expression});
        } else {
            this.conditionExpression = expression;
        }
    }

    public String getCondition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7f8db1b4", new Object[]{this}) : this.condition;
    }

    public void setCondition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46640aa", new Object[]{this, str});
        } else {
            this.condition = str;
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

    public Set<String> getIgnoreUrls() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("d0a7e702", new Object[]{this}) : this.ignoreUrls;
    }

    public void setIgnoreUrls(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87a7480", new Object[]{this, set});
        } else {
            this.ignoreUrls = set;
        }
    }

    public Set<Uri> getIgnoreUris() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("19c263e5", new Object[]{this}) : this.ignoreUris;
    }

    public void setIgnoreUris(Set<Uri> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82af93fd", new Object[]{this, set});
        } else {
            this.ignoreUris = set;
        }
    }
}
