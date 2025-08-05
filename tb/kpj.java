package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.b;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.c;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.tbliveinteractive.e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public class kpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f30211a;
    private static String b;

    static {
        kge.a(-354614999);
        f30211a = "openComponent";
        b = "openUrl";
    }

    public static void a(Context context, a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae30b6f9", new Object[]{context, aVar, str, str2});
            return;
        }
        Uri build = Uri.parse(hgs.w()).buildUpon().appendQueryParameter(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str).appendQueryParameter(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, str2).build();
        HashMap hashMap = new HashMap();
        hashMap.put("x", "0");
        hashMap.put("y", String.valueOf(0));
        hashMap.put("width", String.valueOf(-1));
        hashMap.put("height", String.valueOf(-1));
        hashMap.put("modal", "true");
        if (aVar instanceof phq) {
            e p = ((phq) aVar).p();
            if (p != null) {
                q.a(kpi.TAG, "open fansClub page success");
                p.b(p.o().a(context), build.toString(), hashMap);
                return;
            }
            q.a(kpi.TAG, "open fansClub page fail, interactiveManager null");
            return;
        }
        q.a(kpi.TAG, "open fansClub page fail, FrameContext not CommonFrameContext");
    }

    public static boolean a(a aVar, TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        VideoInfo.AdmireInfo admireInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("689d211a", new Object[]{aVar, tBLiveDataModel})).booleanValue();
        }
        if (aVar.b || !hgs.r() || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (admireInfo = videoInfo.admireInfo) == null) {
            return false;
        }
        return admireInfo.hasFansClub;
    }

    public static void a(String str, a aVar, String str2, AccountInfo.ComponentData componentData) {
        e p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219b503b", new Object[]{str, aVar, str2, componentData});
        } else if (f30211a.equals(str2) && componentData != null && !TextUtils.isEmpty(componentData.componentName)) {
            HashMap hashMap = new HashMap();
            hashMap.put("data", componentData.params);
            phg.b().a(componentData.componentName, hashMap);
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Map<String, Object> jSONObject = new JSONObject();
            jSONObject.put("componentName", (Object) "tblive-base-openWebview");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("jumpUrl", (Object) str);
            jSONObject2.put("bannerTag", (Object) "widget");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("maxHeightRpx", (Object) "700");
            jSONObject3.put("cornerRadius", (Object) "12");
            jSONObject2.put("options", (Object) jSONObject3);
            jSONObject.put("data", (Object) jSONObject2);
            if (aVar == null) {
                aVar = n.a();
            }
            if (!(aVar instanceof phq) || (p = ((phq) aVar).p()) == null) {
                return;
            }
            p.a("TBLiveWVPlugin.Event.openComponent", jSONObject);
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("taolive", 0);
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(cgl.j().a()));
        String string = sharedPreferences.getString("last_widget_anim_day", "");
        int i = sharedPreferences.getInt("widget_anim_count", 0);
        if (!TextUtils.isEmpty(format) && string != null) {
            if (!string.equals(format)) {
                sharedPreferences.edit().putString("last_widget_anim_day", format).putInt("widget_anim_count", 0).apply();
                return true;
            } else if (i < hkk.Y()) {
                sharedPreferences.edit().putInt("widget_anim_count", i + 1).apply();
                return true;
            }
        }
        return false;
    }

    public static boolean b(a aVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("491ee8f9", new Object[]{aVar, tBLiveDataModel})).booleanValue() : (!hkk.V() || c.i(aVar) == VideoStatus.VIDEO_TIMESHIFT_STATUS || tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || tBLiveDataModel.mVideoInfo.broadCaster == null || tBLiveDataModel.mVideoInfo.admireInfo == null || tBLiveDataModel.mVideoInfo.admireInfo.contributionEnabled || tBLiveDataModel.mVideoInfo.broadCaster.widgetTip == null || !tBLiveDataModel.mVideoInfo.broadCaster.widgetTip.showWidgetTip || b.a().a(tBLiveDataModel) || phg.d().a()) ? false : true;
    }
}
