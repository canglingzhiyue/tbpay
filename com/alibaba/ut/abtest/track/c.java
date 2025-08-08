package com.alibaba.ut.abtest.track;

import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.security.realidentity.g4;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentGroup;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentTrack;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.i;
import com.alibaba.ut.abtest.internal.util.m;
import com.alibaba.ut.abtest.internal.util.n;
import com.alibaba.ut.abtest.internal.util.o;
import com.alibaba.ut.abtest.internal.util.q;
import com.alibaba.ut.abtest.internal.util.s;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.j;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.net.URLDecoder;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.ceq;
import tb.cew;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public class c implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int[] m;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, ExperimentV5> f4219a = new ConcurrentHashMap<>();
    private final Map<String, com.alibaba.ut.abtest.internal.bucketing.model.b> b = new ConcurrentHashMap();
    private ConcurrentHashMap<String, Set<ExperimentTrack>> c = new ConcurrentHashMap<>();
    private final Object d = new Object();
    private i<String, Set<ExperimentTrack>> e = new i<>(80);
    private i<String, Set<ExperimentTrack>> f = new i<>(80);
    private i<String, Set<String>> g = new i<>(cex.a().j().n());
    private final Object h = new Object();
    private Set<ExperimentTrack> i = new HashSet();
    private final Object j = new Object();
    private final Set<String> k = new CopyOnWriteArraySet();
    private ConcurrentHashMap<String, Long> l = new ConcurrentHashMap<>();

    static {
        kge.a(424776603);
        kge.a(1791075035);
        m = new int[]{2001, 2101, 2201};
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    @Override // com.alibaba.ut.abtest.track.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.ut.abtest.internal.bucketing.model.a r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.track.c.a(com.alibaba.ut.abtest.internal.bucketing.model.a, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    @Override // com.alibaba.ut.abtest.track.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.alibaba.ut.abtest.internal.bucketing.model.a r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.track.c.b(com.alibaba.ut.abtest.internal.bucketing.model.a, java.lang.Object):void");
    }

    private void a(long j, List<ExperimentTrack> list, TrackId trackId, Object obj) {
        Iterator<ExperimentTrack> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7cb27db", new Object[]{this, new Long(j), list, trackId, obj});
            return;
        }
        Iterator<ExperimentTrack> it2 = list.iterator();
        while (it2.hasNext()) {
            ExperimentTrack next = it2.next();
            if (next != null) {
                if (next.isAppScope()) {
                    ExperimentTrack experimentTrack = new ExperimentTrack();
                    experimentTrack.setTrackId(trackId);
                    experimentTrack.setGroupId(j);
                    synchronized (this.j) {
                        this.i.add(experimentTrack);
                    }
                }
                if (next.getPageNames() == null || next.getPageNames().length == 0 || obj == null) {
                    return;
                }
                int[] iArr = m;
                int length = iArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = iArr[i];
                    String[] pageNames = next.getPageNames();
                    int length2 = pageNames.length;
                    int i3 = 0;
                    while (i3 < length2) {
                        String str = pageNames[i3];
                        if (i2 != 2001) {
                            Set<ExperimentTrack> a2 = this.f.a((i<String, Set<ExperimentTrack>>) a(i2, str, q.a(obj)));
                            if (a2 == null) {
                                a2 = Collections.synchronizedSet(new HashSet());
                                it = it2;
                                this.f.a(a(i2, str, q.a(obj)), a2);
                            } else {
                                it = it2;
                            }
                            ExperimentTrack experimentTrack2 = new ExperimentTrack();
                            experimentTrack2.setTrackId(trackId);
                            experimentTrack2.setGroupId(j);
                            a2.add(experimentTrack2);
                            i3++;
                            it2 = it;
                        }
                    }
                    i++;
                    it2 = it2;
                }
            }
        }
        Set<String> a3 = this.g.a((i<String, Set<String>>) obj.getClass().getName());
        if (a3 == null) {
            a3 = new HashSet<>();
            this.g.a(obj.getClass().getName(), a3);
        }
        synchronized (this.h) {
            a3.add(trackId.getAbTrackId());
        }
    }

    private String a(Set<String> set, Map<String, String> map) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2fba2d12", new Object[]{this, set, map});
        }
        if (map != null) {
            String str = map.get("evo");
            if (!StringUtils.isEmpty(str) && (split = str.split("\\.")) != null) {
                for (String str2 : split) {
                    if (!StringUtils.isEmpty(str2)) {
                        set.add(str2);
                    }
                }
            }
        }
        if (set.size() <= 0) {
            return null;
        }
        return s.a(set, ".");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!cex.a().j().e()) {
        } else {
            String b = b();
            if (StringUtils.isEmpty(b)) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("aliab", b);
            try {
                AppMonitor.setGlobalProperty("aliab", b);
            } catch (Throwable th) {
                h.c("TrackServiceImpl", "setGlobalProperty fail", th);
            }
        }
    }

    private void a(TrackId trackId, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad76560", new Object[]{this, trackId, obj});
            return;
        }
        String a2 = cex.a().k().a(trackId, 2001, UTAnalytics.getInstance().getDefaultTracker().getPageProperties(obj));
        UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(obj, a2);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(a2);
    }

    private void b(long j, List<ExperimentTrack> list, TrackId trackId, Object obj) {
        Iterator<ExperimentTrack> it;
        ExperimentTrack experimentTrack;
        Set<ExperimentTrack> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d899a65c", new Object[]{this, new Long(j), list, trackId, obj});
            return;
        }
        Iterator<ExperimentTrack> it2 = list.iterator();
        while (it2.hasNext()) {
            ExperimentTrack next = it2.next();
            if (next != null) {
                if (next.isAppScope()) {
                    ExperimentTrack experimentTrack2 = new ExperimentTrack();
                    experimentTrack2.setTrackId(trackId);
                    experimentTrack2.setGroupId(j);
                    synchronized (this.j) {
                        this.i.add(experimentTrack2);
                    }
                }
                if (next.getPageNames() == null || next.getPageNames().length == 0) {
                    return;
                }
                int[] iArr = m;
                int length = iArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = iArr[i];
                    String[] pageNames = next.getPageNames();
                    int length2 = pageNames.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            it = it2;
                            experimentTrack = next;
                            break;
                        }
                        String str = pageNames[i3];
                        if (obj == null) {
                            it = it2;
                            a2 = this.c.get(a(i2, str));
                            if (a2 == null) {
                                a2 = new HashSet<>();
                                experimentTrack = next;
                                this.c.put(a(i2, str), a2);
                            } else {
                                experimentTrack = next;
                            }
                        } else {
                            it = it2;
                            experimentTrack = next;
                            if (i2 == 2001) {
                                a(trackId, obj);
                                break;
                            }
                            a2 = this.e.a((i<String, Set<ExperimentTrack>>) a(i2, str, q.a(obj)));
                            if (a2 == null) {
                                a2 = new HashSet<>();
                                this.e.a(a(i2, str, q.a(obj)), a2);
                            }
                        }
                        ExperimentTrack experimentTrack3 = new ExperimentTrack();
                        experimentTrack3.setTrackId(trackId);
                        experimentTrack3.setGroupId(j);
                        synchronized (this.d) {
                            a2.add(experimentTrack3);
                        }
                        Set<String> a3 = this.g.a((i<String, Set<String>>) str);
                        if (a3 == null) {
                            a3 = new HashSet<>();
                            this.g.a(str, a3);
                        }
                        synchronized (this.h) {
                            a3.add(trackId.getAbTrackId());
                        }
                        i3++;
                        it2 = it;
                        next = experimentTrack;
                    }
                    i++;
                    it2 = it;
                    next = experimentTrack;
                }
                continue;
            }
        }
    }

    @Override // com.alibaba.ut.abtest.track.b
    public void a(com.alibaba.ut.abtest.internal.bucketing.model.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a3d5f7", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            h.a("TrackServiceImpl", "添加已激活的实验, experimentKey=" + bVar.a());
            String valueOf = String.valueOf(bVar.c());
            com.alibaba.ut.abtest.internal.bucketing.model.b bVar2 = this.b.get(valueOf);
            long d = bVar.d();
            if (bVar2 != null) {
                long d2 = bVar2.d();
                if (bVar2.b() != bVar.b() || d2 != d) {
                    h.a("TrackServiceImpl", "实验数据发生变化,删除旧数据. key=" + valueOf);
                    a(bVar2.e(), d2);
                } else {
                    h.a("TrackServiceImpl", "实验数据未发生变化, key=" + valueOf);
                    return;
                }
            }
            this.b.put(valueOf, bVar);
            List<ExperimentTrack> e = bVar.e();
            if (e == null || e.isEmpty()) {
                h.c("TrackServiceImpl", "实验未包含埋点规则信息, key=" + valueOf);
                return;
            }
            h.c("TrackServiceImpl", "实验包含埋点规则信息, key=" + valueOf + ",埋点规则数量=" + e.size());
            TrackId trackId = new TrackId();
            trackId.setAbTrackId(q.a(bVar.b(), d));
            b(d, e, trackId, null);
            Iterator<ExperimentTrack> it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().isAppScope()) {
                    break;
                }
            }
            if (!z) {
                return;
            }
            c();
        }
    }

    private String a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd4d069b", new Object[]{this, new Integer(i), str});
        }
        return i + "_" + str;
    }

    private String a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d470151", new Object[]{this, new Integer(i), str, str2});
        }
        return i + "_" + str + "_" + str2;
    }

    private void a(List<ExperimentTrack> list, long j) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0788b", new Object[]{this, list, new Long(j)});
        } else if (list != null && !list.isEmpty() && j > 0) {
            for (ExperimentTrack experimentTrack : list) {
                if (experimentTrack.isAppScope()) {
                    synchronized (this.j) {
                        Iterator<ExperimentTrack> it = this.i.iterator();
                        while (it.hasNext()) {
                            if (it.next().getGroupId() == j) {
                                it.remove();
                            }
                        }
                    }
                }
                if (experimentTrack.getPageNames() != null && experimentTrack.getPageNames().length != 0) {
                    for (int i : m) {
                        for (String str : experimentTrack.getPageNames()) {
                            Set<ExperimentTrack> set = this.c.get(a(i, str));
                            if (set != null) {
                                synchronized (this.d) {
                                    if (!set.isEmpty()) {
                                        Iterator<ExperimentTrack> it2 = set.iterator();
                                        while (it2.hasNext()) {
                                            if (it2.next().getGroupId() == j) {
                                                it2.remove();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    continue;
                }
            }
        }
    }

    private Set<ExperimentTrack> b(int i, String str, String str2) {
        Set<ExperimentTrack> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("9563c7bd", new Object[]{this, new Integer(i), str, str2});
        }
        HashSet hashSet = null;
        Set<ExperimentTrack> set = this.c.get(a(i, str));
        if (set != null) {
            hashSet = new HashSet();
            synchronized (this.d) {
                hashSet.addAll(set);
            }
        }
        if (!StringUtils.isEmpty(str2) && (a2 = this.e.a((i<String, Set<ExperimentTrack>>) a(i, str, str2))) != null) {
            if (hashSet == null) {
                hashSet = new HashSet();
            }
            synchronized (this.d) {
                hashSet.addAll(a2);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8 A[Catch: Throwable -> 0x00d2, LOOP:1: B:55:0x00f6->B:56:0x00f8, LOOP_END, TryCatch #1 {Throwable -> 0x00d2, blocks: (B:20:0x0068, B:22:0x006e, B:25:0x0080, B:39:0x00c7, B:41:0x00cd, B:46:0x00d8, B:48:0x00de, B:50:0x00eb, B:52:0x00f1, B:54:0x00f4, B:56:0x00f8, B:57:0x0100, B:59:0x010e, B:64:0x0125, B:68:0x0137, B:70:0x0144, B:71:0x014e, B:73:0x0154, B:75:0x0160, B:77:0x0166, B:78:0x016a, B:80:0x0170, B:82:0x017c, B:84:0x0186, B:86:0x018e, B:88:0x0198, B:89:0x01a6, B:67:0x0133, B:63:0x0121, B:26:0x0087, B:28:0x0095, B:30:0x00a3, B:31:0x00a9, B:33:0x00af, B:34:0x00b8, B:38:0x00c1), top: B:98:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e A[Catch: Throwable -> 0x00d2, TRY_LEAVE, TryCatch #1 {Throwable -> 0x00d2, blocks: (B:20:0x0068, B:22:0x006e, B:25:0x0080, B:39:0x00c7, B:41:0x00cd, B:46:0x00d8, B:48:0x00de, B:50:0x00eb, B:52:0x00f1, B:54:0x00f4, B:56:0x00f8, B:57:0x0100, B:59:0x010e, B:64:0x0125, B:68:0x0137, B:70:0x0144, B:71:0x014e, B:73:0x0154, B:75:0x0160, B:77:0x0166, B:78:0x016a, B:80:0x0170, B:82:0x017c, B:84:0x0186, B:86:0x018e, B:88:0x0198, B:89:0x01a6, B:67:0x0133, B:63:0x0121, B:26:0x0087, B:28:0x0095, B:30:0x00a3, B:31:0x00a9, B:33:0x00af, B:34:0x00b8, B:38:0x00c1), top: B:98:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bb  */
    @Override // com.alibaba.ut.abtest.track.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ut.abtest.track.TrackId a(java.lang.String r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.track.c.a(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String):com.alibaba.ut.abtest.track.TrackId");
    }

    @Override // com.alibaba.ut.abtest.track.b
    public HashMap<String, String> b(String str, int i, String str2, String str3, String str4, Map<String, String> map, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fef06d24", new Object[]{this, str, new Integer(i), str2, str3, str4, map, str5});
        }
        HashSet hashSet = new HashSet();
        try {
            Set<ExperimentTrack> a2 = this.f.a((i<String, Set<ExperimentTrack>>) a(i, str, str5));
            if (a2 != null && !a2.isEmpty()) {
                for (ExperimentTrack experimentTrack : a2) {
                    hashSet.add(experimentTrack.getTrackId().getAbTrackId());
                }
            }
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("TrackServiceImpl.getTrackIdV2", th);
        }
        String a3 = a(hashSet, map);
        if (StringUtils.isEmpty(a3)) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("evo", a3);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[RETURN] */
    @Override // com.alibaba.ut.abtest.track.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(com.alibaba.ut.abtest.track.TrackId r7, int r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ut.abtest.track.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L23
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r2 = 1
            r1[r2] = r7
            r7 = 2
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r8)
            r1[r7] = r2
            r7 = 3
            r1[r7] = r9
            java.lang.String r7 = "d7e9ecba"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L23:
            java.lang.String r7 = r7.getAbTrackId()
            r0 = 0
            if (r9 == 0) goto L4d
            java.lang.String r1 = "utparam-cnt"
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = (java.lang.String) r9
            boolean r1 = android.text.StringUtils.isEmpty(r9)
            if (r1 != 0) goto L4d
            java.lang.String r8 = r6.a(r9, r8)
            com.alibaba.ut.abtest.track.c$1 r9 = new com.alibaba.ut.abtest.track.c$1
            r9.<init>()
            java.lang.reflect.Type r9 = r9.getType()
            java.lang.Object r8 = com.alibaba.ut.abtest.internal.util.g.a(r8, r9)
            java.util.Map r8 = (java.util.Map) r8
            goto L4e
        L4d:
            r8 = r0
        L4e:
            java.lang.String r9 = "utabtest"
            if (r8 == 0) goto La1
            boolean r1 = android.text.StringUtils.isEmpty(r7)
            if (r1 != 0) goto La1
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            boolean r1 = android.text.StringUtils.isEmpty(r8)
            if (r1 != 0) goto La1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "\\."
            java.lang.String[] r7 = r7.split(r3)
            int r3 = r7.length
        L71:
            if (r2 >= r3) goto L86
            r4 = r7[r2]
            boolean r5 = r8.contains(r4)
            if (r5 != 0) goto L83
            java.lang.String r5 = "."
            r1.append(r5)
            r1.append(r4)
        L83:
            int r2 = r2 + 1
            goto L71
        L86:
            int r7 = r1.length()
            if (r7 <= 0) goto La0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            java.lang.String r8 = r1.toString()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto La1
        La0:
            return r0
        La1:
            boolean r8 = android.text.StringUtils.isEmpty(r7)
            if (r8 != 0) goto Lb4
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r8.put(r9, r7)
            java.lang.String r7 = com.alibaba.ut.abtest.internal.util.g.a(r8)
            return r7
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.track.c.a(com.alibaba.ut.abtest.track.TrackId, int, java.util.Map):java.lang.String");
    }

    private String a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{this, str, new Integer(i)});
        }
        if (i != 2001) {
            return str;
        }
        try {
            return str.contains(cew.a.TRACK_PREFIX) ? URLDecoder.decode(str, "utf-8") : str;
        } catch (Exception e) {
            com.alibaba.ut.abtest.internal.util.b.a("TrackServiceImpl.decodeIfNeed", e);
            return str;
        }
    }

    @Override // com.alibaba.ut.abtest.track.b
    public void a(com.alibaba.ut.abtest.internal.bucketing.model.a aVar, Map<String, Object> map, ceq ceqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61badae", new Object[]{this, aVar, map, ceqVar});
        } else if (aVar.b() != null && !aVar.b().isEmpty() && cex.a().j().L()) {
            for (String str : aVar.b()) {
                Long b = aVar.b(str);
                if (b == null || !cex.a().j().a(b)) {
                    Long c = aVar.c(str);
                    if (c == null || !cex.a().j().b(c)) {
                        String a2 = a(str);
                        boolean z = map != null && !map.isEmpty();
                        if (!z && b != null) {
                            z = cex.a().j().c(b);
                        }
                        if (!z) {
                            Long l = this.l.get(a2);
                            z = l == null || l.longValue() + cex.a().j().f() < m.a();
                        }
                        if (z) {
                            a(str, map, ceqVar);
                            this.l.put(a2, Long.valueOf(m.a()));
                        } else {
                            com.alibaba.ut.abtest.internal.util.b.a(com.alibaba.ut.abtest.internal.util.b.TRACK_1022_BLOCK_COUNTER);
                        }
                    }
                }
            }
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String r = cex.a().r();
        int i = Calendar.getInstance().get(7);
        if (StringUtils.isEmpty(r)) {
            return o.a().b() + "_0_" + i + "_" + str;
        }
        return o.a().b() + "_" + r + "_" + i + "_" + str;
    }

    public void a(String str, Map<String, Object> map, ceq ceqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d96175d4", new Object[]{this, str, map, ceqVar});
            return;
        }
        UTHitBuilders.a aVar = new UTHitBuilders.a();
        aVar.setProperty(UTHitBuilders.a.FIELD_EVENT_ID, "1022");
        aVar.setProperty(UTHitBuilders.a.FIELD_ARG1, g4.b.i);
        aVar.setProperty(UTHitBuilders.a.FIELD_ARG2, "version=2.15.28,id=" + str);
        if (map != null && !map.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String a2 = n.a(entry.getKey());
                if (!a2.contains("=") && !a2.contains(",")) {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append(",");
                    }
                    stringBuffer.append(entry.getKey());
                    stringBuffer.append("=");
                    stringBuffer.append(entry.getValue() == null ? "" : entry.getValue());
                }
            }
            if (stringBuffer.length() > 0) {
                aVar.setProperty(UTHitBuilders.a.FIELD_ARGS, stringBuffer.toString());
            }
        }
        UTAnalytics.getInstance().getDefaultTracker().send(aVar.build());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.alibaba.ut.abtest.internal.bucketing.model.ExperimentGroup> b(java.lang.String r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ut.abtest.track.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r2 = 1
            r1[r2] = r7
            java.lang.String r7 = "89cdf874"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.util.List r7 = (java.util.List) r7
            return r7
        L18:
            boolean r0 = android.text.StringUtils.isEmpty(r7)
            r1 = 0
            java.lang.String r2 = "TrackServiceImpl"
            if (r0 == 0) goto L28
            java.lang.String r7 = "服务端实验配置为空！"
            com.alibaba.ut.abtest.internal.util.h.c(r2, r7)
            return r1
        L28:
            java.lang.String r0 = "{"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "}"
            boolean r0 = r7.endsWith(r0)
            if (r0 == 0) goto L5c
        L3a:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L46
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "dataTrack"
            java.lang.String r0 = r0.optString(r3)     // Catch: java.lang.Throwable -> L46
            goto L5d
        L46:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "服务端实验配置格式不合法！内容="
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.alibaba.ut.abtest.internal.util.h.a(r2, r3, r0)
        L5c:
            r0 = r7
        L5d:
            boolean r3 = android.text.StringUtils.isEmpty(r0)
            java.lang.String r4 = "【服务端实验】添加埋点规则失败，埋点规则不合法。埋点规则："
            if (r3 == 0) goto L79
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.alibaba.ut.abtest.internal.util.h.d(r2, r7)
            return r1
        L79:
            com.alibaba.ut.abtest.track.c$2 r3 = new com.alibaba.ut.abtest.track.c$2
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            java.lang.Object r3 = com.alibaba.ut.abtest.internal.util.g.a(r0, r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L96
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L91
            goto L96
        L91:
            java.util.List r7 = com.alibaba.ut.abtest.internal.bucketing.a.a(r3, r0)
            return r7
        L96:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.alibaba.ut.abtest.internal.util.h.d(r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.track.c.b(java.lang.String):java.util.List");
    }

    @Override // com.alibaba.ut.abtest.track.b
    public boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, obj})).booleanValue();
        }
        List<ExperimentGroup> b = b(str);
        if (b == null || b.isEmpty()) {
            return false;
        }
        com.alibaba.ut.abtest.internal.bucketing.model.a aVar = new com.alibaba.ut.abtest.internal.bucketing.model.a();
        for (ExperimentGroup experimentGroup : b) {
            ExperimentV5 a2 = com.alibaba.ut.abtest.internal.bucketing.a.a(experimentGroup);
            if (a2 != null) {
                aVar.a(a2);
            }
        }
        a(aVar, obj);
        a(aVar);
        a(aVar, (Map<String, Object>) null, (ceq) null);
        if (h.a()) {
            StringBuffer stringBuffer = new StringBuffer();
            for (ExperimentGroup experimentGroup2 : b) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("、");
                }
                stringBuffer.append(experimentGroup2.getId());
            }
            h.b("TrackServiceImpl", "【服务端实验】添加埋点规则成功，实验分组：" + ((Object) stringBuffer));
        }
        return true;
    }

    @Override // com.alibaba.ut.abtest.track.b
    public boolean a(String str, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee015633", new Object[]{this, str, map, obj})).booleanValue();
        }
        List<ExperimentGroup> b = b(str);
        if (b == null || b.isEmpty()) {
            return false;
        }
        com.alibaba.ut.abtest.internal.bucketing.model.a aVar = new com.alibaba.ut.abtest.internal.bucketing.model.a();
        for (ExperimentGroup experimentGroup : b) {
            ExperimentV5 a2 = com.alibaba.ut.abtest.internal.bucketing.a.a(experimentGroup);
            if (a2 != null) {
                aVar.a(a2);
            }
        }
        b(aVar, obj);
        a(aVar);
        a(aVar, map, (ceq) null);
        if (h.a()) {
            StringBuffer stringBuffer = new StringBuffer();
            for (ExperimentGroup experimentGroup2 : b) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("、");
                }
                stringBuffer.append(experimentGroup2.getId());
            }
            h.b("TrackServiceImpl", "【服务端实验】添加埋点规则成功，实验分组：" + ((Object) stringBuffer));
        }
        return true;
    }

    @Override // com.alibaba.ut.abtest.track.b
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        Map<String, Set<String>> c = this.g.c();
        if (c == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        synchronized (this.h) {
            for (Set<String> set : c.values()) {
                if (set != null) {
                    hashSet.addAll(set);
                }
            }
        }
        return s.a(hashSet, ".");
    }

    @Override // com.alibaba.ut.abtest.track.b
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        synchronized (this.j) {
            if (this.i.isEmpty()) {
                return null;
            }
            HashSet hashSet = new HashSet();
            for (ExperimentTrack experimentTrack : this.i) {
                if (experimentTrack.getTrackId() != null) {
                    hashSet.add(experimentTrack.getTrackId().getAbTrackId());
                }
            }
            return s.a(hashSet, ".");
        }
    }

    @Override // com.alibaba.ut.abtest.track.b
    public void a(com.alibaba.ut.abtest.internal.bucketing.model.a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a36198", new Object[]{this, aVar});
        } else if (aVar != null) {
            try {
                if (aVar.b() == null) {
                    return;
                }
                for (String str : aVar.b()) {
                    if (!StringUtils.isEmpty(str) && !this.k.contains(str)) {
                        this.k.add(str);
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
                String a2 = s.a(this.k, ".");
                j.a(a2);
                com.taobao.monitor.adapter.b.a(a2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
