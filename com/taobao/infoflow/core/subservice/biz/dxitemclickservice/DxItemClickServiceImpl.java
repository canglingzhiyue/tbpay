package com.taobao.infoflow.core.subservice.biz.dxitemclickservice;

import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.ldf;
import tb.ljs;

/* loaded from: classes.dex */
public class DxItemClickServiceImpl implements IDxItemClickService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DxItemClickServiceImpl";
    private static final int TARGET_URL_LENGTH_THRESHOLD = 2048;
    private List<IDxItemClickService.a> mDxItemClickListenerList;
    private List<IDxItemClickService.OnDxClickNavListener> mOnDxClickNavListenerList;
    private List<IDxItemClickService.c> mTargetUrlParamsCreatorList;

    static {
        kge.a(-1322193079);
        kge.a(1628948446);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void onNav(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc943dd5", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
            return;
        }
        List<IDxItemClickService.OnDxClickNavListener> list = this.mOnDxClickNavListenerList;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (IDxItemClickService.OnDxClickNavListener onDxClickNavListener : this.mOnDxClickNavListenerList) {
            onDxClickNavListener.a(baseSectionModel, baseSubItemModel, bundle, str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void onNavFinished(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad70e197", new Object[]{this, new Boolean(z)});
            return;
        }
        List<IDxItemClickService.OnDxClickNavListener> list = this.mOnDxClickNavListenerList;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (IDxItemClickService.OnDxClickNavListener onDxClickNavListener : this.mOnDxClickNavListenerList) {
            onDxClickNavListener.onNavFinished(z);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public String assembleBizParamsToTargetUrl(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c711d35", new Object[]{this, baseSectionModel, baseSubItemModel, str});
        }
        List<IDxItemClickService.c> list = this.mTargetUrlParamsCreatorList;
        if (list == null || list.isEmpty()) {
            ldf.d(TAG, "mTargetUrlParamsCreatorList is empty");
            return str;
        }
        try {
            Map<String, String> createAssembleParams = createAssembleParams(baseSectionModel, baseSubItemModel, this.mTargetUrlParamsCreatorList);
            if (createAssembleParams.isEmpty()) {
                ldf.d(TAG, "没有需要拼接的参数");
                return str;
            }
            return appendParamsToUrl(createAssembleParams, str);
        } catch (Exception e) {
            ldf.d(TAG, "assembleBizParamsToTargetUrl except: " + e);
            return str;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void click(BaseSectionModel baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1596985", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        List<IDxItemClickService.a> list = this.mDxItemClickListenerList;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (IDxItemClickService.a aVar : this.mDxItemClickListenerList) {
            aVar.a(baseSectionModel, baseSubItemModel, view);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void addDxItemClickListener(IDxItemClickService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732578ab", new Object[]{this, aVar});
            return;
        }
        if (this.mDxItemClickListenerList == null) {
            this.mDxItemClickListenerList = new CopyOnWriteArrayList();
        }
        this.mDxItemClickListenerList.add(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void removeDxItemClickListener(IDxItemClickService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd7ace", new Object[]{this, aVar});
            return;
        }
        List<IDxItemClickService.a> list = this.mDxItemClickListenerList;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void addDxClickNavListener(IDxItemClickService.OnDxClickNavListener onDxClickNavListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba97f3d2", new Object[]{this, onDxClickNavListener});
            return;
        }
        if (this.mOnDxClickNavListenerList == null) {
            this.mOnDxClickNavListenerList = new CopyOnWriteArrayList();
        }
        this.mOnDxClickNavListenerList.add(onDxClickNavListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void removeDxClickNavListener(IDxItemClickService.OnDxClickNavListener onDxClickNavListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03ed335", new Object[]{this, onDxClickNavListener});
            return;
        }
        List<IDxItemClickService.OnDxClickNavListener> list = this.mOnDxClickNavListenerList;
        if (list == null) {
            return;
        }
        list.remove(onDxClickNavListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void addTargetUrlParamsCreator(IDxItemClickService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ad34f4", new Object[]{this, cVar});
            return;
        }
        if (this.mTargetUrlParamsCreatorList == null) {
            this.mTargetUrlParamsCreatorList = new CopyOnWriteArrayList();
        }
        this.mTargetUrlParamsCreatorList.add(cVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService
    public void removeTargetUrlParamsCreator(IDxItemClickService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920ddbf1", new Object[]{this, cVar});
            return;
        }
        List<IDxItemClickService.c> list = this.mTargetUrlParamsCreatorList;
        if (list == null) {
            return;
        }
        list.remove(cVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        List<IDxItemClickService.a> list = this.mDxItemClickListenerList;
        if (list != null) {
            list.clear();
            this.mDxItemClickListenerList = null;
        }
        List<IDxItemClickService.OnDxClickNavListener> list2 = this.mOnDxClickNavListenerList;
        if (list2 != null) {
            list2.clear();
            this.mOnDxClickNavListenerList = null;
        }
        List<IDxItemClickService.c> list3 = this.mTargetUrlParamsCreatorList;
        if (list3 == null) {
            return;
        }
        list3.clear();
        this.mTargetUrlParamsCreatorList = null;
    }

    private Map<String, String> createAssembleParams(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, List<IDxItemClickService.c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ee25a45f", new Object[]{this, baseSectionModel, baseSubItemModel, list});
        }
        HashMap hashMap = new HashMap(2);
        for (IDxItemClickService.c cVar : list) {
            Map<String, String> a2 = cVar.a(baseSectionModel, baseSubItemModel);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
        }
        return hashMap;
    }

    private String appendParamsToUrl(Map<String, String> map, String str) throws URISyntaxException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ee5ebcc", new Object[]{this, map, str});
        }
        URI uri = new URI(str);
        Map<String, String> parseExistingParams = parseExistingParams(uri.getQuery());
        parseExistingParams.putAll(map);
        String mapToQueryString = mapToQueryString(parseExistingParams);
        if (StringUtils.isEmpty(mapToQueryString)) {
            ldf.d(TAG, "assembleParams == null");
            return str;
        }
        String uri2 = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), mapToQueryString, uri.getFragment()).toString();
        if (!isURLLengthOverThreshold(uri2)) {
            return uri2;
        }
        ldf.d(TAG, "url字符超长了，使用原始链接");
        return str;
    }

    private Map<String, String> parseExistingParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1419418a", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            return hashMap;
        }
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=", 2);
            if (split.length == 2) {
                hashMap.put(split[0], split[1]);
            }
        }
        return hashMap;
    }

    private boolean isURLLengthOverThreshold(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bbcd221", new Object[]{this, str})).booleanValue();
        }
        try {
            return str.getBytes("utf-8").length > 2048;
        } catch (Exception unused) {
            ldf.d(TAG, "无效的URL: " + str);
            return false;
        }
    }

    private String mapToQueryString(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d47a0c4", new Object[]{this, map});
        }
        if (map.isEmpty()) {
            ldf.d(TAG, "需要拼接的参数为空");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            try {
                sb.append(URLEncoder.encode(entry.getKey(), "utf-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(String.valueOf(entry.getValue()), "utf-8"));
            } catch (Exception e) {
                ldf.d(TAG, "链接转换出现异常，e:" + e);
            }
        }
        return sb.toString();
    }
}
