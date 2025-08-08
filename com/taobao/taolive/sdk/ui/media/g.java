package com.taobao.taolive.sdk.ui.media;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import tb.kge;
import tb.pmd;
import tb.sst;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MOCK_MEDIA_INFO_WHAT_RECYCLED = "MOCK_MEDIA_INFO_WHAT_RECYCLED";
    public static final int REASON_BY_TOKEN = 0;
    public static final int REASON_BY_TOPIC_ID = 1;
    public static final int REASON_NEW = 2;
    private static g b;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, com.taobao.taolive.sdk.ui.media.a<IMediaPlayer>> f21928a = new HashMap<>();

    static {
        kge.a(-1422634214);
    }

    public static /* synthetic */ HashMap a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("f31a9372", new Object[]{gVar}) : gVar.f21928a;
    }

    private g() {
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("6c87864f", new Object[0]);
        }
        if (b == null) {
            b = new g();
        }
        return b;
    }

    @Deprecated
    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : UUID.randomUUID().toString();
    }

    public a a(Context context, final String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d496a0b4", new Object[]{this, context, str, new Boolean(z)});
        }
        com.taobao.taolive.sdk.utils.m.a("PlayerRecycle", "old createPlayer token = " + str);
        a aVar = new a();
        if (!StringUtils.isEmpty(str) && this.f21928a.containsKey(str)) {
            com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar2 = this.f21928a.get(str);
            if (aVar2 != null) {
                if (z) {
                    aVar2.b();
                }
                aVar.f21932a = aVar2.a();
                aVar.b = 0;
            }
            com.taobao.taolive.sdk.utils.m.a("PlayerRecycle", "old createPlayer recycle by token mediaPlayer = " + aVar.f21932a);
        } else {
            com.taobao.taolive.sdk.ui.media.b b2 = pmd.a().b();
            if (b2 != null) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("enableOpenUseShortAudioFocus", String.valueOf(sst.a()));
                aVar.f21932a = b2.a(hashMap);
                aVar.b = 2;
                aVar.f21932a.a(context);
                if (!StringUtils.isEmpty(str)) {
                    this.f21928a.put(str, new com.taobao.taolive.sdk.ui.media.a<>(aVar.f21932a, new a.InterfaceC0911a<IMediaPlayer>() { // from class: com.taobao.taolive.sdk.ui.media.g.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.taolive.sdk.ui.media.a.InterfaceC0911a
                        public void a(com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar3, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("27154c0e", new Object[]{this, aVar3, new Integer(i)});
                                return;
                            }
                            IMediaPlayer a2 = aVar3.a();
                            if (a2 != null) {
                                a2.o();
                            }
                            g.a(g.this).remove(str);
                        }

                        @Override // com.taobao.taolive.sdk.ui.media.a.InterfaceC0911a
                        public void b(com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar3, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("b3b5770f", new Object[]{this, aVar3, new Integer(i)});
                                return;
                            }
                            IMediaPlayer a2 = aVar3.a();
                            if (a2 != null) {
                                a2.o();
                                a2.c();
                            }
                            g.a(g.this).remove(str);
                        }
                    }));
                }
                com.taobao.taolive.sdk.utils.m.a("PlayerRecycle", "old createPlayer generatePlayer ret = " + aVar.f21932a);
            }
        }
        return aVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar = this.f21928a.get(str);
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar = this.f21928a.get(str);
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f21928a.remove(str);
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue() : this.f21928a.containsKey(str);
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        return str + UUID.randomUUID().toString();
    }

    public a a(Context context, h hVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ae3db00", new Object[]{this, context, hVar, new Boolean(z), new Boolean(z2)});
        }
        com.taobao.taolive.sdk.utils.m.a("PlayerRecycle", "new createPlayer");
        a a2 = a(z2, hVar, z);
        com.taobao.taolive.sdk.utils.m.a("PlayerRecycle", "new createPlayer findPlayer ret = " + a2);
        if (a2 != null) {
            d(a2.f21932a);
        }
        if (a2 != null) {
            return a2;
        }
        a aVar = new a();
        IMediaPlayer a3 = a(context, hVar);
        com.taobao.taolive.sdk.utils.m.a("PlayerRecycle", "new createPlayer generatePlayer ret = " + a3);
        aVar.f21932a = a3;
        aVar.b = 2;
        return aVar;
    }

    public void a(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
        } else if (iMediaPlayer == null) {
        } else {
            com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar = null;
            Iterator<Map.Entry<String, com.taobao.taolive.sdk.ui.media.a<IMediaPlayer>>> it = this.f21928a.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> value = it.next().getValue();
                    if (value != null && value.a() == iMediaPlayer) {
                        aVar = value;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (aVar == null) {
                return;
            }
            aVar.c();
        }
    }

    public void b(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e8cb9f", new Object[]{this, iMediaPlayer});
        } else if (iMediaPlayer == null) {
        } else {
            com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar = null;
            Iterator<Map.Entry<String, com.taobao.taolive.sdk.ui.media.a<IMediaPlayer>>> it = this.f21928a.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> value = it.next().getValue();
                    if (value != null && value.a() == iMediaPlayer) {
                        aVar = value;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (aVar != null) {
                aVar.d();
            } else if (!com.taobao.taolive.sdk.utils.o.T()) {
            } else {
                iMediaPlayer.o();
                iMediaPlayer.c();
            }
        }
    }

    public void c(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773e960", new Object[]{this, iMediaPlayer});
        } else if (iMediaPlayer == null) {
        } else {
            Iterator<Map.Entry<String, com.taobao.taolive.sdk.ui.media.a<IMediaPlayer>>> it = this.f21928a.entrySet().iterator();
            while (it.hasNext()) {
                com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> value = it.next().getValue();
                if (value != null && value.a() == iMediaPlayer) {
                    it.remove();
                }
            }
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        h hVar = new h();
        hVar.b = str2;
        hVar.f21934a = str;
        b a2 = a(hVar);
        if (a2 != null) {
            com.taobao.taolive.sdk.utils.m.a("PlayerRecycle", "hasPlayer refRet = " + a2.b);
            if (a2.f21933a != null) {
                return true;
            }
        }
        return false;
    }

    public String e(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc85effe", new Object[]{this, iMediaPlayer});
        }
        final String b2 = b();
        this.f21928a.put(b2, new com.taobao.taolive.sdk.ui.media.a<>(iMediaPlayer, new a.InterfaceC0911a<IMediaPlayer>() { // from class: com.taobao.taolive.sdk.ui.media.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.a.InterfaceC0911a
            public void a(com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("27154c0e", new Object[]{this, aVar, new Integer(i)});
                    return;
                }
                IMediaPlayer a2 = aVar.a();
                if (a2 != null) {
                    a2.o();
                }
                g.a(g.this).remove(b2);
            }

            @Override // com.taobao.taolive.sdk.ui.media.a.InterfaceC0911a
            public void b(com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b3b5770f", new Object[]{this, aVar, new Integer(i)});
                    return;
                }
                IMediaPlayer a2 = aVar.a();
                if (a2 != null) {
                    a2.o();
                    a2.c();
                }
                g.a(g.this).remove(b2);
            }
        }));
        return b2;
    }

    private b a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b7a81517", new Object[]{this, hVar});
        }
        int i = -1;
        com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar = null;
        if (!StringUtils.isEmpty(hVar.f21934a) && this.f21928a.containsKey(hVar.f21934a)) {
            aVar = this.f21928a.get(hVar.f21934a);
            com.taobao.taolive.sdk.utils.m.a("PlayerRecycle", "hasPlayerRef by token = " + hVar.f21934a);
            i = 0;
        } else if (!StringUtils.isEmpty(hVar.b)) {
            Iterator<Map.Entry<String, com.taobao.taolive.sdk.ui.media.a<IMediaPlayer>>> it = this.f21928a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, com.taobao.taolive.sdk.ui.media.a<IMediaPlayer>> next = it.next();
                if (next.getKey() != null && next.getKey().startsWith(hVar.b)) {
                    aVar = next.getValue();
                    com.taobao.taolive.sdk.utils.m.a("PlayerRecycle", "hasPlayerRef by topicID = " + hVar.b);
                    i = 1;
                    break;
                }
            }
        }
        return new b(aVar, i);
    }

    private void d(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daff0721", new Object[]{this, iMediaPlayer});
        } else if (iMediaPlayer == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("mockPlayerInfo", MOCK_MEDIA_INFO_WHAT_RECYCLED);
            iMediaPlayer.a((Map<String, String>) hashMap);
        }
    }

    private a a(boolean z, h hVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d3bf0434", new Object[]{this, new Boolean(z), hVar, new Boolean(z2)});
        }
        com.taobao.taolive.sdk.utils.m.a("PlayerRecycle", "findPlayer enableConsume = " + z + " mediaPlayRecyclerToken = " + hVar + " addRef = " + z2);
        b a2 = a(z, hVar);
        if (a2 == null || a2.f21933a == null) {
            return null;
        }
        if (z2) {
            a2.f21933a.b();
        }
        return new a(a2.f21933a.a(), a2.b);
    }

    private b a(boolean z, h hVar) {
        String str;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("cf43a193", new Object[]{this, new Boolean(z), hVar});
        }
        com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar = null;
        if (!z) {
            return null;
        }
        if (!StringUtils.isEmpty(hVar.f21934a) && this.f21928a.containsKey(hVar.f21934a)) {
            aVar = this.f21928a.get(hVar.f21934a);
            com.taobao.taolive.sdk.utils.m.a("PlayerRecycle", "findPlayerRef by token = " + hVar.f21934a);
        } else if (!StringUtils.isEmpty(hVar.b)) {
            Iterator<Map.Entry<String, com.taobao.taolive.sdk.ui.media.a<IMediaPlayer>>> it = this.f21928a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    i = -1;
                    break;
                }
                Map.Entry<String, com.taobao.taolive.sdk.ui.media.a<IMediaPlayer>> next = it.next();
                if (next.getKey() != null && next.getKey().startsWith(hVar.b)) {
                    aVar = next.getValue();
                    str = next.getKey();
                    com.taobao.taolive.sdk.utils.m.a("PlayerRecycle", "findPlayerRef by topicID = " + hVar.b);
                    i = 1;
                    break;
                }
            }
            if (str != null && aVar != null && !StringUtils.isEmpty(hVar.f21934a)) {
                this.f21928a.remove(str);
                this.f21928a.put(hVar.f21934a, aVar);
            }
        } else {
            i = -1;
        }
        return new b(aVar, i);
    }

    private IMediaPlayer a(Context context, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer) ipChange.ipc$dispatch("3729cd56", new Object[]{this, context, hVar});
        }
        com.taobao.taolive.sdk.ui.media.b b2 = pmd.a().b();
        final String str = null;
        if (b2 == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enableOpenUseShortAudioFocus", String.valueOf(sst.a()));
        IMediaPlayer a2 = b2.a(hashMap);
        a2.a(context);
        if (!StringUtils.isEmpty(hVar.f21934a)) {
            str = hVar.f21934a;
        }
        if (StringUtils.isEmpty(str)) {
            return a2;
        }
        this.f21928a.put(str, new com.taobao.taolive.sdk.ui.media.a<>(a2, new a.InterfaceC0911a<IMediaPlayer>() { // from class: com.taobao.taolive.sdk.ui.media.g.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.a.InterfaceC0911a
            public void a(com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("27154c0e", new Object[]{this, aVar, new Integer(i)});
                    return;
                }
                IMediaPlayer a3 = aVar.a();
                if (a3 != null) {
                    a3.o();
                }
                g.a(g.this).remove(str);
            }

            @Override // com.taobao.taolive.sdk.ui.media.a.InterfaceC0911a
            public void b(com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b3b5770f", new Object[]{this, aVar, new Integer(i)});
                    return;
                }
                IMediaPlayer a3 = aVar.a();
                if (a3 != null) {
                    a3.o();
                    a3.c();
                }
                g.a(g.this).remove(str);
            }
        }));
        return a2;
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> f21933a;
        public int b;

        static {
            kge.a(-136220142);
        }

        public b(com.taobao.taolive.sdk.ui.media.a<IMediaPlayer> aVar, int i) {
            this.b = -1;
            this.f21933a = aVar;
            this.b = i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FindPlayerRefRet{mPlayerAtomicRefCounted=" + this.f21933a + ", reason=" + this.b + '}';
        }
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public IMediaPlayer f21932a;
        public int b;

        static {
            kge.a(-1113894214);
        }

        public a() {
            this.b = -1;
        }

        public a(IMediaPlayer iMediaPlayer, int i) {
            this.b = -1;
            this.f21932a = iMediaPlayer;
            this.b = i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FindPlayerRet{mMediaPlayer=" + this.f21932a + ", reason=" + this.b + '}';
        }
    }
}
