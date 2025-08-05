package com.taobao.tao.navigation;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class j extends AsyncTask<g, Void, List<g>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f20807a;
    private long b;

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute(objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ CountDownLatch a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("6c59dbb0", new Object[]{jVar}) : jVar.f20807a;
    }

    public static /* synthetic */ long b(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("930669dd", new Object[]{jVar})).longValue();
        }
        long j = jVar.b;
        jVar.b = j - 1;
        return j;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List<com.taobao.tao.navigation.g>] */
    @Override // android.os.AsyncTask
    public /* synthetic */ List<g> doInBackground(g[] gVarArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, gVarArr}) : a(gVarArr);
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(List<g> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, list});
        } else {
            a(list);
        }
    }

    public j(int i) {
        this.f20807a = new CountDownLatch(i);
        this.b = this.f20807a.getCount() <= 0 ? -1L : this.f20807a.getCount();
    }

    public final List<g> a(g... gVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef6e913f", new Object[]{this, gVarArr});
        }
        if (gVarArr.length <= 0) {
            return null;
        }
        for (final g gVar : gVarArr) {
            com.taobao.phenix.intf.b.h().a((String) gVar.d().first).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.navigation.j.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    j.a(j.this).countDown();
                    j.b(j.this);
                    gVar.b(succPhenixEvent.getDrawable());
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.navigation.j.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    j.a(j.this).countDown();
                    return true;
                }
            }).cancelListener(new com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.d>() { // from class: com.taobao.tao.navigation.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public boolean onHappen(com.taobao.phenix.intf.event.d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, dVar})).booleanValue();
                    }
                    j.a(j.this).countDown();
                    return true;
                }
            }).fetch();
            com.taobao.phenix.intf.b.h().a((String) gVar.d().second).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.navigation.j.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    j.a(j.this).countDown();
                    j.b(j.this);
                    gVar.a((Drawable) succPhenixEvent.getDrawable());
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.navigation.j.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    j.a(j.this).countDown();
                    return true;
                }
            }).cancelListener(new com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.d>() { // from class: com.taobao.tao.navigation.j.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public boolean onHappen(com.taobao.phenix.intf.event.d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, dVar})).booleanValue();
                    }
                    j.a(j.this).countDown();
                    return true;
                }
            }).fetch();
        }
        try {
            if (!this.f20807a.await(15L, TimeUnit.SECONDS)) {
                return null;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Arrays.asList(gVarArr);
    }

    public void a(List<g> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        super.onPostExecute(list);
        if (list == null) {
            return;
        }
        if (this.b == 0) {
            synchronized (e.class) {
                for (g gVar : list) {
                    if (gVar.n() == NavigationTabIconSourceType.URL) {
                        gVar.a(NavigationTabIconSourceType.DRAWABLE2);
                        int indexOf = e.f20801a.indexOf(gVar);
                        if (indexOf >= 0) {
                            e.f20801a.set(indexOf, gVar);
                        }
                    }
                }
            }
        }
        e.g();
    }
}
