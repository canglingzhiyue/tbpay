package com.alibaba.ut.abtest.internal.bucketing;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.EVOExperiment;
import com.alibaba.evo.EVOExperimentCondition;
import com.alibaba.evo.EVOExperimentConditions;
import com.alibaba.evo.internal.bucketing.model.ExperimentDomainV5PO;
import com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentLayerV5PO;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentVariationConfigV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentVariationConfigV5PO;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.bucketing.expression.Expression;
import com.alibaba.ut.abtest.bucketing.expression.ExpressionCriterion;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentBetaDevice;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognation;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognationType;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentGroup;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentTrack;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentTrackPO;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentType;
import com.alibaba.ut.abtest.internal.track.ExperimentServerTrackPO;
import com.alibaba.ut.abtest.internal.util.g;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.o;
import com.alibaba.ut.abtest.track.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1293667362);
    }

    public static List<ExperimentGroup> a(List<ExperimentServerTrackPO> list, String str) {
        List list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d8d1c104", new Object[]{list, str});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ExperimentServerTrackPO experimentServerTrackPO : list) {
            if (experimentServerTrackPO == null || experimentServerTrackPO.releaseId <= 0 || experimentServerTrackPO.bucketId <= 0 || StringUtils.isEmpty(experimentServerTrackPO.component) || StringUtils.isEmpty(experimentServerTrackPO.module)) {
                h.c("ExperimentBuilder", "服务端实验埋点规则内容不合法！埋点规则=" + str);
            } else {
                ExperimentGroup experimentGroup = new ExperimentGroup();
                experimentGroup.setId(experimentServerTrackPO.bucketId);
                experimentGroup.setReleaseId(experimentServerTrackPO.releaseId);
                experimentGroup.setExperimentId(experimentServerTrackPO.experimentId);
                if (StringUtils.equals("expt", experimentServerTrackPO.type)) {
                    if (StringUtils.equals(experimentServerTrackPO.component, UTABTest.COMPONENT_URI)) {
                        experimentGroup.setType(ExperimentType.AbUri);
                    } else {
                        experimentGroup.setType(ExperimentType.AbComponent);
                    }
                } else if (StringUtils.equals("dy", experimentServerTrackPO.type)) {
                    experimentGroup.setType(ExperimentType.Redirect);
                } else {
                    experimentGroup.setType(ExperimentType.AbComponent);
                }
                if (experimentGroup.getType() == ExperimentType.Redirect || experimentGroup.getType() == ExperimentType.AbUri) {
                    Uri b = f.b(experimentServerTrackPO.module);
                    if (b == null) {
                        h.c("ExperimentBuilder", "服务端实验埋点规则内容不合法，URI无法解析！URI=" + experimentServerTrackPO.module);
                    } else {
                        experimentGroup.setUri(b);
                        experimentGroup.setKey(experimentServerTrackPO.module);
                    }
                } else {
                    experimentGroup.setKey(com.alibaba.ut.abtest.internal.util.a.a(experimentServerTrackPO.component, experimentServerTrackPO.module));
                }
                if (!StringUtils.isEmpty(experimentServerTrackPO.trackConfigs) && (list2 = (List) g.a(experimentServerTrackPO.trackConfigs, new TypeReference<List<ExperimentTrackPO>>() { // from class: com.alibaba.ut.abtest.internal.bucketing.a.1
                }.getType())) != null && !list2.isEmpty()) {
                    experimentGroup.setTracks(a(list2, (ExperimentGroup) null));
                }
                arrayList.add(experimentGroup);
            }
        }
        return arrayList;
    }

    public static List<ExperimentTrack> a(List<ExperimentTrackPO> list, ExperimentGroup experimentGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4e3d6c1f", new Object[]{list, experimentGroup});
        }
        ArrayList arrayList = new ArrayList();
        for (ExperimentTrackPO experimentTrackPO : list) {
            arrayList.add(a(experimentTrackPO));
        }
        return arrayList;
    }

    public static ExperimentTrack a(ExperimentTrackPO experimentTrackPO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentTrack) ipChange.ipc$dispatch("7812f50d", new Object[]{experimentTrackPO});
        }
        ExperimentTrack experimentTrack = new ExperimentTrack();
        experimentTrack.setPageNames(experimentTrackPO.pageNames);
        experimentTrack.setAppScope(experimentTrackPO.appScope);
        return experimentTrack;
    }

    public static EVOExperiment a(ExperimentV5 experimentV5) {
        EVOExperimentConditions eVOExperimentConditions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EVOExperiment) ipChange.ipc$dispatch("4ea039e8", new Object[]{experimentV5});
        }
        Expression conditionExpression = experimentV5.getConditionExpression();
        String str = null;
        if (conditionExpression == null || conditionExpression.criterions == null) {
            eVOExperimentConditions = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (ExpressionCriterion expressionCriterion : conditionExpression.criterions) {
                arrayList.add(new EVOExperimentCondition(expressionCriterion.name, expressionCriterion.value, expressionCriterion.operator));
            }
            eVOExperimentConditions = new EVOExperimentConditions(arrayList);
        }
        String[] a2 = com.alibaba.ut.abtest.internal.util.a.a(experimentV5.getKey());
        String str2 = a2 != null ? a2[0] : null;
        if (a2 != null) {
            str = a2[1];
        }
        return new EVOExperiment(experimentV5.getId(), experimentV5.getReleaseId(), str2, str, eVOExperimentConditions);
    }

    public static com.alibaba.evo.internal.bucketing.model.a a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.evo.internal.bucketing.model.a) ipChange.ipc$dispatch("be347105", new Object[]{str, str2});
        }
        try {
            return a(new JSONReader(new InputStreamReader(new FileInputStream(str), "UTF-8")), str2);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("ExperimentBuilder.createExperimentResponseDataV5", th);
            return null;
        }
    }

    public static com.alibaba.evo.internal.bucketing.model.a a(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.evo.internal.bucketing.model.a) ipChange.ipc$dispatch("53abe728", new Object[]{bArr, str}) : a(new JSONReader(new InputStreamReader(new ByteArrayInputStream(bArr))), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0123, code lost:
        if (r10 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0125, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0134, code lost:
        if (r10 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0137, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.alibaba.evo.internal.bucketing.model.a a(com.alibaba.fastjson.JSONReader r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.internal.bucketing.a.a(com.alibaba.fastjson.JSONReader, java.lang.String):com.alibaba.evo.internal.bucketing.model.a");
    }

    public static List<ExperimentV5> a(ExperimentDomainV5PO experimentDomainV5PO, ExperimentCognation experimentCognation, String str) {
        List<ExperimentV5> a2;
        List<ExperimentV5> a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2bb343f4", new Object[]{experimentDomainV5PO, experimentCognation, str});
        }
        ArrayList arrayList = new ArrayList();
        if (experimentDomainV5PO.launchLayers != null && (a3 = a(experimentDomainV5PO, experimentDomainV5PO.launchLayers, ExperimentCognationType.LaunchLayer, experimentCognation, str)) != null) {
            arrayList.addAll(a3);
        }
        if (experimentDomainV5PO.normalLayers != null && (a2 = a(experimentDomainV5PO, experimentDomainV5PO.normalLayers, ExperimentCognationType.Layer, experimentCognation, str)) != null) {
            arrayList.addAll(a2);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0185, code lost:
        if (r9 != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.alibaba.evo.internal.bucketing.model.ExperimentV5> a(com.alibaba.evo.internal.bucketing.model.ExperimentDomainV5PO r22, java.util.List<com.alibaba.evo.internal.bucketing.model.ExperimentLayerV5PO> r23, com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognationType r24, com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognation r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.internal.bucketing.a.a(com.alibaba.evo.internal.bucketing.model.ExperimentDomainV5PO, java.util.List, com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognationType, com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognation, java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5 a(com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5PO r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ut.abtest.internal.bucketing.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r9
            java.lang.String r9 = "a554c38d"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5 r9 = (com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5) r9
            return r9
        L15:
            java.lang.String r0 = r9.condition
            boolean r0 = android.text.StringUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto L4b
            java.lang.String r0 = r9.condition     // Catch: java.lang.Throwable -> L45
            java.lang.Class<com.alibaba.ut.abtest.bucketing.expression.Expression> r2 = com.alibaba.ut.abtest.bucketing.expression.Expression.class
            java.lang.Object r0 = com.alibaba.ut.abtest.internal.util.g.a(r0, r2)     // Catch: java.lang.Throwable -> L45
            com.alibaba.ut.abtest.bucketing.expression.Expression r0 = (com.alibaba.ut.abtest.bucketing.expression.Expression) r0     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L43
            tb.cex r2 = tb.cex.a()     // Catch: java.lang.Throwable -> L3e
            com.alibaba.ut.abtest.bucketing.expression.e r2 = r2.h()     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            long r6 = r9.id     // Catch: java.lang.Throwable -> L3e
            r3 = r0
            boolean r2 = r2.a(r3, r4, r6)     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L43
            return r1
        L3e:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
            goto L46
        L43:
            r1 = r0
            goto L4b
        L45:
            r0 = move-exception
        L46:
            java.lang.String r2 = "ExperimentBuilder.experimentGroupV5PO2ExperimentV5"
            com.alibaba.ut.abtest.internal.util.b.a(r2, r0)
        L4b:
            com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5 r0 = new com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5
            r0.<init>()
            long r2 = r9.id
            r0.setId(r2)
            int[][] r2 = r9.ratioRange
            r0.setRatioRange(r2)
            java.util.Map<java.lang.String, java.lang.String> r2 = r9.variations
            if (r2 == 0) goto L68
            java.util.HashMap r2 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.String> r3 = r9.variations
            r2.<init>(r3)
            r0.setVariations(r2)
        L68:
            java.lang.String r2 = r9.condition
            r0.setCondition(r2)
            r0.setConditionExpression(r1)
            java.util.Set<java.lang.String> r1 = r9.ignoreUrls
            r0.setIgnoreUrls(r1)
            java.util.Set<java.lang.String> r1 = r9.ignoreUrls
            if (r1 == 0) goto Lb1
            java.util.Set<java.lang.String> r1 = r9.ignoreUrls
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lb1
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Set<java.lang.String> r2 = r9.ignoreUrls
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.Set<java.lang.String> r9 = r9.ignoreUrls
            java.util.Iterator r9 = r9.iterator()
        L92:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto La8
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri r2 = com.alibaba.ut.abtest.track.f.b(r2)
            if (r2 == 0) goto L92
            r1.add(r2)
            goto L92
        La8:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto Lb1
            r0.setIgnoreUris(r1)
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.internal.bucketing.a.a(com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5PO):com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5");
    }

    private static ExperimentVariationConfigV5 a(ExperimentVariationConfigV5PO experimentVariationConfigV5PO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentVariationConfigV5) ipChange.ipc$dispatch("28b20d", new Object[]{experimentVariationConfigV5PO});
        }
        if (experimentVariationConfigV5PO == null) {
            return null;
        }
        ExperimentVariationConfigV5 experimentVariationConfigV5 = new ExperimentVariationConfigV5();
        experimentVariationConfigV5.setScope(experimentVariationConfigV5PO.scope);
        return experimentVariationConfigV5;
    }

    public static ExperimentCognation a(ExperimentDomainV5PO experimentDomainV5PO, ExperimentCognation experimentCognation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentCognation) ipChange.ipc$dispatch("2ea23f79", new Object[]{experimentDomainV5PO, experimentCognation});
        }
        ExperimentCognation experimentCognation2 = new ExperimentCognation();
        experimentCognation2.setId(experimentDomainV5PO.id);
        experimentCognation2.setCode(experimentDomainV5PO.code);
        experimentCognation2.setRatioRange(experimentDomainV5PO.ratioRange);
        experimentCognation2.setVariations(experimentDomainV5PO.variations);
        if (experimentCognation == null) {
            experimentCognation2.setType(ExperimentCognationType.RootDomain);
            return experimentCognation2;
        }
        experimentCognation2.setType(ExperimentCognationType.Domain);
        if (experimentCognation.getChild() == null) {
            experimentCognation.setChild(experimentCognation2);
        } else {
            experimentCognation = experimentCognation.copy();
            ExperimentCognation child = experimentCognation.getChild();
            while (child.getChild() != null) {
                child = child.getChild();
            }
            child.setChild(experimentCognation2);
        }
        return experimentCognation;
    }

    public static ExperimentCognation a(ExperimentLayerV5PO experimentLayerV5PO, ExperimentCognation experimentCognation, ExperimentCognationType experimentCognationType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentCognation) ipChange.ipc$dispatch("e1dd2e82", new Object[]{experimentLayerV5PO, experimentCognation, experimentCognationType});
        }
        ExperimentCognation experimentCognation2 = new ExperimentCognation();
        if (experimentCognation.getChild() == null) {
            experimentCognation.setChild(experimentCognation2);
        } else {
            ExperimentCognation child = experimentCognation.getChild();
            while (child.getChild() != null) {
                child = child.getChild();
            }
            child.setChild(experimentCognation2);
        }
        experimentCognation2.setId(experimentLayerV5PO.id);
        experimentCognation2.setRoutingFactor(experimentLayerV5PO.routingFactor);
        experimentCognation2.setType(experimentCognationType);
        experimentCognation2.setBucketNum(experimentLayerV5PO.bucketNum);
        experimentCognation2.setRoutingAlg(experimentLayerV5PO.routingAlg);
        if (experimentLayerV5PO.routingType == 2) {
            experimentCognation2.setRoutingType(ExperimentRoutingType.UserId);
        } else if (experimentLayerV5PO.routingType == 1) {
            experimentCognation2.setRoutingType(ExperimentRoutingType.Utdid);
        } else {
            experimentCognation2.setRoutingType(ExperimentRoutingType.Utdid);
        }
        return experimentCognation2;
    }

    public static boolean a(List<ExperimentBetaDevice> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue();
        }
        String[] strArr = {o.a().b(), cex.a().s(), cex.a().r()};
        for (ExperimentBetaDevice experimentBetaDevice : list) {
            if (experimentBetaDevice.data != null && !experimentBetaDevice.data.isEmpty() && experimentBetaDevice.type == 1) {
                for (String str : strArr) {
                    if (!StringUtils.isEmpty(str) && experimentBetaDevice.data.contains(str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public static ExperimentV5 a(ExperimentGroup experimentGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("b5d2cacf", new Object[]{experimentGroup});
        }
        ExperimentV5 experimentV5 = new ExperimentV5();
        experimentV5.setId(experimentGroup.getExperimentId());
        experimentV5.setReleaseId(experimentGroup.getReleaseId());
        experimentV5.setKey(experimentGroup.getKey());
        experimentV5.setUri(experimentGroup.getUri());
        experimentV5.setType(experimentGroup.getType());
        experimentV5.setBeginTime(experimentGroup.getBeginTime());
        experimentV5.setEndTime(experimentGroup.getEndTime());
        experimentV5.setTracks(experimentGroup.getTracks());
        experimentV5.setCondition(experimentGroup.getFeatureCondition());
        experimentV5.setConditionExpression(experimentGroup.getFeatureConditionExpression());
        experimentV5.setCognation(experimentGroup.getCognation());
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(b(experimentGroup));
        experimentV5.setGroups(arrayList);
        return experimentV5;
    }

    public static ExperimentGroupV5 b(ExperimentGroup experimentGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentGroupV5) ipChange.ipc$dispatch("4349929", new Object[]{experimentGroup});
        }
        ExperimentGroupV5 experimentGroupV5 = new ExperimentGroupV5();
        experimentGroupV5.setId(experimentGroup.getId());
        experimentGroupV5.setCondition(experimentGroup.getFeatureCondition());
        experimentGroupV5.setConditionExpression(experimentGroup.getFeatureConditionExpression());
        experimentGroupV5.setRatioRange(experimentGroup.getRatioRange());
        experimentGroupV5.setVariations(experimentGroup.getVariations());
        experimentGroupV5.setIgnoreUrls(experimentGroup.getIgnoreUrls());
        experimentGroupV5.setIgnoreUris(experimentGroup.getIgnoreUris());
        return experimentGroupV5;
    }

    public static ExperimentDO a(ExperimentV5 experimentV5, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentDO) ipChange.ipc$dispatch("ab5c57a9", new Object[]{experimentV5, new Long(j), new Long(j2)});
        }
        ExperimentDO experimentDO = new ExperimentDO();
        experimentDO.setId(experimentV5.getId());
        experimentDO.setReleaseId(experimentV5.getReleaseId());
        experimentDO.setKey(experimentV5.getKey());
        if (experimentV5.getType() == null) {
            experimentDO.setType(ExperimentType.AbComponent.getValue());
        } else {
            experimentDO.setType(experimentV5.getType().getValue());
        }
        experimentDO.setBeginTime(experimentV5.getBeginTime());
        experimentDO.setEndTime(experimentV5.getEndTime());
        if (experimentV5.getTracks() != null) {
            experimentDO.setTracks(g.a((List) experimentV5.getTracks()));
        }
        experimentDO.setCondition(experimentV5.getCondition());
        if (experimentV5.getCognation() != null) {
            experimentDO.setCognation(g.a(experimentV5.getCognation()));
        }
        if (experimentV5.getGroups() != null) {
            experimentDO.setGroups(g.a((List) experimentV5.getGroups()));
        }
        if (experimentV5.getVariations() != null) {
            experimentDO.setVariations(g.a((Map<String, ?>) experimentV5.getVariations()));
        }
        if (experimentV5.getVariationConfigs() != null) {
            experimentDO.setVariationConfigs(g.a((Map<String, ?>) experimentV5.getVariationConfigs()));
        }
        experimentDO.setHitCount(j);
        experimentDO.setHitLatestTime(j2);
        experimentDO.setRetain(experimentV5.isRetain());
        experimentDO.setPriorityLevel(experimentV5.getPriorityLevel());
        experimentDO.setExpIndexType(experimentV5.getExpIndexType());
        experimentDO.setExpPublishType(experimentV5.getExpPublishType());
        return experimentDO;
    }

    public static ExperimentV5 a(ExperimentDO experimentDO) {
        List<ExperimentTrack> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("5372c053", new Object[]{experimentDO});
        }
        boolean H = cex.a().j().H();
        if (StringUtils.isEmpty(experimentDO.getCognation()) || StringUtils.isEmpty(experimentDO.getKey())) {
            h.e("ExperimentBuilder", "实验数据读取错误，丢失关键信息。实验ID=" + experimentDO.getId());
            return null;
        }
        ExperimentV5 experimentV5 = new ExperimentV5(experimentDO);
        if (!H) {
            ExperimentCognation experimentCognation = (ExperimentCognation) g.a(experimentDO.getCognation(), (Class<Object>) ExperimentCognation.class);
            if (experimentCognation == null) {
                h.e("ExperimentBuilder", "实验数据读取错误，丢失关键信息。实验ID=" + experimentDO.getId());
                return null;
            }
            experimentV5.setCognation(experimentCognation);
        }
        experimentV5.setId(experimentDO.getId());
        experimentV5.setReleaseId(experimentDO.getReleaseId());
        experimentV5.setKey(experimentDO.getKey());
        experimentV5.setType(ExperimentType.valueOf(experimentDO.getType()));
        experimentV5.setBeginTime(experimentDO.getBeginTime());
        experimentV5.setEndTime(experimentDO.getEndTime());
        experimentV5.setPriorityLevel(experimentDO.getPriorityLevel());
        experimentV5.setExpIndexType(experimentDO.getExpIndexType());
        experimentV5.setExpPublishType(experimentDO.getExpPublishType());
        if (!H && !StringUtils.isEmpty(experimentDO.getTracks()) && (list = (List) g.a(experimentDO.getTracks(), new TypeReference<List<ExperimentTrack>>() { // from class: com.alibaba.ut.abtest.internal.bucketing.a.3
        }.getType())) != null && !list.isEmpty()) {
            experimentV5.setTracks(list);
        }
        if (!H && !StringUtils.isEmpty(experimentDO.getCondition())) {
            experimentV5.setConditionExpression((Expression) g.a(experimentDO.getCondition(), (Class<Object>) Expression.class));
        }
        if (!H && !StringUtils.isEmpty(experimentDO.getVariations())) {
            experimentV5.setVariations((Map) g.a(experimentDO.getVariations(), new TypeReference<Map<String, String>>() { // from class: com.alibaba.ut.abtest.internal.bucketing.a.4
            }.getType()));
        }
        experimentV5.setRetain(experimentDO.isRetain());
        if (!H && !StringUtils.isEmpty(experimentDO.getGroups())) {
            List<ExperimentGroupV5> list2 = (List) g.a(experimentDO.getGroups(), new TypeReference<List<ExperimentGroupV5>>() { // from class: com.alibaba.ut.abtest.internal.bucketing.a.5
            }.getType());
            if (list2 != null && !list2.isEmpty()) {
                for (ExperimentGroupV5 experimentGroupV5 : list2) {
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
            experimentV5.setGroups(list2);
        }
        if (!H && !StringUtils.isEmpty(experimentDO.getVariationConfigs())) {
            experimentV5.setVariationConfigs((Map) g.a(experimentDO.getVariationConfigs(), new TypeReference<Map<String, ExperimentVariationConfigV5>>() { // from class: com.alibaba.ut.abtest.internal.bucketing.a.6
            }.getType()));
        }
        return experimentV5;
    }

    public static ExperimentCognation b(ExperimentDO experimentDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentCognation) ipChange.ipc$dispatch("8c39fcc6", new Object[]{experimentDO});
        }
        if (!StringUtils.isEmpty(experimentDO.getCognation())) {
            return (ExperimentCognation) g.a(experimentDO.getCognation(), (Class<Object>) ExperimentCognation.class);
        }
        return null;
    }
}
