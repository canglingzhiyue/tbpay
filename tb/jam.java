package tb;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.layoutmanager.adapter.impl.p;
import com.taobao.mediaplay.k;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import tb.stz;

/* loaded from: classes5.dex */
public class jam {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final sic f29432a;
    private final FluidContext b;
    private IMessageService c;
    private snv d;

    /* loaded from: classes5.dex */
    public interface a {
        void a(k kVar);
    }

    static {
        kge.a(1811526424);
    }

    public static /* synthetic */ sic a(jam jamVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sic) ipChange.ipc$dispatch("cfed817", new Object[]{jamVar}) : jamVar.f29432a;
    }

    public static /* synthetic */ void a(jam jamVar, Map map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b6f4c0", new Object[]{jamVar, map, aVar});
        } else {
            jamVar.a(map, aVar);
        }
    }

    public static /* synthetic */ snv b(jam jamVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("f4a0c388", new Object[]{jamVar}) : jamVar.d;
    }

    public jam(sic sicVar) {
        this.f29432a = sicVar;
        this.b = sicVar.z();
        FluidContext fluidContext = this.b;
        if (fluidContext != null) {
            this.c = (IMessageService) fluidContext.getService(IMessageService.class);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableImmersiveLiveJumpV3", true);
    }

    public static boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        return !(p.b() == 2) && a() && c() && !z;
    }

    public void a(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff16fb7d", new Object[]{this, snvVar});
        } else {
            this.d = snvVar;
        }
    }

    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e23d4a5", new Object[]{this, aVar});
            return;
        }
        IMessageService iMessageService = this.c;
        if (iMessageService == null) {
            return;
        }
        iMessageService.addMessageListener("VSMSG_navToLiveRoom", new juy() { // from class: tb.jam.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.juy
            public void a(spy spyVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
                } else if (spyVar == null || !jam.a(jam.this).H()) {
                } else {
                    spz.c("LiveSharePlayerUtils", "LiveSharePlayer 卡片收到监听addNaviGoLiveRoomMsgListener,idwInstance：" + jam.b(jam.this));
                    jam.a(jam.this, spyVar.i, aVar);
                }
            }
        });
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IMessageService iMessageService = this.c;
        if (iMessageService == null) {
            return;
        }
        iMessageService.removeMessageListener("VSMSG_navToLiveRoom", new juy() { // from class: tb.jam.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.juy
            public void a(spy spyVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
                } else {
                    spz.c("LiveSharePlayerUtils", "LiveSharePlayer 移除消息监听");
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.Map r9, tb.jam.a r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jam.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            r2 = 1
            r1[r2] = r9
            r9 = 2
            r1[r9] = r10
            java.lang.String r9 = "e9a19c1a"
            r0.ipc$dispatch(r9, r1)
            return
        L18:
            java.lang.String r0 = "url"
            java.lang.Object r0 = r9.get(r0)
            r1 = 0
            java.lang.String r5 = tb.oec.a(r0, r1)
            boolean r0 = android.text.StringUtils.isEmpty(r5)
            if (r0 == 0) goto L2a
            return
        L2a:
            java.lang.String r0 = "nativeParams"
            java.lang.Object r9 = r9.get(r0)     // Catch: java.lang.Exception -> L67
            boolean r0 = r9 instanceof com.alibaba.fastjson.JSONObject     // Catch: java.lang.Exception -> L67
            if (r0 == 0) goto L65
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Exception -> L67
            r0.<init>()     // Catch: java.lang.Exception -> L67
            com.alibaba.fastjson.JSONObject r9 = (com.alibaba.fastjson.JSONObject) r9     // Catch: java.lang.Exception -> L63
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Exception -> L63
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L63
        L43:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Exception -> L63
            if (r1 == 0) goto L83
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Exception -> L63
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Exception -> L63
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Exception -> L63
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L63
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L63
            if (r1 == 0) goto L43
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L63
            r0.putString(r2, r1)     // Catch: java.lang.Exception -> L63
            goto L43
        L63:
            r9 = move-exception
            goto L69
        L65:
            r0 = r1
            goto L83
        L67:
            r9 = move-exception
            r0 = r1
        L69:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "naviGoLiveRoom e="
            r1.append(r2)
            java.lang.String r9 = r9.getMessage()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.String r1 = "LiveSharePlayerUtils"
            tb.spz.c(r1, r9)
        L83:
            r6 = r0
            com.taobao.android.fluid.core.FluidContext r9 = r8.b
            android.content.Context r4 = r9.getContext()
            com.taobao.android.fluid.core.FluidContext r9 = r8.b
            boolean r9 = a(r9)
            boolean r9 = a(r9)
            if (r9 != 0) goto La0
            com.taobao.android.fluid.framework.adapter.INavAdapter r9 = com.taobao.android.fluid.FluidSDK.getNavAdapter()
            com.taobao.android.fluid.core.FluidContext r10 = r8.b
            r9.nav(r10, r4, r5, r6)
            return
        La0:
            com.taobao.android.fluid.core.FluidContext r3 = r8.b
            r2 = r8
            r7 = r10
            r2.a(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jam.a(java.util.Map, tb.jam$a):void");
    }

    public void a(FluidContext fluidContext, Context context, String str, Bundle bundle, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a619a159", new Object[]{this, fluidContext, context, str, bundle, aVar});
            return;
        }
        snv snvVar = this.d;
        if (snvVar == null) {
            spz.c("LiveSharePlayerUtils", "idwInstance为null return");
            FluidSDK.getNavAdapter().nav(fluidContext, context, str, bundle);
            return;
        }
        try {
            k n = snvVar.n();
            String str2 = null;
            if (n != null) {
                str2 = n.c();
            }
            this.d.o();
            if (aVar != null) {
                aVar.a(n);
            }
            String a2 = stz.a().a(context, str2, n, new stz.a() { // from class: tb.jam.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.stz.a
                public void a(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                        return;
                    }
                    spz.c("LiveSharePlayerUtils", "onReuse: " + str3);
                }

                @Override // tb.stz.a
                public void b(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str3});
                        return;
                    }
                    spz.c("LiveSharePlayerUtils", "onRelease: " + str3);
                }
            });
            if (StringUtils.isEmpty(a2)) {
                spz.c("LiveSharePlayerUtils", "playViewToken为null 正常跳转，mediaPlayViewProxy：" + n);
                this.d.d();
                FluidSDK.getNavAdapter().nav(fluidContext, context, str, bundle);
                return;
            }
            String a3 = a(str, a2);
            spz.c("LiveSharePlayerUtils", "跳转buildUrl: " + a3);
            FluidSDK.getNavAdapter().navDisableTransition(fluidContext, context, a3, bundle);
        } catch (Exception e) {
            spz.a("LiveSharePlayerUtils", "immersiveLiveJump异常" + e.getMessage() + "\n", e);
            this.d.d();
            FluidSDK.getNavAdapter().nav(fluidContext, context, str, bundle);
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return str;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(aw.PARAM_PLAY_VIEW_TOKEN, str2);
        return ohk.a(str, hashMap);
    }

    private static boolean a(FluidContext fluidContext) {
        IDataService iDataService;
        a.b D;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue() : (fluidContext == null || (iDataService = (IDataService) fluidContext.getService(IDataService.class)) == null || iDataService.getCurrentMediaDetail() == null || (D = iDataService.getCurrentMediaDetail().D()) == null || !D.e()) ? false : true;
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        boolean equals = StringUtils.equals("true", oeb.b("AB_fullscreenpage_video.immersive_live_jump.isSharePlayer", String.valueOf(false)));
        spz.c("LiveSharePlayerUtils", "AB config enable:" + equals);
        return equals;
    }
}
