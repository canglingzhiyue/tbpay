package tb;

import android.content.Context;
import android.content.res.Resources;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.MainMediaInfo;
import com.taobao.avplayer.aa;
import com.taobao.mediaplay.d;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.tao.Globals;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class fln {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PHENIX_PLAVEHOLDER_PIC_BIZ_CODE = "1510";

    static {
        kge.a(1484654219);
    }

    public static boolean a(flo floVar, Context context, JSONObject jSONObject, TaobaoImageUrlStrategy.ImageBlur imageBlur, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3ab3292", new Object[]{floVar, context, jSONObject, imageBlur, new Boolean(z)})).booleanValue();
        }
        if (context == null) {
            fjt.a(fjt.TAG_RENDER, "PreloadMediaUtils.preloadMedia context为空");
        }
        if (jSONObject == null) {
            fjt.a(fjt.TAG_RENDER, "PreloadMediaUtils.preloadMedia preloadData为空");
            return false;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("images");
        JSONArray jSONArray2 = jSONObject.getJSONArray("videos");
        boolean a2 = a(context, jSONArray, imageBlur, z);
        boolean a3 = a(floVar, context, jSONArray2, imageBlur, true, z);
        if (a2 || a3) {
            HashMap hashMap = new HashMap();
            hashMap.put("preloadImgSuccess", String.valueOf(a2));
            hashMap.put("preloadVideosSuccess", String.valueOf(a3));
            fjp.a("eventProcess", fjp.UMBRELLA_TAG_PRELOAD_MEDIA_SUCCESS, hashMap);
        }
        return true;
    }

    public static void b(Context context, fhi fhiVar) {
        ova ovaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf5a228", new Object[]{context, fhiVar});
        } else if (fhiVar == null || fhiVar.ae == null || fhiVar.ae.f32210a == null || fhiVar.ae.f32210a.isEmpty() || (ovaVar = fhiVar.ae.f32210a.get(0)) == null || !qnk.f.equals(ovaVar.a()) || !(ovaVar instanceof okd)) {
        } else {
            String a2 = a(context, ((okd) ovaVar).f32136a);
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            com.taobao.phenix.intf.b.h().a(a2).addLoaderExtra(esr.BUNDLE_BIZ_CODE, PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a("image")).fetch();
            com.taobao.phenix.intf.b.h().a(a2).bitmapProcessors(true, new com.taobao.phenix.compat.effects.b(context, fhiVar.C().b().p(), 2)).fetch();
            fjt.a(fjt.TAG_RENDER, "新版主图发起图片预加载: " + a2);
        }
    }

    public static boolean a(Context context, JSONArray jSONArray, TaobaoImageUrlStrategy.ImageBlur imageBlur, boolean z) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c599e321", new Object[]{context, jSONArray, imageBlur, new Boolean(z)})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if (jSONArray == null) {
            fjt.a(fjt.TAG_RENDER, "imageInfos为空，不预加载图片");
            return false;
        }
        boolean z2 = false;
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                String string = jSONObject.getString("url");
                String a3 = a(context, string);
                if (!StringUtils.isEmpty(a3)) {
                    com.taobao.phenix.intf.b.h().a(a3).addLoaderExtra(esr.BUNDLE_BIZ_CODE, PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a("image")).fetch();
                    fjt.a(fjt.TAG_RENDER, "发起图片预加载: " + a3);
                    z2 = true;
                }
                if (z && ipa.aH()) {
                    a2 = ipa.aI();
                } else {
                    a2 = a(context, string, imageBlur, z);
                }
                if (!StringUtils.isEmpty(a2)) {
                    com.taobao.phenix.intf.b.h().a(a2).addLoaderExtra(esr.BUNDLE_BIZ_CODE, PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a("imageGaussian")).fetch();
                }
            }
        }
        return z2;
    }

    public static boolean a(flo floVar, Context context, JSONArray jSONArray, TaobaoImageUrlStrategy.ImageBlur imageBlur, boolean z, boolean z2) {
        boolean z3;
        String a2;
        JSONArray jSONArray2 = jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0acb0d4", new Object[]{floVar, context, jSONArray2, imageBlur, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if (jSONArray2 == null) {
            fjt.a(fjt.TAG_RENDER, "videoInfos为空，不预加载视频");
            return false;
        }
        int i = 0;
        boolean z4 = false;
        while (i < jSONArray.size()) {
            JSONObject jSONObject = jSONArray2.getJSONObject(i);
            if (jSONObject != null) {
                String string = jSONObject.getString("videoThumbnailURL");
                String a3 = a(context, string);
                if (!StringUtils.isEmpty(a3)) {
                    com.taobao.phenix.intf.b.h().a(a3).addLoaderExtra(esr.BUNDLE_BIZ_CODE, PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a("video")).fetch();
                    fjt.a(fjt.TAG_RENDER, "发起视频封面预加载图片成功: " + a3);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 && ipa.aH()) {
                    a2 = ipa.aI();
                } else {
                    a2 = a(context, string, imageBlur, z2);
                }
                if (!StringUtils.isEmpty(a2)) {
                    com.taobao.phenix.intf.b.h().a(a2).addLoaderExtra(esr.BUNDLE_BIZ_CODE, PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a("videoGaussian")).fetch();
                }
                String string2 = jSONObject.getString("videoId");
                if (!StringUtils.isEmpty(string2)) {
                    if (floVar != null) {
                        floVar.a(context, string2, z);
                    } else {
                        aa.a(context, string2, a(), 512000, new b(string2));
                        fjt.a(fjt.TAG_RENDER, "发起视频预加载成功: " + string2);
                    }
                    if (z3) {
                        z4 = true;
                    }
                }
            }
            i++;
            jSONArray2 = jSONArray;
        }
        return z4;
    }

    /* loaded from: classes5.dex */
    public static class b implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f28035a;

        static {
            kge.a(1354886963);
            kge.a(-878894432);
        }

        @Override // com.taobao.mediaplay.d
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            }
        }

        public b(String str) {
            this.f28035a = str;
        }

        @Override // com.taobao.mediaplay.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                fjt.a(fjt.TAG_RENDER, "开始预加载视频：".concat(str).concat(" ，videoId：").concat(this.f28035a));
            }
        }

        @Override // com.taobao.mediaplay.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                fjt.a(fjt.TAG_RENDER, "预加载视频完成videoId：".concat(this.f28035a).concat("长度:").concat(String.valueOf(i)));
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f28034a;

        static {
            kge.a(-1617373600);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public a(String str) {
            this.f28034a = str;
        }

        public boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent == null) {
                return false;
            }
            fjt.a(fjt.TAG_RENDER, "预加载图片" + this.f28034a + "成功: " + succPhenixEvent.getUrl());
            return false;
        }
    }

    public static void a(Context context, fhi fhiVar) {
        MainMediaInfo W;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa30589", new Object[]{context, fhiVar});
            return;
        }
        if (fkt.u()) {
            fjt.a(fjt.TAG_TIP, "preloadVideoNew useOutActivityContext");
        } else {
            context = Globals.getApplication();
            fjt.a(fjt.TAG_TIP, "preloadVideoNew useApplicationContext");
        }
        if (context == null) {
            return;
        }
        b(context, fhiVar);
        if (fhiVar == null || (W = fhiVar.W()) == null || W.data == null) {
            return;
        }
        String a2 = a(context, W.data.videoThumbnailURL);
        if (!StringUtils.isEmpty(a2)) {
            com.taobao.phenix.intf.b.h().a(a2).addLoaderExtra(esr.BUNDLE_BIZ_CODE, PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new a("video下沉")).fetch();
            fjt.a(fjt.TAG_RENDER, "视频下沉发起视频封面预加载图片成功: " + a2);
        }
        fjt.a(fjt.TAG_MEDIA_CONTROLLER, "preloadVideoNew =====>" + W.data.contentId + " start ");
        fjc.a(context, fhiVar);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        double d = Resources.getSystem().getDisplayMetrics().density;
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf((int) (fmt.b(context) * d)), Integer.valueOf((int) (fmt.a(context) * d)), null);
    }

    public static String a(Context context, String str, TaobaoImageUrlStrategy.ImageBlur imageBlur) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("966e7007", new Object[]{context, str, imageBlur}) : a(context, str, imageBlur, false);
    }

    public static String a(Context context, String str, TaobaoImageUrlStrategy.ImageBlur imageBlur, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9db5c5", new Object[]{context, str, imageBlur, new Boolean(z)});
        }
        if (imageBlur != null) {
            z2 = false;
        } else if (!z) {
            return null;
        } else {
            imageBlur = TaobaoImageUrlStrategy.ImageBlur.b200;
        }
        ImageStrategyConfig a2 = ImageStrategyConfig.a("default").a(imageBlur).a();
        double d = Resources.getSystem().getDisplayMetrics().density;
        int b2 = (int) (fmt.b(context) * d);
        int a3 = (int) (fmt.a(context) * d);
        if (z2) {
            return ImageStrategyDecider.decideUrl(str, Integer.valueOf(b2 / 3), Integer.valueOf(a3 / 3), a2);
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(b2), Integer.valueOf(a3), a2);
    }

    private static HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[0]);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("userId", fjm.b());
        hashMap.put(MusLiveVideo.ATTR_PLAY_SCENES, "newdetail");
        hashMap.put("from", "newdetail_native");
        hashMap.put("videoChannel", "newDetailNative");
        return hashMap;
    }
}
