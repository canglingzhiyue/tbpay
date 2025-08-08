package com.taobao.pha.core.model;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.i;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.h;
import com.taobao.pha.core.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.nfc;
import tb.ngn;

/* loaded from: classes7.dex */
public class ManifestModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    @JSONField(name = "background_color")
    public String backgroundColor;
    @JSONField(name = "cache_query_params")
    public JSONArray cacheQueryParams;
    @JSONField(name = "custom_data_source")
    public JSONArray customDataSource;
    @JSONField(name = "data_prefetch")
    public JSON dataPrefetch;
    public String document;
    @JSONField(name = "enable_poplayer")
    public boolean enablePopLayer;
    @JSONField(name = "enable_pull_refresh")
    public Boolean enablePullRefresh;
    @JSONField(name = "expires")
    public String expires;
    public JSONObject external;
    @JSONField(name = "max_age")
    public Long maxAge;
    @JSONField(name = "package_resources")
    public JSONObject packageResources;
    @JSONField(name = "name")
    public String pageName;
    @JSONField(name = "start_url")
    public String pageUrl;
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
    @JSONField(name = "resource_prefetch")
    public List<ResourcePrefetchModel> resourcePrefetch;
    public String spm;
    @JSONField(name = "title")
    public String title;
    public int version;
    @JSONField(name = "app_worker")
    public AppWorkerModel worker;
    @JSONField(name = "swiper_threshold")
    public float swiperThreshold = 1.0f;
    @JSONField(name = "enable_listen_capture")
    public boolean enableListenCapture = false;
    @JSONField(name = "enable_url_abtest")
    public boolean enableUrlABTest = false;
    @JSONField(name = "enable_expired_manifest")
    public boolean enableExpiredManifest = false;
    @JSONField(name = "enable_wv_extension")
    public boolean enableWVExtension = false;
    public ArrayList<SplashViewIconModel> icons = new ArrayList<>();
    @JSONField(name = "splash_view_timeout")
    public int splashViewTimeout = 5000;
    @JSONField(name = "splash_view_auto_close")
    public boolean splashViewClose = true;
    @JSONField(name = "splash_view_url")
    public String splashViewUrl = null;
    @JSONField(name = "splash_view_html")
    public String splashViewHtml = null;
    @JSONField(name = "tab_bar")
    public TabBarModel tabBar = new TabBarModel();
    @JSONField(name = "offline_resources")
    public ArrayList<String> offlineResources = new ArrayList<>();
    @JSONField(name = "built_in_library")
    public ArrayList<String> builtInLibrary = new ArrayList<>();
    public ArrayList<String> metas = new ArrayList<>();
    public ArrayList<String> links = new ArrayList<>();
    public ArrayList<String> scripts = new ArrayList<>();
    @JSONField(name = "pages")
    public ArrayList<PageModel> pages = new ArrayList<>();

    static {
        kge.a(-1449698083);
        kge.a(1028243835);
        TAG = ManifestModel.class.getSimpleName();
    }

    public static void setUpLayoutIndex(ManifestModel manifestModel, PageModel pageModel, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f9dd35", new Object[]{manifestModel, pageModel, uri});
        } else if (pageModel != null && manifestModel != null) {
            setUpPageProperties(manifestModel, pageModel);
            ArrayList<String> arrayList = manifestModel.offlineResources;
            if (arrayList != null) {
                pageModel.offlineResources = arrayList;
            }
            setUpHtmlTemplate(manifestModel, pageModel, uri);
            processQueryPass(pageModel, uri);
            if (pageModel.frames.size() > 0) {
                for (int i = 0; i < pageModel.frames.size(); i++) {
                    PageModel pageModel2 = pageModel.frames.get(i);
                    if (pageModel2 != null) {
                        pageModel2.pageIndex = i;
                        setUpFrameProperties(pageModel, pageModel2);
                        setUpLayoutIndex(manifestModel, pageModel2, uri);
                    }
                }
            }
            if (pageModel.getPageHeader() == null) {
                return;
            }
            setUpHtmlTemplate(manifestModel, pageModel.getPageHeader(), uri);
        }
    }

    public static void setUpHtmlTemplate(ManifestModel manifestModel, PageModel pageModel, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c3d63e", new Object[]{manifestModel, pageModel, uri});
            return;
        }
        h c = p.c();
        if (!c.f()) {
            return;
        }
        String m = c.m();
        if (StringUtils.isEmpty(m)) {
            m = "<!DOCTYPE html><html><head><meta charset=\"utf-8\" /><meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1,minimum-scale=1,user-scalable=no,viewport-fit=cover\" /><title></title></head><body><div id=\"root\"></div></body></html>";
        }
        if (!buildTemplate(manifestModel, pageModel, m)) {
            return;
        }
        reportInitTemplate(uri);
    }

    private static void setUpPageProperties(ManifestModel manifestModel, PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644a2d86", new Object[]{manifestModel, pageModel});
        } else if (manifestModel == null || pageModel == null) {
        } else {
            if (pageModel.pullRefreshColorScheme == null) {
                pageModel.pullRefreshColorScheme = manifestModel.pullRefreshColorScheme;
            }
            if (pageModel.pullRefreshBackgroundColor == null) {
                pageModel.pullRefreshBackgroundColor = manifestModel.pullRefreshBackgroundColor;
            }
            if (pageModel.enablePullRefresh == null) {
                pageModel.enablePullRefresh = manifestModel.enablePullRefresh;
            }
            if (pageModel.pullRefresh == null) {
                pageModel.pullRefresh = manifestModel.pullRefresh;
            }
            if (pageModel.requestHeaders == null) {
                pageModel.requestHeaders = manifestModel.requestHeaders;
            }
            if (pageModel.document == null) {
                pageModel.document = manifestModel.document;
            }
            if (pageModel.queryPass == null) {
                pageModel.queryPass = manifestModel.queryPass;
            }
            if (pageModel.queryPassIgnore == null) {
                pageModel.queryPassIgnore = manifestModel.queryPassIgnore;
            }
            if (pageModel.backgroundColor != null) {
                return;
            }
            pageModel.backgroundColor = manifestModel.backgroundColor;
        }
    }

    private static void setUpFrameProperties(PageModel pageModel, PageModel pageModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b3472a", new Object[]{pageModel, pageModel2});
        } else if (pageModel == null || pageModel2 == null) {
        } else {
            if (pageModel2.pullRefreshColorScheme == null) {
                pageModel2.pullRefreshColorScheme = pageModel.pullRefreshColorScheme;
            }
            if (pageModel2.pullRefreshBackgroundColor == null) {
                pageModel2.pullRefreshBackgroundColor = pageModel.pullRefreshBackgroundColor;
            }
            if (pageModel2.enablePullRefresh == null) {
                pageModel2.enablePullRefresh = pageModel.enablePullRefresh;
            }
            if (pageModel2.pullRefresh == null) {
                pageModel2.pullRefresh = pageModel.pullRefresh;
            }
            if (pageModel2.requestHeaders == null) {
                pageModel2.requestHeaders = pageModel.requestHeaders;
            }
            if (pageModel2.document == null) {
                pageModel2.document = pageModel.document;
            }
            if (pageModel2.queryPass == null) {
                pageModel2.queryPass = pageModel.queryPass;
            }
            if (pageModel2.queryPassIgnore == null) {
                pageModel2.queryPassIgnore = pageModel.queryPassIgnore;
            }
            if (pageModel2.backgroundColor == null) {
                pageModel2.backgroundColor = pageModel.backgroundColor;
            }
            if (pageModel2.getPageHeader() != null) {
                return;
            }
            TabHeaderModel pageHeader = pageModel.getPageHeader();
            pageModel2.tabHeader = pageHeader;
            pageModel2.pageHeader = pageHeader;
        }
    }

    private static void processQueryPass(PageModel pageModel, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6e1db4", new Object[]{pageModel, uri});
        } else if (uri == null || !uri.isHierarchical() || pageModel == null || pageModel.getUrl() == null) {
        } else {
            try {
                Uri a2 = ngn.a(uri, Uri.parse(pageModel.getUrl()), pageModel.queryPass, pageModel.queryPassIgnore);
                if (a2 == null) {
                    return;
                }
                pageModel.setUrl(a2.toString());
            } catch (Throwable th) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reason", (Object) ngn.a(th));
                i.a("alarm", jSONObject, PHAErrorType.TYPE_ERROR.toString(), "Process QueryPass failed");
            }
        }
    }

    private static boolean buildTemplate(ManifestModel manifestModel, PageModel pageModel, String str) {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        ArrayList<String> arrayList3;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18ca513d", new Object[]{manifestModel, pageModel, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(pageModel.html)) {
            return true;
        }
        String str3 = pageModel.document;
        if (StringUtils.isEmpty(str3) && manifestModel != null) {
            str3 = manifestModel.document;
        }
        if (!StringUtils.isEmpty(str3)) {
            pageModel.html = str3;
            return true;
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(pageModel.script)) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            String str4 = pageModel.title;
            ArrayList<String> arrayList4 = null;
            if (manifestModel != null) {
                arrayList4 = manifestModel.builtInLibrary;
                arrayList = manifestModel.scripts;
                arrayList2 = manifestModel.metas;
                arrayList3 = manifestModel.links;
                str2 = manifestModel.spm;
                if (StringUtils.isEmpty(str4)) {
                    str4 = manifestModel.title;
                }
            } else {
                arrayList = null;
                arrayList2 = null;
                arrayList3 = null;
                str2 = null;
            }
            if (!StringUtils.isEmpty(str4)) {
                str = str.replace("<title></title>", "<title>" + str4 + "</title>");
            }
            if (!StringUtils.isEmpty(str2)) {
                sb.append("<meta name=\"data-spm\" content=\"" + str2 + "\">");
            }
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<String> it = arrayList2.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                }
            }
            if (arrayList3 != null && arrayList3.size() > 0) {
                Iterator<String> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next());
                }
            }
            if (!StringUtils.isEmpty(pageModel.stylesheet)) {
                sb.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
                sb.append(pageModel.stylesheet);
                sb.append("\"/>");
            }
            String sb2 = sb.toString();
            if (!StringUtils.isEmpty(sb2)) {
                str = str.replace("</head>", sb2 + "</head>");
            }
            StringBuilder sb3 = new StringBuilder();
            if (!StringUtils.isEmpty(pageModel.spm)) {
                sb3.append(" data-spm=\"");
                sb3.append(pageModel.spm);
                sb3.append("\"");
            }
            sb3.append(">");
            if (arrayList4 != null && arrayList4.size() > 0) {
                Iterator<String> it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    sb3.append(String.format("<script src=\"%s\" crossorigin=\"anonymous\"> </script>", it3.next()));
                }
            }
            String sb4 = sb3.toString();
            if (!StringUtils.isEmpty(sb4)) {
                str = str.replace("<body>", "<body" + sb4);
            }
            StringBuilder sb5 = new StringBuilder();
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<String> it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    sb5.append(it4.next());
                }
            }
            sb5.append(String.format("<script src=\"%s\" crossorigin=\"anonymous\"> </script>", pageModel.script));
            pageModel.html = str.replace("</body>", sb5.toString() + "</body>");
            return true;
        }
    }

    private static void reportInitTemplate(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("232ff962", new Object[]{uri});
            return;
        }
        nfc s = p.b().s();
        if (s == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (uri != null) {
            jSONObject.put("url", (Object) uri.toString());
        }
        s.a(nfc.PHA_MONITOR_MODULE, nfc.PHA_MONITOR_MODULE_POINT_INIT_TEMPLATE, jSONObject);
    }
}
