package com.alibaba.ut.abtest.internal.bucketing;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.internal.util.g;
import com.alibaba.ut.abtest.internal.util.k;
import com.alibaba.ut.abtest.pipeline.accs.EvoAccsService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ceq;
import tb.cex;
import tb.kge;

/* loaded from: classes3.dex */
public class HighPriorityExperimentStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OPT_VERSION = 1;
    public static final String OPT_VERSION_KEY = "OPT_VERSION";
    public static final String SP_NAME_BETA_SINGLE = "ut_ab_lazy_exp_beta_single";
    public static final String SP_NAME_PULL_BETA_FILE = "ut_ab_lazy_exp_pull_beta_file";
    public static final String SP_NAME_RELEASE = "ut_ab_lazy_exp_release";
    public static final int STORE_TYPE_CONFIG_AND_RESULT = 2;
    public static final int STORE_TYPE_CONFIG_ONLY = 1;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f4180a;
    private String b;
    private Collection<ExperimentV5> c;
    private long f;
    private boolean d = true;
    private int e = 1;
    private boolean g = false;

    /* loaded from: classes3.dex */
    public @interface StoreType {
    }

    static {
        kge.a(-260843460);
        ArrayList arrayList = new ArrayList();
        f4180a = arrayList;
        arrayList.add("release");
        f4180a.add("beta");
        f4180a.add(EvoAccsService.ACCS_BETA_SINGLE);
    }

    public HighPriorityExperimentStorage a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighPriorityExperimentStorage) ipChange.ipc$dispatch("9cffa657", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !f4180a.contains(str)) {
            throw new RuntimeException("Not support file type!");
        }
        this.b = str;
        return this;
    }

    public HighPriorityExperimentStorage a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighPriorityExperimentStorage) ipChange.ipc$dispatch("3a7339dd", new Object[]{this, new Boolean(z)});
        }
        this.d = z;
        return this;
    }

    public HighPriorityExperimentStorage a(Collection<ExperimentV5> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighPriorityExperimentStorage) ipChange.ipc$dispatch("20ffcc90", new Object[]{this, collection});
        }
        this.c = collection;
        return this;
    }

    public HighPriorityExperimentStorage a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighPriorityExperimentStorage) ipChange.ipc$dispatch("78f2aece", new Object[]{this, new Integer(i)});
        }
        this.e = i;
        return this;
    }

    public HighPriorityExperimentStorage a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighPriorityExperimentStorage) ipChange.ipc$dispatch("9363a7ed", new Object[]{this, new Long(j)});
        }
        this.f = j;
        return this;
    }

    public HighPriorityExperimentStorage a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighPriorityExperimentStorage) ipChange.ipc$dispatch("22d7ad61", new Object[]{this});
        }
        this.g = true;
        return this;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.d && EvoAccsService.ACCS_BETA_SINGLE.equals(this.b)) {
        } else {
            SharedPreferences a2 = k.b().a();
            SharedPreferences.Editor edit = a2.edit();
            if (!this.g) {
                a(a2, edit);
                b(a2, edit);
                c(a2, edit);
            }
            a(edit);
            edit.apply();
            if (this.e != 2) {
                return;
            }
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        SharedPreferences.Editor edit = cex.a().c().getSharedPreferences(g(), 0).edit();
        if (!this.g) {
            edit.clear();
        }
        for (ExperimentV5 experimentV5 : this.c) {
            if (experimentV5.getCognation() == null || experimentV5.getCognation().getRoutingType() != ExperimentRoutingType.UserId) {
                String[] a2 = com.alibaba.ut.abtest.internal.util.a.a(experimentV5.getKey());
                if (a2 != null && !TextUtils.equals(UTABTest.COMPONENT_URI, a2[0])) {
                    com.alibaba.ut.abtest.internal.bucketing.model.b bVar = new com.alibaba.ut.abtest.internal.bucketing.model.b(experimentV5, cex.a().i().a(experimentV5, (Map<String, Object>) null, new ceq(), true));
                    if (bVar.h()) {
                        edit.putString(experimentV5.getKey(), bVar.f());
                    }
                }
            }
        }
        if (!this.g) {
            edit.putLong("experimentDataVersionV5", this.f);
        }
        edit.putInt(OPT_VERSION_KEY, 1);
        edit.commit();
    }

    private void a(SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc66157", new Object[]{this, sharedPreferences, editor});
            return;
        }
        String string = sharedPreferences.getString(d(), "");
        for (String str : string != null ? string.split("###") : new String[0]) {
            if (!TextUtils.isEmpty(str)) {
                editor.remove("expKey_" + str);
            }
        }
    }

    private void b(SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc77cb76", new Object[]{this, sharedPreferences, editor});
            return;
        }
        String string = sharedPreferences.getString(e(), "");
        for (String str : string != null ? string.split("###") : new String[0]) {
            if (!TextUtils.isEmpty(str)) {
                editor.remove("switchName_" + str);
            }
        }
    }

    private void c(SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb293595", new Object[]{this, sharedPreferences, editor});
            return;
        }
        String string = sharedPreferences.getString(f(), "");
        for (String str : string != null ? string.split("###") : new String[0]) {
            if (!TextUtils.isEmpty(str)) {
                editor.remove("layerId_" + str);
            }
        }
    }

    private void a(SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d35d43", new Object[]{this, editor});
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (ExperimentV5 experimentV5 : this.c) {
            if (experimentV5 != null && experimentV5.isHighPriorityWork()) {
                editor.putString("expKey_" + experimentV5.getKey(), g.a(experimentV5).replace("\"", "'"));
                sb.append(experimentV5.getKey());
                sb.append("###");
                for (String str : experimentV5.getSwitchSet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = (String) hashMap2.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            hashMap2.put(str, experimentV5.getKey());
                        } else {
                            hashMap2.put(str, str2 + "###" + experimentV5.getKey());
                        }
                        sb2.append(str);
                        sb2.append("###");
                    }
                }
                if (experimentV5.isRetain()) {
                    String str3 = (String) hashMap.get(Long.valueOf(experimentV5.getLayerId()));
                    if (TextUtils.isEmpty(str3)) {
                        hashMap.put(Long.valueOf(experimentV5.getLayerId()), experimentV5.getKey());
                    } else {
                        Long valueOf = Long.valueOf(experimentV5.getLayerId());
                        hashMap.put(valueOf, str3 + "###" + experimentV5.getKey());
                    }
                    sb3.append(experimentV5.getLayerId());
                    sb3.append("###");
                }
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                editor.putString("switchName_" + ((String) entry.getKey()), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            editor.putString("layerId_" + entry2.getKey(), (String) entry2.getValue());
        }
        editor.putString(d(), sb.toString());
        editor.putString(e(), sb2.toString());
        editor.putString(f(), sb3.toString());
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        String str = this.b;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -399554358) {
            if (hashCode == 3020272 && str.equals("beta")) {
                c = 0;
            }
        } else if (str.equals(EvoAccsService.ACCS_BETA_SINGLE)) {
            c = 1;
        }
        return c != 0 ? c != 1 ? "allLazyLoadExpKeys" : "allBetaLazyLoadSingleExpKeys" : this.d ? "allBetaLazyLoadPercentExpKeys" : "allBetaLazyLoadExpKeys";
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        String str = this.b;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -399554358) {
            if (hashCode == 3020272 && str.equals("beta")) {
                c = 0;
            }
        } else if (str.equals(EvoAccsService.ACCS_BETA_SINGLE)) {
            c = 1;
        }
        return c != 0 ? c != 1 ? "allLazyLoadSwitchNames" : "allBetaLazyLoadSingleSwitchNames" : this.d ? "allBetaLazyLoadPercentSwitchNames" : "allBetaLazyLoadSwitchNames";
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String str = this.b;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -399554358) {
            if (hashCode == 3020272 && str.equals("beta")) {
                c = 0;
            }
        } else if (str.equals(EvoAccsService.ACCS_BETA_SINGLE)) {
            c = 1;
        }
        return c != 0 ? c != 1 ? "allLazyLoadEmptyLayerIds" : "allBetaLazyLoadSingleEmptyLayerIds" : this.d ? "allBetaLazyLoadPercentEmptyLayerIds" : "allBetaLazyLoadEmptyLayerIds";
    }

    private String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        String str = this.b;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -399554358) {
            if (hashCode == 3020272 && str.equals("beta")) {
                c = 0;
            }
        } else if (str.equals(EvoAccsService.ACCS_BETA_SINGLE)) {
            c = 1;
        }
        return c != 0 ? c != 1 ? SP_NAME_RELEASE : SP_NAME_BETA_SINGLE : SP_NAME_PULL_BETA_FILE;
    }
}
