package com.taobao.themis.external.embed;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.themis.external.embed.TMSWidgetInfo;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.uc.webview.export.media.CommandID;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.cjm;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010J\u001a\u00020\u0000J\u0006\u0010K\u001a\u00020\u0005J\b\u0010L\u001a\u0004\u0018\u000100J\u0010\u0010M\u001a\u0004\u0018\u00010\u00052\u0006\u0010N\u001a\u00020\u0005J\b\u0010O\u001a\u0004\u0018\u00010\u0005J\u0006\u0010P\u001a\u00020\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R(\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001a\u0010\u001d\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001a\u0010&\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010\u0012R\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001c\u0010,\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\tR\u001e\u00108\u001a\u0004\u0018\u00010\u00058VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010\tR\u001c\u0010;\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0007\"\u0004\b=\u0010\tR\u001c\u0010>\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0007\"\u0004\b@\u0010\tR\u001c\u0010A\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0007\"\u0004\bC\u0010\tR\u001c\u0010D\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0007\"\u0004\bF\u0010\tR(\u0010G\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0007\"\u0004\bI\u0010\t¨\u0006Q"}, d2 = {"Lcom/taobao/themis/external/embed/WidgetStartParams;", "Lcom/taobao/themis/external/embed/StartParams;", "Ljava/io/Serializable;", "()V", "debugUrl", "", "getDebugUrl", "()Ljava/lang/String;", "setDebugUrl", "(Ljava/lang/String;)V", "extraData", "getExtraData", "setExtraData", "hasAttached", "", "getHasAttached", "()Z", "setHasAttached", "(Z)V", "hasValidWidgetInfo", "getHasValidWidgetInfo", "setHasValidWidgetInfo", "value", "height", "getHeight", "setHeight", "initData", "getInitData", "setInitData", "lazyInit", "getLazyInit", "setLazyInit", "mSpmOri", "getMSpmOri", "setMSpmOri", "metaInfo", cjm.ZIM_IDENTIFY_GET_META_INFO, "setMetaInfo", MusLiveVideo.ATTR_MUTE, "getMuted", CommandID.setMuted, "relationUrl", "getRelationUrl", "setRelationUrl", "sceneParams", "getSceneParams", "setSceneParams", "sceneParamsObject", "Lcom/alibaba/fastjson/JSONObject;", "getSceneParamsObject", "()Lcom/alibaba/fastjson/JSONObject;", "setSceneParamsObject", "(Lcom/alibaba/fastjson/JSONObject;)V", "spmUrl", "getSpmUrl", "setSpmUrl", "url", "getUrl", "setUrl", "version", "getVersion", "setVersion", "viewId", "getViewId", "setViewId", "widgetId", "getWidgetId", "setWidgetId", "widgetInfo", "getWidgetInfo", "setWidgetInfo", "width", "getWidth", "setWidth", CartRecommendRefreshScene.build, "getRealSpmUrl", "getSceneParamObject", "getSceneParamValue", "key", "getSpmOri", "getWidgetUrl", "themis_interface_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class WidgetStartParams extends StartParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String debugUrl;
    private String extraData;
    private boolean hasAttached;
    private boolean hasValidWidgetInfo;
    private String height;
    private String initData;
    private boolean lazyInit;
    private String mSpmOri;
    private String metaInfo;
    private boolean muted;
    private String relationUrl;
    private String sceneParams;
    private JSONObject sceneParamsObject;
    private String spmUrl;
    private String url;
    private String version;
    private String viewId;
    private String widgetId;
    private String widgetInfo;
    private String width;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/taobao/themis/external/embed/WidgetStartParams$build$3$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
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
            com.taobao.themis.kernel.metaInfo.appinfo.a a2 = com.taobao.themis.kernel.metaInfo.appinfo.a.a();
            String widgetId = WidgetStartParams.this.getWidgetId();
            q.a((Object) widgetId);
            a2.a(widgetId, WidgetStartParams.this.getMetaInfo());
        }
    }

    static {
        kge.a(295418528);
        kge.a(1028243835);
    }

    public final String getViewId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b88d723", new Object[]{this}) : this.viewId;
    }

    public final void setViewId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53bfab3", new Object[]{this, str});
        } else {
            this.viewId = str;
        }
    }

    public final String getWidgetId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eec0a24", new Object[]{this}) : this.widgetId;
    }

    public final void setWidgetId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597294d2", new Object[]{this, str});
        } else {
            this.widgetId = str;
        }
    }

    public final String getRelationUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd2c1a7c", new Object[]{this}) : this.relationUrl;
    }

    public final void setRelationUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63e2", new Object[]{this, str});
        } else {
            this.relationUrl = str;
        }
    }

    public final String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public final void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }

    public final String getMetaInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a8db4d0", new Object[]{this}) : this.metaInfo;
    }

    public final void setMetaInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2063fa6", new Object[]{this, str});
        } else {
            this.metaInfo = str;
        }
    }

    public final String getSpmUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8bf3b984", new Object[]{this}) : this.spmUrl;
    }

    public final void setSpmUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922d6472", new Object[]{this, str});
        } else {
            this.spmUrl = str;
        }
    }

    public final String getDebugUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c4a0ea7", new Object[]{this}) : this.debugUrl;
    }

    public final void setDebugUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d520af", new Object[]{this, str});
        } else {
            this.debugUrl = str;
        }
    }

    public final String getSceneParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c58187d", new Object[]{this}) : this.sceneParams;
    }

    public final void setSceneParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26622601", new Object[]{this, str});
        } else {
            this.sceneParams = str;
        }
    }

    public final JSONObject getSceneParamsObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("349cd082", new Object[]{this}) : this.sceneParamsObject;
    }

    public final void setSceneParamsObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81052dda", new Object[]{this, jSONObject});
        } else {
            this.sceneParamsObject = jSONObject;
        }
    }

    public final String getInitData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dbad42a9", new Object[]{this}) : this.initData;
    }

    public final void setInitData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d86ced", new Object[]{this, str});
        } else {
            this.initData = str;
        }
    }

    public final String getExtraData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a2532c55", new Object[]{this}) : this.extraData;
    }

    public final void setExtraData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a501a29", new Object[]{this, str});
        } else {
            this.extraData = str;
        }
    }

    public final boolean getMuted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("44bd39c0", new Object[]{this})).booleanValue() : this.muted;
    }

    public final void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
        } else {
            this.muted = z;
        }
    }

    public final boolean getLazyInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9dacb7a5", new Object[]{this})).booleanValue() : this.lazyInit;
    }

    public final void setLazyInit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac155c7", new Object[]{this, new Boolean(z)});
        } else {
            this.lazyInit = z;
        }
    }

    public final boolean getHasAttached() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5e831b3", new Object[]{this})).booleanValue() : this.hasAttached;
    }

    public final void setHasAttached(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1b4c11", new Object[]{this, new Boolean(z)});
        } else {
            this.hasAttached = z;
        }
    }

    @Override // com.taobao.themis.external.embed.StartParams
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    @Override // com.taobao.themis.external.embed.StartParams
    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : getWidgetUrl();
    }

    public final String getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dfb784e9", new Object[]{this}) : this.width;
    }

    public final void setWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c411ae15", new Object[]{this, str});
            return;
        }
        if (str != null && n.c(str, "rpx", false, 2, (Object) null)) {
            str = str.substring(0, str.length() - 3);
            q.b(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        this.width = str;
    }

    public final String getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f6ba1efc", new Object[]{this}) : this.height;
    }

    public final void setHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8033adfa", new Object[]{this, str});
            return;
        }
        if (str != null && n.c(str, "rpx", false, 2, (Object) null)) {
            str = str.substring(0, str.length() - 3);
            q.b(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        this.height = str;
    }

    public final String getWidgetInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f07af1", new Object[]{this}) : this.widgetInfo;
    }

    public final void setWidgetInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf086aa5", new Object[]{this, str});
        } else {
            this.widgetInfo = str;
        }
    }

    public final String getMSpmOri() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("347eaf6c", new Object[]{this}) : this.mSpmOri;
    }

    public final void setMSpmOri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625ac6f2", new Object[]{this, str});
        } else {
            this.mSpmOri = str;
        }
    }

    public final boolean getHasValidWidgetInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a6631b5", new Object[]{this})).booleanValue() : this.hasValidWidgetInfo;
    }

    public final void setHasValidWidgetInfo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28909cb7", new Object[]{this, new Boolean(z)});
        } else {
            this.hasValidWidgetInfo = z;
        }
    }

    public final String getWidgetUrl() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2f98844", new Object[]{this});
        }
        String str = this.debugUrl;
        String str2 = str;
        if (str2 == null || n.a((CharSequence) str2)) {
            z = true;
        }
        if (!(!z)) {
            str = null;
        }
        if (str == null) {
            this.debugUrl = "https://m.duanqu.com?isCanal=true&_ariver_appid=" + this.widgetId;
            if (this.version != null) {
                this.debugUrl += "&nbsv=" + this.version;
            }
            if (q.a((Object) getSceneParamValue("isPreview"), (Object) "1")) {
                this.debugUrl += "&&nbsource=debug&nbsn=DEBUG";
            }
            t tVar = t.INSTANCE;
        }
        String str3 = this.debugUrl;
        q.a((Object) str3);
        return str3;
    }

    public final String getSceneParamValue(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d6f5c95", new Object[]{this, key});
        }
        q.d(key, "key");
        try {
            Result.a aVar = Result.Companion;
            if (this.sceneParamsObject == null) {
                this.sceneParamsObject = StringUtils.isEmpty(this.sceneParams) ? new JSONObject() : JSONObject.parseObject(this.sceneParams);
                t tVar = t.INSTANCE;
            }
            JSONObject jSONObject = this.sceneParamsObject;
            q.a(jSONObject);
            return jSONObject.getString(key);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
            return null;
        }
    }

    public final JSONObject getSceneParamObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3140021d", new Object[]{this});
        }
        try {
            Result.a aVar = Result.Companion;
            if (this.sceneParamsObject == null) {
                this.sceneParamsObject = StringUtils.isEmpty(this.sceneParams) ? new JSONObject() : JSONObject.parseObject(this.sceneParams);
                t tVar = t.INSTANCE;
            }
            return this.sceneParamsObject;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
            return null;
        }
    }

    public final String getSpmOri() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1059306d", new Object[]{this});
        }
        if (this.mSpmOri == null) {
            String str3 = "miniapp_" + this.widgetId + "_scene" + getSceneParamValue("sceneId");
            String str4 = this.spmUrl;
            if (str4 != null) {
                List b = n.b((CharSequence) str4, new String[]{"."}, false, 0, 6, (Object) null);
                str2 = b.size() > 1 ? (String) b.get(1) : "0";
                str = true ^ b.isEmpty() ? (String) b.get(0) : "0";
            } else {
                str = "0";
                str2 = str;
            }
            this.mSpmOri = str + '.' + str2 + '.' + str3 + ".0";
            t tVar = t.INSTANCE;
        }
        String str5 = this.mSpmOri;
        q.a((Object) str5);
        return str5;
    }

    public final String getRealSpmUrl() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("524c006", new Object[]{this});
        }
        String str = this.spmUrl;
        if (str == null || n.a((CharSequence) str)) {
            z = true;
        }
        if (z) {
            return "MiniApp_" + this.widgetId;
        }
        String str2 = this.spmUrl;
        q.a((Object) str2);
        return str2;
    }

    public final WidgetStartParams build() {
        String valueOf;
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetStartParams) ipChange.ipc$dispatch("ef780bd0", new Object[]{this});
        }
        if (this.widgetInfo != null) {
            try {
                Result.a aVar = Result.Companion;
                TMSWidgetInfo tMSWidgetInfo = (TMSWidgetInfo) JSON.parseObject(this.widgetInfo, TMSWidgetInfo.class);
                if (tMSWidgetInfo != null) {
                    this.hasValidWidgetInfo = true;
                    Long widgetId = tMSWidgetInfo.getWidgetId();
                    if (widgetId != null && (valueOf = String.valueOf(widgetId.longValue())) != null) {
                        this.widgetId = valueOf;
                    }
                    String widgetVersion = tMSWidgetInfo.getWidgetVersion();
                    if (widgetVersion != null) {
                        this.version = widgetVersion;
                    }
                    t tVar = null;
                    if (this.width == null) {
                        TMSWidgetInfo.ViewConfig viewConfig = tMSWidgetInfo.getViewConfig();
                        if (com.taobao.themis.utils.t.a(viewConfig != null ? viewConfig.getWidth() : null)) {
                            TMSWidgetInfo.ViewConfig viewConfig2 = tMSWidgetInfo.getViewConfig();
                            q.a(viewConfig2);
                            String width = viewConfig2.getWidth();
                            q.a((Object) width);
                            setWidth(width);
                        }
                    }
                    if (this.height == null) {
                        TMSWidgetInfo.ViewConfig viewConfig3 = tMSWidgetInfo.getViewConfig();
                        if (com.taobao.themis.utils.t.a(viewConfig3 != null ? viewConfig3.getHeight() : null)) {
                            TMSWidgetInfo.ViewConfig viewConfig4 = tMSWidgetInfo.getViewConfig();
                            q.a(viewConfig4);
                            String height = viewConfig4.getHeight();
                            q.a((Object) height);
                            setHeight(height);
                        }
                    }
                    String metaInfo = tMSWidgetInfo.getMetaInfo();
                    if (metaInfo != null) {
                        this.metaInfo = metaInfo;
                    }
                    String relationUrl = tMSWidgetInfo.getRelationUrl();
                    if (relationUrl != null) {
                        this.relationUrl = relationUrl;
                    }
                    if (tMSWidgetInfo.getConfigData() != null) {
                        this.sceneParamsObject = StringUtils.isEmpty(this.sceneParams) ? new JSONObject() : JSONObject.parseObject(this.sceneParams);
                        JSONObject jSONObject = this.sceneParamsObject;
                        q.a(jSONObject);
                        jSONObject.put((JSONObject) "moduleData", (String) JSON.parse(tMSWidgetInfo.getConfigData()));
                        JSONObject jSONObject2 = this.sceneParamsObject;
                        q.a(jSONObject2);
                        this.sceneParams = jSONObject2.toJSONString();
                        tVar = t.INSTANCE;
                    }
                    Result.m2371constructorimpl(tVar);
                }
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(i.a(th));
            }
        }
        String str = this.debugUrl;
        if (str != null) {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter(com.taobao.themis.kernel.i.APP_ID);
            if (!StringUtils.isEmpty(queryParameter)) {
                this.widgetId = queryParameter;
            }
            String queryParameter2 = parse.getQueryParameter("relationUrl");
            if (!StringUtils.isEmpty(queryParameter2)) {
                this.relationUrl = URLDecoder.decode(queryParameter2);
            }
        }
        if (this.metaInfo != null && (iExecutorService = (IExecutorService) qpt.b(IExecutorService.class)) != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
            executor.execute(new a());
        }
        return this;
    }
}
