package com.taobao.android.tab2liveroom.liveroom.preload;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes6.dex */
public class LivePreloadData implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_PRELOAD_ICON_STREAM = 2;
    public static final int STATUS_PRELOAD_NO_HIT_AB = 1;
    public static final int STATUS_PRELOAD_PARAMS_EMPTY = 3;
    public static final int STATUS_PRELOAD_SUCCESS = 0;
    @JSONField(name = aw.PARAM_CUSTOM_PLAY_CTRL)
    public String customPlayCtrlParams;
    @JSONField(name = "id")
    public String id;
    private boolean isHitPreloadAB = false;
    private int preloadStatus;
    private int preloadType;
    @JSONField(name = "trackInfo")
    public String trackInfo;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface PreloadStatus {
    }

    static {
        kge.a(-1855915759);
        kge.a(-540945145);
    }

    public boolean isHitPreloadAB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("67c97ec", new Object[]{this})).booleanValue() : this.isHitPreloadAB;
    }

    public void setHitPreloadAB(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b2bfb4", new Object[]{this, new Boolean(z)});
        } else {
            this.isHitPreloadAB = z;
        }
    }

    public int getPreloadStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d199a59f", new Object[]{this})).intValue() : this.preloadStatus;
    }

    public void setPreloadType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c12ccdb", new Object[]{this, new Integer(i)});
        } else {
            this.preloadType = i;
        }
    }

    public void buildPreloadStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38818194", new Object[]{this});
            return;
        }
        int i = this.preloadType;
        if (i == 0) {
            return;
        }
        if (!this.isHitPreloadAB) {
            this.preloadStatus = 1;
        } else if (i == 3) {
            this.preloadStatus = 2;
        } else if (StringUtils.isEmpty(this.customPlayCtrlParams) || StringUtils.isEmpty(this.id)) {
            this.preloadStatus = 3;
        } else {
            this.preloadStatus = 0;
        }
    }

    public boolean canComposeQuickOpenParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34f5f946", new Object[]{this})).booleanValue() : this.isHitPreloadAB && !StringUtils.isEmpty(this.customPlayCtrlParams) && !StringUtils.isEmpty(this.id);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LivePreloadData{id='" + this.id + "', customPlayCtrlParams='" + this.customPlayCtrlParams + "', trackInfo='" + this.trackInfo + "'}";
    }
}
