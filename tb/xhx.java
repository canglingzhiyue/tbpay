package tb;

import com.alibaba.ability.builder.c;
import com.alibaba.ability.builder.d;
import com.alibaba.ability.builder.f;
import com.alibaba.ability.impl.barcode.BarCodeAbility;
import com.alibaba.ability.impl.log.LogAbility;
import com.alibaba.ability.impl.mtop.MtopAbility;
import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.alibaba.ability.impl.user.UserAbility;
import com.alibaba.alibity.container.ssr.FirstChunkCacheAbility;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.android.abilitykit.ability.ModalAbility;
import com.taobao.android.abilitykit.ability.h;
import com.taobao.android.abilitykit.ability.s;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.android.tbabilitykit.c;
import com.taobao.android.tbabilitykit.g;
import com.taobao.android.tbabilitykit.k;
import com.taobao.android.tbabilitykit.m;
import com.taobao.android.tbabilitykit.t;
import com.taobao.android.tbabilitykit.v;
import com.taobao.android.weex_ability.page.AliMSNavigationBarModule;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.message.message_open_api_adapter.OpenAPI4Uni;
import com.taobao.tao.powermsg.outter.PowerMsgAbility;
import com.taobao.taobao.scancode.gateway.util.i;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.collections.ao;
import kotlin.collections.p;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J/\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\b0\nH\u0082\bJA\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\b0\nH\u0082\b¨\u0006\u0011"}, d2 = {"Lcom/alibaba/ability/abilityMap/AbilityStaticMap;", "Lcom/alibaba/ability/map/IMapBuilder;", "Lcom/alibaba/ability/builder/AbilityBuilderBox;", "()V", "buildMap", "", "", "checkDependency", "Lkotlin/Pair;", "func", "Lkotlin/Function0;", "checkSwitch", "key", "default", "", "Companion", "InvalidBuilder", "open_ability_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class xhx implements amk<d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private static final Pair<String, d> f34296a = new Pair<>("", new d(new b(1, ai.a()), null, 2, null));

    public static final /* synthetic */ Pair b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("1e920f52", new Object[0]) : f34296a;
    }

    @Override // tb.amk
    public Map<String, d> a() {
        Pair<String, d> a2;
        Pair<String, d> a3;
        Pair<String, d> a4;
        Pair<String, d> a5;
        Pair<String, d> a6;
        Pair<String, d> a7;
        Pair<String, d> a8;
        Pair<String, d> a9;
        Pair<String, d> a10;
        Pair<String, d> a11;
        Pair<String, d> a12;
        Pair<String, d> a13;
        Pair<String, d> a14;
        Pair<String, d> a15;
        Pair<String, d> a16;
        Pair<String, d> a17;
        Pair<String, d> a18;
        Pair<String, d> a19;
        Pair<String, d> a20;
        Pair<String, d> a21;
        Pair<String, d> a22;
        Pair<String, d> a23;
        Pair<String, d> a24;
        Pair<String, d> a25;
        Pair<String, d> a26;
        Pair<String, d> a27;
        Pair<String, d> a28;
        Pair<String, d> a29;
        Pair<String, d> a30;
        Pair<String, d> a31;
        Pair<String, d> a32;
        Pair<String, d> a33;
        Pair<String, d> a34;
        Pair<String, d> a35;
        Pair<String, d> a36;
        Pair<String, d> a37;
        Pair<String, d> a38;
        Pair<String, d> a39;
        Pair<String, d> a40;
        Pair<String, d> a41;
        Pair<String, d> a42;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair[] pairArr = new Pair[41];
        try {
            a2 = j.a("appLocalStorage", new d(new com.alibaba.ability.builder.a(dmi.class, 1, ai.a(j.a("get", new com.alibaba.ability.builder.b(2)), j.a("set", new com.alibaba.ability.builder.b(2)), j.a("remove", new com.alibaba.ability.builder.b(2)))), null, 2, null));
        } catch (NoClassDefFoundError unused) {
            a2 = Companion.a();
        }
        pairArr[0] = a2;
        try {
            a3 = j.a("clipboard", new d(new f("com.alibaba.ability.impl.clipboard.ClipboardAbility", 3, ai.a(j.a("set", new com.alibaba.ability.builder.b(2)), j.a("get", new com.alibaba.ability.builder.b(2))), null, 8, null), null, 2, null));
        } catch (NoClassDefFoundError unused2) {
            a3 = Companion.a();
        }
        pairArr[1] = a3;
        try {
            a4 = j.a("abilityHub", new d(new com.alibaba.ability.builder.a(h.class, 3, null, 4, null), null, 2, null));
        } catch (NoClassDefFoundError unused3) {
            a4 = Companion.a();
        }
        pairArr[2] = a4;
        try {
            a5 = j.a("mtop", new d(new f("com.alibaba.ability.impl.mtop.MtopAbility", 3, ai.a(j.a("send", new com.alibaba.ability.builder.b(2)), j.a("requestData", new com.alibaba.ability.builder.b(2)), j.a(MtopAbility.API_ACCOUNT_SITE, new com.alibaba.ability.builder.b(2)), j.a("prefetchData", new com.alibaba.ability.builder.b(2)), j.a(MtopAbility.API_REQUEST_STREAM, new com.alibaba.ability.builder.b(2))), null, 8, null), null, 2, null));
        } catch (NoClassDefFoundError unused4) {
            a5 = Companion.a();
        }
        pairArr[3] = a5;
        try {
            a6 = j.a("MTOP", new d(new f("com.alibaba.ability.impl.mtop.MtopAbility", 3, ai.a(j.a("send", new com.alibaba.ability.builder.b(2)), j.a("requestData", new com.alibaba.ability.builder.b(2)), j.a(MtopAbility.API_ACCOUNT_SITE, new com.alibaba.ability.builder.b(2)), j.a("prefetchData", new com.alibaba.ability.builder.b(2)), j.a(MtopAbility.API_REQUEST_STREAM, new com.alibaba.ability.builder.b(2))), null, 8, null), null, 2, null));
        } catch (NoClassDefFoundError unused5) {
            a6 = Companion.a();
        }
        pairArr[4] = a6;
        try {
            a7 = j.a("stdPop", new d(new com.alibaba.ability.builder.a(m.class, 3, ai.a(j.a(m.API_CHG_SIZE, new com.alibaba.ability.builder.b(1)), j.a("close", new com.alibaba.ability.builder.b(1)), j.a(m.API_DX, new com.alibaba.ability.builder.b(1)), j.a(m.API_H5, new com.alibaba.ability.builder.b(1)), j.a(m.API_NATIVE, new com.alibaba.ability.builder.b(1)), j.a(m.API_STD_DX, new com.alibaba.ability.builder.b(1)), j.a(m.API_ULTRON, new com.alibaba.ability.builder.b(1)), j.a(m.API_WEEX, new com.alibaba.ability.builder.b(1)), j.a(m.API_WEEX2, new com.alibaba.ability.builder.b(1)), j.a(m.API_CONFIG_CORNER, new com.alibaba.ability.builder.b(1)))), null, 2, null));
        } catch (NoClassDefFoundError unused6) {
            a7 = Companion.a();
        }
        pairArr[5] = a7;
        try {
            a8 = j.a("modal", new d(new com.alibaba.ability.builder.a(ModalAbility.class, 3, ai.a(j.a("confirm", new com.alibaba.ability.builder.b(1)))), null, 2, null));
        } catch (NoClassDefFoundError unused7) {
            a8 = Companion.a();
        }
        pairArr[6] = a8;
        try {
            a9 = j.a(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, new d(new f("com.alibaba.ability.impl.device.Device", 3, ai.a(j.a("getMediaVolume", new com.alibaba.ability.builder.b(2)), j.a("requestMediaVolume", new com.alibaba.ability.builder.b(2)), j.a("getInfo", new com.alibaba.ability.builder.b(2)), j.a("getScreenType", new com.alibaba.ability.builder.b(2)), j.a(NetworkAbility.API_GET_TYPE, new com.alibaba.ability.builder.b(2)), j.a("setMediaVolumeListener", new com.alibaba.ability.builder.b(2)), j.a("unsetMediaVolumeListener", new com.alibaba.ability.builder.b(2))), null, 8, null), null, 2, null));
        } catch (NoClassDefFoundError unused8) {
            a9 = Companion.a();
        }
        pairArr[7] = a9;
        try {
            a10 = j.a("nfc", new d(new com.alibaba.ability.builder.a(dlv.class, 3, ai.a(j.a("subscribe", new com.alibaba.ability.builder.b(1)), j.a("checkStatus", new com.alibaba.ability.builder.b(1)), j.a(dlv.API_UNSUBSCRIBE, new com.alibaba.ability.builder.b(1)))), null, 2, null));
        } catch (NoClassDefFoundError unused9) {
            a10 = Companion.a();
        }
        pairArr[8] = a10;
        try {
            a11 = j.a(AliMSNavigationBarModule.NAME, new d(new com.alibaba.ability.builder.a(ddr.class, 3, ai.a(j.a("setTitle", new com.alibaba.ability.builder.b(1)))), null, 2, null));
        } catch (NoClassDefFoundError unused10) {
            a11 = Companion.a();
        }
        pairArr[9] = a11;
        try {
            a12 = j.a("ssr", new d(new com.alibaba.ability.builder.a(FirstChunkCacheAbility.class, 3, ai.a(j.a("setFirstChunkCache", new com.alibaba.ability.builder.b(1)), j.a("removeFirstChunkCache", new com.alibaba.ability.builder.b(1)), j.a("prerender", new com.alibaba.ability.builder.b(1)), j.a("preloadFirstChunk", new com.alibaba.ability.builder.b(2)), j.a("preload", new com.alibaba.ability.builder.b(2)))), null, 2, null));
        } catch (NoClassDefFoundError unused11) {
            a12 = Companion.a();
        }
        pairArr[10] = a12;
        try {
            a13 = j.a("network", new d(new com.alibaba.ability.builder.a(NetworkAbility.class, 3, ai.a(j.a(NetworkAbility.API_GET_NETWORK_STATUS, new com.alibaba.ability.builder.b(2)), j.a(NetworkAbility.API_REGISTER_NETWORK_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(NetworkAbility.API_GET_TYPE, new com.alibaba.ability.builder.b(2)), j.a(NetworkAbility.API_ADD_TYPE_EVENT_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(NetworkAbility.API_GET_QUALITY_LEVEL, new com.alibaba.ability.builder.b(2)), j.a(NetworkAbility.API_ADD_QUALITY_EVENT_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(NetworkAbility.API_GET_DOWNLINK, new com.alibaba.ability.builder.b(2)), j.a(NetworkAbility.API_GET_PREDICT_DOWNLINK, new com.alibaba.ability.builder.b(2)), j.a(NetworkAbility.API_REMOVE_TYPE_EVENT_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(NetworkAbility.API_REMOVE_QUALITY_EVENT_LISTENER, new com.alibaba.ability.builder.b(2)))), null, 2, null));
        } catch (NoClassDefFoundError unused12) {
            a13 = Companion.a();
        }
        pairArr[11] = a13;
        try {
            a14 = j.a("riverlog", new d(new com.alibaba.ability.builder.a(dlw.class, 1, ai.a(j.a(dlw.API_TOGGLE, new com.alibaba.ability.builder.b(2)))), null, 2, null));
        } catch (NoClassDefFoundError unused13) {
            a14 = Companion.a();
        }
        pairArr[12] = a14;
        try {
            a15 = j.a("utTracker", new d(new com.alibaba.ability.builder.a(t.class, 3, ai.a(j.a(t.API_GET_PAGE_NAME, new com.alibaba.ability.builder.b(1)), j.a("subscribe", new com.alibaba.ability.builder.b(1)), j.a("unsubscribe", new com.alibaba.ability.builder.b(1)))), null, 2, null));
        } catch (NoClassDefFoundError unused14) {
            a15 = Companion.a();
        }
        pairArr[13] = a15;
        try {
            a16 = j.a("appEdition", new d(new com.alibaba.ability.builder.a(com.taobao.android.tbabilitykit.d.class, 3, ai.a(j.a(com.taobao.android.tbabilitykit.d.API_CHECK_VERSION_CODE, new com.alibaba.ability.builder.b(2)))), null, 2, null));
        } catch (NoClassDefFoundError unused15) {
            a16 = Companion.a();
        }
        pairArr[14] = a16;
        try {
            a17 = j.a("telephone", new d(new com.alibaba.ability.builder.a(s.class, 3, ai.a(j.a("call", new com.alibaba.ability.builder.b(2)))), null, 2, null));
        } catch (NoClassDefFoundError unused16) {
            a17 = Companion.a();
        }
        pairArr[15] = a17;
        try {
            a18 = j.a("Tel", new d(new com.alibaba.ability.builder.a(s.class, 3, ai.a(j.a("call", new com.alibaba.ability.builder.b(2)))), null, 2, null));
        } catch (NoClassDefFoundError unused17) {
            a18 = Companion.a();
        }
        pairArr[16] = a18;
        try {
            a19 = j.a("hapticsEngine", new d(new com.alibaba.ability.builder.a(dlu.class, 3, ai.a(j.a(dlu.API_IMPACT_LIGHT, new com.alibaba.ability.builder.b(1)), j.a(dlu.API_IMPACT_MEDIUM, new com.alibaba.ability.builder.b(1)), j.a(dlu.API_IMPACT_HEAVY, new com.alibaba.ability.builder.b(1)), j.a(dlu.API_IMPACT_SOFT, new com.alibaba.ability.builder.b(1)), j.a(dlu.API_IMPACT_RIGID, new com.alibaba.ability.builder.b(1)), j.a(dlu.API_NOTIFICATION_SUCCESS, new com.alibaba.ability.builder.b(1)), j.a(dlu.API_NOTIFICATION_WARNING, new com.alibaba.ability.builder.b(1)), j.a(dlu.API_NOTIFICATION_ERROR, new com.alibaba.ability.builder.b(1)), j.a(dlu.API_SELECTION_CHANGE, new com.alibaba.ability.builder.b(1)), j.a(dlu.API_VIBRATE, new com.alibaba.ability.builder.b(1)), j.a("cancel", new com.alibaba.ability.builder.b(1)))), null, 2, null));
        } catch (NoClassDefFoundError unused18) {
            a19 = Companion.a();
        }
        pairArr[17] = a19;
        try {
            a20 = j.a("photoSearch", new d(new com.alibaba.ability.builder.a(crh.class, 3, ai.a(j.a(crh.API_SHOW_IRP, new com.alibaba.ability.builder.b(1)), j.a(crh.API_CLOSE_IRP, new com.alibaba.ability.builder.b(1)))), null, 2, null));
        } catch (NoClassDefFoundError unused19) {
            a20 = Companion.a();
        }
        pairArr[18] = a20;
        try {
            a21 = j.a("actionSheet", new d(new com.alibaba.ability.builder.a(c.class, 3, ai.a(j.a("show", new com.alibaba.ability.builder.b(1)), j.a("hide", new com.alibaba.ability.builder.b(1)))), null, 2, null));
        } catch (NoClassDefFoundError unused20) {
            a21 = Companion.a();
        }
        pairArr[19] = a21;
        try {
            a22 = j.a("droidNativeKeyTracker", new d(new com.alibaba.ability.builder.a(g.class, 3, ai.a(j.a("subscribe", new com.alibaba.ability.builder.b(1)), j.a("unsubscribe", new com.alibaba.ability.builder.b(1)))), null, 2, null));
        } catch (NoClassDefFoundError unused21) {
            a22 = Companion.a();
        }
        pairArr[20] = a22;
        try {
            a23 = j.a("zCache", new d(new com.alibaba.ability.builder.a(v.class, 3, ai.a(j.a("prefetch", new com.alibaba.ability.builder.b(2)))), null, 2, null));
        } catch (NoClassDefFoundError unused22) {
            a23 = Companion.a();
        }
        pairArr[21] = a23;
        try {
            a24 = j.a("backgroundAudioService", new d(new f("com.alibaba.ability.impl.audio.AudioServiceAbility", 3, ai.a(j.a("requestInfo", new com.alibaba.ability.builder.b(1)), j.a("play", new com.alibaba.ability.builder.b(1)), j.a("resume", new com.alibaba.ability.builder.b(1)), j.a("pause", new com.alibaba.ability.builder.b(1)), j.a("stop", new com.alibaba.ability.builder.b(1)), j.a("seek", new com.alibaba.ability.builder.b(1)), j.a("setEventListener", new com.alibaba.ability.builder.b(1)), j.a("requestProperties", new com.alibaba.ability.builder.b(1)), j.a("setProperties", new com.alibaba.ability.builder.b(1))), null, 8, null), ao.a("miniapp")));
        } catch (NoClassDefFoundError unused23) {
            a24 = Companion.a();
        }
        pairArr[22] = a24;
        try {
            if (com.alibaba.ability.utils.a.INSTANCE.a("enableGlobalBackgroundAudioService", String.valueOf(false))) {
                a25 = j.a("backgroundAudioService", new d(new f("com.alibaba.ability.impl.audio.AudioServiceAbility", 3, ai.a(j.a("requestInfo", new com.alibaba.ability.builder.b(1)), j.a("play", new com.alibaba.ability.builder.b(1)), j.a("resume", new com.alibaba.ability.builder.b(1)), j.a("pause", new com.alibaba.ability.builder.b(1)), j.a("stop", new com.alibaba.ability.builder.b(1)), j.a("seek", new com.alibaba.ability.builder.b(1)), j.a("setEventListener", new com.alibaba.ability.builder.b(1)), j.a("requestProperties", new com.alibaba.ability.builder.b(1)), j.a("setProperties", new com.alibaba.ability.builder.b(1))), null, 8, null), null, 2, null));
            } else {
                a25 = Companion.a();
            }
        } catch (NoClassDefFoundError unused24) {
            a25 = Companion.a();
        }
        pairArr[23] = a25;
        try {
            a26 = j.a("powerMsg", new d(new com.alibaba.ability.builder.a(PowerMsgAbility.class, 3, ai.a(j.a("query", new com.alibaba.ability.builder.b(2)), j.a("send", new com.alibaba.ability.builder.b(2)), j.a(PowerMsgAbility.API_ADD_EVENT_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(PowerMsgAbility.API_REMOVE_EVENT_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(PowerMsgAbility.API_PRE_CONNECT, new com.alibaba.ability.builder.b(2)))), null, 2, null));
        } catch (NoClassDefFoundError unused25) {
            a26 = Companion.a();
        }
        pairArr[24] = a26;
        try {
            a27 = j.a("rocketBundle", new d(new com.alibaba.ability.builder.a(k.class, 3, ai.a(j.a(k.API_GET_CURRENT_INFO, new com.alibaba.ability.builder.b(2)), j.a("download", new com.alibaba.ability.builder.b(2)), j.a(k.API_ENABLE_ROCKET, new com.alibaba.ability.builder.b(2)))), null, 2, null));
        } catch (NoClassDefFoundError unused26) {
            a27 = Companion.a();
        }
        pairArr[25] = a27;
        try {
            a28 = j.a("websocket", new d(new f("com.alibaba.ability.impl.websocket.WebSocketAbility", 3, ai.a(j.a("connect", new com.alibaba.ability.builder.b(2)), j.a("send", new com.alibaba.ability.builder.b(2)), j.a("close", new com.alibaba.ability.builder.b(2))), null, 8, null), null, 2, null));
        } catch (NoClassDefFoundError unused27) {
            a28 = Companion.a();
        }
        pairArr[26] = a28;
        try {
            a29 = j.a(nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, new d(new f("com.alibaba.ability.impl.performance.PerformanceAbility", 3, ai.a(j.a(PerformanceAbility.API_ADD_GLOBAL_WARNING_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(PerformanceAbility.API_ADD_MEMORY_WARNING_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(PerformanceAbility.API_ADD_CPU_WARNING_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(PerformanceAbility.API_ADD_BATTERY_WARNING_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(PerformanceAbility.API_REMOVE_GLOBAL_WARNING_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(PerformanceAbility.API_REMOVE_MEMORY_WARNING_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(PerformanceAbility.API_REMOVE_CPU_WARNING_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(PerformanceAbility.API_REMOVE_BATTERY_WARNING_LISTENER, new com.alibaba.ability.builder.b(2)), j.a(PerformanceAbility.API_GET_MEMORY_INFO, new com.alibaba.ability.builder.b(2)), j.a(PerformanceAbility.API_GET_CPU_INFO, new com.alibaba.ability.builder.b(2)), j.a(PerformanceAbility.API_GET_BATTERY_INFO, new com.alibaba.ability.builder.b(2)), j.a(PerformanceAbility.API_GET_DEVICE_LEVEL, new com.alibaba.ability.builder.b(2))), null, 8, null), null, 2, null));
        } catch (NoClassDefFoundError unused28) {
            a29 = Companion.a();
        }
        pairArr[27] = a29;
        try {
            a30 = j.a("log", new d(new f("com.alibaba.ability.impl.log.LogAbility", 3, ai.a(j.a("error", new com.alibaba.ability.builder.b(3)), j.a(LogAbility.API_WARN, new com.alibaba.ability.builder.b(3)), j.a("info", new com.alibaba.ability.builder.b(3)), j.a("debug", new com.alibaba.ability.builder.b(3))), null, 8, null), null, 2, null));
        } catch (NoClassDefFoundError unused29) {
            a30 = Companion.a();
        }
        pairArr[28] = a30;
        try {
            a31 = j.a(TMSCalendarBridge.module, new d(new com.alibaba.ability.builder.a(com.taobao.desktop.channel.calendar.api.a.class, 3, ai.a(j.a(com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_ADD, new com.alibaba.ability.builder.b(1)), j.a(com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_QUERY, new com.alibaba.ability.builder.b(1)), j.a(com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_REMOVE, new com.alibaba.ability.builder.b(1)))), null, 2, null));
        } catch (NoClassDefFoundError unused30) {
            a31 = Companion.a();
        }
        pairArr[29] = a31;
        try {
            a32 = j.a("user", new d(new f("com.alibaba.ability.impl.user.UserAbility", 3, ai.a(j.a(UserAbility.API_IS_LOGIN, new com.alibaba.ability.builder.b(2)), j.a("login", new com.alibaba.ability.builder.b(1))), null, 8, null), null, 2, null));
        } catch (NoClassDefFoundError unused31) {
            a32 = Companion.a();
        }
        pairArr[30] = a32;
        try {
            a33 = j.a("alert", new d(new com.alibaba.ability.builder.a(ModalAbility.class, 3, ai.a(j.a("show", new com.alibaba.ability.builder.b(1)))), null, 2, null));
        } catch (NoClassDefFoundError unused32) {
            a33 = Companion.a();
        }
        pairArr[31] = a33;
        try {
            a34 = j.a("image", new d(new f("com.alibaba.ability.impl.photo.ImageAbility", 3, ai.a(j.a(com.alibaba.ability.impl.photo.b.API_FROM_CAMERA, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.ability.impl.photo.b.API_FROM_LIB, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.ability.impl.photo.b.API_CAPTURE, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.ability.impl.photo.b.API_SAVE_TO_ALBUM, new com.alibaba.ability.builder.b(1))), null, 8, null), null, 2, null));
        } catch (NoClassDefFoundError unused33) {
            a34 = Companion.a();
        }
        pairArr[32] = a34;
        try {
            a35 = j.a(i.SOURCE_TYPE_PHOTO, new d(new f("com.alibaba.ability.impl.photo.ImageAbility", 3, ai.a(j.a(com.alibaba.ability.impl.photo.b.API_FROM_CAMERA, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.ability.impl.photo.b.API_FROM_LIB, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.ability.impl.photo.b.API_CAPTURE, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.ability.impl.photo.b.API_SAVE_TO_ALBUM, new com.alibaba.ability.builder.b(1))), null, 8, null), null, 2, null));
        } catch (NoClassDefFoundError unused34) {
            a35 = Companion.a();
        }
        pairArr[33] = a35;
        try {
            a36 = j.a("barCode", new d(new f("com.alibaba.ability.impl.barcode.BarCodeAbility", 3, ai.a(j.a(BarCodeAbility.API_DECODE_QR, new com.alibaba.ability.builder.b(1))), null, 8, null), null, 2, null));
        } catch (NoClassDefFoundError unused35) {
            a36 = Companion.a();
        }
        pairArr[34] = a36;
        try {
            a37 = j.a("userTrack", new d(new f("com.alibaba.ability.impl.UserTrackerAbility", 3, ai.a(), null, 8, null), ao.a("muise")));
        } catch (NoClassDefFoundError unused36) {
            a37 = Companion.a();
        }
        pairArr[35] = a37;
        try {
            a38 = j.a("globalEvent", new d(new com.alibaba.ability.builder.a(jvi.class, 3, null, 4, null), ao.a("weex")));
        } catch (NoClassDefFoundError unused37) {
            a38 = Companion.a();
        }
        pairArr[36] = a38;
        try {
            a39 = j.a("widgetService", new d(new com.alibaba.ability.builder.a(com.taobao.desktop.widget.jsbridge.a.class, 3, null, 4, null), ao.a("miniapp")));
        } catch (NoClassDefFoundError unused38) {
            a39 = Companion.a();
        }
        pairArr[37] = a39;
        try {
            a40 = j.a("file", new d(new com.alibaba.ability.builder.a(com.alibaba.alibity.container.file.a.class, 3, ai.b(j.a(com.alibaba.alibity.container.file.a.API_EXISTS, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.alibity.container.file.a.API_GET_DIR_INFO, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.alibity.container.file.a.API_MAKE_DIR, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.alibity.container.file.a.API_REMOVE_DIR, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.alibity.container.file.a.API_READ_AS_STRING, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.alibity.container.file.a.API_READ_AS_ARRAY_BUFFER, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.alibity.container.file.a.API_COPY_FILE, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.alibity.container.file.a.API_WRITE_FILE, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.alibity.container.file.a.API_APPEND_FILE, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.alibity.container.file.a.API_REMOVE_FILE, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.alibity.container.file.a.API_GET_FILE_INFO, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.alibity.container.file.a.API_RENAME, new com.alibaba.ability.builder.b(1)), j.a(com.alibaba.alibity.container.file.a.API_UNZIP, new com.alibaba.ability.builder.b(1)))), ao.a(TMSCalendarBridge.namespace)));
        } catch (NoClassDefFoundError unused39) {
            a40 = Companion.a();
        }
        pairArr[38] = a40;
        try {
            a41 = j.a("authorize", new d(new f("com.alibaba.ability.abilitys.Authorize", 3, ai.a(), null, 8, null), ao.a(MspGlobalDefine.TINY_APP)));
        } catch (NoClassDefFoundError unused40) {
            a41 = Companion.a();
        }
        pairArr[39] = a41;
        try {
            a42 = j.a("IMPrivateService", new d(new com.alibaba.ability.builder.a(OpenAPI4Uni.class, 3, ai.a(j.a(JarvisConstant.KEY_JARVIS_TRIGGER, new com.alibaba.ability.builder.b(2)))), null, 2, null));
        } catch (NoClassDefFoundError unused41) {
            a42 = Companion.a();
        }
        pairArr[40] = a42;
        ai.a((Map) linkedHashMap, (Iterable) p.b(pairArr));
        kotlin.t tVar = kotlin.t.INSTANCE;
        return linkedHashMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/alibaba/ability/abilityMap/AbilityStaticMap$InvalidBuilder;", "Lcom/alibaba/ability/builder/IAbilityBuilder;", ept.LIFECYCLE, "", "apiSpecs", "", "", "Lcom/alibaba/ability/builder/ApiSpec;", "(ILjava/util/Map;)V", "getApiSpecs", "()Ljava/util/Map;", "getLifeCycle", "()I", "setLifeCycle", "(I)V", CartRecommendRefreshScene.build, "Lcom/alibaba/ability/IAbility;", "canIUse", "", "api", "open_ability_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class b implements com.alibaba.ability.builder.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f34297a;
        private final Map<String, com.alibaba.ability.builder.b> b;

        @Override // com.alibaba.ability.builder.c
        public com.alibaba.ability.b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.alibaba.ability.b) ipChange.ipc$dispatch("7f0ee8dd", new Object[]{this});
            }
            return null;
        }

        @Override // com.alibaba.ability.builder.c
        public boolean a(String api) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, api})).booleanValue();
            }
            q.d(api, "api");
            return true;
        }

        public b(int i, Map<String, com.alibaba.ability.builder.b> apiSpecs) {
            q.d(apiSpecs, "apiSpecs");
            this.f34297a = i;
            this.b = apiSpecs;
        }

        @Override // com.alibaba.ability.builder.c
        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f34297a;
        }

        @Override // com.alibaba.ability.builder.c
        public int b(String api) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, api})).intValue();
            }
            q.d(api, "api");
            return c.a.a(this, api);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/alibaba/ability/abilityMap/AbilityStaticMap$Companion;", "", "()V", "sInvalidPair", "Lkotlin/Pair;", "", "Lcom/alibaba/ability/builder/AbilityBuilderBox;", "getSInvalidPair$annotations", "getSInvalidPair", "()Lkotlin/Pair;", "open_ability_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final Pair<String, d> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("cde83151", new Object[]{this}) : xhx.b();
        }
    }
}
