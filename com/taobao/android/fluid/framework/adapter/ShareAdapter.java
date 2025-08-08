package com.taobao.android.fluid.framework.adapter;

import android.app.Activity;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.l;
import com.taobao.alimama.c;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.e;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.obz;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public class ShareAdapter implements IShareAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAME_SPACE = "tblive-video-share";
    public static final String NAV_URL = "https://market.m.taobao.com/app/tb-source-app/video-fullpage/pages/index?wh_weex=true&wx_navbar_hidden=true";
    private static final String ORANGE_GROUP = "ShortVideo";
    private static final String ORANGE_KEY_SHARE_REMOVE_EURL_ENABLED = "shareRemoveEUrlEnable";
    private static final String TAG = "ShareAdapter";

    static {
        kge.a(872067833);
        kge.a(503226896);
    }

    public static String getVideoFullpageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("40052f8d", new Object[0]) : NAV_URL;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : IShareAdapter.ADAPTER_NAME;
    }

    public static /* synthetic */ void access$000(ShareAdapter shareAdapter, FluidContext fluidContext, List list, a.c cVar, Activity activity, Map map, ShareBusinessListener shareBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534c7bb1", new Object[]{shareAdapter, fluidContext, list, cVar, activity, map, shareBusinessListener});
        } else {
            shareAdapter.doShare(fluidContext, list, cVar, activity, map, shareBusinessListener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.ut.share.business.ShareContent getShareContent(com.taobao.android.fluid.core.FluidContext r17, java.util.List<java.lang.String> r18, com.taobao.android.fluid.framework.data.datamodel.a.c r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.adapter.ShareAdapter.getShareContent(com.taobao.android.fluid.core.FluidContext, java.util.List, com.taobao.android.fluid.framework.data.datamodel.a$c, java.util.Map):com.ut.share.business.ShareContent");
    }

    private static long getMinTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aeb38804", new Object[0])).longValue() : Long.parseLong(l.a(NAME_SPACE, "shareVideoMinTime", String.valueOf(9000)));
    }

    private static long getMaxTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d7145516", new Object[0])).longValue() : Long.parseLong(l.a(NAME_SPACE, "shareVideoMaxTime", String.valueOf(180000)));
    }

    private static String getShareUrl2(FluidContext fluidContext, a.c cVar) {
        MediaContentDetailData.Config config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a3aa738", new Object[]{fluidContext, cVar});
        }
        if (cVar != null && cVar.t()) {
            MediaContentDetailData i = cVar.i();
            if (i != null && (config = i.config) != null) {
                return config.shareUrl;
            }
            return null;
        }
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        Uri.Builder buildUpon = Uri.parse(getVideoFullpageUrl()).buildUpon();
        HashMap hashMap = new HashMap();
        if (sessionParams != null) {
            hashMap.put("ab", sessionParams.p);
            hashMap.put("hideAccountInfo", sessionParams.l);
            hashMap.put("spm", sessionParams.e);
            hashMap.put("business_spm", sessionParams.f);
            hashMap.put("tppParameters", sessionParams.r);
            hashMap.put("type", sessionParams.b);
            hashMap.put("source", sessionParams.c);
            hashMap.put(com.taobao.android.fluid.framework.data.remote.a.KEY_DETAIL_PARAMETERS, handleDetailParameters(sessionParams.i));
            hashMap.put("bizParameters", sessionParams.j);
            hashMap.put("extParams", sessionParams.v);
        }
        if (cVar != null) {
            hashMap.put("id", cVar.g());
            hashMap.put("coverImage", cVar.h());
            hashMap.put("videoUrl", cVar.J());
            hashMap.put("contentId", cVar.g());
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("contentId", cVar.g());
            hashMap.put("origin", "VideoInteract|a310p.13800399.0.0|" + obz.a(hashMap2));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!StringUtils.isEmpty((CharSequence) entry.getValue())) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return buildUpon.build().toString();
    }

    private static String handleDetailParameters(String str) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e89ad6c", new Object[]{str});
        }
        if (!enableShareRemoveEUrl()) {
            return str;
        }
        if (str == null) {
            return null;
        }
        try {
            if (str.length() >= 1500 && (a2 = obz.a(str)) != null && a2.containsKey(c.E_URL)) {
                a2.remove(c.E_URL);
                return obz.a(a2);
            }
        } catch (Exception e) {
            spz.a("handleDetailParameters", "", e);
        }
        return str;
    }

    private static boolean enableShareRemoveEUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79917e35", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", ORANGE_KEY_SHARE_REMOVE_EURL_ENABLED, "true"));
        } catch (Throwable th) {
            TLog.loge(TAG, "enableShareRemoveEUrl error", th);
            return false;
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IShareAdapter
    public boolean isShareContentContainerShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bf57ca93", new Object[]{this})).booleanValue() : e.b().d();
    }

    @Override // com.taobao.android.fluid.framework.adapter.IShareAdapter
    public void share(final FluidContext fluidContext, final Activity activity, String str, final Map map, final ShareBusinessListener shareBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5139705a", new Object[]{this, fluidContext, activity, str, map, shareBusinessListener});
            return;
        }
        final a.c a2 = ((ICardService) fluidContext.getService(ICardService.class)).getSessionIdRecorder().a(str);
        if (a2 == null) {
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.mediaplatform.component.listItemInfo");
        mtopRequest.setVersion("2.0");
        JSONObject parseObject = JSONObject.parseObject(mtopRequest.getData());
        MediaContentDetailData i = a2.i();
        if (i != null && i.content != null) {
            parseObject.put("itemIds", (Object) JSON.toJSONString(i.content.itemIds));
        }
        mtopRequest.setData(parseObject.toString());
        RemoteBusiness.build(mtopRequest).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.fluid.framework.adapter.ShareAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                    return;
                }
                ArrayList arrayList = new ArrayList();
                org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                if (dataJsonObject != null) {
                    Iterator<String> keys = mtopResponse.getDataJsonObject().keys();
                    while (keys.hasNext() && arrayList.size() < 4) {
                        arrayList.add(dataJsonObject.optJSONObject(keys.next()).optString("itemPic"));
                    }
                }
                ShareAdapter.access$000(ShareAdapter.this, fluidContext, arrayList, a2, activity, map, shareBusinessListener);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                } else {
                    ShareAdapter.access$000(ShareAdapter.this, fluidContext, null, a2, activity, map, shareBusinessListener);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                } else {
                    ShareAdapter.access$000(ShareAdapter.this, fluidContext, null, a2, activity, map, shareBusinessListener);
                }
            }
        }).startRequest();
    }

    private void doShare(FluidContext fluidContext, List<String> list, a.c cVar, Activity activity, Map map, ShareBusinessListener shareBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2745a8e7", new Object[]{this, fluidContext, list, cVar, activity, map, shareBusinessListener});
        } else {
            ShareBusiness.share(activity, getShareContent(fluidContext, list, cVar, map), shareBusinessListener);
        }
    }
}
