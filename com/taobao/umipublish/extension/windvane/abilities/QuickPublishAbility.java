package com.taobao.umipublish.extension.windvane.abilities;

import android.util.Log;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.workflow.e;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.util.u;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.windvane.abilities.hander.ContentPublishHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.DownloadFileHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.DownloadMaterialHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.ExportHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.InsertContentListTopHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.KFCHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.UploadFileHandler;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import tb.kge;
import tb.ref;

/* loaded from: classes9.dex */
public class QuickPublishAbility extends QuickBaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LOCAL_MEDIA_FILES = "localMediaFiles";
    private static final String TAG = "QuickPublishAbility";
    private final IntermediateData f = new IntermediateData();

    static {
        kge.a(1050852842);
    }

    public static /* synthetic */ Object ipc$super(QuickPublishAbility quickPublishAbility, String str, Object... objArr) {
        if (str.hashCode() == -1778552717) {
            super.onExecute((JSONObject) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.QuickBaseAbility, com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
            return;
        }
        super.onExecute(jSONObject);
        c();
        try {
            BaseAbility a2 = AbilityUtils.a(ITemplateExportAbility.class);
            BaseAbility a3 = AbilityUtils.a(IContentPublishAbility.class);
            BaseAbility a4 = AbilityUtils.a(IUploadFilesAbility.class);
            if (a2 != null && a3 != null && a4 != null) {
                AbilityChain a5 = new AbilityChain(new DownloadFilesAbility(), this.mContext).a(0.2f).a(b.a(R.string.gg_pub_resource_download)).loadingText(b.a(R.string.gg_pub_resource_downloading)).a(new DownloadFileHandler(this.f23339a, this.b, this.f));
                AbilityChain a6 = new AbilityChain(new DownloadMaterialAbility(), this.mContext).a(0.1f).a(b.a(R.string.gg_pub_resource_download)).loadingText(b.a(R.string.gg_pub_resource_downloading)).a(new DownloadMaterialHandler(this.f23339a, this.b, this.f));
                AbilityChain a7 = new AbilityChain(a2, this.mContext).a(0.5f).a(b.a(R.string.gg_pub_video_composition)).loadingText(b.a(R.string.gg_pub_video_synthesis_in_progress)).a(new ExportHandler(this.f23339a, this.b, this.f));
                AbilityChain a8 = new AbilityChain(a4, this.mContext).a(0.1f).a(b.a(R.string.gg_pub_file_upload)).loadingText(b.a(R.string.gg_pub_file_uploading)).a(new UploadFileHandler(this.f23339a, this.b, this.f));
                AbilityChain a9 = new AbilityChain(new KfcCheckAbility(), this.mContext).a(0.03f).a(b.a(R.string.gg_pub_publish)).loadingText(b.a(R.string.gg_pub_publishing)).a(new KFCHandler(this.f23339a, this.b, this.f));
                a5.a(a6).a(a7).a(a8).a(a9).a(new AbilityChain(a3, this.mContext).a(0.06f).a(b.a(R.string.gg_pub_publish)).loadingText(b.a(R.string.gg_pub_publishing)).a(new ContentPublishHandler(this.f23339a, this.b, this.f))).a(new AbilityChain(new InsertContentListTopAbility(), this.mContext).a(0.01f).a(b.a(R.string.gg_pub_publish)).loadingText(b.a(R.string.gg_pub_publishing)).a(new InsertContentListTopHandler(this.f23339a, this.b, this.f)));
                if (!this.f23339a.containsKey("localMediaFiles")) {
                    this.c = a5;
                } else {
                    this.c = a6.a(0.3f);
                    JSONArray jSONArray = this.f23339a.getJSONArray("localMediaFiles");
                    if (jSONArray != null && jSONArray.size() > 0) {
                        this.f.mDownloadedMediaList.addAll(jSONArray);
                        this.f.mMainClipSource = m.a(jSONArray.getJSONObject(0), "clipSource", "0");
                    }
                }
                a();
                this.c.setListener(this.d);
                this.c.execute(jSONObject);
                return;
            }
            u.d("QuickPublishAbility", "createAbility error.");
            UmiPublishMonitor.a().b("QuickPublishAbility", "-1", "createAbility call error", null);
            errorCallback("20001", "RemoteNotReady");
        } catch (Throwable th) {
            errorCallback("-1", Log.getStackTraceString(th));
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (e.k(this.mContext)) {
        } else {
            ref.a(this.b);
        }
    }
}
