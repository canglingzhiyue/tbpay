package com.taobao.taopai2.material.business.res;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;
import java.io.File;
import tb.kge;
import tb.pzc;
import tb.qbt;
import tb.rsk;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DL_STATE_FAIL = 3;
    public static final int DL_STATE_IDLE = 0;
    public static final int DL_STATE_RUNNING = 1;
    public static final int DL_STATE_SUCCESS = 2;

    /* renamed from: a */
    private MaterialDataServer f22084a;
    private qbt b;
    private String c;
    private String d;
    private String e;
    private int f;

    static {
        kge.a(-564223451);
    }

    public static /* synthetic */ void lambda$ARhqr1nPglTthXdytzy2wYbVulM(c cVar, Throwable th) {
        cVar.a(th);
    }

    public static /* synthetic */ void lambda$eZ2Vs7zNaqvbArmUM3zk8Z9emNs(c cVar, MusicItemBean musicItemBean) {
        cVar.b(musicItemBean);
    }

    public static /* synthetic */ qbt a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qbt) ipChange.ipc$dispatch("ca33d253", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ void a(c cVar, a[] aVarArr, MusicResource musicResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4fc3e8", new Object[]{cVar, aVarArr, musicResource});
        } else {
            cVar.a(aVarArr, musicResource);
        }
    }

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a */
        public int f22090a;
        public int b;

        static {
            kge.a(1212525656);
        }

        private a() {
            this.f22090a = 0;
            this.b = 0;
        }
    }

    public c(String str, String str2, int i, String str3, MaterialDataServer materialDataServer, qbt qbtVar) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.f22084a = materialDataServer;
        this.b = qbtVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            b();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f22084a.a(this.c, this.d, this.e, this.f).subscribe(new rsk() { // from class: com.taobao.taopai2.material.business.res.-$$Lambda$c$eZ2Vs7zNaqvbArmUM3zk8Z9emNs
                public final void accept(Object obj) {
                    c.lambda$eZ2Vs7zNaqvbArmUM3zk8Z9emNs(c.this, (MusicItemBean) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai2.material.business.res.-$$Lambda$c$ARhqr1nPglTthXdytzy2wYbVulM
                {
                    c.this = this;
                }

                public final void accept(Object obj) {
                    c.lambda$ARhqr1nPglTthXdytzy2wYbVulM(c.this, (Throwable) obj);
                }
            });
        }
    }

    public /* synthetic */ void b(MusicItemBean musicItemBean) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af7b5d76", new Object[]{this, musicItemBean});
            return;
        }
        MusicResource a2 = a(musicItemBean);
        boolean z = !TextUtils.isEmpty(musicItemBean.waveformUrl);
        a[] aVarArr = z ? new a[2] : new a[1];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr[i] = new a();
        }
        a(musicItemBean, a2, z, aVarArr);
    }

    public /* synthetic */ void a(final Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
        } else {
            pzc.a(new Runnable() { // from class: com.taobao.taopai2.material.business.res.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    c.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a(c.this).a("exception", th.getMessage());
                    }
                }
            });
        }
    }

    private void a(final MusicItemBean musicItemBean, final MusicResource musicResource, final boolean z, final a[] aVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977d9b99", new Object[]{this, musicItemBean, musicResource, new Boolean(z), aVarArr});
            return;
        }
        com.taobao.taopai.material.request.materialfile.a aVar = new com.taobao.taopai.material.request.materialfile.a() { // from class: com.taobao.taopai2.material.business.res.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // com.taobao.taopai.material.request.materialfile.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                a[] aVarArr2 = aVarArr;
                aVarArr2[0].f22090a = 2;
                aVarArr2[0].b = 100;
                MusicResource musicResource2 = musicResource;
                musicResource2.musicPath = str2;
                if (z) {
                    a();
                } else {
                    c.a(c.this, aVarArr2, musicResource2);
                }
            }

            private void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                File c = b.c(musicItemBean.id, musicItemBean.audioId);
                if (c != null && c.exists()) {
                    a[] aVarArr2 = aVarArr;
                    aVarArr2[1].f22090a = 2;
                    aVarArr2[1].b = 100;
                    musicResource.musicWavePath = c.getAbsolutePath();
                    c.a(c.this, aVarArr, musicResource);
                    return;
                }
                d dVar = new d(new com.taobao.taopai.material.request.materialfile.b(3, 0, musicItemBean.id, musicItemBean.waveformUrl), new com.taobao.taopai.material.request.materialfile.a() { // from class: com.taobao.taopai2.material.business.res.c.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taopai.material.request.materialfile.a
                    public void a(String str, int i) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                        }
                    }

                    {
                        AnonymousClass2.this = this;
                    }

                    @Override // com.taobao.taopai.material.request.materialfile.a
                    public void a(String str, String str2) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                            return;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            aVarArr[1].f22090a = 3;
                        } else if (!new File(str2).exists()) {
                            aVarArr[1].f22090a = 3;
                        } else {
                            aVarArr[1].f22090a = 2;
                            aVarArr[1].b = 100;
                            musicResource.musicWavePath = str2;
                        }
                        c.a(c.this, aVarArr, musicResource);
                    }

                    @Override // com.taobao.taopai.material.request.materialfile.a
                    public void a(String str, String str2, String str3) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                            return;
                        }
                        aVarArr[0].f22090a = 3;
                        c.a(c.this, aVarArr, musicResource);
                    }
                });
                dVar.a(false);
                dVar.a(new b() { // from class: com.taobao.taopai2.material.business.res.c.2.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        AnonymousClass2.this = this;
                    }

                    @Override // tb.qbq
                    public File a(String str, int i, String str2) {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? (File) ipChange3.ipc$dispatch("87a54452", new Object[]{this, str, new Integer(i), str2}) : b.c(musicItemBean.id, musicItemBean.audioId);
                    }
                });
                dVar.a();
            }

            @Override // com.taobao.taopai.material.request.materialfile.a
            public void a(String str, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                } else {
                    aVarArr[0].b = i;
                }
            }

            @Override // com.taobao.taopai.material.request.materialfile.a
            public void a(String str, final String str2, final String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                    return;
                }
                aVarArr[0].f22090a = 3;
                pzc.a(new Runnable() { // from class: com.taobao.taopai2.material.business.res.c.2.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        AnonymousClass2.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            c.a(c.this).a(str2, str3);
                        }
                    }
                });
            }
        };
        File b = b.b(musicItemBean.id, musicItemBean.audioId);
        if (b != null && b.exists()) {
            aVar.a(musicItemBean.id, b.getAbsolutePath());
            return;
        }
        d dVar = new d(new com.taobao.taopai.material.request.materialfile.b(3, 0, musicItemBean.id, musicItemBean.listenUrl), aVar);
        aVarArr[0].f22090a = 1;
        dVar.a(new b() { // from class: com.taobao.taopai2.material.business.res.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // tb.qbq
            public File a(String str, int i, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (File) ipChange2.ipc$dispatch("87a54452", new Object[]{this, str, new Integer(i), str2}) : b.b(musicItemBean.id, musicItemBean.audioId);
            }
        });
        dVar.a();
    }

    private static final MusicResource a(MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusicResource) ipChange.ipc$dispatch("ab19d4d9", new Object[]{musicItemBean});
        }
        MusicResource musicResource = new MusicResource();
        musicResource.id = musicItemBean.id;
        musicResource.audioId = musicItemBean.audioId;
        musicResource.soundId = musicItemBean.soundId;
        musicResource.artists = musicItemBean.artists;
        musicResource.duration = musicItemBean.duration;
        musicResource.liked = musicItemBean.liked;
        musicResource.logoUrl = musicItemBean.logoUrl;
        musicResource.name = musicItemBean.name;
        musicResource.vendorType = musicItemBean.vendorType;
        musicResource.filePath = musicItemBean.filePath;
        musicResource.downloadUrl = musicItemBean.downloadUrl;
        musicResource.listenUrl = musicItemBean.listenUrl;
        musicResource.subName = musicItemBean.subName;
        musicResource.waveformUrl = musicItemBean.waveformUrl;
        musicResource.refrainStartTime = musicItemBean.refrainStartTime;
        musicResource.refrainEndTime = musicItemBean.refrainEndTime;
        musicResource.directUseRefrain = musicItemBean.directUseRefrain;
        musicResource.refrainSource = musicItemBean.refrainSource;
        return musicResource;
    }

    private void a(a[] aVarArr, final MusicResource musicResource) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b79290", new Object[]{this, aVarArr, musicResource});
            return;
        }
        for (a aVar : aVarArr) {
            z &= a(aVar);
        }
        if (!z) {
            return;
        }
        pzc.a(new Runnable() { // from class: com.taobao.taopai2.material.business.res.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.a(c.this).a(musicResource);
                }
            }
        });
    }

    private boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9a62237", new Object[]{this, aVar})).booleanValue() : aVar.f22090a == 2 || aVar.f22090a == 3;
    }
}
