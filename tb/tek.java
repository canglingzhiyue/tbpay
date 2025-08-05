package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.litecreator.util.at;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.room.utils.ag;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0006\u0010\b\u001a\u00020\u0003\u001a\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0003H\u0002\u001a\u0006\u0010\f\u001a\u00020\r\u001a\u0006\u0010\u000e\u001a\u00020\u0001\u001a\u0006\u0010\u000f\u001a\u00020\r\u001a\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0001\u001a\u0006\u0010\u0013\u001a\u00020\r\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0006\u0010\u0015\u001a\u00020\r\u001a\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0010\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u001a\u0006\u0010\u001a\u001a\u00020\u0003\u001a\u0006\u0010\u001b\u001a\u00020\u0003\u001a\u0010\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001\u001a\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001\u001a \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0001H\u0002\u001a\u0006\u0010$\u001a\u00020\u0003\u001a\u0006\u0010%\u001a\u00020\u0003\u001a\u0006\u0010&\u001a\u00020\u0003\u001a\u0006\u0010'\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"UMI_ORANGE_NAMESPACE", "", "checkEntryIsRunningByTopActivity", "", "degradeDraft", "disableImagePreviewAutoPlay", "enableImageMusicBizScene", ag.KEY_TAOKE_BIZSCENE, "enableLiteAsyncPublish", "getBoolean", "key", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getClickCoolingTime", "", "getDownloaderDomainForIntercept", "getDraftDBMaxConnectionsCount", "getInt", "getMaxDraftLimit", "biz", "getShouldPreloadPublishParamsDay", "getString", "getStrokePrefabId", "imagePreviewAutoPlayIntervalTime", "", "isDeviceMatch", "config", "isDeviceMatchForSimplePublish", "isInRecordBlackList", "isNeedDegradeWarning", "errMsg", "isOpenRecordDirectlyBizScene", "isTargetInStringArray", "target", "root", "Lcom/alibaba/fastjson/JSONObject;", "arrayName", "isVideoEnableReEdit", "isVpmTrackEnable", "previewVideoCanPause", "useShortUrlParams", "umipublish_extends_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class tek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(673794673);
    }

    private static final int a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue() : at.a(OrangeConfig.getInstance().getConfig("umipublish", str, ""), i);
    }

    private static final boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : at.a(OrangeConfig.getInstance().getConfig("umipublish", str, ""), z);
    }

    private static final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("umipublish", str, str2);
        q.b(config, "OrangeConfig.getInstance…SPACE, key, defaultValue)");
        return config;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean a(java.lang.String r4, com.alibaba.fastjson.JSONObject r5, java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.tek.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            r4 = 2
            r1[r4] = r6
            java.lang.String r4 = "d490e34c"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L1f:
            boolean r0 = r5.containsKey(r6)
            if (r0 != 0) goto L26
            return r3
        L26:
            com.alibaba.fastjson.JSONArray r5 = r5.getJSONArray(r6)
            if (r5 == 0) goto L51
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L33
            goto L51
        L33:
            java.util.Iterator r5 = r5.iterator()
        L37:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L51
            java.lang.Object r6 = r5.next()
            java.lang.String r0 = "*"
            boolean r0 = kotlin.jvm.internal.q.a(r0, r6)
            if (r0 == 0) goto L4a
            return r2
        L4a:
            boolean r6 = kotlin.jvm.internal.q.a(r4, r6)
            if (r6 == 0) goto L37
            return r2
        L51:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tek.a(java.lang.String, com.alibaba.fastjson.JSONObject, java.lang.String):boolean");
    }

    public static final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : at.b(OrangeConfig.getInstance().getConfig("umipublish", "disable_image_browser_auto_scroll", "false"), false);
    }

    public static final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : !at.b(OrangeConfig.getInstance().getConfig("umipublish", "video_draft_edit_degrade", "false"), false);
    }

    public static final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : a("preview_video_can_pause", true);
    }

    public static final long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[0])).longValue() : at.a(a("image_browser_auto_scroll_time_interval", String.valueOf(3)), 3 * 1000) * 1000;
    }

    public static final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : a("use_short_urlparams", true);
    }

    public static final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : a("vpm_track_enable", true);
    }

    public static final int a(String biz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{biz})).intValue();
        }
        q.d(biz, "biz");
        return a(biz + "_max_drafts_count", 100);
    }

    public static final int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : a("draft_db_max_connections_count", 2);
    }

    public static final String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : a("downloader_domain_for_intercept", "gd1.alicdn.com");
    }

    public static final boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : a("degrade_draft", false);
    }

    public static final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue();
        }
        List<String> a2 = at.a(OrangeConfig.getInstance().getConfig("umipublish", "recordBlackList", ""), ",");
        q.b(a2, "StringUtil.string2List(modelStr, \",\")");
        if (!a2.isEmpty()) {
            return a2.contains(Build.MODEL);
        }
        return false;
    }

    public static final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : a("enable_lite_async_publish", true);
    }

    public static final int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[0])).intValue() : a("preload_publish_params_day", 14);
    }

    public static final boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : a("check_entry_is_running_by_top_activity", true);
    }

    public static final boolean b(String bizScene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{bizScene})).booleanValue();
        }
        q.d(bizScene, "bizScene");
        String config = OrangeConfig.getInstance().getConfig("umipublish", "open_record_directly_biz_scene_v2", "guangguang,x_ask_everyone");
        if (TextUtils.isEmpty(config)) {
            return false;
        }
        List<String> a2 = at.a(config, ",");
        q.b(a2, "StringUtil.string2List(bizSceneArray, \",\")");
        return a2.contains(bizScene);
    }

    public static final boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : c(OrangeConfig.getInstance().getConfig("umipublish", "simple_publish_devices", "{}"));
    }

    public static final boolean c(String str) {
        JSONObject capability;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        try {
            capability = JSONObject.parseObject(str);
            str2 = Build.MODEL;
            q.b(str2, "Build.MODEL");
            q.b(capability, "capability");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (a(str2, capability, "wlst")) {
            return true;
        }
        return a(String.valueOf(Build.VERSION.SDK_INT), capability, "wlst-osv");
    }

    public static final boolean d(String bizScene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{bizScene})).booleanValue();
        }
        q.d(bizScene, "bizScene");
        List<String> a2 = at.a(OrangeConfig.getInstance().getConfig("umipublish", "image_music_enable_biz_scenes", ""), ",");
        q.b(a2, "StringUtil.string2List(bizSceneArray, \",\")");
        return a2.contains(bizScene);
    }

    public static final int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[0])).intValue() : a("click_cooling_time", 1000);
    }

    public static final int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[0])).intValue() : a("image_stroke_prefab_id", 5164046);
    }

    public static final boolean e(String str) {
        List a2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("umipublish", "need_degrade_warning_errors", "");
        q.b(config, "OrangeConfig.getInstance…rade_warning_errors\", \"\")");
        String str2 = config;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        List<String> split = new Regex(",").split(str2, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    a2 = p.c(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        a2 = p.a();
        Object[] array = a2.toArray(new String[0]);
        if (array != null) {
            for (String str3 : (String[]) array) {
                if (TextUtils.equals(str3, str)) {
                    return true;
                }
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
