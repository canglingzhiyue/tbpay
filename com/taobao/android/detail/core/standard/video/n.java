package com.taobao.android.detail.core.standard.video;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.android.detail.core.standard.video.m;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import tb.aqs;
import tb.bax;
import tb.bbc;
import tb.ema;
import tb.emh;
import tb.emu;
import tb.god;
import tb.kge;

/* loaded from: classes4.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXT_KEY_IS_STRUCT_VIDEO = "isStructVideo";
    public static final String EXT_KEY_IS_USER_PAUSE_STRUCT_VIDEO = "isUserPauseStructVideo";
    public static final String EXT_KEY_VIDEO_COUNT_IN_FRAME_GROUP = "videoCountInFrameGroup";
    public static final String EXT_KEY_VIDEO_POSITION = "videoPosition";

    static {
        kge.a(1242608543);
        emu.a("com.taobao.android.detail.core.standard.video.PicGalleryVideoUtils");
    }

    public static m a(String str, String str2, String str3, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("1afd986b", new Object[]{str, str2, str3, new Float(f), new Float(f2)});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return null;
        }
        m.a aVar = new m.a();
        aVar.a(str).b(str2).c(str3);
        try {
            aVar.a(f / f2);
        } catch (Exception unused) {
            aVar.a(1.0f);
        }
        return aVar.a();
    }

    public static m a(boolean z, AURARenderComponent aURARenderComponent, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("9bc7d841", new Object[]{new Boolean(z), aURARenderComponent, aqsVar});
        }
        if (aURARenderComponent == null || aURARenderComponent.data == null || aURARenderComponent.data.fields == null) {
            ema.a("video#fieldsIsNull", "fields is null", aqsVar);
            return null;
        }
        Map<String, Object> map = aURARenderComponent.data.fields;
        Object obj = map.get("videoId");
        if (!(obj instanceof String)) {
            ema.a("video#idIsNotString", "videoId is not string", aqsVar);
            return null;
        }
        m.a aVar = new m.a();
        Object obj2 = map.get("videoUrl");
        if (!(obj2 instanceof String)) {
            ema.a("video#urlIsNotString", "video url is not string", aqsVar);
        } else if (StringUtils.isEmpty((String) obj2)) {
            ema.a("video#urlIsEmpty", "video url is empty", aqsVar);
        }
        aVar.a(String.valueOf(obj)).b(String.valueOf(obj2)).c(String.valueOf(map.get("thumbnailUrl")));
        try {
            aVar.a(emh.b(aURARenderComponent, emh.sDefaultDimension));
        } catch (Exception unused) {
            aVar.a(1.0f);
        }
        String str = AliSDetailScaleType.fitCenter;
        aVar.d(z ? str : (String) bbc.a(map, "videoThumbnailMode", String.class, str));
        if (!z) {
            str = (String) bbc.a(map, "videoMode", String.class, str);
        }
        aVar.e(str);
        return aVar.a();
    }

    public static String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{aURARenderComponent});
        }
        if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null) {
            return String.valueOf(aURARenderComponent.data.fields.get("videoId"));
        }
        return null;
    }

    public static void a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c0c6b4", new Object[]{view, str});
        } else if (view == null || StringUtils.isEmpty(str)) {
        } else {
            Object tag = view.getTag();
            if (!(tag instanceof JSONObject)) {
                tag = new JSONObject();
                view.setTag(tag);
            }
            ((JSONObject) tag).put("videoContainerMark", (Object) str);
        }
    }

    public static boolean b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66ed2036", new Object[]{aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent != null) {
            return aURARenderComponent.isAsync();
        }
        return false;
    }

    public static String c(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("529b6c2f", new Object[]{aURARenderComponent}) : aURARenderComponent == null ? "none" : aURARenderComponent.asyncStatus();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!com.taobao.android.detail.core.aura.utils.f.o()) {
            return false;
        }
        boolean z = bax.a().f25741a == 1;
        String a2 = com.taobao.android.detail.core.performance.a.a("DetailCoreActivity");
        com.taobao.android.detail.core.utils.i.c(a2, "是否低端机=" + z);
        if (!z) {
            return true;
        }
        if (god.e) {
            com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.a.a("DetailCoreActivity"), "命中，低端机头图视频默认不播放");
            b();
            return false;
        }
        com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.a.a("DetailCoreActivity"), "未命中，低端机头图视频默认播放");
        return com.taobao.android.detail.core.aura.utils.f.p();
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Detail", 2101, "Page_Detail_Perf_Not_Auto_Video", null, null, null).build());
    }

    public static boolean a(Activity activity) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        Intent intent = activity.getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            return "taolive".equalsIgnoreCase(data.getQueryParameter("bizType"));
        }
        return false;
    }

    public static boolean b(Activity activity) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue();
        }
        if (!(activity instanceof DetailCoreActivity)) {
            return false;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) activity;
        Intent intent = activity.getIntent();
        if (intent != null && (data = intent.getData()) != null && "newDetail".equalsIgnoreCase(data.getQueryParameter("from"))) {
            return detailCoreActivity.N();
        }
        return false;
    }
}
