package com.alibaba.ability.impl.device;

import android.content.Context;
import android.content.ContextWrapper;
import android.media.AudioManager;
import android.os.Build;
import android.os.Process;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.resourceguardian.data.model.RGConstantsTypeInfo;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.simulatordetect.ISimulatorDetectComponent;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.aln;
import tb.als;
import tb.ild;
import tb.kge;

/* loaded from: classes2.dex */
public final class Device extends DeviceAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private VolumeChangeListener f1875a;

    static {
        kge.a(658697606);
    }

    public static /* synthetic */ Object ipc$super(Device device, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult a(als context, Map<String, ? extends Object> map, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e3d9aefd", new Object[]{this, context, map, callback});
        }
        q.d(context, "context");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            return new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null);
        }
        Object systemService = f.getApplicationContext().getSystemService("audio");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
        }
        AudioManager audioManager = (AudioManager) systemService;
        int streamVolume = (audioManager.getStreamVolume(3) * 100) / audioManager.getStreamMaxVolume(3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) Constant.PROP_TTS_VOLUME, (String) Integer.valueOf(streamVolume));
        callback.a((ExecuteResult) new FinishResult(jSONObject, "onData"));
        return null;
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult b(als context, Map<String, ? extends Object> map, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e4a82d7e", new Object[]{this, context, map, callback});
        }
        q.d(context, "context");
        q.d(callback, "callback");
        return a(context, map, callback);
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult c(als context, Map<String, ? extends Object> map, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e576abff", new Object[]{this, context, map, callback});
        }
        q.d(context, "context");
        q.d(callback, "callback");
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.HARDWARE;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        String str5 = ild.a(2).get(RGConstantsTypeInfo.MEMORY_MAX_SIZE);
        String str6 = "-1";
        if (q.a((Object) str5, (Object) "unknown")) {
            str5 = str6;
        }
        Float valueOf = str5 != null ? Float.valueOf(Float.parseFloat(str5)) : null;
        String str7 = ild.a(6).get(RGConstantsTypeInfo.STORAGE_SIZE);
        if (!q.a((Object) str7, (Object) "unknown")) {
            str6 = str7;
        }
        Float valueOf2 = str6 != null ? Float.valueOf(Float.parseFloat(str6)) : null;
        Context f = context.f().f();
        return new FinishResult(new JSONObject(ai.a(j.a("brand", str), j.a("model", str2), j.a("system", str3), j.a("platform", "Android"), j.a("cpuType", str4), j.a(MainRequestParams.CPU_CORE, Integer.valueOf(availableProcessors)), j.a("ram", valueOf), j.a("rom", valueOf2), j.a("isEmulator", f != null ? Boolean.valueOf(a(f)) : null), j.a("isArm64", Boolean.valueOf(Build.VERSION.SDK_INT >= 23 ? Process.is64Bit() : true)))), null, 2, null);
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult d(als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e6452a80", new Object[]{this, context, params, callback});
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            return new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null);
        }
        return new FinishResult(new JSONObject(ai.a(j.a("result", (Build.VERSION.SDK_INT < 19 || !l.d(f)) ? "NORMAL" : "FOLD"))), null, 2, null);
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult e(als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e713a901", new Object[]{this, context, params, callback});
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            return new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null);
        }
        return new FinishResult(new JSONObject(ai.a(j.a("result", l.b(f) ? "PAD" : "PHONE"))), null, 2, null);
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult setMediaVolumeListener(als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("d382874c", new Object[]{this, context, params, callback});
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        Context applicationContext = f != null ? f.getApplicationContext() : null;
        if (applicationContext == null) {
            return a$a.Companion.b("Context 为空");
        }
        VolumeChangeListener volumeChangeListener = this.f1875a;
        if (volumeChangeListener != null) {
            volumeChangeListener.a();
            this.f1875a = null;
        }
        this.f1875a = new VolumeChangeListener(applicationContext).a(callback).b();
        return null;
    }

    @Override // com.alibaba.ability.impl.device.DeviceAbility
    public ExecuteResult unsetMediaVolumeListener(als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("5fda67a5", new Object[]{this, context, params, callback});
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        VolumeChangeListener volumeChangeListener = this.f1875a;
        if (volumeChangeListener != null) {
            volumeChangeListener.a();
            this.f1875a = null;
        }
        return new FinishResult(null, null, 3, null);
    }

    private final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        try {
            SecurityGuardManager sgMgr = SecurityGuardManager.getInstance(new ContextWrapper(context));
            q.b(sgMgr, "sgMgr");
            ISimulatorDetectComponent simulatorDetectComp = sgMgr.getSimulatorDetectComp();
            q.b(simulatorDetectComp, "simulatorDetectComp");
            return simulatorDetectComp.isSimulator();
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // tb.alm
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        VolumeChangeListener volumeChangeListener = this.f1875a;
        if (volumeChangeListener == null) {
            return;
        }
        volumeChangeListener.a();
        this.f1875a = null;
    }
}
