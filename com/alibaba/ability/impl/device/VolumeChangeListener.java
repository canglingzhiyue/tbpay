package com.alibaba.ability.impl.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.aln;
import tb.kge;

/* loaded from: classes2.dex */
public final class VolumeChangeListener extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";

    /* renamed from: a  reason: collision with root package name */
    private aln f1876a;
    private final AudioManager b;
    private final Context c;

    static {
        kge.a(-1250474642);
        Companion = new a(null);
    }

    public VolumeChangeListener(Context context) {
        q.d(context, "context");
        this.c = context;
        Object systemService = this.c.getSystemService("audio");
        q.a(systemService);
        if (systemService != null) {
            this.b = (AudioManager) systemService;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
    }

    public final VolumeChangeListener a(aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VolumeChangeListener) ipChange.ipc$dispatch("78585322", new Object[]{this, alnVar});
        }
        this.f1876a = alnVar;
        return this;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null || !q.a((Object) "android.media.VOLUME_CHANGED_ACTION", (Object) intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3) {
        } else {
            int streamVolume = (this.b.getStreamVolume(3) * 100) / this.b.getStreamMaxVolume(3);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) Constant.PROP_TTS_VOLUME, (String) Integer.valueOf(streamVolume));
            aln alnVar = this.f1876a;
            if (alnVar == null) {
                return;
            }
            alnVar.a((ExecuteResult) new FinishResult(jSONObject, "onVolumeChanged"));
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            this.c.unregisterReceiver(this);
        } catch (Throwable unused) {
        }
        this.f1876a = null;
    }

    public final VolumeChangeListener b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VolumeChangeListener) ipChange.ipc$dispatch("3bf6120e", new Object[]{this});
        }
        this.c.registerReceiver(this, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        return this;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-1464221898);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
