package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.home.component.utils.m;
import com.taobao.android.home.component.utils.n;
import com.taobao.infoflow.core.utils.transition.TransitionRunningFrameBinder;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.b;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.taolive.room.utils.aw;

/* loaded from: classes7.dex */
public class sfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXTRA_FRAME_ANIM_HIT_FIXED = "extraFrameAnimHitFixed";
    public static final String KEY_EXTRA_FRAME_ANIM_REASON = "extraFrameAnimReason";
    public static final String KEY_EXTRA_FRAME_ANIM_TYPE = "extraFrameAnimType";

    static {
        kge.a(-124066710);
    }

    @Deprecated
    public static void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{bundle});
        } else if (bundle == null) {
        } else {
            bundle.remove("extraEnableTransition");
        }
    }

    private static Activity a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c7b91d7e", new Object[]{view});
        }
        Context context = view.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof fpz)) {
            return null;
        }
        Context a2 = ((fpz) context).a();
        if (!(a2 instanceof Activity)) {
            return null;
        }
        return (Activity) a2;
    }

    private static void a(ljs ljsVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523067ef", new Object[]{ljsVar, view});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        Activity a2 = a(view);
        Intent intent = a2 == null ? null : a2.getIntent();
        if (intent != null) {
            intent.putExtra("dispatch_invisible_event_type", s.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER_MAP);
        }
        iMainFeedsViewService.dispatchWindowVisibility(4);
        if (intent != null) {
            intent.putExtra("dispatch_invisible_event_type", -30010);
        }
        ldf.d("HomeTransitionForNewAnim", "播放暂停逻辑处理完成。");
    }

    private static JSONObject a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5543672", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && str != null && jSONObject.containsKey(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    private static boolean b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("493da635", new Object[]{jSONObject, str})).booleanValue() : a(jSONObject, str, false);
    }

    private static boolean a(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b8e3c9c6", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue() : (jSONObject == null || str == null || !jSONObject.containsKey(str)) ? z : "true".equals(jSONObject.getString(str));
    }

    private static String c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1353d90", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && str != null && jSONObject.containsKey(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static dqa b(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqa) ipChange.ipc$dispatch("a8849b6f", new Object[]{jSONObject, str, new Boolean(z)});
        }
        if (ldj.a("forceCloseTransitionAnimParamsControl", false)) {
            return null;
        }
        a(jSONObject, "content");
        if (d(jSONObject, "enableLivePageTransition") != -1) {
            dqa dqaVar = new dqa();
            dqaVar.h = 3001;
            return dqaVar;
        } else if (!z) {
            return null;
        } else {
            dqa dqaVar2 = new dqa();
            dqaVar2.h = 5001;
            return dqaVar2;
        }
    }

    private static int d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4baa4be2", new Object[]{jSONObject, str})).intValue();
        }
        String c = c(a(jSONObject, "content"), str);
        if (c != null && !c.isEmpty()) {
            if (c.startsWith("true")) {
                return 1;
            }
            if (c.startsWith("false|force")) {
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(tb.ljs r8, com.alibaba.fastjson.JSONObject r9, android.os.Bundle r10, android.view.View r11, tb.dqa r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sfo.a(tb.ljs, com.alibaba.fastjson.JSONObject, android.os.Bundle, android.view.View, tb.dqa, java.lang.String):void");
    }

    private static void a(dqa dqaVar, View view, Bundle bundle, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848a49c2", new Object[]{dqaVar, view, bundle, new Boolean(z), jSONObject});
            return;
        }
        boolean a2 = a(dqaVar, view, bundle, z);
        boolean a3 = !a2 ? a(dqaVar, view, bundle, z, "liveItemImageView") : false;
        boolean z2 = !dqaVar.a("liveForceCloseBlurFeature") && !dqaVar.j;
        if (!a2 && !a3) {
            ldf.d("HomeTransitionForNewAnim", "直播数据未命中。 hasFindLiveRenderView false , hasFindLiveImageView false.");
        }
        a(dqaVar, view, jSONObject, bundle, z2, !dqaVar.a("liveForceClosePreFetchFeature") && !dqaVar.j);
    }

    private static void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
            return;
        }
        Activity a2 = a(view);
        Intent intent = a2 == null ? null : a2.getIntent();
        if (intent != null) {
            intent.putExtra("transition_jump_start_time", System.currentTimeMillis());
        }
        ldf.d("HomeTransitionForNewAnim", "直播暂停逻辑延时处理。");
    }

    private static void a(dqa dqaVar, View view, JSONObject jSONObject, Bundle bundle, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7222d852", new Object[]{dqaVar, view, jSONObject, bundle, new Boolean(z), new Boolean(z2)});
        } else if (!dqaVar.c) {
        } else {
            String c = c(a(jSONObject, "content"), "imageUrl");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (TextUtils.isEmpty(c)) {
                ldf.d("HomeTransitionForNewAnim", "mainImageUrl is empty , processLiveExtrasParams abort.");
                return;
            }
            String decideUrl = (!z || layoutParams == null) ? c : ImageStrategyDecider.decideUrl(c, Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height), null);
            int i2 = z ? 60 : 0;
            if (!z) {
                i = 0;
            }
            bundle.putString("coverImage", c);
            bundle.putString(aw.PARAM_COVER_GAUSS_RADIUS, String.valueOf(i2));
            bundle.putString(aw.PARAM_COVER_GAUSS_SAMPLING, String.valueOf(i));
            if (!z2) {
                return;
            }
            PhenixCreator a2 = b.h().a(decideUrl);
            if (z) {
                a2 = a2.bitmapProcessors(new com.taobao.phenix.compat.effects.b(view.getContext(), i2, i));
            }
            a2.fetch();
        }
    }

    private static boolean a(dqa dqaVar, View view, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ce506f2", new Object[]{dqaVar, view, bundle, new Boolean(z)})).booleanValue();
        }
        if (!(view instanceof DXRootView)) {
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse , no dxRootView.");
            return false;
        }
        DXWidgetNode flattenWidgetNode = ((DXRootView) view).getFlattenWidgetNode();
        if (flattenWidgetNode == null) {
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse , no dxFlattenWidgetNode.");
            return false;
        }
        DXWidgetNode queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId("liveItemOnlinePlay");
        if (!(queryWidgetNodeByUserId instanceof ifl)) {
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse , no liveDXNode.");
            return false;
        }
        ifl iflVar = (ifl) queryWidgetNodeByUserId;
        Drawable b = iflVar.b();
        if (b == null) {
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse , no imageViewDrawable.");
            return false;
        }
        dqaVar.e = b;
        View c = iflVar.c();
        if (z && c != null) {
            dqaVar.g = c.getMeasuredHeight();
        }
        if (ldj.a("orange_key_enable_auto_keep_live_frame", true)) {
            a(dqaVar, view, bundle, iflVar);
        } else {
            a(dqaVar, view, bundle, iflVar, b);
        }
        return true;
    }

    private static void a(dqa dqaVar, View view, Bundle bundle, ifl iflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b773c7", new Object[]{dqaVar, view, bundle, iflVar});
        } else if (iflVar.d()) {
            bundle.putBoolean("anim_item_support_full_alpha", true);
            dqaVar.j = true;
            iflVar.a(true);
            if (ldj.a("orange_key_enable_auto_keep_delay_stop", false)) {
                b(view);
            }
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse Hit keepLastLiveFrameForAutoKeep , Success . animItemIsRunning.  23:43 .");
        } else {
            iflVar.a(false);
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse Hit liveView Reuse , Success . pause .  21:40 .");
        }
    }

    private static void a(dqa dqaVar, View view, Bundle bundle, ifl iflVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23de7f6b", new Object[]{dqaVar, view, bundle, iflVar, drawable});
        } else if (iflVar.d()) {
            bundle.putBoolean("anim_item_support_full_alpha", true);
            dqaVar.j = true;
            if (ldj.a("orange_key_enable_get_current_live_frame", false)) {
                if (Build.VERSION.SDK_INT >= 18) {
                    TransitionRunningFrameBinder transitionRunningFrameBinder = new TransitionRunningFrameBinder(drawable);
                    transitionRunningFrameBinder.setReuseSupport(iflVar);
                    bundle.putBinder("anim_item_running_frame", transitionRunningFrameBinder);
                } else {
                    Bitmap f = iflVar.f();
                    if (f != null) {
                        dqaVar.e = new BitmapDrawable(f);
                    }
                }
            }
            if (ldj.a("orange_key_enable_delay_live_player_stop", true)) {
                b(view);
            }
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse Hit liveView Reuse , Success . animItemIsRunning .  21:40 .");
        } else {
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse Hit liveView Reuse , Success . pause .  21:40 .");
        }
    }

    private static boolean b(dqa dqaVar, View view, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9abda151", new Object[]{dqaVar, view, bundle, new Boolean(z)})).booleanValue() : a(dqaVar, view, bundle, z, (String) null);
    }

    private static boolean a(dqa dqaVar, View view, Bundle bundle, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("931b913c", new Object[]{dqaVar, view, bundle, new Boolean(z), str})).booleanValue();
        }
        if (!(view instanceof DXRootView)) {
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse , no dxRootView.");
            return false;
        }
        DXWidgetNode flattenWidgetNode = ((DXRootView) view).getFlattenWidgetNode();
        if (flattenWidgetNode == null) {
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse , no dxFlattenWidgetNode.");
            return false;
        }
        if (str == null) {
            str = "imageTransfer";
        }
        DXWidgetNode queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId(str);
        if (!(queryWidgetNodeByUserId instanceof DXImageWidgetNode)) {
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse , no imageNode.");
            return false;
        }
        DXRuntimeContext dXRuntimeContext = ((DXImageWidgetNode) queryWidgetNodeByUserId).getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse , no dxImageRuntimeContext.");
            return false;
        }
        View v = dXRuntimeContext.v();
        if (!(v instanceof ImageView)) {
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse , no imageNativeView.");
            return false;
        }
        ImageView imageView = (ImageView) v;
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse , no imageViewDrawable.");
            return false;
        }
        if (z) {
            dqaVar.g = imageView.getMeasuredHeight();
        }
        dqaVar.e = drawable;
        ldf.d("HomeTransitionForNewAnim", "processDxRootViewReuse Hit imageViewDrawable , Success . 20:48 .");
        return true;
    }

    private static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        if (str != null && str3 != null && str.contains(str3)) {
            return true;
        }
        return (str2 == null || str3 == null || !str2.contains(str3)) ? false : true;
    }

    public static Pair<String, String> b() {
        String str;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("2780adf3", new Object[0]);
        }
        try {
            str = n.b();
        } catch (Throwable th) {
            ldf.a("HomeTransitionForNewAnim", "TPPUtils.getNdAnimFeatureList 出错。", th);
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            ldf.d("HomeTransitionForNewAnim", "homeTransitionTppAnimSwitchListStr:" + str);
        }
        try {
            str2 = (String) m.a().a("ndAnimOptimizationFirst", String.class);
        } catch (Throwable th2) {
            ldf.a("HomeTransitionForNewAnim", "调用HomeClientABTestTool.getAbTestValue 出错。", th2);
        }
        if (!TextUtils.isEmpty(str2)) {
            ldf.d("HomeTransitionForNewAnim", "homeNavSjsAnimSwitchListStr:" + str2);
        }
        return new Pair<>(str, str2);
    }

    public static boolean e(Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8916f2", new Object[]{pair})).booleanValue() : a(pair, "f_home_tran_require_check_score");
    }

    public static boolean a(Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a82db76", new Object[]{pair})).booleanValue() : a(pair, "f_home_tran_all_device");
    }

    public static boolean d(Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e878813", new Object[]{pair})).booleanValue() : a(pair, "f_home_tran_frame_anim");
    }

    public static boolean b(Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16846a55", new Object[]{pair})).booleanValue() : a(pair, "f_home_tran_check_data");
    }

    public static boolean c(Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1285f934", new Object[]{pair})).booleanValue() : a(pair, "f_home_tran_no_data");
    }

    private static boolean a(Pair<String, String> pair, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1846ccc0", new Object[]{pair, str})).booleanValue() : pair != null && a((String) pair.first, (String) pair.second, str);
    }

    private static boolean a(View view, String str, Bundle bundle) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3afb99a4", new Object[]{view, str, bundle})).booleanValue();
        }
        if (str == null) {
            ldf.d("HomeTransitionForNewAnim", "Error:targetUrl 为 null，不执行无极缩放开关固化。");
            if (bundle != null) {
                bundle.putString("extraFrameAnimReason", "targetUrlIsNull");
            }
            return false;
        }
        Context context = view.getContext();
        if (context == null) {
            ldf.d("HomeTransitionForNewAnim", "Error:context 为 null，不执行无极缩放开关固化。");
            return false;
        }
        String a2 = ldj.a("orange_key_anim_switch_fixed_url_list", "//newdetail.taobao.com,//litedetail.taobao.com,http://newdetail.taobao.com,https://newdetail.taobao.com,http://litedetail.taobao.com,https://litedetail.taobao.com");
        if (TextUtils.isEmpty(a2)) {
            ldf.d("HomeTransitionForNewAnim", "Error:拉取到的 Orange url 列表为空 ，不执行无极缩放开关固化。");
            if (bundle != null) {
                bundle.putString("extraFrameAnimReason", "orangeIsNull");
            }
            return false;
        } else if (l.b(context)) {
            ldf.d("HomeTransitionForNewAnim", "Abort:当前为 Pad ，不执行无极缩放开关固化。");
            if (bundle != null) {
                bundle.putString("extraFrameAnimReason", "isTablet");
            }
            return false;
        } else if (l.d(context)) {
            ldf.d("HomeTransitionForNewAnim", "Abort:当前为 折叠屏 ，并且命中无极缩放降级开关，不执行无极缩放开关固化。");
            if (bundle != null) {
                bundle.putString("extraFrameAnimReason", "isFoldDevice");
            }
            return false;
        } else {
            for (String str2 : a2.split(",")) {
                if (str.startsWith(str2)) {
                    ldf.d("HomeTransitionForNewAnim", "Success:无极缩放开关固化成功。fixedUrl:" + str2);
                    return true;
                }
            }
            if (bundle != null) {
                bundle.putString("extraFrameAnimReason", "noAnyUrlHit");
            }
            return false;
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "l".equals(ldc.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(tb.ljs r9, com.alibaba.fastjson.JSONObject r10, android.os.Bundle r11, android.view.View r12, android.util.Pair<java.lang.String, java.lang.String> r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sfo.a(tb.ljs, com.alibaba.fastjson.JSONObject, android.os.Bundle, android.view.View, android.util.Pair, java.lang.String):boolean");
    }
}
