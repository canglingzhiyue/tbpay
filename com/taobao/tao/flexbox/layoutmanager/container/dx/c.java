package com.taobao.tao.flexbox.layoutmanager.container.dx;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.ArrayList;
import kotlin.Metadata;
import tb.fvb;
import tb.fve;
import tb.kge;
import tb.ogg;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/tao/flexbox/layoutmanager/container/dx/DxPreloadExecutor;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "hasPrefetch", "", "prefetchDxTemplate", "", "name", "version", "", "url", "startPrefetch", "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final c INSTANCE;
    public static final String TAG = "DxOrangeConfigsExecutor";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f20245a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Lcom/taobao/android/dinamicx/notification/DXNotificationResult;", "kotlin.jvm.PlatformType", "onNotificationListener"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes8.dex */
    public static final class a implements fve {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DinamicXEngine f20246a;

        public a(DinamicXEngine dinamicXEngine) {
            this.f20246a = dinamicXEngine;
        }

        @Override // tb.fve
        public final void onNotificationListener(fvb fvbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
            } else if (fvbVar == null) {
            } else {
                this.f20246a.o();
            }
        }
    }

    static {
        kge.a(290944580);
        INSTANCE = new c();
    }

    private c() {
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (f20245a) {
        } else {
            f20245a = true;
            ogg.a(TAG, "startPrefetch");
            d.INSTANCE.b();
            ArrayList arrayList = new ArrayList();
            d.INSTANCE.a(new DxPreloadExecutor$startPrefetch$1(arrayList));
            if (!(true ^ arrayList.isEmpty())) {
                return;
            }
            ogg.a(TAG, "startPrefetch: 启动引擎预下载");
            DinamicXEngine dinamicXEngine = new DinamicXEngine(new DXEngineConfig("preload"));
            dinamicXEngine.a(new a(dinamicXEngine));
            dinamicXEngine.a(arrayList);
        }
    }
}
