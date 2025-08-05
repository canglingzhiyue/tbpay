package com.taobao.message.lab.comfrm.support.ut;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class UserTrackServiceImpl implements UserTrackService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity mActivity;
    private String mIdentifier;
    private String mSpmA = "a2141";

    static {
        kge.a(-673223533);
        kge.a(844281811);
    }

    public UserTrackServiceImpl(Activity activity, String str) {
        this.mIdentifier = str;
        this.mActivity = activity;
    }

    public static void traceWithoutActivity(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da3a787", new Object[]{str, new Integer(i), str2, str3, str4, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
        }
    }

    @Override // com.taobao.message.lab.comfrm.support.ut.UserTrackService
    public void userTrack(List<UserTrack> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f383fb8", new Object[]{this, list});
        } else if (list != null) {
            for (UserTrack userTrack : list) {
                if (userTrack.name != null) {
                    String str = "0";
                    String str2 = !TextUtils.isEmpty(userTrack.spmB) ? userTrack.spmB : str;
                    String str3 = !TextUtils.isEmpty(userTrack.spmC) ? userTrack.spmC : str;
                    if (!TextUtils.isEmpty(userTrack.spmD)) {
                        str = userTrack.spmD;
                    }
                    String str4 = this.mSpmA + '.' + str2 + '.' + str3 + '.' + str;
                    if ("2101".equals(userTrack.eventId)) {
                        String str5 = userTrack.name.contains("Button-") ? userTrack.name + "-" + userTrack.actionName : "Button-" + userTrack.name + "-" + userTrack.actionName;
                        Map<String, String> utArgs = getUtArgs(userTrack);
                        utArgs.put("spm", str4);
                        traceWithoutActivity(userTrack.pageName, 2101, userTrack.pageName + "_" + str5, null, null, utArgs);
                    } else if ("2201".equals(userTrack.eventId)) {
                        Map<String, String> utArgs2 = getUtArgs(userTrack);
                        utArgs2.put("spm", str4);
                        traceWithoutActivity(userTrack.pageName, 2201, userTrack.pageName + "_" + (userTrack.name + "_" + userTrack.actionName), null, null, utArgs2);
                    } else if ("2001".equals(userTrack.eventId) && "onAppear".equals(userTrack.actionName)) {
                        Map<String, String> utArgs3 = getUtArgs(userTrack);
                        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.mActivity, userTrack.pageName);
                        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.mActivity, putSpmCnt2Map(str4, utArgs3));
                        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(putSpmUrl2Map(str4, null));
                        Map<String, String> utArgs4 = getUtArgs(userTrack);
                        utArgs4.put("spm", str4);
                        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(putSpmUrl2Map(str4, utArgs4));
                    }
                }
            }
        }
    }

    public static Map<String, String> putSpmCnt2Map(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f8680577", new Object[]{str, map});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (!TextUtils.isEmpty(str)) {
            map.put("spm-cnt", str);
        }
        return map;
    }

    public static Map<String, String> putSpmUrl2Map(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6db132b1", new Object[]{str, map});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (!TextUtils.isEmpty(str)) {
            map.put("spm-url", str);
        }
        return map;
    }

    private Map<String, String> getUtArgs(UserTrack userTrack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5d52f93b", new Object[]{this, userTrack});
        }
        HashMap hashMap = new HashMap();
        if (userTrack.args != null) {
            for (String str : userTrack.args.keySet()) {
                hashMap.put(str, ValueUtil.getString(userTrack.args, str, ""));
            }
        }
        return hashMap;
    }
}
