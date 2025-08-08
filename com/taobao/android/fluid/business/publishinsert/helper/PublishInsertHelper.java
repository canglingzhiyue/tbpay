package com.taobao.android.fluid.business.publishinsert.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Vibrator;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.publishinsert.IPublishInsertService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.adapter.mtop.d;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.remote.TaskList;
import com.taobao.android.fluid.framework.data.remote.a;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.layoutmanager.module.WindvaneModule;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.NotifyModule;
import com.taobao.taobao.scancode.gateway.util.i;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.hdx;
import tb.kge;
import tb.oeb;
import tb.ogv;
import tb.skv;
import tb.slk;
import tb.slq;
import tb.snd;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public class PublishInsertHelper implements snd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int NORMAL_PUBLISH = 0;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, Integer> f12405a;
    private final Context b;
    private final FluidContext c;
    private PublishInsertBroadcastReceiver d;

    static {
        kge.a(280965267);
        kge.a(1755210026);
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ FluidContext a(PublishInsertHelper publishInsertHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("571de8a4", new Object[]{publishInsertHelper}) : publishInsertHelper.c;
    }

    public static /* synthetic */ boolean a(PublishInsertHelper publishInsertHelper, TaskList taskList) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("155351", new Object[]{publishInsertHelper, taskList})).booleanValue() : publishInsertHelper.a(taskList);
    }

    public static /* synthetic */ void b(PublishInsertHelper publishInsertHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33ed5525", new Object[]{publishInsertHelper});
        } else {
            publishInsertHelper.h();
        }
    }

    public static /* synthetic */ void b(PublishInsertHelper publishInsertHelper, TaskList taskList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406dd46c", new Object[]{publishInsertHelper, taskList});
        } else {
            publishInsertHelper.c(taskList);
        }
    }

    public static /* synthetic */ void c(PublishInsertHelper publishInsertHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1466ab26", new Object[]{publishInsertHelper});
        } else {
            publishInsertHelper.i();
        }
    }

    public static /* synthetic */ void c(PublishInsertHelper publishInsertHelper, TaskList taskList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c6558b", new Object[]{publishInsertHelper, taskList});
        } else {
            publishInsertHelper.d(taskList);
        }
    }

    public static /* synthetic */ HashMap d(PublishInsertHelper publishInsertHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("c9d1daca", new Object[]{publishInsertHelper}) : publishInsertHelper.f12405a;
    }

    public PublishInsertHelper(FluidContext fluidContext) {
        this.c = fluidContext;
        ((ILifecycleService) this.c.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        this.f12405a = new HashMap<>();
        this.b = fluidContext.getContext();
    }

    private static boolean a(String str, TaskList.ExtraParams extraParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e8ffb51", new Object[]{str, extraParams})).booleanValue();
        }
        if (!StringUtils.equals("video", str)) {
            return false;
        }
        return extraParams.videoWidth == null || extraParams.videoHeight == null;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1367741217) {
            if (hashCode != 3357525) {
                if (hashCode == 112202875 && str.equals("video")) {
                    c = 2;
                }
            } else if (str.equals("more")) {
                c = 1;
            }
        } else if (str.equals("campus")) {
            c = 0;
        }
        if (c == 0 || c == 1) {
            return "campus";
        }
        if (c == 2) {
            return "video";
        }
        return null;
    }

    private static slk.a a(FluidContext fluidContext, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (slk.a) ipChange.ipc$dispatch("35c9a2ab", new Object[]{fluidContext, str, str2, str3, str4, str5});
        }
        if (((IDataService) fluidContext.getService(IDataService.class)).getUnmodifiableMediaSetList().size() == 0) {
            spz.c("PublishInsertHelper", "MediasetList为空");
            return null;
        }
        return a.a(str, str2, str3, str4, str5);
    }

    private static slk.a a(FluidContext fluidContext, List<JSONObject> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (slk.a) ipChange.ipc$dispatch("64b66f8", new Object[]{fluidContext, list, str, str2});
        }
        if (((IDataService) fluidContext.getService(IDataService.class)).getUnmodifiableMediaSetList().size() == 0) {
            spz.c("PublishInsertHelper", "MediasetList为空");
            return null;
        }
        return a.a(list, str, str2);
    }

    public static Map a(FluidContext fluidContext, a aVar, Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("61c5ad52", new Object[]{fluidContext, aVar, map, str});
        }
        if (aVar != null && aVar.a() != null && aVar.b() != null) {
            if (StringUtils.equals(aVar.b(), hdx.PAGE_PUBLISH)) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                aVar.a().c = str;
                if (aVar.b(0) == 3) {
                    hashMap2.put("publishPic", a(aVar));
                }
                hashMap2.put("status", hdx.PAGE_PUBLISH);
                hashMap.put("extraMap", hashMap2);
                spz.c("PublishInsertHelper", "发送了publish消息");
                return hashMap;
            } else if (StringUtils.equals(aVar.b(), "publishSuccess")) {
                a.c a2 = aVar.a();
                a2.c = str;
                Map hashMap3 = a2.o() == null ? new HashMap() : a2.o();
                if (hashMap3.get("status") != null && (StringUtils.equals("publishSuccess", hashMap3.get("status").toString()) || StringUtils.equals("finish", hashMap3.get("status").toString()))) {
                    hashMap3.put("status", "finish");
                    ((IPublishInsertService) fluidContext.getService(IPublishInsertService.class)).setPublishIInsertEnable(false);
                } else {
                    hashMap3.put("status", "publishSuccess");
                }
                if (aVar.b(0) == 3) {
                    hashMap3.put("publishPic", a(aVar));
                }
                spz.c("PublishInsertHelper", "发送了publishSuccess消息:" + hashMap3.get("status"));
                return a2.a(fluidContext);
            }
        }
        return map;
    }

    private static List<Map> a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("62bc3b63", new Object[]{aVar});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<JSONObject> it = aVar.a().i().content.elements.iterator();
        while (it.hasNext()) {
            JSONObject next = it.next();
            Object obj = next == null ? null : next.get("url");
            if (obj != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("url", (String) obj);
                hashMap.put("width", (String) next.get("width"));
                hashMap.put("height", (String) next.get("height"));
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    public static void a(FluidContext fluidContext, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb920272", new Object[]{fluidContext, aVar});
        } else if (!((IPublishInsertService) fluidContext.getService(IPublishInsertService.class)).isPublishIInsertEnable() || aVar.b() == null || StringUtils.equals("finish", aVar.b()) || StringUtils.equals("publishSuccess", aVar.b())) {
        } else {
            ab sharedTNodeEngine = ((IHostTNodeService) fluidContext.getService(IHostTNodeService.class)).getSharedTNodeEngine();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pluginName", (Object) UmiWvPlugin.PLUGIN_NAME);
            jSONObject.put(FluidException.METHOD_NAME, (Object) UmiWvPlugin.ASYNC_PUBLISH_FIRE_NOTIFICATION);
            jSONObject.put("params", (Object) new JSONObject());
            WindvaneModule.call(new g.c(sharedTNodeEngine, jSONObject, new g.d() { // from class: com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.ac.g.d
                public void a(g.c cVar, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb15ed33", new Object[]{this, cVar, obj});
                    } else {
                        spz.c("PublishInsertHelper", "--Windvane调用成功");
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.ac.g.d
                public void a(g.c cVar, g.a aVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fed2540a", new Object[]{this, cVar, aVar2});
                    } else {
                        spz.c("PublishInsertHelper", "--Windvane调用失败");
                    }
                }
            }));
        }
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (!f() || g()) {
        } else {
            ca_();
        }
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        } else {
            a(this.b);
        }
    }

    public void ca_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdf3bc8", new Object[]{this});
        } else if (this.d != null) {
        } else {
            this.d = new PublishInsertBroadcastReceiver();
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.d, new IntentFilter("UmiAsyncPublishNotification"));
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.d == null) {
        } else {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.d);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            ((IFeedsListService) this.c.getService(IFeedsListService.class)).publicNextVideo();
        }
    }

    private boolean a(TaskList taskList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36efaa8d", new Object[]{this, taskList})).booleanValue();
        }
        if (taskList != null && !ogv.a(taskList.tasks) && taskList.tasks.get(0).backParams != null) {
            TaskList.Task task = taskList.tasks.get(0);
            String str = StringUtils.isEmpty(task.backParams.subId) ? task.backParams.tabId : task.backParams.subId;
            if (c() && task.type != 0) {
                spz.c("PublishInsertHelper", "异步发布内容不上墙:" + str);
                return false;
            }
            String a2 = a(str);
            String tab3CardType = this.c.getInstanceConfig().getTab3CardType();
            if (!StringUtils.equals(a2, tab3CardType)) {
                spz.c("PublishInsertHelper", "发布跳转到的tab:" + str + "当前的tab" + tab3CardType);
                return false;
            } else if (!d() && StringUtils.equals(a2, "campus")) {
                spz.c("PublishInsertHelper", "校园tab上墙关闭:" + a2);
                return false;
            } else if (task.data == null || task.data.publishInfo == null || task.data.publishInfo.inputInfo == null || task.progress == null) {
                spz.c("PublishInsertHelper", "发布task为空:" + task);
            } else {
                List<TaskList.Media> list = task.data.publishInfo.inputInfo.media;
                if (ogv.a(list)) {
                    spz.c("PublishInsertHelper", "发布的media内容为空");
                    return false;
                }
                String str2 = list.get(0).mediaType;
                if (!StringUtils.equals("video", str2) && !StringUtils.equals(i.SOURCE_TYPE_PHOTO, str2)) {
                    spz.c("PublishInsertHelper", " 发布的内容不是视频和图片：" + str2);
                    return false;
                } else if (!e() && StringUtils.equals(i.SOURCE_TYPE_PHOTO, str2)) {
                    spz.c("PublishInsertHelper", "图片发布上墙关闭");
                    return false;
                } else {
                    TaskList.ExtraParams extraParams = taskList.tasks.get(0).data.publishInfo.extraParams;
                    if (extraParams == null) {
                        spz.c("PublishInsertHelper", " extraParams为空：");
                        return false;
                    }
                    String str3 = extraParams.online_time;
                    if (str3 != null && str3.length() > 0) {
                        spz.c("PublishInsertHelper", str3 + "--isTimingPublish 定时发布");
                        return false;
                    } else if (a(str2, extraParams)) {
                        spz.c("PublishInsertHelper", "视频宽高为空");
                        return false;
                    } else if (!StringUtils.isEmpty(list.get(0).path)) {
                        return true;
                    } else {
                        spz.c("PublishInsertHelper", "媒体的url 为空");
                        return false;
                    }
                }
            }
        }
        return false;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.disableAsyncPublishInsert", false);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableCampusPublish", true);
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enablePublishImage", true);
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enablePublishInsert", true);
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enablePublishInsertV2", false);
    }

    private void a(TaskList taskList, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10ca413", new Object[]{this, taskList, str});
        } else {
            ((IDataService) this.c.getService(IDataService.class)).fetchContentDetail(b(taskList), new skv.a() { // from class: com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.skv.a
                public void onStartRequest() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("adbafdd3", new Object[]{this});
                    }
                }

                @Override // tb.skv.a
                public void onResult(d<Pair<a, MediaMixContentDetail>> dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1227a278", new Object[]{this, dVar});
                    } else if (dVar == null || dVar.e == null || dVar.e.first == null || ogv.a(((a) dVar.e.first).f12529a)) {
                    } else {
                        spz.c("PublishInsertHelper", "根据contentId请求Detail接口成功");
                        a.c cVar = ((a) dVar.e.first).f12529a.get(0);
                        IFeedsListService iFeedsListService = (IFeedsListService) PublishInsertHelper.a(PublishInsertHelper.this).getService(IFeedsListService.class);
                        List<a> unmodifiableMediaSetList = ((IDataService) PublishInsertHelper.a(PublishInsertHelper.this).getService(IDataService.class)).getUnmodifiableMediaSetList();
                        int a2 = a(unmodifiableMediaSetList);
                        if (a2 >= 0) {
                            JSONObject jSONObject = cVar.d;
                            MediaContentDetailData i = cVar.i();
                            a.c a3 = unmodifiableMediaSetList.get(a2).a();
                            i.publishStatus = "publishSuccess";
                            i.content.elements = a3.i().content.elements;
                            a3.a(i);
                            a3.d = jSONObject;
                            iFeedsListService.notifyItemChanged(a2);
                            PublishInsertHelper.b(PublishInsertHelper.this);
                            PublishInsertHelper.c(PublishInsertHelper.this);
                            return;
                        }
                        spz.c("PublishInsertHelper", "上墙内容不存在" + a2);
                    }
                }

                private int a(List<a> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("c705294c", new Object[]{this, list})).intValue();
                    }
                    Integer num = (Integer) PublishInsertHelper.d(PublishInsertHelper.this).get(str);
                    if (list.size() > num.intValue() && StringUtils.equals(hdx.PAGE_PUBLISH, list.get(num.intValue()).b())) {
                        return num.intValue();
                    }
                    for (int i = 0; i < list.size(); i++) {
                        if (StringUtils.equals(hdx.PAGE_PUBLISH, list.get(i).b())) {
                            return i;
                        }
                    }
                    return -1;
                }
            });
        }
    }

    private a.C0494a b(TaskList taskList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.C0494a) ipChange.ipc$dispatch("dcbbebac", new Object[]{this, taskList});
        }
        String str = taskList.tasks.get(0).data.contentId;
        String tab3ComponentSource = this.c.getInstanceConfig().getTab3ComponentSource();
        String detailRequestRefreshType = ((IDataService) this.c.getService(IDataService.class)).getDetailRequestRefreshType();
        sps sessionParams = ((ISceneConfigService) this.c.getService(ISceneConfigService.class)).getSessionParams();
        a.C0494a a2 = slq.a(sessionParams, str, null);
        String a3 = slq.a(sessionParams, (Map) null);
        c.a a4 = slq.a(sessionParams, tab3ComponentSource, false, false, detailRequestRefreshType);
        a4.a(true).d(false);
        a2.c(JSON.toJSONString(a4.a())).b(a3);
        return a2;
    }

    private void a(FluidContext fluidContext, String str, slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9792a85", new Object[]{this, fluidContext, str, aVar});
        } else if (aVar == null) {
        } else {
            ((IDataService) fluidContext.getService(IDataService.class)).insertDetailListAtCurrent(aVar);
            Integer valueOf = Integer.valueOf(((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaPosition());
            spz.c("PublishInsertHelper", (valueOf.intValue() + 1) + "--curPosition 插入的位置为");
            this.f12405a.put(str, Integer.valueOf(valueOf.intValue() + 1));
        }
    }

    private void c(TaskList taskList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6c89c7", new Object[]{this, taskList});
            return;
        }
        TaskList.Task task = taskList.tasks.get(0);
        List<TaskList.Media> list = task.data.publishInfo.inputInfo.media;
        ArrayList arrayList = new ArrayList();
        for (TaskList.Media media : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", (Object) media.path);
            jSONObject.put("url", (Object) media.path);
            jSONObject.put("type", (Object) "PICTURE_ALBUM");
            jSONObject.put("height", (Object) media.height);
            jSONObject.put("width", (Object) media.width);
            arrayList.add(jSONObject);
        }
        String str = task.progress;
        String str2 = task.taskId;
        String str3 = task.status;
        String str4 = null;
        if (task.data.publishInfo.inputInfo.music != null) {
            str4 = task.data.publishInfo.inputInfo.music.url;
        }
        spz.c("PublishInsertHelper", str + "--progress" + str3 + "--status" + str4 + "--musicUrl");
        ((IPublishInsertService) this.c.getService(IPublishInsertService.class)).setPublishIInsertEnable(true);
        if (!this.f12405a.containsKey(str2)) {
            this.c.getService(IFeedsListService.class);
            a(this.c, str2, a(this.c, arrayList, str2, str4));
            b();
        }
        if (StringUtils.equals("success", str3)) {
            a(taskList, str2);
        } else if (StringUtils.equals("fail", str3)) {
            spz.c("PublishInsertHelper", "发布失败:" + task.data.failedCode);
        }
    }

    private void d(TaskList taskList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3aaf966", new Object[]{this, taskList});
            return;
        }
        TaskList.Task task = taskList.tasks.get(0);
        List<TaskList.Media> list = task.data.publishInfo.inputInfo.media;
        String str = task.data.publishInfo.extraParams.videoHeight;
        String str2 = task.data.publishInfo.extraParams.videoWidth;
        String str3 = list.get(0).path;
        String str4 = list.size() > 1 ? task.data.publishInfo.inputInfo.media.get(1).path : null;
        String str5 = task.progress;
        String str6 = task.taskId;
        String str7 = task.status;
        spz.c("PublishInsertHelper", str5 + "--progress" + str7 + "--status");
        ((IPublishInsertService) this.c.getService(IPublishInsertService.class)).setPublishIInsertEnable(true);
        if (!this.f12405a.containsKey(str6)) {
            this.c.getService(IFeedsListService.class);
            a(this.c, str6, a(this.c, str3, str, str2, str4, str6));
            b();
        }
        if (StringUtils.equals("success", str7)) {
            a(taskList, str6);
        } else if (!StringUtils.equals("fail", str7)) {
        } else {
            spz.c("PublishInsertHelper", "发布失败:" + task.data.failedCode);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "UmiVideoPublishSuccess");
        jSONObject.put("args", (Object) new JSONObject());
        g.c cVar = new g.c(null, jSONObject, null);
        spz.c("PublishInsertHelper", "发送了Detai成功的广播");
        NotifyModule.postNotify(cVar);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (oeb.a("viborateForPubslishTime", 150) <= 0 || !com.taobao.android.fluid.framework.device.sensor.d.a(this.b)) {
        } else {
            ((Vibrator) this.b.getSystemService("vibrator")).vibrate(150L);
        }
    }

    /* loaded from: classes5.dex */
    public class PublishInsertBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2076886951);
        }

        public PublishInsertBroadcastReceiver() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
            if (r0 == 1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
            com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.c(r5.f12407a, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
            return;
         */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r6, android.content.Intent r7) {
            /*
                r5 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.PublishInsertBroadcastReceiver.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L18
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r5
                r1[r2] = r6
                r6 = 2
                r1[r6] = r7
                java.lang.String r6 = "3c04d85a"
                r0.ipc$dispatch(r6, r1)
                return
            L18:
                android.os.Bundle r6 = r7.getExtras()
                if (r6 == 0) goto Laf
                java.util.Set r7 = r6.keySet()
                com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
                r0.<init>()
                java.util.Iterator r7 = r7.iterator()
            L2b:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L3f
                java.lang.Object r1 = r7.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r4 = r6.get(r1)
                r0.put(r1, r4)
                goto L2b
            L3f:
                java.lang.Class<com.taobao.android.fluid.framework.data.remote.TaskList> r6 = com.taobao.android.fluid.framework.data.remote.TaskList.class
                java.lang.Object r6 = com.alibaba.fastjson.JSON.toJavaObject(r0, r6)     // Catch: java.lang.Throwable -> L94
                com.taobao.android.fluid.framework.data.remote.TaskList r6 = (com.taobao.android.fluid.framework.data.remote.TaskList) r6     // Catch: java.lang.Throwable -> L94
                com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper r7 = com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.this     // Catch: java.lang.Throwable -> L94
                boolean r7 = com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.a(r7, r6)     // Catch: java.lang.Throwable -> L94
                if (r7 != 0) goto L50
                return
            L50:
                java.util.List<com.taobao.android.fluid.framework.data.remote.TaskList$Task> r7 = r6.tasks     // Catch: java.lang.Throwable -> L94
                java.lang.Object r7 = r7.get(r3)     // Catch: java.lang.Throwable -> L94
                com.taobao.android.fluid.framework.data.remote.TaskList$Task r7 = (com.taobao.android.fluid.framework.data.remote.TaskList.Task) r7     // Catch: java.lang.Throwable -> L94
                com.taobao.android.fluid.framework.data.remote.TaskList$Data r7 = r7.data     // Catch: java.lang.Throwable -> L94
                java.lang.String r7 = r7.type     // Catch: java.lang.Throwable -> L94
                if (r7 == 0) goto L93
                r0 = -1
                int r1 = r7.hashCode()     // Catch: java.lang.Throwable -> L94
                r4 = 100313435(0x5faa95b, float:2.3572098E-35)
                if (r1 == r4) goto L79
                r3 = 112202875(0x6b0147b, float:6.6233935E-35)
                if (r1 == r3) goto L6e
                goto L82
            L6e:
                java.lang.String r1 = "video"
                boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L94
                if (r7 == 0) goto L82
                r0 = 1
                goto L82
            L79:
                java.lang.String r1 = "image"
                boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L94
                if (r7 == 0) goto L82
                r0 = 0
            L82:
                if (r0 == 0) goto L8d
                if (r0 == r2) goto L87
                goto L93
            L87:
                com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper r7 = com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.this     // Catch: java.lang.Throwable -> L94
                com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.c(r7, r6)     // Catch: java.lang.Throwable -> L94
                goto L93
            L8d:
                com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper r7 = com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.this     // Catch: java.lang.Throwable -> L94
                com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.b(r7, r6)     // Catch: java.lang.Throwable -> L94
                goto Laf
            L93:
                return
            L94:
                r6 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "error:"
                r7.append(r0)
                java.lang.String r6 = r6.getMessage()
                r7.append(r6)
                java.lang.String r6 = r7.toString()
                java.lang.String r7 = "PublishInsertHelper"
                tb.spz.c(r7, r6)
            Laf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.PublishInsertBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }
}
