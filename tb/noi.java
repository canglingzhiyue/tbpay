package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.f;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class noi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_videointeract";

    static {
        kge.a(141152594);
    }

    public static void a(FluidContext fluidContext, Map<String, String> map, a.c cVar, int i) {
        MediaContentDetailData i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ad3ca1", new Object[]{fluidContext, map, cVar, new Integer(i)});
            return;
        }
        map.clear();
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        map.put("spm", obw.f31903a);
        map.put("spm-url", sessionParams.e);
        map.put("scm", sessionParams.D);
        if (cVar != null && (i2 = cVar.i()) != null) {
            map.put("content_type", cVar.H());
            if (i2.content != null && i2.content.itemIds != null && i2.content.itemIds.size() > 0) {
                String str = i2.content.itemIds.get(0);
                if (!TextUtils.isEmpty(str)) {
                    map.put("item_id", str);
                }
            }
        }
        HashMap hashMap = new HashMap();
        a(fluidContext, hashMap, cVar);
        a(hashMap, i);
        a(map, hashMap);
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (j != null && j.d != null) {
            map.put(IStorage.TYPE_DSL, j.d.replace("/", "@"));
        }
        ab sharedTNodeEngine = ((IHostTNodeService) fluidContext.getService(IHostTNodeService.class)).getSharedTNodeEngine();
        if (sharedTNodeEngine != null) {
            map.put("tnode_dsl_md5", sharedTNodeEngine.F());
        }
        map.put("dsl_is_orange", "" + oeb.bb());
        map.put("is_underage_mode", String.valueOf(com.taobao.android.fluid.business.undermode.helper.a.INSTANCE.a()));
        ITrackService iTrackService = (ITrackService) fluidContext.getService(ITrackService.class);
        map.put("entryUtparam", iTrackService.getUtparamUrl());
        map.put("entryUtparamPre", iTrackService.getUtparamPre());
        String tab3CardType = fluidContext.getInstanceConfig().getTab3CardType();
        map.put("tnode_tab_id", String.valueOf(tab3CardType));
        spz.c("TrackUtils", "initdpvCommonTrack tnodeTabId=" + tab3CardType);
        map.put(FluidSDK.FLUID_SDK_FLAG, "1");
        map.put(f.FLUID_SDK_REMOTE_VERSION, f.FLUID_SDK_REMOTE_VERSION_VALUE);
    }

    public static void a(Map<String, String> map, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e8876", new Object[]{map, hashMap});
        } else {
            map.put("utLogMap", obz.a(hashMap));
        }
    }

    public static void a(FluidContext fluidContext, HashMap<String, String> hashMap, a.c cVar) {
        MediaContentDetailData i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebc5bb4", new Object[]{fluidContext, hashMap, cVar});
            return;
        }
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        hashMap.put("x_object_type", "common_video_page");
        hashMap.put("common_video_page", sessionParams.c);
        hashMap.put("version", AfcCustomSdk.SDK_VERSION);
        if (cVar != null && (i = cVar.i()) != null) {
            hashMap.put(kox.X_OBJECT_ID, i.id);
            if (cVar.z()) {
                hashMap.put("videoid", cVar.I());
            }
            MediaContentDetailData.Interaction r = cVar.r();
            if (r != null && r.follow != null) {
                hashMap.put(ag.KEY_IS_FANS, "true".equals(r.follow.link) ? "1" : "0");
            }
            if (slm.a(i.trackInfo)) {
                hashMap.put("trackInfo", i.trackInfo);
            } else if (!TextUtils.isEmpty(sessionParams.A)) {
                hashMap.put("trackInfo", sessionParams.A);
            }
            if (TextUtils.isEmpty(cVar.e())) {
                hashMap.put("content_account_id", cVar.c());
            } else {
                hashMap.put("content_account_id", cVar.d());
                hashMap.put("keyname", cVar.e());
            }
            if (i.utPairs != null && !i.utPairs.isEmpty()) {
                hashMap.putAll(i.utPairs);
            }
            if (!juo.c()) {
                hashMap.remove(aw.PARAM_UT_PARAMS);
            }
        }
        if (j.K) {
            hashMap.put("is_tab", "1");
        } else {
            hashMap.put("is_tab", "0");
        }
        if (((IHostAppService) fluidContext.getService(IHostAppService.class)).getCurrentTabIndex() == 1) {
            hashMap.put("tab_name", "follow");
        } else {
            hashMap.put("tab_name", "recommend");
        }
    }

    public static void a(Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00a486", new Object[]{map, new Integer(i)});
        } else {
            map.put("index", String.valueOf(i));
        }
    }
}
