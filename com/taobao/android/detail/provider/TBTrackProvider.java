package com.taobao.android.detail.provider;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.h;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter;
import com.taobao.android.detail.protocol.model.constant.TrackType;
import com.taobao.android.detail.sdk.event.basic.GetCommonTrackArgsEvent;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.trade.event.j;
import com.taobao.android.u;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import tb.kge;

/* loaded from: classes4.dex */
public class TBTrackProvider implements ITrackAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String[] EMPTY_TRACK_ARGS;
    private static final String TAG = "TBTrackProvider";
    public static final String USER_ACTION_SCENE = "Page_Detail";

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void pageDestroy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2836ebc", new Object[]{this, str});
        }
    }

    public static /* synthetic */ String[] access$000(TBTrackProvider tBTrackProvider, Map map, Pair[] pairArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("3809874e", new Object[]{tBTrackProvider, map, pairArr}) : tBTrackProvider.mergeTrackArgs(map, pairArr);
    }

    public static /* synthetic */ void access$100(TBTrackProvider tBTrackProvider, String str, TrackType trackType, String str2, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531383b6", new Object[]{tBTrackProvider, str, trackType, str2, strArr});
        } else {
            tBTrackProvider.userActionTrackTap(str, trackType, str2, strArr);
        }
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void pageEnter(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e187d40", new Object[]{this, activity, str, str2, str3});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(activity, str2);
        }
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void pageLeave(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497aa095", new Object[]{this, activity, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
        }
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void pageUpdate(Activity activity, String str, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf3f317", new Object[]{this, activity, str, properties});
        } else if (properties != null) {
            HashMap hashMap = new HashMap();
            for (Object obj : properties.keySet()) {
                String obj2 = obj.toString();
                hashMap.put(obj2, properties.getProperty(obj2));
            }
            pageUpdate(activity, str, hashMap);
        }
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void pageUpdate(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28beebca", new Object[]{this, activity, str, map});
        } else if (activity == null) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, map);
        }
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void newPageUpdate(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31560a", new Object[]{this, activity, str, map});
        } else if (activity == null) {
        } else {
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            defaultTracker.updatePageName(activity, "Page_" + str);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, map);
        }
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void ctrlClickedOnPage(String str, TrackType trackType, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c061b5b", new Object[]{this, str, trackType, str2, strArr});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            TBS.Adv.ctrlClicked(CT.Button, str2, strArr);
        } else {
            TBS.Adv.ctrlClickedOnPage(str, CT.Button, str2, strArr);
        }
        userActionTrackTap(str, TrackType.BUTTON, str2, strArr);
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void commitEvent(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b610b5c", new Object[]{this, str, new Integer(i), obj, obj2, obj3, strArr});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            TBS.Ext.commitEvent(i, obj, obj2, obj3, strArr);
        } else {
            TBS.Ext.commitEvent(str, i, obj, obj2, obj3, strArr);
        }
        userActionTrackAppear(i, obj, obj2, obj3, strArr);
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void commitEvent(String str, String str2, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76454f3a", new Object[]{this, str, str2, properties});
        } else {
            TBS.Ext.commitEvent(str2, properties);
        }
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter
    public void ctrlClickedOnPage(Context context, final String str, final String str2, final Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de98c30", new Object[]{this, context, str, str2, pairArr});
        } else if (context instanceof DetailActivity) {
            new com.taobao.android.detail.wrapper.ext.provider.option.TBTrackProvider(u.a()).ctrlClickedOnPage(context, str, str2, pairArr);
        } else {
            com.taobao.android.trade.event.f.a(context, new GetCommonTrackArgsEvent(), new com.taobao.android.trade.event.c<com.taobao.android.detail.sdk.event.basic.c>() { // from class: com.taobao.android.detail.provider.TBTrackProvider.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.trade.event.c
                public void onEventException(j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9f9dab53", new Object[]{this, jVar});
                    }
                }

                @Override // com.taobao.android.trade.event.c
                public void a(com.taobao.android.detail.sdk.event.basic.c cVar, j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ed4c2ae4", new Object[]{this, cVar, jVar});
                    } else if (!cVar.a()) {
                    } else {
                        String[] access$000 = TBTrackProvider.access$000(TBTrackProvider.this, cVar.f10221a, pairArr);
                        if (TextUtils.isEmpty(str)) {
                            TBS.Adv.ctrlClicked("Page_Detail", CT.Button, str2, access$000);
                        } else {
                            TBS.Adv.ctrlClickedOnPage(str, CT.Button, str2, access$000);
                        }
                        TBTrackProvider.access$100(TBTrackProvider.this, str, TrackType.BUTTON, str2, access$000);
                    }
                }
            });
        }
    }

    static {
        kge.a(83517243);
        kge.a(-1373144854);
        EMPTY_TRACK_ARGS = new String[0];
    }

    @SafeVarargs
    private final String[] mergeTrackArgs(Map<String, String> map, Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("95a9f0e2", new Object[]{this, map, pairArr});
        }
        int size = (map != null ? map.size() : 0) + (pairArr != null ? pairArr.length : 0);
        if (size == 0) {
            return EMPTY_TRACK_ARGS;
        }
        String[] strArr = new String[size];
        if (pairArr != null) {
            int length = pairArr.length;
            int i2 = 0;
            while (i < length) {
                Pair<String, String> pair = pairArr[i];
                if (map == null || !map.containsKey(pair.first)) {
                    strArr[i2] = ((String) pair.first) + "=" + ((String) pair.second);
                    i2++;
                }
                i++;
            }
            i = i2;
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                strArr[i] = entry.getKey() + "=" + entry.getValue();
                i++;
            }
        }
        return strArr;
    }

    private void userActionTrackTap(String str, TrackType trackType, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb80a4a", new Object[]{this, str, trackType, str2, strArr});
            return;
        }
        try {
            h.a("Page_Detail", "Button-" + str2, (String) null, (String) null, strArr);
        } catch (Throwable unused) {
            i.a(TAG, "UserActionTrack.userActionTrackTap error");
        }
    }

    private void userActionTrackAppear(int i, Object obj, Object obj2, Object obj3, String... strArr) {
        String obj4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861f060e", new Object[]{this, new Integer(i), obj, obj2, obj3, strArr});
            return;
        }
        if (obj != null) {
            try {
                obj4 = obj.toString();
            } catch (Throwable unused) {
                i.a(TAG, "UserActionTrack.userActionTrackAppear error");
                return;
            }
        } else {
            obj4 = null;
        }
        h.a("Page_Detail", obj4, (String) null, (View) null, strArr);
    }
}
