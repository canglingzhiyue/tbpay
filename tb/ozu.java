package tb;

import android.text.TextUtils;
import com.alibaba.security.realidentity.p1;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.e;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.c;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010%\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0007J:\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0011H\u0016J.\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u0015H\u0016J8\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015H\u0016J.\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001aH\u0016J.\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u0015H\u0016J8\u0010\u001c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015H\u0016J.\u0010\u001d\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u0013H\u0016J\u0014\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010!\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010\"\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010#H\u0016J\"\u0010$\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0013H\u0016J\u001a\u0010$\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0015H\u0016J4\u0010%\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020&2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020&2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010'\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010(\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010)\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010*\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010+\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001fH\u0016J0\u0010,\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010-\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010.\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010/\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001fH\u0016J,\u00100\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u00101\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u0014H\u0016J,\u00102\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u00103\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0015H\u0016J9\u00105\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\u00106\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b07\"\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u00108J2\u00105\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u000109H\u0016J2\u0010:\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u000b2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u000109H\u0016JN\u0010=\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010\u000b2\u0006\u0010?\u001a\u00020\u00132\b\u0010@\u001a\u0004\u0018\u00010\u000b2\b\u0010A\u001a\u0004\u0018\u00010\u000b2\b\u0010B\u001a\u0004\u0018\u00010\u000b2\u0014\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u000109H\u0016J2\u0010=\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010\u000b2\b\u0010E\u001a\u0004\u0018\u00010\u000b2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u000109H\u0016J\u001c\u0010F\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u00152\b\u0010D\u001a\u0004\u0018\u00010\u000bH\u0016J(\u0010G\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u00152\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u000109H\u0016¨\u0006H"}, d2 = {"Lcom/taobao/taolive/adapterimpl/LiveRoomObserver;", "Lcom/taobao/taolive/sdk/ui/media/IMediaPlayerObserver;", "Lcom/taobao/taolive/sdk/adapter/ut/IUTObserver;", "Lcom/taobao/taolive/sdk/adapter/config/ILiveConfigObserver;", "Lcom/taobao/taolive/sdk/adapter/network/INetworkObserver;", "Lcom/taobao/taolive/sdk/adapter/abtest/IABTestObserver;", "Lcom/taobao/taolive/sdk/adapter/message/ILiveMsgAdapterObserver;", "()V", "onActivate", "", "p0", "", p1.d, "p2", "p3", "p4", "onAsyncINetDataRequest", "Lcom/taobao/taolive/sdk/adapter/network/INetDataObject;", "onAsyncINetDataRequestError", "", "Lcom/taobao/taolive/sdk/adapter/network/NetResponse;", "", "onAsyncINetDataRequestSuccess", "Lcom/taobao/taolive/sdk/adapter/network/NetBaseOutDo;", "onAsyncINetDataRequestSystemError", "onAsyncRequest", "Lcom/taobao/taolive/sdk/adapter/network/NetRequest;", "onAsyncRequestError", "onAsyncRequestSuccess", "onAsyncRequestSystemError", "onAudioFocusChange", "Lcom/taobao/taolive/sdk/ui/media/IMediaPlayer;", "onBuildRequest", MessageID.onCompletion, "onDispatch", "Lcom/taobao/taolive/sdk/model/message/TLiveMsg;", "onError", "onInfo", "", "onPauseStart", "onPauseSuccess", "onPlayStart", "onPrepareStart", "onPrepareSuccess", "onRead", MessageID.onSeekComplete, "onSeekStart", "onStartSuccess", "onSubscribe", "onSyncRequest", "onUnSubscribe", "pageDisAppear", "page", "track4Click", "strings", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "", "track4Show", "key", "params", "trackCustom", "aPage", "aEventId", "aArg1", "aArg2", "aArg3", "aHitMap", "pageName", "arg1", "updatePageName", m.UPDATE_PAGE_PROPERTIES, "taoliveroom_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes8.dex */
public final class ozu implements e, c, pmg, pmj, pno, pom {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ozu INSTANCE;

    static {
        kge.a(1195562929);
        kge.a(-1969146289);
        kge.a(823254263);
        kge.a(-1624480407);
        kge.a(-1795006747);
        kge.a(891812543);
        kge.a(1405757320);
        INSTANCE = new ozu();
    }

    private ozu() {
    }

    @Override // com.taobao.taolive.sdk.ui.media.c
    public void a(IMediaPlayer iMediaPlayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5880e5", new Object[]{this, iMediaPlayer, new Integer(i)});
            return;
        }
        pcn pcnVar = pbt.a().e;
        if (pcnVar == null) {
            return;
        }
        pcnVar.a("liveRoom", iMediaPlayer, i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.c
    public void a(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
            return;
        }
        pcn pcnVar = pbt.a().e;
        if (pcnVar == null) {
            return;
        }
        pcnVar.b("liveRoom", iMediaPlayer);
    }

    @Override // com.taobao.taolive.sdk.ui.media.c
    public void b(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e8cb9f", new Object[]{this, iMediaPlayer});
            return;
        }
        pcn pcnVar = pbt.a().e;
        if (pcnVar == null) {
            return;
        }
        pcnVar.h("liveRoom", iMediaPlayer);
    }

    @Override // com.taobao.taolive.sdk.ui.media.c
    public void c(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773e960", new Object[]{this, iMediaPlayer});
            return;
        }
        pcn pcnVar = pbt.a().e;
        if (pcnVar == null) {
            return;
        }
        pcnVar.d("liveRoom", iMediaPlayer);
    }

    @Override // com.taobao.taolive.sdk.ui.media.c
    public void a(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b5e02", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        pcn pcnVar = pbt.a().e;
        if (pcnVar == null) {
            return;
        }
        pcnVar.a("liveRoom", iMediaPlayer, j, j2, j3, obj);
    }

    @Override // com.taobao.taolive.sdk.ui.media.c
    public void d(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daff0721", new Object[]{this, iMediaPlayer});
            return;
        }
        pcn pcnVar = pbt.a().e;
        if (pcnVar == null) {
            return;
        }
        pcnVar.a("liveRoom", iMediaPlayer);
    }

    @Override // com.taobao.taolive.sdk.ui.media.c
    public void e(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8a24e2", new Object[]{this, iMediaPlayer});
            return;
        }
        pcn pcnVar = pbt.a().e;
        if (pcnVar == null) {
            return;
        }
        pcnVar.c("liveRoom", iMediaPlayer);
    }

    @Override // com.taobao.taolive.sdk.ui.media.c
    public void f(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621542a3", new Object[]{this, iMediaPlayer});
            return;
        }
        pcn pcnVar = pbt.a().e;
        if (pcnVar == null) {
            return;
        }
        pcnVar.f("liveRoom", iMediaPlayer);
    }

    @Override // com.taobao.taolive.sdk.ui.media.c
    public void g(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a06064", new Object[]{this, iMediaPlayer});
            return;
        }
        pcn pcnVar = pbt.a().e;
        if (pcnVar == null) {
            return;
        }
        pcnVar.g("liveRoom", iMediaPlayer);
    }

    @Override // com.taobao.taolive.sdk.ui.media.c
    public void h(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92b7e25", new Object[]{this, iMediaPlayer});
            return;
        }
        pcn pcnVar = pbt.a().e;
        if (pcnVar == null) {
            return;
        }
        pcnVar.e("liveRoom", iMediaPlayer);
    }

    @Override // com.taobao.taolive.sdk.ui.media.c
    public void a(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb80ebe", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        pcn pcnVar = pbt.a().e;
        if (pcnVar == null) {
            return;
        }
        pcnVar.a("liveRoom", iMediaPlayer, i, i2);
    }

    @Override // tb.pom
    public void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        pcw pcwVar = pbt.a().f32558a;
        if (pcwVar == null) {
            return;
        }
        pcwVar.a("liveRoom", str, str2, map);
    }

    @Override // tb.pom
    public void a(String str, String str2, String... strings) {
        String[] strArr;
        List<String> split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e6e23", new Object[]{this, str, str2, strings});
            return;
        }
        q.c(strings, "strings");
        if (!(!(strings.length == 0))) {
            return;
        }
        HashMap set = new HashMap();
        for (String str3 : strings) {
            String str4 = str3;
            if (!TextUtils.isEmpty(str4)) {
                if (str3 == null || (split = new Regex("=").split(str4, 0)) == null) {
                    strArr = null;
                } else {
                    List<String> toTypedArray = split;
                    q.d(toTypedArray, "$this$toTypedArray");
                    Object[] array = toTypedArray.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    strArr = (String[]) array;
                }
                if (strArr != null && strArr.length == 2) {
                    String str5 = strArr[0];
                    String str6 = strArr[1];
                    q.d(set, "$this$set");
                    set.put(str5, str6);
                }
            }
        }
        a(str, str2, set);
    }

    @Override // tb.pom
    public void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
            return;
        }
        pcw pcwVar = pbt.a().f32558a;
        if (pcwVar == null) {
            return;
        }
        pcwVar.b("liveRoom", str, str2, map);
    }

    @Override // tb.pom
    public void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
            return;
        }
        pcw pcwVar = pbt.a().f32558a;
        if (pcwVar == null) {
            return;
        }
        pcwVar.a("liveRoom", str, Integer.valueOf(i), str2, str3, str4, map);
    }

    @Override // tb.pom
    public void c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8682cc47", new Object[]{this, str, str2, map});
            return;
        }
        pcw pcwVar = pbt.a().f32558a;
        if (pcwVar == null) {
            return;
        }
        pcwVar.c("liveRoom", str, str2, map);
    }

    @Override // tb.pom
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        pcw pcwVar = pbt.a().f32558a;
        if (pcwVar == null) {
            return;
        }
        pcwVar.a("liveRoom", obj);
    }

    @Override // tb.pom
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
            return;
        }
        pcw pcwVar = pbt.a().f32558a;
        if (pcwVar == null) {
            return;
        }
        pcwVar.a("liveRoom", obj, str);
    }

    @Override // tb.pom
    public void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{this, obj, map});
            return;
        }
        pcw pcwVar = pbt.a().f32558a;
        if (pcwVar == null) {
            return;
        }
        pcwVar.a("liveRoom", obj, map);
    }

    @Override // tb.pmj
    public void a(String str, String str2, String str3, String str4) {
        pcm pcmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else if (str == null || str2 == null || str3 == null || str4 == null || (pcmVar = pbt.a().b) == null) {
        } else {
            pcmVar.a("liveRoom", str, str2, str3, str4);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.e
    public void a(NetRequest netRequest, NetResponse netResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f4e458", new Object[]{this, netRequest, netResponse});
            return;
        }
        pcp pcpVar = pbt.a().c;
        if (pcpVar == null) {
            return;
        }
        pcpVar.a("liveRoom", netRequest, netResponse);
    }

    @Override // tb.pmg
    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        pcl pclVar = pbt.a().d;
        if (pclVar == null) {
            return;
        }
        pclVar.a("liveRoom", str, str2, str3, str4, str5);
    }

    @Override // tb.pno
    public void a(int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d0c3dc", new Object[]{this, new Integer(i), new Integer(i2), str, str2});
            return;
        }
        pco pcoVar = pbt.a().f;
        if (pcoVar == null) {
            return;
        }
        pcoVar.b("liveRoom", i, i2, str, str2);
    }

    @Override // tb.pno
    public void b(int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba12329d", new Object[]{this, new Integer(i), new Integer(i2), str, str2});
            return;
        }
        pco pcoVar = pbt.a().f;
        if (pcoVar == null) {
            return;
        }
        pcoVar.a("liveRoom", i, i2, str, str2);
    }

    @Override // tb.pno
    public void a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
            return;
        }
        pco pcoVar = pbt.a().f;
        if (pcoVar == null) {
            return;
        }
        pcoVar.a("liveRoom", tLiveMsg);
    }

    @Override // tb.pno
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        pco pcoVar = pbt.a().f;
        if (pcoVar == null) {
            return;
        }
        pcoVar.a("liveRoom", i, obj);
    }
}
