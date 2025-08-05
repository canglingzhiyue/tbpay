package com.taobao.taolive.sdk.monitor;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.monitor.a;
import com.taobao.taolive.sdk.utils.u;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.pqc;
import tb.pqe;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taolive.sdk.monitor.a f21863a;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f21864a;

        static {
            kge.a(1411681116);
            f21864a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("467cabd9", new Object[0]) : f21864a;
        }
    }

    static {
        kge.a(1665995913);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!u.aD()) {
        } else {
            com.taobao.taolive.sdk.monitor.a aVar = this.f21863a;
            if (aVar == null) {
                this.f21863a = new pqc();
                this.f21863a.b(context);
                return;
            }
            aVar.a(context);
        }
    }

    public void a(String str, Map<String, String> map) {
        com.taobao.taolive.sdk.monitor.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (!u.aD() || (aVar = this.f21863a) == null) {
        } else {
            aVar.a(str, "start", map);
        }
    }

    public void a(String str, SceneStage sceneStage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41bde2bf", new Object[]{this, str, sceneStage});
        } else if (!u.aD()) {
        } else {
            String a2 = a(sceneStage);
            com.taobao.taolive.sdk.monitor.a aVar = this.f21863a;
            if (aVar == null) {
                return;
            }
            aVar.a(str, a2);
        }
    }

    private String a(SceneStage sceneStage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("493a02f7", new Object[]{this, sceneStage}) : sceneStage == null ? "unknown" : sceneStage.equals(SceneStage.SCENE_STAGE_T0) ? pqe.STAGE_T0 : sceneStage.equals(SceneStage.SCENE_STAGE_T1) ? pqe.STAGE_T1 : sceneStage.equals(SceneStage.SCENE_STAGE_T2) ? pqe.STAGE_T2 : sceneStage.equals(SceneStage.SCENE_STAGE_T3) ? pqe.STAGE_T3 : sceneStage.equals(SceneStage.SCENE_STAGE_T4) ? pqe.STAGE_T4 : sceneStage.equals(SceneStage.SCENE_STAGE_T5) ? pqe.STAGE_T5 : "unknown";
    }

    public void a(String str, SceneStage sceneStage, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a842e6", new Object[]{this, str, sceneStage, map});
        } else if (!u.aD()) {
        } else {
            String a2 = a(sceneStage);
            com.taobao.taolive.sdk.monitor.a aVar = this.f21863a;
            if (aVar == null) {
                return;
            }
            aVar.b(str, a2, map);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            b(str, null);
        }
    }

    public void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
        } else {
            a(str, map, (a.InterfaceC0908a) null);
        }
    }

    public void a(String str, Map<String, String> map, a.InterfaceC0908a interfaceC0908a) {
        com.taobao.taolive.sdk.monitor.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f707a82", new Object[]{this, str, map, interfaceC0908a});
        } else if (!u.aD() || (aVar = this.f21863a) == null) {
        } else {
            aVar.a(str, "end", map, interfaceC0908a);
        }
    }

    public void a() {
        com.taobao.taolive.sdk.monitor.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!u.aD() || (aVar = this.f21863a) == null) {
        } else {
            aVar.a();
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!u.aD()) {
        } else {
            if (!u.aF()) {
                pnj m = pmd.a().m();
                m.b("LiveAPMInstance", "close interceptContinueUpload  sessionId:" + str);
                return;
            }
            com.taobao.taolive.sdk.monitor.a aVar = this.f21863a;
            if (aVar == null) {
                return;
            }
            aVar.a(str);
        }
    }

    private b() {
    }

    public static b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a7cf4878", new Object[0]) : a.a();
    }
}
