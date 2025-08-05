package com.taobao.message.datasdk.facade.message.newmsgbody;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class NewImageExMsgBody extends BaseMsgBody {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HIDE_MESSAGE_BUBBLE = "hide_message_bubble";
    public static final String LOCAL_DATA_GIF_LOCAL_PATH = "gif_local_path";
    public static final String LOCAL_DATA_URL_LOCAL_PATH = "url_local_path";
    private Map<String, Object> localData;

    static {
        kge.a(-411361012);
    }

    public NewImageExMsgBody(Map<String, Object> map, Map<String, Object> map2) {
        super(map);
        this.localData = map2;
        setHideMessageBubble(true);
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : ValueUtil.getString(this.originData, "url");
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("url", str);
    }

    public String getGifUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31e38f98", new Object[]{this});
        }
        String string = ValueUtil.getString(this.originData, "gifUrl");
        return TextUtils.isEmpty(string) ? getUrl() : string;
    }

    public void setGifUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3850de", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("gifUrl", str);
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : ValueUtil.getInteger(this.originData, "height");
    }

    public void setHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("height", Integer.valueOf(i));
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : ValueUtil.getInteger(this.originData, "width");
    }

    public void setWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("width", Integer.valueOf(i));
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : ValueUtil.getString(this.originData, "name");
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("name", str);
    }

    public String getMimeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6adace75", new Object[]{this}) : ValueUtil.getString(this.originData, "mimeType");
    }

    public void setMimeType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5c5aa1", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("mimeType", str);
    }

    public void setFileId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b7608a", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("fileId", str);
    }

    public String getLocalUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d83b8fbf", new Object[]{this}) : ValueUtil.getString(this.localData, LOCAL_DATA_URL_LOCAL_PATH);
    }

    public String getLocalGifUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72995d9", new Object[]{this});
        }
        String string = ValueUtil.getString(this.localData, LOCAL_DATA_GIF_LOCAL_PATH);
        return TextUtils.isEmpty(string) ? getLocalUrl() : string;
    }

    public void setLocalUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba13c297", new Object[]{this, str});
            return;
        }
        if (this.localData == null) {
            this.localData = new HashMap();
        }
        this.localData.put(LOCAL_DATA_URL_LOCAL_PATH, str);
    }

    public void setLocalGifUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c05425", new Object[]{this, str});
            return;
        }
        if (this.localData == null) {
            this.localData = new HashMap();
        }
        this.localData.put(LOCAL_DATA_GIF_LOCAL_PATH, str);
    }

    public Map<String, Object> getLocalData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("811783bb", new Object[]{this}) : this.localData;
    }

    public boolean isHideMessageBubble() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19992252", new Object[]{this})).booleanValue() : ValueUtil.getBoolean(this.localData, HIDE_MESSAGE_BUBBLE, false);
    }

    public void setHideMessageBubble(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d569cf7e", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.localData == null) {
            this.localData = new HashMap();
        }
        this.localData.put(HIDE_MESSAGE_BUBBLE, Boolean.valueOf(z));
    }
}
