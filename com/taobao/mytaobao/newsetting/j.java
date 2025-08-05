package com.taobao.mytaobao.newsetting;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.hjz;
import tb.jpw;
import tb.kge;
import tb.ksx;
import tb.mxr;
import tb.mxv;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/taobao/mytaobao/newsetting/SilenceConfigReporter;", "", "()V", "SP_KEY", "", "SP_NAME_SPACE", "sendSilenceSwitch", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f18436a = "mtbSilenceSwitch";
    private final String b = "lastTime";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            float a2 = ((float) hjz.DAY) * jpw.a("silenceUtLimit", 1.0f);
            long currentTimeMillis = System.currentTimeMillis();
            if (((float) currentTimeMillis) <= ((float) mxv.a(j.a(j.this), j.b(j.this), 0L)) + a2) {
                return;
            }
            ksx ksxVar = new ksx(Globals.getApplication());
            String str = "1";
            String str2 = q.a(ksxVar.a("mytaobao", "mute"), (Object) true) ? str : "0";
            String str3 = q.a(ksxVar.a("mytaobao", "liveMute"), (Object) true) ? str : "0";
            String str4 = q.a(ksxVar.a("mytaobao", mxr.KEY_INLINE_VOLUME), (Object) true) ? str : "0";
            if (!q.a(ksxVar.a("mytaobao", "timeFrameMute"), (Object) true)) {
                str = "0";
            }
            Object a3 = ksxVar.a("mytaobao", "timeFrameMuteSub");
            com.taobao.global.setting.d a4 = com.taobao.global.setting.d.a();
            q.a((Object) a4, "GlobalEnv.getInstance()");
            boolean b = a4.b();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "mute", str2);
            jSONObject2.put((JSONObject) "liveMute", str3);
            jSONObject2.put((JSONObject) "builtInVoice", str4);
            jSONObject2.put((JSONObject) "timeFrameMute", str);
            jSONObject2.put((JSONObject) "timeFrameMute_subStatus", (String) a3);
            jSONObject2.put((JSONObject) "hitABTestForSoundSetting", (String) Boolean.valueOf(b));
            TBS.Ext.commitEvent("Page_MyTaobao", 19999, "mtbMuteSettingsConfig", null, null, com.taobao.mytaobao.ut.c.a(jSONObject));
            mxv.b(j.a(j.this), j.b(j.this), currentTimeMillis);
        }
    }

    static {
        kge.a(-1924576825);
    }

    public static final /* synthetic */ String a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a028d236", new Object[]{jVar}) : jVar.f18436a;
    }

    public static final /* synthetic */ String b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a15f2515", new Object[]{jVar}) : jVar.b;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.taobao.mytaobao.base.b.a(new a(), 2000L);
        }
    }
}
