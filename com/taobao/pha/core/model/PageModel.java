package com.taobao.pha.core.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.utils.b;
import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes7.dex */
public class PageModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String _type;
    @JSONField(name = "background_color")
    public String backgroundColor;
    @JSONField(name = "data_prefetch")
    public JSON dataPrefetch;
    @JSONField(name = "default_frame_index")
    public Integer defaultFrameIndex;
    public String document;
    @JSONField(name = b.DOWN_GRADE)
    public String downgradeUrl;
    @JSONField(name = "enable_pull_refresh")
    public Boolean enablePullRefresh;
    @JSONField(name = "encode_headers")
    public boolean encodeHeaders;
    public JSONObject external;
    @JSONField(name = "header_position")
    public String headerPosition;
    public String html;
    public String key;
    @JSONField(name = "page_header")
    public TabHeaderModel pageHeader;
    public int pageIndex;
    @JSONField(name = "path")
    public String path;
    @JSONField(name = "pull_refresh")
    public Boolean pullRefresh;
    @JSONField(name = "pull_refresh_background_color")
    public String pullRefreshBackgroundColor;
    @JSONField(name = "pull_refresh_color_scheme")
    public String pullRefreshColorScheme;
    @JSONField(name = "query_params_pass_keys")
    public ArrayList<String> queryPass;
    @JSONField(name = "query_params_pass_ignore_keys")
    public ArrayList<String> queryPassIgnore;
    @JSONField(name = "request_headers")
    public JSONObject requestHeaders;
    public String script;
    public String spm;
    public String stylesheet;
    @JSONField(name = "tab_header")
    public TabHeaderModel tabHeader;
    public String title;
    @JSONField(name = "url")
    public String url;
    @JSONField(name = "url_query_params")
    public JSONObject urlQueryParams;
    public ArrayList<String> offlineResources = new ArrayList<>();
    @JSONField(name = "manifest_preset")
    public boolean manifestPreset = false;
    public String priority = "high";
    public ArrayList<PageModel> frames = new ArrayList<>();
    @JSONField(deserialize = false, serialize = false)
    private int activeIndex = -1;
    @JSONField(deserialize = false, serialize = false)
    private boolean subPage = false;
    @JSONField(deserialize = false, serialize = false)
    private boolean dataPrefetched = false;

    static {
        kge.a(1769123325);
        kge.a(1028243835);
    }

    public int getDefaultFrameIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76eca44a", new Object[]{this})).intValue();
        }
        TabHeaderModel pageHeader = getPageHeader();
        if (pageHeader != null && pageHeader.selectedIndex >= 0) {
            return pageHeader.selectedIndex;
        }
        Integer num = this.defaultFrameIndex;
        if (num != null && num.intValue() >= 0) {
            return this.defaultFrameIndex.intValue();
        }
        return 0;
    }

    @JSONField(deserialize = false, serialize = false)
    public int getActiveIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce27edb0", new Object[]{this})).intValue();
        }
        int i = this.activeIndex;
        if (i >= 0 && i < this.frames.size()) {
            return this.activeIndex;
        }
        return getDefaultFrameIndex();
    }

    @JSONField(deserialize = false, serialize = false)
    public void setActiveIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad2d1f2", new Object[]{this, new Integer(i)});
        } else {
            this.activeIndex = i;
        }
    }

    public TabHeaderModel getPageHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabHeaderModel) ipChange.ipc$dispatch("ca2980a8", new Object[]{this});
        }
        TabHeaderModel tabHeaderModel = this.pageHeader;
        return tabHeaderModel == null ? this.tabHeader : tabHeaderModel;
    }

    public void setPageHeader(TabHeaderModel tabHeaderModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ddbcb30", new Object[]{this, tabHeaderModel});
        } else {
            this.pageHeader = tabHeaderModel;
        }
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        String str = this.url;
        return str != null ? str : this.path;
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isEnableHardPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("298d6d69", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.pullRefresh;
        return bool != null && bool.booleanValue();
    }

    @JSONField(deserialize = false, serialize = false)
    public void setEnableHardPullRefresh(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e349100", new Object[]{this, bool});
        } else {
            this.pullRefresh = bool;
        }
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isEnableSoftPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1101744a", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.enablePullRefresh;
        return bool != null && bool.booleanValue();
    }

    @JSONField(deserialize = false, serialize = false)
    public void setEnableSoftPullRefresh(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a84347f", new Object[]{this, bool});
        } else {
            this.enablePullRefresh = bool;
        }
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isSubPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d768670", new Object[]{this})).booleanValue() : this.subPage;
    }

    @JSONField(deserialize = false, serialize = false)
    public void setSubPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f79520", new Object[]{this, new Boolean(z)});
            return;
        }
        this.subPage = z;
        for (int i = 0; i < this.frames.size(); i++) {
            PageModel pageModel = this.frames.get(i);
            if (pageModel != null) {
                pageModel.setSubPage(z);
            }
        }
    }

    @JSONField(deserialize = false, serialize = false)
    public JSONArray getRealDataPrefetches() {
        PageModel pageModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("4e3b2a94", new Object[]{this});
        }
        int activeIndex = getActiveIndex();
        if (activeIndex >= 0 && activeIndex < this.frames.size() && (pageModel = this.frames.get(activeIndex)) != null && !pageModel.dataPrefetched) {
            JSON json = pageModel.dataPrefetch;
            if (json instanceof JSONArray) {
                pageModel.dataPrefetched = true;
                return (JSONArray) json;
            }
        }
        if (this.dataPrefetched) {
            return null;
        }
        JSON json2 = this.dataPrefetch;
        if (!(json2 instanceof JSONArray)) {
            return null;
        }
        this.dataPrefetched = true;
        return (JSONArray) json2;
    }
}
