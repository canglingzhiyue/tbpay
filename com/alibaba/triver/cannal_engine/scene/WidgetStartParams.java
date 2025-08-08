package com.alibaba.triver.cannal_engine.scene;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.net.URLDecoder;
import tb.cbs;
import tb.kge;

/* loaded from: classes3.dex */
public class WidgetStartParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String bridgeId;
    private String debugUrl;
    private String extraData;
    private String groupId;
    private String initData;
    private String metaInfo;
    private String relationUrl;
    private String renderMode;
    private String sceneParams;
    private String spmUrl;
    private String version;
    private String widgetId;
    private String widgetInfo;
    private int width = -1;
    private int height = -1;
    private int visualX = 0;
    private int visualY = 0;
    private boolean lazyInit = false;
    private boolean muted = false;

    static {
        kge.a(-307325804);
        kge.a(1028243835);
    }

    public String getWidgetId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eec0a24", new Object[]{this}) : this.widgetId;
    }

    public void setWidgetId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597294d2", new Object[]{this, str});
        } else {
            this.widgetId = str;
        }
    }

    public String getRelationUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd2c1a7c", new Object[]{this}) : this.relationUrl;
    }

    public void setRelationUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63e2", new Object[]{this, str});
        } else {
            this.relationUrl = str;
        }
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }

    public String getSpmUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8bf3b984", new Object[]{this}) : this.spmUrl;
    }

    public void setSpmUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922d6472", new Object[]{this, str});
        } else {
            this.spmUrl = str;
        }
    }

    public String getDebugUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c4a0ea7", new Object[]{this}) : this.debugUrl;
    }

    public void setDebugUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d520af", new Object[]{this, str});
        } else {
            this.debugUrl = str;
        }
    }

    public String getSceneParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c58187d", new Object[]{this}) : this.sceneParams;
    }

    public void setSceneParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26622601", new Object[]{this, str});
        } else {
            this.sceneParams = str;
        }
    }

    public String getInitData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dbad42a9", new Object[]{this}) : this.initData;
    }

    public void setInitData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d86ced", new Object[]{this, str});
        } else {
            this.initData = str;
        }
    }

    public String getExtraData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a2532c55", new Object[]{this}) : this.extraData;
    }

    public void setExtraData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a501a29", new Object[]{this, str});
        } else {
            this.extraData = str;
        }
    }

    public String getBridgeId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("800a233f", new Object[]{this}) : this.bridgeId;
    }

    public void setBridgeId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c179f17", new Object[]{this, str});
        } else {
            this.bridgeId = str;
        }
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : this.width;
    }

    public void setWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c411ae15", new Object[]{this, str});
        } else {
            this.width = cbs.a(str, -1);
        }
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : this.height;
    }

    public void setHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8033adfa", new Object[]{this, str});
        } else {
            this.height = cbs.a(str, -1);
        }
    }

    public int getVisualX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8a7ce05c", new Object[]{this})).intValue() : this.visualX;
    }

    public void setVisualX(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ef2067", new Object[]{this, str});
        } else {
            this.visualX = cbs.a(str, 0);
        }
    }

    public int getVisualY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8a8af7dd", new Object[]{this})).intValue() : this.visualY;
    }

    public void setVisualY(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320b9a8", new Object[]{this, str});
        } else {
            this.visualY = cbs.a(str, 0);
        }
    }

    public String getMetaInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a8db4d0", new Object[]{this}) : this.metaInfo;
    }

    public void setMetaInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2063fa6", new Object[]{this, str});
        } else {
            this.metaInfo = str;
        }
    }

    public String getGroupId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this}) : this.groupId;
    }

    public void setGroupId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a446e5c9", new Object[]{this, str});
        } else {
            this.groupId = str;
        }
    }

    public Boolean getLazyInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("194d82de", new Object[]{this}) : Boolean.valueOf(this.lazyInit);
    }

    public void setLazyInit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac155c7", new Object[]{this, new Boolean(z)});
        } else {
            this.lazyInit = z;
        }
    }

    public String getWidgetInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f07af1", new Object[]{this}) : this.widgetInfo;
    }

    public void setWidgetInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf086aa5", new Object[]{this, str});
        } else {
            this.widgetInfo = str;
        }
    }

    public void setRenderMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98436eac", new Object[]{this, str});
        } else {
            this.renderMode = str;
        }
    }

    public String getRenderMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8d15a0a", new Object[]{this}) : this.renderMode;
    }

    public boolean isMuted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue() : this.muted;
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
        } else {
            this.muted = z;
        }
    }

    public WidgetStartParams build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetStartParams) ipChange.ipc$dispatch("6acd349c", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.widgetInfo)) {
            try {
                TRWidgetInfo tRWidgetInfo = (TRWidgetInfo) JSON.parseObject(this.widgetInfo, TRWidgetInfo.class);
                if (tRWidgetInfo == null) {
                    return this;
                }
                this.widgetId = String.valueOf(tRWidgetInfo.getWidgetId());
                this.version = tRWidgetInfo.getWidgetVersion();
                if (getWidth() == -1 && cbs.a(tRWidgetInfo.getViewConfig().getWidth()).booleanValue()) {
                    setWidth(tRWidgetInfo.getViewConfig().getWidth());
                }
                if (getHeight() == -1 && cbs.a(tRWidgetInfo.getViewConfig().getHeight()).booleanValue()) {
                    setHeight(tRWidgetInfo.getViewConfig().getHeight());
                }
                this.metaInfo = tRWidgetInfo.getMetaInfo();
                this.relationUrl = tRWidgetInfo.getRelationUrl();
                if (!StringUtils.isEmpty(tRWidgetInfo.getConfigData())) {
                    JSONObject jSONObject = StringUtils.isEmpty(this.sceneParams) ? new JSONObject() : JSONObject.parseObject(this.sceneParams);
                    jSONObject.put("moduleData", JSON.parse(tRWidgetInfo.getConfigData()));
                    this.sceneParams = jSONObject.toJSONString();
                }
            } catch (Exception e) {
                RVLogger.e("TRWidgetStartParams", e);
            }
        }
        if (!StringUtils.isEmpty(this.debugUrl)) {
            String queryParameter = Uri.parse(this.debugUrl).getQueryParameter("relationUrl");
            if (!StringUtils.isEmpty(queryParameter)) {
                this.relationUrl = URLDecoder.decode(queryParameter);
            }
        }
        return this;
    }
}
