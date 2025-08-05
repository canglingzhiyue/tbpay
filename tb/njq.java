package tb;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.popupcenter.strategy.PopStrategyGroup;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes7.dex */
public class njq implements Handler.Callback, njm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean h;
    public njt d;
    public String e;
    public boolean i;

    /* renamed from: a  reason: collision with root package name */
    public Queue<njr> f31504a = new ConcurrentLinkedQueue();
    public Queue<njr> b = new ConcurrentLinkedQueue();
    public Queue<njs> c = new ConcurrentLinkedQueue();
    public Handler f = new Handler(Looper.getMainLooper(), this);
    public boolean g = true;

    public static /* synthetic */ void a(njq njqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6541c83", new Object[]{njqVar});
        } else {
            njqVar.g();
        }
    }

    public njq(String str, njt njtVar) {
        this.e = str;
        this.d = njtVar;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            njn.a("com.taobao.tao.homepage.HomepageFragment").c();
        }
    }

    @Override // tb.njm
    public boolean a(njr njrVar) {
        PopStrategyGroup a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f65490e6", new Object[]{this, njrVar})).booleanValue();
        }
        if (njrVar == null) {
            return false;
        }
        String str = "addPopOperation:" + njrVar.getClass() + ", identify:" + njrVar.a() + ", page:" + this.e;
        njt njtVar = this.d;
        if (njtVar == null || (a2 = njtVar.a(this.e)) == null) {
            try {
                njrVar.b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return true;
        } else if ((njrVar instanceof Activity) || (njrVar instanceof Fragment)) {
            throw new RuntimeException("Can not use Activity or Fragment as operation");
        } else {
            if (c(njrVar)) {
                return true;
            }
            if (a2.getStrategyByIdentifier(njrVar.a()).showDirect) {
                this.b.add(njrVar);
                g();
            } else {
                this.f31504a.add(njrVar);
                this.f.post(new Runnable() { // from class: tb.njq.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            njq.a(njq.this);
                        }
                    }
                });
            }
            return true;
        }
    }

    @Override // tb.njm
    public boolean b(njr njrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4d79767", new Object[]{this, njrVar})).booleanValue();
        }
        if (njrVar == null) {
            return false;
        }
        String str = "finishPopOperation: identify:" + njrVar.a() + ", page:" + this.e + ", removeResult:" + d(njrVar) + "currentShowing:" + this.c;
        g();
        return true;
    }

    @Override // tb.njm
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (h) {
        } else {
            h = true;
            g();
        }
    }

    @Override // tb.njm
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.g) {
        } else {
            this.g = true;
            f();
            njt njtVar = this.d;
            if (njtVar == null || njtVar.a(this.e) == null) {
                return;
            }
            g();
            String str = "resume page:" + this.e + ", isActive:" + this.g;
        }
    }

    @Override // tb.njm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.g) {
            this.g = false;
            Queue<njs> queue = this.c;
            if (queue != null && queue.size() > 0) {
                for (njs njsVar : this.c) {
                    if (njsVar.f31506a != null) {
                        b(njsVar.f31506a);
                    }
                }
                this.c.clear();
            }
            String str = "pause page:" + this.e + ", isActive:" + this.g;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 17) {
            PopStrategyGroup a2 = this.d.a(this.e);
            if (a2 != null && !a2.isFirstShowFinish) {
                a2.isFirstShowFinish = true;
                if (this.g) {
                    g();
                }
            }
        } else if (i == 18) {
            c();
        }
        return false;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        boolean z = !this.c.isEmpty();
        if (!z) {
            return z;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = null;
        for (njs njsVar : this.c) {
            if (!njsVar.b()) {
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue();
                }
                concurrentLinkedQueue.add(njsVar);
            } else {
                d(njsVar.f31506a);
            }
        }
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            this.c.clear();
            return false;
        }
        this.c = concurrentLinkedQueue;
        return z;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.c.isEmpty()) {
            for (njs njsVar : this.c) {
                njsVar.b = System.currentTimeMillis();
            }
        }
    }

    private synchronized void g() {
        PopStrategyGroup a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!h) {
            String str = "Current page:" + this.e + " is not start, suspend";
        } else if (!this.g) {
            String str2 = "Current page:" + this.e + " is not active, suspend";
        } else {
            if (this.d != null && (a2 = this.d.a(this.e)) != null) {
                if (e()) {
                    String str3 = "isShowing, showOperation=" + this.c;
                    return;
                }
                njr a3 = a(a2);
                if (a3 == null) {
                    String str4 = "no next operation., currentShowing:" + this.c;
                    return;
                }
                String str5 = "next operation:" + a3.a() + ", currentShowing:" + this.c;
                PopStrategy strategyByIdentifier = a2.getStrategyByIdentifier(a3.a());
                if (!a2.isFirstShowFinish && !strategyByIdentifier.showDirect && !strategyByIdentifier.firstShow) {
                    return;
                }
                if (!h && !strategyByIdentifier.showDirect) {
                    String str6 = "Current page:" + this.e + " is not start, suspend";
                    return;
                }
                String str7 = "show operation: identify:" + a3.a() + ", page:" + this.e;
                this.c.add(new njs(a3, System.currentTimeMillis()));
                a3.b();
                a(a3, this.e);
            }
        }
    }

    private static void a(njr njrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7380062c", new Object[]{njrVar, str});
            return;
        }
        Application a2 = njo.a();
        if (a2 == null) {
            return;
        }
        Intent intent = new Intent("popcenter.popShow");
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put("pageName", (Object) str);
        jSONObject.put("popOperation", (Object) njrVar);
        intent.putExtra("data", jSONObject);
        LocalBroadcastManager.getInstance(a2).sendBroadcast(intent);
    }

    private njr a(PopStrategyGroup popStrategyGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njr) ipChange.ipc$dispatch("6ab612af", new Object[]{this, popStrategyGroup});
        }
        if (!this.b.isEmpty()) {
            return this.b.iterator().next();
        }
        if (!this.i) {
            this.i = true;
            if (!popStrategyGroup.isFirstShowFinish) {
                String str = "start timeout=" + popStrategyGroup.showFirstTimeout;
                this.f.sendEmptyMessageDelayed(17, popStrategyGroup.showFirstTimeout);
            }
            this.f.sendEmptyMessageDelayed(18, 1000L);
        }
        njr njrVar = null;
        if (this.f31504a.isEmpty()) {
            return null;
        }
        for (njr njrVar2 : this.f31504a) {
            njrVar = njrVar == null ? njrVar2 : a(njrVar, njrVar2);
        }
        if (!njrVar.c()) {
            return njrVar;
        }
        b(njrVar);
        return a(popStrategyGroup);
    }

    private boolean c(njr njrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d35a9de8", new Object[]{this, njrVar})).booleanValue();
        }
        if (njrVar == null) {
            return false;
        }
        return this.b.contains(njrVar) || this.f31504a.contains(njrVar);
    }

    private boolean d(njr njrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1dda469", new Object[]{this, njrVar})).booleanValue();
        }
        if (njrVar == null) {
            return false;
        }
        this.c.remove(new njs(njrVar, 0L));
        return this.b.remove(njrVar) || this.f31504a.remove(njrVar);
    }

    private njr a(njr njrVar, njr njrVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (njr) ipChange.ipc$dispatch("198e1834", new Object[]{this, njrVar, njrVar2}) : njrVar == njrVar2 ? njrVar : (njrVar == null || njrVar.c()) ? njrVar2 : (njrVar2 == null || njrVar2.c() || this.d.a(this.e).compare(njrVar.a(), njrVar2.a()) >= 0) ? njrVar : njrVar2;
    }
}
