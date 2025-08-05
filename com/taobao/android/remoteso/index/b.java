package com.taobao.android.remoteso.index;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.ijb;
import tb.ijd;
import tb.ijn;
import tb.iju;
import tb.ijv;
import tb.ijy;
import tb.ika;
import tb.ikq;
import tb.iks;
import tb.iku;
import tb.ikw;

/* loaded from: classes.dex */
public class b implements ijy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final long f14808a = TimeUnit.SECONDS.toMillis(60);
    private final Application b;
    private final iju c;
    private final ijd d;
    private final ijv e;
    private SoIndexData f;
    private final List<SoIndexData> g = new ArrayList();

    public static /* synthetic */ void a(b bVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f74434ae", new Object[]{bVar});
        } else {
            bVar.d();
        }
    }

    public static /* synthetic */ File b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("d5677060", new Object[]{bVar}) : bVar.e();
    }

    public b(Application application, iju ijuVar, ijd ijdVar, ijv ijvVar) {
        this.b = application;
        this.c = ijuVar;
        this.d = ijdVar;
        this.e = ijvVar;
    }

    @Override // tb.ijy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        RSoLog.c("LastCache, refreshLastIndex(), enter ");
        ika.a(new Runnable() { // from class: com.taobao.android.remoteso.index.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    b.a(b.this);
                } catch (IOException e) {
                    ikq.a("writeLastIndex-failed", e);
                    iku.f(b.b(b.this));
                }
            }
        }, f14808a);
    }

    public List<SoIndexData> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (SoIndexData soIndexData : this.g) {
            if (this.f != null && ikw.b((CharSequence) soIndexData.getAppVersion(), (CharSequence) this.f.getAppVersion())) {
                arrayList.add(soIndexData);
            }
        }
        if (this.d.a("key_allow_hardcode_last_index", true)) {
            arrayList.add(f.a());
        }
        return arrayList;
    }

    public void a(SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2c319d0", new Object[]{this, soIndexData});
            return;
        }
        this.f = soIndexData;
        String c = c();
        try {
            if (ikw.b((CharSequence) c)) {
                this.g.addAll(JSON.parseArray(c, SoIndexData.class));
            }
            RSoLog.c("lastIndexList = " + this.g);
        } catch (Throwable th) {
            ikq.a("LastCache-> initLastIndex", th);
        }
    }

    private String c() {
        byte[] e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String a2 = ijb.a(this.d, "last_index");
        if (ikw.b((CharSequence) a2)) {
            RSoLog.c("readLast, readFromCustomIndex, from custom index, customIndex=" + a2);
            return a2;
        }
        try {
            File e2 = e();
            if (!e2.isFile() || (e = iku.e(e2)) == null || e.length <= 1) {
                return null;
            }
            RSoLog.c("readLast, from lastIndexFile");
            return new String(e);
        } catch (Throwable th) {
            ikq.a("readLast.lastIndexFile", th);
            return null;
        }
    }

    private void d() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        RSoLog.c("performLastIndex, enter ");
        final SoIndexData soIndexData = this.f;
        if (soIndexData == null) {
            ikq.a("performLastIndex, currentIndexData == null", "");
        } else if (!this.c.a(soIndexData.getAppVersion())) {
            RSoLog.c("performLastIndex, skip, only allow major app version. curr ver = " + soIndexData.getAppVersion());
        } else {
            ArrayList arrayList = new ArrayList(this.g);
            if (arrayList.size() > 0 && iks.a(arrayList, new iks.a<SoIndexData>() { // from class: com.taobao.android.remoteso.index.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iks.a
                public boolean a(SoIndexData soIndexData2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d2c319d4", new Object[]{this, soIndexData2})).booleanValue() : ikw.a((CharSequence) soIndexData.getAppVersion(), (CharSequence) soIndexData2.getAppVersion());
                }
            })) {
                RSoLog.c("performLastIndex, skip, currentIndexData has added, version = " + soIndexData.getAppVersion());
                return;
            }
            SoIndexData soIndexData2 = new SoIndexData();
            soIndexData2.setAppVersion(soIndexData.getAppVersion());
            for (Map.Entry<String, SoIndexData.SoIndexEntry> entry : soIndexData.getEntries().entrySet()) {
                String key = entry.getKey();
                if (ijn.b(this.d, key)) {
                    soIndexData2.getEntries().put(key, entry.getValue());
                }
            }
            arrayList.add(0, soIndexData2);
            a(arrayList);
        }
    }

    private void a(List<SoIndexData> list) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        int a2 = (int) this.d.a("key_last_index_info_count_max", 2L);
        RSoLog.c("performLastIndex, add finish, lastIndexList = " + list);
        if (list.size() > a2) {
            list = list.subList(0, a2);
        }
        String jSONString = JSON.toJSONString(list);
        iku.a(e(), jSONString);
        RSoLog.c("performLastIndex, write finish, jsonString = " + jSONString);
    }

    private File e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("b2a84a21", new Object[]{this}) : new File(this.e.a(), "last_index");
    }
}
