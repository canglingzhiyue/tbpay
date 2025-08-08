package com.taobao.tao.log.logger;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogCategory;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLogNative;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class PageLogger extends a implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PAGE_STATUS_APPEAR = 2;
    public static final int PAGE_STATUS_DISAPPEAR = 3;
    public static final int PAGE_STATUS_ENTER = 1;
    public static final int PAGE_STATUS_LEAVE = 4;
    public static final int PAGE_TYPE_ACTIVITY = 1;
    public static final int PAGE_TYPE_FRAGMENT = 2;
    public static final int PAGE_TYPE_UNKNOWN = 0;
    private static final String TAG = "PageLog";
    @JSONField(name = "id")
    private String pageID;
    @JSONField(name = "status")
    private int pageStatus;
    @JSONField(name = "name")
    private String pageName = null;
    @JSONField(name = "type")
    private int pageType = 0;
    @JSONField(name = "url")
    private String pageUrl = null;

    static {
        kge.a(594187123);
        kge.a(1028243835);
    }

    public static PageLogger builder(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageLogger) ipChange.ipc$dispatch("9a48cfa7", new Object[]{new Integer(i), str}) : new PageLogger(i, str);
    }

    private PageLogger(int i, String str) {
        this.pageStatus = i;
        this.pageID = str;
    }

    public PageLogger setPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageLogger) ipChange.ipc$dispatch("f891345", new Object[]{this, str});
        }
        this.pageName = str;
        return this;
    }

    public PageLogger setPageID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageLogger) ipChange.ipc$dispatch("bec65a95", new Object[]{this, str});
        }
        this.pageID = str;
        return this;
    }

    public PageLogger setPageType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageLogger) ipChange.ipc$dispatch("4486b641", new Object[]{this, new Integer(i)});
        }
        this.pageType = i;
        return this;
    }

    public PageLogger setPageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageLogger) ipChange.ipc$dispatch("4c72a8a3", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            this.pageUrl = null;
        } else if (str.length() > 20480) {
            this.pageUrl = str.substring(0, 20480);
        }
        this.pageUrl = str;
        return this;
    }

    public PageLogger setData(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageLogger) ipChange.ipc$dispatch("c5c4eac0", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            if (this.data == null) {
                this.data = new HashMap();
            }
            this.data.putAll(map);
        }
        return this;
    }

    public PageLogger setData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageLogger) ipChange.ipc$dispatch("1a11880b", new Object[]{this, str, str2});
        }
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, str2);
        return this;
    }

    public PageLogger setData(Map.Entry<String, String> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageLogger) ipChange.ipc$dispatch("836f2aee", new Object[]{this, entry});
        }
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(entry.getKey(), entry.getValue());
        return this;
    }

    @Override // com.taobao.tao.log.logger.a
    public void log() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144be5cb", new Object[]{this});
        } else {
            TLogNative.writeLog(LogCategory.PageLog, LogLevel.I, TAG, "", toString());
        }
    }

    public String getPageID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84651419", new Object[]{this}) : this.pageID;
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : this.pageName;
    }

    public int getPageStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b817051", new Object[]{this})).intValue() : this.pageStatus;
    }

    public int getPageType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cd5740d9", new Object[]{this})).intValue() : this.pageType;
    }

    public String getPageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this}) : this.pageUrl;
    }
}
