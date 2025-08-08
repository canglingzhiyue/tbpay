package com.alibaba.evo.internal.bucketing.model;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.ut.abtest.bucketing.expression.Expression;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognation;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentTrack;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentType;
import com.alibaba.ut.abtest.internal.util.g;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.track.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public class ExperimentV5 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ExperimentV5";
    private static final long serialVersionUID = 2454530787196853704L;
    private long beginTime;
    private volatile ExperimentCognation cognation;
    private String condition;
    private volatile Expression conditionExpression;
    private long endTime;
    private int expIndexType;
    private int expPublishType;
    @JSONField(serialize = false)
    private ExperimentDO experimentDO;
    private volatile List<ExperimentGroupV5> groups;
    private long id;
    private String key;
    @JSONField(serialize = false)
    public long layerId;
    private int priorityLevel;
    private long releaseId;
    private boolean retain;
    private volatile List<ExperimentTrack> tracks;
    private ExperimentType type;
    private Uri uri;
    private volatile Map<String, ExperimentVariationConfigV5> variationConfigs;
    public volatile Map<String, String> variations;

    static {
        kge.a(1595346169);
        kge.a(1028243835);
    }

    public ExperimentV5() {
    }

    public ExperimentV5(ExperimentDO experimentDO) {
        this.experimentDO = experimentDO;
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

    public int getPriorityLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3bd88404", new Object[]{this})).intValue() : this.priorityLevel;
    }

    public void setPriorityLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d663f31e", new Object[]{this, new Integer(i)});
        } else {
            this.priorityLevel = i;
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
        ExperimentDO experimentDO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("26216a2", new Object[]{this});
        }
        if (this.tracks == null && (experimentDO = this.experimentDO) != null && !StringUtils.isEmpty(experimentDO.getTracks())) {
            synchronized (this) {
                List<ExperimentTrack> list = (List) g.a(this.experimentDO.getTracks(), new TypeReference<List<ExperimentTrack>>() { // from class: com.alibaba.evo.internal.bucketing.model.ExperimentV5.1
                }.getType());
                if (list != null && !list.isEmpty()) {
                    setTracks(list);
                }
            }
        }
        return this.tracks;
    }

    public void setTracks(List<ExperimentTrack> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14598a02", new Object[]{this, list});
        } else {
            this.tracks = list;
        }
    }

    public Expression getConditionExpression() {
        ExperimentDO experimentDO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Expression) ipChange.ipc$dispatch("4ddc1ea", new Object[]{this});
        }
        if (this.conditionExpression == null && (experimentDO = this.experimentDO) != null && !StringUtils.isEmpty(experimentDO.getCondition())) {
            synchronized (this) {
                setConditionExpression((Expression) g.a(this.experimentDO.getCondition(), (Class<Object>) Expression.class));
            }
        }
        return this.conditionExpression;
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
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f8db1b4", new Object[]{this});
        }
        if (this.condition == null && this.experimentDO != null) {
            synchronized (this) {
                setCondition(this.experimentDO.getCondition());
            }
        }
        return this.condition;
    }

    public void setCondition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46640aa", new Object[]{this, str});
        } else {
            this.condition = str;
        }
    }

    public void setCognation(ExperimentCognation experimentCognation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58ae333", new Object[]{this, experimentCognation});
            return;
        }
        this.cognation = experimentCognation;
        this.layerId = 0L;
    }

    public ExperimentCognation getCognation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentCognation) ipChange.ipc$dispatch("30a19f4f", new Object[]{this});
        }
        if (this.cognation == null && this.experimentDO != null) {
            synchronized (this) {
                ExperimentCognation experimentCognation = (ExperimentCognation) g.a(this.experimentDO.getCognation(), (Class<Object>) ExperimentCognation.class);
                if (experimentCognation == null) {
                    h.e(TAG, "实验数据读取错误，丢失关键信息。实验ID=" + this.experimentDO.getId());
                    return null;
                }
                setCognation(experimentCognation);
            }
        }
        return this.cognation;
    }

    public void setVariations(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abae61c", new Object[]{this, map});
        } else {
            this.variations = map;
        }
    }

    public Map<String, String> getVariations() {
        ExperimentDO experimentDO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6a5875b2", new Object[]{this});
        }
        if (this.variations == null && (experimentDO = this.experimentDO) != null && !StringUtils.isEmpty(experimentDO.getVariations())) {
            synchronized (this) {
                setVariations((Map) g.a(this.experimentDO.getVariations(), new TypeReference<Map<String, String>>() { // from class: com.alibaba.evo.internal.bucketing.model.ExperimentV5.2
                }.getType()));
            }
        }
        return this.variations;
    }

    public void setGroups(List<ExperimentGroupV5> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c7f8d4e", new Object[]{this, list});
        } else {
            this.groups = list;
        }
    }

    public List<ExperimentGroupV5> getGroups() {
        ExperimentDO experimentDO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f0879d6", new Object[]{this});
        }
        if (this.groups == null && (experimentDO = this.experimentDO) != null && !StringUtils.isEmpty(experimentDO.getGroups())) {
            synchronized (this) {
                List<ExperimentGroupV5> list = (List) g.a(this.experimentDO.getGroups(), new TypeReference<List<ExperimentGroupV5>>() { // from class: com.alibaba.evo.internal.bucketing.model.ExperimentV5.3
                }.getType());
                if (list != null && !list.isEmpty()) {
                    for (ExperimentGroupV5 experimentGroupV5 : list) {
                        if (!StringUtils.isEmpty(experimentGroupV5.getCondition())) {
                            experimentGroupV5.setConditionExpression((Expression) g.a(experimentGroupV5.getCondition(), (Class<Object>) Expression.class));
                            experimentGroupV5.setCondition(null);
                        }
                        if (experimentGroupV5.getIgnoreUrls() != null && !experimentGroupV5.getIgnoreUrls().isEmpty()) {
                            HashSet hashSet = new HashSet(experimentGroupV5.getIgnoreUrls().size());
                            for (String str : experimentGroupV5.getIgnoreUrls()) {
                                Uri b = f.b(str);
                                if (b != null) {
                                    hashSet.add(b);
                                }
                            }
                            if (!hashSet.isEmpty()) {
                                experimentGroupV5.setIgnoreUris(hashSet);
                                experimentGroupV5.setIgnoreUrls(null);
                            }
                        }
                    }
                }
                setGroups(list);
            }
        }
        return this.groups;
    }

    public Map<String, ExperimentVariationConfigV5> getVariationConfigs() {
        ExperimentDO experimentDO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ffc648d0", new Object[]{this});
        }
        if (this.variationConfigs == null && (experimentDO = this.experimentDO) != null && !StringUtils.isEmpty(experimentDO.getVariationConfigs())) {
            synchronized (this) {
                setVariationConfigs((Map) g.a(this.experimentDO.getVariationConfigs(), new TypeReference<Map<String, ExperimentVariationConfigV5>>() { // from class: com.alibaba.evo.internal.bucketing.model.ExperimentV5.4
                }.getType()));
            }
        }
        return this.variationConfigs;
    }

    public void setVariationConfigs(Map<String, ExperimentVariationConfigV5> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a3cfbe", new Object[]{this, map});
        } else {
            this.variationConfigs = map;
        }
    }

    public boolean isRetain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fb467da", new Object[]{this})).booleanValue() : this.retain;
    }

    public void setRetain(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b206386", new Object[]{this, new Boolean(z)});
        } else {
            this.retain = z;
        }
    }

    public int getExpIndexType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cdd4a5ff", new Object[]{this})).intValue() : this.expIndexType;
    }

    public void setExpIndexType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8569aeb", new Object[]{this, new Integer(i)});
        } else {
            this.expIndexType = i;
        }
    }

    public int getExpPublishType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e274dafc", new Object[]{this})).intValue() : this.expPublishType;
    }

    public void setExpPublishType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6bb88e", new Object[]{this, new Integer(i)});
        } else {
            this.expPublishType = i;
        }
    }

    @JSONField(serialize = false)
    public long getLayerId() {
        ExperimentCognation cognation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b039391", new Object[]{this})).longValue();
        }
        if (this.layerId <= 0 && (cognation = getCognation()) != null) {
            this.layerId = cognation.getDeepestLayerId();
        }
        return this.layerId;
    }

    @JSONField(serialize = false)
    public List<Long> getAllLayerIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a4b65e6e", new Object[]{this});
        }
        ExperimentCognation cognation = getCognation();
        if (cognation == null) {
            return null;
        }
        return cognation.getAllLayerIds();
    }

    @JSONField(serialize = false)
    public boolean isColdWork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b0e3c6a", new Object[]{this})).booleanValue();
        }
        int i = this.priorityLevel;
        return i == 50 || i == 150;
    }

    @JSONField(serialize = false)
    public boolean isHighPriorityWork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c20faec", new Object[]{this})).booleanValue();
        }
        int i = this.priorityLevel;
        return i == 100 || i == 150;
    }

    @JSONField(serialize = false)
    public Set<String> getSwitchSet() {
        List<ExperimentGroupV5> groups;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3e37e40e", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        Map<String, ExperimentVariationConfigV5> variationConfigs = getVariationConfigs();
        if (cex.a().j().A() && variationConfigs != null) {
            List<ExperimentGroupV5> groups2 = getGroups();
            if (groups2 == null) {
                return hashSet;
            }
            for (ExperimentGroupV5 experimentGroupV5 : groups2) {
                if (experimentGroupV5.getVariations() != null) {
                    for (String str : experimentGroupV5.getVariations().keySet()) {
                        ExperimentVariationConfigV5 experimentVariationConfigV5 = variationConfigs.get(str);
                        if (experimentVariationConfigV5 != null && experimentVariationConfigV5.isSwitch()) {
                            hashSet.add(str);
                        }
                    }
                }
            }
        }
        if (!isBuildSwitchIndex() || (groups = getGroups()) == null) {
            return hashSet;
        }
        for (ExperimentGroupV5 experimentGroupV52 : groups) {
            if (experimentGroupV52.getVariations() != null) {
                hashSet.addAll(experimentGroupV52.getVariations().keySet());
            }
        }
        return hashSet;
    }

    public boolean isBuildSwitchIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da9fc785", new Object[]{this})).booleanValue() : (this.expIndexType & 1) == 1;
    }

    public ExperimentV5 copyBasicInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("12ffba66", new Object[]{this});
        }
        ExperimentV5 experimentV5 = new ExperimentV5();
        experimentV5.id = this.id;
        experimentV5.releaseId = this.releaseId;
        experimentV5.priorityLevel = this.priorityLevel;
        experimentV5.key = this.key;
        experimentV5.uri = this.uri;
        experimentV5.type = this.type;
        experimentV5.beginTime = this.beginTime;
        experimentV5.endTime = this.endTime;
        experimentV5.tracks = getTracks();
        experimentV5.condition = this.condition;
        experimentV5.conditionExpression = getConditionExpression();
        experimentV5.cognation = getCognation();
        if (this.variations != null && !this.variations.isEmpty()) {
            experimentV5.variations = new HashMap(this.variations);
        }
        experimentV5.retain = this.retain;
        experimentV5.variationConfigs = getVariationConfigs();
        return experimentV5;
    }
}
