package com.taobao.android.mediapick;

import android.content.Context;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.Media;
import java.util.ArrayList;
import java.util.List;
import tb.hsp;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ALL = 0;
    public static final int TYPE_IMAGE = 1;
    public static final int TYPE_VIDEO = 2;

    /* renamed from: a  reason: collision with root package name */
    private int f14232a;
    public List<a> h;
    public List<? extends Media> i;
    public Context j;
    public hsp k;

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-1519308461);
    }

    public abstract List<? extends Media> a();

    public void a(Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dd02fb", new Object[]{this, media});
        }
    }

    public boolean b(Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57572940", new Object[]{this, media})).booleanValue();
        }
        return false;
    }

    public d(int i) {
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = new hsp() { // from class: com.taobao.android.mediapick.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.hsp
            public void a(Media media) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e1dd02fb", new Object[]{this, media});
                } else {
                    d.this.a(media);
                }
            }

            @Override // tb.hsp
            public boolean b(Media media) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57572940", new Object[]{this, media})).booleanValue() : d.this.b(media);
            }
        };
        this.f14232a = i;
    }

    public d() {
        this(0);
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.f14232a;
    }

    public hsp h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hsp) ipChange.ipc$dispatch("44e12e92", new Object[]{this}) : this.k;
    }

    public List<? extends Media> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this}) : this.i;
    }

    public Context j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e9631be9", new Object[]{this}) : this.j;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.j = context;
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            l();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.android.mediapick.d$2] */
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            new AsyncTask<Void, Void, List<? extends Media>>() { // from class: com.taobao.android.mediapick.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == -1325021319) {
                        super.onPostExecute(objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List<? extends com.taobao.android.mediapick.media.Media>] */
                @Override // android.os.AsyncTask
                public /* synthetic */ List<? extends Media> doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(List<? extends Media> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, list});
                    } else {
                        a(list);
                    }
                }

                public List<? extends Media> a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (List) ipChange2.ipc$dispatch("ed23ac73", new Object[]{this, voidArr}) : d.this.a();
                }

                public void a(List<? extends Media> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                        return;
                    }
                    super.onPostExecute(list);
                    d dVar = d.this;
                    dVar.i = list;
                    dVar.m();
                }
            }.execute(new Void[0]);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908fa7b3", new Object[]{this, aVar});
        } else if (this.h.contains(aVar)) {
        } else {
            this.h.add(aVar);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59909ef4", new Object[]{this, aVar});
        } else {
            this.h.remove(aVar);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        for (a aVar : this.h) {
            aVar.a();
        }
    }
}
