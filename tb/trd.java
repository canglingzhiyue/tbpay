package tb;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dxng.kmp_api_exporter.f;
import com.taobao.dxng.kmp_api_exporter.g;
import com.taobao.dxng.kmp_api_exporter.h;
import com.taobao.dxng.kmp_api_exporter.i;
import com.taobao.media.MediaConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\rJ+\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\rJ+\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/utils/log/TaoLiveLog;", "", "<init>", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "getTAG", "()Ljava/lang/String;", "logDebug", "", "tag", "contents", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "logInfo", "logWarn", "logError", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class trd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final trd INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final String f34294a;

    private trd() {
    }

    static {
        kge.a(-649412741);
        INSTANCE = new trd();
        f34294a = MediaConstant.LBLIVE_SOURCE;
    }

    public final void a(String tag, Object... contents) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{this, tag, contents});
            return;
        }
        q.d(tag, "tag");
        q.d(contents, "contents");
        StringBuilder sb = new StringBuilder();
        for (Object obj : contents) {
            if (obj != null) {
                sb.append(obj);
            }
        }
        f.a aVar = f.Companion;
        h hVar = new h();
        hVar.c(f34294a);
        hVar.b(tag);
        hVar.a(sb.toString());
        i.a(aVar, hVar);
    }

    public final void b(String tag, Object... contents) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2d52de", new Object[]{this, tag, contents});
            return;
        }
        q.d(tag, "tag");
        q.d(contents, "contents");
        StringBuilder sb = new StringBuilder();
        for (Object obj : contents) {
            if (obj != null) {
                sb.append(obj);
            }
        }
        f.a aVar = f.Companion;
        g gVar = new g();
        gVar.c(f34294a);
        gVar.b(tag);
        gVar.a(sb.toString());
        i.a(aVar, gVar);
    }
}
