package com.taobao.android.remoteso.index;

import android.app.Application;
import com.alipay.mobile.security.bio.api.BioError;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.ijd;
import tb.iju;
import tb.ikn;
import tb.ikq;
import tb.iky;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Application f14811a;
    private final ijd b;
    private final iju c;
    private final b d;
    private SoIndexData e = null;
    private SoIndexAdvanced f = null;
    private RemoPostIndex h = null;
    private final List<SoIndexData.SoFileInfo> g = new CopyOnWriteArrayList();

    public static /* synthetic */ SoIndexData a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SoIndexData) ipChange.ipc$dispatch("1e7970f5", new Object[]{cVar}) : cVar.e;
    }

    public static /* synthetic */ SoIndexAdvanced b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SoIndexAdvanced) ipChange.ipc$dispatch("588464dc", new Object[]{cVar}) : cVar.f;
    }

    public c(Application application, ijd ijdVar, iju ijuVar, b bVar) {
        this.f14811a = application;
        this.b = ijdVar;
        this.c = ijuVar;
        this.d = bVar;
    }

    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ca0b3ae", new Object[]{this}) : this.d;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            long a2 = iky.a();
            RSoLog.c("initSync, enter");
            this.e = (SoIndexData) a.b(this.f14811a, this.b, "swallows_rso_index", SoIndexData.class);
            RSoLog.c("initSync, initIndex -> " + this.e);
            long a3 = iky.a();
            this.d.a(this.e);
            long a4 = iky.a();
            this.f = (SoIndexAdvanced) a.b(this.f14811a, this.b, "swallows_rso_index2", SoIndexAdvanced.class);
            RSoLog.c("initSync, initIndex2 -> " + this.f);
            long a5 = iky.a();
            this.h = (RemoPostIndex) a.b(this.f14811a, this.b, "swallows_remo_post_index", RemoPostIndex.class);
            RSoLog.c("initSync, postIndex -> " + this.h);
            a(a2, a3, a4, a5);
        } catch (Throwable th) {
            ikq.a("RSoIndexManager,initSync", th);
        }
    }

    public void a(final g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7467a89", new Object[]{this, gVar});
        } else if (this.e == null || this.f == null) {
            RSoLog.b("index-> hookIndexData failed, " + this.e + this.f);
        } else {
            ikq.a("hookIndexData", new Runnable() { // from class: com.taobao.android.remoteso.index.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        gVar.a(c.a(c.this), c.b(c.this));
                    }
                }
            });
        }
    }

    private void a(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed98968", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("parseIndexCost", Long.valueOf(j2 - j));
        hashMap.put("parseLastIndexCost", Long.valueOf(j3 - j2));
        hashMap.put("parseAdvancedIndexCost", Long.valueOf(j4 - j3));
        hashMap.put(ikn.ARGS_INDEX_INIT_INDEX_TOTAL, Long.valueOf(iky.a() - j));
        hashMap.put("args_last_major_app_version", this.c.e());
        hashMap.put("packageName", this.c.a().getPackageName());
        ikq.a(ikn.POINT_INDEX, hashMap);
    }

    public SoIndexData c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData) ipChange.ipc$dispatch("d505c892", new Object[]{this});
        }
        SoIndexData soIndexData = this.e;
        if (soIndexData == null) {
            throw RSoException.error(2000, " indexData is empty ,  rso disabled ?");
        }
        return soIndexData;
    }

    public List<RemoConfig> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this});
        }
        List<RemoConfig> a2 = a.a(this.c.a(), this.b, "swallows_remo_config", RemoConfig.class);
        return a2 != null ? a2 : Collections.emptyList();
    }

    public Collection<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("bf91abc", new Object[]{this});
        }
        SoIndexData soIndexData = this.e;
        if (soIndexData != null) {
            return soIndexData.getEntries().keySet();
        }
        return new ArrayList();
    }

    public Collection<SoIndexData.SoFileInfo> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("dd26ddb", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String b = this.c.b();
        a(this.e, arrayList, b);
        RSoLog.c("index-> listInfo, after addInfoFromData, results.size = " + arrayList.size());
        a(this.f, arrayList, b);
        RSoLog.c("index-> listInfo, after addInfoFromAdvanced, results.size = " + arrayList.size());
        arrayList.addAll(this.g);
        RSoLog.c("index-> listInfo, after availableInfoList, results.size = " + arrayList.size());
        arrayList.addAll(c().getAssets().values());
        RSoLog.c("index-> listInfo, after assets, results.size = " + arrayList.size());
        RemoPostIndex remoPostIndex = this.h;
        if (remoPostIndex != null) {
            arrayList.addAll(remoPostIndex.getAssets().values());
            RSoLog.c("index-> listInfo, after postIndex, results.size = " + arrayList.size());
        }
        return arrayList;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String b = this.c.b();
        SoIndexAdvanced soIndexAdvanced = this.f;
        if (soIndexAdvanced == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, SoInfo2> entry : soIndexAdvanced.getInfoMap().entrySet()) {
            if (entry.getKey().endsWith(b)) {
                sb.append(entry.getValue().advancedInfo);
            }
        }
        return sb.toString();
    }

    private void a(SoIndexAdvanced soIndexAdvanced, List<SoIndexData.SoFileInfo> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec88cbd3", new Object[]{this, soIndexAdvanced, list, str});
        } else if (soIndexAdvanced != null) {
            for (Map.Entry<String, SoInfo2> entry : soIndexAdvanced.getInfoMap().entrySet()) {
                if (entry.getKey().endsWith(str)) {
                    list.addAll(l.b(entry.getValue()));
                }
            }
        }
    }

    private static void a(SoIndexData soIndexData, List<SoIndexData.SoFileInfo> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e7624b", new Object[]{soIndexData, list, str});
        } else if (soIndexData != null) {
            for (SoIndexData.SoIndexEntry soIndexEntry : soIndexData.getEntries().values()) {
                SoIndexData.SoFileInfo soFileInfo = soIndexEntry.getFiles().get(str);
                if (soFileInfo != null) {
                    list.add(soFileInfo);
                }
            }
        }
    }

    public void a(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48cc4ef0", new Object[]{this, soIndexData, soIndexAdvanced});
            return;
        }
        String b = this.c.b();
        ArrayList arrayList = new ArrayList();
        a(soIndexData, arrayList, b);
        a(soIndexAdvanced, arrayList, b);
        this.g.addAll(arrayList);
    }

    public SoIndexData.SoFileInfo a(String str, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("2c461cde", new Object[]{this, str, soIndexData});
        }
        try {
            return b(str, soIndexData);
        } catch (Throwable unused) {
            RSoLog.c("index-> getInfoOrNull got error" + str);
            return null;
        }
    }

    public SoIndexData.SoFileInfo b(String str, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("9f53191f", new Object[]{this, str, soIndexData});
        }
        String b = this.c.b();
        if (soIndexData == null) {
            throw RSoException.error(2000, " indexData is empty , wtf ? abi = " + b);
        }
        SoIndexData.SoIndexEntry soIndexEntry = soIndexData.getEntries().get(str);
        if (soIndexEntry == null) {
            throw RSoException.error(2001, "entry == null, no entry found by libName=" + str + ", data = " + soIndexData);
        }
        SoIndexData.SoFileInfo soFileInfo = soIndexEntry.getFiles().get(b);
        if (soFileInfo == null) {
            throw RSoException.error(2010, "info == null, no info found by libName=" + str + ", entry=" + soIndexEntry + ", abi=" + b);
        }
        a.a(soFileInfo);
        return soFileInfo;
    }

    public SoIndexData.SoFileInfo c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("60b352b0", new Object[]{this, str}) : a(str, this.e);
    }

    public SoIndexData.SoFileInfo a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("a4cc86f2", new Object[]{this, str}) : b(str, this.e);
    }

    public SoInfo2 a(String str, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoInfo2) ipChange.ipc$dispatch("12bb0e4e", new Object[]{this, str, soIndexAdvanced});
        }
        if (soIndexAdvanced == null) {
            RSoLog.c(" index2 ->  index2Data is null , libName=" + str);
            return null;
        }
        String b = this.c.b();
        try {
            Map<String, SoInfo2> infoMap = soIndexAdvanced.getInfoMap();
            return infoMap.get(str + "|" + b);
        } catch (Throwable unused) {
            ikq.a("index,getInfo2OrNull", "index2 ->  getAvailableInfo2");
            return null;
        }
    }

    public SoInfo2 b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SoInfo2) ipChange.ipc$dispatch("79c10033", new Object[]{this, str}) : a(str, this.f);
    }

    public SoIndexData.SoFileInfo d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("3ea6b88f", new Object[]{this, str});
        }
        SoIndexData.SoFileInfo soFileInfo = c().getAssets().get(str);
        if (soFileInfo != null) {
            RSoLog.c("index->getAssetInfoOrError, found in index.assets , info = " + soFileInfo);
            return soFileInfo;
        }
        RemoPostIndex remoPostIndex = this.h;
        if (remoPostIndex == null) {
            ikq.a("getInfo,postIndex==null", str);
            throw RSoException.error((int) BioError.RESULT_FAIL_EXIT, "postIndex is empty, rso disabled ?");
        }
        SoIndexData.SoFileInfo soFileInfo2 = remoPostIndex.getAssets().get(str);
        if (soFileInfo2 != null) {
            RSoLog.c("index->getAssetInfoOrError, found in postIndex.assets , infoInPostIndex = " + soFileInfo2);
            return soFileInfo2;
        }
        throw RSoException.error(2008, "res not found in all place, " + str);
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        if (c().getAssets().containsKey(str)) {
            RSoLog.c("index->containsAssets, found in index.assets , name = " + str);
            return true;
        }
        RemoPostIndex remoPostIndex = this.h;
        if (remoPostIndex == null) {
            ikq.a("contains,postIndex==null", str);
            return false;
        } else if (!remoPostIndex.getAssets().containsKey(str)) {
            return false;
        } else {
            RSoLog.c("index->containsAssets, found in postIndex, name = " + str);
            return true;
        }
    }
}
