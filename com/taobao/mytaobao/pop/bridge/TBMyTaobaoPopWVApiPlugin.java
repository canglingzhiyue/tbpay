package com.taobao.mytaobao.pop.bridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mvq;
import tb.mwv;

/* loaded from: classes7.dex */
public class TBMyTaobaoPopWVApiPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_GET_ICON_POSITION_V2 = "getPopIconInfoV2";
    public static final String K_LOCAL_POP_ICON_V2 = "localPopIconV2";
    public static final String TAG = "TBMyTaobaoPopWVApiPlugin";
    private static mvq mIconPositionListener;

    static {
        kge.a(-1115133045);
    }

    public static /* synthetic */ Object ipc$super(TBMyTaobaoPopWVApiPlugin tBMyTaobaoPopWVApiPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && wVCallBackContext != null) {
            if (K_GET_ICON_POSITION_V2.equals(str)) {
                getIconLocalInfo(str2, wVCallBackContext);
            } else if (K_LOCAL_POP_ICON_V2.equals(str)) {
                localPopIcon(str2, wVCallBackContext);
            }
        }
        return false;
    }

    private void getIconLocalInfo(String str, WVCallBackContext wVCallBackContext) {
        mvq mvqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b105958", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        if (str == null || (mvqVar = mIconPositionListener) == null) {
            rVar.a("params || IconPositionListener is null!");
            wVCallBackContext.onFailure(rVar);
            return;
        }
        rVar.a(mwv.a((JSONObject) JSONObject.toJSON(mvqVar.a(str))));
        wVCallBackContext.success(rVar);
    }

    private void localPopIcon(String str, WVCallBackContext wVCallBackContext) {
        mvq mvqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c48cd0d", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        if (str == null || (mvqVar = mIconPositionListener) == null) {
            rVar.a("params || IconPositionListener is null!");
            wVCallBackContext.onFailure(rVar);
            return;
        }
        mvqVar.b(str);
        rVar.c();
    }

    public static void registerMTBIconPositionListener(mvq mvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a6a7bd", new Object[]{mvqVar});
        } else {
            mIconPositionListener = mvqVar;
        }
    }

    public static void unregisterMTBIconPositionListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa1b5fc", new Object[0]);
        } else {
            mIconPositionListener = null;
        }
    }
}
