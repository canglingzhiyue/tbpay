package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.wireless.security.open.securityguardaccsadapter.OrangeAdapter;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.a;
import com.taobao.orange.candidate.MultiAnalyze;
import com.taobao.orange.e;
import com.taobao.orange.model.CandidateDO;
import com.taobao.orange.model.IndexDO;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.b;
import com.taobao.orange.util.d;
import com.taobao.orange.util.f;
import com.taobao.orange.util.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class mzv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INDEX_STORE_NAME = "orange.index";
    private final Set<String> b = new HashSet();
    private volatile IndexDO c = new IndexDO();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Set<String>> f31344a = new HashMap();

    static {
        kge.a(-1541716789);
    }

    public static /* synthetic */ IndexDO a(mzv mzvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndexDO) ipChange.ipc$dispatch("a69f62b7", new Object[]{mzvVar}) : mzvVar.c;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IndexDO indexDO = (IndexDO) b.a(INDEX_STORE_NAME);
        if (indexDO != null) {
            if (OLog.isPrintLog(2)) {
                OLog.i("IndexCache", "load", "indexDO", f.a(indexDO));
            }
            b(indexDO);
            this.f31344a = d(indexDO);
            this.c = indexDO;
        } else {
            OLog.w("IndexCache", "load fail", new Object[0]);
            try {
                b.a();
            } catch (Throwable th) {
                OLog.e("IndexCache", "load clean cache exception", th, new Object[0]);
            }
        }
        l();
        k();
    }

    private void b(IndexDO indexDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2604f7ef", new Object[]{this, indexDO});
        } else if (indexDO.mergedNamespaces == null || indexDO.mergedNamespaces.isEmpty()) {
        } else {
            int size = indexDO.mergedNamespaces.size();
            String str = null;
            if (size <= 100) {
                str = "0_100";
            } else if (size <= 200) {
                str = "100_200";
            } else if (size <= 300) {
                str = "200_300";
            } else if (size <= 400) {
                str = "300_400";
            } else if (size <= 500) {
                str = "400_500";
            }
            if (!TextUtils.isEmpty(str)) {
                d.a(OConstant.MONITOR_PRIVATE_MODULE, OConstant.POINT_INDEX_NAMESPACE_SIZE_COUNTS, str, 1.0d);
            }
            if (!((Boolean) h.b(a.g, OConstant.SYSKEY_INDEX_CHECK_ENABLE, (Object) true)).booleanValue() || indexDO.totalCnt <= 0 || size >= indexDO.totalCnt || !a.f18576a) {
                return;
            }
            a.I = true;
            OLog.e("IndexCache", "checkIndexIntact", "mergedNamespaces", Integer.valueOf(size), "totalCnt", Integer.valueOf(indexDO.totalCnt));
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!a.H) {
        } else {
            this.b.add("orange");
            this.b.add("ap_stat");
            this.b.add("ap_alarm");
            this.b.add("ap_counter");
            this.b.add("ap_realtime");
            this.b.add("utap_system");
            this.b.add("ut_bussiness");
            this.b.add("ut_sample");
            this.b.add("networkSdk");
            this.b.add("networkflow");
            this.b.add("tnet4Android_sdk");
            this.b.add("network_diagnosis");
            this.b.add(SwitchMonitorLogUtil.SRC_AMDC);
            this.b.add("adaemon");
            this.b.add("keepalive");
            this.b.add(OrangeAdapter.SECURITYGUARD_ORANGE_NAMESPACE);
            this.b.add(com.taobao.tlog.adapter.b.REMOTE_TLOG_CONFIG);
            this.b.add(com.taobao.tlog.adapter.b.REMOTE_DEBUGER_ANDROID);
        }
    }

    public List<String> a(IndexDO indexDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("99076cf7", new Object[]{this, indexDO});
        }
        if (a.y > 0) {
            if (!TextUtils.isEmpty(indexDO.baseVersion) && !"0".equals(indexDO.baseVersion)) {
                return c(indexDO);
            }
            OLog.e("IndexCache", "cache", "baseVersion is empty");
        }
        g();
        Map<String, NameSpaceDO> a2 = a(this.c.mergedNamespaces);
        Map<String, NameSpaceDO> a3 = a(indexDO.mergedNamespaces);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a2.keySet());
        arrayList.removeAll(a3.keySet());
        for (Map.Entry<String, NameSpaceDO> entry : a3.entrySet()) {
            NameSpaceDO nameSpaceDO = a2.get(entry.getKey());
            NameSpaceDO value = entry.getValue();
            if (nameSpaceDO == null) {
                value.hasChanged = true;
            } else {
                boolean z = !value.equals(nameSpaceDO);
                if (z && OLog.isPrintLog(2)) {
                    OLog.i("IndexCache", "cache", "compare change NameSpaceDO", f.a(value));
                }
                value.hasChanged = z;
            }
        }
        int size = indexDO.mergedNamespaces.size();
        if (a.I && size >= this.c.totalCnt) {
            a.I = false;
            d.a(OConstant.MONITOR_PRIVATE_MODULE, OConstant.POINT_INDEX_EXCEPTION_RECOVERY_COUNTS, String.valueOf(size), 1.0d);
            OLog.e("IndexCache", "[cache]indexExceptionCheck success.", "mergedNamespaces", Integer.valueOf(size));
        }
        this.f31344a = d(indexDO);
        this.c = indexDO;
        l();
        if (a.H) {
            final IndexDO indexDO2 = new IndexDO(this.c);
            f();
            e.b(new Runnable() { // from class: tb.mzv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int size2 = indexDO2.mergedNamespaces != null ? indexDO2.mergedNamespaces.size() : 0;
                    if (indexDO2.totalCnt > 0 && size2 < indexDO2.totalCnt) {
                        OLog.e("IndexCache", "skip persistObject index.", "size", Integer.valueOf(size2));
                        return;
                    }
                    OLog.e("IndexCache", "persistObject index", "size", Integer.valueOf(size2));
                    b.a(indexDO2, mzv.INDEX_STORE_NAME);
                }
            });
        } else {
            e.b(new Runnable() { // from class: tb.mzv.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(mzv.a(mzv.this), mzv.INDEX_STORE_NAME);
                    }
                }
            });
        }
        return arrayList;
    }

    private List<String> c(IndexDO indexDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b37ccff9", new Object[]{this, indexDO});
        }
        OLog.e("IndexCache", "diffCache", "diff index, baseVersion = " + indexDO.baseVersion);
        ArrayList arrayList = new ArrayList();
        g();
        Map<String, NameSpaceDO> a2 = a(this.c.mergedNamespaces);
        Map<String, NameSpaceDO> a3 = a(indexDO.mergedNamespaces);
        if (indexDO.offlineNamespaces != null && indexDO.offlineNamespaces.size() > 0) {
            for (String str : indexDO.offlineNamespaces) {
                a2.remove(str);
            }
            arrayList.addAll(indexDO.offlineNamespaces);
        }
        for (Map.Entry<String, NameSpaceDO> entry : a3.entrySet()) {
            NameSpaceDO nameSpaceDO = a2.get(entry.getKey());
            NameSpaceDO value = entry.getValue();
            if (nameSpaceDO == null) {
                value.hasChanged = true;
            } else {
                boolean z = !value.equals(nameSpaceDO);
                if (z && OLog.isPrintLog(2)) {
                    OLog.i("IndexCache", "diffCache", "compare change NameSpaceDO", f.a(value));
                }
                value.hasChanged = z;
            }
        }
        for (Map.Entry<String, NameSpaceDO> entry2 : a2.entrySet()) {
            if (!a3.containsKey(entry2.getKey())) {
                a3.put(entry2.getKey(), entry2.getValue());
            }
        }
        indexDO.mergedNamespaces.clear();
        indexDO.mergedNamespaces.addAll(new ArrayList(a3.values()));
        int size = indexDO.mergedNamespaces.size();
        if (a.I && size >= this.c.totalCnt) {
            a.I = false;
            d.a(OConstant.MONITOR_PRIVATE_MODULE, OConstant.POINT_INDEX_EXCEPTION_RECOVERY_COUNTS, String.valueOf(size), 1.0d);
            OLog.e("IndexCache", "[diffCache]indexExceptionCheck success.", "mergedNamespaces", Integer.valueOf(size));
        }
        this.f31344a = d(indexDO);
        this.c = indexDO;
        l();
        if (a.H) {
            final IndexDO indexDO2 = new IndexDO(this.c);
            f();
            e.b(new Runnable() { // from class: tb.mzv.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int size2 = indexDO2.mergedNamespaces != null ? indexDO2.mergedNamespaces.size() : 0;
                    if (indexDO2.totalCnt > 0 && size2 < indexDO2.totalCnt) {
                        OLog.e("IndexCache", "skip persistObject index.", "size", Integer.valueOf(size2));
                        return;
                    }
                    OLog.e("IndexCache", "persistObject index", "size", Integer.valueOf(size2));
                    b.a(indexDO2, mzv.INDEX_STORE_NAME);
                }
            });
        } else {
            e.b(new Runnable() { // from class: tb.mzv.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(mzv.a(mzv.this), mzv.INDEX_STORE_NAME);
                    }
                }
            });
        }
        OLog.e("IndexCache", "diffCache", "success");
        return arrayList;
    }

    private Map<String, Set<String>> d(IndexDO indexDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b7c430a2", new Object[]{this, indexDO});
        }
        if (indexDO == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (NameSpaceDO nameSpaceDO : indexDO.mergedNamespaces) {
            if (nameSpaceDO.candidates != null && !nameSpaceDO.candidates.isEmpty()) {
                for (CandidateDO candidateDO : nameSpaceDO.candidates) {
                    for (String str : MultiAnalyze.complie(candidateDO.match, false).getKeySet()) {
                        Set set = (Set) hashMap.get(str);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(str, set);
                        }
                        set.add(nameSpaceDO.name);
                    }
                }
            }
        }
        if (OLog.isPrintLog(1)) {
            OLog.d("IndexCache", "getCandidateNamespace", "result", hashMap);
        }
        return hashMap;
    }

    private Map<String, NameSpaceDO> a(List<NameSpaceDO> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71436bce", new Object[]{this, list});
        }
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (NameSpaceDO nameSpaceDO : list) {
                hashMap.put(nameSpaceDO.name, nameSpaceDO);
            }
        }
        return hashMap;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("appKey");
        sb.append("=");
        sb.append(a.h);
        sb.append("&");
        sb.append("appVersion");
        sb.append("=");
        sb.append(a.j);
        sb.append("&");
        sb.append(OConstant.KEY_CLIENTAPPINDEXVERSION);
        sb.append("=");
        sb.append(i());
        OLog.i("IndexCache", "updateOrangeHeader", "reqOrangeHeaderDiff", sb.toString());
        a.o = sb.toString();
        sb.append("&");
        sb.append(OConstant.KEY_CLIENTVERSIONINDEXVERSION);
        sb.append("=");
        sb.append(j());
        OLog.i("IndexCache", "updateOrangeHeader", "reqOrangeHeader", sb.toString());
        a.n = sb.toString();
    }

    public IndexDO b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IndexDO) ipChange.ipc$dispatch("6ff7fcd1", new Object[]{this}) : this.c;
    }

    public Set<NameSpaceDO> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3b6c35d9", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.c.mergedNamespaces);
        return hashSet;
    }

    public Set<NameSpaceDO> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("916979a", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        for (NameSpaceDO nameSpaceDO : this.c.mergedNamespaces) {
            if (nameSpaceDO.highLazy.intValue() == 0) {
                hashSet.add(nameSpaceDO);
            }
        }
        return hashSet;
    }

    public Set<NameSpaceDO> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d6c0f95b", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        for (NameSpaceDO nameSpaceDO : this.c.mergedNamespaces) {
            if (nameSpaceDO.highLazy.intValue() != 0) {
                hashSet.add(nameSpaceDO);
            }
        }
        return hashSet;
    }

    public Set<NameSpaceDO> a(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6868d06", new Object[]{this, set});
        }
        HashSet hashSet = new HashSet();
        for (NameSpaceDO nameSpaceDO : this.c.mergedNamespaces) {
            if (nameSpaceDO.hasChanged) {
                if (NameSpaceDO.LEVEL_HIGH.equals(nameSpaceDO.loadLevel)) {
                    hashSet.add(nameSpaceDO);
                } else if (set != null && set.contains(nameSpaceDO.name)) {
                    hashSet.add(nameSpaceDO);
                }
            }
        }
        return hashSet;
    }

    public Set<NameSpaceDO> b(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("43a65125", new Object[]{this, set});
        }
        Set<String> b = h.b(a.g, OConstant.SP_KEY_USED_LIST, (Set<String>) new HashSet());
        b.add("orange");
        HashSet hashSet = new HashSet();
        for (NameSpaceDO nameSpaceDO : this.c.mergedNamespaces) {
            if (nameSpaceDO.hasChanged && (b.contains(nameSpaceDO.name) || (set != null && set.contains(nameSpaceDO.name)))) {
                hashSet.add(nameSpaceDO);
            }
        }
        return hashSet;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (a.H) {
            Set<String> b = h.b(a.g, OConstant.SP_KEY_USED_LIST, (Set<String>) new HashSet());
            b.add("orange");
            b.addAll(h.b(a.g, OConstant.SYSKEY_CHANNEL_CONFIGS, this.b));
            OLog.e("IndexCache", "clearNotUsedNameSpaces", "usedConfigs", b.toString());
            ArrayList arrayList = new ArrayList();
            for (NameSpaceDO nameSpaceDO : this.c.mergedNamespaces) {
                if (b.contains(nameSpaceDO.name)) {
                    arrayList.add(nameSpaceDO);
                }
            }
            this.c.mergedNamespaces.clear();
            this.c.mergedNamespaces.addAll(arrayList);
        }
    }

    public synchronized void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!a.H) {
        } else {
            OLog.e("IndexCache", "reloadAllNameSpaces", new Object[0]);
            IndexDO indexDO = (IndexDO) b.a(INDEX_STORE_NAME);
            if (indexDO != null) {
                this.c.mergedNamespaces = indexDO.mergedNamespaces;
            }
        }
    }

    public NameSpaceDO a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NameSpaceDO) ipChange.ipc$dispatch("166ef211", new Object[]{this, str});
        }
        long nanoTime = System.nanoTime();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (NameSpaceDO nameSpaceDO : this.c.mergedNamespaces) {
            if (str.equals(nameSpaceDO.name)) {
                OLog.d("IndexCache", "time (getNameSpace)", "time: " + String.valueOf((System.nanoTime() - nanoTime) / 1000));
                return nameSpaceDO;
            }
        }
        OLog.d("IndexCache", "time (getNameSpace)", "time: " + String.valueOf((System.nanoTime() - nanoTime) / 1000));
        return null;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.c.cdn)) {
            return null;
        }
        return a.p + HttpConstant.SCHEME_SPLIT + this.c.cdn;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.c.appIndexVersion == null ? "0" : this.c.appIndexVersion;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.c.versionIndexVersion == null ? "0" : this.c.versionIndexVersion;
    }
}
