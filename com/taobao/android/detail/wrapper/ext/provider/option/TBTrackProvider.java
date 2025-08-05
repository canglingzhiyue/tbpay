package com.taobao.android.detail.wrapper.ext.provider.option;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerCT;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.behavix.h;
import com.taobao.android.detail.core.event.basic.GetCommonTrackArgsEvent;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter;
import com.taobao.android.detail.datasdk.protocol.model.constant.TrackType;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.j;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import tb.eaz;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class TBTrackProvider implements ITrackAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String[] EMPTY_TRACK_ARGS;
    private static final String TAG = "TBTrackProvider";
    public static final String USER_ACTION_SCENE = "Page_Detail";
    private AliUserTrackerInterface mAliUserTrackerInterface;

    /* renamed from: com.taobao.android.detail.wrapper.ext.provider.option.TBTrackProvider$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11342a = new int[ITrackAdapter.TrackExtra.values().length];

        static {
            try {
                f11342a[ITrackAdapter.TrackExtra.SPM_AB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void controlHitEvent(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348a9446", new Object[]{this, str, str2, map});
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void pageDestroy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2836ebc", new Object[]{this, str});
        }
    }

    public static /* synthetic */ String[] access$000(TBTrackProvider tBTrackProvider, Map map, Pair[] pairArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("d75d76cc", new Object[]{tBTrackProvider, map, pairArr}) : tBTrackProvider.mergeTrackArgs(map, pairArr);
    }

    public static /* synthetic */ AliUserTrackerInterface access$100(TBTrackProvider tBTrackProvider) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUserTrackerInterface) ipChange.ipc$dispatch("2d162342", new Object[]{tBTrackProvider}) : tBTrackProvider.mAliUserTrackerInterface;
    }

    public static /* synthetic */ void access$200(TBTrackProvider tBTrackProvider, String str, TrackType trackType, String str2, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("473b6276", new Object[]{tBTrackProvider, str, trackType, str2, strArr});
        } else {
            tBTrackProvider.userActionTrackTap(str, trackType, str2, strArr);
        }
    }

    public TBTrackProvider(AliUserTrackerInterface aliUserTrackerInterface) {
        this.mAliUserTrackerInterface = aliUserTrackerInterface;
        emu.a("com.taobao.android.detail.wrapper.ext.provider.option.TBTrackProvider");
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void pageEnter(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e187d40", new Object[]{this, activity, str, str2, str3});
        } else if (this.mAliUserTrackerInterface == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.mAliUserTrackerInterface.a(activity, str2);
            this.mAliUserTrackerInterface.b(activity, str2);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void pageLeave(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497aa095", new Object[]{this, activity, str, str2});
        } else if (this.mAliUserTrackerInterface == null || TextUtils.isEmpty(str)) {
        } else {
            this.mAliUserTrackerInterface.a((Object) activity);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void pageUpdate(Activity activity, String str, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf3f317", new Object[]{this, activity, str, properties});
        } else if (this.mAliUserTrackerInterface != null && properties != null) {
            HashMap hashMap = new HashMap();
            for (Object obj : properties.keySet()) {
                String obj2 = obj.toString();
                hashMap.put(obj2, properties.getProperty(obj2));
            }
            pageUpdate(activity, str, hashMap);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void pageUpdate(Activity activity, String str, Map<String, String> map) {
        com.taobao.android.detail.datasdk.model.datamodel.node.c C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28beebca", new Object[]{this, activity, str, map});
        } else if (this.mAliUserTrackerInterface != null && activity != null) {
            if (map == null) {
                map = new HashMap<>();
            }
            if ((activity instanceof DetailActivity) && (C = ((DetailActivity) activity).C()) != null) {
                map.put("bizIdentifyParams", C.f().get("aliBizCode"));
                for (Map.Entry<String, String> entry : C.f().entrySet()) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
            map.put("container_type", eaz.DINAMIC_MODULE_NAME);
            this.mAliUserTrackerInterface.a(activity, map);
            if (TextUtils.isEmpty(str)) {
                str = "Detail";
            }
            try {
                h.a("Page_" + str, activity, map);
            } catch (Throwable unused) {
                i.a(com.taobao.tao.detail.activity.DetailActivity.TAG, "UserActionTrack.updateSceneBizArgs error");
            }
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void newPageUpdate(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31560a", new Object[]{this, activity, str, map});
            return;
        }
        AliUserTrackerInterface aliUserTrackerInterface = this.mAliUserTrackerInterface;
        if (aliUserTrackerInterface == null || activity == null) {
            return;
        }
        aliUserTrackerInterface.b(activity, "Page_" + str);
        this.mAliUserTrackerInterface.a(activity, map);
        if (TextUtils.isEmpty(str)) {
            str = "Detail";
        }
        try {
            h.a("Page_" + str, activity, map);
        } catch (Throwable unused) {
            i.a(com.taobao.tao.detail.activity.DetailActivity.TAG, "UserActionTrack.updateSceneBizArgs error");
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void ctrlClickedOnPage(String str, TrackType trackType, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d53815c", new Object[]{this, str, trackType, str2, strArr});
        } else if (this.mAliUserTrackerInterface == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                this.mAliUserTrackerInterface.a(null, AliUserTrackerCT.Button, str2, strArr);
            } else {
                this.mAliUserTrackerInterface.b(str, AliUserTrackerCT.Button, str2, strArr);
            }
            userActionTrackTap(str, TrackType.BUTTON, str2, strArr);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void commitEvent(Context context, String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        com.taobao.android.detail.datasdk.model.datamodel.node.c C;
        com.taobao.android.detail.datasdk.model.datamodel.node.c C2;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4791710", new Object[]{this, context, str, new Integer(i), obj, obj2, obj3, strArr});
        } else if (this.mAliUserTrackerInterface != null) {
            boolean z = context instanceof DetailActivity;
            String[] strArr2 = new String[strArr.length + ((!z || (C2 = ((DetailActivity) context).C()) == null) ? 2 : C2.f().size() + 2)];
            if (strArr instanceof String[]) {
                int length = strArr.length;
                int i3 = 0;
                while (i2 < length) {
                    strArr2[i3] = strArr[i2];
                    i2++;
                    i3++;
                }
                strArr2[strArr.length] = "container_type=xdetail";
                if (z && (C = ((DetailActivity) context).C()) != null) {
                    strArr2[strArr.length + 1] = "bizIdentifyParams=" + C.f().get("aliBizCode");
                    int length2 = strArr.length + 2;
                    for (Map.Entry<String, String> entry : C.f().entrySet()) {
                        if (length2 < strArr2.length && length2 >= 0) {
                            strArr2[length2] = entry.getKey() + "=" + entry.getValue();
                        }
                        length2++;
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                this.mAliUserTrackerInterface.a(i, obj, obj2, obj3, strArr2);
            } else {
                this.mAliUserTrackerInterface.a(str, i, obj, obj2, obj3, strArr2);
            }
            userActionTrackAppear(i, obj, obj2, obj3, strArr2);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void disappearTrack(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7fab21", new Object[]{this, str, new Integer(i), obj, obj2, obj3, strArr});
            return;
        }
        String[] strArr2 = new String[strArr.length + 1];
        if (strArr instanceof String[]) {
            int length = strArr.length;
            int i3 = 0;
            while (i2 < length) {
                strArr2[i3] = strArr[i2];
                i2++;
                i3++;
            }
            strArr2[strArr.length] = "container_type=xdetail";
        }
        userActionTrackDisAppear(i, obj, obj2, obj3, strArr2);
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void appearTrack(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f7cc6f", new Object[]{this, str, new Integer(i), obj, obj2, obj3, strArr});
        } else if (this.mAliUserTrackerInterface == null) {
        } else {
            String[] strArr2 = new String[strArr.length + 1];
            if (strArr instanceof String[]) {
                int length = strArr.length;
                int i3 = 0;
                while (i2 < length) {
                    strArr2[i3] = strArr[i2];
                    i2++;
                    i3++;
                }
                strArr2[strArr.length] = "container_type=xdetail";
            }
            userActionTrackAppear(i, obj, obj2, obj3, strArr2);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void activateServerTest(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee2d18f", new Object[]{this, str, context});
        } else if (TextUtils.isEmpty(str) || context == null) {
        } else {
            UTABTest.activateServer(str, context);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void commitEvent(Context context, String str, String str2, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c487ee", new Object[]{this, context, str, str2, properties});
            return;
        }
        if (properties != null) {
            properties.put("container_type", eaz.DINAMIC_MODULE_NAME);
        }
        TBS.Ext.commitEvent(str2, properties);
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public String getExtra(ITrackAdapter.TrackExtra trackExtra) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0f0b7ce", new Object[]{this, trackExtra});
        }
        if (AnonymousClass2.f11342a[trackExtra.ordinal()] == 1) {
            return "a2141.7631564";
        }
        return null;
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void ctrlClickedOnPage(final Context context, final String str, final String str2, final Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de98c30", new Object[]{this, context, str, str2, pairArr});
        } else if (this.mAliUserTrackerInterface == null) {
        } else {
            f.a(context, new GetCommonTrackArgsEvent(), new com.taobao.android.trade.event.c<com.taobao.android.detail.core.event.basic.f>() { // from class: com.taobao.android.detail.wrapper.ext.provider.option.TBTrackProvider.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.trade.event.c
                public void onEventException(j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9f9dab53", new Object[]{this, jVar});
                    }
                }

                @Override // com.taobao.android.trade.event.c
                public void a(com.taobao.android.detail.core.event.basic.f fVar, j jVar) {
                    com.taobao.android.detail.datasdk.model.datamodel.node.c C;
                    com.taobao.android.detail.datasdk.model.datamodel.node.c C2;
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e6473e04", new Object[]{this, fVar, jVar});
                    } else if (!fVar.a()) {
                    } else {
                        String[] access$000 = TBTrackProvider.access$000(TBTrackProvider.this, fVar.f9701a, pairArr);
                        Context context2 = context;
                        String[] strArr = new String[access$000.length + ((!(context2 instanceof DetailActivity) || (C2 = ((DetailActivity) context2).C()) == null) ? 1 : C2.f().size() + 1)];
                        int length = access$000.length;
                        int i2 = 0;
                        while (i < length) {
                            strArr[i2] = access$000[i];
                            i++;
                            i2++;
                        }
                        Context context3 = context;
                        if ((context3 instanceof DetailActivity) && (C = ((DetailActivity) context3).C()) != null) {
                            int length2 = access$000.length;
                            strArr[length2] = "bizIdentifyParams=" + C.f().get("aliBizCode");
                            Iterator<Map.Entry<String, String>> it = C.f().entrySet().iterator();
                            int length3 = access$000.length;
                            while (true) {
                                length3++;
                                if (!it.hasNext()) {
                                    break;
                                }
                                Map.Entry<String, String> next = it.next();
                                strArr[length3] = next.getKey() + "=" + next.getValue();
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            TBTrackProvider.access$100(TBTrackProvider.this).a("Page_Detail", AliUserTrackerCT.Button, str2, strArr);
                        } else {
                            TBTrackProvider.access$100(TBTrackProvider.this).b(str, AliUserTrackerCT.Button, str2, strArr);
                        }
                        TBTrackProvider.access$200(TBTrackProvider.this, str, TrackType.BUTTON, str2, strArr);
                    }
                }
            });
        }
    }

    public void userActionCommitEnter(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e37e963", new Object[]{this, activity, str});
            return;
        }
        try {
            h.a("Page_Detail", str, activity, com.taobao.android.behavix.j.c(this.mAliUserTrackerInterface.a(activity)));
        } catch (Throwable unused) {
            i.a(com.taobao.tao.detail.activity.DetailActivity.TAG, "UserActionTrack.commitEnter error");
        }
    }

    private void userActionTrackTap(String str, TrackType trackType, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1b114b", new Object[]{this, str, trackType, str2, strArr});
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

    private void userActionTrackDisAppear(int i, Object obj, Object obj2, Object obj3, String... strArr) {
        String obj4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd22968", new Object[]{this, new Integer(i), obj, obj2, obj3, strArr});
            return;
        }
        if (obj != null) {
            try {
                obj4 = obj.toString();
            } catch (Throwable unused) {
                i.a(TAG, "UserActionTrack.userActionTrackDisAppear error");
                return;
            }
        } else {
            obj4 = null;
        }
        h.b("Page_Detail", obj4, (String) null, (View) null, strArr);
    }

    static {
        kge.a(139327677);
        kge.a(-1470287573);
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
        String[] strArr = new String[size + 1];
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
        strArr[i] = "container_type=xdetail";
        return strArr;
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void customEvent(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13be6041", new Object[]{this, str, str2, map});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str2);
        uTCustomHitBuilder.setEventPage(str);
        uTCustomHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void commitEvent(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b610b5c", new Object[]{this, str, new Integer(i), obj, obj2, obj3, strArr});
        } else if (this.mAliUserTrackerInterface == null) {
        } else {
            String[] strArr2 = new String[strArr.length + 1];
            if (strArr instanceof String[]) {
                int length = strArr.length;
                int i3 = 0;
                while (i2 < length) {
                    strArr2[i3] = strArr[i2];
                    i2++;
                    i3++;
                }
                strArr2[strArr.length] = "container_type=xdetail";
            }
            if (TextUtils.isEmpty(str)) {
                this.mAliUserTrackerInterface.a(i, obj, obj2, obj3, strArr2);
            } else {
                this.mAliUserTrackerInterface.a(str, i, obj, obj2, obj3, strArr2);
            }
            userActionTrackAppear(i, obj, obj2, obj3, strArr2);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter
    public void commitEvent(String str, String str2, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76454f3a", new Object[]{this, str, str2, properties});
            return;
        }
        if (properties != null) {
            properties.put("container_type", eaz.DINAMIC_MODULE_NAME);
        }
        TBS.Ext.commitEvent(str2, properties);
    }
}
