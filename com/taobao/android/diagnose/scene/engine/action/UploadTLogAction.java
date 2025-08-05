package com.taobao.android.diagnose.scene.engine.action;

import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import java.util.HashMap;
import tb.fmx;
import tb.fmy;
import tb.kge;
import tb.olf;
import tb.olg;

/* loaded from: classes.dex */
public class UploadTLogAction extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object e;
    private TLogActionConfig f;
    private boolean g;

    /* loaded from: classes.dex */
    public static class TLogActionConfig {
        public boolean needWifi = true;
        public long uploadScope = 30;
        public int actionInterval = 5;

        static {
            kge.a(1258397464);
        }
    }

    public static /* synthetic */ Object ipc$super(UploadTLogAction uploadTLogAction, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fmu
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : a.ACTION_TLOG_UPLOAD;
    }

    static {
        kge.a(-2060859628);
        e = new Object();
    }

    public UploadTLogAction(int i, String str, int i2) {
        super(i, str, i2);
        this.f = null;
        this.g = false;
        try {
            this.f = (TLogActionConfig) JSON.parseObject(str, TLogActionConfig.class);
            if (this.f != null) {
                return;
            }
            this.f = new TLogActionConfig();
        } catch (Exception e2) {
            v.a("UploadTLogAction", "parse TLogActionConfig failed", e2);
        }
    }

    @Override // tb.fmu
    public void a(fmx fmxVar, fmy fmyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c0f245", new Object[]{this, fmxVar, fmyVar});
            return;
        }
        v.d("UploadTLogAction", "Execute Action: " + c());
        try {
            synchronized (e) {
                if (this.g) {
                    v.d("UploadTLogAction", "In scene upload process!");
                } else if (!com.taobao.android.diagnose.scene.engine.config.a.a(this.f11719a, fmyVar.a(), this, this.f)) {
                    v.d("UploadTLogAction", "Can't execute tlog upload");
                } else {
                    this.g = true;
                    Long l = (Long) fmxVar.a("triggerTime");
                    if (l == null) {
                        l = Long.valueOf(System.currentTimeMillis());
                    }
                    a(fmyVar, l.longValue() - (this.f.uploadScope * 60000), l.longValue());
                }
            }
        } catch (Exception e2) {
            v.a("UploadTLogAction", "Execute tlog action exception.", e2);
        }
    }

    private void a(final fmy fmyVar, final long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1df006", new Object[]{this, fmyVar, new Long(j), new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ParamsConstants.Key.PARAM_SCENE_CODE, fmyVar.c());
        hashMap.put("sceneRuleCode", fmyVar.d());
        hashMap.put("content", "SceneUpload");
        hashMap.put("appVersion", com.taobao.android.diagnose.c.a().d().i().appVer);
        v.d("UploadTLogAction", String.format("Upload tlog file for scene. sceneCode=%s, sceneRuleCode=%s, ts=%d-%d", fmyVar.c(), fmyVar.d(), Long.valueOf(j), Long.valueOf(j2)));
        olg.c("SCENE", "scene_upload", hashMap, new olf() { // from class: com.taobao.android.diagnose.scene.engine.action.UploadTLogAction.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.olf
            public void a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                } else {
                    v.d("UploadTLogAction", String.format("uploadTLog failure for %s , ts=%d! ErrorCode: %s, ErrorMsg: %s", fmyVar.c(), Long.valueOf(j), str2, str3));
                }
            }

            @Override // tb.olf
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else {
                    v.d("UploadTLogAction", String.format("uploadTLog %s success for %s, ts=%d", str, fmyVar.c(), Long.valueOf(j)));
                }
            }
        });
        synchronized (e) {
            com.taobao.android.diagnose.scene.engine.config.a.a(this.f11719a, fmyVar.a(), c());
            this.g = false;
        }
    }
}
