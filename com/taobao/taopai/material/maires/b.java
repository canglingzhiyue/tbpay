package com.taobao.taopai.material.maires;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.maires.MaiResDependenceList;
import com.taobao.taopai.material.maires.b;
import com.taobao.taopai.material.maires.c;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.business.maires.MaiResResponseModel;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pzc;
import tb.qbr;
import tb.qbs;
import tb.rsk;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private String f22067a;
    private String b;
    private int c;
    private a e;
    private Map<String, MaiResDependenceList.MaiResDependenceItem> f = new HashMap();
    private Map<String, Long> g = new HashMap();
    private final Runnable h = new Runnable() { // from class: com.taobao.taopai.material.maires.-$$Lambda$b$mNzHt3FbMDgIdL7tn2tGrZgi3oU
        {
            b.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.lambda$mNzHt3FbMDgIdL7tn2tGrZgi3oU(b.this);
        }
    };
    private final Handler d = new Handler(Looper.getMainLooper());

    static {
        kge.a(26531185);
    }

    public static /* synthetic */ void lambda$4x0JA3IHyxKPAhUSHokDMHalcV8(b bVar) {
        bVar.c();
    }

    public static /* synthetic */ void lambda$mNzHt3FbMDgIdL7tn2tGrZgi3oU(b bVar) {
        bVar.d();
    }

    public static /* synthetic */ void lambda$qhkMjsbwmkbVjYazcdwE7bLtnjE(b bVar, MaiResDependenceList.MaiResDependenceItem maiResDependenceItem, String str, MaiResResponseModel maiResResponseModel) {
        bVar.a(maiResDependenceItem, str, maiResResponseModel);
    }

    /* renamed from: lambda$r7sDd-SEv8TDMIK7vyES2FLcQhU */
    public static /* synthetic */ void m1410lambda$r7sDdSEv8TDMIK7vyES2FLcQhU(b bVar, Throwable th) {
        bVar.a(th);
    }

    public static /* synthetic */ a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("11afdd6b", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ void a(b bVar, MaiResDependenceList maiResDependenceList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed2f26", new Object[]{bVar, maiResDependenceList});
        } else {
            bVar.a(maiResDependenceList);
        }
    }

    public static /* synthetic */ Map b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4e2175ad", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ boolean c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a7338a9b", new Object[]{bVar})).booleanValue() : bVar.a();
    }

    public static /* synthetic */ void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae98bfb6", new Object[]{bVar});
        } else {
            bVar.b();
        }
    }

    public static /* synthetic */ Handler e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("5b097d1", new Object[]{bVar}) : bVar.d;
    }

    public /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(1, "timeout");
    }

    public b(Context context) {
    }

    public void a(String str, String str2, int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a2cabb", new Object[]{this, str, str2, new Integer(i), aVar});
        } else {
            a(str, str, 1, str2, i, aVar);
        }
    }

    public void a(String str, String str2, int i, String str3, int i2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586a9090", new Object[]{this, str, str2, new Integer(i), str3, new Integer(i2), aVar});
        } else if (StringUtils.isEmpty(str3)) {
            aVar.a(-3, "params invalid");
        } else {
            this.g.clear();
            this.f.clear();
            this.b = str;
            this.f22067a = str2;
            this.c = i;
            this.e = aVar;
            a(i2);
            a(str3);
        }
    }

    public void a(final String str, final int i, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        String str3 = "onDownLoaderFinish " + str + ", code = " + i + " msg = " + str2;
        this.d.post(new Runnable() { // from class: com.taobao.taopai.material.maires.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (b.a(b.this) == null || !b.b(b.this).containsKey(str)) {
                } else {
                    if (i != 0) {
                        b.a(b.this).a(i, str2);
                        b.d(b.this);
                        return;
                    }
                    ((MaiResDependenceList.MaiResDependenceItem) b.b(b.this).get(str)).isDownloadSuccess = true;
                    if (!b.c(b.this)) {
                        return;
                    }
                    b.a(b.this).a();
                    b.d(b.this);
                }
            }
        });
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        for (String str : this.f.keySet()) {
            if (!this.f.get(str).isDownloadSuccess) {
                return false;
            }
        }
        return true;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.d.removeCallbacks(this.h);
        this.d.postDelayed(this.h, (i >= 1000 || i <= 0) ? 120000L : i * 1000);
    }

    /* renamed from: com.taobao.taopai.material.maires.b$2 */
    /* loaded from: classes8.dex */
    public class AnonymousClass2 implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void lambda$nJ8iMZhrOByhf0Uq0ZQHFnWmhog(AnonymousClass2 anonymousClass2, int i) {
            anonymousClass2.b(i);
        }

        public AnonymousClass2() {
            b.this = r1;
        }

        @Override // com.taobao.taopai.material.maires.c.a
        public void a(MaiResDependenceList maiResDependenceList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be490235", new Object[]{this, maiResDependenceList});
            } else {
                b.a(b.this, maiResDependenceList);
            }
        }

        @Override // com.taobao.taopai.material.maires.c.a
        public void a(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                b.e(b.this).post(new Runnable() { // from class: com.taobao.taopai.material.maires.-$$Lambda$b$2$nJ8iMZhrOByhf0Uq0ZQHFnWmhog
                    {
                        b.AnonymousClass2.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        b.AnonymousClass2.lambda$nJ8iMZhrOByhf0Uq0ZQHFnWmhog(b.AnonymousClass2.this, i);
                    }
                });
            }
        }

        public /* synthetic */ void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                return;
            }
            if (b.a(b.this) != null) {
                b.a(b.this).a(i, "read config fail");
            }
            b.d(b.this);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            new c().a(str, new AnonymousClass2());
        }
    }

    private void a(MaiResDependenceList maiResDependenceList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be490235", new Object[]{this, maiResDependenceList});
        } else if (maiResDependenceList == null || maiResDependenceList.mDependenceList == null || maiResDependenceList.mDependenceList.isEmpty()) {
            pzc.a(new Runnable() { // from class: com.taobao.taopai.material.maires.-$$Lambda$b$4x0JA3IHyxKPAhUSHokDMHalcV8
                {
                    b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.lambda$4x0JA3IHyxKPAhUSHokDMHalcV8(b.this);
                }
            });
        } else {
            for (MaiResDependenceList.MaiResDependenceItem maiResDependenceItem : maiResDependenceList.mDependenceList) {
                if (StringUtils.equals(maiResDependenceItem.type, "algorithm")) {
                    String str = maiResDependenceItem.type + "_" + maiResDependenceItem.name;
                    this.f.put(str, maiResDependenceItem);
                    a(str, maiResDependenceItem);
                } else if (StringUtils.equals(maiResDependenceItem.type, "font")) {
                    String valueOf = String.valueOf(maiResDependenceItem.id);
                    this.f.put(valueOf, maiResDependenceItem);
                    a(maiResDependenceItem.materialType, maiResDependenceItem.version, String.valueOf(maiResDependenceItem.id), maiResDependenceItem.url, valueOf);
                }
            }
        }
    }

    public /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.e.a();
        }
    }

    private void a(final String str, final MaiResDependenceList.MaiResDependenceItem maiResDependenceItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3d7a38", new Object[]{this, str, maiResDependenceItem});
        } else {
            MaterialDataServer.a(this.b, this.f22067a, this.c).a(maiResDependenceItem.materialGroup, maiResDependenceItem.materialType, str).subscribe(new rsk() { // from class: com.taobao.taopai.material.maires.-$$Lambda$b$qhkMjsbwmkbVjYazcdwE7bLtnjE
                public final void accept(Object obj) {
                    b.lambda$qhkMjsbwmkbVjYazcdwE7bLtnjE(b.this, maiResDependenceItem, str, (MaiResResponseModel) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.maires.-$$Lambda$b$r7sDd-SEv8TDMIK7vyES2FLcQhU
                {
                    b.this = this;
                }

                public final void accept(Object obj) {
                    b.m1410lambda$r7sDdSEv8TDMIK7vyES2FLcQhU(b.this, (Throwable) obj);
                }
            });
        }
    }

    public /* synthetic */ void a(MaiResDependenceList.MaiResDependenceItem maiResDependenceItem, String str, MaiResResponseModel maiResResponseModel) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598a7fef", new Object[]{this, maiResDependenceItem, str, maiResResponseModel});
        } else if (maiResResponseModel != null && !StringUtils.isEmpty(maiResResponseModel.resourceUrl)) {
            String str2 = "mai download url = " + maiResResponseModel.resourceUrl;
            this.g.put(maiResDependenceItem.name, Long.valueOf(SystemClock.elapsedRealtime()));
            maiResDependenceItem.url = maiResResponseModel.resourceUrl;
            maiResDependenceItem.version = maiResResponseModel.version;
            a(maiResResponseModel.materialType, maiResResponseModel.version, String.valueOf(maiResResponseModel.id), maiResResponseModel.resourceUrl, str);
        } else {
            a aVar = this.e;
            if (aVar == null) {
                return;
            }
            aVar.a(6, "data is empty");
            b();
        }
    }

    public /* synthetic */ void a(Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(6, th.getMessage());
        }
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d.removeCallbacks(this.h);
        this.e = null;
    }

    private void a(int i, int i2, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a772ea6", new Object[]{this, new Integer(i), new Integer(i2), str, str2, str3});
            return;
        }
        String b = qbs.b(str3, false);
        if (!StringUtils.isEmpty(b) && new File(b).exists()) {
            String valueOf = String.valueOf(str2.hashCode());
            File[] listFiles = new File(b).listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    if (StringUtils.equals(valueOf, file.getName()) && qbr.a(file)) {
                        String str4 = "find cache resource " + valueOf;
                        a(str3, 0, "");
                        return;
                    }
                }
            }
        }
        String str5 = "not find cache resource, start download " + str2;
        b(i, i2, str, str2, str3);
    }

    private void b(int i, int i2, String str, String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eccf27", new Object[]{this, new Integer(i), new Integer(i2), str, str2, str3});
            return;
        }
        com.taobao.taopai.material.request.materialfile.a aVar = new com.taobao.taopai.material.request.materialfile.a() { // from class: com.taobao.taopai.material.maires.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // com.taobao.taopai.material.request.materialfile.a
            public void a(String str4, String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str4, str5});
                    return;
                }
                String str6 = " success path = " + str5;
                b.this.a(str3, 0, "");
            }

            @Override // com.taobao.taopai.material.request.materialfile.a
            public void a(String str4, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8123ad11", new Object[]{this, str4, new Integer(i3)});
                    return;
                }
                String str5 = " progress = " + i3;
            }

            @Override // com.taobao.taopai.material.request.materialfile.a
            public void a(String str4, String str5, String str6) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str4, str5, str6});
                    return;
                }
                String str7 = "download error " + str5 + "|" + str6;
                String str8 = " fail = " + str7;
                b.this.a(str3, -1, str7);
            }
        };
        com.taobao.taopai.material.request.materialfile.b bVar = new com.taobao.taopai.material.request.materialfile.b(i, i2, str, str2);
        bVar.a(false);
        bVar.d(qbs.a(str3, str2));
        new com.taobao.taopai2.material.business.res.d(bVar, aVar).a();
    }
}
