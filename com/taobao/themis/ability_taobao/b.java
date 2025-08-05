package com.taobao.themis.ability_taobao;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.desktop.channel.calendar.a;
import com.taobao.themis.kernel.f;
import com.taobao.themis.pub_kit.guide.model.PubAuthConfigModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qrc;
import tb.qrd;
import tb.tlq;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\u000e\u001a\u00020\bH\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/ability_taobao/PubPermissionHandler;", "", "()V", "pubCheckPermissionMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "", "addCheck", "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "apiName", a.CALENDAR_EVENT_PERMISSION_CHECK, "callback", DMComponent.RESET, "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    /* renamed from: a */
    private static final ConcurrentHashMap<BridgeCallback, String> f22311a;

    static {
        kge.a(1046596340);
        INSTANCE = new b();
        f22311a = new ConcurrentHashMap<>();
    }

    private b() {
    }

    public static final /* synthetic */ void a(b bVar, f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbec0eda", new Object[]{bVar, fVar, str});
        } else {
            bVar.a(fVar, str);
        }
    }

    @JvmStatic
    public static final void a(final f instance, final BridgeCallback callback, final String apiName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af4f79", new Object[]{instance, callback, apiName});
            return;
        }
        q.d(instance, "instance");
        q.d(callback, "callback");
        q.d(apiName, "apiName");
        qrc.a(instance, new qrd.b() { // from class: com.taobao.themis.ability_taobao.PubPermissionHandler$checkPermission$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qrd.b
            public void onResult(PubUserGuideModule pubUserGuideModule) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                    return;
                }
                PubAuthConfigModel authConfig = pubUserGuideModule != null ? pubUserGuideModule.getAuthConfig() : null;
                if (authConfig == null) {
                    BridgeCallback.this.sendBridgeResponse(BridgeResponse.SUCCESS);
                    b.a(b.INSTANCE, instance, apiName);
                    return;
                }
                List<String> apiBlackList = authConfig.getApiBlackList();
                if (apiBlackList != null && apiBlackList.contains(apiName)) {
                    BridgeCallback.this.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    return;
                }
                BridgeCallback.this.sendBridgeResponse(BridgeResponse.SUCCESS);
                b.a(b.INSTANCE, instance, apiName);
            }
        });
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f22311a.clear();
        }
    }

    private final void a(f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67562b7", new Object[]{this, fVar, str});
            return;
        }
        if (fVar.a(tlq.class) == null) {
            fVar.a((Class<Class>) tlq.class, (Class) new tlq());
        }
        tlq tlqVar = (tlq) fVar.a(tlq.class);
        if (tlqVar == null) {
            return;
        }
        tlqVar.a(str);
    }
}
