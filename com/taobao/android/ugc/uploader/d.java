package com.taobao.android.ugc.uploader;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.e;
import com.uploader.export.g;
import com.uploader.export.i;
import com.uploader.export.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class d implements com.uploader.export.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f15727a;
    private g b;
    private List<UploaderTask> c;
    private boolean d;
    private int e;
    private int f;
    private List<a> g = new ArrayList();
    private int[] h;

    static {
        kge.a(1249321877);
        kge.a(1593071130);
    }

    @Override // com.uploader.export.d
    public void onCancel(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("227e67e0", new Object[]{this, iVar});
        }
    }

    @Override // com.uploader.export.d
    public void onPause(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a48f02", new Object[]{this, iVar});
        }
    }

    @Override // com.uploader.export.d
    public void onResume(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc5b564d", new Object[]{this, iVar});
        }
    }

    @Override // com.uploader.export.d
    public void onWait(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be90445", new Object[]{this, iVar});
        }
    }

    public d(g gVar, List<UploaderTask> list, c cVar) {
        this.f15727a = cVar;
        this.b = gVar;
        this.c = list;
        this.f = list.size();
        this.h = new int[this.f];
    }

    @Override // com.uploader.export.d
    public void onStart(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ee4d16", new Object[]{this, iVar});
        } else if (this.d) {
        } else {
            synchronized (this) {
                if (!this.d) {
                    this.d = true;
                }
            }
        }
    }

    @Override // com.uploader.export.d
    public void onSuccess(i iVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
            return;
        }
        synchronized (this) {
            this.e++;
            String str = "onSuccess = " + iVar.getFilePath() + "   " + eVar.b();
            a aVar = new a();
            aVar.f15728a = iVar;
            aVar.b = eVar;
            aVar.c = this.c.indexOf(iVar);
            this.g.add(aVar);
            if (this.e == this.f) {
                Collections.sort(this.g);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (a aVar2 : this.g) {
                    arrayList2.add(aVar2.f15728a);
                    arrayList.add(aVar2.b);
                }
                this.f15727a.a(arrayList2, arrayList);
            }
        }
    }

    @Override // com.uploader.export.d
    public void onFailure(i iVar, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
            return;
        }
        for (UploaderTask uploaderTask : this.c) {
            this.b.cancelAsync(uploaderTask);
        }
        String str = "onFailure = " + iVar.getFilePath() + "   " + jVar;
        this.f15727a.a(jVar);
    }

    @Override // com.uploader.export.d
    public void onProgress(i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b04c96", new Object[]{this, iVar, new Integer(i)});
            return;
        }
        synchronized (this) {
            this.h[this.c.indexOf(iVar)] = i;
            int i2 = 0;
            for (int i3 : this.h) {
                i2 += i3;
            }
            String str = "totalProgress = " + i2;
        }
    }

    /* loaded from: classes6.dex */
    public class a implements Comparable<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public i f15728a;
        public e b;
        public int c;

        static {
            kge.a(85889725);
            kge.a(415966670);
        }

        public a() {
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, aVar})).intValue() : a(aVar);
        }

        public int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62f23f1b", new Object[]{this, aVar})).intValue() : this.c - aVar.c;
        }
    }
}
