package tb;

import anet.channel.session.dns.DnsNavConfigTask;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J8\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0016"}, d2 = {"Lcom/taobao/android/order/bundle/ultron/event/RefreshListItemAsyncSubscriber;", "Lcom/alibaba/android/ultron/event/ext/UltronBaseV2Subscriber;", "()V", "getAbilityHashKey", "", "onHandleEventChain", "", "ultronEvent", "Lcom/alibaba/android/ultron/event/base/UltronEvent;", "updateComponent", "component", "Lcom/taobao/android/ultron/common/model/IDMComponent;", "matchArrayKey", "matchArrayValue", "Lcom/alibaba/fastjson/JSONArray;", "matchArrayMapKey", "values", "Lcom/alibaba/fastjson/JSONObject;", "updateJsonObject", "obj", DnsNavConfigTask.MatchKey, "Companion", "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class mec extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31033a;
    private static final String b;

    public static final String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : f31033a;
    }

    public static /* synthetic */ Object ipc$super(mec mecVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "372668979346071596";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/taobao/android/order/bundle/ultron/event/RefreshListItemAsyncSubscriber$Companion;", "", "()V", "SUBSCRIBER_ID", "", "getSUBSCRIBER_ID$annotations", "getSUBSCRIBER_ID", "()Ljava/lang/String;", RPCDataItems.SWITCH_TAG_LOG, "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(1356281271);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(1214101807);
        Companion = new a(null);
        f31033a = "refreshListItemAsync";
        b = "RefreshListItemAsyncSubscriber";
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0155 A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:7:0x001f, B:9:0x0025, B:11:0x002b, B:14:0x0033, B:16:0x0042, B:18:0x0048, B:21:0x0052, B:22:0x0073, B:24:0x0079, B:27:0x0081, B:28:0x0094, B:30:0x009a, B:32:0x00a0, B:33:0x00b9, B:35:0x00bf, B:37:0x00c5, B:38:0x00f4, B:41:0x00fc, B:43:0x0110, B:48:0x011f, B:50:0x0125, B:51:0x012d, B:53:0x0133, B:55:0x0149, B:61:0x0155, B:63:0x015a, B:69:0x0166, B:73:0x017b, B:75:0x0181, B:76:0x0184, B:78:0x01a0, B:79:0x01a5, B:80:0x01a6, B:81:0x01ab, B:82:0x01ac, B:83:0x01b1, B:84:0x01b2), top: B:89:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0166 A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:7:0x001f, B:9:0x0025, B:11:0x002b, B:14:0x0033, B:16:0x0042, B:18:0x0048, B:21:0x0052, B:22:0x0073, B:24:0x0079, B:27:0x0081, B:28:0x0094, B:30:0x009a, B:32:0x00a0, B:33:0x00b9, B:35:0x00bf, B:37:0x00c5, B:38:0x00f4, B:41:0x00fc, B:43:0x0110, B:48:0x011f, B:50:0x0125, B:51:0x012d, B:53:0x0133, B:55:0x0149, B:61:0x0155, B:63:0x015a, B:69:0x0166, B:73:0x017b, B:75:0x0181, B:76:0x0184, B:78:0x01a0, B:79:0x01a5, B:80:0x01a6, B:81:0x01ab, B:82:0x01ac, B:83:0x01b1, B:84:0x01b2), top: B:89:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0181 A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:7:0x001f, B:9:0x0025, B:11:0x002b, B:14:0x0033, B:16:0x0042, B:18:0x0048, B:21:0x0052, B:22:0x0073, B:24:0x0079, B:27:0x0081, B:28:0x0094, B:30:0x009a, B:32:0x00a0, B:33:0x00b9, B:35:0x00bf, B:37:0x00c5, B:38:0x00f4, B:41:0x00fc, B:43:0x0110, B:48:0x011f, B:50:0x0125, B:51:0x012d, B:53:0x0133, B:55:0x0149, B:61:0x0155, B:63:0x015a, B:69:0x0166, B:73:0x017b, B:75:0x0181, B:76:0x0184, B:78:0x01a0, B:79:0x01a5, B:80:0x01a6, B:81:0x01ab, B:82:0x01ac, B:83:0x01b1, B:84:0x01b2), top: B:89:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0179 A[SYNTHETIC] */
    @Override // com.alibaba.android.ultron.event.ext.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.alibaba.android.ultron.event.base.e r26) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mec.d(com.alibaba.android.ultron.event.base.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[Catch: Exception -> 0x00ea, TryCatch #0 {Exception -> 0x00ea, blocks: (B:9:0x0027, B:11:0x003d, B:17:0x0049, B:19:0x0056, B:22:0x0061, B:23:0x006d, B:25:0x0073, B:27:0x007b, B:28:0x007e, B:31:0x008a, B:33:0x0090, B:34:0x0098, B:36:0x009e, B:38:0x00a4, B:41:0x00b3, B:42:0x00b9, B:43:0x00c2, B:44:0x00c7, B:45:0x00c8, B:46:0x00cf, B:47:0x00d0, B:49:0x00d8, B:51:0x00de, B:52:0x00e1, B:53:0x00e6), top: B:59:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: Exception -> 0x00ea, TryCatch #0 {Exception -> 0x00ea, blocks: (B:9:0x0027, B:11:0x003d, B:17:0x0049, B:19:0x0056, B:22:0x0061, B:23:0x006d, B:25:0x0073, B:27:0x007b, B:28:0x007e, B:31:0x008a, B:33:0x0090, B:34:0x0098, B:36:0x009e, B:38:0x00a4, B:41:0x00b3, B:42:0x00b9, B:43:0x00c2, B:44:0x00c7, B:45:0x00c8, B:46:0x00cf, B:47:0x00d0, B:49:0x00d8, B:51:0x00de, B:52:0x00e1, B:53:0x00e6), top: B:59:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(com.taobao.android.ultron.common.model.IDMComponent r11, java.lang.String r12, com.alibaba.fastjson.JSONArray r13, java.lang.String r14, com.alibaba.fastjson.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mec.a(com.taobao.android.ultron.common.model.IDMComponent, java.lang.String, com.alibaba.fastjson.JSONArray, java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }

    private final void a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644a19de", new Object[]{this, jSONObject, str, jSONObject2});
            return;
        }
        try {
            List b2 = n.b((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
            for (Object obj : b2) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.p.b();
                }
                Object obj2 = jSONObject.get((String) obj);
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
                jSONObject = (JSONObject) obj2;
                if (i == b2.size() - 1) {
                    jSONObject.putAll(jSONObject2);
                }
                i = i2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
