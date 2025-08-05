package com.alibaba.ut.abtest.internal.bucketing.model;

import android.net.Uri;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.ut.abtest.bucketing.expression.Expression;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.djy;
import tb.kge;

/* loaded from: classes3.dex */
public class ExperimentGroup implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 6233534186241353504L;
    @JSONField(name = "beginTime")
    private long beginTime;
    @JSONField(name = ExperimentDO.COLUMN_COGNATION)
    private ExperimentCognation cognation;
    @JSONField(name = "endTime")
    private long endTime;
    @JSONField(name = "experimentId")
    private long experimentId;
    @JSONField(name = "featureCondition")
    private String featureCondition;
    @JSONField(serialize = false)
    private Expression featureConditionExpression;
    @JSONField(name = "greyEndTime")
    private long greyEndTime;
    @JSONField(name = "greyPhase")
    private int[] greyPhase;
    @JSONField(name = "greyRoutingFactor")
    private String greyRoutingFactor;
    @JSONField(name = "id")
    private long id;
    @JSONField(serialize = false)
    private Set<Uri> ignoreUris;
    @JSONField(name = "ignoreUrls")
    private Set<String> ignoreUrls;
    @JSONField(name = "key")
    private String key;
    @JSONField(name = "ratioRange")
    private int[][] ratioRange;
    @JSONField(name = "releaseId")
    private long releaseId;
    @JSONField(name = ExperimentDO.COLUMN_TRACKS)
    private List<ExperimentTrack> tracks;
    @JSONField(name = "type")
    private ExperimentType type;
    @JSONField(serialize = false)
    private Uri uri;
    @JSONField(name = djy.SERIALIZE_EXP_VARIATIONS)
    private Map<String, String> variations;

    static {
        kge.a(-252071200);
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

    public long getReleaseId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6756fb47", new Object[]{this})).longValue() : this.releaseId;
    }

    public void setReleaseId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7f4ddd", new Object[]{this, new Long(j)});
        } else {
            this.releaseId = j;
        }
    }

    public long getExperimentId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce6309e9", new Object[]{this})).longValue() : this.experimentId;
    }

    public void setExperimentId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d994b7e3", new Object[]{this, new Long(j)});
        } else {
            this.experimentId = j;
        }
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : this.key;
    }

    public void setKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06c2d6e", new Object[]{this, str});
        } else {
            this.key = str;
        }
    }

    public Uri getUri() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("d7589ef4", new Object[]{this}) : this.uri;
    }

    public void setUri(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc764036", new Object[]{this, uri});
        } else {
            this.uri = uri;
        }
    }

    public ExperimentType getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExperimentType) ipChange.ipc$dispatch("1ff780f", new Object[]{this}) : this.type;
    }

    public void setType(ExperimentType experimentType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ce7305", new Object[]{this, experimentType});
        } else {
            this.type = experimentType;
        }
    }

    public long getBeginTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6c1f88db", new Object[]{this})).longValue() : this.beginTime;
    }

    public void setBeginTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc872c9", new Object[]{this, new Long(j)});
        } else {
            this.beginTime = j;
        }
    }

    public long getEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("250d18d", new Object[]{this})).longValue() : this.endTime;
    }

    public void setEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e12d357", new Object[]{this, new Long(j)});
        } else {
            this.endTime = j;
        }
    }

    public List<ExperimentTrack> getTracks() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("26216a2", new Object[]{this}) : this.tracks;
    }

    public void setTracks(List<ExperimentTrack> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14598a02", new Object[]{this, list});
        } else {
            this.tracks = list;
        }
    }

    public Expression getFeatureConditionExpression() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Expression) ipChange.ipc$dispatch("822ac6c0", new Object[]{this}) : this.featureConditionExpression;
    }

    public void setFeatureConditionExpression(Expression expression) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec8e510", new Object[]{this, expression});
        } else {
            this.featureConditionExpression = expression;
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

    public int[] getGreyPhase() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("cfcf21d7", new Object[]{this}) : this.greyPhase;
    }

    public void setGreyPhase(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("610225ef", new Object[]{this, iArr});
        } else {
            this.greyPhase = iArr;
        }
    }

    public long getGreyEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8fa482e", new Object[]{this})).longValue() : this.greyEndTime;
    }

    public void setGreyEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4bcad6", new Object[]{this, new Long(j)});
        } else {
            this.greyEndTime = j;
        }
    }

    public String getGreyRoutingFactor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("807a0299", new Object[]{this}) : this.greyRoutingFactor;
    }

    public void setGreyRoutingFactor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c455865", new Object[]{this, str});
        } else {
            this.greyRoutingFactor = str;
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

    public ExperimentCognation getCognation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExperimentCognation) ipChange.ipc$dispatch("30a19f4f", new Object[]{this}) : this.cognation;
    }

    public void setCognation(ExperimentCognation experimentCognation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58ae333", new Object[]{this, experimentCognation});
        } else {
            this.cognation = experimentCognation;
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
