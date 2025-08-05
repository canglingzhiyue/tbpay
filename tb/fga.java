package tb;

import android.app.Activity;
import android.net.Uri;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import com.taobao.android.fluid.framework.adapter.mtop.d;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.taolive.room.utils.ag;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import tb.shm;
import tb.skv;
import tb.snd;

/* loaded from: classes5.dex */
public class fga implements juq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f27915a;
    private final f<jup> b = new f<>();
    private final Map<psw, Map<String, String>> c = new WeakHashMap();
    private final Map<psw, Map<String, String>> d = new WeakHashMap();
    private String e;
    private String f;
    public Map<String, String> g;

    static {
        kge.a(-1830586174);
        kge.a(1321344465);
        kge.a(-954232114);
    }

    public static /* synthetic */ Map a(fga fgaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d4c0934d", new Object[]{fgaVar}) : fgaVar.c;
    }

    public static /* synthetic */ void a(fga fgaVar, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae441e4a", new Object[]{fgaVar, fluidContext});
        } else {
            fgaVar.c(fluidContext);
        }
    }

    public static /* synthetic */ Map b(fga fgaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e11a40e", new Object[]{fgaVar}) : fgaVar.d;
    }

    public static /* synthetic */ void b(fga fgaVar, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d8274b", new Object[]{fgaVar, fluidContext});
        } else {
            fgaVar.b(fluidContext);
        }
    }

    public static /* synthetic */ void c(fga fgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c581d81a", new Object[]{fgaVar});
        } else {
            fgaVar.c();
        }
    }

    public fga(FluidContext fluidContext) {
        this.f27915a = fluidContext;
    }

    public void a(jup jupVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01b4833", new Object[]{this, jupVar});
        } else if (jupVar == null) {
        } else {
            this.b.a(jupVar);
        }
    }

    public void b(jup jupVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9e4eb4", new Object[]{this, jupVar});
        } else if (jupVar == null) {
        } else {
            this.b.c(jupVar);
        }
    }

    public Map<String, String> a(psw pswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6998f6b9", new Object[]{this, pswVar}) : this.c.get(pswVar);
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        spz.c("CommonTrackManager", "updateCommonTrack -- " + map);
        if (map == null) {
            return;
        }
        if (this.g == null) {
            this.g = new HashMap();
        }
        this.g.putAll(map);
        for (Map<String, String> map2 : this.c.values()) {
            map2.putAll(this.g);
        }
        ICardService iCardService = (ICardService) this.f27915a.getService(ICardService.class);
        if (iCardService != null) {
            a(a(iCardService.getActiveCard()));
        }
        IMediaService iMediaService = (IMediaService) this.f27915a.getService(IMediaService.class);
        if (iMediaService == null) {
            return;
        }
        iMediaService.update12003UtParams(map);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        spz.c("CommonTrackManager", "resetAppendCommonTrack -- ");
        Map<String, String> map = this.g;
        if (map == null) {
            return;
        }
        map.clear();
    }

    public Map<String, String> b(psw pswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a2ea077a", new Object[]{this, pswVar}) : this.d.get(pswVar);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.e;
    }

    public void a(final FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{this, fluidContext});
            return;
        }
        ((ICardService) fluidContext.getService(ICardService.class)).addCardLifecycleListener(new shm.a() { // from class: tb.fga.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1355309186) {
                    super.onCreateView((psw) objArr[0], (snp) objArr[1]);
                    return null;
                } else if (hashCode != -893732120) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onActive((psw) objArr[0]);
                    return null;
                }
            }

            @Override // tb.shm.a, tb.shm
            public void onCreateView(psw pswVar, snp snpVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
                    return;
                }
                super.onCreateView(pswVar, snpVar);
                if (!fga.a(fga.this).containsKey(pswVar)) {
                    HashMap hashMap = new HashMap();
                    b.b(fluidContext, hashMap);
                    fga.a(fga.this).put(pswVar, hashMap);
                    psw activeCard = ((ICardService) fluidContext.getService(ICardService.class)).getActiveCard();
                    if (activeCard == null || activeCard == pswVar) {
                        fga.this.a(hashMap);
                    }
                }
                if (fga.b(fga.this).containsKey(pswVar)) {
                    return;
                }
                fga.b(fga.this).put(pswVar, new HashMap());
            }

            @Override // tb.shm.a, tb.shm
            public void onBindData(psw pswVar, a aVar, int i) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
                    return;
                }
                Map<String, String> map = (Map) fga.a(fga.this).get(pswVar);
                if (map != null) {
                    map.clear();
                    b.b(fluidContext, map);
                    b.a(fluidContext, map, pswVar.D());
                    b.a(map, pswVar.v().a(), ((IDataService) fluidContext.getService(IDataService.class)).isTab3CacheEnable());
                    if (pswVar instanceof sii) {
                        z = ((sii) pswVar).p().c().c();
                    }
                    b.b(fluidContext, z);
                    if (fga.this.g != null) {
                        map.putAll(fga.this.g);
                    }
                    psw activeCard = ((ICardService) fluidContext.getService(ICardService.class)).getActiveCard();
                    if (activeCard == null || activeCard == pswVar) {
                        fga.this.a(map);
                    }
                }
                Map map2 = (Map) fga.b(fga.this).get(pswVar);
                if (map2 == null) {
                    return;
                }
                noi.a(fluidContext, map2, pswVar.D(), pswVar.v().a());
            }

            @Override // tb.shm.a, tb.shm
            public void onActive(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cababae8", new Object[]{this, pswVar});
                    return;
                }
                super.onActive(pswVar);
                Map<String, String> map = (Map) fga.a(fga.this).get(pswVar);
                if (map == null) {
                    return;
                }
                fga.this.a(map);
            }

            @Override // tb.shm.a, tb.shm
            public void onBindData(psw pswVar, a aVar, int i, List list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
                } else {
                    onBindData(pswVar, aVar, i);
                }
            }
        });
        ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(new snd.a() { // from class: tb.fga.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -1512649357) {
                    super.onResume();
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.snd.a, tb.snd
            public void onResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5d6cd73", new Object[]{this});
                    return;
                }
                super.onResume();
                fga.a(fga.this, fluidContext);
                fga.b(fga.this, fluidContext);
            }
        });
        IDataService iDataService = (IDataService) fluidContext.getService(IDataService.class);
        if (iDataService == null) {
            return;
        }
        iDataService.addDetailRequestListener(new skv.a() { // from class: tb.fga.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.skv.a
            public void onStartRequest() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("adbafdd3", new Object[]{this});
                }
            }

            @Override // tb.skv.a
            public void onResult(d<Pair<a, MediaMixContentDetail>> dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1227a278", new Object[]{this, dVar});
                    return;
                }
                spz.c("CommonTrackManager", "onDetailRequest onResult ---");
                fga.c(fga.this);
            }
        });
    }

    @Override // tb.jup
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        for (jup jupVar : this.b.a()) {
            try {
                jupVar.a(map);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f27915a, jupVar, "onCommonTrackInfoChanged", e);
            }
        }
    }

    private void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{this, fluidContext});
        } else if (this.f != null) {
            spz.c("TrackUtils", "fs utparam-pre 已经取过utparam-pre，无需重复取");
        } else {
            com.taobao.tao.flexbox.layoutmanager.container.f pageInterface = ((IHostPageInterfaceService) fluidContext.getService(IHostPageInterfaceService.class)).getPageInterface();
            Object uTObject = pageInterface != null ? pageInterface.getUTObject() : fluidContext.getContext();
            if (!(uTObject instanceof Activity)) {
                return;
            }
            Map<String, String> pageAllProperties = FluidSDK.getUTAdapter().withFluidContext(fluidContext).getPageAllProperties((Activity) uTObject);
            spz.c("TrackUtils", "fs utparam-pre 设置 utContext = " + uTObject);
            if (!ogv.a(pageAllProperties)) {
                String str = pageAllProperties.get("utparam-pre");
                spz.c("TrackUtils", "fs utparam-pre 设置 = " + str);
                this.f = Uri.encode(str);
                return;
            }
            spz.c("TrackUtils", "fs utparam-url 设置 pageAllProperties = null");
        }
    }

    private void c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed73b9c", new Object[]{this, fluidContext});
        } else if (this.e != null) {
            spz.c("TrackUtils", "fs utparam-url 已经取过utparam-url，无需重复取");
        } else {
            com.taobao.tao.flexbox.layoutmanager.container.f pageInterface = ((IHostPageInterfaceService) fluidContext.getService(IHostPageInterfaceService.class)).getPageInterface();
            Object uTObject = pageInterface != null ? pageInterface.getUTObject() : fluidContext.getContext();
            if (!(uTObject instanceof Activity)) {
                return;
            }
            Map<String, String> pageAllProperties = FluidSDK.getUTAdapter().withFluidContext(fluidContext).getPageAllProperties((Activity) uTObject);
            spz.c("TrackUtils", "fs utparam-url 设置 utContext = " + uTObject);
            if (!ogv.a(pageAllProperties)) {
                String str = pageAllProperties.get(ag.KEY_UTPARAM_URL);
                spz.c("TrackUtils", "fs utparam-url 设置 = " + str);
                this.e = Uri.encode(str);
                return;
            }
            spz.c("TrackUtils", "fs utparam-url 设置 pageAllProperties = null");
        }
    }
}
