package com.taobao.umipublish.extension.windvane.abilities;

import android.os.SystemClock;
import android.util.Log;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.workflow.e;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.util.s;
import com.taobao.android.litecreator.util.u;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.windvane.abilities.AbilityChain;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.hander.DownloadFileHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.DownloadMaterialHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.ExportHandler;
import com.taobao.umipublish.monitor.PerformanceMonitor;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import tb.kge;

/* loaded from: classes9.dex */
public class QuickPreviewAbility extends QuickBaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "QuickPreviewAbility";
    private JSONObject f;
    private long g;
    private final IntermediateData h = new IntermediateData();

    static {
        kge.a(1435575569);
    }

    public static /* synthetic */ Object ipc$super(QuickPreviewAbility quickPreviewAbility, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1778552717) {
            super.onExecute((JSONObject) objArr[0]);
            return null;
        } else if (hashCode == -1746903160) {
            super.errorCallback((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode != 1117095592) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.a((JSONObject) objArr[0]);
        }
    }

    public static /* synthetic */ JSONObject a(QuickPreviewAbility quickPreviewAbility, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8a2d716a", new Object[]{quickPreviewAbility, jSONObject});
        }
        quickPreviewAbility.f = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void a(QuickPreviewAbility quickPreviewAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d21166", new Object[]{quickPreviewAbility});
        } else {
            quickPreviewAbility.c();
        }
    }

    public static /* synthetic */ JSONObject b(QuickPreviewAbility quickPreviewAbility) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("298ddf07", new Object[]{quickPreviewAbility}) : quickPreviewAbility.f;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.QuickBaseAbility, com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
            return;
        }
        super.onExecute(jSONObject);
        try {
            this.g = SystemClock.elapsedRealtime();
            BaseAbility a2 = AbilityUtils.a(ITemplateExportAbility.class);
            if (a2 == null) {
                u.d(TAG, "createAbility error.");
                UmiPublishMonitor.a().b(TAG, "-1", "createAbility call error", null);
                errorCallback("20001", "RemoteNotReady");
                return;
            }
            this.c = new AbilityChain(new DownloadFilesAbility(), this.mContext).a(0.4f).a(b.a(R.string.gg_pub_resource_download)).loadingText(b.a(R.string.gg_pub_resource_downloading)).a(new DownloadFileHandler(this.f23339a, this.b, this.h));
            AbilityChain a3 = new AbilityChain(new DownloadMaterialAbility(), this.mContext).a(0.4f).a(b.a(R.string.gg_pub_resource_download)).loadingText(b.a(R.string.gg_pub_resource_downloading)).a(new DownloadMaterialHandler(this.f23339a, this.b, this.h));
            AbilityChain loadingText = new AbilityChain(a2, this.mContext).a(0.15f).a(b.a(R.string.gg_pub_video_preparation)).loadingText(b.a(R.string.gg_pub_video_preparing_0));
            AbilityChain loadingText2 = new AbilityChain(new QuickGoPreviewPageAbility(), this.mContext).a(0.05f).a(b.a(R.string.gg_pub_page_initialization)).loadingText(b.a(R.string.gg_pub_page_initializing));
            this.c.a(a3).a(loadingText).a(loadingText2);
            loadingText.a(new ExportHandler(this.f23339a, this.b, this.h) { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickPreviewAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 1117095592) {
                        return super.a((JSONObject) objArr[0]);
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.taobao.umipublish.extension.windvane.abilities.hander.ExportHandler, com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
                public JSONObject a(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (JSONObject) ipChange2.ipc$dispatch("429586a8", new Object[]{this, jSONObject2});
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.add("draft");
                    JSONObject a4 = super.a(jSONObject2);
                    a4.put("outputType", (Object) jSONArray);
                    return a4;
                }

                @Override // com.taobao.umipublish.extension.windvane.abilities.hander.ExportHandler, com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
                public void b(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("63b99827", new Object[]{this, jSONObject2});
                    } else {
                        QuickPreviewAbility.a(QuickPreviewAbility.this, jSONObject2);
                    }
                }
            });
            loadingText2.a(new AbilityChain.InputAndOutputHandler() { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickPreviewAbility.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == 1673107495) {
                        super.b((JSONObject) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
                public JSONObject a(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (JSONObject) ipChange2.ipc$dispatch("429586a8", new Object[]{this, jSONObject2});
                    }
                    au.c(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickPreviewAbility.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                QuickPreviewAbility.this.b();
                            }
                        }
                    });
                    UmiPublishMonitor.a().a(e.k(QuickPreviewAbility.this.mContext) ? "tab.inspiration" : "activity", "preview_complete", jSONObject);
                    QuickPreviewAbility.a(QuickPreviewAbility.this);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("publish_data", (Object) QuickPreviewAbility.this.f23339a);
                    jSONObject3.put("template_data", (Object) QuickPreviewAbility.b(QuickPreviewAbility.this));
                    jSONObject3.put("publish_params", (Object) QuickPreviewAbility.this.b);
                    return jSONObject3;
                }

                @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
                public void b(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("63b99827", new Object[]{this, jSONObject2});
                    } else {
                        super.b(jSONObject2);
                    }
                }
            });
            a();
            this.c.setListener(this.d);
            this.c.execute(jSONObject);
        } catch (Throwable th) {
            errorCallback("-1", Log.getStackTraceString(th));
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void errorCallback(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e05f88", new Object[]{this, str, str2});
            return;
        }
        super.errorCallback(str, str2);
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            PerformanceMonitor.a().a(e.k(this.mContext) ? "tab.inspiration" : "activity", "quick_preview_cost", SystemClock.elapsedRealtime() - this.g, this.f23339a);
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.QuickBaseAbility
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject}) : s.u() ? super.a(jSONObject) : m.b(jSONObject, AbilityConst.Server.i);
    }
}
