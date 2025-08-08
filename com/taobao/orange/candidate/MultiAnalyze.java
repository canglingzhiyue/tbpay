package com.taobao.orange.candidate;

import android.os.Build;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.OCandidate;
import com.taobao.orange.OConstant;
import com.taobao.orange.a;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class MultiAnalyze {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String JOINER_CHAR = "&";
    private static final String TAG = "MultiAnalyze";
    public static Map<String, OCandidate> candidateMap;
    public List<UnitAnalyze> unitAnalyzes = new ArrayList();

    static {
        kge.a(775504557);
        candidateMap = new ConcurrentHashMap();
    }

    public static void initBuildInCandidates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2190fba", new Object[0]);
            return;
        }
        OCandidate[] oCandidateArr = {new OCandidate("app_ver", a.j, VersionCompare.class), new OCandidate("os_ver", String.valueOf(Build.VERSION.SDK_INT), IntCompare.class), new OCandidate(OConstant.CANDIDATE_MANUFACTURER, String.valueOf(Build.MANUFACTURER), StringCompare.class), new OCandidate(OConstant.CANDIDATE_BRAND, String.valueOf(Build.BRAND), StringCompare.class), new OCandidate(OConstant.CANDIDATE_MODEL, String.valueOf(Build.MODEL), StringCompare.class), new OCandidate("did_hash", a.k, HashCompare.class)};
        OLog.d(TAG, "initBuildInCandidates", new Object[0]);
        initLocalEnvironment();
        addCandidate(false, oCandidateArr);
    }

    public static void addCandidate(OCandidate... oCandidateArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ab33d9", new Object[]{oCandidateArr});
        } else {
            addCandidate(true, oCandidateArr);
        }
    }

    public static void addCandidate(boolean z, OCandidate... oCandidateArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6299fa77", new Object[]{new Boolean(z), oCandidateArr});
            return;
        }
        HashSet hashSet = new HashSet();
        for (OCandidate oCandidate : oCandidateArr) {
            if (OLog.isPrintLog(1)) {
                OLog.d(TAG, "addCandidate", "candidate", oCandidate);
            }
            String a2 = oCandidate.a();
            OCandidate oCandidate2 = candidateMap.get(a2);
            if (oCandidate2 != null && oCandidate2.a(oCandidate)) {
                OLog.w(TAG, "addCandidate exist same", new Object[0]);
                return;
            }
            if (oCandidate2 != null) {
                OLog.w(TAG, "addCandidate", "update baseCandidate", oCandidate2);
            }
            candidateMap.put(a2, oCandidate);
            hashSet.add(a2);
        }
        ConfigCenter.getInstance().rematchNamespace(hashSet, z);
    }

    private static void initLocalEnvironment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8059b5f", new Object[0]);
            return;
        }
        a.R = (String) h.b(a.g, "appVersion", "");
        a.S = (String) h.b(a.g, "osVersion", "");
        if (StringUtils.isEmpty(a.R)) {
            a.R = a.j;
            h.a(a.g, "appVersion", a.R);
        }
        if (!StringUtils.isEmpty(a.S)) {
            return;
        }
        a.S = String.valueOf(Build.VERSION.SDK_INT);
        h.a(a.g, "osVersion", a.S);
    }

    public static MultiAnalyze complie(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiAnalyze) ipChange.ipc$dispatch("32af1e0e", new Object[]{str, new Boolean(z)}) : new MultiAnalyze(str, z);
    }

    private MultiAnalyze(String str, boolean z) {
        for (String str2 : str.split("&")) {
            this.unitAnalyzes.add(UnitAnalyze.complie(str2));
        }
        if (!z || !OLog.isPrintLog(0)) {
            return;
        }
        OLog.v(TAG, "parse start", "unitAnalyzes", this.unitAnalyzes);
    }

    public boolean match() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2486f3d0", new Object[]{this})).booleanValue();
        }
        for (UnitAnalyze unitAnalyze : this.unitAnalyzes) {
            OCandidate oCandidate = candidateMap.get(unitAnalyze.key);
            if (oCandidate == null) {
                if (OLog.isPrintLog(3)) {
                    OLog.w(TAG, "match fail", "key", unitAnalyze.key, "reason", "no found local Candidate");
                }
                return false;
            } else if (!unitAnalyze.match(oCandidate.b(), oCandidate.c())) {
                return false;
            }
        }
        return true;
    }

    public Set<String> getKeySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("bba7d46f", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        for (UnitAnalyze unitAnalyze : this.unitAnalyzes) {
            hashSet.add(unitAnalyze.key);
        }
        return hashSet;
    }
}
