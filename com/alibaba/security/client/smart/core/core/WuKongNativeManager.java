package com.alibaba.security.client.smart.core.core;

import android.content.Context;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.C1239pa;
import com.alibaba.security.ccrc.service.build.C1242qa;
import com.alibaba.security.ccrc.service.build.C1250ta;
import com.alibaba.security.ccrc.service.build.Ta;
import com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener;
import com.alibaba.security.client.smart.core.model.EvalResult;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.client.smart.core.wukong.action.BaseWuKongActionPerform;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class WuKongNativeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3341a = "WuKongNativeManager";
    public static final String b = "lrc_core";
    public static final String c = "cro_python_kit";
    public final C1250ta d;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final WuKongNativeManager f3342a = new WuKongNativeManager();
    }

    public /* synthetic */ WuKongNativeManager(C1239pa c1239pa) {
        this();
    }

    private void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{this, context, str, str2, str3});
        }
    }

    public static /* synthetic */ void a(WuKongNativeManager wuKongNativeManager, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9425cb8e", new Object[]{wuKongNativeManager, str, str2});
        } else {
            wuKongNativeManager.a(str, str2);
        }
    }

    private native String nativeEngineVersion();

    private native byte[] nativeNv21ToRgbOrBgr(byte[] bArr, int i, int i2, int i3);

    private native HashMap<String, Object> nativeRegisterPip(int i, ArrayList<String> arrayList);

    private native HashMap<String, Object> nativeUnregisterOrResetPipe(int i, int i2);

    private native HashMap<String, Object> nativeWritePip(int i, String str);

    private native String nativeWuKongGetStatistics();

    private native boolean nativeWuKongInit();

    private native EvalResult nativeWuKongProcess(String str, String str2);

    private native boolean nativeWuKongRegisterActionPerform(BaseWuKongActionPerform baseWuKongActionPerform);

    private native void nativeWuKongRelease(String str);

    private native boolean nativeWuKongUpdateExp(String str);

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d.a("cro_python_kit");
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d.a(b);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        if (c()) {
            return nativeEngineVersion();
        }
        return null;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (c()) {
            return nativeWuKongGetStatistics();
        }
        return null;
    }

    public WuKongNativeManager() {
        this.d = new C1250ta();
    }

    public static WuKongNativeManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WuKongNativeManager) ipChange.ipc$dispatch("d2fba7fa", new Object[0]) : a.f3342a;
    }

    private void b(OnRemoteSoLoadListener onRemoteSoLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b8d2f0", new Object[]{this, onRemoteSoLoadListener});
        } else {
            this.d.a(b, new C1239pa(this, onRemoteSoLoadListener));
        }
    }

    public void a(OnRemoteSoLoadListener onRemoteSoLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac56d11", new Object[]{this, onRemoteSoLoadListener});
        } else {
            this.d.a("cro_python_kit", new C1242qa(this, onRemoteSoLoadListener));
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            TrackManager.track(TrackLog.newBuilder().setPhase("error").setOperation("error").addParam("subModule", str).addParam("errorMsg", str2).build());
        }
    }

    public boolean a(BaseWuKongActionPerform baseWuKongActionPerform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("502a4f75", new Object[]{this, baseWuKongActionPerform})).booleanValue();
        }
        if (c()) {
            return nativeWuKongRegisterActionPerform(baseWuKongActionPerform);
        }
        return false;
    }

    public boolean a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6fc748c", new Object[]{this, context, str, str2, str3, str4})).booleanValue();
        }
        if (c()) {
            return nativeWuKongUpdateExp(str);
        }
        return false;
    }

    public void a(Context context, String str, String str2, final Ta.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc4928e", new Object[]{this, context, str, str2, aVar});
        } else if (c()) {
            nativeWuKongInit();
            aVar.a(true, "success");
        } else {
            b(new OnRemoteSoLoadListener() { // from class: com.alibaba.security.client.smart.core.core.-$$Lambda$WuKongNativeManager$GzAqUw9i1gSzEo44B4U3uPP07So
                @Override // com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener
                public final void onResult(String str3, boolean z, String str4) {
                    WuKongNativeManager.this.a(aVar, str3, z, str4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Ta.a aVar, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8f6c52", new Object[]{this, aVar, str, new Boolean(z), str2});
        } else if (!z) {
            aVar.a(false, str2);
        } else {
            nativeWuKongInit();
            aVar.a(true, "success");
        }
    }

    public EvalResult a(String str, InferContext inferContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EvalResult) ipChange.ipc$dispatch("a3b2a9b2", new Object[]{this, str, inferContext});
        }
        if (!c()) {
            return new EvalResult(false, false, "so load fail");
        }
        return nativeWuKongProcess(str, JsonUtils.toJSONString(inferContext));
    }

    public byte[] a(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8ba9ee49", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (c()) {
            return nativeNv21ToRgbOrBgr(bArr, i, i2, i3);
        }
        return null;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!c()) {
        } else {
            nativeWuKongRelease(str);
        }
    }

    public HashMap<String, Object> a(int i, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("77e85c92", new Object[]{this, new Integer(i), arrayList});
        }
        if (c()) {
            return nativeRegisterPip(i, arrayList);
        }
        return null;
    }

    public HashMap<String, Object> a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4bea62c8", new Object[]{this, new Integer(i), str});
        }
        if (c()) {
            return nativeWritePip(i, str);
        }
        return null;
    }

    public HashMap<String, Object> a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("67d8662b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (c()) {
            return nativeUnregisterOrResetPipe(i, i2);
        }
        return null;
    }
}
