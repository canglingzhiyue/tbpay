package com.taobao.message.datasdk.facade.message.newmsgbody;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class NewImageMsgBody extends BaseMsgBody {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HIDE_MESSAGE_BUBBLE = "hide_message_bubble";
    private static final String LOCAL_THUMBNAIL_PATH = "local_thumbnail_path";
    private static final String LOCAL_URL = "local_url";
    private Map<String, Object> localData;

    static {
        kge.a(-1923767233);
    }

    public NewImageMsgBody(Map<String, Object> map, Map<String, Object> map2) {
        super(map);
        this.localData = map2;
    }

    public String getSuffix() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("66811712", new Object[]{this}) : ValueUtil.getString(this.originData, Constants.Name.SUFFIX);
    }

    public void setSuffix(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bb8a4", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put(Constants.Name.SUFFIX, str);
    }

    public String getFileId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbadda6c", new Object[]{this}) : ValueUtil.getString(this.originData, "fileId");
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

    public long getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue() : ValueUtil.getLong(this.originData, "size");
    }

    public void setSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7687ad7a", new Object[]{this, new Long(j)});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("size", Long.valueOf(j));
    }

    public boolean isOriginal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51fbb026", new Object[]{this})).booleanValue() : ValueUtil.getInteger(this.originData, "isOriginal") == 1;
    }

    public void setOriginal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc71d2ba", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("isOriginal", Integer.valueOf(z ? 1 : 0));
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        String string = ValueUtil.getString(this.originData, "url");
        if (StringUtils.isEmpty(string) || !string.contains("&")) {
            return string;
        }
        try {
            String[] split = string.split("&");
            return split.length == 2 ? split[0] : string;
        } catch (Exception unused) {
            return string;
        }
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

    public Map<String, Object> getLocalData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("811783bb", new Object[]{this}) : this.localData;
    }

    public String getLocalThumbnailPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7d7548fd", new Object[]{this}) : ValueUtil.getString(this.localData, LOCAL_THUMBNAIL_PATH);
    }

    public void setLocalThumbnailPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95059219", new Object[]{this, str});
            return;
        }
        if (this.localData == null) {
            this.localData = new HashMap();
        }
        this.localData.put(LOCAL_THUMBNAIL_PATH, str);
    }

    public String getLocalUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d83b8fbf", new Object[]{this}) : ValueUtil.getString(this.localData, "local_url");
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
        this.localData.put("local_url", str);
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

    public List<GoodsInfo> getGoodsInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b6c3e5b2", new Object[]{this}) : getGoodsInfo(this.originData);
    }

    public boolean hasGoodsInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("475f4f35", new Object[]{this})).booleanValue() : hasGoodsInfo(this.originData);
    }
}
