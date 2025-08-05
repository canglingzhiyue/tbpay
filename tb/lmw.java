package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import java.util.HashMap;
import java.util.Map;
import tb.shm;
import tb.snd;

/* loaded from: classes5.dex */
public class lmw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private tih f30725a;

    static {
        kge.a(1535796732);
    }

    public static /* synthetic */ void a(lmw lmwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3176c02", new Object[]{lmwVar});
        } else {
            lmwVar.a();
        }
    }

    public static /* synthetic */ void a(lmw lmwVar, psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a6211e", new Object[]{lmwVar, pswVar});
        } else {
            lmwVar.a(pswVar);
        }
    }

    public static /* synthetic */ tih b(lmw lmwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tih) ipChange.ipc$dispatch("fee9ec70", new Object[]{lmwVar}) : lmwVar.f30725a;
    }

    public lmw(final FluidContext fluidContext) {
        ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(new snd.a() { // from class: tb.lmw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 188604040) {
                    super.onStop();
                    return null;
                } else if (hashCode != 2133689546) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onStart();
                    return null;
                }
            }

            @Override // tb.snd.a, tb.snd
            public void onStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                    return;
                }
                super.onStart();
                psw activeCard = ((ICardService) fluidContext.getService(ICardService.class)).getActiveCard();
                if (activeCard == null || activeCard.c() != 2) {
                    return;
                }
                lmw.a(lmw.this, activeCard);
            }

            @Override // tb.snd.a, tb.snd
            public void onStop() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                    return;
                }
                super.onStop();
                psw activeCard = ((ICardService) fluidContext.getService(ICardService.class)).getActiveCard();
                if (activeCard == null || activeCard.c() != 2) {
                    return;
                }
                lmw.a(lmw.this);
            }
        });
        ((ICardService) fluidContext.getService(ICardService.class)).addCardLifecycleListener(new shm.a() { // from class: tb.lmw.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1294174408) {
                    super.onDisActive((psw) objArr[0]);
                    return null;
                } else if (hashCode != -893732120) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onActive((psw) objArr[0]);
                    return null;
                }
            }

            @Override // tb.shm.a, tb.shm
            public void onActive(psw pswVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
                    return;
                }
                super.onActive(pswVar);
                if (pswVar.c() != 2) {
                    return;
                }
                lmw.a(lmw.this, pswVar);
            }

            @Override // tb.shm.a, tb.shm
            public void onDisActive(psw pswVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
                    return;
                }
                super.onDisActive(pswVar);
                if (pswVar.c() != 2 || lmw.b(lmw.this) == null) {
                    return;
                }
                lmw.a(lmw.this);
            }
        });
    }

    private void a(psw pswVar) {
        MediaContentDetailData i;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3f5b84", new Object[]{this, pswVar});
            return;
        }
        HashMap hashMap = new HashMap();
        a.c D = pswVar.D();
        if (D == null || (i = D.i()) == null || (map = i.utPairs) == null) {
            return;
        }
        hashMap.put("isAD", map.get("is_ad"));
        hashMap.put("livesource", map.get("livesource"));
        hashMap.put("entryLiveSource", map.get("entrylivesource"));
        hashMap.put("trackInfo", map.get("trackInfo"));
        tii tiiVar = new tii("tab2LiveCard", true, map.get("liveTopic"), i.id, (Map<String, String>) hashMap);
        tiiVar.g = sjt.F();
        spz.c("LivePMManager", "[pm埋点] card onActive, 开始订阅...");
        this.f30725a = new tih();
        this.f30725a.a(tiiVar);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f30725a == null) {
        } else {
            spz.c("LivePMManager", "[pm埋点] card onDisActive, 取消订阅...");
            this.f30725a.a();
            this.f30725a = null;
        }
    }
}
